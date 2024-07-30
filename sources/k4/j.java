package k4;

/* compiled from: DefaultMediaClock.java */
/* loaded from: classes2.dex */
public final class j implements d6.q {

    /* renamed from: s, reason: collision with root package name */
    public final d6.z f30548s;

    /* renamed from: t, reason: collision with root package name */
    public final a f30549t;

    /* renamed from: u, reason: collision with root package name */
    public i1 f30550u;

    /* renamed from: v, reason: collision with root package name */
    public d6.q f30551v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f30552w = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f30553x;

    /* compiled from: DefaultMediaClock.java */
    /* loaded from: classes2.dex */
    public interface a {
    }

    public j(a aVar, d6.c cVar) {
        this.f30549t = aVar;
        this.f30548s = new d6.z(cVar);
    }

    @Override // d6.q
    public final void a(d1 d1Var) {
        d6.q qVar = this.f30551v;
        if (qVar != null) {
            qVar.a(d1Var);
            d1Var = this.f30551v.d();
        }
        this.f30548s.a(d1Var);
    }

    @Override // d6.q
    public final d1 d() {
        d6.q qVar = this.f30551v;
        if (qVar != null) {
            return qVar.d();
        }
        return this.f30548s.f27399w;
    }

    @Override // d6.q
    public final long l() {
        if (this.f30552w) {
            return this.f30548s.l();
        }
        d6.q qVar = this.f30551v;
        qVar.getClass();
        return qVar.l();
    }
}
