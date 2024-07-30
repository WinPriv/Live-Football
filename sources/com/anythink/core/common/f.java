package com.anythink.core.common;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATAdStatusInfo;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATSDK;
import com.anythink.core.api.AdError;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.c.e;
import com.anythink.core.common.b.g;
import com.anythink.core.common.e.ae;
import com.anythink.core.common.e.ah;
import com.anythink.core.common.e.ai;
import com.anythink.core.common.e.al;
import com.anythink.core.common.j;
import com.anythink.core.common.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class f<T extends j> {

    /* renamed from: b, reason: collision with root package name */
    protected Context f5764b;

    /* renamed from: c, reason: collision with root package name */
    protected String f5765c;
    protected boolean f;

    /* renamed from: k, reason: collision with root package name */
    protected g f5772k;

    /* renamed from: n, reason: collision with root package name */
    private long f5775n;
    private long o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f5776p;

    /* renamed from: q, reason: collision with root package name */
    private long f5777q;

    /* renamed from: s, reason: collision with root package name */
    private List<com.anythink.core.common.b.a> f5779s;

    /* renamed from: a, reason: collision with root package name */
    private final String f5763a = getClass().getSimpleName();

    /* renamed from: e, reason: collision with root package name */
    protected int f5767e = 0;

    /* renamed from: g, reason: collision with root package name */
    protected String f5768g = "";

    /* renamed from: r, reason: collision with root package name */
    private boolean f5778r = false;

    /* renamed from: h, reason: collision with root package name */
    protected int f5769h = 1;

    /* renamed from: t, reason: collision with root package name */
    private Object f5780t = new Object();

    /* renamed from: i, reason: collision with root package name */
    protected com.anythink.core.common.b.a f5770i = new com.anythink.core.common.b.a() { // from class: com.anythink.core.common.f.1
        @Override // com.anythink.core.common.b.a
        public final void onAdLoadFail(AdError adError) {
            f.this.b();
            synchronized (f.this.f5780t) {
                Iterator it = f.this.f5779s.iterator();
                while (it.hasNext()) {
                    com.anythink.core.common.b.a aVar = (com.anythink.core.common.b.a) it.next();
                    if (aVar != null) {
                        f fVar = f.this;
                        com.anythink.core.common.k.n.a(fVar.f5765c, fVar.a(), g.i.f5095x, g.i.f5079g, "[listener:" + aVar.toString() + "]");
                        aVar.onAdLoadFail(adError);
                        it.remove();
                    }
                }
            }
            f.this.b(adError);
        }

        @Override // com.anythink.core.common.b.a
        public final void onAdLoaded() {
            synchronized (f.this.f5780t) {
                if (f.this.f5779s != null) {
                    Iterator it = f.this.f5779s.iterator();
                    while (it.hasNext()) {
                        com.anythink.core.common.b.a aVar = (com.anythink.core.common.b.a) it.next();
                        if (aVar != null) {
                            f fVar = f.this;
                            com.anythink.core.common.k.n.a(fVar.f5765c, fVar.a(), g.i.f5095x, g.i.f, "[listener:" + aVar.toString() + "]");
                            aVar.onAdLoaded();
                            it.remove();
                        }
                    }
                }
            }
            f.this.l();
        }
    };

    /* renamed from: j, reason: collision with root package name */
    Random f5771j = new Random();

    /* renamed from: l, reason: collision with root package name */
    double f5773l = 0.0d;

    /* renamed from: m, reason: collision with root package name */
    String f5774m = "";

    /* renamed from: d, reason: collision with root package name */
    protected ConcurrentHashMap<String, h> f5766d = new ConcurrentHashMap<>(5);

    /* renamed from: com.anythink.core.common.f$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f5782a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f5783b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.anythink.core.common.b.a f5784c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f5785d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int[] f5786e;
        final /* synthetic */ String f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Map f5787g;

        public AnonymousClass2(j jVar, String str, com.anythink.core.common.b.a aVar, Context context, int[] iArr, String str2, Map map) {
            this.f5782a = jVar;
            this.f5783b = str;
            this.f5784c = aVar;
            this.f5785d = context;
            this.f5786e = iArr;
            this.f = str2;
            this.f5787g = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            com.anythink.core.c.d a10;
            String str;
            int i10;
            boolean z10;
            synchronized (f.this) {
                if (f.this.e() && this.f5782a.f6023d != 0) {
                    return;
                }
                if (!f.this.i() && this.f5782a.f6023d == 5) {
                    return;
                }
                if (f.this.j() && this.f5782a.f6023d == 0) {
                    Log.e("anythink", "PlacementId(" + this.f5783b + ") the load api calls are not allowed in Auto-load mode");
                    return;
                }
                f.this.a(this.f5784c);
                j jVar = this.f5782a;
                f fVar = f.this;
                jVar.f = fVar.f5770i;
                if (jVar.f6023d != 4) {
                    fVar.f5769h = 1;
                } else {
                    fVar.f5769h++;
                }
                fVar.k();
                int i11 = this.f5782a.f6023d;
                com.anythink.core.common.b.n.a().a(this.f5785d, com.anythink.core.common.b.n.a().p(), com.anythink.core.common.b.n.a().q());
                final String a11 = com.anythink.core.common.k.g.a(this.f5785d);
                this.f5782a.f6020a = a11;
                f.this.a(a11, this.f5784c);
                if (com.anythink.core.common.b.n.a().g() != null && !TextUtils.isEmpty(com.anythink.core.common.b.n.a().p()) && !TextUtils.isEmpty(com.anythink.core.common.b.n.a().q()) && !com.anythink.core.common.k.h.a(this.f5783b)) {
                    if (f.this.g()) {
                        Log.i("anythink", "Placement(" + this.f5783b + ") is loading.");
                        return;
                    }
                    final Context applicationContext = this.f5785d.getApplicationContext();
                    String p10 = com.anythink.core.common.b.n.a().p();
                    String q10 = com.anythink.core.common.b.n.a().q();
                    boolean v3 = com.anythink.core.common.b.n.a().v();
                    if (v3) {
                        a10 = null;
                    } else {
                        a10 = com.anythink.core.c.e.a(applicationContext).a(this.f5783b);
                    }
                    com.anythink.core.c.d dVar = a10;
                    if (dVar != null) {
                        str = dVar.U();
                    } else {
                        str = "";
                    }
                    final String str2 = str;
                    String str3 = this.f5783b;
                    if (dVar != null) {
                        i10 = dVar.l();
                    } else {
                        i10 = -1;
                    }
                    int i12 = i10;
                    j jVar2 = this.f5782a;
                    final com.anythink.core.common.e.e a12 = com.anythink.core.common.k.s.a(a11, str3, "", dVar, "", i12, jVar2.f6023d, this.f5786e[0], jVar2.f6025g);
                    a12.z(this.f);
                    Map<String, Object> map = this.f5787g;
                    if (map != null) {
                        a12.a(map);
                    }
                    if (dVar == null && !v3 && (!TextUtils.isEmpty(this.f5782a.f6022c) || this.f5782a.f6021b != null)) {
                        Log.i("anythink", "request default adsource for splash.");
                        if (f.this.a(this.f5783b, a11, (String) this.f5782a, this.f5784c)) {
                            com.anythink.core.c.e.a(this.f5785d).a(null, p10, q10, this.f5783b, this.f5782a.f6025g, null);
                            return;
                        }
                    }
                    f fVar2 = f.this;
                    if (fVar2.f5767e == 1 && !fVar2.d() && a.a().a(this.f5785d, this.f5783b) != null) {
                        w.a().a(this.f5783b, a11);
                        f.this.h();
                        a12.a(false);
                        a12.z(4);
                        com.anythink.core.common.j.a.a(applicationContext).a(10, a12);
                        com.anythink.core.common.j.a.a(applicationContext).a(12, a12);
                        f.this.f = false;
                        return;
                    }
                    if (dVar != null && f.this.f5776p) {
                        long currentTimeMillis = System.currentTimeMillis() - f.this.f5777q;
                        if (currentTimeMillis > 0 && currentTimeMillis < dVar.aj()) {
                            AdError errorCode = ErrorCode.getErrorCode(ErrorCode.loadFailInPacingError, "", "");
                            a12.z(7);
                            if (!f.this.f5778r) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            f.this.a(z10, a12, new e(errorCode, errorCode.printStackTrace()));
                            f.this.f5778r = true;
                            return;
                        }
                    }
                    f.f(f.this);
                    f.g(f.this);
                    f.this.f5778r = false;
                    if (dVar != null && com.anythink.core.a.b.a().a(applicationContext, this.f5783b, dVar)) {
                        AdError errorCode2 = ErrorCode.getErrorCode(ErrorCode.loadCappingError, "", "");
                        a12.z(8);
                        f.this.a(true, a12, (Throwable) new e(errorCode2, errorCode2.printStackTrace()));
                        return;
                    } else {
                        if (f.this.e()) {
                            Log.i("anythink", "Placement(" + this.f5783b + ") is loading.");
                            return;
                        }
                        f fVar3 = f.this;
                        fVar3.f = true;
                        Iterator<h> it = fVar3.f5766d.values().iterator();
                        while (it.hasNext()) {
                            it.next().f();
                        }
                        com.anythink.core.c.e.a(this.f5785d).a(dVar, p10, q10, this.f5783b, this.f5782a.f6025g, new e.a() { // from class: com.anythink.core.common.f.2.1
                            @Override // com.anythink.core.c.e.a
                            public final void a(final com.anythink.core.c.d dVar2) {
                                com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.f.2.1.1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        synchronized (f.this) {
                                            f.this.o = dVar2.S();
                                            com.anythink.core.common.k.s.a(a12, dVar2);
                                            if (!TextUtils.equals(String.valueOf(dVar2.X()), AnonymousClass2.this.f)) {
                                                AdError errorCode3 = ErrorCode.getErrorCode(ErrorCode.formatError, "", "Format corresponding to API: " + com.anythink.core.common.k.g.d(AnonymousClass2.this.f) + ", Format corresponding to placement strategy: " + com.anythink.core.common.k.g.d(String.valueOf(dVar2.X())));
                                                f.this.a(errorCode3);
                                                a12.a(false);
                                                com.anythink.core.common.j.c.a(a12, errorCode3);
                                                f.this.f = false;
                                                return;
                                            }
                                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                            f.a(f.this, applicationContext, anonymousClass2.f5783b, a11, dVar2, a12, anonymousClass2.f5782a);
                                        }
                                    }
                                });
                            }

                            @Override // com.anythink.core.c.e.a
                            public final void b(final com.anythink.core.c.d dVar2) {
                                if (!TextUtils.equals(str2, dVar2.U())) {
                                    f.this.f5767e = 0;
                                }
                                com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.f.2.1.2
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        synchronized (f.this) {
                                            try {
                                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                                f.a(f.this, dVar2, a11, anonymousClass2.f5783b);
                                            } catch (Throwable th) {
                                                th.printStackTrace();
                                            }
                                        }
                                    }
                                });
                            }

                            @Override // com.anythink.core.c.e.a
                            public final void a(AdError adError) {
                                String str4 = g.i.f5079g;
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                String str5 = anonymousClass2.f5783b;
                                String d10 = com.anythink.core.common.k.g.d(anonymousClass2.f);
                                String printStackTrace = adError.printStackTrace();
                                if (ATSDK.isNetworkLogDebug()) {
                                    try {
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put("action", g.i.f5094w);
                                        jSONObject.put("result", str4);
                                        jSONObject.put("placementId", str5);
                                        jSONObject.put("adtype", d10);
                                        jSONObject.put("errorMsg", printStackTrace);
                                        com.anythink.core.common.k.n.a("anythink_network", jSONObject.toString(), TextUtils.equals(g.i.f5079g, str4));
                                    } catch (Throwable unused) {
                                    }
                                }
                                AdError errorCode3 = ErrorCode.getErrorCode(ErrorCode.placeStrategyError, adError.getPlatformCode(), adError.getPlatformMSG());
                                a12.z(5);
                                f.this.a(true, a12, errorCode3);
                            }
                        });
                        return;
                    }
                }
                f.this.a(ErrorCode.getErrorCode(ErrorCode.appIdOrPlaceIdEmpty, "", ""));
                if (com.anythink.core.common.b.n.a().A()) {
                    Log.e("anythink", "Please check these params in your code (AppId: " + com.anythink.core.common.b.n.a().p() + ", AppKey: " + com.anythink.core.common.b.n.a().q() + ", PlacementId: " + this.f5783b + ")");
                }
                f.this.f = false;
            }
        }
    }

    /* renamed from: com.anythink.core.common.f$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass3 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f5798a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f5799b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f5800c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f5801d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.anythink.core.c.d f5802e;
        final /* synthetic */ boolean f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f5803g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ com.anythink.core.common.e.e f5804h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ al f5805i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ List f5806j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ List f5807k;

        public AnonymousClass3(Context context, j jVar, String str, String str2, com.anythink.core.c.d dVar, boolean z10, List list, com.anythink.core.common.e.e eVar, al alVar, List list2, List list3) {
            this.f5798a = context;
            this.f5799b = jVar;
            this.f5800c = str;
            this.f5801d = str2;
            this.f5802e = dVar;
            this.f = z10;
            this.f5803g = list;
            this.f5804h = eVar;
            this.f5805i = alVar;
            this.f5806j = list2;
            this.f5807k = list3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                System.currentTimeMillis();
                com.anythink.core.common.e.a aVar = new com.anythink.core.common.e.a();
                aVar.f5387a = this.f5798a;
                aVar.f5388b = this.f5799b;
                aVar.f5389c = this.f5800c;
                aVar.f5390d = this.f5801d;
                aVar.f5391e = this.f5802e.X();
                aVar.f = this.f5802e.H();
                aVar.f5392g = this.f5802e.z();
                aVar.f5393h = this.f5802e.i();
                i.a();
                aVar.f5397l = i.a(this.f5802e, this.f);
                i.a();
                aVar.o = i.a(this.f5802e);
                i.a();
                aVar.f5400p = i.b(this.f5802e);
                aVar.f5394i = this.f5803g;
                aVar.f5399n = this.f5802e;
                aVar.f5403s = this.f5804h;
                aVar.f5407w = this.f5805i;
                aVar.f5401q = v.a().c(f.this.f5765c);
                if (this.f5806j.size() > 0) {
                    aVar.f5404t = (ai) this.f5806j.get(0);
                }
                ArrayList arrayList = new ArrayList();
                List list = this.f5807k;
                if (list != null) {
                    arrayList.addAll(list);
                }
                aVar.f5395j = arrayList;
                aVar.f5398m = this.f;
                if (this.f5799b.f6023d == 8) {
                    aVar.f5405u = 7;
                }
                com.anythink.core.b.b bVar = new com.anythink.core.b.b(aVar);
                bVar.a(ATSDK.isNetworkLogDebug());
                bVar.a(new k.a() { // from class: com.anythink.core.common.f.3.1
                    @Override // com.anythink.core.common.k.a
                    public final void a(String str, List<ai> list2, List<ai> list3) {
                        boolean z10 = com.anythink.core.c.e.a(f.this.f5764b).a(f.this.f5765c).j() == 1;
                        ArrayList arrayList2 = null;
                        for (ai aiVar : list3) {
                            if (z10 && (aiVar.l() == 1 || aiVar.l() == 3)) {
                                if (aiVar.P() != 1) {
                                    if (arrayList2 == null) {
                                        arrayList2 = new ArrayList(4);
                                    }
                                    aiVar.y(7);
                                    arrayList2.add(aiVar);
                                }
                            }
                            if (!z10 && aiVar.k() != 0) {
                                c.a().f5269c.put(aiVar.t(), Long.valueOf(System.currentTimeMillis()));
                            }
                        }
                        if (list2.size() > 0) {
                            w.a().a(AnonymousClass3.this.f5801d, str, list2);
                        }
                        h hVar = f.this.f5766d.get(str);
                        if (hVar != null) {
                            hVar.a(list2, list3, arrayList2);
                        }
                    }

                    @Override // com.anythink.core.common.k.a
                    public final void b(String str) {
                        w.a().a(AnonymousClass3.this.f5801d, str);
                        h hVar = f.this.f5766d.get(str);
                        if (hVar != null) {
                            hVar.e();
                        }
                    }

                    @Override // com.anythink.core.common.k.a
                    public final void a(String str) {
                        h hVar = f.this.f5766d.get(str);
                        if (hVar != null) {
                            hVar.d();
                        }
                    }
                });
            } catch (Throwable unused) {
                h hVar = f.this.f5766d.get(this.f5800c);
                if (hVar != null) {
                    hVar.e();
                }
            }
        }
    }

    /* renamed from: com.anythink.core.common.f$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass4 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ATBaseAdAdapter f5810a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ double f5811b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f5812c;

        public AnonymousClass4(ATBaseAdAdapter aTBaseAdAdapter, double d10, String str) {
            this.f5810a = aTBaseAdAdapter;
            this.f5811b = d10;
            this.f5812c = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.anythink.core.common.e.e trackingInfo = this.f5810a.getTrackingInfo();
            ai unitGroupInfo = this.f5810a.getUnitGroupInfo();
            if (trackingInfo != null && unitGroupInfo != null && !unitGroupInfo.j() && !TextUtils.equals(trackingInfo.Y(), "2") && !TextUtils.equals(trackingInfo.Y(), "4")) {
                f fVar = f.this;
                if ((fVar.f5773l > this.f5811b && fVar.f5774m.equals(this.f5812c)) || trackingInfo.H() == 35) {
                    return;
                }
                f fVar2 = f.this;
                fVar2.f5773l = this.f5811b;
                fVar2.f5774m = this.f5812c;
                g gVar = fVar2.f5772k;
                if (gVar != null) {
                    gVar.cancel();
                    f.this.f5772k = null;
                }
                f.a(f.this, unitGroupInfo, trackingInfo);
            }
        }
    }

    public f(Context context, String str) {
        this.f5764b = context.getApplicationContext();
        this.f5765c = str;
        if (com.anythink.core.common.b.n.a().g() == null) {
            com.anythink.core.common.b.n.a().a(this.f5764b);
        }
    }

    public static /* synthetic */ boolean f(f fVar) {
        fVar.f5776p = false;
        return false;
    }

    public abstract h a(T t10);

    public abstract String a();

    public void a(String str, com.anythink.core.common.b.a aVar) {
    }

    public void b(AdError adError) {
    }

    public boolean g() {
        return false;
    }

    public final void h() {
        com.anythink.core.common.b.a aVar = this.f5770i;
        if (aVar != null) {
            aVar.onAdLoaded();
        }
    }

    public boolean i() {
        if (!TextUtils.isEmpty(this.f5768g)) {
            return true;
        }
        return false;
    }

    public boolean j() {
        return false;
    }

    public static /* synthetic */ long g(f fVar) {
        fVar.f5777q = 0L;
        return 0L;
    }

    public boolean a(String str, String str2, T t10, com.anythink.core.common.b.a aVar) {
        return false;
    }

    public final boolean c() {
        return System.currentTimeMillis() - this.f5777q <= 2000;
    }

    public final boolean d() {
        return System.currentTimeMillis() - this.f5775n >= this.o;
    }

    public final boolean e() {
        h hVar;
        if (this.f) {
            return true;
        }
        return (TextUtils.isEmpty(this.f5768g) || (hVar = this.f5766d.get(this.f5768g)) == null || hVar.c()) ? false : true;
    }

    public final void f() {
        com.anythink.core.common.b.n.a().a(new Runnable() { // from class: com.anythink.core.common.f.5
            @Override // java.lang.Runnable
            public final void run() {
                g gVar = f.this.f5772k;
                if (gVar != null) {
                    gVar.cancel();
                    f.this.f5772k = null;
                }
            }
        });
    }

    public final void b() {
        com.anythink.core.c.d b10 = com.anythink.core.c.e.a(this.f5764b).b(this.f5765c);
        if (this.f5776p || b10 == null) {
            return;
        }
        this.f5776p = true;
        this.f5777q = System.currentTimeMillis();
    }

    public final h c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f5766d.get(str);
    }

    public final void d(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.f.6
            @Override // java.lang.Runnable
            public final void run() {
                h hVar = f.this.f5766d.get(str);
                if (hVar != null) {
                    hVar.i();
                }
            }
        });
    }

    public final void b(String str) {
        this.f5766d.remove(str);
    }

    private static void b(com.anythink.core.c.d dVar, com.anythink.core.common.e.e eVar) {
        com.anythink.core.a.c.a();
        if (com.anythink.core.a.c.a(eVar.W(), dVar)) {
            eVar.z(2);
            throw new e(ErrorCode.getErrorCode(ErrorCode.inPacingError, "", ""), "Pacing.");
        }
    }

    public final void a(com.anythink.core.common.b.a aVar) {
        synchronized (this.f5780t) {
            if (this.f5779s == null) {
                this.f5779s = new ArrayList();
            }
            if (aVar == null) {
                return;
            }
            Iterator<com.anythink.core.common.b.a> it = this.f5779s.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                if (it.next() == aVar) {
                    z10 = true;
                }
            }
            if (!z10) {
                this.f5779s.add(aVar);
            }
        }
    }

    public final void a(String str) {
        if (TextUtils.equals(str, com.anythink.core.c.e.a(this.f5764b).a(this.f5765c).U())) {
            this.f5767e = 1;
            this.f5775n = System.currentTimeMillis();
            this.f5776p = false;
            this.f5777q = 0L;
            this.f5778r = false;
            return;
        }
        this.f5767e = 0;
    }

    public final void a(String str, double d10, ai aiVar) {
        h hVar = this.f5766d.get(str);
        if (hVar != null) {
            hVar.a(d10, aiVar);
        }
    }

    public void k() {
    }

    public void l() {
    }

    public final void a(Context context, String str, String str2, T t10, com.anythink.core.common.b.a aVar) {
        Map<String, Object> c10 = v.a().c(str2);
        int[] iArr = {0};
        if (c10.containsKey(ah.O)) {
            try {
                iArr[0] = ((Integer) c10.get(ah.O)).intValue();
            } catch (Throwable unused) {
            }
        }
        int i10 = t10.f6023d;
        if (i10 == 0 || i10 == 3) {
            v.a().a(str2, new Throwable().getStackTrace());
        }
        com.anythink.core.common.k.b.a.a().a(new AnonymousClass2(t10, str2, aVar, context, iArr, str, c10));
    }

    private void a(com.anythink.core.c.d dVar, String str, String str2) {
        List<ai> a10 = com.anythink.core.c.d.a(dVar.af(), dVar.ag());
        List<ai> a11 = com.anythink.core.c.d.a(dVar.ah(), dVar.C(), dVar.ai(), dVar.A(), dVar.s(), dVar.ao(), dVar.ap());
        a11.addAll(com.anythink.core.c.d.d(dVar.g()));
        List<ai> c10 = com.anythink.core.c.d.c(dVar.n());
        if (c10 != null) {
            int size = c10.size();
            for (int i10 = 0; i10 < size; i10++) {
                com.anythink.core.common.k.g.a(a10, c10.get(i10), true);
            }
        }
        if (a11.size() > 0) {
            for (ai aiVar : a11) {
                com.anythink.core.common.e.b a12 = a.a().a(str2, aiVar);
                if (a12 != null) {
                    try {
                        aiVar.a(a12.e().getUnitGroupInfo(), 0, 3, 1);
                        com.anythink.core.common.k.g.a(a10, aiVar, true);
                    } catch (Exception unused) {
                    }
                }
                com.anythink.core.common.e.m a13 = com.anythink.core.b.f.a().a(aiVar);
                if (a13 != null) {
                    aiVar.a(a13, 0, 2, 1);
                    com.anythink.core.common.k.g.a(a10, aiVar, true);
                } else if (!TextUtils.isEmpty(str)) {
                    h hVar = this.f5766d.get(str);
                    ai aiVar2 = null;
                    if (hVar != null) {
                        String t10 = aiVar.t();
                        ConcurrentHashMap<String, ai> concurrentHashMap = hVar.D;
                        if (concurrentHashMap != null) {
                            aiVar2 = concurrentHashMap.get(t10);
                        }
                    }
                    if (aiVar2 != null) {
                        aiVar.a(aiVar2, 0, 3, 1);
                        com.anythink.core.common.k.g.a(a10, aiVar, true);
                    }
                }
            }
        }
        w.a().a(str2, str, dVar, a10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0231: MOVE (r3 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r9 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:81:0x0231 */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0235: MOVE (r3 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r9 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:79:0x0235 */
    /* JADX WARN: Type inference failed for: r24v0, types: [com.anythink.core.common.f<T extends com.anythink.core.common.j>, com.anythink.core.common.f] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v9 */
    private void a(Context context, String str, String str2, com.anythink.core.c.d dVar, com.anythink.core.common.e.e eVar, T t10) {
        ?? r32;
        boolean z10;
        boolean z11;
        boolean z12;
        a.a().a(this.f5765c, str2, dVar);
        List<ai> a10 = com.anythink.core.c.d.a(dVar.af(), dVar.ag());
        List<ai> a11 = com.anythink.core.c.d.a(dVar.ah(), dVar.C(), dVar.ai(), dVar.A(), dVar.s(), dVar.ao(), dVar.ap());
        List<ai> c10 = com.anythink.core.c.d.c(dVar.n());
        List<ai> d10 = com.anythink.core.c.d.d(dVar.g());
        com.anythink.core.common.e.e eVar2 = null;
        if (c10 != null) {
            int size = c10.size();
            r32 = 0;
            while (r32 < size) {
                com.anythink.core.common.k.g.a(a10, c10.get(r32 == true ? 1 : 0), false);
                r32 = (r32 == true ? 1 : 0) + 1;
            }
        }
        try {
            try {
                if (dVar.aw()) {
                    if ((a10 != null && a10.size() != 0) || ((a11 != null && a11.size() != 0) || (d10 != null && d10.size() != 0))) {
                        ae a12 = com.anythink.core.a.a.a(context).a(str);
                        long ab2 = dVar.ab();
                        long ac2 = dVar.ac();
                        int i10 = a12 != null ? a12.f5460d : 0;
                        int i11 = a12 != null ? a12.f5459c : 0;
                        try {
                            if ((ab2 != -1 && i11 >= ab2) || (ac2 != -1 && i10 >= ac2)) {
                                eVar.z(1);
                                throw new e(ErrorCode.getErrorCode(ErrorCode.outOfCapError, "", ""), "Capping.");
                            }
                            com.anythink.core.a.c.a();
                            if (!com.anythink.core.a.c.a(eVar.W(), dVar)) {
                                ArrayList arrayList = new ArrayList(3);
                                ArrayList arrayList2 = new ArrayList(3);
                                ArrayList arrayList3 = new ArrayList(3);
                                ArrayList arrayList4 = new ArrayList(2);
                                try {
                                    a(t10.f6023d, dVar, a10, a11, d10, arrayList2, arrayList3, arrayList4, arrayList, a12, eVar);
                                    ArrayList arrayList5 = new ArrayList(1);
                                    a(arrayList2, arrayList3, eVar, arrayList5);
                                    a(arrayList2, arrayList4, eVar, arrayList5);
                                    List<ai> a13 = a(dVar, str2, eVar.F(), arrayList2);
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(a13);
                                    arrayList6.addAll(arrayList);
                                    w.a().a(str, str2, dVar, arrayList6);
                                    boolean z13 = arrayList5.size() > 0;
                                    if (z13 || arrayList3.size() != 0) {
                                        z12 = false;
                                    } else {
                                        w.a().a(str, str2);
                                        z12 = true;
                                    }
                                    if (z12 && a13.size() == 0 && arrayList4.size() == 0) {
                                        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.noAvailableAdsource, "", "");
                                        eVar.z(6);
                                        a(true, eVar, errorCode);
                                        this.f = false;
                                        return;
                                    }
                                    com.anythink.core.a.b.a().b(this.f5764b, str, dVar);
                                    eVar.a(true);
                                    com.anythink.core.common.j.a.a(this.f5764b).a(10, eVar);
                                    Map<String, Object> c11 = v.a().c(this.f5765c);
                                    Map<String, al> map = x.a(this.f5764b).f6550a;
                                    al remove = map != null ? map.remove(str) : null;
                                    h a14 = a(t10);
                                    a14.f5959h = c11;
                                    a14.f5960i = eVar;
                                    a14.a(t10);
                                    a14.a(t10.f6024e);
                                    a14.R = arrayList4;
                                    this.f5768g = str2;
                                    com.anythink.core.common.l.g gVar = new com.anythink.core.common.l.g();
                                    gVar.f6325a = str;
                                    gVar.f6326b = str2;
                                    gVar.f6327c = dVar;
                                    gVar.f6328d = a13;
                                    gVar.f6329e = z12;
                                    gVar.f = eVar.S();
                                    gVar.f6330g = remove;
                                    a14.a(gVar);
                                    this.f5766d.put(str2, a14);
                                    a14.b();
                                    this.f = false;
                                    if (z12) {
                                        return;
                                    }
                                    com.anythink.core.common.k.b.a.a().b(new AnonymousClass3(context, t10, str2, str, dVar, z13, arrayList3, eVar, remove, arrayList5, a13));
                                    return;
                                } catch (e e10) {
                                    e = e10;
                                    eVar2 = eVar;
                                    r32 = 1;
                                    a(r32, eVar2, e);
                                    return;
                                } catch (Throwable th) {
                                    th = th;
                                    eVar2 = eVar;
                                    r32 = 1;
                                    a(r32, eVar2, th);
                                    return;
                                }
                            }
                            eVar.z(2);
                            throw new e(ErrorCode.getErrorCode(ErrorCode.inPacingError, "", ""), "Pacing.");
                        } catch (e e11) {
                            e = e11;
                            r32 = z11;
                            eVar2 = eVar;
                        } catch (Throwable th2) {
                            th = th2;
                            r32 = z10;
                            eVar2 = eVar;
                        }
                    }
                    eVar.z(5);
                    if (dVar.h() == 1) {
                        throw new e(ErrorCode.getErrorCode(ErrorCode.noAdsourceConfigInDebugerMode, "", ""), "No Adsource.");
                    }
                    throw new e(ErrorCode.getErrorCode(ErrorCode.noAdsourceConfig, "", ""), "No Adsource.");
                }
                eVar.z(5);
                throw new e(ErrorCode.getErrorCode(ErrorCode.placementAdClose, "", ""), "Strategy is close.");
            } catch (e e12) {
                e = e12;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (e e13) {
            e = e13;
            eVar2 = eVar;
            r32 = 1;
        } catch (Throwable th4) {
            th = th4;
            eVar2 = eVar;
            r32 = 1;
        }
    }

    private static void a(com.anythink.core.c.d dVar, com.anythink.core.common.e.e eVar) {
        if (dVar.aw()) {
            return;
        }
        eVar.z(5);
        throw new e(ErrorCode.getErrorCode(ErrorCode.placementAdClose, "", ""), "Strategy is close.");
    }

    private static void a(com.anythink.core.c.d dVar, List list, List list2, List list3, com.anythink.core.common.e.e eVar) {
        if (list == null || list.size() == 0) {
            if (list2 == null || list2.size() == 0) {
                if (list3 == null || list3.size() == 0) {
                    eVar.z(5);
                    if (dVar.h() == 1) {
                        throw new e(ErrorCode.getErrorCode(ErrorCode.noAdsourceConfigInDebugerMode, "", ""), "No Adsource.");
                    }
                    throw new e(ErrorCode.getErrorCode(ErrorCode.noAdsourceConfig, "", ""), "No Adsource.");
                }
            }
        }
    }

    private static void a(com.anythink.core.c.d dVar, ae aeVar, com.anythink.core.common.e.e eVar) {
        long ab2 = dVar.ab();
        long ac2 = dVar.ac();
        int i10 = aeVar != null ? aeVar.f5460d : 0;
        int i11 = aeVar != null ? aeVar.f5459c : 0;
        if ((ab2 == -1 || i11 < ab2) && (ac2 == -1 || i10 < ac2)) {
            return;
        }
        eVar.z(1);
        throw new e(ErrorCode.getErrorCode(ErrorCode.outOfCapError, "", ""), "Capping.");
    }

    private void a(int i10, com.anythink.core.c.d dVar, List<ai> list, List<ai> list2, List<ai> list3, List<ai> list4, List<ai> list5, List<ai> list6, List<ai> list7, ae aeVar, com.anythink.core.common.e.e eVar) {
        AtomicInteger atomicInteger = new AtomicInteger(list3.size() + list2.size() + list.size());
        for (ai aiVar : list) {
            if (a(i10, dVar, eVar.W(), eVar, aeVar, aiVar, atomicInteger)) {
                aiVar.b();
                list7.add(aiVar);
            } else {
                list4.add(aiVar);
            }
        }
        for (ai aiVar2 : list2) {
            if (a(i10, dVar, eVar.W(), eVar, aeVar, aiVar2, atomicInteger)) {
                aiVar2.b();
                list7.add(aiVar2);
            } else {
                list5.add(aiVar2);
            }
        }
        for (ai aiVar3 : list3) {
            if (a(i10, dVar, eVar.W(), eVar, aeVar, aiVar3, atomicInteger)) {
                aiVar3.b();
                list7.add(aiVar3);
            } else {
                list6.add(aiVar3);
            }
        }
        if (list4.size() > 0 || list5.size() > 0 || list6.size() > 0) {
            return;
        }
        eVar.z(6);
        if (atomicInteger.get() == 0) {
            eVar.z(10);
        }
        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.noAvailableAdsource, "", "");
        throw new e(errorCode, errorCode.printStackTrace());
    }

    private void a(List<ai> list, List<ai> list2, com.anythink.core.common.e.e eVar, List<ai> list3) {
        ai aiVar;
        boolean z10 = false;
        for (int size = list2.size() - 1; size >= 0; size--) {
            ai aiVar2 = list2.get(size);
            if (aiVar2.aa()) {
                list3.add(aiVar2);
            }
            if (aiVar2.m() != 2) {
                com.anythink.core.common.e.b a10 = a.a().a(this.f5765c, aiVar2);
                if (a10 != null) {
                    aiVar2.a(a10.e().getUnitGroupInfo(), 0, 3, 1);
                    aiVar = aiVar2;
                } else {
                    aiVar = null;
                }
                if (aiVar == null) {
                    try {
                        com.anythink.core.common.e.m a11 = com.anythink.core.b.f.a().a(aiVar2);
                        if (a11 != null && !a11.a()) {
                            aiVar2.a(a11, 0, 2, 1);
                            aiVar = aiVar2;
                        } else if (a11 != null) {
                            com.anythink.core.common.e.r rVar = new com.anythink.core.common.e.r();
                            rVar.f5731a = 1;
                            rVar.f5732b = a11.getSortPrice();
                            rVar.f5735e = eVar;
                            rVar.f5733c = aiVar2;
                            rVar.f5734d = aiVar2;
                            a11.a(rVar, true);
                        }
                    } catch (Throwable unused) {
                    }
                }
                if (aiVar != null) {
                    try {
                        if (aiVar2.l() == 7) {
                            z10 = true;
                        }
                        list2.remove(size);
                        com.anythink.core.common.k.g.a(list, aiVar2, false);
                    } catch (Exception unused2) {
                    }
                }
            }
        }
        if (z10) {
            for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                if (list2.get(size2).l() == 7) {
                    list2.remove(size2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10, com.anythink.core.common.e.e eVar, Throwable th) {
        AdError errorCode;
        if (th instanceof e) {
            errorCode = ((e) th).f5385a;
        } else {
            errorCode = ErrorCode.getErrorCode(ErrorCode.exception, "", th.getMessage());
        }
        a(z10, eVar, errorCode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10, com.anythink.core.common.e.e eVar, AdError adError) {
        this.f = false;
        a(adError);
        eVar.a(false);
        if (z10) {
            com.anythink.core.common.j.a.a(this.f5764b).a(10, eVar);
            com.anythink.core.common.j.c.a(eVar, adError);
        }
    }

    private boolean a(int i10, com.anythink.core.c.d dVar, String str, com.anythink.core.common.e.e eVar, ae aeVar, ai aiVar, AtomicInteger atomicInteger) {
        com.anythink.core.common.e.d d10;
        com.anythink.core.common.e.e N = eVar.N();
        com.anythink.core.common.k.s.a(N, aiVar, 0, false);
        ae.a a10 = aeVar != null ? aeVar.a(aiVar.t()) : null;
        int i11 = a10 != null ? a10.f5466e : 0;
        int i12 = a10 != null ? a10.f5465d : 0;
        if (aiVar.e() != -1 && i12 >= aiVar.e()) {
            aiVar.g(-5);
            aiVar.h("Out of Cap");
            com.anythink.core.common.k.n.a(str, eVar, "Out of Cap", aiVar, i11, i12);
            com.anythink.core.common.j.c.a(N, 2, ErrorCode.getErrorCode(ErrorCode.outOfCapError, "", "Out of Cap"));
            return true;
        }
        if (aiVar.f() != -1 && i11 >= aiVar.f()) {
            aiVar.g(-5);
            aiVar.h("Out of Cap");
            com.anythink.core.common.k.n.a(str, eVar, "Out of Cap", aiVar, i11, i12);
            com.anythink.core.common.j.c.a(N, 2, ErrorCode.getErrorCode(ErrorCode.outOfCapError, "", "Out of Cap"));
            return true;
        }
        if (com.anythink.core.a.c.a().a(str, aiVar)) {
            aiVar.g(-6);
            aiVar.h("Out of Pacing");
            com.anythink.core.common.k.n.a(str, eVar, "Out of Pacing", aiVar, i11, i12);
            com.anythink.core.common.j.c.a(N, 3, ErrorCode.getErrorCode(ErrorCode.inPacingError, "", "Out of Pacing"));
            return true;
        }
        if (c.a().a(aiVar)) {
            aiVar.g(-6);
            aiVar.h("Request fail in pacing");
            com.anythink.core.common.k.n.a(str, eVar, "Request fail in pacing", aiVar, i11, i12);
            com.anythink.core.common.j.c.a(N, 4, ErrorCode.getErrorCode(ErrorCode.inRequestFailPacing, "", "Request fail in pacing"));
            return true;
        }
        List<String> l10 = com.anythink.core.common.b.n.a().l(this.f5765c);
        if (l10 != null && l10.contains(aiVar.t())) {
            aiVar.g(-8);
            aiVar.h("Request fail in filter list");
            com.anythink.core.common.k.n.a(str, eVar, "Request fail in filter list", aiVar, i11, i12, l10);
            com.anythink.core.common.j.c.a(N, 5, ErrorCode.getErrorCode(ErrorCode.filterSourceError, "", "Request fail in filter list"));
            return true;
        }
        List<String> m10 = com.anythink.core.common.b.n.a().m(this.f5765c);
        if (m10 != null && m10.contains(String.valueOf(aiVar.c()))) {
            aiVar.g(-8);
            aiVar.h("Filter by network firm id.");
            com.anythink.core.common.k.n.a(str, eVar, "Filter by network firm id.", aiVar, i11, i12, m10);
            com.anythink.core.common.j.c.a(N, 9, ErrorCode.getErrorCode(ErrorCode.networkFirmIdfilterSourceError, "", "Filter by network firm id."));
            return true;
        }
        if (aiVar.j()) {
            if (c.a().b(aiVar)) {
                aiVar.g(-7);
                aiVar.h("Bid fail in pacing");
                com.anythink.core.common.k.n.a(str, eVar, "Bid fail in pacing", aiVar, i11, i12);
                com.anythink.core.common.j.c.a(N, 4, ErrorCode.getErrorCode(ErrorCode.inRequestFailPacing, "", "Bid fail in pacing"));
                return true;
            }
            if (aiVar.X() != 1 && aiVar.l() == 2 && (d10 = v.a().d(this.f5765c)) != null && d10.a(aiVar)) {
                aiVar.g(-7);
                aiVar.h("Can't Load On Showing");
                com.anythink.core.common.k.n.a(str, eVar, "Can't Load On Showing", aiVar, i11, i12);
                com.anythink.core.common.j.c.a(eVar, 7, ErrorCode.getErrorCode(ErrorCode.loadInShowingFilter, "", "Can't Load On Showing"));
                return true;
            }
        }
        if (!c.a().a(i10, dVar, aiVar)) {
            return false;
        }
        atomicInteger.decrementAndGet();
        aiVar.g(-8);
        aiVar.h("Error Code Request fail in pacing");
        com.anythink.core.common.k.n.a(str, eVar, "Error Code Request fail in pacing", aiVar, i11, i12);
        com.anythink.core.common.j.c.a(N, 10, ErrorCode.getErrorCode(ErrorCode.inNetworkErrorCodeRequestFailPacing, "", "Error Code Request fail in pacing"));
        return true;
    }

    private List<ai> a(com.anythink.core.c.d dVar, String str, int i10, List<ai> list) {
        int i11;
        JSONArray jSONArray = new JSONArray();
        com.anythink.core.common.e.e eVar = new com.anythink.core.common.e.e();
        eVar.x(this.f5765c);
        eVar.y(str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(dVar.X());
        eVar.z(sb2.toString());
        eVar.w(dVar.U());
        eVar.t(i10);
        eVar.E(dVar.O());
        eVar.v(dVar.ae());
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap hashMap = new HashMap(3);
        Iterator<ai> it = list.iterator();
        while (true) {
            i11 = 0;
            if (!it.hasNext()) {
                break;
            }
            ai next = it.next();
            double a10 = com.anythink.core.common.k.g.a(next);
            List list2 = (List) linkedHashMap.get(String.valueOf(a10));
            if (list2 == null) {
                list2 = new ArrayList();
                linkedHashMap.put(String.valueOf(a10), list2);
            }
            Integer num = (Integer) hashMap.get(String.valueOf(a10));
            if (num == null) {
                num = 0;
            }
            hashMap.put(String.valueOf(a10), Integer.valueOf(next.T() + num.intValue()));
            list2.add(next);
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (true) {
            int i12 = 1;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            List list3 = (List) entry.getValue();
            if (list3.size() > 1) {
                int intValue = ((Integer) hashMap.get(entry.getKey())).intValue();
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    if (list3.size() <= 0) {
                        break;
                    }
                    if (list3.size() == i12) {
                        arrayList2.add((ai) list3.get(i11));
                        list3.remove(i11);
                        break;
                    }
                    int nextInt = this.f5771j.nextInt(intValue) + i12;
                    Iterator it3 = list3.iterator();
                    int i13 = i11;
                    while (true) {
                        if (it3.hasNext()) {
                            ai aiVar = (ai) it3.next();
                            if (aiVar.T() + i13 >= nextInt) {
                                arrayList2.add(aiVar);
                                list3.remove(aiVar);
                                intValue -= aiVar.T();
                                i11 = 0;
                                i12 = 1;
                                break;
                            }
                            i13 += aiVar.T();
                            i11 = 0;
                            i12 = 1;
                        }
                    }
                }
                linkedHashMap.put((String) entry.getKey(), arrayList2);
                i11 = 0;
            }
        }
        dVar.l();
        Iterator it4 = linkedHashMap.entrySet().iterator();
        int i14 = 0;
        while (it4.hasNext()) {
            for (ai aiVar2 : (List) ((Map.Entry) it4.next()).getValue()) {
                aiVar2.m((i14 / dVar.l()) + 1);
                aiVar2.E();
                arrayList.add(aiVar2);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("sortpriority", i14);
                    jSONObject.put("sorttype", aiVar2.o());
                    jSONObject.put("unit_id", aiVar2.t());
                    try {
                        jSONObject.put("bidresult", 1);
                        jSONObject.put("bidprice", aiVar2.M() ? String.valueOf(aiVar2.x()) : "0");
                        jSONArray.put(jSONObject);
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                }
                i14++;
            }
        }
        eVar.s(jSONArray.toString());
        com.anythink.core.common.j.a.a(this.f5764b).a(15, eVar);
        return arrayList;
    }

    private void a(ATBaseAdAdapter aTBaseAdAdapter, String str, double d10) {
        com.anythink.core.common.b.n.a().a(new AnonymousClass4(aTBaseAdAdapter, d10, str));
    }

    private void a(ai aiVar, com.anythink.core.common.e.e eVar) {
        g gVar = new g(aiVar.p(), aiVar.p(), aiVar, eVar);
        this.f5772k = gVar;
        gVar.start();
    }

    public final void a(com.anythink.core.common.e.b bVar) {
        if (bVar.c()) {
            this.f5767e = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.anythink.core.api.ATAdStatusInfo a(android.content.Context r5, java.util.Map<java.lang.String, java.lang.Object> r6) {
        /*
            r4 = this;
            boolean r0 = r4.e()
            r1 = 1
            r2 = 0
            com.anythink.core.common.e.b r5 = r4.a(r5, r1, r2, r6)
            if (r5 == 0) goto L26
            com.anythink.core.api.BaseAd r6 = r5.f()
            com.anythink.core.api.ATBaseAdAdapter r3 = r5.e()
            if (r6 == 0) goto L1b
            com.anythink.core.common.b.j r6 = com.anythink.core.common.b.j.a(r6)
            goto L27
        L1b:
            if (r3 == 0) goto L26
            com.anythink.core.api.ATBaseAdAdapter r6 = r5.e()
            com.anythink.core.common.b.j r6 = com.anythink.core.common.b.j.a(r6)
            goto L27
        L26:
            r6 = 0
        L27:
            com.anythink.core.api.ATAdStatusInfo r3 = new com.anythink.core.api.ATAdStatusInfo
            if (r5 == 0) goto L2c
            goto L2d
        L2c:
            r1 = r2
        L2d:
            r3.<init>(r0, r1, r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.f.a(android.content.Context, java.util.Map):com.anythink.core.api.ATAdStatusInfo");
    }

    public final List<ATAdInfo> a(Context context) {
        List<com.anythink.core.common.e.b> a10;
        if (a(false, false, (Map<String, Object>) null) || (a10 = a.a().a(context, this.f5765c, false, false, true, null)) == null || a10.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(3);
        Iterator<com.anythink.core.common.e.b> it = a10.iterator();
        while (it.hasNext()) {
            com.anythink.core.common.e.b next = it.next();
            BaseAd f = next != null ? next.f() : null;
            ATBaseAdAdapter e10 = next != null ? next.e() : null;
            if (f != null) {
                arrayList.add(com.anythink.core.common.b.j.a(f));
            } else if (e10 != null) {
                arrayList.add(com.anythink.core.common.b.j.a(e10));
            }
        }
        return arrayList;
    }

    public com.anythink.core.common.e.b a(Context context, boolean z10, boolean z11, Map<String, Object> map) {
        if (a(z11, z10, map)) {
            return null;
        }
        return a.a().a(context, this.f5765c, z10, z11, map);
    }

    private boolean a(boolean z10, boolean z11, Map<String, Object> map) {
        com.anythink.core.c.d a10 = com.anythink.core.c.e.a(com.anythink.core.common.b.n.a().g()).a(this.f5765c);
        String str = TextUtils.isEmpty(this.f5768g) ? "" : this.f5768g;
        if (a10 == null) {
            a10 = com.anythink.core.c.e.a(this.f5764b).a(this.f5765c);
        }
        if (a10 == null) {
            com.anythink.core.common.e.e a11 = com.anythink.core.common.k.s.a("", this.f5765c, "", null, "", -1, 0, 0, map);
            if (z10) {
                com.anythink.core.common.j.c.a(a11, 4, "", str);
            } else if (z11) {
                com.anythink.core.common.j.c.a(a11, false, 4, -1, "", -1, "", "", str, false, "");
            }
            return true;
        }
        com.anythink.core.a.c.a();
        if (com.anythink.core.a.c.a(this.f5765c, a10)) {
            com.anythink.core.common.e.e a12 = com.anythink.core.common.k.s.a("", this.f5765c, "", a10, "", a10.l(), 0, 0, map);
            if (z10) {
                com.anythink.core.common.j.c.a(a12, 3, "", str);
            } else if (z11) {
                com.anythink.core.common.j.c.a(a12, false, 3, -1, "", -1, "", "", str, false, "");
            }
            return true;
        }
        if (!com.anythink.core.a.a.a(this.f5764b).a(a10, this.f5765c)) {
            return false;
        }
        com.anythink.core.common.e.e a13 = com.anythink.core.common.k.s.a("", this.f5765c, "", a10, "", a10.l(), 0, 0, map);
        if (z10) {
            com.anythink.core.common.j.c.a(a13, 2, "", str);
        } else if (z11) {
            com.anythink.core.common.j.c.a(a13, false, 2, -1, "", -1, "", "", str, false, "");
        }
        return true;
    }

    public final void a(AdError adError) {
        com.anythink.core.common.b.a aVar = this.f5770i;
        if (aVar != null) {
            aVar.onAdLoadFail(adError);
        }
    }

    public final boolean a(ATAdStatusInfo aTAdStatusInfo) {
        com.anythink.core.c.d a10 = com.anythink.core.c.e.a(com.anythink.core.common.b.n.a().g()).a(this.f5765c);
        if (this.f5767e != 1 || d() || aTAdStatusInfo == null || !aTAdStatusInfo.isReady()) {
            return j() || (a10 != null && a10.V() == 1);
        }
        return false;
    }

    public static String a(com.anythink.core.common.e.j jVar) {
        return jVar.f5654b + jVar.f5655c + jVar.f + System.currentTimeMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0233: MOVE (r3 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r9 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:81:0x0233 */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0237: MOVE (r3 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r9 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:79:0x0237 */
    /* JADX WARN: Type inference failed for: r24v0, types: [com.anythink.core.common.f] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static /* synthetic */ void a(f fVar, Context context, String str, String str2, com.anythink.core.c.d dVar, com.anythink.core.common.e.e eVar, j jVar) {
        ?? r32;
        boolean z10;
        boolean z11;
        boolean z12;
        a.a().a(fVar.f5765c, str2, dVar);
        List<ai> a10 = com.anythink.core.c.d.a(dVar.af(), dVar.ag());
        List<ai> a11 = com.anythink.core.c.d.a(dVar.ah(), dVar.C(), dVar.ai(), dVar.A(), dVar.s(), dVar.ao(), dVar.ap());
        List<ai> c10 = com.anythink.core.c.d.c(dVar.n());
        List<ai> d10 = com.anythink.core.c.d.d(dVar.g());
        com.anythink.core.common.e.e eVar2 = null;
        if (c10 != null) {
            int size = c10.size();
            r32 = 0;
            while (r32 < size) {
                com.anythink.core.common.k.g.a(a10, c10.get(r32 == true ? 1 : 0), false);
                r32 = (r32 == true ? 1 : 0) + 1;
            }
        }
        try {
            try {
                if (dVar.aw()) {
                    if ((a10 != null && a10.size() != 0) || ((a11 != null && a11.size() != 0) || (d10 != null && d10.size() != 0))) {
                        ae a12 = com.anythink.core.a.a.a(context).a(str);
                        long ab2 = dVar.ab();
                        long ac2 = dVar.ac();
                        int i10 = a12 != null ? a12.f5460d : 0;
                        int i11 = a12 != null ? a12.f5459c : 0;
                        try {
                            if ((ab2 != -1 && i11 >= ab2) || (ac2 != -1 && i10 >= ac2)) {
                                eVar.z(1);
                                throw new e(ErrorCode.getErrorCode(ErrorCode.outOfCapError, "", ""), "Capping.");
                            }
                            com.anythink.core.a.c.a();
                            if (!com.anythink.core.a.c.a(eVar.W(), dVar)) {
                                ArrayList arrayList = new ArrayList(3);
                                ArrayList arrayList2 = new ArrayList(3);
                                ArrayList arrayList3 = new ArrayList(3);
                                ArrayList arrayList4 = new ArrayList(2);
                                try {
                                    fVar.a(jVar.f6023d, dVar, a10, a11, d10, arrayList2, arrayList3, arrayList4, arrayList, a12, eVar);
                                    ArrayList arrayList5 = new ArrayList(1);
                                    fVar.a(arrayList2, arrayList3, eVar, arrayList5);
                                    fVar.a(arrayList2, arrayList4, eVar, arrayList5);
                                    List<ai> a13 = fVar.a(dVar, str2, eVar.F(), arrayList2);
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(a13);
                                    arrayList6.addAll(arrayList);
                                    w.a().a(str, str2, dVar, arrayList6);
                                    boolean z13 = arrayList5.size() > 0;
                                    if (z13 || arrayList3.size() != 0) {
                                        z12 = false;
                                    } else {
                                        w.a().a(str, str2);
                                        z12 = true;
                                    }
                                    if (z12 && a13.size() == 0 && arrayList4.size() == 0) {
                                        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.noAvailableAdsource, "", "");
                                        eVar.z(6);
                                        fVar.a(true, eVar, errorCode);
                                        fVar.f = false;
                                        return;
                                    }
                                    com.anythink.core.a.b.a().b(fVar.f5764b, str, dVar);
                                    eVar.a(true);
                                    com.anythink.core.common.j.a.a(fVar.f5764b).a(10, eVar);
                                    Map<String, Object> c11 = v.a().c(fVar.f5765c);
                                    Map<String, al> map = x.a(fVar.f5764b).f6550a;
                                    al remove = map != null ? map.remove(str) : null;
                                    h a14 = fVar.a(jVar);
                                    a14.f5959h = c11;
                                    a14.f5960i = eVar;
                                    a14.a(jVar);
                                    a14.a(jVar.f6024e);
                                    a14.R = arrayList4;
                                    fVar.f5768g = str2;
                                    com.anythink.core.common.l.g gVar = new com.anythink.core.common.l.g();
                                    gVar.f6325a = str;
                                    gVar.f6326b = str2;
                                    gVar.f6327c = dVar;
                                    gVar.f6328d = a13;
                                    gVar.f6329e = z12;
                                    gVar.f = eVar.S();
                                    gVar.f6330g = remove;
                                    a14.a(gVar);
                                    fVar.f5766d.put(str2, a14);
                                    a14.b();
                                    fVar.f = false;
                                    if (z12) {
                                        return;
                                    }
                                    com.anythink.core.common.k.b.a.a().b(new AnonymousClass3(context, jVar, str2, str, dVar, z13, arrayList3, eVar, remove, arrayList5, a13));
                                    return;
                                } catch (e e10) {
                                    e = e10;
                                    eVar2 = eVar;
                                    r32 = 1;
                                    fVar.a(r32, eVar2, e);
                                    return;
                                } catch (Throwable th) {
                                    th = th;
                                    eVar2 = eVar;
                                    r32 = 1;
                                    fVar.a(r32, eVar2, th);
                                    return;
                                }
                            }
                            eVar.z(2);
                            throw new e(ErrorCode.getErrorCode(ErrorCode.inPacingError, "", ""), "Pacing.");
                        } catch (e e11) {
                            e = e11;
                            r32 = z11;
                            eVar2 = eVar;
                        } catch (Throwable th2) {
                            th = th2;
                            r32 = z10;
                            eVar2 = eVar;
                        }
                    }
                    eVar.z(5);
                    if (dVar.h() == 1) {
                        throw new e(ErrorCode.getErrorCode(ErrorCode.noAdsourceConfigInDebugerMode, "", ""), "No Adsource.");
                    }
                    throw new e(ErrorCode.getErrorCode(ErrorCode.noAdsourceConfig, "", ""), "No Adsource.");
                }
                eVar.z(5);
                throw new e(ErrorCode.getErrorCode(ErrorCode.placementAdClose, "", ""), "Strategy is close.");
            } catch (e e12) {
                e = e12;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (e e13) {
            e = e13;
            eVar2 = eVar;
            r32 = 1;
        } catch (Throwable th4) {
            th = th4;
            eVar2 = eVar;
            r32 = 1;
        }
    }

    public static /* synthetic */ void a(f fVar, com.anythink.core.c.d dVar, String str, String str2) {
        List<ai> a10 = com.anythink.core.c.d.a(dVar.af(), dVar.ag());
        List<ai> a11 = com.anythink.core.c.d.a(dVar.ah(), dVar.C(), dVar.ai(), dVar.A(), dVar.s(), dVar.ao(), dVar.ap());
        a11.addAll(com.anythink.core.c.d.d(dVar.g()));
        List<ai> c10 = com.anythink.core.c.d.c(dVar.n());
        if (c10 != null) {
            int size = c10.size();
            for (int i10 = 0; i10 < size; i10++) {
                com.anythink.core.common.k.g.a(a10, c10.get(i10), true);
            }
        }
        if (a11.size() > 0) {
            for (ai aiVar : a11) {
                com.anythink.core.common.e.b a12 = a.a().a(str2, aiVar);
                if (a12 != null) {
                    try {
                        aiVar.a(a12.e().getUnitGroupInfo(), 0, 3, 1);
                        com.anythink.core.common.k.g.a(a10, aiVar, true);
                    } catch (Exception unused) {
                    }
                }
                com.anythink.core.common.e.m a13 = com.anythink.core.b.f.a().a(aiVar);
                if (a13 != null) {
                    aiVar.a(a13, 0, 2, 1);
                    com.anythink.core.common.k.g.a(a10, aiVar, true);
                } else if (!TextUtils.isEmpty(str)) {
                    h hVar = fVar.f5766d.get(str);
                    ai aiVar2 = null;
                    if (hVar != null) {
                        String t10 = aiVar.t();
                        ConcurrentHashMap<String, ai> concurrentHashMap = hVar.D;
                        if (concurrentHashMap != null) {
                            aiVar2 = concurrentHashMap.get(t10);
                        }
                    }
                    if (aiVar2 != null) {
                        aiVar.a(aiVar2, 0, 3, 1);
                        com.anythink.core.common.k.g.a(a10, aiVar, true);
                    }
                }
            }
        }
        w.a().a(str2, str, dVar, a10);
    }

    public static /* synthetic */ void a(f fVar, ai aiVar, com.anythink.core.common.e.e eVar) {
        g gVar = new g(aiVar.p(), aiVar.p(), aiVar, eVar);
        fVar.f5772k = gVar;
        gVar.start();
    }
}
