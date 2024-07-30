package com.ironsource.sdk.controller;

import android.content.Context;
import android.os.CountDownTimer;
import android.util.Log;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.controller.x;
import com.ironsource.sdk.controller.y;
import com.ironsource.sdk.g.d;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class g implements wb.a, com.ironsource.sdk.controller.m {

    /* renamed from: a, reason: collision with root package name */
    public com.ironsource.sdk.controller.m f26120a;

    /* renamed from: u, reason: collision with root package name */
    public CountDownTimer f26123u;

    /* renamed from: x, reason: collision with root package name */
    public final com.ironsource.environment.e.a f26126x;
    public final y y;

    /* renamed from: s, reason: collision with root package name */
    public final String f26121s = "g";

    /* renamed from: t, reason: collision with root package name */
    public d.b f26122t = d.b.None;

    /* renamed from: v, reason: collision with root package name */
    public final com.ironsource.sdk.controller.b f26124v = new com.ironsource.sdk.controller.b("NativeCommandExecutor");

    /* renamed from: w, reason: collision with root package name */
    public final com.ironsource.sdk.controller.b f26125w = new com.ironsource.sdk.controller.b("ControllerCommandsExecutor");

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.g.c f26127s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Map f26128t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.j.a.b f26129u;

        public a(com.ironsource.sdk.g.c cVar, Map map, com.ironsource.sdk.j.a.b bVar) {
            this.f26127s = cVar;
            this.f26128t = map;
            this.f26129u = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.ironsource.sdk.controller.m mVar = g.this.f26120a;
            if (mVar != null) {
                mVar.a(this.f26127s, this.f26128t, this.f26129u);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b extends CountDownTimer {
        public b() {
            super(200000L, 1000L);
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            g gVar = g.this;
            Logger.i(gVar.f26121s, "Global Controller Timer Finish");
            gVar.e("controller html - download timeout");
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j10) {
            Logger.i(g.this.f26121s, "Global Controller Timer Tick " + j10);
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ JSONObject f26132s;

        public c(JSONObject jSONObject) {
            this.f26132s = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.ironsource.sdk.controller.m mVar = g.this.f26120a;
            if (mVar != null) {
                mVar.a(this.f26132s);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            g gVar = g.this;
            com.ironsource.sdk.controller.m mVar = gVar.f26120a;
            if (mVar != null) {
                mVar.destroy();
                gVar.f26120a = null;
            }
        }
    }

    /* loaded from: classes2.dex */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            g.this.b();
        }
    }

    /* loaded from: classes2.dex */
    public class f implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f26136s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f26137t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Map f26138u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.j.e f26139v;

        public f(String str, String str2, Map map, com.ironsource.sdk.j.e eVar) {
            this.f26136s = str;
            this.f26137t = str2;
            this.f26138u = map;
            this.f26139v = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.ironsource.sdk.controller.m mVar = g.this.f26120a;
            if (mVar != null) {
                mVar.a(this.f26136s, this.f26137t, this.f26138u, this.f26139v);
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.g$g, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class RunnableC0336g implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Map f26141s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.j.e f26142t;

        public RunnableC0336g(Map map, com.ironsource.sdk.j.e eVar) {
            this.f26141s = map;
            this.f26142t = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.ironsource.sdk.controller.m mVar = g.this.f26120a;
            if (mVar != null) {
                mVar.a(this.f26141s, this.f26142t);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class h implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f26144s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f26145t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.j.e f26146u;

        public h(String str, String str2, com.ironsource.sdk.j.e eVar) {
            this.f26144s = str;
            this.f26145t = str2;
            this.f26146u = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.ironsource.sdk.controller.m mVar = g.this.f26120a;
            if (mVar != null) {
                mVar.a(this.f26144s, this.f26145t, this.f26146u);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class i implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f26148s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.controller.c f26149t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.service.d f26150u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.controller.j f26151v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ int f26152w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ JSONObject f26153x;

        public i(Context context, com.ironsource.sdk.controller.c cVar, com.ironsource.sdk.service.d dVar, com.ironsource.sdk.controller.j jVar, int i10, JSONObject jSONObject) {
            this.f26148s = context;
            this.f26149t = cVar;
            this.f26150u = dVar;
            this.f26151v = jVar;
            this.f26152w = i10;
            this.f26153x = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            g gVar = g.this;
            try {
                g gVar2 = g.this;
                gVar2.f26120a = g.a(gVar2, this.f26148s, this.f26149t, this.f26150u, this.f26151v, this.f26152w, this.f26153x);
                gVar.f26120a.g();
            } catch (Exception e10) {
                gVar.e(Log.getStackTraceString(e10));
            }
        }
    }

    /* loaded from: classes2.dex */
    public class j implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f26154s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f26155t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.g.c f26156u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.j.a.d f26157v;

        public j(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.d dVar) {
            this.f26154s = str;
            this.f26155t = str2;
            this.f26156u = cVar;
            this.f26157v = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.ironsource.sdk.controller.m mVar = g.this.f26120a;
            if (mVar != null) {
                mVar.a(this.f26154s, this.f26155t, this.f26156u, this.f26157v);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class k implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ JSONObject f26159s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.j.a.d f26160t;

        public k(JSONObject jSONObject, com.ironsource.sdk.j.a.d dVar) {
            this.f26159s = jSONObject;
            this.f26160t = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.ironsource.sdk.controller.m mVar = g.this.f26120a;
            if (mVar != null) {
                mVar.a(this.f26159s, this.f26160t);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class l implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f26162s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f26163t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.g.c f26164u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.j.a.c f26165v;

        public l(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.c cVar2) {
            this.f26162s = str;
            this.f26163t = str2;
            this.f26164u = cVar;
            this.f26165v = cVar2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.ironsource.sdk.controller.m mVar = g.this.f26120a;
            if (mVar != null) {
                mVar.a(this.f26162s, this.f26163t, this.f26164u, this.f26165v);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class m implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f26167s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.j.a.c f26168t;

        public m(String str, com.ironsource.sdk.j.a.c cVar) {
            this.f26167s = str;
            this.f26168t = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.ironsource.sdk.controller.m mVar = g.this.f26120a;
            if (mVar != null) {
                mVar.a(this.f26167s, this.f26168t);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class n implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.g.c f26170s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Map f26171t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.j.a.c f26172u;

        public n(com.ironsource.sdk.g.c cVar, Map map, com.ironsource.sdk.j.a.c cVar2) {
            this.f26170s = cVar;
            this.f26171t = map;
            this.f26172u = cVar2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.ironsource.sdk.a.a aVar = new com.ironsource.sdk.a.a();
            com.ironsource.sdk.g.c cVar = this.f26170s;
            com.ironsource.sdk.a.a a10 = aVar.a("demandsourcename", cVar.f26484a).a("producttype", com.ironsource.sdk.a.e.a(cVar, d.e.Interstitial)).a("isbiddinginstance", Boolean.valueOf(com.ironsource.sdk.a.e.a(cVar)));
            com.ironsource.sdk.service.a aVar2 = com.ironsource.sdk.service.a.f26546a;
            com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.f26005j, a10.a("custom_c", Long.valueOf(com.ironsource.sdk.service.a.c(cVar.f26485b))).f25984a);
            com.ironsource.sdk.controller.m mVar = g.this.f26120a;
            if (mVar != null) {
                mVar.a(cVar, this.f26171t, this.f26172u);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class o implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ JSONObject f26174s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.j.a.c f26175t;

        public o(JSONObject jSONObject, com.ironsource.sdk.j.a.c cVar) {
            this.f26174s = jSONObject;
            this.f26175t = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.ironsource.sdk.controller.m mVar = g.this.f26120a;
            if (mVar != null) {
                mVar.a(this.f26174s, this.f26175t);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class p implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.g.c f26177s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Map f26178t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.j.a.c f26179u;

        public p(com.ironsource.sdk.g.c cVar, Map map, com.ironsource.sdk.j.a.c cVar2) {
            this.f26177s = cVar;
            this.f26178t = map;
            this.f26179u = cVar2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.ironsource.sdk.controller.m mVar = g.this.f26120a;
            if (mVar != null) {
                mVar.b(this.f26177s, this.f26178t, this.f26179u);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class q implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f26181s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f26182t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.g.c f26183u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.j.a.b f26184v;

        public q(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.b bVar) {
            this.f26181s = str;
            this.f26182t = str2;
            this.f26183u = cVar;
            this.f26184v = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.ironsource.sdk.controller.m mVar = g.this.f26120a;
            if (mVar != null) {
                mVar.a(this.f26181s, this.f26182t, this.f26183u, this.f26184v);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class r implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.g.c f26186s;

        public r(com.ironsource.sdk.g.c cVar) {
            this.f26186s = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.ironsource.sdk.controller.m mVar = g.this.f26120a;
            if (mVar != null) {
                mVar.a(this.f26186s);
            }
        }
    }

    public g(Context context, com.ironsource.sdk.controller.c cVar, com.ironsource.sdk.service.d dVar, com.ironsource.sdk.controller.j jVar, com.ironsource.environment.e.a aVar, int i10, JSONObject jSONObject) {
        this.f26126x = aVar;
        this.y = new y(context, cVar, dVar, jVar, i10, jSONObject);
        IronSourceStorageUtils.getNetworkStorageDir(context);
        i iVar = new i(context, cVar, dVar, jVar, i10, jSONObject);
        if (aVar != null) {
            aVar.a(iVar);
        } else {
            Logger.e("g", "mThreadManager = null");
        }
        this.f26123u = new b().start();
    }

    public static x a(g gVar, Context context, com.ironsource.sdk.controller.c cVar, com.ironsource.sdk.service.d dVar, com.ironsource.sdk.controller.j jVar, int i10, JSONObject jSONObject) {
        com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.f25999c);
        x xVar = new x(context, jVar, cVar, gVar, gVar.f26126x, i10, jSONObject);
        String str = xVar.T;
        com.ironsource.environment.e.a aVar = xVar.f26265s;
        JSONObject jSONObject2 = xVar.f26271z;
        com.ironsource.sdk.h.b bVar = new com.ironsource.sdk.h.b(context, com.ironsource.sdk.k.d.a(str, aVar, jSONObject2), new com.ironsource.sdk.h.a(com.ironsource.environment.e.a.a()), new com.ironsource.sdk.h.d(com.ironsource.sdk.k.d.a(str, aVar, jSONObject2).f26533b));
        xVar.f26255h0 = new v(context, dVar);
        xVar.f26253f0 = new com.ironsource.sdk.controller.q(context);
        xVar.f26254g0 = new com.ironsource.sdk.controller.r(context);
        xVar.f26256i0 = new com.ironsource.sdk.controller.k(context);
        com.ironsource.sdk.controller.a aVar2 = new com.ironsource.sdk.controller.a(cVar);
        xVar.f26257j0 = aVar2;
        if (xVar.f26259l0 == null) {
            xVar.f26259l0 = new x.a();
        }
        aVar2.f26093a = xVar.f26259l0;
        xVar.f26258k0 = new com.ironsource.sdk.controller.h(com.ironsource.sdk.k.d.a(str, aVar, jSONObject2).f26533b, bVar);
        return xVar;
    }

    public final void b(com.ironsource.sdk.g.c cVar, d.e eVar) {
        String str = "recoverWebController for product: " + eVar.toString();
        String str2 = this.f26121s;
        Logger.i(str2, str);
        com.ironsource.sdk.a.a aVar = new com.ironsource.sdk.a.a();
        aVar.a("producttype", eVar.toString());
        aVar.a("demandsourcename", cVar.f26484a);
        com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.f25998b, aVar.f25984a);
        y yVar = this.y;
        int i10 = yVar.f26395j;
        int i11 = y.a.f26398c;
        if (i10 != i11) {
            yVar.f26392g++;
            Logger.i(yVar.f26394i, "recoveringStarted - trial number " + yVar.f26392g);
            yVar.f26395j = i11;
        }
        destroy();
        wb.b bVar = new wb.b(this);
        com.ironsource.environment.e.a aVar2 = this.f26126x;
        if (aVar2 != null) {
            aVar2.a(bVar);
        } else {
            Logger.e(str2, "mThreadManager = null");
        }
        this.f26123u = new wb.c(this).start();
    }

    @Override // com.ironsource.sdk.controller.m
    public final d.c c() {
        com.ironsource.sdk.controller.m mVar = this.f26120a;
        return mVar != null ? mVar.c() : d.c.None;
    }

    @Override // com.ironsource.sdk.controller.m
    public final void d() {
        com.ironsource.sdk.controller.m mVar;
        if (d.b.Ready.equals(this.f26122t) && (mVar = this.f26120a) != null) {
            mVar.d();
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public void destroy() {
        String str = this.f26121s;
        Logger.i(str, "destroy controller");
        CountDownTimer countDownTimer = this.f26123u;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f26125w.b();
        this.f26123u = null;
        d dVar = new d();
        com.ironsource.environment.e.a aVar = this.f26126x;
        if (aVar != null) {
            aVar.a(dVar);
        } else {
            Logger.e(str, "mThreadManager = null");
        }
    }

    public final void e(String str) {
        com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.f26000d, new com.ironsource.sdk.a.a().a("callfailreason", str).f25984a);
        this.f26122t = d.b.Loading;
        com.ironsource.environment.e.a aVar = this.f26126x;
        this.f26120a = new com.ironsource.sdk.controller.p(str, aVar);
        com.ironsource.sdk.controller.b bVar = this.f26124v;
        bVar.a();
        bVar.c();
        if (aVar != null) {
            aVar.c(new e());
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final boolean c(String str) {
        if (this.f26120a == null || !d.b.Ready.equals(this.f26122t)) {
            return false;
        }
        return this.f26120a.c(str);
    }

    @Override // com.ironsource.sdk.controller.m
    public final void e() {
        com.ironsource.sdk.controller.m mVar;
        if (!d.b.Ready.equals(this.f26122t) || (mVar = this.f26120a) == null) {
            return;
        }
        mVar.e();
    }

    @Override // wb.a
    public final void b() {
        String str = this.f26121s;
        Logger.i(str, "handleControllerReady ");
        boolean equals = d.c.Web.equals(c());
        y yVar = this.y;
        if (equals) {
            com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.f26001e, new com.ironsource.sdk.a.a().a("generalmessage", String.valueOf(yVar.a())).f25984a);
            com.ironsource.sdk.j.d initListener = IronSourceNetwork.getInitListener();
            if (initListener != null) {
                initListener.onSuccess();
                IronSourceNetwork.setInitListener(null);
            }
        }
        Logger.i(str, "handleReadyState");
        this.f26122t = d.b.Ready;
        CountDownTimer countDownTimer = this.f26123u;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        yVar.a(true);
        com.ironsource.sdk.controller.m mVar = this.f26120a;
        if (mVar != null) {
            mVar.b(yVar.b());
        }
        com.ironsource.sdk.controller.b bVar = this.f26125w;
        bVar.a();
        bVar.c();
        com.ironsource.sdk.controller.m mVar2 = this.f26120a;
        if (mVar2 != null) {
            mVar2.f();
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void b(Context context) {
        com.ironsource.sdk.controller.m mVar;
        if (!d.b.Ready.equals(this.f26122t) || (mVar = this.f26120a) == null) {
            return;
        }
        mVar.b(context);
    }

    @Override // com.ironsource.sdk.controller.m
    public final void b(com.ironsource.sdk.g.c cVar, Map<String, String> map, com.ironsource.sdk.j.a.c cVar2) {
        this.f26125w.a(new p(cVar, map, cVar2));
    }

    @Override // wb.a
    public final void a() {
        Logger.i(this.f26121s, "handleControllerLoaded");
        this.f26122t = d.b.Loaded;
        com.ironsource.sdk.controller.b bVar = this.f26124v;
        bVar.a();
        bVar.c();
    }

    @Override // wb.a
    public final void b(String str) {
        com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.f26017w, new com.ironsource.sdk.a.a().a("generalmessage", str).f25984a);
        CountDownTimer countDownTimer = this.f26123u;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        e(str);
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(Context context) {
        com.ironsource.sdk.controller.m mVar;
        if (!d.b.Ready.equals(this.f26122t) || (mVar = this.f26120a) == null) {
            return;
        }
        mVar.a(context);
    }

    @Override // com.ironsource.sdk.controller.m
    public final void b(JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(com.ironsource.sdk.g.c cVar) {
        this.f26125w.a(new r(cVar));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(com.ironsource.sdk.g.c cVar, Map<String, String> map, com.ironsource.sdk.j.a.b bVar) {
        this.f26125w.a(new a(cVar, map, bVar));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(com.ironsource.sdk.g.c cVar, Map<String, String> map, com.ironsource.sdk.j.a.c cVar2) {
        this.f26125w.a(new n(cVar, map, cVar2));
    }

    public final void a(Runnable runnable) {
        this.f26124v.a(runnable);
    }

    @Override // wb.a
    public final void a(String str) {
        String str2 = this.f26121s;
        Logger.i(str2, "handleControllerFailed ");
        com.ironsource.sdk.a.a aVar = new com.ironsource.sdk.a.a();
        aVar.a("callfailreason", str);
        y yVar = this.y;
        aVar.a("generalmessage", String.valueOf(yVar.a()));
        com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.f26009n, aVar.f25984a);
        yVar.a(false);
        com.ironsource.sdk.j.d initListener = IronSourceNetwork.getInitListener();
        if (initListener != null) {
            initListener.onFail(new com.ironsource.sdk.g.e(1001, str));
            IronSourceNetwork.setInitListener(null);
        }
        if (this.f26123u != null) {
            Logger.i(str2, "cancel timer mControllerReadyTimer");
            this.f26123u.cancel();
        }
        e(str);
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, com.ironsource.sdk.j.a.c cVar) {
        Logger.i(this.f26121s, "load interstitial");
        this.f26125w.a(new m(str, cVar));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.b bVar) {
        if (this.y.a(c(), this.f26122t)) {
            b(cVar, d.e.Banner);
        }
        this.f26125w.a(new q(str, str2, cVar, bVar));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.c cVar2) {
        if (this.y.a(c(), this.f26122t)) {
            b(cVar, d.e.Interstitial);
        }
        this.f26125w.a(new l(str, str2, cVar, cVar2));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.d dVar) {
        if (this.y.a(c(), this.f26122t)) {
            b(cVar, d.e.RewardedVideo);
        }
        this.f26125w.a(new j(str, str2, cVar, dVar));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, com.ironsource.sdk.j.e eVar) {
        this.f26125w.a(new h(str, str2, eVar));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, Map<String, String> map, com.ironsource.sdk.j.e eVar) {
        this.f26125w.a(new f(str, str2, map, eVar));
    }

    @Override // com.ironsource.sdk.controller.m
    @Deprecated
    public final void f() {
    }

    @Override // com.ironsource.sdk.controller.m
    public final void g() {
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(Map<String, String> map, com.ironsource.sdk.j.e eVar) {
        this.f26125w.a(new RunnableC0336g(map, eVar));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(JSONObject jSONObject) {
        this.f26125w.a(new c(jSONObject));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(JSONObject jSONObject, com.ironsource.sdk.j.a.c cVar) {
        this.f26125w.a(new o(jSONObject, cVar));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(JSONObject jSONObject, com.ironsource.sdk.j.a.d dVar) {
        this.f26125w.a(new k(jSONObject, dVar));
    }
}
