package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.A;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import java.util.List;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1432x extends A implements InterstitialSmashListener {

    /* renamed from: n, reason: collision with root package name */
    public final com.ironsource.mediationsdk.sdk.c f25974n;
    public long o;

    /* renamed from: com.ironsource.mediationsdk.x$a */
    /* loaded from: classes2.dex */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            StringBuilder sb2 = new StringBuilder("load timed out state=");
            C1432x c1432x = C1432x.this;
            sb2.append(c1432x.i());
            c1432x.m(sb2.toString());
            if (c1432x.d(A.a.LOAD_IN_PROGRESS, A.a.NOT_LOADED)) {
                c1432x.f25974n.a(new IronSourceError(IronSourceError.ERROR_DO_IS_LOAD_TIMED_OUT, "load timed out"), c1432x, e0.i.e() - c1432x.o);
            }
        }
    }

    public C1432x(String str, String str2, NetworkSettings networkSettings, com.ironsource.mediationsdk.sdk.c cVar, long j10, AbstractAdapter abstractAdapter) {
        super(new com.ironsource.mediationsdk.model.a(networkSettings, networkSettings.getInterstitialSettings(), IronSource.AD_UNIT.INTERSTITIAL), abstractAdapter);
        this.f25974n = cVar;
        this.f24739g = j10;
        this.f24735a.initInterstitial(str, str2, this.f24737d, this);
    }

    public final void a() {
        m("showInterstitial state=" + i());
        if (d(A.a.LOADED, A.a.SHOW_IN_PROGRESS)) {
            this.f24735a.showInterstitial(this.f24737d, this);
        } else {
            this.f25974n.a(new IronSourceError(IronSourceError.ERROR_DO_IS_CALL_LOAD_BEFORE_SHOW, "load must be called before show"), this);
        }
    }

    public final boolean b() {
        return this.f24735a.isInterstitialReady(this.f24737d);
    }

    public final void l(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "DemandOnlyInterstitialSmash " + this.f24736c.f25630a.getProviderName() + " : " + str, 0);
    }

    public final void m(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "DemandOnlyInterstitialSmash " + this.f24736c.f25630a.getProviderName() + " : " + str, 0);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdClicked() {
        l("onInterstitialAdClicked");
        this.f25974n.c(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdClosed() {
        b(A.a.NOT_LOADED);
        l("onInterstitialAdClosed");
        this.f25974n.b(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        l("onInterstitialAdLoadFailed error=" + ironSourceError.getErrorMessage() + " state=" + i());
        j();
        if (d(A.a.LOAD_IN_PROGRESS, A.a.NOT_LOADED)) {
            this.f25974n.a(ironSourceError, this, e0.i.e() - this.o);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdOpened() {
        l("onInterstitialAdOpened");
        this.f25974n.a(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdReady() {
        l("onInterstitialAdReady state=" + i());
        j();
        if (d(A.a.LOAD_IN_PROGRESS, A.a.LOADED)) {
            this.f25974n.a(this, e0.i.e() - this.o);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        b(A.a.NOT_LOADED);
        l("onInterstitialAdShowFailed error=" + ironSourceError.getErrorMessage());
        this.f25974n.a(ironSourceError, this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdVisible() {
        l("onInterstitialAdVisible");
        this.f25974n.d(this);
    }

    public final void a(String str, String str2, JSONObject jSONObject, List<String> list) {
        m("loadInterstitial state=" + i());
        A.a aVar = A.a.NOT_LOADED;
        A.a aVar2 = A.a.LOADED;
        A.a aVar3 = A.a.LOAD_IN_PROGRESS;
        A.a a10 = a(new A.a[]{aVar, aVar2}, aVar3);
        if (a10 != aVar && a10 != aVar2) {
            com.ironsource.mediationsdk.sdk.c cVar = this.f25974n;
            if (a10 == aVar3) {
                cVar.a(new IronSourceError(IronSourceError.ERROR_DO_IS_LOAD_ALREADY_IN_PROGRESS, "load already in progress"), this, 0L);
                return;
            } else {
                cVar.a(new IronSourceError(IronSourceError.ERROR_DO_IS_LOAD_ALREADY_IN_PROGRESS, "cannot load because show is in progress"), this, 0L);
                return;
            }
        }
        this.o = e0.i.e();
        m("start timer");
        c(new a());
        if (!k()) {
            this.f24735a.loadInterstitial(this.f24737d, null, this);
            return;
        }
        this.f24740h = str2;
        this.f24741i = jSONObject;
        this.f24742j = list;
        this.f24735a.loadInterstitialForBidding(this.f24737d, null, this, str);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdShowSucceeded() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialInitSuccess() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialInitFailed(IronSourceError ironSourceError) {
    }
}
