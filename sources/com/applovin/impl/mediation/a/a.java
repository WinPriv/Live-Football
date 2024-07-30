package com.applovin.impl.mediation.a;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import com.anythink.core.api.ATAdConst;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class a extends f implements MaxAd {

    /* renamed from: a, reason: collision with root package name */
    protected com.applovin.impl.mediation.g f17541a;

    /* renamed from: c, reason: collision with root package name */
    private final int f17542c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f17543d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f17544e;
    private final String f;

    /* renamed from: g, reason: collision with root package name */
    private MaxAdWaterfallInfo f17545g;

    /* renamed from: h, reason: collision with root package name */
    private long f17546h;

    /* renamed from: i, reason: collision with root package name */
    private String f17547i;

    /* renamed from: j, reason: collision with root package name */
    private String f17548j;

    /* renamed from: k, reason: collision with root package name */
    private com.applovin.mediation.hybridAds.c f17549k;

    public a(int i10, Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.mediation.g gVar, p pVar) {
        super(map, jSONObject, jSONObject2, pVar);
        String str;
        this.f17543d = new AtomicBoolean();
        this.f17544e = new AtomicBoolean();
        this.f17542c = i10;
        this.f17541a = gVar;
        if (gVar != null) {
            str = gVar.i();
        } else {
            str = null;
        }
        this.f = str;
    }

    private long C() {
        return b("load_started_time_ms", 0L);
    }

    public static a a(int i10, Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, p pVar) {
        String string = JsonUtils.getString(jSONObject2, ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, null);
        MaxAdFormat formatFromString = MaxAdFormat.formatFromString(string);
        Objects.requireNonNull(formatFromString, "Invalid ad format for string: " + string);
        if (formatFromString.isAdViewAd()) {
            return new b(i10, map, jSONObject, jSONObject2, pVar);
        }
        if (formatFromString == MaxAdFormat.NATIVE) {
            return new d(i10, map, jSONObject, jSONObject2, pVar);
        }
        if (formatFromString.isFullscreenAd()) {
            return new c(i10, map, jSONObject, jSONObject2, pVar);
        }
        throw new IllegalArgumentException(s.f.b("Unsupported ad format: ", string));
    }

    public void A() {
        this.f17541a = null;
        this.f17545g = null;
    }

    public int B() {
        return this.f17542c;
    }

    public abstract a a(com.applovin.impl.mediation.g gVar);

    public void b(String str) {
        this.f17548j = str;
    }

    public JSONObject c() {
        return a("publisher_extra_info", new JSONObject());
    }

    public JSONObject d() {
        return a("revenue_parameters", new JSONObject());
    }

    public String e() {
        return JsonUtils.getString(d(), "revenue_event", "");
    }

    public boolean f() {
        com.applovin.impl.mediation.g gVar = this.f17541a;
        if (gVar == null || !gVar.f() || !this.f17541a.g()) {
            return false;
        }
        return true;
    }

    public String g() {
        return a("event_id", "");
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdReviewCreativeId() {
        return this.f17548j;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str) {
        return getAdValue(str, null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getCreativeId() {
        return b("creative_id", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getDspId() {
        return b("dsp_id", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getDspName() {
        return b("dsp_name", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdFormat getFormat() {
        return MaxAdFormat.formatFromString(b(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, a(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, (String) null)));
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxNativeAd getNativeAd() {
        com.applovin.impl.mediation.g gVar = this.f17541a;
        if (gVar != null) {
            return gVar.b();
        }
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkName() {
        return b(ATAdConst.NETWORK_CUSTOM_KEY.NETWORK_NAME, "");
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkPlacement() {
        return StringUtils.emptyIfNull(r());
    }

    @Override // com.applovin.mediation.MaxAd
    public long getRequestLatencyMillis() {
        return this.f17546h;
    }

    @Override // com.applovin.mediation.MaxAd
    public double getRevenue() {
        if (((Boolean) this.f17558b.a(com.applovin.impl.sdk.c.a.U)).booleanValue() && getFormat().isFullscreenAd() && !y().get()) {
            this.f17558b.L();
            if (y.a()) {
                this.f17558b.L().e("MediatedAd", "Attempting to retrieve revenue when not available yet");
                return 0.0d;
            }
            return 0.0d;
        }
        return JsonUtils.getDouble(a("revenue_parameters", (JSONObject) null), ImpressionData.IMPRESSION_DATA_KEY_REVENUE, -1.0d);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getRevenuePrecision() {
        return JsonUtils.getString(a("revenue_parameters", (JSONObject) null), "precision", "");
    }

    @Override // com.applovin.mediation.MaxAd
    public AppLovinSdkUtils.Size getSize() {
        int b10 = b(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_WIDTH, -3);
        int b11 = b(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_HEIGHT, -3);
        if (b10 != -3 && b11 != -3) {
            return new AppLovinSdkUtils.Size(b10, b11);
        }
        return getFormat().getSize();
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdWaterfallInfo getWaterfall() {
        return this.f17545g;
    }

    public com.applovin.impl.mediation.g h() {
        return this.f17541a;
    }

    public String i() {
        return this.f;
    }

    public Bundle j() {
        JSONObject a10;
        if (c("credentials")) {
            a10 = a("credentials", new JSONObject());
        } else {
            a10 = a("server_parameters", new JSONObject());
            JsonUtils.putString(a10, "placement_id", r());
        }
        return JsonUtils.toBundle(a10);
    }

    public String k() {
        return b("bid_response", (String) null);
    }

    public boolean l() {
        return b("ilia", Boolean.valueOf(StringUtils.isValidString(k()))).booleanValue();
    }

    public long m() {
        return b("bid_expiration_ms", BundleUtils.getLong("bid_expiration_ms", -1L, ag()));
    }

    public boolean n() {
        return b("is_js_tag_ad", Boolean.FALSE).booleanValue();
    }

    public MaxAdFormat o() {
        String b10 = b("haf", (String) null);
        if (!StringUtils.isValidString(b10)) {
            return null;
        }
        return MaxAdFormat.formatFromString(b10);
    }

    public com.applovin.mediation.hybridAds.c p() {
        com.applovin.mediation.hybridAds.c cVar = this.f17549k;
        if (cVar != null) {
            return cVar;
        }
        com.applovin.mediation.hybridAds.c cVar2 = new com.applovin.mediation.hybridAds.c(a("hybrid_ad_config", (JSONObject) null));
        this.f17549k = cVar2;
        return cVar2;
    }

    public View q() {
        com.applovin.impl.mediation.g gVar;
        if (f() && (gVar = this.f17541a) != null) {
            return gVar.a();
        }
        return null;
    }

    public String r() {
        return b("third_party_ad_placement_id", (String) null);
    }

    public String s() {
        return a("waterfall_name", "");
    }

    public String t() {
        return a("waterfall_test_name", "");
    }

    @Override // com.applovin.impl.mediation.a.f
    public String toString() {
        return "MediatedAd{thirdPartyAdPlacementId=" + r() + ", adUnitId=" + getAdUnitId() + ", format=" + getFormat().getLabel() + ", networkName='" + getNetworkName() + "'}";
    }

    public long u() {
        if (C() > 0) {
            return w() - C();
        }
        return -1L;
    }

    public void v() {
        c("load_started_time_ms", SystemClock.elapsedRealtime());
    }

    public long w() {
        return b("load_completed_time_ms", 0L);
    }

    public void x() {
        c("load_completed_time_ms", SystemClock.elapsedRealtime());
    }

    public AtomicBoolean y() {
        return this.f17543d;
    }

    public AtomicBoolean z() {
        return this.f17544e;
    }

    public void b(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        JSONObject c10 = c();
        JsonUtils.putAll(c10, jSONObject);
        a("publisher_extra_info", (Object) c10);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str, String str2) {
        JSONObject b10 = b();
        if (b10.has(str)) {
            return JsonUtils.getString(b10, str, str2);
        }
        Bundle ag = ag();
        if (ag.containsKey(str)) {
            return ag.getString(str);
        }
        JSONObject c10 = c();
        if (c10.has(str)) {
            return JsonUtils.getString(c10, str, str2);
        }
        return b(str, str2);
    }

    public JSONObject b() {
        return a(Utils.KEY_AD_VALUES, new JSONObject());
    }

    public void a(MaxAdWaterfallInfo maxAdWaterfallInfo) {
        this.f17545g = maxAdWaterfallInfo;
    }

    public void a(long j10) {
        this.f17546h = j10;
    }

    public void a(String str) {
        this.f17547i = str;
    }

    public String a() {
        return this.f17547i;
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        JSONObject b10 = b();
        JsonUtils.putAll(b10, jSONObject);
        a(Utils.KEY_AD_VALUES, (Object) b10);
    }

    public void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey(Utils.KEY_AD_VALUES)) {
            a(BundleUtils.toJSONObject(bundle.getBundle(Utils.KEY_AD_VALUES)));
        }
        if (bundle.containsKey("creative_id") && !c("creative_id")) {
            c("creative_id", BundleUtils.getString("creative_id", bundle));
        }
        if (bundle.containsKey(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_WIDTH) && !c(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_WIDTH) && bundle.containsKey(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_HEIGHT) && !c(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_HEIGHT)) {
            int i10 = BundleUtils.getInt(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_WIDTH, bundle);
            int i11 = BundleUtils.getInt(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_HEIGHT, bundle);
            c(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_WIDTH, i10);
            c(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_HEIGHT, i11);
        }
        if (bundle.containsKey("publisher_extra_info")) {
            b(BundleUtils.toJSONObject(bundle.getBundle("publisher_extra_info")));
        }
    }
}
