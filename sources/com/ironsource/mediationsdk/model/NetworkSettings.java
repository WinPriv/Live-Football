package com.ironsource.mediationsdk.model;

import android.text.TextUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class NetworkSettings {

    /* renamed from: a, reason: collision with root package name */
    public final String f25612a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25613b;

    /* renamed from: c, reason: collision with root package name */
    public JSONObject f25614c;

    /* renamed from: d, reason: collision with root package name */
    public JSONObject f25615d;

    /* renamed from: e, reason: collision with root package name */
    public JSONObject f25616e;
    public JSONObject f;

    /* renamed from: g, reason: collision with root package name */
    public String f25617g;

    /* renamed from: h, reason: collision with root package name */
    public String f25618h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f25619i;

    /* renamed from: j, reason: collision with root package name */
    public final String f25620j;

    /* renamed from: k, reason: collision with root package name */
    public int f25621k;

    /* renamed from: l, reason: collision with root package name */
    public int f25622l;

    /* renamed from: m, reason: collision with root package name */
    public int f25623m;

    /* renamed from: n, reason: collision with root package name */
    public final String f25624n;

    public NetworkSettings(NetworkSettings networkSettings) {
        this.f25612a = networkSettings.getProviderName();
        this.f25620j = networkSettings.getProviderName();
        this.f25613b = networkSettings.getProviderTypeForReflection();
        this.f25615d = networkSettings.getRewardedVideoSettings();
        this.f25616e = networkSettings.getInterstitialSettings();
        this.f = networkSettings.getBannerSettings();
        this.f25614c = networkSettings.getApplicationSettings();
        this.f25621k = networkSettings.getRewardedVideoPriority();
        this.f25622l = networkSettings.getInterstitialPriority();
        this.f25623m = networkSettings.getBannerPriority();
        this.f25624n = networkSettings.getProviderDefaultInstance();
    }

    public String getAdSourceNameForEvents() {
        return this.f25618h;
    }

    public JSONObject getApplicationSettings() {
        return this.f25614c;
    }

    public int getBannerPriority() {
        return this.f25623m;
    }

    public JSONObject getBannerSettings() {
        return this.f;
    }

    public String getCustomNetwork() {
        JSONObject jSONObject = this.f25614c;
        if (jSONObject != null) {
            return jSONObject.optString(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD);
        }
        return null;
    }

    public String getCustomNetworkAdapterName(IronSource.AD_UNIT ad_unit) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if ((ad_unit == null && (jSONObject2 = this.f25614c) != null) || ((ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO) && (jSONObject2 = this.f25615d) != null) || (ad_unit.equals(IronSource.AD_UNIT.INTERSTITIAL) && (jSONObject2 = this.f25616e) != null))) {
            return jSONObject2.optString("customNetworkAdapterName");
        }
        if (ad_unit.equals(IronSource.AD_UNIT.BANNER) && (jSONObject = this.f) != null) {
            return jSONObject.optString("customNetworkAdapterName");
        }
        return null;
    }

    public String getCustomNetworkPackage() {
        JSONObject jSONObject = this.f25614c;
        if (jSONObject == null) {
            return "";
        }
        return jSONObject.optString("customNetworkPackage", "");
    }

    public int getInstanceType(IronSource.AD_UNIT ad_unit) {
        JSONObject bannerSettings;
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            bannerSettings = getInterstitialSettings();
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            bannerSettings = getRewardedVideoSettings();
        } else if (ad_unit == IronSource.AD_UNIT.BANNER) {
            bannerSettings = getBannerSettings();
        } else {
            return 1;
        }
        return bannerSettings.optInt("instanceType");
    }

    public int getInterstitialPriority() {
        return this.f25622l;
    }

    public JSONObject getInterstitialSettings() {
        return this.f25616e;
    }

    public int getMaxAdsPerSession(IronSource.AD_UNIT ad_unit) {
        JSONObject bannerSettings;
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            bannerSettings = getInterstitialSettings();
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            bannerSettings = getRewardedVideoSettings();
        } else {
            if (ad_unit != IronSource.AD_UNIT.BANNER) {
                return 99;
            }
            bannerSettings = getBannerSettings();
        }
        return bannerSettings.optInt("maxAdsPerSession", 99);
    }

    public String getProviderDefaultInstance() {
        return this.f25624n;
    }

    public String getProviderInstanceName() {
        return this.f25620j;
    }

    public String getProviderName() {
        return this.f25612a;
    }

    public String getProviderTypeForReflection() {
        return this.f25613b;
    }

    public int getRewardedVideoPriority() {
        return this.f25621k;
    }

    public JSONObject getRewardedVideoSettings() {
        return this.f25615d;
    }

    public String getSubProviderId() {
        return this.f25617g;
    }

    public boolean isBidder(IronSource.AD_UNIT ad_unit) {
        if (isCustomNetwork() || getInstanceType(ad_unit) != 2) {
            return false;
        }
        return true;
    }

    public boolean isCustomNetwork() {
        if (!TextUtils.isEmpty(getCustomNetwork())) {
            return true;
        }
        return false;
    }

    public boolean isIronSource() {
        if (!getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME) && !getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME)) {
            return false;
        }
        return true;
    }

    public boolean isMultipleInstances() {
        return this.f25619i;
    }

    public void setAdSourceNameForEvents(String str) {
        this.f25618h = str;
    }

    public void setApplicationSettings(JSONObject jSONObject) {
        this.f25614c = jSONObject;
    }

    public void setBannerPriority(int i10) {
        this.f25623m = i10;
    }

    public void setBannerSettings(String str, Object obj) {
        try {
            this.f.put(str, obj);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public void setInterstitialPriority(int i10) {
        this.f25622l = i10;
    }

    public void setInterstitialSettings(String str, Object obj) {
        try {
            this.f25616e.put(str, obj);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public void setIsMultipleInstances(boolean z10) {
        this.f25619i = z10;
    }

    public void setRewardedVideoPriority(int i10) {
        this.f25621k = i10;
    }

    public void setRewardedVideoSettings(String str, Object obj) {
        try {
            this.f25615d.put(str, obj);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public void setSubProviderId(String str) {
        this.f25617g = str;
    }

    public boolean shouldEarlyInit() {
        JSONObject jSONObject = this.f25614c;
        if (jSONObject != null) {
            return jSONObject.optBoolean(IronSourceConstants.EARLY_INIT_FIELD);
        }
        return false;
    }

    public NetworkSettings(String str) {
        this.f25612a = str;
        this.f25620j = str;
        this.f25613b = str;
        this.f25624n = str;
        this.f25615d = new JSONObject();
        this.f25616e = new JSONObject();
        this.f = new JSONObject();
        this.f25614c = new JSONObject();
        this.f25621k = -1;
        this.f25622l = -1;
        this.f25623m = -1;
    }

    public void setBannerSettings(JSONObject jSONObject) {
        this.f = jSONObject;
    }

    public void setInterstitialSettings(JSONObject jSONObject) {
        this.f25616e = jSONObject;
    }

    public void setRewardedVideoSettings(JSONObject jSONObject) {
        this.f25615d = jSONObject;
    }

    public NetworkSettings(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.f25612a = str;
        this.f25620j = str;
        this.f25613b = str2;
        this.f25624n = str3;
        this.f25615d = jSONObject2;
        this.f25616e = jSONObject3;
        this.f = jSONObject4;
        this.f25614c = jSONObject;
        this.f25621k = -1;
        this.f25622l = -1;
        this.f25623m = -1;
    }
}
