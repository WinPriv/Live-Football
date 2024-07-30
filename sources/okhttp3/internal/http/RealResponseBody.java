package okhttp3.internal.http;

import javax.annotation.Nullable;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.d;

/* loaded from: classes2.dex */
public final class RealResponseBody extends ResponseBody {
    private final long contentLength;

    @Nullable
    private final String contentTypeString;
    private final d source;

    public RealResponseBody(@Nullable String str, long j10, d dVar) {
        this.contentTypeString = str;
        this.contentLength = j10;
        this.source = dVar;
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return this.contentLength;
    }

    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
        String str = this.contentTypeString;
        if (str != null) {
            return MediaType.parse(str);
        }
        return null;
    }

    @Override // okhttp3.ResponseBody
    public d source() {
        return this.source;
    }
}
