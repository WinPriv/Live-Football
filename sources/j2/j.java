package j2;

import android.graphics.PointF;
import java.util.List;

/* compiled from: PointKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class j extends g<PointF> {

    /* renamed from: i, reason: collision with root package name */
    public final PointF f29603i;

    public j(List<t2.a<PointF>> list) {
        super(list);
        this.f29603i = new PointF();
    }

    @Override // j2.a
    public final Object g(t2.a aVar, float f) {
        return h(aVar, f, f, f);
    }

    @Override // j2.a
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final PointF h(t2.a<PointF> aVar, float f, float f10, float f11) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3 = aVar.f35379b;
        if (pointF3 != null && (pointF = aVar.f35380c) != null) {
            PointF pointF4 = pointF3;
            PointF pointF5 = pointF;
            t2.c cVar = this.f29579e;
            if (cVar != null && (pointF2 = (PointF) cVar.b(aVar.f35383g, aVar.f35384h.floatValue(), pointF4, pointF5, f, e(), this.f29578d)) != null) {
                return pointF2;
            }
            PointF pointF6 = this.f29603i;
            float f12 = pointF4.x;
            float d10 = a3.k.d(pointF5.x, f12, f10, f12);
            float f13 = pointF4.y;
            pointF6.set(d10, ((pointF5.y - f13) * f11) + f13);
            return pointF6;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
