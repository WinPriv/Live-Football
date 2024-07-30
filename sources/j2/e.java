package j2;

import android.graphics.PointF;
import java.util.List;

/* compiled from: GradientColorKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class e extends g {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f29595i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f29596j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(List list, int i10) {
        super(list);
        this.f29595i = i10;
        if (i10 != 1) {
            n2.c cVar = (n2.c) ((t2.a) list.get(0)).f35379b;
            int length = cVar != null ? cVar.f33222b.length : 0;
            this.f29596j = new n2.c(new float[length], new int[length]);
            return;
        }
        super(list);
        this.f29596j = new t2.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j2.a
    public final Object g(t2.a aVar, float f) {
        T t10;
        t2.d dVar;
        T t11 = aVar.f35379b;
        int i10 = this.f29595i;
        Object obj = this.f29596j;
        switch (i10) {
            case 0:
                n2.c cVar = (n2.c) obj;
                n2.c cVar2 = (n2.c) t11;
                n2.c cVar3 = (n2.c) aVar.f35380c;
                cVar.getClass();
                int[] iArr = cVar2.f33222b;
                int length = iArr.length;
                int[] iArr2 = cVar3.f33222b;
                if (length == iArr2.length) {
                    for (int i11 = 0; i11 < iArr.length; i11++) {
                        float f10 = cVar2.f33221a[i11];
                        float f11 = cVar3.f33221a[i11];
                        PointF pointF = s2.f.f35110a;
                        cVar.f33221a[i11] = a3.k.d(f11, f10, f, f10);
                        cVar.f33222b[i11] = androidx.activity.n.u0(f, iArr[i11], iArr2[i11]);
                    }
                    return cVar;
                }
                StringBuilder sb2 = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
                sb2.append(iArr.length);
                sb2.append(" vs ");
                throw new IllegalArgumentException(com.ironsource.adapters.facebook.a.i(sb2, iArr2.length, ")"));
            default:
                if (t11 != 0 && (t10 = aVar.f35380c) != 0) {
                    t2.d dVar2 = (t2.d) t11;
                    t2.d dVar3 = (t2.d) t10;
                    t2.c cVar4 = this.f29579e;
                    if (cVar4 == null || (dVar = (t2.d) cVar4.b(aVar.f35383g, aVar.f35384h.floatValue(), dVar2, dVar3, f, e(), this.f29578d)) == null) {
                        t2.d dVar4 = (t2.d) obj;
                        float f12 = dVar2.f35401a;
                        float f13 = dVar3.f35401a;
                        PointF pointF2 = s2.f.f35110a;
                        float d10 = a3.k.d(f13, f12, f, f12);
                        float f14 = dVar2.f35402b;
                        float d11 = a3.k.d(dVar3.f35402b, f14, f, f14);
                        dVar4.f35401a = d10;
                        dVar4.f35402b = d11;
                        return dVar4;
                    }
                    return dVar;
                }
                throw new IllegalStateException("Missing values for keyframe.");
        }
    }
}
