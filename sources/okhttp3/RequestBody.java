package okhttp3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import okhttp3.internal.Util;
import okio.a0;
import okio.c;
import okio.e;
import okio.n;
import okio.q;

/* loaded from: classes2.dex */
public abstract class RequestBody {
    public static RequestBody create(@Nullable MediaType mediaType, String str) {
        Charset charset = StandardCharsets.UTF_8;
        if (mediaType != null && (charset = mediaType.charset()) == null) {
            charset = StandardCharsets.UTF_8;
            mediaType = MediaType.parse(mediaType + "; charset=utf-8");
        }
        return create(mediaType, str.getBytes(charset));
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    @Nullable
    public abstract MediaType contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(c cVar) throws IOException;

    public static RequestBody create(@Nullable final MediaType mediaType, final e eVar) {
        return new RequestBody() { // from class: okhttp3.RequestBody.1
            @Override // okhttp3.RequestBody
            public long contentLength() throws IOException {
                return eVar.A();
            }

            @Override // okhttp3.RequestBody
            @Nullable
            public MediaType contentType() {
                return MediaType.this;
            }

            @Override // okhttp3.RequestBody
            public void writeTo(c cVar) throws IOException {
                cVar.O(eVar);
            }
        };
    }

    public static RequestBody create(@Nullable MediaType mediaType, byte[] bArr) {
        return create(mediaType, bArr, 0, bArr.length);
    }

    public static RequestBody create(@Nullable final MediaType mediaType, final byte[] bArr, final int i10, final int i11) {
        if (bArr != null) {
            Util.checkOffsetAndCount(bArr.length, i10, i11);
            return new RequestBody() { // from class: okhttp3.RequestBody.2
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return i11;
                }

                @Override // okhttp3.RequestBody
                @Nullable
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(c cVar) throws IOException {
                    cVar.write(bArr, i10, i11);
                }
            };
        }
        throw new NullPointerException("content == null");
    }

    public static RequestBody create(@Nullable final MediaType mediaType, final File file) {
        if (file != null) {
            return new RequestBody() { // from class: okhttp3.RequestBody.3
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return file.length();
                }

                @Override // okhttp3.RequestBody
                @Nullable
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(c cVar) throws IOException {
                    File file2 = file;
                    Logger logger = q.f33861a;
                    if (file2 != null) {
                        n nVar = new n(new FileInputStream(file2), new a0());
                        try {
                            cVar.J(nVar);
                            nVar.close();
                            return;
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                try {
                                    nVar.close();
                                } catch (Throwable th3) {
                                    th.addSuppressed(th3);
                                }
                                throw th2;
                            }
                        }
                    }
                    throw new IllegalArgumentException("file == null");
                }
            };
        }
        throw new NullPointerException("file == null");
    }
}
