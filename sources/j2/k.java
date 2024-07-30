package j2;

import android.graphics.Path;
import android.graphics.PointF;
import i2.r;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ShapeKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class k extends a<n2.l, Path> {

    /* renamed from: i, reason: collision with root package name */
    public final n2.l f29604i;

    /* renamed from: j, reason: collision with root package name */
    public final Path f29605j;

    /* renamed from: k, reason: collision with root package name */
    public List<r> f29606k;

    public k(List<t2.a<n2.l>> list) {
        super(list);
        this.f29604i = new n2.l();
        this.f29605j = new Path();
    }

    @Override // j2.a
    public final Path g(t2.a<n2.l> aVar, float f) {
        boolean z10;
        n2.l lVar = aVar.f35379b;
        n2.l lVar2 = aVar.f35380c;
        n2.l lVar3 = this.f29604i;
        if (lVar3.f33270b == null) {
            lVar3.f33270b = new PointF();
        }
        int i10 = 0;
        if (!lVar.f33271c && !lVar2.f33271c) {
            z10 = false;
        } else {
            z10 = true;
        }
        lVar3.f33271c = z10;
        ArrayList arrayList = lVar.f33269a;
        int size = arrayList.size();
        int size2 = lVar2.f33269a.size();
        ArrayList arrayList2 = lVar2.f33269a;
        if (size != size2) {
            s2.c.b("Curves must have the same number of control points. Shape 1: " + arrayList.size() + "\tShape 2: " + arrayList2.size());
        }
        int min = Math.min(arrayList.size(), arrayList2.size());
        ArrayList arrayList3 = lVar3.f33269a;
        if (arrayList3.size() < min) {
            for (int size3 = arrayList3.size(); size3 < min; size3++) {
                arrayList3.add(new l2.a());
            }
        } else if (arrayList3.size() > min) {
            for (int size4 = arrayList3.size() - 1; size4 >= min; size4--) {
                arrayList3.remove(arrayList3.size() - 1);
            }
        }
        PointF pointF = lVar.f33270b;
        PointF pointF2 = lVar2.f33270b;
        float f10 = pointF.x;
        float f11 = pointF2.x;
        PointF pointF3 = s2.f.f35110a;
        float d10 = a3.k.d(f11, f10, f, f10);
        float f12 = pointF.y;
        lVar3.a(d10, ((pointF2.y - f12) * f) + f12);
        for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
            l2.a aVar2 = (l2.a) arrayList.get(size5);
            l2.a aVar3 = (l2.a) arrayList2.get(size5);
            PointF pointF4 = aVar2.f32317a;
            PointF pointF5 = aVar3.f32317a;
            l2.a aVar4 = (l2.a) arrayList3.get(size5);
            float f13 = pointF4.x;
            float d11 = a3.k.d(pointF5.x, f13, f, f13);
            float f14 = pointF4.y;
            aVar4.f32317a.set(d11, a3.k.d(pointF5.y, f14, f, f14));
            l2.a aVar5 = (l2.a) arrayList3.get(size5);
            PointF pointF6 = aVar2.f32318b;
            float f15 = pointF6.x;
            PointF pointF7 = aVar3.f32318b;
            float d12 = a3.k.d(pointF7.x, f15, f, f15);
            float f16 = pointF6.y;
            aVar5.f32318b.set(d12, a3.k.d(pointF7.y, f16, f, f16));
            l2.a aVar6 = (l2.a) arrayList3.get(size5);
            PointF pointF8 = aVar2.f32319c;
            float f17 = pointF8.x;
            PointF pointF9 = aVar3.f32319c;
            float d13 = a3.k.d(pointF9.x, f17, f, f17);
            float f18 = pointF8.y;
            aVar6.f32319c.set(d13, a3.k.d(pointF9.y, f18, f, f18));
        }
        List<r> list = this.f29606k;
        if (list != null) {
            for (int size6 = list.size() - 1; size6 >= 0; size6--) {
                lVar3 = this.f29606k.get(size6).c(lVar3);
            }
        }
        Path path = this.f29605j;
        path.reset();
        PointF pointF10 = lVar3.f33270b;
        path.moveTo(pointF10.x, pointF10.y);
        PointF pointF11 = s2.f.f35110a;
        pointF11.set(pointF10.x, pointF10.y);
        while (true) {
            ArrayList arrayList4 = lVar3.f33269a;
            if (i10 >= arrayList4.size()) {
                break;
            }
            l2.a aVar7 = (l2.a) arrayList4.get(i10);
            PointF pointF12 = aVar7.f32317a;
            boolean equals = pointF12.equals(pointF11);
            PointF pointF13 = aVar7.f32318b;
            PointF pointF14 = aVar7.f32319c;
            if (equals && pointF13.equals(pointF14)) {
                path.lineTo(pointF14.x, pointF14.y);
            } else {
                path.cubicTo(pointF12.x, pointF12.y, pointF13.x, pointF13.y, pointF14.x, pointF14.y);
            }
            pointF11.set(pointF14.x, pointF14.y);
            i10++;
        }
        if (lVar3.f33271c) {
            path.close();
        }
        return path;
    }
}
