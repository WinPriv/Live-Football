package com.onesignal;

/* compiled from: CallbackThreadManager.kt */
/* loaded from: classes2.dex */
public final class i extends zc.e implements yc.a<uc.d> {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Runnable f26855s;

    public i(Runnable runnable) {
        this.f26855s = runnable;
    }

    @Override // yc.a
    public final uc.d k() {
        this.f26855s.run();
        return uc.d.f35850a;
    }
}
