package hd;

/* loaded from: classes2.dex */
public final class d extends androidx.transition.n {
    public static final byte[] M;
    public a4.j A;
    public int B;
    public b C;
    public int D;
    public b E;
    public g F;
    public g G;
    public n H;
    public n I;
    public boolean J;
    public boolean K;
    public boolean L;

    /* renamed from: a, reason: collision with root package name */
    public int f28839a;

    /* renamed from: b, reason: collision with root package name */
    public int f28840b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final b f28841c = new b();

    /* renamed from: d, reason: collision with root package name */
    public k[] f28842d = new k[256];

    /* renamed from: e, reason: collision with root package name */
    public int f28843e = (int) (256 * 0.75d);
    public final k f = new k();

    /* renamed from: g, reason: collision with root package name */
    public final k f28844g = new k();

    /* renamed from: h, reason: collision with root package name */
    public final k f28845h = new k();

    /* renamed from: i, reason: collision with root package name */
    public final k f28846i = new k();

    /* renamed from: j, reason: collision with root package name */
    public k[] f28847j;

    /* renamed from: k, reason: collision with root package name */
    public short f28848k;

    /* renamed from: l, reason: collision with root package name */
    public int f28849l;

    /* renamed from: m, reason: collision with root package name */
    public int f28850m;

    /* renamed from: n, reason: collision with root package name */
    public String f28851n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public int f28852p;

    /* renamed from: q, reason: collision with root package name */
    public int f28853q;

    /* renamed from: r, reason: collision with root package name */
    public int[] f28854r;

    /* renamed from: s, reason: collision with root package name */
    public int f28855s;

    /* renamed from: t, reason: collision with root package name */
    public b f28856t;

    /* renamed from: u, reason: collision with root package name */
    public int f28857u;

    /* renamed from: v, reason: collision with root package name */
    public int f28858v;

    /* renamed from: w, reason: collision with root package name */
    public a f28859w;

    /* renamed from: x, reason: collision with root package name */
    public a f28860x;
    public a y;

    /* renamed from: z, reason: collision with root package name */
    public a f28861z;

    static {
        byte[] bArr = new byte[220];
        for (int i10 = 0; i10 < 220; i10++) {
            bArr[i10] = (byte) ("AAAAAAAAAAAAAAAABCLMMDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAANAAAAAAAAAAAAAAAAAAAAJJJJJJJJJJJJJJJJDOPAAAAAAGGGGGGGHIFBFAAFFAARQJJKKJJJJJJJJJJJJJJJJJJ".charAt(i10) - 'A');
        }
        M = bArr;
    }

    public d(int i10) {
        boolean z10;
        if ((i10 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.J = z10;
        this.K = (i10 & 2) != 0;
    }

    @Override // androidx.transition.n
    public final void Z(int i10, int i11, String str, String str2, String str3, String[] strArr) {
        int v02;
        this.f28839a = i10;
        this.f28849l = i11;
        this.f28850m = v0(str);
        this.f28851n = str;
        if (str2 != null) {
            this.o = x0(str2);
        }
        if (str3 == null) {
            v02 = 0;
        } else {
            v02 = v0(str3);
        }
        this.f28852p = v02;
        if (strArr != null && strArr.length > 0) {
            int length = strArr.length;
            this.f28853q = length;
            this.f28854r = new int[length];
            for (int i12 = 0; i12 < this.f28853q; i12++) {
                this.f28854r[i12] = v0(strArr[i12]);
            }
        }
    }

    @Override // androidx.transition.n
    public final a a0(String str, boolean z10) {
        b bVar = new b();
        bVar.i(x0(str));
        bVar.i(0);
        a aVar = new a(this, true, bVar, bVar, 2);
        if (z10) {
            aVar.f28830g = this.f28859w;
            this.f28859w = aVar;
        } else {
            aVar.f28830g = this.f28860x;
            this.f28860x = aVar;
        }
        return aVar;
    }

    @Override // androidx.transition.n
    public final n b0(int i10, String str, String str2, String str3, String[] strArr) {
        return new n(this, i10, str, str2, str3, strArr, this.J, this.K);
    }

    @Override // androidx.transition.n
    public final a c0(int i10, q qVar, String str, boolean z10) {
        b bVar = new b();
        a.b(i10, qVar, bVar);
        bVar.i(x0(str));
        bVar.i(0);
        a aVar = new a(this, true, bVar, bVar, bVar.f28833b - 2);
        if (z10) {
            aVar.f28830g = this.y;
            this.y = aVar;
        } else {
            aVar.f28830g = this.f28861z;
            this.f28861z = aVar;
        }
        return aVar;
    }

    public final int g0(String str, int i10) {
        k kVar = this.f;
        kVar.f28912b = 31;
        kVar.f28913c = i10;
        kVar.f28915e = str;
        kVar.f28917h = (str.hashCode() + 31 + i10) & Integer.MAX_VALUE;
        k m02 = m0(kVar);
        if (m02 == null) {
            m02 = u0();
        }
        return m02.f28911a;
    }

    public final k h0(double d10) {
        k kVar = this.f;
        kVar.f28912b = 6;
        kVar.f28914d = Double.doubleToRawLongBits(d10);
        kVar.f28917h = Integer.MAX_VALUE & (kVar.f28912b + ((int) d10));
        k m02 = m0(kVar);
        if (m02 == null) {
            b bVar = this.f28841c;
            bVar.e(6);
            bVar.h(kVar.f28914d);
            k kVar2 = new k(this.f28840b, kVar);
            this.f28840b += 2;
            s0(kVar2);
            return kVar2;
        }
        return m02;
    }

    public final k i0(float f) {
        k kVar = this.f;
        kVar.f28912b = 4;
        kVar.f28913c = Float.floatToRawIntBits(f);
        kVar.f28917h = Integer.MAX_VALUE & (kVar.f28912b + ((int) f));
        k m02 = m0(kVar);
        if (m02 == null) {
            b bVar = this.f28841c;
            bVar.e(4);
            bVar.g(kVar.f28913c);
            int i10 = this.f28840b;
            this.f28840b = i10 + 1;
            k kVar2 = new k(i10, kVar);
            s0(kVar2);
            return kVar2;
        }
        return m02;
    }

    public final k j0(int i10) {
        k kVar = this.f;
        kVar.f28912b = 3;
        kVar.f28913c = i10;
        kVar.f28917h = (i10 + 3) & Integer.MAX_VALUE;
        k m02 = m0(kVar);
        if (m02 == null) {
            b bVar = this.f28841c;
            bVar.e(3);
            bVar.g(i10);
            int i11 = this.f28840b;
            this.f28840b = i11 + 1;
            k kVar2 = new k(i11, kVar);
            s0(kVar2);
            return kVar2;
        }
        return m02;
    }

    public final k k0(int i10, String str, String str2, String str3) {
        boolean z10;
        k q02;
        k kVar = this.f28846i;
        kVar.a(i10 + 20, str, str2, str3);
        k m02 = m0(kVar);
        if (m02 == null) {
            if (i10 <= 4) {
                q02 = p0(str, str2, str3);
            } else {
                if (i10 == 9) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                q02 = q0(str, str2, str3, z10);
            }
            r0(i10, q02.f28911a);
            int i11 = this.f28840b;
            this.f28840b = i11 + 1;
            k kVar2 = new k(i11, kVar);
            s0(kVar2);
            return kVar2;
        }
        return m02;
    }

    public final k l0(long j10) {
        k kVar = this.f;
        kVar.f28912b = 5;
        kVar.f28914d = j10;
        kVar.f28917h = (((int) j10) + 5) & Integer.MAX_VALUE;
        k m02 = m0(kVar);
        if (m02 == null) {
            b bVar = this.f28841c;
            bVar.e(5);
            bVar.h(j10);
            k kVar2 = new k(this.f28840b, kVar);
            this.f28840b += 2;
            s0(kVar2);
            return kVar2;
        }
        return m02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        if (r0.f28916g.equals(r8.f28916g) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0065, code lost:
    
        if (r0.f28915e.equals(r8.f28915e) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0049, code lost:
    
        if (r0.f28913c == r8.f28913c) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0054, code lost:
    
        if (r0.f28914d == r8.f28914d) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0082, code lost:
    
        if (r0.f.equals(r8.f) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0097, code lost:
    
        if (r0.f.equals(r8.f) != false) goto L48;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0020. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final hd.k m0(hd.k r8) {
        /*
            r7 = this;
            hd.k[] r0 = r7.f28842d
            int r1 = r8.f28917h
            int r2 = r0.length
            int r1 = r1 % r2
            r0 = r0[r1]
        L8:
            if (r0 == 0) goto La8
            int r1 = r0.f28912b
            int r2 = r8.f28912b
            if (r1 != r2) goto La4
            r1 = 1
            if (r2 == r1) goto L9a
            r3 = 12
            r4 = 0
            if (r2 == r3) goto L85
            r3 = 16
            if (r2 == r3) goto L9a
            r3 = 18
            if (r2 == r3) goto L68
            switch(r2) {
                case 3: goto L45;
                case 4: goto L45;
                case 5: goto L4e;
                case 6: goto L4e;
                case 7: goto L9a;
                case 8: goto L9a;
                default: goto L23;
            }
        L23:
            switch(r2) {
                case 30: goto L9a;
                case 31: goto L57;
                case 32: goto L4e;
                default: goto L26;
            }
        L26:
            java.lang.String r2 = r0.f28915e
            java.lang.String r3 = r8.f28915e
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L4c
            java.lang.String r2 = r0.f
            java.lang.String r3 = r8.f
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L4c
            java.lang.String r2 = r0.f28916g
            java.lang.String r3 = r8.f28916g
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L4c
            goto La2
        L45:
            int r2 = r0.f28913c
            int r3 = r8.f28913c
            if (r2 != r3) goto L4c
            goto La2
        L4c:
            r1 = r4
            goto La2
        L4e:
            long r2 = r0.f28914d
            long r5 = r8.f28914d
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L4c
            goto La2
        L57:
            int r2 = r0.f28913c
            int r3 = r8.f28913c
            if (r2 != r3) goto L4c
            java.lang.String r2 = r0.f28915e
            java.lang.String r3 = r8.f28915e
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L4c
            goto La2
        L68:
            long r2 = r0.f28914d
            long r5 = r8.f28914d
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L4c
            java.lang.String r2 = r0.f28915e
            java.lang.String r3 = r8.f28915e
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L4c
            java.lang.String r2 = r0.f
            java.lang.String r3 = r8.f
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L4c
            goto La2
        L85:
            java.lang.String r2 = r0.f28915e
            java.lang.String r3 = r8.f28915e
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L4c
            java.lang.String r2 = r0.f
            java.lang.String r3 = r8.f
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L4c
            goto La2
        L9a:
            java.lang.String r1 = r0.f28915e
            java.lang.String r2 = r8.f28915e
            boolean r1 = r1.equals(r2)
        La2:
            if (r1 != 0) goto La8
        La4:
            hd.k r0 = r0.f28918i
            goto L8
        La8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hd.d.m0(hd.k):hd.k");
    }

    public final k n0(Object obj) {
        if (obj instanceof Integer) {
            return j0(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return j0(((Byte) obj).intValue());
        }
        if (obj instanceof Character) {
            return j0(((Character) obj).charValue());
        }
        if (obj instanceof Short) {
            return j0(((Short) obj).intValue());
        }
        if (obj instanceof Boolean) {
            return j0(((Boolean) obj).booleanValue() ? 1 : 0);
        }
        if (obj instanceof Float) {
            return i0(((Float) obj).floatValue());
        }
        if (obj instanceof Long) {
            return l0(((Long) obj).longValue());
        }
        if (obj instanceof Double) {
            return h0(((Double) obj).doubleValue());
        }
        boolean z10 = obj instanceof String;
        b bVar = this.f28841c;
        k kVar = this.f28844g;
        if (z10) {
            String str = (String) obj;
            kVar.a(8, str, null, null);
            k m02 = m0(kVar);
            if (m02 == null) {
                bVar.c(8, x0(str));
                int i10 = this.f28840b;
                this.f28840b = i10 + 1;
                k kVar2 = new k(i10, kVar);
                s0(kVar2);
                return kVar2;
            }
            return m02;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            int i11 = pVar.f28966a;
            if (i11 == 10) {
                return o0(new String(pVar.f28967b, pVar.f28968c, pVar.f28969d));
            }
            String e10 = pVar.e();
            if (i11 == 11) {
                kVar.a(16, e10, null, null);
                k m03 = m0(kVar);
                if (m03 == null) {
                    bVar.c(16, x0(e10));
                    int i12 = this.f28840b;
                    this.f28840b = i12 + 1;
                    k kVar3 = new k(i12, kVar);
                    s0(kVar3);
                    return kVar3;
                }
                return m03;
            }
            return o0(e10);
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return k0(iVar.f28902a, iVar.f28903b, iVar.f28904c, iVar.f28905d);
        }
        StringBuffer stringBuffer = new StringBuffer("value ");
        stringBuffer.append(obj);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public final k o0(String str) {
        k kVar = this.f28844g;
        kVar.a(7, str, null, null);
        k m02 = m0(kVar);
        if (m02 == null) {
            this.f28841c.c(7, x0(str));
            int i10 = this.f28840b;
            this.f28840b = i10 + 1;
            k kVar2 = new k(i10, kVar);
            s0(kVar2);
            return kVar2;
        }
        return m02;
    }

    public final k p0(String str, String str2, String str3) {
        k kVar = this.f28845h;
        kVar.a(9, str, str2, str3);
        k m02 = m0(kVar);
        if (m02 == null) {
            int v02 = v0(str);
            int w02 = w0(str2, str3);
            b bVar = this.f28841c;
            bVar.c(9, v02);
            bVar.i(w02);
            int i10 = this.f28840b;
            this.f28840b = i10 + 1;
            k kVar2 = new k(i10, kVar);
            s0(kVar2);
            return kVar2;
        }
        return m02;
    }

    public final k q0(String str, String str2, String str3, boolean z10) {
        int i10;
        if (z10) {
            i10 = 11;
        } else {
            i10 = 10;
        }
        k kVar = this.f28845h;
        kVar.a(i10, str, str2, str3);
        k m02 = m0(kVar);
        if (m02 == null) {
            int v02 = v0(str);
            int w02 = w0(str2, str3);
            b bVar = this.f28841c;
            bVar.c(i10, v02);
            bVar.i(w02);
            int i11 = this.f28840b;
            this.f28840b = i11 + 1;
            k kVar2 = new k(i11, kVar);
            s0(kVar2);
            return kVar2;
        }
        return m02;
    }

    public final void r0(int i10, int i11) {
        b bVar = this.f28841c;
        bVar.b(15, i10);
        bVar.i(i11);
    }

    public final void s0(k kVar) {
        if (this.f28840b + this.f28848k > this.f28843e) {
            int length = this.f28842d.length;
            int i10 = (length * 2) + 1;
            k[] kVarArr = new k[i10];
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                k kVar2 = this.f28842d[length];
                while (kVar2 != null) {
                    int i11 = kVar2.f28917h % i10;
                    k kVar3 = kVar2.f28918i;
                    kVar2.f28918i = kVarArr[i11];
                    kVarArr[i11] = kVar2;
                    kVar2 = kVar3;
                }
            }
            this.f28842d = kVarArr;
            this.f28843e = (int) (i10 * 0.75d);
        }
        int i12 = kVar.f28917h;
        k[] kVarArr2 = this.f28842d;
        int length2 = i12 % kVarArr2.length;
        kVar.f28918i = kVarArr2[length2];
        kVarArr2[length2] = kVar;
    }

    public final int t0(String str) {
        k kVar = this.f;
        kVar.a(30, str, null, null);
        k m02 = m0(kVar);
        if (m02 == null) {
            m02 = u0();
        }
        return m02.f28911a;
    }

    public final k u0() {
        short s10 = (short) (this.f28848k + 1);
        this.f28848k = s10;
        k kVar = new k(s10, this.f);
        s0(kVar);
        if (this.f28847j == null) {
            this.f28847j = new k[16];
        }
        short s11 = this.f28848k;
        k[] kVarArr = this.f28847j;
        if (s11 == kVarArr.length) {
            k[] kVarArr2 = new k[kVarArr.length * 2];
            System.arraycopy(kVarArr, 0, kVarArr2, 0, kVarArr.length);
            this.f28847j = kVarArr2;
        }
        this.f28847j[this.f28848k] = kVar;
        return kVar;
    }

    public final int v0(String str) {
        return o0(str).f28911a;
    }

    public final int w0(String str, String str2) {
        k kVar = this.f28844g;
        kVar.a(12, str, str2, null);
        k m02 = m0(kVar);
        if (m02 == null) {
            int x02 = x0(str);
            int x03 = x0(str2);
            b bVar = this.f28841c;
            bVar.c(12, x02);
            bVar.i(x03);
            int i10 = this.f28840b;
            this.f28840b = i10 + 1;
            m02 = new k(i10, kVar);
            s0(m02);
        }
        return m02.f28911a;
    }

    public final int x0(String str) {
        k kVar = this.f;
        kVar.a(1, str, null, null);
        k m02 = m0(kVar);
        if (m02 == null) {
            b bVar = this.f28841c;
            bVar.e(1);
            int length = str.length();
            if (length <= 65535) {
                int i10 = bVar.f28833b;
                if (i10 + 2 + length > bVar.f28832a.length) {
                    bVar.a(length + 2);
                }
                byte[] bArr = bVar.f28832a;
                int i11 = i10 + 1;
                bArr[i10] = (byte) (length >>> 8);
                int i12 = i11 + 1;
                bArr[i11] = (byte) length;
                int i13 = 0;
                while (i13 < length) {
                    char charAt = str.charAt(i13);
                    if (charAt >= 1 && charAt <= 127) {
                        bArr[i12] = (byte) charAt;
                        i13++;
                        i12++;
                    } else {
                        bVar.f28833b = i12;
                        bVar.d(i13, 65535, str);
                        break;
                    }
                }
                bVar.f28833b = i12;
                int i14 = this.f28840b;
                this.f28840b = i14 + 1;
                m02 = new k(i14, kVar);
                s0(m02);
            } else {
                throw new IllegalArgumentException();
            }
        }
        return m02.f28911a;
    }

    public final byte[] y0() {
        String str;
        String str2;
        int i10;
        String str3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        String str4;
        int i16;
        int i17;
        String str5;
        int i18;
        int a10;
        int a11;
        int i19;
        boolean z10;
        String str6;
        int i20;
        int i21;
        int i22 = 65535;
        if (this.f28840b <= 65535) {
            int i23 = (this.f28853q * 2) + 24;
            g gVar = this.F;
            int i24 = 0;
            while (true) {
                str = "ConstantValue";
                str2 = "RuntimeInvisibleTypeAnnotations";
                if (gVar == null) {
                    break;
                }
                i24++;
                int i25 = gVar.f28888g;
                d dVar = gVar.f28884b;
                if (i25 != 0) {
                    dVar.x0("ConstantValue");
                    i20 = 16;
                } else {
                    i20 = 8;
                }
                int i26 = gVar.f28885c;
                if ((i26 & 4096) != 0 && ((dVar.f28839a & i22) < 49 || (i26 & 262144) != 0)) {
                    dVar.x0("Synthetic");
                    i20 += 6;
                }
                if ((i26 & 131072) != 0) {
                    dVar.x0("Deprecated");
                    i20 += 6;
                }
                if (gVar.f != 0) {
                    dVar.x0("Signature");
                    i20 += 8;
                }
                if (gVar.f28889h != null) {
                    dVar.x0("RuntimeVisibleAnnotations");
                    i21 = 8;
                    i20 += gVar.f28889h.a() + 8;
                } else {
                    i21 = 8;
                }
                if (gVar.f28890i != null) {
                    dVar.x0("RuntimeInvisibleAnnotations");
                    i20 += gVar.f28890i.a() + i21;
                }
                if (gVar.f28891j != null) {
                    dVar.x0("RuntimeVisibleTypeAnnotations");
                    i20 += gVar.f28891j.a() + i21;
                }
                if (gVar.f28892k != null) {
                    dVar.x0("RuntimeInvisibleTypeAnnotations");
                    i20 += gVar.f28892k.a() + i21;
                }
                a4.j jVar = gVar.f28893l;
                if (jVar != null) {
                    i20 += jVar.a(dVar);
                }
                i23 += i20;
                gVar = gVar.f28883a;
                i22 = 65535;
            }
            n nVar = this.H;
            int i27 = 0;
            while (nVar != null) {
                int i28 = i27 + 1;
                int i29 = nVar.f28946t.f28833b;
                d dVar2 = nVar.f28931c;
                if (i29 > 0) {
                    if (i29 <= 65536) {
                        dVar2.x0("Code");
                        int i30 = (nVar.C * 8) + nVar.f28946t.f28833b + 18 + 8;
                        if (nVar.I != null) {
                            dVar2.x0("LocalVariableTable");
                            i30 += nVar.I.f28833b + 8;
                        }
                        if (nVar.K != null) {
                            dVar2.x0("LocalVariableTypeTable");
                            i30 += nVar.K.f28833b + 8;
                        }
                        if (nVar.M != null) {
                            dVar2.x0("LineNumberTable");
                            i30 += nVar.M.f28833b + 8;
                        }
                        if (nVar.y != null) {
                            i16 = i28;
                            if ((dVar2.f28839a & 65535) >= 50) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                str6 = "StackMapTable";
                            } else {
                                str6 = "StackMap";
                            }
                            dVar2.x0(str6);
                            i19 = 8;
                            i30 += nVar.y.f28833b + 8;
                        } else {
                            i16 = i28;
                            i19 = 8;
                        }
                        if (nVar.O != null) {
                            dVar2.x0("RuntimeVisibleTypeAnnotations");
                            i17 = nVar.O.a() + i19 + i30;
                        } else {
                            i17 = i30;
                        }
                        if (nVar.P != null) {
                            dVar2.x0("RuntimeInvisibleTypeAnnotations");
                            i17 += nVar.P.a() + i19;
                        }
                    } else {
                        throw new RuntimeException("Method code too large!");
                    }
                } else {
                    i16 = i28;
                    i17 = 8;
                }
                int i31 = nVar.f28936i;
                if (i31 > 0) {
                    dVar2.x0("Exceptions");
                    i17 += (i31 * 2) + 8;
                }
                int i32 = nVar.f28932d;
                if ((i32 & 4096) != 0) {
                    str5 = str;
                    if ((dVar2.f28839a & 65535) < 49 || (i32 & 262144) != 0) {
                        dVar2.x0("Synthetic");
                        i17 += 6;
                    }
                } else {
                    str5 = str;
                }
                if ((i32 & 131072) != 0) {
                    dVar2.x0("Deprecated");
                    i17 += 6;
                }
                String str7 = nVar.f28935h;
                if (str7 != null) {
                    dVar2.x0("Signature");
                    dVar2.x0(str7);
                    i17 += 8;
                }
                if (nVar.G != null) {
                    dVar2.x0("MethodParameters");
                    i17 += nVar.G.f28833b + 7;
                }
                if (nVar.f28938k != null) {
                    dVar2.x0("AnnotationDefault");
                    i17 += nVar.f28938k.f28833b + 6;
                }
                if (nVar.f28939l != null) {
                    dVar2.x0("RuntimeVisibleAnnotations");
                    i18 = 8;
                    i17 += nVar.f28939l.a() + 8;
                } else {
                    i18 = 8;
                }
                if (nVar.f28940m != null) {
                    dVar2.x0("RuntimeInvisibleAnnotations");
                    i17 += nVar.f28940m.a() + i18;
                }
                if (nVar.f28941n != null) {
                    dVar2.x0("RuntimeVisibleTypeAnnotations");
                    i17 += nVar.f28941n.a() + i18;
                }
                if (nVar.o != null) {
                    dVar2.x0("RuntimeInvisibleTypeAnnotations");
                    i17 += nVar.o.a() + i18;
                }
                if (nVar.f28942p != null) {
                    dVar2.x0("RuntimeVisibleParameterAnnotations");
                    a[] aVarArr = nVar.f28942p;
                    int length = ((aVarArr.length - nVar.f28944r) * 2) + 7 + i17;
                    for (int length2 = aVarArr.length - 1; length2 >= nVar.f28944r; length2--) {
                        a aVar = nVar.f28942p[length2];
                        if (aVar == null) {
                            a11 = 0;
                        } else {
                            a11 = aVar.a();
                        }
                        length += a11;
                    }
                    i17 = length;
                }
                if (nVar.f28943q != null) {
                    dVar2.x0("RuntimeInvisibleParameterAnnotations");
                    a[] aVarArr2 = nVar.f28943q;
                    int length3 = ((aVarArr2.length - nVar.f28944r) * 2) + 7 + i17;
                    for (int length4 = aVarArr2.length - 1; length4 >= nVar.f28944r; length4--) {
                        a aVar2 = nVar.f28943q[length4];
                        if (aVar2 == null) {
                            a10 = 0;
                        } else {
                            a10 = aVar2.a();
                        }
                        length3 += a10;
                    }
                    i17 = length3;
                }
                a4.j jVar2 = nVar.f28945s;
                if (jVar2 != null) {
                    i17 += jVar2.a(dVar2);
                }
                i23 += i17;
                nVar = (n) nVar.f28930b;
                i27 = i16;
                str = str5;
            }
            String str8 = str;
            b bVar = this.E;
            String str9 = "BootstrapMethods";
            if (bVar != null) {
                i23 += bVar.f28833b + 8;
                x0("BootstrapMethods");
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (this.o != 0) {
                i10++;
                i23 += 8;
                x0("Signature");
            }
            if (this.f28855s != 0) {
                i10++;
                i23 += 8;
                x0("SourceFile");
            }
            b bVar2 = this.f28856t;
            if (bVar2 != null) {
                i10++;
                i23 += bVar2.f28833b + 6;
                x0("SourceDebugExtension");
            }
            if (this.f28857u != 0) {
                i10++;
                i23 += 10;
                x0("EnclosingMethod");
            }
            if ((this.f28849l & 131072) != 0) {
                i10++;
                i23 += 6;
                x0("Deprecated");
            }
            int i33 = this.f28849l;
            if ((i33 & 4096) != 0) {
                str3 = "SourceFile";
                if ((this.f28839a & 65535) < 49 || (i33 & 262144) != 0) {
                    i10++;
                    i23 += 6;
                    x0("Synthetic");
                }
            } else {
                str3 = "SourceFile";
            }
            b bVar3 = this.C;
            if (bVar3 != null) {
                i10++;
                i11 = 8;
                i23 += bVar3.f28833b + 8;
                x0("InnerClasses");
            } else {
                i11 = 8;
            }
            a aVar3 = this.f28859w;
            if (aVar3 != null) {
                i10++;
                i23 += aVar3.a() + i11;
                x0("RuntimeVisibleAnnotations");
            }
            a aVar4 = this.f28860x;
            if (aVar4 != null) {
                i10++;
                i23 += aVar4.a() + i11;
                x0("RuntimeInvisibleAnnotations");
            }
            a aVar5 = this.y;
            if (aVar5 != null) {
                i10++;
                i23 += aVar5.a() + i11;
                x0("RuntimeVisibleTypeAnnotations");
            }
            a aVar6 = this.f28861z;
            if (aVar6 != null) {
                i10++;
                i23 += aVar6.a() + i11;
                x0("RuntimeInvisibleTypeAnnotations");
            }
            a4.j jVar3 = this.A;
            if (jVar3 != null) {
                i10 += jVar3.e();
                i23 += this.A.a(this);
            }
            b bVar4 = this.f28841c;
            b bVar5 = new b(i23 + bVar4.f28833b);
            bVar5.g(-889275714);
            bVar5.g(this.f28839a);
            bVar5.i(this.f28840b);
            bVar5.f(bVar4.f28832a, 0, bVar4.f28833b);
            int i34 = this.f28849l;
            int i35 = 393216;
            bVar5.i(i34 & (~(((i34 & 262144) / 64) | 393216)));
            bVar5.i(this.f28850m);
            bVar5.i(this.f28852p);
            bVar5.i(this.f28853q);
            for (int i36 = 0; i36 < this.f28853q; i36++) {
                bVar5.i(this.f28854r[i36]);
            }
            bVar5.i(i24);
            g gVar2 = this.F;
            while (gVar2 != null) {
                int i37 = gVar2.f28885c;
                int i38 = i37 & 262144;
                String str10 = str9;
                bVar5.i((~((i38 / 64) | i35)) & i37);
                bVar5.i(gVar2.f28886d);
                bVar5.i(gVar2.f28887e);
                int i39 = gVar2.f28888g;
                if (i39 != 0) {
                    i13 = 1;
                } else {
                    i13 = 0;
                }
                int i40 = i37 & 4096;
                int i41 = i10;
                d dVar3 = gVar2.f28884b;
                if (i40 != 0) {
                    i14 = i27;
                    if ((dVar3.f28839a & 65535) < 49 || i38 != 0) {
                        i13++;
                    }
                } else {
                    i14 = i27;
                }
                int i42 = i37 & 131072;
                if (i42 != 0) {
                    i13++;
                }
                int i43 = gVar2.f;
                if (i43 != 0) {
                    i13++;
                }
                if (gVar2.f28889h != null) {
                    i13++;
                }
                if (gVar2.f28890i != null) {
                    i13++;
                }
                if (gVar2.f28891j != null) {
                    i13++;
                }
                if (gVar2.f28892k != null) {
                    i13++;
                }
                a4.j jVar4 = gVar2.f28893l;
                if (jVar4 != null) {
                    i13 = jVar4.e() + i13;
                }
                bVar5.i(i13);
                String str11 = str8;
                String str12 = str2;
                if (i39 != 0) {
                    bVar5.i(dVar3.x0(str11));
                    bVar5.g(2);
                    bVar5.i(i39);
                }
                if (i40 != 0 && ((dVar3.f28839a & 65535) < 49 || i38 != 0)) {
                    bVar5.i(dVar3.x0("Synthetic"));
                    i15 = 0;
                    bVar5.g(0);
                } else {
                    i15 = 0;
                }
                if (i42 != 0) {
                    bVar5.i(dVar3.x0("Deprecated"));
                    bVar5.g(i15);
                }
                if (i43 != 0) {
                    bVar5.i(dVar3.x0("Signature"));
                    bVar5.g(2);
                    bVar5.i(i43);
                }
                if (gVar2.f28889h != null) {
                    bVar5.i(dVar3.x0("RuntimeVisibleAnnotations"));
                    gVar2.f28889h.c(bVar5);
                }
                if (gVar2.f28890i != null) {
                    bVar5.i(dVar3.x0("RuntimeInvisibleAnnotations"));
                    gVar2.f28890i.c(bVar5);
                }
                if (gVar2.f28891j != null) {
                    bVar5.i(dVar3.x0("RuntimeVisibleTypeAnnotations"));
                    gVar2.f28891j.c(bVar5);
                }
                if (gVar2.f28892k != null) {
                    str4 = str12;
                    bVar5.i(dVar3.x0(str4));
                    gVar2.f28892k.c(bVar5);
                } else {
                    str4 = str12;
                }
                a4.j jVar5 = gVar2.f28893l;
                if (jVar5 != null) {
                    jVar5.d(dVar3, bVar5);
                }
                gVar2 = gVar2.f28883a;
                str2 = str4;
                str8 = str11;
                str9 = str10;
                i10 = i41;
                i27 = i14;
                i35 = 393216;
            }
            int i44 = i10;
            String str13 = str9;
            String str14 = str2;
            bVar5.i(i27);
            for (n nVar2 = this.H; nVar2 != null; nVar2 = (n) nVar2.f28930b) {
                nVar2.m(bVar5);
            }
            bVar5.i(i44);
            if (this.E != null) {
                bVar5.i(x0(str13));
                bVar5.g(this.E.f28833b + 2);
                bVar5.i(this.D);
                b bVar6 = this.E;
                bVar5.f(bVar6.f28832a, 0, bVar6.f28833b);
            }
            if (this.o != 0) {
                bVar5.i(x0("Signature"));
                i12 = 2;
                bVar5.g(2);
                bVar5.i(this.o);
            } else {
                i12 = 2;
            }
            if (this.f28855s != 0) {
                bVar5.i(x0(str3));
                bVar5.g(i12);
                bVar5.i(this.f28855s);
            }
            b bVar7 = this.f28856t;
            if (bVar7 != null) {
                int i45 = bVar7.f28833b;
                bVar5.i(x0("SourceDebugExtension"));
                bVar5.g(i45);
                bVar5.f(this.f28856t.f28832a, 0, i45);
            }
            if (this.f28857u != 0) {
                bVar5.i(x0("EnclosingMethod"));
                bVar5.g(4);
                bVar5.i(this.f28857u);
                bVar5.i(this.f28858v);
            }
            if ((this.f28849l & 131072) != 0) {
                bVar5.i(x0("Deprecated"));
                bVar5.g(0);
            }
            int i46 = this.f28849l;
            if ((i46 & 4096) != 0 && ((this.f28839a & 65535) < 49 || (i46 & 262144) != 0)) {
                bVar5.i(x0("Synthetic"));
                bVar5.g(0);
            }
            if (this.C != null) {
                bVar5.i(x0("InnerClasses"));
                bVar5.g(this.C.f28833b + 2);
                bVar5.i(this.B);
                b bVar8 = this.C;
                bVar5.f(bVar8.f28832a, 0, bVar8.f28833b);
            }
            if (this.f28859w != null) {
                bVar5.i(x0("RuntimeVisibleAnnotations"));
                this.f28859w.c(bVar5);
            }
            if (this.f28860x != null) {
                bVar5.i(x0("RuntimeInvisibleAnnotations"));
                this.f28860x.c(bVar5);
            }
            if (this.y != null) {
                bVar5.i(x0("RuntimeVisibleTypeAnnotations"));
                this.y.c(bVar5);
            }
            if (this.f28861z != null) {
                bVar5.i(x0(str14));
                this.f28861z.c(bVar5);
            }
            a4.j jVar6 = this.A;
            if (jVar6 != null) {
                jVar6.d(this, bVar5);
            }
            if (this.L) {
                this.f28859w = null;
                this.f28860x = null;
                this.A = null;
                this.B = 0;
                this.C = null;
                this.D = 0;
                this.E = null;
                this.F = null;
                this.G = null;
                this.H = null;
                this.I = null;
                this.J = false;
                this.K = true;
                this.L = false;
                new c(bVar5.f28832a).j(this);
                return y0();
            }
            return bVar5.f28832a;
        }
        throw new RuntimeException("Class file too large!");
    }
}
