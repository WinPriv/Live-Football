package a3;

import a3.h;
import com.bumptech.glide.load.data.d;
import e3.n;

/* compiled from: SourceGenerator.java */
/* loaded from: classes.dex */
public final class b0 implements d.a<Object> {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n.a f90s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c0 f91t;

    public b0(c0 c0Var, n.a aVar) {
        this.f91t = c0Var;
        this.f90s = aVar;
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void c(Exception exc) {
        boolean z10;
        c0 c0Var = this.f91t;
        n.a<?> aVar = this.f90s;
        n.a<?> aVar2 = c0Var.f105x;
        if (aVar2 != null && aVar2 == aVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            c0 c0Var2 = this.f91t;
            n.a aVar3 = this.f90s;
            h.a aVar4 = c0Var2.f101t;
            y2.e eVar = c0Var2.y;
            com.bumptech.glide.load.data.d<Data> dVar = aVar3.f27705c;
            aVar4.a(eVar, exc, dVar, dVar.d());
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void f(Object obj) {
        boolean z10;
        c0 c0Var = this.f91t;
        n.a<?> aVar = this.f90s;
        n.a<?> aVar2 = c0Var.f105x;
        if (aVar2 != null && aVar2 == aVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            c0 c0Var2 = this.f91t;
            n.a aVar3 = this.f90s;
            n nVar = c0Var2.f100s.f131p;
            if (obj != null && nVar.c(aVar3.f27705c.d())) {
                c0Var2.f104w = obj;
                c0Var2.f101t.d();
            } else {
                h.a aVar4 = c0Var2.f101t;
                y2.e eVar = aVar3.f27703a;
                com.bumptech.glide.load.data.d<Data> dVar = aVar3.f27705c;
                aVar4.c(eVar, obj, dVar, dVar.d(), c0Var2.y);
            }
        }
    }
}
