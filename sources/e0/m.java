package e0;

import androidx.activity.n;
import com.huawei.hms.ads.gl;

/* compiled from: ViewingConditions.java */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: k, reason: collision with root package name */
    public static final m f27650k;

    /* renamed from: a, reason: collision with root package name */
    public final float f27651a;

    /* renamed from: b, reason: collision with root package name */
    public final float f27652b;

    /* renamed from: c, reason: collision with root package name */
    public final float f27653c;

    /* renamed from: d, reason: collision with root package name */
    public final float f27654d;

    /* renamed from: e, reason: collision with root package name */
    public final float f27655e;
    public final float f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f27656g;

    /* renamed from: h, reason: collision with root package name */
    public final float f27657h;

    /* renamed from: i, reason: collision with root package name */
    public final float f27658i;

    /* renamed from: j, reason: collision with root package name */
    public final float f27659j;

    static {
        float f;
        float f10;
        float[] fArr = n.D;
        float M0 = (float) ((n.M0() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = n.B;
        float f11 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f12 = fArr3[0] * f11;
        float f13 = fArr[1];
        float f14 = (fArr3[1] * f13) + f12;
        float f15 = fArr[2];
        float f16 = (fArr3[2] * f15) + f14;
        float[] fArr4 = fArr2[1];
        float f17 = (fArr4[2] * f15) + (fArr4[1] * f13) + (fArr4[0] * f11);
        float[] fArr5 = fArr2[2];
        float f18 = (f15 * fArr5[2]) + (f13 * fArr5[1]) + (f11 * fArr5[0]);
        if (1.0f >= 0.9d) {
            f = 0.100000046f;
            f10 = 0.59f;
        } else {
            f = 0.12999998f;
            f10 = 0.525f;
        }
        float f19 = f + f10;
        float exp = (1.0f - (((float) Math.exp(((-M0) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d10 = exp;
        if (d10 > 1.0d) {
            exp = 1.0f;
        } else if (d10 < 0.0d) {
            exp = gl.Code;
        }
        float[] fArr6 = {(((100.0f / f16) * exp) + 1.0f) - exp, (((100.0f / f17) * exp) + 1.0f) - exp, (((100.0f / f18) * exp) + 1.0f) - exp};
        float f20 = 1.0f / ((5.0f * M0) + 1.0f);
        float f21 = f20 * f20 * f20 * f20;
        float f22 = 1.0f - f21;
        float cbrt = (0.1f * f22 * f22 * ((float) Math.cbrt(M0 * 5.0d))) + (f21 * M0);
        float M02 = n.M0() / fArr[1];
        double d11 = M02;
        float sqrt = ((float) Math.sqrt(d11)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d11, 0.2d));
        float pow2 = (float) Math.pow(((fArr6[2] * cbrt) * f18) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f16) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f17) / 100.0d, 0.42d), pow2};
        float f23 = fArr7[0];
        float f24 = fArr7[1];
        f27650k = new m(M02, ((((400.0f * pow2) / (pow2 + 27.13f)) * 0.05f) + (((f23 * 400.0f) / (f23 + 27.13f)) * 2.0f) + ((f24 * 400.0f) / (f24 + 27.13f))) * pow, pow, pow, f19, 1.0f, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public m(float f, float f10, float f11, float f12, float f13, float f14, float[] fArr, float f15, float f16, float f17) {
        this.f = f;
        this.f27651a = f10;
        this.f27652b = f11;
        this.f27653c = f12;
        this.f27654d = f13;
        this.f27655e = f14;
        this.f27656g = fArr;
        this.f27657h = f15;
        this.f27658i = f16;
        this.f27659j = f17;
    }
}
