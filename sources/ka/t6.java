package ka;

import android.view.animation.Interpolator;
import com.huawei.hms.ads.gl;

/* loaded from: classes2.dex */
public final class t6 implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final float f31869a;

    /* renamed from: b, reason: collision with root package name */
    public final float f31870b;

    /* renamed from: c, reason: collision with root package name */
    public final float f31871c;

    /* renamed from: d, reason: collision with root package name */
    public final float f31872d;

    public t6(float f, float f10) {
        this.f31869a = gl.Code;
        this.f31870b = gl.Code;
        this.f31871c = gl.Code;
        this.f31872d = gl.Code;
        this.f31869a = f;
        this.f31870b = gl.Code;
        this.f31871c = f10;
        this.f31872d = 1.0f;
        n7.b("CubicBezierInterpolator", toString());
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        long j10 = 0;
        long j11 = 4000;
        while (true) {
            if (j10 > j11) {
                break;
            }
            long j12 = (j10 + j11) >>> 1;
            float f10 = ((float) j12) * 2.5E-4f;
            float f11 = 1.0f - f10;
            float f12 = f11 * 3.0f;
            float f13 = (f10 * f10 * f10) + (f12 * f10 * f10 * this.f31871c) + (f11 * f12 * f10 * this.f31869a);
            if (f13 < f) {
                j10 = j12 + 1;
            } else {
                if (f13 <= f) {
                    j10 = j12;
                    break;
                }
                j11 = j12 - 1;
            }
        }
        float f14 = ((float) j10) * 2.5E-4f;
        float f15 = 1.0f - f14;
        float f16 = 3.0f * f15;
        return (f14 * f14 * f14) + (f16 * f14 * f14 * this.f31872d) + (f15 * f16 * f14 * this.f31870b);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("CubicBezierInterpolator  mControlPoint1x = ");
        stringBuffer.append(this.f31869a);
        stringBuffer.append(", mControlPoint1y = ");
        stringBuffer.append(this.f31870b);
        stringBuffer.append(", mControlPoint2x = ");
        stringBuffer.append(this.f31871c);
        stringBuffer.append(", mControlPoint2y = ");
        stringBuffer.append(this.f31872d);
        return stringBuffer.toString();
    }
}
