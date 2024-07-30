package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class v extends w {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.e f18945a;

    public v(com.applovin.impl.sdk.ad.e eVar, com.applovin.impl.sdk.p pVar) {
        super("TaskReportAppLovinReward", pVar);
        this.f18945a = eVar;
    }

    @Override // com.applovin.impl.sdk.e.y
    public String a() {
        return "2.0/cr";
    }

    @Override // com.applovin.impl.sdk.e.w
    public com.applovin.impl.sdk.b.c b() {
        return this.f18945a.aI();
    }

    @Override // com.applovin.impl.sdk.e.w
    public void c() {
        if (com.applovin.impl.sdk.y.a()) {
            this.f18839h.e(this.f18838g, "No reward result was found for ad: " + this.f18945a);
        }
    }

    @Override // com.applovin.impl.sdk.e.y
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "zone_id", this.f18945a.getAdZone().a());
        JsonUtils.putInt(jSONObject, "fire_percent", this.f18945a.ae());
        String clCode = this.f18945a.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    @Override // com.applovin.impl.sdk.e.w
    public void b(JSONObject jSONObject) {
        if (com.applovin.impl.sdk.y.a()) {
            this.f18839h.b(this.f18838g, "Reported reward successfully for ad: " + this.f18945a);
        }
    }

    @Override // com.applovin.impl.sdk.e.y
    public void a(int i10) {
        super.a(i10);
        if (com.applovin.impl.sdk.y.a()) {
            this.f18839h.e(this.f18838g, "Failed to report reward for ad: " + this.f18945a + " - error code: " + i10);
        }
    }
}
