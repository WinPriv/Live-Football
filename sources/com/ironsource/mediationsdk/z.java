package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.A;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import java.util.List;
import java.util.TimerTask;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class z extends A implements RewardedVideoSmashListener {

    /* renamed from: n, reason: collision with root package name */
    public final com.ironsource.mediationsdk.sdk.d f25976n;
    public long o;

    /* loaded from: classes2.dex */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            StringBuilder sb2 = new StringBuilder("load timed out state=");
            z zVar = z.this;
            sb2.append(zVar.i());
            zVar.m(sb2.toString());
            if (zVar.d(A.a.LOAD_IN_PROGRESS, A.a.NOT_LOADED)) {
                zVar.f25976n.a(new IronSourceError(IronSourceError.ERROR_DO_RV_LOAD_TIMED_OUT, "load timed out"), zVar, e0.i.e() - zVar.o);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z(java.lang.String r4, java.lang.String r5, com.ironsource.mediationsdk.model.NetworkSettings r6, com.ironsource.mediationsdk.sdk.d r7, long r8, com.ironsource.mediationsdk.AbstractAdapter r10) {
        /*
            r3 = this;
            com.ironsource.mediationsdk.model.a r0 = new com.ironsource.mediationsdk.model.a
            org.json.JSONObject r1 = r6.getInterstitialSettings()
            com.ironsource.mediationsdk.IronSource$AD_UNIT r2 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO
            r0.<init>(r6, r1, r2)
            r3.<init>(r0, r10)
            com.ironsource.mediationsdk.model.a r0 = new com.ironsource.mediationsdk.model.a
            org.json.JSONObject r1 = r6.getRewardedVideoSettings()
            r0.<init>(r6, r1, r2)
            r3.f24736c = r0
            org.json.JSONObject r6 = r0.f25631b
            r3.f24737d = r6
            r3.f24735a = r10
            r3.f25976n = r7
            r3.f24739g = r8
            r10.initRewardedVideoForDemandOnly(r4, r5, r6, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.z.<init>(java.lang.String, java.lang.String, com.ironsource.mediationsdk.model.NetworkSettings, com.ironsource.mediationsdk.sdk.d, long, com.ironsource.mediationsdk.AbstractAdapter):void");
    }

    public final void a() {
        m("showRewardedVideo state=" + i());
        if (d(A.a.LOADED, A.a.SHOW_IN_PROGRESS)) {
            this.f24735a.showRewardedVideo(this.f24737d, this);
        } else {
            this.f25976n.a(new IronSourceError(IronSourceError.ERROR_DO_RV_CALL_LOAD_BEFORE_SHOW, "load must be called before show"), this);
        }
    }

    public final boolean b() {
        return this.f24735a.isRewardedVideoAvailable(this.f24737d);
    }

    public final void l(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "DemandOnlyRewardedVideoSmash " + this.f24736c.f25630a.getProviderName() + " : " + str, 0);
    }

    public final void m(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "DemandOnlyRewardedVideoSmash " + this.f24736c.f25630a.getProviderName() + " : " + str, 0);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdClicked() {
        l("onRewardedVideoAdClicked");
        this.f25976n.c(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdClosed() {
        b(A.a.NOT_LOADED);
        l("onRewardedVideoAdClosed");
        this.f25976n.b(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdOpened() {
        l("onRewardedVideoAdOpened");
        this.f25976n.a(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdRewarded() {
        l("onRewardedVideoAdRewarded");
        this.f25976n.e(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        b(A.a.NOT_LOADED);
        l("onRewardedVideoAdClosed error=" + ironSourceError);
        this.f25976n.a(ironSourceError, this);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdVisible() {
        l("onRewardedVideoAdVisible");
        this.f25976n.d(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        l("onRewardedVideoLoadFailed error=" + ironSourceError.getErrorMessage() + " state=" + i());
        j();
        if (d(A.a.LOAD_IN_PROGRESS, A.a.NOT_LOADED)) {
            this.f25976n.a(ironSourceError, this, e0.i.e() - this.o);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoLoadSuccess() {
        l("onRewardedVideoLoadSuccess state=" + i());
        j();
        if (d(A.a.LOAD_IN_PROGRESS, A.a.LOADED)) {
            this.f25976n.a(this, e0.i.e() - this.o);
        }
    }

    public final void a(String str, String str2, JSONObject jSONObject, List<String> list) {
        m("loadRewardedVideo state=" + i());
        A.a aVar = A.a.NOT_LOADED;
        A.a aVar2 = A.a.LOADED;
        A.a aVar3 = A.a.LOAD_IN_PROGRESS;
        A.a a10 = a(new A.a[]{aVar, aVar2}, aVar3);
        if (a10 != aVar && a10 != aVar2) {
            com.ironsource.mediationsdk.sdk.d dVar = this.f25976n;
            if (a10 == aVar3) {
                dVar.a(new IronSourceError(IronSourceError.ERROR_DO_RV_LOAD_ALREADY_IN_PROGRESS, "load already in progress"), this, 0L);
                return;
            } else {
                dVar.a(new IronSourceError(IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW, "cannot load because show is in progress"), this, 0L);
                return;
            }
        }
        this.o = e0.i.e();
        m("start timer");
        c(new a());
        if (!k()) {
            this.f24735a.loadRewardedVideoForDemandOnly(this.f24737d, this);
            return;
        }
        this.f24740h = str2;
        this.f24741i = jSONObject;
        this.f24742j = list;
        this.f24735a.loadRewardedVideoForDemandOnlyForBidding(this.f24737d, this, str);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdEnded() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdStarted() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoInitSuccess() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAvailabilityChanged(boolean z10) {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
    }
}
