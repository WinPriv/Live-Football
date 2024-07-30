package com.onesignal;

import com.onesignal.v3;
import org.json.JSONObject;

/* compiled from: OneSignalRestClient.java */
/* loaded from: classes2.dex */
public final class u3 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f27101s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ JSONObject f27102t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ v3.c f27103u;

    public u3(String str, JSONObject jSONObject, v3.c cVar) {
        this.f27101s = str;
        this.f27102t = jSONObject;
        this.f27103u = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v3.a(this.f27101s, "PUT", this.f27102t, this.f27103u, 120000, null);
    }
}
