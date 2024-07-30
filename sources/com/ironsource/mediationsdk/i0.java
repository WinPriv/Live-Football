package com.ironsource.mediationsdk;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C1421j;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.bidding.b;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
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
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class i0 extends s implements C, X, InterfaceC1419g {
    public boolean A;

    /* renamed from: e, reason: collision with root package name */
    public final com.ironsource.mediationsdk.utils.n f25461e;
    public c f;

    /* renamed from: g, reason: collision with root package name */
    public final ConcurrentHashMap<String, Y> f25462g;

    /* renamed from: h, reason: collision with root package name */
    public final CopyOnWriteArrayList<Y> f25463h;

    /* renamed from: i, reason: collision with root package name */
    public final ConcurrentHashMap<String, com.ironsource.mediationsdk.c.b> f25464i;

    /* renamed from: j, reason: collision with root package name */
    public final ConcurrentHashMap<String, C1421j.a> f25465j;

    /* renamed from: k, reason: collision with root package name */
    public com.ironsource.mediationsdk.c.b f25466k;

    /* renamed from: l, reason: collision with root package name */
    public String f25467l;

    /* renamed from: m, reason: collision with root package name */
    public String f25468m;

    /* renamed from: n, reason: collision with root package name */
    public JSONObject f25469n;
    public final int o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f25470p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f25471q;

    /* renamed from: r, reason: collision with root package name */
    public final long f25472r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f25473s;

    /* renamed from: t, reason: collision with root package name */
    public final C1420h f25474t;

    /* renamed from: u, reason: collision with root package name */
    public final C1421j f25475u;

    /* renamed from: v, reason: collision with root package name */
    public final long f25476v;

    /* renamed from: w, reason: collision with root package name */
    public final long f25477w;

    /* renamed from: x, reason: collision with root package name */
    public long f25478x;
    public int y;

    /* renamed from: z, reason: collision with root package name */
    public String f25479z;

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            c cVar = c.STATE_AUCTION;
            i0 i0Var = i0.this;
            i0Var.g(cVar);
            AsyncTask.execute(new h0(i0Var));
        }
    }

    /* loaded from: classes2.dex */
    public enum c {
        STATE_NOT_INITIALIZED,
        STATE_READY_TO_LOAD,
        STATE_AUCTION,
        STATE_LOADING_SMASHES,
        STATE_READY_TO_SHOW,
        STATE_SHOWING
    }

    public i0(List<NetworkSettings> list, com.ironsource.mediationsdk.model.k kVar, String str, String str2, int i10, HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        super(hashSet, ironSourceSegment);
        boolean z10;
        this.f25479z = "";
        boolean z11 = false;
        this.A = false;
        long e10 = e0.i.e();
        f(IronSourceConstants.IS_MANAGER_INIT_STARTED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, IronSourceConstants.PROG_IS_MANAGER_NAME}}, false);
        g(c.STATE_NOT_INITIALIZED);
        this.f25462g = new ConcurrentHashMap<>();
        this.f25463h = new CopyOnWriteArrayList<>();
        this.f25464i = new ConcurrentHashMap<>();
        this.f25465j = new ConcurrentHashMap<>();
        this.f25467l = "";
        this.f25468m = "";
        this.f25469n = null;
        this.o = kVar.f25681c;
        this.f25470p = kVar.f25682d;
        this.f25471q = kVar.f25687j;
        this.f25472r = kVar.f25688k;
        C1430u.a().a(IronSource.AD_UNIT.INTERSTITIAL, i10);
        com.ironsource.mediationsdk.utils.c cVar = kVar.f25686i;
        this.f25477w = cVar.f25896j;
        if (cVar.f > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f25473s = z10;
        if (z10) {
            this.f25474t = new C1420h("interstitial", cVar, this);
        }
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : list) {
            AbstractAdapter a10 = C1416d.a().a(networkSettings, networkSettings.getInterstitialSettings(), z11, z11);
            if (a10 != null && C1417e.b(a10, C1417e.a().f25390a, "interstitial")) {
                Y y = new Y(str, str2, networkSettings, this, kVar.f25683e, a10);
                String k10 = y.k();
                this.f25462g.put(k10, y);
                arrayList.add(k10);
            }
            z11 = false;
        }
        this.f25475u = new C1421j(arrayList, cVar.f25893g);
        this.f25461e = new com.ironsource.mediationsdk.utils.n(new ArrayList(this.f25462g.values()));
        for (Y y10 : this.f25462g.values()) {
            if (y10.g() || y10.h()) {
                y10.a();
            }
        }
        this.f25476v = e0.i.e();
        g(c.STATE_READY_TO_LOAD);
        f(IronSourceConstants.IS_MANAGER_INIT_ENDED, new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - e10)}}, false);
    }

    public static void h(Y y, String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgIsManager " + y.k() + " : " + str, 0);
    }

    public static boolean k(int i10) {
        if (i10 != 2002 && i10 != 2003 && i10 != 2200 && i10 != 2213 && i10 != 2005 && i10 != 2204 && i10 != 2201 && i10 != 2203 && i10 != 2006 && i10 != 2004 && i10 != 2110 && i10 != 2301 && i10 != 2300 && i10 != 2303) {
            return false;
        }
        return true;
    }

    public static void l(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgIsManager " + str, 0);
    }

    @Override // com.ironsource.mediationsdk.InterfaceC1419g
    public final void a(int i10, String str, int i11, String str2, long j10) {
        String str3 = "Auction failed | moving to fallback waterfall (error " + i10 + " - " + str + ")";
        l(str3);
        IronSourceUtils.sendAutomationLog("IS: " + str3);
        this.y = i11;
        this.f25479z = str2;
        this.f25469n = null;
        m();
        if (TextUtils.isEmpty(str)) {
            f(IronSourceConstants.IS_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{"duration", Long.valueOf(j10)}}, false);
        } else {
            f(IronSourceConstants.IS_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{"reason", str}, new Object[]{"duration", Long.valueOf(j10)}}, false);
        }
        o();
    }

    @Override // com.ironsource.mediationsdk.X
    public final void b(Y y) {
        synchronized (this) {
            h(y, "onInterstitialAdClosed");
            e(IronSourceConstants.IS_INSTANCE_CLOSED, y, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(com.ironsource.mediationsdk.utils.o.a().b(2))}}, true);
            com.ironsource.mediationsdk.utils.o.a().a(2);
            F.a().c(this.f25810d);
            g(c.STATE_READY_TO_LOAD);
        }
    }

    @Override // com.ironsource.mediationsdk.X
    public final void c(Y y) {
        h(y, "onInterstitialAdShowSucceeded");
        F.a().d(this.f25810d);
        e(IronSourceConstants.IS_INSTANCE_SHOW_SUCCESS, y, null, true);
    }

    @Override // com.ironsource.mediationsdk.X
    public final void d(Y y) {
        h(y, "onInterstitialAdClicked");
        F.a().e(this.f25810d);
        e(2006, y, null, true);
    }

    public final void e(int i10, Y y, Object[][] objArr, boolean z10) {
        Map<String, Object> n10 = y.n();
        if (!TextUtils.isEmpty(this.f25468m)) {
            n10.put("auctionId", this.f25468m);
        }
        JSONObject jSONObject = this.f25469n;
        if (jSONObject != null && jSONObject.length() > 0) {
            n10.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f25469n);
        }
        if (z10 && !TextUtils.isEmpty(this.f25467l)) {
            n10.put("placement", this.f25467l);
        }
        if (k(i10)) {
            com.ironsource.mediationsdk.a.d.d();
            com.ironsource.mediationsdk.a.b.a(n10, this.y, this.f25479z);
        }
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    n10.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e10) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "IS sendProviderEvent " + Log.getStackTraceString(e10), 3);
            }
        }
        com.ironsource.mediationsdk.a.d.d().b(new com.ironsource.mediationsdk.a.c(i10, new JSONObject(n10)));
    }

    public final void f(int i10, Object[][] objArr, boolean z10) {
        HashMap t10 = a3.l.t(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        t10.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        if (!TextUtils.isEmpty(this.f25468m)) {
            t10.put("auctionId", this.f25468m);
        }
        JSONObject jSONObject = this.f25469n;
        if (jSONObject != null && jSONObject.length() > 0) {
            t10.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f25469n);
        }
        if (z10 && !TextUtils.isEmpty(this.f25467l)) {
            t10.put("placement", this.f25467l);
        }
        if (k(i10)) {
            com.ironsource.mediationsdk.a.d.d();
            com.ironsource.mediationsdk.a.b.a(t10, this.y, this.f25479z);
        }
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    t10.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e10) {
                l("sendMediationEvent " + e10.getMessage());
            }
        }
        com.ironsource.mediationsdk.a.d.d().b(new com.ironsource.mediationsdk.a.c(i10, new JSONObject(t10)));
    }

    public final void g(c cVar) {
        this.f = cVar;
        l("state=" + cVar);
    }

    public final void i(List<com.ironsource.mediationsdk.c.b> list) {
        String str;
        CopyOnWriteArrayList<Y> copyOnWriteArrayList = this.f25463h;
        copyOnWriteArrayList.clear();
        ConcurrentHashMap<String, com.ironsource.mediationsdk.c.b> concurrentHashMap = this.f25464i;
        concurrentHashMap.clear();
        ConcurrentHashMap<String, C1421j.a> concurrentHashMap2 = this.f25465j;
        concurrentHashMap2.clear();
        StringBuilder sb2 = new StringBuilder();
        for (com.ironsource.mediationsdk.c.b bVar : list) {
            StringBuilder sb3 = new StringBuilder();
            ConcurrentHashMap<String, Y> concurrentHashMap3 = this.f25462g;
            Y y = concurrentHashMap3.get(bVar.a());
            if (y != null) {
                str = Integer.toString(y.i());
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
            Y y10 = concurrentHashMap3.get(bVar.a());
            if (y10 != null) {
                y10.f25100c = true;
                copyOnWriteArrayList.add(y10);
                concurrentHashMap.put(y10.k(), bVar);
                concurrentHashMap2.put(bVar.a(), C1421j.a.ISAuctionPerformanceDidntAttemptToLoad);
            } else {
                l("updateWaterfall() - could not find matching smash for auction response item " + bVar.a());
            }
        }
        l("updateWaterfall() - next waterfall is " + sb2.toString());
        if (sb2.length() == 0) {
            l("Updated waterfall is empty");
        }
        f(IronSourceConstants.IS_RESULT_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb2.toString()}}, false);
    }

    public final void j(String str, List list, Map map) {
        if (map.size() == 0 && list.size() == 0) {
            f(IronSourceConstants.IS_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{"duration", 0}}, false);
            l("makeAuction() failed - No candidates available for auctioning");
            C1430u.a().a(IronSource.AD_UNIT.INTERSTITIAL, new IronSourceError(1005, "No candidates available for auctioning"));
            f(IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}}, false);
            g(c.STATE_READY_TO_LOAD);
            return;
        }
        f(IronSourceConstants.IS_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, str}}, false);
        int b10 = com.ironsource.mediationsdk.utils.o.a().b(2);
        C1420h c1420h = this.f25474t;
        if (c1420h != null) {
            c1420h.a(ContextProvider.getInstance().getApplicationContext(), map, list, this.f25475u, b10, this.f25809c);
        }
    }

    public final void m() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (Y y : this.f25462g.values()) {
            if (!y.g() && !this.f25461e.b(y)) {
                copyOnWriteArrayList.add(new com.ironsource.mediationsdk.c.b(y.k()));
            }
        }
        this.f25468m = s.d();
        i(copyOnWriteArrayList);
    }

    public final void n(Y y) {
        ConcurrentHashMap<String, com.ironsource.mediationsdk.c.b> concurrentHashMap = this.f25464i;
        String b10 = concurrentHashMap.get(y.k()).b();
        JSONObject c10 = concurrentHashMap.get(y.k()).c();
        y.a(b10);
        e(2002, y, null, false);
        y.a(b10, c10);
    }

    public final void o() {
        CopyOnWriteArrayList<Y> copyOnWriteArrayList = this.f25463h;
        if (copyOnWriteArrayList.isEmpty()) {
            g(c.STATE_READY_TO_LOAD);
            f(IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES)}, new Object[]{"reason", "Empty waterfall"}}, false);
            C1430u.a().a(IronSource.AD_UNIT.INTERSTITIAL, new IronSourceError(IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES, "Empty waterfall"));
            return;
        }
        g(c.STATE_LOADING_SMASHES);
        int i10 = 0;
        for (int i11 = 0; i11 < copyOnWriteArrayList.size() && i10 < this.o; i11++) {
            Y y = copyOnWriteArrayList.get(i11);
            if (y.f25100c) {
                if (this.f25470p && y.g()) {
                    if (i10 == 0) {
                        String str = "Advanced Loading: Starting to load bidder " + y.k() + ". No other instances will be loaded at the same time.";
                        l(str);
                        IronSourceUtils.sendAutomationLog(str);
                        n(y);
                        return;
                    }
                    String str2 = "Advanced Loading: Won't start loading bidder " + y.k() + " as a non bidder is being loaded";
                    l(str2);
                    IronSourceUtils.sendAutomationLog(str2);
                    return;
                }
                n(y);
                i10++;
            }
        }
    }

    public final synchronized void e() {
        c cVar = this.f;
        if (cVar == c.STATE_SHOWING) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "loadInterstitial: load cannot be invoked while showing an ad", 3);
            F.a().a(new IronSourceError(IronSourceError.ERROR_IS_LOAD_DURING_SHOW, "loadInterstitial: load cannot be invoked while showing an ad"));
            return;
        }
        if (cVar == c.STATE_READY_TO_LOAD || cVar == c.STATE_READY_TO_SHOW) {
            C1430u a10 = C1430u.a();
            IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
            if (!a10.a(ad_unit)) {
                this.f25468m = "";
                this.f25467l = "";
                this.f25469n = null;
                this.f25808b.a(ad_unit, false);
                a_();
                f(2001, null, false);
                this.f25478x = new Date().getTime();
                if (!this.f25473s) {
                    m();
                    o();
                    return;
                }
                if (!this.f25465j.isEmpty()) {
                    this.f25475u.a(this.f25465j);
                    this.f25465j.clear();
                }
                g(c.STATE_AUCTION);
                AsyncTask.execute(new h0(this));
                return;
            }
        }
        l("loadInterstitial: load is already in progress");
    }

    /* loaded from: classes2.dex */
    public class a implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map f25480a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ StringBuilder f25481b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f25482c;

        public a(HashMap hashMap, StringBuilder sb2, ArrayList arrayList) {
            this.f25480a = hashMap;
            this.f25481b = sb2;
            this.f25482c = arrayList;
        }

        @Override // com.ironsource.mediationsdk.bidding.b.a
        public final void a(String str) {
            Object[][] objArr = {new Object[]{"reason", str}};
            i0 i0Var = i0.this;
            i0Var.f(IronSourceConstants.IS_COLLECT_TOKENS_FAILED, objArr, false);
            i0Var.j(this.f25481b.toString(), this.f25482c, this.f25480a);
        }

        @Override // com.ironsource.mediationsdk.bidding.b.a
        public final void a(List<com.ironsource.sdk.a.e> list, long j10, List<String> list2) {
            StringBuilder sb2;
            Map map;
            Object[][] objArr = {new Object[]{"duration", Long.valueOf(j10)}};
            i0 i0Var = i0.this;
            i0Var.f(IronSourceConstants.IS_COLLECT_TOKENS_COMPLETED, objArr, false);
            Iterator<com.ironsource.sdk.a.e> it = list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                sb2 = this.f25481b;
                map = this.f25480a;
                if (!hasNext) {
                    break;
                }
                com.ironsource.sdk.a.e next = it.next();
                if (next.c() != null) {
                    map.put(next.b(), next.c());
                    sb2.append(next.a());
                    sb2.append(next.b());
                    sb2.append(",");
                    i0Var.e(IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_SUCCESS, i0Var.f25462g.get(next.b()), new Object[][]{new Object[]{"duration", Long.valueOf(next.d())}}, false);
                } else {
                    i0Var.e(IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_FAILED, i0Var.f25462g.get(next.b()), new Object[][]{new Object[]{"duration", Long.valueOf(next.d())}, new Object[]{"reason", next.e()}}, false);
                }
            }
            Iterator<String> it2 = list2.iterator();
            while (it2.hasNext()) {
                i0Var.e(IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_TIMED_OUT, i0Var.f25462g.get(it2.next()), new Object[][]{new Object[]{"duration", Long.valueOf(j10)}}, false);
            }
            i0Var.j(sb2.toString(), this.f25482c, map);
        }
    }

    @Override // com.ironsource.mediationsdk.X
    public final void b(IronSourceError ironSourceError, Y y) {
        e(IronSourceConstants.IS_INSTANCE_INIT_FAILED, y, new Object[][]{new Object[]{"reason", ironSourceError.getErrorMessage()}}, false);
    }

    @Override // com.ironsource.mediationsdk.X
    public final void a(Y y) {
        synchronized (this) {
            try {
                h(y, "onInterstitialAdOpened");
                e(IronSourceConstants.IS_INSTANCE_OPENED, y, null, true);
                if (this.f25473s) {
                    com.ironsource.mediationsdk.c.b bVar = this.f25464i.get(y.k());
                    if (bVar != null) {
                        a(bVar.b(this.f25467l));
                        C1420h.a(bVar, y.i(), this.f25466k, this.f25467l);
                        this.f25465j.put(y.k(), C1421j.a.ISAuctionPerformanceShowedSuccessfully);
                        b(bVar, this.f25467l);
                    } else {
                        String k10 = y.k();
                        l("onInterstitialAdOpened showing instance " + k10 + " missing from waterfall");
                        f(IronSourceConstants.TROUBLESHOOTING_IS_NOTIFICATIONS_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1011}, new Object[]{"reason", "Showing missing " + this.f}, new Object[]{IronSourceConstants.EVENTS_EXT1, k10}}, false);
                    }
                }
                F.a().b(this.f25810d);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.ironsource.mediationsdk.X
    public final void e(Y y) {
        h(y, "onInterstitialAdVisible");
    }

    @Override // com.ironsource.mediationsdk.X
    public final void f(Y y) {
        e(IronSourceConstants.IS_INSTANCE_INIT_SUCCESS, y, null, false);
    }

    public final synchronized boolean f() {
        if ((this.A && !IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getApplicationContext())) || this.f != c.STATE_READY_TO_SHOW) {
            return false;
        }
        Iterator<Y> it = this.f25463h.iterator();
        while (it.hasNext()) {
            if (it.next().f()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ironsource.mediationsdk.X
    public final void a(Y y, long j10) {
        synchronized (this) {
            h(y, "onInterstitialAdReady");
            e(2003, y, new Object[][]{new Object[]{"duration", Long.valueOf(j10)}}, false);
            if (this.f25465j.containsKey(y.k())) {
                this.f25465j.put(y.k(), C1421j.a.ISAuctionPerformanceLoadedSuccessfully);
            }
            if (this.f == c.STATE_LOADING_SMASHES) {
                g(c.STATE_READY_TO_SHOW);
                f(2004, new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - this.f25478x)}}, false);
                if (this.f25473s) {
                    com.ironsource.mediationsdk.c.b bVar = this.f25464i.get(y.k());
                    if (bVar != null) {
                        a(bVar.b(""));
                        C1420h.a(bVar, y.i(), this.f25466k);
                        this.f25474t.a(this.f25463h, this.f25464i, y.i(), this.f25466k, bVar);
                    } else {
                        String k10 = y.k();
                        l("onInterstitialAdReady winner instance " + k10 + " missing from waterfall");
                        f(IronSourceConstants.TROUBLESHOOTING_IS_NOTIFICATIONS_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}, new Object[]{"reason", "Loaded missing"}, new Object[]{IronSourceConstants.EVENTS_EXT1, k10}}, false);
                    }
                }
                F.a().a(this.f25810d);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.X
    public final void a(IronSourceError ironSourceError, Y y) {
        com.ironsource.mediationsdk.c.b bVar;
        synchronized (this) {
            if (this.f25473s && (bVar = this.f25464i.get(y.k())) != null) {
                a(bVar.b(this.f25467l));
            }
            h(y, "onInterstitialAdShowFailed error=" + ironSourceError.getErrorMessage());
            F.a().a(ironSourceError, this.f25810d);
            e(IronSourceConstants.IS_INSTANCE_SHOW_FAILED, y, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}}, true);
            this.f25465j.put(y.k(), C1421j.a.ISAuctionPerformanceFailedToShow);
            g(c.STATE_READY_TO_LOAD);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0145 A[SYNTHETIC] */
    @Override // com.ironsource.mediationsdk.X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.ironsource.mediationsdk.logger.IronSourceError r8, com.ironsource.mediationsdk.Y r9, long r10) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.i0.a(com.ironsource.mediationsdk.logger.IronSourceError, com.ironsource.mediationsdk.Y, long):void");
    }

    public final synchronized void a(String str) {
        c cVar = this.f;
        if (cVar == c.STATE_SHOWING) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "showInterstitial error: can't show ad while an ad is already showing", 3);
            F.a().a(new IronSourceError(IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW, "showInterstitial error: can't show ad while an ad is already showing"), this.f25810d);
            f(IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW)}, new Object[]{"reason", "showInterstitial error: can't show ad while an ad is already showing"}}, false);
            return;
        }
        if (cVar != c.STATE_READY_TO_SHOW) {
            l("showInterstitial() error state=" + this.f.toString());
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "showInterstitial error: show called while no ads are available", 3);
            F.a().a(new IronSourceError(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "showInterstitial error: show called while no ads are available"), this.f25810d);
            f(IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW)}, new Object[]{"reason", "showInterstitial error: show called while no ads are available"}}, false);
            return;
        }
        if (str == null) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "showInterstitial error: empty default placement", 3);
            F.a().a(new IronSourceError(1020, "showInterstitial error: empty default placement"), this.f25810d);
            f(IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1020}, new Object[]{"reason", "showInterstitial error: empty default placement"}}, false);
            return;
        }
        this.f25467l = str;
        f(2100, null, true);
        if (com.ironsource.mediationsdk.utils.k.a(ContextProvider.getInstance().getApplicationContext(), str)) {
            String str2 = "placement " + this.f25467l + " is capped";
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, str2, 3);
            F.a().a(new IronSourceError(IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT, str2), this.f25810d);
            f(IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT)}, new Object[]{"reason", str2}}, true);
            return;
        }
        Iterator<Y> it = this.f25463h.iterator();
        while (it.hasNext()) {
            Y next = it.next();
            if (next.f()) {
                g(c.STATE_SHOWING);
                next.b();
                e(IronSourceConstants.IS_INSTANCE_SHOW, next, null, true);
                this.f25461e.a(next);
                if (this.f25461e.b(next)) {
                    next.e();
                    e(IronSourceConstants.IS_CAP_SESSION, next, null, false);
                    IronSourceUtils.sendAutomationLog(next.k() + " was session capped");
                }
                com.ironsource.mediationsdk.utils.k.d(ContextProvider.getInstance().getApplicationContext(), str);
                if (com.ironsource.mediationsdk.utils.k.a(ContextProvider.getInstance().getApplicationContext(), str)) {
                    f(IronSourceConstants.IS_CAP_PLACEMENT, null, true);
                }
                return;
            }
            l("showInterstitial " + next.k() + " isReadyToShow() == false");
        }
        F.a().a(ErrorBuilder.buildNoAdsToShowError("Interstitial"), this.f25810d);
        f(IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW)}, new Object[]{"reason", "Show Fail - No ads to show"}}, true);
    }

    @Override // com.ironsource.mediationsdk.InterfaceC1419g
    public final void a(List<com.ironsource.mediationsdk.c.b> list, String str, com.ironsource.mediationsdk.c.b bVar, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) {
        this.f25468m = str;
        this.f25466k = bVar;
        this.f25469n = jSONObject;
        this.y = i10;
        this.f25479z = "";
        if (!TextUtils.isEmpty(str2)) {
            f(IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i11)}, new Object[]{"reason", str2}}, false);
        }
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
        c(ad_unit, jSONObject2);
        if (this.f25808b.a(ad_unit)) {
            f(IronSourceConstants.IS_AD_UNIT_CAPPED, new Object[][]{new Object[]{"auctionId", str}}, false);
            g(c.STATE_READY_TO_LOAD);
            C1430u.a().a(ad_unit, new IronSourceError(IronSourceError.ERROR_AD_UNIT_CAPPED, "Ad unit is capped"));
        } else {
            f(IronSourceConstants.IS_AUCTION_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(j10)}}, false);
            i(list);
            o();
        }
    }
}
