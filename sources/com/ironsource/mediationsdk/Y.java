package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.AbstractC1414b;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBidderInterface;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Date;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Y extends ac implements AdapterBidderInterface, InterstitialSmashListener {

    /* renamed from: h, reason: collision with root package name */
    public a f25011h;

    /* renamed from: i, reason: collision with root package name */
    public final X f25012i;

    /* renamed from: j, reason: collision with root package name */
    public Timer f25013j;

    /* renamed from: k, reason: collision with root package name */
    public final int f25014k;

    /* renamed from: l, reason: collision with root package name */
    public final String f25015l;

    /* renamed from: m, reason: collision with root package name */
    public final String f25016m;

    /* renamed from: n, reason: collision with root package name */
    public long f25017n;
    public JSONObject o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f25018p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f25019q;

    /* loaded from: classes2.dex */
    public enum a {
        NO_INIT,
        INIT_IN_PROGRESS,
        INIT_SUCCESS,
        LOAD_IN_PROGRESS,
        LOADED,
        LOAD_FAILED
    }

    /* loaded from: classes2.dex */
    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            StringBuilder sb2 = new StringBuilder("timed out state=");
            Y y = Y.this;
            sb2.append(y.f25011h.name());
            sb2.append(" isBidder=");
            sb2.append(y.g());
            y.f(sb2.toString());
            if (y.f25011h == a.INIT_IN_PROGRESS && y.g()) {
                y.b(a.NO_INIT);
                return;
            }
            y.b(a.LOAD_FAILED);
            y.f25012i.a(ErrorBuilder.buildLoadFailedError("timed out"), y, new Date().getTime() - y.f25017n);
        }
    }

    public Y(String str, String str2, NetworkSettings networkSettings, X x10, int i10, AbstractAdapter abstractAdapter) {
        super(new com.ironsource.mediationsdk.model.a(networkSettings, networkSettings.getInterstitialSettings(), IronSource.AD_UNIT.INTERSTITIAL), abstractAdapter);
        this.f25018p = new Object();
        this.f25011h = a.NO_INIT;
        this.f25015l = str;
        this.f25016m = str2;
        this.f25012i = x10;
        this.f25013j = null;
        this.f25014k = i10;
        this.f25098a.addInterstitialListener(this);
        this.o = null;
    }

    public final void a() {
        f("isBidder = " + g() + ", shouldEarlyInit = " + h());
        this.f25019q = true;
        b(a.INIT_IN_PROGRESS);
        r();
        try {
            boolean g6 = g();
            JSONObject jSONObject = this.f25101d;
            String str = this.f25016m;
            String str2 = this.f25015l;
            if (g6) {
                this.f25098a.initInterstitialForBidding(str2, str, jSONObject, this);
            } else {
                this.f25098a.initInterstitial(str2, str, jSONObject, this);
            }
        } catch (Throwable th) {
            q(k() + " initForBidding exception : " + th.getLocalizedMessage());
            th.printStackTrace();
            onInterstitialInitFailed(new IronSourceError(IronSourceError.ERROR_IS_INIT_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    public final void b(a aVar) {
        f("current state=" + this.f25011h + ", new state=" + aVar);
        this.f25011h = aVar;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBidderInterface
    public final void collectBiddingData(JSONObject jSONObject, BiddingDataCallback biddingDataCallback) {
        com.ironsource.mediationsdk.a.d.d().b(new com.ironsource.mediationsdk.a.c(IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN, new JSONObject(n())));
        this.f25098a.collectInterstitialBiddingData(this.f25101d, jSONObject, biddingDataCallback);
    }

    public final void e(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "ProgIsSmash " + k() + " : " + str, 0);
    }

    public final void f(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgIsSmash " + k() + " : " + str, 0);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBidderInterface
    public final Map<String, Object> getBiddingData(JSONObject jSONObject) {
        try {
            if (!g()) {
                return null;
            }
            return this.f25098a.getInterstitialBiddingData(this.f25101d, jSONObject);
        } catch (Throwable th) {
            q("getBiddingData exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            return null;
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdClicked() {
        e("onInterstitialAdClicked");
        this.f25012i.d(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdClosed() {
        e("onInterstitialAdClosed");
        this.f25012i.b(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        e("onInterstitialAdLoadFailed error=" + ironSourceError.getErrorMessage() + " state=" + this.f25011h.name());
        s();
        if (this.f25011h != a.LOAD_IN_PROGRESS) {
            return;
        }
        b(a.LOAD_FAILED);
        this.f25012i.a(ironSourceError, this, new Date().getTime() - this.f25017n);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdOpened() {
        e("onInterstitialAdOpened");
        this.f25012i.a(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdReady() {
        e("onInterstitialAdReady state=" + this.f25011h.name());
        s();
        if (this.f25011h != a.LOAD_IN_PROGRESS) {
            return;
        }
        b(a.LOADED);
        this.f25012i.a(this, new Date().getTime() - this.f25017n);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        e("onInterstitialAdShowFailed error=" + ironSourceError.getErrorMessage());
        this.f25012i.a(ironSourceError, this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdShowSucceeded() {
        e("onInterstitialAdShowSucceeded");
        this.f25012i.c(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdVisible() {
        e("onInterstitialAdVisible");
        this.f25012i.e(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialInitFailed(IronSourceError ironSourceError) {
        e("onInterstitialInitFailed error" + ironSourceError.getErrorMessage() + " state=" + this.f25011h.name());
        if (this.f25011h != a.INIT_IN_PROGRESS) {
            return;
        }
        s();
        b(a.NO_INIT);
        X x10 = this.f25012i;
        x10.b(ironSourceError, this);
        if (!g()) {
            x10.a(ironSourceError, this, e0.i.e() - this.f25017n);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialInitSuccess() {
        e("onInterstitialInitSuccess state=" + this.f25011h.name());
        if (this.f25011h != a.INIT_IN_PROGRESS) {
            return;
        }
        s();
        if (!g() && !this.f25019q) {
            b(a.LOAD_IN_PROGRESS);
            t();
            try {
                this.f25098a.loadInterstitial(this.f25101d, this.o, this);
            } catch (Throwable th) {
                q("onInterstitialInitSuccess exception: " + th.getLocalizedMessage());
                th.printStackTrace();
                onInterstitialAdLoadFailed(new IronSourceError(IronSourceConstants.errorCode_loadException, th.getLocalizedMessage()));
            }
        } else {
            this.f25019q = false;
            b(a.INIT_SUCCESS);
        }
        this.f25012i.f(this);
    }

    public final void q(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgIsSmash " + k() + " : " + str, 3);
    }

    public final void r() {
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
            f("setCustomParams() " + e10.getMessage());
        }
    }

    public final void s() {
        synchronized (this.f25018p) {
            Timer timer = this.f25013j;
            if (timer != null) {
                timer.cancel();
                this.f25013j = null;
            }
        }
    }

    public final void t() {
        synchronized (this.f25018p) {
            f("start timer");
            s();
            Timer timer = new Timer();
            this.f25013j = timer;
            timer.schedule(new b(), this.f25014k * 1000);
        }
    }

    public final void a(String str, JSONObject jSONObject) {
        try {
            this.f25017n = new Date().getTime();
            this.o = jSONObject;
            f("loadInterstitial");
            this.f25100c = false;
            boolean g6 = g();
            JSONObject jSONObject2 = this.f25101d;
            if (g6) {
                t();
                b(a.LOAD_IN_PROGRESS);
                this.f25098a.loadInterstitialForBidding(jSONObject2, jSONObject, this, str);
            } else if (this.f25011h != a.NO_INIT) {
                t();
                b(a.LOAD_IN_PROGRESS);
                this.f25098a.loadInterstitial(jSONObject2, jSONObject, this);
            } else {
                t();
                b(a.INIT_IN_PROGRESS);
                r();
                this.f25098a.initInterstitial(this.f25015l, this.f25016m, jSONObject2, this);
            }
        } catch (Throwable th) {
            q("loadInterstitial exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            onInterstitialAdLoadFailed(new IronSourceError(IronSourceConstants.errorCode_loadException, th.getLocalizedMessage()));
        }
    }

    public final void b() {
        try {
            this.f25098a.showInterstitial(this.f25101d, this);
        } catch (Throwable th) {
            q(k() + "showInterstitial exception : " + th.getLocalizedMessage());
            th.printStackTrace();
            onInterstitialAdShowFailed(new IronSourceError(IronSourceError.ERROR_IS_SHOW_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    public final void e() {
        this.f25098a.setMediationState(AbstractC1414b.a.CAPPED_PER_SESSION, "interstitial");
    }

    public final boolean f() {
        try {
            return this.f25098a.isInterstitialReady(this.f25101d);
        } catch (Throwable th) {
            q("isReadyToShow exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            return false;
        }
    }
}
