package com.applovin.impl.mediation.ads;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.a.d;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.d;
import com.applovin.impl.sdk.ad.g;
import com.applovin.impl.sdk.d;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.h;
import com.applovin.impl.sdk.utils.k;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public class MaxNativeAdLoaderImpl extends com.applovin.impl.mediation.ads.a implements d.a, d.a {
    public static final String KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE = "ad_request_type";

    /* renamed from: a, reason: collision with root package name */
    private final a f17653a;

    /* renamed from: b, reason: collision with root package name */
    private String f17654b;

    /* renamed from: c, reason: collision with root package name */
    private String f17655c;

    /* renamed from: d, reason: collision with root package name */
    private d.a f17656d;

    /* renamed from: e, reason: collision with root package name */
    private MaxNativeAdListener f17657e;
    private final Map<String, MaxNativeAdView> f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f17658g;

    /* loaded from: classes.dex */
    public class a implements a.InterfaceC0201a {
        private a() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            y yVar = MaxNativeAdLoaderImpl.this.logger;
            if (y.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.b(maxNativeAdLoaderImpl.tag, "MaxNativeAdListener.onNativeAdClicked(nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.f17657e);
            }
            k.a(MaxNativeAdLoaderImpl.this.f17657e, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            MaxNativeAdLoaderImpl.this.a(((MaxErrorImpl) maxError).getLoadTag());
            y yVar = MaxNativeAdLoaderImpl.this.logger;
            if (y.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.b(maxNativeAdLoaderImpl.tag, "MaxNativeAdListener.onNativeAdLoadFailed(adUnitId=" + str + ", error=" + maxError + "), listener=" + MaxNativeAdLoaderImpl.this.f17657e);
            }
            k.a(MaxNativeAdLoaderImpl.this.f17657e, str, maxError, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(final MaxAd maxAd) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.a.1
                @Override // java.lang.Runnable
                public void run() {
                    y yVar = MaxNativeAdLoaderImpl.this.logger;
                    if (y.a()) {
                        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                        maxNativeAdLoaderImpl.logger.b(maxNativeAdLoaderImpl.tag, "Native ad loaded");
                    }
                    com.applovin.impl.mediation.a.d dVar = (com.applovin.impl.mediation.a.d) maxAd;
                    dVar.e(MaxNativeAdLoaderImpl.this.f17654b);
                    dVar.f(MaxNativeAdLoaderImpl.this.f17655c);
                    MaxNativeAdLoaderImpl.this.sdk.af().a(dVar);
                    MaxNativeAdView a10 = MaxNativeAdLoaderImpl.this.a(dVar.a());
                    if (a10 == null) {
                        y yVar2 = MaxNativeAdLoaderImpl.this.logger;
                        if (y.a()) {
                            MaxNativeAdLoaderImpl maxNativeAdLoaderImpl2 = MaxNativeAdLoaderImpl.this;
                            maxNativeAdLoaderImpl2.logger.b(maxNativeAdLoaderImpl2.tag, "No custom view provided, checking template");
                        }
                        String D = dVar.D();
                        if (StringUtils.isValidString(D)) {
                            y yVar3 = MaxNativeAdLoaderImpl.this.logger;
                            if (y.a()) {
                                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl3 = MaxNativeAdLoaderImpl.this;
                                maxNativeAdLoaderImpl3.logger.b(maxNativeAdLoaderImpl3.tag, "Using template: " + D + "...");
                            }
                            p pVar = MaxNativeAdLoaderImpl.this.sdk;
                            a10 = new MaxNativeAdView(D, p.y());
                        }
                    }
                    if (a10 != null) {
                        a.this.a(a10);
                        MaxNativeAdLoaderImpl.this.a(a10, dVar, dVar.getNativeAd());
                        y yVar4 = MaxNativeAdLoaderImpl.this.logger;
                        if (y.a()) {
                            MaxNativeAdLoaderImpl maxNativeAdLoaderImpl4 = MaxNativeAdLoaderImpl.this;
                            maxNativeAdLoaderImpl4.logger.b(maxNativeAdLoaderImpl4.tag, "MaxNativeAdListener.onNativeAdLoaded(nativeAdView=" + a10 + ", nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.f17657e);
                        }
                        k.a(MaxNativeAdLoaderImpl.this.f17657e, a10, maxAd, true);
                        MaxNativeAdLoaderImpl.this.a(dVar);
                        MaxNativeAdLoaderImpl.this.a(a10);
                        return;
                    }
                    y yVar5 = MaxNativeAdLoaderImpl.this.logger;
                    if (y.a()) {
                        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl5 = MaxNativeAdLoaderImpl.this;
                        maxNativeAdLoaderImpl5.logger.b(maxNativeAdLoaderImpl5.tag, "No native ad view to render. Returning the native ad to be rendered later.");
                    }
                    y yVar6 = MaxNativeAdLoaderImpl.this.logger;
                    if (y.a()) {
                        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl6 = MaxNativeAdLoaderImpl.this;
                        maxNativeAdLoaderImpl6.logger.b(maxNativeAdLoaderImpl6.tag, "MaxNativeAdListener.onNativeAdLoaded(nativeAdView=null, nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.f17657e);
                    }
                    k.a(MaxNativeAdLoaderImpl.this.f17657e, (MaxNativeAdView) null, maxAd, true);
                    MaxNativeAdLoaderImpl.this.a(dVar);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            y yVar = MaxNativeAdLoaderImpl.this.logger;
            if (y.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.b(maxNativeAdLoaderImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.revenueListener);
            }
            k.a(MaxNativeAdLoaderImpl.this.revenueListener, maxAd, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(MaxNativeAdView maxNativeAdView) {
            com.applovin.impl.mediation.a.d c10;
            b adViewTracker = maxNativeAdView.getAdViewTracker();
            if (adViewTracker == null || (c10 = adViewTracker.c()) == null) {
                return;
            }
            y yVar = MaxNativeAdLoaderImpl.this.logger;
            if (y.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.b(maxNativeAdLoaderImpl.tag, "Destroying previous ad");
            }
            MaxNativeAdLoaderImpl.this.destroy(c10);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }
    }

    public MaxNativeAdLoaderImpl(String str, p pVar) {
        super(str, MaxAdFormat.NATIVE, "MaxNativeAdLoader", pVar);
        this.f17653a = new a();
        this.f17656d = d.a.PUBLISHER_INITIATED;
        this.f = CollectionUtils.map();
        this.f17658g = new Object();
        if (y.a()) {
            this.logger.b(this.tag, "Created new MaxNativeAdLoader (" + this + ")");
        }
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        this.f17657e = null;
        super.destroy();
    }

    public String getPlacement() {
        return this.f17654b;
    }

    public void handleNativeAdViewRendered(MaxAd maxAd) {
        MaxNativeAd nativeAd = ((com.applovin.impl.mediation.a.d) maxAd).getNativeAd();
        if (nativeAd == null) {
            if (y.a()) {
                this.logger.e(this.tag, "Failed to handle native ad rendered. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
                return;
            }
            return;
        }
        b adViewTracker = nativeAd.getAdViewTracker();
        if (adViewTracker == null) {
            if (y.a()) {
                this.logger.e(this.tag, "Failed to handle native ad rendered. Could not retrieve tracker. Ad might not have been registered via MaxNativeAdLoader.a(...).");
                return;
            }
            return;
        }
        adViewTracker.b();
    }

    public void loadAd(MaxNativeAdView maxNativeAdView) {
        String str;
        if (y.a()) {
            this.logger.b(this.tag, "Loading native ad for '" + this.adUnitId + "' into '" + maxNativeAdView + "' and notifying " + this.f17653a + "...");
        }
        Map<String, Object> map = this.extraParameters;
        if (maxNativeAdView != null) {
            str = "custom_ad_view";
        } else {
            str = "no_ad_view";
        }
        map.put("integration_type", str);
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        a(lowerCase, maxNativeAdView);
        this.sdk.ap().loadAd(this.adUnitId, lowerCase, MaxAdFormat.NATIVE, this.f17656d, this.localExtraParameters, this.extraParameters, p.y(), this.f17653a);
    }

    @Override // com.applovin.impl.sdk.d.a
    public void onAdExpired(g gVar) {
        if (y.a()) {
            this.logger.b(this.tag, "Ad expired for ad unit id " + getAdUnitId());
        }
        if (y.a()) {
            this.logger.b(this.tag, "MaxNativeAdListener.onNativeAdExpired(nativeAd=" + gVar + "), listener=" + this.f17657e);
        }
        k.b(this.f17657e, (MaxAd) gVar, true);
    }

    @Override // com.applovin.impl.mediation.a.d.a
    public void onAdExpiredOld(com.applovin.impl.mediation.a.d dVar) {
        onAdExpired(dVar);
    }

    public void registerClickableViews(final List<View> list, final ViewGroup viewGroup, MaxAd maxAd) {
        com.applovin.impl.mediation.a.d dVar = (com.applovin.impl.mediation.a.d) maxAd;
        final MaxNativeAd nativeAd = dVar.getNativeAd();
        if (nativeAd == null) {
            if (y.a()) {
                this.logger.e(this.tag, "Failed to register native ad. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
                return;
            }
            return;
        }
        this.sdk.af().a(dVar);
        a((com.applovin.impl.mediation.a.a) dVar);
        nativeAd.setClickableViews(list);
        nativeAd.setAdViewTracker(new b(dVar, viewGroup, this.f17653a, this.sdk));
        Runnable runnable = new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.1
            @Override // java.lang.Runnable
            public void run() {
                if (!nativeAd.prepareForInteraction(list, viewGroup)) {
                    y.i(MaxNativeAdLoaderImpl.this.tag, "Failed to prepare native ad for interaction...");
                }
            }
        };
        if (nativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            AppLovinSdkUtils.runOnUiThread(runnable);
        } else {
            this.sdk.M().a(new z(this.sdk, runnable), o.a.MEDIATION_MAIN);
        }
    }

    public boolean render(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        if (!(maxAd instanceof com.applovin.impl.mediation.a.d)) {
            y.i(this.tag, "Failed to render native ad. `ad` needs to be of type `MediatedNativeAd` to render.");
            return false;
        }
        if (maxNativeAdView == null) {
            y.i(this.tag, "Failed to render native ad. `adView` to render cannot be null.");
            return false;
        }
        com.applovin.impl.mediation.a.d dVar = (com.applovin.impl.mediation.a.d) maxAd;
        MaxNativeAd nativeAd = dVar.getNativeAd();
        if (nativeAd == null) {
            if (y.a()) {
                this.logger.e(this.tag, "Failed to render native ad. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
            }
            return false;
        }
        if (nativeAd.isExpired() && !((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.E)).booleanValue()) {
            y.i(this.tag, "Cancelled rendering for expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
            return false;
        }
        a(maxNativeAdView, dVar, nativeAd);
        a(maxNativeAdView);
        return true;
    }

    public void setCustomData(String str) {
        Utils.maybeLogCustomDataSizeLimit(str, this.tag);
        this.f17655c = str;
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void setLocalExtraParameter(String str, Object obj) {
        super.setLocalExtraParameter(str, obj);
        if (KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE.equalsIgnoreCase(str) && (obj instanceof d.a)) {
            this.f17656d = (d.a) obj;
        }
    }

    public void setNativeAdListener(MaxNativeAdListener maxNativeAdListener) {
        if (y.a()) {
            this.logger.b(this.tag, "Setting native ad listener: " + maxNativeAdListener);
        }
        this.f17657e = maxNativeAdListener;
    }

    public void setPlacement(String str) {
        this.f17654b = str;
    }

    public String toString() {
        return "MaxNativeAdLoader{adUnitId='" + this.adUnitId + "', nativeAdListener=" + this.f17657e + ", revenueListener=" + this.revenueListener + '}';
    }

    public void destroy(MaxAd maxAd) {
        b adViewTracker;
        if (maxAd instanceof com.applovin.impl.mediation.a.d) {
            com.applovin.impl.mediation.a.d dVar = (com.applovin.impl.mediation.a.d) maxAd;
            if (dVar.F()) {
                if (y.a()) {
                    this.logger.b(this.tag, "Native ad (" + dVar + ") has already been destroyed");
                    return;
                }
                return;
            }
            MaxNativeAdView C = dVar.C();
            if (C != null && (adViewTracker = C.getAdViewTracker()) != null && maxAd.equals(adViewTracker.c())) {
                C.recycle();
            }
            MaxNativeAd nativeAd = dVar.getNativeAd();
            if (nativeAd != null && nativeAd.getAdViewTracker() != null) {
                nativeAd.getAdViewTracker().a();
            }
            if (this.sdk.V() != null) {
                this.sdk.V().a(dVar);
            } else {
                dVar.J();
            }
            this.sdk.ap().destroyAd(dVar);
            this.sdk.au().a(this.adUnitId, dVar.a());
            return;
        }
        if (y.a()) {
            this.logger.b(this.tag, "Destroy failed on non-native ad(" + maxAd + ")");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.d dVar) {
        if (this.sdk.V() != null) {
            if (dVar.G().get()) {
                return;
            }
            this.sdk.V().a(dVar, this);
            return;
        }
        dVar.a(this);
    }

    private void a(String str, MaxNativeAdView maxNativeAdView) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f17658g) {
            this.f.put(str, maxNativeAdView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MaxNativeAdView a(String str) {
        MaxNativeAdView remove;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f17658g) {
            remove = this.f.remove(str);
        }
        return remove;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final MaxNativeAdView maxNativeAdView, final com.applovin.impl.mediation.a.d dVar, final MaxNativeAd maxNativeAd) {
        dVar.a(maxNativeAdView);
        a((com.applovin.impl.mediation.a.a) dVar);
        Runnable runnable = new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.2
            @Override // java.lang.Runnable
            public void run() {
                y yVar = MaxNativeAdLoaderImpl.this.logger;
                if (y.a()) {
                    MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                    maxNativeAdLoaderImpl.logger.b(maxNativeAdLoaderImpl.tag, "Rendering native ad view: " + maxNativeAdView);
                }
                maxNativeAdView.render(dVar, MaxNativeAdLoaderImpl.this.f17653a, MaxNativeAdLoaderImpl.this.sdk);
                maxNativeAd.setNativeAdView(maxNativeAdView);
                if (!maxNativeAd.prepareForInteraction(maxNativeAdView.getClickableViews(), maxNativeAdView)) {
                    maxNativeAd.prepareViewForInteraction(maxNativeAdView);
                }
            }
        };
        if (maxNativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            AppLovinSdkUtils.runOnUiThread(runnable);
        } else {
            this.sdk.M().a(new z(this.sdk, runnable), o.a.MEDIATION_MAIN);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxNativeAdView maxNativeAdView) {
        b adViewTracker = maxNativeAdView.getAdViewTracker();
        if (adViewTracker != null) {
            if (h.c()) {
                if (maxNativeAdView.isAttachedToWindow()) {
                    adViewTracker.b();
                }
            } else if (maxNativeAdView.getParent() != null) {
                adViewTracker.b();
            }
        }
    }
}
