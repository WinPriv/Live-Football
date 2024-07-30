package com.anythink.expressad.exoplayer.b;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private static final int f7520a = 65;

    /* renamed from: b, reason: collision with root package name */
    private static final int f7521b = 400;

    /* renamed from: c, reason: collision with root package name */
    private static final int f7522c = 4000;

    /* renamed from: d, reason: collision with root package name */
    private final int f7523d;

    /* renamed from: e, reason: collision with root package name */
    private final int f7524e;
    private final float f;

    /* renamed from: g, reason: collision with root package name */
    private final float f7525g;

    /* renamed from: h, reason: collision with root package name */
    private final float f7526h;

    /* renamed from: i, reason: collision with root package name */
    private final int f7527i;

    /* renamed from: j, reason: collision with root package name */
    private final int f7528j;

    /* renamed from: k, reason: collision with root package name */
    private final int f7529k;

    /* renamed from: l, reason: collision with root package name */
    private final short[] f7530l;

    /* renamed from: m, reason: collision with root package name */
    private short[] f7531m;

    /* renamed from: n, reason: collision with root package name */
    private int f7532n;
    private short[] o;

    /* renamed from: p, reason: collision with root package name */
    private int f7533p;

    /* renamed from: q, reason: collision with root package name */
    private short[] f7534q;

    /* renamed from: r, reason: collision with root package name */
    private int f7535r;

    /* renamed from: s, reason: collision with root package name */
    private int f7536s;

    /* renamed from: t, reason: collision with root package name */
    private int f7537t;

    /* renamed from: u, reason: collision with root package name */
    private int f7538u;

    /* renamed from: v, reason: collision with root package name */
    private int f7539v;

    /* renamed from: w, reason: collision with root package name */
    private int f7540w;

    /* renamed from: x, reason: collision with root package name */
    private int f7541x;
    private int y;

    public s(int i10, int i11, float f, float f10, int i12) {
        this.f7523d = i10;
        this.f7524e = i11;
        this.f = f;
        this.f7525g = f10;
        this.f7526h = i10 / i12;
        this.f7527i = i10 / 400;
        int i13 = i10 / 65;
        this.f7528j = i13;
        int i14 = i13 * 2;
        this.f7529k = i14;
        this.f7530l = new short[i14];
        this.f7531m = new short[i14 * i11];
        this.o = new short[i14 * i11];
        this.f7534q = new short[i14 * i11];
    }

    private void d(int i10) {
        if (i10 == 0) {
            return;
        }
        short[] sArr = this.f7534q;
        int i11 = this.f7524e;
        System.arraycopy(sArr, i10 * i11, sArr, 0, (this.f7535r - i10) * i11);
        this.f7535r -= i10;
    }

    public final void a(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i10 = this.f7524e;
        int i11 = remaining / i10;
        short[] a10 = a(this.f7531m, this.f7532n, i11);
        this.f7531m = a10;
        shortBuffer.get(a10, this.f7532n * this.f7524e, ((i10 * i11) * 2) / 2);
        this.f7532n += i11;
        d();
    }

    public final void b(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f7524e, this.f7533p);
        shortBuffer.put(this.o, 0, this.f7524e * min);
        int i10 = this.f7533p - min;
        this.f7533p = i10;
        short[] sArr = this.o;
        int i11 = this.f7524e;
        System.arraycopy(sArr, min * i11, sArr, 0, i10 * i11);
    }

    public final int c() {
        return this.f7533p;
    }

    private void c(short[] sArr, int i10, int i11) {
        int i12 = this.f7529k / i11;
        int i13 = this.f7524e;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f7530l[i16] = (short) (i17 / i14);
        }
    }

    private void d() {
        int i10 = this.f7533p;
        float f = this.f;
        float f10 = this.f7525g;
        float f11 = f / f10;
        float f12 = this.f7526h * f10;
        double d10 = f11;
        if (d10 <= 1.00001d && d10 >= 0.99999d) {
            b(this.f7531m, 0, this.f7532n);
            this.f7532n = 0;
        } else {
            a(f11);
        }
        if (f12 != 1.0f) {
            a(f12, i10);
        }
    }

    public final void b() {
        this.f7532n = 0;
        this.f7533p = 0;
        this.f7535r = 0;
        this.f7536s = 0;
        this.f7537t = 0;
        this.f7538u = 0;
        this.f7539v = 0;
        this.f7540w = 0;
        this.f7541x = 0;
        this.y = 0;
    }

    public final void a() {
        int i10;
        int i11 = this.f7532n;
        float f = this.f;
        float f10 = this.f7525g;
        int i12 = this.f7533p + ((int) ((((i11 / (f / f10)) + this.f7535r) / (this.f7526h * f10)) + 0.5f));
        this.f7531m = a(this.f7531m, i11, (this.f7529k * 2) + i11);
        int i13 = 0;
        while (true) {
            i10 = this.f7529k;
            int i14 = this.f7524e;
            if (i13 >= i10 * 2 * i14) {
                break;
            }
            this.f7531m[(i14 * i11) + i13] = 0;
            i13++;
        }
        this.f7532n = (i10 * 2) + this.f7532n;
        d();
        if (this.f7533p > i12) {
            this.f7533p = i12;
        }
        this.f7532n = 0;
        this.f7538u = 0;
        this.f7535r = 0;
    }

    private void c(int i10) {
        int i11 = this.f7533p - i10;
        short[] a10 = a(this.f7534q, this.f7535r, i11);
        this.f7534q = a10;
        short[] sArr = this.o;
        int i12 = this.f7524e;
        System.arraycopy(sArr, i10 * i12, a10, this.f7535r * i12, i12 * i11);
        this.f7533p = i10;
        this.f7535r += i11;
    }

    private void b(short[] sArr, int i10, int i11) {
        short[] a10 = a(this.o, this.f7533p, i11);
        this.o = a10;
        int i12 = this.f7524e;
        System.arraycopy(sArr, i10 * i12, a10, this.f7533p * i12, i12 * i11);
        this.f7533p += i11;
    }

    private int b(int i10) {
        int min = Math.min(this.f7529k, this.f7538u);
        b(this.f7531m, i10, min);
        this.f7538u -= min;
        return min;
    }

    private short[] a(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f7524e;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    private short b(short[] sArr, int i10, int i11, int i12) {
        short s10 = sArr[i10];
        short s11 = sArr[i10 + this.f7524e];
        int i13 = this.f7537t * i11;
        int i14 = this.f7536s;
        int i15 = i14 * i12;
        int i16 = (i14 + 1) * i12;
        int i17 = i16 - i13;
        int i18 = i16 - i15;
        return (short) ((((i18 - i17) * s11) + (s10 * i17)) / i18);
    }

    private void a(int i10) {
        int i11 = this.f7532n - i10;
        short[] sArr = this.f7531m;
        int i12 = this.f7524e;
        System.arraycopy(sArr, i10 * i12, sArr, 0, i12 * i11);
        this.f7532n = i11;
    }

    private int b(short[] sArr, int i10, float f, int i11) {
        int i12;
        if (f < 0.5f) {
            i12 = (int) ((i11 * f) / (1.0f - f));
        } else {
            this.f7538u = (int) ((((2.0f * f) - 1.0f) * i11) / (1.0f - f));
            i12 = i11;
        }
        int i13 = i11 + i12;
        short[] a10 = a(this.o, this.f7533p, i13);
        this.o = a10;
        int i14 = this.f7524e;
        System.arraycopy(sArr, i10 * i14, a10, this.f7533p * i14, i14 * i11);
        a(i12, this.f7524e, this.o, this.f7533p + i11, sArr, i10 + i11, sArr, i10);
        this.f7533p += i13;
        return i12;
    }

    private int a(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f7524e;
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
        this.f7541x = i15 / i16;
        this.y = i17 / i14;
        return i16;
    }

    private boolean a(int i10, int i11) {
        return i10 != 0 && this.f7539v != 0 && i11 <= i10 * 3 && i10 * 2 > this.f7540w * 3;
    }

    private int a(short[] sArr, int i10) {
        int i11;
        int i12 = this.f7523d;
        int i13 = i12 > f7522c ? i12 / f7522c : 1;
        if (this.f7524e == 1 && i13 == 1) {
            i11 = a(sArr, i10, this.f7527i, this.f7528j);
        } else {
            c(sArr, i10, i13);
            int a10 = a(this.f7530l, 0, this.f7527i / i13, this.f7528j / i13);
            if (i13 != 1) {
                int i14 = a10 * i13;
                int i15 = i13 * 4;
                int i16 = i14 - i15;
                int i17 = i14 + i15;
                int i18 = this.f7527i;
                if (i16 < i18) {
                    i16 = i18;
                }
                int i19 = this.f7528j;
                if (i17 > i19) {
                    i17 = i19;
                }
                if (this.f7524e == 1) {
                    i11 = a(sArr, i10, i16, i17);
                } else {
                    c(sArr, i10, 1);
                    i11 = a(this.f7530l, 0, i16, i17);
                }
            } else {
                i11 = a10;
            }
        }
        int i20 = this.f7541x;
        int i21 = i20 != 0 && this.f7539v != 0 && this.y <= i20 * 3 && i20 * 2 > this.f7540w * 3 ? this.f7539v : i11;
        this.f7540w = i20;
        this.f7539v = i11;
        return i21;
    }

    private void a(float f, int i10) {
        int i11;
        int i12;
        int i13;
        if (this.f7533p == i10) {
            return;
        }
        int i14 = this.f7523d;
        int i15 = (int) (i14 / f);
        while (true) {
            if (i15 <= 16384 && i14 <= 16384) {
                break;
            }
            i15 /= 2;
            i14 /= 2;
        }
        int i16 = this.f7533p - i10;
        short[] a10 = a(this.f7534q, this.f7535r, i16);
        this.f7534q = a10;
        short[] sArr = this.o;
        int i17 = this.f7524e;
        System.arraycopy(sArr, i10 * i17, a10, this.f7535r * i17, i17 * i16);
        this.f7533p = i10;
        this.f7535r += i16;
        int i18 = 0;
        while (true) {
            i11 = this.f7535r;
            if (i18 >= i11 - 1) {
                break;
            }
            while (true) {
                i12 = this.f7536s;
                int i19 = (i12 + 1) * i15;
                i13 = this.f7537t;
                if (i19 <= i13 * i14) {
                    break;
                }
                this.o = a(this.o, this.f7533p, 1);
                int i20 = 0;
                while (true) {
                    int i21 = this.f7524e;
                    if (i20 < i21) {
                        short[] sArr2 = this.o;
                        int i22 = (this.f7533p * i21) + i20;
                        short[] sArr3 = this.f7534q;
                        int i23 = (i18 * i21) + i20;
                        short s10 = sArr3[i23];
                        short s11 = sArr3[i23 + i21];
                        int i24 = this.f7537t * i14;
                        int i25 = this.f7536s;
                        int i26 = i25 * i15;
                        int i27 = (i25 + 1) * i15;
                        int i28 = i27 - i24;
                        int i29 = i27 - i26;
                        sArr2[i22] = (short) ((((i29 - i28) * s11) + (s10 * i28)) / i29);
                        i20++;
                    }
                }
                this.f7537t++;
                this.f7533p++;
            }
            int i30 = i12 + 1;
            this.f7536s = i30;
            if (i30 == i14) {
                this.f7536s = 0;
                com.anythink.expressad.exoplayer.k.a.b(i13 == i15);
                this.f7537t = 0;
            }
            i18++;
        }
        int i31 = i11 - 1;
        if (i31 != 0) {
            short[] sArr4 = this.f7534q;
            int i32 = this.f7524e;
            System.arraycopy(sArr4, i31 * i32, sArr4, 0, (i11 - i31) * i32);
            this.f7535r -= i31;
        }
    }

    private int a(short[] sArr, int i10, float f, int i11) {
        int i12;
        if (f >= 2.0f) {
            i12 = (int) (i11 / (f - 1.0f));
        } else {
            this.f7538u = (int) (((2.0f - f) * i11) / (f - 1.0f));
            i12 = i11;
        }
        short[] a10 = a(this.o, this.f7533p, i12);
        this.o = a10;
        a(i12, this.f7524e, a10, this.f7533p, sArr, i10, sArr, i10 + i11);
        this.f7533p += i12;
        return i12;
    }

    private void a(float f) {
        int i10;
        int i11;
        int i12;
        int i13 = this.f7532n;
        if (i13 < this.f7529k) {
            return;
        }
        int i14 = 0;
        do {
            int i15 = this.f7538u;
            if (i15 > 0) {
                int min = Math.min(this.f7529k, i15);
                b(this.f7531m, i14, min);
                this.f7538u -= min;
                i14 += min;
            } else {
                short[] sArr = this.f7531m;
                int i16 = this.f7523d;
                int i17 = i16 > f7522c ? i16 / f7522c : 1;
                if (this.f7524e == 1 && i17 == 1) {
                    i10 = a(sArr, i14, this.f7527i, this.f7528j);
                } else {
                    c(sArr, i14, i17);
                    int a10 = a(this.f7530l, 0, this.f7527i / i17, this.f7528j / i17);
                    if (i17 != 1) {
                        int i18 = a10 * i17;
                        int i19 = i17 * 4;
                        int i20 = i18 - i19;
                        int i21 = i18 + i19;
                        int i22 = this.f7527i;
                        if (i20 < i22) {
                            i20 = i22;
                        }
                        int i23 = this.f7528j;
                        if (i21 > i23) {
                            i21 = i23;
                        }
                        if (this.f7524e == 1) {
                            i10 = a(sArr, i14, i20, i21);
                        } else {
                            c(sArr, i14, 1);
                            i10 = a(this.f7530l, 0, i20, i21);
                        }
                    } else {
                        i10 = a10;
                    }
                }
                int i24 = this.f7541x;
                int i25 = i24 != 0 && this.f7539v != 0 && this.y <= i24 * 3 && i24 * 2 > this.f7540w * 3 ? this.f7539v : i10;
                this.f7540w = i24;
                this.f7539v = i10;
                if (f > 1.0d) {
                    short[] sArr2 = this.f7531m;
                    if (f >= 2.0f) {
                        i12 = (int) (i25 / (f - 1.0f));
                    } else {
                        this.f7538u = (int) (((2.0f - f) * i25) / (f - 1.0f));
                        i12 = i25;
                    }
                    short[] a11 = a(this.o, this.f7533p, i12);
                    this.o = a11;
                    a(i12, this.f7524e, a11, this.f7533p, sArr2, i14, sArr2, i14 + i25);
                    this.f7533p += i12;
                    i14 = i25 + i12 + i14;
                } else {
                    short[] sArr3 = this.f7531m;
                    if (f < 0.5f) {
                        i11 = (int) ((i25 * f) / (1.0f - f));
                    } else {
                        this.f7538u = (int) ((((2.0f * f) - 1.0f) * i25) / (1.0f - f));
                        i11 = i25;
                    }
                    int i26 = i25 + i11;
                    short[] a12 = a(this.o, this.f7533p, i26);
                    this.o = a12;
                    int i27 = this.f7524e;
                    System.arraycopy(sArr3, i14 * i27, a12, this.f7533p * i27, i27 * i25);
                    a(i11, this.f7524e, this.o, this.f7533p + i25, sArr3, i14 + i25, sArr3, i14);
                    this.f7533p += i26;
                    i14 += i11;
                }
            }
        } while (this.f7529k + i14 <= i13);
        int i28 = this.f7532n - i14;
        short[] sArr4 = this.f7531m;
        int i29 = this.f7524e;
        System.arraycopy(sArr4, i14 * i29, sArr4, 0, i29 * i28);
        this.f7532n = i28;
    }

    private static void a(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
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
}
