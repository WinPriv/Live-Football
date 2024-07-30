package com.onesignal;

/* compiled from: OSOutcomeEventsController.java */
/* loaded from: classes2.dex */
public final class i2 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j2 f26856s;

    public i2(j2 j2Var) {
        this.f26856s = j2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread.currentThread().setPriority(10);
        j2 j2Var = this.f26856s;
        j2Var.f26874a.f27892d = j2Var.f26875b;
        j2Var.f26877d.f26901b.d().g(j2Var.f26874a);
    }
}
