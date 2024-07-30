package t8;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.anythink.banner.api.ATBannerView;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.AdError;
import com.anythink.interstitial.api.ATInterstitial;
import com.anythink.interstitial.api.ATInterstitialListener;
import com.anythink.nativead.api.ATNative;
import com.anythink.nativead.api.ATNativeAdView;
import com.anythink.nativead.api.ATNativePrepareExInfo;
import com.anythink.nativead.api.NativeAd;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.sdk.AppLovinMediationProvider;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.AdListener;
import com.huawei.hms.ads.AdParam;
import com.huawei.hms.ads.BannerAdSize;
import com.huawei.hms.ads.InterstitialAd;
import com.huawei.hms.ads.VideoConfiguration;
import com.huawei.hms.ads.banner.BannerView;
import com.huawei.hms.ads.nativead.MediaView;
import com.huawei.hms.ads.nativead.NativeAdConfiguration;
import com.huawei.hms.ads.nativead.NativeAdLoader;
import com.huawei.hms.ads.nativead.NativeView;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: AdsManager.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static IronSourceBannerLayout f35555a = null;

    /* renamed from: b, reason: collision with root package name */
    public static MaxAdView f35556b = null;

    /* renamed from: c, reason: collision with root package name */
    public static MaxInterstitialAd f35557c = null;

    /* renamed from: d, reason: collision with root package name */
    public static int f35558d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static ATInterstitial f35559e = null;
    public static int f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static ATBannerView f35560g;

    /* renamed from: h, reason: collision with root package name */
    public static NativeAd f35561h;

    /* renamed from: i, reason: collision with root package name */
    public static ATNative f35562i;

    /* renamed from: j, reason: collision with root package name */
    public static ATNativePrepareExInfo f35563j;

    /* renamed from: k, reason: collision with root package name */
    public static MaxNativeAdLoader f35564k;

    /* renamed from: l, reason: collision with root package name */
    public static MaxAd f35565l;

    /* renamed from: m, reason: collision with root package name */
    public static BannerView f35566m;

    /* renamed from: n, reason: collision with root package name */
    public static InterstitialAd f35567n;
    public static com.huawei.hms.ads.nativead.NativeAd o;

    /* compiled from: AdsManager.java */
    /* loaded from: classes2.dex */
    public class d implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ ProgressDialog f35572s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Activity f35573t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ h9.b f35574u;

        public d(ProgressDialog progressDialog, Activity activity, h9.b bVar) {
            this.f35572s = progressDialog;
            this.f35573t = activity;
            this.f35574u = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            char c10;
            this.f35572s.dismiss();
            String m10 = l.f35591b.m();
            m10.getClass();
            int hashCode = m10.hashCode();
            if (hashCode != 3343) {
                if (hashCode != 107876) {
                    if (hashCode != 3241160) {
                        if (hashCode == 110546420 && m10.equals("topon")) {
                            c10 = 3;
                        }
                        c10 = 65535;
                    } else {
                        if (m10.equals("iron")) {
                            c10 = 2;
                        }
                        c10 = 65535;
                    }
                } else {
                    if (m10.equals(AppLovinMediationProvider.MAX)) {
                        c10 = 1;
                    }
                    c10 = 65535;
                }
            } else {
                if (m10.equals("hw")) {
                    c10 = 0;
                }
                c10 = 65535;
            }
            h9.b bVar = this.f35574u;
            Activity activity = this.f35573t;
            if (c10 != 0) {
                if (c10 != 1) {
                    if (c10 != 2) {
                        if (c10 == 3) {
                            a.k(activity, bVar);
                            return;
                        }
                        return;
                    }
                    a.h(bVar);
                    return;
                }
                a.i(activity, bVar);
                return;
            }
            a.f(activity, bVar);
        }
    }

    public static void a() {
        IronSourceBannerLayout ironSourceBannerLayout = f35555a;
        if (ironSourceBannerLayout != null) {
            IronSource.destroyBanner(ironSourceBannerLayout);
        }
        MaxAdView maxAdView = f35556b;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        ATBannerView aTBannerView = f35560g;
        if (aTBannerView != null) {
            aTBannerView.destroy();
        }
        BannerView bannerView = f35566m;
        if (bannerView != null) {
            bannerView.destroy();
        }
        com.huawei.hms.ads.nativead.NativeAd nativeAd = o;
        if (nativeAd != null) {
            nativeAd.destroy();
        }
    }

    public static void b(Activity activity) {
        InterstitialAd interstitialAd = new InterstitialAd(activity);
        f35567n = interstitialAd;
        interstitialAd.setAdId(l.f35591b.c());
        f35567n.loadAd(new AdParam.Builder().build());
    }

    public static void c(Activity activity) {
        MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd(l.f35591b.j(), activity);
        f35557c = maxInterstitialAd;
        maxInterstitialAd.loadAd();
    }

    public static void d(Activity activity) {
        if (f35559e == null) {
            ATInterstitial aTInterstitial = new ATInterstitial(activity, l.f35591b.r());
            f35559e = aTInterstitial;
            aTInterstitial.setAdListener(new b());
        }
        f35559e.load();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void e(Activity activity, LinearLayout linearLayout) {
        char c10;
        i9.a aVar = l.f35591b;
        if (aVar != null && aVar.t()) {
            String l10 = l.f35591b.l();
            l10.getClass();
            switch (l10.hashCode()) {
                case 3343:
                    if (l10.equals("hw")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 107876:
                    if (l10.equals(AppLovinMediationProvider.MAX)) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3241160:
                    if (l10.equals("iron")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 110546420:
                    if (l10.equals("topon")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    BannerView bannerView = new BannerView(activity);
                    f35566m = bannerView;
                    bannerView.setAdId(l.f35591b.b());
                    f35566m.setBannerAdSize(BannerAdSize.BANNER_SIZE_320_50);
                    linearLayout.addView(f35566m);
                    f35566m.setBannerRefresh(60L);
                    f35566m.loadAd(new AdParam.Builder().build());
                    return;
                case 1:
                    linearLayout.removeAllViews();
                    MaxAdView maxAdView = new MaxAdView(l.f35591b.i(), activity);
                    f35556b = maxAdView;
                    maxAdView.setListener(new k(linearLayout));
                    f35556b.setLayoutParams(new FrameLayout.LayoutParams(-1, activity.getResources().getDimensionPixelSize(R.dimen.banner_height)));
                    f35556b.setBackgroundColor(-1);
                    f35556b.loadAd();
                    return;
                case 2:
                    f35555a = IronSource.createBanner(activity, ISBannerSize.BANNER);
                    f35555a.setBannerListener(new t8.c(linearLayout, new FrameLayout.LayoutParams(-1, -2)));
                    IronSource.loadBanner(f35555a, l.f35591b.g());
                    return;
                case 3:
                    ATBannerView aTBannerView = new ATBannerView(activity);
                    f35560g = aTBannerView;
                    aTBannerView.setPlacementId(l.f35591b.q());
                    int i10 = activity.getResources().getDisplayMetrics().widthPixels;
                    int i11 = (int) (i10 / 6.4f);
                    f35560g.setLayoutParams(new FrameLayout.LayoutParams(i10, i11));
                    HashMap hashMap = new HashMap();
                    hashMap.put(ATAdConst.KEY.AD_WIDTH, Integer.valueOf(i10));
                    hashMap.put(ATAdConst.KEY.AD_HEIGHT, Integer.valueOf(i11));
                    f35560g.setLocalExtra(hashMap);
                    f35560g.setBannerAdListener(new t8.b(linearLayout));
                    f35560g.loadAd();
                    return;
                default:
                    return;
            }
        }
    }

    public static void f(Activity activity, h9.b bVar) {
        InterstitialAd interstitialAd = f35567n;
        if (interstitialAd != null && interstitialAd.isLoaded()) {
            f35567n.show(activity);
            f35567n.setAdListener(new e(activity, bVar));
        } else {
            b(activity);
            bVar.a();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0085, code lost:
    
        if (r0.equals(com.applovin.sdk.AppLovinMediationProvider.MAX) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void g(android.app.Activity r5, h9.b r6) {
        /*
            i9.a r0 = t8.l.f35591b
            boolean r0 = r0.t()
            if (r0 == 0) goto Lad
            i9.a r0 = t8.l.f35591b
            boolean r0 = r0.u()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L4a
            i9.a r0 = t8.l.f35591b
            int r0 = r0.a()
            int r3 = t8.a.f
            if (r0 != r3) goto L42
            t8.a.f = r1
            android.app.ProgressDialog r0 = new android.app.ProgressDialog
            r1 = 2132017165(0x7f14000d, float:1.96726E38)
            r0.<init>(r5, r1)
            java.lang.String r1 = "Loading Ad"
            r0.setMessage(r1)
            r0.setCancelable(r2)
            r0.show()
            android.os.Handler r1 = new android.os.Handler
            r1.<init>()
            t8.a$d r2 = new t8.a$d
            r2.<init>(r0, r5, r6)
            r5 = 1000(0x3e8, double:4.94E-321)
            r1.postDelayed(r2, r5)
            goto Lb0
        L42:
            int r3 = r3 + r1
            t8.a.f = r3
            r6.a()
            goto Lb0
        L4a:
            i9.a r0 = t8.l.f35591b
            int r0 = r0.a()
            int r3 = t8.a.f
            if (r0 != r3) goto La6
            t8.a.f = r1
            i9.a r0 = t8.l.f35591b
            java.lang.String r0 = r0.m()
            r0.getClass()
            int r3 = r0.hashCode()
            r4 = -1
            switch(r3) {
                case 3343: goto L88;
                case 107876: goto L7f;
                case 3241160: goto L74;
                case 110546420: goto L69;
                default: goto L67;
            }
        L67:
            r1 = r4
            goto L92
        L69:
            java.lang.String r1 = "topon"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L72
            goto L67
        L72:
            r1 = 3
            goto L92
        L74:
            java.lang.String r1 = "iron"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7d
            goto L67
        L7d:
            r1 = 2
            goto L92
        L7f:
            java.lang.String r2 = "max"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L92
            goto L67
        L88:
            java.lang.String r1 = "hw"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L91
            goto L67
        L91:
            r1 = r2
        L92:
            switch(r1) {
                case 0: goto La2;
                case 1: goto L9e;
                case 2: goto L9a;
                case 3: goto L96;
                default: goto L95;
            }
        L95:
            goto Lb0
        L96:
            k(r5, r6)
            goto Lb0
        L9a:
            h(r6)
            goto Lb0
        L9e:
            i(r5, r6)
            goto Lb0
        La2:
            f(r5, r6)
            goto Lb0
        La6:
            int r3 = r3 + r1
            t8.a.f = r3
            r6.a()
            goto Lb0
        Lad:
            r6.a()
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t8.a.g(android.app.Activity, h9.b):void");
    }

    public static void h(h9.b bVar) {
        if (IronSource.isInterstitialReady()) {
            IronSource.showInterstitial(l.f35591b.h());
            IronSource.setInterstitialListener(new t8.d(bVar));
        } else {
            IronSource.loadInterstitial();
            bVar.a();
        }
    }

    public static void i(Activity activity, h9.b bVar) {
        if (f35557c.isReady()) {
            f35557c.showAd();
            f35557c.setListener(new C0488a(activity, bVar));
        } else {
            c(activity);
            h(bVar);
        }
    }

    public static void j(Activity activity, FrameLayout frameLayout, m9.j jVar, ATNativeAdView aTNativeAdView) {
        if (l.f35591b.t()) {
            String n10 = l.f35591b.n();
            n10.getClass();
            char c10 = 65535;
            switch (n10.hashCode()) {
                case 3343:
                    if (n10.equals("hw")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 107876:
                    if (n10.equals(AppLovinMediationProvider.MAX)) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 110546420:
                    if (n10.equals("topon")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    if (l.f35591b.t()) {
                        NativeAdLoader.Builder builder = new NativeAdLoader.Builder(activity, l.f35591b.d());
                        builder.setNativeAdLoadedListener(new i(activity, frameLayout)).setAdListener(new h());
                        builder.build().loadAds(new AdParam.Builder().build(), 5);
                        builder.setNativeAdOptions(new NativeAdConfiguration.Builder().setVideoConfiguration(new VideoConfiguration.Builder().setStartMuted(true).build()).build());
                        return;
                    }
                    return;
                case 1:
                    MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(l.f35591b.k(), activity);
                    f35564k = maxNativeAdLoader;
                    maxNativeAdLoader.setNativeAdListener(new t8.e(frameLayout));
                    f35564k.loadAd();
                    return;
                case 2:
                    ATNative aTNative = new ATNative(activity, l.f35591b.s(), new f(activity, aTNativeAdView, jVar));
                    f35562i = aTNative;
                    aTNative.setAdSourceStatusListener(new g(aTNativeAdView));
                    f35562i.makeAdRequest();
                    return;
                default:
                    return;
            }
        }
    }

    public static void k(Activity activity, h9.b bVar) {
        ATInterstitial.entryAdScenario(l.f35591b.r(), l.f35591b.r());
        if (f35559e.isAdReady()) {
            f35559e.show(activity);
            f35559e.setAdListener(new c(activity, bVar));
        } else {
            f35559e = null;
            d(activity);
            bVar.a();
        }
    }

    public static void l(com.huawei.hms.ads.nativead.NativeAd nativeAd, NativeView nativeView) {
        int i10;
        nativeView.setTitleView(nativeView.findViewById(R.id.ad_title));
        ((TextView) nativeView.getTitleView()).setText(nativeAd.getTitle());
        nativeView.setMediaView((MediaView) nativeView.findViewById(R.id.ad_media));
        nativeView.getMediaView().setMediaContent(nativeAd.getMediaContent());
        nativeView.setAdSourceView(nativeView.findViewById(R.id.ad_source));
        nativeView.setCallToActionView(nativeView.findViewById(R.id.ad_call_to_action));
        if (nativeAd.getAdSource() != null) {
            ((TextView) nativeView.getAdSourceView()).setText(nativeAd.getAdSource());
        }
        View adSourceView = nativeView.getAdSourceView();
        int i11 = 0;
        if (nativeAd.getAdSource() != null) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        adSourceView.setVisibility(i10);
        if (nativeAd.getCallToAction() != null) {
            ((Button) nativeView.getCallToActionView()).setText(nativeAd.getCallToAction());
        }
        View callToActionView = nativeView.getCallToActionView();
        if (nativeAd.getCallToAction() == null) {
            i11 = 4;
        }
        callToActionView.setVisibility(i11);
        nativeView.setNativeAd(nativeAd);
    }

    /* compiled from: AdsManager.java */
    /* loaded from: classes2.dex */
    public class b implements ATInterstitialListener {
        @Override // com.anythink.interstitial.api.ATInterstitialListener
        public final void onInterstitialAdLoadFail(AdError adError) {
            Log.e("TAG", "onInterstitialAdLoadFail:" + adError.getFullErrorInfo());
        }

        @Override // com.anythink.interstitial.api.ATInterstitialListener
        public final void onInterstitialAdShow(ATAdInfo aTAdInfo) {
            a.f35559e.load();
        }

        @Override // com.anythink.interstitial.api.ATInterstitialListener
        public final void onInterstitialAdVideoError(AdError adError) {
            Log.e("TAG", "onInterstitialAdVideoError:" + adError.getFullErrorInfo());
        }

        @Override // com.anythink.interstitial.api.ATInterstitialListener
        public final void onInterstitialAdLoaded() {
        }

        @Override // com.anythink.interstitial.api.ATInterstitialListener
        public final void onInterstitialAdClicked(ATAdInfo aTAdInfo) {
        }

        @Override // com.anythink.interstitial.api.ATInterstitialListener
        public final void onInterstitialAdClose(ATAdInfo aTAdInfo) {
        }

        @Override // com.anythink.interstitial.api.ATInterstitialListener
        public final void onInterstitialAdVideoEnd(ATAdInfo aTAdInfo) {
        }

        @Override // com.anythink.interstitial.api.ATInterstitialListener
        public final void onInterstitialAdVideoStart(ATAdInfo aTAdInfo) {
        }
    }

    /* compiled from: AdsManager.java */
    /* loaded from: classes2.dex */
    public class c implements ATInterstitialListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f35570a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h9.b f35571b;

        public c(Activity activity, h9.b bVar) {
            this.f35570a = activity;
            this.f35571b = bVar;
        }

        @Override // com.anythink.interstitial.api.ATInterstitialListener
        public final void onInterstitialAdClose(ATAdInfo aTAdInfo) {
            a.f35559e = null;
            a.d(this.f35570a);
            this.f35571b.a();
        }

        @Override // com.anythink.interstitial.api.ATInterstitialListener
        public final void onInterstitialAdLoadFail(AdError adError) {
            a.f35559e = null;
            a.d(this.f35570a);
            this.f35571b.a();
        }

        @Override // com.anythink.interstitial.api.ATInterstitialListener
        public final void onInterstitialAdVideoEnd(ATAdInfo aTAdInfo) {
            a.f35559e = null;
            a.d(this.f35570a);
            this.f35571b.a();
        }

        @Override // com.anythink.interstitial.api.ATInterstitialListener
        public final void onInterstitialAdVideoError(AdError adError) {
            a.f35559e = null;
            a.d(this.f35570a);
            this.f35571b.a();
        }

        @Override // com.anythink.interstitial.api.ATInterstitialListener
        public final void onInterstitialAdLoaded() {
        }

        @Override // com.anythink.interstitial.api.ATInterstitialListener
        public final void onInterstitialAdClicked(ATAdInfo aTAdInfo) {
        }

        @Override // com.anythink.interstitial.api.ATInterstitialListener
        public final void onInterstitialAdShow(ATAdInfo aTAdInfo) {
        }

        @Override // com.anythink.interstitial.api.ATInterstitialListener
        public final void onInterstitialAdVideoStart(ATAdInfo aTAdInfo) {
        }
    }

    /* compiled from: AdsManager.java */
    /* loaded from: classes2.dex */
    public class e extends AdListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h9.b f35575a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f35576b;

        public e(Activity activity, h9.b bVar) {
            this.f35575a = bVar;
            this.f35576b = activity;
        }

        @Override // com.huawei.hms.ads.AdListener
        public final void onAdClosed() {
            this.f35575a.a();
            a.b(this.f35576b);
        }

        @Override // com.huawei.hms.ads.AdListener
        public final void onAdFailed(int i10) {
            this.f35575a.a();
            a.b(this.f35576b);
        }

        @Override // com.huawei.hms.ads.AdListener
        public final void onAdClicked() {
        }

        @Override // com.huawei.hms.ads.AdListener
        public final void onAdImpression() {
        }

        @Override // com.huawei.hms.ads.AdListener
        public final void onAdLeave() {
        }

        @Override // com.huawei.hms.ads.AdListener
        public final void onAdLoaded() {
        }

        @Override // com.huawei.hms.ads.AdListener
        public final void onAdOpened() {
        }
    }

    /* compiled from: AdsManager.java */
    /* renamed from: t8.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0488a implements MaxAdViewAdListener {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ h9.b f35568s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Activity f35569t;

        /* compiled from: AdsManager.java */
        /* renamed from: t8.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0489a implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                a.f35557c.loadAd();
            }
        }

        public C0488a(Activity activity, h9.b bVar) {
            this.f35568s = bVar;
            this.f35569t = activity;
        }

        @Override // com.applovin.mediation.MaxAdListener
        public final void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            a.c(this.f35569t);
            a.h(this.f35568s);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public final void onAdHidden(MaxAd maxAd) {
            this.f35568s.a();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public final void onAdLoadFailed(String str, MaxError maxError) {
            a.f35558d++;
            new Handler().postDelayed(new RunnableC0489a(), TimeUnit.SECONDS.toMillis((long) Math.pow(2.0d, Math.min(6, a.f35558d))));
        }

        @Override // com.applovin.mediation.MaxAdListener
        public final void onAdLoaded(MaxAd maxAd) {
            a.f35558d = 0;
        }

        @Override // com.applovin.mediation.MaxAdListener
        public final void onAdClicked(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public final void onAdCollapsed(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public final void onAdDisplayed(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public final void onAdExpanded(MaxAd maxAd) {
        }
    }
}
