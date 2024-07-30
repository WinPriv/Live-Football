package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoManualListener;

/* loaded from: classes2.dex */
public final class ae extends com.ironsource.mediationsdk.sdk.b {

    /* renamed from: d, reason: collision with root package name */
    public static final ae f25270d = new ae();

    /* renamed from: a, reason: collision with root package name */
    public RewardedVideoListener f25271a = null;

    /* renamed from: b, reason: collision with root package name */
    public LevelPlayRewardedVideoBaseListener f25272b;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Placement f25276s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ AdInfo f25277t;

        public a(Placement placement, AdInfo adInfo) {
            this.f25276s = placement;
            this.f25277t = adInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ae aeVar = ae.this;
            LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = aeVar.f25272b;
            if (levelPlayRewardedVideoBaseListener != null) {
                AdInfo adInfo = this.f25277t;
                AdInfo f = aeVar.f(adInfo);
                Placement placement = this.f25276s;
                levelPlayRewardedVideoBaseListener.onAdClicked(placement, f);
                IronLog.CALLBACK.info("onAdClicked() placement = " + placement + ", adInfo = " + aeVar.f(adInfo));
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f25279s;

        public b(IronSourceError ironSourceError) {
            this.f25279s = ironSourceError;
        }

        @Override // java.lang.Runnable
        public final void run() {
            RewardedVideoListener rewardedVideoListener = ae.this.f25271a;
            if (rewardedVideoListener != null) {
                IronSourceError ironSourceError = this.f25279s;
                ((RewardedVideoManualListener) rewardedVideoListener).onRewardedVideoAdLoadFailed(ironSourceError);
                ae.b("onRewardedVideoAdLoadFailed() error=" + ironSourceError.getErrorMessage());
            }
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f25281s;

        public c(IronSourceError ironSourceError) {
            this.f25281s = ironSourceError;
        }

        @Override // java.lang.Runnable
        public final void run() {
            LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = ae.this.f25272b;
            if (levelPlayRewardedVideoBaseListener != null) {
                IronSourceError ironSourceError = this.f25281s;
                ((LevelPlayRewardedVideoManualListener) levelPlayRewardedVideoBaseListener).onAdLoadFailed(ironSourceError);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + ironSourceError.getErrorMessage());
            }
        }
    }

    /* loaded from: classes2.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RewardedVideoListener rewardedVideoListener = ae.this.f25271a;
            if (rewardedVideoListener != null) {
                rewardedVideoListener.onRewardedVideoAdOpened();
                ae.b("onRewardedVideoAdOpened()");
            }
        }
    }

    /* loaded from: classes2.dex */
    public class e implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ AdInfo f25284s;

        public e(AdInfo adInfo) {
            this.f25284s = adInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ae aeVar = ae.this;
            LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = aeVar.f25272b;
            if (levelPlayRewardedVideoBaseListener != null) {
                AdInfo adInfo = this.f25284s;
                levelPlayRewardedVideoBaseListener.onAdOpened(aeVar.f(adInfo));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + aeVar.f(adInfo));
            }
        }
    }

    /* loaded from: classes2.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RewardedVideoListener rewardedVideoListener = ae.this.f25271a;
            if (rewardedVideoListener != null) {
                rewardedVideoListener.onRewardedVideoAdClosed();
                ae.b("onRewardedVideoAdClosed()");
            }
        }
    }

    /* loaded from: classes2.dex */
    public class g implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ AdInfo f25287s;

        public g(AdInfo adInfo) {
            this.f25287s = adInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ae aeVar = ae.this;
            LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = aeVar.f25272b;
            if (levelPlayRewardedVideoBaseListener != null) {
                AdInfo adInfo = this.f25287s;
                levelPlayRewardedVideoBaseListener.onAdClosed(aeVar.f(adInfo));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + aeVar.f(adInfo));
            }
        }
    }

    /* loaded from: classes2.dex */
    public class h implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ boolean f25289s;

        public h(boolean z10) {
            this.f25289s = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            RewardedVideoListener rewardedVideoListener = ae.this.f25271a;
            if (rewardedVideoListener != null) {
                boolean z10 = this.f25289s;
                rewardedVideoListener.onRewardedVideoAvailabilityChanged(z10);
                ae.b("onRewardedVideoAvailabilityChanged() available=" + z10);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class i implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ boolean f25291s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ AdInfo f25292t;

        public i(boolean z10, AdInfo adInfo) {
            this.f25291s = z10;
            this.f25292t = adInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ae aeVar = ae.this;
            LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = aeVar.f25272b;
            if (levelPlayRewardedVideoBaseListener != null) {
                LevelPlayRewardedVideoListener levelPlayRewardedVideoListener = (LevelPlayRewardedVideoListener) levelPlayRewardedVideoBaseListener;
                if (this.f25291s) {
                    AdInfo adInfo = this.f25292t;
                    levelPlayRewardedVideoListener.onAdAvailable(aeVar.f(adInfo));
                    IronLog.CALLBACK.info("onAdAvailable() adInfo = " + aeVar.f(adInfo));
                    return;
                }
                levelPlayRewardedVideoListener.onAdUnavailable();
                IronLog.CALLBACK.info("onAdUnavailable()");
            }
        }
    }

    /* loaded from: classes2.dex */
    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RewardedVideoListener rewardedVideoListener = ae.this.f25271a;
            if (rewardedVideoListener != null) {
                rewardedVideoListener.onRewardedVideoAdStarted();
                ae.b("onRewardedVideoAdStarted()");
            }
        }
    }

    /* loaded from: classes2.dex */
    public class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RewardedVideoListener rewardedVideoListener = ae.this.f25271a;
            if (rewardedVideoListener != null) {
                rewardedVideoListener.onRewardedVideoAdEnded();
                ae.b("onRewardedVideoAdEnded()");
            }
        }
    }

    /* loaded from: classes2.dex */
    public class l implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Placement f25296s;

        public l(Placement placement) {
            this.f25296s = placement;
        }

        @Override // java.lang.Runnable
        public final void run() {
            RewardedVideoListener rewardedVideoListener = ae.this.f25271a;
            if (rewardedVideoListener != null) {
                Placement placement = this.f25296s;
                rewardedVideoListener.onRewardedVideoAdRewarded(placement);
                ae.b("onRewardedVideoAdRewarded(" + placement + ")");
            }
        }
    }

    /* loaded from: classes2.dex */
    public class m implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Placement f25298s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ AdInfo f25299t;

        public m(Placement placement, AdInfo adInfo) {
            this.f25298s = placement;
            this.f25299t = adInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ae aeVar = ae.this;
            LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = aeVar.f25272b;
            if (levelPlayRewardedVideoBaseListener != null) {
                AdInfo adInfo = this.f25299t;
                AdInfo f = aeVar.f(adInfo);
                Placement placement = this.f25298s;
                levelPlayRewardedVideoBaseListener.onAdRewarded(placement, f);
                IronLog.CALLBACK.info("onAdRewarded() placement = " + placement + ", adInfo = " + aeVar.f(adInfo));
            }
        }
    }

    /* loaded from: classes2.dex */
    public class n implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f25301s;

        public n(IronSourceError ironSourceError) {
            this.f25301s = ironSourceError;
        }

        @Override // java.lang.Runnable
        public final void run() {
            RewardedVideoListener rewardedVideoListener = ae.this.f25271a;
            if (rewardedVideoListener != null) {
                IronSourceError ironSourceError = this.f25301s;
                rewardedVideoListener.onRewardedVideoAdShowFailed(ironSourceError);
                ae.b("onRewardedVideoAdShowFailed() error=" + ironSourceError.getErrorMessage());
            }
        }
    }

    /* loaded from: classes2.dex */
    public class o implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f25303s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ AdInfo f25304t;

        public o(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f25303s = ironSourceError;
            this.f25304t = adInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ae aeVar = ae.this;
            LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = aeVar.f25272b;
            if (levelPlayRewardedVideoBaseListener != null) {
                AdInfo adInfo = this.f25304t;
                AdInfo f = aeVar.f(adInfo);
                IronSourceError ironSourceError = this.f25303s;
                levelPlayRewardedVideoBaseListener.onAdShowFailed(ironSourceError, f);
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + aeVar.f(adInfo) + ", error = " + ironSourceError.getErrorMessage());
            }
        }
    }

    /* loaded from: classes2.dex */
    public class p implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Placement f25306s;

        public p(Placement placement) {
            this.f25306s = placement;
        }

        @Override // java.lang.Runnable
        public final void run() {
            RewardedVideoListener rewardedVideoListener = ae.this.f25271a;
            if (rewardedVideoListener != null) {
                Placement placement = this.f25306s;
                rewardedVideoListener.onRewardedVideoAdClicked(placement);
                ae.b("onRewardedVideoAdClicked(" + placement + ")");
            }
        }
    }

    private ae() {
    }

    public static ae a() {
        return f25270d;
    }

    public static /* synthetic */ void b(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }

    public final void c() {
        if (this.f25271a != null) {
            com.ironsource.environment.e.c.f24668a.b(new k());
        }
    }

    public final void a(AdInfo adInfo) {
        if (this.f25271a != null) {
            com.ironsource.environment.e.c.f24668a.b(new d());
        }
        if (this.f25272b != null) {
            com.ironsource.environment.e.c.f24668a.b(new e(adInfo));
        }
    }

    public final void b() {
        if (this.f25271a != null) {
            com.ironsource.environment.e.c.f24668a.b(new j());
        }
    }

    public final void a(IronSourceError ironSourceError) {
        RewardedVideoListener rewardedVideoListener = this.f25271a;
        if (rewardedVideoListener != null && (rewardedVideoListener instanceof RewardedVideoManualListener)) {
            com.ironsource.environment.e.c.f24668a.b(new b(ironSourceError));
        }
        LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = this.f25272b;
        if (levelPlayRewardedVideoBaseListener == null || !(levelPlayRewardedVideoBaseListener instanceof LevelPlayRewardedVideoManualListener)) {
            return;
        }
        com.ironsource.environment.e.c.f24668a.b(new c(ironSourceError));
    }

    public final void b(AdInfo adInfo) {
        if (this.f25271a != null) {
            com.ironsource.environment.e.c.f24668a.b(new f());
        }
        if (this.f25272b != null) {
            com.ironsource.environment.e.c.f24668a.b(new g(adInfo));
        }
    }

    public final void a(IronSourceError ironSourceError, AdInfo adInfo) {
        if (this.f25271a != null) {
            com.ironsource.environment.e.c.f24668a.b(new n(ironSourceError));
        }
        if (this.f25272b != null) {
            com.ironsource.environment.e.c.f24668a.b(new o(ironSourceError, adInfo));
        }
    }

    public final void b(Placement placement, AdInfo adInfo) {
        if (this.f25271a != null) {
            com.ironsource.environment.e.c.f24668a.b(new p(placement));
        }
        if (this.f25272b != null) {
            com.ironsource.environment.e.c.f24668a.b(new a(placement, adInfo));
        }
    }

    public final void a(Placement placement, AdInfo adInfo) {
        if (this.f25271a != null) {
            com.ironsource.environment.e.c.f24668a.b(new l(placement));
        }
        if (this.f25272b != null) {
            com.ironsource.environment.e.c.f24668a.b(new m(placement, adInfo));
        }
    }

    public final void a(boolean z10, AdInfo adInfo) {
        if (this.f25271a != null) {
            com.ironsource.environment.e.c.f24668a.b(new h(z10));
        }
        LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = this.f25272b;
        if (levelPlayRewardedVideoBaseListener == null || !(levelPlayRewardedVideoBaseListener instanceof LevelPlayRewardedVideoListener)) {
            return;
        }
        com.ironsource.environment.e.c.f24668a.b(new i(z10, adInfo));
    }
}
