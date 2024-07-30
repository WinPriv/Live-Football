package com.applovin.impl.mediation.ads;

import a3.k;
import a3.l;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.d;
import com.applovin.impl.sdk.ac;
import com.applovin.impl.sdk.ad;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.f;
import com.applovin.impl.sdk.g;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.r;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class MaxAdViewImpl extends com.applovin.impl.mediation.ads.a implements ad.a, f.a, g.a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f17569a;

    /* renamed from: b, reason: collision with root package name */
    private final MaxAdView f17570b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17571c;

    /* renamed from: d, reason: collision with root package name */
    private final View f17572d;

    /* renamed from: e, reason: collision with root package name */
    private long f17573e;
    private com.applovin.impl.mediation.a.b f;

    /* renamed from: g, reason: collision with root package name */
    private String f17574g;

    /* renamed from: h, reason: collision with root package name */
    private String f17575h;

    /* renamed from: i, reason: collision with root package name */
    private final a f17576i;

    /* renamed from: j, reason: collision with root package name */
    private final c f17577j;

    /* renamed from: k, reason: collision with root package name */
    private final f f17578k;

    /* renamed from: l, reason: collision with root package name */
    private final ac f17579l;

    /* renamed from: m, reason: collision with root package name */
    private final ad f17580m;

    /* renamed from: n, reason: collision with root package name */
    private final Object f17581n;
    private com.applovin.impl.mediation.a.b o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f17582p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f17583q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f17584r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f17585s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f17586t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f17587u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f17588v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f17589w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f17590x;
    private boolean y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f17591z;

    /* loaded from: classes.dex */
    public class a extends b {
        private a() {
            super();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            y yVar = MaxAdViewImpl.this.logger;
            if (y.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                y yVar2 = maxAdViewImpl.logger;
                String str2 = maxAdViewImpl.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdLoadFailed(adUnitId=");
                sb2.append(str);
                sb2.append(", error=");
                sb2.append(maxError);
                sb2.append("), listener=");
                k.u(sb2, MaxAdViewImpl.this.adListener, yVar2, str2);
            }
            com.applovin.impl.sdk.utils.k.a(MaxAdViewImpl.this.adListener, str, maxError, true);
            MaxAdViewImpl.this.a(maxError);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (MaxAdViewImpl.this.f17586t) {
                y yVar = MaxAdViewImpl.this.logger;
                if (y.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.b(maxAdViewImpl.tag, "Precache ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
                }
                MaxAdViewImpl.this.sdk.ap().destroyAd(maxAd);
                return;
            }
            com.applovin.impl.mediation.a.b bVar = (com.applovin.impl.mediation.a.b) maxAd;
            bVar.e(MaxAdViewImpl.this.f17574g);
            bVar.f(MaxAdViewImpl.this.f17575h);
            if (bVar.q() != null) {
                MaxAdViewImpl.this.a(bVar);
                if (bVar.F()) {
                    long G = bVar.G();
                    MaxAdViewImpl.this.sdk.L();
                    if (y.a()) {
                        y L = MaxAdViewImpl.this.sdk.L();
                        String str = MaxAdViewImpl.this.tag;
                        StringBuilder k10 = com.ironsource.adapters.facebook.a.k("Scheduling banner ad refresh ", G, " milliseconds from now for '");
                        k10.append(MaxAdViewImpl.this.adUnitId);
                        k10.append("'...");
                        L.b(str, k10.toString());
                    }
                    MaxAdViewImpl.this.f17578k.a(G);
                    if (MaxAdViewImpl.this.f17578k.f() || MaxAdViewImpl.this.f17583q) {
                        y yVar2 = MaxAdViewImpl.this.logger;
                        if (y.a()) {
                            MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                            maxAdViewImpl2.logger.b(maxAdViewImpl2.tag, "Pausing ad refresh for publisher");
                        }
                        MaxAdViewImpl.this.f17578k.d();
                    }
                }
                y yVar3 = MaxAdViewImpl.this.logger;
                if (y.a()) {
                    MaxAdViewImpl maxAdViewImpl3 = MaxAdViewImpl.this;
                    y yVar4 = maxAdViewImpl3.logger;
                    String str2 = maxAdViewImpl3.tag;
                    StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdLoaded(ad=");
                    sb2.append(maxAd);
                    sb2.append("), listener=");
                    k.u(sb2, MaxAdViewImpl.this.adListener, yVar4, str2);
                }
                com.applovin.impl.sdk.utils.k.a(MaxAdViewImpl.this.adListener, maxAd, true);
                return;
            }
            MaxAdViewImpl.this.sdk.ap().destroyAd(bVar);
            onAdLoadFailed(bVar.getAdUnitId(), new MaxErrorImpl(-5001, "Ad view not fully loaded"));
        }
    }

    /* loaded from: classes.dex */
    public abstract class b implements a.InterfaceC0201a, MaxAdListener, MaxAdRevenueListener, MaxAdViewAdListener {

        /* renamed from: a, reason: collision with root package name */
        private boolean f17600a;

        private b() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.o)) {
                y yVar = MaxAdViewImpl.this.logger;
                if (y.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    y yVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdClicked(ad=");
                    sb2.append(maxAd);
                    sb2.append("), listener=");
                    k.u(sb2, MaxAdViewImpl.this.adListener, yVar2, str);
                }
                com.applovin.impl.sdk.utils.k.d(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdCollapsed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.o)) {
                if ((MaxAdViewImpl.this.o.H() || MaxAdViewImpl.this.f17590x) && this.f17600a) {
                    this.f17600a = false;
                    MaxAdViewImpl.this.startAutoRefresh();
                }
                y yVar = MaxAdViewImpl.this.logger;
                if (y.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    y yVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb2 = new StringBuilder("MaxAdViewAdListener.onAdCollapsed(ad=");
                    sb2.append(maxAd);
                    sb2.append("), listener=");
                    k.u(sb2, MaxAdViewImpl.this.adListener, yVar2, str);
                }
                com.applovin.impl.sdk.utils.k.h(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            if (maxAd.equals(MaxAdViewImpl.this.o)) {
                y yVar = MaxAdViewImpl.this.logger;
                if (y.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    y yVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                    sb2.append(maxAd);
                    sb2.append(", error=");
                    sb2.append(maxError);
                    sb2.append("), listener=");
                    k.u(sb2, MaxAdViewImpl.this.adListener, yVar2, str);
                }
                com.applovin.impl.sdk.utils.k.a(MaxAdViewImpl.this.adListener, maxAd, maxError, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.o)) {
                y yVar = MaxAdViewImpl.this.logger;
                if (y.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    y yVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayed(ad=");
                    sb2.append(maxAd);
                    sb2.append("), listener=");
                    k.u(sb2, MaxAdViewImpl.this.adListener, yVar2, str);
                }
                com.applovin.impl.sdk.utils.k.b(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdExpanded(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.o)) {
                if ((MaxAdViewImpl.this.o.H() || MaxAdViewImpl.this.f17590x) && !MaxAdViewImpl.this.f17578k.f()) {
                    this.f17600a = true;
                    MaxAdViewImpl.this.stopAutoRefresh();
                }
                y yVar = MaxAdViewImpl.this.logger;
                if (y.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    y yVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb2 = new StringBuilder("MaxAdViewAdListener.onAdExpanded(ad=");
                    sb2.append(maxAd);
                    sb2.append("), listener=");
                    k.u(sb2, MaxAdViewImpl.this.adListener, yVar2, str);
                }
                com.applovin.impl.sdk.utils.k.g(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.o)) {
                y yVar = MaxAdViewImpl.this.logger;
                if (y.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    y yVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdHidden(ad=");
                    sb2.append(maxAd);
                    sb2.append("), listener=");
                    k.u(sb2, MaxAdViewImpl.this.adListener, yVar2, str);
                }
                com.applovin.impl.sdk.utils.k.c(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
            y yVar = MaxAdViewImpl.this.logger;
            if (y.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                y yVar2 = maxAdViewImpl.logger;
                String str2 = maxAdViewImpl.tag;
                StringBuilder s10 = l.s("MaxAdRequestListener.onAdRequestStarted(adUnitId=", str, "), listener=");
                s10.append(MaxAdViewImpl.this.requestListener);
                yVar2.b(str2, s10.toString());
            }
            com.applovin.impl.sdk.utils.k.a(MaxAdViewImpl.this.requestListener, str, true);
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            y yVar = MaxAdViewImpl.this.logger;
            if (y.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.b(maxAdViewImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.revenueListener);
            }
            com.applovin.impl.sdk.utils.k.a(MaxAdViewImpl.this.revenueListener, maxAd, true);
        }
    }

    /* loaded from: classes.dex */
    public class c extends b {
        private c() {
            super();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            y yVar = MaxAdViewImpl.this.logger;
            if (y.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.b(maxAdViewImpl.tag, "Failed to precache ad for refresh with error code: " + maxError.getCode());
            }
            MaxAdViewImpl.this.a(maxError);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (MaxAdViewImpl.this.f17586t) {
                y yVar = MaxAdViewImpl.this.logger;
                if (y.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.b(maxAdViewImpl.tag, "Ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
                }
                MaxAdViewImpl.this.sdk.ap().destroyAd(maxAd);
                return;
            }
            y yVar2 = MaxAdViewImpl.this.logger;
            if (y.a()) {
                MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                maxAdViewImpl2.logger.b(maxAdViewImpl2.tag, "Successfully pre-cached ad for refresh");
            }
            MaxAdViewImpl.this.a(maxAd);
        }
    }

    public MaxAdViewImpl(String str, MaxAdFormat maxAdFormat, MaxAdView maxAdView, View view, p pVar, Context context) {
        super(str, maxAdFormat, "MaxAdView", pVar);
        this.f17571c = UUID.randomUUID().toString().toLowerCase(Locale.US);
        this.f17573e = Long.MAX_VALUE;
        this.f17581n = new Object();
        this.o = null;
        this.f17586t = false;
        if (context != null) {
            this.f17569a = context.getApplicationContext();
            this.f17570b = maxAdView;
            this.f17572d = view;
            this.f17576i = new a();
            this.f17577j = new c();
            this.f17578k = new f(pVar, this);
            this.f17579l = new ac(maxAdView, pVar);
            this.f17580m = new ad(maxAdView, pVar, this);
            pVar.am().a(this);
            if (y.a()) {
                this.logger.b(this.tag, "Created new MaxAdView (" + this + ")");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("No context specified");
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        a();
        if (this.f != null) {
            this.sdk.ap().destroyAd(this.f);
        }
        synchronized (this.f17581n) {
            this.f17586t = true;
        }
        this.f17578k.c();
        this.sdk.am().b(this);
        this.sdk.au().a(this.adUnitId, this.f17571c);
        super.destroy();
    }

    public MaxAdFormat getAdFormat() {
        return this.adFormat;
    }

    public String getPlacement() {
        return this.f17574g;
    }

    public void loadAd() {
        loadAd(d.a.PUBLISHER_INITIATED);
    }

    @Override // com.applovin.impl.sdk.f.a
    public void onAdRefresh() {
        this.f17584r = false;
        if (this.f != null) {
            c();
            return;
        }
        if (d()) {
            if (this.f17582p) {
                if (y.a()) {
                    this.logger.b(this.tag, "Refreshing ad from network due to viewability requirements not met for refresh request...");
                }
                loadAd(d.a.REFRESH);
                return;
            } else {
                if (y.a()) {
                    this.logger.e(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
                }
                this.f17584r = true;
                return;
            }
        }
        if (y.a()) {
            this.logger.b(this.tag, "Refreshing ad from network...");
        }
        loadAd(d.a.REFRESH);
    }

    @Override // com.applovin.impl.sdk.g.a
    public void onCreativeIdGenerated(String str, String str2) {
        com.applovin.impl.mediation.a.b bVar = this.o;
        if (bVar != null && bVar.g().equalsIgnoreCase(str)) {
            this.o.b(str2);
            com.applovin.impl.sdk.utils.k.a(this.adReviewListener, str2, this.o);
            return;
        }
        com.applovin.impl.mediation.a.b bVar2 = this.f;
        if (bVar2 != null && bVar2.g().equalsIgnoreCase(str)) {
            this.f.b(str2);
        }
    }

    @Override // com.applovin.impl.sdk.ad.a
    public void onLogVisibilityImpression() {
        a(this.o, this.f17579l.a(this.o));
    }

    public void onWindowVisibilityChanged(int i10) {
        if (((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.f18696r)).booleanValue() && this.f17578k.a()) {
            if (r.a(i10)) {
                if (y.a()) {
                    this.logger.b(this.tag, "Ad view visible");
                }
                this.f17578k.h();
            } else {
                if (y.a()) {
                    this.logger.b(this.tag, "Ad view hidden");
                }
                this.f17578k.g();
            }
        }
    }

    public void setCustomData(String str) {
        if (this.o != null) {
            y.i(this.tag, "Custom data for Ad Unit ID (" + this.adUnitId + ") was set after load was called. For the ads to be correctly attributed to this custom data, please set the custom data before loading the " + this.adFormat.getLabel() + ".");
        }
        Utils.maybeLogCustomDataSizeLimit(str, this.tag);
        this.f17575h = str;
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void setExtraParameter(String str, String str2) {
        super.setExtraParameter(str, str2);
        a(str, str2);
    }

    public void setPlacement(String str) {
        if (this.o != null) {
            y.i(this.tag, "Placement for Ad Unit ID (" + this.adUnitId + ") was set after load was called. For the ads to be correctly attributed to this placement, please set the placement before loading the " + this.adFormat.getLabel() + ".");
        }
        this.f17574g = str;
    }

    public void setPublisherBackgroundColor(int i10) {
        this.f17573e = i10;
    }

    public void startAutoRefresh() {
        this.f17583q = false;
        if (this.f17578k.f()) {
            this.f17578k.e();
            if (y.a()) {
                this.logger.b(this.tag, "Resumed auto-refresh with remaining time: " + this.f17578k.b() + "ms");
                return;
            }
            return;
        }
        if (y.a()) {
            this.logger.b(this.tag, "Ignoring call to startAutoRefresh() - ad refresh is not paused");
        }
    }

    public void stopAutoRefresh() {
        if (this.o != null) {
            if (y.a()) {
                this.logger.b(this.tag, "Pausing auto-refresh with remaining time: " + this.f17578k.b() + "ms");
            }
            this.f17578k.d();
            return;
        }
        if (!this.f17587u && !((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.f18698t)).booleanValue()) {
            y.h(this.tag, "Stopping auto-refresh has no effect until after the first ad has been loaded.");
        } else {
            this.f17583q = true;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MaxAdView{adUnitId='");
        sb2.append(this.adUnitId);
        sb2.append("', adListener=");
        Object obj = this.adListener;
        if (obj == this.f17570b) {
            obj = "this";
        }
        sb2.append(obj);
        sb2.append(", isDestroyed=");
        sb2.append(e());
        sb2.append('}');
        return sb2.toString();
    }

    private boolean d() {
        if (this.f17589w) {
            return false;
        }
        return ((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.y)).booleanValue();
    }

    private boolean e() {
        boolean z10;
        synchronized (this.f17581n) {
            z10 = this.f17586t;
        }
        return z10;
    }

    public void loadAd(d.a aVar) {
        if (y.a()) {
            this.logger.b(this.tag, "" + this + " Loading ad for " + this.adUnitId + "...");
        }
        boolean z10 = this.f17587u || ((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.f18698t)).booleanValue();
        if (z10 && !this.f17578k.f() && this.f17578k.a()) {
            y.i(this.tag, "Unable to load a new ad. An ad refresh has already been scheduled in " + TimeUnit.MILLISECONDS.toSeconds(this.f17578k.b()) + " seconds.");
            return;
        }
        if (z10) {
            if (this.f != null) {
                if (y.a()) {
                    this.logger.b(this.tag, "Rendering cached ad");
                }
                c();
                return;
            } else if (this.f17585s) {
                if (y.a()) {
                    this.logger.b(this.tag, "Waiting for precache ad to load to render");
                }
                this.f17584r = true;
                return;
            } else {
                if (y.a()) {
                    this.logger.b(this.tag, "Loading ad...");
                }
                a(aVar, this.f17576i);
                return;
            }
        }
        if (y.a()) {
            this.logger.b(this.tag, "Loading ad...");
        }
        a(aVar, this.f17576i);
    }

    private void b() {
        if (d()) {
            if (y.a()) {
                this.logger.b(this.tag, "Scheduling refresh precache request now");
            }
            this.f17585s = true;
            this.sdk.M().a(new z(this.sdk, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl.3
                @Override // java.lang.Runnable
                public void run() {
                    y yVar = MaxAdViewImpl.this.logger;
                    if (y.a()) {
                        MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                        maxAdViewImpl.logger.b(maxAdViewImpl.tag, "Loading ad for pre-cache request...");
                    }
                    MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                    maxAdViewImpl2.a(d.a.SEQUENTIAL_OR_PRECACHE, maxAdViewImpl2.f17577j);
                }
            }), com.applovin.impl.mediation.d.c.a(this.adFormat));
        }
    }

    private void c() {
        if (y.a()) {
            this.logger.b(this.tag, "Rendering for cached ad: " + this.f + "...");
        }
        this.f17576i.onAdLoaded(this.f);
        this.f = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final d.a aVar, final a.InterfaceC0201a interfaceC0201a) {
        if (e()) {
            y.i(this.tag, "Failed to load new ad - this instance is already destroyed");
        } else {
            AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl.1
                @Override // java.lang.Runnable
                public void run() {
                    boolean z10;
                    if (MaxAdViewImpl.this.o != null) {
                        long a10 = MaxAdViewImpl.this.f17579l.a(MaxAdViewImpl.this.o);
                        MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                        maxAdViewImpl.extraParameters.put("visible_ad_ad_unit_id", maxAdViewImpl.o.getAdUnitId());
                        MaxAdViewImpl.this.extraParameters.put("viewability_flags", Long.valueOf(a10));
                    } else {
                        MaxAdViewImpl.this.extraParameters.remove("visible_ad_ad_unit_id");
                        MaxAdViewImpl.this.extraParameters.remove("viewability_flags");
                    }
                    int pxToDp = AppLovinSdkUtils.pxToDp(MaxAdViewImpl.this.f17570b.getContext(), MaxAdViewImpl.this.f17570b.getWidth());
                    int pxToDp2 = AppLovinSdkUtils.pxToDp(MaxAdViewImpl.this.f17570b.getContext(), MaxAdViewImpl.this.f17570b.getHeight());
                    MaxAdViewImpl.this.extraParameters.put("viewport_width", Integer.valueOf(pxToDp));
                    MaxAdViewImpl.this.extraParameters.put("viewport_height", Integer.valueOf(pxToDp2));
                    MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                    Map<String, Object> map = maxAdViewImpl2.extraParameters;
                    if (!maxAdViewImpl2.f17578k.f() && !MaxAdViewImpl.this.f17583q) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    map.put("auto_refresh_stopped", Boolean.valueOf(z10));
                    MaxAdViewImpl maxAdViewImpl3 = MaxAdViewImpl.this;
                    maxAdViewImpl3.extraParameters.put("auto_retries_disabled", Boolean.valueOf(maxAdViewImpl3.f17588v));
                    y yVar = MaxAdViewImpl.this.logger;
                    if (y.a()) {
                        MaxAdViewImpl maxAdViewImpl4 = MaxAdViewImpl.this;
                        maxAdViewImpl4.logger.b(maxAdViewImpl4.tag, "Loading " + MaxAdViewImpl.this.adFormat.getLabel().toLowerCase(Locale.ENGLISH) + " ad for '" + MaxAdViewImpl.this.adUnitId + "' and notifying " + interfaceC0201a + "...");
                    }
                    MediationServiceImpl ap = MaxAdViewImpl.this.sdk.ap();
                    MaxAdViewImpl maxAdViewImpl5 = MaxAdViewImpl.this;
                    String str = maxAdViewImpl5.adUnitId;
                    String str2 = maxAdViewImpl5.f17571c;
                    MaxAdViewImpl maxAdViewImpl6 = MaxAdViewImpl.this;
                    ap.loadAd(str, str2, maxAdViewImpl6.adFormat, aVar, maxAdViewImpl6.localExtraParameters, maxAdViewImpl6.extraParameters, maxAdViewImpl6.f17569a, interfaceC0201a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.applovin.impl.mediation.a.b bVar) {
        int height = this.f17570b.getHeight();
        int width = this.f17570b.getWidth();
        if (height > 0 || width > 0) {
            int pxToDp = AppLovinSdkUtils.pxToDp(this.f17569a, height);
            int pxToDp2 = AppLovinSdkUtils.pxToDp(this.f17569a, width);
            MaxAdFormat format = bVar.getFormat();
            int height2 = (this.f17591z ? format.getAdaptiveSize(pxToDp2, this.f17569a) : format.getSize()).getHeight();
            int width2 = format.getSize().getWidth();
            if (pxToDp < height2 || pxToDp2 < width2) {
                StringBuilder r10 = l.r("\n**************************************************\n`MaxAdView` size ", pxToDp2, "x", pxToDp, " dp smaller than required ");
                r10.append(this.f17591z ? "adaptive " : "");
                r10.append("size: ");
                r10.append(width2);
                r10.append("x");
                String i10 = com.ironsource.adapters.facebook.a.i(r10, height2, " dp\nSome mediated networks (e.g. Google Ad Manager) may not render correctly\n**************************************************\n");
                if (y.a()) {
                    this.logger.e("AppLovinSdk", i10);
                }
            }
        }
    }

    private void a(String str, String str2) {
        if (AppLovinSdkExtraParameterKey.ALLOW_IMMEDIATE_AUTO_REFRESH_PAUSE.equalsIgnoreCase(str)) {
            if (y.a()) {
                k.t("Updated allow immediate auto-refresh pause and ad load to: ", str2, this.logger, this.tag);
            }
            this.f17587u = Boolean.parseBoolean(str2);
            return;
        }
        if (AppLovinSdkExtraParameterKey.DISABLE_AUTO_RETRIES.equalsIgnoreCase(str)) {
            if (y.a()) {
                k.t("Updated disable auto-retries to: ", str2, this.logger, this.tag);
            }
            this.f17588v = Boolean.parseBoolean(str2);
            return;
        }
        if (AppLovinSdkExtraParameterKey.DISABLE_PRECACHE.equalsIgnoreCase(str)) {
            if (y.a()) {
                k.t("Updated precached disabled to: ", str2, this.logger, this.tag);
            }
            this.f17589w = Boolean.parseBoolean(str2);
            return;
        }
        if (AppLovinSdkExtraParameterKey.DISABLE_AUTO_REFRESH_ON_AD_EXPAND.equals(str)) {
            if (y.a()) {
                k.t("Updated should stop auto-refresh on ad expand to: ", str2, this.logger, this.tag);
            }
            this.f17590x = Boolean.parseBoolean(str2);
        } else if (AppLovinSdkExtraParameterKey.FORCE_PRECACHE.equals(str)) {
            if (y.a()) {
                k.t("Updated force precache to: ", str2, this.logger, this.tag);
            }
            this.y = Boolean.parseBoolean(str2);
        } else if (AppLovinSdkExtraParameterKey.IS_ADAPTIVE_BANNER.equalsIgnoreCase(str)) {
            if (y.a()) {
                k.t("Updated is adaptive banner to: ", str2, this.logger, this.tag);
            }
            this.f17591z = Boolean.parseBoolean(str2);
            setLocalExtraParameter(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        com.applovin.impl.mediation.a.b bVar;
        MaxAdView maxAdView = this.f17570b;
        if (maxAdView != null) {
            com.applovin.impl.sdk.utils.c.a(maxAdView, this.f17572d);
        }
        this.f17580m.a();
        synchronized (this.f17581n) {
            bVar = this.o;
        }
        if (bVar != null) {
            this.sdk.ap().destroyAd(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final com.applovin.impl.mediation.a.b bVar) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl.2
            @Override // java.lang.Runnable
            public void run() {
                String str;
                View q10 = bVar.q();
                if (q10 == null) {
                    str = "MaxAdView does not have a loaded ad view";
                } else {
                    str = null;
                }
                MaxAdView maxAdView = MaxAdViewImpl.this.f17570b;
                if (maxAdView == null) {
                    str = "MaxAdView does not have a parent view";
                }
                if (str == null) {
                    MaxAdViewImpl.this.a();
                    MaxAdViewImpl.this.a((com.applovin.impl.mediation.a.a) bVar);
                    if (bVar.S()) {
                        MaxAdViewImpl.this.f17580m.a(bVar);
                    }
                    maxAdView.setDescendantFocusability(393216);
                    if (bVar.I() != Long.MAX_VALUE) {
                        MaxAdViewImpl.this.f17572d.setBackgroundColor((int) bVar.I());
                    } else if (MaxAdViewImpl.this.f17573e != Long.MAX_VALUE) {
                        MaxAdViewImpl.this.f17572d.setBackgroundColor((int) MaxAdViewImpl.this.f17573e);
                    } else {
                        MaxAdViewImpl.this.f17572d.setBackgroundColor(0);
                    }
                    maxAdView.addView(q10);
                    MaxAdViewImpl.this.a(q10, bVar);
                    MaxAdViewImpl.this.sdk.af().a(bVar);
                    MaxAdViewImpl.this.b(bVar);
                    synchronized (MaxAdViewImpl.this.f17581n) {
                        MaxAdViewImpl.this.o = bVar;
                    }
                    y yVar = MaxAdViewImpl.this.logger;
                    if (y.a()) {
                        MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                        maxAdViewImpl.logger.b(maxAdViewImpl.tag, "Scheduling impression for ad manually...");
                    }
                    MaxAdViewImpl.this.sdk.ap().processRawAdImpressionPostback(bVar, MaxAdViewImpl.this.f17576i);
                    if (StringUtils.isValidString(MaxAdViewImpl.this.o.getAdReviewCreativeId())) {
                        MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                        com.applovin.impl.sdk.utils.k.a(maxAdViewImpl2.adReviewListener, maxAdViewImpl2.o.getAdReviewCreativeId(), (MaxAd) MaxAdViewImpl.this.o, true);
                    }
                    AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            long a10 = MaxAdViewImpl.this.f17579l.a(bVar);
                            if (!bVar.S()) {
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                MaxAdViewImpl.this.a(bVar, a10);
                            }
                            MaxAdViewImpl.this.a(a10);
                        }
                    }, bVar.E());
                    return;
                }
                y yVar2 = MaxAdViewImpl.this.logger;
                if (y.a()) {
                    MaxAdViewImpl maxAdViewImpl3 = MaxAdViewImpl.this;
                    maxAdViewImpl3.logger.e(maxAdViewImpl3.tag, str);
                }
                MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-1, str);
                y yVar3 = MaxAdViewImpl.this.logger;
                if (y.a()) {
                    MaxAdViewImpl maxAdViewImpl4 = MaxAdViewImpl.this;
                    y yVar4 = maxAdViewImpl4.logger;
                    String str2 = maxAdViewImpl4.tag;
                    StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                    sb2.append(bVar);
                    sb2.append(", error=");
                    sb2.append(maxErrorImpl);
                    sb2.append("), listener=");
                    k.u(sb2, MaxAdViewImpl.this.adListener, yVar4, str2);
                }
                com.applovin.impl.sdk.utils.k.a(MaxAdViewImpl.this.adListener, bVar, maxErrorImpl);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxError maxError) {
        if (this.sdk.b(com.applovin.impl.sdk.c.a.f18693n).contains(String.valueOf(maxError.getCode()))) {
            this.sdk.L();
            if (y.a()) {
                this.sdk.L().b(this.tag, "Ignoring banner ad refresh for error code " + maxError.getCode());
                return;
            }
            return;
        }
        if (!this.f17583q && !this.f17578k.f()) {
            this.f17582p = true;
            this.f17585s = false;
            long longValue = ((Long) this.sdk.a(com.applovin.impl.sdk.c.a.f18692m)).longValue();
            if (longValue >= 0) {
                this.sdk.L();
                if (y.a()) {
                    y L = this.sdk.L();
                    String str = this.tag;
                    StringBuilder k10 = com.ironsource.adapters.facebook.a.k("Scheduling failed banner ad refresh ", longValue, " milliseconds from now for '");
                    k10.append(this.adUnitId);
                    k10.append("'...");
                    L.b(str, k10.toString());
                }
                this.f17578k.a(longValue);
                return;
            }
            return;
        }
        if (this.f17585s) {
            if (y.a()) {
                this.logger.b(this.tag, "Refresh pre-cache failed when auto-refresh is stopped");
            }
            this.f17585s = false;
        }
        if (this.f17584r) {
            if (y.a()) {
                y yVar = this.logger;
                String str2 = this.tag;
                StringBuilder sb2 = new StringBuilder("Refresh pre-cache failed - MaxAdListener.onAdLoadFailed(adUnitId=");
                sb2.append(this.adUnitId);
                sb2.append(", error=");
                sb2.append(maxError);
                sb2.append("), listener=");
                k.u(sb2, this.adListener, yVar, str2);
            }
            com.applovin.impl.sdk.utils.k.a(this.adListener, this.adUnitId, maxError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, com.applovin.impl.mediation.a.b bVar) {
        int C = bVar.C();
        int D = bVar.D();
        int dpToPx = C == -1 ? -1 : AppLovinSdkUtils.dpToPx(view.getContext(), C);
        int dpToPx2 = D != -1 ? AppLovinSdkUtils.dpToPx(view.getContext(), D) : -1;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(dpToPx, dpToPx2);
        } else {
            layoutParams.width = dpToPx;
            layoutParams.height = dpToPx2;
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            if (y.a()) {
                this.logger.b(this.tag, "Pinning ad view to MAX ad view with width: " + dpToPx + " and height: " + dpToPx2 + ".");
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            for (int i10 : r.a(this.f17570b.getGravity(), 10, 14)) {
                layoutParams2.addRule(i10);
            }
        }
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.b bVar, long j10) {
        if (y.a()) {
            this.logger.b(this.tag, "Scheduling viewability impression for ad...");
        }
        this.sdk.ap().processViewabilityAdImpressionPostback(bVar, j10, this.f17576i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j10) {
        if (Utils.bitMaskContainsFlag(j10, ((Long) this.sdk.a(com.applovin.impl.sdk.c.a.f18702x)).longValue()) && !this.y) {
            if (y.a()) {
                this.logger.b(this.tag, "Undesired flags matched - current: " + Long.toBinaryString(j10) + ", undesired: " + Long.toBinaryString(j10));
            }
            if (y.a()) {
                this.logger.b(this.tag, "Waiting for refresh timer to manually fire request");
            }
            this.f17582p = true;
            return;
        }
        if (y.a()) {
            this.logger.b(this.tag, "No undesired viewability flags matched or forcing pre-cache - scheduling viewability");
        }
        this.f17582p = false;
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxAd maxAd) {
        this.f17585s = false;
        if (this.f17584r) {
            this.f17584r = false;
            if (y.a()) {
                this.logger.b(this.tag, "Rendering precache request ad: " + maxAd.getAdUnitId() + "...");
            }
            this.f17576i.onAdLoaded(maxAd);
            return;
        }
        if (y.a()) {
            this.logger.b(this.tag, "Saving pre-cache ad...");
        }
        com.applovin.impl.mediation.a.b bVar = (com.applovin.impl.mediation.a.b) maxAd;
        this.f = bVar;
        bVar.e(this.f17574g);
        this.f.f(this.f17575h);
    }
}
