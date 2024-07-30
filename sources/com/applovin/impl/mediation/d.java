package com.applovin.impl.mediation;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.c.b;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.k;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final p f17851a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, c> f17852b = CollectionUtils.map(4);

    /* renamed from: c, reason: collision with root package name */
    private final Object f17853c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, com.applovin.impl.mediation.a.a> f17854d = CollectionUtils.map(4);

    /* renamed from: e, reason: collision with root package name */
    private final Object f17855e = new Object();
    private final Set<String> f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    private final Object f17856g = new Object();

    /* loaded from: classes.dex */
    public enum a {
        PUBLISHER_INITIATED("publisher_initiated"),
        SEQUENTIAL_OR_PRECACHE("sequential_or_precache"),
        REFRESH("refresh"),
        EXPONENTIAL_RETRY("exponential_retry"),
        EXPIRED("expired"),
        NATIVE_AD_PLACER("native_ad_placer");


        /* renamed from: g, reason: collision with root package name */
        private final String f17870g;

        a(String str) {
            this.f17870g = str;
        }

        public String a() {
            return this.f17870g;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements a.InterfaceC0201a {

        /* renamed from: a, reason: collision with root package name */
        private final p f17872a;

        /* renamed from: b, reason: collision with root package name */
        private final WeakReference<Context> f17873b;

        /* renamed from: c, reason: collision with root package name */
        private final d f17874c;

        /* renamed from: d, reason: collision with root package name */
        private final c f17875d;

        /* renamed from: e, reason: collision with root package name */
        private final MaxAdFormat f17876e;
        private final Map<String, Object> f;

        /* renamed from: g, reason: collision with root package name */
        private final Map<String, Object> f17877g;

        /* renamed from: h, reason: collision with root package name */
        private final Map<String, Object> f17878h;

        /* renamed from: i, reason: collision with root package name */
        private final int f17879i;

        /* renamed from: j, reason: collision with root package name */
        private long f17880j;

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            throw new IllegalStateException("Wrong callback invoked for ad: " + maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(final String str, MaxError maxError) {
            if (!this.f17872a.a(com.applovin.impl.sdk.c.a.O, this.f17876e) || this.f17875d.f17888c >= this.f17879i) {
                this.f17875d.f17888c = 0;
                this.f17875d.f17887b.set(false);
                if (this.f17875d.f17889d != null) {
                    MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxError;
                    maxErrorImpl.setLoadTag(this.f17875d.f17886a);
                    maxErrorImpl.setRequestLatencyMillis(SystemClock.elapsedRealtime() - this.f17880j);
                    k.a(this.f17875d.f17889d, str, maxError);
                    this.f17875d.f17889d = null;
                    return;
                }
                return;
            }
            c.e(this.f17875d);
            final int pow = (int) Math.pow(2.0d, this.f17875d.f17888c);
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.d.b.1
                @Override // java.lang.Runnable
                public void run() {
                    b.this.f17877g.put("retry_delay_sec", Integer.valueOf(pow));
                    b.this.f17877g.put("retry_attempt", Integer.valueOf(b.this.f17875d.f17888c));
                    Context context = (Context) b.this.f17873b.get();
                    if (context == null) {
                        p unused = b.this.f17872a;
                        context = p.y();
                    }
                    b.this.f17878h.put("art", a.EXPONENTIAL_RETRY.a());
                    b.this.f17878h.put("era", Integer.valueOf(b.this.f17875d.f17888c));
                    b.this.f17874c.a(str, b.this.f17876e, b.this.f, b.this.f17877g, b.this.f17878h, context, b.this);
                }
            }, TimeUnit.SECONDS.toMillis(pow));
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            com.applovin.impl.mediation.a.a aVar = (com.applovin.impl.mediation.a.a) maxAd;
            aVar.a(this.f17875d.f17886a);
            aVar.a(SystemClock.elapsedRealtime() - this.f17880j);
            this.f17875d.f17888c = 0;
            if (this.f17875d.f17889d == null) {
                this.f17874c.a(aVar);
                this.f17875d.f17887b.set(false);
                return;
            }
            aVar.h().e().a(this.f17875d.f17889d);
            this.f17875d.f17889d.onAdLoaded(aVar);
            if (aVar.e().endsWith("load")) {
                this.f17875d.f17889d.onAdRevenuePaid(aVar);
            }
            this.f17875d.f17889d = null;
            if ((this.f17872a.b(com.applovin.impl.sdk.c.a.M).contains(maxAd.getAdUnitId()) || this.f17872a.a(com.applovin.impl.sdk.c.a.L, maxAd.getFormat())) && !this.f17872a.av().a() && !this.f17872a.av().b()) {
                Context context = this.f17873b.get();
                if (context == null) {
                    context = p.y();
                }
                this.f17880j = SystemClock.elapsedRealtime();
                this.f17878h.put("art", a.SEQUENTIAL_OR_PRECACHE.a());
                this.f17874c.a(maxAd.getAdUnitId(), maxAd.getFormat(), this.f, this.f17877g, this.f17878h, context, this);
                return;
            }
            this.f17875d.f17887b.set(false);
        }

        private b(Map<String, Object> map, Map<String, Object> map2, Map<String, Object> map3, c cVar, MaxAdFormat maxAdFormat, long j10, d dVar, p pVar, Context context) {
            this.f17872a = pVar;
            this.f17873b = new WeakReference<>(context);
            this.f17874c = dVar;
            this.f17875d = cVar;
            this.f17876e = maxAdFormat;
            this.f17877g = map2;
            this.f = map;
            this.f17878h = map3;
            this.f17880j = j10;
            if (CollectionUtils.getBoolean(map2, AppLovinSdkExtraParameterKey.DISABLE_AUTO_RETRIES)) {
                this.f17879i = -1;
            } else if (maxAdFormat.isAdViewAd() && CollectionUtils.getBoolean(map2, "auto_refresh_stopped")) {
                this.f17879i = Math.min(2, ((Integer) pVar.a(com.applovin.impl.sdk.c.a.N)).intValue());
            } else {
                this.f17879i = ((Integer) pVar.a(com.applovin.impl.sdk.c.a.N)).intValue();
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f17886a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f17887b;

        /* renamed from: c, reason: collision with root package name */
        private int f17888c;

        /* renamed from: d, reason: collision with root package name */
        private volatile a.InterfaceC0201a f17889d;

        public static /* synthetic */ int e(c cVar) {
            int i10 = cVar.f17888c;
            cVar.f17888c = i10 + 1;
            return i10;
        }

        private c(String str) {
            this.f17887b = new AtomicBoolean();
            this.f17886a = str;
        }
    }

    public d(p pVar) {
        this.f17851a = pVar;
    }

    private String c(String str, String str2) {
        StringBuilder j10 = com.ironsource.adapters.facebook.a.j(str);
        j10.append(str2 != null ? "-".concat(str2) : "");
        return j10.toString();
    }

    private com.applovin.impl.mediation.a.a e(String str) {
        com.applovin.impl.mediation.a.a aVar;
        synchronized (this.f17855e) {
            aVar = this.f17854d.get(str);
            this.f17854d.remove(str);
        }
        return aVar;
    }

    public void b(String str) {
        synchronized (this.f17856g) {
            this.f.add(str);
        }
        Intent intent = new Intent("load_bidder_ad_immediately");
        Map map = CollectionUtils.map(1);
        map.put("ad_unit_id", str);
        AppLovinBroadcastManager.sendBroadcast(intent, map);
    }

    public boolean d(String str) {
        boolean contains;
        synchronized (this.f17856g) {
            contains = this.f.contains(str);
        }
        return contains;
    }

    public boolean a(String str) {
        boolean z10;
        synchronized (this.f17855e) {
            z10 = this.f17854d.get(str) != null;
        }
        return z10;
    }

    public void c(String str) {
        synchronized (this.f17856g) {
            this.f.remove(str);
        }
    }

    public void a(String str, String str2) {
        synchronized (this.f17853c) {
            this.f17852b.remove(c(str, str2));
        }
    }

    private c b(String str, String str2) {
        c cVar;
        synchronized (this.f17853c) {
            String c10 = c(str, str2);
            cVar = this.f17852b.get(c10);
            if (cVar == null) {
                cVar = new c(str2);
                this.f17852b.put(c10, cVar);
            }
        }
        return cVar;
    }

    public void a(String str, String str2, MaxAdFormat maxAdFormat, a aVar, Map<String, Object> map, Map<String, Object> map2, Context context, a.InterfaceC0201a interfaceC0201a) {
        com.applovin.impl.mediation.a.a e10 = (this.f17851a.av().b() || Utils.isDspDemoApp(p.y())) ? null : e(str);
        if (e10 != null) {
            e10.a(str2);
            e10.h().e().a(interfaceC0201a);
            interfaceC0201a.onAdLoaded(e10);
            if (e10.e().endsWith("load")) {
                interfaceC0201a.onAdRevenuePaid(e10);
            }
        }
        c b10 = b(str, str2);
        if (!b10.f17887b.compareAndSet(false, true)) {
            if (b10.f17889d != null && b10.f17889d != interfaceC0201a) {
                y.h("MediationAdLoadManager", "Attempting to load ad for same ad unit id (" + str + ") while another ad load is already in progress!");
            }
            b10.f17889d = interfaceC0201a;
            return;
        }
        if (e10 == null) {
            b10.f17889d = interfaceC0201a;
        }
        Map<String, Object> synchronizedMap = Collections.synchronizedMap(CollectionUtils.map());
        synchronizedMap.put("art", aVar.a());
        if (StringUtils.isValidString(str2)) {
            synchronizedMap.put("alt", str2);
        }
        a(str, maxAdFormat, map, map2, synchronizedMap, context, new b(map, map2, synchronizedMap, b10, maxAdFormat, SystemClock.elapsedRealtime(), this, this.f17851a, context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final String str, final MaxAdFormat maxAdFormat, final Map<String, Object> map, final Map<String, Object> map2, final Map<String, Object> map3, final Context context, final a.InterfaceC0201a interfaceC0201a) {
        this.f17851a.M().a(new com.applovin.impl.mediation.c.b(str, maxAdFormat, map, context, this.f17851a, new b.a() { // from class: com.applovin.impl.mediation.d.1
            @Override // com.applovin.impl.mediation.c.b.a
            public void a(JSONArray jSONArray) {
                d.this.f17851a.M().a((com.applovin.impl.sdk.e.a) new com.applovin.impl.mediation.c.c(str, maxAdFormat, map, map2, map3, jSONArray, context, d.this.f17851a, interfaceC0201a));
            }
        }), com.applovin.impl.mediation.d.c.a(maxAdFormat));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.a aVar) {
        synchronized (this.f17855e) {
            if (this.f17854d.containsKey(aVar.getAdUnitId())) {
                y.i("AppLovinSdk", "Ad in cache already: " + aVar.getAdUnitId());
            }
            this.f17854d.put(aVar.getAdUnitId(), aVar);
        }
    }
}
