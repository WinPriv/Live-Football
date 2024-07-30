package okio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: RealBufferedSink.java */
/* loaded from: classes2.dex */
public final class t implements c {

    /* renamed from: s, reason: collision with root package name */
    public final b f33870s = new b();

    /* renamed from: t, reason: collision with root package name */
    public final y f33871t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f33872u;

    public t(y yVar) {
        if (yVar != null) {
            this.f33871t = yVar;
            return;
        }
        throw new NullPointerException("sink == null");
    }

    @Override // okio.c
    public final c G(String str) throws IOException {
        if (!this.f33872u) {
            b bVar = this.f33870s;
            bVar.getClass();
            bVar.g0(0, str.length(), str);
            z();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.c
    public final long J(z zVar) throws IOException {
        long j10 = 0;
        while (true) {
            long read = ((n) zVar).read(this.f33870s, 8192L);
            if (read != -1) {
                j10 += read;
                z();
            } else {
                return j10;
            }
        }
    }

    @Override // okio.c
    public final c K(long j10) throws IOException {
        if (!this.f33872u) {
            this.f33870s.b0(j10);
            z();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.c
    public final c O(e eVar) throws IOException {
        if (!this.f33872u) {
            this.f33870s.Y(eVar);
            z();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.c
    public final c U(long j10) throws IOException {
        if (!this.f33872u) {
            this.f33870s.a0(j10);
            z();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        y yVar = this.f33871t;
        if (this.f33872u) {
            return;
        }
        try {
            b bVar = this.f33870s;
            long j10 = bVar.f33824t;
            if (j10 > 0) {
                yVar.write(bVar, j10);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            yVar.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f33872u = true;
        if (th == null) {
            return;
        }
        Charset charset = b0.f33832a;
        throw th;
    }

    @Override // okio.c, okio.y, java.io.Flushable
    public final void flush() throws IOException {
        if (!this.f33872u) {
            b bVar = this.f33870s;
            long j10 = bVar.f33824t;
            y yVar = this.f33871t;
            if (j10 > 0) {
                yVar.write(bVar, j10);
            }
            yVar.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f33872u;
    }

    @Override // okio.c
    public final b n() {
        return this.f33870s;
    }

    @Override // okio.c
    public final c q() throws IOException {
        if (!this.f33872u) {
            b bVar = this.f33870s;
            long j10 = bVar.f33824t;
            if (j10 > 0) {
                this.f33871t.write(bVar, j10);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.y
    public final a0 timeout() {
        return this.f33871t.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f33871t + ")";
    }

    @Override // okio.y
    public final void write(b bVar, long j10) throws IOException {
        if (!this.f33872u) {
            this.f33870s.write(bVar, j10);
            z();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.c
    public final c writeByte(int i10) throws IOException {
        if (!this.f33872u) {
            this.f33870s.Z(i10);
            z();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.c
    public final c writeInt(int i10) throws IOException {
        if (!this.f33872u) {
            this.f33870s.c0(i10);
            z();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.c
    public final c writeShort(int i10) throws IOException {
        if (!this.f33872u) {
            this.f33870s.e0(i10);
            z();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.c
    public final c z() throws IOException {
        if (!this.f33872u) {
            b bVar = this.f33870s;
            long d10 = bVar.d();
            if (d10 > 0) {
                this.f33871t.write(bVar, d10);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.c
    public final c write(byte[] bArr) throws IOException {
        if (!this.f33872u) {
            this.f33870s.m6write(bArr);
            z();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.c
    public final c write(byte[] bArr, int i10, int i11) throws IOException {
        if (!this.f33872u) {
            this.f33870s.m7write(bArr, i10, i11);
            z();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) throws IOException {
        if (!this.f33872u) {
            int write = this.f33870s.write(byteBuffer);
            z();
            return write;
        }
        throw new IllegalStateException("closed");
    }
}
