package com.anythink.expressad.exoplayer.a;

import android.net.NetworkInfo;
import android.view.Surface;
import com.anythink.expressad.exoplayer.a.b;
import com.anythink.expressad.exoplayer.ae;
import com.anythink.expressad.exoplayer.b.g;
import com.anythink.expressad.exoplayer.g.f;
import com.anythink.expressad.exoplayer.h.af;
import com.anythink.expressad.exoplayer.h.s;
import com.anythink.expressad.exoplayer.h.t;
import com.anythink.expressad.exoplayer.j.d;
import com.anythink.expressad.exoplayer.l.h;
import com.anythink.expressad.exoplayer.m;
import com.anythink.expressad.exoplayer.v;
import com.anythink.expressad.exoplayer.w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class a implements g, com.anythink.expressad.exoplayer.d.c, f, t, d.a, h, w.c {

    /* renamed from: b, reason: collision with root package name */
    private final com.anythink.expressad.exoplayer.k.c f7242b;

    /* renamed from: e, reason: collision with root package name */
    private w f7245e;

    /* renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArraySet<com.anythink.expressad.exoplayer.a.b> f7241a = new CopyOnWriteArraySet<>();

    /* renamed from: d, reason: collision with root package name */
    private final b f7244d = new b();

    /* renamed from: c, reason: collision with root package name */
    private final ae.b f7243c = new ae.b();

    /* renamed from: com.anythink.expressad.exoplayer.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0094a {
        public static a a(w wVar, com.anythink.expressad.exoplayer.k.c cVar) {
            return new a(wVar, cVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        private c f7248c;

        /* renamed from: d, reason: collision with root package name */
        private c f7249d;
        private boolean f;

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList<c> f7246a = new ArrayList<>();

        /* renamed from: b, reason: collision with root package name */
        private final ae.a f7247b = new ae.a();

        /* renamed from: e, reason: collision with root package name */
        private ae f7250e = ae.f7271a;

        private void i() {
            if (!this.f7246a.isEmpty()) {
                this.f7248c = this.f7246a.get(0);
            }
        }

        public final c b() {
            return this.f7248c;
        }

        public final c c() {
            return this.f7249d;
        }

        public final c d() {
            if (this.f7246a.isEmpty()) {
                return null;
            }
            return this.f7246a.get(r0.size() - 1);
        }

        public final boolean e() {
            return this.f;
        }

        public final void f() {
            i();
        }

        public final void g() {
            this.f = true;
        }

        public final void h() {
            this.f = false;
            i();
        }

        public final c a() {
            if (this.f7246a.isEmpty() || this.f7250e.a() || this.f) {
                return null;
            }
            return this.f7246a.get(0);
        }

        public final void b(int i10, s.a aVar) {
            c cVar = new c(i10, aVar);
            this.f7246a.remove(cVar);
            if (cVar.equals(this.f7249d)) {
                this.f7249d = this.f7246a.isEmpty() ? null : this.f7246a.get(0);
            }
        }

        public final void c(int i10, s.a aVar) {
            this.f7249d = new c(i10, aVar);
        }

        public final s.a a(int i10) {
            ae aeVar = this.f7250e;
            if (aeVar == null) {
                return null;
            }
            int c10 = aeVar.c();
            s.a aVar = null;
            for (int i11 = 0; i11 < this.f7246a.size(); i11++) {
                c cVar = this.f7246a.get(i11);
                int i12 = cVar.f7252b.f8484a;
                if (i12 < c10 && this.f7250e.a(i12, this.f7247b, false).f7274c == i10) {
                    if (aVar != null) {
                        return null;
                    }
                    aVar = cVar.f7252b;
                }
            }
            return aVar;
        }

        public final void a(ae aeVar) {
            for (int i10 = 0; i10 < this.f7246a.size(); i10++) {
                ArrayList<c> arrayList = this.f7246a;
                arrayList.set(i10, a(arrayList.get(i10), aeVar));
            }
            c cVar = this.f7249d;
            if (cVar != null) {
                this.f7249d = a(cVar, aeVar);
            }
            this.f7250e = aeVar;
            i();
        }

        public final void a(int i10, s.a aVar) {
            this.f7246a.add(new c(i10, aVar));
            if (this.f7246a.size() != 1 || this.f7250e.a()) {
                return;
            }
            i();
        }

        private c a(c cVar, ae aeVar) {
            int a10;
            return (aeVar.a() || this.f7250e.a() || (a10 = aeVar.a(this.f7250e.a(cVar.f7252b.f8484a, this.f7247b, true).f7273b)) == -1) ? cVar : new c(aeVar.a(a10, this.f7247b, false).f7274c, cVar.f7252b.a(a10));
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f7251a;

        /* renamed from: b, reason: collision with root package name */
        public final s.a f7252b;

        public c(int i10, s.a aVar) {
            this.f7251a = i10;
            this.f7252b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && c.class == obj.getClass()) {
                c cVar = (c) obj;
                if (this.f7251a == cVar.f7251a && this.f7252b.equals(cVar.f7252b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f7252b.hashCode() + (this.f7251a * 31);
        }
    }

    public a(w wVar, com.anythink.expressad.exoplayer.k.c cVar) {
        this.f7245e = wVar;
        this.f7242b = (com.anythink.expressad.exoplayer.k.c) com.anythink.expressad.exoplayer.k.a.a(cVar);
    }

    private Set<com.anythink.expressad.exoplayer.a.b> g() {
        return Collections.unmodifiableSet(this.f7241a);
    }

    private b.a h() {
        return a(this.f7244d.b());
    }

    private b.a i() {
        return a(this.f7244d.a());
    }

    private b.a j() {
        return a(this.f7244d.c());
    }

    private b.a k() {
        return a(this.f7244d.d());
    }

    public final void a(com.anythink.expressad.exoplayer.a.b bVar) {
        this.f7241a.add(bVar);
    }

    public final void b(com.anythink.expressad.exoplayer.a.b bVar) {
        this.f7241a.remove(bVar);
    }

    @Override // com.anythink.expressad.exoplayer.b.g
    public final void c(com.anythink.expressad.exoplayer.c.d dVar) {
        b.a i10 = i();
        Iterator<com.anythink.expressad.exoplayer.a.b> it = this.f7241a.iterator();
        while (it.hasNext()) {
            it.next().d(i10, 1);
        }
    }

    @Override // com.anythink.expressad.exoplayer.b.g
    public final void d(com.anythink.expressad.exoplayer.c.d dVar) {
        b.a h10 = h();
        Iterator<com.anythink.expressad.exoplayer.a.b> it = this.f7241a.iterator();
        while (it.hasNext()) {
            it.next().e(h10, 1);
        }
    }

    @Override // com.anythink.expressad.exoplayer.d.c
    public final void e() {
        b.a j10 = j();
        Iterator<com.anythink.expressad.exoplayer.a.b> it = this.f7241a.iterator();
        while (it.hasNext()) {
            it.next().g(j10);
        }
    }

    @Override // com.anythink.expressad.exoplayer.d.c
    public final void f() {
        b.a j10 = j();
        Iterator<com.anythink.expressad.exoplayer.a.b> it = this.f7241a.iterator();
        while (it.hasNext()) {
            it.next().h(j10);
        }
    }

    @Override // com.anythink.expressad.exoplayer.w.c
    public final void onLoadingChanged(boolean z10) {
        b.a i10 = i();
        Iterator<com.anythink.expressad.exoplayer.a.b> it = this.f7241a.iterator();
        while (it.hasNext()) {
            it.next().b(i10, z10);
        }
    }

    @Override // com.anythink.expressad.exoplayer.w.c
    public final void onPlaybackParametersChanged(v vVar) {
        b.a i10 = i();
        Iterator<com.anythink.expressad.exoplayer.a.b> it = this.f7241a.iterator();
        while (it.hasNext()) {
            it.next().a(i10, vVar);
        }
    }

    @Override // com.anythink.expressad.exoplayer.w.c
    public final void onPlayerError(com.anythink.expressad.exoplayer.g gVar) {
        b.a i10 = i();
        Iterator<com.anythink.expressad.exoplayer.a.b> it = this.f7241a.iterator();
        while (it.hasNext()) {
            it.next().a(i10, gVar);
        }
    }

    @Override // com.anythink.expressad.exoplayer.w.c
    public final void onPlayerStateChanged(boolean z10, int i10) {
        b.a i11 = i();
        Iterator<com.anythink.expressad.exoplayer.a.b> it = this.f7241a.iterator();
        while (it.hasNext()) {
            it.next().a(i11, z10, i10);
        }
    }

    @Override // com.anythink.expressad.exoplayer.w.c
    public final void onPositionDiscontinuity(int i10) {
        this.f7244d.f();
        b.a i11 = i();
        Iterator<com.anythink.expressad.exoplayer.a.b> it = this.f7241a.iterator();
        while (it.hasNext()) {
            it.next().b(i11, i10);
        }
    }

    @Override // com.anythink.expressad.exoplayer.w.c
    public final void onRepeatModeChanged(int i10) {
        b.a i11 = i();
        Iterator<com.anythink.expressad.exoplayer.a.b> it = this.f7241a.iterator();
        while (it.hasNext()) {
            it.next().c(i11, i10);
        }
    }

    @Override // com.anythink.expressad.exoplayer.w.c
    public final void onSeekProcessed() {
        if (this.f7244d.e()) {
            this.f7244d.h();
            b.a i10 = i();
            Iterator<com.anythink.expressad.exoplayer.a.b> it = this.f7241a.iterator();
            while (it.hasNext()) {
                it.next().b(i10);
            }
        }
    }

    @Override // com.anythink.expressad.exoplayer.w.c
    public final void onShuffleModeEnabledChanged(boolean z10) {
        b.a i10 = i();
        Iterator<com.anythink.expressad.exoplayer.a.b> it = this.f7241a.iterator();
        while (it.hasNext()) {
            it.next().a(i10, z10);
        }
    }

    @Override // com.anythink.expressad.exoplayer.w.c
    public final void onTimelineChanged(ae aeVar, Object obj, int i10) {
        this.f7244d.a(aeVar);
        b.a i11 = i();
        Iterator<com.anythink.expressad.exoplayer.a.b> it = this.f7241a.iterator();
        while (it.hasNext()) {
            it.next().a(i11, i10);
        }
    }

    @Override // com.anythink.expressad.exoplayer.w.c
    public final void onTracksChanged(af afVar, com.anythink.expressad.exoplayer.i.g gVar) {
        b.a i10 = i();
        Iterator<com.anythink.expressad.exoplayer.a.b> it = this.f7241a.iterator();
        while (it.hasNext()) {
            it.next().a(i10, gVar);
        }
    }

    private void a(w wVar) {
        com.anythink.expressad.exoplayer.k.a.b(this.f7245e == null);
        this.f7245e = (w) com.anythink.expressad.exoplayer.k.a.a(wVar);
    }

    public final void b() {
        Iterator it = new ArrayList(this.f7244d.f7246a).iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            b(cVar.f7251a, cVar.f7252b);
        }
    }

    public final void a() {
        if (this.f7244d.e()) {
            return;
        }
        b.a i10 = i();
        this.f7244d.g();
        Iterator<com.anythink.expressad.exoplayer.a.b> it = this.f7241a.iterator();
        while (it.hasNext()) {
            it.next().a(i10);
        }
    }

    @Override // com.anythink.expressad.exoplayer.h.t
    public final void c(int i10, s.a aVar, t.b bVar, t.c cVar) {
        d(i10, aVar);
        Iterator<com.anythink.expressad.exoplayer.a.b> it = this.f7241a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.anythink.expressad.exoplayer.d.c
    public final void d() {
        b.a j10 = j();
        Iterator<com.anythink.expressad.exoplayer.a.b> it = this.f7241a.iterator();
        while (it.hasNext()) {
            it.next().f(j10);
        }
    }

    @Override // com.anythink.expressad.exoplayer.b.g
    public final void b(String str, long j10, long j11) {
        b.a j12 = j();
        Iterator<com.anythink.expressad.exoplayer.a.b> it = this.f7241a.iterator();
        while (it.hasNext()) {
            it.next().a(j12, 1, str);
        }
    }

    @Override // com.anythink.expressad.exoplayer.h.t
    public final void c(int i10, s.a aVar) {
        this.f7244d.c(i10, aVar);
        b.a d10 = d(i10, aVar);
        Iterator<com.anythink.expressad.exoplayer.a.b> it = this.f7241a.iterator();
        while (it.hasNext()) {
            it.next().e(d10);
        }
    }

    private b.a d(int i10, s.a aVar) {
        long a10;
        long j10;
        com.anythink.expressad.exoplayer.k.a.a(this.f7245e);
        long a11 = this.f7242b.a();
        ae F = this.f7245e.F();
        long j11 = 0;
        if (i10 == this.f7245e.p()) {
            if (aVar != null && aVar.a()) {
                if (this.f7245e.z() == aVar.f8485b && this.f7245e.A() == aVar.f8486c) {
                    j11 = this.f7245e.t();
                }
                j10 = j11;
            } else {
                a10 = this.f7245e.B();
                j10 = a10;
            }
        } else {
            if (i10 < F.b() && (aVar == null || !aVar.a())) {
                a10 = com.anythink.expressad.exoplayer.b.a(F.a(i10, this.f7243c, false).f7283h);
                j10 = a10;
            }
            j10 = j11;
        }
        return new b.a(a11, F, i10, aVar, j10, this.f7245e.t(), this.f7245e.u() - this.f7245e.B());
    }

    private void a(int i10, int i11) {
        b.a i12 = i();
        Iterator<com.anythink.expressad.exoplayer.a.b> it = this.f7241a.iterator();
        while (it.hasNext()) {
            it.next().a(i12, i10, i11);
        }
    }

    @Override // com.anythink.expressad.exoplayer.b.g
    public final void b(m mVar) {
        b.a j10 = j();
        Iterator<com.anythink.expressad.exoplayer.a.b> it = this.f7241a.iterator();
        while (it.hasNext()) {
            it.next().a(j10, 1, mVar);
        }
    }

    @Override // com.anythink.expressad.exoplayer.j.d.a
    public final void c() {
        a(this.f7244d.d());
        Iterator<com.anythink.expressad.exoplayer.a.b> it = this.f7241a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void a(NetworkInfo networkInfo) {
        b.a i10 = i();
        Iterator<com.anythink.expressad.exoplayer.a.b> it = this.f7241a.iterator();
        while (it.hasNext()) {
            it.next().a(i10, networkInfo);
        }
    }

    @Override // com.anythink.expressad.exoplayer.l.h
    public final void b(com.anythink.expressad.exoplayer.c.d dVar) {
        b.a h10 = h();
        Iterator<com.anythink.expressad.exoplayer.a.b> it = this.f7241a.iterator();
        while (it.hasNext()) {
            it.next().e(h10, 2);
        }
    }

    @Override // com.anythink.expressad.exoplayer.g.f
    public final void a(com.anythink.expressad.exoplayer.g.a aVar) {
        b.a i10 = i();
        Iterator<com.anythink.expressad.exoplayer.a.b> it = this.f7241a.iterator();
        while (it.hasNext()) {
            it.next().a(i10, aVar);
        }
    }

    @Override // com.anythink.expressad.exoplayer.h.t
    public final void b(int i10, s.a aVar) {
        this.f7244d.b(i10, aVar);
        b.a d10 = d(i10, aVar);
        Iterator<com.anythink.expressad.exoplayer.a.b> it = this.f7241a.iterator();
        while (it.hasNext()) {
            it.next().d(d10);
        }
    }

    @Override // com.anythink.expressad.exoplayer.b.g
    public final void a(int i10) {
        b.a j10 = j();
        Iterator<com.anythink.expressad.exoplayer.a.b> it = this.f7241a.iterator();
        while (it.hasNext()) {
            it.next().f(j10, i10);
        }
    }

    @Override // com.anythink.expressad.exoplayer.h.t
    public final void b(int i10, s.a aVar, t.b bVar, t.c cVar) {
        d(i10, aVar);
        Iterator<com.anythink.expressad.exoplayer.a.b> it = this.f7241a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.anythink.expressad.exoplayer.b.g
    public final void a(int i10, long j10, long j11) {
        b.a j12 = j();
        Iterator<com.anythink.expressad.exoplayer.a.b> it = this.f7241a.iterator();
        while (it.hasNext()) {
            it.next().a(j12, i10, j10, j11);
        }
    }

    @Override // com.anythink.expressad.exoplayer.h.t
    public final void b(int i10, s.a aVar, t.c cVar) {
        b.a d10 = d(i10, aVar);
        Iterator<com.anythink.expressad.exoplayer.a.b> it = this.f7241a.iterator();
        while (it.hasNext()) {
            it.next().a(d10, cVar);
        }
    }

    @Override // com.anythink.expressad.exoplayer.l.h
    public final void a(com.anythink.expressad.exoplayer.c.d dVar) {
        b.a i10 = i();
        Iterator<com.anythink.expressad.exoplayer.a.b> it = this.f7241a.iterator();
        while (it.hasNext()) {
            it.next().d(i10, 2);
        }
    }

    @Override // com.anythink.expressad.exoplayer.l.h
    public final void a(String str, long j10, long j11) {
        b.a j12 = j();
        Iterator<com.anythink.expressad.exoplayer.a.b> it = this.f7241a.iterator();
        while (it.hasNext()) {
            it.next().a(j12, 2, str);
        }
    }

    @Override // com.anythink.expressad.exoplayer.l.h
    public final void a(m mVar) {
        b.a j10 = j();
        Iterator<com.anythink.expressad.exoplayer.a.b> it = this.f7241a.iterator();
        while (it.hasNext()) {
            it.next().a(j10, 2, mVar);
        }
    }

    @Override // com.anythink.expressad.exoplayer.l.h
    public final void a(int i10, long j10) {
        b.a h10 = h();
        Iterator<com.anythink.expressad.exoplayer.a.b> it = this.f7241a.iterator();
        while (it.hasNext()) {
            it.next().g(h10, i10);
        }
    }

    @Override // com.anythink.expressad.exoplayer.l.h
    public final void a(int i10, int i11, int i12, float f) {
        b.a j10 = j();
        Iterator<com.anythink.expressad.exoplayer.a.b> it = this.f7241a.iterator();
        while (it.hasNext()) {
            it.next().b(j10, i10, i11);
        }
    }

    @Override // com.anythink.expressad.exoplayer.l.h
    public final void a(Surface surface) {
        b.a j10 = j();
        Iterator<com.anythink.expressad.exoplayer.a.b> it = this.f7241a.iterator();
        while (it.hasNext()) {
            it.next().a(j10, surface);
        }
    }

    @Override // com.anythink.expressad.exoplayer.h.t
    public final void a(int i10, s.a aVar) {
        this.f7244d.a(i10, aVar);
        b.a d10 = d(i10, aVar);
        Iterator<com.anythink.expressad.exoplayer.a.b> it = this.f7241a.iterator();
        while (it.hasNext()) {
            it.next().c(d10);
        }
    }

    @Override // com.anythink.expressad.exoplayer.h.t
    public final void a(int i10, s.a aVar, t.b bVar, t.c cVar) {
        d(i10, aVar);
        Iterator<com.anythink.expressad.exoplayer.a.b> it = this.f7241a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.anythink.expressad.exoplayer.h.t
    public final void a(int i10, s.a aVar, t.b bVar, t.c cVar, IOException iOException, boolean z10) {
        b.a d10 = d(i10, aVar);
        Iterator<com.anythink.expressad.exoplayer.a.b> it = this.f7241a.iterator();
        while (it.hasNext()) {
            it.next().a(d10, iOException);
        }
    }

    @Override // com.anythink.expressad.exoplayer.h.t
    public final void a(int i10, s.a aVar, t.c cVar) {
        b.a d10 = d(i10, aVar);
        Iterator<com.anythink.expressad.exoplayer.a.b> it = this.f7241a.iterator();
        while (it.hasNext()) {
            it.next().b(d10, cVar);
        }
    }

    @Override // com.anythink.expressad.exoplayer.d.c
    public final void a(Exception exc) {
        b.a j10 = j();
        Iterator<com.anythink.expressad.exoplayer.a.b> it = this.f7241a.iterator();
        while (it.hasNext()) {
            it.next().a(j10, exc);
        }
    }

    private b.a a(c cVar) {
        if (cVar == null) {
            int p10 = ((w) com.anythink.expressad.exoplayer.k.a.a(this.f7245e)).p();
            return d(p10, this.f7244d.a(p10));
        }
        return d(cVar.f7251a, cVar.f7252b);
    }
}
