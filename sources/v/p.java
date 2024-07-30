package v;

/* compiled from: WidgetRun.java */
/* loaded from: classes.dex */
public abstract class p implements d {

    /* renamed from: a, reason: collision with root package name */
    public int f35895a;

    /* renamed from: b, reason: collision with root package name */
    public u.d f35896b;

    /* renamed from: c, reason: collision with root package name */
    public m f35897c;

    /* renamed from: d, reason: collision with root package name */
    public int f35898d;

    /* renamed from: e, reason: collision with root package name */
    public final g f35899e = new g(this);
    public int f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f35900g = false;

    /* renamed from: h, reason: collision with root package name */
    public final f f35901h = new f(this);

    /* renamed from: i, reason: collision with root package name */
    public final f f35902i = new f(this);

    /* renamed from: j, reason: collision with root package name */
    public int f35903j = 1;

    public p(u.d dVar) {
        this.f35896b = dVar;
    }

    public static void b(f fVar, f fVar2, int i10) {
        fVar.f35882l.add(fVar2);
        fVar.f = i10;
        fVar2.f35881k.add(fVar);
    }

    public static f h(u.c cVar) {
        u.c cVar2 = cVar.f;
        if (cVar2 == null) {
            return null;
        }
        int ordinal = cVar2.f35618e.ordinal();
        u.d dVar = cVar2.f35617d;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal != 5) {
                            return null;
                        }
                        return dVar.f35637e.f35888k;
                    }
                    return dVar.f35637e.f35902i;
                }
                return dVar.f35635d.f35902i;
            }
            return dVar.f35637e.f35901h;
        }
        return dVar.f35635d.f35901h;
    }

    public static f i(u.c cVar, int i10) {
        p pVar;
        u.c cVar2 = cVar.f;
        if (cVar2 == null) {
            return null;
        }
        u.d dVar = cVar2.f35617d;
        if (i10 == 0) {
            pVar = dVar.f35635d;
        } else {
            pVar = dVar.f35637e;
        }
        int ordinal = cVar2.f35618e.ordinal();
        if (ordinal != 1 && ordinal != 2) {
            if (ordinal != 3 && ordinal != 4) {
                return null;
            }
            return pVar.f35902i;
        }
        return pVar.f35901h;
    }

    public final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.f35882l.add(fVar2);
        fVar.f35882l.add(this.f35899e);
        fVar.f35878h = i10;
        fVar.f35879i = gVar;
        fVar2.f35881k.add(fVar);
        gVar.f35881k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i10, int i11) {
        int max;
        if (i11 == 0) {
            u.d dVar = this.f35896b;
            int i12 = dVar.f35667w;
            max = Math.max(dVar.f35666v, i10);
            if (i12 > 0) {
                max = Math.min(i12, i10);
            }
            if (max == i10) {
                return i10;
            }
        } else {
            u.d dVar2 = this.f35896b;
            int i13 = dVar2.f35669z;
            max = Math.max(dVar2.y, i10);
            if (i13 > 0) {
                max = Math.min(i13, i10);
            }
            if (max == i10) {
                return i10;
            }
        }
        return max;
    }

    public long j() {
        if (this.f35899e.f35880j) {
            return r0.f35877g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.f35895a == 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(u.c r12, u.c r13, int r14) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v.p.l(u.c, u.c, int):void");
    }

    @Override // v.d
    public void a(d dVar) {
    }
}
