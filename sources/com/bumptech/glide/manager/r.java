package com.bumptech.glide.manager;

import com.bumptech.glide.manager.q;

/* compiled from: SingletonConnectivityReceiver.java */
/* loaded from: classes.dex */
public final class r implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f19820s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ q.c.a f19821t;

    public r(q.c.a aVar, boolean z10) {
        this.f19821t = aVar;
        this.f19820s = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q.c.a aVar = this.f19821t;
        aVar.getClass();
        t3.l.a();
        q.c cVar = q.c.this;
        boolean z10 = cVar.f19815a;
        boolean z11 = this.f19820s;
        cVar.f19815a = z11;
        if (z10 != z11) {
            cVar.f19816b.a(z11);
        }
    }
}
