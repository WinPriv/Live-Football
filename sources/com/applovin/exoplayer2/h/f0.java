package com.applovin.exoplayer2.h;

import android.util.Pair;
import com.applovin.exoplayer2.h.q;
import j5.u;
import j7.j0;
import j7.v1;
import k4.r0;
import k4.y0;
import t7.h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f15336s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f15337t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f15338u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f15339v;

    public /* synthetic */ f0(Object obj, Object obj2, Object obj3, int i10) {
        this.f15336s = i10;
        this.f15337t = obj;
        this.f15338u = obj2;
        this.f15339v = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f15336s;
        Object obj = this.f15339v;
        Object obj2 = this.f15338u;
        Object obj3 = this.f15337t;
        switch (i10) {
            case 0:
                ((q.a) obj3).a((q) obj2, (m) obj);
                return;
            case 1:
                r0 r0Var = (r0) obj3;
                r0Var.getClass();
                v1 e10 = ((j0.a) obj2).e();
                r0Var.f30769c.b0(e10, (u.b) obj);
                return;
            case 2:
                Pair pair = (Pair) obj2;
                y0.this.f30840h.O(((Integer) pair.first).intValue(), (u.b) pair.second, (j5.r) obj);
                return;
            default:
                t7.g gVar = (t7.g) obj3;
                gVar.getClass();
                gVar.f35539s.execute(new androidx.appcompat.app.p((Runnable) obj2, (h.b) obj));
                return;
        }
    }
}
