package p3;

/* compiled from: ErrorRequestCoordinator.java */
/* loaded from: classes.dex */
public final class b implements e, d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f34245a;

    /* renamed from: b, reason: collision with root package name */
    public final e f34246b;

    /* renamed from: c, reason: collision with root package name */
    public volatile d f34247c;

    /* renamed from: d, reason: collision with root package name */
    public volatile d f34248d;

    /* renamed from: e, reason: collision with root package name */
    public int f34249e = 3;
    public int f = 3;

    public b(Object obj, e eVar) {
        this.f34245a = obj;
        this.f34246b = eVar;
    }

    @Override // p3.e, p3.d
    public final boolean a() {
        boolean z10;
        synchronized (this.f34245a) {
            if (!this.f34247c.a() && !this.f34248d.a()) {
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
        synchronized (this.f34245a) {
            e eVar = this.f34246b;
            z10 = false;
            if (eVar != null && !eVar.b(this)) {
                z11 = false;
                if (z11 && dVar.equals(this.f34247c)) {
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
        synchronized (this.f34245a) {
            if (dVar.equals(this.f34247c)) {
                this.f34249e = 4;
            } else if (dVar.equals(this.f34248d)) {
                this.f = 4;
            }
            e eVar = this.f34246b;
            if (eVar != null) {
                eVar.c(this);
            }
        }
    }

    @Override // p3.d
    public final void clear() {
        synchronized (this.f34245a) {
            this.f34249e = 3;
            this.f34247c.clear();
            if (this.f != 3) {
                this.f = 3;
                this.f34248d.clear();
            }
        }
    }

    @Override // p3.d
    public final boolean d(d dVar) {
        if (!(dVar instanceof b)) {
            return false;
        }
        b bVar = (b) dVar;
        if (!this.f34247c.d(bVar.f34247c) || !this.f34248d.d(bVar.f34248d)) {
            return false;
        }
        return true;
    }

    @Override // p3.e
    public final void e(d dVar) {
        synchronized (this.f34245a) {
            if (!dVar.equals(this.f34248d)) {
                this.f34249e = 5;
                if (this.f != 1) {
                    this.f = 1;
                    this.f34248d.h();
                }
                return;
            }
            this.f = 5;
            e eVar = this.f34246b;
            if (eVar != null) {
                eVar.e(this);
            }
        }
    }

    @Override // p3.d
    public final boolean f() {
        boolean z10;
        synchronized (this.f34245a) {
            if (this.f34249e == 3 && this.f == 3) {
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
        synchronized (this.f34245a) {
            e eVar = this.f34246b;
            if (eVar != null && !eVar.g(this)) {
                z10 = false;
            }
            z10 = true;
        }
        return z10;
    }

    @Override // p3.e
    public final e getRoot() {
        e eVar;
        synchronized (this.f34245a) {
            e eVar2 = this.f34246b;
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
        synchronized (this.f34245a) {
            if (this.f34249e != 1) {
                this.f34249e = 1;
                this.f34247c.h();
            }
        }
    }

    @Override // p3.d
    public final boolean i() {
        boolean z10;
        synchronized (this.f34245a) {
            if (this.f34249e != 4 && this.f != 4) {
                z10 = false;
            }
            z10 = true;
        }
        return z10;
    }

    @Override // p3.d
    public final boolean isRunning() {
        boolean z10;
        synchronized (this.f34245a) {
            z10 = true;
            if (this.f34249e != 1 && this.f != 1) {
                z10 = false;
            }
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0015 A[Catch: all -> 0x0038, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0009, B:11:0x0015, B:13:0x001a, B:16:0x0021, B:18:0x0029, B:23:0x0036), top: B:3:0x0003 }] */
    @Override // p3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(p3.d r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f34245a
            monitor-enter(r0)
            p3.e r1 = r5.f34246b     // Catch: java.lang.Throwable -> L38
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L12
            boolean r1 = r1.j(r5)     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L10
            goto L12
        L10:
            r1 = r2
            goto L13
        L12:
            r1 = r3
        L13:
            if (r1 == 0) goto L36
            int r1 = r5.f34249e     // Catch: java.lang.Throwable -> L38
            r4 = 5
            if (r1 == r4) goto L21
            p3.d r1 = r5.f34247c     // Catch: java.lang.Throwable -> L38
            boolean r6 = r6.equals(r1)     // Catch: java.lang.Throwable -> L38
            goto L33
        L21:
            p3.d r1 = r5.f34248d     // Catch: java.lang.Throwable -> L38
            boolean r6 = r6.equals(r1)     // Catch: java.lang.Throwable -> L38
            if (r6 == 0) goto L32
            int r6 = r5.f     // Catch: java.lang.Throwable -> L38
            r1 = 4
            if (r6 == r1) goto L30
            if (r6 != r4) goto L32
        L30:
            r6 = r3
            goto L33
        L32:
            r6 = r2
        L33:
            if (r6 == 0) goto L36
            r2 = r3
        L36:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            return r2
        L38:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.b.j(p3.d):boolean");
    }

    @Override // p3.d
    public final void pause() {
        synchronized (this.f34245a) {
            if (this.f34249e == 1) {
                this.f34249e = 2;
                this.f34247c.pause();
            }
            if (this.f == 1) {
                this.f = 2;
                this.f34248d.pause();
            }
        }
    }
}
