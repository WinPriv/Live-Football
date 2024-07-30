package com.anythink.core.common.l;

import a3.l;
import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.ATSDK;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.b.g;
import com.anythink.core.common.b.n;
import com.anythink.core.common.b.p;
import com.anythink.core.common.e.ae;
import com.anythink.core.common.e.ai;
import com.anythink.core.common.e.m;
import com.anythink.core.common.k.i;
import com.anythink.core.common.k.s;
import com.anythink.core.common.k.t;
import com.anythink.core.common.v;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f6276a = "d";

    /* renamed from: b, reason: collision with root package name */
    String f6277b;

    /* renamed from: c, reason: collision with root package name */
    ai f6278c;

    /* renamed from: d, reason: collision with root package name */
    com.anythink.core.common.e.e f6279d;

    /* renamed from: e, reason: collision with root package name */
    String f6280e;
    int f;

    /* renamed from: g, reason: collision with root package name */
    ATBaseAdAdapter f6281g;

    /* renamed from: h, reason: collision with root package name */
    b f6282h;

    /* renamed from: i, reason: collision with root package name */
    boolean f6283i;

    /* renamed from: j, reason: collision with root package name */
    boolean f6284j;

    /* renamed from: k, reason: collision with root package name */
    long f6285k;

    /* renamed from: l, reason: collision with root package name */
    long f6286l;

    /* renamed from: m, reason: collision with root package name */
    Runnable f6287m;

    /* renamed from: n, reason: collision with root package name */
    Runnable f6288n;
    c o;

    /* renamed from: p, reason: collision with root package name */
    Boolean f6289p;

    /* renamed from: q, reason: collision with root package name */
    int f6290q;

    /* renamed from: r, reason: collision with root package name */
    String f6291r;

    /* renamed from: s, reason: collision with root package name */
    boolean f6292s;

    /* renamed from: com.anythink.core.common.l.d$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ATBaseAdAdapter f6293a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ai f6294b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f6295c;

        public AnonymousClass1(ATBaseAdAdapter aTBaseAdAdapter, ai aiVar, Map map) {
            this.f6293a = aTBaseAdAdapter;
            this.f6294b = aiVar;
            this.f6295c = map;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = d.this.f6282h;
            if (bVar != null) {
                bVar.a(this.f6293a);
            }
            Context a10 = d.a(d.this);
            byte b10 = 0;
            if (a10 == null) {
                if (d.this.f6282h != null) {
                    com.anythink.core.common.l.a aVar = new com.anythink.core.common.l.a();
                    aVar.f6264a = 0;
                    aVar.f6266c = SystemClock.elapsedRealtime() - d.this.f6285k;
                    aVar.f6265b = ErrorCode.getErrorCode(ErrorCode.adapterInnerError, "", "Request Context is null! Please check the Ad init Context.");
                    d.this.a(this.f6293a, aVar);
                    return;
                }
                return;
            }
            d.a(d.this, a10, this.f6294b, this.f6293a);
            try {
                Map<String, Object> b11 = d.b(d.this);
                d.this.f6281g = this.f6293a;
                ATBaseAdAdapter aTBaseAdAdapter = this.f6293a;
                Map<String, Object> map = this.f6295c;
                d dVar = d.this;
                aTBaseAdAdapter.internalLoad(a10, map, b11, new a(dVar, dVar, aTBaseAdAdapter, b10));
                com.anythink.core.common.e.e trackingInfo = this.f6293a.getTrackingInfo();
                trackingInfo.g(this.f6293a.getNetworkPlacementId());
                b bVar2 = d.this.f6282h;
                if (bVar2 != null) {
                    bVar2.b(trackingInfo);
                }
            } catch (Throwable th) {
                com.anythink.core.common.l.a aVar2 = new com.anythink.core.common.l.a();
                aVar2.f6264a = 0;
                aVar2.f6266c = SystemClock.elapsedRealtime() - d.this.f6285k;
                aVar2.f6265b = ErrorCode.getErrorCode(ErrorCode.adapterInnerError, "", th.getMessage());
                d.this.a(this.f6293a, aVar2);
            }
        }
    }

    /* loaded from: classes.dex */
    public class a implements ATCustomLoadListener {

        /* renamed from: a, reason: collision with root package name */
        ATBaseAdAdapter f6301a;

        /* renamed from: b, reason: collision with root package name */
        d f6302b;

        public /* synthetic */ a(d dVar, d dVar2, ATBaseAdAdapter aTBaseAdAdapter, byte b10) {
            this(dVar2, aTBaseAdAdapter);
        }

        @Override // com.anythink.core.api.ATCustomLoadListener
        public final void onAdCacheLoaded(final BaseAd... baseAdArr) {
            com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.l.d.a.2
                @Override // java.lang.Runnable
                public final void run() {
                    ATBaseAdAdapter aTBaseAdAdapter;
                    synchronized (a.this) {
                        a aVar = a.this;
                        d dVar = aVar.f6302b;
                        if (dVar != null && (aTBaseAdAdapter = aVar.f6301a) != null) {
                            dVar.a(aTBaseAdAdapter, baseAdArr);
                            a aVar2 = a.this;
                            aVar2.f6302b = null;
                            aVar2.f6301a = null;
                        }
                    }
                }
            });
        }

        @Override // com.anythink.core.api.ATCustomLoadListener
        public final void onAdDataLoaded() {
            com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.l.d.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (a.this) {
                        a aVar = a.this;
                        d dVar = aVar.f6302b;
                        if (dVar != null && aVar.f6301a != null) {
                            dVar.q();
                        }
                    }
                }
            });
        }

        @Override // com.anythink.core.api.ATCustomLoadListener
        public final void onAdLoadError(final String str, final String str2) {
            com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.l.d.a.3
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (a.this) {
                        a aVar = a.this;
                        if (aVar.f6302b != null && aVar.f6301a != null) {
                            com.anythink.core.common.l.a aVar2 = new com.anythink.core.common.l.a();
                            aVar2.f6264a = 0;
                            aVar2.f6265b = ErrorCode.getErrorCode(ErrorCode.noADError, str, str2);
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            a aVar3 = a.this;
                            aVar2.f6266c = elapsedRealtime - d.this.f6285k;
                            aVar3.f6302b.a(aVar3.f6301a, aVar2);
                            a aVar4 = a.this;
                            aVar4.f6302b = null;
                            aVar4.f6301a = null;
                        }
                    }
                }
            });
        }

        private a(d dVar, ATBaseAdAdapter aTBaseAdAdapter) {
            this.f6302b = dVar;
            this.f6301a = aTBaseAdAdapter;
        }
    }

    public d(ai aiVar, int i10) {
        this.f6278c = aiVar;
        this.f6290q = i10;
        this.f6280e = aiVar.t();
        this.f6291r = this.f6280e + "_" + hashCode();
    }

    private void i() {
        if (this.f6287m != null) {
            n.a().c(this.f6287m);
            this.f6287m = null;
        }
    }

    private void j() {
        if (this.f6288n != null) {
            n.a().c(this.f6288n);
            this.f6288n = null;
        }
    }

    private Map<String, Object> k() {
        boolean z10;
        c cVar = this.o;
        com.anythink.core.c.d dVar = cVar.f6273e;
        String str = cVar.f6271c;
        if (dVar == null) {
            return new HashMap();
        }
        Map<String, Object> a10 = dVar.a(this.f6277b, str, this.f6278c);
        int c10 = this.f6278c.c();
        int i10 = 0;
        if (c10 != 2) {
            if (c10 == 6) {
                JSONObject a11 = com.anythink.core.common.k.g.a(this.o.f6269a, str, this.f6277b, dVar.X(), this.f);
                if (dVar.av() == 1) {
                    a10.put("tp_info", a11.toString());
                }
            }
        } else {
            com.anythink.core.c.a h10 = l.h(com.anythink.core.c.b.a(this.o.f6269a));
            if (h10 != null) {
                if (h10.j() == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                a10.put(g.k.f5123p, Boolean.valueOf(z10));
            }
        }
        if (t.a(this.f6278c) && this.o.f6273e.aq() == 1) {
            ae a12 = com.anythink.core.a.a.a(this.o.f6269a).a(this.f6277b);
            if (a12 != null) {
                i10 = a12.f5459c;
            }
            a10.put(g.k.f5119k, Integer.valueOf(i10));
            synchronized (v.a().a(this.f6277b)) {
                String a13 = v.a().a(this.f6277b, this.f6278c.c());
                if (!TextUtils.isEmpty(a13)) {
                    a10.put(g.k.f5120l, a13);
                }
            }
        }
        return a10;
    }

    private Map<String, Object> l() {
        Map<String, Object> map = this.o.f;
        if (map == null) {
            return new HashMap(2);
        }
        return map;
    }

    private Context m() {
        Context context = this.o.f6270b.get();
        if (!(context instanceof Activity)) {
            context = n.a().E();
        }
        if (ATSDK.isNetworkLogDebug()) {
            Log.d(f6276a, "requestContext = ".concat(String.valueOf(context)));
        }
        return context;
    }

    private boolean n() {
        if (!this.f6292s || this.f6284j || s()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void o() {
        if (n()) {
            return;
        }
        this.f6283i = true;
        String str = this.f6280e;
        b bVar = this.f6282h;
        if (bVar != null) {
            bVar.a(this.f6291r, str);
        }
    }

    private Runnable p() {
        return new Runnable() { // from class: com.anythink.core.common.l.d.2
            @Override // java.lang.Runnable
            public final void run() {
                com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.l.d.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.this.o();
                    }
                });
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void q() {
        i();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f6285k;
        this.f6286l = elapsedRealtime;
        com.anythink.core.common.e.e eVar = this.f6279d;
        if (eVar != null) {
            eVar.c(elapsedRealtime);
        }
    }

    private void r() {
        this.f6281g = null;
    }

    private boolean s() {
        if (this.f6289p != null) {
            return true;
        }
        return false;
    }

    private long t() {
        return this.f6285k;
    }

    public final void b() {
        boolean z10;
        BaseAd baseAd;
        ATBaseAdAdapter aTBaseAdAdapter;
        String str;
        this.f6292s = true;
        com.anythink.core.common.e.b a10 = com.anythink.core.common.a.a().a(this.f6277b, this.f6278c);
        if (a10 != null && a10.a()) {
            b bVar = this.f6282h;
            if (bVar != null) {
                bVar.b(a10.e().getTrackingInfo());
            }
            b(a10.e(), this.f6278c);
            return;
        }
        m N = this.f6278c.N();
        if (N == null || !N.f5706s) {
            z10 = false;
            baseAd = null;
            aTBaseAdAdapter = null;
        } else {
            com.anythink.core.b.c.a aVar = N.f5705r;
            if (aVar != null) {
                aTBaseAdAdapter = aVar.a();
                baseAd = aVar.b();
            } else {
                baseAd = null;
                aTBaseAdAdapter = null;
            }
            N.f5705r = null;
            z10 = true;
        }
        if (aTBaseAdAdapter == null && !z10) {
            aTBaseAdAdapter = i.a(this.f6278c);
        }
        if (aTBaseAdAdapter == null) {
            if (this.f6282h != null) {
                com.anythink.core.common.l.a aVar2 = new com.anythink.core.common.l.a();
                aVar2.f6264a = 0;
                aVar2.f6266c = z10 ? this.f6278c.k() : 0L;
                String str2 = z10 ? ErrorCode.c2sBiddingCacheError : "2002";
                if (z10) {
                    str = "";
                } else {
                    str = this.f6278c.h() + " does not exist!";
                }
                aVar2.f6265b = ErrorCode.getErrorCode(str2, "", str);
                a((ATBaseAdAdapter) null, aVar2);
                return;
            }
            return;
        }
        try {
            com.anythink.core.common.k.d.a(this.f6278c.c(), aTBaseAdAdapter.getNetworkSDKVersion());
        } catch (Throwable unused) {
        }
        com.anythink.core.common.e.e a11 = s.a(aTBaseAdAdapter, this.f6279d, this.f6278c);
        this.f6279d = a11;
        b bVar2 = this.f6282h;
        if (bVar2 != null) {
            bVar2.a(a11);
        }
        long B = this.f6278c.B();
        if (B != -1) {
            this.f6287m = p();
            n.a().a(this.f6287m, B);
        }
        long q10 = this.f6278c.q();
        if (q10 != -1) {
            this.f6288n = p();
            n.a().a(this.f6288n, q10);
        }
        this.f6285k = SystemClock.elapsedRealtime();
        Context context = this.o.f6270b.get();
        if (context != null && (context instanceof Activity)) {
            aTBaseAdAdapter.refreshActivityContext((Activity) context);
        }
        if (z10) {
            b bVar3 = this.f6282h;
            if (bVar3 != null) {
                bVar3.b(this.f6279d);
            }
            if (baseAd != null) {
                a(aTBaseAdAdapter, baseAd);
                return;
            } else {
                a(aTBaseAdAdapter, new BaseAd[0]);
                return;
            }
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(aTBaseAdAdapter, this.f6278c, k());
        if (TextUtils.equals(String.valueOf(this.o.f6273e.X()), "2")) {
            n.a().a(anonymousClass1);
        } else {
            com.anythink.core.common.k.b.a.a().b(anonymousClass1);
        }
    }

    public final boolean e() {
        if (s() && this.f6283i) {
            return false;
        }
        return true;
    }

    public final int f() {
        return this.f6290q;
    }

    public final boolean g() {
        return this.f6283i;
    }

    public final ai h() {
        return this.f6278c;
    }

    public final String a() {
        return this.f6291r;
    }

    public final synchronized void c() {
        if (n()) {
            return;
        }
        this.f6289p = Boolean.FALSE;
        this.f6284j = true;
        com.anythink.core.common.l.a aVar = new com.anythink.core.common.l.a();
        aVar.f6264a = 0;
        aVar.f6266c = SystemClock.elapsedRealtime() - this.f6285k;
        aVar.f6265b = ErrorCode.getErrorCode(ErrorCode.timeOutError, "", "");
        a(this.f6281g, aVar);
    }

    public final Boolean d() {
        return this.f6289p;
    }

    public final void a(c cVar) {
        this.o = cVar;
        this.f6277b = cVar.f6272d;
        this.f6279d = cVar.f6275h;
        this.f = cVar.f6274g;
    }

    public final void a(b bVar) {
        this.f6282h = bVar;
    }

    private void a(long j10) {
        if (j10 == -1) {
            return;
        }
        this.f6288n = p();
        n.a().a(this.f6288n, j10);
    }

    private void a(ATBaseAdAdapter aTBaseAdAdapter, ai aiVar) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(aTBaseAdAdapter, aiVar, k());
        if (TextUtils.equals(String.valueOf(this.o.f6273e.X()), "2")) {
            n.a().a(anonymousClass1);
        } else {
            com.anythink.core.common.k.b.a.a().b(anonymousClass1);
        }
    }

    private void a(Context context, ai aiVar, ATBaseAdAdapter aTBaseAdAdapter) {
        if (com.anythink.core.c.a.am()) {
            p a10 = p.a(n.a().g());
            try {
                if (a10.c(aiVar.c()) || !aTBaseAdAdapter.setUserDataConsent(context, a10.c(), ATSDK.isEUTraffic(this.o.f6269a))) {
                    return;
                }
                a10.b(aiVar.c());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private void a(ATBaseAdAdapter aTBaseAdAdapter) {
        this.f6281g = aTBaseAdAdapter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(ATBaseAdAdapter aTBaseAdAdapter, BaseAd... baseAdArr) {
        if (n()) {
            return;
        }
        ai unitGroupInfo = aTBaseAdAdapter.getUnitGroupInfo();
        this.f6279d.d((SystemClock.elapsedRealtime() - this.f6285k) + (unitGroupInfo.l() == 2 ? unitGroupInfo.k() : 0L));
        i();
        j();
        this.f6281g = null;
        this.f6289p = Boolean.TRUE;
        if (this.f6283i) {
            this.f6279d.f5596r = 1;
        }
        com.anythink.core.common.e.e eVar = this.f6279d;
        Map<String, Object> networkInfoMap = aTBaseAdAdapter.getNetworkInfoMap();
        m N = unitGroupInfo.N();
        if (N != null) {
            N.a(networkInfoMap);
            N.a(eVar);
        }
        b bVar = this.f6282h;
        if (bVar != null) {
            bVar.a(this.f6291r, aTBaseAdAdapter, baseAdArr);
        }
    }

    private static void a(ATBaseAdAdapter aTBaseAdAdapter, ai aiVar, com.anythink.core.common.e.e eVar) {
        if (aTBaseAdAdapter == null || aiVar == null) {
            return;
        }
        Map<String, Object> networkInfoMap = aTBaseAdAdapter.getNetworkInfoMap();
        m N = aiVar.N();
        if (N != null) {
            N.a(networkInfoMap);
            N.a(eVar);
        }
    }

    private void b(long j10) {
        if (j10 == -1) {
            return;
        }
        this.f6287m = p();
        n.a().a(this.f6287m, j10);
    }

    private synchronized void b(ATBaseAdAdapter aTBaseAdAdapter, ai aiVar) {
        if (n()) {
            return;
        }
        i();
        j();
        this.f6281g = null;
        this.f6289p = Boolean.TRUE;
        if (this.f6283i) {
            this.f6279d.f5596r = 1;
        }
        b bVar = this.f6282h;
        if (bVar != null) {
            bVar.a(this.f6291r, aTBaseAdAdapter, aiVar);
        }
    }

    public final synchronized void a(final ATBaseAdAdapter aTBaseAdAdapter, com.anythink.core.common.l.a aVar) {
        if (n()) {
            return;
        }
        i();
        j();
        if (aTBaseAdAdapter != null) {
            n.a().a(new Runnable() { // from class: com.anythink.core.common.l.d.3
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        ATBaseAdAdapter aTBaseAdAdapter2 = aTBaseAdAdapter;
                        if (aTBaseAdAdapter2 != null) {
                            aTBaseAdAdapter2.destory();
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        }
        this.f6281g = null;
        this.f6289p = Boolean.FALSE;
        boolean z10 = this.f6284j;
        if (z10) {
            this.f6279d.f5596r = 2;
        } else if (this.f6283i) {
            this.f6279d.f5596r = 1;
        }
        if (!z10) {
            long currentTimeMillis = System.currentTimeMillis();
            com.anythink.core.common.c.a().a(this.f6280e, currentTimeMillis);
            com.anythink.core.common.c.a().a(this.f6280e, currentTimeMillis, aVar.f6265b);
        }
        aVar.f6267d = this.f6279d;
        aVar.f6268e = this.f6278c;
        b bVar = this.f6282h;
        if (bVar != null) {
            bVar.a(this.f6291r, aVar);
        }
    }

    public static /* synthetic */ Map b(d dVar) {
        Map<String, Object> map = dVar.o.f;
        return map == null ? new HashMap(2) : map;
    }

    public static /* synthetic */ Context a(d dVar) {
        Context context = dVar.o.f6270b.get();
        if (!(context instanceof Activity)) {
            context = n.a().E();
        }
        if (ATSDK.isNetworkLogDebug()) {
            Log.d(f6276a, "requestContext = ".concat(String.valueOf(context)));
        }
        return context;
    }

    public static /* synthetic */ void a(d dVar, Context context, ai aiVar, ATBaseAdAdapter aTBaseAdAdapter) {
        if (com.anythink.core.c.a.am()) {
            p a10 = p.a(n.a().g());
            try {
                if (a10.c(aiVar.c()) || !aTBaseAdAdapter.setUserDataConsent(context, a10.c(), ATSDK.isEUTraffic(dVar.o.f6269a))) {
                    return;
                }
                a10.b(aiVar.c());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
