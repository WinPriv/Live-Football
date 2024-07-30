package j5;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.drm.e;
import j5.u;
import j5.x;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k4.q1;

/* compiled from: BaseMediaSource.java */
/* loaded from: classes2.dex */
public abstract class a implements u {

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList<u.c> f29641s = new ArrayList<>(1);

    /* renamed from: t, reason: collision with root package name */
    public final HashSet<u.c> f29642t = new HashSet<>(1);

    /* renamed from: u, reason: collision with root package name */
    public final x.a f29643u = new x.a();

    /* renamed from: v, reason: collision with root package name */
    public final e.a f29644v = new e.a();

    /* renamed from: w, reason: collision with root package name */
    public Looper f29645w;

    /* renamed from: x, reason: collision with root package name */
    public q1 f29646x;
    public l4.w y;

    @Override // j5.u
    public final void a(Handler handler, x xVar) {
        x.a aVar = this.f29643u;
        aVar.getClass();
        aVar.f29853c.add(new x.a.C0406a(handler, xVar));
    }

    @Override // j5.u
    public final void b(u.c cVar) {
        HashSet<u.c> hashSet = this.f29642t;
        boolean z10 = !hashSet.isEmpty();
        hashSet.remove(cVar);
        if (z10 && hashSet.isEmpty()) {
            s();
        }
    }

    @Override // j5.u
    public final void e(Handler handler, com.google.android.exoplayer2.drm.e eVar) {
        e.a aVar = this.f29644v;
        aVar.getClass();
        aVar.f19979c.add(new e.a.C0231a(handler, eVar));
    }

    @Override // j5.u
    public final void f(u.c cVar) {
        ArrayList<u.c> arrayList = this.f29641s;
        arrayList.remove(cVar);
        if (arrayList.isEmpty()) {
            this.f29645w = null;
            this.f29646x = null;
            this.y = null;
            this.f29642t.clear();
            w();
            return;
        }
        b(cVar);
    }

    @Override // j5.u
    public final void h(com.google.android.exoplayer2.drm.e eVar) {
        CopyOnWriteArrayList<e.a.C0231a> copyOnWriteArrayList = this.f29644v.f19979c;
        Iterator<e.a.C0231a> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            e.a.C0231a next = it.next();
            if (next.f19981b == eVar) {
                copyOnWriteArrayList.remove(next);
            }
        }
    }

    @Override // j5.u
    public final void i(u.c cVar) {
        this.f29645w.getClass();
        HashSet<u.c> hashSet = this.f29642t;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(cVar);
        if (isEmpty) {
            t();
        }
    }

    @Override // j5.u
    public final void l(u.c cVar, c6.h0 h0Var, l4.w wVar) {
        boolean z10;
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f29645w;
        if (looper != null && looper != myLooper) {
            z10 = false;
        } else {
            z10 = true;
        }
        d6.a.a(z10);
        this.y = wVar;
        q1 q1Var = this.f29646x;
        this.f29641s.add(cVar);
        if (this.f29645w == null) {
            this.f29645w = myLooper;
            this.f29642t.add(cVar);
            u(h0Var);
        } else if (q1Var != null) {
            i(cVar);
            cVar.a(this, q1Var);
        }
    }

    @Override // j5.u
    public final void o(x xVar) {
        CopyOnWriteArrayList<x.a.C0406a> copyOnWriteArrayList = this.f29643u.f29853c;
        Iterator<x.a.C0406a> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            x.a.C0406a next = it.next();
            if (next.f29856b == xVar) {
                copyOnWriteArrayList.remove(next);
            }
        }
    }

    public final x.a r(u.b bVar) {
        return new x.a(this.f29643u.f29853c, 0, bVar, 0L);
    }

    public abstract void u(c6.h0 h0Var);

    public final void v(q1 q1Var) {
        this.f29646x = q1Var;
        Iterator<u.c> it = this.f29641s.iterator();
        while (it.hasNext()) {
            it.next().a(this, q1Var);
        }
    }

    public abstract void w();

    public void s() {
    }

    public void t() {
    }
}
