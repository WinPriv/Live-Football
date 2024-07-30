package com.applovin.impl.sdk.e;

import android.text.TextUtils;
import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdk;
import com.huawei.openalliance.ad.constant.ba;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b extends a {
    public b(com.applovin.impl.sdk.p pVar) {
        super("TaskApiSubmitData", pVar);
    }

    private void b(JSONObject jSONObject) throws JSONException {
        Map<String, Object> d10;
        Map<String, Object> h10;
        if (this.f.S() != null) {
            com.applovin.impl.sdk.r S = this.f.S();
            d10 = S.b();
            h10 = S.d();
        } else {
            com.applovin.impl.sdk.q R = this.f.R();
            d10 = R.d();
            h10 = R.h();
        }
        Utils.renameKeyInObjectMap("platform", "type", d10);
        Utils.renameKeyInObjectMap("api_level", "sdk_version", d10);
        jSONObject.put("device_info", new JSONObject(d10));
        Utils.renameKeyInObjectMap("sdk_version", "applovin_sdk_version", h10);
        Utils.renameKeyInObjectMap("ia", "installed_at", h10);
        jSONObject.put(ba.D, new JSONObject(h10));
    }

    private void c(JSONObject jSONObject) throws JSONException {
        if (((Boolean) this.f.a(com.applovin.impl.sdk.c.b.eA)).booleanValue()) {
            jSONObject.put("stats", this.f.P().c());
        }
    }

    private void d(JSONObject jSONObject) {
        u<JSONObject> uVar = new u<JSONObject>(com.applovin.impl.sdk.network.c.a(this.f).a(com.applovin.impl.sdk.utils.i.a("2.0/device", this.f)).c(com.applovin.impl.sdk.utils.i.b("2.0/device", this.f)).a(com.applovin.impl.sdk.utils.i.e(this.f)).b("POST").a(jSONObject).d(((Boolean) this.f.a(com.applovin.impl.sdk.c.b.fh)).booleanValue()).a((c.a) new JSONObject()).a(((Integer) this.f.a(com.applovin.impl.sdk.c.b.dl)).intValue()).a(), this.f) { // from class: com.applovin.impl.sdk.e.b.1
            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(JSONObject jSONObject2, int i10) {
                b.this.a(jSONObject2);
            }

            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(int i10, String str, JSONObject jSONObject2) {
                com.applovin.impl.sdk.utils.i.a(i10, this.f);
            }
        };
        uVar.a(com.applovin.impl.sdk.c.b.bg);
        uVar.b(com.applovin.impl.sdk.c.b.bh);
        this.f.M().a((a) uVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (com.applovin.impl.sdk.y.a()) {
                this.f18839h.c(this.f18838g, "Submitting user data...");
            }
            JSONObject jSONObject = new JSONObject();
            b(jSONObject);
            c(jSONObject);
            d(jSONObject);
        } catch (JSONException e10) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f18839h.b(this.f18838g, "Unable to build JSON message with collected data", e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        try {
            JSONObject b10 = com.applovin.impl.sdk.utils.i.b(jSONObject);
            this.f.N().a(com.applovin.impl.sdk.c.b.f18706ad, b10.getString("device_id"));
            this.f.N().a(com.applovin.impl.sdk.c.b.af, b10.getString("device_token"));
            this.f.N().a(com.applovin.impl.sdk.c.b.ag, Long.valueOf(b10.getLong("publisher_id")));
            com.applovin.impl.sdk.utils.i.d(b10, this.f);
            com.applovin.impl.sdk.utils.i.e(b10, this.f);
            String string = JsonUtils.getString(b10, "latest_version", "");
            if (!TextUtils.isEmpty(string)) {
                String str = AppLovinSdk.VERSION;
                if (!str.equals(string)) {
                    String str2 = "Current SDK version (" + str + ") is outdated. Please integrate the latest version of the AppLovin SDK (" + string + "). Doing so will improve your CPMs and ensure you have access to the latest revenue earning features.";
                    if (JsonUtils.valueExists(b10, "sdk_update_message")) {
                        str2 = JsonUtils.getString(b10, "sdk_update_message", str2);
                    }
                    com.applovin.impl.sdk.y.h("AppLovinSdk", str2);
                }
            }
            this.f.P().b();
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f18839h.b(this.f18838g, "Unable to parse API response", th);
            }
        }
    }
}
