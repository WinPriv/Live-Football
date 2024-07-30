package com.applovin.impl.mediation.debugger.ui.testmode;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.mediation.debugger.a.a;
import com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxAppOpenAd;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.applovin.mediation.ads.MaxRewardedInterstitialAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.huawei.hms.ads.ep;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class a extends com.applovin.impl.mediation.debugger.ui.a implements a.InterfaceC0207a, AdControlButton.a, MaxAdRevenueListener, MaxAdViewAdListener, MaxRewardedAdListener {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.mediation.debugger.b.c.b f18194a;

    /* renamed from: b, reason: collision with root package name */
    private p f18195b;

    /* renamed from: c, reason: collision with root package name */
    private MaxAdView f18196c;

    /* renamed from: d, reason: collision with root package name */
    private MaxAdView f18197d;

    /* renamed from: e, reason: collision with root package name */
    private MaxInterstitialAd f18198e;
    private MaxAppOpenAd f;

    /* renamed from: g, reason: collision with root package name */
    private MaxRewardedInterstitialAd f18199g;

    /* renamed from: h, reason: collision with root package name */
    private MaxRewardedAd f18200h;

    /* renamed from: i, reason: collision with root package name */
    private MaxAd f18201i;

    /* renamed from: j, reason: collision with root package name */
    private MaxNativeAdLoader f18202j;

    /* renamed from: k, reason: collision with root package name */
    private String f18203k;

    /* renamed from: l, reason: collision with root package name */
    private AdControlButton f18204l;

    /* renamed from: m, reason: collision with root package name */
    private AdControlButton f18205m;

    /* renamed from: n, reason: collision with root package name */
    private AdControlButton f18206n;
    private AdControlButton o;

    /* renamed from: p, reason: collision with root package name */
    private AdControlButton f18207p;

    /* renamed from: q, reason: collision with root package name */
    private AdControlButton f18208q;

    /* renamed from: r, reason: collision with root package name */
    private AdControlButton f18209r;

    /* renamed from: s, reason: collision with root package name */
    private Button f18210s;

    /* renamed from: t, reason: collision with root package name */
    private Button f18211t;

    /* renamed from: u, reason: collision with root package name */
    private FrameLayout f18212u;

    /* renamed from: v, reason: collision with root package name */
    private FrameLayout f18213v;

    /* renamed from: w, reason: collision with root package name */
    private Map<MaxAdFormat, com.applovin.impl.mediation.debugger.a.a> f18214w;

    @Override // com.applovin.impl.mediation.debugger.ui.a
    public p getSdk() {
        return this.f18195b;
    }

    public String getTestModeNetwork(MaxAdFormat maxAdFormat) {
        if (this.f18194a.v() != null && this.f18194a.v().containsKey(maxAdFormat)) {
            return this.f18194a.v().get(maxAdFormat);
        }
        return this.f18194a.h();
    }

    public void initialize(com.applovin.impl.mediation.debugger.b.c.b bVar) {
        this.f18194a = bVar;
        this.f18195b = bVar.y();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(MaxAd maxAd) {
        Utils.showToast("onAdClicked", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(MaxAd maxAd) {
        Utils.showToast("onAdCollapsed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        a(maxAd.getAdUnitId()).setControlState(AdControlButton.b.LOAD);
        Utils.showAlert("Failed to display " + maxAd.getFormat().getDisplayName(), "MAX Error\nCode: " + maxError.getCode() + "\nMessage: " + maxError.getMessage() + "\n\n" + maxAd.getNetworkName() + " Display Error\nCode: " + maxError.getMediatedNetworkErrorCode() + "\nMessage: " + maxError.getMediatedNetworkErrorMessage(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(MaxAd maxAd) {
        Utils.showToast("onAdDisplayed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdExpanded(MaxAd maxAd) {
        Utils.showToast("onAdExpanded", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(MaxAd maxAd) {
        Utils.showToast("onAdHidden", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(String str, MaxError maxError) {
        AdControlButton a10 = a(str);
        a10.setControlState(AdControlButton.b.LOAD);
        Utils.showAlert(maxError, a10.getFormat().getLabel(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd maxAd) {
        AdControlButton a10 = a(maxAd.getAdUnitId());
        if (!maxAd.getFormat().isAdViewAd() && !maxAd.getFormat().equals(MaxAdFormat.NATIVE)) {
            a10.setControlState(AdControlButton.b.SHOW);
        } else {
            a10.setControlState(AdControlButton.b.LOAD);
        }
    }

    @Override // com.applovin.impl.mediation.debugger.a.a.InterfaceC0207a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER != maxAdFormat && MaxAdFormat.LEADER != maxAdFormat) {
            if (MaxAdFormat.MREC == maxAdFormat) {
                this.f18197d.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
                this.f18198e.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
                this.f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
                this.f18199g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            } else if (MaxAdFormat.REWARDED == maxAdFormat) {
                this.f18200h.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            } else if (MaxAdFormat.NATIVE == maxAdFormat) {
                this.f18202j.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            }
        } else {
            this.f18196c.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        Utils.showToast("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a
    public void onClick(AdControlButton adControlButton) {
        MaxAdFormat format = adControlButton.getFormat();
        AdControlButton.b bVar = AdControlButton.b.LOAD;
        if (bVar == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.b.LOADING);
            Map<MaxAdFormat, com.applovin.impl.mediation.debugger.a.a> map = this.f18214w;
            if (map != null && map.get(format) != null) {
                this.f18214w.get(format).a();
                return;
            } else {
                a(format);
                return;
            }
        }
        if (AdControlButton.b.SHOW == adControlButton.getControlState()) {
            adControlButton.setControlState(bVar);
            b(format);
        }
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f18194a == null) {
            y.i("MaxDebuggerMultiAdActivity", "Failed to initialize activity with a network model.");
            return;
        }
        setContentView(R.layout.mediation_debugger_multi_ad_activity);
        setTitle(this.f18194a.i() + " Test Ads");
        a();
        b();
        c();
        d();
        e();
        findViewById(R.id.rewarded_interstitial_control_view).setVisibility(8);
        findViewById(R.id.app_open_ad_control_view).setVisibility(8);
        this.f18210s = (Button) findViewById(R.id.show_mrec_button);
        this.f18211t = (Button) findViewById(R.id.show_native_button);
        if (this.f18194a.q() && this.f18194a.p().contains(MaxAdFormat.MREC)) {
            this.f18213v.setVisibility(8);
            this.f18210s.setBackgroundColor(-1);
            this.f18211t.setBackgroundColor(-3355444);
            this.f18210s.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.a.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    a.this.f18212u.setVisibility(0);
                    a.this.f18213v.setVisibility(8);
                    a.this.f18210s.setBackgroundColor(-1);
                    a.this.f18211t.setBackgroundColor(-3355444);
                }
            });
            this.f18211t.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.a.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    a.this.f18213v.setVisibility(0);
                    a.this.f18212u.setVisibility(8);
                    a.this.f18211t.setBackgroundColor(-1);
                    a.this.f18210s.setBackgroundColor(-3355444);
                }
            });
        } else {
            this.f18210s.setVisibility(8);
            this.f18211t.setVisibility(8);
        }
        if (StringUtils.isValidString(this.f18194a.B()) && this.f18194a.C() != null && this.f18194a.C().size() > 0) {
            AdRegistration.getInstance(this.f18194a.B(), this);
            AdRegistration.enableTesting(true);
            AdRegistration.enableLogging(true);
            Map<MaxAdFormat, com.applovin.impl.mediation.debugger.a.a> map = CollectionUtils.map(this.f18194a.C().size());
            for (MaxAdFormat maxAdFormat : this.f18194a.C().keySet()) {
                map.put(maxAdFormat, new com.applovin.impl.mediation.debugger.a.a(this.f18194a.C().get(maxAdFormat), maxAdFormat, this));
            }
            this.f18214w = map;
        }
        try {
            setRequestedOrientation(7);
        } catch (Throwable th) {
            y.c("AppLovinSdk", "Failed to set portrait orientation", th);
        }
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onDestroy() {
        MaxAd maxAd;
        super.onDestroy();
        this.f18195b.av().a((String) null);
        MaxAdView maxAdView = this.f18196c;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxAdView maxAdView2 = this.f18197d;
        if (maxAdView2 != null) {
            maxAdView2.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f18198e;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f18200h;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.f18202j;
        if (maxNativeAdLoader != null && (maxAd = this.f18201i) != null) {
            maxNativeAdLoader.destroy(maxAd);
        }
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onRewardedVideoCompleted(MaxAd maxAd) {
        Utils.showToast("onRewardedVideoCompleted", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onRewardedVideoStarted(MaxAd maxAd) {
        Utils.showToast("onRewardedVideoStarted", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        Utils.showToast("onUserRewarded", maxAd, this);
    }

    private void b() {
        this.f18212u = (FrameLayout) findViewById(R.id.mrec_ad_view_container);
        List<MaxAdFormat> p10 = this.f18194a.p();
        MaxAdFormat maxAdFormat = MaxAdFormat.MREC;
        if (p10.contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView("test_mode_mrec", maxAdFormat, this.f18195b.K(), this);
            this.f18197d = maxAdView;
            maxAdView.setListener(this);
            this.f18212u.addView(this.f18197d, new FrameLayout.LayoutParams(-1, -1));
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.mrec_control_button);
            this.f18205m = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f18205m.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.mrec_control_view).setVisibility(8);
        this.f18212u.setVisibility(8);
    }

    private void c() {
        List<MaxAdFormat> p10 = this.f18194a.p();
        MaxAdFormat maxAdFormat = MaxAdFormat.INTERSTITIAL;
        if (p10.contains(maxAdFormat)) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd("test_mode_interstitial", this.f18195b.K(), this);
            this.f18198e = maxInterstitialAd;
            maxInterstitialAd.setListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.interstitial_control_button);
            this.f18206n = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f18206n.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.interstitial_control_view).setVisibility(8);
    }

    private void d() {
        List<MaxAdFormat> p10 = this.f18194a.p();
        MaxAdFormat maxAdFormat = MaxAdFormat.REWARDED;
        if (p10.contains(maxAdFormat)) {
            String str = "test_mode_rewarded_" + this.f18194a.h();
            this.f18203k = str;
            MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(str, this.f18195b.K(), this);
            this.f18200h = maxRewardedAd;
            maxRewardedAd.setListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.rewarded_control_button);
            this.f18208q = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f18208q.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.rewarded_control_view).setVisibility(8);
    }

    private void e() {
        this.f18213v = (FrameLayout) findViewById(R.id.native_ad_view_container);
        if (this.f18194a.q()) {
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader("test_mode_native", this.f18195b.K(), this);
            this.f18202j = maxNativeAdLoader;
            maxNativeAdLoader.setNativeAdListener(new MaxNativeAdListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.a.3
                @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
                public void onNativeAdClicked(MaxAd maxAd) {
                    a.this.onAdClicked(maxAd);
                }

                @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
                public void onNativeAdLoadFailed(String str, MaxError maxError) {
                    a.this.onAdLoadFailed(str, maxError);
                }

                @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
                public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
                    if (a.this.f18201i != null) {
                        a.this.f18202j.destroy(a.this.f18201i);
                    }
                    a.this.f18201i = maxAd;
                    a.this.f18213v.removeAllViews();
                    a.this.f18213v.addView(maxNativeAdView);
                    a.this.onAdLoaded(maxAd);
                }
            });
            this.f18202j.setRevenueListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.native_control_button);
            this.f18209r = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f18209r.setFormat(MaxAdFormat.NATIVE);
            return;
        }
        findViewById(R.id.native_control_view).setVisibility(8);
        this.f18213v.setVisibility(8);
    }

    private void a() {
        MaxAdFormat maxAdFormat;
        String str;
        boolean isTablet = AppLovinSdkUtils.isTablet(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.banner_ad_view_container);
        if (isTablet) {
            maxAdFormat = MaxAdFormat.LEADER;
            ((TextView) findViewById(R.id.banner_label)).setText("Leader");
            str = "test_mode_leader";
        } else {
            maxAdFormat = MaxAdFormat.BANNER;
            str = "test_mode_banner";
        }
        if (this.f18194a.p().contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView(str, maxAdFormat, this.f18195b.K(), this);
            this.f18196c = maxAdView;
            maxAdView.setExtraParameter(AppLovinSdkExtraParameterKey.IS_ADAPTIVE_BANNER, ep.V);
            this.f18196c.setListener(this);
            frameLayout.addView(this.f18196c, new FrameLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getWidth()), AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getHeight())));
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.banner_control_button);
            this.f18204l = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f18204l.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.banner_control_view).setVisibility(8);
        frameLayout.setVisibility(8);
    }

    @Override // com.applovin.impl.mediation.debugger.a.a.InterfaceC0207a
    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER != maxAdFormat && MaxAdFormat.LEADER != maxAdFormat) {
            if (MaxAdFormat.MREC == maxAdFormat) {
                this.f18197d.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
                this.f18198e.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
                this.f.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
                this.f18199g.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.REWARDED == maxAdFormat) {
                this.f18200h.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.NATIVE == maxAdFormat) {
                this.f18202j.setLocalExtraParameter("amazon_ad_error", adError);
            }
        } else {
            this.f18196c.setLocalExtraParameter("amazon_ad_error", adError);
        }
        a(maxAdFormat);
    }

    private void b(MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f18198e.showAd();
            return;
        }
        if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f.showAd();
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f18199g.showAd();
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f18200h.showAd();
        }
    }

    private void a(MaxAdFormat maxAdFormat) {
        this.f18195b.av().a(getTestModeNetwork(maxAdFormat));
        if (MaxAdFormat.BANNER != maxAdFormat && MaxAdFormat.LEADER != maxAdFormat) {
            if (MaxAdFormat.MREC == maxAdFormat) {
                this.f18197d.loadAd();
                return;
            }
            if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
                this.f18198e.loadAd();
                return;
            }
            if (MaxAdFormat.APP_OPEN == maxAdFormat) {
                this.f.loadAd();
                return;
            }
            if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
                this.f18199g.loadAd();
                return;
            } else if (MaxAdFormat.REWARDED == maxAdFormat) {
                this.f18200h.loadAd();
                return;
            } else {
                if (MaxAdFormat.NATIVE == maxAdFormat) {
                    this.f18202j.loadAd();
                    return;
                }
                return;
            }
        }
        this.f18196c.loadAd();
    }

    private AdControlButton a(String str) {
        if (!str.equals("test_mode_banner") && !str.equals("test_mode_leader")) {
            if (str.equals("test_mode_mrec")) {
                return this.f18205m;
            }
            if (str.equals("test_mode_interstitial")) {
                return this.f18206n;
            }
            if (str.equals("test_mode_app_open")) {
                return this.o;
            }
            if (str.equals("test_mode_rewarded_interstitial")) {
                return this.f18207p;
            }
            if (str.equals(this.f18203k)) {
                return this.f18208q;
            }
            if (str.equals("test_mode_native")) {
                return this.f18209r;
            }
            throw new IllegalArgumentException("Invalid test mode ad unit identifier provided ".concat(str));
        }
        return this.f18204l;
    }
}
