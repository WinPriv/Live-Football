package p3;

/* compiled from: ThumbnailRequestCoordinator.java */
/* loaded from: classes.dex */
public final class j implements e, d {

    /* renamed from: a, reason: collision with root package name */
    public final e f34273a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f34274b;

    /* renamed from: c, reason: collision with root package name */
    public volatile d f34275c;

    /* renamed from: d, reason: collision with root package name */
    public volatile d f34276d;

    /* renamed from: e, reason: collision with root package name */
    public int f34277e = 3;
    public int f = 3;

    /* renamed from: g, reason: collision with root package name */
    public boolean f34278g;

    public j(Object obj, e eVar) {
        this.f34274b = obj;
        this.f34273a = eVar;
    }

    @Override // p3.e, p3.d
    public final boolean a() {
        boolean z10;
        synchronized (this.f34274b) {
            if (!this.f34276d.a() && !this.f34275c.a()) {
                z10 = false;
            }
            z10 = true;
        }
        return z10;
    }

    @Override // p3.e
    public final boolean b(d dVar) {
        boolean z10;
        boolean z11;
        synchronized (this.f34274b) {
            e eVar = this.f34273a;
            z10 = false;
            if (eVar != null && !eVar.b(this)) {
                z11 = false;
                if (z11 && dVar.equals(this.f34275c) && this.f34277e != 2) {
                    z10 = true;
                }
            }
            z11 = true;
            if (z11) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // p3.e
    public final void c(d dVar) {
        synchronized (this.f34274b) {
            if (dVar.equals(this.f34276d)) {
                this.f = 4;
                return;
            }
            this.f34277e = 4;
            e eVar = this.f34273a;
            if (eVar != null) {
                eVar.c(this);
            }
            if (!com.ironsource.adapters.facebook.a.c(this.f)) {
                this.f34276d.clear();
            }
        }
    }

    @Override // p3.d
    public final void clear() {
        synchronized (this.f34274b) {
            this.f34278g = false;
            this.f34277e = 3;
            this.f = 3;
            this.f34276d.clear();
            this.f34275c.clear();
        }
    }

    @Override // p3.d
    public final boolean d(d dVar) {
        if (!(dVar instanceof j)) {
            return false;
        }
        j jVar = (j) dVar;
        if (this.f34275c == null) {
            if (jVar.f34275c != null) {
                return false;
            }
        } else if (!this.f34275c.d(jVar.f34275c)) {
            return false;
        }
        if (this.f34276d == null) {
            if (jVar.f34276d != null) {
                return false;
            }
        } else if (!this.f34276d.d(jVar.f34276d)) {
            return false;
        }
        return true;
    }

    @Override // p3.e
    public final void e(d dVar) {
        synchronized (this.f34274b) {
            if (!dVar.equals(this.f34275c)) {
                this.f = 5;
                return;
            }
            this.f34277e = 5;
            e eVar = this.f34273a;
            if (eVar != null) {
                eVar.e(this);
            }
        }
    }

    @Override // p3.d
    public final boolean f() {
        boolean z10;
        synchronized (this.f34274b) {
            if (this.f34277e == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // p3.e
    public final boolean g(d dVar) {
        boolean z10;
        boolean z11;
        synchronized (this.f34274b) {
            e eVar = this.f34273a;
            z10 = false;
            if (eVar != null && !eVar.g(this)) {
                z11 = false;
                if (z11 && (dVar.equals(this.f34275c) || this.f34277e != 4)) {
                    z10 = true;
                }
            }
            z11 = true;
            if (z11) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // p3.e
    public final e getRoot() {
        e eVar;
        synchronized (this.f34274b) {
            e eVar2 = this.f34273a;
            if (eVar2 != null) {
                eVar = eVar2.getRoot();
            } else {
                eVar = this;
            }
        }
        return eVar;
    }

    @Override // p3.d
    public final void h() {
        synchronized (this.f34274b) {
            this.f34278g = true;
            try {
                if (this.f34277e != 4 && this.f != 1) {
                    this.f = 1;
                    this.f34276d.h();
                }
                if (this.f34278g && this.f34277e != 1) {
                    this.f34277e = 1;
                    this.f34275c.h();
                }
            } finally {
                this.f34278g = false;
            }
        }
    }

    @Override // p3.d
    public final boolean i() {
        boolean z10;
        synchronized (this.f34274b) {
            if (this.f34277e == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // p3.d
    public final boolean isRunning() {
        boolean z10;
        synchronized (this.f34274b) {
            z10 = true;
            if (this.f34277e != 1) {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // p3.e
    public final boolean j(d dVar) {
        boolean z10;
        boolean z11;
        synchronized (this.f34274b) {
            e eVar = this.f34273a;
            z10 = false;
            if (eVar != null && !eVar.j(this)) {
                z11 = false;
                if (z11 && dVar.equals(this.f34275c) && !a()) {
                    z10 = true;
                }
            }
            z11 = true;
            if (z11) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // p3.d
    public final void pause() {
        synchronized (this.f34274b) {
            if (!com.ironsource.adapters.facebook.a.c(this.f)) {
                this.f = 2;
                this.f34276d.pause();
            }
            if (!com.ironsource.adapters.facebook.a.c(this.f34277e)) {
                this.f34277e = 2;
                this.f34275c.pause();
            }
        }
    }
}
