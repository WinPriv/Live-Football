package com.applovin.impl.sdk.e;

import android.app.ActivityManager;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.q;
import com.applovin.impl.sdk.s;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.d;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.android.gms.security.ProviderInstaller;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class i extends com.applovin.impl.sdk.e.a {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicBoolean f18867a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    private final int f18868b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f18869c;

    /* renamed from: d, reason: collision with root package name */
    private a f18870d;

    /* loaded from: classes.dex */
    public interface a {
        void a(JSONObject jSONObject);
    }

    /* loaded from: classes.dex */
    public class b extends com.applovin.impl.sdk.e.a {
        public b(com.applovin.impl.sdk.p pVar) {
            super("TaskTimeoutFetchBasicSettings", pVar, true);
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (i.this.f18869c) {
                if (i.this.f18870d != null) {
                    if (com.applovin.impl.sdk.y.a()) {
                        this.f18839h.e(this.f18838g, "Timing out fetch basic settings...");
                    }
                    i.this.a(new JSONObject());
                }
            }
        }
    }

    public i(int i10, com.applovin.impl.sdk.p pVar, a aVar) {
        super("TaskFetchBasicSettings", pVar, true);
        this.f18869c = new Object();
        this.f18868b = i10;
        this.f18870d = aVar;
    }

    private String c() {
        return com.applovin.impl.sdk.utils.i.a((String) this.f.a(com.applovin.impl.sdk.c.b.f18710bc), "5.0/i", d());
    }

    private String h() {
        return com.applovin.impl.sdk.utils.i.a((String) this.f.a(com.applovin.impl.sdk.c.b.f18711bd), "5.0/i", d());
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!com.applovin.impl.sdk.utils.h.i() && f18867a.compareAndSet(false, true)) {
            try {
                ProviderInstaller.installIfNeeded(com.applovin.impl.sdk.p.y());
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.y.a()) {
                    this.f18839h.b(this.f18838g, "Cannot update security provider", th);
                }
            }
        }
        com.applovin.impl.sdk.network.c a10 = com.applovin.impl.sdk.network.c.a(this.f).a(c()).c(h()).a(a()).a(b()).d(((Boolean) this.f.a(com.applovin.impl.sdk.c.b.fg)).booleanValue()).b("POST").a((c.a) new JSONObject()).a(((Integer) this.f.a(com.applovin.impl.sdk.c.b.f2do)).intValue()).c(((Integer) this.f.a(com.applovin.impl.sdk.c.b.dr)).intValue()).b(((Integer) this.f.a(com.applovin.impl.sdk.c.b.dn)).intValue()).a();
        this.f.M().a(new b(this.f), o.a.TIMEOUT, ((Integer) this.f.a(r2)).intValue() + 250);
        u<JSONObject> uVar = new u<JSONObject>(a10, this.f, g()) { // from class: com.applovin.impl.sdk.e.i.1
            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(JSONObject jSONObject, int i10) {
                i.this.a(jSONObject);
            }

            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(int i10, String str, JSONObject jSONObject) {
                if (com.applovin.impl.sdk.y.a()) {
                    this.f18839h.e(this.f18838g, "Unable to fetch basic SDK settings: server returned " + i10);
                }
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                i.this.a(jSONObject);
            }
        };
        uVar.a(com.applovin.impl.sdk.c.b.f18710bc);
        uVar.b(com.applovin.impl.sdk.c.b.f18711bd);
        this.f.M().a((com.applovin.impl.sdk.e.a) uVar);
    }

    public JSONObject b() {
        Map<String, Object> h10;
        Map<String, Object> b10;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_version", AppLovinSdk.VERSION);
            jSONObject.put("is_cross_promo", this.f.e());
            jSONObject.put("init_count", this.f18868b);
            jSONObject.put("server_installed_at", this.f.a(com.applovin.impl.sdk.c.b.al));
            if (this.f.aw()) {
                jSONObject.put("first_install", true);
            }
            if (!this.f.u()) {
                jSONObject.put("first_install_v2", true);
            }
            String str = (String) this.f.a(com.applovin.impl.sdk.c.b.dT);
            if (StringUtils.isValidString(str)) {
                jSONObject.put("plugin_version", str);
            }
            String s10 = this.f.s();
            if (StringUtils.isValidString(s10)) {
                jSONObject.put("mediation_provider", s10);
            }
            jSONObject.put("installed_mediation_adapters", com.applovin.impl.mediation.d.c.a(this.f));
            if (this.f.S() != null) {
                h10 = this.f.S().d();
            } else {
                h10 = this.f.R().h();
            }
            jSONObject.put("package_name", h10.get("package_name"));
            jSONObject.put("app_version", h10.get("app_version"));
            jSONObject.put("test_ads", h10.get("test_ads"));
            jSONObject.put("debug", h10.get("debug"));
            jSONObject.put("tg", h10.get("tg"));
            jSONObject.put("target_sdk", h10.get("target_sdk"));
            List<String> initializationAdUnitIds = this.f.C().getInitializationAdUnitIds();
            if (initializationAdUnitIds != null && initializationAdUnitIds.size() > 0) {
                List<String> removeTrimmedEmptyStrings = CollectionUtils.removeTrimmedEmptyStrings(initializationAdUnitIds);
                jSONObject.put("ad_unit_ids", CollectionUtils.implode(removeTrimmedEmptyStrings, removeTrimmedEmptyStrings.size()));
            }
            jSONObject.put(com.huawei.openalliance.ad.constant.w.f22150cd, h10.get(com.huawei.openalliance.ad.constant.w.f22150cd));
            jSONObject.put("IABTCF_gdprApplies", h10.get("IABTCF_gdprApplies"));
            jSONObject.put("consent_flow_info", this.f.ae().h());
            if (this.f.S() != null) {
                b10 = this.f.S().f();
            } else {
                b10 = this.f.R().b();
            }
            jSONObject.put("platform", b10.get("platform"));
            jSONObject.put("os", b10.get("os"));
            jSONObject.put("locale", b10.get("locale"));
            jSONObject.put("brand", b10.get("brand"));
            jSONObject.put("brand_name", b10.get("brand_name"));
            jSONObject.put("hardware", b10.get("hardware"));
            jSONObject.put("model", b10.get("model"));
            jSONObject.put("revision", b10.get("revision"));
            jSONObject.put("is_tablet", b10.get("is_tablet"));
            jSONObject.put("screen_size_in", b10.get("screen_size_in"));
            if (((Boolean) this.f.a(com.applovin.impl.sdk.c.b.f18724ec)).booleanValue()) {
                jSONObject.put("mtl", this.f.Y().getLastTrimMemoryLevel());
            }
            try {
                ActivityManager activityManager = (ActivityManager) com.applovin.impl.sdk.p.y().getSystemService("activity");
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                if (activityManager != null) {
                    activityManager.getMemoryInfo(memoryInfo);
                    jSONObject.put("fm", memoryInfo.availMem);
                    jSONObject.put("tm", memoryInfo.totalMem);
                    jSONObject.put("lmt", memoryInfo.threshold);
                    jSONObject.put("lm", memoryInfo.lowMemory);
                }
            } catch (Throwable unused) {
            }
            Map<String, String> allData = this.f.r().getAllData();
            if (!allData.isEmpty()) {
                jSONObject.put("targeting_data", new JSONObject(allData));
            }
            if (this.f.S() != null) {
                d.a d10 = this.f.Q().d();
                jSONObject.put("dnt", d10.a());
                jSONObject.put("dnt_code", d10.c().a());
                Boolean a10 = com.applovin.impl.b.a.a().a(f());
                if (((Boolean) this.f.a(com.applovin.impl.sdk.c.b.dP)).booleanValue() && StringUtils.isValidString(d10.b()) && !Boolean.TRUE.equals(a10)) {
                    jSONObject.put(com.anythink.expressad.foundation.g.a.bj, d10.b());
                }
                s.b a11 = this.f.Q().a();
                if (((Boolean) this.f.a(com.applovin.impl.sdk.c.b.dI)).booleanValue() && a11 != null && !Boolean.TRUE.equals(a10)) {
                    jSONObject.put("idfv", a11.a());
                    jSONObject.put("idfv_scope", a11.b());
                }
            } else {
                d.a k10 = this.f.R().k();
                jSONObject.put("dnt", k10.a());
                jSONObject.put("dnt_code", k10.c().a());
                Boolean a12 = com.applovin.impl.b.a.a().a(f());
                if (((Boolean) this.f.a(com.applovin.impl.sdk.c.b.dP)).booleanValue() && StringUtils.isValidString(k10.b()) && !Boolean.TRUE.equals(a12)) {
                    jSONObject.put(com.anythink.expressad.foundation.g.a.bj, k10.b());
                }
                q.a l10 = this.f.R().l();
                if (((Boolean) this.f.a(com.applovin.impl.sdk.c.b.dI)).booleanValue() && l10 != null && !Boolean.TRUE.equals(a12)) {
                    jSONObject.put("idfv", l10.f19278a);
                    jSONObject.put("idfv_scope", l10.f19279b);
                }
            }
            String name = this.f.D().getName();
            if (StringUtils.isValidString(name)) {
                jSONObject.put("user_segment_name", StringUtils.encodeUriString(name));
            }
            if (((Boolean) this.f.a(com.applovin.impl.sdk.c.b.dL)).booleanValue()) {
                jSONObject.put("compass_random_token", this.f.p());
            }
            if (((Boolean) this.f.a(com.applovin.impl.sdk.c.b.dN)).booleanValue()) {
                jSONObject.put("applovin_random_token", this.f.q());
            }
            if (this.f.av().a()) {
                jSONObject.put("test_mode", true);
            }
            String c10 = this.f.av().c();
            if (StringUtils.isValidString(c10)) {
                jSONObject.put("test_mode_network", c10);
            }
            jSONObject.put("sdk_extra_parameters", new JSONObject(this.f.C().getExtraParameters()));
        } catch (JSONException e10) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f18839h.b(this.f18838g, "Failed to construct JSON body", e10);
            }
        }
        return jSONObject;
    }

    public Map<String, String> a() {
        Map<String, String> map = CollectionUtils.map();
        map.put("rid", UUID.randomUUID().toString());
        if (!((Boolean) this.f.a(com.applovin.impl.sdk.c.b.f18726fa)).booleanValue()) {
            map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f.B());
        }
        Boolean a10 = com.applovin.impl.b.a.b().a(f());
        if (a10 != null) {
            map.put(AppLovinSdkExtraParameterKey.HAS_USER_CONSENT, a10.toString());
        }
        Boolean a11 = com.applovin.impl.b.a.a().a(f());
        if (a11 != null) {
            map.put(AppLovinSdkExtraParameterKey.AGE_RESTRICTED_USER, a11.toString());
        }
        Boolean a12 = com.applovin.impl.b.a.c().a(f());
        if (a12 != null) {
            map.put(AppLovinSdkExtraParameterKey.DO_NOT_SELL, a12.toString());
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        synchronized (this.f18869c) {
            a aVar = this.f18870d;
            if (aVar != null) {
                aVar.a(jSONObject);
                this.f18870d = null;
            }
        }
    }
}
