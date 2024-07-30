package com.ironsource.mediationsdk.adunit.adapter.utility;

import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AdInfo {

    /* renamed from: a, reason: collision with root package name */
    public final ImpressionData f25129a;

    public AdInfo() {
        this.f25129a = null;
    }

    public String getAb() {
        ImpressionData impressionData = this.f25129a;
        if (impressionData != null && impressionData.getAb() != null) {
            return impressionData.getAb();
        }
        return "";
    }

    public String getAdNetwork() {
        ImpressionData impressionData = this.f25129a;
        if (impressionData != null && impressionData.getAdNetwork() != null) {
            return impressionData.getAdNetwork();
        }
        return "";
    }

    public String getAdUnit() {
        ImpressionData impressionData = this.f25129a;
        if (impressionData != null && impressionData.getAdUnit() != null) {
            return impressionData.getAdUnit();
        }
        return "";
    }

    public String getAuctionId() {
        ImpressionData impressionData = this.f25129a;
        if (impressionData != null && impressionData.getAuctionId() != null) {
            return impressionData.getAuctionId();
        }
        return "";
    }

    public String getCountry() {
        ImpressionData impressionData = this.f25129a;
        if (impressionData != null && impressionData.getCountry() != null) {
            return impressionData.getCountry();
        }
        return "";
    }

    public String getEncryptedCPM() {
        ImpressionData impressionData = this.f25129a;
        if (impressionData != null && impressionData.getEncryptedCPM() != null) {
            return impressionData.getEncryptedCPM();
        }
        return "";
    }

    public String getInstanceId() {
        ImpressionData impressionData = this.f25129a;
        if (impressionData != null && impressionData.getInstanceId() != null) {
            return impressionData.getInstanceId();
        }
        return "";
    }

    public String getInstanceName() {
        ImpressionData impressionData = this.f25129a;
        if (impressionData != null && impressionData.getInstanceName() != null) {
            return impressionData.getInstanceName();
        }
        return "";
    }

    public Double getLifetimeRevenue() {
        ImpressionData impressionData = this.f25129a;
        if (impressionData != null && impressionData.getLifetimeRevenue() != null) {
            return impressionData.getLifetimeRevenue();
        }
        return Double.valueOf(0.0d);
    }

    public String getPrecision() {
        ImpressionData impressionData = this.f25129a;
        if (impressionData != null && impressionData.getPrecision() != null) {
            return impressionData.getPrecision();
        }
        return "";
    }

    public Double getRevenue() {
        ImpressionData impressionData = this.f25129a;
        if (impressionData != null && impressionData.getRevenue() != null) {
            return impressionData.getRevenue();
        }
        return Double.valueOf(0.0d);
    }

    public String getSegmentName() {
        ImpressionData impressionData = this.f25129a;
        if (impressionData != null && impressionData.getSegmentName() != null) {
            return impressionData.getSegmentName();
        }
        return "";
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("auctionId", getAuctionId());
            jSONObject.put("adUnit", getAdUnit());
            jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_COUNTRY, getCountry());
            jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_ABTEST, getAb());
            jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_SEGMENT_NAME, getSegmentName());
            jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_AD_NETWORK, getAdNetwork());
            jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_INSTANCE_NAME, getInstanceName());
            jSONObject.put("instanceId", getInstanceId());
            jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_REVENUE, getRevenue());
            jSONObject.put("precision", getPrecision());
            jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_LIFETIME_REVENUE, getLifetimeRevenue());
            jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_ENCRYPTED_CPM, getEncryptedCPM());
        } catch (Exception e10) {
            IronLog.INTERNAL.error("error while parsing ad info " + e10.getMessage());
        }
        return jSONObject.toString();
    }

    public AdInfo(ImpressionData impressionData) {
        this.f25129a = impressionData;
    }
}
