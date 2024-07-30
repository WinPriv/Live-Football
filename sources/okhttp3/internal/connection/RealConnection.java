package okhttp3.internal.connection;

import com.huawei.openalliance.ad.constant.ag;
import com.huawei.openalliance.ad.constant.w;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.CertificatePinner;
import okhttp3.Connection;
import okhttp3.ConnectionSpec;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.Version;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2ExchangeCodec;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;
import okio.a0;
import okio.c;
import okio.d;
import okio.q;
import okio.t;
import okio.u;

/* loaded from: classes2.dex */
public final class RealConnection extends Http2Connection.Listener implements Connection {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int MAX_TUNNEL_ATTEMPTS = 21;
    private static final String NPE_THROW_WITH_NULL = "throw with null exception";
    public final RealConnectionPool connectionPool;
    private Handshake handshake;
    private Http2Connection http2Connection;
    boolean noNewExchanges;
    private Protocol protocol;
    private Socket rawSocket;
    private int refusedStreamCount;
    private final Route route;
    int routeFailureCount;
    private c sink;
    private Socket socket;
    private d source;
    int successCount;
    private int allocationLimit = 1;
    final List<Reference<Transmitter>> transmitters = new ArrayList();
    long idleAtNanos = Long.MAX_VALUE;

    public RealConnection(RealConnectionPool realConnectionPool, Route route) {
        this.connectionPool = realConnectionPool;
        this.route = route;
    }

    private void connectSocket(int i10, int i11, Call call, EventListener eventListener) throws IOException {
        Socket createSocket;
        Proxy proxy = this.route.proxy();
        Address address = this.route.address();
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.HTTP) {
            createSocket = new Socket(proxy);
        } else {
            createSocket = address.socketFactory().createSocket();
        }
        this.rawSocket = createSocket;
        eventListener.connectStart(call, this.route.socketAddress(), proxy);
        this.rawSocket.setSoTimeout(i11);
        try {
            Platform.get().connectSocket(this.rawSocket, this.route.socketAddress(), i10);
            try {
                this.source = new u(q.e(this.rawSocket));
                this.sink = new t(q.d(this.rawSocket));
            } catch (NullPointerException e10) {
                if (!NPE_THROW_WITH_NULL.equals(e10.getMessage())) {
                } else {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.route.socketAddress());
            connectException.initCause(e11);
            throw connectException;
        }
    }

    private void connectTls(ConnectionSpecSelector connectionSpecSelector) throws IOException {
        SSLSocket sSLSocket;
        Protocol protocol;
        Address address = this.route.address();
        SSLSocket sSLSocket2 = null;
        String str = null;
        try {
            try {
                sSLSocket = (SSLSocket) address.sslSocketFactory().createSocket(this.rawSocket, address.url().host(), address.url().port(), true);
            } catch (AssertionError e10) {
                e = e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            ConnectionSpec configureSecureSocket = connectionSpecSelector.configureSecureSocket(sSLSocket);
            if (configureSecureSocket.supportsTlsExtensions()) {
                Platform.get().configureTlsExtensions(sSLSocket, address.url().host(), address.protocols());
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            Handshake handshake = Handshake.get(session);
            if (!address.hostnameVerifier().verify(address.url().host(), session)) {
                List<Certificate> peerCertificates = handshake.peerCertificates();
                if (!peerCertificates.isEmpty()) {
                    X509Certificate x509Certificate = (X509Certificate) peerCertificates.get(0);
                    throw new SSLPeerUnverifiedException("Hostname " + address.url().host() + " not verified:\n    certificate: " + CertificatePinner.pin(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + OkHostnameVerifier.allSubjectAltNames(x509Certificate));
                }
                throw new SSLPeerUnverifiedException("Hostname " + address.url().host() + " not verified (no certificates)");
            }
            address.certificatePinner().check(address.url().host(), handshake.peerCertificates());
            if (configureSecureSocket.supportsTlsExtensions()) {
                str = Platform.get().getSelectedProtocol(sSLSocket);
            }
            this.socket = sSLSocket;
            this.source = new u(q.e(sSLSocket));
            this.sink = new t(q.d(this.socket));
            this.handshake = handshake;
            if (str != null) {
                protocol = Protocol.get(str);
            } else {
                protocol = Protocol.HTTP_1_1;
            }
            this.protocol = protocol;
            Platform.get().afterHandshake(sSLSocket);
        } catch (AssertionError e11) {
            e = e11;
            if (Util.isAndroidGetsocknameError(e)) {
                throw new IOException(e);
            }
            throw e;
        } catch (Throwable th2) {
            th = th2;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                Platform.get().afterHandshake(sSLSocket2);
            }
            Util.closeQuietly((Socket) sSLSocket2);
            throw th;
        }
    }

    private void connectTunnel(int i10, int i11, int i12, Call call, EventListener eventListener) throws IOException {
        Request createTunnelRequest = createTunnelRequest();
        HttpUrl url = createTunnelRequest.url();
        for (int i13 = 0; i13 < 21; i13++) {
            connectSocket(i10, i11, call, eventListener);
            createTunnelRequest = createTunnel(i11, i12, createTunnelRequest, url);
            if (createTunnelRequest != null) {
                Util.closeQuietly(this.rawSocket);
                this.rawSocket = null;
                this.sink = null;
                this.source = null;
                eventListener.connectEnd(call, this.route.socketAddress(), this.route.proxy(), null);
            } else {
                return;
            }
        }
    }

    private Request createTunnel(int i10, int i11, Request request, HttpUrl httpUrl) throws IOException {
        String str = "CONNECT " + Util.hostHeader(httpUrl, true) + " HTTP/1.1";
        while (true) {
            Http1ExchangeCodec http1ExchangeCodec = new Http1ExchangeCodec(null, null, this.source, this.sink);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.source.timeout().timeout(i10, timeUnit);
            this.sink.timeout().timeout(i11, timeUnit);
            http1ExchangeCodec.writeRequest(request.headers(), str);
            http1ExchangeCodec.finishRequest();
            Response build = http1ExchangeCodec.readResponseHeaders(false).request(request).build();
            http1ExchangeCodec.skipConnectBody(build);
            int code = build.code();
            if (code != 200) {
                if (code == 407) {
                    Request authenticate = this.route.address().proxyAuthenticator().authenticate(this.route, build);
                    if (authenticate != null) {
                        if ("close".equalsIgnoreCase(build.header("Connection"))) {
                            return authenticate;
                        }
                        request = authenticate;
                    } else {
                        throw new IOException("Failed to authenticate with proxy");
                    }
                } else {
                    throw new IOException("Unexpected response code for CONNECT: " + build.code());
                }
            } else {
                if (this.source.t().u() && this.sink.n().u()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        }
    }

    private Request createTunnelRequest() throws IOException {
        Request build = new Request.Builder().url(this.route.address().url()).method("CONNECT", null).header("Host", Util.hostHeader(this.route.address().url(), true)).header("Proxy-Connection", com.anythink.expressad.foundation.g.f.g.c.f10011c).header("User-Agent", Version.userAgent()).build();
        Request authenticate = this.route.address().proxyAuthenticator().authenticate(this.route, new Response.Builder().request(build).protocol(Protocol.HTTP_1_1).code(ag.f22002m).message("Preemptive Authenticate").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1L).receivedResponseAtMillis(-1L).header("Proxy-Authenticate", "OkHttp-Preemptive").build());
        if (authenticate != null) {
            return authenticate;
        }
        return build;
    }

    private void establishProtocol(ConnectionSpecSelector connectionSpecSelector, int i10, Call call, EventListener eventListener) throws IOException {
        if (this.route.address().sslSocketFactory() == null) {
            List<Protocol> protocols = this.route.address().protocols();
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (protocols.contains(protocol)) {
                this.socket = this.rawSocket;
                this.protocol = protocol;
                startHttp2(i10);
                return;
            } else {
                this.socket = this.rawSocket;
                this.protocol = Protocol.HTTP_1_1;
                return;
            }
        }
        eventListener.secureConnectStart(call);
        connectTls(connectionSpecSelector);
        eventListener.secureConnectEnd(call, this.handshake);
        if (this.protocol == Protocol.HTTP_2) {
            startHttp2(i10);
        }
    }

    private boolean routeMatchesAny(List<Route> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Route route = list.get(i10);
            if (route.proxy().type() == Proxy.Type.DIRECT && this.route.proxy().type() == Proxy.Type.DIRECT && this.route.socketAddress().equals(route.socketAddress())) {
                return true;
            }
        }
        return false;
    }

    private void startHttp2(int i10) throws IOException {
        this.socket.setSoTimeout(0);
        Http2Connection build = new Http2Connection.Builder(true).socket(this.socket, this.route.address().url().host(), this.source, this.sink).listener(this).pingIntervalMillis(i10).build();
        this.http2Connection = build;
        build.start();
    }

    public static RealConnection testConnection(RealConnectionPool realConnectionPool, Route route, Socket socket, long j10) {
        RealConnection realConnection = new RealConnection(realConnectionPool, route);
        realConnection.socket = socket;
        realConnection.idleAtNanos = j10;
        return realConnection;
    }

    public void cancel() {
        Util.closeQuietly(this.rawSocket);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e6 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void connect(int r17, int r18, int r19, int r20, boolean r21, okhttp3.Call r22, okhttp3.EventListener r23) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.connect(int, int, int, int, boolean, okhttp3.Call, okhttp3.EventListener):void");
    }

    @Override // okhttp3.Connection
    public Handshake handshake() {
        return this.handshake;
    }

    public boolean isEligible(Address address, @Nullable List<Route> list) {
        if (this.transmitters.size() >= this.allocationLimit || this.noNewExchanges || !Internal.instance.equalsNonHost(this.route.address(), address)) {
            return false;
        }
        if (address.url().host().equals(route().address().url().host())) {
            return true;
        }
        if (this.http2Connection == null || list == null || !routeMatchesAny(list) || address.hostnameVerifier() != OkHostnameVerifier.INSTANCE || !supportsUrl(address.url())) {
            return false;
        }
        try {
            address.certificatePinner().check(address.url().host(), handshake().peerCertificates());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public boolean isHealthy(boolean z10) {
        if (this.socket.isClosed() || this.socket.isInputShutdown() || this.socket.isOutputShutdown()) {
            return false;
        }
        Http2Connection http2Connection = this.http2Connection;
        if (http2Connection != null) {
            return http2Connection.isHealthy(System.nanoTime());
        }
        if (z10) {
            try {
                int soTimeout = this.socket.getSoTimeout();
                try {
                    this.socket.setSoTimeout(1);
                    if (this.source.u()) {
                        return false;
                    }
                    return true;
                } finally {
                    this.socket.setSoTimeout(soTimeout);
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    public boolean isMultiplexed() {
        if (this.http2Connection != null) {
            return true;
        }
        return false;
    }

    public ExchangeCodec newCodec(OkHttpClient okHttpClient, Interceptor.Chain chain) throws SocketException {
        if (this.http2Connection != null) {
            return new Http2ExchangeCodec(okHttpClient, this, chain, this.http2Connection);
        }
        this.socket.setSoTimeout(chain.readTimeoutMillis());
        a0 timeout = this.source.timeout();
        long readTimeoutMillis = chain.readTimeoutMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout.timeout(readTimeoutMillis, timeUnit);
        this.sink.timeout().timeout(chain.writeTimeoutMillis(), timeUnit);
        return new Http1ExchangeCodec(okHttpClient, this, this.source, this.sink);
    }

    public RealWebSocket.Streams newWebSocketStreams(final Exchange exchange) throws SocketException {
        this.socket.setSoTimeout(0);
        noNewExchanges();
        return new RealWebSocket.Streams(true, this.source, this.sink) { // from class: okhttp3.internal.connection.RealConnection.1
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                exchange.bodyComplete(-1L, true, true, null);
            }
        };
    }

    public void noNewExchanges() {
        synchronized (this.connectionPool) {
            this.noNewExchanges = true;
        }
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public void onSettings(Http2Connection http2Connection) {
        synchronized (this.connectionPool) {
            this.allocationLimit = http2Connection.maxConcurrentStreams();
        }
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public void onStream(Http2Stream http2Stream) throws IOException {
        http2Stream.close(ErrorCode.REFUSED_STREAM, null);
    }

    @Override // okhttp3.Connection
    public Protocol protocol() {
        return this.protocol;
    }

    @Override // okhttp3.Connection
    public Route route() {
        return this.route;
    }

    @Override // okhttp3.Connection
    public Socket socket() {
        return this.socket;
    }

    public boolean supportsUrl(HttpUrl httpUrl) {
        if (httpUrl.port() != this.route.address().url().port()) {
            return false;
        }
        if (httpUrl.host().equals(this.route.address().url().host())) {
            return true;
        }
        if (this.handshake == null || !OkHostnameVerifier.INSTANCE.verify(httpUrl.host(), (X509Certificate) this.handshake.peerCertificates().get(0))) {
            return false;
        }
        return true;
    }

    public String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder("Connection{");
        sb2.append(this.route.address().url().host());
        sb2.append(w.bE);
        sb2.append(this.route.address().url().port());
        sb2.append(", proxy=");
        sb2.append(this.route.proxy());
        sb2.append(" hostAddress=");
        sb2.append(this.route.socketAddress());
        sb2.append(" cipherSuite=");
        Handshake handshake = this.handshake;
        if (handshake != null) {
            obj = handshake.cipherSuite();
        } else {
            obj = "none";
        }
        sb2.append(obj);
        sb2.append(" protocol=");
        sb2.append(this.protocol);
        sb2.append('}');
        return sb2.toString();
    }

    public void trackFailure(@Nullable IOException iOException) {
        synchronized (this.connectionPool) {
            if (iOException instanceof StreamResetException) {
                ErrorCode errorCode = ((StreamResetException) iOException).errorCode;
                if (errorCode == ErrorCode.REFUSED_STREAM) {
                    int i10 = this.refusedStreamCount + 1;
                    this.refusedStreamCount = i10;
                    if (i10 > 1) {
                        this.noNewExchanges = true;
                        this.routeFailureCount++;
                    }
                } else if (errorCode != ErrorCode.CANCEL) {
                    this.noNewExchanges = true;
                    this.routeFailureCount++;
                }
            } else if (!isMultiplexed() || (iOException instanceof ConnectionShutdownException)) {
                this.noNewExchanges = true;
                if (this.successCount == 0) {
                    if (iOException != null) {
                        this.connectionPool.connectFailed(this.route, iOException);
                    }
                    this.routeFailureCount++;
                }
            }
        }
    }
}
