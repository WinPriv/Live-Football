package com.onesignal;

import com.onesignal.v3;

/* compiled from: OneSignalRestClient.java */
/* loaded from: classes2.dex */
public final class w3 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f27183s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ v3.c f27184t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f27185u;

    public w3(String str, v3.c cVar, String str2) {
        this.f27183s = str;
        this.f27184t = cVar;
        this.f27185u = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v3.a(this.f27183s, null, null, this.f27184t, com.huawei.openalliance.ad.constant.w.f22171t, this.f27185u);
    }
}
