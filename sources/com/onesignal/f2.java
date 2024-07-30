package com.onesignal;

/* compiled from: OSOutcomeEventsController.java */
/* loaded from: classes2.dex */
public final class f2 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l2 f26827s;

    public f2(l2 l2Var) {
        this.f26827s = l2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread.currentThread().setPriority(10);
        this.f26827s.f26901b.d().e();
    }
}
