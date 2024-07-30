package com.huawei.hms.ads;

import android.view.animation.Interpolator;

/* loaded from: classes2.dex */
public class ed implements Interpolator {
    float B;
    float C;
    float S;
    float Z;

    public ed(float f, float f10, float f11, float f12) {
        this.Z = f;
        this.B = f10;
        this.C = f11;
        this.S = f12;
        ex.Code("CubicBezierInterpolator", toString());
    }

    private float I(float f) {
        float f10 = 1.0f - f;
        float f11 = 3.0f * f10;
        return (f * f * f) + (f11 * f * f * this.C) + (f10 * f11 * f * this.Z);
    }

    public float Code(float f) {
        float f10 = 1.0f - f;
        float f11 = 3.0f * f10;
        return (f * f * f) + (f11 * f * f * this.S) + (f10 * f11 * f * this.B);
    }

    public long V(float f) {
        long j10 = 0;
        long j11 = 4000;
        while (j10 <= j11) {
            long j12 = (j10 + j11) >>> 1;
            float I = I(((float) j12) * 2.5E-4f);
            if (I < f) {
                j10 = j12 + 1;
            } else {
                if (I <= f) {
                    return j12;
                }
                j11 = j12 - 1;
            }
        }
        return j10;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        return Code(((float) V(f)) * 2.5E-4f);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("CubicBezierInterpolator  mControlPoint1x = ");
        stringBuffer.append(this.Z);
        stringBuffer.append(", mControlPoint1y = ");
        stringBuffer.append(this.B);
        stringBuffer.append(", mControlPoint2x = ");
        stringBuffer.append(this.C);
        stringBuffer.append(", mControlPoint2y = ");
        stringBuffer.append(this.S);
        return stringBuffer.toString();
    }
}
