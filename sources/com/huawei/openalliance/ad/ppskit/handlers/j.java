package com.huawei.openalliance.ad.ppskit.handlers;

/* loaded from: classes2.dex */
public final class j implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f22572s;

    public j(l lVar) {
        this.f22572s = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f22572s.f22597n) {
            l lVar = this.f22572s;
            a0.a.Y(lVar.f22596m, lVar.f22595l);
        }
    }
}
