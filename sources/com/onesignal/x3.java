package com.onesignal;

import com.onesignal.v3;

/* compiled from: OneSignalRestClient.java */
/* loaded from: classes2.dex */
public final class x3 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v3.c f27193s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f27194t;

    public x3(v3.c cVar, String str) {
        this.f27193s = cVar;
        this.f27194t = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f27193s.b(this.f27194t);
    }
}
