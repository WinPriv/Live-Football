package v;

/* compiled from: GuidelineReference.java */
/* loaded from: classes.dex */
public final class j extends p {
    public j(u.d dVar) {
        super(dVar);
        dVar.f35635d.f();
        dVar.f35637e.f();
        this.f = ((u.g) dVar).f35700w0;
    }

    @Override // v.p, v.d
    public final void a(d dVar) {
        f fVar = this.f35901h;
        if (!fVar.f35874c || fVar.f35880j) {
            return;
        }
        fVar.d((int) ((((f) fVar.f35882l.get(0)).f35877g * ((u.g) this.f35896b).f35696s0) + 0.5f));
    }

    @Override // v.p
    public final void d() {
        u.d dVar = this.f35896b;
        u.g gVar = (u.g) dVar;
        int i10 = gVar.f35697t0;
        int i11 = gVar.f35698u0;
        int i12 = gVar.f35700w0;
        f fVar = this.f35901h;
        if (i12 == 1) {
            if (i10 != -1) {
                fVar.f35882l.add(dVar.W.f35635d.f35901h);
                this.f35896b.W.f35635d.f35901h.f35881k.add(fVar);
                fVar.f = i10;
            } else if (i11 != -1) {
                fVar.f35882l.add(dVar.W.f35635d.f35902i);
                this.f35896b.W.f35635d.f35902i.f35881k.add(fVar);
                fVar.f = -i11;
            } else {
                fVar.f35873b = true;
                fVar.f35882l.add(dVar.W.f35635d.f35902i);
                this.f35896b.W.f35635d.f35902i.f35881k.add(fVar);
            }
            m(this.f35896b.f35635d.f35901h);
            m(this.f35896b.f35635d.f35902i);
            return;
        }
        if (i10 != -1) {
            fVar.f35882l.add(dVar.W.f35637e.f35901h);
            this.f35896b.W.f35637e.f35901h.f35881k.add(fVar);
            fVar.f = i10;
        } else if (i11 != -1) {
            fVar.f35882l.add(dVar.W.f35637e.f35902i);
            this.f35896b.W.f35637e.f35902i.f35881k.add(fVar);
            fVar.f = -i11;
        } else {
            fVar.f35873b = true;
            fVar.f35882l.add(dVar.W.f35637e.f35902i);
            this.f35896b.W.f35637e.f35902i.f35881k.add(fVar);
        }
        m(this.f35896b.f35637e.f35901h);
        m(this.f35896b.f35637e.f35902i);
    }

    @Override // v.p
    public final void e() {
        u.d dVar = this.f35896b;
        int i10 = ((u.g) dVar).f35700w0;
        f fVar = this.f35901h;
        if (i10 == 1) {
            dVar.f35632b0 = fVar.f35877g;
        } else {
            dVar.f35634c0 = fVar.f35877g;
        }
    }

    @Override // v.p
    public final void f() {
        this.f35901h.c();
    }

    @Override // v.p
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.f35901h;
        fVar2.f35881k.add(fVar);
        fVar.f35882l.add(fVar2);
    }
}
