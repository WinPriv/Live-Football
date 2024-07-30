package com.applovin.impl.mediation.b;

import com.anythink.expressad.exoplayer.k.o;
import com.anythink.expressad.foundation.g.a.f;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.huawei.openalliance.ad.constant.bd;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentTemplateRecord;
import com.vungle.warren.model.Advertisement;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class d extends com.applovin.impl.sdk.e.a {

    /* renamed from: i, reason: collision with root package name */
    private static JSONObject f17754i;

    /* renamed from: j, reason: collision with root package name */
    private static JSONObject f17755j;

    /* renamed from: k, reason: collision with root package name */
    private static JSONObject f17756k;

    /* renamed from: a, reason: collision with root package name */
    protected final JSONObject f17757a;

    /* renamed from: b, reason: collision with root package name */
    protected final MaxAdapterResponseParameters f17758b;

    /* renamed from: c, reason: collision with root package name */
    protected final MaxAdFormat f17759c;

    /* renamed from: d, reason: collision with root package name */
    protected final p f17760d;

    /* renamed from: e, reason: collision with root package name */
    protected String f17761e;

    /* renamed from: l, reason: collision with root package name */
    private final AppLovinAdSize f17762l;

    /* renamed from: m, reason: collision with root package name */
    private final AppLovinAdType f17763m;

    public d(String str, JSONObject jSONObject, MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, p pVar) {
        super(str, pVar);
        this.f17757a = jSONObject;
        this.f17758b = maxAdapterResponseParameters;
        this.f17759c = maxAdFormat;
        this.f17760d = pVar;
        this.f17762l = a(maxAdFormat);
        this.f17763m = b(maxAdFormat);
    }

    private JSONObject b() {
        JSONObject jSONObject = f17754i;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putInt(jSONObject2, "ad_id", 0);
        JsonUtils.putString(jSONObject2, "base_url", Advertisement.FILE_SCHEME);
        JsonUtils.putString(jSONObject2, "graphic_background_color", "#000000");
        JsonUtils.putBoolean(jSONObject2, "lock_current_orientation", true);
        JsonUtils.putBoolean(jSONObject2, "omsdk_enabled", false);
        JsonUtils.putBoolean(jSONObject2, "playback_requires_user_action", true);
        JsonUtils.putString(jSONObject2, "presentation_mode", "activity");
        JsonUtils.putBoolean(jSONObject2, "unhide_adview_on_render", true);
        JsonUtils.putJSONObject(jSONObject2, "web_view_settings", h());
        f17754i = jSONObject2;
        return jSONObject2;
    }

    private JSONObject c() {
        JSONObject jSONObject = f17755j;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putInt(jSONObject2, "ad_id", 0);
        JsonUtils.putBoolean(jSONObject2, "uerp", true);
        JsonUtils.putString(jSONObject2, "presentation_mode", "activity");
        JsonUtils.putJSONObject(jSONObject2, "web_view_settings", h());
        f17755j = jSONObject2;
        return jSONObject2;
    }

    private JSONObject d(a aVar) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "url", aVar.i());
        JsonUtils.putJsonArray(jSONObject, "clicktrackers", aVar.j());
        return jSONObject;
    }

    private JSONArray e(a aVar) {
        JSONArray jSONArray = new JSONArray();
        for (String str : aVar.l()) {
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putString(jSONObject, "url", str);
            JsonUtils.putInt(jSONObject, "event", 1);
            JsonUtils.putInt(jSONObject, "method", 1);
            jSONArray.put(jSONObject);
        }
        for (String str2 : aVar.k()) {
            JSONObject jSONObject2 = new JSONObject();
            JsonUtils.putString(jSONObject2, "url", str2);
            JsonUtils.putInt(jSONObject2, "type", 1);
            JsonUtils.putInt(jSONObject2, "method", 2);
            jSONArray.put(jSONObject2);
        }
        return jSONArray;
    }

    private static JSONObject h() {
        JSONObject jSONObject = f17756k;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putBoolean(jSONObject2, "allow_file_access", true);
        f17756k = jSONObject2;
        return jSONObject2;
    }

    public abstract JSONObject a();

    public JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putString(jSONObject2, "ad_size", this.f17762l.toString());
        JsonUtils.putString(jSONObject2, "ad_type", this.f17763m.toString());
        JsonUtils.putString(jSONObject2, "dsp_name", this.f17761e);
        JsonUtils.putInt(jSONObject2, "status", 200);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject);
        JsonUtils.putJsonArray(jSONObject2, com.anythink.expressad.foundation.d.d.f9543h, jSONArray);
        return jSONObject2;
    }

    private JSONArray c(a aVar) {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putInt(jSONObject, "id", 1);
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putString(jSONObject2, o.f9070c, aVar.c());
        JsonUtils.putJSONObject(jSONObject, "title", jSONObject2);
        jSONArray.put(jSONObject);
        JSONObject jSONObject3 = new JSONObject();
        JsonUtils.putInt(jSONObject3, "id", 8);
        JSONObject jSONObject4 = new JSONObject();
        JsonUtils.putString(jSONObject4, "value", aVar.d());
        JsonUtils.putJSONObject(jSONObject3, "data", jSONObject4);
        jSONArray.put(jSONObject3);
        JSONObject jSONObject5 = new JSONObject();
        JsonUtils.putInt(jSONObject5, "id", 4);
        JSONObject jSONObject6 = new JSONObject();
        JsonUtils.putString(jSONObject6, "value", aVar.e());
        JsonUtils.putJSONObject(jSONObject5, "data", jSONObject6);
        jSONArray.put(jSONObject5);
        if (StringUtils.isValidString(aVar.f())) {
            JSONObject jSONObject7 = new JSONObject();
            JsonUtils.putInt(jSONObject7, "id", 2);
            JSONObject jSONObject8 = new JSONObject();
            JsonUtils.putString(jSONObject8, "url", aVar.f());
            JsonUtils.putInt(jSONObject8, "w", aVar.g());
            JsonUtils.putInt(jSONObject8, "h", aVar.h());
            JsonUtils.putJSONObject(jSONObject7, bd.Code, jSONObject8);
            jSONArray.put(jSONObject7);
        }
        return jSONArray;
    }

    public JSONObject a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject b10 = b();
        JsonUtils.putAll(b10, JsonUtils.deserialize(this.f17758b.getServerParameters().getString("ad_object")));
        JsonUtils.putString(b10, "html", str);
        JsonUtils.putJSONObject(b10, "click_tracking_urls", jSONObject);
        JsonUtils.putJSONObject(b10, "imp_urls", jSONObject2);
        return b10;
    }

    private JSONObject b(a aVar) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putJsonArray(jSONObject, ContentTemplateRecord.ASSETS, c(aVar));
        JsonUtils.putJSONObject(jSONObject, "link", d(aVar));
        JsonUtils.putJsonArray(jSONObject, "eventtrackers", e(aVar));
        JsonUtils.putString(jSONObject, "ver", aVar.b());
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putJSONObject(jSONObject2, f.f9813a, jSONObject);
        JSONObject jSONObject3 = new JSONObject();
        JsonUtils.putString(jSONObject3, "version", aVar.b());
        JsonUtils.putJSONObject(jSONObject3, "value", jSONObject2);
        return jSONObject3;
    }

    public JSONObject a(a aVar) {
        JSONObject c10 = c();
        JsonUtils.putAll(c10, JsonUtils.deserialize(this.f17758b.getServerParameters().getString("ad_object")));
        JsonUtils.putJSONObject(c10, "ortb_response", b(aVar));
        return c10;
    }

    private static AppLovinAdSize a(MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isFullscreenAd()) {
            return AppLovinAdSize.INTERSTITIAL;
        }
        if (MaxAdFormat.BANNER == maxAdFormat) {
            return AppLovinAdSize.BANNER;
        }
        if (MaxAdFormat.LEADER == maxAdFormat) {
            return AppLovinAdSize.LEADER;
        }
        if (MaxAdFormat.MREC == maxAdFormat) {
            return AppLovinAdSize.MREC;
        }
        if (MaxAdFormat.NATIVE == maxAdFormat) {
            return AppLovinAdSize.NATIVE;
        }
        throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
    }

    private static AppLovinAdType b(MaxAdFormat maxAdFormat) {
        if (!maxAdFormat.isAdViewAd() && MaxAdFormat.INTERSTITIAL != maxAdFormat) {
            if (MaxAdFormat.NATIVE == maxAdFormat) {
                return AppLovinAdType.NATIVE;
            }
            if (MaxAdFormat.REWARDED == maxAdFormat) {
                return AppLovinAdType.INCENTIVIZED;
            }
            if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
                return AppLovinAdType.AUTO_INCENTIVIZED;
            }
            if (MaxAdFormat.APP_OPEN == maxAdFormat) {
                return AppLovinAdType.APP_OPEN;
            }
            throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
        }
        return AppLovinAdType.REGULAR;
    }
}
