package j2;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* compiled from: PathKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class i extends g<PointF> {

    /* renamed from: i, reason: collision with root package name */
    public final PointF f29599i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f29600j;

    /* renamed from: k, reason: collision with root package name */
    public final PathMeasure f29601k;

    /* renamed from: l, reason: collision with root package name */
    public h f29602l;

    public i(List<? extends t2.a<PointF>> list) {
        super(list);
        this.f29599i = new PointF();
        this.f29600j = new float[2];
        this.f29601k = new PathMeasure();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j2.a
    public final Object g(t2.a aVar, float f) {
        PointF pointF;
        h hVar = (h) aVar;
        Path path = hVar.f29597q;
        if (path == null) {
            return (PointF) aVar.f35379b;
        }
        t2.c cVar = this.f29579e;
        if (cVar == null || (pointF = (PointF) cVar.b(hVar.f35383g, hVar.f35384h.floatValue(), (PointF) hVar.f35379b, (PointF) hVar.f35380c, e(), f, this.f29578d)) == null) {
            h hVar2 = this.f29602l;
            PathMeasure pathMeasure = this.f29601k;
            if (hVar2 != hVar) {
                pathMeasure.setPath(path, false);
                this.f29602l = hVar;
            }
            float length = pathMeasure.getLength() * f;
            float[] fArr = this.f29600j;
            pathMeasure.getPosTan(length, fArr, null);
            PointF pointF2 = this.f29599i;
            pointF2.set(fArr[0], fArr[1]);
            return pointF2;
        }
        return pointF;
    }
}
