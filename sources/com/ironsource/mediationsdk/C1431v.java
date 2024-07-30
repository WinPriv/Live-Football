package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.A;
import com.ironsource.mediationsdk.C1418f;
import com.ironsource.mediationsdk.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.m;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.a;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1431v extends A implements InterfaceC1419g, BannerSmashListener {

    /* renamed from: b, reason: collision with root package name */
    public C1420h f25959b;

    /* renamed from: n, reason: collision with root package name */
    public long f25960n;
    public long o;

    /* renamed from: p, reason: collision with root package name */
    public final String f25961p;

    /* renamed from: q, reason: collision with root package name */
    public final String f25962q;

    /* renamed from: r, reason: collision with root package name */
    public C1423l f25963r;

    /* renamed from: s, reason: collision with root package name */
    public ISDemandOnlyBannerLayout f25964s;

    public C1431v(String str, String str2, NetworkSettings networkSettings, long j10, AbstractAdapter abstractAdapter) {
        super(new a(networkSettings, networkSettings.getBannerSettings(), IronSource.AD_UNIT.BANNER), abstractAdapter);
        this.f24739g = j10;
        this.f25961p = str;
        this.f25962q = str2;
        this.f25963r = new C1423l();
        this.f24735a.initBannerForBidding(str, str2, this.f24737d, this);
    }

    @Override // com.ironsource.mediationsdk.InterfaceC1419g
    public final void a(int i10, String str, int i11, String str2, long j10) {
        boolean z10;
        IronLog.INTERNAL.verbose("Auction failed. error " + i10 + " - " + str);
        this.f24740h = null;
        this.f24741i = null;
        l(IronSourceConstants.TROUBLESHOOTING_BN_INSTANCE_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{"reason", str}, new Object[]{"duration", Long.valueOf(j10)}, new Object[]{IronSourceConstants.EVENTS_EXT1, i()}});
        A.a aVar = A.a.LOAD_IN_PROGRESS;
        synchronized (this.f24744l) {
            z10 = this.f24738e == aVar;
        }
        if (z10) {
            m(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_AUCTION_FAILED, "No available ad to load"));
        }
    }

    public final void b() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("");
        a(new A.a[]{A.a.LOADED, A.a.LOAD_IN_PROGRESS, A.a.SHOW_IN_PROGRESS}, A.a.NOT_LOADED);
        if (o()) {
            ironLog.error("Banner is null or already destroyed and can't be used anymore");
            return;
        }
        j();
        ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = this.f25964s;
        if (iSDemandOnlyBannerLayout != null) {
            iSDemandOnlyBannerLayout.f24810w = true;
            iSDemandOnlyBannerLayout.f24809v = null;
            iSDemandOnlyBannerLayout.f24807t = null;
            iSDemandOnlyBannerLayout.f24808u = null;
            iSDemandOnlyBannerLayout.f24806s = null;
            iSDemandOnlyBannerLayout.removeBannerListener();
        }
        this.f25964s = null;
        AbstractAdapter abstractAdapter = this.f24735a;
        if (abstractAdapter == null) {
            ironLog.error("can't destroy adapter. mAdapter == null");
        } else {
            abstractAdapter.destroyBanner(this.f24737d);
        }
        l(IronSourceConstants.BN_INSTANCE_DESTROY, null);
        ironLog.verbose("banner layout was destroyed. bannerId: " + g());
    }

    @Override // com.ironsource.mediationsdk.A
    public final Map<String, Object> d() {
        String str;
        HashMap hashMap = new HashMap();
        try {
            if (o()) {
                hashMap.put("reason", "banner is destroyed");
            } else {
                C1428r.a(hashMap, this.f25964s.getSize());
            }
            AbstractAdapter abstractAdapter = this.f24735a;
            String str2 = "";
            if (abstractAdapter == null) {
                str = "";
            } else {
                str = abstractAdapter.getVersion();
            }
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, str);
            AbstractAdapter abstractAdapter2 = this.f24735a;
            if (abstractAdapter2 != null) {
                str2 = abstractAdapter2.getCoreSDKVersion();
            }
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, str2);
            hashMap.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, this.f24736c.f25630a.getSubProviderId());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.f24736c.f25630a.getAdSourceNameForEvents());
            hashMap.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            if (h()) {
                hashMap.put("isOneFlow", 1);
            }
            hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
            hashMap.put("instanceType", Integer.valueOf(this.f24736c.f));
            if (!TextUtils.isEmpty(this.f24740h)) {
                hashMap.put("auctionId", this.f24740h);
            }
            JSONObject jSONObject = this.f24741i;
            if (jSONObject != null && jSONObject.length() > 0) {
                hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f24741i);
            }
            if (!TextUtils.isEmpty(this.f24743k)) {
                hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID, this.f24743k);
            }
        } catch (Exception e10) {
            IronLog.INTERNAL.error("Instance: " + e() + " " + e10.getMessage());
        }
        return hashMap;
    }

    public final void l(int i10, Object[][] objArr) {
        Map<String, Object> d10 = d();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    if (objArr2[1] != null) {
                        d10.put(objArr2[0].toString(), objArr2[1]);
                    }
                }
            } catch (Exception e10) {
                IronLog.INTERNAL.error(e10.getMessage());
            }
        }
        com.ironsource.mediationsdk.a.d.d().b(new com.ironsource.mediationsdk.a.c(i10, new JSONObject(d10)));
    }

    public final void m(IronSourceError ironSourceError) {
        boolean z10;
        IronLog.INTERNAL.verbose("error = " + ironSourceError.getErrorMessage() + " smash - " + p());
        if (d(A.a.LOAD_IN_PROGRESS, A.a.NOT_LOADED)) {
            j();
            long currentTimeMillis = System.currentTimeMillis() - this.f25960n;
            if (ironSourceError.getErrorCode() == 606) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                l(IronSourceConstants.BN_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"duration", Long.valueOf(currentTimeMillis)}});
            } else {
                l(IronSourceConstants.BN_INSTANCE_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(currentTimeMillis)}});
            }
            n(this.f25963r.b(), IronSourceUtils.getCurrentMethodName());
            if (!o()) {
                this.f25964s.mListenerWrapper.a(g(), ironSourceError);
            }
        }
    }

    public final void n(List<String> list, String str) {
        String e10 = e();
        int f = f();
        String str2 = this.f24743k;
        for (String str3 : (List) com.ironsource.mediationsdk.c.a.a((ArrayList) list, new ArrayList())) {
            C1418f.a();
            String a10 = C1418f.a(str3, e10, f, str2, "", "", "", "");
            C1418f.a();
            C1418f.h(str, e10, a10);
        }
    }

    public final boolean o() {
        ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = this.f25964s;
        if (iSDemandOnlyBannerLayout != null && !iSDemandOnlyBannerLayout.isDestroyed()) {
            return false;
        }
        return true;
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdClicked() {
        IronLog.INTERNAL.verbose("smash - " + p());
        l(IronSourceConstants.BN_INSTANCE_CLICK, null);
        if (!o()) {
            m mVar = this.f25964s.mListenerWrapper;
            String g6 = g();
            if (mVar.f25591a != null) {
                com.ironsource.environment.e.c.f24668a.b(new m.d(g6));
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdLeftApplication() {
        IronLog.INTERNAL.verbose("smash - " + p());
        l(IronSourceConstants.BN_INSTANCE_LEAVE_APP, null);
        if (!o()) {
            m mVar = this.f25964s.mListenerWrapper;
            String g6 = g();
            if (mVar.f25591a != null) {
                com.ironsource.environment.e.c.f24668a.b(new m.e(g6));
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("smash - " + p());
        l(IronSourceConstants.TROUBLESHOOTING_BN_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(System.currentTimeMillis() - this.o)}});
        m(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.INTERNAL.verbose("smash = " + p());
        int b10 = com.ironsource.mediationsdk.utils.o.a().b(3);
        l(IronSourceConstants.TROUBLESHOOTING_BN_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(b10)}, new Object[]{"duration", Long.valueOf(System.currentTimeMillis() - this.o)}});
        if (!d(A.a.LOAD_IN_PROGRESS, A.a.LOADED)) {
            return;
        }
        j();
        if (!o()) {
            com.ironsource.environment.e.c.f24668a.b(new ISDemandOnlyBannerLayout.a(view, layoutParams));
        }
        l(3005, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(b10)}, new Object[]{"duration", Long.valueOf(System.currentTimeMillis() - this.f25960n)}});
        com.ironsource.mediationsdk.utils.o.a().a(3);
        n(this.f25963r.a(), IronSourceUtils.getCurrentMethodName());
        if (!o()) {
            m mVar = this.f25964s.mListenerWrapper;
            String g6 = g();
            if (mVar.f25591a != null) {
                com.ironsource.environment.e.c.f24668a.b(new m.b(g6));
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdShown() {
        if (d(A.a.LOADED, A.a.SHOW_IN_PROGRESS)) {
            IronLog.INTERNAL.verbose("smash - " + p());
            l(IronSourceConstants.BN_INSTANCE_SHOW, null);
            n(this.f25963r.c(), IronSourceUtils.getCurrentMethodName());
            if (!o()) {
                m mVar = this.f25964s.mListenerWrapper;
                String g6 = g();
                if (mVar.f25591a != null) {
                    com.ironsource.environment.e.c.f24668a.b(new m.c(g6));
                }
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("smash - " + p() + " " + ironSourceError.toString());
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerInitSuccess() {
        IronLog.INTERNAL.verbose("smash - " + p());
    }

    public final String p() {
        if (this.f24736c.f25630a.isMultipleInstances()) {
            return this.f24736c.f25630a.getProviderTypeForReflection();
        }
        return this.f24736c.f25630a.getProviderName();
    }

    public final void a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout) {
        IronSourceError ironSourceError;
        IronLog ironLog = IronLog.INTERNAL;
        a3.k.v(new StringBuilder("state="), i(), ironLog);
        A.a[] aVarArr = {A.a.NOT_LOADED, A.a.LOADED};
        A.a aVar = A.a.LOAD_IN_PROGRESS;
        A.a a10 = a(aVarArr, aVar);
        if (a10 == aVar || a10 == A.a.SHOW_IN_PROGRESS) {
            if (iSDemandOnlyBannerLayout == null || iSDemandOnlyBannerLayout.isDestroyed()) {
                return;
            }
            this.f25964s.mListenerWrapper.a(g(), new IronSourceError(IronSourceError.ERROR_DO_IS_LOAD_ALREADY_IN_PROGRESS, a10 == aVar ? "load already in progress" : "cannot load because show is in progress"));
            return;
        }
        this.f24740h = null;
        this.f24741i = null;
        this.f25963r = new C1423l();
        if (h()) {
            l(3002, null);
            this.f25964s = iSDemandOnlyBannerLayout;
            this.f25960n = e0.i.e();
            ironLog.verbose("");
            c(new p0(this));
            if (this.f25959b.f25445a.a()) {
                ironLog.verbose("");
                ArrayList arrayList = new ArrayList();
                arrayList.add(e());
                String str = "" + f() + e();
                C1422k c1422k = new C1422k(com.anythink.expressad.foundation.g.a.f.f9817e);
                c1422k.a(arrayList);
                c1422k.b(str);
                c1422k.a(g());
                c1422k.b(IronSourceUtils.getSerr() == 1);
                c1422k.c(true);
                c1422k.a(true);
                c1422k.a(this.f25964s.getSize());
                com.ironsource.environment.e.c.f24668a.c(new o0(this, c1422k));
                return;
            }
            ironLog.verbose("can't load the banner the auction isn't enabled");
            ironSourceError = new IronSourceError(IronSourceError.ERROR_CODE_MISSING_CONFIGURATION, "Missing server configuration");
        } else {
            ironLog.verbose("can't load banner when isOneFlow = false");
            ironSourceError = new IronSourceError(IronSourceError.ERROR_CODE_MISSING_CONFIGURATION, "Missing configuration settings");
        }
        m(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdScreenDismissed() {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdScreenPresented() {
    }

    public final void a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        IronSourceError buildLoadFailedError;
        IronLog ironLog = IronLog.INTERNAL;
        a3.k.v(new StringBuilder("state="), i(), ironLog);
        A.a[] aVarArr = {A.a.NOT_LOADED, A.a.LOADED};
        A.a aVar = A.a.LOAD_IN_PROGRESS;
        A.a a10 = a(aVarArr, aVar);
        if (a10 == aVar || a10 == A.a.SHOW_IN_PROGRESS) {
            if (iSDemandOnlyBannerLayout == null || iSDemandOnlyBannerLayout.isDestroyed()) {
                return;
            }
            this.f25964s.mListenerWrapper.a(g(), new IronSourceError(IronSourceError.ERROR_DO_IS_LOAD_ALREADY_IN_PROGRESS, a10 == aVar ? "load already in progress" : "cannot load because show is in progress"));
            return;
        }
        this.f24740h = null;
        this.f24741i = null;
        this.f25963r = new C1423l();
        if (o()) {
            buildLoadFailedError = new IronSourceError(610, "bannerLayout is null or destroyed");
        } else if (!k()) {
            buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadBannerForBidder in IAB flow must be called by bidder instances");
            l(IronSourceConstants.BN_INSTANCE_LOAD_ERROR, null);
        } else if (this.f24735a == null) {
            ironLog.error("adapter object is null");
            buildLoadFailedError = new IronSourceError(611, "Missing internal configuration");
        } else {
            try {
                C1418f.a();
                JSONObject e10 = C1418f.e(str);
                C1418f.a();
                C1418f.a b10 = C1418f.b(e10);
                C1418f.a();
                com.ironsource.mediationsdk.c.b a11 = C1418f.a(e(), b10.f25426b);
                if (a11 == null) {
                    IronSourceError buildLoadFailedError2 = ErrorBuilder.buildLoadFailedError("loadBannerForBidder invalid enriched adm");
                    l(IronSourceConstants.BN_INSTANCE_LOAD_ERROR, null);
                    m(buildLoadFailedError2);
                    return;
                }
                String b11 = a11.b();
                if (b11 == null) {
                    ironLog.error("serverData is null");
                    m(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_SERVER_DATA, "No available ad to load"));
                    return;
                }
                a(b11);
                b(b10.f25425a);
                a(b10.f25428d);
                l(3002, null);
                l(IronSourceConstants.TROUBLESHOOTING_BN_INSTANCE_LOAD_WITH_ADM, null);
                this.f25960n = new Date().getTime();
                ironLog.verbose("");
                c(new p0(this));
                this.f25963r.c(a11.e());
                this.f24735a.initBannerForBidding(this.f25961p, this.f25962q, this.f24737d, this);
                this.f24735a.loadBannerForDemandOnlyForBidding(iSDemandOnlyBannerLayout, this.f24737d, this, b11);
                return;
            } catch (Exception e11) {
                buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadBannerForBidder: Exception= " + e11.getMessage());
            }
        }
        m(buildLoadFailedError);
    }

    @Override // com.ironsource.mediationsdk.InterfaceC1419g
    public final void a(List<com.ironsource.mediationsdk.c.b> list, String str, com.ironsource.mediationsdk.c.b bVar, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) {
        String str3;
        boolean z10;
        IronSourceError ironSourceError;
        IronSourceError ironSourceError2;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("");
        this.f24740h = str;
        this.f24741i = jSONObject;
        boolean z11 = true;
        if (!TextUtils.isEmpty(str2)) {
            l(IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i11)}, new Object[]{"reason", str2}});
        }
        l(IronSourceConstants.TROUBLESHOOTING_BN_INSTANCE_AUCTION_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(j10)}});
        Object[][] objArr = new Object[1];
        Object[] objArr2 = new Object[2];
        objArr2[0] = IronSourceConstants.EVENTS_EXT1;
        if (list.isEmpty()) {
            str3 = "";
        } else {
            str3 = "1" + list.get(0).a();
        }
        objArr2[1] = str3;
        objArr[0] = objArr2;
        l(IronSourceConstants.TROUBLESHOOTING_BN_INSTANCE_AUCTION_RESPONSE_WATERFALL, objArr);
        A.a aVar = A.a.LOAD_IN_PROGRESS;
        synchronized (this.f24744l) {
            z10 = this.f24738e == aVar;
        }
        if (z10) {
            if (list.isEmpty()) {
                ironSourceError = new IronSourceError(IronSourceConstants.BN_INSTANCE_LOAD_NO_FILL, "There is no available ad to load");
                ironLog.error("loadBanner - empty waterfall");
            } else {
                ironSourceError = null;
            }
            if (ironSourceError != null) {
                m(ironSourceError);
                return;
            }
            com.ironsource.mediationsdk.c.b bVar2 = list.get(0);
            this.f25963r.c(bVar2.e());
            this.f25963r.a(bVar2.g());
            this.f25963r.b(bVar2.f());
            String b10 = bVar2.b();
            a(b10);
            ironLog.verbose("");
            synchronized (this.f24744l) {
                if (this.f24738e != aVar) {
                    z11 = false;
                }
            }
            if (z11) {
                if (b10 == null) {
                    ironLog.verbose("serverData is null");
                    ironSourceError2 = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_SERVER_DATA, "No available ad to load");
                } else {
                    if (this.f24735a != null) {
                        l(IronSourceConstants.TROUBLESHOOTING_BN_INSTANCE_LOAD_WITH_ADM, null);
                        this.o = System.currentTimeMillis();
                        this.f24735a.initBannerForBidding(this.f25961p, this.f25962q, this.f24737d, this);
                        this.f24735a.loadBannerForDemandOnlyForBidding(this.f25964s, this.f24737d, this, b10);
                        return;
                    }
                    ironLog.verbose("adapter object is null");
                    ironSourceError2 = new IronSourceError(611, "Missing internal configuration");
                }
                m(ironSourceError2);
            }
        }
    }
}
