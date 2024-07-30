package okio;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: Okio.java */
/* loaded from: classes2.dex */
public final class n implements z {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a0 f33858s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InputStream f33859t;

    public n(InputStream inputStream, a0 a0Var) {
        this.f33858s = a0Var;
        this.f33859t = inputStream;
    }

    @Override // okio.z, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f33859t.close();
    }

    @Override // okio.z
    public final long read(b bVar, long j10) throws IOException {
        if (j10 >= 0) {
            if (j10 == 0) {
                return 0L;
            }
            boolean z10 = true;
            try {
                this.f33858s.throwIfReached();
                v X = bVar.X(1);
                int read = this.f33859t.read(X.f33877a, X.f33879c, (int) Math.min(j10, 8192 - X.f33879c));
                if (read == -1) {
                    return -1L;
                }
                X.f33879c += read;
                long j11 = read;
                bVar.f33824t += j11;
                return j11;
            } catch (AssertionError e10) {
                if (e10.getCause() == null || e10.getMessage() == null || !e10.getMessage().contains("getsockname failed")) {
                    z10 = false;
                }
                if (z10) {
                    throw new IOException(e10);
                }
                throw e10;
            }
        }
        throw new IllegalArgumentException(a3.k.k("byteCount < 0: ", j10));
    }

    @Override // okio.z
    public final a0 timeout() {
        return this.f33858s;
    }

    public final String toString() {
        return "source(" + this.f33859t + ")";
    }
}
