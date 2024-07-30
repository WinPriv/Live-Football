package com.applovin.impl.mediation.c;

import com.applovin.impl.sdk.e.w;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.y;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g extends w {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.mediation.a.c f17849a;

    public g(com.applovin.impl.mediation.a.c cVar, p pVar) {
        super("TaskReportMaxReward", pVar);
        this.f17849a = cVar;
    }

    @Override // com.applovin.impl.sdk.e.y
    public String a() {
        return "2.0/mcr";
    }

    @Override // com.applovin.impl.sdk.e.w
    public com.applovin.impl.sdk.b.c b() {
        return this.f17849a.N();
    }

    @Override // com.applovin.impl.sdk.e.w
    public void c() {
        if (y.a()) {
            this.f18839h.e(this.f18838g, "No reward result was found for mediated ad: " + this.f17849a);
        }
    }

    @Override // com.applovin.impl.sdk.e.y
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.f17849a.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.f17849a.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f17849a.al());
        String K = this.f17849a.K();
        if (!StringUtils.isValidString(K)) {
            K = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", K);
        String J = this.f17849a.J();
        if (!StringUtils.isValidString(J)) {
            J = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", J);
    }

    @Override // com.applovin.impl.sdk.e.w
    public void b(JSONObject jSONObject) {
        if (y.a()) {
            this.f18839h.b(this.f18838g, "Reported reward successfully for mediated ad: " + this.f17849a);
        }
    }

    @Override // com.applovin.impl.sdk.e.y
    public void a(int i10) {
        super.a(i10);
        if (y.a()) {
            this.f18839h.b(this.f18838g, "Failed to report reward for mediated ad: " + this.f17849a + " - error code: " + i10);
        }
    }
}
