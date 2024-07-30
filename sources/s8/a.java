package s8;

import a3.l;
import c5.e;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: JsonReader.java */
/* loaded from: classes2.dex */
public class a implements Closeable {
    public long A;
    public int B;
    public String C;
    public int[] D;
    public String[] F;
    public int[] G;

    /* renamed from: s, reason: collision with root package name */
    public final Reader f35266s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f35267t = false;

    /* renamed from: u, reason: collision with root package name */
    public final char[] f35268u = new char[1024];

    /* renamed from: v, reason: collision with root package name */
    public int f35269v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f35270w = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f35271x = 0;
    public int y = 0;

    /* renamed from: z, reason: collision with root package name */
    public int f35272z = 0;
    public int E = 0 + 1;

    /* compiled from: JsonReader.java */
    /* renamed from: s8.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0479a extends e {
    }

    static {
        e.f3285u = new C0479a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.D = iArr;
        iArr[0] = 6;
        this.F = new String[32];
        this.G = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f35266s = reader;
    }

    public final String P() {
        StringBuilder r10 = l.r(" at line ", this.f35271x + 1, " column ", (this.f35269v - this.y) + 1, " path ");
        r10.append(i());
        return r10.toString();
    }

    public boolean Q() throws IOException {
        int i10 = this.f35272z;
        if (i10 == 0) {
            i10 = e();
        }
        if (i10 == 5) {
            this.f35272z = 0;
            int[] iArr = this.G;
            int i11 = this.E - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        }
        if (i10 == 6) {
            this.f35272z = 0;
            int[] iArr2 = this.G;
            int i12 = this.E - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + com.ironsource.adapters.facebook.a.z(f0()) + P());
    }

    public double S() throws IOException {
        char c10;
        int i10 = this.f35272z;
        if (i10 == 0) {
            i10 = e();
        }
        if (i10 == 15) {
            this.f35272z = 0;
            int[] iArr = this.G;
            int i11 = this.E - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.A;
        }
        if (i10 == 16) {
            this.C = new String(this.f35268u, this.f35269v, this.B);
            this.f35269v += this.B;
        } else if (i10 != 8 && i10 != 9) {
            if (i10 == 10) {
                this.C = e0();
            } else if (i10 != 11) {
                throw new IllegalStateException("Expected a double but was " + com.ironsource.adapters.facebook.a.z(f0()) + P());
            }
        } else {
            if (i10 == 8) {
                c10 = '\'';
            } else {
                c10 = '\"';
            }
            this.C = c0(c10);
        }
        this.f35272z = 11;
        double parseDouble = Double.parseDouble(this.C);
        if (!this.f35267t && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new c("JSON forbids NaN and infinities: " + parseDouble + P());
        }
        this.C = null;
        this.f35272z = 0;
        int[] iArr2 = this.G;
        int i12 = this.E - 1;
        iArr2[i12] = iArr2[i12] + 1;
        return parseDouble;
    }

    public int X() throws IOException {
        char c10;
        int i10 = this.f35272z;
        if (i10 == 0) {
            i10 = e();
        }
        if (i10 == 15) {
            long j10 = this.A;
            int i11 = (int) j10;
            if (j10 == i11) {
                this.f35272z = 0;
                int[] iArr = this.G;
                int i12 = this.E - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new NumberFormatException("Expected an int but was " + this.A + P());
        }
        if (i10 == 16) {
            this.C = new String(this.f35268u, this.f35269v, this.B);
            this.f35269v += this.B;
        } else {
            if (i10 != 8 && i10 != 9 && i10 != 10) {
                throw new IllegalStateException("Expected an int but was " + com.ironsource.adapters.facebook.a.z(f0()) + P());
            }
            if (i10 == 10) {
                this.C = e0();
            } else {
                if (i10 == 8) {
                    c10 = '\'';
                } else {
                    c10 = '\"';
                }
                this.C = c0(c10);
            }
            try {
                int parseInt = Integer.parseInt(this.C);
                this.f35272z = 0;
                int[] iArr2 = this.G;
                int i13 = this.E - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f35272z = 11;
        double parseDouble = Double.parseDouble(this.C);
        int i14 = (int) parseDouble;
        if (i14 == parseDouble) {
            this.C = null;
            this.f35272z = 0;
            int[] iArr3 = this.G;
            int i15 = this.E - 1;
            iArr3[i15] = iArr3[i15] + 1;
            return i14;
        }
        throw new NumberFormatException("Expected an int but was " + this.C + P());
    }

    public long Y() throws IOException {
        char c10;
        int i10 = this.f35272z;
        if (i10 == 0) {
            i10 = e();
        }
        if (i10 == 15) {
            this.f35272z = 0;
            int[] iArr = this.G;
            int i11 = this.E - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.A;
        }
        if (i10 == 16) {
            this.C = new String(this.f35268u, this.f35269v, this.B);
            this.f35269v += this.B;
        } else {
            if (i10 != 8 && i10 != 9 && i10 != 10) {
                throw new IllegalStateException("Expected a long but was " + com.ironsource.adapters.facebook.a.z(f0()) + P());
            }
            if (i10 == 10) {
                this.C = e0();
            } else {
                if (i10 == 8) {
                    c10 = '\'';
                } else {
                    c10 = '\"';
                }
                this.C = c0(c10);
            }
            try {
                long parseLong = Long.parseLong(this.C);
                this.f35272z = 0;
                int[] iArr2 = this.G;
                int i12 = this.E - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f35272z = 11;
        double parseDouble = Double.parseDouble(this.C);
        long j10 = (long) parseDouble;
        if (j10 == parseDouble) {
            this.C = null;
            this.f35272z = 0;
            int[] iArr3 = this.G;
            int i13 = this.E - 1;
            iArr3[i13] = iArr3[i13] + 1;
            return j10;
        }
        throw new NumberFormatException("Expected a long but was " + this.C + P());
    }

    public String Z() throws IOException {
        String c02;
        int i10 = this.f35272z;
        if (i10 == 0) {
            i10 = e();
        }
        if (i10 == 14) {
            c02 = e0();
        } else if (i10 == 12) {
            c02 = c0('\'');
        } else if (i10 == 13) {
            c02 = c0('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + com.ironsource.adapters.facebook.a.z(f0()) + P());
        }
        this.f35272z = 0;
        this.F[this.E - 1] = c02;
        return c02;
    }

    public final int a0(boolean z10) throws IOException {
        int i10 = this.f35269v;
        int i11 = this.f35270w;
        while (true) {
            boolean z11 = true;
            if (i10 == i11) {
                this.f35269v = i10;
                if (!h(1)) {
                    if (!z10) {
                        return -1;
                    }
                    throw new EOFException("End of input" + P());
                }
                i10 = this.f35269v;
                i11 = this.f35270w;
            }
            int i12 = i10 + 1;
            char[] cArr = this.f35268u;
            char c10 = cArr[i10];
            if (c10 == '\n') {
                this.f35271x++;
                this.y = i12;
            } else if (c10 != ' ' && c10 != '\r' && c10 != '\t') {
                if (c10 == '/') {
                    this.f35269v = i12;
                    if (i12 == i11) {
                        this.f35269v = i12 - 1;
                        boolean h10 = h(2);
                        this.f35269v++;
                        if (!h10) {
                            return c10;
                        }
                    }
                    d();
                    int i13 = this.f35269v;
                    char c11 = cArr[i13];
                    if (c11 != '*') {
                        if (c11 != '/') {
                            return c10;
                        }
                        this.f35269v = i13 + 1;
                        j0();
                        i10 = this.f35269v;
                        i11 = this.f35270w;
                    } else {
                        this.f35269v = i13 + 1;
                        while (true) {
                            if (this.f35269v + 2 > this.f35270w && !h(2)) {
                                z11 = false;
                                break;
                            }
                            int i14 = this.f35269v;
                            if (cArr[i14] == '\n') {
                                this.f35271x++;
                                this.y = i14 + 1;
                            } else {
                                for (int i15 = 0; i15 < 2; i15++) {
                                    if (cArr[this.f35269v + i15] != "*/".charAt(i15)) {
                                        break;
                                    }
                                }
                                break;
                            }
                            this.f35269v++;
                        }
                        if (z11) {
                            i10 = this.f35269v + 2;
                            i11 = this.f35270w;
                        } else {
                            m0("Unterminated comment");
                            throw null;
                        }
                    }
                } else if (c10 == '#') {
                    this.f35269v = i12;
                    d();
                    j0();
                    i10 = this.f35269v;
                    i11 = this.f35270w;
                } else {
                    this.f35269v = i12;
                    return c10;
                }
            }
            i10 = i12;
        }
    }

    public void b() throws IOException {
        int i10 = this.f35272z;
        if (i10 == 0) {
            i10 = e();
        }
        if (i10 == 3) {
            g0(1);
            this.G[this.E - 1] = 0;
            this.f35272z = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + com.ironsource.adapters.facebook.a.z(f0()) + P());
        }
    }

    public void b0() throws IOException {
        int i10 = this.f35272z;
        if (i10 == 0) {
            i10 = e();
        }
        if (i10 == 7) {
            this.f35272z = 0;
            int[] iArr = this.G;
            int i11 = this.E - 1;
            iArr[i11] = iArr[i11] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + com.ironsource.adapters.facebook.a.z(f0()) + P());
    }

    public void c() throws IOException {
        int i10 = this.f35272z;
        if (i10 == 0) {
            i10 = e();
        }
        if (i10 == 1) {
            g0(3);
            this.f35272z = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + com.ironsource.adapters.facebook.a.z(f0()) + P());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        r10.f35269v = r8;
        r8 = (r8 - r2) - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        if (r1 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r8 + 1) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005e, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r4 - r2) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006c, code lost:
    
        r1.append(r7, r2, r4 - r2);
        r10.f35269v = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String c0(char r11) throws java.io.IOException {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r10.f35269v
            int r3 = r10.f35270w
        L6:
            r4 = r2
        L7:
            r5 = 1
            r6 = 16
            char[] r7 = r10.f35268u
            if (r4 >= r3) goto L5c
            int r8 = r4 + 1
            char r4 = r7[r4]
            if (r4 != r11) goto L28
            r10.f35269v = r8
            int r8 = r8 - r2
            int r8 = r8 - r5
            if (r1 != 0) goto L20
            java.lang.String r11 = new java.lang.String
            r11.<init>(r7, r2, r8)
            return r11
        L20:
            r1.append(r7, r2, r8)
            java.lang.String r11 = r1.toString()
            return r11
        L28:
            r9 = 92
            if (r4 != r9) goto L4f
            r10.f35269v = r8
            int r8 = r8 - r2
            int r8 = r8 - r5
            if (r1 != 0) goto L40
            int r1 = r8 + 1
            int r1 = r1 * 2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r6)
            r3.<init>(r1)
            r1 = r3
        L40:
            r1.append(r7, r2, r8)
            char r2 = r10.h0()
            r1.append(r2)
            int r2 = r10.f35269v
            int r3 = r10.f35270w
            goto L6
        L4f:
            r6 = 10
            if (r4 != r6) goto L5a
            int r4 = r10.f35271x
            int r4 = r4 + r5
            r10.f35271x = r4
            r10.y = r8
        L5a:
            r4 = r8
            goto L7
        L5c:
            if (r1 != 0) goto L6c
            int r1 = r4 - r2
            int r1 = r1 * 2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r6)
            r3.<init>(r1)
            r1 = r3
        L6c:
            int r3 = r4 - r2
            r1.append(r7, r2, r3)
            r10.f35269v = r4
            boolean r2 = r10.h(r5)
            if (r2 == 0) goto L7a
            goto L2
        L7a:
            java.lang.String r11 = "Unterminated string"
            r10.m0(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s8.a.c0(char):java.lang.String");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f35272z = 0;
        this.D[0] = 8;
        this.E = 1;
        this.f35266s.close();
    }

    public final void d() throws IOException {
        if (this.f35267t) {
            return;
        }
        m0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    public String d0() throws IOException {
        String str;
        int i10 = this.f35272z;
        if (i10 == 0) {
            i10 = e();
        }
        if (i10 == 10) {
            str = e0();
        } else if (i10 == 8) {
            str = c0('\'');
        } else if (i10 == 9) {
            str = c0('\"');
        } else if (i10 == 11) {
            str = this.C;
            this.C = null;
        } else if (i10 == 15) {
            str = Long.toString(this.A);
        } else if (i10 == 16) {
            str = new String(this.f35268u, this.f35269v, this.B);
            this.f35269v += this.B;
        } else {
            throw new IllegalStateException("Expected a string but was " + com.ironsource.adapters.facebook.a.z(f0()) + P());
        }
        this.f35272z = 0;
        int[] iArr = this.G;
        int i11 = this.E - 1;
        iArr[i11] = iArr[i11] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0208, code lost:
    
        if (m(r1) != false) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x020a, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x020b, code lost:
    
        if (r5 != 2) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x020d, code lost:
    
        if (r13 == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0213, code lost:
    
        if (r7 != Long.MIN_VALUE) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0215, code lost:
    
        if (r12 == 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x021b, code lost:
    
        if (r7 != 0) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x021d, code lost:
    
        if (r12 != 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x021f, code lost:
    
        if (r12 == 0) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0222, code lost:
    
        r7 = -r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0223, code lost:
    
        r19.A = r7;
        r19.f35269v += r11;
        r7 = 15;
        r19.f35272z = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x022f, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0230, code lost:
    
        if (r5 == r1) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0233, code lost:
    
        if (r5 == 4) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0236, code lost:
    
        if (r5 != 7) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0238, code lost:
    
        r19.B = r11;
        r7 = 16;
        r19.f35272z = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0179 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0272 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int e() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 805
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s8.a.e():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x004a, code lost:
    
        d();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String e0() throws java.io.IOException {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r7.f35269v
            int r4 = r3 + r2
            int r5 = r7.f35270w
            char[] r6 = r7.f35268u
            if (r4 >= r5) goto L4e
            int r3 = r3 + r2
            char r3 = r6[r3]
            r4 = 9
            if (r3 == r4) goto L5a
            r4 = 10
            if (r3 == r4) goto L5a
            r4 = 12
            if (r3 == r4) goto L5a
            r4 = 13
            if (r3 == r4) goto L5a
            r4 = 32
            if (r3 == r4) goto L5a
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5a
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5a
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5a
            r4 = 58
            if (r3 == r4) goto L5a
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5a;
                case 92: goto L4a;
                case 93: goto L5a;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r7.d()
            goto L5a
        L4e:
            int r3 = r6.length
            if (r2 >= r3) goto L5c
            int r3 = r2 + 1
            boolean r3 = r7.h(r3)
            if (r3 == 0) goto L5a
            goto L3
        L5a:
            r1 = r2
            goto L7a
        L5c:
            if (r0 != 0) goto L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L69:
            int r3 = r7.f35269v
            r0.append(r6, r3, r2)
            int r3 = r7.f35269v
            int r3 = r3 + r2
            r7.f35269v = r3
            r2 = 1
            boolean r2 = r7.h(r2)
            if (r2 != 0) goto L2
        L7a:
            if (r0 != 0) goto L84
            java.lang.String r0 = new java.lang.String
            int r2 = r7.f35269v
            r0.<init>(r6, r2, r1)
            goto L8d
        L84:
            int r2 = r7.f35269v
            r0.append(r6, r2, r1)
            java.lang.String r0 = r0.toString()
        L8d:
            int r2 = r7.f35269v
            int r2 = r2 + r1
            r7.f35269v = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s8.a.e0():java.lang.String");
    }

    public void f() throws IOException {
        int i10 = this.f35272z;
        if (i10 == 0) {
            i10 = e();
        }
        if (i10 == 4) {
            int i11 = this.E - 1;
            this.E = i11;
            int[] iArr = this.G;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            this.f35272z = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + com.ironsource.adapters.facebook.a.z(f0()) + P());
    }

    public int f0() throws IOException {
        int i10 = this.f35272z;
        if (i10 == 0) {
            i10 = e();
        }
        switch (i10) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public void g() throws IOException {
        int i10 = this.f35272z;
        if (i10 == 0) {
            i10 = e();
        }
        if (i10 == 2) {
            int i11 = this.E - 1;
            this.E = i11;
            this.F[i11] = null;
            int[] iArr = this.G;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            this.f35272z = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + com.ironsource.adapters.facebook.a.z(f0()) + P());
    }

    public final void g0(int i10) {
        int i11 = this.E;
        int[] iArr = this.D;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.D = Arrays.copyOf(iArr, i12);
            this.G = Arrays.copyOf(this.G, i12);
            this.F = (String[]) Arrays.copyOf(this.F, i12);
        }
        int[] iArr2 = this.D;
        int i13 = this.E;
        this.E = i13 + 1;
        iArr2[i13] = i10;
    }

    public final boolean h(int i10) throws IOException {
        int i11;
        int i12;
        int i13 = this.y;
        int i14 = this.f35269v;
        this.y = i13 - i14;
        int i15 = this.f35270w;
        char[] cArr = this.f35268u;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f35270w = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f35270w = 0;
        }
        this.f35269v = 0;
        do {
            int i17 = this.f35270w;
            int read = this.f35266s.read(cArr, i17, cArr.length - i17);
            if (read == -1) {
                return false;
            }
            i11 = this.f35270w + read;
            this.f35270w = i11;
            if (this.f35271x == 0 && (i12 = this.y) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f35269v++;
                this.y = i12 + 1;
                i10++;
            }
        } while (i11 < i10);
        return true;
    }

    public final char h0() throws IOException {
        int i10;
        int i11;
        if (this.f35269v == this.f35270w && !h(1)) {
            m0("Unterminated escape sequence");
            throw null;
        }
        int i12 = this.f35269v;
        int i13 = i12 + 1;
        this.f35269v = i13;
        char[] cArr = this.f35268u;
        char c10 = cArr[i12];
        if (c10 != '\n') {
            if (c10 != '\"' && c10 != '\'' && c10 != '/' && c10 != '\\') {
                if (c10 != 'b') {
                    if (c10 != 'f') {
                        if (c10 == 'n') {
                            return '\n';
                        }
                        if (c10 != 'r') {
                            if (c10 != 't') {
                                if (c10 == 'u') {
                                    if (i13 + 4 > this.f35270w && !h(4)) {
                                        m0("Unterminated escape sequence");
                                        throw null;
                                    }
                                    int i14 = this.f35269v;
                                    int i15 = i14 + 4;
                                    char c11 = 0;
                                    while (i14 < i15) {
                                        char c12 = cArr[i14];
                                        char c13 = (char) (c11 << 4);
                                        if (c12 >= '0' && c12 <= '9') {
                                            i11 = c12 - '0';
                                        } else {
                                            if (c12 >= 'a' && c12 <= 'f') {
                                                i10 = c12 - 'a';
                                            } else if (c12 >= 'A' && c12 <= 'F') {
                                                i10 = c12 - 'A';
                                            } else {
                                                throw new NumberFormatException("\\u".concat(new String(cArr, this.f35269v, 4)));
                                            }
                                            i11 = i10 + 10;
                                        }
                                        c11 = (char) (i11 + c13);
                                        i14++;
                                    }
                                    this.f35269v += 4;
                                    return c11;
                                }
                                m0("Invalid escape sequence");
                                throw null;
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\f';
                }
                return '\b';
            }
        } else {
            this.f35271x++;
            this.y = i13;
        }
        return c10;
    }

    public String i() {
        return j(false);
    }

    public final void i0(char c10) throws IOException {
        do {
            int i10 = this.f35269v;
            int i11 = this.f35270w;
            while (i10 < i11) {
                int i12 = i10 + 1;
                char c11 = this.f35268u[i10];
                if (c11 == c10) {
                    this.f35269v = i12;
                    return;
                }
                if (c11 == '\\') {
                    this.f35269v = i12;
                    h0();
                    i10 = this.f35269v;
                    i11 = this.f35270w;
                } else {
                    if (c11 == '\n') {
                        this.f35271x++;
                        this.y = i12;
                    }
                    i10 = i12;
                }
            }
            this.f35269v = i10;
        } while (h(1));
        m0("Unterminated string");
        throw null;
    }

    public final String j(boolean z10) {
        StringBuilder sb2 = new StringBuilder("$");
        int i10 = 0;
        while (true) {
            int i11 = this.E;
            if (i10 < i11) {
                int i12 = this.D[i10];
                if (i12 != 1 && i12 != 2) {
                    if (i12 == 3 || i12 == 4 || i12 == 5) {
                        sb2.append('.');
                        String str = this.F[i10];
                        if (str != null) {
                            sb2.append(str);
                        }
                    }
                } else {
                    int i13 = this.G[i10];
                    if (z10 && i13 > 0 && i10 == i11 - 1) {
                        i13--;
                    }
                    sb2.append('[');
                    sb2.append(i13);
                    sb2.append(']');
                }
                i10++;
            } else {
                return sb2.toString();
            }
        }
    }

    public final void j0() throws IOException {
        char c10;
        do {
            if (this.f35269v < this.f35270w || h(1)) {
                int i10 = this.f35269v;
                int i11 = i10 + 1;
                this.f35269v = i11;
                c10 = this.f35268u[i10];
                if (c10 == '\n') {
                    this.f35271x++;
                    this.y = i11;
                    return;
                }
            } else {
                return;
            }
        } while (c10 != '\r');
    }

    public String k() {
        return j(true);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.RegionMaker.calcSwitchOut(RegionMaker.java:923)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:797)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:740)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:740)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:411)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:201)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:135)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:242)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:135)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public final void k0() throws java.io.IOException {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f35269v
            int r2 = r1 + r0
            int r3 = r4.f35270w
            if (r2 >= r3) goto L51
            char[] r2 = r4.f35268u
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.d()
        L4b:
            int r1 = r4.f35269v
            int r1 = r1 + r0
            r4.f35269v = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f35269v = r1
            r0 = 1
            boolean r0 = r4.h(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s8.a.k0():void");
    }

    public boolean l() throws IOException {
        int i10 = this.f35272z;
        if (i10 == 0) {
            i10 = e();
        }
        if (i10 != 2 && i10 != 4 && i10 != 17) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0011. Please report as an issue. */
    public void l0() throws IOException {
        int i10 = 0;
        do {
            int i11 = this.f35272z;
            if (i11 == 0) {
                i11 = e();
            }
            switch (i11) {
                case 1:
                    g0(3);
                    i10++;
                    this.f35272z = 0;
                    break;
                case 2:
                    if (i10 == 0) {
                        this.F[this.E - 1] = null;
                    }
                    this.E--;
                    i10--;
                    this.f35272z = 0;
                    break;
                case 3:
                    g0(1);
                    i10++;
                    this.f35272z = 0;
                    break;
                case 4:
                    this.E--;
                    i10--;
                    this.f35272z = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f35272z = 0;
                    break;
                case 8:
                    i0('\'');
                    this.f35272z = 0;
                    break;
                case 9:
                    i0('\"');
                    this.f35272z = 0;
                    break;
                case 10:
                    k0();
                    this.f35272z = 0;
                    break;
                case 12:
                    i0('\'');
                    if (i10 == 0) {
                        this.F[this.E - 1] = "<skipped>";
                    }
                    this.f35272z = 0;
                    break;
                case 13:
                    i0('\"');
                    if (i10 == 0) {
                        this.F[this.E - 1] = "<skipped>";
                    }
                    this.f35272z = 0;
                    break;
                case 14:
                    k0();
                    if (i10 == 0) {
                        this.F[this.E - 1] = "<skipped>";
                    }
                    this.f35272z = 0;
                    break;
                case 16:
                    this.f35269v += this.B;
                    this.f35272z = 0;
                    break;
                case 17:
                    return;
            }
        } while (i10 > 0);
        int[] iArr = this.G;
        int i12 = this.E - 1;
        iArr[i12] = iArr[i12] + 1;
    }

    public final boolean m(char c10) throws IOException {
        if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
            if (c10 != '#') {
                if (c10 != ',') {
                    if (c10 != '/' && c10 != '=') {
                        if (c10 != '{' && c10 != '}' && c10 != ':') {
                            if (c10 != ';') {
                                switch (c10) {
                                    case '[':
                                    case ']':
                                        return false;
                                    case '\\':
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
            d();
            return false;
        }
        return false;
    }

    public final void m0(String str) throws IOException {
        StringBuilder j10 = com.ironsource.adapters.facebook.a.j(str);
        j10.append(P());
        throw new c(j10.toString());
    }

    public String toString() {
        return getClass().getSimpleName() + P();
    }
}
