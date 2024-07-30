package com.ironsource.mediationsdk.adunit.c;

import a3.l;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.j;
import com.ironsource.mediationsdk.B;
import com.ironsource.mediationsdk.C1416d;
import com.ironsource.mediationsdk.C1420h;
import com.ironsource.mediationsdk.C1421j;
import com.ironsource.mediationsdk.C1430u;
import com.ironsource.mediationsdk.F;
import com.ironsource.mediationsdk.InterfaceC1415c;
import com.ironsource.mediationsdk.InterfaceC1419g;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.adunit.b.d;
import com.ironsource.mediationsdk.adunit.c.b.a;
import com.ironsource.mediationsdk.adunit.d.a.c;
import com.ironsource.mediationsdk.ae;
import com.ironsource.mediationsdk.ai;
import com.ironsource.mediationsdk.bidding.b;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoManualListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.m;
import com.ironsource.mediationsdk.utils.n;
import com.ironsource.mediationsdk.utils.o;
import e0.i;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class e<Smash extends com.ironsource.mediationsdk.adunit.d.a.c<?>, Adapter extends BaseAdAdapter<?, ? extends AdapterAdListener>> implements j, com.ironsource.mediationsdk.adunit.b.c, com.ironsource.mediationsdk.adunit.c.a.b, com.ironsource.mediationsdk.adunit.e.b, ai, InterfaceC1415c, InterfaceC1419g {
    public final long A;
    public final Set<ImpressionDataListener> B;

    /* renamed from: a, reason: collision with root package name */
    public final com.ironsource.mediationsdk.adunit.e.a<Smash> f25197a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap<String, com.ironsource.mediationsdk.c.b> f25198b;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap<String, C1421j.a> f25199c;

    /* renamed from: d, reason: collision with root package name */
    public final C1420h f25200d;

    /* renamed from: e, reason: collision with root package name */
    public C1421j f25201e;
    public int f;

    /* renamed from: h, reason: collision with root package name */
    public JSONObject f25203h;

    /* renamed from: i, reason: collision with root package name */
    public com.ironsource.mediationsdk.c.b f25204i;

    /* renamed from: j, reason: collision with root package name */
    public Placement f25205j;

    /* renamed from: l, reason: collision with root package name */
    public n f25207l;

    /* renamed from: m, reason: collision with root package name */
    public final com.ironsource.mediationsdk.utils.f f25208m;

    /* renamed from: n, reason: collision with root package name */
    public com.ironsource.mediationsdk.utils.f f25209n;
    public final com.ironsource.mediationsdk.adunit.c.a o;

    /* renamed from: p, reason: collision with root package name */
    public a f25210p;

    /* renamed from: q, reason: collision with root package name */
    public final com.ironsource.mediationsdk.adunit.c.c f25211q;

    /* renamed from: r, reason: collision with root package name */
    public final B f25212r;

    /* renamed from: s, reason: collision with root package name */
    public final com.ironsource.mediationsdk.adunit.b.d f25213s;

    /* renamed from: t, reason: collision with root package name */
    public final tb.a f25214t;

    /* renamed from: u, reason: collision with root package name */
    public final com.ironsource.mediationsdk.utils.a f25215u;

    /* renamed from: v, reason: collision with root package name */
    public IronSourceSegment f25216v;
    public Boolean y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f25219z;

    /* renamed from: g, reason: collision with root package name */
    public String f25202g = "";

    /* renamed from: k, reason: collision with root package name */
    public boolean f25206k = false;

    /* renamed from: w, reason: collision with root package name */
    public final Object f25217w = new Object();

    /* renamed from: x, reason: collision with root package name */
    public long f25218x = 0;

    /* loaded from: classes2.dex */
    public enum a {
        NONE,
        READY_TO_LOAD,
        AUCTION,
        LOADING,
        READY_TO_SHOW,
        SHOWING
    }

    /* loaded from: classes2.dex */
    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            e.h(e.this);
        }
    }

    /* loaded from: classes2.dex */
    public class c implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map f25227a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ StringBuilder f25228b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f25229c;

        public c(HashMap hashMap, StringBuilder sb2, ArrayList arrayList) {
            this.f25227a = hashMap;
            this.f25228b = sb2;
            this.f25229c = arrayList;
        }

        @Override // com.ironsource.mediationsdk.bidding.b.a
        public final void a(String str) {
            e eVar = e.this;
            eVar.f25213s.f25161c.a(str);
            eVar.k(this.f25228b.toString(), this.f25229c, this.f25227a);
        }

        @Override // com.ironsource.mediationsdk.bidding.b.a
        public final void a(List<com.ironsource.sdk.a.e> list, long j10, List<String> list2) {
            com.ironsource.mediationsdk.adunit.b.d dVar;
            com.ironsource.mediationsdk.adunit.c.a aVar;
            StringBuilder sb2;
            Map map;
            e eVar = e.this;
            eVar.f25213s.f25161c.a(j10);
            Iterator<com.ironsource.sdk.a.e> it = list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                dVar = eVar.f25213s;
                aVar = eVar.o;
                sb2 = this.f25228b;
                map = this.f25227a;
                if (!hasNext) {
                    break;
                }
                com.ironsource.sdk.a.e next = it.next();
                NetworkSettings a10 = aVar.a(next.b());
                HashMap e10 = eVar.e(C1416d.a().a(a10, aVar.f25175a), a10);
                if (next.c() != null) {
                    map.put(next.b(), next.c());
                    sb2.append(next.a());
                    sb2.append(next.b());
                    sb2.append(",");
                    dVar.f25161c.a(e10, next.d());
                } else {
                    dVar.f25161c.a(e10, next.d(), next.e());
                }
            }
            Iterator<String> it2 = list2.iterator();
            while (it2.hasNext()) {
                NetworkSettings a11 = aVar.a(it2.next());
                dVar.f25161c.b(eVar.e(C1416d.a().a(a11, aVar.f25175a), a11), j10);
            }
            eVar.k(sb2.toString(), this.f25229c, map);
        }
    }

    public e(com.ironsource.mediationsdk.adunit.c.a aVar, Set<ImpressionDataListener> set, IronSourceSegment ironSourceSegment) {
        boolean z10;
        JSONObject jSONObject;
        this.B = new HashSet();
        IronLog ironLog = IronLog.INTERNAL;
        StringBuilder sb2 = new StringBuilder("adUnit = ");
        sb2.append(aVar.f25175a);
        sb2.append(", loading mode = ");
        com.ironsource.mediationsdk.adunit.c.b.a aVar2 = aVar.f25181h;
        sb2.append(aVar2.f25185a);
        ironLog.verbose(sb2.toString());
        com.ironsource.mediationsdk.utils.f fVar = new com.ironsource.mediationsdk.utils.f();
        this.f25216v = ironSourceSegment;
        this.o = aVar;
        d.b bVar = d.b.MEDIATION;
        IronSource.AD_UNIT ad_unit = aVar.f25175a;
        com.ironsource.mediationsdk.adunit.b.d dVar = new com.ironsource.mediationsdk.adunit.b.d(ad_unit, bVar, this);
        this.f25213s = dVar;
        this.f25214t = new tb.a(ad_unit);
        this.f25211q = new com.ironsource.mediationsdk.adunit.c.c(aVar2, this);
        this.f25219z = aVar.f25183j;
        this.A = aVar.f25184k;
        g(a.NONE);
        this.B = set;
        com.ironsource.mediationsdk.utils.c cVar = aVar.f25178d;
        this.f25197a = new com.ironsource.mediationsdk.adunit.e.a<>(cVar.f25901p, cVar.f25894h, this);
        dVar.f25159a.a(n(), aVar2.f25185a.toString());
        this.f25198b = new ConcurrentHashMap<>();
        this.f25199c = new ConcurrentHashMap<>();
        this.f25205j = null;
        C1430u.a().a(ad_unit, aVar.f);
        this.f25203h = new JSONObject();
        if (aVar.a()) {
            this.f25200d = new C1420h(ad_unit.toString(), cVar, this);
        }
        int i10 = cVar.f25893g;
        ArrayList arrayList = new ArrayList();
        Iterator<NetworkSettings> it = aVar.f25177c.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getProviderName());
        }
        this.f25201e = new C1421j(arrayList, i10);
        ArrayList arrayList2 = new ArrayList();
        com.ironsource.mediationsdk.adunit.c.a aVar3 = this.o;
        for (NetworkSettings networkSettings : aVar3.f25177c) {
            arrayList2.add(new m(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(aVar3.f25175a)));
        }
        this.f25207l = new n(arrayList2);
        IronLog.INTERNAL.verbose(c(""));
        com.ironsource.mediationsdk.adunit.c.a aVar4 = this.o;
        for (NetworkSettings networkSettings2 : aVar4.f25177c) {
            boolean isIronSource = networkSettings2.isIronSource();
            IronSource.AD_UNIT ad_unit2 = aVar4.f25175a;
            if (!isIronSource && !networkSettings2.isBidder(ad_unit2) && !networkSettings2.shouldEarlyInit()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                HashMap hashMap = new HashMap();
                hashMap.put("userId", aVar4.f25176b);
                if (ad_unit2 == IronSource.AD_UNIT.INTERSTITIAL) {
                    jSONObject = networkSettings2.getInterstitialSettings();
                } else if (ad_unit2 == IronSource.AD_UNIT.REWARDED_VIDEO) {
                    jSONObject = networkSettings2.getRewardedVideoSettings();
                } else {
                    IronLog.INTERNAL.error("ad unit not supported - " + ad_unit2);
                    jSONObject = new JSONObject();
                }
                hashMap.putAll(com.ironsource.mediationsdk.c.b.a(jSONObject));
                AdData adData = new AdData(null, hashMap, null);
                AdapterBaseInterface a10 = C1416d.a().a(networkSettings2, ad_unit2);
                com.ironsource.mediationsdk.adunit.b.d dVar2 = this.f25213s;
                if (a10 != null) {
                    try {
                        a10.init(adData, ContextProvider.getInstance().getApplicationContext(), null);
                    } catch (Exception e10) {
                        dVar2.f.a("initNetworks - exception while calling networkAdapter.init - " + e10);
                    }
                } else {
                    dVar2.f.a("initNetworks - could not load network adapter");
                }
            }
        }
        this.f25208m = new com.ironsource.mediationsdk.utils.f();
        g(a.READY_TO_LOAD);
        this.f25213s.f25159a.a(com.ironsource.mediationsdk.utils.f.a(fVar));
        this.f25212r = new B(aVar.f25182i, this);
        this.f25215u = new com.ironsource.mediationsdk.utils.a();
        if (this.o.f25181h.b()) {
            IronLog.INTERNAL.verbose("first automatic load");
            d();
        }
    }

    public static void h(e eVar) {
        eVar.getClass();
        IronLog.INTERNAL.verbose(eVar.c(""));
        AsyncTask.execute(new tb.b(eVar));
    }

    private void o() {
        IronLog.INTERNAL.verbose(c(""));
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        com.ironsource.mediationsdk.adunit.c.a aVar = this.o;
        for (NetworkSettings networkSettings : aVar.f25177c) {
            String providerInstanceName = networkSettings.getProviderInstanceName();
            IronSource.AD_UNIT ad_unit = aVar.f25175a;
            m mVar = new m(providerInstanceName, networkSettings.getMaxAdsPerSession(ad_unit));
            if (!networkSettings.isBidder(ad_unit) && !this.f25207l.b(mVar) && j(networkSettings)) {
                copyOnWriteArrayList.add(new com.ironsource.mediationsdk.c.b(mVar.k()));
            }
        }
        d(copyOnWriteArrayList, "fallback_" + System.currentTimeMillis());
    }

    private void p() {
        Iterator<Smash> it = q().iterator();
        while (it.hasNext()) {
            l(it.next());
        }
    }

    private void r() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(c(""));
        synchronized (this.f25217w) {
            a aVar = this.f25210p;
            a aVar2 = a.AUCTION;
            if (aVar == aVar2) {
                return;
            }
            g(aVar2);
            long a10 = this.o.f25178d.f25896j - com.ironsource.mediationsdk.utils.f.a(this.f25208m);
            if (a10 > 0) {
                new Timer().schedule(new b(), a10);
            } else {
                ironLog.verbose(c(""));
                AsyncTask.execute(new tb.b(this));
            }
        }
    }

    public abstract BaseAdInteractionAdapter a(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit);

    @Override // com.ironsource.mediationsdk.adunit.b.c
    public final Map<String, Object> a(com.ironsource.mediationsdk.adunit.b.b bVar) {
        HashMap t10 = l.t(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        boolean z10 = true;
        t10.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        com.ironsource.mediationsdk.adunit.e.a<Smash> aVar = this.f25197a;
        if (!TextUtils.isEmpty(aVar.f25261b)) {
            t10.put("auctionId", aVar.f25261b);
        }
        JSONObject jSONObject = this.f25203h;
        if (jSONObject != null && jSONObject.length() > 0) {
            t10.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f25203h);
        }
        t10.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(o.a().b(this.o.f25175a)));
        if (bVar != com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_SUCCESS && bVar != com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_FAILED && bVar != com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_FAILED_WITH_REASON && bVar != com.ironsource.mediationsdk.adunit.b.b.AUCTION_SUCCESS && bVar != com.ironsource.mediationsdk.adunit.b.b.AUCTION_FAILED && bVar != com.ironsource.mediationsdk.adunit.b.b.AD_UNIT_CAPPED) {
            z10 = false;
        }
        if (z10) {
            t10.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.f));
            if (!TextUtils.isEmpty(this.f25202g)) {
                t10.put(IronSourceConstants.AUCTION_FALLBACK, this.f25202g);
            }
        }
        return t10;
    }

    public abstract Smash b(NetworkSettings networkSettings, Adapter adapter, int i10, String str);

    @Override // com.ironsource.mediationsdk.adunit.c.a.b
    public final void b(com.ironsource.mediationsdk.adunit.d.a.c<?> cVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(c(cVar.m()));
        Placement placement = this.f25205j;
        AdInfo a10 = this.f25197a.a(cVar.o());
        tb.a aVar = this.f25214t;
        IronSource.AD_UNIT ad_unit = aVar.f35593a;
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            F.a().e(a10);
        } else {
            if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                ae.a().b(placement, a10);
                return;
            }
            ironLog.warning("ad unit not supported - " + aVar.f35593a);
        }
    }

    public abstract boolean b();

    public final String c(String str) {
        String name = this.o.f25175a.name();
        if (TextUtils.isEmpty(str)) {
            return name;
        }
        return i.f(name, " - ", str);
    }

    @Override // com.ironsource.mediationsdk.InterfaceC1415c
    public final void c_() {
        if (this.o.f25181h.b()) {
            g(a.READY_TO_LOAD);
            i(false, true);
            d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String d(java.util.List<com.ironsource.mediationsdk.c.b> r10, java.lang.String r11) {
        /*
            r9 = this;
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "waterfall.size() = "
            r1.<init>(r2)
            int r2 = r10.size()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r9.c(r1)
            r0.verbose(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r2 = 0
            r3 = r2
        L27:
            int r4 = r10.size()
            com.ironsource.mediationsdk.adunit.c.a r5 = r9.o
            if (r3 >= r4) goto Le5
            java.lang.Object r4 = r10.get(r3)
            com.ironsource.mediationsdk.c.b r4 = (com.ironsource.mediationsdk.c.b) r4
            java.lang.String r6 = r4.a()
            com.ironsource.mediationsdk.model.NetworkSettings r6 = r5.a(r6)
            com.ironsource.mediationsdk.adunit.b.d r7 = r9.f25213s
            if (r6 == 0) goto L92
            com.ironsource.mediationsdk.d r8 = com.ironsource.mediationsdk.C1416d.a()
            com.ironsource.mediationsdk.IronSource$AD_UNIT r5 = r5.f25175a
            r8.a(r6, r5)
            com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter r8 = r9.a(r6, r5)
            if (r8 == 0) goto L71
            com.ironsource.mediationsdk.utils.o r7 = com.ironsource.mediationsdk.utils.o.a()
            int r5 = r7.b(r5)
            com.ironsource.mediationsdk.adunit.d.a.c r5 = r9.b(r6, r8, r5, r11)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.c.b> r6 = r9.f25198b
            java.lang.String r7 = r5.k()
            r6.put(r7, r4)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.j$a> r6 = r9.f25199c
            java.lang.String r7 = r4.a()
            com.ironsource.mediationsdk.j$a r8 = com.ironsource.mediationsdk.C1421j.a.ISAuctionPerformanceDidntAttemptToLoad
            r6.put(r7, r8)
            goto Lb3
        L71:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r8 = "addSmashToWaterfall - could not load ad adapter for "
            r5.<init>(r8)
            java.lang.String r6 = r6.getProviderInstanceName()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.ironsource.mediationsdk.logger.IronLog r6 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r8 = r9.c(r5)
            r6.error(r8)
            com.ironsource.mediationsdk.adunit.b.j r6 = r7.f
            r6.b(r5)
            goto Lb2
        L92:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "could not find matching provider settings for auction response item - item = "
            r5.<init>(r6)
            java.lang.String r6 = r4.a()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.ironsource.mediationsdk.logger.IronLog r6 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r8 = r9.c(r5)
            r6.error(r8)
            com.ironsource.mediationsdk.adunit.b.j r6 = r7.f
            r6.c(r5)
        Lb2:
            r5 = 0
        Lb3:
            r6 = 1
            if (r5 == 0) goto Ld5
            r1.add(r5)
            int r5 = r5.l()
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r7[r2] = r5
            java.lang.String r4 = r4.a()
            r7[r6] = r4
            java.lang.String r4 = "%s%s"
            java.lang.String r4 = java.lang.String.format(r4, r7)
            r0.append(r4)
        Ld5:
            int r4 = r10.size()
            int r4 = r4 - r6
            if (r3 == r4) goto Le1
            java.lang.String r4 = ","
            r0.append(r4)
        Le1:
            int r3 = r3 + 1
            goto L27
        Le5:
            com.ironsource.mediationsdk.adunit.c.b.a r10 = r5.f25181h
            com.ironsource.mediationsdk.adunit.c.b.a$a r10 = r10.f25185a
            com.ironsource.mediationsdk.adunit.e.a<Smash extends com.ironsource.mediationsdk.adunit.d.a.c<?>> r2 = r9.f25197a
            r2.a(r10, r1, r11)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "updateWaterfall() - next waterfall is "
            r10.<init>(r11)
            java.lang.String r11 = r0.toString()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.ironsource.mediationsdk.logger.IronLog r11 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r10 = r9.c(r10)
            r11.verbose(r10)
            java.lang.String r10 = r0.toString()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.c.e.d(java.util.List, java.lang.String):java.lang.String");
    }

    public final HashMap e(AdapterBaseInterface adapterBaseInterface, NetworkSettings networkSettings) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, networkSettings.getProviderDefaultInstance());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, adapterBaseInterface.getAdapterVersion());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, adapterBaseInterface.getNetworkSDKVersion());
            hashMap.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, networkSettings.getSubProviderId());
            hashMap.put("instanceType", Integer.valueOf(networkSettings.getInstanceType(this.o.f25175a)));
            hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        } catch (Exception e10) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "getProviderEventData " + networkSettings.getProviderDefaultInstance(), e10);
        }
        return hashMap;
    }

    public final void f(int i10, String str, boolean z10) {
        g(a.READY_TO_LOAD);
        IronLog.INTERNAL.verbose(c("errorCode = " + i10 + ", errorReason = " + str));
        com.ironsource.mediationsdk.adunit.c.a aVar = this.o;
        boolean a10 = aVar.f25181h.a();
        com.ironsource.mediationsdk.adunit.b.d dVar = this.f25213s;
        if (a10) {
            if (z10) {
                dVar.f25160b.a(com.ironsource.mediationsdk.utils.f.a(this.f25209n), i10, str);
            }
            C1430u.a().a(aVar.f25175a, new IronSourceError(i10, str));
        } else {
            if (z10) {
                dVar.f.a(i10, str);
            }
            i(false, false);
        }
        this.f25211q.a();
    }

    public final void g(a aVar) {
        IronLog.INTERNAL.verbose(c("from " + this.f25210p + " to " + aVar));
        synchronized (this.f25217w) {
            this.f25210p = aVar;
        }
    }

    public final void i(boolean z10, boolean z11) {
        synchronized (this.f25217w) {
            Boolean bool = this.y;
            if (bool == null || bool.booleanValue() != z10) {
                this.y = Boolean.valueOf(z10);
                long j10 = 0;
                if (this.f25218x != 0) {
                    j10 = new Date().getTime() - this.f25218x;
                }
                this.f25218x = new Date().getTime();
                this.f25213s.f25160b.a(z10, j10, z11);
                tb.a aVar = this.f25214t;
                com.ironsource.mediationsdk.adunit.e.a<Smash> aVar2 = this.f25197a;
                aVar.a(z10, aVar2.a(aVar2.f25261b));
            }
        }
    }

    public final boolean j(NetworkSettings networkSettings) {
        C1416d a10 = C1416d.a();
        com.ironsource.mediationsdk.adunit.c.a aVar = this.o;
        AdapterBaseInterface a11 = a10.a(networkSettings, aVar.f25175a);
        if (a11 instanceof AdapterSettingsInterface) {
            if (this.f25197a.a(aVar.f25181h.f25185a, networkSettings.getProviderInstanceName(), networkSettings.getProviderTypeForReflection(), ((AdapterSettingsInterface) a11).getLoadWhileShowSupportedState(networkSettings))) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void k(String str, List list, Map map) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(c("auction waterfallString = " + str));
        int size = map.size();
        com.ironsource.mediationsdk.adunit.c.a aVar = this.o;
        com.ironsource.mediationsdk.adunit.b.d dVar = this.f25213s;
        if (size == 0 && list.size() == 0) {
            ironLog.verbose(c("auction failed - no candidates"));
            dVar.f25162d.a(0L, 1005, "No candidates available for auctioning");
            f(com.ironsource.mediationsdk.adunit.a.a.c(aVar.f25175a), "no auction candidates", true);
        } else {
            dVar.f25162d.a(str);
            if (this.f25200d != null) {
                this.f25200d.a(ContextProvider.getInstance().getApplicationContext(), map, list, this.f25201e, o.a().b(aVar.f25175a), this.f25216v);
            } else {
                ironLog.error(c("mAuctionHandler is null"));
            }
        }
    }

    public final void l(Smash smash) {
        IronLog.INTERNAL.verbose(c(""));
        ConcurrentHashMap<String, com.ironsource.mediationsdk.c.b> concurrentHashMap = this.f25198b;
        String b10 = concurrentHashMap.get(smash.k()).b();
        Map<String, Object> a10 = com.ironsource.mediationsdk.c.b.a(concurrentHashMap.get(smash.k()).c());
        smash.a(b10);
        smash.a(b10, a10);
    }

    public final String m() {
        Placement placement = this.f25205j;
        if (placement == null) {
            return "";
        }
        return placement.getPlacementName();
    }

    public String n() {
        return "";
    }

    public final ArrayList<Smash> q() {
        IronLog ironLog = IronLog.INTERNAL;
        StringBuilder sb2 = new StringBuilder("mWaterfall.size() = ");
        com.ironsource.mediationsdk.adunit.e.a<Smash> aVar = this.f25197a;
        sb2.append(aVar.a().size());
        ironLog.verbose(c(sb2.toString()));
        ArrayList<Smash> arrayList = new ArrayList<>();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= aVar.a().size() || i11 >= this.o.f25179e) {
                break;
            }
            Smash smash = aVar.a().get(i10);
            if (smash.f()) {
                if (!smash.d() && !smash.e()) {
                    if (smash.i()) {
                        if (i11 == 0) {
                            String str = "Advanced Loading: Starting to load bidder " + smash.k() + ". No other instances will be loaded at the same time.";
                            IronLog.INTERNAL.verbose(c(str));
                            IronSourceUtils.sendAutomationLog(str);
                            arrayList.add(smash);
                            i11++;
                        } else {
                            String str2 = "Advanced Loading: Won't start loading bidder " + smash.k() + " as a non bidder is being loaded";
                            IronLog.INTERNAL.verbose(c(str2));
                            IronSourceUtils.sendAutomationLog(str2);
                        }
                    } else {
                        arrayList.add(smash);
                    }
                } else {
                    IronLog.INTERNAL.verbose("smash = " + smash.m());
                }
                i11++;
            } else {
                IronLog.INTERNAL.verbose(c(String.format("smash %s is not ready to load", smash.m())));
            }
            i10++;
        }
        if (i11 == 0) {
            f(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "Mediation No fill", true);
        }
        return arrayList;
    }

    public final void b(ImpressionDataListener impressionDataListener) {
        this.B.remove(impressionDataListener);
    }

    @Override // com.ironsource.mediationsdk.ai
    public final void e() {
        IronLog.INTERNAL.verbose(c(""));
        d();
    }

    public final void g() {
        this.B.clear();
    }

    public final void b(boolean z10) {
        IronLog.INTERNAL.verbose(c("track = " + z10));
        this.f25206k = z10;
    }

    public final void d() {
        a aVar;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(c(""));
        synchronized (this.f25217w) {
            boolean z10 = true;
            if (this.o.f25181h.b() && this.f25207l.a()) {
                ironLog.verbose(c("all smashes are capped"));
                f(IronSourceConstants.TROUBLESHOOTING_MEDIATION_TCS_CALCULATED, "all smashes are capped", true);
                return;
            }
            a.EnumC0328a enumC0328a = this.o.f25181h.f25185a;
            a.EnumC0328a enumC0328a2 = a.EnumC0328a.AUTOMATIC_LOAD_WHILE_SHOW;
            if (enumC0328a != enumC0328a2 && this.f25210p == a.SHOWING) {
                IronLog.API.error(c("load cannot be invoked while showing an ad"));
                IronSourceError ironSourceError = new IronSourceError(com.ironsource.mediationsdk.adunit.a.a.b(this.o.f25175a), "load cannot be invoked while showing an ad");
                if (this.o.f25181h.a()) {
                    tb.a aVar2 = this.f25214t;
                    IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
                    IronSource.AD_UNIT ad_unit2 = aVar2.f35593a;
                    if (ad_unit2 == ad_unit) {
                        F.a().a(ironSourceError);
                    } else if (ad_unit2 == IronSource.AD_UNIT.REWARDED_VIDEO) {
                        ae.a().a(ironSourceError);
                    } else {
                        ironLog.warning("ad unit not supported - " + ad_unit2);
                    }
                } else {
                    this.f25214t.a(false, null);
                }
                return;
            }
            if (enumC0328a != enumC0328a2 && (((aVar = this.f25210p) != a.READY_TO_LOAD && aVar != a.READY_TO_SHOW) || C1430u.a().a(this.o.f25175a))) {
                IronLog.API.error(c("load is already in progress"));
                return;
            }
            this.f25203h = new JSONObject();
            this.f25215u.a(this.o.f25175a, false);
            com.ironsource.mediationsdk.adunit.c.a aVar3 = this.o;
            if (aVar3.f25175a != IronSource.AD_UNIT.REWARDED_VIDEO || aVar3.f25181h.f25185a != a.EnumC0328a.MANUAL) {
                z10 = false;
            }
            this.f25213s.f25160b.a(z10);
            this.f25209n = new com.ironsource.mediationsdk.utils.f();
            if (this.o.a()) {
                if (!this.f25199c.isEmpty()) {
                    this.f25201e.a(this.f25199c);
                    this.f25199c.clear();
                }
                r();
            } else {
                g(a.LOADING);
            }
            if (this.o.a()) {
                return;
            }
            o();
            p();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.e.b
    public final void a(int i10) {
        this.f25213s.f.o("waterfalls hold too many with size = " + i10);
    }

    @Override // com.ironsource.mediationsdk.InterfaceC1419g
    public final void a(int i10, String str, int i11, String str2, long j10) {
        boolean z10;
        IronLog ironLog = IronLog.INTERNAL;
        String str3 = "";
        ironLog.verbose(c(""));
        synchronized (this.f25217w) {
            z10 = this.f25210p == a.AUCTION;
        }
        com.ironsource.mediationsdk.adunit.b.d dVar = this.f25213s;
        if (!z10) {
            dVar.f.g("unexpected auction fail - error = " + i10 + ", " + str);
            return;
        }
        String str4 = "Auction failed | moving to fallback waterfall (error " + i10 + " - " + str + ")";
        ironLog.verbose(c(str4));
        StringBuilder sb2 = new StringBuilder();
        IronSource.AD_UNIT ad_unit = this.o.f25175a;
        if (ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO)) {
            str3 = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
        } else if (ad_unit.equals(IronSource.AD_UNIT.INTERSTITIAL)) {
            str3 = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
        } else if (ad_unit.equals(IronSource.AD_UNIT.BANNER)) {
            str3 = "BN";
        }
        sb2.append(str3);
        sb2.append(": ");
        sb2.append(str4);
        IronSourceUtils.sendAutomationLog(sb2.toString());
        this.f = i11;
        this.f25202g = str2;
        this.f25203h = new JSONObject();
        o();
        dVar.f25162d.a(j10, i10, str);
        g(a.LOADING);
        p();
    }

    public final void a(IronSourceSegment ironSourceSegment) {
        this.f25216v = ironSourceSegment;
    }

    @Override // com.ironsource.mediationsdk.adunit.c.a.b
    public final void a(com.ironsource.mediationsdk.adunit.d.a.c<?> cVar) {
        boolean z10;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(c(cVar.m()));
        if (cVar.o() != this.f25197a.f25261b) {
            String str = "onLoadSuccess was invoked with state = " + this.f25210p + " auctionId: " + cVar.o() + " and the current id is " + this.f25197a.f25261b;
            ironLog.verbose(str);
            this.f25213s.f.h(str);
            return;
        }
        this.f25199c.put(cVar.k(), C1421j.a.ISAuctionPerformanceLoadedSuccessfully);
        a aVar = a.LOADING;
        a aVar2 = a.READY_TO_SHOW;
        synchronized (this.f25217w) {
            if (this.f25210p == aVar) {
                ironLog.verbose(c("set state from '" + this.f25210p + "' to '" + aVar2 + "'"));
                this.f25210p = aVar2;
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (!z10) {
            this.f25213s.f.h(String.format("unexpected load success for smash - %s", cVar.m()));
            return;
        }
        long a10 = com.ironsource.mediationsdk.utils.f.a(this.f25209n);
        com.ironsource.mediationsdk.adunit.c.a aVar3 = this.o;
        this.f25213s.f25160b.a(a10, aVar3.f25175a == IronSource.AD_UNIT.REWARDED_VIDEO && aVar3.f25181h.f25185a == a.EnumC0328a.MANUAL);
        if (this.o.f25181h.b()) {
            this.f25212r.a(0L);
        }
        if (this.o.a()) {
            com.ironsource.mediationsdk.c.b bVar = this.f25198b.get(cVar.k());
            if (bVar != null) {
                com.ironsource.mediationsdk.adunit.e.a<Smash> aVar4 = this.f25197a;
                aVar4.a(aVar4.f25261b, bVar.b(""));
                C1420h.a(bVar, cVar.l(), this.f25204i);
                ArrayList arrayList = new ArrayList();
                Iterator<Smash> it = this.f25197a.a().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().k());
                }
                C1420h.a((ArrayList<String>) arrayList, this.f25198b, cVar.l(), this.f25204i, bVar);
            } else {
                String k10 = cVar.k();
                String b10 = s.f.b("winner instance missing from waterfall - ", k10);
                ironLog.verbose(c(b10));
                this.f25213s.f.a(1010, b10, k10);
            }
        }
        if (!this.o.f25181h.a()) {
            i(true, false);
            return;
        }
        tb.a aVar5 = this.f25214t;
        AdInfo a11 = this.f25197a.a(cVar.o());
        IronSource.AD_UNIT ad_unit = aVar5.f35593a;
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            F.a().a(a11);
            return;
        }
        if (ad_unit != IronSource.AD_UNIT.REWARDED_VIDEO) {
            IronLog.INTERNAL.warning("ad unit not supported - " + aVar5.f35593a);
            return;
        }
        ae a12 = ae.a();
        RewardedVideoListener rewardedVideoListener = a12.f25271a;
        if (rewardedVideoListener != null && (rewardedVideoListener instanceof RewardedVideoManualListener)) {
            com.ironsource.environment.e.c.f24668a.b(new Runnable() { // from class: com.ironsource.mediationsdk.ae.1
                public AnonymousClass1() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    RewardedVideoListener rewardedVideoListener2 = ae.this.f25271a;
                    if (rewardedVideoListener2 != null) {
                        ((RewardedVideoManualListener) rewardedVideoListener2).onRewardedVideoAdReady();
                        ae.b("onRewardedVideoAdReady()");
                    }
                }
            });
        }
        LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = a12.f25272b;
        if (levelPlayRewardedVideoBaseListener == null || !(levelPlayRewardedVideoBaseListener instanceof LevelPlayRewardedVideoManualListener)) {
            return;
        }
        com.ironsource.environment.e.c.f24668a.b(new Runnable() { // from class: com.ironsource.mediationsdk.ae.11

            /* renamed from: s */
            public final /* synthetic */ AdInfo f25274s;

            public AnonymousClass11(AdInfo a112) {
                r2 = a112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ae aeVar = ae.this;
                LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener2 = aeVar.f25272b;
                if (levelPlayRewardedVideoBaseListener2 != null) {
                    AdInfo adInfo = r2;
                    ((LevelPlayRewardedVideoManualListener) levelPlayRewardedVideoBaseListener2).onAdReady(aeVar.f(adInfo));
                    IronLog.CALLBACK.info("onAdReady() adInfo = " + aeVar.f(adInfo));
                }
            }
        });
    }

    public final void a(ImpressionDataListener impressionDataListener) {
        this.B.add(impressionDataListener);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4 A[LOOP:0: B:28:0x009e->B:30:0x00a4, LOOP_END] */
    @Override // com.ironsource.mediationsdk.adunit.c.a.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.ironsource.mediationsdk.logger.IronSourceError r8, com.ironsource.mediationsdk.adunit.d.a.c<?> r9) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.c.e.a(com.ironsource.mediationsdk.logger.IronSourceError, com.ironsource.mediationsdk.adunit.d.a.c):void");
    }

    @Override // com.ironsource.mediationsdk.InterfaceC1419g
    public final void a(List<com.ironsource.mediationsdk.c.b> list, String str, com.ironsource.mediationsdk.c.b bVar, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) {
        boolean z10;
        IronLog.INTERNAL.verbose(c(""));
        synchronized (this.f25217w) {
            z10 = this.f25210p == a.AUCTION;
        }
        com.ironsource.mediationsdk.adunit.b.d dVar = this.f25213s;
        if (!z10) {
            dVar.f.f("unexpected auction success for auctionId - " + str);
            return;
        }
        this.f25202g = "";
        this.f = i10;
        this.f25204i = bVar;
        this.f25203h = jSONObject;
        if (!TextUtils.isEmpty(str2)) {
            dVar.f.b(i11, str2);
        }
        boolean optBoolean = jSONObject2 != null ? jSONObject2.optBoolean("isAdUnitCapped", false) : false;
        com.ironsource.mediationsdk.adunit.c.a aVar = this.o;
        IronSource.AD_UNIT ad_unit = aVar.f25175a;
        com.ironsource.mediationsdk.utils.a aVar2 = this.f25215u;
        aVar2.a(ad_unit, optBoolean);
        if (aVar2.a(aVar.f25175a)) {
            dVar.f25162d.c(str);
            f(IronSourceError.ERROR_AD_UNIT_CAPPED, "Ad unit is capped", false);
            return;
        }
        String d10 = d(list, str);
        dVar.f25162d.a(j10);
        dVar.f25162d.b(d10);
        g(a.LOADING);
        p();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        if (b() != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        if (r3.y.booleanValue() != false) goto L20;
     */
    @Override // com.ironsource.environment.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r4) {
        /*
            r3 = this;
            boolean r0 = r3.f25206k
            if (r0 == 0) goto L48
            com.ironsource.mediationsdk.adunit.c.a r0 = r3.o
            com.ironsource.mediationsdk.adunit.c.b.a r0 = r0.f25181h
            boolean r0 = r0.a()
            if (r0 == 0) goto Lf
            goto L48
        Lf:
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "network availability changed to - "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.verbose(r1)
            java.lang.Boolean r0 = r3.y
            r1 = 0
            if (r0 != 0) goto L29
        L27:
            r2 = r1
            goto L43
        L29:
            r2 = 1
            if (r4 == 0) goto L39
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L39
            boolean r0 = r3.b()
            if (r0 == 0) goto L39
            goto L43
        L39:
            if (r4 != 0) goto L27
            java.lang.Boolean r0 = r3.y
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L27
        L43:
            if (r2 == 0) goto L48
            r3.i(r4, r1)
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.c.e.a(boolean):void");
    }
}
