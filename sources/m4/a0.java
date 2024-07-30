package m4;

import com.huawei.openalliance.ad.constant.ag;
import java.util.Arrays;

/* compiled from: Sonic.java */
/* loaded from: classes2.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f32671a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32672b;

    /* renamed from: c, reason: collision with root package name */
    public final float f32673c;

    /* renamed from: d, reason: collision with root package name */
    public final float f32674d;

    /* renamed from: e, reason: collision with root package name */
    public final float f32675e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final int f32676g;

    /* renamed from: h, reason: collision with root package name */
    public final int f32677h;

    /* renamed from: i, reason: collision with root package name */
    public final short[] f32678i;

    /* renamed from: j, reason: collision with root package name */
    public short[] f32679j;

    /* renamed from: k, reason: collision with root package name */
    public int f32680k;

    /* renamed from: l, reason: collision with root package name */
    public short[] f32681l;

    /* renamed from: m, reason: collision with root package name */
    public int f32682m;

    /* renamed from: n, reason: collision with root package name */
    public short[] f32683n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public int f32684p;

    /* renamed from: q, reason: collision with root package name */
    public int f32685q;

    /* renamed from: r, reason: collision with root package name */
    public int f32686r;

    /* renamed from: s, reason: collision with root package name */
    public int f32687s;

    /* renamed from: t, reason: collision with root package name */
    public int f32688t;

    /* renamed from: u, reason: collision with root package name */
    public int f32689u;

    /* renamed from: v, reason: collision with root package name */
    public int f32690v;

    public a0(int i10, int i11, float f, float f10, int i12) {
        this.f32671a = i10;
        this.f32672b = i11;
        this.f32673c = f;
        this.f32674d = f10;
        this.f32675e = i10 / i12;
        this.f = i10 / ag.f21998i;
        int i13 = i10 / 65;
        this.f32676g = i13;
        int i14 = i13 * 2;
        this.f32677h = i14;
        this.f32678i = new short[i14];
        this.f32679j = new short[i14 * i11];
        this.f32681l = new short[i14 * i11];
        this.f32683n = new short[i14 * i11];
    }

    public static void d(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr3[i17] * i19) + ((i10 - i19) * sArr2[i18])) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    public final void a(short[] sArr, int i10, int i11) {
        int i12 = this.f32677h / i11;
        int i13 = this.f32672b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f32678i[i16] = (short) (i17 / i14);
        }
    }

    public final short[] b(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f32672b;
        int i13 = length / i12;
        if (i10 + i11 <= i13) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public final int c(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f32672b;
        int i14 = com.anythink.expressad.exoplayer.k.p.f9095b;
        int i15 = 1;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int i18 = 0;
            for (int i19 = 0; i19 < i11; i19++) {
                i18 += Math.abs(sArr[i13 + i19] - sArr[(i13 + i11) + i19]);
            }
            if (i18 * i16 < i15 * i11) {
                i16 = i11;
                i15 = i18;
            }
            if (i18 * i14 > i17 * i11) {
                i14 = i11;
                i17 = i18;
            }
            i11++;
        }
        this.f32689u = i15 / i16;
        this.f32690v = i17 / i14;
        return i16;
    }

    public final void e() {
        int i10;
        int i11;
        int i12;
        float f;
        int i13;
        boolean z10;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z11;
        int i22 = this.f32682m;
        float f10 = this.f32673c;
        float f11 = this.f32674d;
        float f12 = f10 / f11;
        float f13 = this.f32675e * f11;
        double d10 = f12;
        int i23 = this.f32671a;
        int i24 = this.f32672b;
        if (d10 <= 1.00001d && d10 >= 0.99999d) {
            short[] sArr = this.f32679j;
            int i25 = this.f32680k;
            short[] b10 = b(this.f32681l, i22, i25);
            this.f32681l = b10;
            System.arraycopy(sArr, 0 * i24, b10, this.f32682m * i24, i24 * i25);
            this.f32682m += i25;
            this.f32680k = 0;
        } else {
            int i26 = this.f32680k;
            int i27 = this.f32677h;
            if (i26 >= i27) {
                int i28 = 0;
                while (true) {
                    int i29 = this.f32686r;
                    if (i29 > 0) {
                        int min = Math.min(i27, i29);
                        short[] sArr2 = this.f32679j;
                        short[] b11 = b(this.f32681l, this.f32682m, min);
                        this.f32681l = b11;
                        i10 = i22;
                        System.arraycopy(sArr2, i28 * i24, b11, this.f32682m * i24, i24 * min);
                        this.f32682m += min;
                        this.f32686r -= min;
                        i28 += min;
                        f = f13;
                        i12 = i23;
                    } else {
                        i10 = i22;
                        short[] sArr3 = this.f32679j;
                        if (i23 > 4000) {
                            i11 = i23 / 4000;
                        } else {
                            i11 = 1;
                        }
                        int i30 = this.f32676g;
                        int i31 = this.f;
                        if (i24 == 1 && i11 == 1) {
                            i13 = c(sArr3, i28, i31, i30);
                            f = f13;
                            i12 = i23;
                        } else {
                            a(sArr3, i28, i11);
                            i12 = i23;
                            short[] sArr4 = this.f32678i;
                            f = f13;
                            int c10 = c(sArr4, 0, i31 / i11, i30 / i11);
                            if (i11 != 1) {
                                int i32 = c10 * i11;
                                int i33 = i11 * 4;
                                int i34 = i32 - i33;
                                int i35 = i32 + i33;
                                if (i34 >= i31) {
                                    i31 = i34;
                                }
                                if (i35 <= i30) {
                                    i30 = i35;
                                }
                                if (i24 == 1) {
                                    i13 = c(sArr3, i28, i31, i30);
                                } else {
                                    a(sArr3, i28, 1);
                                    i13 = c(sArr4, 0, i31, i30);
                                }
                            } else {
                                i13 = c10;
                            }
                        }
                        int i36 = this.f32689u;
                        int i37 = this.f32690v;
                        if (i36 != 0 && this.f32687s != 0 && i37 <= i36 * 3 && i36 * 2 > this.f32688t * 3) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            i14 = this.f32687s;
                        } else {
                            i14 = i13;
                        }
                        this.f32688t = i36;
                        this.f32687s = i13;
                        if (d10 > 1.0d) {
                            short[] sArr5 = this.f32679j;
                            if (f12 >= 2.0f) {
                                i16 = (int) (i14 / (f12 - 1.0f));
                            } else {
                                this.f32686r = (int) (((2.0f - f12) * i14) / (f12 - 1.0f));
                                i16 = i14;
                            }
                            short[] b12 = b(this.f32681l, this.f32682m, i16);
                            this.f32681l = b12;
                            int i38 = i28;
                            d(i16, this.f32672b, b12, this.f32682m, sArr5, i38, sArr5, i28 + i14);
                            this.f32682m += i16;
                            i28 = i14 + i16 + i38;
                        } else {
                            int i39 = i28;
                            short[] sArr6 = this.f32679j;
                            if (f12 < 0.5f) {
                                i15 = (int) ((i14 * f12) / (1.0f - f12));
                            } else {
                                this.f32686r = (int) ((((2.0f * f12) - 1.0f) * i14) / (1.0f - f12));
                                i15 = i14;
                            }
                            int i40 = i14 + i15;
                            short[] b13 = b(this.f32681l, this.f32682m, i40);
                            this.f32681l = b13;
                            System.arraycopy(sArr6, i39 * i24, b13, this.f32682m * i24, i24 * i14);
                            d(i15, this.f32672b, this.f32681l, this.f32682m + i14, sArr6, i39 + i14, sArr6, i39);
                            this.f32682m += i40;
                            i28 = i39 + i15;
                        }
                    }
                    if (i28 + i27 > i26) {
                        break;
                    }
                    i22 = i10;
                    i23 = i12;
                    f13 = f;
                }
                int i41 = this.f32680k - i28;
                short[] sArr7 = this.f32679j;
                System.arraycopy(sArr7, i28 * i24, sArr7, 0, i24 * i41);
                this.f32680k = i41;
                if (f == 1.0f && this.f32682m != (i17 = i10)) {
                    int i42 = i12;
                    int i43 = (int) (i42 / f);
                    int i44 = i42;
                    while (true) {
                        if (i43 <= 16384 && i44 <= 16384) {
                            break;
                        }
                        i43 /= 2;
                        i44 /= 2;
                    }
                    int i45 = this.f32682m - i17;
                    short[] b14 = b(this.f32683n, this.o, i45);
                    this.f32683n = b14;
                    System.arraycopy(this.f32681l, i17 * i24, b14, this.o * i24, i24 * i45);
                    this.f32682m = i17;
                    this.o += i45;
                    int i46 = 0;
                    while (true) {
                        i18 = this.o;
                        i19 = i18 - 1;
                        if (i46 >= i19) {
                            break;
                        }
                        while (true) {
                            i20 = this.f32684p + 1;
                            int i47 = i20 * i43;
                            i21 = this.f32685q;
                            if (i47 <= i21 * i44) {
                                break;
                            }
                            this.f32681l = b(this.f32681l, this.f32682m, 1);
                            for (int i48 = 0; i48 < i24; i48++) {
                                short[] sArr8 = this.f32681l;
                                int i49 = (this.f32682m * i24) + i48;
                                short[] sArr9 = this.f32683n;
                                int i50 = (i46 * i24) + i48;
                                short s10 = sArr9[i50];
                                short s11 = sArr9[i50 + i24];
                                int i51 = this.f32685q * i44;
                                int i52 = this.f32684p;
                                int i53 = i52 * i43;
                                int i54 = (i52 + 1) * i43;
                                int i55 = i54 - i51;
                                int i56 = i54 - i53;
                                sArr8[i49] = (short) ((((i56 - i55) * s11) + (s10 * i55)) / i56);
                            }
                            this.f32685q++;
                            this.f32682m++;
                        }
                        this.f32684p = i20;
                        if (i20 == i44) {
                            this.f32684p = 0;
                            if (i21 == i43) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            d6.a.d(z11);
                            this.f32685q = 0;
                        }
                        i46++;
                    }
                    if (i19 != 0) {
                        short[] sArr10 = this.f32683n;
                        System.arraycopy(sArr10, i19 * i24, sArr10, 0, (i18 - i19) * i24);
                        this.o -= i19;
                        return;
                    }
                    return;
                }
            }
        }
        i10 = i22;
        f = f13;
        i12 = i23;
        if (f == 1.0f) {
        }
    }
}
