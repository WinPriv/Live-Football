package okhttp3;

import a3.k;
import com.ironsource.adapters.facebook.a;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;
import okhttp3.internal.Util;
import okio.b;
import okio.d;
import okio.e;

/* loaded from: classes2.dex */
public abstract class ResponseBody implements Closeable {

    @Nullable
    private Reader reader;

    /* loaded from: classes2.dex */
    public static final class BomAwareReader extends Reader {
        private final Charset charset;
        private boolean closed;

        @Nullable
        private Reader delegate;
        private final d source;

        public BomAwareReader(d dVar, Charset charset) {
            this.source = dVar;
            this.charset = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
            } else {
                this.source.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i10, int i11) throws IOException {
            if (!this.closed) {
                Reader reader = this.delegate;
                if (reader == null) {
                    InputStreamReader inputStreamReader = new InputStreamReader(this.source.inputStream(), Util.bomAwareCharset(this.source, this.charset));
                    this.delegate = inputStreamReader;
                    reader = inputStreamReader;
                }
                return reader.read(cArr, i10, i11);
            }
            throw new IOException("Stream closed");
        }
    }

    private static /* synthetic */ void $closeResource(Throwable th, AutoCloseable autoCloseable) {
        if (th != null) {
            try {
                autoCloseable.close();
                return;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                return;
            }
        }
        autoCloseable.close();
    }

    private Charset charset() {
        MediaType contentType = contentType();
        if (contentType != null) {
            return contentType.charset(StandardCharsets.UTF_8);
        }
        return StandardCharsets.UTF_8;
    }

    public static ResponseBody create(@Nullable MediaType mediaType, String str) {
        Charset charset = StandardCharsets.UTF_8;
        if (mediaType != null && (charset = mediaType.charset()) == null) {
            charset = StandardCharsets.UTF_8;
            mediaType = MediaType.parse(mediaType + "; charset=utf-8");
        }
        b f02 = new b().f0(str, 0, str.length(), charset);
        return create(mediaType, f02.f33824t, f02);
    }

    public final InputStream byteStream() {
        return source().inputStream();
    }

    public final byte[] bytes() throws IOException {
        long contentLength = contentLength();
        if (contentLength <= 2147483647L) {
            d source = source();
            try {
                byte[] r10 = source.r();
                $closeResource(null, source);
                if (contentLength != -1 && contentLength != r10.length) {
                    throw new IOException(a.i(a.k("Content-Length (", contentLength, ") and stream length ("), r10.length, ") disagree"));
                }
                return r10;
            } finally {
            }
        } else {
            throw new IOException(k.k("Cannot buffer entire body for content length: ", contentLength));
        }
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader == null) {
            BomAwareReader bomAwareReader = new BomAwareReader(source(), charset());
            this.reader = bomAwareReader;
            return bomAwareReader;
        }
        return reader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Util.closeQuietly(source());
    }

    public abstract long contentLength();

    @Nullable
    public abstract MediaType contentType();

    public abstract d source();

    public final String string() throws IOException {
        d source = source();
        try {
            String I = source.I(Util.bomAwareCharset(source, charset()));
            $closeResource(null, source);
            return I;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (source != null) {
                    $closeResource(th, source);
                }
                throw th2;
            }
        }
    }

    public static ResponseBody create(@Nullable MediaType mediaType, byte[] bArr) {
        b bVar = new b();
        bVar.m6write(bArr);
        return create(mediaType, bArr.length, bVar);
    }

    public static ResponseBody create(@Nullable MediaType mediaType, e eVar) {
        b bVar = new b();
        bVar.Y(eVar);
        return create(mediaType, eVar.A(), bVar);
    }

    public static ResponseBody create(@Nullable final MediaType mediaType, final long j10, final d dVar) {
        if (dVar != null) {
            return new ResponseBody() { // from class: okhttp3.ResponseBody.1
                @Override // okhttp3.ResponseBody
                public long contentLength() {
                    return j10;
                }

                @Override // okhttp3.ResponseBody
                @Nullable
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.ResponseBody
                public d source() {
                    return dVar;
                }
            };
        }
        throw new NullPointerException("source == null");
    }
}
