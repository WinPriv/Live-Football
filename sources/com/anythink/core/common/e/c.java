package com.anythink.core.common.e;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int f5572a;

    /* renamed from: b, reason: collision with root package name */
    public long f5573b;

    public final void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f5572a = jSONObject.optInt("number");
            this.f5573b = jSONObject.optLong("loadTime");
        } catch (Exception unused) {
        }
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("number", this.f5572a);
            jSONObject.put("loadTime", this.f5573b);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }
}
