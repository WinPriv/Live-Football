package com.onesignal;

import com.huawei.hms.ads.gl;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSInAppMessageOutcome.java */
/* loaded from: classes2.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f26724a;

    /* renamed from: b, reason: collision with root package name */
    public final float f26725b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f26726c;

    public d1(JSONObject jSONObject) throws JSONException {
        float f;
        boolean z10;
        this.f26724a = jSONObject.getString("name");
        if (jSONObject.has("weight")) {
            f = (float) jSONObject.getDouble("weight");
        } else {
            f = gl.Code;
        }
        this.f26725b = f;
        if (jSONObject.has("unique") && jSONObject.getBoolean("unique")) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f26726c = z10;
    }

    public final String toString() {
        return "OSInAppMessageOutcome{name='" + this.f26724a + "', weight=" + this.f26725b + ", unique=" + this.f26726c + '}';
    }
}
