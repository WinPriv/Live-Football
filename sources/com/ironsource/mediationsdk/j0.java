package com.ironsource.mediationsdk;

import android.content.Context;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.a;
import com.ironsource.mediationsdk.C1421j;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class j0 extends s implements com.ironsource.environment.j, D, aa, ai, InterfaceC1415c, InterfaceC1419g {
    public boolean A;
    public Boolean B;
    public d C;
    public int D;
    public String E;
    public boolean F;
    public NetworkStateReceiver G;
    public final B H;

    /* renamed from: e, reason: collision with root package name */
    public final ConcurrentHashMap<String, ab> f25515e;
    public final CopyOnWriteArrayList<ab> f;

    /* renamed from: g, reason: collision with root package name */
    public List<com.ironsource.mediationsdk.c.b> f25516g;

    /* renamed from: h, reason: collision with root package name */
    public final ConcurrentHashMap<String, com.ironsource.mediationsdk.c.b> f25517h;

    /* renamed from: i, reason: collision with root package name */
    public final ConcurrentHashMap<String, C1421j.a> f25518i;

    /* renamed from: j, reason: collision with root package name */
    public com.ironsource.mediationsdk.c.b f25519j;

    /* renamed from: k, reason: collision with root package name */
    public final com.ironsource.mediationsdk.utils.n f25520k;

    /* renamed from: l, reason: collision with root package name */
    public final ah f25521l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f25522m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f25523n;
    public final boolean o;

    /* renamed from: p, reason: collision with root package name */
    public final C1420h f25524p;

    /* renamed from: q, reason: collision with root package name */
    public final C1421j f25525q;

    /* renamed from: r, reason: collision with root package name */
    public String f25526r;

    /* renamed from: s, reason: collision with root package name */
    public String f25527s;

    /* renamed from: t, reason: collision with root package name */
    public JSONObject f25528t;

    /* renamed from: u, reason: collision with root package name */
    public int f25529u;

    /* renamed from: v, reason: collision with root package name */
    public long f25530v;

    /* renamed from: w, reason: collision with root package name */
    public final long f25531w;

    /* renamed from: x, reason: collision with root package name */
    public long f25532x;
    public final int y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f25533z;

    /* loaded from: classes2.dex */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            d dVar = d.RV_STATE_AUCTION_IN_PROGRESS;
            j0 j0Var = j0.this;
            j0Var.g(dVar);
            AsyncTask.execute(new b());
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            StringBuilder sb2;
            j0.a("makeAuction()");
            j0 j0Var = j0.this;
            j0Var.f25527s = "";
            j0Var.f25528t = null;
            j0Var.f25808b.a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
            j0Var.f25530v = new Date().getTime();
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb3 = new StringBuilder();
            for (ab abVar : j0Var.f25515e.values()) {
                if (abVar.g()) {
                    abVar.f25082q = false;
                }
                if (!j0Var.f25520k.b(abVar)) {
                    if (abVar.g()) {
                        Map<String, Object> biddingData = abVar.getBiddingData(null);
                        if (biddingData != null) {
                            hashMap.put(abVar.k(), biddingData);
                            sb2 = new StringBuilder();
                        } else {
                            abVar.b(IronSourceConstants.TROUBLESHOOTING_RV_BIDDING_DATA_MISSING, new Object[][]{new Object[]{"reason", "Missing bidding data"}});
                        }
                    } else {
                        arrayList.add(abVar.k());
                        sb2 = new StringBuilder();
                    }
                    sb2.append(abVar.i());
                    sb2.append(abVar.k());
                    sb2.append(",");
                    sb3.append(sb2.toString());
                }
            }
            if (hashMap.keySet().size() == 0 && arrayList.size() == 0) {
                j0Var.j(IronSourceConstants.RV_AUCTION_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{"duration", 0}}));
                j0.a("makeAuction() failed - No candidates available for auctioning");
                j0Var.o();
                return;
            }
            j0.a("makeAuction() - request waterfall is: " + ((Object) sb3));
            j0Var.e(1000, new HashMap(), false, false);
            j0Var.e(1300, new HashMap(), false, false);
            j0Var.e(IronSourceConstants.RV_AUCTION_REQUEST_WATERFALL, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb3.toString()}}), false, false);
            j0Var.f25524p.a(ContextProvider.getInstance().getApplicationContext(), hashMap, arrayList, j0Var.f25525q, j0Var.f25529u, j0Var.f25809c);
        }
    }

    /* loaded from: classes2.dex */
    public class c extends TimerTask {
        public c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            j0.this.n();
        }
    }

    /* loaded from: classes2.dex */
    public enum d {
        RV_STATE_INITIATING,
        RV_STATE_AUCTION_IN_PROGRESS,
        RV_STATE_NOT_LOADED,
        RV_STATE_LOADING_SMASHES,
        RV_STATE_READY_TO_SHOW
    }

    public j0(List<NetworkSettings> list, com.ironsource.mediationsdk.model.r rVar, String str, String str2, HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        super(hashSet, ironSourceSegment);
        boolean z10;
        this.f25529u = 1;
        this.E = "";
        this.F = false;
        long e10 = e0.i.e();
        e(IronSourceConstants.RV_MANAGER_INIT_STARTED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, IronSourceConstants.PROG_RV_MANAGER_NAME}}), false, false);
        g(d.RV_STATE_INITIATING);
        this.B = null;
        this.y = rVar.f25721c;
        this.f25533z = rVar.f25722d;
        this.f25526r = "";
        com.ironsource.mediationsdk.utils.c cVar = rVar.f25731n;
        this.A = false;
        this.f = new CopyOnWriteArrayList<>();
        this.f25516g = new ArrayList();
        this.f25517h = new ConcurrentHashMap<>();
        this.f25518i = new ConcurrentHashMap<>();
        this.f25532x = e0.i.e();
        if (cVar.f > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f25522m = z10;
        this.f25523n = cVar.f25900n;
        this.o = !cVar.o;
        this.f25531w = cVar.f25899m;
        if (z10) {
            this.f25524p = new C1420h("rewardedVideo", cVar, this);
        }
        this.f25521l = new ah(cVar, this);
        this.f25515e = new ConcurrentHashMap<>();
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : list) {
            AbstractAdapter a10 = C1416d.a().a(networkSettings, networkSettings.getRewardedVideoSettings(), false, false);
            if (a10 != null && C1417e.b(a10, C1417e.a().f25391b, "rewarded video")) {
                ab abVar = new ab(str, str2, networkSettings, this, rVar.f25723e, a10);
                String k10 = abVar.k();
                this.f25515e.put(k10, abVar);
                arrayList.add(k10);
            }
        }
        this.f25525q = new C1421j(arrayList, cVar.f25893g);
        this.f25520k = new com.ironsource.mediationsdk.utils.n(new ArrayList(this.f25515e.values()));
        for (ab abVar2 : this.f25515e.values()) {
            if (abVar2.g() || abVar2.h()) {
                abVar2.a();
            }
        }
        e(IronSourceConstants.RV_MANAGER_INIT_ENDED, a.AnonymousClass1.a(new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - e10)}}), false, false);
        this.H = new B(rVar.f25726i, this);
        f(cVar.f25896j);
    }

    public static void l(ab abVar, String str) {
        String str2 = abVar.k() + " : " + str;
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgRvManager: " + str2, 0);
    }

    @Override // com.ironsource.mediationsdk.InterfaceC1419g
    public final void a(int i10, String str, int i11, String str2, long j10) {
        String str3 = "Auction failed | moving to fallback waterfall (error " + i10 + " - " + str + ")";
        a(str3);
        IronSourceUtils.sendAutomationLog("RV: " + str3);
        this.D = i11;
        this.E = str2;
        this.f25528t = null;
        p();
        j(IronSourceConstants.RV_AUCTION_FAILED, TextUtils.isEmpty(str) ? a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{"duration", Long.valueOf(j10)}}) : a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{"reason", str}, new Object[]{"duration", Long.valueOf(j10)}}));
        if (this.o && this.A) {
            return;
        }
        n();
    }

    @Override // com.ironsource.mediationsdk.aa
    public final void b(ab abVar) {
        synchronized (this) {
            try {
                abVar.a(IronSourceConstants.RV_INSTANCE_CLOSED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, "otherRVAvailable = false"}});
                l(abVar, "onRewardedVideoAdClosed, mediation state: " + this.C.name());
                ae.a().b(this.f25810d);
                this.A = false;
                if (this.C != d.RV_STATE_READY_TO_SHOW) {
                    k(false);
                }
                if (this.f25523n) {
                    List<com.ironsource.mediationsdk.c.b> list = this.f25516g;
                    if (list != null && list.size() > 0) {
                        new Timer().schedule(new c(), this.f25531w);
                    }
                } else {
                    this.f25521l.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.ironsource.mediationsdk.aa
    public final void c(ab abVar) {
        l(abVar, "onRewardedVideoAdStarted");
        ae.a().b();
    }

    @Override // com.ironsource.mediationsdk.InterfaceC1415c
    public final void c_() {
        g(d.RV_STATE_NOT_LOADED);
        i(false, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_EXPIRED_ADS)}, new Object[]{"reason", "loaded ads are expired"}}));
        f(0L);
    }

    @Override // com.ironsource.mediationsdk.aa
    public final void d(ab abVar) {
        l(abVar, "onRewardedVideoAdEnded");
        ae.a().c();
    }

    public final void e(int i10, Map<String, Object> map, boolean z10, boolean z11) {
        HashMap t10 = a3.l.t(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        boolean z12 = true;
        t10.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        if (z11 && !TextUtils.isEmpty(this.f25527s)) {
            t10.put("auctionId", this.f25527s);
        }
        JSONObject jSONObject = this.f25528t;
        if (jSONObject != null && jSONObject.length() > 0) {
            t10.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f25528t);
        }
        if (z10 && !TextUtils.isEmpty(this.f25526r)) {
            t10.put("placement", this.f25526r);
        }
        if (i10 != 1003 && i10 != 1302 && i10 != 1301 && i10 != 1303) {
            z12 = false;
        }
        if (z12) {
            com.ironsource.mediationsdk.a.h.d();
            com.ironsource.mediationsdk.a.b.a(t10, this.D, this.E);
        }
        t10.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f25529u));
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    t10.putAll(map);
                }
            } catch (Exception e10) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgRvManager: RV sendMediationEvent " + Log.getStackTraceString(e10), 3);
            }
        }
        com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(i10, new JSONObject(t10)));
    }

    public final void f(long j10) {
        if (this.f25520k.a()) {
            j(IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.TROUBLESHOOTING_MEDIATION_TCS_CALCULATED)}, new Object[]{"reason", "all smashes are capped"}}));
            o();
            return;
        }
        a_();
        if (this.f25522m) {
            ConcurrentHashMap<String, C1421j.a> concurrentHashMap = this.f25518i;
            if (!concurrentHashMap.isEmpty()) {
                this.f25525q.a(concurrentHashMap);
                concurrentHashMap.clear();
            }
            new Timer().schedule(new a(), j10);
            return;
        }
        IronLog.INTERNAL.verbose("auction is disabled, fallback flow will occur");
        p();
        if (this.f25516g.isEmpty()) {
            j(IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80002}, new Object[]{"reason", "waterfall is empty"}}));
            o();
            return;
        }
        e(1000, new HashMap(), false, false);
        if (!this.o || !this.A) {
            n();
        }
    }

    public final void g(d dVar) {
        a("current state=" + this.C + ", new state=" + dVar);
        this.C = dVar;
    }

    public final void h(List<com.ironsource.mediationsdk.c.b> list) {
        String str;
        this.f25516g = list;
        StringBuilder sb2 = new StringBuilder();
        for (com.ironsource.mediationsdk.c.b bVar : list) {
            StringBuilder sb3 = new StringBuilder();
            ab abVar = this.f25515e.get(bVar.a());
            if (abVar != null) {
                str = Integer.toString(abVar.i());
            } else if (TextUtils.isEmpty(bVar.b())) {
                str = "1";
            } else {
                str = "2";
            }
            StringBuilder j10 = com.ironsource.adapters.facebook.a.j(str);
            j10.append(bVar.a());
            sb3.append(j10.toString());
            sb3.append(",");
            sb2.append(sb3.toString());
        }
        a("updateNextWaterfallToLoad() - next waterfall is " + sb2.toString());
        if (sb2.length() == 0) {
            a("Updated waterfall is empty");
        }
        j(IronSourceConstants.RV_AUCTION_RESPONSE_WATERFALL, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb2.toString()}}));
    }

    public final void i(boolean z10, Map<String, Object> map) {
        int i10;
        Boolean bool = this.B;
        if (bool == null || bool.booleanValue() != z10) {
            this.B = Boolean.valueOf(z10);
            long e10 = e0.i.e() - this.f25532x;
            this.f25532x = e0.i.e();
            if (map == null) {
                map = new HashMap<>();
            }
            map.put("duration", Long.valueOf(e10));
            if (z10) {
                i10 = IronSourceConstants.RV_CALLBACK_AVAILABILITY_TRUE;
            } else {
                i10 = IronSourceConstants.RV_CALLBACK_AVAILABILITY_FALSE;
            }
            j(i10, map);
            ae.a().a(z10, this.f25810d);
        }
    }

    public final void j(int i10, Map<String, Object> map) {
        e(i10, map, false, true);
    }

    public final void k(boolean z10) {
        i(z10, new HashMap());
    }

    public final void m(ab abVar) {
        String k10 = abVar.k();
        ConcurrentHashMap<String, com.ironsource.mediationsdk.c.b> concurrentHashMap = this.f25517h;
        String b10 = concurrentHashMap.get(k10).b();
        JSONObject c10 = concurrentHashMap.get(abVar.k()).c();
        C1418f.a();
        abVar.a(b10, this.f25527s, this.f25528t, this.D, this.E, this.f25529u, C1418f.d(b10), c10);
    }

    public final void n() {
        List<com.ironsource.mediationsdk.c.b> list = this.f25516g;
        CopyOnWriteArrayList<ab> copyOnWriteArrayList = this.f;
        copyOnWriteArrayList.clear();
        ConcurrentHashMap<String, com.ironsource.mediationsdk.c.b> concurrentHashMap = this.f25517h;
        concurrentHashMap.clear();
        ConcurrentHashMap<String, C1421j.a> concurrentHashMap2 = this.f25518i;
        concurrentHashMap2.clear();
        for (com.ironsource.mediationsdk.c.b bVar : list) {
            ab abVar = this.f25515e.get(bVar.a());
            if (abVar != null) {
                abVar.f25100c = true;
                copyOnWriteArrayList.add(abVar);
                concurrentHashMap.put(abVar.k(), bVar);
                concurrentHashMap2.put(bVar.a(), C1421j.a.ISAuctionPerformanceDidntAttemptToLoad);
            } else {
                a("updateWaterfall() - could not find matching smash for auction response item " + bVar.a());
            }
        }
        this.f25516g.clear();
        if (copyOnWriteArrayList.isEmpty()) {
            j(IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80004}, new Object[]{"reason", "waterfall is empty"}}));
            o();
            return;
        }
        g(d.RV_STATE_LOADING_SMASHES);
        int i10 = 0;
        for (int i11 = 0; i11 < copyOnWriteArrayList.size() && i10 < this.y; i11++) {
            ab abVar2 = copyOnWriteArrayList.get(i11);
            if (abVar2.f25100c) {
                if (this.f25533z && abVar2.g()) {
                    if (i10 == 0) {
                        String str = "Advanced Loading: Starting to load bidder " + abVar2.k() + ". No other instances will be loaded at the same time.";
                        a(str);
                        IronSourceUtils.sendAutomationLog(str);
                        m(abVar2);
                        return;
                    }
                    String str2 = "Advanced Loading: Won't start loading bidder " + abVar2.k() + " as a non bidder is being loaded";
                    a(str2);
                    IronSourceUtils.sendAutomationLog(str2);
                    return;
                }
                m(abVar2);
                i10++;
            }
        }
    }

    public final void o() {
        g(d.RV_STATE_NOT_LOADED);
        k(false);
        this.f25521l.d();
    }

    public final void p() {
        this.f25527s = s.d();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (ab abVar : this.f25515e.values()) {
            if (!abVar.g() && !this.f25520k.b(abVar)) {
                copyOnWriteArrayList.add(new com.ironsource.mediationsdk.c.b(abVar.k()));
            }
        }
        h(copyOnWriteArrayList);
    }

    @Override // com.ironsource.mediationsdk.D
    public final void a(Context context, boolean z10) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgRvManager Should Track Network State: " + z10, 0);
        try {
            this.F = z10;
            if (z10) {
                if (this.G == null) {
                    this.G = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.G, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.G != null) {
                context.getApplicationContext().unregisterReceiver(this.G);
            }
        } catch (Exception e10) {
            IronLog.INTERNAL.error("Got an error from receiver with message: " + e10.getMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.aa
    public final void b(ab abVar, Placement placement) {
        l(abVar, "onRewardedVideoAdClicked");
        ae.a().b(placement, this.f25810d);
    }

    @Override // com.ironsource.mediationsdk.D
    public final synchronized boolean c() {
        if (this.F && !IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getApplicationContext())) {
            return false;
        }
        if (this.C == d.RV_STATE_READY_TO_SHOW && !this.A) {
            Iterator<ab> it = this.f.iterator();
            while (it.hasNext()) {
                if (it.next().b()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.ironsource.mediationsdk.aa
    public final void a(ab abVar) {
        synchronized (this) {
            try {
                this.f25529u++;
                l(abVar, "onRewardedVideoAdOpened");
                if (this.f25522m) {
                    com.ironsource.mediationsdk.c.b bVar = this.f25517h.get(abVar.k());
                    if (bVar != null) {
                        a(bVar.b(this.f25526r));
                        C1420h.a(bVar, abVar.i(), this.f25519j, this.f25526r);
                        this.f25518i.put(abVar.k(), C1421j.a.ISAuctionPerformanceShowedSuccessfully);
                        b(bVar, this.f25526r);
                    } else {
                        String k10 = abVar.k();
                        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                        logger.log(ironSourceTag, "ProgRvManager: " + ("onRewardedVideoAdOpened showing instance " + k10 + " missing from waterfall"), 3);
                        j(IronSourceConstants.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1011}, new Object[]{"reason", "Showing missing " + this.C}, new Object[]{IronSourceConstants.EVENTS_EXT1, k10}}));
                    }
                }
                ae.a().a(this.f25810d);
                this.f25521l.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0131 A[SYNTHETIC] */
    @Override // com.ironsource.mediationsdk.aa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.ironsource.mediationsdk.ab r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.j0.b(com.ironsource.mediationsdk.ab, java.lang.String):void");
    }

    @Override // com.ironsource.mediationsdk.aa
    public final void a(ab abVar, Placement placement) {
        l(abVar, "onRewardedVideoAdRewarded");
        ae.a().a(placement, this.f25810d);
    }

    @Override // com.ironsource.mediationsdk.aa
    public final synchronized void a(ab abVar, String str) {
        l(abVar, "onLoadSuccess ");
        String str2 = this.f25527s;
        if (str2 != null && !str.equalsIgnoreCase(str2)) {
            a("onLoadSuccess was invoked with auctionId: " + str + " and the current id is " + this.f25527s);
            Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 2};
            StringBuilder sb2 = new StringBuilder("onLoadSuccess wrong auction ID ");
            sb2.append(this.C);
            abVar.b(IronSourceConstants.RV_MANAGER_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{"reason", sb2.toString()}});
            return;
        }
        d dVar = this.C;
        this.f25518i.put(abVar.k(), C1421j.a.ISAuctionPerformanceLoadedSuccessfully);
        if (this.C == d.RV_STATE_LOADING_SMASHES) {
            g(d.RV_STATE_READY_TO_SHOW);
            j(1003, a.AnonymousClass1.a(new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - this.f25530v)}}));
            this.H.a(0L);
            if (this.f25522m) {
                com.ironsource.mediationsdk.c.b bVar = this.f25517h.get(abVar.k());
                if (bVar != null) {
                    a(bVar.b(""));
                    C1420h.a(bVar, abVar.i(), this.f25519j);
                    this.f25524p.a(this.f, this.f25517h, abVar.i(), this.f25519j, bVar);
                } else {
                    String k10 = abVar.k();
                    String str3 = "onLoadSuccess winner instance " + k10 + " missing from waterfall. auctionId: " + str + " and the current id is " + this.f25527s;
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgRvManager: " + str3, 3);
                    j(IronSourceConstants.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}, new Object[]{"reason", "Loaded missing " + dVar}, new Object[]{IronSourceConstants.EVENTS_EXT1, k10}}));
                }
            }
            k(true);
        }
    }

    @Override // com.ironsource.mediationsdk.ai
    public final synchronized void e() {
        a("onLoadTriggered: RV load was triggered in " + this.C + " state");
        f(0L);
    }

    @Override // com.ironsource.mediationsdk.aa
    public final void a(IronSourceError ironSourceError, ab abVar) {
        com.ironsource.mediationsdk.c.b bVar;
        synchronized (this) {
            if (this.f25522m && (bVar = this.f25517h.get(abVar.k())) != null) {
                a(bVar.b(this.f25526r));
            }
            l(abVar, "onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
            e(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}}), true, true);
            ae.a().a(ironSourceError, this.f25810d);
            this.A = false;
            this.f25518i.put(abVar.k(), C1421j.a.ISAuctionPerformanceFailedToShow);
            if (this.C != d.RV_STATE_READY_TO_SHOW) {
                k(false);
            }
            this.f25521l.c();
        }
    }

    @Override // com.ironsource.mediationsdk.D
    public final synchronized void a(Placement placement) {
        if (placement == null) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "showRewardedVideo error: empty default placement", 3);
            ae.a().a(new IronSourceError(1021, "showRewardedVideo error: empty default placement"), this.f25810d);
            e(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1021}, new Object[]{"reason", "showRewardedVideo error: empty default placement"}}), false, true);
            return;
        }
        this.f25526r = placement.getPlacementName();
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        logger.log(ironSourceTag, "showRewardedVideo(" + placement + ")", 0);
        e(1100, new HashMap<>(), true, true);
        if (this.A) {
            IronSourceLoggerManager.getLogger().log(ironSourceTag, "showRewardedVideo error: can't show ad while an ad is already showing", 3);
            ae.a().a(new IronSourceError(1022, "showRewardedVideo error: can't show ad while an ad is already showing"), this.f25810d);
            e(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1022}, new Object[]{"reason", "showRewardedVideo error: can't show ad while an ad is already showing"}}), true, true);
            return;
        }
        if (this.C != d.RV_STATE_READY_TO_SHOW) {
            IronSourceLoggerManager.getLogger().log(ironSourceTag, "showRewardedVideo error: show called while no ads are available", 3);
            ae.a().a(new IronSourceError(1023, "showRewardedVideo error: show called while no ads are available"), this.f25810d);
            e(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1023}, new Object[]{"reason", "showRewardedVideo error: show called while no ads are available"}}), true, true);
            return;
        }
        if (com.ironsource.mediationsdk.utils.k.c(ContextProvider.getInstance().getApplicationContext(), this.f25526r)) {
            String str = "showRewardedVideo error: placement " + this.f25526r + " is capped";
            IronSourceLoggerManager.getLogger().log(ironSourceTag, str, 3);
            ae.a().a(new IronSourceError(IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT, str), this.f25810d);
            e(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT)}, new Object[]{"reason", str}}), true, true);
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<ab> it = this.f.iterator();
        while (it.hasNext()) {
            ab next = it.next();
            if (next.b()) {
                this.A = true;
                next.a(true, this.f25529u);
                a("showVideo()");
                this.f25520k.a(next);
                if (this.f25520k.b(next)) {
                    next.e();
                    IronSourceUtils.sendAutomationLog(next.k() + " rewarded video is now session capped");
                }
                com.ironsource.mediationsdk.utils.k.e(ContextProvider.getInstance().getApplicationContext(), placement.getPlacementName());
                if (com.ironsource.mediationsdk.utils.k.c(ContextProvider.getInstance().getApplicationContext(), placement.getPlacementName())) {
                    e(IronSourceConstants.RV_CAP_PLACEMENT, new HashMap<>(), true, true);
                }
                this.H.a();
                next.a(placement, this.f25529u);
                g(d.RV_STATE_NOT_LOADED);
                return;
            }
            if (next.o() != null) {
                stringBuffer.append(next.k() + com.huawei.openalliance.ad.constant.w.bE + next.o() + ",");
            }
            next.a(false, this.f25529u);
        }
        a("showRewardedVideo(): No ads to show");
        ae.a().a(ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT), this.f25810d);
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW));
        hashMap.put("reason", "showRewardedVideo(): No ads to show");
        if (stringBuffer.length() != 0) {
            hashMap.put(IronSourceConstants.EVENTS_EXT1, stringBuffer.toString());
        }
        e(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, hashMap, true, true);
        this.f25521l.c();
    }

    public static void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgRvManager: " + str, 0);
    }

    @Override // com.ironsource.mediationsdk.InterfaceC1419g
    public final void a(List<com.ironsource.mediationsdk.c.b> list, String str, com.ironsource.mediationsdk.c.b bVar, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) {
        a("makeAuction(): success");
        this.f25527s = str;
        this.f25519j = bVar;
        this.f25528t = jSONObject;
        this.D = i10;
        this.E = "";
        if (!TextUtils.isEmpty(str2)) {
            j(IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i11)}, new Object[]{"reason", str2}}));
        }
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
        c(ad_unit, jSONObject2);
        if (this.f25808b.a(ad_unit)) {
            j(IronSourceConstants.RV_AD_UNIT_CAPPED, a.AnonymousClass1.a(new Object[][]{new Object[]{"auctionId", str}}));
            o();
            return;
        }
        j(IronSourceConstants.RV_AUCTION_SUCCESS, a.AnonymousClass1.a(new Object[][]{new Object[]{"duration", Long.valueOf(j10)}}));
        h(list);
        if (this.o && this.A) {
            return;
        }
        n();
    }

    @Override // com.ironsource.environment.j
    public final void a(boolean z10) {
        if (this.F) {
            boolean z11 = false;
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "Network Availability Changed To: " + z10, 0);
            Boolean bool = this.B;
            if (bool != null && ((z10 && !bool.booleanValue() && c()) || (!z10 && this.B.booleanValue()))) {
                z11 = true;
            }
            if (z11) {
                k(z10);
            }
        }
    }
}
