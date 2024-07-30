package com.onesignal;

import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: OSNotificationIntentExtras.kt */
/* loaded from: classes2.dex */
public final class a2 {

    /* renamed from: a, reason: collision with root package name */
    public final JSONArray f26661a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f26662b;

    public a2(JSONArray jSONArray, JSONObject jSONObject) {
        this.f26661a = jSONArray;
        this.f26662b = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a2) {
                a2 a2Var = (a2) obj;
                if (!zc.d.a(this.f26661a, a2Var.f26661a) || !zc.d.a(this.f26662b, a2Var.f26662b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        JSONArray jSONArray = this.f26661a;
        if (jSONArray != null) {
            i10 = jSONArray.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        JSONObject jSONObject = this.f26662b;
        if (jSONObject != null) {
            i11 = jSONObject.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return "OSNotificationIntentExtras(dataArray=" + this.f26661a + ", jsonData=" + this.f26662b + ")";
    }
}
