package com.ironsource.mediationsdk.sdk;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Date;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class i implements InterstitialListener, RewardedVideoListener, SegmentListener, com.ironsource.mediationsdk.sdk.f {

    /* renamed from: a, reason: collision with root package name */
    public RewardedVideoListener f25814a;

    /* renamed from: b, reason: collision with root package name */
    public InterstitialListener f25815b;

    /* renamed from: c, reason: collision with root package name */
    public OfferwallListener f25816c;

    /* renamed from: d, reason: collision with root package name */
    public SegmentListener f25817d;

    /* renamed from: e, reason: collision with root package name */
    public InterstitialPlacement f25818e = null;
    public String f = null;

    /* renamed from: g, reason: collision with root package name */
    public final v f25819g;

    /* renamed from: h, reason: collision with root package name */
    public long f25820h;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f25821s;

        public a(IronSourceError ironSourceError) {
            this.f25821s = ironSourceError;
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.this.f25816c.onOfferwallShowFailed(this.f25821s);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f25823s;

        public b(IronSourceError ironSourceError) {
            this.f25823s = ironSourceError;
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.this.f25816c.onGetOfferwallCreditsFailed(this.f25823s);
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.this.f25814a.onRewardedVideoAdOpened();
        }
    }

    /* loaded from: classes2.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.this.f25816c.onOfferwallClosed();
        }
    }

    /* loaded from: classes2.dex */
    public class e implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ boolean f25827s;

        public e(boolean z10) {
            this.f25827s = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.this.f25816c.onOfferwallAvailable(this.f25827s);
        }
    }

    /* loaded from: classes2.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.this.f25814a.onRewardedVideoAdClosed();
        }
    }

    /* loaded from: classes2.dex */
    public class g implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ boolean f25830s;

        public g(boolean z10) {
            this.f25830s = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.this.f25814a.onRewardedVideoAvailabilityChanged(this.f25830s);
        }
    }

    /* loaded from: classes2.dex */
    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.this.f25814a.onRewardedVideoAdStarted();
        }
    }

    /* renamed from: com.ironsource.mediationsdk.sdk.i$i, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class RunnableC0334i implements Runnable {
        public RunnableC0334i() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.this.f25814a.onRewardedVideoAdEnded();
        }
    }

    /* loaded from: classes2.dex */
    public class j implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Placement f25834s;

        public j(Placement placement) {
            this.f25834s = placement;
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.this.f25814a.onRewardedVideoAdRewarded(this.f25834s);
        }
    }

    /* loaded from: classes2.dex */
    public class k implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f25836s;

        public k(String str) {
            this.f25836s = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str = this.f25836s;
            if (!TextUtils.isEmpty(str)) {
                i.this.f25817d.onSegmentReceived(str);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class l implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Placement f25838s;

        public l(Placement placement) {
            this.f25838s = placement;
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.this.f25814a.onRewardedVideoAdClicked(this.f25838s);
        }
    }

    /* loaded from: classes2.dex */
    public class m implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f25840s;

        public m(IronSourceError ironSourceError) {
            this.f25840s = ironSourceError;
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.this.f25814a.onRewardedVideoAdShowFailed(this.f25840s);
        }
    }

    /* loaded from: classes2.dex */
    public class n implements Runnable {
        public n() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.this.f25815b.onInterstitialAdReady();
        }
    }

    /* loaded from: classes2.dex */
    public class o implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f25843s;

        public o(IronSourceError ironSourceError) {
            this.f25843s = ironSourceError;
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.this.f25815b.onInterstitialAdLoadFailed(this.f25843s);
        }
    }

    /* loaded from: classes2.dex */
    public class p implements Runnable {
        public p() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.this.f25815b.onInterstitialAdOpened();
        }
    }

    /* loaded from: classes2.dex */
    public class q implements Runnable {
        public q() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.this.f25815b.onInterstitialAdShowSucceeded();
        }
    }

    /* loaded from: classes2.dex */
    public class r implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f25847s;

        public r(IronSourceError ironSourceError) {
            this.f25847s = ironSourceError;
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.this.f25815b.onInterstitialAdShowFailed(this.f25847s);
        }
    }

    /* loaded from: classes2.dex */
    public class s implements Runnable {
        public s() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.this.f25815b.onInterstitialAdClicked();
        }
    }

    /* loaded from: classes2.dex */
    public class t implements Runnable {
        public t() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.this.f25815b.onInterstitialAdClosed();
        }
    }

    /* loaded from: classes2.dex */
    public class u implements Runnable {
        public u() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.this.f25816c.onOfferwallOpened();
        }
    }

    /* loaded from: classes2.dex */
    public class v extends Thread {

        /* renamed from: s, reason: collision with root package name */
        public Handler f25852s;

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Looper.prepare();
            this.f25852s = new Handler();
            Looper.loop();
        }
    }

    public i() {
        v vVar = new v();
        this.f25819g = vVar;
        vVar.start();
        this.f25820h = new Date().getTime();
    }

    public final void a(IronSourceError ironSourceError, Map<String, Object> map) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "onRewardedVideoAdShowFailed(" + ironSourceError.toString() + ")", 1);
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, ironSourceError.getErrorCode());
            mediationAdditionalData.put("reason", ironSourceError.getErrorMessage());
            if (!TextUtils.isEmpty(this.f)) {
                mediationAdditionalData.put("placement", this.f);
            }
            if (map != null) {
                for (String str : map.keySet()) {
                    mediationAdditionalData.put(str, map.get(str));
                }
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, mediationAdditionalData));
        if (c(this.f25814a)) {
            b(new m(ironSourceError));
        }
    }

    public final void b(Runnable runnable) {
        Handler handler;
        v vVar = this.f25819g;
        if (vVar != null && (handler = vVar.f25852s) != null) {
            handler.post(runnable);
        }
    }

    public final boolean c(Object obj) {
        if (obj != null && this.f25819g != null) {
            return true;
        }
        return false;
    }

    @Override // com.ironsource.mediationsdk.sdk.f, com.ironsource.mediationsdk.sdk.OfferwallListener
    public final void onGetOfferwallCreditsFailed(IronSourceError ironSourceError) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onGetOfferwallCreditsFailed(" + ironSourceError + ")", 1);
        if (c(this.f25816c)) {
            b(new b(ironSourceError));
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialListener
    public final void onInterstitialAdClicked() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdClicked()", 1);
        if (c(this.f25815b)) {
            b(new s());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialListener
    public final void onInterstitialAdClosed() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdClosed()", 1);
        if (c(this.f25815b)) {
            b(new t());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialListener
    public final void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdLoadFailed(" + ironSourceError + ")", 1);
        if (c(this.f25815b)) {
            b(new o(ironSourceError));
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialListener
    public final void onInterstitialAdOpened() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdOpened()", 1);
        if (c(this.f25815b)) {
            b(new p());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialListener
    public final void onInterstitialAdReady() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdReady()", 1);
        if (c(this.f25815b)) {
            b(new n());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialListener
    public final void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdShowFailed(" + ironSourceError + ")", 1);
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, ironSourceError.getErrorCode());
            InterstitialPlacement interstitialPlacement = this.f25818e;
            if (interstitialPlacement != null && !TextUtils.isEmpty(interstitialPlacement.getPlacementName())) {
                mediationAdditionalData.put("placement", this.f25818e.getPlacementName());
            }
            if (ironSourceError.getErrorMessage() != null) {
                mediationAdditionalData.put("reason", ironSourceError.getErrorMessage());
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        com.ironsource.mediationsdk.a.d.d().b(new com.ironsource.mediationsdk.a.c(IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, mediationAdditionalData));
        if (c(this.f25815b)) {
            b(new r(ironSourceError));
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialListener
    public final void onInterstitialAdShowSucceeded() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdShowSucceeded()", 1);
        if (c(this.f25815b)) {
            b(new q());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.f, com.ironsource.mediationsdk.sdk.OfferwallListener
    public final boolean onOfferwallAdCredited(int i10, int i11, boolean z10) {
        boolean z11;
        OfferwallListener offerwallListener = this.f25816c;
        if (offerwallListener != null) {
            z11 = offerwallListener.onOfferwallAdCredited(i10, i11, z10);
        } else {
            z11 = false;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        StringBuilder r10 = a3.l.r("onOfferwallAdCredited(credits:", i10, ", totalCredits:", i11, ", totalCreditsFlag:");
        r10.append(z10);
        r10.append("):");
        r10.append(z11);
        logger.log(ironSourceTag, r10.toString(), 1);
        return z11;
    }

    @Override // com.ironsource.mediationsdk.sdk.f, com.ironsource.mediationsdk.sdk.OfferwallListener
    public final void onOfferwallAvailable(boolean z10) {
        a(z10, (IronSourceError) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.f, com.ironsource.mediationsdk.sdk.OfferwallListener
    public final void onOfferwallClosed() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onOfferwallClosed()", 1);
        if (c(this.f25816c)) {
            b(new d());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.f, com.ironsource.mediationsdk.sdk.OfferwallListener
    public final void onOfferwallOpened() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onOfferwallOpened()", 1);
        if (c(this.f25816c)) {
            b(new u());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.f, com.ironsource.mediationsdk.sdk.OfferwallListener
    public final void onOfferwallShowFailed(IronSourceError ironSourceError) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onOfferwallShowFailed(" + ironSourceError + ")", 1);
        if (c(this.f25816c)) {
            b(new a(ironSourceError));
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoListener
    public final void onRewardedVideoAdClicked(Placement placement) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdClicked(" + placement.getPlacementName() + ")", 1);
        if (c(this.f25814a)) {
            b(new l(placement));
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoListener
    public final void onRewardedVideoAdClosed() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdClosed()", 1);
        if (c(this.f25814a)) {
            b(new f());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoListener
    public final void onRewardedVideoAdEnded() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdEnded()", 1);
        if (c(this.f25814a)) {
            b(new RunnableC0334i());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoListener
    public final void onRewardedVideoAdOpened() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdOpened()", 1);
        if (c(this.f25814a)) {
            b(new c());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoListener
    public final void onRewardedVideoAdRewarded(Placement placement) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdRewarded(" + placement.toString() + ")", 1);
        if (c(this.f25814a)) {
            b(new j(placement));
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoListener
    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        a(ironSourceError, (Map<String, Object>) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoListener
    public final void onRewardedVideoAdStarted() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdStarted()", 1);
        if (c(this.f25814a)) {
            b(new h());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoListener
    public final void onRewardedVideoAvailabilityChanged(boolean z10) {
        a(z10, (Map<String, Object>) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.SegmentListener
    public final void onSegmentReceived(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, a3.k.l("onSegmentReceived(", str, ")"), 1);
        if (c(this.f25817d)) {
            b(new k(str));
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.f
    public final void a(boolean z10, IronSourceError ironSourceError) {
        String str = "onOfferwallAvailable(isAvailable: " + z10 + ")";
        if (ironSourceError != null) {
            StringBuilder l10 = com.ironsource.adapters.facebook.a.l(str, ", error: ");
            l10.append(ironSourceError.getErrorMessage());
            str = l10.toString();
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put("status", String.valueOf(z10));
            if (ironSourceError != null) {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, ironSourceError.getErrorCode());
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(302, mediationAdditionalData));
        if (c(this.f25816c)) {
            b(new e(z10));
        }
    }

    public final void a(boolean z10, Map<String, Object> map) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAvailabilityChanged(available:" + z10 + ")", 1);
        long time = new Date().getTime() - this.f25820h;
        this.f25820h = e0.i.e();
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put("duration", time);
            if (map != null) {
                for (String str : map.keySet()) {
                    mediationAdditionalData.put(str, map.get(str));
                }
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(z10 ? IronSourceConstants.RV_CALLBACK_AVAILABILITY_TRUE : IronSourceConstants.RV_CALLBACK_AVAILABILITY_FALSE, mediationAdditionalData));
        if (c(this.f25814a)) {
            b(new g(z10));
        }
    }
}
