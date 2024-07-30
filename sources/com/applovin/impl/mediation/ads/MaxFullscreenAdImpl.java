package com.applovin.impl.mediation.ads;

import a3.k;
import a3.l;
import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.d;
import com.applovin.impl.sdk.b;
import com.applovin.impl.sdk.d;
import com.applovin.impl.sdk.g;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.p;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class MaxFullscreenAdImpl extends com.applovin.impl.mediation.ads.a implements b.a, d.a, g.a {

    /* renamed from: a, reason: collision with root package name */
    private final a f17603a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.b f17604b;

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.mediation.b f17605c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f17606d;

    /* renamed from: e, reason: collision with root package name */
    private com.applovin.impl.mediation.a.c f17607e;
    private c f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f17608g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f17609h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f17610i;

    /* renamed from: j, reason: collision with root package name */
    private WeakReference<Activity> f17611j;

    /* renamed from: k, reason: collision with root package name */
    private WeakReference<ViewGroup> f17612k;

    /* renamed from: l, reason: collision with root package name */
    private WeakReference<i> f17613l;
    protected final b listenerWrapper;

    /* renamed from: m, reason: collision with root package name */
    private final AtomicBoolean f17614m;

    /* renamed from: n, reason: collision with root package name */
    private p f17615n;

    /* loaded from: classes.dex */
    public interface a {
        Activity getActivity();
    }

    /* loaded from: classes.dex */
    public class b implements a.InterfaceC0201a, MaxAdListener, MaxAdRevenueListener, MaxRewardedAdListener {
        private b() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            y yVar = MaxFullscreenAdImpl.this.logger;
            if (y.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                y yVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdClicked(ad=");
                sb2.append(maxAd);
                sb2.append("), listener=");
                k.u(sb2, MaxFullscreenAdImpl.this.adListener, yVar2, str);
            }
            com.applovin.impl.sdk.utils.k.d(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(final MaxAd maxAd, final MaxError maxError) {
            final boolean z10 = MaxFullscreenAdImpl.this.f17610i;
            MaxFullscreenAdImpl.this.f17610i = false;
            final com.applovin.impl.mediation.a.c cVar = (com.applovin.impl.mediation.a.c) maxAd;
            MaxFullscreenAdImpl.this.a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b.4
                @Override // java.lang.Runnable
                public void run() {
                    MaxFullscreenAdImpl.this.a(maxAd);
                    if (!z10 && cVar.I() && MaxFullscreenAdImpl.this.sdk.au().a(MaxFullscreenAdImpl.this.adUnitId)) {
                        AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b.4.1
                            @Override // java.lang.Runnable
                            public void run() {
                                Activity activity;
                                MaxFullscreenAdImpl.this.f17610i = true;
                                if (MaxFullscreenAdImpl.this.f17603a != null) {
                                    activity = MaxFullscreenAdImpl.this.f17603a.getActivity();
                                } else {
                                    activity = null;
                                }
                                MaxFullscreenAdImpl.this.loadAd(activity);
                            }
                        });
                        return;
                    }
                    y yVar = MaxFullscreenAdImpl.this.logger;
                    if (y.a()) {
                        MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                        y yVar2 = maxFullscreenAdImpl.logger;
                        String str = maxFullscreenAdImpl.tag;
                        StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                        sb2.append(maxAd);
                        sb2.append(", error=");
                        sb2.append(maxError);
                        sb2.append("), listener=");
                        k.u(sb2, MaxFullscreenAdImpl.this.adListener, yVar2, str);
                    }
                    com.applovin.impl.sdk.utils.k.a(MaxFullscreenAdImpl.this.adListener, maxAd, maxError, true);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            MaxFullscreenAdImpl.this.f17610i = false;
            if (MaxFullscreenAdImpl.this.sdk.V() != null) {
                MaxFullscreenAdImpl.this.sdk.V().a((com.applovin.impl.mediation.a.c) maxAd);
            } else {
                MaxFullscreenAdImpl.this.f17604b.a();
            }
            y yVar = MaxFullscreenAdImpl.this.logger;
            if (y.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                y yVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayed(ad=");
                sb2.append(maxAd);
                sb2.append("), listener=");
                k.u(sb2, MaxFullscreenAdImpl.this.adListener, yVar2, str);
            }
            com.applovin.impl.sdk.utils.k.b(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(final MaxAd maxAd) {
            MaxFullscreenAdImpl.this.f17610i = false;
            MaxFullscreenAdImpl.this.f17605c.a(maxAd);
            MaxFullscreenAdImpl.this.a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b.3
                @Override // java.lang.Runnable
                public void run() {
                    MaxFullscreenAdImpl.this.a(maxAd);
                    y yVar = MaxFullscreenAdImpl.this.logger;
                    if (y.a()) {
                        MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                        y yVar2 = maxFullscreenAdImpl.logger;
                        String str = maxFullscreenAdImpl.tag;
                        StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdHidden(ad=");
                        sb2.append(maxAd);
                        sb2.append("), listener=");
                        k.u(sb2, MaxFullscreenAdImpl.this.adListener, yVar2, str);
                    }
                    com.applovin.impl.sdk.utils.k.c(MaxFullscreenAdImpl.this.adListener, maxAd, true);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(final String str, final MaxError maxError) {
            MaxFullscreenAdImpl.this.f();
            MaxFullscreenAdImpl.this.a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b.2
                @Override // java.lang.Runnable
                public void run() {
                    y yVar = MaxFullscreenAdImpl.this.logger;
                    if (y.a()) {
                        MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                        y yVar2 = maxFullscreenAdImpl.logger;
                        String str2 = maxFullscreenAdImpl.tag;
                        StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdLoadFailed(adUnitId=");
                        sb2.append(str);
                        sb2.append(", error=");
                        sb2.append(maxError);
                        sb2.append("), listener=");
                        k.u(sb2, MaxFullscreenAdImpl.this.adListener, yVar2, str2);
                    }
                    com.applovin.impl.sdk.utils.k.a(MaxFullscreenAdImpl.this.adListener, str, maxError, true);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(final MaxAd maxAd) {
            MaxFullscreenAdImpl.this.sdk.Z().c(MaxFullscreenAdImpl.this.adUnitId);
            MaxFullscreenAdImpl.this.a((com.applovin.impl.mediation.a.c) maxAd);
            if (!MaxFullscreenAdImpl.this.f17608g.compareAndSet(true, false)) {
                MaxFullscreenAdImpl.this.a(c.READY, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (MaxFullscreenAdImpl.this.f17610i) {
                            MaxFullscreenAdImpl.this.b();
                            return;
                        }
                        y yVar = MaxFullscreenAdImpl.this.logger;
                        if (y.a()) {
                            MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                            y yVar2 = maxFullscreenAdImpl.logger;
                            String str = maxFullscreenAdImpl.tag;
                            StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdLoaded(ad=");
                            sb2.append(maxAd);
                            sb2.append("), listener=");
                            k.u(sb2, MaxFullscreenAdImpl.this.adListener, yVar2, str);
                        }
                        com.applovin.impl.sdk.utils.k.a(MaxFullscreenAdImpl.this.adListener, maxAd, true);
                        if (MaxFullscreenAdImpl.this.f17614m.compareAndSet(true, false)) {
                            MaxFullscreenAdImpl.this.e();
                            MaxFullscreenAdImpl.this.sdk.au().c(MaxFullscreenAdImpl.this.adUnitId);
                            MaxFullscreenAdImpl.this.b();
                        }
                    }
                });
            } else {
                MaxFullscreenAdImpl.this.extraParameters.remove("expired_ad_ad_unit_id");
            }
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
            y yVar = MaxFullscreenAdImpl.this.logger;
            if (y.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                y yVar2 = maxFullscreenAdImpl.logger;
                String str2 = maxFullscreenAdImpl.tag;
                StringBuilder s10 = l.s("MaxAdRequestListener.onAdRequestStarted(adUnitId=", str, "), listener=");
                s10.append(MaxFullscreenAdImpl.this.requestListener);
                yVar2.b(str2, s10.toString());
            }
            com.applovin.impl.sdk.utils.k.a(MaxFullscreenAdImpl.this.requestListener, str, true);
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            y yVar = MaxFullscreenAdImpl.this.logger;
            if (y.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.b(maxFullscreenAdImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.revenueListener);
            }
            com.applovin.impl.sdk.utils.k.a(MaxFullscreenAdImpl.this.revenueListener, maxAd);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onRewardedVideoCompleted(MaxAd maxAd) {
            y yVar = MaxFullscreenAdImpl.this.logger;
            if (y.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                y yVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                StringBuilder sb2 = new StringBuilder("MaxRewardedAdListener.onRewardedVideoCompleted(ad=");
                sb2.append(maxAd);
                sb2.append("), listener=");
                k.u(sb2, MaxFullscreenAdImpl.this.adListener, yVar2, str);
            }
            com.applovin.impl.sdk.utils.k.f(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onRewardedVideoStarted(MaxAd maxAd) {
            y yVar = MaxFullscreenAdImpl.this.logger;
            if (y.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                y yVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                StringBuilder sb2 = new StringBuilder("MaxRewardedAdListener.onRewardedVideoStarted(ad=");
                sb2.append(maxAd);
                sb2.append("), listener=");
                k.u(sb2, MaxFullscreenAdImpl.this.adListener, yVar2, str);
            }
            com.applovin.impl.sdk.utils.k.e(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            y yVar = MaxFullscreenAdImpl.this.logger;
            if (y.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                y yVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                StringBuilder sb2 = new StringBuilder("MaxRewardedAdListener.onUserRewarded(ad=");
                sb2.append(maxAd);
                sb2.append(", reward=");
                sb2.append(maxReward);
                sb2.append("), listener=");
                k.u(sb2, MaxFullscreenAdImpl.this.adListener, yVar2, str);
            }
            com.applovin.impl.sdk.utils.k.a(MaxFullscreenAdImpl.this.adListener, maxAd, maxReward, true);
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        IDLE,
        LOADING,
        READY,
        SHOWING,
        DESTROYED
    }

    public MaxFullscreenAdImpl(String str, MaxAdFormat maxAdFormat, a aVar, String str2, com.applovin.impl.sdk.p pVar) {
        super(str, maxAdFormat, str2, pVar);
        this.f17606d = new Object();
        this.f17607e = null;
        this.f = c.IDLE;
        this.f17608g = new AtomicBoolean();
        this.f17611j = new WeakReference<>(null);
        this.f17612k = new WeakReference<>(null);
        this.f17613l = new WeakReference<>(null);
        this.f17614m = new AtomicBoolean();
        this.f17603a = aVar;
        b bVar = new b();
        this.listenerWrapper = bVar;
        this.f17605c = new com.applovin.impl.mediation.b(pVar, bVar);
        if (pVar.V() != null) {
            this.f17604b = null;
        } else {
            this.f17604b = new com.applovin.impl.sdk.b(pVar, this);
        }
        pVar.am().a(this);
        y.f(str2, "Created new " + str2 + " (" + this + ")");
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        a(c.DESTROYED, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (MaxFullscreenAdImpl.this.f17606d) {
                    if (MaxFullscreenAdImpl.this.f17607e != null) {
                        y yVar = MaxFullscreenAdImpl.this.logger;
                        if (y.a()) {
                            MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                            maxFullscreenAdImpl.logger.b(maxFullscreenAdImpl.tag, "Destroying ad for '" + MaxFullscreenAdImpl.this.adUnitId + "'; current ad: " + MaxFullscreenAdImpl.this.f17607e + "...");
                        }
                        MaxFullscreenAdImpl.this.sdk.ap().destroyAd(MaxFullscreenAdImpl.this.f17607e);
                    }
                }
                MaxFullscreenAdImpl.this.sdk.am().b(MaxFullscreenAdImpl.this);
                MaxFullscreenAdImpl.super.destroy();
            }
        });
    }

    public boolean isReady() {
        synchronized (this.f17606d) {
            boolean z10 = true;
            if (a()) {
                return true;
            }
            this.sdk.Z().a(this.adUnitId);
            if (!((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.W)).booleanValue() || this.f != c.LOADING) {
                z10 = false;
            }
            return z10;
        }
    }

    public void loadAd(Activity activity) {
        loadAd(activity, d.a.PUBLISHER_INITIATED);
    }

    @Override // com.applovin.impl.sdk.d.a
    public void onAdExpired(com.applovin.impl.sdk.ad.g gVar) {
        onAdExpired();
    }

    @Override // com.applovin.impl.sdk.g.a
    public void onCreativeIdGenerated(String str, String str2) {
        com.applovin.impl.mediation.a.c cVar = this.f17607e;
        if (cVar != null && cVar.g().equalsIgnoreCase(str)) {
            this.f17607e.b(str2);
            com.applovin.impl.sdk.utils.k.a(this.adReviewListener, str2, this.f17607e);
        }
    }

    public void showAd(final String str, final String str2, final Activity activity) {
        String c10 = this.sdk.av().c();
        if (this.sdk.av().b() && c10 != null && !c10.equals(this.f17607e.X())) {
            final String str3 = "Attempting to show ad from <" + this.f17607e.X() + "> which does not match selected ad network <" + c10 + ">";
            y.i(this.tag, str3);
            a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.3
                @Override // java.lang.Runnable
                public void run() {
                    com.applovin.impl.mediation.a.c cVar = MaxFullscreenAdImpl.this.f17607e;
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.a((MaxAd) maxFullscreenAdImpl.f17607e);
                    MaxErrorImpl maxErrorImpl = new MaxErrorImpl(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str3);
                    y yVar = MaxFullscreenAdImpl.this.logger;
                    if (y.a()) {
                        MaxFullscreenAdImpl maxFullscreenAdImpl2 = MaxFullscreenAdImpl.this;
                        y yVar2 = maxFullscreenAdImpl2.logger;
                        String str4 = maxFullscreenAdImpl2.tag;
                        StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                        sb2.append(cVar);
                        sb2.append(", error=");
                        sb2.append(maxErrorImpl);
                        sb2.append("), listener=");
                        k.u(sb2, MaxFullscreenAdImpl.this.adListener, yVar2, str4);
                    }
                    com.applovin.impl.sdk.utils.k.a(MaxFullscreenAdImpl.this.adListener, (MaxAd) cVar, (MaxError) maxErrorImpl, true);
                }
            });
            return;
        }
        if (activity == null) {
            activity = this.sdk.x();
        }
        if (a(activity)) {
            a(c.SHOWING, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.4
                @Override // java.lang.Runnable
                public void run() {
                    MaxFullscreenAdImpl.this.a(str, str2);
                    MaxFullscreenAdImpl.this.f17609h = false;
                    MaxFullscreenAdImpl.this.f17611j = new WeakReference(activity);
                    MaxFullscreenAdImpl.this.sdk.ap().showFullscreenAd(MaxFullscreenAdImpl.this.f17607e, activity, MaxFullscreenAdImpl.this.listenerWrapper);
                }
            });
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.tag);
        sb2.append("{adUnitId='");
        sb2.append(this.adUnitId);
        sb2.append("', adListener=");
        Object obj = this.adListener;
        if (obj == this.f17603a) {
            obj = "this";
        }
        sb2.append(obj);
        sb2.append(", revenueListener=");
        sb2.append(this.revenueListener);
        sb2.append(", requestListener");
        sb2.append(this.requestListener);
        sb2.append(", adReviewListener");
        sb2.append(this.adReviewListener);
        sb2.append(", isReady=");
        sb2.append(isReady());
        sb2.append('}');
        return sb2.toString();
    }

    private void d() {
        e();
        this.f17615n = p.a(((Long) this.sdk.a(com.applovin.impl.sdk.c.a.Z)).longValue(), this.sdk, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.7
            @Override // java.lang.Runnable
            public void run() {
                if (MaxFullscreenAdImpl.this.f17614m.compareAndSet(true, false)) {
                    MaxFullscreenAdImpl.this.sdk.au().c(MaxFullscreenAdImpl.this.adUnitId);
                    y.i(MaxFullscreenAdImpl.this.tag, "Failed to show an ad. Failed to load an ad in time to show.");
                    MaxFullscreenAdImpl.this.sdk.Z().a(MaxFullscreenAdImpl.this.adUnitId);
                    MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-24, "Failed to show an ad. Failed to load an ad in time to show.");
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    com.applovin.impl.sdk.utils.k.a(MaxFullscreenAdImpl.this.adListener, (MaxAd) new com.applovin.impl.mediation.i(maxFullscreenAdImpl.adUnitId, maxFullscreenAdImpl.adFormat), (MaxError) maxErrorImpl, true);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        p pVar = this.f17615n;
        if (pVar == null) {
            return;
        }
        pVar.d();
        this.f17615n = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        com.applovin.impl.mediation.a.c cVar;
        if (this.f17608g.compareAndSet(true, false)) {
            synchronized (this.f17606d) {
                cVar = this.f17607e;
                this.f17607e = null;
            }
            this.sdk.ap().destroyAd(cVar);
            this.extraParameters.remove("expired_ad_ad_unit_id");
        }
    }

    public void loadAd(final Activity activity, final d.a aVar) {
        if (y.a()) {
            this.logger.b(this.tag, "Loading ad for '" + this.adUnitId + "'...");
        }
        if (isReady()) {
            if (y.a()) {
                this.logger.b(this.tag, "An ad is already loaded for '" + this.adUnitId + "'");
            }
            if (y.a()) {
                y yVar = this.logger;
                String str = this.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdLoaded(ad=");
                sb2.append(this.f17607e);
                sb2.append("), listener=");
                k.u(sb2, this.adListener, yVar, str);
            }
            com.applovin.impl.sdk.utils.k.a(this.adListener, (MaxAd) this.f17607e, true);
            return;
        }
        a(c.LOADING, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.2
            @Override // java.lang.Runnable
            public void run() {
                Context context = activity;
                if (context == null) {
                    if (MaxFullscreenAdImpl.this.sdk.x() != null) {
                        context = MaxFullscreenAdImpl.this.sdk.x();
                    } else {
                        com.applovin.impl.sdk.p pVar = MaxFullscreenAdImpl.this.sdk;
                        context = com.applovin.impl.sdk.p.y();
                    }
                }
                Context context2 = context;
                MediationServiceImpl ap = MaxFullscreenAdImpl.this.sdk.ap();
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                ap.loadAd(maxFullscreenAdImpl.adUnitId, null, maxFullscreenAdImpl.adFormat, aVar, maxFullscreenAdImpl.localExtraParameters, maxFullscreenAdImpl.extraParameters, context2, maxFullscreenAdImpl.listenerWrapper);
            }
        });
    }

    @Override // com.applovin.impl.sdk.b.a
    public void onAdExpired() {
        if (y.a()) {
            this.logger.b(this.tag, "Ad expired " + getAdUnitId());
        }
        this.f17608g.set(true);
        a aVar = this.f17603a;
        Activity activity = aVar != null ? aVar.getActivity() : this.sdk.w().a();
        if (activity == null) {
            f();
            this.listenerWrapper.onAdLoadFailed(this.adUnitId, MaxAdapterError.MISSING_ACTIVITY);
        } else {
            this.extraParameters.put("expired_ad_ad_unit_id", getAdUnitId());
            this.sdk.ap().loadAd(this.adUnitId, null, this.adFormat, d.a.EXPIRED, this.localExtraParameters, this.extraParameters, activity, this.listenerWrapper);
        }
    }

    private void c() {
        com.applovin.impl.mediation.a.c cVar;
        synchronized (this.f17606d) {
            cVar = this.f17607e;
            this.f17607e = null;
        }
        this.sdk.ap().destroyAd(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Activity activity = this.f17611j.get();
        if (activity == null) {
            activity = this.sdk.x();
        }
        Activity activity2 = activity;
        if (this.f17609h) {
            showAd(this.f17607e.getPlacement(), this.f17607e.al(), this.f17612k.get(), this.f17613l.get(), activity2);
        } else {
            showAd(this.f17607e.getPlacement(), this.f17607e.al(), activity2);
        }
    }

    private boolean a() {
        boolean z10;
        synchronized (this.f17606d) {
            com.applovin.impl.mediation.a.c cVar = this.f17607e;
            z10 = cVar != null && cVar.f() && this.f == c.READY;
        }
        return z10;
    }

    public void showAd(final String str, final String str2, final ViewGroup viewGroup, final i iVar, Activity activity) {
        if (viewGroup != null && iVar != null) {
            if (!viewGroup.isShown() && ((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.T)).booleanValue()) {
                y.i(this.tag, "Attempting to show ad when containerView and/or its ancestors are not visible");
                com.applovin.impl.sdk.utils.k.a(this.adListener, (MaxAd) this.f17607e, (MaxError) new MaxErrorImpl(-1, "Attempting to show ad when containerView and/or its ancestors are not visible"), true);
                return;
            }
            String c10 = this.sdk.av().c();
            if (this.sdk.av().b() && c10 != null && !c10.equals(this.f17607e.X())) {
                final String str3 = "Attempting to show ad from <" + this.f17607e.X() + "> which does not match selected ad network <" + c10 + ">";
                y.i(this.tag, str3);
                a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.5
                    @Override // java.lang.Runnable
                    public void run() {
                        com.applovin.impl.mediation.a.c cVar = MaxFullscreenAdImpl.this.f17607e;
                        MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                        maxFullscreenAdImpl.a((MaxAd) maxFullscreenAdImpl.f17607e);
                        MaxErrorImpl maxErrorImpl = new MaxErrorImpl(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str3);
                        y yVar = MaxFullscreenAdImpl.this.logger;
                        if (y.a()) {
                            MaxFullscreenAdImpl maxFullscreenAdImpl2 = MaxFullscreenAdImpl.this;
                            y yVar2 = maxFullscreenAdImpl2.logger;
                            String str4 = maxFullscreenAdImpl2.tag;
                            StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                            sb2.append(cVar);
                            sb2.append(", error=");
                            sb2.append(maxErrorImpl);
                            sb2.append("), listener=");
                            k.u(sb2, MaxFullscreenAdImpl.this.adListener, yVar2, str4);
                        }
                        com.applovin.impl.sdk.utils.k.a(MaxFullscreenAdImpl.this.adListener, (MaxAd) cVar, (MaxError) maxErrorImpl, true);
                    }
                });
                return;
            }
            if (activity == null) {
                activity = this.sdk.x();
            }
            final Activity activity2 = activity;
            if (a(activity2)) {
                a(c.SHOWING, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.6
                    @Override // java.lang.Runnable
                    public void run() {
                        MaxFullscreenAdImpl.this.a(str, str2);
                        MaxFullscreenAdImpl.this.f17609h = true;
                        MaxFullscreenAdImpl.this.f17611j = new WeakReference(activity2);
                        MaxFullscreenAdImpl.this.f17612k = new WeakReference(viewGroup);
                        MaxFullscreenAdImpl.this.f17613l = new WeakReference(iVar);
                        MaxFullscreenAdImpl.this.sdk.ap().showFullscreenAd(MaxFullscreenAdImpl.this.f17607e, viewGroup, iVar, activity2, MaxFullscreenAdImpl.this.listenerWrapper);
                    }
                });
                return;
            }
            return;
        }
        y.i(this.tag, "Attempting to show ad with null containerView or lifecycle.");
        MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-1, "Attempting to show ad with null containerView or lifecycle.");
        if (y.a()) {
            y yVar = this.logger;
            String str4 = this.tag;
            StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
            sb2.append(this.f17607e);
            sb2.append(", error=");
            sb2.append(maxErrorImpl);
            sb2.append("), listener=");
            k.u(sb2, this.adListener, yVar, str4);
        }
        com.applovin.impl.sdk.utils.k.a(this.adListener, (MaxAd) this.f17607e, (MaxError) maxErrorImpl, true);
    }

    private boolean a(Activity activity) {
        if (activity == null && MaxAdFormat.APP_OPEN != this.adFormat) {
            throw new IllegalArgumentException("Attempting to show ad without a valid activity.");
        }
        if (!a()) {
            if (isReady()) {
                if (this.f17614m.compareAndSet(false, true)) {
                    this.sdk.au().b(this.adUnitId);
                    d();
                }
                return false;
            }
            String p10 = l.p(new StringBuilder("Attempting to show ad before it is ready - please check ad readiness using "), this.tag, "#isReady()");
            y.i(this.tag, p10);
            this.sdk.Z().a(this.adUnitId);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-24, p10);
            com.applovin.impl.mediation.i iVar = new com.applovin.impl.mediation.i(this.adUnitId, this.adFormat);
            if (y.a()) {
                y yVar = this.logger;
                String str = this.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                sb2.append(iVar);
                sb2.append(", error=");
                sb2.append(maxErrorImpl);
                sb2.append("), listener=");
                k.u(sb2, this.adListener, yVar, str);
            }
            com.applovin.impl.sdk.utils.k.a(this.adListener, (MaxAd) iVar, (MaxError) maxErrorImpl, true);
            return false;
        }
        if (Utils.getAlwaysFinishActivitiesSetting(com.applovin.impl.sdk.p.y()) != 0 && this.sdk.C().shouldFailAdDisplayIfDontKeepActivitiesIsEnabled()) {
            if (!Utils.isPubInDebugMode(com.applovin.impl.sdk.p.y(), this.sdk)) {
                if (((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.S)).booleanValue()) {
                    y.i(this.tag, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                    MaxErrorImpl maxErrorImpl2 = new MaxErrorImpl(-5602, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                    if (y.a()) {
                        y yVar2 = this.logger;
                        String str2 = this.tag;
                        StringBuilder sb3 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                        sb3.append(this.f17607e);
                        sb3.append(", error=");
                        sb3.append(maxErrorImpl2);
                        sb3.append("), listener=");
                        k.u(sb3, this.adListener, yVar2, str2);
                    }
                    com.applovin.impl.sdk.utils.k.a(this.adListener, (MaxAd) this.f17607e, (MaxError) maxErrorImpl2, true);
                    return false;
                }
            } else {
                throw new IllegalStateException("Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
            }
        }
        if (((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.f18703z)).booleanValue() && (this.sdk.Z().a() || this.sdk.Z().b())) {
            y.i(this.tag, "Attempting to show ad when another fullscreen ad is already showing");
            MaxErrorImpl maxErrorImpl3 = new MaxErrorImpl(-23, "Attempting to show ad when another fullscreen ad is already showing");
            if (y.a()) {
                y yVar3 = this.logger;
                String str3 = this.tag;
                StringBuilder sb4 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                sb4.append(this.f17607e);
                sb4.append(", error=");
                sb4.append(maxErrorImpl3);
                sb4.append("), listener=");
                k.u(sb4, this.adListener, yVar3, str3);
            }
            com.applovin.impl.sdk.utils.k.a(this.adListener, (MaxAd) this.f17607e, (MaxError) maxErrorImpl3, true);
            return false;
        }
        if (((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.A)).booleanValue() && !com.applovin.impl.sdk.utils.i.a(com.applovin.impl.sdk.p.y())) {
            y.i(this.tag, "Attempting to show ad with no internet connection");
            MaxErrorImpl maxErrorImpl4 = new MaxErrorImpl(-1009);
            if (y.a()) {
                y yVar4 = this.logger;
                String str4 = this.tag;
                StringBuilder sb5 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                sb5.append(this.f17607e);
                sb5.append(", error=");
                sb5.append(maxErrorImpl4);
                sb5.append("), listener=");
                k.u(sb5, this.adListener, yVar4, str4);
            }
            com.applovin.impl.sdk.utils.k.a(this.adListener, (MaxAd) this.f17607e, (MaxError) maxErrorImpl4, true);
            return false;
        }
        String str5 = this.sdk.C().getExtraParameters().get(AppLovinSdkExtraParameterKey.BLOCK_FULLSCREEN_ADS_SHOWING_IF_ACTIVITY_FINISHING);
        if ((!(StringUtils.isValidString(str5) && Boolean.valueOf(str5).booleanValue()) && !((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.B)).booleanValue()) || activity == null || !activity.isFinishing()) {
            return true;
        }
        y.i(this.tag, "Attempting to show ad when activity is finishing");
        MaxErrorImpl maxErrorImpl5 = new MaxErrorImpl(-5601, "Attempting to show ad when activity is finishing");
        if (y.a()) {
            y yVar5 = this.logger;
            String str6 = this.tag;
            StringBuilder sb6 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
            sb6.append(this.f17607e);
            sb6.append(", error=");
            sb6.append(maxErrorImpl5);
            sb6.append("), listener=");
            k.u(sb6, this.adListener, yVar5, str6);
        }
        com.applovin.impl.sdk.utils.k.a(this.adListener, (MaxAd) this.f17607e, (MaxError) maxErrorImpl5, true);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) {
        this.f17605c.b(this.f17607e);
        this.f17607e.e(str);
        this.f17607e.f(str2);
        this.sdk.af().a(this.f17607e);
        if (y.a()) {
            this.logger.b(this.tag, "Showing ad for '" + this.adUnitId + "'; loaded ad: " + this.f17607e + "...");
        }
        a((com.applovin.impl.mediation.a.a) this.f17607e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.c cVar) {
        boolean a10;
        if (this.sdk.V() != null) {
            a10 = this.sdk.V().a(cVar, this);
        } else {
            a10 = this.f17604b.a(cVar);
        }
        if (a10) {
            if (y.a()) {
                this.logger.b(this.tag, "Handle ad loaded for regular ad: " + cVar);
            }
            this.f17607e = cVar;
            return;
        }
        if (y.a()) {
            this.logger.b(this.tag, "Loaded an expired ad, running expire logic...");
        }
        onAdExpired(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0158 A[Catch: all -> 0x01af, TryCatch #0 {, blocks: (B:4:0x0013, B:6:0x0019, B:10:0x0158, B:12:0x015e, B:13:0x0180, B:14:0x01a6, B:23:0x0183, B:25:0x0189, B:26:0x001f, B:29:0x0025, B:31:0x0029, B:33:0x0031, B:35:0x0037, B:36:0x004b, B:41:0x0055, B:42:0x005f, B:45:0x0065, B:47:0x0069, B:48:0x0071, B:51:0x0077, B:53:0x007d, B:54:0x0091, B:59:0x009b, B:61:0x00a5, B:63:0x00ab, B:64:0x00b5, B:67:0x00bb, B:70:0x00c1, B:72:0x00c7, B:73:0x00db, B:78:0x00e5, B:80:0x00f0, B:82:0x00f6, B:84:0x0103, B:85:0x010c, B:88:0x0111, B:90:0x0117, B:91:0x012c, B:93:0x0130, B:94:0x0139, B:96:0x013f), top: B:3:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0183 A[Catch: all -> 0x01af, TryCatch #0 {, blocks: (B:4:0x0013, B:6:0x0019, B:10:0x0158, B:12:0x015e, B:13:0x0180, B:14:0x01a6, B:23:0x0183, B:25:0x0189, B:26:0x001f, B:29:0x0025, B:31:0x0029, B:33:0x0031, B:35:0x0037, B:36:0x004b, B:41:0x0055, B:42:0x005f, B:45:0x0065, B:47:0x0069, B:48:0x0071, B:51:0x0077, B:53:0x007d, B:54:0x0091, B:59:0x009b, B:61:0x00a5, B:63:0x00ab, B:64:0x00b5, B:67:0x00bb, B:70:0x00c1, B:72:0x00c7, B:73:0x00db, B:78:0x00e5, B:80:0x00f0, B:82:0x00f6, B:84:0x0103, B:85:0x010c, B:88:0x0111, B:90:0x0117, B:91:0x012c, B:93:0x0130, B:94:0x0139, B:96:0x013f), top: B:3:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.c r13, java.lang.Runnable r14) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.a(com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c, java.lang.Runnable):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxAd maxAd) {
        if (this.sdk.V() != null) {
            this.sdk.V().a((com.applovin.impl.mediation.a.c) maxAd);
        } else {
            this.f17604b.a();
        }
        c();
        this.sdk.at().b((com.applovin.impl.mediation.a.a) maxAd);
    }
}
