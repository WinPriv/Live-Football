package okhttp3.internal.http;

import java.io.IOException;
import javax.annotation.Nullable;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.RealConnection;
import okio.y;
import okio.z;

/* loaded from: classes2.dex */
public interface ExchangeCodec {
    public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;

    void cancel();

    RealConnection connection();

    y createRequestBody(Request request, long j10) throws IOException;

    void finishRequest() throws IOException;

    void flushRequest() throws IOException;

    z openResponseBodySource(Response response) throws IOException;

    @Nullable
    Response.Builder readResponseHeaders(boolean z10) throws IOException;

    long reportedContentLength(Response response) throws IOException;

    Headers trailers() throws IOException;

    void writeRequestHeaders(Request request) throws IOException;
}
