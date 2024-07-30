package okio;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* compiled from: Buffer.java */
/* loaded from: classes2.dex */
public final class b implements d, c, Cloneable, ByteChannel {

    /* renamed from: u, reason: collision with root package name */
    public static final byte[] f33822u = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: s, reason: collision with root package name */
    @Nullable
    public v f33823s;

    /* renamed from: t, reason: collision with root package name */
    public long f33824t;

    /* compiled from: Buffer.java */
    /* loaded from: classes2.dex */
    public class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public final int available() {
            return (int) Math.min(b.this.f33824t, 2147483647L);
        }

        @Override // java.io.InputStream
        public final int read() {
            b bVar = b.this;
            if (bVar.f33824t > 0) {
                return bVar.readByte() & DefaultClassResolver.NAME;
            }
            return -1;
        }

        public final String toString() {
            return b.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i10, int i11) {
            return b.this.read(bArr, i10, i11);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }

    /* compiled from: Buffer.java */
    /* renamed from: okio.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0452b implements Closeable {

        /* renamed from: s, reason: collision with root package name */
        public b f33826s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f33827t;

        /* renamed from: u, reason: collision with root package name */
        public v f33828u;

        /* renamed from: w, reason: collision with root package name */
        public byte[] f33830w;

        /* renamed from: v, reason: collision with root package name */
        public long f33829v = -1;

        /* renamed from: x, reason: collision with root package name */
        public int f33831x = -1;
        public int y = -1;

        public final int b(long j10) {
            if (j10 >= -1) {
                b bVar = this.f33826s;
                long j11 = bVar.f33824t;
                if (j10 <= j11) {
                    if (j10 != -1 && j10 != j11) {
                        v vVar = bVar.f33823s;
                        v vVar2 = this.f33828u;
                        long j12 = 0;
                        if (vVar2 != null) {
                            long j13 = this.f33829v - (this.f33831x - vVar2.f33878b);
                            if (j13 > j10) {
                                j11 = j13;
                            } else {
                                j12 = j13;
                                vVar2 = vVar;
                                vVar = vVar2;
                            }
                        } else {
                            vVar2 = vVar;
                        }
                        if (j11 - j10 > j10 - j12) {
                            while (true) {
                                long j14 = (vVar.f33879c - vVar.f33878b) + j12;
                                if (j10 < j14) {
                                    break;
                                }
                                vVar = vVar.f;
                                j12 = j14;
                            }
                        } else {
                            while (j11 > j10) {
                                vVar2 = vVar2.f33882g;
                                j11 -= vVar2.f33879c - vVar2.f33878b;
                            }
                            vVar = vVar2;
                            j12 = j11;
                        }
                        if (this.f33827t && vVar.f33880d) {
                            v vVar3 = new v((byte[]) vVar.f33877a.clone(), vVar.f33878b, vVar.f33879c, false, true);
                            b bVar2 = this.f33826s;
                            if (bVar2.f33823s == vVar) {
                                bVar2.f33823s = vVar3;
                            }
                            vVar.b(vVar3);
                            vVar3.f33882g.a();
                            vVar = vVar3;
                        }
                        this.f33828u = vVar;
                        this.f33829v = j10;
                        this.f33830w = vVar.f33877a;
                        int i10 = vVar.f33878b + ((int) (j10 - j12));
                        this.f33831x = i10;
                        int i11 = vVar.f33879c;
                        this.y = i11;
                        return i11 - i10;
                    }
                    this.f33828u = null;
                    this.f33829v = j10;
                    this.f33830w = null;
                    this.f33831x = -1;
                    this.y = -1;
                    return -1;
                }
            }
            throw new ArrayIndexOutOfBoundsException(String.format("offset=%s > size=%s", Long.valueOf(j10), Long.valueOf(this.f33826s.f33824t)));
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f33826s != null) {
                this.f33826s = null;
                this.f33828u = null;
                this.f33829v = -1L;
                this.f33830w = null;
                this.f33831x = -1;
                this.y = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009c A[EDGE_INSN: B:46:0x009c->B:40:0x009c BREAK  A[LOOP:0: B:4:0x000f->B:45:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0094  */
    @Override // okio.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long A() {
        /*
            r15 = this;
            long r0 = r15.f33824t
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto La7
            r0 = 0
            r4 = -7
            r1 = r0
            r5 = r4
            r3 = r2
            r2 = r1
        Lf:
            okio.v r7 = r15.f33823s
            byte[] r8 = r7.f33877a
            int r9 = r7.f33878b
            int r10 = r7.f33879c
        L17:
            if (r9 >= r10) goto L88
            r11 = r8[r9]
            r12 = 48
            if (r11 < r12) goto L5c
            r12 = 57
            if (r11 > r12) goto L5c
            int r12 = 48 - r11
            r13 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r13 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r13 < 0) goto L3c
            if (r13 != 0) goto L36
            long r13 = (long) r12
            int r13 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r13 >= 0) goto L36
            goto L3c
        L36:
            r13 = 10
            long r3 = r3 * r13
            long r11 = (long) r12
            long r3 = r3 + r11
            goto L67
        L3c:
            okio.b r0 = new okio.b
            r0.<init>()
            r0.a0(r3)
            r0.Z(r11)
            if (r1 != 0) goto L4c
            r0.readByte()
        L4c:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.l()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L5c:
            r12 = 45
            r13 = 1
            if (r11 != r12) goto L6c
            if (r0 != 0) goto L6c
            r11 = 1
            long r5 = r5 - r11
            r1 = r13
        L67:
            int r9 = r9 + 1
            int r0 = r0 + 1
            goto L17
        L6c:
            if (r0 == 0) goto L70
            r2 = r13
            goto L88
        L70:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected leading [0-9] or '-' character but was 0x"
            r1.<init>(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r11)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L88:
            if (r9 != r10) goto L94
            okio.v r8 = r7.a()
            r15.f33823s = r8
            okio.w.a(r7)
            goto L96
        L94:
            r7.f33878b = r9
        L96:
            if (r2 != 0) goto L9c
            okio.v r7 = r15.f33823s
            if (r7 != 0) goto Lf
        L9c:
            long r5 = r15.f33824t
            long r7 = (long) r0
            long r5 = r5 - r7
            r15.f33824t = r5
            if (r1 == 0) goto La5
            goto La6
        La5:
            long r3 = -r3
        La6:
            return r3
        La7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.b.A():long");
    }

    @Override // okio.d
    public final String B(long j10) throws EOFException {
        if (j10 >= 0) {
            long j11 = Long.MAX_VALUE;
            if (j10 != Long.MAX_VALUE) {
                j11 = j10 + 1;
            }
            long g6 = g(0L, j11, (byte) 10);
            if (g6 != -1) {
                return P(g6);
            }
            if (j11 < this.f33824t && f(j11 - 1) == 13 && f(j11) == 10) {
                return P(j11);
            }
            b bVar = new b();
            e(0L, bVar, Math.min(32L, this.f33824t));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f33824t, j10) + " content=" + bVar.j().r() + (char) 8230);
        }
        throw new IllegalArgumentException(a3.k.k("limit < 0: ", j10));
    }

    @Override // okio.d
    public final long D(b bVar) throws IOException {
        long j10 = this.f33824t;
        if (j10 > 0) {
            bVar.write(this, j10);
        }
        return j10;
    }

    @Override // okio.c
    public final c G(String str) throws IOException {
        g0(0, str.length(), str);
        return this;
    }

    @Override // okio.d
    public final String I(Charset charset) {
        try {
            return k(this.f33824t, charset);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // okio.c
    public final long J(z zVar) throws IOException {
        if (zVar != null) {
            long j10 = 0;
            while (true) {
                long read = zVar.read(this, 8192L);
                if (read != -1) {
                    j10 += read;
                } else {
                    return j10;
                }
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    @Override // okio.c
    public final /* bridge */ /* synthetic */ c K(long j10) throws IOException {
        b0(j10);
        return this;
    }

    @Override // okio.d
    public final boolean L(long j10) {
        if (this.f33824t >= j10) {
            return true;
        }
        return false;
    }

    @Override // okio.d
    public final String M() throws EOFException {
        return B(Long.MAX_VALUE);
    }

    @Override // okio.d
    public final byte[] N(long j10) throws EOFException {
        b0.a(this.f33824t, 0L, j10);
        if (j10 <= 2147483647L) {
            byte[] bArr = new byte[(int) j10];
            readFully(bArr);
            return bArr;
        }
        throw new IllegalArgumentException(a3.k.k("byteCount > Integer.MAX_VALUE: ", j10));
    }

    @Override // okio.c
    public final /* bridge */ /* synthetic */ c O(e eVar) throws IOException {
        Y(eVar);
        return this;
    }

    public final String P(long j10) throws EOFException {
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (f(j11) == 13) {
                String m10 = m(j11);
                skip(2L);
                return m10;
            }
        }
        String m11 = m(j10);
        skip(1L);
        return m11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0055, code lost:
    
        if (r19 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0057, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0058, code lost:
    
        return r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int Q(okio.r r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 161
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.b.Q(okio.r, boolean):int");
    }

    public final e S() {
        long j10 = this.f33824t;
        if (j10 <= 2147483647L) {
            int i10 = (int) j10;
            if (i10 == 0) {
                return e.f33834w;
            }
            return new x(this, i10);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f33824t);
    }

    @Override // okio.d
    public final void T(long j10) throws EOFException {
        if (this.f33824t >= j10) {
        } else {
            throw new EOFException();
        }
    }

    @Override // okio.c
    public final /* bridge */ /* synthetic */ c U(long j10) throws IOException {
        a0(j10);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0094 A[EDGE_INSN: B:41:0x0094->B:38:0x0094 BREAK  A[LOOP:0: B:4:0x000b->B:40:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008c  */
    @Override // okio.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long V() {
        /*
            r14 = this;
            long r0 = r14.f33824t
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L9b
            r0 = 0
            r1 = r0
            r4 = r2
        Lb:
            okio.v r6 = r14.f33823s
            byte[] r7 = r6.f33877a
            int r8 = r6.f33878b
            int r9 = r6.f33879c
        L13:
            if (r8 >= r9) goto L80
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L22
            r11 = 57
            if (r10 > r11) goto L22
            int r11 = r10 + (-48)
            goto L39
        L22:
            r11 = 97
            if (r10 < r11) goto L2d
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L2d
            int r11 = r10 + (-97)
            goto L37
        L2d:
            r11 = 65
            if (r10 < r11) goto L64
            r11 = 70
            if (r10 > r11) goto L64
            int r11 = r10 + (-65)
        L37:
            int r11 = r11 + 10
        L39:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L49
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L13
        L49:
            okio.b r0 = new okio.b
            r0.<init>()
            r0.b0(r4)
            r0.Z(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.l()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L64:
            if (r0 == 0) goto L68
            r1 = 1
            goto L80
        L68:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.<init>(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L80:
            if (r8 != r9) goto L8c
            okio.v r7 = r6.a()
            r14.f33823s = r7
            okio.w.a(r6)
            goto L8e
        L8c:
            r6.f33878b = r8
        L8e:
            if (r1 != 0) goto L94
            okio.v r6 = r14.f33823s
            if (r6 != 0) goto Lb
        L94:
            long r1 = r14.f33824t
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.f33824t = r1
            return r4
        L9b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.b.V():long");
    }

    @Override // okio.d
    public final int W(r rVar) {
        int Q = Q(rVar, false);
        if (Q == -1) {
            return -1;
        }
        try {
            skip(rVar.f33862s[Q].A());
            return Q;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    public final v X(int i10) {
        if (i10 >= 1 && i10 <= 8192) {
            v vVar = this.f33823s;
            if (vVar == null) {
                v b10 = w.b();
                this.f33823s = b10;
                b10.f33882g = b10;
                b10.f = b10;
                return b10;
            }
            v vVar2 = vVar.f33882g;
            if (vVar2.f33879c + i10 > 8192 || !vVar2.f33881e) {
                v b11 = w.b();
                vVar2.b(b11);
                return b11;
            }
            return vVar2;
        }
        throw new IllegalArgumentException();
    }

    public final void Y(e eVar) {
        if (eVar != null) {
            eVar.H(this);
            return;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    public final void Z(int i10) {
        v X = X(1);
        int i11 = X.f33879c;
        X.f33879c = i11 + 1;
        X.f33877a[i11] = (byte) i10;
        this.f33824t++;
    }

    @Override // okio.d
    public final e a(long j10) throws EOFException {
        return new e(N(j10));
    }

    public final b a0(long j10) {
        byte[] bArr;
        if (j10 == 0) {
            Z(48);
            return this;
        }
        int i10 = 1;
        boolean z10 = false;
        if (j10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                g0(0, 20, "-9223372036854775808");
                return this;
            }
            z10 = true;
        }
        if (j10 < 100000000) {
            if (j10 < 10000) {
                if (j10 < 100) {
                    if (j10 >= 10) {
                        i10 = 2;
                    }
                } else if (j10 < 1000) {
                    i10 = 3;
                } else {
                    i10 = 4;
                }
            } else if (j10 < 1000000) {
                if (j10 < 100000) {
                    i10 = 5;
                } else {
                    i10 = 6;
                }
            } else if (j10 < 10000000) {
                i10 = 7;
            } else {
                i10 = 8;
            }
        } else if (j10 < 1000000000000L) {
            if (j10 < 10000000000L) {
                if (j10 < com.anythink.expressad.exoplayer.b.f7300h) {
                    i10 = 9;
                } else {
                    i10 = 10;
                }
            } else if (j10 < 100000000000L) {
                i10 = 11;
            } else {
                i10 = 12;
            }
        } else if (j10 < 1000000000000000L) {
            if (j10 < 10000000000000L) {
                i10 = 13;
            } else if (j10 < 100000000000000L) {
                i10 = 14;
            } else {
                i10 = 15;
            }
        } else if (j10 < 100000000000000000L) {
            if (j10 < 10000000000000000L) {
                i10 = 16;
            } else {
                i10 = 17;
            }
        } else if (j10 < 1000000000000000000L) {
            i10 = 18;
        } else {
            i10 = 19;
        }
        if (z10) {
            i10++;
        }
        v X = X(i10);
        int i11 = X.f33879c + i10;
        while (true) {
            bArr = X.f33877a;
            if (j10 == 0) {
                break;
            }
            i11--;
            bArr[i11] = f33822u[(int) (j10 % 10)];
            j10 /= 10;
        }
        if (z10) {
            bArr[i11 - 1] = 45;
        }
        X.f33879c += i10;
        this.f33824t += i10;
        return this;
    }

    public final void b() {
        try {
            skip(this.f33824t);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    public final b b0(long j10) {
        if (j10 == 0) {
            Z(48);
            return this;
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j10)) / 4) + 1;
        v X = X(numberOfTrailingZeros);
        int i10 = X.f33879c;
        int i11 = i10 + numberOfTrailingZeros;
        while (true) {
            i11--;
            if (i11 >= i10) {
                X.f33877a[i11] = f33822u[(int) (15 & j10)];
                j10 >>>= 4;
            } else {
                X.f33879c += numberOfTrailingZeros;
                this.f33824t += numberOfTrailingZeros;
                return this;
            }
        }
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final b clone() {
        b bVar = new b();
        if (this.f33824t == 0) {
            return bVar;
        }
        v c10 = this.f33823s.c();
        bVar.f33823s = c10;
        c10.f33882g = c10;
        c10.f = c10;
        v vVar = this.f33823s;
        while (true) {
            vVar = vVar.f;
            if (vVar != this.f33823s) {
                bVar.f33823s.f33882g.b(vVar.c());
            } else {
                bVar.f33824t = this.f33824t;
                return bVar;
            }
        }
    }

    public final void c0(int i10) {
        v X = X(4);
        int i11 = X.f33879c;
        int i12 = i11 + 1;
        byte b10 = (byte) ((i10 >>> 24) & com.anythink.expressad.exoplayer.k.p.f9095b);
        byte[] bArr = X.f33877a;
        bArr[i11] = b10;
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i10 >>> 16) & com.anythink.expressad.exoplayer.k.p.f9095b);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((i10 >>> 8) & com.anythink.expressad.exoplayer.k.p.f9095b);
        bArr[i14] = (byte) (i10 & com.anythink.expressad.exoplayer.k.p.f9095b);
        X.f33879c = i14 + 1;
        this.f33824t += 4;
    }

    public final long d() {
        long j10 = this.f33824t;
        if (j10 == 0) {
            return 0L;
        }
        v vVar = this.f33823s.f33882g;
        if (vVar.f33879c < 8192 && vVar.f33881e) {
            return j10 - (r3 - vVar.f33878b);
        }
        return j10;
    }

    public final void d0(long j10) {
        v X = X(8);
        int i10 = X.f33879c;
        int i11 = i10 + 1;
        byte[] bArr = X.f33877a;
        bArr[i10] = (byte) ((j10 >>> 56) & 255);
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((j10 >>> 48) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((j10 >>> 40) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((j10 >>> 32) & 255);
        int i15 = i14 + 1;
        bArr[i14] = (byte) ((j10 >>> 24) & 255);
        int i16 = i15 + 1;
        bArr[i15] = (byte) ((j10 >>> 16) & 255);
        int i17 = i16 + 1;
        bArr[i16] = (byte) ((j10 >>> 8) & 255);
        bArr[i17] = (byte) (j10 & 255);
        X.f33879c = i17 + 1;
        this.f33824t += 8;
    }

    public final void e(long j10, b bVar, long j11) {
        if (bVar != null) {
            b0.a(this.f33824t, j10, j11);
            if (j11 == 0) {
                return;
            }
            bVar.f33824t += j11;
            v vVar = this.f33823s;
            while (true) {
                long j12 = vVar.f33879c - vVar.f33878b;
                if (j10 < j12) {
                    break;
                }
                j10 -= j12;
                vVar = vVar.f;
            }
            while (j11 > 0) {
                v c10 = vVar.c();
                int i10 = (int) (c10.f33878b + j10);
                c10.f33878b = i10;
                c10.f33879c = Math.min(i10 + ((int) j11), c10.f33879c);
                v vVar2 = bVar.f33823s;
                if (vVar2 == null) {
                    c10.f33882g = c10;
                    c10.f = c10;
                    bVar.f33823s = c10;
                } else {
                    vVar2.f33882g.b(c10);
                }
                j11 -= c10.f33879c - c10.f33878b;
                vVar = vVar.f;
                j10 = 0;
            }
            return;
        }
        throw new IllegalArgumentException("out == null");
    }

    public final void e0(int i10) {
        v X = X(2);
        int i11 = X.f33879c;
        int i12 = i11 + 1;
        byte b10 = (byte) ((i10 >>> 8) & com.anythink.expressad.exoplayer.k.p.f9095b);
        byte[] bArr = X.f33877a;
        bArr[i11] = b10;
        bArr[i12] = (byte) (i10 & com.anythink.expressad.exoplayer.k.p.f9095b);
        X.f33879c = i12 + 1;
        this.f33824t += 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        long j10 = this.f33824t;
        if (j10 != bVar.f33824t) {
            return false;
        }
        long j11 = 0;
        if (j10 == 0) {
            return true;
        }
        v vVar = this.f33823s;
        v vVar2 = bVar.f33823s;
        int i10 = vVar.f33878b;
        int i11 = vVar2.f33878b;
        while (j11 < this.f33824t) {
            long min = Math.min(vVar.f33879c - i10, vVar2.f33879c - i11);
            int i12 = 0;
            while (i12 < min) {
                int i13 = i10 + 1;
                int i14 = i11 + 1;
                if (vVar.f33877a[i10] != vVar2.f33877a[i11]) {
                    return false;
                }
                i12++;
                i10 = i13;
                i11 = i14;
            }
            if (i10 == vVar.f33879c) {
                vVar = vVar.f;
                i10 = vVar.f33878b;
            }
            if (i11 == vVar2.f33879c) {
                vVar2 = vVar2.f;
                i11 = vVar2.f33878b;
            }
            j11 += min;
        }
        return true;
    }

    public final byte f(long j10) {
        int i10;
        b0.a(this.f33824t, j10, 1L);
        long j11 = this.f33824t;
        if (j11 - j10 > j10) {
            v vVar = this.f33823s;
            while (true) {
                int i11 = vVar.f33879c;
                int i12 = vVar.f33878b;
                long j12 = i11 - i12;
                if (j10 < j12) {
                    return vVar.f33877a[i12 + ((int) j10)];
                }
                j10 -= j12;
                vVar = vVar.f;
            }
        } else {
            long j13 = j10 - j11;
            v vVar2 = this.f33823s;
            do {
                vVar2 = vVar2.f33882g;
                int i13 = vVar2.f33879c;
                i10 = vVar2.f33878b;
                j13 += i13 - i10;
            } while (j13 < 0);
            return vVar2.f33877a[i10 + ((int) j13)];
        }
    }

    public final b f0(String str, int i10, int i11, Charset charset) {
        if (str != null) {
            if (i10 >= 0) {
                if (i11 >= i10) {
                    if (i11 <= str.length()) {
                        if (charset != null) {
                            if (charset.equals(b0.f33832a)) {
                                g0(i10, i11, str);
                                return this;
                            }
                            byte[] bytes = str.substring(i10, i11).getBytes(charset);
                            m7write(bytes, 0, bytes.length);
                            return this;
                        }
                        throw new IllegalArgumentException("charset == null");
                    }
                    StringBuilder n10 = a3.k.n("endIndex > string.length: ", i11, " > ");
                    n10.append(str.length());
                    throw new IllegalArgumentException(n10.toString());
                }
                throw new IllegalArgumentException(a3.k.j("endIndex < beginIndex: ", i11, " < ", i10));
            }
            throw new IllegalAccessError(a3.l.i("beginIndex < 0: ", i10));
        }
        throw new IllegalArgumentException("string == null");
    }

    public final long g(long j10, long j11, byte b10) {
        long j12;
        v vVar;
        long j13 = 0;
        if (j10 >= 0 && j11 >= j10) {
            long j14 = this.f33824t;
            if (j11 > j14) {
                j12 = j14;
            } else {
                j12 = j11;
            }
            if (j10 == j12 || (vVar = this.f33823s) == null) {
                return -1L;
            }
            if (j14 - j10 < j10) {
                while (j14 > j10) {
                    vVar = vVar.f33882g;
                    j14 -= vVar.f33879c - vVar.f33878b;
                }
            } else {
                while (true) {
                    long j15 = (vVar.f33879c - vVar.f33878b) + j13;
                    if (j15 >= j10) {
                        break;
                    }
                    vVar = vVar.f;
                    j13 = j15;
                }
                j14 = j13;
            }
            long j16 = j10;
            while (j14 < j12) {
                byte[] bArr = vVar.f33877a;
                int min = (int) Math.min(vVar.f33879c, (vVar.f33878b + j12) - j14);
                for (int i10 = (int) ((vVar.f33878b + j16) - j14); i10 < min; i10++) {
                    if (bArr[i10] == b10) {
                        return (i10 - vVar.f33878b) + j14;
                    }
                }
                j14 += vVar.f33879c - vVar.f33878b;
                vVar = vVar.f;
                j16 = j14;
            }
            return -1L;
        }
        throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.f33824t), Long.valueOf(j10), Long.valueOf(j11)));
    }

    public final void g0(int i10, int i11, String str) {
        char charAt;
        char c10;
        if (str != null) {
            if (i10 >= 0) {
                if (i11 >= i10) {
                    if (i11 <= str.length()) {
                        while (i10 < i11) {
                            char charAt2 = str.charAt(i10);
                            if (charAt2 < 128) {
                                v X = X(1);
                                int i12 = X.f33879c - i10;
                                int min = Math.min(i11, 8192 - i12);
                                int i13 = i10 + 1;
                                byte[] bArr = X.f33877a;
                                bArr[i10 + i12] = (byte) charAt2;
                                while (true) {
                                    i10 = i13;
                                    if (i10 >= min || (charAt = str.charAt(i10)) >= 128) {
                                        break;
                                    }
                                    i13 = i10 + 1;
                                    bArr[i10 + i12] = (byte) charAt;
                                }
                                int i14 = X.f33879c;
                                int i15 = (i12 + i10) - i14;
                                X.f33879c = i14 + i15;
                                this.f33824t += i15;
                            } else {
                                if (charAt2 < 2048) {
                                    Z((charAt2 >> 6) | 192);
                                    Z((charAt2 & '?') | 128);
                                } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                                    int i16 = i10 + 1;
                                    if (i16 < i11) {
                                        c10 = str.charAt(i16);
                                    } else {
                                        c10 = 0;
                                    }
                                    if (charAt2 <= 56319 && c10 >= 56320 && c10 <= 57343) {
                                        int i17 = (((charAt2 & 10239) << 10) | (9215 & c10)) + com.anythink.expressad.exoplayer.b.aX;
                                        Z((i17 >> 18) | 240);
                                        Z(((i17 >> 12) & 63) | 128);
                                        Z(((i17 >> 6) & 63) | 128);
                                        Z((i17 & 63) | 128);
                                        i10 += 2;
                                    } else {
                                        Z(63);
                                        i10 = i16;
                                    }
                                } else {
                                    Z((charAt2 >> '\f') | 224);
                                    Z(((charAt2 >> 6) & 63) | 128);
                                    Z((charAt2 & '?') | 128);
                                }
                                i10++;
                            }
                        }
                        return;
                    }
                    StringBuilder n10 = a3.k.n("endIndex > string.length: ", i11, " > ");
                    n10.append(str.length());
                    throw new IllegalArgumentException(n10.toString());
                }
                throw new IllegalArgumentException(a3.k.j("endIndex < beginIndex: ", i11, " < ", i10));
            }
            throw new IllegalArgumentException(a3.l.i("beginIndex < 0: ", i10));
        }
        throw new IllegalArgumentException("string == null");
    }

    public final long h(e eVar, long j10) {
        int i10;
        int i11;
        long j11 = 0;
        if (j10 >= 0) {
            v vVar = this.f33823s;
            if (vVar == null) {
                return -1L;
            }
            long j12 = this.f33824t;
            if (j12 - j10 < j10) {
                while (j12 > j10) {
                    vVar = vVar.f33882g;
                    j12 -= vVar.f33879c - vVar.f33878b;
                }
            } else {
                while (true) {
                    long j13 = (vVar.f33879c - vVar.f33878b) + j11;
                    if (j13 >= j10) {
                        break;
                    }
                    vVar = vVar.f;
                    j11 = j13;
                }
                j12 = j11;
            }
            if (eVar.A() == 2) {
                byte q10 = eVar.q(0);
                byte q11 = eVar.q(1);
                while (j12 < this.f33824t) {
                    byte[] bArr = vVar.f33877a;
                    i10 = (int) ((vVar.f33878b + j10) - j12);
                    int i12 = vVar.f33879c;
                    while (i10 < i12) {
                        byte b10 = bArr[i10];
                        if (b10 != q10 && b10 != q11) {
                            i10++;
                        } else {
                            i11 = vVar.f33878b;
                            return (i10 - i11) + j12;
                        }
                    }
                    j12 += vVar.f33879c - vVar.f33878b;
                    vVar = vVar.f;
                    j10 = j12;
                }
                return -1L;
            }
            byte[] u2 = eVar.u();
            while (j12 < this.f33824t) {
                byte[] bArr2 = vVar.f33877a;
                i10 = (int) ((vVar.f33878b + j10) - j12);
                int i13 = vVar.f33879c;
                while (i10 < i13) {
                    byte b11 = bArr2[i10];
                    for (byte b12 : u2) {
                        if (b11 == b12) {
                            i11 = vVar.f33878b;
                            return (i10 - i11) + j12;
                        }
                    }
                    i10++;
                }
                j12 += vVar.f33879c - vVar.f33878b;
                vVar = vVar.f;
                j10 = j12;
            }
            return -1L;
        }
        throw new IllegalArgumentException("fromIndex < 0");
    }

    public final void h0(int i10) {
        if (i10 < 128) {
            Z(i10);
            return;
        }
        if (i10 < 2048) {
            Z((i10 >> 6) | 192);
            Z((i10 & 63) | 128);
            return;
        }
        if (i10 < 65536) {
            if (i10 >= 55296 && i10 <= 57343) {
                Z(63);
                return;
            }
            Z((i10 >> 12) | 224);
            Z(((i10 >> 6) & 63) | 128);
            Z((i10 & 63) | 128);
            return;
        }
        if (i10 <= 1114111) {
            Z((i10 >> 18) | 240);
            Z(((i10 >> 12) & 63) | 128);
            Z(((i10 >> 6) & 63) | 128);
            Z((i10 & 63) | 128);
            return;
        }
        throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i10));
    }

    public final int hashCode() {
        v vVar = this.f33823s;
        if (vVar == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = vVar.f33879c;
            for (int i12 = vVar.f33878b; i12 < i11; i12++) {
                i10 = (i10 * 31) + vVar.f33877a[i12];
            }
            vVar = vVar.f;
        } while (vVar != this.f33823s);
        return i10;
    }

    public final void i(C0452b c0452b) {
        if (c0452b.f33826s == null) {
            c0452b.f33826s = this;
            c0452b.f33827t = true;
            return;
        }
        throw new IllegalStateException("already attached to a buffer");
    }

    @Override // okio.d
    public final InputStream inputStream() {
        return new a();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final e j() {
        return new e(r());
    }

    public final String k(long j10, Charset charset) throws EOFException {
        b0.a(this.f33824t, 0L, j10);
        if (charset != null) {
            if (j10 <= 2147483647L) {
                if (j10 == 0) {
                    return "";
                }
                v vVar = this.f33823s;
                int i10 = vVar.f33878b;
                if (i10 + j10 > vVar.f33879c) {
                    return new String(N(j10), charset);
                }
                String str = new String(vVar.f33877a, i10, (int) j10, charset);
                int i11 = (int) (vVar.f33878b + j10);
                vVar.f33878b = i11;
                this.f33824t -= j10;
                if (i11 == vVar.f33879c) {
                    this.f33823s = vVar.a();
                    w.a(vVar);
                }
                return str;
            }
            throw new IllegalArgumentException(a3.k.k("byteCount > Integer.MAX_VALUE: ", j10));
        }
        throw new IllegalArgumentException("charset == null");
    }

    public final String l() {
        try {
            return k(this.f33824t, b0.f33832a);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    public final String m(long j10) throws EOFException {
        return k(j10, b0.f33832a);
    }

    @Override // okio.d
    public final u peek() {
        s sVar = new s(this);
        Logger logger = q.f33861a;
        return new u(sVar);
    }

    @Override // okio.d
    public final byte[] r() {
        try {
            return N(this.f33824t);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    public final int read(byte[] bArr, int i10, int i11) {
        b0.a(bArr.length, i10, i11);
        v vVar = this.f33823s;
        if (vVar == null) {
            return -1;
        }
        int min = Math.min(i11, vVar.f33879c - vVar.f33878b);
        System.arraycopy(vVar.f33877a, vVar.f33878b, bArr, i10, min);
        int i12 = vVar.f33878b + min;
        vVar.f33878b = i12;
        this.f33824t -= min;
        if (i12 == vVar.f33879c) {
            this.f33823s = vVar.a();
            w.a(vVar);
        }
        return min;
    }

    @Override // okio.d
    public final byte readByte() {
        long j10 = this.f33824t;
        if (j10 != 0) {
            v vVar = this.f33823s;
            int i10 = vVar.f33878b;
            int i11 = vVar.f33879c;
            int i12 = i10 + 1;
            byte b10 = vVar.f33877a[i10];
            this.f33824t = j10 - 1;
            if (i12 == i11) {
                this.f33823s = vVar.a();
                w.a(vVar);
            } else {
                vVar.f33878b = i12;
            }
            return b10;
        }
        throw new IllegalStateException("size == 0");
    }

    @Override // okio.d
    public final void readFully(byte[] bArr) throws EOFException {
        int i10 = 0;
        while (i10 < bArr.length) {
            int read = read(bArr, i10, bArr.length - i10);
            if (read != -1) {
                i10 += read;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // okio.d
    public final int readInt() {
        long j10 = this.f33824t;
        if (j10 >= 4) {
            v vVar = this.f33823s;
            int i10 = vVar.f33878b;
            int i11 = vVar.f33879c;
            if (i11 - i10 < 4) {
                return ((readByte() & DefaultClassResolver.NAME) << 24) | ((readByte() & DefaultClassResolver.NAME) << 16) | ((readByte() & DefaultClassResolver.NAME) << 8) | (readByte() & DefaultClassResolver.NAME);
            }
            int i12 = i10 + 1;
            byte[] bArr = vVar.f33877a;
            int i13 = i12 + 1;
            int i14 = ((bArr[i10] & DefaultClassResolver.NAME) << 24) | ((bArr[i12] & DefaultClassResolver.NAME) << 16);
            int i15 = i13 + 1;
            int i16 = i14 | ((bArr[i13] & DefaultClassResolver.NAME) << 8);
            int i17 = i15 + 1;
            int i18 = i16 | (bArr[i15] & DefaultClassResolver.NAME);
            this.f33824t = j10 - 4;
            if (i17 == i11) {
                this.f33823s = vVar.a();
                w.a(vVar);
            } else {
                vVar.f33878b = i17;
            }
            return i18;
        }
        throw new IllegalStateException("size < 4: " + this.f33824t);
    }

    @Override // okio.d
    public final long readLong() {
        long j10 = this.f33824t;
        if (j10 >= 8) {
            v vVar = this.f33823s;
            int i10 = vVar.f33878b;
            int i11 = vVar.f33879c;
            if (i11 - i10 < 8) {
                return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
            }
            byte[] bArr = vVar.f33877a;
            long j11 = (bArr[i10] & 255) << 56;
            long j12 = ((bArr[r8] & 255) << 48) | j11;
            long j13 = j12 | ((bArr[r6] & 255) << 40);
            long j14 = j13 | ((bArr[r8] & 255) << 32);
            long j15 = j14 | ((bArr[r6] & 255) << 24);
            long j16 = j15 | ((bArr[r8] & 255) << 16);
            long j17 = j16 | ((bArr[r6] & 255) << 8);
            int i12 = i10 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1;
            long j18 = j17 | (bArr[r8] & 255);
            this.f33824t = j10 - 8;
            if (i12 == i11) {
                this.f33823s = vVar.a();
                w.a(vVar);
            } else {
                vVar.f33878b = i12;
            }
            return j18;
        }
        throw new IllegalStateException("size < 8: " + this.f33824t);
    }

    @Override // okio.d
    public final short readShort() {
        long j10 = this.f33824t;
        if (j10 >= 2) {
            v vVar = this.f33823s;
            int i10 = vVar.f33878b;
            int i11 = vVar.f33879c;
            if (i11 - i10 < 2) {
                return (short) (((readByte() & DefaultClassResolver.NAME) << 8) | (readByte() & DefaultClassResolver.NAME));
            }
            int i12 = i10 + 1;
            byte[] bArr = vVar.f33877a;
            int i13 = i12 + 1;
            int i14 = ((bArr[i10] & DefaultClassResolver.NAME) << 8) | (bArr[i12] & DefaultClassResolver.NAME);
            this.f33824t = j10 - 2;
            if (i13 == i11) {
                this.f33823s = vVar.a();
                w.a(vVar);
            } else {
                vVar.f33878b = i13;
            }
            return (short) i14;
        }
        throw new IllegalStateException("size < 2: " + this.f33824t);
    }

    @Override // okio.d
    public final void skip(long j10) throws EOFException {
        while (j10 > 0) {
            if (this.f33823s != null) {
                int min = (int) Math.min(j10, r0.f33879c - r0.f33878b);
                long j11 = min;
                this.f33824t -= j11;
                j10 -= j11;
                v vVar = this.f33823s;
                int i10 = vVar.f33878b + min;
                vVar.f33878b = i10;
                if (i10 == vVar.f33879c) {
                    this.f33823s = vVar.a();
                    w.a(vVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // okio.z
    public final a0 timeout() {
        return a0.NONE;
    }

    public final String toString() {
        return S().toString();
    }

    @Override // okio.d
    public final boolean u() {
        if (this.f33824t == 0) {
            return true;
        }
        return false;
    }

    @Override // okio.d
    public final void w(b bVar, long j10) throws EOFException {
        long j11 = this.f33824t;
        if (j11 >= j10) {
            bVar.write(this, j10);
        } else {
            bVar.write(this, j11);
            throw new EOFException();
        }
    }

    @Override // okio.c
    public final /* bridge */ /* synthetic */ c write(byte[] bArr) throws IOException {
        m6write(bArr);
        return this;
    }

    @Override // okio.c
    public final /* bridge */ /* synthetic */ c writeByte(int i10) throws IOException {
        Z(i10);
        return this;
    }

    @Override // okio.c
    public final /* bridge */ /* synthetic */ c writeInt(int i10) throws IOException {
        c0(i10);
        return this;
    }

    @Override // okio.c
    public final /* bridge */ /* synthetic */ c writeShort(int i10) throws IOException {
        e0(i10);
        return this;
    }

    @Override // okio.d
    public final long y(e eVar) {
        return h(eVar, 0L);
    }

    @Override // okio.c
    public final /* bridge */ /* synthetic */ c write(byte[] bArr, int i10, int i11) throws IOException {
        m7write(bArr, i10, i11);
        return this;
    }

    /* renamed from: write, reason: collision with other method in class */
    public final void m6write(byte[] bArr) {
        if (bArr != null) {
            m7write(bArr, 0, bArr.length);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: write, reason: collision with other method in class */
    public final void m7write(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            long j10 = i11;
            b0.a(bArr.length, i10, j10);
            int i12 = i11 + i10;
            while (i10 < i12) {
                v X = X(1);
                int min = Math.min(i12 - i10, 8192 - X.f33879c);
                System.arraycopy(bArr, i10, X.f33877a, X.f33879c, min);
                i10 += min;
                X.f33879c += min;
            }
            this.f33824t += j10;
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) throws IOException {
        v vVar = this.f33823s;
        if (vVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), vVar.f33879c - vVar.f33878b);
        byteBuffer.put(vVar.f33877a, vVar.f33878b, min);
        int i10 = vVar.f33878b + min;
        vVar.f33878b = i10;
        this.f33824t -= min;
        if (i10 == vVar.f33879c) {
            this.f33823s = vVar.a();
            w.a(vVar);
        }
        return min;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i10 = remaining;
            while (i10 > 0) {
                v X = X(1);
                int min = Math.min(i10, 8192 - X.f33879c);
                byteBuffer.get(X.f33877a, X.f33879c, min);
                i10 -= min;
                X.f33879c += min;
            }
            this.f33824t += remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // okio.z
    public final long read(b bVar, long j10) {
        if (bVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j10 >= 0) {
            long j11 = this.f33824t;
            if (j11 == 0) {
                return -1L;
            }
            if (j10 > j11) {
                j10 = j11;
            }
            bVar.write(this, j10);
            return j10;
        }
        throw new IllegalArgumentException(a3.k.k("byteCount < 0: ", j10));
    }

    @Override // okio.y
    public final void write(b bVar, long j10) {
        v b10;
        if (bVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (bVar != this) {
            b0.a(bVar.f33824t, 0L, j10);
            while (j10 > 0) {
                v vVar = bVar.f33823s;
                int i10 = vVar.f33879c - vVar.f33878b;
                if (j10 < i10) {
                    v vVar2 = this.f33823s;
                    v vVar3 = vVar2 != null ? vVar2.f33882g : null;
                    if (vVar3 != null && vVar3.f33881e) {
                        if ((vVar3.f33879c + j10) - (vVar3.f33880d ? 0 : vVar3.f33878b) <= 8192) {
                            vVar.d(vVar3, (int) j10);
                            bVar.f33824t -= j10;
                            this.f33824t += j10;
                            return;
                        }
                    }
                    int i11 = (int) j10;
                    if (i11 > 0 && i11 <= i10) {
                        if (i11 >= 1024) {
                            b10 = vVar.c();
                        } else {
                            b10 = w.b();
                            System.arraycopy(vVar.f33877a, vVar.f33878b, b10.f33877a, 0, i11);
                        }
                        b10.f33879c = b10.f33878b + i11;
                        vVar.f33878b += i11;
                        vVar.f33882g.b(b10);
                        bVar.f33823s = b10;
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                v vVar4 = bVar.f33823s;
                long j11 = vVar4.f33879c - vVar4.f33878b;
                bVar.f33823s = vVar4.a();
                v vVar5 = this.f33823s;
                if (vVar5 == null) {
                    this.f33823s = vVar4;
                    vVar4.f33882g = vVar4;
                    vVar4.f = vVar4;
                } else {
                    vVar5.f33882g.b(vVar4);
                    v vVar6 = vVar4.f33882g;
                    if (vVar6 != vVar4) {
                        if (vVar6.f33881e) {
                            int i12 = vVar4.f33879c - vVar4.f33878b;
                            if (i12 <= (8192 - vVar6.f33879c) + (vVar6.f33880d ? 0 : vVar6.f33878b)) {
                                vVar4.d(vVar6, i12);
                                vVar4.a();
                                w.a(vVar4);
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
                bVar.f33824t -= j11;
                this.f33824t += j11;
                j10 -= j11;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    @Override // okio.z, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // okio.c, okio.y, java.io.Flushable
    public final void flush() {
    }

    @Override // okio.d, okio.c
    public final b n() {
        return this;
    }

    @Override // okio.c
    public final c q() {
        return this;
    }

    @Override // okio.d
    public final b t() {
        return this;
    }

    @Override // okio.c
    public final c z() throws IOException {
        return this;
    }
}
