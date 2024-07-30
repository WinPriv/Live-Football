package com.applovin.mediation.ads;

import a3.k;
import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.sdk.AppLovinSdk;
import e0.i;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class MaxRewardedInterstitialAd implements MaxFullscreenAdImpl.a {

    /* renamed from: a, reason: collision with root package name */
    private static WeakReference<Activity> f19596a = new WeakReference<>(null);

    /* renamed from: b, reason: collision with root package name */
    private final MaxFullscreenAdImpl f19597b;

    public MaxRewardedInterstitialAd(String str, Activity activity) {
        this(str, AppLovinSdk.getInstance(activity), activity);
    }

    public void destroy() {
        this.f19597b.logApiCall("destroy()");
        this.f19597b.destroy();
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.a
    public Activity getActivity() {
        this.f19597b.logApiCall("getActivity()");
        return f19596a.get();
    }

    public boolean isReady() {
        boolean isReady = this.f19597b.isReady();
        this.f19597b.logApiCall("isReady() " + isReady + " for ad unit id " + this.f19597b.getAdUnitId());
        return isReady;
    }

    public void loadAd() {
        this.f19597b.logApiCall("loadAd()");
        this.f19597b.loadAd(getActivity());
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f19597b.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f19597b.setAdReviewListener(maxAdReviewListener);
    }

    public void setExtraParameter(String str, String str2) {
        this.f19597b.logApiCall(i.g("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f19597b.setExtraParameter(str, str2);
    }

    public void setListener(MaxRewardedAdListener maxRewardedAdListener) {
        this.f19597b.logApiCall("setListener(listener=" + maxRewardedAdListener + ")");
        this.f19597b.setListener(maxRewardedAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f19597b.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f19597b.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f19597b.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f19597b.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f19597b.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f19597b.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd() {
        showAd(null);
    }

    public String toString() {
        return "" + this.f19597b;
    }

    public MaxRewardedInterstitialAd(String str, AppLovinSdk appLovinSdk, Activity activity) {
        a.logApiCall("MaxRewardedInterstitialAd", "MaxRewardedInterstitialAd(adUnitId=" + str + ", sdk=" + appLovinSdk + ", activity=" + activity + ")");
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Empty ad unit ID specified");
            }
            if (activity == null) {
                throw new IllegalArgumentException("No activity specified");
            }
            if (appLovinSdk != null) {
                f19596a = new WeakReference<>(activity);
                this.f19597b = new MaxFullscreenAdImpl(str, MaxAdFormat.REWARDED_INTERSTITIAL, this, "MaxRewardedInterstitialAd", appLovinSdk.coreSdk);
                return;
            }
            throw new IllegalArgumentException("No sdk specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    public void showAd(String str) {
        showAd(str, (String) null);
    }

    public void showAd(String str, String str2) {
        this.f19597b.logApiCall(i.g("showAd(placement=", str, ", customData=", str2, ")"));
        this.f19597b.showAd(str, str2, getActivity());
    }

    public void showAd(ViewGroup viewGroup, androidx.lifecycle.i iVar) {
        showAd(null, viewGroup, iVar);
    }

    public void showAd(String str, ViewGroup viewGroup, androidx.lifecycle.i iVar) {
        showAd(str, null, viewGroup, iVar);
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, androidx.lifecycle.i iVar) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f19597b;
        StringBuilder o = k.o("showAd(placement=", str, ", customData=", str2, ", containerView=");
        o.append(viewGroup);
        o.append(", lifecycle=");
        o.append(iVar);
        o.append(")");
        maxFullscreenAdImpl.logApiCall(o.toString());
        this.f19597b.showAd(str, str2, viewGroup, iVar, getActivity());
    }
}
