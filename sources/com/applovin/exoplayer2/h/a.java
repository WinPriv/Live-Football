package com.applovin.exoplayer2.h;

import android.os.Handler;
import android.os.Looper;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.d.g;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.h.q;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class a implements p {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<p.b> f15244a = new ArrayList<>(1);

    /* renamed from: b, reason: collision with root package name */
    private final HashSet<p.b> f15245b = new HashSet<>(1);

    /* renamed from: c, reason: collision with root package name */
    private final q.a f15246c = new q.a();

    /* renamed from: d, reason: collision with root package name */
    private final g.a f15247d = new g.a();

    /* renamed from: e, reason: collision with root package name */
    private Looper f15248e;
    private ba f;

    public void a() {
    }

    public abstract void a(com.applovin.exoplayer2.k.aa aaVar);

    public void b() {
    }

    public abstract void c();

    @Override // com.applovin.exoplayer2.h.p
    public final void c(p.b bVar) {
        this.f15244a.remove(bVar);
        if (this.f15244a.isEmpty()) {
            this.f15248e = null;
            this.f = null;
            this.f15245b.clear();
            c();
            return;
        }
        b(bVar);
    }

    public final boolean d() {
        return !this.f15245b.isEmpty();
    }

    public final void a(ba baVar) {
        this.f = baVar;
        Iterator<p.b> it = this.f15244a.iterator();
        while (it.hasNext()) {
            it.next().onSourceInfoRefreshed(this, baVar);
        }
    }

    public final g.a b(p.a aVar) {
        return this.f15247d.a(0, aVar);
    }

    @Override // com.applovin.exoplayer2.h.p
    public final void b(p.b bVar) {
        boolean z10 = !this.f15245b.isEmpty();
        this.f15245b.remove(bVar);
        if (z10 && this.f15245b.isEmpty()) {
            b();
        }
    }

    public final q.a a(p.a aVar) {
        return this.f15246c.a(0, aVar, 0L);
    }

    public final q.a a(int i10, p.a aVar, long j10) {
        return this.f15246c.a(i10, aVar, j10);
    }

    public final g.a a(int i10, p.a aVar) {
        return this.f15247d.a(i10, aVar);
    }

    @Override // com.applovin.exoplayer2.h.p
    public final void a(Handler handler, q qVar) {
        com.applovin.exoplayer2.l.a.b(handler);
        com.applovin.exoplayer2.l.a.b(qVar);
        this.f15246c.a(handler, qVar);
    }

    @Override // com.applovin.exoplayer2.h.p
    public final void a(q qVar) {
        this.f15246c.a(qVar);
    }

    @Override // com.applovin.exoplayer2.h.p
    public final void a(Handler handler, com.applovin.exoplayer2.d.g gVar) {
        com.applovin.exoplayer2.l.a.b(handler);
        com.applovin.exoplayer2.l.a.b(gVar);
        this.f15247d.a(handler, gVar);
    }

    @Override // com.applovin.exoplayer2.h.p
    public final void a(com.applovin.exoplayer2.d.g gVar) {
        this.f15247d.a(gVar);
    }

    @Override // com.applovin.exoplayer2.h.p
    public final void a(p.b bVar, com.applovin.exoplayer2.k.aa aaVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f15248e;
        com.applovin.exoplayer2.l.a.a(looper == null || looper == myLooper);
        ba baVar = this.f;
        this.f15244a.add(bVar);
        if (this.f15248e == null) {
            this.f15248e = myLooper;
            this.f15245b.add(bVar);
            a(aaVar);
        } else if (baVar != null) {
            a(bVar);
            bVar.onSourceInfoRefreshed(this, baVar);
        }
    }

    @Override // com.applovin.exoplayer2.h.p
    public final void a(p.b bVar) {
        com.applovin.exoplayer2.l.a.b(this.f15248e);
        boolean isEmpty = this.f15245b.isEmpty();
        this.f15245b.add(bVar);
        if (isEmpty) {
            a();
        }
    }
}
