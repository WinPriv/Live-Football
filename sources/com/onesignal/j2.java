package com.onesignal;

/* compiled from: OSOutcomeEventsController.java */
/* loaded from: classes2.dex */
public final class j2 implements l3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ec.b f26874a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f26875b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f26876c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l2 f26877d;

    public j2(l2 l2Var, ec.b bVar, long j10, String str) {
        this.f26877d = l2Var;
        this.f26874a = bVar;
        this.f26875b = j10;
        this.f26876c = str;
    }

    @Override // com.onesignal.l3
    public final void a(int i10, String str) {
        new Thread(new i2(this), "OS_SAVE_OUTCOMES").start();
        e3.b(4, "Sending outcome with name: " + this.f26876c + " failed with status code: " + i10 + " and response: " + str + "\nOutcome event was cached and will be reattempted on app cold start", null);
    }

    @Override // com.onesignal.l3
    public final void onSuccess() {
        boolean z10;
        l2 l2Var = this.f26877d;
        l2Var.getClass();
        ec.b bVar = this.f26874a;
        ec.d dVar = bVar.f27890b;
        if (dVar != null && (dVar.f27893a != null || dVar.f27894b != null)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            l2Var.f26901b.d().d(l2Var.f26900a);
        } else {
            new Thread(new k2(l2Var, bVar), "OS_SAVE_UNIQUE_OUTCOME_NOTIFICATIONS").start();
        }
    }
}
