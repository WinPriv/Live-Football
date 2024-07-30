package com.onesignal;

import org.json.JSONObject;

/* compiled from: OSInAppMessageContent.kt */
/* loaded from: classes2.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public String f26998a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f26999b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f27000c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f27001d;

    /* renamed from: e, reason: collision with root package name */
    public int f27002e;
    public final Double f;

    /* renamed from: g, reason: collision with root package name */
    public int f27003g;

    public r0(JSONObject jSONObject) {
        boolean z10;
        this.f26999b = true;
        this.f27000c = true;
        this.f26998a = jSONObject.optString("html");
        this.f = Double.valueOf(jSONObject.optDouble("display_duration"));
        JSONObject optJSONObject = jSONObject.optJSONObject("styles");
        if (optJSONObject != null) {
            z10 = optJSONObject.optBoolean("remove_height_margin", false);
        } else {
            z10 = false;
        }
        boolean z11 = !z10;
        this.f26999b = z11;
        this.f27000c = !(optJSONObject != null ? optJSONObject.optBoolean("remove_width_margin", false) : false);
        this.f27001d = !z11;
    }
}
