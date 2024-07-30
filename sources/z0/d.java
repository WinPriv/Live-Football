package z0;

import a3.k;
import android.view.animation.Interpolator;
import com.huawei.hms.ads.gl;

/* compiled from: LookupTableInterpolator.java */
/* loaded from: classes.dex */
public abstract class d implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f36880a;

    /* renamed from: b, reason: collision with root package name */
    public final float f36881b;

    public d(float[] fArr) {
        this.f36880a = fArr;
        this.f36881b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= gl.Code) {
            return gl.Code;
        }
        float[] fArr = this.f36880a;
        int min = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f10 = this.f36881b;
        float f11 = (f - (min * f10)) / f10;
        float f12 = fArr[min];
        return k.d(fArr[min + 1], f12, f11, f12);
    }
}
