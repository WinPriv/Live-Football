package okhttp3.internal.connection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.CertificatePinner;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import okio.a;
import okio.a0;

/* loaded from: classes2.dex */
public final class Transmitter {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final Call call;

    @Nullable
    private Object callStackTrace;
    private boolean canceled;
    private final OkHttpClient client;
    public RealConnection connection;
    private final RealConnectionPool connectionPool;
    private final EventListener eventListener;

    @Nullable
    private Exchange exchange;
    private ExchangeFinder exchangeFinder;
    private boolean exchangeRequestDone;
    private boolean exchangeResponseDone;
    private boolean noMoreExchanges;
    private Request request;
    private final a timeout;
    private boolean timeoutEarlyExit;

    /* loaded from: classes2.dex */
    public static final class TransmitterReference extends WeakReference<Transmitter> {
        final Object callStackTrace;

        public TransmitterReference(Transmitter transmitter, Object obj) {
            super(transmitter);
            this.callStackTrace = obj;
        }
    }

    public Transmitter(OkHttpClient okHttpClient, Call call) {
        a aVar = new a() { // from class: okhttp3.internal.connection.Transmitter.1
            @Override // okio.a
            public void timedOut() {
                Transmitter.this.cancel();
            }
        };
        this.timeout = aVar;
        this.client = okHttpClient;
        this.connectionPool = Internal.instance.realConnectionPool(okHttpClient.connectionPool());
        this.call = call;
        this.eventListener = okHttpClient.eventListenerFactory().create(call);
        aVar.timeout(okHttpClient.callTimeoutMillis(), TimeUnit.MILLISECONDS);
    }

    private Address createAddress(HttpUrl httpUrl) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        CertificatePinner certificatePinner;
        if (httpUrl.isHttps()) {
            sSLSocketFactory = this.client.sslSocketFactory();
            hostnameVerifier = this.client.hostnameVerifier();
            certificatePinner = this.client.certificatePinner();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            certificatePinner = null;
        }
        return new Address(httpUrl.host(), httpUrl.port(), this.client.dns(), this.client.socketFactory(), sSLSocketFactory, hostnameVerifier, certificatePinner, this.client.proxyAuthenticator(), this.client.proxy(), this.client.protocols(), this.client.connectionSpecs(), this.client.proxySelector());
    }

    @Nullable
    private IOException maybeReleaseConnection(@Nullable IOException iOException, boolean z10) {
        RealConnection realConnection;
        Socket socket;
        boolean z11;
        boolean z12;
        synchronized (this.connectionPool) {
            if (z10) {
                if (this.exchange != null) {
                    throw new IllegalStateException("cannot release connection while it is in use");
                }
            }
            realConnection = this.connection;
            if (realConnection != null && this.exchange == null && (z10 || this.noMoreExchanges)) {
                socket = releaseConnectionNoEvents();
            } else {
                socket = null;
            }
            if (this.connection != null) {
                realConnection = null;
            }
            z11 = true;
            if (this.noMoreExchanges && this.exchange == null) {
                z12 = true;
            } else {
                z12 = false;
            }
        }
        Util.closeQuietly(socket);
        if (realConnection != null) {
            this.eventListener.connectionReleased(this.call, realConnection);
        }
        if (z12) {
            if (iOException == null) {
                z11 = false;
            }
            iOException = timeoutExit(iOException);
            if (z11) {
                this.eventListener.callFailed(this.call, iOException);
            } else {
                this.eventListener.callEnd(this.call);
            }
        }
        return iOException;
    }

    @Nullable
    private IOException timeoutExit(@Nullable IOException iOException) {
        if (this.timeoutEarlyExit) {
            return iOException;
        }
        if (!this.timeout.exit()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void acquireConnectionNoEvents(RealConnection realConnection) {
        if (this.connection == null) {
            this.connection = realConnection;
            realConnection.transmitters.add(new TransmitterReference(this, this.callStackTrace));
            return;
        }
        throw new IllegalStateException();
    }

    public void callStart() {
        this.callStackTrace = Platform.get().getStackTraceForCloseable("response.body().close()");
        this.eventListener.callStart(this.call);
    }

    public boolean canRetry() {
        if (this.exchangeFinder.hasStreamFailure() && this.exchangeFinder.hasRouteToTry()) {
            return true;
        }
        return false;
    }

    public void cancel() {
        Exchange exchange;
        RealConnection realConnection;
        synchronized (this.connectionPool) {
            this.canceled = true;
            exchange = this.exchange;
            ExchangeFinder exchangeFinder = this.exchangeFinder;
            if (exchangeFinder != null && exchangeFinder.connectingConnection() != null) {
                realConnection = this.exchangeFinder.connectingConnection();
            } else {
                realConnection = this.connection;
            }
        }
        if (exchange != null) {
            exchange.cancel();
        } else if (realConnection != null) {
            realConnection.cancel();
        }
    }

    public void exchangeDoneDueToException() {
        synchronized (this.connectionPool) {
            if (!this.noMoreExchanges) {
                this.exchange = null;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @Nullable
    public IOException exchangeMessageDone(Exchange exchange, boolean z10, boolean z11, @Nullable IOException iOException) {
        boolean z12;
        synchronized (this.connectionPool) {
            Exchange exchange2 = this.exchange;
            if (exchange != exchange2) {
                return iOException;
            }
            boolean z13 = true;
            if (z10) {
                z12 = !this.exchangeRequestDone;
                this.exchangeRequestDone = true;
            } else {
                z12 = false;
            }
            if (z11) {
                if (!this.exchangeResponseDone) {
                    z12 = true;
                }
                this.exchangeResponseDone = true;
            }
            if (this.exchangeRequestDone && this.exchangeResponseDone && z12) {
                exchange2.connection().successCount++;
                this.exchange = null;
            } else {
                z13 = false;
            }
            if (z13) {
                return maybeReleaseConnection(iOException, false);
            }
            return iOException;
        }
    }

    public boolean hasExchange() {
        boolean z10;
        synchronized (this.connectionPool) {
            if (this.exchange != null) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public boolean isCanceled() {
        boolean z10;
        synchronized (this.connectionPool) {
            z10 = this.canceled;
        }
        return z10;
    }

    public Exchange newExchange(Interceptor.Chain chain, boolean z10) {
        synchronized (this.connectionPool) {
            if (!this.noMoreExchanges) {
                if (this.exchange != null) {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                }
            } else {
                throw new IllegalStateException("released");
            }
        }
        Exchange exchange = new Exchange(this, this.call, this.eventListener, this.exchangeFinder, this.exchangeFinder.find(this.client, chain, z10));
        synchronized (this.connectionPool) {
            this.exchange = exchange;
            this.exchangeRequestDone = false;
            this.exchangeResponseDone = false;
        }
        return exchange;
    }

    @Nullable
    public IOException noMoreExchanges(@Nullable IOException iOException) {
        synchronized (this.connectionPool) {
            this.noMoreExchanges = true;
        }
        return maybeReleaseConnection(iOException, false);
    }

    public void prepareToConnect(Request request) {
        Request request2 = this.request;
        if (request2 != null) {
            if (Util.sameConnection(request2.url(), request.url()) && this.exchangeFinder.hasRouteToTry()) {
                return;
            }
            if (this.exchange == null) {
                if (this.exchangeFinder != null) {
                    maybeReleaseConnection(null, true);
                    this.exchangeFinder = null;
                }
            } else {
                throw new IllegalStateException();
            }
        }
        this.request = request;
        this.exchangeFinder = new ExchangeFinder(this, this.connectionPool, createAddress(request.url()), this.call, this.eventListener);
    }

    @Nullable
    public Socket releaseConnectionNoEvents() {
        int size = this.connection.transmitters.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (this.connection.transmitters.get(i10).get() == this) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 != -1) {
            RealConnection realConnection = this.connection;
            realConnection.transmitters.remove(i10);
            this.connection = null;
            if (realConnection.transmitters.isEmpty()) {
                realConnection.idleAtNanos = System.nanoTime();
                if (this.connectionPool.connectionBecameIdle(realConnection)) {
                    return realConnection.socket();
                }
            }
            return null;
        }
        throw new IllegalStateException();
    }

    public a0 timeout() {
        return this.timeout;
    }

    public void timeoutEarlyExit() {
        if (!this.timeoutEarlyExit) {
            this.timeoutEarlyExit = true;
            this.timeout.exit();
            return;
        }
        throw new IllegalStateException();
    }

    public void timeoutEnter() {
        this.timeout.enter();
    }
}
