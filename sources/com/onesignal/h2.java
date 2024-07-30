package com.onesignal;

/* compiled from: OSOutcomeEventsController.java */
/* loaded from: classes2.dex */
public final class h2 implements l3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ec.b f26846a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l2 f26847b;

    public h2(l2 l2Var, ec.b bVar) {
        this.f26847b = l2Var;
        this.f26846a = bVar;
    }

    @Override // com.onesignal.l3
    public final void onSuccess() {
        this.f26847b.f26901b.d().h(this.f26846a);
    }

    @Override // com.onesignal.l3
    public final void a(int i10, String str) {
    }
}
