package com.ironsource.sdk.controller;

import com.huawei.openalliance.ad.constant.bj;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f26200a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f26201b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26202c;

    /* renamed from: d, reason: collision with root package name */
    public final String f26203d;

    public n(JSONObject jSONObject) {
        this.f26200a = jSONObject.optString("functionName");
        this.f26201b = jSONObject.optJSONObject("functionParams");
        this.f26202c = jSONObject.optString("success");
        this.f26203d = jSONObject.optString(bj.b.S);
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("functionName", this.f26200a);
            jSONObject.put("functionParams", this.f26201b);
            jSONObject.put("success", this.f26202c);
            jSONObject.put(bj.b.S, this.f26203d);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject;
    }
}
