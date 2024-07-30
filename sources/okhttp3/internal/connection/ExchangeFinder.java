package okhttp3.internal.connection;

import java.io.IOException;
import java.net.Socket;
import java.util.List;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RouteSelector;
import okhttp3.internal.http.ExchangeCodec;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ExchangeFinder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final Address address;
    private final Call call;
    private RealConnection connectingConnection;
    private final RealConnectionPool connectionPool;
    private final EventListener eventListener;
    private boolean hasStreamFailure;
    private Route nextRouteToTry;
    private RouteSelector.Selection routeSelection;
    private final RouteSelector routeSelector;
    private final Transmitter transmitter;

    public ExchangeFinder(Transmitter transmitter, RealConnectionPool realConnectionPool, Address address, Call call, EventListener eventListener) {
        this.transmitter = transmitter;
        this.connectionPool = realConnectionPool;
        this.address = address;
        this.call = call;
        this.eventListener = eventListener;
        this.routeSelector = new RouteSelector(address, realConnectionPool.routeDatabase, call, eventListener);
    }

    private RealConnection findConnection(int i10, int i11, int i12, int i13, boolean z10) throws IOException {
        RealConnection realConnection;
        Socket socket;
        Socket socket2;
        RealConnection realConnection2;
        boolean z11;
        Route route;
        boolean z12;
        List<Route> list;
        RouteSelector.Selection selection;
        synchronized (this.connectionPool) {
            if (!this.transmitter.isCanceled()) {
                this.hasStreamFailure = false;
                Transmitter transmitter = this.transmitter;
                realConnection = transmitter.connection;
                socket = null;
                if (realConnection != null && realConnection.noNewExchanges) {
                    socket2 = transmitter.releaseConnectionNoEvents();
                } else {
                    socket2 = null;
                }
                Transmitter transmitter2 = this.transmitter;
                realConnection2 = transmitter2.connection;
                if (realConnection2 != null) {
                    realConnection = null;
                } else {
                    realConnection2 = null;
                }
                if (realConnection2 == null) {
                    if (this.connectionPool.transmitterAcquirePooledConnection(this.address, transmitter2, null, false)) {
                        realConnection2 = this.transmitter.connection;
                        route = null;
                        z11 = true;
                    } else {
                        route = this.nextRouteToTry;
                        if (route != null) {
                            this.nextRouteToTry = null;
                        } else if (retryCurrentRoute()) {
                            route = this.transmitter.connection.route();
                        }
                        z11 = false;
                    }
                }
                z11 = false;
                route = null;
            } else {
                throw new IOException("Canceled");
            }
        }
        Util.closeQuietly(socket2);
        if (realConnection != null) {
            this.eventListener.connectionReleased(this.call, realConnection);
        }
        if (z11) {
            this.eventListener.connectionAcquired(this.call, realConnection2);
        }
        if (realConnection2 != null) {
            return realConnection2;
        }
        if (route == null && ((selection = this.routeSelection) == null || !selection.hasNext())) {
            this.routeSelection = this.routeSelector.next();
            z12 = true;
        } else {
            z12 = false;
        }
        synchronized (this.connectionPool) {
            if (!this.transmitter.isCanceled()) {
                if (z12) {
                    list = this.routeSelection.getAll();
                    if (this.connectionPool.transmitterAcquirePooledConnection(this.address, this.transmitter, list, false)) {
                        realConnection2 = this.transmitter.connection;
                        z11 = true;
                    }
                } else {
                    list = null;
                }
                if (!z11) {
                    if (route == null) {
                        route = this.routeSelection.next();
                    }
                    realConnection2 = new RealConnection(this.connectionPool, route);
                    this.connectingConnection = realConnection2;
                }
            } else {
                throw new IOException("Canceled");
            }
        }
        if (z11) {
            this.eventListener.connectionAcquired(this.call, realConnection2);
            return realConnection2;
        }
        realConnection2.connect(i10, i11, i12, i13, z10, this.call, this.eventListener);
        this.connectionPool.routeDatabase.connected(realConnection2.route());
        synchronized (this.connectionPool) {
            this.connectingConnection = null;
            if (this.connectionPool.transmitterAcquirePooledConnection(this.address, this.transmitter, list, true)) {
                realConnection2.noNewExchanges = true;
                socket = realConnection2.socket();
                realConnection2 = this.transmitter.connection;
                this.nextRouteToTry = route;
            } else {
                this.connectionPool.put(realConnection2);
                this.transmitter.acquireConnectionNoEvents(realConnection2);
            }
        }
        Util.closeQuietly(socket);
        this.eventListener.connectionAcquired(this.call, realConnection2);
        return realConnection2;
    }

    private RealConnection findHealthyConnection(int i10, int i11, int i12, int i13, boolean z10, boolean z11) throws IOException {
        while (true) {
            RealConnection findConnection = findConnection(i10, i11, i12, i13, z10);
            synchronized (this.connectionPool) {
                if (findConnection.successCount == 0 && !findConnection.isMultiplexed()) {
                    return findConnection;
                }
                if (!findConnection.isHealthy(z11)) {
                    findConnection.noNewExchanges();
                } else {
                    return findConnection;
                }
            }
        }
    }

    private boolean retryCurrentRoute() {
        RealConnection realConnection = this.transmitter.connection;
        if (realConnection != null && realConnection.routeFailureCount == 0 && Util.sameConnection(realConnection.route().address().url(), this.address.url())) {
            return true;
        }
        return false;
    }

    public RealConnection connectingConnection() {
        return this.connectingConnection;
    }

    public ExchangeCodec find(OkHttpClient okHttpClient, Interceptor.Chain chain, boolean z10) {
        try {
            return findHealthyConnection(chain.connectTimeoutMillis(), chain.readTimeoutMillis(), chain.writeTimeoutMillis(), okHttpClient.pingIntervalMillis(), okHttpClient.retryOnConnectionFailure(), z10).newCodec(okHttpClient, chain);
        } catch (IOException e10) {
            trackFailure();
            throw new RouteException(e10);
        } catch (RouteException e11) {
            trackFailure();
            throw e11;
        }
    }

    public boolean hasRouteToTry() {
        synchronized (this.connectionPool) {
            boolean z10 = true;
            if (this.nextRouteToTry != null) {
                return true;
            }
            if (retryCurrentRoute()) {
                this.nextRouteToTry = this.transmitter.connection.route();
                return true;
            }
            RouteSelector.Selection selection = this.routeSelection;
            if ((selection == null || !selection.hasNext()) && !this.routeSelector.hasNext()) {
                z10 = false;
            }
            return z10;
        }
    }

    public boolean hasStreamFailure() {
        boolean z10;
        synchronized (this.connectionPool) {
            z10 = this.hasStreamFailure;
        }
        return z10;
    }

    public void trackFailure() {
        synchronized (this.connectionPool) {
            this.hasStreamFailure = true;
        }
    }
}
