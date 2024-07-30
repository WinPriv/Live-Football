package com.onesignal;

import com.onesignal.v3;

/* compiled from: OneSignalRestClient.java */
/* loaded from: classes2.dex */
public final class y3 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v3.c f27204s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f27205t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f27206u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Throwable f27207v;

    public y3(v3.c cVar, int i10, String str, Throwable th) {
        this.f27204s = cVar;
        this.f27205t = i10;
        this.f27206u = str;
        this.f27207v = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f27204s.a(this.f27205t, this.f27206u, this.f27207v);
    }
}
