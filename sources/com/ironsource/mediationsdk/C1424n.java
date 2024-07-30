package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerListener;
import com.ironsource.mediationsdk.sdk.LevelPlayBannerListener;

/* renamed from: com.ironsource.mediationsdk.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1424n extends com.ironsource.mediationsdk.sdk.b {
    public static final C1424n f = new C1424n();

    /* renamed from: d, reason: collision with root package name */
    public BannerListener f25735d = null;

    /* renamed from: e, reason: collision with root package name */
    public LevelPlayBannerListener f25736e = null;

    /* renamed from: com.ironsource.mediationsdk.n$c */
    /* loaded from: classes2.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            BannerListener bannerListener = C1424n.this.f25735d;
            if (bannerListener != null) {
                bannerListener.onBannerAdScreenDismissed();
                IronLog.CALLBACK.info("onBannerAdScreenDismissed()");
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.n$d */
    /* loaded from: classes2.dex */
    public class d implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ AdInfo f25738s;

        public d(AdInfo adInfo) {
            this.f25738s = adInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1424n c1424n = C1424n.this;
            LevelPlayBannerListener levelPlayBannerListener = c1424n.f25736e;
            if (levelPlayBannerListener != null) {
                AdInfo adInfo = this.f25738s;
                levelPlayBannerListener.onAdScreenDismissed(c1424n.f(adInfo));
                IronLog.CALLBACK.info("onAdScreenDismissed() adInfo = " + c1424n.f(adInfo));
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.n$e */
    /* loaded from: classes2.dex */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            BannerListener bannerListener = C1424n.this.f25735d;
            if (bannerListener != null) {
                bannerListener.onBannerAdLeftApplication();
                IronLog.CALLBACK.info("onBannerAdLeftApplication()");
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.n$f */
    /* loaded from: classes2.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            BannerListener bannerListener = C1424n.this.f25735d;
            if (bannerListener != null) {
                bannerListener.onBannerAdLoaded();
                IronLog.CALLBACK.info("onBannerAdLoaded()");
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.n$g */
    /* loaded from: classes2.dex */
    public class g implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ AdInfo f25742s;

        public g(AdInfo adInfo) {
            this.f25742s = adInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1424n c1424n = C1424n.this;
            LevelPlayBannerListener levelPlayBannerListener = c1424n.f25736e;
            if (levelPlayBannerListener != null) {
                AdInfo adInfo = this.f25742s;
                levelPlayBannerListener.onAdLeftApplication(c1424n.f(adInfo));
                IronLog.CALLBACK.info("onAdLeftApplication() adInfo = " + c1424n.f(adInfo));
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.n$h */
    /* loaded from: classes2.dex */
    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            BannerListener bannerListener = C1424n.this.f25735d;
            if (bannerListener != null) {
                bannerListener.onBannerAdClicked();
                IronLog.CALLBACK.info("onBannerAdClicked()");
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.n$i */
    /* loaded from: classes2.dex */
    public class i implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ AdInfo f25745s;

        public i(AdInfo adInfo) {
            this.f25745s = adInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1424n c1424n = C1424n.this;
            LevelPlayBannerListener levelPlayBannerListener = c1424n.f25736e;
            if (levelPlayBannerListener != null) {
                AdInfo adInfo = this.f25745s;
                levelPlayBannerListener.onAdClicked(c1424n.f(adInfo));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + c1424n.f(adInfo));
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.n$j */
    /* loaded from: classes2.dex */
    public class j implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ AdInfo f25747s;

        public j(AdInfo adInfo) {
            this.f25747s = adInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1424n c1424n = C1424n.this;
            LevelPlayBannerListener levelPlayBannerListener = c1424n.f25736e;
            if (levelPlayBannerListener != null) {
                AdInfo adInfo = this.f25747s;
                levelPlayBannerListener.onAdLoaded(c1424n.f(adInfo));
                IronLog.CALLBACK.info("onAdLoaded() adInfo = " + c1424n.f(adInfo));
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.n$k */
    /* loaded from: classes2.dex */
    public class k implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f25749s;

        public k(IronSourceError ironSourceError) {
            this.f25749s = ironSourceError;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BannerListener bannerListener = C1424n.this.f25735d;
            if (bannerListener != null) {
                IronSourceError ironSourceError = this.f25749s;
                bannerListener.onBannerAdLoadFailed(ironSourceError);
                IronLog.CALLBACK.info("onBannerAdLoadFailed() error = " + ironSourceError.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.n$l */
    /* loaded from: classes2.dex */
    public class l implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f25751s;

        public l(IronSourceError ironSourceError) {
            this.f25751s = ironSourceError;
        }

        @Override // java.lang.Runnable
        public final void run() {
            LevelPlayBannerListener levelPlayBannerListener = C1424n.this.f25736e;
            if (levelPlayBannerListener != null) {
                IronSourceError ironSourceError = this.f25751s;
                levelPlayBannerListener.onAdLoadFailed(ironSourceError);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + ironSourceError.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.n$m */
    /* loaded from: classes2.dex */
    public class m implements Runnable {
        public m() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            BannerListener bannerListener = C1424n.this.f25735d;
            if (bannerListener != null) {
                bannerListener.onBannerAdScreenPresented();
                IronLog.CALLBACK.info("onBannerAdScreenPresented()");
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.n$n, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class RunnableC0333n implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ AdInfo f25754s;

        public RunnableC0333n(AdInfo adInfo) {
            this.f25754s = adInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1424n c1424n = C1424n.this;
            LevelPlayBannerListener levelPlayBannerListener = c1424n.f25736e;
            if (levelPlayBannerListener != null) {
                AdInfo adInfo = this.f25754s;
                levelPlayBannerListener.onAdScreenPresented(c1424n.f(adInfo));
                IronLog.CALLBACK.info("onAdScreenPresented() adInfo = " + c1424n.f(adInfo));
            }
        }
    }

    private C1424n() {
    }

    public static C1424n a() {
        return f;
    }

    public final void b(AdInfo adInfo) {
        if (this.f25735d != null) {
            com.ironsource.environment.e.c.f24668a.b(new c());
        }
        if (this.f25736e != null) {
            com.ironsource.environment.e.c.f24668a.b(new d(adInfo));
        }
    }

    public final void c(AdInfo adInfo) {
        if (this.f25735d != null) {
            com.ironsource.environment.e.c.f24668a.b(new e());
        }
        if (this.f25736e != null) {
            com.ironsource.environment.e.c.f24668a.b(new g(adInfo));
        }
    }

    public final void d(AdInfo adInfo) {
        if (this.f25735d != null) {
            com.ironsource.environment.e.c.f24668a.b(new h());
        }
        if (this.f25736e != null) {
            com.ironsource.environment.e.c.f24668a.b(new i(adInfo));
        }
    }

    public final void a(AdInfo adInfo) {
        if (this.f25735d != null) {
            com.ironsource.environment.e.c.f24668a.b(new m());
        }
        if (this.f25736e != null) {
            com.ironsource.environment.e.c.f24668a.b(new RunnableC0333n(adInfo));
        }
    }

    public final void a(AdInfo adInfo, boolean z10) {
        if (this.f25735d != null && !z10) {
            com.ironsource.environment.e.c.f24668a.b(new f());
        }
        if (this.f25736e != null) {
            com.ironsource.environment.e.c.f24668a.b(new j(adInfo));
        }
    }

    public final void a(IronSourceError ironSourceError, boolean z10) {
        if (this.f25735d != null && !z10) {
            com.ironsource.environment.e.c.f24668a.b(new k(ironSourceError));
        }
        if (this.f25736e != null) {
            com.ironsource.environment.e.c.f24668a.b(new l(ironSourceError));
        }
    }
}
