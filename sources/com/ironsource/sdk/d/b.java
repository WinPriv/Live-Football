package com.ironsource.sdk.d;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.av;
import com.ironsource.sdk.controller.FeaturesManager;
import com.ironsource.sdk.g.d;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b implements com.ironsource.sdk.d.c, com.ironsource.sdk.e, com.ironsource.sdk.f, com.ironsource.sdk.j.a.a, com.ironsource.sdk.j.a.b, com.ironsource.sdk.j.a.c, com.ironsource.sdk.j.a.d {

    /* renamed from: k, reason: collision with root package name */
    public static b f26401k;

    /* renamed from: a, reason: collision with root package name */
    public com.ironsource.sdk.controller.g f26402a;

    /* renamed from: b, reason: collision with root package name */
    public com.ironsource.sdk.j.e f26403b;

    /* renamed from: c, reason: collision with root package name */
    public String f26404c;

    /* renamed from: d, reason: collision with root package name */
    public String f26405d;

    /* renamed from: e, reason: collision with root package name */
    public com.ironsource.sdk.controller.j f26406e;
    public com.ironsource.sdk.service.d f;

    /* renamed from: g, reason: collision with root package name */
    public com.ironsource.sdk.service.c f26407g;

    /* renamed from: i, reason: collision with root package name */
    public com.ironsource.sdk.controller.c f26409i;

    /* renamed from: h, reason: collision with root package name */
    public boolean f26408h = false;

    /* renamed from: j, reason: collision with root package name */
    public final FeaturesManager f26410j = FeaturesManager.getInstance();

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Map f26411s;

        public a(Map map) {
            this.f26411s = map;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            bVar.f26402a.a(this.f26411s, bVar.f26403b);
        }
    }

    /* renamed from: com.ironsource.sdk.d.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class RunnableC0340b implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f26413s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f26414t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.j.e f26415u;

        public RunnableC0340b(String str, String str2, com.ironsource.sdk.j.e eVar) {
            this.f26413s = str;
            this.f26414t = str2;
            this.f26415u = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b.this.f26402a.a(this.f26413s, this.f26414t, this.f26415u);
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.j.e f26417s;

        public c(com.ironsource.sdk.j.e eVar) {
            this.f26417s = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            bVar.f26402a.a(bVar.f26404c, bVar.f26405d, this.f26417s);
        }
    }

    /* loaded from: classes2.dex */
    public class d implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f26419s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f26420t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.g.c f26421u;

        public d(String str, String str2, com.ironsource.sdk.g.c cVar) {
            this.f26419s = str;
            this.f26420t = str2;
            this.f26421u = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            bVar.f26402a.a(this.f26419s, this.f26420t, this.f26421u, (com.ironsource.sdk.j.a.c) bVar);
        }
    }

    /* loaded from: classes2.dex */
    public class e implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f26423s;

        public e(String str) {
            this.f26423s = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            bVar.f26402a.a(this.f26423s, bVar);
        }
    }

    /* loaded from: classes2.dex */
    public class f implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f26425s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f26426t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.g.c f26427u;

        public f(String str, String str2, com.ironsource.sdk.g.c cVar) {
            this.f26425s = str;
            this.f26426t = str2;
            this.f26427u = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            bVar.f26402a.a(this.f26425s, this.f26426t, this.f26427u, (com.ironsource.sdk.j.a.d) bVar);
        }
    }

    /* loaded from: classes2.dex */
    public class g implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ JSONObject f26429s;

        public g(JSONObject jSONObject) {
            this.f26429s = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            bVar.f26402a.a(this.f26429s, (com.ironsource.sdk.j.a.c) bVar);
        }
    }

    /* loaded from: classes2.dex */
    public class h implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ JSONObject f26431s;

        public h(JSONObject jSONObject) {
            this.f26431s = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b.this.f26402a.a(this.f26431s);
        }
    }

    /* loaded from: classes2.dex */
    public class i implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.b f26433s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Map f26434t;

        public i(com.ironsource.sdk.b bVar, Map map) {
            this.f26433s = bVar;
            this.f26434t = map;
        }

        @Override // java.lang.Runnable
        public final void run() {
            d.e eVar;
            com.ironsource.sdk.b bVar = this.f26433s;
            if (bVar.a()) {
                eVar = d.e.Banner;
            } else {
                eVar = d.e.Interstitial;
            }
            b bVar2 = b.this;
            com.ironsource.sdk.g.c a10 = bVar2.f26406e.a(eVar, bVar);
            com.ironsource.sdk.a.a aVar = new com.ironsource.sdk.a.a();
            com.ironsource.sdk.a.a a11 = aVar.a("isbiddinginstance", Boolean.valueOf(bVar.f26023d)).a("isoneflow", Boolean.valueOf(bVar.f26026h)).a("demandsourcename", bVar.f26022c).a("producttype", com.ironsource.sdk.d.a(bVar));
            com.ironsource.sdk.service.a aVar2 = com.ironsource.sdk.service.a.f26546a;
            a11.a("custom_c", Long.valueOf(com.ironsource.sdk.service.a.c(bVar.f26021b)));
            com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.f26003h, aVar.f25984a);
            d.e eVar2 = d.e.Banner;
            Map<String, String> map = this.f26434t;
            if (eVar == eVar2) {
                bVar2.f26402a.a(bVar2.f26404c, bVar2.f26405d, a10, (com.ironsource.sdk.j.a.b) bVar2);
                bVar2.f26402a.a(a10, map, (com.ironsource.sdk.j.a.b) bVar2);
            } else {
                bVar2.f26402a.a(bVar2.f26404c, bVar2.f26405d, a10, (com.ironsource.sdk.j.a.c) bVar2);
                bVar2.f26402a.a(a10, map, (com.ironsource.sdk.j.a.c) bVar2);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class j implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.g.c f26436s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Map f26437t;

        public j(com.ironsource.sdk.g.c cVar, Map map) {
            this.f26436s = cVar;
            this.f26437t = map;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            bVar.f26402a.b(this.f26436s, this.f26437t, bVar);
        }
    }

    /* loaded from: classes2.dex */
    public class k implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.b f26439s;

        public k(com.ironsource.sdk.b bVar) {
            this.f26439s = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            com.ironsource.sdk.controller.j jVar = bVar.f26406e;
            d.e eVar = d.e.Banner;
            com.ironsource.sdk.b bVar2 = this.f26439s;
            com.ironsource.sdk.g.c a10 = jVar.a(eVar, bVar2);
            com.ironsource.sdk.a.a aVar = new com.ironsource.sdk.a.a();
            aVar.a("isbiddinginstance", Boolean.valueOf(bVar2.f26023d)).a("demandsourcename", bVar2.f26022c).a("producttype", com.ironsource.sdk.d.a(bVar2));
            com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.f26008m, aVar.f25984a);
            bVar.f26402a.a(a10);
        }
    }

    /* loaded from: classes2.dex */
    public class l implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ JSONObject f26441s;

        public l(JSONObject jSONObject) {
            this.f26441s = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            bVar.f26402a.a(this.f26441s, (com.ironsource.sdk.j.a.d) bVar);
        }
    }

    /* loaded from: classes2.dex */
    public class m implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f26443s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f26444t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Map f26445u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.j.e f26446v;

        public m(String str, String str2, Map map, com.ironsource.sdk.j.e eVar) {
            this.f26443s = str;
            this.f26444t = str2;
            this.f26445u = map;
            this.f26446v = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b.this.f26402a.a(this.f26443s, this.f26444t, this.f26445u, this.f26446v);
        }
    }

    /* loaded from: classes2.dex */
    public class n implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Map f26448s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.j.e f26449t;

        public n(Map map, com.ironsource.sdk.j.e eVar) {
            this.f26448s = map;
            this.f26449t = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            bVar.f26402a.a(bVar.f26404c, bVar.f26405d, this.f26448s, this.f26449t);
        }
    }

    public b(Context context) {
        e(context);
    }

    public static synchronized b a(Context context) {
        b a10;
        synchronized (b.class) {
            a10 = a(context, 0);
        }
        return a10;
    }

    public static com.ironsource.sdk.j.f b(com.ironsource.sdk.g.c cVar) {
        return (com.ironsource.sdk.j.f) cVar.f26489g;
    }

    public static com.ironsource.sdk.j.c d(com.ironsource.sdk.g.c cVar) {
        if (cVar == null) {
            return null;
        }
        return (com.ironsource.sdk.j.c) cVar.f26489g;
    }

    public static com.ironsource.sdk.j.b g(com.ironsource.sdk.g.c cVar) {
        return (com.ironsource.sdk.j.b) cVar.f26489g;
    }

    public final void c(Context context, JSONObject jSONObject) {
        boolean optBoolean = jSONObject.optBoolean("enableLifeCycleListeners", false);
        this.f26408h = optBoolean;
        if (optBoolean) {
            try {
                ((Application) context).registerActivityLifecycleCallbacks(new com.ironsource.sdk.d.a(this));
            } catch (Throwable th) {
                com.ironsource.sdk.a.a aVar = new com.ironsource.sdk.a.a();
                aVar.a("generalmessage", th.getMessage());
                com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.f26013s, aVar.f25984a);
            }
        }
    }

    public final void e(Context context) {
        FeaturesManager featuresManager = this.f26410j;
        try {
            JSONObject networkConfiguration = SDKUtils.getNetworkConfiguration();
            com.ironsource.sdk.utils.b.a(context);
            IronSourceStorageUtils.initializeCacheDirectory(context, new com.ironsource.sdk.h.e(SDKUtils.getNetworkConfiguration().optJSONObject("storage")));
            com.ironsource.sdk.utils.b.a().a(SDKUtils.getSDKVersion());
            com.ironsource.sdk.service.d a10 = com.ironsource.sdk.service.d.a();
            a10.b();
            a10.a(context, this.f26404c, this.f26405d);
            this.f = a10;
            this.f26406e = new com.ironsource.sdk.controller.j();
            com.ironsource.sdk.controller.c cVar = new com.ironsource.sdk.controller.c();
            this.f26409i = cVar;
            if (context instanceof Activity) {
                cVar.a((Activity) context);
            }
            int debugMode = featuresManager.getDebugMode();
            this.f26402a = new com.ironsource.sdk.controller.g(context, this.f26409i, this.f, this.f26406e, com.ironsource.environment.e.a.f24660a, debugMode, featuresManager.getDataManagerConfig());
            Logger.enableLogging(debugMode);
            Logger.i("IronSourceAdsPublisherAgent", "C'tor");
            c(context, networkConfiguration);
            this.f26407g = new com.ironsource.sdk.service.c();
            com.ironsource.mediationsdk.adunit.a.a.a("sdkv", "5.121");
            this.f26407g.a();
            this.f26407g.a(context);
            this.f26407g.b();
            this.f26407g.c();
            this.f26407g.b(context);
            this.f26407g.d();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void f(com.ironsource.sdk.b bVar, Map<String, String> map) {
        Logger.d("IronSourceAdsPublisherAgent", "loadOnNewInstance " + bVar.f26021b);
        this.f26402a.a(new i(bVar, map));
    }

    public final com.ironsource.sdk.g.c h(d.e eVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f26406e.a(eVar, str);
    }

    public b(String str, String str2, Context context) {
        this.f26404c = str;
        this.f26405d = str2;
        e(context);
    }

    public static synchronized b a(Context context, int i10) {
        b bVar;
        synchronized (b.class) {
            Logger.i("IronSourceAdsPublisherAgent", "getInstance()");
            if (f26401k == null) {
                f26401k = new b(context);
            }
            bVar = f26401k;
        }
        return bVar;
    }

    @Override // com.ironsource.sdk.e, com.ironsource.sdk.f
    public final void b(Activity activity) {
        if (this.f26408h) {
            return;
        }
        d(activity);
    }

    @Override // com.ironsource.sdk.e, com.ironsource.sdk.f
    public final void c(Activity activity) {
        if (this.f26408h) {
            return;
        }
        e(activity);
    }

    @Override // com.ironsource.sdk.d.c
    public final void d(Activity activity) {
        try {
            this.f26402a.e();
            this.f26402a.b(activity);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static synchronized com.ironsource.sdk.e a(String str, String str2, Context context) {
        b bVar;
        synchronized (b.class) {
            if (f26401k == null) {
                com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.f25997a);
                f26401k = new b(str, str2, context);
            } else {
                com.ironsource.sdk.service.d.a().b(str);
                com.ironsource.sdk.service.d.a().a(str2);
            }
            bVar = f26401k;
        }
        return bVar;
    }

    @Override // com.ironsource.sdk.j.a.a, com.ironsource.sdk.j.a.b, com.ironsource.sdk.j.a.c, com.ironsource.sdk.j.a.d
    public final void b(d.e eVar, String str) {
        com.ironsource.sdk.j.b g6;
        com.ironsource.sdk.g.c h10 = h(eVar, str);
        if (h10 != null) {
            if (eVar == d.e.RewardedVideo) {
                com.ironsource.sdk.j.f b10 = b(h10);
                if (b10 != null) {
                    b10.onRVAdClicked();
                    return;
                }
                return;
            }
            if (eVar == d.e.Interstitial) {
                com.ironsource.sdk.j.c d10 = d(h10);
                if (d10 != null) {
                    d10.onInterstitialClick();
                    return;
                }
                return;
            }
            if (eVar != d.e.Banner || (g6 = g(h10)) == null) {
                return;
            }
            g6.onBannerClick();
        }
    }

    @Override // com.ironsource.sdk.j.a.a, com.ironsource.sdk.j.a.b, com.ironsource.sdk.j.a.c, com.ironsource.sdk.j.a.d
    public final void c(d.e eVar, String str) {
        com.ironsource.sdk.j.f b10;
        com.ironsource.sdk.g.c h10 = h(eVar, str);
        if (h10 != null) {
            if (eVar == d.e.Interstitial) {
                com.ironsource.sdk.j.c d10 = d(h10);
                if (d10 != null) {
                    d10.onInterstitialOpen();
                    return;
                }
                return;
            }
            if (eVar != d.e.RewardedVideo || (b10 = b(h10)) == null) {
                return;
            }
            b10.onRVAdOpened();
        }
    }

    @Override // com.ironsource.sdk.j.a.c
    public final void d(String str) {
        com.ironsource.sdk.j.c d10;
        com.ironsource.sdk.g.c h10 = h(d.e.Interstitial, str);
        if (h10 == null || (d10 = d(h10)) == null) {
            return;
        }
        d10.onInterstitialShowSuccess();
    }

    @Override // com.ironsource.sdk.d.c
    public final void e(Activity activity) {
        this.f26409i.a(activity);
        this.f26402a.d();
        this.f26402a.a(activity);
    }

    @Override // com.ironsource.sdk.e
    public final void a(Activity activity) {
        try {
            Logger.i("IronSourceAdsPublisherAgent", "release()");
            com.ironsource.sdk.utils.a.a();
            this.f26409i.b();
            this.f26402a.b(activity);
            this.f26402a.destroy();
            this.f26402a = null;
        } catch (Exception unused) {
        }
        f26401k = null;
    }

    @Override // com.ironsource.sdk.j.a.d
    public final void b(String str) {
        com.ironsource.sdk.j.f b10;
        com.ironsource.sdk.g.c h10 = h(d.e.RewardedVideo, str);
        if (h10 == null || (b10 = b(h10)) == null) {
            return;
        }
        b10.onRVNoMoreOffers();
    }

    @Override // com.ironsource.sdk.j.a.c
    public final void c(String str) {
        d.e eVar = d.e.Interstitial;
        com.ironsource.sdk.g.c h10 = h(eVar, str);
        com.ironsource.sdk.a.a a10 = new com.ironsource.sdk.a.a().a("demandsourcename", str);
        if (h10 != null) {
            com.ironsource.sdk.a.a a11 = a10.a("producttype", com.ironsource.sdk.a.e.a(h10, eVar)).a("isbiddinginstance", Boolean.valueOf(com.ironsource.sdk.a.e.a(h10)));
            com.ironsource.sdk.service.a aVar = com.ironsource.sdk.service.a.f26546a;
            a11.a("custom_c", Long.valueOf(com.ironsource.sdk.service.a.c(h10.f26485b)));
            com.ironsource.sdk.service.a.b(h10.f26485b);
            com.ironsource.sdk.j.c d10 = d(h10);
            if (d10 != null) {
                d10.onInterstitialLoadSuccess();
            }
        }
        com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.f26007l, a10.f25984a);
    }

    @Override // com.ironsource.sdk.j.a.b
    public final void d(String str, String str2) {
        com.ironsource.sdk.j.b g6;
        com.ironsource.sdk.g.c h10 = h(d.e.Banner, str);
        if (h10 == null || (g6 = g(h10)) == null) {
            return;
        }
        g6.onBannerLoadFail(str2);
    }

    @Override // com.ironsource.sdk.e
    public final void a(Activity activity, com.ironsource.sdk.b bVar, Map<String, String> map) {
        this.f26409i.a(activity);
        long currentTimeMillis = System.currentTimeMillis();
        map.put("loadStartTime", String.valueOf(currentTimeMillis));
        com.ironsource.sdk.service.a aVar = com.ironsource.sdk.service.a.f26546a;
        com.ironsource.sdk.service.a.a(bVar.f26021b, currentTimeMillis);
        com.ironsource.sdk.a.a aVar2 = new com.ironsource.sdk.a.a();
        aVar2.a("isbiddinginstance", Boolean.valueOf(bVar.f26023d)).a("isoneflow", Boolean.valueOf(bVar.f26026h)).a("demandsourcename", bVar.f26022c).a("producttype", com.ironsource.sdk.d.a(bVar)).a("custom_c", Long.valueOf(currentTimeMillis));
        com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.f, aVar2.f25984a);
        Logger.d("IronSourceAdsPublisherAgent", "loadAd " + bVar.f26021b);
        if (!(bVar.f26023d || bVar.f26026h)) {
            f(bVar, map);
            return;
        }
        try {
            map.put("adm", SDKUtils.decodeString(map.get("adm")));
        } catch (Exception e10) {
            com.ironsource.sdk.a.a a10 = new com.ironsource.sdk.a.a().a("callfailreason", e10.getMessage()).a("isbiddinginstance", Boolean.valueOf(bVar.f26023d)).a("isoneflow", Boolean.valueOf(bVar.f26026h)).a("demandsourcename", bVar.f26022c).a("producttype", com.ironsource.sdk.d.a(bVar));
            com.ironsource.sdk.service.a aVar3 = com.ironsource.sdk.service.a.f26546a;
            com.ironsource.sdk.a.a a11 = a10.a("custom_c", Long.valueOf(com.ironsource.sdk.service.a.c(bVar.f26021b)));
            com.ironsource.sdk.service.a.b(bVar.f26021b);
            com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.f26006k, a11.f25984a);
            e10.printStackTrace();
            Logger.d("IronSourceAdsPublisherAgent", "loadInAppBiddingAd failed decoding  ADM " + e10.getMessage());
        }
        f(bVar, map);
    }

    @Override // com.ironsource.sdk.j.a.c
    public final void b(String str, int i10) {
        com.ironsource.sdk.g.c h10 = h(d.e.Interstitial, str);
        com.ironsource.sdk.j.c d10 = d(h10);
        if (h10 == null || d10 == null) {
            return;
        }
        d10.onInterstitialAdRewarded(str, i10);
    }

    @Override // com.ironsource.sdk.j.a.c
    public final void c(String str, String str2) {
        com.ironsource.sdk.j.c d10;
        com.ironsource.sdk.g.c h10 = h(d.e.Interstitial, str);
        if (h10 == null || (d10 = d(h10)) == null) {
            return;
        }
        d10.onInterstitialShowFailed(str2);
    }

    @Override // com.ironsource.sdk.f
    public final void d(JSONObject jSONObject) {
        this.f26402a.a(new g(jSONObject));
    }

    @Override // com.ironsource.sdk.e, com.ironsource.sdk.f
    public final void a(Activity activity, Map<String, String> map) {
        if (activity != null) {
            this.f26409i.a(activity);
        }
        this.f26402a.a(new a(map));
    }

    @Override // com.ironsource.sdk.j.a.c
    public final void b(String str, String str2) {
        d.e eVar = d.e.Interstitial;
        com.ironsource.sdk.g.c h10 = h(eVar, str);
        com.ironsource.sdk.a.a aVar = new com.ironsource.sdk.a.a();
        aVar.a("callfailreason", str2).a("demandsourcename", str);
        if (h10 != null) {
            com.ironsource.sdk.a.a a10 = aVar.a("producttype", com.ironsource.sdk.a.e.a(h10, eVar)).a("generalmessage", h10.f26488e == 2 ? com.ironsource.sdk.f.b.f26466a : com.ironsource.sdk.f.b.f26467b).a("isbiddinginstance", Boolean.valueOf(com.ironsource.sdk.a.e.a(h10)));
            com.ironsource.sdk.service.a aVar2 = com.ironsource.sdk.service.a.f26546a;
            a10.a("custom_c", Long.valueOf(com.ironsource.sdk.service.a.c(h10.f26485b)));
            com.ironsource.sdk.service.a.b(h10.f26485b);
            com.ironsource.sdk.j.c d10 = d(h10);
            if (d10 != null) {
                d10.onInterstitialLoadFailed(str2);
            }
        }
        com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.f26002g, aVar.f25984a);
    }

    @Override // com.ironsource.sdk.f
    public final void c(JSONObject jSONObject) {
        String optString = jSONObject.optString("demandSourceName");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.f26402a.a(new e(optString));
    }

    @Override // com.ironsource.sdk.e
    public final void a(com.ironsource.sdk.b bVar) {
        Logger.d("IronSourceAdsPublisherAgent", "destroyInstance " + bVar.f26021b);
        this.f26402a.a(new k(bVar));
    }

    @Override // com.ironsource.sdk.f
    public final void b(JSONObject jSONObject) {
        this.f26402a.a(new l(jSONObject));
    }

    @Override // com.ironsource.sdk.e
    public final void a(com.ironsource.sdk.b bVar, Map<String, String> map) {
        Logger.i("IronSourceAdsPublisherAgent", "showAd " + bVar.f26021b);
        com.ironsource.sdk.g.c a10 = this.f26406e.a(d.e.Interstitial, bVar.f26021b);
        if (a10 == null) {
            return;
        }
        this.f26402a.a(new j(a10, map));
    }

    @Override // com.ironsource.sdk.e
    public final boolean b(com.ironsource.sdk.b bVar) {
        Logger.d("IronSourceAdsPublisherAgent", "isAdAvailable " + bVar.f26021b);
        com.ironsource.sdk.g.c a10 = this.f26406e.a(d.e.Interstitial, bVar.f26021b);
        if (a10 == null) {
            return false;
        }
        return a10.f;
    }

    @Override // com.ironsource.sdk.j.a.a, com.ironsource.sdk.j.a.b, com.ironsource.sdk.j.a.c, com.ironsource.sdk.j.a.d
    public final void a(d.e eVar, String str) {
        com.ironsource.sdk.j.c d10;
        com.ironsource.sdk.g.c h10 = h(eVar, str);
        if (h10 != null) {
            if (eVar == d.e.RewardedVideo) {
                com.ironsource.sdk.j.f b10 = b(h10);
                if (b10 != null) {
                    b10.onRVAdClosed();
                    return;
                }
                return;
            }
            if (eVar != d.e.Interstitial || (d10 = d(h10)) == null) {
                return;
            }
            d10.onInterstitialClose();
        }
    }

    @Override // com.ironsource.sdk.j.a.a, com.ironsource.sdk.j.a.b, com.ironsource.sdk.j.a.c, com.ironsource.sdk.j.a.d
    public final void a(d.e eVar, String str, com.ironsource.sdk.g.a aVar) {
        com.ironsource.sdk.j.b g6;
        com.ironsource.sdk.g.c h10 = h(eVar, str);
        if (h10 != null) {
            h10.a(2);
            if (eVar == d.e.RewardedVideo) {
                com.ironsource.sdk.j.f b10 = b(h10);
                if (b10 != null) {
                    b10.onRVInitSuccess(aVar);
                    return;
                }
                return;
            }
            if (eVar == d.e.Interstitial) {
                com.ironsource.sdk.j.c d10 = d(h10);
                if (d10 != null) {
                    d10.onInterstitialInitSuccess();
                    return;
                }
                return;
            }
            if (eVar != d.e.Banner || (g6 = g(h10)) == null) {
                return;
            }
            g6.onBannerInitSuccess();
        }
    }

    @Override // com.ironsource.sdk.j.a.a, com.ironsource.sdk.j.a.b, com.ironsource.sdk.j.a.c, com.ironsource.sdk.j.a.d
    public final void a(d.e eVar, String str, String str2) {
        com.ironsource.sdk.j.b g6;
        com.ironsource.sdk.g.c h10 = h(eVar, str);
        com.ironsource.sdk.a.a a10 = new com.ironsource.sdk.a.a().a("demandsourcename", str).a("producttype", eVar).a("callfailreason", str2);
        if (h10 != null) {
            com.ironsource.sdk.service.a aVar = com.ironsource.sdk.service.a.f26546a;
            a10.a("custom_c", Long.valueOf(com.ironsource.sdk.service.a.c(h10.f26485b)));
            a10.a("isbiddinginstance", Boolean.valueOf(com.ironsource.sdk.a.e.a(h10)));
            com.ironsource.sdk.service.a.b(h10.f26485b);
            h10.a(3);
            if (eVar == d.e.RewardedVideo) {
                com.ironsource.sdk.j.f b10 = b(h10);
                if (b10 != null) {
                    b10.onRVInitFail(str2);
                }
            } else if (eVar == d.e.Interstitial) {
                com.ironsource.sdk.j.c d10 = d(h10);
                if (d10 != null) {
                    d10.onInterstitialInitFailed(str2);
                }
            } else if (eVar == d.e.Banner && (g6 = g(h10)) != null) {
                g6.onBannerLoadFail(str2);
            }
        }
        com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.f26004i, a10.f25984a);
    }

    @Override // com.ironsource.sdk.j.a.a, com.ironsource.sdk.j.a.b, com.ironsource.sdk.j.a.c, com.ironsource.sdk.j.a.d
    public final void a(d.e eVar, String str, String str2, JSONObject jSONObject) {
        com.ironsource.sdk.j.b g6;
        com.ironsource.sdk.g.c h10 = h(eVar, str);
        if (h10 == null || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            Logger.i("IronSourceAdsPublisherAgent", "Received Event Notification: " + str2 + " for demand source: " + h10.f26484a);
            if (eVar == d.e.Interstitial) {
                com.ironsource.sdk.j.c d10 = d(h10);
                if (d10 != null) {
                    jSONObject.put("demandSourceName", str);
                    d10.onInterstitialEventNotificationReceived(str2, jSONObject);
                    return;
                }
                return;
            }
            if (eVar == d.e.RewardedVideo) {
                com.ironsource.sdk.j.f b10 = b(h10);
                if (b10 != null) {
                    jSONObject.put("demandSourceName", str);
                    b10.onRVEventNotificationReceived(str2, jSONObject);
                    return;
                }
                return;
            }
            if (eVar != d.e.Banner || (g6 = g(h10)) == null) {
                return;
            }
            jSONObject.put("demandSourceName", str);
            if (str2.equalsIgnoreCase("impressions")) {
                g6.onBannerShowSuccess();
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.ironsource.sdk.e
    public final void a(com.ironsource.sdk.j.e eVar) {
        this.f26402a.a(new c(eVar));
    }

    @Override // com.ironsource.sdk.j.a.d
    public final void a(String str, int i10) {
        com.ironsource.sdk.j.f b10;
        com.ironsource.sdk.g.c h10 = h(d.e.RewardedVideo, str);
        if (h10 == null || (b10 = b(h10)) == null) {
            return;
        }
        b10.onRVAdCredited(i10);
    }

    @Override // com.ironsource.sdk.j.a.b
    public final void a(String str, com.ironsource.sdk.c.a aVar) {
        com.ironsource.sdk.j.b g6;
        com.ironsource.sdk.g.c h10 = h(d.e.Banner, str);
        if (h10 == null || (g6 = g(h10)) == null) {
            return;
        }
        g6.onBannerLoadSuccess(h10.f26490h, aVar);
    }

    @Override // com.ironsource.sdk.j.a.d
    public final void a(String str, String str2) {
        com.ironsource.sdk.j.f b10;
        com.ironsource.sdk.g.c h10 = h(d.e.RewardedVideo, str);
        if (h10 == null || (b10 = b(h10)) == null) {
            return;
        }
        b10.onRVShowFail(str2);
    }

    @Override // com.ironsource.sdk.f
    public final void a(String str, String str2, int i10) {
        d.e productType;
        com.ironsource.sdk.g.c a10;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (productType = SDKUtils.getProductType(str)) == null || (a10 = this.f26406e.a(productType, str2)) == null) {
            return;
        }
        a10.f26486c = i10;
    }

    @Override // com.ironsource.sdk.f
    public final void a(String str, String str2, com.ironsource.sdk.j.e eVar) {
        this.f26404c = str;
        this.f26405d = str2;
        this.f26402a.a(new RunnableC0340b(str, str2, eVar));
    }

    @Override // com.ironsource.sdk.f
    public final void a(String str, String str2, String str3, Map<String, String> map, com.ironsource.sdk.j.c cVar) {
        this.f26404c = str;
        this.f26405d = str2;
        this.f26402a.a(new d(str, str2, this.f26406e.a(d.e.Interstitial, str3, map, cVar)));
    }

    @Override // com.ironsource.sdk.f
    public final void a(String str, String str2, String str3, Map<String, String> map, com.ironsource.sdk.j.f fVar) {
        this.f26404c = str;
        this.f26405d = str2;
        this.f26402a.a(new f(str, str2, this.f26406e.a(d.e.RewardedVideo, str3, map, fVar)));
    }

    @Override // com.ironsource.sdk.f
    public final void a(String str, String str2, Map<String, String> map, com.ironsource.sdk.j.e eVar) {
        this.f26404c = str;
        this.f26405d = str2;
        this.f26403b = eVar;
        this.f26402a.a(new m(str, str2, map, eVar));
    }

    @Override // com.ironsource.sdk.e
    public final void a(Map<String, String> map, com.ironsource.sdk.j.e eVar) {
        this.f26403b = eVar;
        this.f26402a.a(new n(map, eVar));
    }

    @Override // com.ironsource.sdk.e, com.ironsource.sdk.f
    public final void a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("gdprConsentStatus")) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(av.O, Boolean.parseBoolean(jSONObject.getString("gdprConsentStatus")));
                this.f.a(jSONObject2);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        this.f26402a.a(new h(jSONObject));
    }

    @Override // com.ironsource.sdk.f
    public final boolean a(String str) {
        return this.f26402a.c(str);
    }
}
