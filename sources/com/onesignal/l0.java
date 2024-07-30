package com.onesignal;

import java.util.TimerTask;

/* compiled from: OSDynamicTriggerController.java */
/* loaded from: classes2.dex */
public final class l0 extends TimerTask {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f26895s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ m0 f26896t;

    public l0(m0 m0Var, String str) {
        this.f26896t = m0Var;
        this.f26895s = str;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        m0 m0Var = this.f26896t;
        m0Var.f26922b.remove(this.f26895s);
        m0Var.f26921a.a();
    }
}
