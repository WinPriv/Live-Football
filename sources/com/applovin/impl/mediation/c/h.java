package com.applovin.impl.mediation.c;

import com.anythink.core.api.ATAdConst;
import com.applovin.impl.sdk.e.ab;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h extends ab {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.mediation.a.c f17850a;

    public h(com.applovin.impl.mediation.a.c cVar, p pVar) {
        super("TaskValidateMaxReward", pVar);
        this.f17850a = cVar;
    }

    @Override // com.applovin.impl.sdk.e.y
    public String a() {
        return "2.0/mvr";
    }

    @Override // com.applovin.impl.sdk.e.ab
    public boolean b() {
        return this.f17850a.L();
    }

    @Override // com.applovin.impl.sdk.e.y
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.f17850a.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.f17850a.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f17850a.al());
        JsonUtils.putString(jSONObject, ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, this.f17850a.getFormat().getLabel());
        String K = this.f17850a.K();
        if (!StringUtils.isValidString(K)) {
            K = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", K);
        String J = this.f17850a.J();
        if (!StringUtils.isValidString(J)) {
            J = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", J);
    }

    @Override // com.applovin.impl.sdk.e.ab
    public void a(com.applovin.impl.sdk.b.c cVar) {
        this.f17850a.a(cVar);
    }

    @Override // com.applovin.impl.sdk.e.y
    public void a(int i10) {
        super.a(i10);
        this.f17850a.a(com.applovin.impl.sdk.b.c.a((i10 < 400 || i10 >= 500) ? "network_timeout" : "rejected"));
    }
}
