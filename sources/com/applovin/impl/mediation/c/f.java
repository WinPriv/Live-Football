package com.applovin.impl.mediation.c;

import a3.l;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.applovin.impl.mediation.MaxAdWaterfallInfoImpl;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MaxMediatedNetworkInfoImpl;
import com.applovin.impl.mediation.MaxNetworkResponseInfoImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.k;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f extends com.applovin.impl.sdk.e.a implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicBoolean f17829a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    private final String f17830b;

    /* renamed from: c, reason: collision with root package name */
    private final MaxAdFormat f17831c;

    /* renamed from: d, reason: collision with root package name */
    private final JSONObject f17832d;

    /* renamed from: e, reason: collision with root package name */
    private final a.InterfaceC0201a f17833e;

    /* renamed from: i, reason: collision with root package name */
    private final WeakReference<Context> f17834i;

    /* renamed from: j, reason: collision with root package name */
    private Queue<com.applovin.impl.mediation.a.a> f17835j;

    /* renamed from: k, reason: collision with root package name */
    private final Object f17836k;

    /* renamed from: l, reason: collision with root package name */
    private final int f17837l;

    /* renamed from: m, reason: collision with root package name */
    private long f17838m;

    /* renamed from: n, reason: collision with root package name */
    private final List<MaxNetworkResponseInfo> f17839n;
    private final AtomicBoolean o;

    /* renamed from: p, reason: collision with root package name */
    private final AtomicBoolean f17840p;

    /* loaded from: classes.dex */
    public class a extends com.applovin.impl.sdk.e.a {

        /* renamed from: b, reason: collision with root package name */
        private final long f17845b;

        /* renamed from: c, reason: collision with root package name */
        private final com.applovin.impl.mediation.a.a f17846c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f17847d;

        public a(com.applovin.impl.mediation.a.a aVar, boolean z10) {
            super(f.this.f18838g, f.this.f);
            this.f17845b = SystemClock.elapsedRealtime();
            this.f17846c = aVar;
            this.f17847d = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
            Activity x10;
            if (y.a()) {
                this.f18839h.b(this.f18838g, "Loading ad " + (this.f17846c.B() + 1) + " of " + f.this.f17837l + ": " + this.f17846c.X());
            }
            a("started to load ad");
            Context context = (Context) f.this.f17834i.get();
            if (context instanceof Activity) {
                x10 = (Activity) context;
            } else {
                x10 = this.f.x();
            }
            this.f.ap().loadThirdPartyMediatedAd(f.this.f17830b, this.f17846c, x10, new com.applovin.impl.mediation.d.a(f.this.f17833e) { // from class: com.applovin.impl.mediation.c.f.a.1
                @Override // com.applovin.impl.mediation.d.a, com.applovin.mediation.MaxAdListener
                public void onAdLoadFailed(String str, MaxError maxError) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - a.this.f17845b;
                    y unused = ((com.applovin.impl.sdk.e.a) a.this).f18839h;
                    if (y.a()) {
                        ((com.applovin.impl.sdk.e.a) a.this).f18839h.b(((com.applovin.impl.sdk.e.a) a.this).f18838g, "Ad failed to load in " + elapsedRealtime + " ms with error: " + maxError);
                    }
                    a.this.a("failed to load ad: " + maxError.getCode());
                    a aVar = a.this;
                    aVar.a(aVar.f17846c, MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD, elapsedRealtime, maxError);
                    if (f.this.f17840p.get()) {
                        return;
                    }
                    if (a.this.f17847d) {
                        com.applovin.impl.mediation.a.a a10 = f.this.a();
                        if (a10 != null) {
                            ((com.applovin.impl.sdk.e.a) a.this).f.M().a(new a(a10, true), com.applovin.impl.mediation.d.c.a(f.this.f17831c));
                            return;
                        } else {
                            f.this.a(new MaxErrorImpl(-5001, "MAX returned eligible ads from mediated networks, but all ads failed to load. Inspect getWaterfall() for more info."));
                            return;
                        }
                    }
                    if (((Boolean) ((com.applovin.impl.sdk.e.a) a.this).f.a(com.applovin.impl.sdk.c.a.Y)).booleanValue()) {
                        f.this.o.compareAndSet(true, false);
                    }
                }

                @Override // com.applovin.impl.mediation.d.a, com.applovin.mediation.MaxAdListener
                public void onAdLoaded(MaxAd maxAd) {
                    a.this.a("loaded ad");
                    long elapsedRealtime = SystemClock.elapsedRealtime() - a.this.f17845b;
                    y unused = ((com.applovin.impl.sdk.e.a) a.this).f18839h;
                    if (y.a()) {
                        ((com.applovin.impl.sdk.e.a) a.this).f18839h.b(((com.applovin.impl.sdk.e.a) a.this).f18838g, l.k("Ad loaded in ", elapsedRealtime, "ms"));
                    }
                    com.applovin.impl.mediation.a.a aVar = (com.applovin.impl.mediation.a.a) maxAd;
                    a.this.a(aVar, MaxNetworkResponseInfo.AdLoadState.AD_LOADED, elapsedRealtime, null);
                    Iterator it = f.this.f17835j.iterator();
                    while (it.hasNext()) {
                        a.this.a((com.applovin.impl.mediation.a.a) it.next(), MaxNetworkResponseInfo.AdLoadState.AD_LOAD_NOT_ATTEMPTED, -1L, null);
                    }
                    f.this.a(aVar);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(com.applovin.impl.mediation.a.a aVar, MaxNetworkResponseInfo.AdLoadState adLoadState, long j10, MaxError maxError) {
            f.this.f17839n.add(new MaxNetworkResponseInfoImpl(adLoadState, new MaxMediatedNetworkInfoImpl(com.applovin.impl.mediation.d.c.a(aVar.W(), this.f)), aVar.j(), AppLovinSdkUtils.isValidString(aVar.k()), j10, maxError));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f(java.lang.String r3, com.applovin.mediation.MaxAdFormat r4, java.util.Map<java.lang.String, java.lang.Object> r5, org.json.JSONObject r6, android.content.Context r7, com.applovin.impl.sdk.p r8, com.applovin.impl.mediation.ads.a.InterfaceC0201a r9) {
        /*
            r2 = this;
            java.lang.String r0 = "TaskProcessMediationWaterfallV2:"
            java.lang.String r1 = ":"
            java.lang.StringBuilder r0 = a3.l.s(r0, r3, r1)
            java.lang.String r1 = r4.getLabel()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0, r8)
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.f17836k = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r2.o = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r2.f17840p = r0
            r2.f17830b = r3
            r2.f17831c = r4
            r2.f17832d = r6
            r2.f17833e = r9
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r7)
            r2.f17834i = r3
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            java.lang.String r4 = "ads"
            org.json.JSONArray r3 = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(r6, r4, r3)
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            r2.f17835j = r4
            r4 = 0
        L4d:
            int r7 = r3.length()
            if (r4 >= r7) goto L64
            r7 = 0
            org.json.JSONObject r7 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(r3, r4, r7)
            com.applovin.impl.mediation.a.a r7 = com.applovin.impl.mediation.a.a.a(r4, r5, r7, r6, r8)
            java.util.Queue<com.applovin.impl.mediation.a.a> r9 = r2.f17835j
            r9.add(r7)
            int r4 = r4 + 1
            goto L4d
        L64:
            java.util.Queue<com.applovin.impl.mediation.a.a> r3 = r2.f17835j
            int r3 = r3.size()
            r2.f17837l = r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
            r2.f17839n = r4
            android.content.IntentFilter r3 = new android.content.IntentFilter
            java.lang.String r4 = "load_bidder_ad_immediately"
            r3.<init>(r4)
            com.applovin.impl.sdk.AppLovinBroadcastManager.registerReceiver(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.c.f.<init>(java.lang.String, com.applovin.mediation.MaxAdFormat, java.util.Map, org.json.JSONObject, android.content.Context, com.applovin.impl.sdk.p, com.applovin.impl.mediation.ads.a$a):void");
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map<String, Object> map) {
        com.applovin.impl.mediation.a.a b10;
        if (!"load_bidder_ad_immediately".equalsIgnoreCase(intent.getAction()) || map == null) {
            return;
        }
        if (!this.f17830b.equalsIgnoreCase((String) map.get("ad_unit_id")) || !this.o.compareAndSet(false, true) || (b10 = b()) == null) {
            return;
        }
        this.f.M().a(new a(b10, false), o.a.MEDIATION_MAIN);
    }

    @Override // java.lang.Runnable
    public void run() {
        com.applovin.impl.mediation.a.a aVar;
        this.f17838m = SystemClock.elapsedRealtime();
        if (this.f17832d.optBoolean("is_testing", false) && !this.f.av().a() && f17829a.compareAndSet(false, true)) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.c.f.1
                @Override // java.lang.Runnable
                public void run() {
                    Utils.showAlert("MAX SDK Not Initialized In Test Mode", "Test ads may not load. Please force close and restart the app if you experience issues.", ((com.applovin.impl.sdk.e.a) f.this).f.x());
                }
            });
        }
        if (this.f.au().d(this.f17830b) && this.o.compareAndSet(false, true)) {
            aVar = b();
        } else {
            aVar = null;
        }
        if (aVar == null) {
            aVar = a();
            this.o.set(false);
        }
        if (aVar != null) {
            if (y.a()) {
                this.f18839h.b(this.f18838g, "Starting waterfall for " + this.f17837l + " ad(s)...");
            }
            this.f.M().a((com.applovin.impl.sdk.e.a) new a(aVar, true));
            return;
        }
        if (y.a()) {
            this.f18839h.d(this.f18838g, "No ads were returned from the server");
        }
        Utils.maybeHandleNoFillResponseForPublisher(this.f17830b, this.f17831c, this.f17832d, this.f);
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f17832d, "settings", new JSONObject());
        long j10 = JsonUtils.getLong(jSONObject, "alfdcs", 0L);
        final MaxErrorImpl maxErrorImpl = new MaxErrorImpl(204, "MAX returned no eligible ads from any mediated networks for this app/device.");
        if (j10 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(j10);
            Runnable runnable = new Runnable() { // from class: com.applovin.impl.mediation.c.f.2
                @Override // java.lang.Runnable
                public void run() {
                    f.this.a(maxErrorImpl);
                }
            };
            if (JsonUtils.getBoolean(jSONObject, "alfdcs_iba", Boolean.FALSE).booleanValue()) {
                com.applovin.impl.sdk.utils.f.a(millis, this.f, runnable);
                return;
            } else {
                AppLovinSdkUtils.runOnUiThreadDelayed(runnable, millis);
                return;
            }
        }
        a(maxErrorImpl);
    }

    private com.applovin.impl.mediation.a.a b() {
        com.applovin.impl.mediation.a.a aVar;
        synchronized (this.f17836k) {
            Iterator<com.applovin.impl.mediation.a.a> it = this.f17835j.iterator();
            while (true) {
                if (!it.hasNext()) {
                    aVar = null;
                    break;
                }
                aVar = it.next();
                if (aVar.l()) {
                    break;
                }
            }
            if (aVar == null) {
                return null;
            }
            this.f17835j.remove(aVar);
            return aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.applovin.impl.mediation.a.a a() {
        com.applovin.impl.mediation.a.a peek;
        synchronized (this.f17836k) {
            peek = this.f17835j.peek();
            if (peek != null) {
                this.f17835j.remove();
            }
        }
        return peek;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.a aVar) {
        if (this.f17840p.compareAndSet(false, true)) {
            this.f.at().a(aVar);
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f17838m;
            if (y.a()) {
                y yVar = this.f18839h;
                String str = this.f18838g;
                StringBuilder k10 = com.ironsource.adapters.facebook.a.k("Waterfall loaded in ", elapsedRealtime, "ms for ");
                k10.append(aVar.X());
                yVar.c(str, k10.toString());
            }
            aVar.a(new MaxAdWaterfallInfoImpl(aVar, elapsedRealtime, this.f17839n));
            k.a((MaxAdListener) this.f17833e, (MaxAd) aVar);
            AppLovinBroadcastManager.unregisterReceiver(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxError maxError) {
        int i10 = 0;
        if (this.f17840p.compareAndSet(false, true)) {
            if (maxError.getCode() == 204) {
                this.f.P().a(com.applovin.impl.sdk.d.f.f18822r);
            } else if (maxError.getCode() == -5001) {
                this.f.P().a(com.applovin.impl.sdk.d.f.f18823s);
            } else {
                this.f.P().a(com.applovin.impl.sdk.d.f.f18824t);
            }
            ArrayList arrayList = new ArrayList(this.f17839n.size());
            for (MaxNetworkResponseInfo maxNetworkResponseInfo : this.f17839n) {
                if (maxNetworkResponseInfo.getAdLoadState() == MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD) {
                    arrayList.add(maxNetworkResponseInfo);
                }
            }
            if (arrayList.size() > 0) {
                StringBuilder sb2 = new StringBuilder("======FAILED AD LOADS======\n");
                while (i10 < arrayList.size()) {
                    MaxNetworkResponseInfo maxNetworkResponseInfo2 = (MaxNetworkResponseInfo) arrayList.get(i10);
                    i10++;
                    sb2.append(i10);
                    sb2.append(") ");
                    sb2.append(maxNetworkResponseInfo2.getMediatedNetwork().getName());
                    sb2.append("\n..code: ");
                    sb2.append(maxNetworkResponseInfo2.getError().getCode());
                    sb2.append("\n..message: ");
                    sb2.append(maxNetworkResponseInfo2.getError().getMessage());
                    sb2.append("\n");
                }
                ((MaxErrorImpl) maxError).setAdLoadFailureInfo(sb2.toString());
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f17838m;
            if (y.a()) {
                this.f18839h.c(this.f18838g, "Waterfall failed in " + elapsedRealtime + "ms with error: " + maxError);
            }
            ((MaxErrorImpl) maxError).setWaterfall(new MaxAdWaterfallInfoImpl(null, JsonUtils.getString(this.f17832d, "waterfall_name", ""), JsonUtils.getString(this.f17832d, "waterfall_test_name", ""), elapsedRealtime, this.f17839n));
            k.a(this.f17833e, this.f17830b, maxError);
            AppLovinBroadcastManager.unregisterReceiver(this);
        }
    }
}
