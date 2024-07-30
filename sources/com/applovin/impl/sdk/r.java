package com.applovin.impl.sdk;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.util.Base64;
import com.anythink.core.api.ATAdConst;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.s;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.d;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.huawei.openalliance.ad.constant.av;
import com.huawei.openalliance.ad.constant.ba;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private final p f19282a;

    /* renamed from: c, reason: collision with root package name */
    private final s f19284c;

    /* renamed from: e, reason: collision with root package name */
    private final Object f19286e = new Object();

    /* renamed from: g, reason: collision with root package name */
    private final Object f19287g = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Context f19283b = p.y();

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, Object> f19285d = i();
    private final Map<String, Object> f = k();

    public r(p pVar) {
        this.f19282a = pVar;
        this.f19284c = pVar.Q();
    }

    private Map<String, String> h() {
        return Utils.stringifyObjectMap(a(null, true, false));
    }

    private Map<String, Object> i() {
        String str;
        Map<String, Object> map = CollectionUtils.map(35);
        CollectionUtils.putStringIfValid("kb", this.f19284c.z(), map);
        CollectionUtils.putBooleanIfValid("gy", Boolean.valueOf(this.f19284c.y()), map);
        CollectionUtils.putDoubleIfValid("tz_offset", Double.valueOf(this.f19284c.x()), map);
        CollectionUtils.putLongIfValid("tm", Long.valueOf(this.f19284c.u().d()), map);
        CollectionUtils.putLongIfValid("tds", Long.valueOf(this.f19284c.A()), map);
        CollectionUtils.putStringIfValid(com.anythink.expressad.foundation.g.a.bD, this.f19284c.q().b(), map);
        CollectionUtils.putStringIfValid("carrier", this.f19284c.q().c(), map);
        CollectionUtils.putStringIfValid("mcc", this.f19284c.q().d(), map);
        CollectionUtils.putStringIfValid("mnc", this.f19284c.q().e(), map);
        CollectionUtils.putIntegerIfValid("adnsd", Integer.valueOf(this.f19284c.t().c()), map);
        CollectionUtils.putIntegerIfValid("dx", Integer.valueOf(this.f19284c.t().a()), map);
        CollectionUtils.putIntegerIfValid("dy", Integer.valueOf(this.f19284c.t().b()), map);
        CollectionUtils.putFloatIfValid("adns", Float.valueOf(this.f19284c.t().f()), map);
        CollectionUtils.putFloatIfValid("xdpi", Float.valueOf(this.f19284c.t().d()), map);
        CollectionUtils.putFloatIfValid("ydpi", Float.valueOf(this.f19284c.t().e()), map);
        CollectionUtils.putDoubleIfValid("screen_size_in", Double.valueOf(this.f19284c.t().g()), map);
        CollectionUtils.putStringIfValid("orientation_lock", this.f19284c.w(), map);
        CollectionUtils.putIntegerIfValid("api_level", Integer.valueOf(Build.VERSION.SDK_INT), map);
        CollectionUtils.putStringIfValid("brand", Build.MANUFACTURER, map);
        CollectionUtils.putStringIfValid("brand_name", Build.BRAND, map);
        CollectionUtils.putStringIfValid("hardware", Build.HARDWARE, map);
        CollectionUtils.putStringIfValid("locale", Locale.getDefault().toString(), map);
        CollectionUtils.putStringIfValid("model", Build.MODEL, map);
        CollectionUtils.putStringIfValid("os", Build.VERSION.RELEASE, map);
        CollectionUtils.putStringIfValid("revision", Build.DEVICE, map);
        if (AppLovinSdkUtils.isFireOS(this.f19283b)) {
            str = "fireos";
        } else {
            str = "android";
        }
        CollectionUtils.putStringIfValid("platform", str, map);
        CollectionUtils.putBooleanIfValid("sim", Boolean.valueOf(AppLovinSdkUtils.isEmulator()), map);
        CollectionUtils.putBooleanIfValid("aida", Boolean.valueOf(com.applovin.impl.sdk.utils.d.a()), map);
        CollectionUtils.putBooleanIfValid("is_tablet", Boolean.valueOf(AppLovinSdkUtils.isTablet(this.f19283b)), map);
        CollectionUtils.putBooleanIfValid("tv", Boolean.valueOf(AppLovinSdkUtils.isTv(this.f19283b)), map);
        CollectionUtils.putLongIfValid("bt_ms", Long.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()), map);
        a(map);
        return map;
    }

    private Map<String, Object> j() {
        if (!this.f19282a.C().isLocationCollectionEnabled() || !((Boolean) this.f19282a.a(com.applovin.impl.sdk.c.b.ex)).booleanValue()) {
            return null;
        }
        Map<String, Object> map = CollectionUtils.map(4);
        x ah = this.f19282a.ah();
        boolean b10 = ah.b();
        CollectionUtils.putBooleanIfValid("loc_services_enabled", Boolean.valueOf(b10), map);
        if (!b10) {
            return map;
        }
        CollectionUtils.putBooleanIfValid("loc_auth", Boolean.valueOf(ah.a()), map);
        if (!this.f19282a.ah().c()) {
            return map;
        }
        double d10 = ah.d();
        p pVar = this.f19282a;
        com.applovin.impl.sdk.c.b<Integer> bVar = com.applovin.impl.sdk.c.b.ez;
        CollectionUtils.putStringIfValid("loc_lat", Utils.formatDoubleValue(d10, ((Integer) pVar.a(bVar)).intValue()), map);
        CollectionUtils.putStringIfValid("loc_long", Utils.formatDoubleValue(ah.e(), ((Integer) this.f19282a.a(bVar)).intValue()), map);
        return map;
    }

    private Map<String, Object> k() {
        Map<String, Object> map = CollectionUtils.map(21);
        CollectionUtils.putStringIfValid(ATAdConst.KEY.APP_NAME, this.f19284c.B().b(), map);
        CollectionUtils.putStringIfValid("app_version", this.f19284c.B().c(), map);
        CollectionUtils.putStringIfValid("package_name", this.f19284c.B().d(), map);
        CollectionUtils.putStringIfValid("vz", this.f19284c.B().e(), map);
        CollectionUtils.putStringIfValid("installer_name", this.f19284c.B().f(), map);
        CollectionUtils.putIntegerIfValid("app_version_code", Integer.valueOf(this.f19284c.B().i()), map);
        CollectionUtils.putIntegerIfValid("target_sdk", Integer.valueOf(this.f19284c.B().j()), map);
        CollectionUtils.putLongIfValid("first_install_v3_ms", this.f19284c.B().g(), map);
        CollectionUtils.putLongIfValid("ia", Long.valueOf(this.f19284c.B().h()), map);
        CollectionUtils.putLongIfValid("ia_v2", this.f19284c.B().a(), map);
        CollectionUtils.putStringIfValid("tg", com.applovin.impl.sdk.utils.q.a(this.f19282a), map);
        CollectionUtils.putStringIfValid("sdk_version", AppLovinSdk.VERSION, map);
        CollectionUtils.putStringIfValid("omid_sdk_version", this.f19282a.ag().c(), map);
        CollectionUtils.putStringIfValid("api_did", (String) this.f19282a.a(com.applovin.impl.sdk.c.b.f18706ad), map);
        CollectionUtils.putBooleanIfValid("debug", Boolean.valueOf(Utils.isPubInDebugMode(this.f19283b, this.f19282a)), map);
        CollectionUtils.putBooleanIfValid("j8", Boolean.valueOf(p.A()), map);
        CollectionUtils.putBooleanIfValid("first_install", Boolean.valueOf(this.f19282a.aw()), map);
        CollectionUtils.putBooleanIfValid("first_install_v2", Boolean.valueOf(!this.f19282a.u()), map);
        CollectionUtils.putIntegerIfValid("epv", Integer.valueOf(Utils.getExoPlayerVersionCode()), map);
        CollectionUtils.putLongIfValid("alts_ms", Long.valueOf(p.z()), map);
        return map;
    }

    public String a() {
        String encodeToString = Base64.encodeToString(new JSONObject(h()).toString().getBytes(Charset.defaultCharset()), 2);
        if (!((Boolean) this.f19282a.a(com.applovin.impl.sdk.c.b.f18727fb)).booleanValue()) {
            return encodeToString;
        }
        return com.applovin.impl.sdk.utils.n.a(encodeToString, this.f19282a.B(), Utils.getServerAdjustedUnixTimestampMillis(this.f19282a));
    }

    public Map<String, Object> b() {
        return a(false);
    }

    public void c() {
        synchronized (this.f19286e) {
            a(this.f19285d);
        }
    }

    public Map<String, Object> d() {
        Map<String, Object> map;
        synchronized (this.f19287g) {
            map = CollectionUtils.map(this.f);
        }
        CollectionUtils.putBooleanIfValid("test_ads", Boolean.valueOf(this.f19284c.D()), map);
        CollectionUtils.putBooleanIfValid(av.aw, Boolean.valueOf(this.f19282a.C().isMuted()), map);
        CollectionUtils.putStringIfValid("user_segment_name", this.f19282a.D().getName(), map);
        CollectionUtils.putStringIfValid(com.huawei.openalliance.ad.constant.w.f22150cd, this.f19284c.C().a(), map);
        Object b10 = this.f19284c.C().b();
        if (b10 != null) {
            map.put("IABTCF_gdprApplies", b10);
        }
        if (((Boolean) this.f19282a.a(com.applovin.impl.sdk.c.b.dJ)).booleanValue()) {
            CollectionUtils.putStringIfValid("cuid", this.f19282a.o(), map);
        }
        if (((Boolean) this.f19282a.a(com.applovin.impl.sdk.c.b.dM)).booleanValue()) {
            CollectionUtils.putStringIfValid("compass_random_token", this.f19282a.p(), map);
        }
        if (((Boolean) this.f19282a.a(com.applovin.impl.sdk.c.b.dO)).booleanValue()) {
            CollectionUtils.putStringIfValid("applovin_random_token", this.f19282a.q(), map);
        }
        return map;
    }

    public Map<String, Object> e() {
        Map<String, Object> map = CollectionUtils.map(5);
        CollectionUtils.putStringIfValid(com.anythink.expressad.d.a.b.bH, (String) this.f19282a.a(com.applovin.impl.sdk.c.b.ai), map);
        CollectionUtils.putStringIfValid("sc2", (String) this.f19282a.a(com.applovin.impl.sdk.c.b.aj), map);
        CollectionUtils.putStringIfValid("sc3", (String) this.f19282a.a(com.applovin.impl.sdk.c.b.ak), map);
        CollectionUtils.putStringIfValid("server_installed_at", (String) this.f19282a.a(com.applovin.impl.sdk.c.b.al), map);
        CollectionUtils.putStringIfValid("persisted_data", (String) this.f19282a.a(com.applovin.impl.sdk.c.d.H), map);
        return map;
    }

    public Map<String, Object> f() {
        return this.f19285d;
    }

    public Map<String, Object> g() {
        return this.f;
    }

    public Map<String, Object> a(Map<String, String> map, boolean z10, boolean z11) {
        Map<String, Object> map2;
        Map<String, Object> a10 = a(z10);
        Map<String, Object> d10 = d();
        Map<String, Object> j10 = j();
        Map<String, String> allData = this.f19282a.r().getAllData();
        Map<String, Object> e10 = e();
        if (z11) {
            map2 = CollectionUtils.map(e10.size() + 19);
            map2.put("device_info", a10);
            map2.put(ba.D, d10);
            if (map != null) {
                map2.put("ad_info", map);
            }
            if (j10 != null) {
                map2.put("location_info", j10);
            }
            if (allData != null) {
                map2.put("targeting_data", allData);
            }
        } else {
            map2 = CollectionUtils.map(e10.size() + allData.size() + d10.size() + a10.size() + 14 + (map != null ? map.size() : 0) + (j10 != null ? j10.size() : 0));
            map2.putAll(a10);
            map2.putAll(d10);
            if (map != null) {
                map2.putAll(map);
            }
            if (j10 != null) {
                map2.putAll(j10);
            }
            if (!allData.isEmpty()) {
                map2.putAll(allData);
            }
        }
        map2.putAll(e10);
        map2.put("accept", "custom_size,launch_app,video");
        map2.put("format", "json");
        CollectionUtils.putStringIfValid("mediation_provider", this.f19282a.s(), map2);
        CollectionUtils.putStringIfValid("plugin_version", (String) this.f19282a.a(com.applovin.impl.sdk.c.b.dT), map2);
        CollectionUtils.putStringIfValid("rid", UUID.randomUUID().toString(), map2);
        if (!((Boolean) this.f19282a.a(com.applovin.impl.sdk.c.b.f18726fa)).booleanValue()) {
            CollectionUtils.putStringIfValid(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f19282a.B(), map2);
        }
        if (((Boolean) this.f19282a.a(com.applovin.impl.sdk.c.b.eA)).booleanValue()) {
            com.applovin.impl.sdk.d.g P = this.f19282a.P();
            CollectionUtils.putLongIfValid("li", Long.valueOf(P.b(com.applovin.impl.sdk.d.f.f18808b)), map2);
            CollectionUtils.putLongIfValid("si", Long.valueOf(P.b(com.applovin.impl.sdk.d.f.f18811e)), map2);
            CollectionUtils.putLongIfValid("mad", Long.valueOf(P.b(com.applovin.impl.sdk.d.f.f18809c)), map2);
            CollectionUtils.putLongIfValid("msad", Long.valueOf(P.b(com.applovin.impl.sdk.d.f.f)), map2);
            CollectionUtils.putLongIfValid("pf", Long.valueOf(P.b(com.applovin.impl.sdk.d.f.f18815j)), map2);
            CollectionUtils.putLongIfValid("mpf", Long.valueOf(P.b(com.applovin.impl.sdk.d.f.f18821q)), map2);
            CollectionUtils.putLongIfValid("gpf", Long.valueOf(P.b(com.applovin.impl.sdk.d.f.f18816k)), map2);
            CollectionUtils.putLongIfValid("asoac", Long.valueOf(P.b(com.applovin.impl.sdk.d.f.o)), map2);
        }
        return map2;
    }

    public Map<String, Object> a(boolean z10) {
        Map<String, Object> map;
        d.a d10;
        synchronized (this.f19286e) {
            map = CollectionUtils.map(this.f19285d);
        }
        if (z10) {
            d10 = this.f19284c.b();
            if (d10 != null) {
                this.f19284c.e();
            } else if (Utils.isMainThread()) {
                d10 = new d.a();
                map.put("inc", Boolean.TRUE);
            } else {
                d10 = this.f19282a.Q().d();
            }
        } else {
            d10 = this.f19282a.Q().d();
        }
        CollectionUtils.putBooleanIfValid(AppLovinSdkExtraParameterKey.HAS_USER_CONSENT, com.applovin.impl.b.a.b().a(this.f19283b), map);
        CollectionUtils.putBooleanIfValid(AppLovinSdkExtraParameterKey.AGE_RESTRICTED_USER, com.applovin.impl.b.a.a().a(this.f19283b), map);
        CollectionUtils.putBooleanIfValid(AppLovinSdkExtraParameterKey.DO_NOT_SELL, com.applovin.impl.b.a.c().a(this.f19283b), map);
        CollectionUtils.putBooleanIfValid("dnt", Boolean.valueOf(d10.a()), map);
        CollectionUtils.putStringIfValid("dnt_code", d10.c().a(), map);
        CollectionUtils.putStringIfValid(com.anythink.expressad.foundation.g.a.bj, d10.b(), map);
        s.b a10 = this.f19284c.a();
        if (a10 != null) {
            CollectionUtils.putStringIfValid("idfv", a10.a(), map);
            CollectionUtils.putIntegerIfValid("idfv_scope", Integer.valueOf(a10.b()), map);
        }
        CollectionUtils.putIntegerIfValid("volume", z10 ? this.f19284c.c() : this.f19284c.r().b(), map);
        CollectionUtils.putIntegerIfValid("lpm", this.f19284c.p().a(), map);
        CollectionUtils.putIntegerIfValid("sb", this.f19284c.j(), map);
        CollectionUtils.putIntegerIfValid("mute_switch", Integer.valueOf(this.f19284c.r().a()), map);
        CollectionUtils.putLongIfValid("fs", this.f19284c.g(), map);
        CollectionUtils.putStringIfValid("network", this.f19284c.f(), map);
        if (((Boolean) this.f19282a.a(com.applovin.impl.sdk.c.b.dX)).booleanValue()) {
            CollectionUtils.putLongIfValid("fm", this.f19284c.u().a(), map);
            CollectionUtils.putLongIfValid("lmt", this.f19284c.u().b(), map);
            CollectionUtils.putBooleanIfValid("lm", this.f19284c.u().c(), map);
        }
        if (((Boolean) this.f19282a.a(com.applovin.impl.sdk.c.b.dY)).booleanValue()) {
            CollectionUtils.putIntegerIfValid("rat", this.f19284c.q().a(), map);
        }
        if (((Boolean) this.f19282a.a(com.applovin.impl.sdk.c.b.dV)).booleanValue()) {
            CollectionUtils.putStringIfValid("so", this.f19284c.r().c(), map);
        }
        if (((Boolean) this.f19282a.a(com.applovin.impl.sdk.c.b.dZ)).booleanValue()) {
            CollectionUtils.putBooleanIfValid("vs", Boolean.valueOf(this.f19284c.m()), map);
        }
        if (((Boolean) this.f19282a.a(com.applovin.impl.sdk.c.b.ej)).booleanValue()) {
            CollectionUtils.putFloatIfValid("da", this.f19284c.h(), map);
        }
        if (((Boolean) this.f19282a.a(com.applovin.impl.sdk.c.b.ek)).booleanValue()) {
            CollectionUtils.putFloatIfValid(com.anythink.expressad.foundation.g.a.K, this.f19284c.i(), map);
        }
        if (((Boolean) this.f19282a.a(com.applovin.impl.sdk.c.b.dU)).booleanValue()) {
            CollectionUtils.putIntegerIfValid("act", this.f19284c.s().b(), map);
            CollectionUtils.putIntegerIfValid("acm", this.f19284c.s().a(), map);
        }
        if (((Boolean) this.f19282a.a(com.applovin.impl.sdk.c.b.ef)).booleanValue()) {
            CollectionUtils.putBooleanIfValid("adr", Boolean.valueOf(this.f19284c.o()), map);
        }
        if (((Boolean) this.f19282a.a(com.applovin.impl.sdk.c.b.f18724ec)).booleanValue()) {
            CollectionUtils.putIntegerIfValid("mtl", Integer.valueOf(this.f19282a.Y().getLastTrimMemoryLevel()), map);
        }
        if (((Boolean) this.f19282a.a(com.applovin.impl.sdk.c.b.ei)).booleanValue() && Utils.isUserAgentCollectionEnabled(this.f19282a)) {
            af.b(this.f19282a);
            CollectionUtils.putStringIfValid("ua", af.a(), map);
        }
        ArrayService ai = this.f19282a.ai();
        if (!ai.isAppHubInstalled()) {
            CollectionUtils.putLongIfValid("ah_sdk_version_code", Long.valueOf(ai.getAppHubVersionCode()), map);
            CollectionUtils.putBooleanIfValid("ah_dd_enabled", Boolean.valueOf(ai.isDirectDownloadEnabled()), map);
            CollectionUtils.putStringIfValid("ah_random_user_token", StringUtils.emptyIfNull(ai.getRandomUserToken()), map);
        }
        return map;
    }

    private void a(Map<String, Object> map) {
        if (((Boolean) this.f19282a.a(com.applovin.impl.sdk.c.b.ei)).booleanValue() && Utils.isUserAgentCollectionEnabled(this.f19282a)) {
            af.b(this.f19282a);
        }
        if (((Boolean) this.f19282a.a(com.applovin.impl.sdk.c.b.f18722ea)).booleanValue() && !map.containsKey("af")) {
            CollectionUtils.putLongIfValid("af", Long.valueOf(this.f19284c.k()), map);
        }
        if (((Boolean) this.f19282a.a(com.applovin.impl.sdk.c.b.f18723eb)).booleanValue() && !map.containsKey("font")) {
            CollectionUtils.putFloatIfValid("font", Float.valueOf(this.f19284c.l()), map);
        }
        if (((Boolean) this.f19282a.a(com.applovin.impl.sdk.c.b.eh)).booleanValue() && !map.containsKey("sua")) {
            CollectionUtils.putStringIfValid("sua", System.getProperty("http.agent"), map);
        }
        if (!((Boolean) this.f19282a.a(com.applovin.impl.sdk.c.b.f18725ed)).booleanValue() || map.containsKey("network_restricted")) {
            return;
        }
        CollectionUtils.putBooleanIfValid("network_restricted", Boolean.valueOf(this.f19284c.n()), map);
    }
}
