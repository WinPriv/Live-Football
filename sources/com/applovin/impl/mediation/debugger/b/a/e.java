package com.applovin.impl.mediation.debugger.b.a;

import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f17942a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17943b;

    public e(JSONObject jSONObject, p pVar) {
        this.f17942a = JsonUtils.getString(jSONObject, "id", "");
        this.f17943b = JsonUtils.getString(jSONObject, "price", null);
    }

    public String a() {
        return this.f17942a;
    }

    public String b() {
        return this.f17943b;
    }
}
