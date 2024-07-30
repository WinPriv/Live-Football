package j2;

import com.huawei.hms.ads.gl;
import java.util.List;

/* compiled from: ColorKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class b extends g<Integer> {
    public b(List<t2.a<Integer>> list) {
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
            return androidx.activity.n.u0(s2.f.b(f, gl.Code, 1.0f), num2.intValue(), aVar.f35380c.intValue());
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
