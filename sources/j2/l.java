package j2;

import android.graphics.PointF;
import com.huawei.hms.ads.gl;
import j2.a;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: SplitDimensionPathKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class l extends a<PointF, PointF> {

    /* renamed from: i, reason: collision with root package name */
    public final PointF f29607i;

    /* renamed from: j, reason: collision with root package name */
    public final PointF f29608j;

    /* renamed from: k, reason: collision with root package name */
    public final a<Float, Float> f29609k;

    /* renamed from: l, reason: collision with root package name */
    public final a<Float, Float> f29610l;

    /* renamed from: m, reason: collision with root package name */
    public t2.c f29611m;

    /* renamed from: n, reason: collision with root package name */
    public t2.c f29612n;

    public l(d dVar, d dVar2) {
        super(Collections.emptyList());
        this.f29607i = new PointF();
        this.f29608j = new PointF();
        this.f29609k = dVar;
        this.f29610l = dVar2;
        j(this.f29578d);
    }

    @Override // j2.a
    public final PointF f() {
        return l(gl.Code);
    }

    @Override // j2.a
    public final /* bridge */ /* synthetic */ PointF g(t2.a<PointF> aVar, float f) {
        return l(f);
    }

    @Override // j2.a
    public final void j(float f) {
        a<Float, Float> aVar = this.f29609k;
        aVar.j(f);
        a<Float, Float> aVar2 = this.f29610l;
        aVar2.j(f);
        this.f29607i.set(aVar.f().floatValue(), aVar2.f().floatValue());
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f29575a;
            if (i10 < arrayList.size()) {
                ((a.InterfaceC0404a) arrayList.get(i10)).a();
                i10++;
            } else {
                return;
            }
        }
    }

    public final PointF l(float f) {
        Float f10;
        a<Float, Float> aVar;
        t2.a<Float> b10;
        float floatValue;
        a<Float, Float> aVar2;
        t2.a<Float> b11;
        float floatValue2;
        Float f11 = null;
        if (this.f29611m != null && (b11 = (aVar2 = this.f29609k).b()) != null) {
            float d10 = aVar2.d();
            Float f12 = b11.f35384h;
            t2.c cVar = this.f29611m;
            float f13 = b11.f35383g;
            if (f12 == null) {
                floatValue2 = f13;
            } else {
                floatValue2 = f12.floatValue();
            }
            f10 = (Float) cVar.b(f13, floatValue2, b11.f35379b, b11.f35380c, f, f, d10);
        } else {
            f10 = null;
        }
        if (this.f29612n != null && (b10 = (aVar = this.f29610l).b()) != null) {
            float d11 = aVar.d();
            Float f14 = b10.f35384h;
            t2.c cVar2 = this.f29612n;
            float f15 = b10.f35383g;
            if (f14 == null) {
                floatValue = f15;
            } else {
                floatValue = f14.floatValue();
            }
            f11 = (Float) cVar2.b(f15, floatValue, b10.f35379b, b10.f35380c, f, f, d11);
        }
        PointF pointF = this.f29607i;
        PointF pointF2 = this.f29608j;
        if (f10 == null) {
            pointF2.set(pointF.x, gl.Code);
        } else {
            pointF2.set(f10.floatValue(), gl.Code);
        }
        if (f11 == null) {
            pointF2.set(pointF2.x, pointF.y);
        } else {
            pointF2.set(pointF2.x, f11.floatValue());
        }
        return pointF2;
    }
}
