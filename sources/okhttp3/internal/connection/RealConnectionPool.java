package okhttp3.internal.connection;

import androidx.activity.k;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Proxy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import okhttp3.Address;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Transmitter;
import okhttp3.internal.platform.Platform;

/* loaded from: classes2.dex */
public final class RealConnectionPool {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Executor executor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory("OkHttp ConnectionPool", true));
    boolean cleanupRunning;
    private final long keepAliveDurationNs;
    private final int maxIdleConnections;
    private final Runnable cleanupRunnable = new k(this, 10);
    private final Deque<RealConnection> connections = new ArrayDeque();
    final RouteDatabase routeDatabase = new RouteDatabase();

    public RealConnectionPool(int i10, long j10, TimeUnit timeUnit) {
        this.maxIdleConnections = i10;
        this.keepAliveDurationNs = timeUnit.toNanos(j10);
        if (j10 > 0) {
        } else {
            throw new IllegalArgumentException(a3.k.k("keepAliveDuration <= 0: ", j10));
        }
    }

    public static /* synthetic */ void a(RealConnectionPool realConnectionPool) {
        realConnectionPool.lambda$new$0();
    }

    public /* synthetic */ void lambda$new$0() {
        while (true) {
            long cleanup = cleanup(System.nanoTime());
            if (cleanup == -1) {
                return;
            }
            if (cleanup > 0) {
                long j10 = cleanup / 1000000;
                long j11 = cleanup - (1000000 * j10);
                synchronized (this) {
                    try {
                        wait(j10, (int) j11);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }

    private int pruneAndGetAllocationCount(RealConnection realConnection, long j10) {
        List<Reference<Transmitter>> list = realConnection.transmitters;
        int i10 = 0;
        while (i10 < list.size()) {
            Reference<Transmitter> reference = list.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                Platform.get().logCloseableLeak("A connection to " + realConnection.route().address().url() + " was leaked. Did you forget to close a response body?", ((Transmitter.TransmitterReference) reference).callStackTrace);
                list.remove(i10);
                realConnection.noNewExchanges = true;
                if (list.isEmpty()) {
                    realConnection.idleAtNanos = j10 - this.keepAliveDurationNs;
                    return 0;
                }
            }
        }
        return list.size();
    }

    public long cleanup(long j10) {
        synchronized (this) {
            RealConnection realConnection = null;
            long j11 = Long.MIN_VALUE;
            int i10 = 0;
            int i11 = 0;
            for (RealConnection realConnection2 : this.connections) {
                if (pruneAndGetAllocationCount(realConnection2, j10) > 0) {
                    i11++;
                } else {
                    i10++;
                    long j12 = j10 - realConnection2.idleAtNanos;
                    if (j12 > j11) {
                        realConnection = realConnection2;
                        j11 = j12;
                    }
                }
            }
            long j13 = this.keepAliveDurationNs;
            if (j11 < j13 && i10 <= this.maxIdleConnections) {
                if (i10 > 0) {
                    return j13 - j11;
                }
                if (i11 > 0) {
                    return j13;
                }
                this.cleanupRunning = false;
                return -1L;
            }
            this.connections.remove(realConnection);
            Util.closeQuietly(realConnection.socket());
            return 0L;
        }
    }

    public void connectFailed(Route route, IOException iOException) {
        if (route.proxy().type() != Proxy.Type.DIRECT) {
            Address address = route.address();
            address.proxySelector().connectFailed(address.url().uri(), route.proxy().address(), iOException);
        }
        this.routeDatabase.failed(route);
    }

    public boolean connectionBecameIdle(RealConnection realConnection) {
        if (!realConnection.noNewExchanges && this.maxIdleConnections != 0) {
            notifyAll();
            return false;
        }
        this.connections.remove(realConnection);
        return true;
    }

    public synchronized int connectionCount() {
        return this.connections.size();
    }

    public void evictAll() {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<RealConnection> it = this.connections.iterator();
            while (it.hasNext()) {
                RealConnection next = it.next();
                if (next.transmitters.isEmpty()) {
                    next.noNewExchanges = true;
                    arrayList.add(next);
                    it.remove();
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Util.closeQuietly(((RealConnection) it2.next()).socket());
        }
    }

    public synchronized int idleConnectionCount() {
        int i10;
        Iterator<RealConnection> it = this.connections.iterator();
        i10 = 0;
        while (it.hasNext()) {
            if (it.next().transmitters.isEmpty()) {
                i10++;
            }
        }
        return i10;
    }

    public void put(RealConnection realConnection) {
        if (!this.cleanupRunning) {
            this.cleanupRunning = true;
            executor.execute(this.cleanupRunnable);
        }
        this.connections.add(realConnection);
    }

    public boolean transmitterAcquirePooledConnection(Address address, Transmitter transmitter, @Nullable List<Route> list, boolean z10) {
        for (RealConnection realConnection : this.connections) {
            if (!z10 || realConnection.isMultiplexed()) {
                if (realConnection.isEligible(address, list)) {
                    transmitter.acquireConnectionNoEvents(realConnection);
                    return true;
                }
            }
        }
        return false;
    }
}
