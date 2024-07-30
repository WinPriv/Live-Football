package com.applovin.impl.mediation.c;

import a3.l;
import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.mediation.MaxAdWaterfallInfoImpl;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MaxMediatedNetworkInfoImpl;
import com.applovin.impl.mediation.MaxNetworkResponseInfoImpl;
import com.applovin.impl.mediation.ads.a;
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
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e extends com.applovin.impl.sdk.e.a {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicBoolean f17811a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    private final String f17812b;

    /* renamed from: c, reason: collision with root package name */
    private final MaxAdFormat f17813c;

    /* renamed from: d, reason: collision with root package name */
    private final JSONObject f17814d;

    /* renamed from: e, reason: collision with root package name */
    private final List<com.applovin.impl.mediation.a.a> f17815e;

    /* renamed from: i, reason: collision with root package name */
    private final a.InterfaceC0201a f17816i;

    /* renamed from: j, reason: collision with root package name */
    private final WeakReference<Context> f17817j;

    /* renamed from: k, reason: collision with root package name */
    private long f17818k;

    /* renamed from: l, reason: collision with root package name */
    private final List<MaxNetworkResponseInfo> f17819l;

    /* loaded from: classes.dex */
    public class a extends com.applovin.impl.sdk.e.a {

        /* renamed from: b, reason: collision with root package name */
        private final long f17824b;

        /* renamed from: c, reason: collision with root package name */
        private final int f17825c;

        /* renamed from: d, reason: collision with root package name */
        private final com.applovin.impl.mediation.a.a f17826d;

        /* renamed from: e, reason: collision with root package name */
        private final List<com.applovin.impl.mediation.a.a> f17827e;

        public a(int i10, List<com.applovin.impl.mediation.a.a> list) {
            super(e.this.f18838g, e.this.f);
            this.f17824b = SystemClock.elapsedRealtime();
            this.f17825c = i10;
            this.f17826d = list.get(i10);
            this.f17827e = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
            Activity x10;
            if (y.a()) {
                this.f18839h.b(this.f18838g, "Loading ad " + (this.f17825c + 1) + " of " + this.f17827e.size() + ": " + this.f17826d.X());
            }
            a("started to load ad");
            Context context = (Context) e.this.f17817j.get();
            if (context instanceof Activity) {
                x10 = (Activity) context;
            } else {
                x10 = this.f.x();
            }
            this.f.ap().loadThirdPartyMediatedAd(e.this.f17812b, this.f17826d, x10, new com.applovin.impl.mediation.d.a(e.this.f17816i) { // from class: com.applovin.impl.mediation.c.e.a.1
                @Override // com.applovin.impl.mediation.d.a, com.applovin.mediation.MaxAdListener
                public void onAdLoadFailed(String str, MaxError maxError) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - a.this.f17824b;
                    y unused = ((com.applovin.impl.sdk.e.a) a.this).f18839h;
                    if (y.a()) {
                        ((com.applovin.impl.sdk.e.a) a.this).f18839h.b(((com.applovin.impl.sdk.e.a) a.this).f18838g, "Ad failed to load in " + elapsedRealtime + " ms with error: " + maxError);
                    }
                    a.this.a("failed to load ad: " + maxError.getCode());
                    a aVar = a.this;
                    aVar.a(aVar.f17826d, MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD, elapsedRealtime, maxError);
                    if (a.this.f17825c < a.this.f17827e.size() - 1) {
                        a aVar2 = a.this;
                        ((com.applovin.impl.sdk.e.a) a.this).f.M().a(new a(aVar2.f17825c + 1, a.this.f17827e), com.applovin.impl.mediation.d.c.a(e.this.f17813c));
                        return;
                    }
                    e.this.a(new MaxErrorImpl(-5001, "MAX returned eligible ads from mediated networks, but all ads failed to load. Inspect getWaterfall() for more info."));
                }

                @Override // com.applovin.impl.mediation.d.a, com.applovin.mediation.MaxAdListener
                public void onAdLoaded(MaxAd maxAd) {
                    a.this.a("loaded ad");
                    long elapsedRealtime = SystemClock.elapsedRealtime() - a.this.f17824b;
                    y unused = ((com.applovin.impl.sdk.e.a) a.this).f18839h;
                    if (y.a()) {
                        ((com.applovin.impl.sdk.e.a) a.this).f18839h.b(((com.applovin.impl.sdk.e.a) a.this).f18838g, l.k("Ad loaded in ", elapsedRealtime, "ms"));
                    }
                    com.applovin.impl.mediation.a.a aVar = (com.applovin.impl.mediation.a.a) maxAd;
                    a.this.a(aVar, MaxNetworkResponseInfo.AdLoadState.AD_LOADED, elapsedRealtime, null);
                    int i10 = a.this.f17825c;
                    while (true) {
                        i10++;
                        if (i10 >= a.this.f17827e.size()) {
                            e.this.a(aVar);
                            return;
                        } else {
                            a aVar2 = a.this;
                            aVar2.a((com.applovin.impl.mediation.a.a) aVar2.f17827e.get(i10), MaxNetworkResponseInfo.AdLoadState.AD_LOAD_NOT_ATTEMPTED, -1L, null);
                        }
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(com.applovin.impl.mediation.a.a aVar, MaxNetworkResponseInfo.AdLoadState adLoadState, long j10, MaxError maxError) {
            e.this.f17819l.add(new MaxNetworkResponseInfoImpl(adLoadState, new MaxMediatedNetworkInfoImpl(com.applovin.impl.mediation.d.c.a(aVar.W(), this.f)), aVar.j(), AppLovinSdkUtils.isValidString(aVar.k()), j10, maxError));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e(java.lang.String r3, com.applovin.mediation.MaxAdFormat r4, java.util.Map<java.lang.String, java.lang.Object> r5, org.json.JSONObject r6, android.content.Context r7, com.applovin.impl.sdk.p r8, com.applovin.impl.mediation.ads.a.InterfaceC0201a r9) {
        /*
            r2 = this;
            java.lang.String r0 = "TaskProcessMediationWaterfall:"
            java.lang.String r1 = ":"
            java.lang.StringBuilder r0 = a3.l.s(r0, r3, r1)
            java.lang.String r1 = r4.getLabel()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0, r8)
            r2.f17812b = r3
            r2.f17813c = r4
            r2.f17814d = r6
            r2.f17816i = r9
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r7)
            r2.f17817j = r3
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            java.lang.String r4 = "ads"
            org.json.JSONArray r3 = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(r6, r4, r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r7 = r3.length()
            r4.<init>(r7)
            r2.f17815e = r4
            r4 = 0
        L3c:
            int r7 = r3.length()
            if (r4 >= r7) goto L53
            r7 = 0
            org.json.JSONObject r7 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(r3, r4, r7)
            java.util.List<com.applovin.impl.mediation.a.a> r9 = r2.f17815e
            com.applovin.impl.mediation.a.a r7 = com.applovin.impl.mediation.a.a.a(r4, r5, r7, r6, r8)
            r9.add(r7)
            int r4 = r4 + 1
            goto L3c
        L53:
            java.util.ArrayList r3 = new java.util.ArrayList
            java.util.List<com.applovin.impl.mediation.a.a> r4 = r2.f17815e
            int r4 = r4.size()
            r3.<init>(r4)
            r2.f17819l = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.c.e.<init>(java.lang.String, com.applovin.mediation.MaxAdFormat, java.util.Map, org.json.JSONObject, android.content.Context, com.applovin.impl.sdk.p, com.applovin.impl.mediation.ads.a$a):void");
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f17818k = SystemClock.elapsedRealtime();
        if (this.f17814d.optBoolean("is_testing", false) && !this.f.av().a() && f17811a.compareAndSet(false, true)) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.c.e.1
                @Override // java.lang.Runnable
                public void run() {
                    Utils.showAlert("MAX SDK Not Initialized In Test Mode", "Test ads may not load. Please force close and restart the app if you experience issues.", ((com.applovin.impl.sdk.e.a) e.this).f.x());
                }
            });
        }
        if (this.f17815e.size() > 0) {
            if (y.a()) {
                this.f18839h.b(this.f18838g, "Starting waterfall for " + this.f17815e.size() + " ad(s)...");
            }
            this.f.M().a((com.applovin.impl.sdk.e.a) new a(0, this.f17815e));
            return;
        }
        if (y.a()) {
            this.f18839h.d(this.f18838g, "No ads were returned from the server");
        }
        Utils.maybeHandleNoFillResponseForPublisher(this.f17812b, this.f17813c, this.f17814d, this.f);
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f17814d, "settings", new JSONObject());
        long j10 = JsonUtils.getLong(jSONObject, "alfdcs", 0L);
        final MaxErrorImpl maxErrorImpl = new MaxErrorImpl(204, "MAX returned no eligible ads from any mediated networks for this app/device.");
        if (j10 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(j10);
            Runnable runnable = new Runnable() { // from class: com.applovin.impl.mediation.c.e.2
                @Override // java.lang.Runnable
                public void run() {
                    e.this.a(maxErrorImpl);
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

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.a aVar) {
        this.f.at().a(aVar);
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f17818k;
        if (y.a()) {
            y yVar = this.f18839h;
            String str = this.f18838g;
            StringBuilder k10 = com.ironsource.adapters.facebook.a.k("Waterfall loaded in ", elapsedRealtime, "ms for ");
            k10.append(aVar.X());
            yVar.c(str, k10.toString());
        }
        aVar.a(new MaxAdWaterfallInfoImpl(aVar, elapsedRealtime, this.f17819l));
        k.a((MaxAdListener) this.f17816i, (MaxAd) aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxError maxError) {
        if (maxError.getCode() == 204) {
            this.f.P().a(com.applovin.impl.sdk.d.f.f18822r);
        } else if (maxError.getCode() == -5001) {
            this.f.P().a(com.applovin.impl.sdk.d.f.f18823s);
        } else {
            this.f.P().a(com.applovin.impl.sdk.d.f.f18824t);
        }
        ArrayList arrayList = new ArrayList(this.f17819l.size());
        for (MaxNetworkResponseInfo maxNetworkResponseInfo : this.f17819l) {
            if (maxNetworkResponseInfo.getAdLoadState() == MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD) {
                arrayList.add(maxNetworkResponseInfo);
            }
        }
        if (arrayList.size() > 0) {
            StringBuilder sb2 = new StringBuilder("======FAILED AD LOADS======\n");
            int i10 = 0;
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
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f17818k;
        if (y.a()) {
            this.f18839h.c(this.f18838g, "Waterfall failed in " + elapsedRealtime + "ms with error: " + maxError);
        }
        ((MaxErrorImpl) maxError).setWaterfall(new MaxAdWaterfallInfoImpl(null, JsonUtils.getString(this.f17814d, "waterfall_name", ""), JsonUtils.getString(this.f17814d, "waterfall_test_name", ""), elapsedRealtime, this.f17819l));
        k.a(this.f17816i, this.f17812b, maxError);
    }
}
