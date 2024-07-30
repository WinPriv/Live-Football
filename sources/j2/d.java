package j2;

import android.graphics.PointF;
import java.util.List;

/* compiled from: FloatKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class d extends g<Float> {
    public d(List<t2.a<Float>> list) {
        super(list);
    }

    @Override // j2.a
    public final Object g(t2.a aVar, float f) {
        return Float.valueOf(m(aVar, f));
    }

    public final float l() {
        return m(b(), d());
    }

    public final float m(t2.a<Float> aVar, float f) {
        Float f10;
        if (aVar.f35379b != null && aVar.f35380c != null) {
            t2.c cVar = this.f29579e;
            Float f11 = aVar.f35379b;
            if (cVar != null && (f10 = (Float) cVar.b(aVar.f35383g, aVar.f35384h.floatValue(), f11, aVar.f35380c, f, e(), this.f29578d)) != null) {
                return f10.floatValue();
            }
            if (aVar.f35385i == -3987645.8f) {
                aVar.f35385i = f11.floatValue();
            }
            float f12 = aVar.f35385i;
            if (aVar.f35386j == -3987645.8f) {
                aVar.f35386j = aVar.f35380c.floatValue();
            }
            float f13 = aVar.f35386j;
            PointF pointF = s2.f.f35110a;
            return a3.k.d(f13, f12, f, f12);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
