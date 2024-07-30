package com.huawei.openalliance.ad.ppskit.handlers;

/* loaded from: classes2.dex */
public final class a implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ConfigSpHandler f22495s;

    public a(ConfigSpHandler configSpHandler) {
        this.f22495s = configSpHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f22495s.f22491p) {
            ConfigSpHandler configSpHandler = this.f22495s;
            a0.a.Y(configSpHandler.o, configSpHandler.f22490n);
        }
    }
}
