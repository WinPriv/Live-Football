package com.applovin.impl.mediation.debugger.c;

import com.applovin.impl.sdk.e.u;
import com.applovin.impl.sdk.network.b;
import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.d;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c extends com.applovin.impl.sdk.e.a {

    /* renamed from: a, reason: collision with root package name */
    private final b.c<JSONObject> f18003a;

    public c(b.c<JSONObject> cVar, p pVar) {
        super("TaskFetchMediationDebuggerInfo", pVar, true);
        this.f18003a = cVar;
    }

    private JSONObject b() {
        d.a k10;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("installed_mediation_adapters", com.applovin.impl.mediation.d.c.a(this.f));
            if (this.f.S() != null) {
                k10 = this.f.Q().d();
            } else {
                k10 = this.f.R().k();
            }
            jSONObject.put("dnt_code", k10.c().a());
            Boolean a10 = com.applovin.impl.b.a.a().a(f());
            if (((Boolean) this.f.a(com.applovin.impl.sdk.c.b.dR)).booleanValue() && !Boolean.TRUE.equals(a10)) {
                JsonUtils.putStringIfValid(jSONObject, com.anythink.expressad.foundation.g.a.bj, k10.b());
            }
        } catch (JSONException e10) {
            if (y.a()) {
                this.f18839h.b(this.f18838g, "Failed to construct JSON body", e10);
            }
        }
        return jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        u<JSONObject> uVar = new u<JSONObject>(com.applovin.impl.sdk.network.c.a(this.f).b("POST").a(com.applovin.impl.mediation.d.b.c(this.f)).c(com.applovin.impl.mediation.d.b.d(this.f)).a(a()).a((c.a) new JSONObject()).b(((Long) this.f.a(com.applovin.impl.sdk.c.a.f18686g)).intValue()).a(b()).a(), this.f, g()) { // from class: com.applovin.impl.mediation.debugger.c.c.1
            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(JSONObject jSONObject, int i10) {
                c.this.f18003a.a(jSONObject, i10);
            }

            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(int i10, String str, JSONObject jSONObject) {
                c.this.f18003a.a(i10, str, jSONObject);
            }
        };
        uVar.a(com.applovin.impl.sdk.c.a.f18683c);
        uVar.b(com.applovin.impl.sdk.c.a.f18684d);
        this.f.M().a((com.applovin.impl.sdk.e.a) uVar);
    }

    public Map<String, String> a() {
        Map<String, Object> h10;
        Map<String, Object> b10;
        Map<String, String> map = CollectionUtils.map();
        map.put("sdk_version", AppLovinSdk.VERSION);
        if (!((Boolean) this.f.a(com.applovin.impl.sdk.c.b.f18726fa)).booleanValue()) {
            map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f.B());
        }
        if (this.f.S() != null) {
            h10 = this.f.S().d();
            b10 = this.f.S().f();
        } else {
            h10 = this.f.R().h();
            b10 = this.f.R().b();
        }
        map.put("package_name", String.valueOf(h10.get("package_name")));
        map.put("app_version", String.valueOf(h10.get("app_version")));
        map.put("platform", String.valueOf(b10.get("platform")));
        map.put("os", String.valueOf(b10.get("os")));
        return map;
    }
}
