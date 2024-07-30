package com.ironsource.mediationsdk.impressionData;

import com.ironsource.mediationsdk.logger.IronLog;
import java.text.DecimalFormat;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ImpressionData {
    public static final String IMPRESSION_DATA_KEY_ABTEST = "ab";
    public static final String IMPRESSION_DATA_KEY_AD_NETWORK = "adNetwork";
    public static final String IMPRESSION_DATA_KEY_AD_UNIT = "adUnit";
    public static final String IMPRESSION_DATA_KEY_AUCTION_ID = "auctionId";
    public static final String IMPRESSION_DATA_KEY_COUNTRY = "country";
    public static final String IMPRESSION_DATA_KEY_ENCRYPTED_CPM = "encryptedCPM";
    public static final String IMPRESSION_DATA_KEY_INSTANCE_ID = "instanceId";
    public static final String IMPRESSION_DATA_KEY_INSTANCE_NAME = "instanceName";
    public static final String IMPRESSION_DATA_KEY_LIFETIME_REVENUE = "lifetimeRevenue";
    public static final String IMPRESSION_DATA_KEY_PLACEMENT = "placement";
    public static final String IMPRESSION_DATA_KEY_PRECISION = "precision";
    public static final String IMPRESSION_DATA_KEY_REVENUE = "revenue";
    public static final String IMPRESSION_DATA_KEY_SEGMENT_NAME = "segmentName";

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f25491a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25492b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25493c;

    /* renamed from: d, reason: collision with root package name */
    public final String f25494d;

    /* renamed from: e, reason: collision with root package name */
    public final String f25495e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public String f25496g;

    /* renamed from: h, reason: collision with root package name */
    public final String f25497h;

    /* renamed from: i, reason: collision with root package name */
    public final String f25498i;

    /* renamed from: j, reason: collision with root package name */
    public final String f25499j;

    /* renamed from: k, reason: collision with root package name */
    public final Double f25500k;

    /* renamed from: l, reason: collision with root package name */
    public final String f25501l;

    /* renamed from: m, reason: collision with root package name */
    public final Double f25502m;

    /* renamed from: n, reason: collision with root package name */
    public final String f25503n;
    public final DecimalFormat o = new DecimalFormat("#.#####");

    public ImpressionData(ImpressionData impressionData) {
        this.f25492b = null;
        this.f25493c = null;
        this.f25494d = null;
        this.f25495e = null;
        this.f = null;
        this.f25496g = null;
        this.f25497h = null;
        this.f25498i = null;
        this.f25499j = null;
        this.f25500k = null;
        this.f25501l = null;
        this.f25502m = null;
        this.f25503n = null;
        this.f25491a = impressionData.f25491a;
        this.f25492b = impressionData.f25492b;
        this.f25493c = impressionData.f25493c;
        this.f25494d = impressionData.f25494d;
        this.f25495e = impressionData.f25495e;
        this.f = impressionData.f;
        this.f25496g = impressionData.f25496g;
        this.f25497h = impressionData.f25497h;
        this.f25498i = impressionData.f25498i;
        this.f25499j = impressionData.f25499j;
        this.f25501l = impressionData.f25501l;
        this.f25503n = impressionData.f25503n;
        this.f25502m = impressionData.f25502m;
        this.f25500k = impressionData.f25500k;
    }

    public String getAb() {
        return this.f25495e;
    }

    public String getAdNetwork() {
        return this.f25497h;
    }

    public String getAdUnit() {
        return this.f25493c;
    }

    public JSONObject getAllData() {
        return this.f25491a;
    }

    public String getAuctionId() {
        return this.f25492b;
    }

    public String getCountry() {
        return this.f25494d;
    }

    public String getEncryptedCPM() {
        return this.f25503n;
    }

    public String getInstanceId() {
        return this.f25499j;
    }

    public String getInstanceName() {
        return this.f25498i;
    }

    public Double getLifetimeRevenue() {
        return this.f25502m;
    }

    public String getPlacement() {
        return this.f25496g;
    }

    public String getPrecision() {
        return this.f25501l;
    }

    public Double getRevenue() {
        return this.f25500k;
    }

    public String getSegmentName() {
        return this.f;
    }

    public void replaceMacroForPlacementWithValue(String str, String str2) {
        String str3 = this.f25496g;
        if (str3 != null) {
            String replace = str3.replace(str, str2);
            this.f25496g = replace;
            JSONObject jSONObject = this.f25491a;
            if (jSONObject != null) {
                try {
                    jSONObject.put("placement", replace);
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public String toString() {
        String format;
        StringBuilder sb2 = new StringBuilder("auctionId: '");
        sb2.append(this.f25492b);
        sb2.append("', adUnit: '");
        sb2.append(this.f25493c);
        sb2.append("', country: '");
        sb2.append(this.f25494d);
        sb2.append("', ab: '");
        sb2.append(this.f25495e);
        sb2.append("', segmentName: '");
        sb2.append(this.f);
        sb2.append("', placement: '");
        sb2.append(this.f25496g);
        sb2.append("', adNetwork: '");
        sb2.append(this.f25497h);
        sb2.append("', instanceName: '");
        sb2.append(this.f25498i);
        sb2.append("', instanceId: '");
        sb2.append(this.f25499j);
        sb2.append("', revenue: ");
        String str = null;
        DecimalFormat decimalFormat = this.o;
        Double d10 = this.f25500k;
        if (d10 == null) {
            format = null;
        } else {
            format = decimalFormat.format(d10);
        }
        sb2.append(format);
        sb2.append(", precision: '");
        sb2.append(this.f25501l);
        sb2.append("', lifetimeRevenue: ");
        Double d11 = this.f25502m;
        if (d11 != null) {
            str = decimalFormat.format(d11);
        }
        sb2.append(str);
        sb2.append(", encryptedCPM: '");
        sb2.append(this.f25503n);
        return sb2.toString();
    }

    public ImpressionData(JSONObject jSONObject) {
        Double d10 = null;
        this.f25492b = null;
        this.f25493c = null;
        this.f25494d = null;
        this.f25495e = null;
        this.f = null;
        this.f25496g = null;
        this.f25497h = null;
        this.f25498i = null;
        this.f25499j = null;
        this.f25500k = null;
        this.f25501l = null;
        this.f25502m = null;
        this.f25503n = null;
        if (jSONObject != null) {
            try {
                this.f25491a = jSONObject;
                this.f25492b = jSONObject.optString("auctionId", null);
                this.f25493c = jSONObject.optString("adUnit", null);
                this.f25494d = jSONObject.optString(IMPRESSION_DATA_KEY_COUNTRY, null);
                this.f25495e = jSONObject.optString(IMPRESSION_DATA_KEY_ABTEST, null);
                this.f = jSONObject.optString(IMPRESSION_DATA_KEY_SEGMENT_NAME, null);
                this.f25496g = jSONObject.optString("placement", null);
                this.f25497h = jSONObject.optString(IMPRESSION_DATA_KEY_AD_NETWORK, null);
                this.f25498i = jSONObject.optString(IMPRESSION_DATA_KEY_INSTANCE_NAME, null);
                this.f25499j = jSONObject.optString("instanceId", null);
                this.f25501l = jSONObject.optString("precision", null);
                this.f25503n = jSONObject.optString(IMPRESSION_DATA_KEY_ENCRYPTED_CPM, null);
                double optDouble = jSONObject.optDouble(IMPRESSION_DATA_KEY_LIFETIME_REVENUE);
                this.f25502m = Double.isNaN(optDouble) ? null : Double.valueOf(optDouble);
                double optDouble2 = jSONObject.optDouble(IMPRESSION_DATA_KEY_REVENUE);
                if (!Double.isNaN(optDouble2)) {
                    d10 = Double.valueOf(optDouble2);
                }
                this.f25500k = d10;
            } catch (Exception e10) {
                IronLog.INTERNAL.error("error parsing impression " + e10.getMessage());
            }
        }
    }
}
