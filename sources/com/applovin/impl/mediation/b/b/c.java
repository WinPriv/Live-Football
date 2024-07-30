package com.applovin.impl.mediation.b.b;

import a3.k;
import a3.l;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.mediation.b.a;
import com.applovin.impl.mediation.b.d;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c extends d {

    /* renamed from: i, reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f17745i;

    /* renamed from: j, reason: collision with root package name */
    private final a.C0202a f17746j;

    /* renamed from: k, reason: collision with root package name */
    private String f17747k;

    /* renamed from: l, reason: collision with root package name */
    private String f17748l;

    /* renamed from: m, reason: collision with root package name */
    private String f17749m;

    /* renamed from: n, reason: collision with root package name */
    private String f17750n;

    public c(JSONObject jSONObject, MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, p pVar) {
        super("TaskProcessTaboolaAd", jSONObject, maxAdapterResponseParameters, maxAdFormat, pVar);
        this.f17746j = com.applovin.impl.mediation.b.a.a();
        this.f17747k = "";
        this.f17748l = "";
        this.f17749m = "";
        this.f17750n = null;
        this.f17745i = appLovinNativeAdLoadListener;
    }

    @Override // com.applovin.impl.mediation.b.d
    public JSONObject a() {
        JSONObject a10 = a(this.f17746j.a());
        JsonUtils.putString(a10, "cache_prefix", "taboola_");
        JsonUtils.putString(a10, "type", "taboola");
        JsonUtils.putString(a10, "privacy_url", this.f17750n);
        return a10;
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONObject optJSONObject;
        JSONArray jSONArray = JsonUtils.getJSONArray(((d) this).f17757a, "placements", new JSONArray());
        if (jSONArray.length() == 0) {
            if (y.a()) {
                this.f18839h.d("TaskProcessTaboolaAd", "No ads were returned from the server");
            }
            this.f17745i.onNativeAdLoadFailed(AppLovinError.NO_FILL);
            return;
        }
        JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, 0, new JSONObject());
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "list", new JSONArray());
        String string = JsonUtils.getString(jSONObject, "name", "");
        if (jSONArray2.length() == 0) {
            if (y.a()) {
                this.f18839h.d("TaskProcessTaboolaAd", "No ads were returned from the server");
            }
            this.f17745i.onNativeAdLoadFailed(AppLovinError.NO_FILL);
            return;
        }
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray2, 0, new JSONObject());
        this.f17747k = JsonUtils.getString(jSONObject2, "id", "");
        if (y.a()) {
            this.f18839h.b("TaskProcessTaboolaAd", l.q(new StringBuilder("Processing Taboola ad ("), this.f17747k, ") for placement: ", string, "..."));
        }
        this.f17748l = JsonUtils.getString(jSONObject2, "type", "");
        this.f17749m = JsonUtils.getString(jSONObject2, AppMeasurementSdk.ConditionalUserProperty.ORIGIN, "");
        this.f17750n = JsonUtils.getString(jSONObject2, "discloser", null);
        this.f17746j.a("Taboola_2.0");
        this.f17746j.b(JsonUtils.getString(jSONObject2, "name", ""));
        this.f17746j.c(JsonUtils.getString(jSONObject2, "branding", ""));
        this.f17746j.d(JsonUtils.getString(jSONObject2, "description", ""));
        this.f17746j.f(JsonUtils.getString(jSONObject2, "url", null));
        JSONArray jSONArray3 = JsonUtils.getJSONArray(jSONObject2, "thumbnail", new JSONArray());
        if (jSONArray3.length() > 0 && (optJSONObject = jSONArray3.optJSONObject(0)) != null) {
            this.f17746j.e(JsonUtils.getString(optJSONObject, "url", null));
            this.f17746j.a(JsonUtils.getInt(optJSONObject, ContentRecord.WIDTH, 0));
            this.f17746j.b(JsonUtils.getInt(optJSONObject, ContentRecord.HEIGHT, 0));
        }
        JSONArray jSONArray4 = JsonUtils.getJSONArray(jSONObject2, "beacons", null);
        JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject, "events", (JSONObject) null);
        JSONArray jSONArray5 = JsonUtils.getJSONArray(JsonUtils.getJSONObject(((d) this).f17757a, "user", (JSONObject) null), "beacons", null);
        this.f17746j.a(a(jSONObject3, jSONArray4));
        this.f17746j.a(a(jSONArray4, jSONArray5));
        this.f17746j.b(a(jSONObject3, jSONArray4, jSONArray5));
        JSONObject a10 = a(a());
        if (y.a()) {
            this.f18839h.b("TaskProcessTaboolaAd", "Starting render task for Taboola ad: " + string + "...");
        }
        this.f17760d.M().a(new com.applovin.impl.sdk.nativeAd.d(a10, this.f17745i, this.f17760d), o.a.MAIN);
    }

    private List<String> a(JSONObject jSONObject, JSONArray jSONArray, JSONArray jSONArray2) {
        ArrayList arrayList = new ArrayList();
        String string = JsonUtils.getString(jSONObject, "available", null);
        if (StringUtils.isValidString(string)) {
            if (y.a()) {
                k.t("Processed impression URL: ", string, this.f18839h, "TaskProcessTaboolaAd");
            }
            arrayList.add(string);
        }
        String string2 = JsonUtils.getString(jSONObject, "visible", null);
        if (StringUtils.isValidString(string2)) {
            if (y.a()) {
                k.t("Processed impression URL: ", string2, this.f18839h, "TaskProcessTaboolaAd");
            }
            arrayList.add(string2);
        }
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray, i10, null);
                String a10 = a(objectAtIndex, "available", "pixel");
                if (!StringUtils.isValidString(a10)) {
                    a10 = a(objectAtIndex, "visible", "pixel");
                }
                if (!TextUtils.isEmpty(a10)) {
                    if (y.a()) {
                        k.t("Processed impression URL: ", a10, this.f18839h, "TaskProcessTaboolaAd");
                    }
                    arrayList.add(a10);
                }
            }
        }
        if (jSONArray2 != null) {
            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                String a11 = a(JsonUtils.getObjectAtIndex(jSONArray2, i11, null), (String) null, "pixel");
                if (!TextUtils.isEmpty(a11)) {
                    if (y.a()) {
                        k.t("Processed impression URL: ", a11, this.f18839h, "TaskProcessTaboolaAd");
                    }
                    arrayList.add(a11);
                }
            }
        }
        return arrayList;
    }

    private JSONArray a(JSONObject jSONObject, JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        String string = JsonUtils.getString(jSONObject, "click", null);
        if (StringUtils.isValidString(string)) {
            if (y.a()) {
                k.t("Processed click tracking URL: ", string, this.f18839h, "TaskProcessTaboolaAd");
            }
            jSONArray2.put(string);
        }
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String a10 = a(JsonUtils.getObjectAtIndex(jSONArray, i10, null), "click", "pixel");
                if (!TextUtils.isEmpty(a10)) {
                    if (y.a()) {
                        k.t("Processed click tracking URL: ", a10, this.f18839h, "TaskProcessTaboolaAd");
                    }
                    jSONArray2.put(a10);
                }
            }
        }
        return jSONArray2;
    }

    private List<String> a(JSONArray jSONArray, JSONArray jSONArray2) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String a10 = a(JsonUtils.getObjectAtIndex(jSONArray, i10, null), (String) null, "script");
                if (!TextUtils.isEmpty(a10)) {
                    arrayList.add(Uri.decode(a10));
                }
            }
        }
        if (jSONArray2 != null) {
            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                String a11 = a(JsonUtils.getObjectAtIndex(jSONArray2, i11, null), (String) null, "script");
                if (!TextUtils.isEmpty(a11)) {
                    arrayList.add(Uri.decode(a11));
                }
            }
        }
        return arrayList;
    }

    private String a(Object obj, String str, String str2) {
        if (!(obj instanceof JSONObject)) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        String string = JsonUtils.getString(jSONObject, "onEvent", "");
        String string2 = JsonUtils.getString(jSONObject, "type", "");
        if (StringUtils.isValidString(str) && !str.equalsIgnoreCase(string)) {
            return null;
        }
        if (!StringUtils.isValidString(str2) || str2.equalsIgnoreCase(string2)) {
            return JsonUtils.getString(jSONObject, "value", null);
        }
        return null;
    }
}
