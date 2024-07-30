package j5;

import j5.x;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class v implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f29840s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ x.a f29841t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ x f29842u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ o f29843v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f29844w;

    public /* synthetic */ v(x.a aVar, x xVar, o oVar, r rVar, int i10) {
        this.f29840s = i10;
        this.f29841t = aVar;
        this.f29842u = xVar;
        this.f29843v = oVar;
        this.f29844w = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f29840s;
        r rVar = this.f29844w;
        o oVar = this.f29843v;
        x xVar = this.f29842u;
        x.a aVar = this.f29841t;
        switch (i10) {
            case 0:
                xVar.z(aVar.f29851a, aVar.f29852b, oVar, rVar);
                return;
            default:
                xVar.W(aVar.f29851a, aVar.f29852b, oVar, rVar);
                return;
        }
    }
}
