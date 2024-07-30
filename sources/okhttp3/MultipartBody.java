package okhttp3;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import okhttp3.Headers;
import okhttp3.internal.Util;
import okio.b;
import okio.c;
import okio.e;
import org.jsoup.helper.HttpConnection;

/* loaded from: classes2.dex */
public final class MultipartBody extends RequestBody {
    private final e boundary;
    private long contentLength = -1;
    private final MediaType contentType;
    private final MediaType originalType;
    private final List<Part> parts;
    public static final MediaType MIXED = MediaType.get("multipart/mixed");
    public static final MediaType ALTERNATIVE = MediaType.get("multipart/alternative");
    public static final MediaType DIGEST = MediaType.get("multipart/digest");
    public static final MediaType PARALLEL = MediaType.get("multipart/parallel");
    public static final MediaType FORM = MediaType.get(HttpConnection.MULTIPART_FORM_DATA);
    private static final byte[] COLONSPACE = {58, 32};
    private static final byte[] CRLF = {Ascii.CR, 10};
    private static final byte[] DASHDASH = {45, 45};

    /* loaded from: classes2.dex */
    public static final class Builder {
        private final e boundary;
        private final List<Part> parts;
        private MediaType type;

        public Builder() {
            this(UUID.randomUUID().toString());
        }

        public Builder addFormDataPart(String str, String str2) {
            return addPart(Part.createFormData(str, str2));
        }

        public Builder addPart(RequestBody requestBody) {
            return addPart(Part.create(requestBody));
        }

        public MultipartBody build() {
            if (!this.parts.isEmpty()) {
                return new MultipartBody(this.boundary, this.type, this.parts);
            }
            throw new IllegalStateException("Multipart body must have at least one part.");
        }

        public Builder setType(MediaType mediaType) {
            if (mediaType != null) {
                if (mediaType.type().equals("multipart")) {
                    this.type = mediaType;
                    return this;
                }
                throw new IllegalArgumentException("multipart != " + mediaType);
            }
            throw new NullPointerException("type == null");
        }

        public Builder(String str) {
            this.type = MultipartBody.MIXED;
            this.parts = new ArrayList();
            this.boundary = e.p(str);
        }

        public Builder addFormDataPart(String str, @Nullable String str2, RequestBody requestBody) {
            return addPart(Part.createFormData(str, str2, requestBody));
        }

        public Builder addPart(@Nullable Headers headers, RequestBody requestBody) {
            return addPart(Part.create(headers, requestBody));
        }

        public Builder addPart(Part part) {
            if (part != null) {
                this.parts.add(part);
                return this;
            }
            throw new NullPointerException("part == null");
        }
    }

    /* loaded from: classes2.dex */
    public static final class Part {
        final RequestBody body;

        @Nullable
        final Headers headers;

        private Part(@Nullable Headers headers, RequestBody requestBody) {
            this.headers = headers;
            this.body = requestBody;
        }

        public static Part create(RequestBody requestBody) {
            return create(null, requestBody);
        }

        public static Part createFormData(String str, String str2) {
            return createFormData(str, null, RequestBody.create((MediaType) null, str2));
        }

        public RequestBody body() {
            return this.body;
        }

        @Nullable
        public Headers headers() {
            return this.headers;
        }

        public static Part create(@Nullable Headers headers, RequestBody requestBody) {
            if (requestBody != null) {
                if (headers != null && headers.get("Content-Type") != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type");
                }
                if (headers != null && headers.get("Content-Length") != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Length");
                }
                return new Part(headers, requestBody);
            }
            throw new NullPointerException("body == null");
        }

        public static Part createFormData(String str, @Nullable String str2, RequestBody requestBody) {
            if (str != null) {
                StringBuilder sb2 = new StringBuilder("form-data; name=");
                MultipartBody.appendQuotedString(sb2, str);
                if (str2 != null) {
                    sb2.append("; filename=");
                    MultipartBody.appendQuotedString(sb2, str2);
                }
                return create(new Headers.Builder().addUnsafeNonAscii("Content-Disposition", sb2.toString()).build(), requestBody);
            }
            throw new NullPointerException("name == null");
        }
    }

    public MultipartBody(e eVar, MediaType mediaType, List<Part> list) {
        this.boundary = eVar;
        this.originalType = mediaType;
        this.contentType = MediaType.get(mediaType + "; boundary=" + eVar.G());
        this.parts = Util.immutableList(list);
    }

    public static void appendQuotedString(StringBuilder sb2, String str) {
        sb2.append('\"');
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt != '\n') {
                if (charAt != '\r') {
                    if (charAt != '\"') {
                        sb2.append(charAt);
                    } else {
                        sb2.append("%22");
                    }
                } else {
                    sb2.append("%0D");
                }
            } else {
                sb2.append("%0A");
            }
        }
        sb2.append('\"');
    }

    /* JADX WARN: Multi-variable type inference failed */
    private long writeOrCountBytes(@Nullable c cVar, boolean z10) throws IOException {
        b bVar;
        if (z10) {
            cVar = new b();
            bVar = cVar;
        } else {
            bVar = 0;
        }
        int size = this.parts.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Part part = this.parts.get(i10);
            Headers headers = part.headers;
            RequestBody requestBody = part.body;
            cVar.write(DASHDASH);
            cVar.O(this.boundary);
            cVar.write(CRLF);
            if (headers != null) {
                int size2 = headers.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    cVar.G(headers.name(i11)).write(COLONSPACE).G(headers.value(i11)).write(CRLF);
                }
            }
            MediaType contentType = requestBody.contentType();
            if (contentType != null) {
                cVar.G("Content-Type: ").G(contentType.toString()).write(CRLF);
            }
            long contentLength = requestBody.contentLength();
            if (contentLength != -1) {
                cVar.G("Content-Length: ").U(contentLength).write(CRLF);
            } else if (z10) {
                bVar.b();
                return -1L;
            }
            byte[] bArr = CRLF;
            cVar.write(bArr);
            if (z10) {
                j10 += contentLength;
            } else {
                requestBody.writeTo(cVar);
            }
            cVar.write(bArr);
        }
        byte[] bArr2 = DASHDASH;
        cVar.write(bArr2);
        cVar.O(this.boundary);
        cVar.write(bArr2);
        cVar.write(CRLF);
        if (z10) {
            long j11 = j10 + bVar.f33824t;
            bVar.b();
            return j11;
        }
        return j10;
    }

    public String boundary() {
        return this.boundary.G();
    }

    @Override // okhttp3.RequestBody
    public long contentLength() throws IOException {
        long j10 = this.contentLength;
        if (j10 != -1) {
            return j10;
        }
        long writeOrCountBytes = writeOrCountBytes(null, true);
        this.contentLength = writeOrCountBytes;
        return writeOrCountBytes;
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return this.contentType;
    }

    public Part part(int i10) {
        return this.parts.get(i10);
    }

    public List<Part> parts() {
        return this.parts;
    }

    public int size() {
        return this.parts.size();
    }

    public MediaType type() {
        return this.originalType;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(c cVar) throws IOException {
        writeOrCountBytes(cVar, false);
    }
}
