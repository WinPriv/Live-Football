package com.applovin.mediation.nativeAds;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.sdk.AppLovinSdk;
import e0.i;
import java.util.List;

/* loaded from: classes.dex */
public class MaxNativeAdLoader {

    /* renamed from: a, reason: collision with root package name */
    private final MaxNativeAdLoaderImpl f19628a;

    public MaxNativeAdLoader(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public void a(List<View> list, ViewGroup viewGroup, MaxAd maxAd) {
        this.f19628a.logApiCall("a()");
        this.f19628a.registerClickableViews(list, viewGroup, maxAd);
    }

    public void b(MaxAd maxAd) {
        this.f19628a.logApiCall("b()");
        this.f19628a.handleNativeAdViewRendered(maxAd);
    }

    public void destroy() {
        this.f19628a.logApiCall("destroy()");
        this.f19628a.destroy();
    }

    public String getAdUnitId() {
        return this.f19628a.getAdUnitId();
    }

    public String getPlacement() {
        this.f19628a.logApiCall("getPlacement()");
        return this.f19628a.getPlacement();
    }

    public void loadAd() {
        loadAd(null);
    }

    public boolean render(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        this.f19628a.logApiCall("render(adView=" + maxNativeAdView + ", ad=" + maxAd + ")");
        return this.f19628a.render(maxNativeAdView, maxAd);
    }

    public void setCustomData(String str) {
        this.f19628a.logApiCall("setCustomData(value=" + str + ")");
        this.f19628a.setCustomData(str);
    }

    public void setExtraParameter(String str, String str2) {
        this.f19628a.logApiCall(i.g("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f19628a.setExtraParameter(str, str2);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f19628a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f19628a.setLocalExtraParameter(str, obj);
    }

    public void setNativeAdListener(MaxNativeAdListener maxNativeAdListener) {
        this.f19628a.logApiCall("setNativeAdListener(listener=" + maxNativeAdListener + ")");
        this.f19628a.setNativeAdListener(maxNativeAdListener);
    }

    public void setPlacement(String str) {
        this.f19628a.logApiCall("setPlacement(placement=" + str + ")");
        this.f19628a.setPlacement(str);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f19628a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f19628a.setRevenueListener(maxAdRevenueListener);
    }

    public MaxNativeAdLoader(String str, AppLovinSdk appLovinSdk, Context context) {
        a.logApiCall("MaxNativeAdLoader", "MaxNativeAdLoader(adUnitId=" + str + ", sdk=" + appLovinSdk + ")");
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Empty ad unit ID specified");
            }
            if (appLovinSdk == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            if (context != null) {
                this.f19628a = new MaxNativeAdLoaderImpl(str, appLovinSdk.coreSdk);
                return;
            }
            throw new IllegalArgumentException("No context specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    public void loadAd(MaxNativeAdView maxNativeAdView) {
        this.f19628a.logApiCall("loadAd(adView=" + maxNativeAdView + ")");
        this.f19628a.loadAd(maxNativeAdView);
    }

    public void destroy(MaxAd maxAd) {
        this.f19628a.logApiCall("destroy(nativeAd=" + maxAd + ")");
        this.f19628a.destroy(maxAd);
    }
}
