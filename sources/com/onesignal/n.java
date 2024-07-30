package com.onesignal;

/* compiled from: GMSLocationController.java */
/* loaded from: classes2.dex */
public final class n implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            m4 m4Var = o.f26952j;
            Thread.sleep(30000);
            e3.b(4, "Location permission exists but GoogleApiClient timed out. Maybe related to mismatch google-play aar versions.", null);
            a0.c();
            a0.g(a0.f26646g);
        } catch (InterruptedException unused) {
        }
    }
}
