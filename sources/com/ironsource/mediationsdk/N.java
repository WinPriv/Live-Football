package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.ads.ep;
import com.ironsource.mediationsdk.AbstractC1414b;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBidderInterface;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Date;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class N extends ac implements AdapterBidderInterface, RewardedVideoSmashListener {

    /* renamed from: h, reason: collision with root package name */
    public a f24877h;

    /* renamed from: i, reason: collision with root package name */
    public final O f24878i;

    /* renamed from: j, reason: collision with root package name */
    public Timer f24879j;

    /* renamed from: k, reason: collision with root package name */
    public final int f24880k;

    /* renamed from: l, reason: collision with root package name */
    public final String f24881l;

    /* renamed from: m, reason: collision with root package name */
    public final String f24882m;

    /* renamed from: n, reason: collision with root package name */
    public Placement f24883n;
    public long o;

    /* renamed from: p, reason: collision with root package name */
    public final String f24884p;

    /* renamed from: q, reason: collision with root package name */
    public final JSONObject f24885q;

    /* renamed from: r, reason: collision with root package name */
    public final int f24886r;

    /* renamed from: s, reason: collision with root package name */
    public final String f24887s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f24888t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f24889u;

    /* renamed from: v, reason: collision with root package name */
    public long f24890v;

    /* loaded from: classes2.dex */
    public enum a {
        NO_INIT,
        INIT_IN_PROGRESS,
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS,
        ENDED
    }

    /* loaded from: classes2.dex */
    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            int i10;
            boolean z10;
            N n10 = N.this;
            a aVar = n10.f24877h;
            a aVar2 = a.LOAD_IN_PROGRESS;
            String str = "Rewarded Video - load instance time out";
            if (aVar != aVar2 && aVar != a.INIT_IN_PROGRESS) {
                i10 = 0;
                z10 = false;
            } else {
                if (aVar == aVar2) {
                    i10 = 1025;
                } else {
                    i10 = IronSourceError.ERROR_RV_INIT_FAILED_TIMEOUT;
                    str = "Rewarded Video - init instance time out";
                }
                n10.e(a.NOT_LOADED);
                z10 = true;
            }
            n10.f(str);
            if (z10) {
                n10.b(1200, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{"duration", Long.valueOf(n10.v())}});
                n10.b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{"reason", str}, new Object[]{"duration", Long.valueOf(n10.v())}});
                n10.f24878i.b(n10);
                return;
            }
            n10.b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_LOAD_FAILED_TIMEOUT)}, new Object[]{"duration", Long.valueOf(n10.v())}, new Object[]{IronSourceConstants.EVENTS_EXT1, n10.f24877h.name()}});
        }
    }

    public N(N n10, O o, AbstractAdapter abstractAdapter, int i10, String str, JSONObject jSONObject, int i11, String str2) {
        this(n10.f24881l, n10.f24882m, n10.f25099b.f25630a, o, n10.f24880k, abstractAdapter, i10);
        this.f24884p = str;
        this.f24885q = jSONObject;
        this.f24886r = i11;
        this.f24887s = str2;
    }

    public static boolean q(int i10) {
        if (i10 != 1001 && i10 != 1002 && i10 != 1200 && i10 != 1212 && i10 != 1213 && i10 != 1005 && i10 != 1203 && i10 != 1201 && i10 != 1202 && i10 != 1006 && i10 != 1010) {
            return false;
        }
        return true;
    }

    public final void a(int i10, Object[][] objArr) {
        b(i10, objArr, true);
    }

    public final void b(int i10, Object[][] objArr, boolean z10) {
        Placement placement;
        Map<String, Object> n10 = n();
        String str = this.f24884p;
        if (!TextUtils.isEmpty(str)) {
            n10.put("auctionId", str);
        }
        JSONObject jSONObject = this.f24885q;
        if (jSONObject != null && jSONObject.length() > 0) {
            n10.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, jSONObject);
        }
        if (z10 && (placement = this.f24883n) != null && !TextUtils.isEmpty(placement.getPlacementName())) {
            n10.put("placement", this.f24883n.getPlacementName());
        }
        if (q(i10)) {
            com.ironsource.mediationsdk.a.h.d();
            com.ironsource.mediationsdk.a.b.a(n10, this.f24886r, this.f24887s);
        }
        n10.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    n10.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e10) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, k() + " smash: RV sendProviderEvent " + Log.getStackTraceString(e10), 3);
            }
        }
        com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(i10, new JSONObject(n10)));
        if (i10 == 1203) {
            com.ironsource.mediationsdk.utils.o.a().a(1);
        }
    }

    public final void b_() {
        this.f25098a.setMediationState(AbstractC1414b.a.CAPPED_PER_SESSION, IronSourceConstants.AD_UNIT_RV_MEDIATION_STATE);
        b(IronSourceConstants.RV_CAP_SESSION, null, false);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBidderInterface
    public final void collectBiddingData(JSONObject jSONObject, BiddingDataCallback biddingDataCallback) {
        b(1020, null, false);
        this.f25098a.collectRewardedVideoBiddingData(this.f25101d, jSONObject, biddingDataCallback);
    }

    @Override // com.ironsource.mediationsdk.ac
    public final int d() {
        return 2;
    }

    public final void e(a aVar) {
        f("current state=" + this.f24877h + ", new state=" + aVar);
        synchronized (this.f24888t) {
            this.f24877h = aVar;
        }
    }

    public final void f(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvSmash " + k() + " " + hashCode() + "  : " + str, 0);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBidderInterface
    public final Map<String, Object> getBiddingData(JSONObject jSONObject) {
        try {
            if (!g()) {
                return null;
            }
            return this.f25098a.getRewardedVideoBiddingData(this.f25101d, jSONObject);
        } catch (Throwable th) {
            r("getBiddingData exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            b(IronSourceConstants.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 5001}, new Object[]{"reason", th.getLocalizedMessage()}});
            return null;
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdClicked() {
        f("onRewardedVideoAdClicked");
        this.f24878i.b(this, this.f24883n);
        a(1006, (Object[][]) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdClosed() {
        f("onRewardedVideoAdClosed");
        synchronized (this.f24888t) {
            if (this.f24877h != a.SHOW_IN_PROGRESS) {
                a(IronSourceConstants.RV_INSTANCE_CLOSED, (Object[][]) null);
                b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_adClosed)}, new Object[]{"reason", "adClosed: " + this.f24877h}});
                return;
            }
            e(a.ENDED);
            this.f24890v = e0.i.e();
            this.f24878i.d(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdEnded() {
        f("onRewardedVideoAdEnded");
        this.f24878i.f(this);
        a(IronSourceConstants.RV_INSTANCE_ENDED, (Object[][]) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdOpened() {
        f("onRewardedVideoAdOpened");
        this.f24878i.c(this);
        a(1005, (Object[][]) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdRewarded() {
        f("onRewardedVideoAdRewarded");
        long time = new Date().getTime();
        this.f24878i.a(this, this.f24883n);
        Map<String, Object> n10 = n();
        Placement placement = this.f24883n;
        if (placement != null) {
            n10.put("placement", placement.getPlacementName());
            n10.put(IronSourceConstants.EVENTS_REWARD_NAME, this.f24883n.getRewardName());
            n10.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(this.f24883n.getRewardAmount()));
        }
        if (!TextUtils.isEmpty(L.a().f24861m)) {
            n10.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, L.a().f24861m);
        }
        if (L.a().f24862n != null) {
            for (String str : L.a().f24862n.keySet()) {
                n10.put(s.f.b("custom_", str), L.a().f24862n.get(str));
            }
        }
        String str2 = this.f24884p;
        if (!TextUtils.isEmpty(str2)) {
            n10.put("auctionId", str2);
        }
        JSONObject jSONObject = this.f24885q;
        if (jSONObject != null && jSONObject.length() > 0) {
            n10.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, jSONObject);
        }
        if (q(1010)) {
            com.ironsource.mediationsdk.a.h.d();
            com.ironsource.mediationsdk.a.b.a(n10, this.f24886r, this.f24887s);
        }
        n10.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f));
        com.ironsource.mediationsdk.a.c cVar = new com.ironsource.mediationsdk.a.c(1010, new JSONObject(n10));
        cVar.a(IronSourceConstants.EVENTS_TRANS_ID, IronSourceUtils.getTransId(cVar.b(), k()));
        long j10 = this.f24890v;
        if (j10 != 0) {
            long j11 = time - j10;
            f("onRewardedVideoAdRewarded timeAfterClosed=" + j11);
            cVar.a("duration", Long.valueOf(j11));
        }
        com.ironsource.mediationsdk.a.h.d().b(cVar);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        f("onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        a(1202, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        synchronized (this.f24888t) {
            if (this.f24877h != a.SHOW_IN_PROGRESS) {
                b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_showFailed)}, new Object[]{"reason", "showFailed: " + this.f24877h}});
                return;
            }
            e(a.ENDED);
            this.f24878i.a(ironSourceError, this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdStarted() {
        f("onRewardedVideoAdStarted");
        this.f24878i.e(this);
        a(IronSourceConstants.RV_INSTANCE_STARTED, (Object[][]) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdVisible() {
        f("onRewardedVideoAdVisible");
        a(IronSourceConstants.RV_INSTANCE_VISIBLE, (Object[][]) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAvailabilityChanged(boolean z10) {
        boolean z11;
        int i10;
        a aVar;
        f("onRewardedVideoAvailabilityChanged available=" + z10 + " state=" + this.f24877h.name());
        synchronized (this.f24888t) {
            if (this.f24877h == a.LOAD_IN_PROGRESS) {
                if (z10) {
                    aVar = a.LOADED;
                } else {
                    aVar = a.NOT_LOADED;
                }
                e(aVar);
                z11 = false;
            } else {
                z11 = true;
            }
        }
        if (z11) {
            if (z10) {
                b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_TRUE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, this.f24877h.name()}});
                return;
            } else {
                b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK)}, new Object[]{"duration", Long.valueOf(v())}, new Object[]{IronSourceConstants.EVENTS_EXT1, this.f24877h.name()}});
                return;
            }
        }
        u();
        if (z10) {
            i10 = 1002;
        } else {
            i10 = 1200;
        }
        b(i10, new Object[][]{new Object[]{"duration", Long.valueOf(v())}});
        if (z10) {
            this.f24878i.a(this);
        } else {
            this.f24878i.b(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
        f("onRewardedVideoInitFailed error=" + ironSourceError.getErrorMessage());
        u();
        b(1200, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT)}, new Object[]{"duration", Long.valueOf(v())}});
        b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(v())}});
        synchronized (this.f24888t) {
            if (this.f24877h != a.INIT_IN_PROGRESS) {
                b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_initFailed)}, new Object[]{"reason", "initFailed: " + this.f24877h}});
                return;
            }
            e(a.NO_INIT);
            this.f24878i.b(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoInitSuccess() {
        f("onRewardedVideoInitSuccess");
        synchronized (this.f24888t) {
            if (this.f24877h != a.INIT_IN_PROGRESS) {
                b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_initSuccess)}, new Object[]{"reason", "initSuccess: " + this.f24877h}});
                return;
            }
            e(a.NOT_LOADED);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        if (ironSourceError.getErrorCode() == 1058) {
            b(IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"duration", Long.valueOf(v())}}, false);
            return;
        }
        if (ironSourceError.getErrorCode() == 1057) {
            this.f25103g = Long.valueOf(System.currentTimeMillis());
        }
        b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(v())}}, false);
    }

    public final void r(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvSmash " + k() + " " + hashCode() + " : " + str, 3);
    }

    public final boolean s() {
        try {
            return this.f25098a.isRewardedVideoAvailable(this.f25101d);
        } catch (Exception e10) {
            r("isRewardedVideoAvailable exception: " + e10.getLocalizedMessage());
            e10.printStackTrace();
            b(IronSourceConstants.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 5002}, new Object[]{"reason", e10.getLocalizedMessage()}});
            return false;
        }
    }

    public final void t() {
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

    public final void u() {
        synchronized (this.f24889u) {
            Timer timer = this.f24879j;
            if (timer != null) {
                timer.cancel();
                this.f24879j = null;
            }
        }
    }

    public final long v() {
        return e0.i.e() - this.o;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public N(java.lang.String r4, java.lang.String r5, com.ironsource.mediationsdk.model.NetworkSettings r6, com.ironsource.mediationsdk.O r7, int r8, com.ironsource.mediationsdk.AbstractAdapter r9, int r10) {
        /*
            r3 = this;
            com.ironsource.mediationsdk.model.a r0 = new com.ironsource.mediationsdk.model.a
            org.json.JSONObject r1 = r6.getRewardedVideoSettings()
            com.ironsource.mediationsdk.IronSource$AD_UNIT r2 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO
            r0.<init>(r6, r1, r2)
            r3.<init>(r0, r9)
            java.lang.Object r6 = new java.lang.Object
            r6.<init>()
            r3.f24888t = r6
            java.lang.Object r6 = new java.lang.Object
            r6.<init>()
            r3.f24889u = r6
            r3.f24881l = r4
            r3.f24882m = r5
            r3.f24878i = r7
            r6 = 0
            r3.f24879j = r6
            r3.f24880k = r8
            com.ironsource.mediationsdk.AbstractAdapter r6 = r3.f25098a
            r6.updateRewardedVideoListener(r3)
            r3.f = r10
            com.ironsource.mediationsdk.N$a r6 = com.ironsource.mediationsdk.N.a.NO_INIT
            r3.f24877h = r6
            r6 = 0
            r3.f24890v = r6
            boolean r6 = r0.f25633d
            if (r6 != 0) goto L3e
            boolean r6 = r0.f25634e
            if (r6 == 0) goto L96
        L3e:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "isBidder = "
            r6.<init>(r7)
            boolean r7 = r3.g()
            r6.append(r7)
            java.lang.String r7 = ", shouldEarlyInit = "
            r6.append(r7)
            boolean r7 = r3.h()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r3.f(r6)
            com.ironsource.mediationsdk.N$a r6 = com.ironsource.mediationsdk.N.a.INIT_IN_PROGRESS
            r3.e(r6)
            r3.t()
            com.ironsource.mediationsdk.AbstractAdapter r6 = r3.f25098a     // Catch: java.lang.Throwable -> L6f
            org.json.JSONObject r7 = r3.f25101d     // Catch: java.lang.Throwable -> L6f
            r6.initRewardedVideoForBidding(r4, r5, r7, r3)     // Catch: java.lang.Throwable -> L6f
            return
        L6f:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "initForBidding exception: "
            r5.<init>(r6)
            java.lang.String r6 = r4.getLocalizedMessage()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r3.r(r5)
            r4.printStackTrace()
            com.ironsource.mediationsdk.logger.IronSourceError r5 = new com.ironsource.mediationsdk.logger.IronSourceError
            r6 = 1040(0x410, float:1.457E-42)
            java.lang.String r4 = r4.getLocalizedMessage()
            r5.<init>(r6, r4)
            r3.onRewardedVideoInitFailed(r5)
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.N.<init>(java.lang.String, java.lang.String, com.ironsource.mediationsdk.model.NetworkSettings, com.ironsource.mediationsdk.O, int, com.ironsource.mediationsdk.AbstractAdapter, int):void");
    }

    public final void a(Placement placement) {
        u();
        f("showVideo()");
        this.f24883n = placement;
        e(a.SHOW_IN_PROGRESS);
        a(1201, (Object[][]) null);
        try {
            this.f25098a.showRewardedVideo(this.f25101d, this);
        } catch (Throwable th) {
            r("showVideo exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            onRewardedVideoAdShowFailed(new IronSourceError(IronSourceError.ERROR_RV_SHOW_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    public final LoadWhileShowSupportState b() {
        try {
            return this.f25098a.getLoadWhileShowSupportState(this.f25101d);
        } catch (Exception e10) {
            r("Exception while calling adapter.getLoadWhileShowSupportState() - " + e10.getLocalizedMessage());
            return LoadWhileShowSupportState.NONE;
        }
    }

    public final void a(String str, JSONObject jSONObject) {
        a aVar;
        a aVar2;
        f("loadVideo() auctionId: " + this.f24884p + " state: " + this.f24877h);
        this.f25103g = null;
        this.f25100c = false;
        synchronized (this.f24888t) {
            aVar = this.f24877h;
            aVar2 = a.LOAD_IN_PROGRESS;
            if (aVar != aVar2 && aVar != a.SHOW_IN_PROGRESS) {
                e(aVar2);
            }
        }
        if (aVar == aVar2) {
            b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_loadInProgress)}, new Object[]{"reason", "load during load"}});
            return;
        }
        if (aVar == a.SHOW_IN_PROGRESS) {
            b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_showInProgress)}, new Object[]{"reason", "load during show"}});
            return;
        }
        synchronized (this.f24889u) {
            Timer timer = new Timer();
            this.f24879j = timer;
            timer.schedule(new b(), this.f24880k * 1000);
        }
        this.o = e0.i.e();
        b(1001, null, false);
        try {
            if (g()) {
                this.f25098a.loadRewardedVideoForBidding(this.f25101d, jSONObject, this, str);
            } else {
                t();
                this.f25098a.initRewardedVideo(this.f24881l, this.f24882m, this.f25101d, null, this);
            }
        } catch (Throwable th) {
            r("loadVideo exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            b(IronSourceConstants.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(g() ? IronSourceConstants.errorCode_loadException : IronSourceConstants.errorCode_initFailed)}, new Object[]{"reason", th.getLocalizedMessage()}});
        }
    }

    public final void b(int i10, Object[][] objArr) {
        b(i10, objArr, false);
    }

    public final void a(boolean z10) {
        Object[][] objArr = new Object[1];
        Object[] objArr2 = new Object[2];
        objArr2[0] = "status";
        objArr2[1] = z10 ? ep.Code : ep.V;
        objArr[0] = objArr2;
        b(IronSourceConstants.RV_INSTANCE_SHOW_CHANCE, objArr, true);
    }

    public final boolean a() {
        return g() ? this.f24877h == a.LOADED && s() : s();
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoLoadSuccess() {
    }
}
