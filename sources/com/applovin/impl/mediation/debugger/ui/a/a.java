package com.applovin.impl.mediation.debugger.ui.a;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.mediation.debugger.a.a;
import com.applovin.impl.mediation.debugger.ui.a.b;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.b;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
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
import com.huawei.hms.ads.gl;
import java.util.List;

/* loaded from: classes.dex */
public class a extends com.applovin.impl.mediation.debugger.ui.a implements a.InterfaceC0207a, AdControlButton.a, MaxAdRevenueListener, MaxAdViewAdListener, MaxRewardedAdListener {

    /* renamed from: a, reason: collision with root package name */
    private p f18005a;

    /* renamed from: b, reason: collision with root package name */
    private com.applovin.impl.mediation.debugger.b.a.a f18006b;

    /* renamed from: c, reason: collision with root package name */
    private b f18007c;

    /* renamed from: d, reason: collision with root package name */
    private com.applovin.impl.mediation.debugger.b.a.b f18008d;

    /* renamed from: e, reason: collision with root package name */
    private MaxAdView f18009e;
    private MaxInterstitialAd f;

    /* renamed from: g, reason: collision with root package name */
    private MaxAppOpenAd f18010g;

    /* renamed from: h, reason: collision with root package name */
    private MaxRewardedInterstitialAd f18011h;

    /* renamed from: i, reason: collision with root package name */
    private MaxRewardedAd f18012i;

    /* renamed from: j, reason: collision with root package name */
    private MaxNativeAdView f18013j;

    /* renamed from: k, reason: collision with root package name */
    private MaxNativeAdLoader f18014k;

    /* renamed from: l, reason: collision with root package name */
    private d f18015l;

    /* renamed from: m, reason: collision with root package name */
    private ListView f18016m;

    /* renamed from: n, reason: collision with root package name */
    private View f18017n;
    private AdControlButton o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f18018p;

    /* renamed from: q, reason: collision with root package name */
    private com.applovin.impl.mediation.debugger.a.a f18019q;

    @Override // com.applovin.impl.mediation.debugger.ui.a
    public p getSdk() {
        return this.f18005a;
    }

    public void initialize(final com.applovin.impl.mediation.debugger.b.a.a aVar, com.applovin.impl.mediation.debugger.b.a.b bVar, final p pVar) {
        List<?> a10;
        this.f18005a = pVar;
        this.f18006b = aVar;
        this.f18008d = bVar;
        b bVar2 = new b(aVar, bVar, this);
        this.f18007c = bVar2;
        bVar2.a(new d.a() { // from class: com.applovin.impl.mediation.debugger.ui.a.a.1
            @Override // com.applovin.impl.mediation.debugger.ui.d.d.a
            public void a(com.applovin.impl.mediation.debugger.ui.d.a aVar2, final com.applovin.impl.mediation.debugger.ui.d.c cVar) {
                if (cVar instanceof b.a) {
                    com.applovin.impl.sdk.utils.b.a(a.this, MaxDebuggerAdUnitDetailActivity.class, pVar.w(), new b.a<MaxDebuggerAdUnitDetailActivity>() { // from class: com.applovin.impl.mediation.debugger.ui.a.a.1.1
                        @Override // com.applovin.impl.sdk.utils.b.a
                        public void a(MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
                            com.applovin.impl.mediation.debugger.b.a.b d10 = ((b.a) cVar).d();
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            maxDebuggerAdUnitDetailActivity.initialize(aVar, d10, pVar);
                        }
                    });
                }
            }
        });
        a();
        if (aVar.e().d()) {
            if ((bVar == null || bVar.a().c().A()) && (a10 = pVar.as().a(aVar.a())) != null && !a10.isEmpty()) {
                this.f18019q = new com.applovin.impl.mediation.debugger.a.a(a10, aVar.d(), this);
            }
        }
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
        this.o.setControlState(AdControlButton.b.LOAD);
        this.f18018p.setText("");
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
        this.o.setControlState(AdControlButton.b.LOAD);
        this.f18018p.setText("");
        if (204 == maxError.getCode()) {
            Utils.showAlert("No Fill", "No fills often happen in live environments. Please make sure to use the Mediation Debugger test mode before you go live.", this);
            return;
        }
        Utils.showAlert("", "Failed to load with error code: " + maxError.getCode(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd maxAd) {
        this.f18018p.setText(maxAd.getNetworkName() + " ad loaded");
        this.o.setControlState(AdControlButton.b.SHOW);
        if (maxAd.getFormat().isAdViewAd()) {
            a(this.f18009e, maxAd.getFormat().getSize(), null);
        } else if (MaxAdFormat.NATIVE == this.f18006b.d()) {
            a(this.f18013j, MaxAdFormat.MREC.getSize(), null);
        }
    }

    @Override // com.applovin.impl.mediation.debugger.a.a.InterfaceC0207a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f18009e.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f18010g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f18011h.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f18012i.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f18014k.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        Utils.showToast("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a
    public void onClick(AdControlButton adControlButton) {
        if (this.f18005a.av().a()) {
            Utils.showAlert("Not Supported", "Ad loads are not supported while Test Mode is enabled. Please restart the app.", this);
            return;
        }
        MaxAdFormat d10 = this.f18006b.d();
        AdControlButton.b bVar = AdControlButton.b.LOAD;
        if (bVar == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.b.LOADING);
            com.applovin.impl.mediation.debugger.a.a aVar = this.f18019q;
            if (aVar != null) {
                aVar.a();
                return;
            } else {
                a(d10);
                return;
            }
        }
        if (AdControlButton.b.SHOW == adControlButton.getControlState()) {
            if (!d10.isAdViewAd() && d10 != MaxAdFormat.NATIVE) {
                adControlButton.setControlState(bVar);
            }
            b(d10);
        }
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_ad_unit_detail_activity);
        setTitle(this.f18007c.a());
        this.f18016m = (ListView) findViewById(R.id.listView);
        this.f18017n = findViewById(R.id.ad_presenter_view);
        this.o = (AdControlButton) findViewById(R.id.ad_control_button);
        this.f18018p = (TextView) findViewById(R.id.status_textview);
        this.f18016m.setAdapter((ListAdapter) this.f18007c);
        TextView textView = this.f18018p;
        if (this.f18005a.av().a()) {
            str = "Not Supported while Test Mode is enabled";
        } else {
            str = "Tap to load an ad";
        }
        textView.setText(str);
        this.f18018p.setTypeface(Typeface.DEFAULT_BOLD);
        this.o.setOnClickListener(this);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setPadding(0, 10, 0, 0);
        shapeDrawable.getPaint().setColor(-1);
        shapeDrawable.getPaint().setShadowLayer(10, gl.Code, -10, 855638016);
        shapeDrawable.setShape(new RectShape());
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable});
        layerDrawable.setLayerInset(0, 0, 10, 0, 0);
        this.f18017n.setBackground(layerDrawable);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f18008d != null) {
            this.f18005a.av().a((String) null);
            this.f18005a.av().a(false);
        }
        MaxAdView maxAdView = this.f18009e;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxAppOpenAd maxAppOpenAd = this.f18010g;
        if (maxAppOpenAd != null) {
            maxAppOpenAd.destroy();
        }
        MaxRewardedInterstitialAd maxRewardedInterstitialAd = this.f18011h;
        if (maxRewardedInterstitialAd != null) {
            maxRewardedInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f18012i;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
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

    private void b(MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            a(this.f18009e, maxAdFormat.getSize(), new DialogInterface.OnShowListener() { // from class: com.applovin.impl.mediation.debugger.ui.a.a.3
                @Override // android.content.DialogInterface.OnShowListener
                public void onShow(DialogInterface dialogInterface) {
                    a.this.f18009e.startAutoRefresh();
                }
            });
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f18006b.d()) {
            this.f.showAd("[Mediation Debugger Live Ad]");
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f18006b.d()) {
            this.f18010g.showAd("[Mediation Debugger Live Ad]");
            return;
        }
        if (MaxAdFormat.REWARDED_INTERSTITIAL == this.f18006b.d()) {
            this.f18011h.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.REWARDED == this.f18006b.d()) {
            this.f18012i.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.NATIVE == this.f18006b.d()) {
            a(this.f18013j, MaxAdFormat.MREC.getSize(), null);
        }
    }

    private void a() {
        String a10 = this.f18006b.a();
        if (this.f18006b.d().isAdViewAd()) {
            MaxAdView maxAdView = new MaxAdView(a10, this.f18006b.d(), this.f18005a.K(), this);
            this.f18009e = maxAdView;
            maxAdView.setExtraParameter(AppLovinSdkExtraParameterKey.IS_ADAPTIVE_BANNER, ep.V);
            this.f18009e.setListener(this);
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f18006b.d()) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd(a10, this.f18005a.K(), this);
            this.f = maxInterstitialAd;
            maxInterstitialAd.setListener(this);
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f18006b.d()) {
            MaxAppOpenAd maxAppOpenAd = new MaxAppOpenAd(a10, this.f18005a.K());
            this.f18010g = maxAppOpenAd;
            maxAppOpenAd.setListener(this);
            return;
        }
        if (MaxAdFormat.REWARDED_INTERSTITIAL == this.f18006b.d()) {
            MaxRewardedInterstitialAd maxRewardedInterstitialAd = new MaxRewardedInterstitialAd(a10, this.f18005a.K(), this);
            this.f18011h = maxRewardedInterstitialAd;
            maxRewardedInterstitialAd.setListener(this);
        } else if (MaxAdFormat.REWARDED == this.f18006b.d()) {
            MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(a10, this.f18005a.K(), this);
            this.f18012i = maxRewardedAd;
            maxRewardedAd.setListener(this);
        } else if (MaxAdFormat.NATIVE == this.f18006b.d()) {
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(a10, this.f18005a.K(), this);
            this.f18014k = maxNativeAdLoader;
            maxNativeAdLoader.setNativeAdListener(new MaxNativeAdListener() { // from class: com.applovin.impl.mediation.debugger.ui.a.a.2
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
                    if (maxNativeAdView != null) {
                        a.this.f18013j = maxNativeAdView;
                    } else {
                        a aVar = a.this;
                        p unused = a.this.f18005a;
                        aVar.f18013j = new MaxNativeAdView(MaxNativeAdView.MEDIUM_TEMPLATE_1, p.y());
                        a.this.f18014k.render(a.this.f18013j, maxAd);
                    }
                    a.this.onAdLoaded(maxAd);
                }
            });
            this.f18014k.setRevenueListener(this);
        }
    }

    @Override // com.applovin.impl.mediation.debugger.a.a.InterfaceC0207a
    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f18009e.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f18010g.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f18011h.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f18012i.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f18014k.setLocalExtraParameter("amazon_ad_error", adError);
        }
        a(maxAdFormat);
    }

    private void a(MaxAdFormat maxAdFormat) {
        if (this.f18008d != null) {
            this.f18005a.av().a(this.f18008d.a().a());
            this.f18005a.av().a(true);
        }
        if (maxAdFormat.isAdViewAd()) {
            this.f18009e.setPlacement("[Mediation Debugger Live Ad]");
            this.f18009e.loadAd();
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f18006b.d()) {
            this.f.loadAd();
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f18006b.d()) {
            this.f18010g.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED_INTERSTITIAL == this.f18006b.d()) {
            this.f18011h.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED == this.f18006b.d()) {
            this.f18012i.loadAd();
        } else if (MaxAdFormat.NATIVE == this.f18006b.d()) {
            this.f18014k.setPlacement("[Mediation Debugger Live Ad]");
            this.f18014k.loadAd();
        } else {
            Utils.showToast("Live ads currently unavailable for ad format", this);
        }
    }

    private void a(final ViewGroup viewGroup, AppLovinSdkUtils.Size size, DialogInterface.OnShowListener onShowListener) {
        if (this.f18015l != null) {
            return;
        }
        d dVar = new d(viewGroup, size, this);
        this.f18015l = dVar;
        dVar.setOnShowListener(onShowListener);
        this.f18015l.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.mediation.debugger.ui.a.a.4
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                ViewGroup viewGroup2 = viewGroup;
                if (viewGroup2 instanceof MaxAdView) {
                    ((MaxAdView) viewGroup2).stopAutoRefresh();
                }
                a.this.f18015l = null;
            }
        });
        this.f18015l.show();
    }
}
