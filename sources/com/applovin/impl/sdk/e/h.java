package com.applovin.impl.sdk.e;

import com.anythink.core.api.ATAdConst;
import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class h extends a {

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.ad.d f18865a;

    public h(com.applovin.impl.sdk.ad.d dVar, String str, com.applovin.impl.sdk.p pVar) {
        super(str, pVar);
        this.f18865a = dVar;
    }

    private Map<String, String> i() {
        Map<String, String> map = CollectionUtils.map(3);
        map.put("AppLovin-Zone-Id", this.f18865a.a());
        if (this.f18865a.c() != null) {
            map.put("AppLovin-Ad-Size", this.f18865a.c().getLabel());
        }
        if (this.f18865a.d() != null) {
            map.put("AppLovin-Ad-Type", this.f18865a.d().getLabel());
        }
        return map;
    }

    public abstract a a(JSONObject jSONObject);

    public Map<String, String> a() {
        Map<String, String> map = CollectionUtils.map(4);
        map.put("zone_id", this.f18865a.a());
        if (this.f18865a.c() != null) {
            map.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, this.f18865a.c().getLabel());
        }
        if (this.f18865a.d() != null) {
            map.put("require", this.f18865a.d().getLabel());
        }
        return map;
    }

    public abstract String b();

    public void b(JSONObject jSONObject) {
        com.applovin.impl.sdk.utils.i.d(jSONObject, this.f);
        com.applovin.impl.sdk.utils.i.c(jSONObject, this.f);
        com.applovin.impl.sdk.utils.i.e(jSONObject, this.f);
        com.applovin.impl.sdk.ad.d.a(jSONObject);
        this.f.M().a(a(jSONObject));
    }

    public abstract String c();

    public com.applovin.impl.sdk.ad.b h() {
        if (this.f18865a.e()) {
            return com.applovin.impl.sdk.ad.b.APPLOVIN_PRIMARY_ZONE;
        }
        return com.applovin.impl.sdk.ad.b.APPLOVIN_CUSTOM_ZONE;
    }

    @Override // java.lang.Runnable
    public void run() {
        Map<String, Object> a10;
        Map<String, String> map;
        Map<String, Object> a11;
        if (com.applovin.impl.sdk.y.a()) {
            this.f18839h.b(this.f18838g, "Fetching next ad of zone: " + this.f18865a);
        }
        if (((Boolean) this.f.a(com.applovin.impl.sdk.c.b.dZ)).booleanValue() && Utils.isVPNConnected() && com.applovin.impl.sdk.y.a()) {
            this.f18839h.b(this.f18838g, "User is connected to a VPN");
        }
        com.applovin.impl.sdk.d.g P = this.f.P();
        P.a(com.applovin.impl.sdk.d.f.f18807a);
        com.applovin.impl.sdk.d.f fVar = com.applovin.impl.sdk.d.f.f18810d;
        if (P.b(fVar) == 0) {
            P.b(fVar, System.currentTimeMillis());
        }
        try {
            JSONObject andResetCustomPostBody = this.f.E().getAndResetCustomPostBody();
            String str = "POST";
            if (((Boolean) this.f.a(com.applovin.impl.sdk.c.b.du)).booleanValue()) {
                if (this.f.S() != null) {
                    a11 = this.f.S().a(a(), false, true);
                } else {
                    a11 = this.f.R().a(a(), false, true);
                }
                JSONObject jSONObject = new JSONObject(a11);
                map = CollectionUtils.map();
                map.put("rid", UUID.randomUUID().toString());
                if (!((Boolean) this.f.a(com.applovin.impl.sdk.c.b.f18726fa)).booleanValue()) {
                    map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f.B());
                }
                if (andResetCustomPostBody != null) {
                    JsonUtils.putAll(jSONObject, andResetCustomPostBody);
                }
                andResetCustomPostBody = jSONObject;
            } else {
                if (this.f.S() != null) {
                    a10 = this.f.S().a(a(), false, false);
                } else {
                    a10 = this.f.R().a(a(), false, false);
                }
                Map<String, String> stringifyObjectMap = Utils.stringifyObjectMap(a10);
                if (andResetCustomPostBody == null) {
                    andResetCustomPostBody = null;
                    str = "GET";
                }
                map = stringifyObjectMap;
            }
            if (Utils.isDspDemoApp(f())) {
                map.putAll(this.f.E().getAndResetCustomQueryParams());
            }
            a(P);
            c.a b10 = com.applovin.impl.sdk.network.c.a(this.f).a(b()).c(c()).a(map).b(str).b(i()).a((c.a) new JSONObject()).a(((Integer) this.f.a(com.applovin.impl.sdk.c.b.di)).intValue()).a(((Boolean) this.f.a(com.applovin.impl.sdk.c.b.dj)).booleanValue()).b(((Boolean) this.f.a(com.applovin.impl.sdk.c.b.dk)).booleanValue()).b(((Integer) this.f.a(com.applovin.impl.sdk.c.b.dh)).intValue());
            if (andResetCustomPostBody != null) {
                b10.a(andResetCustomPostBody);
                b10.d(((Boolean) this.f.a(com.applovin.impl.sdk.c.b.fi)).booleanValue());
            }
            u<JSONObject> uVar = new u<JSONObject>(b10.a(), this.f) { // from class: com.applovin.impl.sdk.e.h.1
                @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
                public void a(JSONObject jSONObject2, int i10) {
                    if (i10 == 200) {
                        JsonUtils.putLong(jSONObject2, "ad_fetch_latency_millis", this.f18941e.a());
                        JsonUtils.putLong(jSONObject2, "ad_fetch_response_size", this.f18941e.b());
                        h.this.b(jSONObject2);
                        return;
                    }
                    h.this.a(i10, MaxAdapterError.NO_FILL.getErrorMessage());
                }

                @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
                public void a(int i10, String str2, JSONObject jSONObject2) {
                    h.this.a(i10, str2);
                }
            };
            uVar.a(com.applovin.impl.sdk.c.b.be);
            uVar.b(com.applovin.impl.sdk.c.b.bf);
            this.f.M().a((a) uVar);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f18839h.b(this.f18838g, "Unable to fetch ad " + this.f18865a, th);
            }
            a(0, th.getMessage());
        }
    }

    public void a(int i10, String str) {
        if (com.applovin.impl.sdk.y.a()) {
            this.f18839h.e(this.f18838g, "Unable to fetch " + this.f18865a + " ad: server returned " + i10);
        }
        if (i10 == -800) {
            this.f.P().a(com.applovin.impl.sdk.d.f.f18815j);
        }
    }

    private void a(com.applovin.impl.sdk.d.g gVar) {
        com.applovin.impl.sdk.d.f fVar = com.applovin.impl.sdk.d.f.f18810d;
        long b10 = gVar.b(fVar);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - b10 > TimeUnit.MINUTES.toMillis(((Integer) this.f.a(com.applovin.impl.sdk.c.b.dA)).intValue())) {
            gVar.b(fVar, currentTimeMillis);
            gVar.c(com.applovin.impl.sdk.d.f.f18811e);
            gVar.c(com.applovin.impl.sdk.d.f.f);
        }
    }
}
