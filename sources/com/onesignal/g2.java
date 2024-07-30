package com.onesignal;

/* compiled from: OSOutcomeEventsController.java */
/* loaded from: classes2.dex */
public final class g2 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l2 f26835s;

    public g2(l2 l2Var) {
        this.f26835s = l2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread.currentThread().setPriority(10);
        l2 l2Var = this.f26835s;
        for (ec.b bVar : l2Var.f26901b.d().b()) {
            new OSUtils();
            int b10 = OSUtils.b();
            l2Var.f26901b.d().c(e3.f26752d, b10, bVar, new h2(l2Var, bVar));
        }
    }
}
