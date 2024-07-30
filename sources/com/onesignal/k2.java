package com.onesignal;

/* compiled from: OSOutcomeEventsController.java */
/* loaded from: classes2.dex */
public final class k2 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ec.b f26887s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l2 f26888t;

    public k2(l2 l2Var, ec.b bVar) {
        this.f26888t = l2Var;
        this.f26887s = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread.currentThread().setPriority(10);
        this.f26888t.f26901b.d().a(this.f26887s);
    }
}
