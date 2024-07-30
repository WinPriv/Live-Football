package com.huawei.openalliance.ad.ppskit.handlers;

/* loaded from: classes2.dex */
public final class h implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f22544s;

    public h(l lVar) {
        this.f22544s = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f22544s.f22599q) {
            l lVar = this.f22544s;
            a0.a.Y(lVar.f22598p, lVar.o);
        }
    }
}
