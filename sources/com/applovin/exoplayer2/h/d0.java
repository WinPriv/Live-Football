package com.applovin.exoplayer2.h;

import com.applovin.exoplayer2.h.q;
import java.util.logging.Logger;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f15309s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f15310t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f15311u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f15312v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f15313w;

    public /* synthetic */ d0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f15309s = i10;
        this.f15310t = obj;
        this.f15311u = obj2;
        this.f15312v = obj3;
        this.f15313w = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f15309s;
        Object obj = this.f15313w;
        Object obj2 = this.f15312v;
        Object obj3 = this.f15311u;
        Object obj4 = this.f15310t;
        switch (i10) {
            case 0:
                ((q.a) obj4).c((q) obj3, (j) obj2, (m) obj);
                return;
            default:
                e4.a aVar = (e4.a) obj4;
                z3.s sVar = (z3.s) obj3;
                com.applovin.exoplayer2.a0 a0Var = (com.applovin.exoplayer2.a0) obj2;
                z3.n nVar = (z3.n) obj;
                Logger logger = e4.a.f;
                aVar.getClass();
                Logger logger2 = e4.a.f;
                try {
                    a4.m mVar = aVar.f27745c.get(sVar.b());
                    if (mVar == null) {
                        String format = String.format("Transport backend '%s' is not registered", sVar.b());
                        logger2.warning(format);
                        new IllegalArgumentException(format);
                        a0Var.getClass();
                    } else {
                        aVar.f27747e.e(new com.applovin.exoplayer2.a.m(aVar, sVar, mVar.a(nVar), 2));
                        a0Var.getClass();
                    }
                    return;
                } catch (Exception e10) {
                    logger2.warning("Error scheduling event " + e10.getMessage());
                    a0Var.getClass();
                    return;
                }
        }
    }
}
