package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.network.b;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class w extends y {
    public w(String str, com.applovin.impl.sdk.p pVar) {
        super(str, pVar);
    }

    private JSONObject a(com.applovin.impl.sdk.b.c cVar) {
        JSONObject i10 = i();
        JsonUtils.putString(i10, "result", cVar.b());
        Map<String, String> a10 = cVar.a();
        if (a10 != null) {
            JsonUtils.putJSONObject(i10, "params", new JSONObject(a10));
        }
        return i10;
    }

    public abstract com.applovin.impl.sdk.b.c b();

    public abstract void b(JSONObject jSONObject);

    public abstract void c();

    @Override // com.applovin.impl.sdk.e.y
    public int h() {
        return ((Integer) this.f.a(com.applovin.impl.sdk.c.b.bI)).intValue();
    }

    @Override // java.lang.Runnable
    public void run() {
        com.applovin.impl.sdk.b.c b10 = b();
        if (b10 != null) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f18839h.b(this.f18838g, "Reporting pending reward: " + b10 + "...");
            }
            a(a(b10), new b.c<JSONObject>() { // from class: com.applovin.impl.sdk.e.w.1
                @Override // com.applovin.impl.sdk.network.b.c
                public void a(JSONObject jSONObject, int i10) {
                    w.this.b(jSONObject);
                }

                @Override // com.applovin.impl.sdk.network.b.c
                public void a(int i10, String str, JSONObject jSONObject) {
                    w.this.a(i10);
                }
            });
            return;
        }
        if (com.applovin.impl.sdk.y.a()) {
            this.f18839h.e(this.f18838g, "Pending reward not found");
        }
        c();
    }
}
