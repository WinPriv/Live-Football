package com.applovin.impl.adview.activity.b;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.i;
import com.applovin.impl.adview.m;
import com.applovin.impl.adview.n;
import com.applovin.impl.adview.o;
import com.applovin.impl.adview.u;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.b.b;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.v;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.AppKilledService;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.r;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class a implements AppLovinBroadcastManager.Receiver, b.a {
    private long B;
    private boolean C;
    private final l F;

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.ad.e f16982a;

    /* renamed from: b, reason: collision with root package name */
    protected final p f16983b;

    /* renamed from: c, reason: collision with root package name */
    protected final y f16984c;

    /* renamed from: d, reason: collision with root package name */
    protected final com.applovin.impl.sdk.d.d f16985d;

    /* renamed from: e, reason: collision with root package name */
    protected Activity f16986e;
    protected AppLovinAdView f;

    /* renamed from: g, reason: collision with root package name */
    protected u f16987g;

    /* renamed from: h, reason: collision with root package name */
    protected final m f16988h;

    /* renamed from: i, reason: collision with root package name */
    protected final m f16989i;

    /* renamed from: l, reason: collision with root package name */
    protected boolean f16992l;

    /* renamed from: p, reason: collision with root package name */
    protected boolean f16995p;

    /* renamed from: q, reason: collision with root package name */
    protected AppLovinAdClickListener f16996q;

    /* renamed from: r, reason: collision with root package name */
    protected AppLovinAdDisplayListener f16997r;

    /* renamed from: s, reason: collision with root package name */
    protected AppLovinAdVideoPlaybackListener f16998s;

    /* renamed from: t, reason: collision with root package name */
    protected final com.applovin.impl.sdk.b.b f16999t;

    /* renamed from: u, reason: collision with root package name */
    protected com.applovin.impl.sdk.utils.p f17000u;

    /* renamed from: w, reason: collision with root package name */
    private final com.applovin.impl.sdk.utils.a f17002w;

    /* renamed from: x, reason: collision with root package name */
    private final AppLovinBroadcastManager.Receiver f17003x;
    private final k.a y;

    /* renamed from: v, reason: collision with root package name */
    private final Handler f17001v = new Handler(Looper.getMainLooper());

    /* renamed from: j, reason: collision with root package name */
    protected final long f16990j = SystemClock.elapsedRealtime();

    /* renamed from: z, reason: collision with root package name */
    private final AtomicBoolean f17004z = new AtomicBoolean();
    private final AtomicBoolean A = new AtomicBoolean();

    /* renamed from: k, reason: collision with root package name */
    protected long f16991k = -1;
    private int D = 0;
    private final ArrayList<Long> E = new ArrayList<>();

    /* renamed from: m, reason: collision with root package name */
    protected int f16993m = 0;

    /* renamed from: n, reason: collision with root package name */
    protected int f16994n = 0;
    protected int o = k.f18988a;
    private boolean G = false;

    /* renamed from: com.applovin.impl.adview.activity.b.a$9, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass9 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ m f17018a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f17019b;

        public AnonymousClass9(m mVar, Runnable runnable) {
            this.f17018a = mVar;
            this.f17019b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.a.9.1
                @Override // java.lang.Runnable
                public void run() {
                    r.a(AnonymousClass9.this.f17018a, 400L, new Runnable() { // from class: com.applovin.impl.adview.activity.b.a.9.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            AnonymousClass9.this.f17018a.bringToFront();
                            AnonymousClass9.this.f17019b.run();
                        }
                    });
                }
            });
        }
    }

    /* renamed from: com.applovin.impl.adview.activity.b.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0190a {
        void a(a aVar);

        void a(String str, Throwable th);
    }

    /* loaded from: classes.dex */
    public class b implements View.OnClickListener, AppLovinAdClickListener {
        private b() {
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            y yVar = a.this.f16984c;
            if (y.a()) {
                a.this.f16984c.b("AppLovinFullscreenActivity", "Clicking through graphic");
            }
            com.applovin.impl.sdk.utils.k.a(a.this.f16996q, appLovinAd);
            a.this.f16985d.b();
            a.this.f16994n++;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = a.this;
            if (view == aVar.f16988h && ((Boolean) aVar.f16983b.a(com.applovin.impl.sdk.c.b.cB)).booleanValue()) {
                a.c(a.this);
                if (a.this.f16982a.V()) {
                    a.this.b("javascript:al_onCloseButtonTapped(" + a.this.D + "," + a.this.f16993m + "," + a.this.f16994n + ");");
                }
                List<Integer> u2 = a.this.f16982a.u();
                y yVar = a.this.f16984c;
                if (y.a()) {
                    a.this.f16984c.b("AppLovinFullscreenActivity", "Handling close button tap " + a.this.D + " with multi close delay: " + u2);
                }
                if (u2 != null && u2.size() > a.this.D) {
                    a.this.E.add(Long.valueOf(SystemClock.elapsedRealtime() - a.this.f16991k));
                    List<i.a> w10 = a.this.f16982a.w();
                    if (w10 != null && w10.size() > a.this.D) {
                        a aVar2 = a.this;
                        aVar2.f16988h.a(w10.get(aVar2.D));
                    }
                    y yVar2 = a.this.f16984c;
                    if (y.a()) {
                        a.this.f16984c.b("AppLovinFullscreenActivity", "Scheduling next close button with delay: " + u2.get(a.this.D));
                    }
                    a.this.f16988h.setVisibility(8);
                    a aVar3 = a.this;
                    aVar3.a(aVar3.f16988h, u2.get(aVar3.D).intValue(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.a.b.1
                        @Override // java.lang.Runnable
                        public void run() {
                            a.this.f16991k = SystemClock.elapsedRealtime();
                        }
                    });
                    return;
                }
                a.this.h();
                return;
            }
            y yVar3 = a.this.f16984c;
            if (y.a()) {
                a.this.f16984c.e("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }
    }

    public a(final com.applovin.impl.sdk.ad.e eVar, Activity activity, Map<String, Object> map, final p pVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f16982a = eVar;
        this.f16983b = pVar;
        this.f16984c = pVar.L();
        this.f16986e = activity;
        this.f16996q = appLovinAdClickListener;
        this.f16997r = appLovinAdDisplayListener;
        this.f16998s = appLovinAdVideoPlaybackListener;
        com.applovin.impl.sdk.b.b bVar = new com.applovin.impl.sdk.b.b(activity, pVar);
        this.f16999t = bVar;
        bVar.a(this);
        com.applovin.impl.sdk.d.d dVar = new com.applovin.impl.sdk.d.d(eVar, pVar);
        this.f16985d = dVar;
        this.F = new l(pVar);
        b bVar2 = new b();
        if (((Boolean) pVar.a(com.applovin.impl.sdk.c.b.cT)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
        }
        n nVar = new n(pVar.K(), AppLovinAdSize.INTERSTITIAL, activity);
        this.f = nVar;
        nVar.setAdClickListener(bVar2);
        this.f.setAdDisplayListener(new AppLovinAdDisplayListener() { // from class: com.applovin.impl.adview.activity.b.a.1
            @Override // com.applovin.sdk.AppLovinAdDisplayListener
            public void adDisplayed(AppLovinAd appLovinAd) {
                y yVar = a.this.f16984c;
                if (y.a()) {
                    a.this.f16984c.b("AppLovinFullscreenActivity", "Web content rendered");
                }
            }

            @Override // com.applovin.sdk.AppLovinAdDisplayListener
            public void adHidden(AppLovinAd appLovinAd) {
                y yVar = a.this.f16984c;
                if (y.a()) {
                    a.this.f16984c.b("AppLovinFullscreenActivity", "Closing from WebView");
                }
                a.this.h();
            }
        });
        this.f.getController().a(dVar);
        if (((Boolean) pVar.a(com.applovin.impl.sdk.c.b.az)).booleanValue()) {
            this.f16987g = new u(new o(map, pVar), activity);
        }
        pVar.E().trackImpression(eVar);
        List<Integer> u2 = eVar.u();
        if (eVar.t() < 0 && u2 == null) {
            this.f16988h = null;
        } else {
            m mVar = new m(eVar.v(), activity);
            this.f16988h = mVar;
            mVar.setVisibility(8);
            mVar.setOnClickListener(bVar2);
        }
        m mVar2 = new m(i.a.WHITE_ON_TRANSPARENT, activity);
        this.f16989i = mVar2;
        mVar2.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.adview.activity.b.a.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                a.this.h();
            }
        });
        if (((Boolean) pVar.a(com.applovin.impl.sdk.c.b.cD)).booleanValue()) {
            this.f17003x = new AppLovinBroadcastManager.Receiver() { // from class: com.applovin.impl.adview.activity.b.a.4
                @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
                public void onReceive(Intent intent, Map<String, Object> map2) {
                    pVar.E().trackAppKilled(eVar);
                    AppLovinBroadcastManager.unregisterReceiver(this);
                }
            };
        } else {
            this.f17003x = null;
        }
        if (eVar.al()) {
            this.y = new k.a() { // from class: com.applovin.impl.adview.activity.b.a.5
                @Override // com.applovin.impl.sdk.k.a
                public void a(int i10) {
                    a aVar = a.this;
                    if (aVar.o != k.f18988a) {
                        aVar.f16995p = true;
                    }
                    com.applovin.impl.adview.d s10 = aVar.f.getController().s();
                    if (k.a(i10) && !k.a(a.this.o)) {
                        s10.a("javascript:al_muteSwitchOn();");
                    } else if (i10 == 2) {
                        s10.a("javascript:al_muteSwitchOff();");
                    }
                    a.this.o = i10;
                }
            };
        } else {
            this.y = null;
        }
        if (((Boolean) pVar.a(com.applovin.impl.sdk.c.b.fn)).booleanValue()) {
            this.f17002w = new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.adview.activity.b.a.6
                @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity2, Bundle bundle) {
                    if (!a.this.A.get()) {
                        if (activity2.getClass().getName().equals(Utils.retrieveLauncherActivityFullyQualifiedName(activity2.getApplicationContext()))) {
                            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.a.6.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    y.i("AppLovinFullscreenActivity", "Dismissing on-screen ad due to app relaunched via launcher.");
                                    try {
                                        a.this.h();
                                    } catch (Throwable th) {
                                        y.c("AppLovinFullscreenActivity", "Failed to dismiss ad.", th);
                                        try {
                                            a.this.n();
                                        } catch (Throwable unused) {
                                        }
                                    }
                                }
                            });
                        }
                    }
                }
            };
        } else {
            this.f17002w = null;
        }
    }

    public static /* synthetic */ int c(a aVar) {
        int i10 = aVar.D;
        aVar.D = i10 + 1;
        return i10;
    }

    public abstract void a(long j10);

    public abstract void a(ViewGroup viewGroup);

    public abstract void d();

    public abstract void e();

    public void f() {
        if (y.a()) {
            this.f16984c.c("AppLovinFullscreenActivity", "onResume()");
        }
        this.f16985d.d(SystemClock.elapsedRealtime() - this.B);
        a("javascript:al_onAppResumed();");
        q();
        if (this.f16999t.c()) {
            this.f16999t.a();
        }
    }

    public void g() {
        if (y.a()) {
            this.f16984c.c("AppLovinFullscreenActivity", "onPause()");
        }
        this.B = SystemClock.elapsedRealtime();
        a("javascript:al_onAppPaused();");
        if (this.f16999t.c()) {
            this.f16999t.a();
        }
        p();
    }

    public void h() {
        this.C = true;
        if (y.a()) {
            this.f16984c.c("AppLovinFullscreenActivity", "dismiss()");
        }
        com.applovin.impl.sdk.ad.e eVar = this.f16982a;
        if (eVar != null) {
            eVar.o().e();
        }
        this.f17001v.removeCallbacksAndMessages(null);
        a("javascript:al_onPoststitialDismiss();", this.f16982a.T());
        n();
        this.f16985d.c();
        this.F.a();
        if (this.f17003x != null) {
            com.applovin.impl.sdk.utils.p.a(TimeUnit.SECONDS.toMillis(2L), this.f16983b, new Runnable() { // from class: com.applovin.impl.adview.activity.b.a.7
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f16986e.stopService(new Intent(a.this.f16986e.getApplicationContext(), (Class<?>) AppKilledService.class));
                    AppLovinBroadcastManager.unregisterReceiver(a.this.f17003x);
                }
            });
        }
        if (this.y != null) {
            this.f16983b.ad().b(this.y);
        }
        if (this.f17002w != null) {
            this.f16983b.w().b(this.f17002w);
        }
        if (o()) {
            this.f16986e.finish();
            return;
        }
        this.f16983b.L();
        if (y.a()) {
            this.f16983b.L().b("AppLovinFullscreenActivity", "Fullscreen ad shown in container view dismissed, destroying the presenter.");
        }
        k();
    }

    public boolean i() {
        return this.C;
    }

    public void j() {
        if (y.a()) {
            this.f16984c.c("AppLovinFullscreenActivity", "onStop()");
        }
    }

    public void k() {
        AppLovinAdView appLovinAdView = this.f;
        if (appLovinAdView != null) {
            ViewParent parent = appLovinAdView.getParent();
            this.f.destroy();
            this.f = null;
            if ((parent instanceof ViewGroup) && o()) {
                ((ViewGroup) parent).removeAllViews();
            }
        }
        m();
        n();
        this.f16996q = null;
        this.f16997r = null;
        this.f16998s = null;
        this.f16986e = null;
        AppLovinBroadcastManager.unregisterReceiver(this);
    }

    public void l() {
        if (y.a()) {
            this.f16984c.c("AppLovinFullscreenActivity", "onBackPressed()");
        }
        if (this.G) {
            h();
        }
        if (this.f16982a.V()) {
            b("javascript:onBackPressed();");
        }
    }

    public abstract void m();

    public void n() {
        if (this.A.compareAndSet(false, true)) {
            com.applovin.impl.sdk.utils.k.b(this.f16997r, this.f16982a);
            this.f16983b.Z().b(this.f16982a);
        }
    }

    public boolean o() {
        return this.f16986e instanceof AppLovinFullscreenActivity;
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map<String, Object> map) {
        if ("com.applovin.render_process_gone".equals(intent.getAction()) && !this.f16992l) {
            w();
        }
    }

    public void p() {
        com.applovin.impl.sdk.utils.p pVar = this.f17000u;
        if (pVar != null) {
            pVar.b();
        }
    }

    public void q() {
        com.applovin.impl.sdk.utils.p pVar = this.f17000u;
        if (pVar != null) {
            pVar.c();
        }
    }

    public abstract boolean r();

    public abstract boolean s();

    public boolean t() {
        if (AppLovinAdType.INCENTIVIZED != this.f16982a.getType() && AppLovinAdType.AUTO_INCENTIVIZED != this.f16982a.getType()) {
            return false;
        }
        return true;
    }

    public abstract void u();

    public void v() {
        com.applovin.impl.adview.d s10;
        AppLovinAdView appLovinAdView = this.f;
        if (appLovinAdView == null || (s10 = appLovinAdView.getController().s()) == null) {
            return;
        }
        this.F.a(s10, new l.a() { // from class: com.applovin.impl.adview.activity.b.a.2
            @Override // com.applovin.impl.sdk.l.a
            public void a(View view) {
                m mVar;
                a.this.f16983b.aj().a(t.a.BLACK_VIEW, CollectionUtils.map("clcode", a.this.f16982a.getClCode()));
                if (((Boolean) a.this.f16983b.a(com.applovin.impl.sdk.c.b.fK)).booleanValue()) {
                    a.this.h();
                    return;
                }
                a aVar = a.this;
                aVar.G = ((Boolean) aVar.f16983b.a(com.applovin.impl.sdk.c.b.fL)).booleanValue();
                if (((Boolean) a.this.f16983b.a(com.applovin.impl.sdk.c.b.fM)).booleanValue() && (mVar = a.this.f16988h) != null) {
                    mVar.setVisibility(0);
                }
            }
        });
    }

    public void w() {
        if (y.a()) {
            this.f16984c.c("AppLovinFullscreenActivity", "Handling render process crash");
        }
        this.f16992l = true;
    }

    private void c() {
        AppLovinBroadcastManager.Receiver receiver = this.f17003x;
        if (receiver != null) {
            AppLovinBroadcastManager.registerReceiver(receiver, new IntentFilter(AppKilledService.ACTION_APP_KILLED));
        }
        if (this.y != null) {
            this.f16983b.ad().a(this.y);
        }
        if (this.f17002w != null) {
            this.f16983b.w().a(this.f17002w);
        }
    }

    public void b(boolean z10) {
        a(z10, ((Long) this.f16983b.a(com.applovin.impl.sdk.c.b.cQ)).longValue());
        com.applovin.impl.sdk.utils.k.a(this.f16997r, this.f16982a);
        this.f16983b.Z().a(this.f16982a);
        if (this.f16982a.hasVideoUrl() || t()) {
            com.applovin.impl.sdk.utils.k.a(this.f16998s, this.f16982a);
        }
        new com.applovin.impl.adview.activity.b(this.f16986e).a(this.f16982a);
        this.f16985d.a();
        this.f16982a.setHasShown(true);
    }

    public static void a(com.applovin.impl.sdk.ad.e eVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, Map<String, Object> map, p pVar, Activity activity, InterfaceC0190a interfaceC0190a) {
        a bVar;
        boolean aJ = eVar.aJ();
        if (eVar instanceof com.applovin.impl.c.a) {
            if (aJ) {
                try {
                    bVar = new c(eVar, activity, map, pVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (Throwable th) {
                    pVar.L();
                    if (y.a()) {
                        pVar.L().a("AppLovinFullscreenActivity", "Failed to create ExoPlayer presenter to show the ad. Falling back to using native media player presenter.", th);
                    }
                    try {
                        bVar = new d(eVar, activity, map, pVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                    } catch (Throwable th2) {
                        interfaceC0190a.a("Failed to create FullscreenVastVideoAdPresenter with sdk: " + pVar + " and throwable: " + th2.getMessage(), th2);
                        return;
                    }
                }
            } else {
                try {
                    bVar = new d(eVar, activity, map, pVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (Throwable th3) {
                    interfaceC0190a.a("Failed to create FullscreenVastVideoAdPresenter with sdk: " + pVar + " and throwable: " + th3.getMessage(), th3);
                    return;
                }
            }
        } else if (eVar.hasVideoUrl()) {
            if (eVar.aM()) {
                try {
                    bVar = new g(eVar, activity, map, pVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (Throwable th4) {
                    interfaceC0190a.a("Failed to create FullscreenWebVideoAdPresenter with sdk: " + pVar + " and throwable: " + th4.getMessage(), th4);
                    return;
                }
            } else if (aJ) {
                try {
                    bVar = new e(eVar, activity, map, pVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (Throwable th5) {
                    pVar.L();
                    if (y.a()) {
                        pVar.L().a("AppLovinFullscreenActivity", "Failed to create ExoPlayer presenter to show the ad. Falling back to using native media player presenter.", th5);
                    }
                    try {
                        bVar = new f(eVar, activity, map, pVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                    } catch (Throwable th6) {
                        interfaceC0190a.a("Failed to create FullscreenVideoAdExoPlayerPresenter with sdk: " + pVar + " and throwable: " + th6.getMessage(), th6);
                        return;
                    }
                }
            } else {
                try {
                    bVar = new f(eVar, activity, map, pVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (Throwable th7) {
                    interfaceC0190a.a("Failed to create FullscreenVideoAdPresenter with sdk: " + pVar + " and throwable: " + th7.getMessage(), th7);
                    return;
                }
            }
        } else {
            try {
                bVar = new com.applovin.impl.adview.activity.b.b(eVar, activity, map, pVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th8) {
                interfaceC0190a.a("Failed to create FullscreenGraphicAdPresenter with sdk: " + pVar + " and throwable: " + th8.getMessage(), th8);
                return;
            }
        }
        bVar.c();
        interfaceC0190a.a(bVar);
    }

    public void c(boolean z10) {
        if (y.a()) {
            this.f16984c.c("AppLovinFullscreenActivity", "onWindowFocusChanged(boolean) - " + z10);
        }
        a("javascript:al_onWindowFocusChanged( " + z10 + " );");
    }

    public void b(String str) {
        a(str, 0L);
    }

    public void b(long j10) {
        if (y.a()) {
            this.f16984c.b("AppLovinFullscreenActivity", "Scheduling report reward in " + TimeUnit.MILLISECONDS.toSeconds(j10) + " seconds...");
        }
        this.f17000u = com.applovin.impl.sdk.utils.p.a(j10, this.f16983b, new Runnable() { // from class: com.applovin.impl.adview.activity.b.a.10
            @Override // java.lang.Runnable
            public void run() {
                if (!a.this.f16982a.ag().getAndSet(true)) {
                    a aVar = a.this;
                    a.this.f16983b.M().a(new v(aVar.f16982a, aVar.f16983b), o.a.REWARD);
                }
            }
        });
    }

    public void a(boolean z10) {
        List<Uri> checkCachedResourcesExist = Utils.checkCachedResourcesExist(z10, this.f16982a, this.f16983b, this.f16986e);
        if (checkCachedResourcesExist.isEmpty()) {
            return;
        }
        if (((Boolean) this.f16983b.a(com.applovin.impl.sdk.c.b.fs)).booleanValue()) {
            if (y.a()) {
                this.f16984c.e("AppLovinFullscreenActivity", "Dismissing ad due to missing resources: " + checkCachedResourcesExist);
            }
            com.applovin.impl.adview.p.a(this.f16982a, this.f16997r, "Missing ad resources", null, null);
            h();
            return;
        }
        if (y.a()) {
            this.f16984c.e("AppLovinFullscreenActivity", "Streaming ad due to missing ad resources: " + checkCachedResourcesExist);
        }
        this.f16982a.a();
    }

    public void a(Configuration configuration) {
        if (y.a()) {
            this.f16984c.c("AppLovinFullscreenActivity", "onConfigurationChanged(Configuration) -  " + configuration);
        }
    }

    public void a(int i10, KeyEvent keyEvent) {
        if (this.f16984c == null || !y.a()) {
            return;
        }
        this.f16984c.c("AppLovinFullscreenActivity", "onKeyDown(int, KeyEvent) -  " + i10 + ", " + keyEvent);
    }

    public void a(String str) {
        if (this.f16982a.W()) {
            a(str, 0L);
        }
    }

    public void a(final String str, long j10) {
        if (j10 >= 0) {
            a(new Runnable() { // from class: com.applovin.impl.adview.activity.b.a.8
                @Override // java.lang.Runnable
                public void run() {
                    AppLovinAdView appLovinAdView;
                    com.applovin.impl.adview.d s10;
                    if (StringUtils.isValidString(str) && (appLovinAdView = a.this.f) != null && (s10 = appLovinAdView.getController().s()) != null) {
                        s10.a(str);
                    }
                }
            }, j10);
        }
    }

    public void a(m mVar, long j10, Runnable runnable) {
        if (j10 >= ((Long) this.f16983b.a(com.applovin.impl.sdk.c.b.cA)).longValue()) {
            return;
        }
        this.f16983b.M().a(new z(this.f16983b, new AnonymousClass9(mVar, runnable)), o.a.MAIN, TimeUnit.SECONDS.toMillis(j10), true);
    }

    public void a(int i10, boolean z10, boolean z11, long j10) {
        if (this.f17004z.compareAndSet(false, true)) {
            if (this.f16982a.hasVideoUrl() || t()) {
                com.applovin.impl.sdk.utils.k.a(this.f16998s, this.f16982a, i10, z11);
            }
            if (this.f16982a.hasVideoUrl()) {
                this.f16985d.c(i10);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f16990j;
            this.f16983b.E().trackVideoEnd(this.f16982a, TimeUnit.MILLISECONDS.toSeconds(elapsedRealtime), i10, z10);
            long elapsedRealtime2 = this.f16991k != -1 ? SystemClock.elapsedRealtime() - this.f16991k : -1L;
            this.f16983b.E().trackFullScreenAdClosed(this.f16982a, elapsedRealtime2, this.E, j10, this.f16995p, this.o);
            if (y.a()) {
                y yVar = this.f16984c;
                StringBuilder sb2 = new StringBuilder("Video ad ended at percent: ");
                sb2.append(i10);
                sb2.append("%, elapsedTime: ");
                sb2.append(elapsedRealtime);
                sb2.append("ms, skipTimeMillis: ");
                sb2.append(j10);
                sb2.append("ms, closeTimeMillis: ");
                yVar.b("AppLovinFullscreenActivity", a3.l.n(sb2, elapsedRealtime2, "ms"));
            }
        }
    }

    public void a(boolean z10, long j10) {
        if (this.f16982a.U()) {
            a(z10 ? "javascript:al_mute();" : "javascript:al_unmute();", j10);
        }
    }

    public void a(Runnable runnable, long j10) {
        AppLovinSdkUtils.runOnUiThreadDelayed(runnable, j10, this.f17001v);
    }
}
