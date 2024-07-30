package com.applovin.impl.mediation.d;

import com.anythink.expressad.foundation.d.d;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.i;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b extends i {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f17881a = {d.f9543h, "settings", "auto_init_adapters", "test_mode_idfas", "test_mode_auto_init_adapters", "ad_unit_signal_providers"};

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f17882b = {d.f9543h, "settings", "signal_providers", "ad_unit_signal_providers"};

    public static void a(JSONObject jSONObject, p pVar) {
        if (JsonUtils.valueExists(jSONObject, "signal_providers")) {
            JSONObject shallowCopy = JsonUtils.shallowCopy(jSONObject);
            JsonUtils.removeObjectsForKeys(shallowCopy, f17881a);
            pVar.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<String>>) com.applovin.impl.sdk.c.d.F, (com.applovin.impl.sdk.c.d<String>) shallowCopy.toString());
            if (((Boolean) pVar.a(com.applovin.impl.sdk.c.b.fE)).booleanValue()) {
                com.applovin.impl.mediation.c.b.a(shallowCopy);
            }
        }
    }

    public static void b(JSONObject jSONObject, p pVar) {
        if (jSONObject.length() == 0) {
            return;
        }
        if (!JsonUtils.valueExists(jSONObject, "auto_init_adapters") && !JsonUtils.valueExists(jSONObject, "test_mode_auto_init_adapters")) {
            pVar.b(com.applovin.impl.sdk.c.d.G);
            return;
        }
        JSONObject shallowCopy = JsonUtils.shallowCopy(jSONObject);
        JsonUtils.removeObjectsForKeys(shallowCopy, f17882b);
        pVar.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<String>>) com.applovin.impl.sdk.c.d.G, (com.applovin.impl.sdk.c.d<String>) shallowCopy.toString());
    }

    public static String c(p pVar) {
        return i.a((String) pVar.a(com.applovin.impl.sdk.c.a.f18683c), "1.0/mediate_debug", pVar);
    }

    public static String d(p pVar) {
        return i.a((String) pVar.a(com.applovin.impl.sdk.c.a.f18684d), "1.0/mediate_debug", pVar);
    }

    public static void a(JSONObject jSONObject) {
        if (JsonUtils.valueExists(jSONObject, "ad_unit_signal_providers")) {
            com.applovin.impl.mediation.c.b.b(jSONObject);
        }
    }

    public static String b(p pVar) {
        return i.a((String) pVar.a(com.applovin.impl.sdk.c.a.f18684d), "1.0/mediate", pVar);
    }

    public static String a(p pVar) {
        return i.a((String) pVar.a(com.applovin.impl.sdk.c.a.f18683c), "1.0/mediate", pVar);
    }
}
