package com.huawei.openalliance.ad.ppskit.handlers;

/* loaded from: classes2.dex */
public final class o implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f22612s;

    public o(l lVar) {
        this.f22612s = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f22612s.f22591h) {
            l lVar = this.f22612s;
            a0.a.Y(lVar.f22590g, lVar.f);
        }
    }
}
