package com.onesignal;

/* compiled from: OSNotificationDataController.java */
/* loaded from: classes2.dex */
public final class v1 extends g {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y1 f27136s;

    public v1(y1 y1Var) {
        this.f27136s = y1Var;
    }

    @Override // com.onesignal.g, java.lang.Runnable
    public final void run() {
        super.run();
        e3.f26775w.getClass();
        this.f27136s.f27199a.b("notification", "created_time < ?", new String[]{String.valueOf((System.currentTimeMillis() / 1000) - 604800)});
    }
}
