package ka;

import android.graphics.Bitmap;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class w5 {
    public int A;
    public int B;
    public Bitmap C;
    public int[] D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int[] O;

    /* renamed from: a, reason: collision with root package name */
    public final int f32048a;

    /* renamed from: b, reason: collision with root package name */
    public final InputStream f32049b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f32050c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final Object f32051d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f32052e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f32053g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f32054h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f32055i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f32056j;

    /* renamed from: k, reason: collision with root package name */
    public short[] f32057k;

    /* renamed from: l, reason: collision with root package name */
    public byte[] f32058l;

    /* renamed from: m, reason: collision with root package name */
    public final byte[] f32059m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f32060n;
    public byte[] o;

    /* renamed from: p, reason: collision with root package name */
    public int f32061p;

    /* renamed from: q, reason: collision with root package name */
    public int f32062q;

    /* renamed from: r, reason: collision with root package name */
    public int f32063r;

    /* renamed from: s, reason: collision with root package name */
    public int f32064s;

    /* renamed from: t, reason: collision with root package name */
    public int f32065t;

    /* renamed from: u, reason: collision with root package name */
    public int f32066u;

    /* renamed from: v, reason: collision with root package name */
    public int f32067v;

    /* renamed from: w, reason: collision with root package name */
    public int f32068w;

    /* renamed from: x, reason: collision with root package name */
    public int f32069x;
    public int[] y;

    /* renamed from: z, reason: collision with root package name */
    public int[] f32070z;

    public w5(InputStream inputStream) {
        Object obj = new Object();
        this.f32051d = obj;
        this.f32052e = false;
        this.f = false;
        this.f32053g = false;
        this.f32059m = new byte[512];
        this.f32062q = 100;
        this.f32063r = 0;
        this.f32064s = 0;
        this.y = null;
        this.B = 0;
        this.E = 0;
        this.N = 0;
        this.O = null;
        this.f32049b = inputStream;
        this.f32048a = 100;
        if (inputStream == null) {
            synchronized (obj) {
                this.f = true;
            }
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < 6; i10++) {
            stringBuffer.append((char) c());
        }
        if (!stringBuffer.toString().startsWith("GIF")) {
            this.f32064s = 1;
        } else {
            this.f32065t = d();
            this.f32066u = d();
            this.f32054h = (c() & 128) != 0;
            this.f32067v = (int) Math.pow(2.0d, (r6 & 7) + 1);
            this.f32068w = c();
            c();
            if (this.f32054h && !e()) {
                int[] a10 = a(this.f32067v);
                this.y = a10;
                this.f32069x = a10[this.f32068w];
            }
        }
        if (e()) {
            synchronized (this.f32051d) {
                this.f = true;
            }
            b();
        }
    }

    public final int[] a(int i10) {
        int i11;
        int[] iArr = new int[256];
        int i12 = i10 * 3;
        byte[] bArr = new byte[i12];
        try {
            i11 = this.f32049b.read(bArr);
        } catch (Exception unused) {
            n7.g("w5", "read color table fail");
            i11 = 0;
        }
        if (i11 < i12) {
            this.f32064s = 1;
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

    public final void b() {
        synchronized (this.f32050c) {
            if (!this.f32052e) {
                this.f32052e = true;
                androidx.transition.n.D(this.f32049b);
            }
        }
    }

    public final int c() {
        try {
            return this.f32049b.read();
        } catch (Exception unused) {
            this.f32064s = 1;
            return 0;
        }
    }

    public final int d() {
        return c() | (c() << 8);
    }

    public final boolean e() {
        if (this.f32064s != 0) {
            return true;
        }
        return false;
    }

    public final int f() {
        boolean z10;
        boolean z11;
        int[] iArr;
        this.F = d();
        this.G = d();
        this.H = d();
        this.I = d();
        int c10 = c();
        int i10 = 0;
        if ((c10 & 128) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f32055i = z10;
        if ((c10 & 64) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f32056j = z11;
        int pow = (int) Math.pow(2.0d, (c10 & 7) + 1);
        if (this.f32055i) {
            this.f32070z = a(pow);
        } else {
            this.f32070z = this.y;
            if (this.f32068w == this.A) {
                this.f32069x = 0;
            }
        }
        if (this.f32053g && (iArr = this.f32070z) != null && iArr.length > 0) {
            int length = iArr.length;
            int i11 = this.A;
            if (length > i11) {
                int i12 = iArr[i11];
                iArr[i11] = 0;
                i10 = i12;
            }
        }
        if (this.f32070z == null) {
            this.f32064s = 1;
        }
        return i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v21, types: [short] */
    /* JADX WARN: Type inference failed for: r2v23 */
    public final void g() {
        int i10;
        int i11;
        int i12;
        boolean z10;
        short s10;
        boolean z11;
        int i13 = this.H * this.I;
        byte[] bArr = this.o;
        if (bArr == null || bArr.length < i13) {
            this.o = new byte[i13];
        }
        if (this.f32057k == null) {
            this.f32057k = new short[4096];
        }
        if (this.f32058l == null) {
            this.f32058l = new byte[4096];
        }
        if (this.f32060n == null) {
            this.f32060n = new byte[4097];
        }
        int c10 = c();
        boolean z12 = true;
        int i14 = 1 << c10;
        int i15 = i14 + 1;
        int i16 = i14 + 2;
        int i17 = c10 + 1;
        int i18 = (1 << i17) - 1;
        for (int i19 = 0; i19 < i14; i19++) {
            this.f32057k[i19] = 0;
            this.f32058l[i19] = (byte) i19;
        }
        int i20 = i17;
        int i21 = i18;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = -1;
        int i31 = i16;
        while (i22 < i13) {
            if (i23 == 0) {
                if (i24 < i20) {
                    if (i26 == 0) {
                        i26 = j();
                        if (i26 <= 0) {
                            break;
                        } else {
                            i27 = 0;
                        }
                    }
                    i25 += (this.f32059m[i27] & DefaultClassResolver.NAME) << i24;
                    i24 += 8;
                    i27++;
                    i26--;
                } else {
                    int i32 = i25 & i21;
                    i25 >>= i20;
                    i24 -= i20;
                    if (i32 <= i31 && i32 != i15) {
                        z10 = false;
                    } else {
                        z10 = z12;
                    }
                    if (z10) {
                        break;
                    }
                    if (i32 == i14) {
                        i20 = i17;
                        i31 = i16;
                        i21 = i18;
                        i30 = -1;
                    } else if (i30 == -1) {
                        this.f32060n[i23] = this.f32058l[i32];
                        i23++;
                        i30 = i32;
                        i28 = i30;
                        i17 = i17;
                        z12 = true;
                    } else {
                        i10 = i17;
                        if (i32 == i31) {
                            this.f32060n[i23] = (byte) i28;
                            s10 = i30;
                            i23++;
                        } else {
                            s10 = i32;
                        }
                        while (s10 > i14) {
                            this.f32060n[i23] = this.f32058l[s10];
                            s10 = this.f32057k[s10];
                            i23++;
                            i14 = i14;
                        }
                        i11 = i14;
                        byte[] bArr2 = this.f32058l;
                        int i33 = bArr2[s10] & DefaultClassResolver.NAME;
                        if (i31 >= 4096) {
                            break;
                        }
                        int i34 = i23 + 1;
                        i12 = i15;
                        byte b10 = (byte) i33;
                        this.f32060n[i23] = b10;
                        this.f32057k[i31] = (short) i30;
                        bArr2[i31] = b10;
                        i31++;
                        if ((i31 & i21) == 0 && i31 < 4096) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            i20++;
                            i21 += i31;
                        }
                        i30 = i32;
                        i23 = i34;
                        i28 = i33;
                    }
                }
            } else {
                i10 = i17;
                i11 = i14;
                i12 = i15;
            }
            i23--;
            this.o[i29] = this.f32060n[i23];
            i22++;
            i29++;
            i17 = i10;
            i14 = i11;
            i15 = i12;
            z12 = true;
        }
        for (int i35 = i29; i35 < i13; i35++) {
            this.o[i35] = 0;
        }
    }

    public final void h() {
        Bitmap.Config config;
        int i10;
        try {
            k();
            int i11 = 8;
            int i12 = 1;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int i15 = this.I;
                if (i13 >= i15) {
                    break;
                }
                if (this.f32056j) {
                    if (i14 >= i15) {
                        i12++;
                        if (i12 != 2) {
                            if (i12 != 3) {
                                if (i12 == 4) {
                                    i14 = 1;
                                    i11 = 2;
                                }
                            } else {
                                i11 = 4;
                                i14 = 2;
                            }
                        } else {
                            i14 = 4;
                        }
                    }
                    i10 = i14 + i11;
                } else {
                    i10 = i14;
                    i14 = i13;
                }
                int i16 = i14 + this.G;
                if (i16 < this.f32066u) {
                    int i17 = this.f32065t;
                    int i18 = i16 * i17;
                    int i19 = this.F + i18;
                    int i20 = this.H;
                    int i21 = i19 + i20;
                    if (i18 + i17 < i21) {
                        i21 = i18 + i17;
                    }
                    int i22 = i20 * i13;
                    while (i19 < i21) {
                        int i23 = i22 + 1;
                        int i24 = this.f32070z[this.o[i22] & DefaultClassResolver.NAME];
                        if (i24 != 0) {
                            this.O[i19] = i24;
                        }
                        i19++;
                        i22 = i23;
                    }
                }
                i13++;
                i14 = i10;
            }
            int[] iArr = this.O;
            int i25 = this.f32065t;
            int i26 = this.f32066u;
            Bitmap bitmap = this.C;
            if (bitmap == null) {
                if (com.huawei.openalliance.ad.ppskit.utils.d0.i() > 62914560) {
                    config = Bitmap.Config.ARGB_8888;
                } else {
                    config = Bitmap.Config.RGB_565;
                }
                if (n7.d()) {
                    n7.c("w5", "create image with config %s", config);
                }
                bitmap = Bitmap.createBitmap(i25, i26, config);
            }
            bitmap.setPixels(iArr, 0, i25, 0, 0, i25, i26);
            this.C = bitmap;
        } catch (Throwable unused) {
            this.f32064s = 1;
            n7.g("w5", "set pixel error");
        }
    }

    public final void i() {
        this.B = this.f32063r;
        this.J = this.F;
        this.K = this.G;
        this.L = this.H;
        this.M = this.I;
        this.f32061p = this.f32069x;
        this.D = this.O;
        this.f32053g = false;
        this.f32063r = 0;
        this.f32062q = this.f32048a;
    }

    public final int j() {
        int c10 = c();
        this.N = c10;
        int i10 = 0;
        if (c10 > 0) {
            while (true) {
                try {
                    int i11 = this.N;
                    if (i10 >= i11) {
                        break;
                    }
                    int read = this.f32049b.read(this.f32059m, i10, i11 - i10);
                    if (read == -1) {
                        break;
                    }
                    i10 += read;
                } catch (Throwable th) {
                    e0.i.p(th, "read block:", "w5");
                }
            }
            if (i10 < this.N) {
                this.f32064s = 1;
            }
        }
        return i10;
    }

    public final void k() {
        int i10;
        if (this.O == null) {
            this.O = new int[this.f32065t * this.f32066u];
        }
        int i11 = this.B;
        if (i11 > 0) {
            if (3 == i11) {
                this.D = null;
            }
            int[] iArr = this.D;
            if (iArr != null) {
                this.O = iArr;
                if (2 == i11) {
                    if (!this.f32053g) {
                        i10 = this.f32061p;
                    } else {
                        i10 = 0;
                    }
                    for (int i12 = 0; i12 < this.M; i12++) {
                        int i13 = ((this.K + i12) * this.f32065t) + this.J;
                        int i14 = this.L + i13;
                        while (i13 < i14) {
                            this.O[i13] = i10;
                            i13++;
                        }
                    }
                }
            }
        }
    }
}
