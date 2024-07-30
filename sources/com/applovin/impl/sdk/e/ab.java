package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.network.b;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Collections;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class ab extends y {
    public ab(String str, com.applovin.impl.sdk.p pVar) {
        super(str, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(JSONObject jSONObject) {
        com.applovin.impl.sdk.b.c c10 = c(jSONObject);
        if (c10 == null) {
            return;
        }
        a(c10);
        if (com.applovin.impl.sdk.y.a()) {
            this.f18839h.b(this.f18838g, "Pending reward handled: " + c10);
        }
    }

    private com.applovin.impl.sdk.b.c c(JSONObject jSONObject) {
        Map<String, String> emptyMap;
        String str;
        try {
            JSONObject b10 = com.applovin.impl.sdk.utils.i.b(jSONObject);
            com.applovin.impl.sdk.utils.i.d(b10, this.f);
            com.applovin.impl.sdk.utils.i.c(jSONObject, this.f);
            com.applovin.impl.sdk.utils.i.e(jSONObject, this.f);
            try {
                emptyMap = JsonUtils.toStringMap((JSONObject) b10.get("params"));
            } catch (Throwable unused) {
                emptyMap = Collections.emptyMap();
            }
            try {
                str = b10.getString("result");
            } catch (Throwable unused2) {
                str = "network_timeout";
            }
            return com.applovin.impl.sdk.b.c.a(str, emptyMap);
        } catch (JSONException e10) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f18839h.b(this.f18838g, "Unable to parse API response", e10);
                return null;
            }
            return null;
        }
    }

    public abstract void a(com.applovin.impl.sdk.b.c cVar);

    public abstract boolean b();

    @Override // com.applovin.impl.sdk.e.y
    public int h() {
        return ((Integer) this.f.a(com.applovin.impl.sdk.c.b.bH)).intValue();
    }

    @Override // java.lang.Runnable
    public void run() {
        a(i(), new b.c<JSONObject>() { // from class: com.applovin.impl.sdk.e.ab.1
            @Override // com.applovin.impl.sdk.network.b.c
            public void a(JSONObject jSONObject, int i10) {
                if (ab.this.b()) {
                    com.applovin.impl.sdk.y yVar = ab.this.f18839h;
                    if (com.applovin.impl.sdk.y.a()) {
                        ab abVar = ab.this;
                        abVar.f18839h.e(abVar.f18838g, "Reward validation succeeded with code " + i10 + " but task was cancelled already");
                    }
                    com.applovin.impl.sdk.y yVar2 = ab.this.f18839h;
                    if (com.applovin.impl.sdk.y.a()) {
                        ab abVar2 = ab.this;
                        abVar2.f18839h.e(abVar2.f18838g, "Response: " + jSONObject);
                        return;
                    }
                    return;
                }
                com.applovin.impl.sdk.y yVar3 = ab.this.f18839h;
                if (com.applovin.impl.sdk.y.a()) {
                    ab abVar3 = ab.this;
                    abVar3.f18839h.b(abVar3.f18838g, "Reward validation succeeded with code " + i10 + " and response: " + jSONObject);
                }
                ab.this.b(jSONObject);
            }

            @Override // com.applovin.impl.sdk.network.b.c
            public void a(int i10, String str, JSONObject jSONObject) {
                if (ab.this.b()) {
                    com.applovin.impl.sdk.y yVar = ab.this.f18839h;
                    if (com.applovin.impl.sdk.y.a()) {
                        ab abVar = ab.this;
                        abVar.f18839h.e(abVar.f18838g, "Reward validation failed with error code " + i10 + " but task was cancelled already");
                        return;
                    }
                    return;
                }
                com.applovin.impl.sdk.y yVar2 = ab.this.f18839h;
                if (com.applovin.impl.sdk.y.a()) {
                    ab abVar2 = ab.this;
                    abVar2.f18839h.e(abVar2.f18838g, "Reward validation failed with code " + i10 + " and error: " + str);
                }
                ab.this.a(i10);
            }
        });
    }
}
