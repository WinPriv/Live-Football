package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.ads.ep;
import com.ironsource.mediationsdk.AbstractC1414b;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBidderInterface;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ab extends ac implements AdapterBidderInterface, RewardedVideoSmashListener {
    public String A;
    public String B;
    public JSONObject C;
    public final Object D;
    public final Object E;

    /* renamed from: h, reason: collision with root package name */
    public a f25074h;

    /* renamed from: i, reason: collision with root package name */
    public final aa f25075i;

    /* renamed from: j, reason: collision with root package name */
    public Timer f25076j;

    /* renamed from: k, reason: collision with root package name */
    public final int f25077k;

    /* renamed from: l, reason: collision with root package name */
    public final String f25078l;

    /* renamed from: m, reason: collision with root package name */
    public final String f25079m;

    /* renamed from: n, reason: collision with root package name */
    public String f25080n;
    public boolean o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f25081p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f25082q;

    /* renamed from: r, reason: collision with root package name */
    public Placement f25083r;

    /* renamed from: s, reason: collision with root package name */
    public long f25084s;

    /* renamed from: t, reason: collision with root package name */
    public String f25085t;

    /* renamed from: u, reason: collision with root package name */
    public JSONObject f25086u;

    /* renamed from: v, reason: collision with root package name */
    public String f25087v;

    /* renamed from: w, reason: collision with root package name */
    public int f25088w;

    /* renamed from: x, reason: collision with root package name */
    public String f25089x;
    public int y;

    /* renamed from: z, reason: collision with root package name */
    public int f25090z;

    /* loaded from: classes2.dex */
    public enum a {
        NO_INIT,
        INIT_IN_PROGRESS,
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS
    }

    /* loaded from: classes2.dex */
    public class b extends TimerTask {
        public b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x001d, code lost:
        
            r3 = 1025;
         */
        @Override // java.util.TimerTask, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 222
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.ab.b.run():void");
        }
    }

    public ab(String str, String str2, NetworkSettings networkSettings, aa aaVar, int i10, AbstractAdapter abstractAdapter) {
        super(new com.ironsource.mediationsdk.model.a(networkSettings, networkSettings.getRewardedVideoSettings(), IronSource.AD_UNIT.REWARDED_VIDEO), abstractAdapter);
        this.D = new Object();
        this.E = new Object();
        this.f25074h = a.NO_INIT;
        this.f25078l = str;
        this.f25079m = str2;
        this.f25075i = aaVar;
        this.f25076j = null;
        this.C = null;
        this.f25077k = i10;
        this.f25098a.addRewardedVideoListener(this);
        this.o = false;
        this.f25081p = false;
        this.f25082q = false;
        this.f25083r = null;
        this.f25085t = "";
        this.f25086u = null;
        this.f = 1;
        s();
    }

    public static boolean q(int i10) {
        if (i10 != 1001 && i10 != 1002 && i10 != 1200 && i10 != 1213 && i10 != 1212 && i10 != 1005 && i10 != 1203 && i10 != 1201 && i10 != 1202 && i10 != 1006 && i10 != 1010) {
            return false;
        }
        return true;
    }

    public final void a() {
        f("isBidder = " + g() + ", shouldEarlyInit = " + h());
        e(a.INIT_IN_PROGRESS);
        u();
        try {
            this.f25098a.initRewardedVideoForBidding(this.f25078l, this.f25079m, this.f25101d, this);
        } catch (Throwable th) {
            r("initForBidding exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            onRewardedVideoInitFailed(new IronSourceError(IronSourceError.ERROR_RV_INIT_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    public final void b(int i10, Object[][] objArr, boolean z10) {
        Placement placement;
        Map<String, Object> n10 = n();
        if (!TextUtils.isEmpty(this.f25085t)) {
            n10.put("auctionId", this.f25085t);
        }
        JSONObject jSONObject = this.f25086u;
        if (jSONObject != null && jSONObject.length() > 0) {
            n10.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f25086u);
        }
        if (z10 && (placement = this.f25083r) != null && !TextUtils.isEmpty(placement.getPlacementName())) {
            n10.put("placement", this.f25083r.getPlacementName());
        }
        if (q(i10)) {
            com.ironsource.mediationsdk.a.h.d();
            com.ironsource.mediationsdk.a.b.a(n10, this.f25088w, this.f25089x);
        }
        n10.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    n10.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e10) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, k() + " smash: RV sendMediationEvent " + Log.getStackTraceString(e10), 3);
            }
        }
        com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(i10, new JSONObject(n10)));
        if (i10 == 1203) {
            com.ironsource.mediationsdk.utils.o.a().a(1);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBidderInterface
    public final void collectBiddingData(JSONObject jSONObject, BiddingDataCallback biddingDataCallback) {
        b(1020, null, false);
        this.f25098a.collectRewardedVideoBiddingData(this.f25101d, jSONObject, biddingDataCallback);
    }

    public final void e(a aVar) {
        f("current state=" + this.f25074h + ", new state=" + aVar);
        synchronized (this.E) {
            this.f25074h = aVar;
        }
    }

    public final void f(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgRvSmash " + k() + " : " + str, 0);
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
        this.f25075i.b(this, this.f25083r);
        a(1006, (Object[][]) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdClosed() {
        f("onRewardedVideoAdClosed");
        synchronized (this.E) {
            if (this.f25074h != a.SHOW_IN_PROGRESS) {
                a(IronSourceConstants.RV_INSTANCE_CLOSED, (Object[][]) null);
                b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_adClosed)}, new Object[]{"reason", "adClosed: " + this.f25074h}});
                return;
            }
            e(a.NOT_LOADED);
            this.f25075i.b(this);
            if (this.o) {
                f("onRewardedVideoAdClosed and mShouldLoadAfterClose is true - calling loadRewardedVideoForBidding");
                this.o = false;
                a(this.f25080n, this.f25087v, this.f25086u, this.y, this.B, this.f25090z, this.A, this.C);
                s();
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdEnded() {
        f("onRewardedVideoAdEnded");
        this.f25075i.d(this);
        a(IronSourceConstants.RV_INSTANCE_ENDED, (Object[][]) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdOpened() {
        f("onRewardedVideoAdOpened");
        this.f25075i.a(this);
        a(1005, (Object[][]) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdRewarded() {
        f("onRewardedVideoAdRewarded");
        this.f25075i.a(this, this.f25083r);
        Map<String, Object> n10 = n();
        Placement placement = this.f25083r;
        if (placement != null) {
            n10.put("placement", placement.getPlacementName());
            n10.put(IronSourceConstants.EVENTS_REWARD_NAME, this.f25083r.getRewardName());
            n10.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(this.f25083r.getRewardAmount()));
        }
        if (!TextUtils.isEmpty(L.a().f24861m)) {
            n10.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, L.a().f24861m);
        }
        if (L.a().f24862n != null) {
            for (String str : L.a().f24862n.keySet()) {
                n10.put(s.f.b("custom_", str), L.a().f24862n.get(str));
            }
        }
        if (!TextUtils.isEmpty(this.f25085t)) {
            n10.put("auctionId", this.f25085t);
        }
        JSONObject jSONObject = this.f25086u;
        if (jSONObject != null && jSONObject.length() > 0) {
            n10.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f25086u);
        }
        if (q(1010)) {
            com.ironsource.mediationsdk.a.h.d();
            com.ironsource.mediationsdk.a.b.a(n10, this.f25088w, this.f25089x);
        }
        n10.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f));
        com.ironsource.mediationsdk.a.c cVar = new com.ironsource.mediationsdk.a.c(1010, new JSONObject(n10));
        cVar.a(IronSourceConstants.EVENTS_TRANS_ID, IronSourceUtils.getTransId(cVar.b(), k()));
        com.ironsource.mediationsdk.a.h.d().b(cVar);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        f("onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        a(1202, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        synchronized (this.E) {
            if (this.f25074h != a.SHOW_IN_PROGRESS) {
                b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_showFailed)}, new Object[]{"reason", "showFailed: " + this.f25074h}});
                return;
            }
            e(a.NOT_LOADED);
            this.f25075i.a(ironSourceError, this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdStarted() {
        f("onRewardedVideoAdStarted");
        this.f25075i.c(this);
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
        f("onRewardedVideoAvailabilityChanged available=" + z10 + " state=" + this.f25074h.name());
        synchronized (this.E) {
            if (this.f25074h == a.LOAD_IN_PROGRESS) {
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
                b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_TRUE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, this.f25074h.name()}});
                return;
            } else {
                b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK)}, new Object[]{"duration", Long.valueOf(w())}, new Object[]{IronSourceConstants.EVENTS_EXT1, this.f25074h.name()}});
                return;
            }
        }
        v();
        if (z10) {
            i10 = 1002;
        } else {
            i10 = 1200;
        }
        b(i10, new Object[][]{new Object[]{"duration", Long.valueOf(w())}});
        if (this.f25081p) {
            this.f25081p = false;
            f("onRewardedVideoAvailabilityChanged to " + z10 + "and mShouldLoadAfterLoad is true - calling loadVideo");
            a(this.f25080n, this.f25087v, this.f25086u, this.y, this.B, this.f25090z, this.A, this.C);
            s();
            return;
        }
        if (z10) {
            this.f25075i.a(this, this.f25085t);
        } else {
            this.f25075i.b(this, this.f25085t);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
        f("onRewardedVideoInitFailed error=" + ironSourceError.getErrorMessage());
        v();
        b(1200, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT)}, new Object[]{"duration", Long.valueOf(w())}});
        b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(w())}});
        synchronized (this.E) {
            if (this.f25074h != a.INIT_IN_PROGRESS) {
                b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_initFailed)}, new Object[]{"reason", "initFailed: " + this.f25074h}});
                return;
            }
            e(a.NO_INIT);
            this.f25075i.b(this, this.f25085t);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoInitSuccess() {
        f("onRewardedVideoInitSuccess");
        synchronized (this.E) {
            if (this.f25074h != a.INIT_IN_PROGRESS) {
                b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_initSuccess)}, new Object[]{"reason", "initSuccess: " + this.f25074h}});
                return;
            }
            e(a.NOT_LOADED);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        if (ironSourceError.getErrorCode() == 1058) {
            b(IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"duration", Long.valueOf(w())}}, false);
            return;
        }
        if (ironSourceError.getErrorCode() == 1057) {
            this.f25103g = Long.valueOf(System.currentTimeMillis());
        }
        b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(w())}}, false);
    }

    public final void r(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgRvSmash " + k() + " : " + str, 3);
    }

    public final void s() {
        this.f25087v = "";
        this.y = -1;
        this.B = "";
        this.f25080n = "";
        this.f25090z = this.f;
        this.A = "";
    }

    public final boolean t() {
        try {
            return this.f25098a.isRewardedVideoAvailable(this.f25101d);
        } catch (Exception e10) {
            r("isRewardedVideoAvailable exception: " + e10.getLocalizedMessage());
            e10.printStackTrace();
            b(IronSourceConstants.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 5002}, new Object[]{"reason", e10.getLocalizedMessage()}});
            return false;
        }
    }

    public final void u() {
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

    public final void v() {
        synchronized (this.D) {
            Timer timer = this.f25076j;
            if (timer != null) {
                timer.cancel();
                this.f25076j = null;
            }
        }
    }

    public final long w() {
        return e0.i.e() - this.f25084s;
    }

    public final void a(int i10, Object[][] objArr) {
        b(i10, objArr, true);
    }

    public final void b(int i10, Object[][] objArr) {
        b(i10, objArr, false);
    }

    public final void e() {
        this.f25098a.setMediationState(AbstractC1414b.a.CAPPED_PER_SESSION, IronSourceConstants.AD_UNIT_RV_MEDIATION_STATE);
        b(IronSourceConstants.RV_CAP_SESSION, null, false);
    }

    public final void a(Placement placement, int i10) {
        v();
        f("showVideo()");
        this.f25083r = placement;
        this.f = i10;
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

    public final boolean b() {
        return g() ? this.f25082q && this.f25074h == a.LOADED && t() : t();
    }

    public final void a(String str, String str2, JSONObject jSONObject, int i10, String str3, int i11, String str4, JSONObject jSONObject2) {
        a aVar;
        a aVar2;
        StringBuilder s10 = a3.l.s("loadVideo() auctionId: ", str2, " state: ");
        s10.append(this.f25074h);
        f(s10.toString());
        this.f25103g = null;
        this.f25100c = false;
        this.f25082q = true;
        this.C = jSONObject2;
        synchronized (this.E) {
            aVar = this.f25074h;
            aVar2 = a.LOAD_IN_PROGRESS;
            if (aVar != aVar2 && aVar != a.SHOW_IN_PROGRESS) {
                e(aVar2);
            }
        }
        if (aVar == aVar2) {
            b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_loadInProgress)}, new Object[]{"reason", "load during load"}});
            this.f25081p = true;
            this.f25087v = str2;
            this.f25080n = str;
            this.y = i10;
            this.B = str3;
            this.f25090z = i11;
            this.A = str4;
            this.f25075i.b(this, str2);
            return;
        }
        if (aVar == a.SHOW_IN_PROGRESS) {
            b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_showInProgress)}, new Object[]{"reason", "load during show"}});
            this.o = true;
            this.f25087v = str2;
            this.f25080n = str;
            this.y = i10;
            this.B = str3;
            this.f25090z = i11;
            this.A = str4;
            return;
        }
        this.f25102e = str4;
        this.f25085t = str2;
        this.f25086u = jSONObject;
        this.f25088w = i10;
        this.f25089x = str3;
        this.f = i11;
        synchronized (this.D) {
            v();
            Timer timer = new Timer();
            this.f25076j = timer;
            timer.schedule(new b(), this.f25077k * 1000);
        }
        this.f25084s = e0.i.e();
        b(1001, null, false);
        try {
            if (g()) {
                this.f25098a.loadRewardedVideoForBidding(this.f25101d, jSONObject2, this, str);
            } else if (aVar != a.NO_INIT) {
                this.f25098a.fetchRewardedVideoForAutomaticLoad(this.f25101d, jSONObject2, this);
            } else {
                u();
                this.f25098a.initRewardedVideo(this.f25078l, this.f25079m, this.f25101d, null, this);
            }
        } catch (Throwable th) {
            r("loadRewardedVideoForBidding exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            onRewardedVideoLoadFailed(new IronSourceError(IronSourceError.ERROR_RV_LOAD_FAIL_UNEXPECTED, th.getLocalizedMessage()));
            b(IronSourceConstants.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_loadException)}, new Object[]{"reason", th.getLocalizedMessage()}});
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoLoadSuccess() {
    }

    public final void a(boolean z10, int i10) {
        this.f = i10;
        Object[][] objArr = new Object[1];
        Object[] objArr2 = new Object[2];
        objArr2[0] = "status";
        objArr2[1] = z10 ? ep.Code : ep.V;
        objArr[0] = objArr2;
        b(IronSourceConstants.RV_INSTANCE_SHOW_CHANCE, objArr, true);
    }
}
