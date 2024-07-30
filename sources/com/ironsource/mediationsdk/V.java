package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBidderInterface;
import com.ironsource.mediationsdk.b.b;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class V extends ac implements AdapterBidderInterface, b.a, BannerSmashListener {

    /* renamed from: h, reason: collision with root package name */
    public final com.ironsource.mediationsdk.utils.k f24990h;

    /* renamed from: i, reason: collision with root package name */
    public final com.ironsource.mediationsdk.b.b f24991i;

    /* renamed from: j, reason: collision with root package name */
    public a f24992j;

    /* renamed from: k, reason: collision with root package name */
    public final U f24993k;

    /* renamed from: l, reason: collision with root package name */
    public IronSourceBannerLayout f24994l;

    /* renamed from: m, reason: collision with root package name */
    public final String f24995m;

    /* renamed from: n, reason: collision with root package name */
    public final JSONObject f24996n;
    public final int o;

    /* renamed from: p, reason: collision with root package name */
    public final String f24997p;

    /* renamed from: q, reason: collision with root package name */
    public com.ironsource.mediationsdk.model.i f24998q;

    /* renamed from: r, reason: collision with root package name */
    public final Object f24999r;

    /* renamed from: s, reason: collision with root package name */
    public com.ironsource.mediationsdk.utils.f f25000s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f25001t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f25002u;

    /* renamed from: v, reason: collision with root package name */
    public JSONObject f25003v;

    /* loaded from: classes2.dex */
    public enum a {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        LOAD_FAILED,
        DESTROYED
    }

    public V(com.ironsource.mediationsdk.utils.k kVar, U u2, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, int i10, String str, JSONObject jSONObject, int i11, String str2, boolean z10) {
        super(new com.ironsource.mediationsdk.model.a(networkSettings, networkSettings.getBannerSettings(), IronSource.AD_UNIT.BANNER), abstractAdapter);
        this.f24999r = new Object();
        this.f24992j = a.NONE;
        this.f24990h = kVar;
        this.f24991i = new com.ironsource.mediationsdk.b.b(kVar.f());
        this.f24993k = u2;
        this.f = i10;
        this.f24995m = str;
        this.o = i11;
        this.f24997p = str2;
        this.f24996n = jSONObject;
        this.f25001t = z10;
        this.f25003v = null;
        this.f25098a.addBannerListener(this);
        if (g() || h()) {
            IronLog.INTERNAL.verbose("isBidder = " + g() + ", shouldEarlyInit = " + h());
            this.f25002u = true;
            e();
        }
    }

    public final void a() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(p());
        a(IronSourceConstants.BN_INSTANCE_DESTROY, null);
        b(a.DESTROYED);
        AbstractAdapter abstractAdapter = this.f25098a;
        if (abstractAdapter == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            abstractAdapter.destroyBanner(this.f25099b.f25630a.getBannerSettings());
        } catch (Exception e10) {
            IronLog.INTERNAL.error("Exception while trying to destroy banner from " + this.f25098a.getProviderName() + ", exception =  " + e10.getLocalizedMessage());
            e10.printStackTrace();
            a(IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_destroy)}, new Object[]{"reason", e10.getLocalizedMessage()}});
        }
    }

    public final void b(a aVar) {
        IronLog.INTERNAL.verbose(r() + "state = " + aVar.name());
        synchronized (this.f24999r) {
            this.f24992j = aVar;
        }
    }

    @Override // com.ironsource.mediationsdk.ac
    public final void c() {
        this.f24991i.c();
        super.c();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBidderInterface
    public final void collectBiddingData(JSONObject jSONObject, BiddingDataCallback biddingDataCallback) {
        a(IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN, null);
        this.f25098a.collectBannerBiddingData(this.f25101d, jSONObject, biddingDataCallback);
    }

    public final void e(IronSourceError ironSourceError) {
        boolean z10 = ironSourceError.getErrorCode() == 606;
        boolean z11 = this.f25001t;
        if (z10) {
            a(z11 ? IronSourceConstants.BN_INSTANCE_RELOAD_NO_FILL : IronSourceConstants.BN_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{"duration", Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.f25000s))}});
        } else {
            a(z11 ? IronSourceConstants.BN_INSTANCE_RELOAD_ERROR : IronSourceConstants.BN_INSTANCE_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.f25000s))}});
        }
        U u2 = this.f24993k;
        if (u2 != null) {
            u2.a(ironSourceError, this);
        }
    }

    public final boolean f(a aVar, a aVar2) {
        boolean z10;
        synchronized (this.f24999r) {
            if (this.f24992j == aVar) {
                IronLog.INTERNAL.verbose(r() + "set state from '" + this.f24992j + "' to '" + aVar2 + "'");
                this.f24992j = aVar2;
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBidderInterface
    public final Map<String, Object> getBiddingData(JSONObject jSONObject) {
        AbstractAdapter abstractAdapter;
        try {
            if (!g() || (abstractAdapter = this.f25098a) == null) {
                return null;
            }
            return abstractAdapter.getBannerBiddingData(this.f25101d, jSONObject);
        } catch (Throwable th) {
            IronLog.INTERNAL.error("Exception while trying to getBannerBiddingData from " + this.f25098a.getProviderName() + ", exception =  " + th.getLocalizedMessage());
            th.printStackTrace();
            a(IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 5001}, new Object[]{"reason", th.getLocalizedMessage()}});
            return null;
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdClicked() {
        IronLog.INTERNAL.verbose(p());
        a(IronSourceConstants.BN_INSTANCE_CLICK, null);
        U u2 = this.f24993k;
        if (u2 != null) {
            u2.a(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdLeftApplication() {
        IronLog.INTERNAL.verbose(p());
        a(IronSourceConstants.BN_INSTANCE_LEAVE_APP, null);
        U u2 = this.f24993k;
        if (u2 != null) {
            u2.d(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose(r() + "error = " + ironSourceError);
        this.f24991i.d();
        if (f(a.LOADING, a.LOAD_FAILED)) {
            e(ironSourceError);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        int i10;
        int i11;
        IronLog.INTERNAL.verbose(p());
        this.f24991i.d();
        boolean f = f(a.LOADING, a.LOADED);
        boolean z10 = this.f25001t;
        if (f) {
            if (z10) {
                i11 = IronSourceConstants.BN_INSTANCE_RELOAD_SUCCESS;
            } else {
                i11 = 3005;
            }
            a(i11, new Object[][]{new Object[]{"duration", Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.f25000s))}});
            U u2 = this.f24993k;
            if (u2 != null) {
                u2.a(this, view, layoutParams);
                return;
            }
            return;
        }
        if (z10) {
            i10 = IronSourceConstants.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS;
        } else {
            i10 = IronSourceConstants.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS;
        }
        a(i10, null);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdScreenDismissed() {
        IronLog.INTERNAL.verbose(p());
        a(IronSourceConstants.BN_INSTANCE_DISMISS_SCREEN, null);
        U u2 = this.f24993k;
        if (u2 != null) {
            u2.b(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdScreenPresented() {
        IronLog.INTERNAL.verbose(p());
        a(IronSourceConstants.BN_INSTANCE_PRESENT_SCREEN, null);
        U u2 = this.f24993k;
        if (u2 != null) {
            u2.c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdShown() {
        boolean z10;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(p());
        synchronized (this.f24999r) {
            if (this.f24992j == a.LOADED) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (z10) {
            a(IronSourceConstants.BN_INSTANCE_SHOW, null);
            U u2 = this.f24993k;
            if (u2 != null) {
                u2.e(this);
                return;
            }
            return;
        }
        ironLog.warning("wrong state - mState = " + this.f24992j);
        a(IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1}, new Object[]{"reason", "Wrong State - " + this.f24992j}, new Object[]{IronSourceConstants.EVENTS_EXT1, k()}});
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(r() + "error = " + ironSourceError);
        this.f24991i.d();
        if (f(a.INIT_IN_PROGRESS, a.NONE)) {
            U u2 = this.f24993k;
            if (u2 != null) {
                u2.a(new IronSourceError(612, "Banner init failed"), this);
                return;
            }
            return;
        }
        ironLog.warning("wrong state - mState = " + this.f24992j);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerInitSuccess() {
        String str;
        IronLog.INTERNAL.verbose(p());
        if (f(a.INIT_IN_PROGRESS, a.READY_TO_LOAD)) {
            boolean z10 = false;
            if (this.f25002u) {
                this.f25002u = false;
                return;
            }
            if (!g()) {
                IronSourceBannerLayout ironSourceBannerLayout = this.f24994l;
                if (ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed()) {
                    z10 = true;
                }
                if (!z10) {
                    if (this.f24994l == null) {
                        str = "banner is null";
                    } else {
                        str = "banner is destroyed";
                    }
                    this.f24993k.a(new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, str), this);
                    return;
                }
                q(null);
            }
        }
    }

    public final void q(String str) {
        int i10;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(p());
        if (f(a.READY_TO_LOAD, a.LOADING)) {
            this.f25000s = new com.ironsource.mediationsdk.utils.f();
            if (this.f25001t) {
                i10 = IronSourceConstants.BN_INSTANCE_RELOAD;
            } else {
                i10 = 3002;
            }
            a(i10, null);
            if (this.f25098a != null) {
                try {
                    if (g()) {
                        this.f25098a.loadBannerForBidding(this.f24994l, this.f25101d, this.f25003v, this, str);
                        return;
                    } else {
                        this.f25098a.loadBanner(this.f24994l, this.f25101d, this.f25003v, this);
                        return;
                    }
                } catch (Exception e10) {
                    IronLog.INTERNAL.error("Exception while trying to load banner from " + this.f25098a.getProviderName() + ", exception =  " + e10.getLocalizedMessage());
                    e10.printStackTrace();
                    onBannerAdLoadFailed(new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, e10.getLocalizedMessage()));
                    a(IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_loadException)}, new Object[]{"reason", e10.getLocalizedMessage()}});
                    return;
                }
            }
            return;
        }
        ironLog.error("wrong state - state = " + this.f24992j);
    }

    public final String r() {
        return String.format("%s - ", p());
    }

    public final void a(int i10, Object[][] objArr) {
        boolean z10;
        Map<String, Object> n10 = n();
        synchronized (this.f24999r) {
            z10 = this.f24992j == a.DESTROYED;
        }
        if (z10) {
            n10.put("reason", "banner is destroyed");
        } else {
            IronSourceBannerLayout ironSourceBannerLayout = this.f24994l;
            if (ironSourceBannerLayout != null) {
                C1428r.a(n10, ironSourceBannerLayout.getSize());
            }
        }
        if (!TextUtils.isEmpty(this.f24995m)) {
            n10.put("auctionId", this.f24995m);
        }
        JSONObject jSONObject = this.f24996n;
        if (jSONObject != null && jSONObject.length() > 0) {
            n10.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f24996n);
        }
        com.ironsource.mediationsdk.model.i iVar = this.f24998q;
        if (iVar != null) {
            n10.put("placement", iVar.getPlacementName());
        }
        if (i10 == 3005 || i10 == 3002 || i10 == 3012 || i10 == 3015 || i10 == 3008 || i10 == 3305 || i10 == 3300 || i10 == 3306 || i10 == 3307 || i10 == 3302 || i10 == 3303 || i10 == 3304 || i10 == 3009) {
            com.ironsource.mediationsdk.a.d.d();
            com.ironsource.mediationsdk.a.b.a(n10, this.o, this.f24997p);
        }
        n10.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    n10.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e10) {
                IronLog.INTERNAL.error(k() + " smash: BN sendMediationEvent " + Log.getStackTraceString(e10));
            }
        }
        com.ironsource.mediationsdk.a.d.d().b(new com.ironsource.mediationsdk.a.c(i10, new JSONObject(n10)));
    }

    @Override // com.ironsource.mediationsdk.b.b.a
    public final void b() {
        IronSourceError ironSourceError;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(p());
        a aVar = a.INIT_IN_PROGRESS;
        a aVar2 = a.LOAD_FAILED;
        if (f(aVar, aVar2)) {
            ironLog.verbose("init timed out");
            ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_INIT_TIMEOUT, "Timed out");
        } else {
            if (!f(a.LOADING, aVar2)) {
                ironLog.error("unexpected state - " + this.f24992j);
                return;
            }
            ironLog.verbose("load timed out");
            ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_TIMEOUT, "Timed out");
        }
        e(ironSourceError);
    }

    public final void e() {
        IronLog.INTERNAL.verbose();
        b(a.INIT_IN_PROGRESS);
        if (this.f25098a != null) {
            try {
                String str = L.a().f24866s;
                if (!TextUtils.isEmpty(str)) {
                    this.f25098a.setMediationSegment(str);
                }
                String pluginType = ConfigFile.getConfigFile().getPluginType();
                if (!TextUtils.isEmpty(pluginType)) {
                    this.f25098a.setPluginData(pluginType, ConfigFile.getConfigFile().getPluginFrameworkVersion());
                }
            } catch (Exception e10) {
                IronLog.INTERNAL.error("Exception while trying to set custom params from " + this.f25098a.getProviderName() + ", exception =  " + e10.getLocalizedMessage());
                e10.printStackTrace();
                a(IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_internal)}, new Object[]{"reason", e10.getLocalizedMessage()}});
            }
        }
        try {
            if (this.f25098a != null) {
                boolean g6 = g();
                JSONObject jSONObject = this.f25101d;
                com.ironsource.mediationsdk.utils.k kVar = this.f24990h;
                if (g6) {
                    this.f25098a.initBannerForBidding(kVar.a(), kVar.b(), jSONObject, this);
                } else {
                    this.f25098a.initBanners(kVar.a(), kVar.b(), jSONObject, this);
                }
            }
        } catch (Throwable th) {
            IronLog.INTERNAL.error("Exception while trying to init banner from " + this.f25098a.getProviderName() + ", exception =  " + th.getLocalizedMessage());
            th.printStackTrace();
            onBannerInitFailed(new IronSourceError(612, th.getLocalizedMessage()));
            a(IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_initFailed)}, new Object[]{"reason", th.getLocalizedMessage()}});
        }
    }

    public final void a(IronSourceBannerLayout ironSourceBannerLayout, com.ironsource.mediationsdk.model.i iVar, String str, JSONObject jSONObject) {
        IronSourceError ironSourceError;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(p());
        this.f24998q = iVar;
        this.f25003v = jSONObject;
        if (!((ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) ? false : true)) {
            String str2 = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
            ironLog.verbose(str2);
            ironSourceError = new IronSourceError(610, str2);
        } else {
            if (this.f25098a != null) {
                this.f24994l = ironSourceBannerLayout;
                this.f24991i.a(this);
                try {
                    if (g()) {
                        q(str);
                        return;
                    } else {
                        e();
                        return;
                    }
                } catch (Throwable th) {
                    IronLog.INTERNAL.error("exception = " + th.getLocalizedMessage());
                    th.printStackTrace();
                    onBannerAdLoadFailed(new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, th.getLocalizedMessage()));
                    return;
                }
            }
            ironLog.verbose("mAdapter is null");
            ironSourceError = new IronSourceError(611, "mAdapter is null");
        }
        this.f24993k.a(ironSourceError, this);
    }
}
