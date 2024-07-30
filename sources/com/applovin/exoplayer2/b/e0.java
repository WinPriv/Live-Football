package com.applovin.exoplayer2.b;

import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.util.Pair;
import com.applovin.exoplayer2.b.g;
import com.applovin.exoplayer2.d.g;
import com.applovin.exoplayer2.m.n;
import com.google.android.exoplayer2.drm.b;
import d6.g0;
import e6.m;
import j5.u;
import k4.i0;
import k4.y0;
import m4.k;
import p4.u;
import t7.h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f13377s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f13378t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f13379u;

    public /* synthetic */ e0(int i10, Object obj, Object obj2) {
        this.f13377s = i10;
        this.f13378t = obj;
        this.f13379u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p4.u bVar;
        boolean z10 = false;
        switch (this.f13377s) {
            case 0:
                ((g.a) this.f13378t).b((String) this.f13379u);
                return;
            case 1:
                ((g.a) this.f13378t).e((com.applovin.exoplayer2.d.g) this.f13379u);
                return;
            case 2:
                ((n.a) this.f13378t).b((String) this.f13379u);
                return;
            case 3:
                ((n.a) this.f13378t).c((com.applovin.exoplayer2.c.e) this.f13379u);
                return;
            case 4:
                y0.a aVar = (y0.a) this.f13378t;
                Pair pair = (Pair) this.f13379u;
                y0.this.f30840h.B(((Integer) pair.first).intValue(), (u.b) pair.second);
                return;
            case 5:
                k.a aVar2 = (k.a) this.f13378t;
                n4.e eVar = (n4.e) this.f13379u;
                aVar2.getClass();
                synchronized (eVar) {
                }
                m4.k kVar = aVar2.f32748b;
                int i10 = g0.f27302a;
                kVar.p(eVar);
                return;
            case 6:
                b.d dVar = (b.d) this.f13378t;
                i0 i0Var = (i0) this.f13379u;
                com.google.android.exoplayer2.drm.b bVar2 = com.google.android.exoplayer2.drm.b.this;
                if (bVar2.f19955p != 0 && !dVar.f19968u) {
                    Looper looper = bVar2.f19959t;
                    looper.getClass();
                    dVar.f19967t = bVar2.a(looper, dVar.f19966s, i0Var, false);
                    bVar2.f19954n.add(dVar);
                    return;
                }
                return;
            case 7:
                j5.b0 b0Var = (j5.b0) this.f13378t;
                p4.u uVar = (p4.u) this.f13379u;
                if (b0Var.J == null) {
                    bVar = uVar;
                } else {
                    bVar = new u.b(com.anythink.expressad.exoplayer.b.f7291b);
                }
                b0Var.Q = bVar;
                b0Var.R = uVar.i();
                int i11 = 1;
                if (!b0Var.X && uVar.i() == com.anythink.expressad.exoplayer.b.f7291b) {
                    z10 = true;
                }
                b0Var.S = z10;
                if (z10) {
                    i11 = 7;
                }
                b0Var.T = i11;
                ((j5.c0) b0Var.y).y(b0Var.R, uVar.e(), b0Var.S);
                if (!b0Var.N) {
                    b0Var.y();
                    return;
                }
                return;
            case 8:
                e0.i.k(this.f13378t);
                int i12 = k5.b.C;
                throw null;
            case 9:
                m.a aVar3 = (m.a) this.f13378t;
                e6.n nVar = (e6.n) this.f13379u;
                aVar3.getClass();
                int i13 = g0.f27302a;
                aVar3.f27841b.a(nVar);
                return;
            case 10:
                t7.a aVar4 = (t7.a) this.f13378t;
                Runnable runnable = (Runnable) this.f13379u;
                Process.setThreadPriority(aVar4.f35516c);
                StrictMode.ThreadPolicy threadPolicy = aVar4.f35517d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            default:
                Runnable runnable2 = (Runnable) this.f13378t;
                h.b bVar3 = (h.b) this.f13379u;
                try {
                    runnable2.run();
                    return;
                } catch (Exception e10) {
                    ((h.a) bVar3).a(e10);
                    return;
                }
        }
    }
}
