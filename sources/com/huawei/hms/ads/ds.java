package com.huawei.hms.ads;

import android.graphics.Bitmap;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import gb.r0;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class ds {
    private static final int B = 1;
    private static final int C = 2;
    private static final int D = 33;
    private static final int F = 44;
    private static final int I = 4096;
    private static final int L = 249;
    private static final int S = 3;
    private static final int Z = 0;

    /* renamed from: a, reason: collision with root package name */
    private static final long f21586a = 62914560;

    /* renamed from: b, reason: collision with root package name */
    private static final String f21587b = "ds";
    public int Code;
    private int[] E;
    private int G;
    private Bitmap J;
    private int[] K;
    private int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private int T;
    private int U;
    public int V;
    private int W;

    /* renamed from: c, reason: collision with root package name */
    private final int f21588c;

    /* renamed from: d, reason: collision with root package name */
    private InputStream f21589d;

    /* renamed from: j, reason: collision with root package name */
    private boolean f21594j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f21595k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f21596l;

    /* renamed from: m, reason: collision with root package name */
    private short[] f21597m;

    /* renamed from: n, reason: collision with root package name */
    private byte[] f21598n;

    /* renamed from: p, reason: collision with root package name */
    private byte[] f21599p;

    /* renamed from: q, reason: collision with root package name */
    private byte[] f21600q;

    /* renamed from: r, reason: collision with root package name */
    private int f21601r;

    /* renamed from: v, reason: collision with root package name */
    private int f21605v;

    /* renamed from: w, reason: collision with root package name */
    private int f21606w;

    /* renamed from: x, reason: collision with root package name */
    private int f21607x;
    private int y;

    /* renamed from: e, reason: collision with root package name */
    private final Object f21590e = new Object();
    private final Object f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private boolean f21591g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f21592h = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f21593i = false;
    private byte[] o = new byte[512];

    /* renamed from: s, reason: collision with root package name */
    private int f21602s = 100;

    /* renamed from: t, reason: collision with root package name */
    private int f21603t = 0;

    /* renamed from: u, reason: collision with root package name */
    private int f21604u = 0;

    /* renamed from: z, reason: collision with root package name */
    private int[] f21608z = null;
    private int[] A = null;
    private int H = 0;
    private int M = 0;
    private int X = 0;
    private int[] Y = null;

    public ds(InputStream inputStream, int i10) {
        this.f21589d = inputStream;
        this.f21588c = i10;
        Z();
    }

    private void B() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < 6; i10++) {
            stringBuffer.append((char) C());
        }
        if (!stringBuffer.toString().startsWith("GIF")) {
            this.f21604u = 1;
            return;
        }
        S();
        if (this.f21594j && !D()) {
            int[] Code = Code(this.f21605v);
            this.f21608z = Code;
            this.y = Code[this.f21607x];
        }
    }

    private int C() {
        try {
            return this.f21589d.read();
        } catch (Exception unused) {
            this.f21604u = 1;
            return 0;
        }
    }

    private Bitmap Code(int[] iArr, int i10, int i11, Bitmap bitmap) {
        if (bitmap == null) {
            Bitmap.Config config = r0.j() > f21586a ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
            if (ex.Code()) {
                ex.Code(f21587b, "create image with config %s", config);
            }
            bitmap = Bitmap.createBitmap(i10, i11, config);
        }
        bitmap.setPixels(iArr, 0, i10, 0, 0, i10, i11);
        return bitmap;
    }

    private boolean D() {
        if (this.f21604u != 0) {
            return true;
        }
        return false;
    }

    private int F() {
        return C() | (C() << 8);
    }

    private du L() {
        int a10;
        du duVar = null;
        try {
            a10 = a();
        } catch (Exception | StackOverflowError unused) {
            this.f21604u = 1;
            ex.I(f21587b, "read image error");
        } catch (OutOfMemoryError unused2) {
            this.f21604u = 1;
            ex.I(f21587b, "run out of memory");
            f();
        }
        if (D()) {
            return null;
        }
        b();
        d();
        if (D()) {
            return null;
        }
        e();
        if (D()) {
            return null;
        }
        Bitmap bitmap = this.J;
        if (bitmap != null) {
            int i10 = this.M + 1;
            this.M = i10;
            duVar = new du(i10, bitmap, this.f21602s);
        }
        if (this.f21593i) {
            this.E[this.G] = a10;
        }
        g();
        return duVar;
    }

    private void S() {
        boolean z10;
        this.Code = F();
        this.V = F();
        if ((C() & 128) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f21594j = z10;
        this.f21605v = (int) Math.pow(2.0d, (r0 & 7) + 1);
        this.f21607x = C();
        C();
    }

    private void Z() {
        if (this.f21589d == null) {
            Code(true);
            return;
        }
        B();
        if (D()) {
            Code(true);
            V();
        }
    }

    private int a() {
        boolean z10;
        boolean z11;
        int[] iArr;
        this.N = F();
        this.O = F();
        this.P = F();
        this.Q = F();
        int C2 = C();
        int i10 = 0;
        if ((C2 & 128) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f21595k = z10;
        if ((C2 & 64) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f21596l = z11;
        int pow = (int) Math.pow(2.0d, (C2 & 7) + 1);
        this.f21606w = pow;
        if (this.f21595k) {
            int[] Code = Code(pow);
            this.A = Code;
            this.E = Code;
        } else {
            this.E = this.f21608z;
            if (this.f21607x == this.G) {
                this.y = 0;
            }
        }
        if (this.f21593i && (iArr = this.E) != null && iArr.length > 0) {
            int length = iArr.length;
            int i11 = this.G;
            if (length > i11) {
                int i12 = iArr[i11];
                iArr[i11] = 0;
                i10 = i12;
            }
        }
        if (this.E == null) {
            this.f21604u = 1;
        }
        return i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v18, types: [short] */
    /* JADX WARN: Type inference failed for: r2v20 */
    private void b() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        short s10;
        boolean z11;
        int i15 = this.P * this.Q;
        V(i15);
        int C2 = C();
        boolean z12 = true;
        int i16 = 1 << C2;
        int i17 = i16 + 1;
        int i18 = i16 + 2;
        int i19 = C2 + 1;
        int i20 = (1 << i19) - 1;
        for (int i21 = 0; i21 < i16; i21++) {
            this.f21597m[i21] = 0;
            this.f21598n[i21] = (byte) i21;
        }
        int i22 = i19;
        int i23 = i20;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = -1;
        int i33 = i18;
        while (i24 < i15) {
            if (i25 == 0) {
                if (i26 < i22) {
                    if (i28 == 0) {
                        i28 = h();
                        if (i28 <= 0) {
                            break;
                        } else {
                            i29 = 0;
                        }
                    }
                    i27 += (this.o[i29] & DefaultClassResolver.NAME) << i26;
                    i26 += 8;
                    i29++;
                    i28--;
                } else {
                    int i34 = i27 & i23;
                    i27 >>= i22;
                    i26 -= i22;
                    if (i34 <= i33 && i34 != i17) {
                        z10 = false;
                    } else {
                        z10 = z12;
                    }
                    if (z10) {
                        break;
                    }
                    if (i34 == i16) {
                        i22 = i19;
                        i33 = i18;
                        i23 = i20;
                        i32 = -1;
                    } else {
                        i10 = i19;
                        int i35 = i32;
                        if (i35 == -1) {
                            this.f21599p[i25] = this.f21598n[i34];
                            i32 = i34;
                            i25++;
                            i19 = i10;
                            z12 = true;
                            i30 = i32;
                        } else {
                            if (i34 == i33) {
                                i12 = i17;
                                this.f21599p[i25] = (byte) i30;
                                s10 = i35;
                                i25++;
                            } else {
                                i12 = i17;
                                s10 = i34;
                            }
                            while (s10 > i16) {
                                this.f21599p[i25] = this.f21598n[s10];
                                s10 = this.f21597m[s10];
                                i25++;
                                i16 = i16;
                            }
                            i11 = i16;
                            byte[] bArr = this.f21598n;
                            int i36 = bArr[s10] & DefaultClassResolver.NAME;
                            if (i33 >= I) {
                                break;
                            }
                            int i37 = i25 + 1;
                            i13 = i18;
                            byte b10 = (byte) i36;
                            this.f21599p[i25] = b10;
                            this.f21597m[i33] = (short) i35;
                            bArr[i33] = b10;
                            i33++;
                            if ((i33 & i23) == 0 && i33 < I) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                i22++;
                                i23 += i33;
                            }
                            i30 = i36;
                            i14 = i34;
                            i25 = i37;
                        }
                    }
                }
            } else {
                i10 = i19;
                i11 = i16;
                i12 = i17;
                i13 = i18;
                i14 = i32;
            }
            i25--;
            this.f21600q[i31] = this.f21599p[i25];
            i24++;
            i32 = i14;
            i31++;
            i19 = i10;
            i16 = i11;
            i17 = i12;
            i18 = i13;
            z12 = true;
        }
        for (int i38 = i31; i38 < i15; i38++) {
            this.f21600q[i38] = 0;
        }
    }

    private void c() {
        C();
        int C2 = C();
        int i10 = (C2 & 28) >> 2;
        this.f21603t = i10;
        boolean z10 = true;
        if (i10 == 0) {
            this.f21603t = 1;
        }
        if ((C2 & 1) == 0) {
            z10 = false;
        }
        this.f21593i = z10;
        int F2 = F() * 10;
        this.f21602s = F2;
        int i11 = this.f21588c;
        if (i11 > F2) {
            this.f21602s = i11;
        }
        this.G = C();
        C();
    }

    private void d() {
        do {
            h();
            if (this.X <= 0) {
                return;
            }
        } while (!D());
    }

    private void e() {
        int i10;
        try {
            i();
            int i11 = 0;
            int i12 = 1;
            int i13 = 8;
            int i14 = 0;
            while (true) {
                int i15 = this.Q;
                if (i11 < i15) {
                    if (this.f21596l) {
                        if (i14 >= i15) {
                            i12++;
                            if (i12 != 2) {
                                if (i12 != 3) {
                                    if (i12 == 4) {
                                        i14 = 1;
                                        i13 = 2;
                                    }
                                } else {
                                    i13 = 4;
                                    i14 = 2;
                                }
                            } else {
                                i14 = 4;
                            }
                        }
                        i10 = i14 + i13;
                    } else {
                        i10 = i14;
                        i14 = i11;
                    }
                    int i16 = i14 + this.O;
                    if (i16 < this.V) {
                        int i17 = this.Code;
                        int i18 = i16 * i17;
                        int i19 = this.N + i18;
                        int i20 = this.P;
                        int i21 = i19 + i20;
                        if (i18 + i17 < i21) {
                            i21 = i18 + i17;
                        }
                        int i22 = i20 * i11;
                        while (i19 < i21) {
                            int i23 = i22 + 1;
                            int i24 = this.E[this.f21600q[i22] & DefaultClassResolver.NAME];
                            if (i24 != 0) {
                                this.Y[i19] = i24;
                            }
                            i19++;
                            i22 = i23;
                        }
                    }
                    i11++;
                    i14 = i10;
                } else {
                    this.J = Code(this.Y, this.Code, this.V, this.J);
                    return;
                }
            }
        } catch (Exception | StackOverflowError unused) {
            this.f21604u = 1;
            ex.I(f21587b, "set pixel error");
        }
    }

    private void f() {
        this.f21604u = 3;
    }

    private void g() {
        this.H = this.f21603t;
        this.R = this.N;
        this.T = this.O;
        this.U = this.P;
        this.W = this.Q;
        this.f21601r = this.y;
        this.K = this.Y;
        this.f21593i = false;
        this.f21603t = 0;
        this.A = null;
        this.f21602s = this.f21588c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int h() {
        /*
            r4 = this;
            int r0 = r4.C()
            r4.X = r0
            r1 = 0
            if (r0 <= 0) goto L2f
        L9:
            int r0 = r4.X     // Catch: java.lang.Exception -> L1c java.io.IOException -> L21
            if (r1 >= r0) goto L28
            java.io.InputStream r2 = r4.f21589d     // Catch: java.lang.Exception -> L1c java.io.IOException -> L21
            byte[] r3 = r4.o     // Catch: java.lang.Exception -> L1c java.io.IOException -> L21
            int r0 = r0 - r1
            int r0 = r2.read(r3, r1, r0)     // Catch: java.lang.Exception -> L1c java.io.IOException -> L21
            r2 = -1
            if (r0 != r2) goto L1a
            goto L28
        L1a:
            int r1 = r1 + r0
            goto L9
        L1c:
            java.lang.String r0 = com.huawei.hms.ads.ds.f21587b
            java.lang.String r2 = "read block fail"
            goto L25
        L21:
            java.lang.String r0 = com.huawei.hms.ads.ds.f21587b
            java.lang.String r2 = "read block IOException"
        L25:
            com.huawei.hms.ads.ex.I(r0, r2)
        L28:
            int r0 = r4.X
            if (r1 >= r0) goto L2f
            r0 = 1
            r4.f21604u = r0
        L2f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.ads.ds.h():int");
    }

    private void i() {
        int i10;
        if (this.Y == null) {
            this.Y = new int[this.Code * this.V];
        }
        int i11 = this.H;
        if (i11 > 0) {
            if (3 == i11) {
                this.K = null;
            }
            int[] iArr = this.K;
            if (iArr != null) {
                this.Y = iArr;
                if (2 == i11) {
                    if (!this.f21593i) {
                        i10 = this.f21601r;
                    } else {
                        i10 = 0;
                    }
                    for (int i12 = 0; i12 < this.W; i12++) {
                        int i13 = ((this.T + i12) * this.Code) + this.R;
                        int i14 = this.U + i13;
                        while (i13 < i14) {
                            this.Y[i13] = i10;
                            i13++;
                        }
                    }
                }
            }
        }
    }

    private boolean j() {
        boolean z10;
        synchronized (this.f) {
            z10 = this.f21592h;
        }
        return z10;
    }

    public boolean I() {
        boolean z10;
        synchronized (this.f21590e) {
            z10 = this.f21591g;
        }
        return z10;
    }

    public void V() {
        synchronized (this.f21590e) {
            if (!this.f21591g) {
                this.f21591g = true;
                androidx.transition.n.g(this.f21589d);
            }
        }
    }

    private void V(int i10) {
        byte[] bArr = this.f21600q;
        if (bArr == null || bArr.length < i10) {
            this.f21600q = new byte[i10];
        }
        if (this.f21597m == null) {
            this.f21597m = new short[I];
        }
        if (this.f21598n == null) {
            this.f21598n = new byte[I];
        }
        if (this.f21599p == null) {
            this.f21599p = new byte[4097];
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0050, code lost:
    
        if (j() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0052, code lost:
    
        V();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0055, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.huawei.hms.ads.du Code() {
        /*
            r4 = this;
            boolean r0 = r4.I()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lc
            r4.Code(r2)
            return r1
        Lc:
            boolean r0 = r4.j()
            if (r0 != 0) goto L4c
            boolean r0 = r4.D()
            if (r0 == 0) goto L1c
            r4.Code(r2)
            goto L4c
        L1c:
            int r0 = r4.C()
            if (r0 == 0) goto Lc
            r3 = 33
            if (r0 == r3) goto L3c
            r3 = 44
            if (r0 == r3) goto L35
            r3 = 59
            if (r0 == r3) goto L31
            r4.f21604u = r2
            goto Lc
        L31:
            r4.Code(r2)
            goto Lc
        L35:
            com.huawei.hms.ads.du r0 = r4.L()
            if (r0 == 0) goto Lc
            return r0
        L3c:
            int r0 = r4.C()
            r3 = 249(0xf9, float:3.49E-43)
            if (r3 != r0) goto L48
            r4.c()
            goto Lc
        L48:
            r4.d()
            goto Lc
        L4c:
            boolean r0 = r4.j()
            if (r0 == 0) goto L55
            r4.V()
        L55:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.ads.ds.Code():com.huawei.hms.ads.du");
    }

    private void Code(boolean z10) {
        synchronized (this.f) {
            this.f21592h = z10;
        }
    }

    private int[] Code(int i10) {
        int i11;
        int[] iArr = new int[256];
        int i12 = i10 * 3;
        byte[] bArr = new byte[i12];
        try {
            i11 = this.f21589d.read(bArr);
        } catch (Exception unused) {
            ex.I(f21587b, "read color table fail");
            i11 = 0;
        }
        if (i11 < i12) {
            this.f21604u = 1;
        } else {
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                int i15 = i13 + 1;
                int i16 = i15 + 1;
                iArr[i14] = ((bArr[i13] & DefaultClassResolver.NAME) << 16) | (-16777216) | ((bArr[i15] & DefaultClassResolver.NAME) << 8) | (bArr[i16] & DefaultClassResolver.NAME);
                i13 = i16 + 1;
            }
        }
        return iArr;
    }
}
