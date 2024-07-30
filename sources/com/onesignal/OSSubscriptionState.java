package com.onesignal;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class OSSubscriptionState implements Cloneable {

    /* renamed from: v, reason: collision with root package name */
    public boolean f26619v;

    /* renamed from: s, reason: collision with root package name */
    public final d2<Object, OSSubscriptionState> f26616s = new d2<>("changed", false);

    /* renamed from: w, reason: collision with root package name */
    public final boolean f26620w = !((JSONObject) b4.b().o().c().f27251t).optBoolean("userSubscribePref", true);

    /* renamed from: t, reason: collision with root package name */
    public String f26617t = e3.s();

    /* renamed from: u, reason: collision with root package name */
    public String f26618u = b4.b().n();

    public OSSubscriptionState(boolean z10) {
        this.f26619v = z10;
    }

    public final boolean a() {
        if (this.f26617t != null && this.f26618u != null && !this.f26620w && this.f26619v) {
            return true;
        }
        return false;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f26617t;
            if (str != null) {
                jSONObject.put("userId", str);
            } else {
                jSONObject.put("userId", JSONObject.NULL);
            }
            String str2 = this.f26618u;
            if (str2 != null) {
                jSONObject.put("pushToken", str2);
            } else {
                jSONObject.put("pushToken", JSONObject.NULL);
            }
            jSONObject.put("isPushDisabled", this.f26620w);
            jSONObject.put("isSubscribed", a());
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject;
    }

    public void changed(m2 m2Var) {
        boolean z10 = m2Var.f26924t;
        boolean a10 = a();
        this.f26619v = z10;
        if (a10 != a()) {
            this.f26616s.a(this);
        }
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public final String toString() {
        return b().toString();
    }
}
