package com.ironsource.environment.f;

import com.ironsource.mediationsdk.C1428r;
import org.json.JSONObject;
import zc.d;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f24675a;

    public b() {
        String[] strArr;
        strArr = a.f24674b;
        this.f24675a = strArr;
        new C1428r();
    }

    public final JSONObject a() {
        JSONObject a10 = C1428r.a(this.f24675a);
        d.c(a10, "mGlobalDataReader.getDataByKeys(mTokenKeyList)");
        return a(a10);
    }

    public static JSONObject a(JSONObject jSONObject) {
        JSONObject a10 = com.ironsource.environment.c.b.a(jSONObject.optJSONObject("md"));
        if (a10 != null) {
            jSONObject.put("md", a10);
        }
        return jSONObject;
    }
}
