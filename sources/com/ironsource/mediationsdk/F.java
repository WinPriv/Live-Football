package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.InterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;

/* loaded from: classes2.dex */
public final class F extends com.ironsource.mediationsdk.sdk.b {
    public static final F f = new F();

    /* renamed from: d, reason: collision with root package name */
    public InterstitialListener f24772d = null;

    /* renamed from: e, reason: collision with root package name */
    public LevelPlayInterstitialListener f24773e;

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            InterstitialListener interstitialListener = F.this.f24772d;
            if (interstitialListener != null) {
                interstitialListener.onInterstitialAdOpened();
                F.b("onInterstitialAdOpened()");
            }
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ AdInfo f24775s;

        public c(AdInfo adInfo) {
            this.f24775s = adInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            F f = F.this;
            LevelPlayInterstitialListener levelPlayInterstitialListener = f.f24773e;
            if (levelPlayInterstitialListener != null) {
                AdInfo adInfo = this.f24775s;
                levelPlayInterstitialListener.onAdOpened(f.f(adInfo));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + f.f(adInfo));
            }
        }
    }

    /* loaded from: classes2.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            InterstitialListener interstitialListener = F.this.f24772d;
            if (interstitialListener != null) {
                interstitialListener.onInterstitialAdClosed();
                F.b("onInterstitialAdClosed()");
            }
        }
    }

    /* loaded from: classes2.dex */
    public class e implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ AdInfo f24778s;

        public e(AdInfo adInfo) {
            this.f24778s = adInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            F f = F.this;
            LevelPlayInterstitialListener levelPlayInterstitialListener = f.f24773e;
            if (levelPlayInterstitialListener != null) {
                AdInfo adInfo = this.f24778s;
                levelPlayInterstitialListener.onAdClosed(f.f(adInfo));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + f.f(adInfo));
            }
        }
    }

    /* loaded from: classes2.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            InterstitialListener interstitialListener = F.this.f24772d;
            if (interstitialListener != null) {
                interstitialListener.onInterstitialAdShowSucceeded();
                F.b("onInterstitialAdShowSucceeded()");
            }
        }
    }

    /* loaded from: classes2.dex */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            InterstitialListener interstitialListener = F.this.f24772d;
            if (interstitialListener != null) {
                interstitialListener.onInterstitialAdReady();
                F.b("onInterstitialAdReady()");
            }
        }
    }

    /* loaded from: classes2.dex */
    public class h implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ AdInfo f24782s;

        public h(AdInfo adInfo) {
            this.f24782s = adInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            F f = F.this;
            LevelPlayInterstitialListener levelPlayInterstitialListener = f.f24773e;
            if (levelPlayInterstitialListener != null) {
                AdInfo adInfo = this.f24782s;
                levelPlayInterstitialListener.onAdShowSucceeded(f.f(adInfo));
                IronLog.CALLBACK.info("onAdShowSucceeded() adInfo = " + f.f(adInfo));
            }
        }
    }

    /* loaded from: classes2.dex */
    public class i implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f24784s;

        public i(IronSourceError ironSourceError) {
            this.f24784s = ironSourceError;
        }

        @Override // java.lang.Runnable
        public final void run() {
            InterstitialListener interstitialListener = F.this.f24772d;
            if (interstitialListener != null) {
                IronSourceError ironSourceError = this.f24784s;
                interstitialListener.onInterstitialAdShowFailed(ironSourceError);
                F.b("onInterstitialAdShowFailed() error=" + ironSourceError.getErrorMessage());
            }
        }
    }

    /* loaded from: classes2.dex */
    public class j implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f24786s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ AdInfo f24787t;

        public j(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f24786s = ironSourceError;
            this.f24787t = adInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            F f = F.this;
            LevelPlayInterstitialListener levelPlayInterstitialListener = f.f24773e;
            if (levelPlayInterstitialListener != null) {
                AdInfo adInfo = this.f24787t;
                AdInfo f10 = f.f(adInfo);
                IronSourceError ironSourceError = this.f24786s;
                levelPlayInterstitialListener.onAdShowFailed(ironSourceError, f10);
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + f.f(adInfo) + ", error = " + ironSourceError.getErrorMessage());
            }
        }
    }

    /* loaded from: classes2.dex */
    public class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            InterstitialListener interstitialListener = F.this.f24772d;
            if (interstitialListener != null) {
                interstitialListener.onInterstitialAdClicked();
                F.b("onInterstitialAdClicked()");
            }
        }
    }

    /* loaded from: classes2.dex */
    public class l implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ AdInfo f24790s;

        public l(AdInfo adInfo) {
            this.f24790s = adInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            F f = F.this;
            LevelPlayInterstitialListener levelPlayInterstitialListener = f.f24773e;
            if (levelPlayInterstitialListener != null) {
                AdInfo adInfo = this.f24790s;
                levelPlayInterstitialListener.onAdClicked(f.f(adInfo));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + f.f(adInfo));
            }
        }
    }

    /* loaded from: classes2.dex */
    public class m implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ AdInfo f24792s;

        public m(AdInfo adInfo) {
            this.f24792s = adInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            F f = F.this;
            LevelPlayInterstitialListener levelPlayInterstitialListener = f.f24773e;
            if (levelPlayInterstitialListener != null) {
                AdInfo adInfo = this.f24792s;
                levelPlayInterstitialListener.onAdReady(f.f(adInfo));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + f.f(adInfo));
            }
        }
    }

    /* loaded from: classes2.dex */
    public class n implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f24794s;

        public n(IronSourceError ironSourceError) {
            this.f24794s = ironSourceError;
        }

        @Override // java.lang.Runnable
        public final void run() {
            InterstitialListener interstitialListener = F.this.f24772d;
            if (interstitialListener != null) {
                IronSourceError ironSourceError = this.f24794s;
                interstitialListener.onInterstitialAdLoadFailed(ironSourceError);
                F.b("onInterstitialAdLoadFailed() error=" + ironSourceError.getErrorMessage());
            }
        }
    }

    /* loaded from: classes2.dex */
    public class o implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f24796s;

        public o(IronSourceError ironSourceError) {
            this.f24796s = ironSourceError;
        }

        @Override // java.lang.Runnable
        public final void run() {
            LevelPlayInterstitialListener levelPlayInterstitialListener = F.this.f24773e;
            if (levelPlayInterstitialListener != null) {
                IronSourceError ironSourceError = this.f24796s;
                levelPlayInterstitialListener.onAdLoadFailed(ironSourceError);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + ironSourceError.getErrorMessage());
            }
        }
    }

    private F() {
    }

    public static synchronized F a() {
        F f10;
        synchronized (F.class) {
            f10 = f;
        }
        return f10;
    }

    public static /* synthetic */ void b(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }

    public final void c(AdInfo adInfo) {
        if (this.f24772d != null) {
            com.ironsource.environment.e.c.f24668a.b(new d());
        }
        if (this.f24773e != null) {
            com.ironsource.environment.e.c.f24668a.b(new e(adInfo));
        }
    }

    public final void d(AdInfo adInfo) {
        if (this.f24772d != null) {
            com.ironsource.environment.e.c.f24668a.b(new f());
        }
        if (this.f24773e != null) {
            com.ironsource.environment.e.c.f24668a.b(new h(adInfo));
        }
    }

    public final void e(AdInfo adInfo) {
        if (this.f24772d != null) {
            com.ironsource.environment.e.c.f24668a.b(new k());
        }
        if (this.f24773e != null) {
            com.ironsource.environment.e.c.f24668a.b(new l(adInfo));
        }
    }

    public final void a(AdInfo adInfo) {
        if (this.f24772d != null) {
            com.ironsource.environment.e.c.f24668a.b(new g());
        }
        if (this.f24773e != null) {
            com.ironsource.environment.e.c.f24668a.b(new m(adInfo));
        }
    }

    public final void b(AdInfo adInfo) {
        if (this.f24772d != null) {
            com.ironsource.environment.e.c.f24668a.b(new b());
        }
        if (this.f24773e != null) {
            com.ironsource.environment.e.c.f24668a.b(new c(adInfo));
        }
    }

    public final void a(IronSourceError ironSourceError) {
        if (this.f24772d != null) {
            com.ironsource.environment.e.c.f24668a.b(new n(ironSourceError));
        }
        if (this.f24773e != null) {
            com.ironsource.environment.e.c.f24668a.b(new o(ironSourceError));
        }
    }

    public final void a(IronSourceError ironSourceError, AdInfo adInfo) {
        if (this.f24772d != null) {
            com.ironsource.environment.e.c.f24668a.b(new i(ironSourceError));
        }
        if (this.f24773e != null) {
            com.ironsource.environment.e.c.f24668a.b(new j(ironSourceError, adInfo));
        }
    }

    public final synchronized void a(InterstitialListener interstitialListener) {
        this.f24772d = interstitialListener;
    }

    public final synchronized void a(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        this.f24773e = levelPlayInterstitialListener;
    }
}
