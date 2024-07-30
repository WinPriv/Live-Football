package hd;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public g f28883a;

    /* renamed from: b, reason: collision with root package name */
    public final d f28884b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28885c;

    /* renamed from: d, reason: collision with root package name */
    public final int f28886d;

    /* renamed from: e, reason: collision with root package name */
    public final int f28887e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final int f28888g;

    /* renamed from: h, reason: collision with root package name */
    public a f28889h;

    /* renamed from: i, reason: collision with root package name */
    public a f28890i;

    /* renamed from: j, reason: collision with root package name */
    public a f28891j;

    /* renamed from: k, reason: collision with root package name */
    public a f28892k;

    /* renamed from: l, reason: collision with root package name */
    public a4.j f28893l;

    public g(d dVar, int i10, String str, String str2, String str3, Object obj) {
        this.f28883a = null;
        if (dVar.F == null) {
            dVar.F = this;
        } else {
            dVar.G.f28883a = this;
        }
        dVar.G = this;
        this.f28884b = dVar;
        this.f28885c = i10;
        this.f28886d = dVar.x0(str);
        this.f28887e = dVar.x0(str2);
        if (str3 != null) {
            this.f = dVar.x0(str3);
        }
        if (obj != null) {
            this.f28888g = dVar.n0(obj).f28911a;
        }
    }

    public final a a(String str, boolean z10) {
        b bVar = new b();
        bVar.i(this.f28884b.x0(str));
        bVar.i(0);
        a aVar = new a(this.f28884b, true, bVar, bVar, 2);
        if (z10) {
            aVar.f28830g = this.f28889h;
            this.f28889h = aVar;
        } else {
            aVar.f28830g = this.f28890i;
            this.f28890i = aVar;
        }
        return aVar;
    }

    public final a b(int i10, q qVar, String str, boolean z10) {
        b bVar = new b();
        a.b(i10, qVar, bVar);
        bVar.i(this.f28884b.x0(str));
        bVar.i(0);
        a aVar = new a(this.f28884b, true, bVar, bVar, bVar.f28833b - 2);
        if (z10) {
            aVar.f28830g = this.f28891j;
            this.f28891j = aVar;
        } else {
            aVar.f28830g = this.f28892k;
            this.f28892k = aVar;
        }
        return aVar;
    }
}
