package okio;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.logging.Logger;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* compiled from: GzipSink.java */
/* loaded from: classes2.dex */
public final class j implements y {

    /* renamed from: s, reason: collision with root package name */
    public final t f33842s;

    /* renamed from: t, reason: collision with root package name */
    public final Deflater f33843t;

    /* renamed from: u, reason: collision with root package name */
    public final f f33844u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f33845v;

    /* renamed from: w, reason: collision with root package name */
    public final CRC32 f33846w = new CRC32();

    public j(b bVar) {
        Deflater deflater = new Deflater(-1, true);
        this.f33843t = deflater;
        Logger logger = q.f33861a;
        t tVar = new t(bVar);
        this.f33842s = tVar;
        this.f33844u = new f(tVar, deflater);
        b bVar2 = tVar.f33870s;
        bVar2.e0(8075);
        bVar2.Z(8);
        bVar2.Z(0);
        bVar2.c0(0);
        bVar2.Z(0);
        bVar2.Z(0);
    }

    @Override // okio.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int value;
        Deflater deflater = this.f33843t;
        t tVar = this.f33842s;
        if (this.f33845v) {
            return;
        }
        try {
            f fVar = this.f33844u;
            fVar.f33839t.finish();
            fVar.b(false);
            value = (int) this.f33846w.getValue();
        } catch (Throwable th) {
            th = th;
        }
        if (!tVar.f33872u) {
            b bVar = tVar.f33870s;
            bVar.getClass();
            Charset charset = b0.f33832a;
            bVar.c0(((value & com.anythink.expressad.exoplayer.k.p.f9095b) << 24) | ((value & (-16777216)) >>> 24) | ((value & 16711680) >>> 8) | ((value & 65280) << 8));
            tVar.z();
            int bytesRead = (int) deflater.getBytesRead();
            if (!tVar.f33872u) {
                b bVar2 = tVar.f33870s;
                bVar2.getClass();
                bVar2.c0(((bytesRead & com.anythink.expressad.exoplayer.k.p.f9095b) << 24) | ((bytesRead & (-16777216)) >>> 24) | ((bytesRead & 16711680) >>> 8) | ((bytesRead & 65280) << 8));
                tVar.z();
                th = null;
                try {
                    deflater.end();
                } catch (Throwable th2) {
                    if (th == null) {
                        th = th2;
                    }
                }
                try {
                    tVar.close();
                } catch (Throwable th3) {
                    if (th == null) {
                        th = th3;
                    }
                }
                this.f33845v = true;
                if (th == null) {
                    return;
                }
                Charset charset2 = b0.f33832a;
                throw th;
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.y, java.io.Flushable
    public final void flush() throws IOException {
        this.f33844u.flush();
    }

    @Override // okio.y
    public final a0 timeout() {
        return this.f33842s.timeout();
    }

    @Override // okio.y
    public final void write(b bVar, long j10) throws IOException {
        if (j10 >= 0) {
            if (j10 == 0) {
                return;
            }
            v vVar = bVar.f33823s;
            long j11 = j10;
            while (j11 > 0) {
                int min = (int) Math.min(j11, vVar.f33879c - vVar.f33878b);
                this.f33846w.update(vVar.f33877a, vVar.f33878b, min);
                j11 -= min;
                vVar = vVar.f;
            }
            this.f33844u.write(bVar, j10);
            return;
        }
        throw new IllegalArgumentException(a3.k.k("byteCount < 0: ", j10));
    }
}
