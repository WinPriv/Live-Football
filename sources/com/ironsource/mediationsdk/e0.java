package com.ironsource.mediationsdk;

import android.content.Context;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.ads.ep;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.a;
import com.ironsource.mediationsdk.C1421j;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.N;
import com.ironsource.mediationsdk.bidding.b;
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
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class e0 extends s implements com.ironsource.environment.j, D, O, ai, InterfaceC1415c, InterfaceC1419g {
    public long A;
    public Boolean B;
    public final Object C;
    public final B D;
    public final boolean E;
    public final long F;

    /* renamed from: e, reason: collision with root package name */
    public final P f25392e;
    public final ConcurrentHashMap<String, com.ironsource.mediationsdk.c.b> f;

    /* renamed from: g, reason: collision with root package name */
    public final ConcurrentHashMap<String, C1421j.a> f25393g;

    /* renamed from: h, reason: collision with root package name */
    public com.ironsource.mediationsdk.c.b f25394h;

    /* renamed from: i, reason: collision with root package name */
    public final C1421j f25395i;

    /* renamed from: j, reason: collision with root package name */
    public final C1420h f25396j;

    /* renamed from: k, reason: collision with root package name */
    public JSONObject f25397k;

    /* renamed from: l, reason: collision with root package name */
    public final ah f25398l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f25399m;

    /* renamed from: n, reason: collision with root package name */
    public long f25400n;
    public String o;

    /* renamed from: p, reason: collision with root package name */
    public int f25401p;

    /* renamed from: q, reason: collision with root package name */
    public NetworkStateReceiver f25402q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f25403r;

    /* renamed from: s, reason: collision with root package name */
    public final ConcurrentHashMap<String, N> f25404s;

    /* renamed from: t, reason: collision with root package name */
    public final com.ironsource.mediationsdk.utils.n f25405t;

    /* renamed from: u, reason: collision with root package name */
    public int f25406u;

    /* renamed from: v, reason: collision with root package name */
    public String f25407v;

    /* renamed from: w, reason: collision with root package name */
    public final int f25408w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f25409x;
    public boolean y;

    /* renamed from: z, reason: collision with root package name */
    public d f25410z;

    /* loaded from: classes2.dex */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            e0 e0Var = e0.this;
            synchronized (e0Var.C) {
                d dVar = e0Var.f25410z;
                d dVar2 = d.RV_STATE_AUCTION_IN_PROGRESS;
                if (dVar != dVar2) {
                    e0Var.g(dVar2);
                    AsyncTask.execute(new b());
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            StringBuilder sb2;
            e0.a("makeAuction()");
            long time = new Date().getTime();
            e0 e0Var = e0.this;
            e0Var.f25400n = time;
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb3 = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            Iterator<N> it = e0Var.f25404s.values().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                z10 = e0Var.E;
                if (!hasNext) {
                    break;
                }
                N next = it.next();
                if (!e0Var.f25405t.b(next) && e0Var.f25392e.b(next)) {
                    if (next.g()) {
                        if (z10) {
                            arrayList2.add(new com.ironsource.mediationsdk.bidding.a(next.i(), next.k(), null, next));
                        } else {
                            Map<String, Object> biddingData = next.getBiddingData(null);
                            if (biddingData != null) {
                                hashMap.put(next.k(), biddingData);
                                sb2 = new StringBuilder();
                            } else {
                                next.b(IronSourceConstants.TROUBLESHOOTING_RV_BIDDING_DATA_MISSING, new Object[][]{new Object[]{"reason", "Missing bidding data"}});
                            }
                        }
                    } else {
                        arrayList.add(next.k());
                        sb2 = new StringBuilder();
                    }
                    sb2.append(next.i());
                    sb2.append(next.k());
                    sb2.append(",");
                    sb3.append(sb2.toString());
                }
            }
            if (z10) {
                if (arrayList2.isEmpty()) {
                    e0Var.k(sb3.toString(), arrayList, hashMap);
                    return;
                }
                com.ironsource.mediationsdk.bidding.b bVar = new com.ironsource.mediationsdk.bidding.b();
                c cVar = new c(hashMap, sb3, arrayList);
                e0Var.e(IronSourceConstants.RV_COLLECT_TOKENS, null, false, false);
                bVar.a(arrayList2, cVar, e0Var.F, TimeUnit.MILLISECONDS);
                return;
            }
            e0Var.k(sb3.toString(), arrayList, hashMap);
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

    public e0(List<NetworkSettings> list, com.ironsource.mediationsdk.model.r rVar, String str, String str2, HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        super(hashSet, ironSourceSegment);
        boolean z10;
        this.o = "";
        boolean z11 = false;
        this.f25403r = false;
        this.f25406u = 1;
        this.C = new Object();
        long e10 = e0.i.e();
        e(IronSourceConstants.RV_MANAGER_INIT_STARTED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, IronSourceConstants.LWS_RV_MANAGER_NAME}}), false, false);
        g(d.RV_STATE_INITIATING);
        this.B = null;
        this.f25408w = rVar.f25721c;
        this.f25409x = rVar.f25722d;
        this.f25407v = "";
        this.f25397k = null;
        com.ironsource.mediationsdk.utils.c cVar = rVar.f25731n;
        this.y = false;
        this.f25392e = new P(cVar.f25901p, cVar.f25894h);
        this.f = new ConcurrentHashMap<>();
        this.f25393g = new ConcurrentHashMap<>();
        this.A = e0.i.e();
        if (cVar.f > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f25399m = z10;
        if (z10) {
            this.f25396j = new C1420h("rewardedVideo", cVar, this);
        }
        this.f25398l = new ah(cVar, this);
        this.f25404s = new ConcurrentHashMap<>();
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : list) {
            AbstractAdapter a10 = C1416d.a().a(networkSettings, networkSettings.getRewardedVideoSettings(), z11, z11);
            if (a10 != null) {
                N n10 = new N(str, str2, networkSettings, this, rVar.f25723e, a10, this.f25406u);
                String k10 = n10.k();
                this.f25404s.put(k10, n10);
                arrayList.add(k10);
            }
            z11 = false;
        }
        this.f25395i = new C1421j(arrayList, cVar.f25893g);
        this.f25405t = new com.ironsource.mediationsdk.utils.n(new ArrayList(this.f25404s.values()));
        e(IronSourceConstants.RV_MANAGER_INIT_ENDED, a.AnonymousClass1.a(new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - e10)}}), false, false);
        this.D = new B(rVar.f25726i, this);
        this.E = rVar.f25728k;
        this.F = rVar.f25729l;
        f(cVar.f25896j);
    }

    public static void h(N n10, String str) {
        String str2 = n10.k() + " : " + str;
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "LWSProgRvManager: " + str2, 0);
    }

    @Override // com.ironsource.mediationsdk.InterfaceC1419g
    public final void a(int i10, String str, int i11, String str2, long j10) {
        String str3 = "Auction failed | moving to fallback waterfall (error " + i10 + " - " + str + ")";
        a(str3);
        IronSourceUtils.sendAutomationLog("RV: " + str3);
        this.f25401p = i11;
        this.o = str2;
        this.f25397k = null;
        m();
        l(IronSourceConstants.RV_AUCTION_FAILED, TextUtils.isEmpty(str) ? a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{"duration", Long.valueOf(j10)}}) : a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{"reason", str}, new Object[]{"duration", Long.valueOf(j10)}}));
        o();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f0 A[SYNTHETIC] */
    @Override // com.ironsource.mediationsdk.O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.ironsource.mediationsdk.N r11) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.e0.b(com.ironsource.mediationsdk.N):void");
    }

    @Override // com.ironsource.mediationsdk.O
    public final void c(N n10) {
        P p10 = this.f25392e;
        p10.a(n10);
        this.f25406u++;
        h(n10, "onRewardedVideoAdOpened");
        if (this.f25399m) {
            com.ironsource.mediationsdk.c.b bVar = this.f.get(n10.k());
            if (bVar != null) {
                p10.a(p10.f24900b, bVar.b(this.f25407v));
                C1420h.a(bVar, n10.i(), this.f25394h, this.f25407v);
                this.f25393g.put(n10.k(), C1421j.a.ISAuctionPerformanceShowedSuccessfully);
                b(bVar, this.f25407v);
            } else {
                String k10 = n10.k();
                String l10 = a3.k.l("onRewardedVideoAdOpened showing instance ", k10, " missing from waterfall");
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvManager: " + l10, 3);
                l(IronSourceConstants.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1011}, new Object[]{"reason", "Showing missing " + this.f25410z}, new Object[]{IronSourceConstants.EVENTS_EXT1, k10}}));
            }
        }
        ae.a().a(p10.a(n10.f24884p));
        j(false, null);
        this.f25398l.a();
    }

    @Override // com.ironsource.mediationsdk.InterfaceC1415c
    public final void c_() {
        g(d.RV_STATE_NOT_LOADED);
        j(false, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_EXPIRED_ADS)}, new Object[]{"reason", "loaded ads are expired"}}));
        f(0L);
    }

    @Override // com.ironsource.mediationsdk.O
    public final void d(N n10) {
        boolean z10;
        String str;
        boolean z11;
        h(n10, "onRewardedVideoAdClosed, mediation state: " + this.f25410z.name());
        ae a10 = ae.a();
        P p10 = this.f25392e;
        a10.b(p10.a(n10.f24884p));
        this.y = false;
        if (this.f25410z == d.RV_STATE_READY_TO_SHOW) {
            z10 = true;
        } else {
            z10 = false;
        }
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            Iterator<N> it = p10.a().iterator();
            while (it.hasNext()) {
                N next = it.next();
                if (next.f24877h == N.a.LOADED) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    sb2.append(next.k() + com.huawei.openalliance.ad.constant.w.aG);
                }
            }
        }
        Object[][] objArr = new Object[1];
        Object[] objArr2 = new Object[2];
        objArr2[0] = IronSourceConstants.EVENTS_EXT1;
        StringBuilder sb3 = new StringBuilder("otherRVAvailable = ");
        if (sb2.length() > 0) {
            str = "true|" + ((Object) sb2);
        } else {
            str = ep.V;
        }
        sb3.append(str);
        objArr2[1] = sb3.toString();
        objArr[0] = objArr2;
        n10.a(IronSourceConstants.RV_INSTANCE_CLOSED, objArr);
        if (n10.equals(p10.f24902d)) {
            p10.a((N) null);
            if (this.f25410z != d.RV_STATE_READY_TO_SHOW) {
                j(false, null);
            }
        }
    }

    public final void e(int i10, Map<String, Object> map, boolean z10, boolean z11) {
        HashMap t10 = a3.l.t(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        t10.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 2);
        if (z11) {
            P p10 = this.f25392e;
            if (!TextUtils.isEmpty(p10.f24900b)) {
                t10.put("auctionId", p10.f24900b);
            }
        }
        JSONObject jSONObject = this.f25397k;
        if (jSONObject != null && jSONObject.length() > 0) {
            t10.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f25397k);
        }
        if (z10 && !TextUtils.isEmpty(this.f25407v)) {
            t10.put("placement", this.f25407v);
        }
        if (i10 == 1003 || i10 == 1302 || i10 == 1301 || i10 == 1303) {
            com.ironsource.mediationsdk.a.h.d();
            com.ironsource.mediationsdk.a.b.a(t10, this.f25401p, this.o);
        }
        t10.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f25406u));
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    t10.putAll(map);
                }
            } catch (Exception e10) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvManager: RV sendMediationEvent " + Log.getStackTraceString(e10), 3);
            }
        }
        com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(i10, new JSONObject(t10)));
    }

    public final void f(long j10) {
        if (this.f25405t.a()) {
            a("all smashes are capped");
            l(IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.TROUBLESHOOTING_MEDIATION_TCS_CALCULATED)}, new Object[]{"reason", "all smashes are capped"}}));
            p();
            return;
        }
        this.f25808b.a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
        if (this.f25399m) {
            ConcurrentHashMap<String, C1421j.a> concurrentHashMap = this.f25393g;
            if (!concurrentHashMap.isEmpty()) {
                this.f25395i.a(concurrentHashMap);
                concurrentHashMap.clear();
            }
            new Timer().schedule(new a(), j10);
            return;
        }
        a("auction fallback flow starting");
        m();
        if (!this.f25392e.a().isEmpty()) {
            e(1000, null, false, false);
            o();
        } else {
            a("loadSmashes -  waterfall is empty");
            l(IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80004}, new Object[]{"reason", "waterfall is empty"}}));
            p();
        }
    }

    public final void g(d dVar) {
        a("current state=" + this.f25410z + ", new state=" + dVar);
        this.f25410z = dVar;
    }

    public final void i(JSONObject jSONObject, String str, List list) {
        String str2;
        Iterator it;
        ConcurrentHashMap<String, com.ironsource.mediationsdk.c.b> concurrentHashMap = this.f;
        concurrentHashMap.clear();
        ConcurrentHashMap<String, C1421j.a> concurrentHashMap2 = this.f25393g;
        concurrentHashMap2.clear();
        CopyOnWriteArrayList<N> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        StringBuilder sb2 = new StringBuilder();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            com.ironsource.mediationsdk.c.b bVar = (com.ironsource.mediationsdk.c.b) it2.next();
            StringBuilder sb3 = new StringBuilder();
            String a10 = bVar.a();
            ConcurrentHashMap<String, N> concurrentHashMap3 = this.f25404s;
            N n10 = concurrentHashMap3.get(a10);
            if (n10 != null) {
                str2 = Integer.toString(n10.i());
            } else if (TextUtils.isEmpty(bVar.b())) {
                str2 = "1";
            } else {
                str2 = "2";
            }
            StringBuilder j10 = com.ironsource.adapters.facebook.a.j(str2);
            j10.append(bVar.a());
            sb3.append(j10.toString());
            sb3.append(",");
            sb2.append(sb3.toString());
            N n11 = concurrentHashMap3.get(bVar.a());
            if (n11 != null) {
                AbstractAdapter a11 = C1416d.a().a(n11.f25099b.f25630a);
                if (a11 != null) {
                    it = it2;
                    N n12 = new N(n11, this, a11, this.f25406u, str, jSONObject, this.f25401p, this.o);
                    n12.f25100c = true;
                    copyOnWriteArrayList.add(n12);
                    concurrentHashMap.put(n12.k(), bVar);
                    concurrentHashMap2.put(bVar.a(), C1421j.a.ISAuctionPerformanceDidntAttemptToLoad);
                } else {
                    it = it2;
                }
                it2 = it;
            } else {
                a("updateWaterfall() - could not find matching smash for auction response item " + bVar.a());
            }
        }
        P p10 = this.f25392e;
        p10.a(copyOnWriteArrayList, str);
        if (p10.b()) {
            l(IronSourceConstants.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD, a.AnonymousClass1.a(new Object[][]{new Object[]{"reason", "waterfalls hold too many with size=" + p10.f24899a.size()}}));
        }
        a("updateWaterfall() - next waterfall is " + sb2.toString());
        if (sb2.length() == 0) {
            a("Updated waterfall is empty");
        }
        l(IronSourceConstants.RV_AUCTION_RESPONSE_WATERFALL, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb2.toString()}}));
    }

    public final void j(boolean z10, Map<String, Object> map) {
        int i10;
        synchronized (this.C) {
            Boolean bool = this.B;
            if (bool == null || bool.booleanValue() != z10) {
                this.B = Boolean.valueOf(z10);
                long time = new Date().getTime() - this.A;
                this.A = new Date().getTime();
                if (map == null) {
                    map = new HashMap<>();
                }
                map.put("duration", Long.valueOf(time));
                if (z10) {
                    i10 = IronSourceConstants.RV_CALLBACK_AVAILABILITY_TRUE;
                } else {
                    i10 = IronSourceConstants.RV_CALLBACK_AVAILABILITY_FALSE;
                }
                l(i10, map);
                ae a10 = ae.a();
                P p10 = this.f25392e;
                a10.a(z10, p10.a(p10.f24900b));
            }
        }
    }

    public final void k(String str, List list, Map map) {
        if (map.keySet().size() == 0 && list.size() == 0) {
            l(IronSourceConstants.RV_AUCTION_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{"duration", 0}}));
            a("makeAuction() failed - No candidates available for auctioning");
            p();
            return;
        }
        a("makeAuction() - request waterfall is: " + str);
        e(1000, null, false, false);
        e(1300, null, false, false);
        e(IronSourceConstants.RV_AUCTION_REQUEST_WATERFALL, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, str.toString()}}), false, false);
        this.f25396j.a(ContextProvider.getInstance().getApplicationContext(), map, list, this.f25395i, this.f25406u, this.f25809c);
    }

    public final void l(int i10, Map<String, Object> map) {
        e(i10, map, false, true);
    }

    public final void m() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (N n10 : this.f25404s.values()) {
            if (!n10.g() && !this.f25405t.b(n10) && this.f25392e.b(n10)) {
                copyOnWriteArrayList.add(new com.ironsource.mediationsdk.c.b(n10.k()));
            }
        }
        i(this.f25397k, "fallback_" + System.currentTimeMillis(), copyOnWriteArrayList);
    }

    public final void n(N n10) {
        String k10 = n10.k();
        ConcurrentHashMap<String, com.ironsource.mediationsdk.c.b> concurrentHashMap = this.f;
        String b10 = concurrentHashMap.get(k10).b();
        JSONObject c10 = concurrentHashMap.get(n10.k()).c();
        n10.a(b10);
        n10.a(b10, c10);
    }

    public final void o() {
        P p10 = this.f25392e;
        if (p10.a().isEmpty()) {
            a("loadSmashes -  waterfall is empty");
            l(IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80004}, new Object[]{"reason", "waterfall is empty"}}));
            p();
            return;
        }
        g(d.RV_STATE_LOADING_SMASHES);
        int i10 = 0;
        for (int i11 = 0; i11 < p10.a().size() && i10 < this.f25408w; i11++) {
            N n10 = p10.a().get(i11);
            if (n10.f25100c) {
                if (this.f25409x && n10.g()) {
                    if (i10 == 0) {
                        String str = "Advanced Loading: Starting to load bidder " + n10.k() + ". No other instances will be loaded at the same time.";
                        a(str);
                        IronSourceUtils.sendAutomationLog(str);
                        n(n10);
                        return;
                    }
                    String str2 = "Advanced Loading: Won't start loading bidder " + n10.k() + " as a non bidder is being loaded";
                    a(str2);
                    IronSourceUtils.sendAutomationLog(str2);
                    return;
                }
                n(n10);
                i10++;
            }
        }
    }

    public final void p() {
        g(d.RV_STATE_NOT_LOADED);
        if (!this.y) {
            j(false, null);
        }
        this.f25398l.d();
    }

    @Override // com.ironsource.mediationsdk.D
    public final void a(Context context, boolean z10) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvManager Should Track Network State: " + z10, 0);
        try {
            this.f25403r = z10;
            if (z10) {
                if (this.f25402q == null) {
                    this.f25402q = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.f25402q, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.f25402q != null) {
                context.getApplicationContext().unregisterReceiver(this.f25402q);
            }
        } catch (Exception e10) {
            IronLog.INTERNAL.error("Got an error from receiver with message: " + e10.getMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.O
    public final void b(N n10, Placement placement) {
        h(n10, "onRewardedVideoAdClicked");
        ae.a().b(placement, this.f25392e.a(n10.f24884p));
    }

    /* loaded from: classes2.dex */
    public class c implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map f25413a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ StringBuilder f25414b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f25415c;

        public c(HashMap hashMap, StringBuilder sb2, ArrayList arrayList) {
            this.f25413a = hashMap;
            this.f25414b = sb2;
            this.f25415c = arrayList;
        }

        @Override // com.ironsource.mediationsdk.bidding.b.a
        public final void a(String str) {
            Map<String, Object> a10 = a.AnonymousClass1.a(new Object[][]{new Object[]{"reason", str}});
            e0 e0Var = e0.this;
            e0Var.e(IronSourceConstants.RV_COLLECT_TOKENS_FAILED, a10, false, false);
            e0Var.k(this.f25414b.toString(), this.f25415c, this.f25413a);
        }

        @Override // com.ironsource.mediationsdk.bidding.b.a
        public final void a(List<com.ironsource.sdk.a.e> list, long j10, List<String> list2) {
            StringBuilder sb2;
            Map map;
            Map<String, Object> a10 = a.AnonymousClass1.a(new Object[][]{new Object[]{"duration", Long.valueOf(j10)}});
            e0 e0Var = e0.this;
            e0Var.e(IronSourceConstants.RV_COLLECT_TOKENS_COMPLETED, a10, false, false);
            Iterator<com.ironsource.sdk.a.e> it = list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                sb2 = this.f25414b;
                map = this.f25413a;
                if (!hasNext) {
                    break;
                }
                com.ironsource.sdk.a.e next = it.next();
                N n10 = e0Var.f25404s.get(next.b());
                if (next.c() != null) {
                    map.put(next.b(), next.c());
                    sb2.append(next.a());
                    sb2.append(next.b());
                    sb2.append(",");
                    if (n10 != null) {
                        n10.b(1021, new Object[][]{new Object[]{"duration", Long.valueOf(next.d())}});
                    }
                } else if (n10 != null) {
                    n10.b(1022, new Object[][]{new Object[]{"duration", Long.valueOf(next.d())}, new Object[]{"reason", next.e()}});
                }
            }
            Iterator<String> it2 = list2.iterator();
            while (it2.hasNext()) {
                N n11 = e0Var.f25404s.get(it2.next());
                if (n11 != null) {
                    n11.b(1023, new Object[][]{new Object[]{"duration", Long.valueOf(j10)}});
                }
            }
            e0Var.k(sb2.toString(), this.f25415c, map);
        }
    }

    @Override // com.ironsource.mediationsdk.O
    public final void a(N n10) {
        synchronized (this.C) {
            try {
                h(n10, "onLoadSuccess mState=" + this.f25410z);
                if (n10.f24884p == this.f25392e.f24900b && this.f25410z != d.RV_STATE_AUCTION_IN_PROGRESS) {
                    this.f25393g.put(n10.k(), C1421j.a.ISAuctionPerformanceLoadedSuccessfully);
                    d dVar = this.f25410z;
                    d dVar2 = d.RV_STATE_LOADING_SMASHES;
                    if (dVar == dVar2) {
                        g(d.RV_STATE_READY_TO_SHOW);
                        l(1003, a.AnonymousClass1.a(new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - this.f25400n)}}));
                        this.D.a(0L);
                        if (this.f25399m) {
                            com.ironsource.mediationsdk.c.b bVar = this.f.get(n10.k());
                            if (bVar != null) {
                                P p10 = this.f25392e;
                                p10.a(p10.f24900b, bVar.b(""));
                                C1420h.a(bVar, n10.i(), this.f25394h);
                                this.f25396j.a(this.f25392e.a(), this.f, n10.i(), this.f25394h, bVar);
                            } else {
                                String k10 = n10.k();
                                String str = "onLoadSuccess winner instance " + k10 + " missing from waterfall. auctionId: " + n10.f24884p + " and the current id is " + this.f25392e.f24900b;
                                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvManager: " + str, 3);
                                l(IronSourceConstants.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}, new Object[]{"reason", "Loaded missing " + dVar2}, new Object[]{IronSourceConstants.EVENTS_EXT1, k10}}));
                            }
                        }
                        j(true, null);
                    }
                    return;
                }
                a("onLoadSuccess was invoked with auctionId: " + n10.f24884p + " and the current id is " + this.f25392e.f24900b);
                Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 2};
                StringBuilder sb2 = new StringBuilder("onLoadSuccess wrong auction ID ");
                sb2.append(this.f25410z);
                n10.b(IronSourceConstants.RV_MANAGER_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{"reason", sb2.toString()}});
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.ironsource.mediationsdk.O
    public final void a(N n10, Placement placement) {
        h(n10, "onRewardedVideoAdRewarded");
        ae.a().a(placement, this.f25392e.a(n10.f24884p));
    }

    @Override // com.ironsource.mediationsdk.O
    public final void f(N n10) {
        h(n10, "onRewardedVideoAdEnded");
        ae.a().c();
    }

    @Override // com.ironsource.mediationsdk.O
    public final void a(IronSourceError ironSourceError, N n10) {
        com.ironsource.mediationsdk.c.b bVar;
        boolean z10 = this.f25399m;
        P p10 = this.f25392e;
        if (z10 && (bVar = this.f.get(n10.k())) != null) {
            p10.a(p10.f24900b, bVar.b(this.f25407v));
        }
        h(n10, "onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        this.y = false;
        e(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}}), true, true);
        ae.a().a(ironSourceError, p10.a(n10.f24884p));
        this.f25393g.put(n10.k(), C1421j.a.ISAuctionPerformanceFailedToShow);
        if (this.f25410z != d.RV_STATE_READY_TO_SHOW) {
            j(false, null);
        }
        this.f25398l.c();
    }

    @Override // com.ironsource.mediationsdk.ai
    public final void e() {
        a("onLoadTriggered: RV load was triggered in " + this.f25410z + " state");
        f(0L);
    }

    @Override // com.ironsource.mediationsdk.O
    public final void e(N n10) {
        h(n10, "onRewardedVideoAdStarted");
        ae.a().b();
    }

    @Override // com.ironsource.mediationsdk.D
    public final void a(Placement placement) {
        N n10;
        synchronized (this.C) {
            try {
                if (placement == null) {
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "showRewardedVideo error: empty default placement", 3);
                    IronSourceError ironSourceError = new IronSourceError(1021, "showRewardedVideo error: empty default placement");
                    ae a10 = ae.a();
                    P p10 = this.f25392e;
                    a10.a(ironSourceError, p10.a(p10.f24900b));
                    e(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1021}, new Object[]{"reason", "showRewardedVideo error: empty default placement"}}), false, true);
                    return;
                }
                this.f25407v = placement.getPlacementName();
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
                logger.log(ironSourceTag, "showRewardedVideo(" + placement + ")", 0);
                e(1100, null, true, true);
                if (this.y) {
                    IronSourceLoggerManager.getLogger().log(ironSourceTag, "showRewardedVideo error: can't show ad while an ad is already showing", 3);
                    IronSourceError ironSourceError2 = new IronSourceError(1022, "showRewardedVideo error: can't show ad while an ad is already showing");
                    ae a11 = ae.a();
                    P p11 = this.f25392e;
                    a11.a(ironSourceError2, p11.a(p11.f24900b));
                    e(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1022}, new Object[]{"reason", "showRewardedVideo error: can't show ad while an ad is already showing"}}), true, true);
                    return;
                }
                if (this.f25410z != d.RV_STATE_READY_TO_SHOW) {
                    IronSourceLoggerManager.getLogger().log(ironSourceTag, "showRewardedVideo error: show called while no ads are available", 3);
                    IronSourceError ironSourceError3 = new IronSourceError(1023, "showRewardedVideo error: show called while no ads are available");
                    ae a12 = ae.a();
                    P p12 = this.f25392e;
                    a12.a(ironSourceError3, p12.a(p12.f24900b));
                    e(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1023}, new Object[]{"reason", "showRewardedVideo error: show called while no ads are available"}}), true, true);
                    return;
                }
                if (com.ironsource.mediationsdk.utils.k.c(ContextProvider.getInstance().getApplicationContext(), this.f25407v)) {
                    String str = "showRewardedVideo error: placement " + this.f25407v + " is capped";
                    IronSourceLoggerManager.getLogger().log(ironSourceTag, str, 3);
                    IronSourceError ironSourceError4 = new IronSourceError(IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT, str);
                    ae a13 = ae.a();
                    P p13 = this.f25392e;
                    a13.a(ironSourceError4, p13.a(p13.f24900b));
                    e(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT)}, new Object[]{"reason", str}}), true, true);
                    return;
                }
                StringBuffer stringBuffer = new StringBuffer();
                Iterator<N> it = this.f25392e.a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        n10 = null;
                        break;
                    }
                    n10 = it.next();
                    if (n10.a()) {
                        this.y = true;
                        n10.a(true);
                        g(d.RV_STATE_NOT_LOADED);
                        break;
                    }
                    if (n10.o() != null) {
                        stringBuffer.append(n10.k() + com.huawei.openalliance.ad.constant.w.bE + n10.o() + ",");
                    }
                    n10.a(false);
                }
                if (n10 == null) {
                    a("showRewardedVideo(): No ads to show");
                    ae a14 = ae.a();
                    IronSourceError buildNoAdsToShowError = ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
                    P p14 = this.f25392e;
                    a14.a(buildNoAdsToShowError, p14.a(p14.f24900b));
                    HashMap hashMap = new HashMap();
                    hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW));
                    hashMap.put("reason", "showRewardedVideo(): No ads to show");
                    if (stringBuffer.length() != 0) {
                        hashMap.put(IronSourceConstants.EVENTS_EXT1, stringBuffer.toString());
                    }
                    e(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, hashMap, true, true);
                    this.f25398l.c();
                    return;
                }
                a("showVideo()");
                this.f25405t.a(n10);
                if (this.f25405t.b(n10)) {
                    n10.b_();
                    IronSourceUtils.sendAutomationLog(n10.k() + " rewarded video is now session capped");
                }
                com.ironsource.mediationsdk.utils.k.e(ContextProvider.getInstance().getApplicationContext(), placement.getPlacementName());
                if (com.ironsource.mediationsdk.utils.k.c(ContextProvider.getInstance().getApplicationContext(), placement.getPlacementName())) {
                    e(IronSourceConstants.RV_CAP_PLACEMENT, null, true, true);
                }
                this.D.a();
                n10.a(placement);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.ironsource.mediationsdk.D
    public final boolean c() {
        if ((!this.f25403r || IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getApplicationContext())) && this.f25410z == d.RV_STATE_READY_TO_SHOW && !this.y) {
            Iterator<N> it = this.f25392e.a().iterator();
            while (it.hasNext()) {
                if (it.next().a()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvManager: " + str, 0);
    }

    @Override // com.ironsource.mediationsdk.InterfaceC1419g
    public final void a(List<com.ironsource.mediationsdk.c.b> list, String str, com.ironsource.mediationsdk.c.b bVar, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) {
        a("makeAuction(): success");
        this.f25394h = bVar;
        this.f25401p = i10;
        this.f25397k = jSONObject;
        this.o = "";
        if (!TextUtils.isEmpty(str2)) {
            l(IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i11)}, new Object[]{"reason", str2}}));
        }
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
        c(ad_unit, jSONObject2);
        if (this.f25808b.a(ad_unit)) {
            l(IronSourceConstants.RV_AD_UNIT_CAPPED, a.AnonymousClass1.a(new Object[][]{new Object[]{"auctionId", str}}));
            p();
        } else {
            i(this.f25397k, str, list);
            l(IronSourceConstants.RV_AUCTION_SUCCESS, a.AnonymousClass1.a(new Object[][]{new Object[]{"duration", Long.valueOf(j10)}}));
            o();
        }
    }

    @Override // com.ironsource.environment.j
    public final void a(boolean z10) {
        if (this.f25403r) {
            boolean z11 = false;
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "Network Availability Changed To: " + z10, 0);
            Boolean bool = this.B;
            if (bool != null && ((z10 && !bool.booleanValue() && c()) || (!z10 && this.B.booleanValue()))) {
                z11 = true;
            }
            if (z11) {
                j(z10, null);
            }
        }
    }
}
