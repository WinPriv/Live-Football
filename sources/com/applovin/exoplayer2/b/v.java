package com.applovin.exoplayer2.b;

import com.huawei.openalliance.ad.constant.ag;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
final class v {

    /* renamed from: a, reason: collision with root package name */
    private final int f13530a;

    /* renamed from: b, reason: collision with root package name */
    private final int f13531b;

    /* renamed from: c, reason: collision with root package name */
    private final float f13532c;

    /* renamed from: d, reason: collision with root package name */
    private final float f13533d;

    /* renamed from: e, reason: collision with root package name */
    private final float f13534e;
    private final int f;

    /* renamed from: g, reason: collision with root package name */
    private final int f13535g;

    /* renamed from: h, reason: collision with root package name */
    private final int f13536h;

    /* renamed from: i, reason: collision with root package name */
    private final short[] f13537i;

    /* renamed from: j, reason: collision with root package name */
    private short[] f13538j;

    /* renamed from: k, reason: collision with root package name */
    private int f13539k;

    /* renamed from: l, reason: collision with root package name */
    private short[] f13540l;

    /* renamed from: m, reason: collision with root package name */
    private int f13541m;

    /* renamed from: n, reason: collision with root package name */
    private short[] f13542n;
    private int o;

    /* renamed from: p, reason: collision with root package name */
    private int f13543p;

    /* renamed from: q, reason: collision with root package name */
    private int f13544q;

    /* renamed from: r, reason: collision with root package name */
    private int f13545r;

    /* renamed from: s, reason: collision with root package name */
    private int f13546s;

    /* renamed from: t, reason: collision with root package name */
    private int f13547t;

    /* renamed from: u, reason: collision with root package name */
    private int f13548u;

    /* renamed from: v, reason: collision with root package name */
    private int f13549v;

    public v(int i10, int i11, float f, float f10, int i12) {
        this.f13530a = i10;
        this.f13531b = i11;
        this.f13532c = f;
        this.f13533d = f10;
        this.f13534e = i10 / i12;
        this.f = i10 / ag.f21998i;
        int i13 = i10 / 65;
        this.f13535g = i13;
        int i14 = i13 * 2;
        this.f13536h = i14;
        this.f13537i = new short[i14];
        this.f13538j = new short[i14 * i11];
        this.f13540l = new short[i14 * i11];
        this.f13542n = new short[i14 * i11];
    }

    private void e() {
        int i10 = this.f13541m;
        float f = this.f13532c;
        float f10 = this.f13533d;
        float f11 = f / f10;
        float f12 = this.f13534e * f10;
        double d10 = f11;
        if (d10 <= 1.00001d && d10 >= 0.99999d) {
            b(this.f13538j, 0, this.f13539k);
            this.f13539k = 0;
        } else {
            a(f11);
        }
        if (f12 != 1.0f) {
            a(f12, i10);
        }
    }

    public int a() {
        return this.f13539k * this.f13531b * 2;
    }

    public void b(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f13531b, this.f13541m);
        shortBuffer.put(this.f13540l, 0, this.f13531b * min);
        int i10 = this.f13541m - min;
        this.f13541m = i10;
        short[] sArr = this.f13540l;
        int i11 = this.f13531b;
        System.arraycopy(sArr, min * i11, sArr, 0, i10 * i11);
    }

    public void c() {
        this.f13539k = 0;
        this.f13541m = 0;
        this.o = 0;
        this.f13543p = 0;
        this.f13544q = 0;
        this.f13545r = 0;
        this.f13546s = 0;
        this.f13547t = 0;
        this.f13548u = 0;
        this.f13549v = 0;
    }

    public int d() {
        return this.f13541m * this.f13531b * 2;
    }

    private void d(int i10) {
        if (i10 == 0) {
            return;
        }
        short[] sArr = this.f13542n;
        int i11 = this.f13531b;
        System.arraycopy(sArr, i10 * i11, sArr, 0, (this.o - i10) * i11);
        this.o -= i10;
    }

    public void a(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i10 = this.f13531b;
        int i11 = remaining / i10;
        short[] a10 = a(this.f13538j, this.f13539k, i11);
        this.f13538j = a10;
        shortBuffer.get(a10, this.f13539k * this.f13531b, ((i10 * i11) * 2) / 2);
        this.f13539k += i11;
        e();
    }

    public void b() {
        int i10;
        int i11 = this.f13539k;
        float f = this.f13532c;
        float f10 = this.f13533d;
        int i12 = this.f13541m + ((int) ((((i11 / (f / f10)) + this.o) / (this.f13534e * f10)) + 0.5f));
        this.f13538j = a(this.f13538j, i11, (this.f13536h * 2) + i11);
        int i13 = 0;
        while (true) {
            i10 = this.f13536h;
            int i14 = this.f13531b;
            if (i13 >= i10 * 2 * i14) {
                break;
            }
            this.f13538j[(i14 * i11) + i13] = 0;
            i13++;
        }
        this.f13539k = (i10 * 2) + this.f13539k;
        e();
        if (this.f13541m > i12) {
            this.f13541m = i12;
        }
        this.f13539k = 0;
        this.f13545r = 0;
        this.o = 0;
    }

    private short[] a(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f13531b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    private void a(int i10) {
        int i11 = this.f13539k - i10;
        short[] sArr = this.f13538j;
        int i12 = this.f13531b;
        System.arraycopy(sArr, i10 * i12, sArr, 0, i12 * i11);
        this.f13539k = i11;
    }

    private void c(short[] sArr, int i10, int i11) {
        int i12 = this.f13536h / i11;
        int i13 = this.f13531b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f13537i[i16] = (short) (i17 / i14);
        }
    }

    private int a(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f13531b;
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
        this.f13548u = i15 / i16;
        this.f13549v = i17 / i14;
        return i16;
    }

    private void c(int i10) {
        int i11 = this.f13541m - i10;
        short[] a10 = a(this.f13542n, this.o, i11);
        this.f13542n = a10;
        short[] sArr = this.f13540l;
        int i12 = this.f13531b;
        System.arraycopy(sArr, i10 * i12, a10, this.o * i12, i12 * i11);
        this.f13541m = i10;
        this.o += i11;
    }

    private boolean a(int i10, int i11) {
        return i10 != 0 && this.f13546s != 0 && i11 <= i10 * 3 && i10 * 2 > this.f13547t * 3;
    }

    private void b(short[] sArr, int i10, int i11) {
        short[] a10 = a(this.f13540l, this.f13541m, i11);
        this.f13540l = a10;
        int i12 = this.f13531b;
        System.arraycopy(sArr, i10 * i12, a10, this.f13541m * i12, i12 * i11);
        this.f13541m += i11;
    }

    private int a(short[] sArr, int i10) {
        int i11;
        int i12 = this.f13530a;
        int i13 = i12 > 4000 ? i12 / 4000 : 1;
        if (this.f13531b == 1 && i13 == 1) {
            i11 = a(sArr, i10, this.f, this.f13535g);
        } else {
            c(sArr, i10, i13);
            int a10 = a(this.f13537i, 0, this.f / i13, this.f13535g / i13);
            if (i13 != 1) {
                int i14 = a10 * i13;
                int i15 = i13 * 4;
                int i16 = i14 - i15;
                int i17 = i14 + i15;
                int i18 = this.f;
                if (i16 < i18) {
                    i16 = i18;
                }
                int i19 = this.f13535g;
                if (i17 > i19) {
                    i17 = i19;
                }
                if (this.f13531b == 1) {
                    i11 = a(sArr, i10, i16, i17);
                } else {
                    c(sArr, i10, 1);
                    i11 = a(this.f13537i, 0, i16, i17);
                }
            } else {
                i11 = a10;
            }
        }
        int i20 = a(this.f13548u, this.f13549v) ? this.f13546s : i11;
        this.f13547t = this.f13548u;
        this.f13546s = i11;
        return i20;
    }

    private int b(int i10) {
        int min = Math.min(this.f13536h, this.f13545r);
        b(this.f13538j, i10, min);
        this.f13545r -= min;
        return min;
    }

    private short b(short[] sArr, int i10, int i11, int i12) {
        short s10 = sArr[i10];
        short s11 = sArr[i10 + this.f13531b];
        int i13 = this.f13544q * i11;
        int i14 = this.f13543p;
        int i15 = i14 * i12;
        int i16 = (i14 + 1) * i12;
        int i17 = i16 - i13;
        int i18 = i16 - i15;
        return (short) ((((i18 - i17) * s11) + (s10 * i17)) / i18);
    }

    private int b(short[] sArr, int i10, float f, int i11) {
        int i12;
        if (f < 0.5f) {
            i12 = (int) ((i11 * f) / (1.0f - f));
        } else {
            this.f13545r = (int) ((((2.0f * f) - 1.0f) * i11) / (1.0f - f));
            i12 = i11;
        }
        int i13 = i11 + i12;
        short[] a10 = a(this.f13540l, this.f13541m, i13);
        this.f13540l = a10;
        int i14 = this.f13531b;
        System.arraycopy(sArr, i10 * i14, a10, this.f13541m * i14, i14 * i11);
        a(i12, this.f13531b, this.f13540l, this.f13541m + i11, sArr, i10 + i11, sArr, i10);
        this.f13541m += i13;
        return i12;
    }

    private void a(float f, int i10) {
        int i11;
        int i12;
        if (this.f13541m == i10) {
            return;
        }
        int i13 = this.f13530a;
        int i14 = (int) (i13 / f);
        while (true) {
            if (i14 <= 16384 && i13 <= 16384) {
                break;
            }
            i14 /= 2;
            i13 /= 2;
        }
        c(i10);
        int i15 = 0;
        while (true) {
            int i16 = this.o;
            if (i15 < i16 - 1) {
                while (true) {
                    i11 = this.f13543p;
                    int i17 = (i11 + 1) * i14;
                    i12 = this.f13544q;
                    if (i17 <= i12 * i13) {
                        break;
                    }
                    this.f13540l = a(this.f13540l, this.f13541m, 1);
                    int i18 = 0;
                    while (true) {
                        int i19 = this.f13531b;
                        if (i18 < i19) {
                            this.f13540l[(this.f13541m * i19) + i18] = b(this.f13542n, (i19 * i15) + i18, i13, i14);
                            i18++;
                        }
                    }
                    this.f13544q++;
                    this.f13541m++;
                }
                int i20 = i11 + 1;
                this.f13543p = i20;
                if (i20 == i13) {
                    this.f13543p = 0;
                    com.applovin.exoplayer2.l.a.b(i12 == i14);
                    this.f13544q = 0;
                }
                i15++;
            } else {
                d(i16 - 1);
                return;
            }
        }
    }

    private int a(short[] sArr, int i10, float f, int i11) {
        int i12;
        if (f >= 2.0f) {
            i12 = (int) (i11 / (f - 1.0f));
        } else {
            this.f13545r = (int) (((2.0f - f) * i11) / (f - 1.0f));
            i12 = i11;
        }
        short[] a10 = a(this.f13540l, this.f13541m, i12);
        this.f13540l = a10;
        a(i12, this.f13531b, a10, this.f13541m, sArr, i10, sArr, i10 + i11);
        this.f13541m += i12;
        return i12;
    }

    private void a(float f) {
        int b10;
        int i10 = this.f13539k;
        if (i10 < this.f13536h) {
            return;
        }
        int i11 = 0;
        do {
            if (this.f13545r > 0) {
                b10 = b(i11);
            } else {
                int a10 = a(this.f13538j, i11);
                if (f > 1.0d) {
                    i11 = a10 + a(this.f13538j, i11, f, a10) + i11;
                } else {
                    b10 = b(this.f13538j, i11, f, a10);
                }
            }
            i11 += b10;
        } while (this.f13536h + i11 <= i10);
        a(i11);
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
