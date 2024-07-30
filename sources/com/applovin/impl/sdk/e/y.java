package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.network.b;
import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class y extends a {
    public y(String str, com.applovin.impl.sdk.p pVar) {
        super(str, pVar);
    }

    public abstract String a();

    public abstract void a(JSONObject jSONObject);

    public void a(JSONObject jSONObject, final b.c<JSONObject> cVar) {
        u<JSONObject> uVar = new u<JSONObject>(com.applovin.impl.sdk.network.c.a(this.f).a(com.applovin.impl.sdk.utils.i.a(a(), this.f)).c(com.applovin.impl.sdk.utils.i.b(a(), this.f)).a(com.applovin.impl.sdk.utils.i.e(this.f)).b("POST").a(jSONObject).d(((Boolean) this.f.a(com.applovin.impl.sdk.c.b.fl)).booleanValue()).a((c.a) new JSONObject()).a(h()).a(), this.f) { // from class: com.applovin.impl.sdk.e.y.1
            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(JSONObject jSONObject2, int i10) {
                cVar.a(jSONObject2, i10);
            }

            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(int i10, String str, JSONObject jSONObject2) {
                cVar.a(i10, str, jSONObject2);
            }
        };
        uVar.a(com.applovin.impl.sdk.c.b.bg);
        uVar.b(com.applovin.impl.sdk.c.b.bh);
        this.f.M().a((a) uVar);
    }

    public abstract int h();

    public JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        String o = this.f.o();
        if (((Boolean) this.f.a(com.applovin.impl.sdk.c.b.dK)).booleanValue() && StringUtils.isValidString(o)) {
            JsonUtils.putString(jSONObject, "cuid", o);
        }
        if (((Boolean) this.f.a(com.applovin.impl.sdk.c.b.dM)).booleanValue()) {
            JsonUtils.putString(jSONObject, "compass_random_token", this.f.p());
        }
        if (((Boolean) this.f.a(com.applovin.impl.sdk.c.b.dO)).booleanValue()) {
            JsonUtils.putString(jSONObject, "applovin_random_token", this.f.q());
        }
        a(jSONObject);
        return jSONObject;
    }

    public void a(int i10) {
        com.applovin.impl.sdk.utils.i.a(i10, this.f);
    }
}
