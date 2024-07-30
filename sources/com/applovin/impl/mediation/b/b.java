package com.applovin.impl.mediation.b;

import a3.k;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.anythink.core.api.ATAdConst;
import com.anythink.expressad.foundation.g.a.f;
import com.applovin.impl.sdk.c.e;
import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.i;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.huawei.hms.ads.ep;
import com.huawei.openalliance.ad.constant.av;
import com.huawei.openalliance.ad.constant.w;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.vungle.warren.VungleApiClient;
import com.vungle.warren.model.Cookie;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: d, reason: collision with root package name */
    private static JSONObject f17719d;

    /* renamed from: a, reason: collision with root package name */
    protected final p f17720a;

    /* renamed from: b, reason: collision with root package name */
    protected final String f17721b;

    /* renamed from: c, reason: collision with root package name */
    protected final SharedPreferences f17722c = PreferenceManager.getDefaultSharedPreferences(p.y());

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final JSONObject f17723a;

        /* renamed from: b, reason: collision with root package name */
        private final JSONObject f17724b;

        /* renamed from: c, reason: collision with root package name */
        private final JSONObject f17725c;

        /* renamed from: d, reason: collision with root package name */
        private final JSONObject f17726d;

        /* renamed from: e, reason: collision with root package name */
        private final JSONObject f17727e;
        private final JSONObject f;

        /* renamed from: g, reason: collision with root package name */
        private final JSONObject f17728g;

        /* renamed from: com.applovin.impl.mediation.b.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0203a {

            /* renamed from: a, reason: collision with root package name */
            private JSONObject f17739a;

            /* renamed from: b, reason: collision with root package name */
            private JSONObject f17740b;

            /* renamed from: c, reason: collision with root package name */
            private JSONObject f17741c;

            /* renamed from: d, reason: collision with root package name */
            private JSONObject f17742d;

            /* renamed from: e, reason: collision with root package name */
            private JSONObject f17743e;
            private JSONObject f;

            /* renamed from: g, reason: collision with root package name */
            private JSONObject f17744g;

            public C0203a a(JSONObject jSONObject) {
                this.f17739a = jSONObject;
                return this;
            }

            public C0203a b(JSONObject jSONObject) {
                this.f17740b = jSONObject;
                return this;
            }

            public C0203a c(JSONObject jSONObject) {
                this.f17743e = jSONObject;
                return this;
            }

            public C0203a d(JSONObject jSONObject) {
                this.f17744g = jSONObject;
                return this;
            }

            public String toString() {
                return "S2SApiService.Extensions.Builder(bidRequestExtObject=" + this.f17739a + ", impExtObject=" + this.f17740b + ", appExtObject=" + this.f17741c + ", deviceExtObject=" + this.f17742d + ", userExtObject=" + this.f17743e + ", sourceExtObject=" + this.f + ", regsExtObject=" + this.f17744g + ")";
            }

            public a a() {
                return new a(this.f17739a, this.f17740b, this.f17741c, this.f17742d, this.f17743e, this.f, this.f17744g);
            }
        }

        public a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5, JSONObject jSONObject6, JSONObject jSONObject7) {
            this.f17723a = jSONObject;
            this.f17724b = jSONObject2;
            this.f17725c = jSONObject3;
            this.f17726d = jSONObject4;
            this.f17727e = jSONObject5;
            this.f = jSONObject6;
            this.f17728g = jSONObject7;
        }

        public static C0203a a() {
            return new C0203a();
        }
    }

    public b(String str, p pVar) {
        this.f17721b = str;
        this.f17720a = pVar;
    }

    private JSONObject b(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putJSONObjectIfValid(jSONObject2, "ext", jSONObject);
        return jSONObject2;
    }

    public com.applovin.impl.sdk.network.c a(String str, String str2, MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, a aVar, Map<String, String> map, boolean z10, p pVar) {
        Map<String, Object> a10;
        pVar.L();
        if (y.a()) {
            k.t("Creating OpenRTB request with ", str2, pVar.L(), this.f17721b);
        }
        Bundle customParameters = maxAdapterResponseParameters.getCustomParameters();
        Context y = p.y();
        if (pVar.S() != null) {
            a10 = pVar.S().b();
        } else {
            a10 = pVar.R().a(false);
        }
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "id", str2);
        JsonUtils.putBoolean(jSONObject, "test", maxAdapterResponseParameters.isTesting());
        JsonUtils.putJsonArrayIfValid(jSONObject, "imp", a(customParameters, maxAdFormat, aVar.f17724b));
        JsonUtils.putJSONObjectIfValid(jSONObject, "app", a(customParameters, aVar.f17725c, y));
        JsonUtils.putJSONObjectIfValid(jSONObject, "device", a(aVar.f17726d, a10, pVar));
        JsonUtils.putJSONObjectIfValid(jSONObject, "user", a(aVar.f17727e));
        JsonUtils.putJSONObjectIfValid(jSONObject, av.aq, b(aVar.f));
        JsonUtils.putJSONObjectIfValid(jSONObject, "regs", a(aVar.f17728g, y));
        JsonUtils.putJSONObjectIfValid(jSONObject, "format", a(a10));
        JsonUtils.putJSONObjectIfValid(jSONObject, "ext", aVar.f17723a);
        return com.applovin.impl.sdk.network.c.a(pVar).a(str).b("POST").b(map).a(jSONObject).a((c.a) new JSONObject()).c(false).d(z10).a();
    }

    public Boolean c() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(p.y());
        String a10 = com.applovin.impl.sdk.c.d.f18749r.a();
        if (!defaultSharedPreferences.contains(a10)) {
            return null;
        }
        String str = (String) e.a(a10, "", String.class, defaultSharedPreferences);
        boolean z10 = false;
        if (StringUtils.isValidString(str)) {
            if (str.equals("1") || str.equalsIgnoreCase(ep.Code)) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
        Integer num = (Integer) e.a(a10, Integer.MAX_VALUE, Integer.class, defaultSharedPreferences);
        if (num != null && num.intValue() != Integer.MAX_VALUE) {
            if (num.intValue() > 0) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
        Long l10 = (Long) e.a(a10, Long.MAX_VALUE, Long.class, defaultSharedPreferences);
        if (l10 != null && l10.longValue() != Long.MAX_VALUE) {
            if (l10.longValue() > 0) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
        return (Boolean) e.a(a10, Boolean.FALSE, Boolean.class, defaultSharedPreferences);
    }

    public JSONObject b() {
        String valueOf;
        JSONObject jSONObject = new JSONObject();
        Boolean c10 = c();
        if (c10 != null && c10.booleanValue()) {
            JsonUtils.putBoolean(jSONObject, "did_consent", com.applovin.impl.b.a.b().a(p.y()).booleanValue());
            if (this.f17720a.S() != null) {
                valueOf = this.f17720a.Q().C().a();
            } else {
                valueOf = String.valueOf(this.f17720a.R().h().get(w.f22150cd));
            }
            JsonUtils.putString(jSONObject, av.O, valueOf);
        }
        return jSONObject;
    }

    private JSONArray a(Bundle bundle, MaxAdFormat maxAdFormat, JSONObject jSONObject) {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        if (maxAdFormat.isAdViewAd()) {
            JSONObject jSONObject3 = new JSONObject();
            JsonUtils.putDouble(jSONObject3, ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BIDDING_FLOOR, bundle.getDouble(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BIDDING_FLOOR, 0.0d));
            JsonUtils.putInt(jSONObject3, "w", bundle.getInt(ContentRecord.WIDTH, maxAdFormat.getSize().getWidth()));
            JsonUtils.putInt(jSONObject3, "h", bundle.getInt(ContentRecord.WIDTH, maxAdFormat.getSize().getHeight()));
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(3);
            jSONArray2.put(5);
            jSONArray2.put(6);
            JsonUtils.putJsonArray(jSONObject3, "api", jSONArray2);
            JsonUtils.putJSONObject(jSONObject2, f.f9817e, jSONObject3);
        }
        JsonUtils.putJSONObjectIfValid(jSONObject2, "ext", jSONObject);
        jSONArray.put(jSONObject2);
        return jSONArray;
    }

    private JSONObject a(Bundle bundle, JSONObject jSONObject, Context context) {
        JSONObject a10 = a(context);
        JsonUtils.putString(a10, "domain", bundle.getString("domain", ""));
        JsonUtils.putString(a10, "storeurl", bundle.getString("storeurl", ""));
        JsonUtils.putJSONObjectIfValid(a10, "ext", jSONObject);
        return a10;
    }

    private JSONObject a(JSONObject jSONObject, Map<String, Object> map, p pVar) {
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putString(jSONObject2, "ua", String.valueOf(map.get("ua")));
        JsonUtils.putBoolean(jSONObject2, "dnt", ((Boolean) map.get("dnt")).booleanValue());
        JsonUtils.putBoolean(jSONObject2, "lmt", ((Boolean) map.get("dnt")).booleanValue());
        JsonUtils.putString(jSONObject2, VungleApiClient.IFA, String.valueOf(map.get(com.anythink.expressad.foundation.g.a.bj)));
        JsonUtils.putString(jSONObject2, "make", String.valueOf(map.get("brand_name")));
        JsonUtils.putString(jSONObject2, "model", String.valueOf(map.get("model")));
        JsonUtils.putString(jSONObject2, "os", "android");
        JsonUtils.putString(jSONObject2, "osv", String.valueOf(map.get("os")));
        JsonUtils.putInt(jSONObject2, "devicetype", 1);
        JsonUtils.putInt(jSONObject2, "connectiontype", i.g(pVar));
        JsonUtils.putInt(jSONObject2, "w", ((Integer) map.get("dx")).intValue());
        JsonUtils.putInt(jSONObject2, "h", ((Integer) map.get("dy")).intValue());
        JsonUtils.putJSONObjectIfValid(jSONObject2, "ext", jSONObject);
        return jSONObject2;
    }

    private JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putJSONObjectIfValid(jSONObject2, "ext", jSONObject);
        return jSONObject2;
    }

    private JSONObject a(JSONObject jSONObject, Context context) {
        JSONObject jSONObject2 = new JSONObject();
        Boolean a10 = com.applovin.impl.b.a.a().a(context);
        if (a10 != null) {
            JsonUtils.putBoolean(jSONObject2, Cookie.COPPA_KEY, a10.booleanValue());
        }
        JsonUtils.putJSONObjectIfValid(jSONObject2, "ext", jSONObject);
        return jSONObject2;
    }

    private JSONObject a(Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putInt(jSONObject, "w", ((Integer) map.get("dx")).intValue());
        JsonUtils.putInt(jSONObject, "h", ((Integer) map.get("dy")).intValue());
        return jSONObject;
    }

    public JSONObject a() {
        Map<String, Object> h10;
        JSONObject jSONObject = new JSONObject();
        if (this.f17720a.S() != null) {
            h10 = this.f17720a.S().d();
        } else {
            h10 = this.f17720a.R().h();
        }
        JsonUtils.putObject(jSONObject, "gdpr", h10.get("IABTCF_gdprApplies"));
        Boolean a10 = com.applovin.impl.b.a.c().a(p.y());
        if (a10 != null) {
            JsonUtils.putString(jSONObject, "us_privacy", a10.booleanValue() ? "1YY-" : "1YN-");
        }
        return jSONObject;
    }

    private static JSONObject a(Context context) {
        PackageInfo packageInfo;
        JSONObject jSONObject = f17719d;
        if (jSONObject != null) {
            return jSONObject;
        }
        PackageManager packageManager = context.getPackageManager();
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        try {
            packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
        } catch (Throwable unused) {
            packageInfo = null;
        }
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putString(jSONObject2, "name", packageManager.getApplicationLabel(applicationInfo).toString());
        JsonUtils.putString(jSONObject2, "bundle", applicationInfo.packageName);
        JsonUtils.putString(jSONObject2, "ver", packageInfo != null ? packageInfo.versionName : "");
        f17719d = jSONObject2;
        return jSONObject2;
    }
}
