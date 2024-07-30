package com.onesignal;

import org.json.JSONObject;

/* compiled from: OSEmailSubscriptionState.java */
/* loaded from: classes2.dex */
public final class n0 implements Cloneable {

    /* renamed from: s, reason: collision with root package name */
    public final d2<Object, n0> f26933s = new d2<>("changed", false);

    /* renamed from: t, reason: collision with root package name */
    public String f26934t = e3.l();

    /* renamed from: u, reason: collision with root package name */
    public final String f26935u = b4.a().n();

    public final JSONObject a() {
        boolean z10;
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f26934t;
            if (str != null) {
                jSONObject.put("emailUserId", str);
            } else {
                jSONObject.put("emailUserId", JSONObject.NULL);
            }
            String str2 = this.f26935u;
            if (str2 != null) {
                jSONObject.put("emailAddress", str2);
            } else {
                jSONObject.put("emailAddress", JSONObject.NULL);
            }
            if (this.f26934t != null && str2 != null) {
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
