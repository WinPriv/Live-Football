package com.anythink.core.common.b;

import android.text.TextUtils;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATCustomRuleKeys;
import com.anythink.core.api.ATRewardInfo;
import com.anythink.core.api.BaseAd;
import com.anythink.core.c.d;
import com.anythink.core.common.b.g;
import com.anythink.core.common.c.k;
import com.applovin.sdk.AppLovinEventParameters;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j extends ATAdInfo {
    private Map<String, Object> C;

    /* renamed from: a, reason: collision with root package name */
    private ATBaseAdAdapter f5164a;

    /* renamed from: x, reason: collision with root package name */
    private Map<String, Object> f5185x;

    /* renamed from: b, reason: collision with root package name */
    private int f5165b = -1;

    /* renamed from: c, reason: collision with root package name */
    private String f5166c = "";

    /* renamed from: d, reason: collision with root package name */
    private int f5167d = -1;

    /* renamed from: e, reason: collision with root package name */
    private double f5168e = 0.0d;
    private int f = 0;

    /* renamed from: g, reason: collision with root package name */
    private String f5169g = "";

    /* renamed from: h, reason: collision with root package name */
    private Double f5170h = Double.valueOf(0.0d);

    /* renamed from: i, reason: collision with root package name */
    private String f5171i = "";

    /* renamed from: j, reason: collision with root package name */
    private String f5172j = "";

    /* renamed from: k, reason: collision with root package name */
    private String f5173k = "";

    /* renamed from: l, reason: collision with root package name */
    private String f5174l = "";

    /* renamed from: m, reason: collision with root package name */
    private String f5175m = "unknow";

    /* renamed from: n, reason: collision with root package name */
    private String f5176n = "Network";
    private String o = "";

    /* renamed from: p, reason: collision with root package name */
    private int f5177p = 1;

    /* renamed from: q, reason: collision with root package name */
    private int f5178q = 0;

    /* renamed from: r, reason: collision with root package name */
    private String f5179r = "";

    /* renamed from: s, reason: collision with root package name */
    private String f5180s = "";

    /* renamed from: t, reason: collision with root package name */
    private int f5181t = 0;

    /* renamed from: u, reason: collision with root package name */
    private String f5182u = "";

    /* renamed from: v, reason: collision with root package name */
    private String f5183v = "";

    /* renamed from: w, reason: collision with root package name */
    private Map<String, Object> f5184w = null;
    private String y = "";

    /* renamed from: z, reason: collision with root package name */
    private int f5186z = 0;
    private String A = "";
    private int B = 0;

    public static j a(d dVar) {
        if (dVar != null) {
            return a(a(dVar.getTrackingInfo()), dVar);
        }
        return new j();
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getABTestId() {
        return 0;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getAdNetworkType() {
        return this.f5176n;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getAdsourceId() {
        return this.f5166c;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getAdsourceIndex() {
        return this.f5167d;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getChannel() {
        return this.f5183v;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getCountry() {
        return this.f5172j;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getCurrency() {
        return this.f5171i;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getCustomRule() {
        if (this.f5184w != null) {
            return new JSONObject(this.f5184w).toString();
        }
        return "";
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getDismissType() {
        return this.f5186z;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final double getEcpm() {
        return this.f5168e;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getEcpmLevel() {
        return this.f5177p;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getEcpmPrecision() {
        return this.f5175m;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final Map<String, Object> getExtInfoMap() {
        return this.f5185x;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final Map<String, Object> getLocalExtra() {
        return this.C;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getNetworkFirmId() {
        return this.f5165b;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getNetworkPlacementId() {
        return this.o;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final Double getPublisherRevenue() {
        return this.f5170h;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getRewardUserCustomData() {
        ATBaseAdAdapter aTBaseAdAdapter = this.f5164a;
        if (aTBaseAdAdapter != null) {
            return aTBaseAdAdapter.getUserCustomData();
        }
        return "";
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getScenarioId() {
        return this.f5179r;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getScenarioRewardName() {
        return this.f5180s;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getScenarioRewardNumber() {
        return this.f5181t;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getSegmentId() {
        return this.f5178q;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getShowId() {
        return this.f5169g;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getSubChannel() {
        return this.f5182u;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getTopOnAdFormat() {
        return this.f5174l;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getTopOnPlacementId() {
        return this.f5173k;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getTpBidId() {
        return this.y;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int isHeaderBiddingAdsource() {
        return this.f;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f5169g);
            jSONObject.put("publisher_revenue", this.f5170h);
            jSONObject.put(AppLovinEventParameters.REVENUE_CURRENCY, this.f5171i);
            jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_COUNTRY, this.f5172j);
            jSONObject.put("adunit_id", this.f5173k);
            jSONObject.put("adunit_format", this.f5174l);
            jSONObject.put("precision", this.f5175m);
            jSONObject.put("network_type", this.f5176n);
            jSONObject.put("network_placement_id", this.o);
            jSONObject.put(com.anythink.core.common.l.O, this.f5177p);
            jSONObject.put(ATCustomRuleKeys.SEGMENT_ID, this.f5178q);
            if (!TextUtils.isEmpty(this.f5179r)) {
                jSONObject.put("scenario_id", this.f5179r);
            }
            if (!TextUtils.isEmpty(this.f5180s) && this.f5181t != 0) {
                jSONObject.put("scenario_reward_name", this.f5180s);
                jSONObject.put("scenario_reward_number", this.f5181t);
            }
            if (!TextUtils.isEmpty(this.f5183v)) {
                jSONObject.put("channel", this.f5183v);
            }
            if (!TextUtils.isEmpty(this.f5182u)) {
                jSONObject.put("sub_channel", this.f5182u);
            }
            Map<String, Object> map = this.f5184w;
            if (map != null && map.size() > 0) {
                jSONObject.put("custom_rule", new JSONObject(this.f5184w));
            }
            jSONObject.put(k.a.f5346d, this.f5165b);
            jSONObject.put("adsource_id", this.f5166c);
            jSONObject.put("adsource_index", this.f5167d);
            jSONObject.put("adsource_price", this.f5168e);
            jSONObject.put("adsource_isheaderbidding", this.f);
            Map<String, Object> map2 = this.f5185x;
            if (map2 != null && map2.size() > 0) {
                jSONObject.put("ext_info", new JSONObject(this.f5185x));
            }
            ATBaseAdAdapter aTBaseAdAdapter = this.f5164a;
            if (aTBaseAdAdapter != null) {
                jSONObject.put("reward_custom_data", aTBaseAdAdapter.getUserCustomData());
            }
            if (!TextUtils.isEmpty(this.y)) {
                jSONObject.put("tp_bid_id", this.y);
            }
            int i10 = this.f5186z;
            if (i10 != 0) {
                jSONObject.put("dismiss_type", i10);
            }
            if (!TextUtils.isEmpty(this.A)) {
                jSONObject.put(d.a.U, this.A);
            }
            jSONObject.put(com.anythink.core.common.g.c.I, this.B);
            Map<String, Object> map3 = this.C;
            if (map3 != null && map3.size() > 0) {
                jSONObject.put("user_load_extra_data", new JSONObject(this.C));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject.toString();
    }

    public static j a(BaseAd baseAd) {
        if (baseAd != null) {
            j a10 = a(baseAd.getDetail());
            a10.f5185x = baseAd.getNetworkInfoMap();
            return a10;
        }
        return new j();
    }

    public static j a(com.anythink.core.common.e.e eVar, d dVar) {
        return a(a(eVar), dVar);
    }

    private static j a(com.anythink.core.common.e.e eVar) {
        j jVar = new j();
        return eVar != null ? a(jVar, eVar) : jVar;
    }

    private static j a(j jVar, d dVar) {
        if (dVar != null && (dVar instanceof ATBaseAdAdapter)) {
            ATBaseAdAdapter aTBaseAdAdapter = (ATBaseAdAdapter) dVar;
            jVar.f5164a = aTBaseAdAdapter;
            jVar.f5185x = aTBaseAdAdapter.getNetworkInfoMap();
        }
        return jVar;
    }

    private static j a(j jVar, com.anythink.core.common.e.e eVar) {
        ATRewardInfo r10;
        ATRewardInfo aTRewardInfo;
        jVar.f5165b = eVar.H();
        jVar.f5166c = eVar.x();
        jVar.f5167d = eVar.A();
        jVar.f = eVar.v();
        jVar.f5168e = eVar.f();
        jVar.f5171i = eVar.h();
        jVar.f5169g = eVar.l();
        jVar.f5170h = Double.valueOf(jVar.f5168e / 1000.0d);
        jVar.f5172j = eVar.o();
        jVar.f5174l = com.anythink.core.common.k.g.d(eVar.Y());
        jVar.f5173k = eVar.W();
        jVar.f5175m = eVar.n();
        if (eVar.H() == 35) {
            jVar.f5176n = "Cross_Promotion";
        } else if (eVar.H() == 66) {
            jVar.f5176n = "Adx";
        } else {
            jVar.f5176n = "Network";
        }
        jVar.o = eVar.k();
        jVar.f5177p = eVar.m();
        jVar.f5178q = eVar.I();
        jVar.f5179r = eVar.C;
        if (TextUtils.equals(g.C0076g.f5066b, jVar.f5174l)) {
            Map<String, ATRewardInfo> q10 = eVar.q();
            if (q10 != null && q10.containsKey(jVar.f5179r) && (aTRewardInfo = q10.get(jVar.f5179r)) != null) {
                jVar.f5180s = aTRewardInfo.rewardName;
                jVar.f5181t = aTRewardInfo.rewardNumber;
            }
            if ((TextUtils.isEmpty(jVar.f5180s) || jVar.f5181t == 0) && (r10 = eVar.r()) != null) {
                jVar.f5180s = r10.rewardName;
                jVar.f5181t = r10.rewardNumber;
            }
        }
        jVar.f5183v = n.a().n();
        jVar.f5182u = n.a().o();
        jVar.f5184w = eVar.s();
        jVar.y = eVar.e();
        jVar.f5186z = eVar.M();
        jVar.A = eVar.P();
        jVar.B = eVar.U();
        Map<String, Object> a10 = eVar.a();
        if (a10 != null) {
            jVar.C = new HashMap(a10);
        }
        return jVar;
    }
}
