package com.applovin.impl.mediation.b.a;

import a3.k;
import a3.l;
import android.text.TextUtils;
import com.applovin.impl.mediation.b.b;
import com.applovin.impl.mediation.b.c;
import com.applovin.impl.sdk.e.u;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a extends com.applovin.impl.mediation.b.b {

    /* renamed from: d, reason: collision with root package name */
    private final String f17706d;

    /* renamed from: e, reason: collision with root package name */
    private final String f17707e;
    private final String f;

    /* renamed from: g, reason: collision with root package name */
    private String f17708g;

    public a(String str, String str2, String str3, p pVar) {
        super("NimbusApiService", pVar);
        this.f17706d = str;
        this.f17708g = UUID.randomUUID().toString().toLowerCase(Locale.US);
        pVar.L();
        if (y.a()) {
            y L = pVar.L();
            String str4 = this.f17721b;
            StringBuilder o = k.o("Initializing Nimbus with apiKey=", str, ", pubId=", str2, ", sessionId=");
            o.append(this.f17708g);
            L.b(str4, o.toString());
        }
        this.f17707e = "https://" + str2 + "." + (StringUtils.isValidString(str3) ? str3 : "adsbynimbus.com/rta/v1");
        c<String> cVar = c.f17753c;
        String str5 = (String) pVar.b(cVar, null, this.f17722c);
        if (TextUtils.isEmpty(str5)) {
            str5 = UUID.randomUUID().toString();
            pVar.a(cVar, (c<String>) str5, this.f17722c);
        }
        this.f = str5;
        pVar.L();
        if (y.a()) {
            k.t("Setting Nimbus instanceId=", str5, pVar.L(), this.f17721b);
        }
    }

    public void a(MaxAdapterInitializationParameters maxAdapterInitializationParameters) {
        a((MaxAdapterParameters) maxAdapterInitializationParameters);
    }

    public void a(final MaxAdapterResponseParameters maxAdapterResponseParameters, final MaxAdFormat maxAdFormat, final AppLovinAdLoadListener appLovinAdLoadListener) {
        Map<String, Object> d10;
        this.f17720a.L();
        if (y.a()) {
            this.f17720a.L().b(this.f17721b, "Loading Nimbus " + maxAdFormat.getLabel() + " ad with position: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        }
        a(maxAdapterResponseParameters);
        if (this.f17720a.S() != null) {
            d10 = this.f17720a.S().b();
        } else {
            d10 = this.f17720a.R().d();
        }
        HashMap t10 = l.t("x-openrtb-version", "2.5");
        t10.put("Nimbus-Api-Key", this.f17706d);
        t10.put("Nimbus-Sdkv", "2.0.0");
        t10.put("Nimbus-Instance-Id", this.f);
        t10.put("User-Agent", String.valueOf(d10.get("ua")));
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, com.anythink.expressad.foundation.g.a.bt, this.f17708g);
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putString(jSONObject2, "position", maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        this.f17720a.M().a((com.applovin.impl.sdk.e.a) new u<JSONObject>(a(this.f17707e, UUID.randomUUID().toString().toLowerCase(Locale.US), maxAdapterResponseParameters, maxAdFormat, b.a.a().a(jSONObject).d(a()).b(jSONObject2).c(b()).a(), t10, true, this.f17720a), this.f17720a) { // from class: com.applovin.impl.mediation.b.a.a.1
            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(JSONObject jSONObject3, int i10) {
                if (i10 == 200 && jSONObject3 != null) {
                    this.f.M().a((com.applovin.impl.sdk.e.a) new b(jSONObject3, maxAdapterResponseParameters, maxAdFormat, a.this.f17708g, appLovinAdLoadListener, this.f));
                    return;
                }
                if (y.a()) {
                    this.f18839h.e(this.f18838g, "Unable to fetch " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + " Nimbus ad: server returned " + i10);
                }
                appLovinAdLoadListener.failedToReceiveAd(i10);
            }

            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(int i10, String str, JSONObject jSONObject3) {
                if (jSONObject3 != null && "No Bid".equalsIgnoreCase(JsonUtils.getString(jSONObject3, CrashHianalyticsData.MESSAGE, null))) {
                    Object object = JsonUtils.getObject(jSONObject3, "nbr", null);
                    if (y.a()) {
                        this.f18839h.e(this.f18838g, "Nimbus request for " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + " returned with no fill code: " + object);
                    }
                    appLovinAdLoadListener.failedToReceiveAd(204);
                }
                if (y.a()) {
                    this.f18839h.e(this.f18838g, "Unable to fetch " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + " Nimbus ad: server returned " + i10);
                }
                appLovinAdLoadListener.failedToReceiveAd(i10);
            }
        });
    }

    private void a(MaxAdapterParameters maxAdapterParameters) {
        Object obj = maxAdapterParameters.getLocalExtraParameters().get(com.anythink.expressad.foundation.g.a.bt);
        if (obj instanceof String) {
            String str = (String) obj;
            if (StringUtils.isValidString(str)) {
                this.f17720a.L();
                if (y.a()) {
                    this.f17720a.L().b(this.f17721b, "Updating Nimbus sessionId to " + obj);
                }
                this.f17708g = str;
            }
        }
    }
}
