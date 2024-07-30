package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.utils.Utils;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class m extends com.applovin.impl.sdk.e.a {

    /* renamed from: a, reason: collision with root package name */
    private final a f18876a;

    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    public m(com.applovin.impl.sdk.p pVar, a aVar) {
        super("TaskFetchVariables", pVar);
        this.f18876a = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        u<JSONObject> uVar = new u<JSONObject>(com.applovin.impl.sdk.network.c.a(this.f).a(com.applovin.impl.sdk.utils.i.l(this.f)).c(com.applovin.impl.sdk.utils.i.m(this.f)).a(a()).b("GET").a((c.a) new JSONObject()).b(((Integer) this.f.a(com.applovin.impl.sdk.c.b.ds)).intValue()).a(), this.f) { // from class: com.applovin.impl.sdk.e.m.1
            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(JSONObject jSONObject, int i10) {
                com.applovin.impl.sdk.utils.i.d(jSONObject, this.f);
                com.applovin.impl.sdk.utils.i.c(jSONObject, this.f);
                com.applovin.impl.sdk.utils.i.f(jSONObject, this.f);
                com.applovin.impl.sdk.utils.i.e(jSONObject, this.f);
                m.this.f18876a.a();
            }

            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(int i10, String str, JSONObject jSONObject) {
                if (com.applovin.impl.sdk.y.a()) {
                    this.f18839h.e(this.f18838g, "Unable to fetch variables: server returned " + i10);
                }
                com.applovin.impl.sdk.y.i("AppLovinVariableService", "Failed to load variables.");
                m.this.f18876a.a();
            }
        };
        uVar.a(com.applovin.impl.sdk.c.b.bk);
        uVar.b(com.applovin.impl.sdk.c.b.bl);
        this.f.M().a((com.applovin.impl.sdk.e.a) uVar);
    }

    private Map<String, String> a() {
        if (this.f.S() != null) {
            return Utils.stringifyObjectMap(this.f.S().a(null, false, false));
        }
        return Utils.stringifyObjectMap(this.f.R().a(null, false, false));
    }
}
