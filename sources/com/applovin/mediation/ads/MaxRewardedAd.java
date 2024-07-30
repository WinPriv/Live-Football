package com.applovin.mediation.ads;

import a3.k;
import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.sdk.AppLovinSdk;
import e0.i;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes.dex */
public class MaxRewardedAd implements MaxFullscreenAdImpl.a {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, MaxRewardedAd> f19592a = CollectionUtils.map();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f19593b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static WeakReference<Activity> f19594c = new WeakReference<>(null);

    /* renamed from: d, reason: collision with root package name */
    private final MaxFullscreenAdImpl f19595d;

    private MaxRewardedAd(String str, AppLovinSdk appLovinSdk) {
        this.f19595d = new MaxFullscreenAdImpl(str.trim(), MaxAdFormat.REWARDED, this, "MaxRewardedAd", appLovinSdk.coreSdk);
    }

    public static MaxRewardedAd getInstance(String str, Activity activity) {
        return getInstance(str, AppLovinSdk.getInstance(activity), activity);
    }

    public static void updateActivity(Activity activity) {
        a.logApiCall("MaxRewardedAd", "updateActivity(activity=" + activity + ")");
        if (activity != null) {
            f19594c = new WeakReference<>(activity);
        }
    }

    public void destroy() {
        this.f19595d.logApiCall("destroy()");
        synchronized (f19593b) {
            f19592a.remove(this.f19595d.getAdUnitId());
        }
        this.f19595d.destroy();
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.a
    public Activity getActivity() {
        this.f19595d.logApiCall("getActivity()");
        return f19594c.get();
    }

    public String getAdUnitId() {
        return this.f19595d.getAdUnitId();
    }

    public boolean isReady() {
        boolean isReady = this.f19595d.isReady();
        this.f19595d.logApiCall("isReady() " + isReady + " for ad unit id " + this.f19595d.getAdUnitId());
        return isReady;
    }

    public void loadAd() {
        this.f19595d.logApiCall("loadAd()");
        this.f19595d.loadAd(getActivity());
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f19595d.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f19595d.setAdReviewListener(maxAdReviewListener);
    }

    public void setExtraParameter(String str, String str2) {
        this.f19595d.logApiCall(i.g("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f19595d.setExtraParameter(str, str2);
    }

    public void setListener(MaxRewardedAdListener maxRewardedAdListener) {
        this.f19595d.logApiCall("setListener(listener=" + maxRewardedAdListener + ")");
        this.f19595d.setListener(maxRewardedAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f19595d.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f19595d.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f19595d.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f19595d.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f19595d.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f19595d.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd() {
        showAd(null);
    }

    public String toString() {
        return "" + this.f19595d;
    }

    public static MaxRewardedAd getInstance(String str, AppLovinSdk appLovinSdk, Activity activity) {
        a.logApiCall("MaxRewardedAd", "getInstance(adUnitId=" + str + ", sdk=" + appLovinSdk + ", activity=" + activity + ")");
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Empty ad unit ID specified");
            }
            if (activity == null) {
                throw new IllegalArgumentException("No activity specified");
            }
            if (appLovinSdk != null) {
                updateActivity(activity);
                synchronized (f19593b) {
                    Map<String, MaxRewardedAd> map = f19592a;
                    MaxRewardedAd maxRewardedAd = map.get(str);
                    if (maxRewardedAd != null) {
                        return maxRewardedAd;
                    }
                    MaxRewardedAd maxRewardedAd2 = new MaxRewardedAd(str, appLovinSdk);
                    map.put(str, maxRewardedAd2);
                    return maxRewardedAd2;
                }
            }
            throw new IllegalArgumentException("No sdk specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    public void showAd(String str) {
        showAd(str, (String) null);
    }

    public void showAd(String str, String str2) {
        this.f19595d.logApiCall(i.g("showAd(placement=", str, ", customData=", str2, ")"));
        Utils.maybeLogCustomDataSizeLimit(str2, "MaxRewardedAd");
        this.f19595d.showAd(str, str2, getActivity());
    }

    public void showAd(ViewGroup viewGroup, androidx.lifecycle.i iVar) {
        showAd(null, viewGroup, iVar);
    }

    public void showAd(String str, ViewGroup viewGroup, androidx.lifecycle.i iVar) {
        showAd(str, null, viewGroup, iVar);
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, androidx.lifecycle.i iVar) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f19595d;
        StringBuilder o = k.o("showAd(placement=", str, ", customData=", str2, ", containerView=");
        o.append(viewGroup);
        o.append(", lifecycle=");
        o.append(iVar);
        o.append(")");
        maxFullscreenAdImpl.logApiCall(o.toString());
        this.f19595d.showAd(str, str2, viewGroup, iVar, getActivity());
    }
}
