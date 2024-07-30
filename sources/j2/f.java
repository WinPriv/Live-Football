package j2;

import android.graphics.PointF;
import java.util.List;

/* compiled from: IntegerKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class f extends g<Integer> {
    public f(List<t2.a<Integer>> list) {
        super(list);
    }

    @Override // j2.a
    public final Object g(t2.a aVar, float f) {
        return Integer.valueOf(l(aVar, f));
    }

    public final int l(t2.a<Integer> aVar, float f) {
        Integer num;
        if (aVar.f35379b != null && aVar.f35380c != null) {
            t2.c cVar = this.f29579e;
            Integer num2 = aVar.f35379b;
            if (cVar != null && (num = (Integer) cVar.b(aVar.f35383g, aVar.f35384h.floatValue(), num2, aVar.f35380c, f, e(), this.f29578d)) != null) {
                return num.intValue();
            }
            if (aVar.f35387k == 784923401) {
                aVar.f35387k = num2.intValue();
            }
            int i10 = aVar.f35387k;
            if (aVar.f35388l == 784923401) {
                aVar.f35388l = aVar.f35380c.intValue();
            }
            int i11 = aVar.f35388l;
            PointF pointF = s2.f.f35110a;
            return (int) ((f * (i11 - i10)) + i10);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
