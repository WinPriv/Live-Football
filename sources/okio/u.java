package okio;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: RealBufferedSource.java */
/* loaded from: classes2.dex */
public final class u implements d {

    /* renamed from: s, reason: collision with root package name */
    public final b f33873s = new b();

    /* renamed from: t, reason: collision with root package name */
    public final z f33874t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f33875u;

    public u(z zVar) {
        if (zVar != null) {
            this.f33874t = zVar;
            return;
        }
        throw new NullPointerException("source == null");
    }

    @Override // okio.d
    public final long A() throws IOException {
        b bVar;
        byte f;
        T(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            boolean L = L(i11);
            bVar = this.f33873s;
            if (!L) {
                break;
            }
            f = bVar.f(i10);
            if ((f < 48 || f > 57) && !(i10 == 0 && f == 45)) {
                break;
            }
            i10 = i11;
        }
        if (i10 == 0) {
            throw new NumberFormatException(String.format("Expected leading [0-9] or '-' character but was %#x", Byte.valueOf(f)));
        }
        return bVar.A();
    }

    @Override // okio.d
    public final String B(long j10) throws IOException {
        long j11;
        if (j10 >= 0) {
            if (j10 == Long.MAX_VALUE) {
                j11 = Long.MAX_VALUE;
            } else {
                j11 = j10 + 1;
            }
            long b10 = b(0L, j11, (byte) 10);
            b bVar = this.f33873s;
            if (b10 != -1) {
                return bVar.P(b10);
            }
            if (j11 < Long.MAX_VALUE && L(j11) && bVar.f(j11 - 1) == 13 && L(1 + j11) && bVar.f(j11) == 10) {
                return bVar.P(j11);
            }
            b bVar2 = new b();
            bVar.e(0L, bVar2, Math.min(32L, bVar.f33824t));
            throw new EOFException("\\n not found: limit=" + Math.min(bVar.f33824t, j10) + " content=" + bVar2.j().r() + (char) 8230);
        }
        throw new IllegalArgumentException(a3.k.k("limit < 0: ", j10));
    }

    @Override // okio.d
    public final long D(b bVar) throws IOException {
        b bVar2;
        long j10 = 0;
        while (true) {
            z zVar = this.f33874t;
            bVar2 = this.f33873s;
            if (zVar.read(bVar2, 8192L) == -1) {
                break;
            }
            long d10 = bVar2.d();
            if (d10 > 0) {
                j10 += d10;
                bVar.write(bVar2, d10);
            }
        }
        long j11 = bVar2.f33824t;
        if (j11 > 0) {
            long j12 = j10 + j11;
            bVar.write(bVar2, j11);
            return j12;
        }
        return j10;
    }

    @Override // okio.d
    public final String I(Charset charset) throws IOException {
        if (charset != null) {
            z zVar = this.f33874t;
            b bVar = this.f33873s;
            bVar.J(zVar);
            return bVar.I(charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    @Override // okio.d
    public final boolean L(long j10) throws IOException {
        b bVar;
        if (j10 >= 0) {
            if (this.f33875u) {
                throw new IllegalStateException("closed");
            }
            do {
                bVar = this.f33873s;
                if (bVar.f33824t >= j10) {
                    return true;
                }
            } while (this.f33874t.read(bVar, 8192L) != -1);
            return false;
        }
        throw new IllegalArgumentException(a3.k.k("byteCount < 0: ", j10));
    }

    @Override // okio.d
    public final String M() throws IOException {
        return B(Long.MAX_VALUE);
    }

    @Override // okio.d
    public final byte[] N(long j10) throws IOException {
        T(j10);
        return this.f33873s.N(j10);
    }

    @Override // okio.d
    public final void T(long j10) throws IOException {
        if (L(j10)) {
        } else {
            throw new EOFException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        if (r1 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        throw new java.lang.NumberFormatException(java.lang.String.format("Expected leading [0-9a-fA-F] character but was %#x", java.lang.Byte.valueOf(r3)));
     */
    @Override // okio.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long V() throws java.io.IOException {
        /*
            r7 = this;
            r0 = 1
            r7.T(r0)
            r0 = 0
            r1 = r0
        L7:
            int r2 = r1 + 1
            long r3 = (long) r2
            boolean r3 = r7.L(r3)
            okio.b r4 = r7.f33873s
            if (r3 == 0) goto L4a
            long r5 = (long) r1
            byte r3 = r4.f(r5)
            r5 = 48
            if (r3 < r5) goto L1f
            r5 = 57
            if (r3 <= r5) goto L30
        L1f:
            r5 = 97
            if (r3 < r5) goto L27
            r5 = 102(0x66, float:1.43E-43)
            if (r3 <= r5) goto L30
        L27:
            r5 = 65
            if (r3 < r5) goto L32
            r5 = 70
            if (r3 <= r5) goto L30
            goto L32
        L30:
            r1 = r2
            goto L7
        L32:
            if (r1 == 0) goto L35
            goto L4a
        L35:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r2[r0] = r3
            java.lang.String r0 = "Expected leading [0-9a-fA-F] character but was %#x"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L4a:
            long r0 = r4.V()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.u.V():long");
    }

    @Override // okio.d
    public final int W(r rVar) throws IOException {
        b bVar;
        if (this.f33875u) {
            throw new IllegalStateException("closed");
        }
        do {
            bVar = this.f33873s;
            int Q = bVar.Q(rVar, true);
            if (Q == -1) {
                return -1;
            }
            if (Q != -2) {
                bVar.skip(rVar.f33862s[Q].A());
                return Q;
            }
        } while (this.f33874t.read(bVar, 8192L) != -1);
        return -1;
    }

    @Override // okio.d
    public final e a(long j10) throws IOException {
        T(j10);
        return this.f33873s.a(j10);
    }

    public final long b(long j10, long j11, byte b10) throws IOException {
        if (!this.f33875u) {
            long j12 = 0;
            if (j11 >= 0) {
                while (j12 < j11) {
                    long g6 = this.f33873s.g(j12, j11, b10);
                    if (g6 != -1) {
                        return g6;
                    }
                    b bVar = this.f33873s;
                    long j13 = bVar.f33824t;
                    if (j13 >= j11 || this.f33874t.read(bVar, 8192L) == -1) {
                        break;
                    }
                    j12 = Math.max(j12, j13);
                }
                return -1L;
            }
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", 0L, Long.valueOf(j11)));
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.z, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f33875u) {
            return;
        }
        this.f33875u = true;
        this.f33874t.close();
        this.f33873s.b();
    }

    @Override // okio.d
    public final InputStream inputStream() {
        return new a();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f33875u;
    }

    @Override // okio.d, okio.c
    public final b n() {
        return this.f33873s;
    }

    @Override // okio.d
    public final u peek() {
        return new u(new s(this));
    }

    @Override // okio.d
    public final byte[] r() throws IOException {
        z zVar = this.f33874t;
        b bVar = this.f33873s;
        bVar.J(zVar);
        return bVar.r();
    }

    @Override // okio.z
    public final long read(b bVar, long j10) throws IOException {
        if (bVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j10 >= 0) {
            if (!this.f33875u) {
                b bVar2 = this.f33873s;
                if (bVar2.f33824t == 0 && this.f33874t.read(bVar2, 8192L) == -1) {
                    return -1L;
                }
                return bVar2.read(bVar, Math.min(j10, bVar2.f33824t));
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(a3.k.k("byteCount < 0: ", j10));
    }

    @Override // okio.d
    public final byte readByte() throws IOException {
        T(1L);
        return this.f33873s.readByte();
    }

    @Override // okio.d
    public final void readFully(byte[] bArr) throws IOException {
        b bVar = this.f33873s;
        try {
            T(bArr.length);
            bVar.readFully(bArr);
        } catch (EOFException e10) {
            int i10 = 0;
            while (true) {
                long j10 = bVar.f33824t;
                if (j10 > 0) {
                    int read = bVar.read(bArr, i10, (int) j10);
                    if (read != -1) {
                        i10 += read;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e10;
                }
            }
        }
    }

    @Override // okio.d
    public final int readInt() throws IOException {
        T(4L);
        return this.f33873s.readInt();
    }

    @Override // okio.d
    public final long readLong() throws IOException {
        T(8L);
        return this.f33873s.readLong();
    }

    @Override // okio.d
    public final short readShort() throws IOException {
        T(2L);
        return this.f33873s.readShort();
    }

    @Override // okio.d
    public final void skip(long j10) throws IOException {
        if (!this.f33875u) {
            while (j10 > 0) {
                b bVar = this.f33873s;
                if (bVar.f33824t == 0 && this.f33874t.read(bVar, 8192L) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j10, bVar.f33824t);
                bVar.skip(min);
                j10 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.d
    public final b t() {
        return this.f33873s;
    }

    @Override // okio.z
    public final a0 timeout() {
        return this.f33874t.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f33874t + ")";
    }

    @Override // okio.d
    public final boolean u() throws IOException {
        if (!this.f33875u) {
            b bVar = this.f33873s;
            if (bVar.u() && this.f33874t.read(bVar, 8192L) == -1) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.d
    public final void w(b bVar, long j10) throws IOException {
        b bVar2 = this.f33873s;
        try {
            T(j10);
            bVar2.w(bVar, j10);
        } catch (EOFException e10) {
            bVar.J(bVar2);
            throw e10;
        }
    }

    @Override // okio.d
    public final long y(e eVar) throws IOException {
        if (!this.f33875u) {
            long j10 = 0;
            while (true) {
                b bVar = this.f33873s;
                long h10 = bVar.h(eVar, j10);
                if (h10 == -1) {
                    long j11 = bVar.f33824t;
                    if (this.f33874t.read(bVar, 8192L) == -1) {
                        return -1L;
                    }
                    j10 = Math.max(j10, j11);
                } else {
                    return h10;
                }
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }

    /* compiled from: RealBufferedSource.java */
    /* loaded from: classes2.dex */
    public class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public final int available() throws IOException {
            u uVar = u.this;
            if (!uVar.f33875u) {
                return (int) Math.min(uVar.f33873s.f33824t, 2147483647L);
            }
            throw new IOException("closed");
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            u.this.close();
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            u uVar = u.this;
            if (!uVar.f33875u) {
                b bVar = uVar.f33873s;
                if (bVar.f33824t == 0 && uVar.f33874t.read(bVar, 8192L) == -1) {
                    return -1;
                }
                return uVar.f33873s.readByte() & DefaultClassResolver.NAME;
            }
            throw new IOException("closed");
        }

        public final String toString() {
            return u.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i10, int i11) throws IOException {
            u uVar = u.this;
            if (!uVar.f33875u) {
                b0.a(bArr.length, i10, i11);
                b bVar = uVar.f33873s;
                if (bVar.f33824t == 0 && uVar.f33874t.read(bVar, 8192L) == -1) {
                    return -1;
                }
                return uVar.f33873s.read(bArr, i10, i11);
            }
            throw new IOException("closed");
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) throws IOException {
        b bVar = this.f33873s;
        if (bVar.f33824t == 0 && this.f33874t.read(bVar, 8192L) == -1) {
            return -1;
        }
        return bVar.read(byteBuffer);
    }
}
