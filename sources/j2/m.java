package j2;

import android.graphics.PointF;

/* compiled from: TextKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class m extends t2.c {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ t2.b f29613v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t2.c f29614w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ l2.b f29615x;

    public m(t2.b bVar, t2.c cVar, l2.b bVar2) {
        this.f29613v = bVar;
        this.f29614w = cVar;
        this.f29615x = bVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.String] */
    @Override // t2.c
    public final Object a(t2.b bVar) {
        Object obj;
        float f = bVar.f35392a;
        float f10 = bVar.f35393b;
        ?? r22 = ((l2.b) bVar.f35394c).f32320a;
        ?? r32 = ((l2.b) bVar.f35395d).f32320a;
        float f11 = bVar.f35396e;
        float f12 = bVar.f;
        float f13 = bVar.f35397g;
        t2.b bVar2 = this.f29613v;
        bVar2.f35392a = f;
        bVar2.f35393b = f10;
        bVar2.f35394c = r22;
        bVar2.f35395d = r32;
        bVar2.f35396e = f11;
        bVar2.f = f12;
        bVar2.f35397g = f13;
        String str = (String) this.f29614w.a(bVar2);
        if (bVar.f == 1.0f) {
            obj = bVar.f35395d;
        } else {
            obj = bVar.f35394c;
        }
        l2.b bVar3 = (l2.b) obj;
        String str2 = bVar3.f32321b;
        float f14 = bVar3.f32322c;
        int i10 = bVar3.f32323d;
        int i11 = bVar3.f32324e;
        float f15 = bVar3.f;
        float f16 = bVar3.f32325g;
        int i12 = bVar3.f32326h;
        int i13 = bVar3.f32327i;
        float f17 = bVar3.f32328j;
        boolean z10 = bVar3.f32329k;
        PointF pointF = bVar3.f32330l;
        PointF pointF2 = bVar3.f32331m;
        l2.b bVar4 = this.f29615x;
        bVar4.f32320a = str;
        bVar4.f32321b = str2;
        bVar4.f32322c = f14;
        bVar4.f32323d = i10;
        bVar4.f32324e = i11;
        bVar4.f = f15;
        bVar4.f32325g = f16;
        bVar4.f32326h = i12;
        bVar4.f32327i = i13;
        bVar4.f32328j = f17;
        bVar4.f32329k = z10;
        bVar4.f32330l = pointF;
        bVar4.f32331m = pointF2;
        return bVar4;
    }
}
