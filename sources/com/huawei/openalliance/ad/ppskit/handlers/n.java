package com.huawei.openalliance.ad.ppskit.handlers;

/* loaded from: classes2.dex */
public final class n implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f22611s;

    public n(l lVar) {
        this.f22611s = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f22611s.f22591h) {
            l lVar = this.f22611s;
            a0.a.Y(lVar.f22590g, lVar.f);
        }
    }
}
