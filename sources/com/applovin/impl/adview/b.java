package com.applovin.impl.adview;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PointF;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.adview.u;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class b implements AppLovinCommunicatorSubscriber {
    private volatile AppLovinAdDisplayListener A;
    private volatile AppLovinAdViewEventListener B;
    private volatile AppLovinAdClickListener C;

    /* renamed from: a, reason: collision with root package name */
    private Context f17083a;

    /* renamed from: b, reason: collision with root package name */
    private ViewGroup f17084b;

    /* renamed from: c, reason: collision with root package name */
    private com.applovin.impl.sdk.p f17085c;

    /* renamed from: d, reason: collision with root package name */
    private AppLovinAdServiceImpl f17086d;

    /* renamed from: e, reason: collision with root package name */
    private com.applovin.impl.sdk.y f17087e;
    private AppLovinCommunicator f;

    /* renamed from: h, reason: collision with root package name */
    private AppLovinAdSize f17089h;

    /* renamed from: i, reason: collision with root package name */
    private String f17090i;

    /* renamed from: j, reason: collision with root package name */
    private com.applovin.impl.sdk.d.d f17091j;

    /* renamed from: k, reason: collision with root package name */
    private e f17092k;

    /* renamed from: l, reason: collision with root package name */
    private c f17093l;

    /* renamed from: m, reason: collision with root package name */
    private d f17094m;

    /* renamed from: n, reason: collision with root package name */
    private u f17095n;
    private Runnable o;

    /* renamed from: p, reason: collision with root package name */
    private Runnable f17096p;

    /* renamed from: z, reason: collision with root package name */
    private volatile AppLovinAdLoadListener f17105z;

    /* renamed from: g, reason: collision with root package name */
    private final Map<String, Object> f17088g = Collections.synchronizedMap(CollectionUtils.map());

    /* renamed from: q, reason: collision with root package name */
    private volatile com.applovin.impl.sdk.ad.e f17097q = null;

    /* renamed from: r, reason: collision with root package name */
    private volatile AppLovinAd f17098r = null;

    /* renamed from: s, reason: collision with root package name */
    private l f17099s = null;

    /* renamed from: t, reason: collision with root package name */
    private l f17100t = null;

    /* renamed from: u, reason: collision with root package name */
    private final AtomicReference<AppLovinAd> f17101u = new AtomicReference<>();

    /* renamed from: v, reason: collision with root package name */
    private final AtomicBoolean f17102v = new AtomicBoolean();

    /* renamed from: w, reason: collision with root package name */
    private volatile boolean f17103w = false;

    /* renamed from: x, reason: collision with root package name */
    private volatile boolean f17104x = false;
    private volatile boolean y = false;
    private volatile g D = null;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        private a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f17094m != null) {
                b.this.f17094m.setVisibility(8);
            }
        }
    }

    /* renamed from: com.applovin.impl.adview.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0191b implements Runnable {
        private RunnableC0191b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long j10;
            if (b.this.f17097q != null) {
                if (b.this.f17094m != null) {
                    b.this.x();
                    com.applovin.impl.sdk.y unused = b.this.f17087e;
                    if (com.applovin.impl.sdk.y.a()) {
                        b.this.f17087e.b("AppLovinAdView", "Rendering advertisement ad for #" + b.this.f17097q.getAdIdNumber() + "...");
                    }
                    b.b(b.this.f17094m, b.this.f17097q.getSize());
                    if (b.this.f17095n != null) {
                        com.applovin.impl.sdk.utils.r.a(b.this.f17095n);
                        b.this.f17095n = null;
                    }
                    if (((Boolean) b.this.f17085c.a(com.applovin.impl.sdk.c.b.az)).booleanValue()) {
                        b.this.f17095n = new u(new o(b.this.f17088g, b.this.f17085c), b.this.f17083a);
                        b.this.f17095n.a(new u.a() { // from class: com.applovin.impl.adview.b.b.1
                            @Override // com.applovin.impl.adview.u.a
                            public void a() {
                                b.this.f17094m.addView(b.this.f17095n, new ViewGroup.LayoutParams(-1, -1));
                            }

                            @Override // com.applovin.impl.adview.u.a
                            public void b() {
                                com.applovin.impl.sdk.y unused2 = b.this.f17087e;
                                if (com.applovin.impl.sdk.y.a()) {
                                    b.this.f17087e.e("AppLovinAdView", "Watermark failed to render.");
                                }
                            }
                        });
                    }
                    b.this.f17094m.a(b.this.f17097q);
                    if (b.this.f17097q.getSize() != AppLovinAdSize.INTERSTITIAL && !b.this.f17104x) {
                        b bVar = b.this;
                        bVar.f17091j = new com.applovin.impl.sdk.d.d(bVar.f17097q, b.this.f17085c);
                        b.this.f17091j.a();
                        b.this.f17094m.setStatsManagerHelper(b.this.f17091j);
                        b.this.f17097q.setHasShown(true);
                    }
                    if (b.this.f17094m.getStatsManagerHelper() != null) {
                        if (b.this.f17097q.A()) {
                            j10 = 0;
                        } else {
                            j10 = 1;
                        }
                        b.this.f17094m.getStatsManagerHelper().a(j10);
                        return;
                    }
                    return;
                }
                com.applovin.impl.sdk.y.i("AppLovinAdView", "Unable to render advertisement for ad #" + b.this.f17097q.getAdIdNumber() + ". Please make sure you are not calling AppLovinAdView.destroy() prematurely.");
                com.applovin.impl.sdk.utils.k.a(b.this.B, b.this.f17097q, (AppLovinAdView) null, AppLovinAdViewDisplayErrorCode.WEBVIEW_NOT_FOUND);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c implements AppLovinAdLoadListener {

        /* renamed from: a, reason: collision with root package name */
        private final b f17125a;

        public c(b bVar, com.applovin.impl.sdk.p pVar) {
            if (bVar != null) {
                if (pVar != null) {
                    this.f17125a = bVar;
                    return;
                }
                throw new IllegalArgumentException("No sdk specified");
            }
            throw new IllegalArgumentException("No view specified");
        }

        private b a() {
            return this.f17125a;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            b a10 = a();
            if (a10 != null) {
                a10.b(appLovinAd);
            } else {
                com.applovin.impl.sdk.y.i("AppLovinAdView", "Ad view has been garbage collected by the time an ad was received");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i10) {
            b a10 = a();
            if (a10 != null) {
                a10.a(i10);
            }
        }
    }

    private void u() {
        a(new Runnable() { // from class: com.applovin.impl.adview.b.3
            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f17099s != null) {
                    com.applovin.impl.sdk.y unused = b.this.f17087e;
                    if (com.applovin.impl.sdk.y.a()) {
                        b.this.f17087e.b("AppLovinAdView", "Detaching expanded ad: " + b.this.f17099s.a());
                    }
                    b bVar = b.this;
                    bVar.f17100t = bVar.f17099s;
                    b.this.f17099s = null;
                    b bVar2 = b.this;
                    bVar2.a(bVar2.f17089h);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        a(new Runnable() { // from class: com.applovin.impl.adview.b.10
            @Override // java.lang.Runnable
            public void run() {
                com.applovin.impl.sdk.ad.a a10;
                if (b.this.f17100t != null || b.this.f17099s != null) {
                    if (b.this.f17100t != null) {
                        a10 = b.this.f17100t.a();
                        b.this.f17100t.dismiss();
                        b.this.f17100t = null;
                    } else {
                        a10 = b.this.f17099s.a();
                        b.this.f17099s.dismiss();
                        b.this.f17099s = null;
                    }
                    com.applovin.impl.sdk.utils.k.b(b.this.B, a10, (AppLovinAdView) b.this.f17084b);
                }
            }
        });
    }

    private void w() {
        com.applovin.impl.sdk.d.d dVar = this.f17091j;
        if (dVar != null) {
            dVar.c();
            this.f17091j = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        com.applovin.impl.sdk.ad.e eVar = this.f17097q;
        com.applovin.impl.sdk.utils.l lVar = new com.applovin.impl.sdk.utils.l();
        lVar.a().a(eVar).a(r());
        if (!Utils.isBML(eVar.getSize())) {
            lVar.a().a("Fullscreen Ad Properties").b(eVar);
        }
        lVar.a(this.f17085c);
        lVar.a();
        if (com.applovin.impl.sdk.y.a()) {
            this.f17087e.b("AppLovinAdView", lVar.toString());
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "b";
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("crash_applovin_ad_webview".equals(appLovinCommunicatorMessage.getTopic())) {
            a(new Runnable() { // from class: com.applovin.impl.adview.b.2
                @Override // java.lang.Runnable
                public void run() {
                    b.this.s().loadUrl("chrome://crash");
                }
            });
        }
    }

    private void t() {
        if (this.f17087e != null && com.applovin.impl.sdk.y.a() && com.applovin.impl.sdk.y.a()) {
            this.f17087e.b("AppLovinAdView", "Destroying...");
        }
        com.applovin.impl.sdk.utils.s.a(this.f17094m);
        this.f17094m = null;
        this.f17105z = null;
        this.A = null;
        this.C = null;
        this.B = null;
        this.f17104x = true;
    }

    public String c() {
        return this.f17090i;
    }

    public void d() {
        if (!this.f17103w || this.f17104x) {
            return;
        }
        this.f17104x = true;
    }

    public void e() {
        if (this.f17103w) {
            AppLovinAd andSet = this.f17101u.getAndSet(null);
            if (andSet != null) {
                a(andSet);
            }
            this.f17104x = false;
        }
    }

    public void f() {
        if (this.f17094m != null && this.f17099s != null) {
            k();
        }
        t();
    }

    public AppLovinAdViewEventListener g() {
        return this.B;
    }

    public g h() {
        return this.D;
    }

    public void i() {
        if (com.applovin.impl.sdk.utils.c.a(this.f17094m)) {
            this.f17085c.P().a(com.applovin.impl.sdk.d.f.o);
        }
    }

    public void j() {
        if (this.f17103w) {
            com.applovin.impl.sdk.utils.k.b(this.A, this.f17097q);
            if (this.f17097q != null && this.f17097q.isOpenMeasurementEnabled() && Utils.isBML(this.f17097q.getSize())) {
                this.f17097q.o().e();
            }
            if (this.f17094m != null && this.f17099s != null) {
                if (com.applovin.impl.sdk.y.a()) {
                    this.f17087e.b("AppLovinAdView", "onDetachedFromWindowCalled with expanded ad present");
                }
                u();
            } else if (com.applovin.impl.sdk.y.a()) {
                this.f17087e.b("AppLovinAdView", "onDetachedFromWindowCalled without an expanded ad present");
            }
        }
    }

    public void k() {
        a(new Runnable() { // from class: com.applovin.impl.adview.b.7
            @Override // java.lang.Runnable
            public void run() {
                b.this.v();
                if (b.this.f17084b != null && b.this.f17094m != null && b.this.f17094m.getParent() == null) {
                    b.this.f17084b.addView(b.this.f17094m);
                    b.b(b.this.f17094m, b.this.f17097q.getSize());
                    if (b.this.f17097q.isOpenMeasurementEnabled()) {
                        b.this.f17097q.o().a((View) b.this.f17094m);
                    }
                }
            }
        });
    }

    public void l() {
        if (this.f17099s == null && this.f17100t == null) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f17087e.b("AppLovinAdView", "Ad: " + this.f17097q + " closed.");
            }
            a(this.f17096p);
            com.applovin.impl.sdk.utils.k.b(this.A, this.f17097q);
            this.f17097q = null;
            return;
        }
        k();
    }

    public void m() {
        this.y = true;
    }

    public void n() {
        this.y = false;
    }

    public void o() {
        if (!(this.f17083a instanceof k) || this.f17097q == null) {
            return;
        }
        if (this.f17097q.G() == e.a.DISMISS) {
            ((k) this.f17083a).dismiss();
        }
    }

    public com.applovin.impl.sdk.ad.e p() {
        return this.f17097q;
    }

    public com.applovin.impl.sdk.p q() {
        return this.f17085c;
    }

    public AppLovinAdView r() {
        return (AppLovinAdView) this.f17084b;
    }

    public d s() {
        return this.f17094m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(View view, AppLovinAdSize appLovinAdSize) {
        int applyDimension;
        if (view == null) {
            return;
        }
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        String label = appLovinAdSize.getLabel();
        AppLovinAdSize appLovinAdSize2 = AppLovinAdSize.INTERSTITIAL;
        int i10 = -1;
        if (label.equals(appLovinAdSize2.getLabel())) {
            applyDimension = -1;
        } else if (appLovinAdSize.getWidth() == -1) {
            applyDimension = displayMetrics.widthPixels;
        } else {
            applyDimension = (int) TypedValue.applyDimension(1, appLovinAdSize.getWidth(), displayMetrics);
        }
        if (!appLovinAdSize.getLabel().equals(appLovinAdSize2.getLabel())) {
            if (appLovinAdSize.getHeight() == -1) {
                i10 = displayMetrics.heightPixels;
            } else {
                i10 = (int) TypedValue.applyDimension(1, appLovinAdSize.getHeight(), displayMetrics);
            }
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        layoutParams.width = applyDimension;
        layoutParams.height = i10;
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(13);
        }
        view.setLayoutParams(layoutParams);
    }

    private void a(AppLovinAdView appLovinAdView, com.applovin.impl.sdk.p pVar, AppLovinAdSize appLovinAdSize, String str, Context context) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (pVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (appLovinAdSize != null) {
            this.f17085c = pVar;
            this.f17086d = pVar.E();
            this.f17087e = pVar.L();
            this.f = AppLovinCommunicator.getInstance(context);
            this.f17089h = appLovinAdSize;
            this.f17090i = str;
            if (!(context instanceof AppLovinFullscreenActivity)) {
                context = context.getApplicationContext();
            }
            this.f17083a = context;
            this.f17084b = appLovinAdView;
            this.f17092k = new e(this, pVar);
            this.f17096p = new a();
            this.o = new RunnableC0191b();
            this.f17093l = new c(this, pVar);
            a(appLovinAdSize);
            return;
        }
        throw new IllegalArgumentException("No ad size specified");
    }

    public AppLovinAdSize b() {
        return this.f17089h;
    }

    public void b(final AppLovinAd appLovinAd) {
        if (appLovinAd != null) {
            if (!this.f17104x) {
                a(appLovinAd);
            } else {
                this.f17101u.set(appLovinAd);
                if (com.applovin.impl.sdk.y.a()) {
                    this.f17087e.b("AppLovinAdView", "Ad view has paused when an ad was received, ad saved for later");
                }
            }
            a(new Runnable() { // from class: com.applovin.impl.adview.b.8
                @Override // java.lang.Runnable
                public void run() {
                    if (b.this.f17102v.compareAndSet(true, false)) {
                        b bVar = b.this;
                        bVar.a(bVar.f17089h);
                    }
                    try {
                        if (b.this.f17105z != null) {
                            b.this.f17105z.adReceived(appLovinAd);
                        }
                    } catch (Throwable th) {
                        com.applovin.impl.sdk.y.i("AppLovinAdView", "Exception while running ad load callback: " + th.getMessage());
                    }
                }
            });
            return;
        }
        if (com.applovin.impl.sdk.y.a()) {
            this.f17087e.e("AppLovinAdView", "No provided when to the view controller");
        }
        a(-1);
    }

    public void a(AppLovinAdSize appLovinAdSize) {
        try {
            d dVar = new d(this.f17092k, this.f17085c, this.f17083a);
            this.f17094m = dVar;
            dVar.setBackgroundColor(0);
            this.f17094m.setWillNotCacheDrawing(false);
            this.f17084b.setBackgroundColor(0);
            this.f17084b.addView(this.f17094m);
            b(this.f17094m, appLovinAdSize);
            if (!this.f17103w) {
                a(this.f17096p);
            }
            a(new Runnable() { // from class: com.applovin.impl.adview.b.1
                @Override // java.lang.Runnable
                public void run() {
                    b.this.f17094m.loadDataWithBaseURL("/", "<html></html>", "text/html", null, "");
                }
            });
            this.f17103w = true;
        } catch (Throwable th) {
            com.applovin.impl.sdk.y.c("AppLovinAdView", "Failed to initialize AdWebView", th);
            this.f17102v.set(true);
        }
    }

    public void a(AppLovinAdView appLovinAdView, Context context, AppLovinAdSize appLovinAdSize, String str, AppLovinSdk appLovinSdk, AttributeSet attributeSet) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (context == null) {
            com.applovin.impl.sdk.y.i("AppLovinAdView", "Unable to build AppLovinAdView: no context provided. Please use a different constructor for this view.");
            return;
        }
        if (appLovinAdSize == null && (appLovinAdSize = com.applovin.impl.sdk.utils.c.a(attributeSet)) == null) {
            appLovinAdSize = AppLovinAdSize.BANNER;
        }
        AppLovinAdSize appLovinAdSize2 = appLovinAdSize;
        if (appLovinSdk == null) {
            appLovinSdk = AppLovinSdk.getInstance(context);
        }
        if (appLovinSdk != null) {
            a(appLovinAdView, appLovinSdk.coreSdk, appLovinAdSize2, str, context);
            if (com.applovin.impl.sdk.utils.c.b(attributeSet)) {
                a();
            }
        }
    }

    public void a() {
        if (this.f17085c != null && this.f17093l != null && this.f17083a != null && this.f17103w) {
            this.f17086d.loadNextAd(this.f17090i, this.f17089h, this.f17093l);
        } else {
            com.applovin.impl.sdk.y.g("AppLovinAdView", "Unable to load next ad: AppLovinAdView is not initialized.");
        }
    }

    public void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f17105z = appLovinAdLoadListener;
    }

    public void a(String str, Object obj) {
        this.f17088g.put(str, obj);
    }

    public void a(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.A = appLovinAdDisplayListener;
    }

    public void a(AppLovinAdViewEventListener appLovinAdViewEventListener) {
        this.B = appLovinAdViewEventListener;
    }

    public void a(AppLovinAdClickListener appLovinAdClickListener) {
        this.C = appLovinAdClickListener;
    }

    public void a(g gVar) {
        this.D = gVar;
    }

    public void a(AppLovinAd appLovinAd) {
        a(appLovinAd, (String) null);
    }

    public void a(AppLovinAd appLovinAd, String str) {
        if (appLovinAd != null) {
            Utils.validateAdSdkKey(appLovinAd, this.f17085c);
            if (this.f17103w) {
                com.applovin.impl.sdk.ad.e eVar = (com.applovin.impl.sdk.ad.e) Utils.maybeRetrieveNonDummyAd(appLovinAd, this.f17085c);
                if (eVar == null || eVar == this.f17097q) {
                    if (eVar == null) {
                        if (com.applovin.impl.sdk.y.a()) {
                            this.f17087e.d("AppLovinAdView", "Unable to render ad. Ad is null. Internal inconsistency error.");
                            return;
                        }
                        return;
                    }
                    if (com.applovin.impl.sdk.y.a()) {
                        this.f17087e.d("AppLovinAdView", "Ad #" + eVar.getAdIdNumber() + " is already showing, ignoring");
                    }
                    if (((Boolean) this.f17085c.a(com.applovin.impl.sdk.c.b.f18716cn)).booleanValue()) {
                        throw new IllegalStateException("Failed to display ad - ad can only be displayed once. Load the next ad.");
                    }
                    return;
                }
                if (com.applovin.impl.sdk.y.a()) {
                    this.f17087e.b("AppLovinAdView", "Rendering ad #" + eVar.getAdIdNumber() + " (" + eVar.getSize() + ")");
                }
                com.applovin.impl.sdk.utils.k.b(this.A, this.f17097q);
                if (eVar.getSize() != AppLovinAdSize.INTERSTITIAL) {
                    w();
                }
                if (this.f17097q != null && this.f17097q.isOpenMeasurementEnabled()) {
                    this.f17097q.o().e();
                }
                this.f17101u.set(null);
                this.f17098r = null;
                this.f17097q = eVar;
                if (!this.f17104x && Utils.isBML(this.f17089h)) {
                    this.f17085c.E().trackImpression(eVar);
                }
                if (this.f17099s != null) {
                    u();
                }
                a(this.o);
                return;
            }
            com.applovin.impl.sdk.y.g("AppLovinAdView", "Unable to render ad: AppLovinAdView is not initialized.");
            return;
        }
        throw new IllegalArgumentException("No ad specified");
    }

    public void a(final WebView webView) {
        if (this.f17097q == null) {
            return;
        }
        a(new Runnable() { // from class: com.applovin.impl.adview.b.4
            @Override // java.lang.Runnable
            public void run() {
                webView.setVisibility(0);
            }
        });
        try {
            if (this.f17097q != this.f17098r) {
                this.f17098r = this.f17097q;
                if (this.A != null) {
                    this.f17085c.af().a(this.f17097q);
                    com.applovin.impl.sdk.utils.k.a(this.A, this.f17097q);
                    this.f17094m.a("javascript:al_onAdViewRendered();");
                }
                if (Utils.isBML(this.f17089h) && this.f17097q.isOpenMeasurementEnabled()) {
                    this.f17085c.M().a(new z(this.f17085c, new Runnable() { // from class: com.applovin.impl.adview.b.5
                        @Override // java.lang.Runnable
                        public void run() {
                            b.this.f17097q.o().b(webView);
                            if (b.this.f17095n != null && b.this.f17095n.b()) {
                                b.this.f17097q.o().a(webView, Collections.singletonList(new com.applovin.impl.sdk.a.d(b.this.f17095n, FriendlyObstructionPurpose.NOT_VISIBLE, b.this.f17095n.getIdentifier())));
                            } else {
                                b.this.f17097q.o().a((View) webView);
                            }
                            b.this.f17097q.o().c();
                            b.this.f17097q.o().d();
                        }
                    }), o.a.MAIN, 500L);
                }
            }
        } catch (Throwable th) {
            com.applovin.impl.sdk.y.c("AppLovinAdView", "Exception while notifying ad display listener", th);
        }
    }

    public void a(final PointF pointF) {
        a(new Runnable() { // from class: com.applovin.impl.adview.b.6
            @Override // java.lang.Runnable
            public void run() {
                Activity retrieveParentActivity;
                if (b.this.f17099s != null || !(b.this.f17097q instanceof com.applovin.impl.sdk.ad.a) || b.this.f17094m == null) {
                    return;
                }
                com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) b.this.f17097q;
                if (b.this.f17083a instanceof Activity) {
                    retrieveParentActivity = (Activity) b.this.f17083a;
                } else {
                    retrieveParentActivity = Utils.retrieveParentActivity(b.this.f17094m, b.this.f17085c);
                }
                if (retrieveParentActivity != null && !retrieveParentActivity.isFinishing()) {
                    if (b.this.f17084b != null) {
                        b.this.f17084b.removeView(b.this.f17094m);
                    }
                    b.this.f17099s = new l(aVar, b.this.f17094m, retrieveParentActivity, b.this.f17085c);
                    b.this.f17099s.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.adview.b.6.1
                        @Override // android.content.DialogInterface.OnDismissListener
                        public void onDismiss(DialogInterface dialogInterface) {
                            b.this.k();
                        }
                    });
                    b.this.f17099s.show();
                    com.applovin.impl.sdk.utils.k.a(b.this.B, b.this.f17097q, (AppLovinAdView) b.this.f17084b);
                    if (b.this.f17091j != null) {
                        b.this.f17091j.d();
                    }
                    if (b.this.f17097q.isOpenMeasurementEnabled()) {
                        b.this.f17097q.o().a((View) b.this.f17099s.b());
                        return;
                    }
                    return;
                }
                com.applovin.impl.sdk.y.i("AppLovinAdView", "Unable to expand ad. No Activity found.");
                Uri j10 = aVar.j();
                if (j10 != null) {
                    AppLovinAdServiceImpl appLovinAdServiceImpl = b.this.f17086d;
                    AppLovinAdView r10 = b.this.r();
                    b bVar = b.this;
                    appLovinAdServiceImpl.trackAndLaunchClick(aVar, r10, bVar, j10, pointF, bVar.y);
                    if (b.this.f17091j != null) {
                        b.this.f17091j.b();
                    }
                }
                b.this.f17094m.a("javascript:al_onFailedExpand();");
            }
        });
    }

    public void a(com.applovin.impl.sdk.ad.e eVar, AppLovinAdView appLovinAdView, Uri uri, PointF pointF) {
        if (appLovinAdView != null) {
            this.f17086d.trackAndLaunchClick(eVar, appLovinAdView, this, uri, pointF, this.y);
        } else if (com.applovin.impl.sdk.y.a()) {
            this.f17087e.e("AppLovinAdView", "Unable to process ad click - AppLovinAdView destroyed prematurely");
        }
        com.applovin.impl.sdk.utils.k.a(this.C, eVar);
    }

    public void a(final int i10) {
        if (!this.f17104x) {
            a(this.f17096p);
        }
        a(new Runnable() { // from class: com.applovin.impl.adview.b.9
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (b.this.f17105z != null) {
                        b.this.f17105z.failedToReceiveAd(i10);
                    }
                } catch (Throwable th) {
                    com.applovin.impl.sdk.y.c("AppLovinAdView", "Exception while running app load  callback", th);
                }
            }
        });
    }

    private void a(Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(runnable);
    }

    public void a(com.applovin.impl.sdk.d.d dVar) {
        d dVar2 = this.f17094m;
        if (dVar2 != null) {
            dVar2.setStatsManagerHelper(dVar);
        }
    }
}
