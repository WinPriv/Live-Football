package com.ironsource.sdk;

import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f26036a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f26037b = false;

    /* renamed from: c, reason: collision with root package name */
    public a f26038c = null;

    /* renamed from: d, reason: collision with root package name */
    public Map<String, String> f26039d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f26040e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final com.ironsource.sdk.j.a f26041g;

    public c(String str, com.ironsource.sdk.j.a aVar) {
        this.f = SDKUtils.requireNonEmptyOrNull(str, "Instance name can't be null");
        this.f26041g = (com.ironsource.sdk.j.a) SDKUtils.requireNonNull(aVar, "AdListener name can't be null");
    }

    public final b a() {
        String a10;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.f);
            jSONObject.put("rewarded", this.f26036a);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        if (!this.f26037b && !this.f26040e) {
            a10 = d.a(jSONObject);
        } else {
            a10 = d.a();
        }
        return new b(a10, this.f, this.f26036a, this.f26037b, this.f26040e, this.f26039d, this.f26041g, this.f26038c);
    }
}
