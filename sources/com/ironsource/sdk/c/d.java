package com.ironsource.sdk.c;

import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f26062a = "d";

    /* renamed from: c, reason: collision with root package name */
    public static d f26063c;

    /* renamed from: b, reason: collision with root package name */
    public Map<String, e> f26064b = Collections.synchronizedMap(new HashMap());

    public static synchronized d a() {
        d dVar;
        synchronized (d.class) {
            if (f26063c == null) {
                f26063c = new d();
            }
            dVar = f26063c;
        }
        return dVar;
    }

    public static boolean b(JSONObject jSONObject) {
        try {
            return jSONObject.getBoolean("shouldCreateContainer");
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static com.ironsource.sdk.a d(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString("adSize"));
            String obj = jSONObject2.get(ContentRecord.HEIGHT).toString();
            String obj2 = jSONObject2.get(ContentRecord.WIDTH).toString();
            return new com.ironsource.sdk.a(Integer.parseInt(obj2), Integer.parseInt(obj), jSONObject2.get("label").toString());
        } catch (Exception unused) {
            return new com.ironsource.sdk.a();
        }
    }

    public com.ironsource.sdk.a c(JSONObject jSONObject) {
        com.ironsource.sdk.a aVar = new com.ironsource.sdk.a();
        try {
            return d(jSONObject);
        } catch (Exception e10) {
            e10.printStackTrace();
            return aVar;
        }
    }

    public final e a(String str) {
        if (str.isEmpty() || !this.f26064b.containsKey(str)) {
            return null;
        }
        return this.f26064b.get(str);
    }

    public static String a(JSONObject jSONObject) {
        if (jSONObject == null || !jSONObject.has("adViewId")) {
            return (jSONObject == null || !jSONObject.has("params")) ? "" : new JSONObject(jSONObject.getString("params")).getString("adViewId");
        }
        return jSONObject.getString("adViewId");
    }
}
