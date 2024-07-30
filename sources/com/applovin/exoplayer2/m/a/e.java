package com.applovin.exoplayer2.m.a;

import com.huawei.hms.ads.gl;

/* loaded from: classes.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    public final a f16399a;

    /* renamed from: b, reason: collision with root package name */
    public final a f16400b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16401c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f16402d;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final b[] f16403a;

        public a(b... bVarArr) {
            this.f16403a = bVarArr;
        }

        public int a() {
            return this.f16403a.length;
        }

        public b a(int i10) {
            return this.f16403a[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f16404a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16405b;

        /* renamed from: c, reason: collision with root package name */
        public final float[] f16406c;

        /* renamed from: d, reason: collision with root package name */
        public final float[] f16407d;

        public b(int i10, float[] fArr, float[] fArr2, int i11) {
            boolean z10;
            this.f16404a = i10;
            if (fArr.length * 2 == fArr2.length * 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            com.applovin.exoplayer2.l.a.a(z10);
            this.f16406c = fArr;
            this.f16407d = fArr2;
            this.f16405b = i11;
        }
    }

    public e(a aVar, int i10) {
        this(aVar, aVar, i10);
    }

    public static e a(int i10) {
        return a(50.0f, 36, 72, 180.0f, 360.0f, i10);
    }

    public e(a aVar, a aVar2, int i10) {
        this.f16399a = aVar;
        this.f16400b = aVar2;
        this.f16401c = i10;
        this.f16402d = aVar == aVar2;
    }

    public static e a(float f, int i10, int i11, float f10, float f11, int i12) {
        int i13;
        float f12;
        int i14;
        int i15;
        int i16;
        float[] fArr;
        int i17;
        int i18 = i10;
        int i19 = i11;
        com.applovin.exoplayer2.l.a.a(f > gl.Code);
        com.applovin.exoplayer2.l.a.a(i18 >= 1);
        com.applovin.exoplayer2.l.a.a(i19 >= 1);
        com.applovin.exoplayer2.l.a.a(f10 > gl.Code && f10 <= 180.0f);
        com.applovin.exoplayer2.l.a.a(f11 > gl.Code && f11 <= 360.0f);
        float radians = (float) Math.toRadians(f10);
        float radians2 = (float) Math.toRadians(f11);
        float f13 = radians / i18;
        float f14 = radians2 / i19;
        int i20 = i19 + 1;
        int i21 = ((i20 * 2) + 2) * i18;
        float[] fArr2 = new float[i21 * 3];
        float[] fArr3 = new float[i21 * 2];
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        while (i22 < i18) {
            float f15 = radians / 2.0f;
            float f16 = (i22 * f13) - f15;
            int i25 = i22 + 1;
            float f17 = (i25 * f13) - f15;
            int i26 = 0;
            while (i26 < i20) {
                float f18 = f16;
                int i27 = i25;
                int i28 = 0;
                int i29 = 2;
                while (i28 < i29) {
                    if (i28 == 0) {
                        f12 = f18;
                        i13 = i20;
                    } else {
                        i13 = i20;
                        f12 = f17;
                    }
                    float f19 = i26 * f14;
                    float f20 = f14;
                    int i30 = i23 + 1;
                    int i31 = i26;
                    double d10 = f;
                    float f21 = f13;
                    double d11 = (f19 + 3.1415927f) - (radians2 / 2.0f);
                    int i32 = i28;
                    double d12 = f12;
                    float[] fArr4 = fArr3;
                    float f22 = f17;
                    fArr2[i23] = -((float) (Math.cos(d12) * Math.sin(d11) * d10));
                    int i33 = i30 + 1;
                    int i34 = i22;
                    fArr2[i30] = (float) (Math.sin(d12) * d10);
                    int i35 = i33 + 1;
                    fArr2[i33] = (float) (Math.cos(d12) * Math.cos(d11) * d10);
                    int i36 = i24 + 1;
                    fArr4[i24] = f19 / radians2;
                    int i37 = i36 + 1;
                    fArr4[i36] = ((i34 + i32) * f21) / radians;
                    if (i31 == 0 && i32 == 0) {
                        i14 = i11;
                        i15 = i31;
                        i16 = i32;
                    } else {
                        i14 = i11;
                        i15 = i31;
                        i16 = i32;
                        if (i15 != i14 || i16 != 1) {
                            fArr = fArr4;
                            i17 = 2;
                            i24 = i37;
                            i23 = i35;
                            i28 = i16 + 1;
                            i19 = i14;
                            i26 = i15;
                            fArr3 = fArr;
                            i29 = i17;
                            i22 = i34;
                            i20 = i13;
                            f14 = f20;
                            f13 = f21;
                            f17 = f22;
                        }
                    }
                    System.arraycopy(fArr2, i35 - 3, fArr2, i35, 3);
                    i35 += 3;
                    fArr = fArr4;
                    i17 = 2;
                    System.arraycopy(fArr, i37 - 2, fArr, i37, 2);
                    i37 += 2;
                    i24 = i37;
                    i23 = i35;
                    i28 = i16 + 1;
                    i19 = i14;
                    i26 = i15;
                    fArr3 = fArr;
                    i29 = i17;
                    i22 = i34;
                    i20 = i13;
                    f14 = f20;
                    f13 = f21;
                    f17 = f22;
                }
                float f23 = f13;
                int i38 = i26;
                int i39 = i19;
                int i40 = i38 + 1;
                f16 = f18;
                i25 = i27;
                i20 = i20;
                f13 = f23;
                f17 = f17;
                i19 = i39;
                i26 = i40;
            }
            i18 = i10;
            i22 = i25;
        }
        return new e(new a(new b(0, fArr2, fArr3, 1)), i12);
    }
}
