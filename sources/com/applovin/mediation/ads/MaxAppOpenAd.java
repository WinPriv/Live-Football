package com.applovin.mediation.ads;

import android.content.Context;
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

/* loaded from: classes.dex */
public class MaxAppOpenAd {

    /* renamed from: a, reason: collision with root package name */
    private final MaxFullscreenAdImpl f19589a;

    public MaxAppOpenAd(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context));
    }

    public void destroy() {
        this.f19589a.logApiCall("destroy()");
        this.f19589a.destroy();
    }

    public String getAdUnitId() {
        return this.f19589a.getAdUnitId();
    }

    public boolean isReady() {
        boolean isReady = this.f19589a.isReady();
        this.f19589a.logApiCall("isReady() " + isReady + " for ad unit id " + this.f19589a.getAdUnitId());
        return isReady;
    }

    public void loadAd() {
        this.f19589a.logApiCall("loadAd()");
        this.f19589a.loadAd(null);
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f19589a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f19589a.setAdReviewListener(maxAdReviewListener);
    }

    public void setExtraParameter(String str, String str2) {
        this.f19589a.logApiCall(i.g("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f19589a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdListener maxAdListener) {
        this.f19589a.logApiCall("setListener(listener=" + maxAdListener + ")");
        this.f19589a.setListener(maxAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f19589a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f19589a.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f19589a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f19589a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f19589a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f19589a.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd() {
        showAd(null);
    }

    public String toString() {
        return "" + this.f19589a;
    }

    public MaxAppOpenAd(String str, AppLovinSdk appLovinSdk) {
        a.logApiCall("MaxAppOpenAd", "MaxAppOpenAd(adUnitId=" + str + ", sdk=" + appLovinSdk + ")");
        this.f19589a = new MaxFullscreenAdImpl(str.trim(), MaxAdFormat.APP_OPEN, null, "MaxAppOpenAd", appLovinSdk.coreSdk);
    }

    public void showAd(String str) {
        showAd(str, null);
    }

    public void showAd(String str, String str2) {
        this.f19589a.logApiCall(i.g("showAd(placement=", str, ", customData=", str2, ")"));
        Utils.maybeLogCustomDataSizeLimit(str2, "MaxAppOpenAd");
        this.f19589a.showAd(str, str2, null);
    }
}
