package com.applovin.exoplayer2.h;

import android.util.Pair;
import com.applovin.exoplayer2.h.q;
import j5.u;
import j5.x;
import k4.y0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f15340s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f15341t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f15342u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f15343v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f15344w;

    public /* synthetic */ g0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f15340s = i10;
        this.f15341t = obj;
        this.f15342u = obj2;
        this.f15343v = obj3;
        this.f15344w = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f15340s;
        Object obj = this.f15344w;
        Object obj2 = this.f15343v;
        Object obj3 = this.f15342u;
        Object obj4 = this.f15341t;
        switch (i10) {
            case 0:
                ((q.a) obj4).b((q) obj3, (j) obj2, (m) obj);
                return;
            case 1:
                Pair pair = (Pair) obj3;
                ((y0.a) obj4).f30846t.f30840h.W(((Integer) pair.first).intValue(), (u.b) pair.second, (j5.o) obj2, (j5.r) obj);
                return;
            default:
                x.a aVar = (x.a) obj4;
                ((j5.x) obj3).V(aVar.f29851a, aVar.f29852b, (j5.o) obj2, (j5.r) obj);
                return;
        }
    }
}
