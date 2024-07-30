package com.applovin.mediation.ads;

import a3.k;
import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.sdk.AppLovinSdk;
import e0.i;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class MaxInterstitialAd implements MaxFullscreenAdImpl.a {

    /* renamed from: a, reason: collision with root package name */
    private static WeakReference<Activity> f19590a = new WeakReference<>(null);

    /* renamed from: b, reason: collision with root package name */
    private final MaxFullscreenAdImpl f19591b;

    public MaxInterstitialAd(String str, Activity activity) {
        this(str, AppLovinSdk.getInstance(activity), activity);
    }

    public void destroy() {
        this.f19591b.logApiCall("destroy()");
        this.f19591b.destroy();
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.a
    public Activity getActivity() {
        this.f19591b.logApiCall("getActivity()");
        return f19590a.get();
    }

    public String getAdUnitId() {
        return this.f19591b.getAdUnitId();
    }

    public boolean isReady() {
        boolean isReady = this.f19591b.isReady();
        this.f19591b.logApiCall("isReady() " + isReady + " for ad unit id " + this.f19591b.getAdUnitId());
        return isReady;
    }

    public void loadAd() {
        this.f19591b.logApiCall("loadAd()");
        this.f19591b.loadAd(getActivity());
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f19591b.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f19591b.setAdReviewListener(maxAdReviewListener);
    }

    public void setExtraParameter(String str, String str2) {
        this.f19591b.logApiCall(i.g("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f19591b.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdListener maxAdListener) {
        this.f19591b.logApiCall("setListener(listener=" + maxAdListener + ")");
        this.f19591b.setListener(maxAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f19591b.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f19591b.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f19591b.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f19591b.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f19591b.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f19591b.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd() {
        showAd(null);
    }

    public String toString() {
        return "" + this.f19591b;
    }

    public MaxInterstitialAd(String str, AppLovinSdk appLovinSdk, Activity activity) {
        a.logApiCall("MaxInterstitialAd", "MaxInterstitialAd(adUnitId=" + str + ", sdk=" + appLovinSdk + ", activity=" + activity + ")");
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Empty ad unit ID specified");
            }
            if (activity == null) {
                throw new IllegalArgumentException("No activity specified");
            }
            if (appLovinSdk != null) {
                f19590a = new WeakReference<>(activity);
                this.f19591b = new MaxFullscreenAdImpl(str.trim(), MaxAdFormat.INTERSTITIAL, this, "MaxInterstitialAd", appLovinSdk.coreSdk);
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
        this.f19591b.logApiCall(i.g("showAd(placement=", str, ", customData=", str2, ")"));
        Utils.maybeLogCustomDataSizeLimit(str2, "MaxInterstitialAd");
        this.f19591b.showAd(str, str2, getActivity());
    }

    public void showAd(ViewGroup viewGroup, androidx.lifecycle.i iVar) {
        showAd(null, viewGroup, iVar);
    }

    public void showAd(String str, ViewGroup viewGroup, androidx.lifecycle.i iVar) {
        showAd(str, null, viewGroup, iVar);
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, androidx.lifecycle.i iVar) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f19591b;
        StringBuilder o = k.o("showAd(placement=", str, ", customData=", str2, ", containerView=");
        o.append(viewGroup);
        o.append(", lifecycle=");
        o.append(iVar);
        o.append(")");
        maxFullscreenAdImpl.logApiCall(o.toString());
        this.f19591b.showAd(str, str2, viewGroup, iVar, getActivity());
    }
}
