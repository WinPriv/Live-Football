package v6;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;
import com.huawei.hms.ads.gl;

/* compiled from: FloatingActionButtonImpl.java */
/* loaded from: classes2.dex */
public final class a implements TypeEvaluator<Float> {

    /* renamed from: a, reason: collision with root package name */
    public final FloatEvaluator f35990a = new FloatEvaluator();

    @Override // android.animation.TypeEvaluator
    public final Float evaluate(float f, Float f10, Float f11) {
        float floatValue = this.f35990a.evaluate(f, (Number) f10, (Number) f11).floatValue();
        if (floatValue < 0.1f) {
            floatValue = gl.Code;
        }
        return Float.valueOf(floatValue);
    }
}
