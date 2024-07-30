package com.applovin.exoplayer2.d;

import com.applovin.exoplayer2.d.g;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f13969s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g.a f13970t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g f13971u;

    public /* synthetic */ b0(g.a aVar, g gVar, int i10) {
        this.f13969s = i10;
        this.f13970t = aVar;
        this.f13971u = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f13969s;
        g gVar = this.f13971u;
        g.a aVar = this.f13970t;
        switch (i10) {
            case 0:
                g.a.f(aVar, gVar);
                return;
            default:
                g.a.e(aVar, gVar);
                return;
        }
    }
}
