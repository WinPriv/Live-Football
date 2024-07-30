package com.huawei.openalliance.ad.ppskit.handlers;

/* loaded from: classes2.dex */
public final class i implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f22550s;

    public i(l lVar) {
        this.f22550s = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f22550s.f22594k) {
            l lVar = this.f22550s;
            a0.a.Y(lVar.f22593j, lVar.f22592i);
        }
    }
}
