package com.onesignal;

import org.json.JSONObject;

/* compiled from: OSSMSSubscriptionState.java */
/* loaded from: classes2.dex */
public final class p2 implements Cloneable {

    /* renamed from: s, reason: collision with root package name */
    public final d2<Object, p2> f26969s = new d2<>("changed", false);

    /* renamed from: t, reason: collision with root package name */
    public String f26970t = e3.p();

    /* renamed from: u, reason: collision with root package name */
    public final String f26971u = b4.c().n();

    public final JSONObject a() {
        boolean z10;
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f26970t;
            if (str != null) {
                jSONObject.put("smsUserId", str);
            } else {
                jSONObject.put("smsUserId", JSONObject.NULL);
            }
            String str2 = this.f26971u;
            if (str2 != null) {
                jSONObject.put("smsNumber", str2);
            } else {
                jSONObject.put("smsNumber", JSONObject.NULL);
            }
            if (this.f26970t != null && str2 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            jSONObject.put("isSubscribed", z10);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (Throwable unused) {
            return null;
        }
    }

    public final String toString() {
        return a().toString();
    }
}
