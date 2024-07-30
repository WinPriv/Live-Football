package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.mediationsdk.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1427q implements BannerSmashListener {

    /* renamed from: a, reason: collision with root package name */
    public AbstractAdapter f25790a;

    /* renamed from: b, reason: collision with root package name */
    public NetworkSettings f25791b;

    /* renamed from: c, reason: collision with root package name */
    public Timer f25792c;

    /* renamed from: d, reason: collision with root package name */
    public final long f25793d;

    /* renamed from: e, reason: collision with root package name */
    public a f25794e = a.NO_INIT;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public final com.ironsource.mediationsdk.sdk.a f25795g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f25796h;

    /* renamed from: i, reason: collision with root package name */
    public IronSourceBannerLayout f25797i;

    /* renamed from: com.ironsource.mediationsdk.q$a */
    /* loaded from: classes2.dex */
    public enum a {
        NO_INIT,
        INIT_IN_PROGRESS,
        LOAD_IN_PROGRESS,
        LOADED,
        LOAD_FAILED,
        DESTROYED
    }

    /* renamed from: com.ironsource.mediationsdk.q$h */
    /* loaded from: classes2.dex */
    public class h extends TimerTask {
        public h() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            com.ironsource.mediationsdk.sdk.a aVar;
            IronSourceError ironSourceError;
            cancel();
            C1427q c1427q = C1427q.this;
            a aVar2 = c1427q.f25794e;
            if (aVar2 == a.INIT_IN_PROGRESS) {
                c1427q.b(a.NO_INIT);
                c1427q.c("init timed out");
                aVar = c1427q.f25795g;
                ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_INIT_TIMEOUT, "Timed out");
            } else if (aVar2 == a.LOAD_IN_PROGRESS) {
                c1427q.b(a.LOAD_FAILED);
                c1427q.c("load timed out");
                aVar = c1427q.f25795g;
                ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_TIMEOUT, "Timed out");
            } else {
                if (aVar2 == a.LOADED) {
                    c1427q.b(a.LOAD_FAILED);
                    c1427q.c("reload timed out");
                    c1427q.f25795g.b(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_RELOAD_TIMEOUT, "Timed out"), c1427q, false);
                    return;
                }
                return;
            }
            aVar.a(ironSourceError, c1427q, false);
        }
    }

    public C1427q(com.ironsource.mediationsdk.sdk.a aVar, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, long j10, int i10) {
        this.f = i10;
        this.f25795g = aVar;
        this.f25790a = abstractAdapter;
        this.f25791b = networkSettings;
        this.f25793d = j10;
        abstractAdapter.addBannerListener(this);
    }

    public final String a() {
        return this.f25791b.isMultipleInstances() ? this.f25791b.getProviderTypeForReflection() : this.f25791b.getProviderName();
    }

    public final void b(a aVar) {
        this.f25794e = aVar;
        c("state=" + aVar.name());
    }

    public final void c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_API, "BannerSmash " + a() + " " + str, 1);
    }

    public final void d(String str, String str2) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        StringBuilder l10 = com.ironsource.adapters.facebook.a.l(str, " Banner exception: ");
        l10.append(a());
        l10.append(" | ");
        l10.append(str2);
        logger.log(ironSourceTag, l10.toString(), 3);
    }

    public final void e() {
        try {
            f();
            Timer timer = new Timer();
            this.f25792c = timer;
            timer.schedule(new h(), this.f25793d);
        } catch (Exception e10) {
            d("startLoadTimer", e10.getLocalizedMessage());
        }
    }

    public final void f() {
        try {
            Timer timer = this.f25792c;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e10) {
            d("stopLoadTimer", e10.getLocalizedMessage());
        } finally {
            this.f25792c = null;
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdClicked() {
        com.ironsource.mediationsdk.sdk.a aVar = this.f25795g;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdLeftApplication() {
        com.ironsource.mediationsdk.sdk.a aVar = this.f25795g;
        if (aVar != null) {
            aVar.d(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        boolean z10;
        c("onBannerAdLoadFailed()");
        f();
        if (ironSourceError.getErrorCode() == 606) {
            z10 = true;
        } else {
            z10 = false;
        }
        a aVar = this.f25794e;
        a aVar2 = a.LOAD_IN_PROGRESS;
        com.ironsource.mediationsdk.sdk.a aVar3 = this.f25795g;
        if (aVar == aVar2) {
            b(a.LOAD_FAILED);
            aVar3.a(ironSourceError, this, z10);
        } else if (aVar == a.LOADED) {
            aVar3.b(ironSourceError, this, z10);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        c("onBannerAdLoaded()");
        f();
        a aVar = this.f25794e;
        a aVar2 = a.LOAD_IN_PROGRESS;
        com.ironsource.mediationsdk.sdk.a aVar3 = this.f25795g;
        if (aVar == aVar2) {
            b(a.LOADED);
            aVar3.a(this, view, layoutParams);
        } else if (aVar == a.LOADED) {
            aVar3.a(this, view, layoutParams, this.f25790a.shouldBindBannerViewOnReload());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdScreenDismissed() {
        com.ironsource.mediationsdk.sdk.a aVar = this.f25795g;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdScreenPresented() {
        com.ironsource.mediationsdk.sdk.a aVar = this.f25795g;
        if (aVar != null) {
            aVar.c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdShown() {
        com.ironsource.mediationsdk.sdk.a aVar = this.f25795g;
        if (aVar != null) {
            aVar.e(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerInitFailed(IronSourceError ironSourceError) {
        f();
        if (this.f25794e == a.INIT_IN_PROGRESS) {
            this.f25795g.a(new IronSourceError(612, "Banner init failed"), this, false);
            b(a.NO_INIT);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerInitSuccess() {
        String str;
        f();
        if (this.f25794e == a.INIT_IN_PROGRESS) {
            IronSourceBannerLayout ironSourceBannerLayout = this.f25797i;
            if (ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed()) {
                e();
                b(a.LOAD_IN_PROGRESS);
                this.f25790a.loadBanner(this.f25797i, this.f25791b.getBannerSettings(), null, this);
            } else {
                if (this.f25797i == null) {
                    str = "banner is null";
                } else {
                    str = "banner is destroyed";
                }
                this.f25795g.a(new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, str), this, false);
            }
        }
    }

    public final void a(IronSourceBannerLayout ironSourceBannerLayout, String str, String str2) {
        c("loadBanner");
        this.f25796h = false;
        com.ironsource.mediationsdk.sdk.a aVar = this.f25795g;
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
            c("loadBanner - bannerLayout is null or destroyed");
            aVar.a(new IronSourceError(610, ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed"), this, false);
            return;
        }
        if (this.f25790a == null) {
            c("loadBanner - mAdapter is null");
            aVar.a(new IronSourceError(611, "adapter==null"), this, false);
            return;
        }
        this.f25797i = ironSourceBannerLayout;
        e();
        if (this.f25794e != a.NO_INIT) {
            b(a.LOAD_IN_PROGRESS);
            this.f25790a.loadBanner(ironSourceBannerLayout, this.f25791b.getBannerSettings(), null, this);
            return;
        }
        b(a.INIT_IN_PROGRESS);
        if (this.f25790a != null) {
            try {
                String str3 = L.a().f24866s;
                if (!TextUtils.isEmpty(str3)) {
                    this.f25790a.setMediationSegment(str3);
                }
                String pluginType = ConfigFile.getConfigFile().getPluginType();
                if (!TextUtils.isEmpty(pluginType)) {
                    this.f25790a.setPluginData(pluginType, ConfigFile.getConfigFile().getPluginFrameworkVersion());
                }
            } catch (Exception e10) {
                c(":setCustomParams():" + e10.toString());
            }
        }
        this.f25790a.initBanners(str, str2, this.f25791b.getBannerSettings(), this);
    }
}
