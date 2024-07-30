package okhttp3.internal.http2;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import okio.a0;
import okio.y;
import okio.z;

/* loaded from: classes2.dex */
public final class Http2ExchangeCodec implements ExchangeCodec {
    private volatile boolean canceled;
    private final Interceptor.Chain chain;
    private final Http2Connection connection;
    private final Protocol protocol;
    private final RealConnection realConnection;
    private volatile Http2Stream stream;
    private static final String CONNECTION = "connection";
    private static final String HOST = "host";
    private static final String KEEP_ALIVE = "keep-alive";
    private static final String PROXY_CONNECTION = "proxy-connection";
    private static final String TE = "te";
    private static final String TRANSFER_ENCODING = "transfer-encoding";
    private static final String ENCODING = "encoding";
    private static final String UPGRADE = "upgrade";
    private static final List<String> HTTP_2_SKIPPED_REQUEST_HEADERS = Util.immutableList(CONNECTION, HOST, KEEP_ALIVE, PROXY_CONNECTION, TE, TRANSFER_ENCODING, ENCODING, UPGRADE, Header.TARGET_METHOD_UTF8, Header.TARGET_PATH_UTF8, Header.TARGET_SCHEME_UTF8, Header.TARGET_AUTHORITY_UTF8);
    private static final List<String> HTTP_2_SKIPPED_RESPONSE_HEADERS = Util.immutableList(CONNECTION, HOST, KEEP_ALIVE, PROXY_CONNECTION, TE, TRANSFER_ENCODING, ENCODING, UPGRADE);

    public Http2ExchangeCodec(OkHttpClient okHttpClient, RealConnection realConnection, Interceptor.Chain chain, Http2Connection http2Connection) {
        this.realConnection = realConnection;
        this.chain = chain;
        this.connection = http2Connection;
        List<Protocol> protocols = okHttpClient.protocols();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.protocol = protocols.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    public static List<Header> http2HeadersList(Request request) {
        Headers headers = request.headers();
        ArrayList arrayList = new ArrayList(headers.size() + 4);
        arrayList.add(new Header(Header.TARGET_METHOD, request.method()));
        arrayList.add(new Header(Header.TARGET_PATH, RequestLine.requestPath(request.url())));
        String header = request.header("Host");
        if (header != null) {
            arrayList.add(new Header(Header.TARGET_AUTHORITY, header));
        }
        arrayList.add(new Header(Header.TARGET_SCHEME, request.url().scheme()));
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            String lowerCase = headers.name(i10).toLowerCase(Locale.US);
            if (!HTTP_2_SKIPPED_REQUEST_HEADERS.contains(lowerCase) || (lowerCase.equals(TE) && headers.value(i10).equals("trailers"))) {
                arrayList.add(new Header(lowerCase, headers.value(i10)));
            }
        }
        return arrayList;
    }

    public static Response.Builder readHttp2HeadersList(Headers headers, Protocol protocol) throws IOException {
        Headers.Builder builder = new Headers.Builder();
        int size = headers.size();
        StatusLine statusLine = null;
        for (int i10 = 0; i10 < size; i10++) {
            String name = headers.name(i10);
            String value = headers.value(i10);
            if (name.equals(Header.RESPONSE_STATUS_UTF8)) {
                statusLine = StatusLine.parse("HTTP/1.1 " + value);
            } else if (!HTTP_2_SKIPPED_RESPONSE_HEADERS.contains(name)) {
                Internal.instance.addLenient(builder, name, value);
            }
        }
        if (statusLine != null) {
            return new Response.Builder().protocol(protocol).code(statusLine.code).message(statusLine.message).headers(builder.build());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
        this.canceled = true;
        if (this.stream != null) {
            this.stream.closeLater(ErrorCode.CANCEL);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public RealConnection connection() {
        return this.realConnection;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public y createRequestBody(Request request, long j10) {
        return this.stream.getSink();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void finishRequest() throws IOException {
        this.stream.getSink().close();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void flushRequest() throws IOException {
        this.connection.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public z openResponseBodySource(Response response) {
        return this.stream.getSource();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Response.Builder readResponseHeaders(boolean z10) throws IOException {
        Response.Builder readHttp2HeadersList = readHttp2HeadersList(this.stream.takeHeaders(), this.protocol);
        if (z10 && Internal.instance.code(readHttp2HeadersList) == 100) {
            return null;
        }
        return readHttp2HeadersList;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public long reportedContentLength(Response response) {
        return HttpHeaders.contentLength(response);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Headers trailers() throws IOException {
        return this.stream.trailers();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(Request request) throws IOException {
        boolean z10;
        if (this.stream != null) {
            return;
        }
        if (request.body() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.stream = this.connection.newStream(http2HeadersList(request), z10);
        if (!this.canceled) {
            a0 readTimeout = this.stream.readTimeout();
            long readTimeoutMillis = this.chain.readTimeoutMillis();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            readTimeout.timeout(readTimeoutMillis, timeUnit);
            this.stream.writeTimeout().timeout(this.chain.writeTimeoutMillis(), timeUnit);
            return;
        }
        this.stream.closeLater(ErrorCode.CANCEL);
        throw new IOException("Canceled");
    }
}
