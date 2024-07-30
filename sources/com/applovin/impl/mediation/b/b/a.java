package com.applovin.impl.mediation.b.b;

import a3.l;
import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.e.u;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.huawei.openalliance.ad.constant.av;
import com.huawei.openalliance.ad.constant.w;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a extends com.applovin.impl.mediation.b.b {

    /* renamed from: d, reason: collision with root package name */
    public static final Uri f17729d = Uri.parse("https://api.taboola.com/");

    /* renamed from: e, reason: collision with root package name */
    private final String f17730e;
    private final Uri f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<String, Object> f17731g;

    /* renamed from: h, reason: collision with root package name */
    private String f17732h;

    /* renamed from: i, reason: collision with root package name */
    private String f17733i;

    public a(String str, String str2, String str3, p pVar) {
        super("TaboolaApiService", pVar);
        this.f17732h = "init";
        this.f17733i = "";
        this.f17730e = str;
        this.f = Uri.withAppendedPath(URLUtil.isValidUrl(str3) ? Uri.parse(str3) : f17729d, "2.0/json/" + str2);
        HashMap hashMap = new HashMap(3);
        this.f17731g = hashMap;
        hashMap.put("type", "mobile");
        hashMap.put("apiKey", str);
        hashMap.put(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, "SERVER");
    }

    private JSONObject d() {
        Map<String, Object> h10;
        JSONObject jSONObject = new JSONObject();
        if (this.f17720a.S() != null) {
            h10 = this.f17720a.S().d();
        } else {
            h10 = this.f17720a.R().h();
        }
        Object obj = h10.get("IABTCF_gdprApplies");
        if (obj != null) {
            JsonUtils.putObject(jSONObject, "gdpr_applies", obj);
            JsonUtils.putString(jSONObject, "daisyBit", String.valueOf(h10.get(w.f22150cd)));
        }
        return jSONObject;
    }

    private JSONObject c(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "id", a(maxAdapterResponseParameters, "taboola_view_id", ""));
        return jSONObject;
    }

    private JSONObject b(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "type", maxAdapterResponseParameters.getCustomParameters().getString("source_type", ""));
        JsonUtils.putString(jSONObject, "id", maxAdapterResponseParameters.getCustomParameters().getString("source_id", ""));
        JsonUtils.putString(jSONObject, "url", maxAdapterResponseParameters.getCustomParameters().getString("source_url", ""));
        return jSONObject;
    }

    public void a(MaxAdapterInitializationParameters maxAdapterInitializationParameters, b bVar) {
        String str = (String) this.f17720a.b(com.applovin.impl.mediation.b.c.f17751a, null, this.f17722c);
        Long l10 = (Long) this.f17720a.b(com.applovin.impl.mediation.b.c.f17752b, null, this.f17722c);
        if (!StringUtils.isValidString(str) || l10 == null) {
            a(bVar);
        } else if (maxAdapterInitializationParameters.getServerParameters().getLong("user_id_expiration_millis", TimeUnit.DAYS.toMillis(30L)) - (System.currentTimeMillis() - l10.longValue()) > TimeUnit.HOURS.toMillis(1L)) {
            this.f17733i = str;
            bVar.onInitialized(true, null);
        } else {
            a(bVar);
        }
    }

    private JSONArray d(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "name", maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        JsonUtils.putInt(jSONObject, "recCount", 1);
        JsonUtils.putString(jSONObject, "organicType", maxAdapterResponseParameters.getCustomParameters().getString("placement_type", "MIX"));
        Map<String, Object> localExtraParameters = maxAdapterResponseParameters.getLocalExtraParameters();
        if (localExtraParameters.containsKey("taboola_thumbnail_height") && localExtraParameters.containsKey("taboola_thumbnail_width")) {
            Integer a10 = a(maxAdapterResponseParameters, "taboola_thumbnail_height", (Integer) 0);
            Integer a11 = a(maxAdapterResponseParameters, "taboola_thumbnail_width", (Integer) 0);
            if (a10.intValue() > 0 && a11.intValue() > 0) {
                JSONObject jSONObject2 = new JSONObject();
                JsonUtils.putInt(jSONObject2, ContentRecord.WIDTH, a10.intValue());
                JsonUtils.putInt(jSONObject2, ContentRecord.HEIGHT, a11.intValue());
                JsonUtils.putJSONObject(jSONObject, "thumbnail", jSONObject2);
            }
        }
        jSONArray.put(jSONObject);
        return jSONArray;
    }

    public void a(final MaxAdapterResponseParameters maxAdapterResponseParameters, final AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putJSONObject(jSONObject, "app", new JSONObject(this.f17731g));
        JsonUtils.putJSONObject(jSONObject, av.O, d());
        JsonUtils.putJSONObject(jSONObject, "user", a(maxAdapterResponseParameters));
        JsonUtils.putJSONObject(jSONObject, av.aq, b(maxAdapterResponseParameters));
        JsonUtils.putJSONObject(jSONObject, com.anythink.expressad.a.B, c(maxAdapterResponseParameters));
        JsonUtils.putJsonArray(jSONObject, "placements", d(maxAdapterResponseParameters));
        this.f17720a.M().a((com.applovin.impl.sdk.e.a) new u<JSONObject>(com.applovin.impl.sdk.network.c.a(this.f17720a).a(this.f.toString() + "/recommendations.get").b("POST").a(jSONObject).a((c.a) new JSONObject()).c(false).d(false).a(), this.f17720a) { // from class: com.applovin.impl.mediation.b.b.a.1
            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(JSONObject jSONObject2, int i10) {
                if (i10 == 200 && jSONObject2 != null) {
                    a.this.f17732h = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject2, "user", new JSONObject()), "session", "");
                    this.f.M().a((com.applovin.impl.sdk.e.a) new c(jSONObject2, maxAdapterResponseParameters, MaxAdFormat.NATIVE, appLovinNativeAdLoadListener, this.f));
                    return;
                }
                if (y.a()) {
                    this.f18839h.e(this.f18838g, "Unable to fetch " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + " Taboola ad: server returned " + i10);
                }
                appLovinNativeAdLoadListener.onNativeAdLoadFailed(new AppLovinError(i10, "Taboola server returned with code: " + jSONObject2));
            }

            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(int i10, String str, JSONObject jSONObject2) {
                if (y.a()) {
                    this.f18839h.e(this.f18838g, "Unable to fetch " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + " Taboola ad: server returned " + i10);
                }
                appLovinNativeAdLoadListener.onNativeAdLoadFailed(new AppLovinError(i10, "Taboola server returned with code: " + jSONObject2));
            }
        });
    }

    private void a(final b bVar) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("app.type", "mobile");
        hashMap.put("app.apikey", this.f17730e);
        this.f17720a.M().a((com.applovin.impl.sdk.e.a) new u<JSONObject>(com.applovin.impl.sdk.network.c.a(this.f17720a).a(this.f.toString() + "/user.sync").b("GET").a((Map<String, String>) hashMap).a((c.a) new JSONObject()).c(false).d(false).a(), this.f17720a) { // from class: com.applovin.impl.mediation.b.b.a.2
            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(JSONObject jSONObject, int i10) {
                if (i10 == 200 && jSONObject != null) {
                    JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "user", new JSONObject());
                    a.this.f17733i = JsonUtils.getString(jSONObject2, "id", "");
                    this.f.a(com.applovin.impl.mediation.b.c.f17751a, (com.applovin.impl.mediation.b.c<String>) a.this.f17733i, ((com.applovin.impl.mediation.b.b) a.this).f17722c);
                    this.f.a(com.applovin.impl.mediation.b.c.f17752b, (com.applovin.impl.mediation.b.c<Long>) Long.valueOf(System.currentTimeMillis()), ((com.applovin.impl.mediation.b.b) a.this).f17722c);
                    bVar.onInitialized(true, null);
                    return;
                }
                String i11 = l.i("Unable to fetch user id. Server returned ", i10);
                if (y.a()) {
                    this.f18839h.e(this.f18838g, i11);
                }
                bVar.onInitialized(false, i11);
            }

            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(int i10, String str, JSONObject jSONObject) {
                if (y.a()) {
                    this.f18839h.e(this.f18838g, "Unable to fetch user id. Server returned " + i10);
                }
                bVar.onInitialized(false, str);
            }
        });
    }

    private JSONObject a(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        Map<String, Object> d10;
        if (this.f17720a.S() != null) {
            d10 = this.f17720a.S().b();
        } else {
            d10 = this.f17720a.R().d();
        }
        String valueOf = String.valueOf(d10.get("ua"));
        String valueOf2 = String.valueOf(d10.get(com.anythink.expressad.foundation.g.a.bj));
        String str = this.f17732h;
        Map<String, Object> localExtraParameters = maxAdapterResponseParameters.getLocalExtraParameters();
        if (localExtraParameters.containsKey("taboola_session")) {
            Object obj = localExtraParameters.get("taboola_session");
            if (obj instanceof String) {
                str = (String) obj;
            }
        }
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "session", str);
        JsonUtils.putString(jSONObject, "agent", valueOf);
        JsonUtils.putString(jSONObject, "device", valueOf2);
        JsonUtils.putString(jSONObject, "id", this.f17733i);
        JsonUtils.putString(jSONObject, "realip", maxAdapterResponseParameters.getServerParameters().getString("s2s_ip", ""));
        return jSONObject;
    }

    private String a(MaxAdapterResponseParameters maxAdapterResponseParameters, String str, String str2) {
        if (maxAdapterResponseParameters.getLocalExtraParameters().containsKey(str)) {
            Object obj = maxAdapterResponseParameters.getLocalExtraParameters().get(str);
            if (obj instanceof String) {
                return (String) obj;
            }
        }
        return maxAdapterResponseParameters.getCustomParameters().getString(str, str2);
    }

    private Integer a(MaxAdapterResponseParameters maxAdapterResponseParameters, String str, Integer num) {
        if (maxAdapterResponseParameters.getLocalExtraParameters().containsKey(str)) {
            Object obj = maxAdapterResponseParameters.getLocalExtraParameters().get(str);
            if (obj instanceof Integer) {
                return (Integer) obj;
            }
        }
        return Integer.valueOf(maxAdapterResponseParameters.getCustomParameters().getInt(str, num.intValue()));
    }
}
