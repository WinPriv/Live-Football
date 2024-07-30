package com.applovin.impl.mediation.b.a;

import a3.k;
import android.text.TextUtils;
import com.applovin.impl.mediation.b.d;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.s;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b extends d implements AppLovinAdLoadListener {

    /* renamed from: i, reason: collision with root package name */
    private final String f17713i;

    /* renamed from: j, reason: collision with root package name */
    private final AppLovinAdLoadListener f17714j;

    /* renamed from: k, reason: collision with root package name */
    private String f17715k;

    /* renamed from: l, reason: collision with root package name */
    private JSONObject f17716l;

    /* renamed from: m, reason: collision with root package name */
    private JSONObject f17717m;

    /* renamed from: n, reason: collision with root package name */
    private String f17718n;

    public b(JSONObject jSONObject, MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, String str, AppLovinAdLoadListener appLovinAdLoadListener, p pVar) {
        super("TaskProcessNimbusAd", jSONObject, maxAdapterResponseParameters, maxAdFormat, pVar);
        this.f17713i = str;
        this.f17714j = appLovinAdLoadListener;
    }

    private JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "Nimbus-Session-Id", this.f17713i);
        return jSONObject;
    }

    @Override // com.applovin.impl.mediation.b.d
    public JSONObject a() {
        JSONObject a10 = a(this.f17715k, this.f17717m, this.f17716l);
        JsonUtils.putString(a10, "cache_prefix", "nimbus");
        JsonUtils.putString(a10, "type", "nimbus");
        JsonUtils.putJSONObject(a10, "http_headers_for_postbacks", b());
        return a10;
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        ((AppLovinAdImpl) appLovinAd).setMaxAdValue("creative_id", this.f17718n);
        this.f17714j.adReceived(appLovinAd);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i10) {
        this.f17714j.failedToReceiveAd(i10);
    }

    @Override // java.lang.Runnable
    public void run() {
        String string = JsonUtils.getString(((d) this).f17757a, "markup", "");
        this.f17715k = string;
        if (TextUtils.isEmpty(string)) {
            this.f17714j.failedToReceiveAd(204);
            return;
        }
        String string2 = JsonUtils.getString(((d) this).f17757a, "position", "");
        String string3 = JsonUtils.getString(((d) this).f17757a, "placement_id", "");
        String string4 = JsonUtils.getString(((d) this).f17757a, "auction_id", "");
        if (y.a()) {
            y yVar = this.f18839h;
            StringBuilder o = k.o("Processing Nimbus ad (", string2, ") for placement: ", string3, " with auction id: ");
            o.append(string4);
            o.append("...");
            yVar.b("TaskProcessNimbusAd", o.toString());
        }
        this.f17761e = JsonUtils.getString(((d) this).f17757a, "network", "");
        this.f17718n = JsonUtils.getString(((d) this).f17757a, "crid", null);
        JSONObject jSONObject = JsonUtils.getJSONObject(((d) this).f17757a, "trackers", new JSONObject());
        this.f17717m = a(JsonUtils.getJSONArray(jSONObject, "click_trackers", null));
        this.f17716l = a(JsonUtils.getJSONArray(jSONObject, "impression_trackers", null));
        JSONObject a10 = a();
        JSONObject a11 = a(a10);
        if (y.a()) {
            this.f18839h.b("TaskProcessNimbusAd", "Starting render task for Nimbus ad: " + string2 + "...");
        }
        this.f17760d.M().a(new s(a10, a11, com.applovin.impl.sdk.ad.b.UNKNOWN, this.f17714j, this.f17760d), o.a.MAIN);
    }

    private JSONObject a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                String string = jSONArray.getString(i10);
                if (!TextUtils.isEmpty(string)) {
                    jSONObject.put(string, "");
                }
            } catch (JSONException e10) {
                this.f17760d.L();
                if (y.a()) {
                    this.f17760d.L().b(this.f18838g, "Failed to retrieve tracking url with a non-String value.", e10);
                }
            }
        }
        return jSONObject;
    }
}
