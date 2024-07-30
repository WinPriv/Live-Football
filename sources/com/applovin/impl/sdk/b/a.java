package com.applovin.impl.sdk.b;

import a3.l;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.ad.f;
import com.applovin.impl.sdk.ad.h;
import com.applovin.impl.sdk.e.aa;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.v;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.k;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    protected final p f18641b;

    /* renamed from: c, reason: collision with root package name */
    protected final AppLovinAdServiceImpl f18642c;

    /* renamed from: d, reason: collision with root package name */
    private AppLovinAd f18643d;

    /* renamed from: e, reason: collision with root package name */
    private String f18644e;
    private SoftReference<AppLovinAdLoadListener> f;

    /* renamed from: h, reason: collision with root package name */
    private volatile String f18646h;

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, Object> f18640a = Collections.synchronizedMap(CollectionUtils.map());

    /* renamed from: g, reason: collision with root package name */
    private final Object f18645g = new Object();

    /* renamed from: i, reason: collision with root package name */
    private volatile boolean f18647i = false;

    /* renamed from: com.applovin.impl.sdk.b.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0216a implements AppLovinAdLoadListener {

        /* renamed from: b, reason: collision with root package name */
        private final AppLovinAdLoadListener f18650b;

        public C0216a(AppLovinAdLoadListener appLovinAdLoadListener) {
            this.f18650b = appLovinAdLoadListener;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(final AppLovinAd appLovinAd) {
            a.this.f18643d = appLovinAd;
            if (this.f18650b != null) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.b.a.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            C0216a.this.f18650b.adReceived(appLovinAd);
                        } catch (Throwable th) {
                            y.c("AppLovinIncentivizedInterstitial", "Unable to notify ad listener about a newly loaded ad", th);
                        }
                    }
                });
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(final int i10) {
            if (this.f18650b != null) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.b.a.a.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            C0216a.this.f18650b.failedToReceiveAd(i10);
                        } catch (Throwable th) {
                            y.c("AppLovinIncentivizedInterstitial", "Unable to notify listener about ad load failure", th);
                        }
                    }
                });
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements h, AppLovinAdClickListener, AppLovinAdRewardListener, AppLovinAdVideoPlaybackListener {

        /* renamed from: b, reason: collision with root package name */
        private final AppLovinAdDisplayListener f18656b;

        /* renamed from: c, reason: collision with root package name */
        private final AppLovinAdClickListener f18657c;

        /* renamed from: d, reason: collision with root package name */
        private final AppLovinAdVideoPlaybackListener f18658d;

        /* renamed from: e, reason: collision with root package name */
        private final AppLovinAdRewardListener f18659e;

        private void a(e eVar) {
            String str;
            int i10;
            String d10 = a.this.d();
            if (!StringUtils.isValidString(d10) || !a.this.f18647i) {
                a.this.f18641b.L();
                if (y.a()) {
                    y L = a.this.f18641b.L();
                    StringBuilder s10 = l.s("Invalid reward state - result: ", d10, " and wasFullyEngaged: ");
                    s10.append(a.this.f18647i);
                    L.e("IncentivizedAdController", s10.toString());
                }
                a.this.f18641b.L();
                if (y.a()) {
                    a.this.f18641b.L().b("IncentivizedAdController", "Cancelling any incoming reward requests for this ad");
                }
                eVar.aH();
                if (a.this.f18647i) {
                    a.this.f18641b.L();
                    if (y.a()) {
                        a.this.f18641b.L().e("IncentivizedAdController", "User close the ad after fully watching but reward validation task did not return on time");
                    }
                    str = "network_timeout";
                    i10 = AppLovinErrorCodes.INCENTIVIZED_SERVER_TIMEOUT;
                } else {
                    a.this.f18641b.L();
                    if (y.a()) {
                        a.this.f18641b.L().e("IncentivizedAdController", "User close the ad prematurely");
                    }
                    str = "user_closed_video";
                    i10 = AppLovinErrorCodes.INCENTIVIZED_USER_CLOSED_VIDEO;
                }
                eVar.a(c.a(str));
                a.this.f18641b.L();
                if (y.a()) {
                    a.this.f18641b.L().b("IncentivizedAdController", "Notifying listener of reward validation failure");
                }
                k.a(this.f18659e, eVar, i10);
            }
            a.this.a(eVar);
            a.this.f18641b.L();
            if (y.a()) {
                a.this.f18641b.L().b("IncentivizedAdController", "Notifying listener of rewarded ad dismissal");
            }
            k.b(this.f18656b, eVar);
            if (!eVar.ag().getAndSet(true)) {
                a.this.f18641b.L();
                if (y.a()) {
                    a.this.f18641b.L().b("IncentivizedAdController", "Scheduling report rewarded ad...");
                }
                a.this.f18641b.M().a(new v(eVar, a.this.f18641b), o.a.REWARD);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            k.a(this.f18657c, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            k.a(this.f18656b, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            if (appLovinAd instanceof f) {
                appLovinAd = ((f) appLovinAd).a();
            }
            if (appLovinAd instanceof e) {
                a((e) appLovinAd);
                return;
            }
            a.this.f18641b.L();
            if (y.a()) {
                a.this.f18641b.L().e("IncentivizedAdController", "Something is terribly wrong. Received `adHidden` callback for invalid ad of type: " + appLovinAd);
            }
        }

        @Override // com.applovin.impl.sdk.ad.h
        public void onAdDisplayFailed(String str) {
            k.a(this.f18656b, str);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userOverQuota(AppLovinAd appLovinAd, Map<String, String> map) {
            a.this.a("quota_exceeded");
            k.b(this.f18659e, appLovinAd, map);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardRejected(AppLovinAd appLovinAd, Map<String, String> map) {
            a.this.a("rejected");
            k.c(this.f18659e, appLovinAd, map);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardVerified(AppLovinAd appLovinAd, Map<String, String> map) {
            a.this.a("accepted");
            k.a(this.f18659e, appLovinAd, map);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void validationRequestFailed(AppLovinAd appLovinAd, int i10) {
            a.this.a("network_timeout");
            k.a(this.f18659e, appLovinAd, i10);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            k.a(this.f18658d, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d10, boolean z10) {
            k.a(this.f18658d, appLovinAd, d10, z10);
            a.this.f18647i = z10;
        }

        private b(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
            this.f18656b = appLovinAdDisplayListener;
            this.f18657c = appLovinAdClickListener;
            this.f18658d = appLovinAdVideoPlaybackListener;
            this.f18659e = appLovinAdRewardListener;
        }
    }

    public a(String str, AppLovinSdk appLovinSdk) {
        this.f18641b = appLovinSdk.coreSdk;
        this.f18642c = (AppLovinAdServiceImpl) appLovinSdk.getAdService();
        this.f18644e = str;
    }

    private void c() {
        AppLovinAdLoadListener appLovinAdLoadListener;
        SoftReference<AppLovinAdLoadListener> softReference = this.f;
        if (softReference != null && (appLovinAdLoadListener = softReference.get()) != null) {
            appLovinAdLoadListener.failedToReceiveAd(-300);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d() {
        String str;
        synchronized (this.f18645g) {
            str = this.f18646h;
        }
        return str;
    }

    private AppLovinAdRewardListener e() {
        return new AppLovinAdRewardListener() { // from class: com.applovin.impl.sdk.b.a.1
            @Override // com.applovin.sdk.AppLovinAdRewardListener
            public void userOverQuota(AppLovinAd appLovinAd, Map<String, String> map) {
                a.this.f18641b.L();
                if (y.a()) {
                    a.this.f18641b.L().e("IncentivizedAdController", "User over quota: " + map);
                }
            }

            @Override // com.applovin.sdk.AppLovinAdRewardListener
            public void userRewardRejected(AppLovinAd appLovinAd, Map<String, String> map) {
                a.this.f18641b.L();
                if (y.a()) {
                    a.this.f18641b.L().e("IncentivizedAdController", "Reward rejected: " + map);
                }
            }

            @Override // com.applovin.sdk.AppLovinAdRewardListener
            public void userRewardVerified(AppLovinAd appLovinAd, Map<String, String> map) {
                a.this.f18641b.L();
                if (y.a()) {
                    a.this.f18641b.L().b("IncentivizedAdController", "Reward validated: " + map);
                }
            }

            @Override // com.applovin.sdk.AppLovinAdRewardListener
            public void validationRequestFailed(AppLovinAd appLovinAd, int i10) {
                a.this.f18641b.L();
                if (y.a()) {
                    a.this.f18641b.L().e("IncentivizedAdController", "Reward validation failed: " + i10);
                }
            }
        };
    }

    private void b(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f18642c.loadNextIncentivizedAd(this.f18644e, appLovinAdLoadListener);
    }

    private void b(AppLovinAd appLovinAd, ViewGroup viewGroup, i iVar, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl;
        if (appLovinAd != null) {
            appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        } else {
            appLovinAdImpl = (AppLovinAdImpl) this.f18643d;
        }
        if (appLovinAdImpl != null) {
            a(appLovinAdImpl, viewGroup, iVar, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        } else {
            y.i("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
            c();
        }
    }

    public void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f18641b.L();
        if (y.a()) {
            this.f18641b.L().b("IncentivizedAdController", "User requested preload of incentivized ad...");
        }
        this.f = new SoftReference<>(appLovinAdLoadListener);
        if (a()) {
            y.i("IncentivizedAdController", "Attempted to call preloadAndNotify: while an ad was already loaded or currently being played. Do not call preloadAndNotify: again until the last ad has been closed (adHidden).");
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.adReceived(this.f18643d);
                return;
            }
            return;
        }
        b(new C0216a(appLovinAdLoadListener));
    }

    public String b() {
        return this.f18644e;
    }

    public boolean a() {
        return this.f18643d != null;
    }

    public void a(AppLovinAd appLovinAd, Context context, String str, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdRewardListener == null) {
            appLovinAdRewardListener = e();
        }
        a(appLovinAd, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    public void a(AppLovinAd appLovinAd, ViewGroup viewGroup, i iVar, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        b(appLovinAd, viewGroup, iVar, context, appLovinAdRewardListener == null ? e() : appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    private void a(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl;
        if (appLovinAd != null) {
            appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        } else {
            appLovinAdImpl = (AppLovinAdImpl) this.f18643d;
        }
        AppLovinAdImpl appLovinAdImpl2 = appLovinAdImpl;
        if (appLovinAdImpl2 != null) {
            a(appLovinAdImpl2, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        } else {
            y.i("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
            c();
        }
    }

    private void a(e eVar, AppLovinAdRewardListener appLovinAdRewardListener) {
        this.f18641b.M().a(new aa(eVar, appLovinAdRewardListener, this.f18641b), o.a.REWARD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.f18645g) {
            this.f18646h = str;
        }
    }

    public void a(String str, Object obj) {
        this.f18640a.put(str, obj);
    }

    private void a(AppLovinAdImpl appLovinAdImpl, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdImpl.getType() != AppLovinAdType.INCENTIVIZED && appLovinAdImpl.getType() != AppLovinAdType.AUTO_INCENTIVIZED) {
            this.f18641b.L();
            if (y.a()) {
                this.f18641b.L().e("IncentivizedAdController", "Failed to render an ad of type " + appLovinAdImpl.getType() + " in an Incentivized Ad interstitial.");
            }
            a(appLovinAdImpl, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener);
            return;
        }
        AppLovinAd maybeRetrieveNonDummyAd = Utils.maybeRetrieveNonDummyAd(appLovinAdImpl, this.f18641b);
        if (maybeRetrieveNonDummyAd == null) {
            a(appLovinAdImpl, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener);
            return;
        }
        AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(this.f18641b.K(), context);
        for (String str : this.f18640a.keySet()) {
            create.setExtraInfo(str, this.f18640a.get(str));
        }
        b bVar = new b(appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        create.setAdDisplayListener(bVar);
        create.setAdVideoPlaybackListener(bVar);
        create.setAdClickListener(bVar);
        create.showAndRender(maybeRetrieveNonDummyAd);
        if (maybeRetrieveNonDummyAd instanceof e) {
            a((e) maybeRetrieveNonDummyAd, bVar);
        }
    }

    private void a(AppLovinAdImpl appLovinAdImpl, ViewGroup viewGroup, i iVar, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdImpl.getType() != AppLovinAdType.INCENTIVIZED && appLovinAdImpl.getType() != AppLovinAdType.AUTO_INCENTIVIZED) {
            this.f18641b.L();
            if (y.a()) {
                this.f18641b.L().e("IncentivizedAdController", "Failed to render an ad of type " + appLovinAdImpl.getType() + " in an Incentivized Ad interstitial.");
            }
            a(appLovinAdImpl, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener);
            return;
        }
        AppLovinAd maybeRetrieveNonDummyAd = Utils.maybeRetrieveNonDummyAd(appLovinAdImpl, this.f18641b);
        if (maybeRetrieveNonDummyAd == null) {
            a(appLovinAdImpl, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener);
            return;
        }
        AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(this.f18641b.K(), context);
        for (String str : this.f18640a.keySet()) {
            create.setExtraInfo(str, this.f18640a.get(str));
        }
        b bVar = new b(appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        create.setAdDisplayListener(bVar);
        create.setAdVideoPlaybackListener(bVar);
        create.setAdClickListener(bVar);
        create.showAndRender(maybeRetrieveNonDummyAd, viewGroup, iVar);
        if (maybeRetrieveNonDummyAd instanceof e) {
            a((e) maybeRetrieveNonDummyAd, bVar);
        }
    }

    private void a(AppLovinAd appLovinAd, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f18641b.P().a(com.applovin.impl.sdk.d.f.f18817l);
        k.a(appLovinAdVideoPlaybackListener, appLovinAd, 0.0d, false);
        k.b(appLovinAdDisplayListener, appLovinAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppLovinAd appLovinAd) {
        AppLovinAd appLovinAd2 = this.f18643d;
        if (appLovinAd2 != null) {
            if (appLovinAd2 instanceof f) {
                if (appLovinAd == ((f) appLovinAd2).a()) {
                    this.f18643d = null;
                }
            } else if (appLovinAd == appLovinAd2) {
                this.f18643d = null;
            }
        }
    }
}
