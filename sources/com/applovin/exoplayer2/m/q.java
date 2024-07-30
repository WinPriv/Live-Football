package com.applovin.exoplayer2.m;

import com.applovin.exoplayer2.b.d0;
import com.applovin.exoplayer2.m.n;
import com.applovin.exoplayer2.v;
import com.google.android.exoplayer2.drm.e;
import k5.b;
import t7.h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f16547s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f16548t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f16549u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f16550v;

    public /* synthetic */ q(Object obj, Object obj2, Object obj3, int i10) {
        this.f16547s = i10;
        this.f16548t = obj;
        this.f16549u = obj2;
        this.f16550v = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f16547s;
        Object obj = this.f16550v;
        Object obj2 = this.f16549u;
        Object obj3 = this.f16548t;
        switch (i10) {
            case 0:
                ((n.a) obj3).b((v) obj2, (com.applovin.exoplayer2.c.h) obj);
                return;
            case 1:
                e.a aVar = (e.a) obj3;
                ((com.google.android.exoplayer2.drm.e) obj2).N(aVar.f19977a, aVar.f19978b, (Exception) obj);
                return;
            case 2:
                ((b.a) obj3).getClass();
                int i11 = k5.b.C;
                throw null;
            default:
                t7.g gVar = (t7.g) obj3;
                gVar.getClass();
                gVar.f35539s.execute(new d0(13, (Runnable) obj2, (h.b) obj));
                return;
        }
    }
}
