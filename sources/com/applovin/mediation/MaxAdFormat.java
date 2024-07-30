package com.applovin.mediation;

import a3.l;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.b.g;
import com.anythink.expressad.foundation.g.a.f;
import com.applovin.impl.mediation.d.c;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* loaded from: classes.dex */
public class MaxAdFormat {

    /* renamed from: a, reason: collision with root package name */
    private final String f19583a;

    /* renamed from: b, reason: collision with root package name */
    private final String f19584b;
    public static final MaxAdFormat BANNER = new MaxAdFormat("BANNER", "Banner");
    public static final MaxAdFormat MREC = new MaxAdFormat("MREC", "MREC");
    public static final MaxAdFormat LEADER = new MaxAdFormat("LEADER", "Leader");
    public static final MaxAdFormat INTERSTITIAL = new MaxAdFormat("INTER", "Interstitial");
    public static final MaxAdFormat APP_OPEN = new MaxAdFormat("APPOPEN", "App Open");
    public static final MaxAdFormat REWARDED = new MaxAdFormat("REWARDED", "Rewarded");
    public static final MaxAdFormat REWARDED_INTERSTITIAL = new MaxAdFormat("REWARDED_INTER", "Rewarded Interstitial");
    public static final MaxAdFormat NATIVE = new MaxAdFormat("NATIVE", g.C0076g.f5065a);
    public static final MaxAdFormat CROSS_PROMO = new MaxAdFormat("XPROMO", "Cross Promo");

    private MaxAdFormat(String str, String str2) {
        this.f19583a = str;
        this.f19584b = str2;
    }

    public static MaxAdFormat formatFromString(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equalsIgnoreCase(f.f9817e)) {
            return BANNER;
        }
        if (str.equalsIgnoreCase("mrec")) {
            return MREC;
        }
        if (str.equalsIgnoreCase("xpromo")) {
            return CROSS_PROMO;
        }
        if (str.equalsIgnoreCase(f.f9813a)) {
            return NATIVE;
        }
        if (!str.equalsIgnoreCase("leaderboard") && !str.equalsIgnoreCase("leader")) {
            if (!str.equalsIgnoreCase("interstitial") && !str.equalsIgnoreCase("inter")) {
                if (!str.equalsIgnoreCase("appopen") && !str.equalsIgnoreCase("app_open")) {
                    if (!str.equalsIgnoreCase("rewarded") && !str.equalsIgnoreCase("reward")) {
                        if (!str.equalsIgnoreCase("rewarded_inter") && !str.equalsIgnoreCase("rewarded_interstitial")) {
                            y.i("AppLovinSdk", "Unknown ad format: ".concat(str));
                            return null;
                        }
                        return REWARDED_INTERSTITIAL;
                    }
                    return REWARDED;
                }
                return APP_OPEN;
            }
            return INTERSTITIAL;
        }
        return LEADER;
    }

    public AppLovinSdkUtils.Size getAdaptiveSize(Activity activity) {
        return getAdaptiveSize(-1, activity);
    }

    @Deprecated
    public String getDisplayName() {
        return this.f19584b;
    }

    public String getLabel() {
        return this.f19583a;
    }

    public AppLovinSdkUtils.Size getSize() {
        if (this == BANNER) {
            return new AppLovinSdkUtils.Size(320, 50);
        }
        if (this == LEADER) {
            return new AppLovinSdkUtils.Size(728, 90);
        }
        if (this == MREC) {
            return new AppLovinSdkUtils.Size(300, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED);
        }
        if (this == CROSS_PROMO) {
            return new AppLovinSdkUtils.Size(-1, -1);
        }
        return new AppLovinSdkUtils.Size(0, 0);
    }

    public boolean isAdViewAd() {
        if (this != BANNER && this != MREC && this != LEADER && this != CROSS_PROMO) {
            return false;
        }
        return true;
    }

    public boolean isFullscreenAd() {
        if (this != INTERSTITIAL && this != APP_OPEN && this != REWARDED && this != REWARDED_INTERSTITIAL) {
            return false;
        }
        return true;
    }

    public String toString() {
        return l.p(new StringBuilder("MaxAdFormat{label='"), this.f19583a, "'}");
    }

    public AppLovinSdkUtils.Size getAdaptiveSize(int i10, Context context) {
        if (this != BANNER && this != LEADER) {
            return getSize();
        }
        return c.a(i10, this, context);
    }
}
