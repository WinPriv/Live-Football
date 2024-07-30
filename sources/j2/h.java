package j2;

import android.graphics.Path;
import android.graphics.PointF;
import com.huawei.hms.ads.gl;
import s2.g;

/* compiled from: PathKeyframe.java */
/* loaded from: classes.dex */
public final class h extends t2.a<PointF> {

    /* renamed from: q, reason: collision with root package name */
    public Path f29597q;

    /* renamed from: r, reason: collision with root package name */
    public final t2.a<PointF> f29598r;

    public h(g2.h hVar, t2.a<PointF> aVar) {
        super(hVar, aVar.f35379b, aVar.f35380c, aVar.f35381d, aVar.f35382e, aVar.f, aVar.f35383g, aVar.f35384h);
        this.f29598r = aVar;
        d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d() {
        boolean z10;
        T t10;
        T t11 = this.f35380c;
        T t12 = this.f35379b;
        if (t11 != 0 && t12 != 0 && ((PointF) t12).equals(((PointF) t11).x, ((PointF) t11).y)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (t12 != 0 && (t10 = this.f35380c) != 0 && !z10) {
            PointF pointF = (PointF) t12;
            PointF pointF2 = (PointF) t10;
            t2.a<PointF> aVar = this.f29598r;
            PointF pointF3 = aVar.o;
            PointF pointF4 = aVar.f35391p;
            g.a aVar2 = s2.g.f35111a;
            Path path = new Path();
            path.moveTo(pointF.x, pointF.y);
            if (pointF3 != null && pointF4 != null && (pointF3.length() != gl.Code || pointF4.length() != gl.Code)) {
                float f = pointF3.x + pointF.x;
                float f10 = pointF.y + pointF3.y;
                float f11 = pointF2.x;
                float f12 = f11 + pointF4.x;
                float f13 = pointF2.y;
                path.cubicTo(f, f10, f12, f13 + pointF4.y, f11, f13);
            } else {
                path.lineTo(pointF2.x, pointF2.y);
            }
            this.f29597q = path;
        }
    }
}
