package r2;

import java.io.EOFException;
import java.io.IOException;
import okio.e;
import okio.u;
import r2.c;

/* compiled from: JsonUtf8Reader.java */
/* loaded from: classes.dex */
public final class d extends c {
    public static final e D = e.p("'\\");
    public static final e E = e.p("\"\\");
    public static final e F = e.p("{}[]:, \n\t\r\f/\\;#=");
    public long A;
    public int B;
    public String C;

    /* renamed from: x, reason: collision with root package name */
    public final okio.d f34848x;
    public final okio.b y;

    /* renamed from: z, reason: collision with root package name */
    public int f34849z = 0;

    static {
        e.p("\n\r");
        e.p("*/");
    }

    public d(u uVar) {
        this.f34848x = uVar;
        this.y = uVar.f33873s;
        m(6);
    }

    @Override // r2.c
    public final int P(c.a aVar) throws IOException {
        int i10 = this.f34849z;
        if (i10 == 0) {
            i10 = Z();
        }
        if (i10 < 12 || i10 > 15) {
            return -1;
        }
        if (i10 == 15) {
            return a0(this.C, aVar);
        }
        int W = this.f34848x.W(aVar.f34847b);
        if (W != -1) {
            this.f34849z = 0;
            this.f34844u[this.f34842s - 1] = aVar.f34846a[W];
            return W;
        }
        String str = this.f34844u[this.f34842s - 1];
        String c02 = c0();
        int a02 = a0(c02, aVar);
        if (a02 == -1) {
            this.f34849z = 15;
            this.C = c02;
            this.f34844u[this.f34842s - 1] = str;
        }
        return a02;
    }

    @Override // r2.c
    public final void Q() throws IOException {
        int i10 = this.f34849z;
        if (i10 == 0) {
            i10 = Z();
        }
        if (i10 == 14) {
            long y = this.f34848x.y(F);
            okio.b bVar = this.y;
            if (y == -1) {
                y = bVar.f33824t;
            }
            bVar.skip(y);
        } else if (i10 == 13) {
            h0(E);
        } else if (i10 == 12) {
            h0(D);
        } else if (i10 != 15) {
            throw new a("Expected a name but was " + com.ironsource.adapters.facebook.a.y(l()) + " at path " + f());
        }
        this.f34849z = 0;
        this.f34844u[this.f34842s - 1] = "null";
    }

    @Override // r2.c
    public final void S() throws IOException {
        int i10 = 0;
        do {
            int i11 = this.f34849z;
            if (i11 == 0) {
                i11 = Z();
            }
            if (i11 == 3) {
                m(1);
            } else if (i11 == 1) {
                m(3);
            } else {
                if (i11 == 4) {
                    i10--;
                    if (i10 >= 0) {
                        this.f34842s--;
                    } else {
                        throw new a("Expected a value but was " + com.ironsource.adapters.facebook.a.y(l()) + " at path " + f());
                    }
                } else if (i11 == 2) {
                    i10--;
                    if (i10 >= 0) {
                        this.f34842s--;
                    } else {
                        throw new a("Expected a value but was " + com.ironsource.adapters.facebook.a.y(l()) + " at path " + f());
                    }
                } else {
                    okio.b bVar = this.y;
                    if (i11 != 14 && i11 != 10) {
                        if (i11 != 9 && i11 != 13) {
                            if (i11 != 8 && i11 != 12) {
                                if (i11 == 17) {
                                    bVar.skip(this.B);
                                } else if (i11 == 18) {
                                    throw new a("Expected a value but was " + com.ironsource.adapters.facebook.a.y(l()) + " at path " + f());
                                }
                            } else {
                                h0(D);
                            }
                        } else {
                            h0(E);
                        }
                    } else {
                        long y = this.f34848x.y(F);
                        if (y == -1) {
                            y = bVar.f33824t;
                        }
                        bVar.skip(y);
                    }
                }
                this.f34849z = 0;
            }
            i10++;
            this.f34849z = 0;
        } while (i10 != 0);
        int[] iArr = this.f34845v;
        int i12 = this.f34842s;
        int i13 = i12 - 1;
        iArr[i13] = iArr[i13] + 1;
        this.f34844u[i12 - 1] = "null";
    }

    public final void Y() throws IOException {
        X("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01be, code lost:
    
        if (r4 != 7) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01c0, code lost:
    
        r17.B = r3;
        r8 = 17;
        r17.f34849z = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0193, code lost:
    
        if (b0(r1) != false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0195, code lost:
    
        if (r4 != 2) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0197, code lost:
    
        if (r6 == false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x019d, code lost:
    
        if (r10 != Long.MIN_VALUE) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x019f, code lost:
    
        if (r7 == false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a5, code lost:
    
        if (r10 != 0) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a7, code lost:
    
        if (r7 != false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a9, code lost:
    
        if (r7 == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01ac, code lost:
    
        r10 = -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01ad, code lost:
    
        r17.A = r10;
        r5.skip(r3);
        r8 = 16;
        r17.f34849z = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01b8, code lost:
    
        if (r4 == 2) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01bb, code lost:
    
        if (r4 == 4) goto L149;
     */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0112 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int Z() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.d.Z():int");
    }

    public final int a0(String str, c.a aVar) {
        int length = aVar.f34846a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(aVar.f34846a[i10])) {
                this.f34849z = 0;
                this.f34844u[this.f34842s - 1] = str;
                return i10;
            }
        }
        return -1;
    }

    @Override // r2.c
    public final void b() throws IOException {
        int i10 = this.f34849z;
        if (i10 == 0) {
            i10 = Z();
        }
        if (i10 == 3) {
            m(1);
            this.f34845v[this.f34842s - 1] = 0;
            this.f34849z = 0;
        } else {
            throw new a("Expected BEGIN_ARRAY but was " + com.ironsource.adapters.facebook.a.y(l()) + " at path " + f());
        }
    }

    public final boolean b0(int i10) throws IOException {
        if (i10 != 9 && i10 != 10 && i10 != 12 && i10 != 13 && i10 != 32) {
            if (i10 != 35) {
                if (i10 != 44) {
                    if (i10 != 47 && i10 != 61) {
                        if (i10 != 123 && i10 != 125 && i10 != 58) {
                            if (i10 != 59) {
                                switch (i10) {
                                    case 91:
                                    case 93:
                                        return false;
                                    case 92:
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
            Y();
            throw null;
        }
        return false;
    }

    @Override // r2.c
    public final void c() throws IOException {
        int i10 = this.f34849z;
        if (i10 == 0) {
            i10 = Z();
        }
        if (i10 == 1) {
            m(3);
            this.f34849z = 0;
        } else {
            throw new a("Expected BEGIN_OBJECT but was " + com.ironsource.adapters.facebook.a.y(l()) + " at path " + f());
        }
    }

    public final String c0() throws IOException {
        String str;
        int i10 = this.f34849z;
        if (i10 == 0) {
            i10 = Z();
        }
        if (i10 == 14) {
            str = f0();
        } else if (i10 == 13) {
            str = e0(E);
        } else if (i10 == 12) {
            str = e0(D);
        } else if (i10 == 15) {
            str = this.C;
        } else {
            throw new a("Expected a name but was " + com.ironsource.adapters.facebook.a.y(l()) + " at path " + f());
        }
        this.f34849z = 0;
        this.f34844u[this.f34842s - 1] = str;
        return str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f34849z = 0;
        this.f34843t[0] = 8;
        this.f34842s = 1;
        this.y.b();
        this.f34848x.close();
    }

    @Override // r2.c
    public final void d() throws IOException {
        int i10 = this.f34849z;
        if (i10 == 0) {
            i10 = Z();
        }
        if (i10 == 4) {
            int i11 = this.f34842s - 1;
            this.f34842s = i11;
            int[] iArr = this.f34845v;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            this.f34849z = 0;
            return;
        }
        throw new a("Expected END_ARRAY but was " + com.ironsource.adapters.facebook.a.y(l()) + " at path " + f());
    }

    public final int d0(boolean z10) throws IOException {
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            okio.d dVar = this.f34848x;
            if (dVar.L(i11)) {
                long j10 = i10;
                okio.b bVar = this.y;
                byte f = bVar.f(j10);
                if (f != 10 && f != 32 && f != 13 && f != 9) {
                    bVar.skip(i11 - 1);
                    if (f == 47) {
                        if (!dVar.L(2L)) {
                            return f;
                        }
                        Y();
                        throw null;
                    }
                    if (f != 35) {
                        return f;
                    }
                    Y();
                    throw null;
                }
                i10 = i11;
            } else {
                if (!z10) {
                    return -1;
                }
                throw new EOFException("End of input");
            }
        }
    }

    @Override // r2.c
    public final void e() throws IOException {
        int i10 = this.f34849z;
        if (i10 == 0) {
            i10 = Z();
        }
        if (i10 == 2) {
            int i11 = this.f34842s - 1;
            this.f34842s = i11;
            this.f34844u[i11] = null;
            int[] iArr = this.f34845v;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            this.f34849z = 0;
            return;
        }
        throw new a("Expected END_OBJECT but was " + com.ironsource.adapters.facebook.a.y(l()) + " at path " + f());
    }

    public final String e0(e eVar) throws IOException {
        StringBuilder sb2 = null;
        while (true) {
            long y = this.f34848x.y(eVar);
            if (y != -1) {
                okio.b bVar = this.y;
                if (bVar.f(y) == 92) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder();
                    }
                    sb2.append(bVar.m(y));
                    bVar.readByte();
                    sb2.append(g0());
                } else {
                    if (sb2 == null) {
                        String m10 = bVar.m(y);
                        bVar.readByte();
                        return m10;
                    }
                    sb2.append(bVar.m(y));
                    bVar.readByte();
                    return sb2.toString();
                }
            } else {
                X("Unterminated string");
                throw null;
            }
        }
    }

    public final String f0() throws IOException {
        long y = this.f34848x.y(F);
        okio.b bVar = this.y;
        if (y != -1) {
            return bVar.m(y);
        }
        return bVar.l();
    }

    @Override // r2.c
    public final boolean g() throws IOException {
        int i10 = this.f34849z;
        if (i10 == 0) {
            i10 = Z();
        }
        if (i10 != 2 && i10 != 4 && i10 != 18) {
            return true;
        }
        return false;
    }

    public final char g0() throws IOException {
        int i10;
        int i11;
        okio.d dVar = this.f34848x;
        if (dVar.L(1L)) {
            okio.b bVar = this.y;
            byte readByte = bVar.readByte();
            if (readByte != 10 && readByte != 34 && readByte != 39 && readByte != 47 && readByte != 92) {
                if (readByte != 98) {
                    if (readByte != 102) {
                        if (readByte == 110) {
                            return '\n';
                        }
                        if (readByte != 114) {
                            if (readByte != 116) {
                                if (readByte == 117) {
                                    if (dVar.L(4L)) {
                                        char c10 = 0;
                                        for (int i12 = 0; i12 < 4; i12++) {
                                            byte f = bVar.f(i12);
                                            char c11 = (char) (c10 << 4);
                                            if (f >= 48 && f <= 57) {
                                                i11 = f - 48;
                                            } else {
                                                if (f >= 97 && f <= 102) {
                                                    i10 = f - 97;
                                                } else {
                                                    if (f < 65 || f > 70) {
                                                        X("\\u".concat(bVar.m(4L)));
                                                        throw null;
                                                    }
                                                    i10 = f - 65;
                                                }
                                                i11 = i10 + 10;
                                            }
                                            c10 = (char) (i11 + c11);
                                        }
                                        bVar.skip(4L);
                                        return c10;
                                    }
                                    throw new EOFException("Unterminated escape sequence at path " + f());
                                }
                                X("Invalid escape sequence: \\" + ((char) readByte));
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
            return (char) readByte;
        }
        X("Unterminated escape sequence");
        throw null;
    }

    @Override // r2.c
    public final boolean h() throws IOException {
        int i10 = this.f34849z;
        if (i10 == 0) {
            i10 = Z();
        }
        if (i10 == 5) {
            this.f34849z = 0;
            int[] iArr = this.f34845v;
            int i11 = this.f34842s - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        }
        if (i10 == 6) {
            this.f34849z = 0;
            int[] iArr2 = this.f34845v;
            int i12 = this.f34842s - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        }
        throw new a("Expected a boolean but was " + com.ironsource.adapters.facebook.a.y(l()) + " at path " + f());
    }

    public final void h0(e eVar) throws IOException {
        while (true) {
            long y = this.f34848x.y(eVar);
            if (y != -1) {
                okio.b bVar = this.y;
                if (bVar.f(y) == 92) {
                    bVar.skip(y + 1);
                    g0();
                } else {
                    bVar.skip(y + 1);
                    return;
                }
            } else {
                X("Unterminated string");
                throw null;
            }
        }
    }

    @Override // r2.c
    public final double i() throws IOException {
        int i10 = this.f34849z;
        if (i10 == 0) {
            i10 = Z();
        }
        if (i10 == 16) {
            this.f34849z = 0;
            int[] iArr = this.f34845v;
            int i11 = this.f34842s - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.A;
        }
        if (i10 == 17) {
            this.C = this.y.m(this.B);
        } else if (i10 == 9) {
            this.C = e0(E);
        } else if (i10 == 8) {
            this.C = e0(D);
        } else if (i10 == 10) {
            this.C = f0();
        } else if (i10 != 11) {
            throw new a("Expected a double but was " + com.ironsource.adapters.facebook.a.y(l()) + " at path " + f());
        }
        this.f34849z = 11;
        try {
            double parseDouble = Double.parseDouble(this.C);
            if (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble)) {
                this.C = null;
                this.f34849z = 0;
                int[] iArr2 = this.f34845v;
                int i12 = this.f34842s - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseDouble;
            }
            throw new b("JSON forbids NaN and infinities: " + parseDouble + " at path " + f());
        } catch (NumberFormatException unused) {
            throw new a("Expected a double but was " + this.C + " at path " + f());
        }
    }

    @Override // r2.c
    public final int j() throws IOException {
        String e02;
        int i10 = this.f34849z;
        if (i10 == 0) {
            i10 = Z();
        }
        if (i10 == 16) {
            long j10 = this.A;
            int i11 = (int) j10;
            if (j10 == i11) {
                this.f34849z = 0;
                int[] iArr = this.f34845v;
                int i12 = this.f34842s - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new a("Expected an int but was " + this.A + " at path " + f());
        }
        if (i10 == 17) {
            this.C = this.y.m(this.B);
        } else if (i10 != 9 && i10 != 8) {
            if (i10 != 11) {
                throw new a("Expected an int but was " + com.ironsource.adapters.facebook.a.y(l()) + " at path " + f());
            }
        } else {
            if (i10 == 9) {
                e02 = e0(E);
            } else {
                e02 = e0(D);
            }
            this.C = e02;
            try {
                int parseInt = Integer.parseInt(e02);
                this.f34849z = 0;
                int[] iArr2 = this.f34845v;
                int i13 = this.f34842s - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f34849z = 11;
        try {
            double parseDouble = Double.parseDouble(this.C);
            int i14 = (int) parseDouble;
            if (i14 == parseDouble) {
                this.C = null;
                this.f34849z = 0;
                int[] iArr3 = this.f34845v;
                int i15 = this.f34842s - 1;
                iArr3[i15] = iArr3[i15] + 1;
                return i14;
            }
            throw new a("Expected an int but was " + this.C + " at path " + f());
        } catch (NumberFormatException unused2) {
            throw new a("Expected an int but was " + this.C + " at path " + f());
        }
    }

    @Override // r2.c
    public final String k() throws IOException {
        String m10;
        int i10 = this.f34849z;
        if (i10 == 0) {
            i10 = Z();
        }
        if (i10 == 10) {
            m10 = f0();
        } else if (i10 == 9) {
            m10 = e0(E);
        } else if (i10 == 8) {
            m10 = e0(D);
        } else if (i10 == 11) {
            m10 = this.C;
            this.C = null;
        } else if (i10 == 16) {
            m10 = Long.toString(this.A);
        } else if (i10 == 17) {
            m10 = this.y.m(this.B);
        } else {
            throw new a("Expected a string but was " + com.ironsource.adapters.facebook.a.y(l()) + " at path " + f());
        }
        this.f34849z = 0;
        int[] iArr = this.f34845v;
        int i11 = this.f34842s - 1;
        iArr[i11] = iArr[i11] + 1;
        return m10;
    }

    @Override // r2.c
    public final int l() throws IOException {
        int i10 = this.f34849z;
        if (i10 == 0) {
            i10 = Z();
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
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            case 18:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final String toString() {
        return "JsonReader(" + this.f34848x + ")";
    }
}
