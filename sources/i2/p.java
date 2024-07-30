package i2;

import android.graphics.PointF;
import com.huawei.hms.ads.gl;
import g2.a0;
import j2.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: RoundedCornersContent.java */
/* loaded from: classes.dex */
public final class p implements r, a.InterfaceC0404a {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f29146a;

    /* renamed from: b, reason: collision with root package name */
    public final j2.a<Float, Float> f29147b;

    /* renamed from: c, reason: collision with root package name */
    public n2.l f29148c;

    public p(a0 a0Var, o2.b bVar, n2.k kVar) {
        this.f29146a = a0Var;
        kVar.getClass();
        j2.a<Float, Float> a10 = kVar.f33268a.a();
        this.f29147b = a10;
        bVar.f(a10);
        a10.a(this);
    }

    public static int e(int i10, int i11) {
        int i12 = i10 / i11;
        if ((i10 ^ i11) < 0 && i11 * i12 != i10) {
            i12--;
        }
        return i10 - (i12 * i11);
    }

    @Override // j2.a.InterfaceC0404a
    public final void a() {
        this.f29146a.invalidateSelf();
    }

    @Override // i2.r
    public final n2.l c(n2.l lVar) {
        PointF pointF;
        PointF pointF2;
        boolean z10;
        ArrayList arrayList;
        float f;
        int i10;
        PointF pointF3;
        PointF pointF4;
        boolean z11;
        n2.l lVar2 = lVar;
        ArrayList arrayList2 = lVar2.f33269a;
        if (arrayList2.size() <= 2) {
            return lVar2;
        }
        float floatValue = this.f29147b.f().floatValue();
        if (floatValue == gl.Code) {
            return lVar2;
        }
        ArrayList arrayList3 = lVar2.f33269a;
        boolean z12 = lVar2.f33271c;
        int size = arrayList3.size() - 1;
        int i11 = 0;
        int i12 = 0;
        while (size >= 0) {
            l2.a aVar = (l2.a) arrayList3.get(size);
            int i13 = size - 1;
            l2.a aVar2 = (l2.a) arrayList3.get(e(i13, arrayList3.size()));
            if (size == 0 && !z12) {
                pointF3 = lVar2.f33270b;
            } else {
                pointF3 = aVar2.f32319c;
            }
            if (size == 0 && !z12) {
                pointF4 = pointF3;
            } else {
                pointF4 = aVar2.f32318b;
            }
            PointF pointF5 = aVar.f32317a;
            if (!lVar2.f33271c && size == 0 && size == arrayList3.size() - 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (pointF4.equals(pointF3) && pointF5.equals(pointF3) && !z11) {
                i12 += 2;
            } else {
                i12++;
            }
            size = i13;
        }
        n2.l lVar3 = this.f29148c;
        if (lVar3 == null || lVar3.f33269a.size() != i12) {
            ArrayList arrayList4 = new ArrayList(i12);
            for (int i14 = 0; i14 < i12; i14++) {
                arrayList4.add(new l2.a());
            }
            this.f29148c = new n2.l(new PointF(gl.Code, gl.Code), false, arrayList4);
        }
        n2.l lVar4 = this.f29148c;
        lVar4.f33271c = z12;
        PointF pointF6 = lVar2.f33270b;
        lVar4.a(pointF6.x, pointF6.y);
        ArrayList arrayList5 = lVar4.f33269a;
        boolean z13 = lVar2.f33271c;
        int i15 = 0;
        while (i11 < arrayList2.size()) {
            l2.a aVar3 = (l2.a) arrayList2.get(i11);
            l2.a aVar4 = (l2.a) arrayList2.get(e(i11 - 1, arrayList2.size()));
            l2.a aVar5 = (l2.a) arrayList2.get(e(i11 - 2, arrayList2.size()));
            if (i11 == 0 && !z13) {
                pointF = lVar2.f33270b;
            } else {
                pointF = aVar4.f32319c;
            }
            if (i11 == 0 && !z13) {
                pointF2 = pointF;
            } else {
                pointF2 = aVar4.f32318b;
            }
            PointF pointF7 = aVar3.f32317a;
            PointF pointF8 = aVar5.f32319c;
            if (!lVar2.f33271c && i11 == 0 && i11 == arrayList2.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (pointF2.equals(pointF) && pointF7.equals(pointF) && !z10) {
                float f10 = pointF.x;
                float f11 = f10 - pointF8.x;
                float f12 = pointF.y;
                float f13 = f12 - pointF8.y;
                PointF pointF9 = aVar3.f32319c;
                float f14 = pointF9.x - f10;
                float f15 = pointF9.y - f12;
                arrayList = arrayList2;
                float hypot = (float) Math.hypot(f11, f13);
                double d10 = f14;
                i10 = i11;
                float hypot2 = (float) Math.hypot(d10, f15);
                float min = Math.min(floatValue / hypot, 0.5f);
                float min2 = Math.min(floatValue / hypot2, 0.5f);
                float f16 = pointF.x;
                float d11 = a3.k.d(pointF8.x, f16, min, f16);
                float f17 = pointF.y;
                float d12 = a3.k.d(pointF8.y, f17, min, f17);
                float d13 = a3.k.d(pointF9.x, f16, min2, f16);
                float d14 = a3.k.d(pointF9.y, f17, min2, f17);
                float f18 = d11 - ((d11 - f16) * 0.5519f);
                float f19 = d12 - ((d12 - f17) * 0.5519f);
                float f20 = d13 - ((d13 - f16) * 0.5519f);
                float f21 = d14 - ((d14 - f17) * 0.5519f);
                l2.a aVar6 = (l2.a) arrayList5.get(e(i15 - 1, arrayList5.size()));
                l2.a aVar7 = (l2.a) arrayList5.get(i15);
                f = floatValue;
                aVar6.f32318b.set(d11, d12);
                aVar6.f32319c.set(d11, d12);
                if (i10 == 0) {
                    lVar4.a(d11, d12);
                }
                aVar7.f32317a.set(f18, f19);
                i15++;
                l2.a aVar8 = (l2.a) arrayList5.get(i15);
                aVar7.f32318b.set(f20, f21);
                aVar7.f32319c.set(d13, d14);
                aVar8.f32317a.set(d13, d14);
            } else {
                arrayList = arrayList2;
                f = floatValue;
                i10 = i11;
                l2.a aVar9 = (l2.a) arrayList5.get(e(i15 - 1, arrayList5.size()));
                l2.a aVar10 = (l2.a) arrayList5.get(i15);
                PointF pointF10 = aVar4.f32318b;
                aVar9.f32318b.set(pointF10.x, pointF10.y);
                PointF pointF11 = aVar4.f32319c;
                aVar9.f32319c.set(pointF11.x, pointF11.y);
                PointF pointF12 = aVar3.f32317a;
                aVar10.f32317a.set(pointF12.x, pointF12.y);
            }
            i15++;
            i11 = i10 + 1;
            lVar2 = lVar;
            arrayList2 = arrayList;
            floatValue = f;
        }
        return lVar4;
    }

    @Override // i2.b
    public final void b(List<b> list, List<b> list2) {
    }
}
