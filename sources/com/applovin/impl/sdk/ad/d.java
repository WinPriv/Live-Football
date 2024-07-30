package com.applovin.impl.sdk.ad;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, d> f18581a = CollectionUtils.map();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f18582b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private JSONObject f18583c;

    /* renamed from: d, reason: collision with root package name */
    private final String f18584d;

    /* renamed from: e, reason: collision with root package name */
    private AppLovinAdSize f18585e;
    private AppLovinAdType f;

    private d(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str) {
        if (TextUtils.isEmpty(str) && (appLovinAdType == null || appLovinAdSize == null)) {
            throw new IllegalArgumentException("No zone identifier or type or size specified");
        }
        this.f18585e = appLovinAdSize;
        this.f = appLovinAdType;
        if (StringUtils.isValidString(str)) {
            this.f18584d = str.trim().toLowerCase(Locale.ENGLISH);
            return;
        }
        this.f18584d = (appLovinAdSize.getLabel() + "_" + appLovinAdType.getLabel()).toLowerCase(Locale.ENGLISH);
    }

    public static d a(String str) {
        return a(null, null, str);
    }

    public static d b(String str) {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED, str);
    }

    public static Collection<d> f() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(7);
        Collections.addAll(linkedHashSet, g(), h(), i(), j(), k(), l(), m());
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public static d g() {
        return a(AppLovinAdSize.BANNER, AppLovinAdType.REGULAR);
    }

    public static d h() {
        return a(AppLovinAdSize.MREC, AppLovinAdType.REGULAR);
    }

    public static d i() {
        return a(AppLovinAdSize.LEADER, AppLovinAdType.REGULAR);
    }

    public static d j() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.REGULAR);
    }

    public static d k() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.APP_OPEN);
    }

    public static d l() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED);
    }

    public static d m() {
        return a(AppLovinAdSize.NATIVE, AppLovinAdType.NATIVE);
    }

    public AppLovinAdSize c() {
        if (this.f18585e == null && JsonUtils.valueExists(this.f18583c, "ad_size")) {
            this.f18585e = AppLovinAdSize.fromString(JsonUtils.getString(this.f18583c, "ad_size", null));
        }
        return this.f18585e;
    }

    public AppLovinAdType d() {
        if (this.f == null && JsonUtils.valueExists(this.f18583c, "ad_type")) {
            this.f = AppLovinAdType.fromString(JsonUtils.getString(this.f18583c, "ad_type", null));
        }
        return this.f;
    }

    public boolean e() {
        return f().contains(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            return this.f18584d.equalsIgnoreCase(((d) obj).f18584d);
        }
        return false;
    }

    public int hashCode() {
        return this.f18584d.hashCode();
    }

    public String toString() {
        return "AdZone{id=" + this.f18584d + ", zoneObject=" + this.f18583c + '}';
    }

    public static d a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType) {
        return a(appLovinAdSize, appLovinAdType, null);
    }

    public MaxAdFormat b() {
        AppLovinAdSize c10 = c();
        if (c10 == AppLovinAdSize.BANNER) {
            return MaxAdFormat.BANNER;
        }
        if (c10 == AppLovinAdSize.LEADER) {
            return MaxAdFormat.LEADER;
        }
        if (c10 == AppLovinAdSize.MREC) {
            return MaxAdFormat.MREC;
        }
        if (c10 == AppLovinAdSize.CROSS_PROMO) {
            return MaxAdFormat.CROSS_PROMO;
        }
        if (c10 == AppLovinAdSize.INTERSTITIAL) {
            if (d() == AppLovinAdType.REGULAR) {
                return MaxAdFormat.INTERSTITIAL;
            }
            if (d() == AppLovinAdType.APP_OPEN) {
                return MaxAdFormat.APP_OPEN;
            }
            if (d() == AppLovinAdType.INCENTIVIZED) {
                return MaxAdFormat.REWARDED;
            }
            if (d() == AppLovinAdType.AUTO_INCENTIVIZED) {
                return MaxAdFormat.REWARDED_INTERSTITIAL;
            }
            return null;
        }
        if (c10 == AppLovinAdSize.NATIVE) {
            return MaxAdFormat.NATIVE;
        }
        return null;
    }

    public static d a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str) {
        d dVar = new d(appLovinAdSize, appLovinAdType, str);
        synchronized (f18582b) {
            String str2 = dVar.f18584d;
            Map<String, d> map = f18581a;
            if (map.containsKey(str2)) {
                dVar = map.get(str2);
            } else {
                map.put(str2, dVar);
            }
        }
        return dVar;
    }

    public static void a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("ad_size") && jSONObject.has("ad_type")) {
            synchronized (f18582b) {
                d dVar = f18581a.get(JsonUtils.getString(jSONObject, "zone_id", ""));
                if (dVar != null) {
                    dVar.f18585e = AppLovinAdSize.fromString(JsonUtils.getString(jSONObject, "ad_size", ""));
                    dVar.f = AppLovinAdType.fromString(JsonUtils.getString(jSONObject, "ad_type", ""));
                }
            }
        }
    }

    public String a() {
        return this.f18584d;
    }
}
