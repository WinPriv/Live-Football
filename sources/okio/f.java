package okio;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.zip.Deflater;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: DeflaterSink.java */
/* loaded from: classes2.dex */
public final class f implements y {

    /* renamed from: s, reason: collision with root package name */
    public final c f33838s;

    /* renamed from: t, reason: collision with root package name */
    public final Deflater f33839t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f33840u;

    public f(t tVar, Deflater deflater) {
        this.f33838s = tVar;
        this.f33839t = deflater;
    }

    @IgnoreJRERequirement
    public final void b(boolean z10) throws IOException {
        v X;
        int deflate;
        c cVar = this.f33838s;
        b n10 = cVar.n();
        while (true) {
            X = n10.X(1);
            Deflater deflater = this.f33839t;
            byte[] bArr = X.f33877a;
            if (z10) {
                int i10 = X.f33879c;
                deflate = deflater.deflate(bArr, i10, 8192 - i10, 2);
            } else {
                int i11 = X.f33879c;
                deflate = deflater.deflate(bArr, i11, 8192 - i11);
            }
            if (deflate > 0) {
                X.f33879c += deflate;
                n10.f33824t += deflate;
                cVar.z();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (X.f33878b == X.f33879c) {
            n10.f33823s = X.a();
            w.a(X);
        }
    }

    @Override // okio.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Deflater deflater = this.f33839t;
        if (this.f33840u) {
            return;
        }
        try {
            deflater.finish();
            b(false);
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            deflater.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.f33838s.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f33840u = true;
        if (th == null) {
            return;
        }
        Charset charset = b0.f33832a;
        throw th;
    }

    @Override // okio.y, java.io.Flushable
    public final void flush() throws IOException {
        b(true);
        this.f33838s.flush();
    }

    @Override // okio.y
    public final a0 timeout() {
        return this.f33838s.timeout();
    }

    public final String toString() {
        return "DeflaterSink(" + this.f33838s + ")";
    }

    @Override // okio.y
    public final void write(b bVar, long j10) throws IOException {
        b0.a(bVar.f33824t, 0L, j10);
        while (j10 > 0) {
            v vVar = bVar.f33823s;
            int min = (int) Math.min(j10, vVar.f33879c - vVar.f33878b);
            this.f33839t.setInput(vVar.f33877a, vVar.f33878b, min);
            b(false);
            long j11 = min;
            bVar.f33824t -= j11;
            int i10 = vVar.f33878b + min;
            vVar.f33878b = i10;
            if (i10 == vVar.f33879c) {
                bVar.f33823s = vVar.a();
                w.a(vVar);
            }
            j10 -= j11;
        }
    }
}
