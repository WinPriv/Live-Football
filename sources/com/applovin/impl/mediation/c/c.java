package com.applovin.impl.mediation.c;

import android.content.Context;
import com.anythink.core.api.ATAdConst;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.e.u;
import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.i;
import com.applovin.impl.sdk.utils.k;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.Collection;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c extends com.applovin.impl.sdk.e.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f17796a;

    /* renamed from: b, reason: collision with root package name */
    private final MaxAdFormat f17797b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, Object> f17798c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, Object> f17799d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, Object> f17800e;

    /* renamed from: i, reason: collision with root package name */
    private final JSONArray f17801i;

    /* renamed from: j, reason: collision with root package name */
    private final Context f17802j;

    /* renamed from: k, reason: collision with root package name */
    private final a.InterfaceC0201a f17803k;

    public c(String str, MaxAdFormat maxAdFormat, Map<String, Object> map, Map<String, Object> map2, Map<String, Object> map3, JSONArray jSONArray, Context context, p pVar, a.InterfaceC0201a interfaceC0201a) {
        super(s.f.b("TaskFetchMediatedAd ", str), pVar);
        this.f17796a = str;
        this.f17797b = maxAdFormat;
        this.f17798c = map;
        this.f17799d = map2;
        this.f17800e = map3;
        this.f17801i = jSONArray;
        this.f17802j = context;
        this.f17803k = interfaceC0201a;
    }

    private String b() {
        return com.applovin.impl.mediation.d.b.b(this.f);
    }

    private Map<String, String> c() {
        Map<String, String> map = CollectionUtils.map(2);
        map.put("AppLovin-Ad-Unit-Id", this.f17796a);
        map.put("AppLovin-Ad-Format", this.f17797b.getLabel());
        return map;
    }

    private void d(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = this.f17801i;
        if (jSONArray != null) {
            jSONObject.put("signal_data", jSONArray);
        }
    }

    private void e(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("ad_unit_id", this.f17796a);
        jSONObject2.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, this.f17797b.getLabel());
        Map map = CollectionUtils.map(this.f17799d);
        com.applovin.impl.mediation.a.a a10 = this.f.at().a(this.f17796a);
        if (a10 != null) {
            map.put("previous_winning_network", a10.X());
            map.put("previous_winning_network_name", a10.getNetworkName());
        }
        jSONObject2.put("extra_parameters", CollectionUtils.toJson(map));
        jSONObject.put("ad_info", jSONObject2);
    }

    private void f(JSONObject jSONObject) {
        JSONObject andResetCustomPostBodyData = this.f.ap().getAndResetCustomPostBodyData();
        if (andResetCustomPostBodyData != null && Utils.isDspDemoApp(p.y())) {
            JsonUtils.putAll(jSONObject, andResetCustomPostBodyData);
        }
    }

    private void g(JSONObject jSONObject) {
        JsonUtils.putObject(jSONObject, "sdk_extra_parameters", new JSONObject(this.f.C().getExtraParameters()));
    }

    private JSONObject h() throws JSONException {
        Map<String, Object> a10;
        if (this.f.S() != null) {
            a10 = this.f.S().a(null, false, true);
        } else {
            a10 = this.f.R().a(null, false, true);
        }
        a10.putAll(this.f17800e);
        JSONObject jSONObject = new JSONObject(a10);
        e(jSONObject);
        d(jSONObject);
        c(jSONObject);
        f(jSONObject);
        g(jSONObject);
        return jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (y.a()) {
            this.f18839h.b(this.f18838g, "Fetching next ad for ad unit id: " + this.f17796a + " and format: " + this.f17797b);
        }
        if (((Boolean) this.f.a(com.applovin.impl.sdk.c.b.dZ)).booleanValue() && Utils.isVPNConnected() && y.a()) {
            this.f18839h.b(this.f18838g, "User is connected to a VPN");
        }
        com.applovin.impl.sdk.d.g P = this.f.P();
        P.a(com.applovin.impl.sdk.d.f.f18820p);
        com.applovin.impl.sdk.d.f fVar = com.applovin.impl.sdk.d.f.f18810d;
        if (P.b(fVar) == 0) {
            P.b(fVar, System.currentTimeMillis());
        }
        try {
            JSONObject h10 = h();
            Map<String, String> map = CollectionUtils.map();
            map.put("rid", UUID.randomUUID().toString());
            if (!((Boolean) this.f.a(com.applovin.impl.sdk.c.b.f18726fa)).booleanValue()) {
                map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f.B());
            }
            if (this.f.av().a()) {
                map.put("test_mode", "1");
            }
            String c10 = this.f.av().c();
            if (StringUtils.isValidString(c10)) {
                map.put("filter_ad_network", c10);
                if (!this.f.av().a()) {
                    map.put("fhkZsVqYC7", "1");
                }
                if (this.f.av().b()) {
                    map.put("force_ad_network", c10);
                }
            }
            a(P);
            u<JSONObject> uVar = new u<JSONObject>(com.applovin.impl.sdk.network.c.a(this.f).b("POST").b(c()).a(a()).c(b()).a(map).a(h10).d(((Boolean) this.f.a(com.applovin.impl.sdk.c.a.f18680aa)).booleanValue()).a((c.a) new JSONObject()).b(((Long) this.f.a(com.applovin.impl.sdk.c.a.f)).intValue()).a(((Integer) this.f.a(com.applovin.impl.sdk.c.b.di)).intValue()).c(((Long) this.f.a(com.applovin.impl.sdk.c.a.f18685e)).intValue()).a(), this.f) { // from class: com.applovin.impl.mediation.c.c.1
                @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
                public void a(JSONObject jSONObject, int i10) {
                    if (i10 != 200) {
                        c.this.a(i10, (String) null);
                        return;
                    }
                    JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.f18941e.a());
                    JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.f18941e.b());
                    c.this.a(jSONObject);
                }

                @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
                public void a(int i10, String str, JSONObject jSONObject) {
                    c.this.a(i10, str);
                }
            };
            uVar.a(com.applovin.impl.sdk.c.a.f18683c);
            uVar.b(com.applovin.impl.sdk.c.a.f18684d);
            this.f.M().a((com.applovin.impl.sdk.e.a) uVar);
        } catch (Throwable th) {
            if (y.a()) {
                this.f18839h.b(this.f18838g, "Unable to fetch ad " + this.f17796a, th);
            }
            throw new RuntimeException("Unable to fetch ad: " + th);
        }
    }

    private com.applovin.impl.sdk.e.a b(JSONObject jSONObject) {
        if (((Boolean) this.f.a(com.applovin.impl.sdk.c.a.X)).booleanValue()) {
            return new f(this.f17796a, this.f17797b, this.f17798c, jSONObject, this.f17802j, this.f, this.f17803k);
        }
        return new e(this.f17796a, this.f17797b, this.f17798c, jSONObject, this.f17802j, this.f, this.f17803k);
    }

    private String a() {
        return com.applovin.impl.mediation.d.b.a(this.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        try {
            i.d(jSONObject, this.f);
            i.c(jSONObject, this.f);
            i.e(jSONObject, this.f);
            i.f(jSONObject, this.f);
            com.applovin.impl.mediation.d.b.a(jSONObject, this.f);
            com.applovin.impl.mediation.d.b.a(jSONObject);
            com.applovin.impl.mediation.d.b.b(jSONObject, this.f);
            com.applovin.impl.sdk.h.a(this.f);
            if (this.f17797b != MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, null))) {
                y.i(this.f18838g, "Ad format requested does not match ad unit id's format.");
            }
            this.f.M().a(b(jSONObject));
        } catch (Throwable th) {
            if (y.a()) {
                this.f18839h.b(this.f18838g, "Unable to process mediated ad response", th);
            }
            throw new RuntimeException("Unable to process ad: " + th);
        }
    }

    private void c(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("disabled", new JSONArray((Collection) this.f.an().c()));
            jSONObject2.put("installed", com.applovin.impl.mediation.d.c.a(this.f));
            jSONObject2.put("initialized", this.f.ao().c());
            jSONObject2.put("initialized_classnames", new JSONArray((Collection) this.f.ao().b().keySet()));
            jSONObject2.put("loaded_classnames", new JSONArray((Collection) this.f.an().a()));
            jSONObject2.put("failed_classnames", new JSONArray((Collection) this.f.an().b()));
            jSONObject.put("adapters_info", jSONObject2);
        } catch (Exception e10) {
            if (y.a()) {
                this.f18839h.b(this.f18838g, "Failed to populate adapter classNames", e10);
            }
            throw new RuntimeException("Failed to populate classNames: " + e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, String str) {
        MaxErrorImpl maxErrorImpl;
        if (y.a()) {
            this.f18839h.e(this.f18838g, "Unable to fetch " + this.f17796a + " ad: server returned " + i10);
        }
        if (i10 == -800) {
            this.f.P().a(com.applovin.impl.sdk.d.f.f18821q);
        }
        if (i10 == -1009) {
            maxErrorImpl = new MaxErrorImpl(-1009, str);
        } else if (i10 == -1001) {
            maxErrorImpl = new MaxErrorImpl(-1001, str);
        } else if (StringUtils.isValidString(str)) {
            maxErrorImpl = new MaxErrorImpl(-1000, str);
        } else {
            maxErrorImpl = new MaxErrorImpl(-1);
        }
        k.a(this.f17803k, this.f17796a, maxErrorImpl);
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
