package com.applovin.impl.mediation;

import a3.k;
import a3.l;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdViewAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdViewAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class g {

    /* renamed from: b */
    private final p f18251b;

    /* renamed from: c */
    private final y f18252c;

    /* renamed from: d */
    private final String f18253d;

    /* renamed from: e */
    private final com.applovin.impl.mediation.a.f f18254e;
    private final String f;

    /* renamed from: g */
    private MaxAdapter f18255g;

    /* renamed from: h */
    private String f18256h;

    /* renamed from: i */
    private com.applovin.impl.mediation.a.a f18257i;

    /* renamed from: j */
    private View f18258j;

    /* renamed from: k */
    private MaxNativeAd f18259k;

    /* renamed from: l */
    private MaxNativeAdView f18260l;

    /* renamed from: n */
    private MaxAdapterResponseParameters f18262n;

    /* renamed from: r */
    private final boolean f18265r;

    /* renamed from: a */
    private final Handler f18250a = new Handler(Looper.getMainLooper());

    /* renamed from: m */
    private final a f18261m = new a();
    private final AtomicBoolean o = new AtomicBoolean(true);

    /* renamed from: p */
    private final AtomicBoolean f18263p = new AtomicBoolean(false);

    /* renamed from: q */
    private final AtomicBoolean f18264q = new AtomicBoolean(false);

    /* renamed from: com.applovin.impl.mediation.g$1 */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Runnable f18266a;

        /* renamed from: b */
        final /* synthetic */ MaxAdapterInitializationParameters f18267b;

        /* renamed from: c */
        final /* synthetic */ Activity f18268c;

        public AnonymousClass1(Runnable runnable, MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity) {
            r2 = runnable;
            r3 = maxAdapterInitializationParameters;
            r4 = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            y unused = g.this.f18252c;
            if (y.a()) {
                g.this.f18252c.b("MediationAdapterWrapper", "Initializing " + g.this.f + " on thread: " + Thread.currentThread() + " with 'run_on_ui_thread' value: " + g.this.f18254e.ae());
            }
            g.this.f18255g.initialize(r3, r4, new b(g.this.f18251b, g.this.f18254e, elapsedRealtime, r2));
        }
    }

    /* renamed from: com.applovin.impl.mediation.g$10 */
    /* loaded from: classes.dex */
    public class AnonymousClass10 implements Runnable {
        public AnonymousClass10() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.a("destroy");
            g.this.f18255g.onDestroy();
            g.this.f18255g = null;
            g.this.f18258j = null;
            g.this.f18259k = null;
            g.this.f18260l = null;
        }
    }

    /* renamed from: com.applovin.impl.mediation.g$11 */
    /* loaded from: classes.dex */
    public class AnonymousClass11 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f18271a;

        /* renamed from: b */
        final /* synthetic */ Runnable f18272b;

        public AnonymousClass11(String str, Runnable runnable) {
            r2 = str;
            r3 = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                y unused = g.this.f18252c;
                if (y.a()) {
                    g.this.f18252c.b("MediationAdapterWrapper", g.this.f + ": running " + r2 + "...");
                }
                r3.run();
                y unused2 = g.this.f18252c;
                if (y.a()) {
                    g.this.f18252c.b("MediationAdapterWrapper", g.this.f + ": finished " + r2 + "");
                }
            } catch (Throwable th) {
                y.c("MediationAdapterWrapper", "Failed operation " + r2 + " for " + g.this.f18253d, th);
                g gVar = g.this;
                StringBuilder sb2 = new StringBuilder("fail_");
                sb2.append(r2);
                gVar.a(sb2.toString());
                if (!r2.equals("destroy")) {
                    g.this.f18251b.an().a(g.this.f18254e.W(), r2, g.this.f18257i);
                }
            }
        }
    }

    /* renamed from: com.applovin.impl.mediation.g$12 */
    /* loaded from: classes.dex */
    public class AnonymousClass12 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MaxAdapterResponseParameters f18274a;

        /* renamed from: b */
        final /* synthetic */ Activity f18275b;

        public AnonymousClass12(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
            r2 = maxAdapterResponseParameters;
            r3 = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((MaxInterstitialAdapter) g.this.f18255g).loadInterstitialAd(r2, r3, g.this.f18261m);
        }
    }

    /* renamed from: com.applovin.impl.mediation.g$13 */
    /* loaded from: classes.dex */
    public class AnonymousClass13 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MaxAdapterResponseParameters f18277a;

        /* renamed from: b */
        final /* synthetic */ Activity f18278b;

        public AnonymousClass13(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
            r2 = maxAdapterResponseParameters;
            r3 = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((MaxAppOpenAdapter) g.this.f18255g).loadAppOpenAd(r2, r3, g.this.f18261m);
        }
    }

    /* renamed from: com.applovin.impl.mediation.g$14 */
    /* loaded from: classes.dex */
    public class AnonymousClass14 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MaxAdapterResponseParameters f18280a;

        /* renamed from: b */
        final /* synthetic */ Activity f18281b;

        public AnonymousClass14(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
            r2 = maxAdapterResponseParameters;
            r3 = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((MaxRewardedAdapter) g.this.f18255g).loadRewardedAd(r2, r3, g.this.f18261m);
        }
    }

    /* renamed from: com.applovin.impl.mediation.g$15 */
    /* loaded from: classes.dex */
    public class AnonymousClass15 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MaxAdapterResponseParameters f18283a;

        /* renamed from: b */
        final /* synthetic */ Activity f18284b;

        public AnonymousClass15(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
            r2 = maxAdapterResponseParameters;
            r3 = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((MaxRewardedInterstitialAdapter) g.this.f18255g).loadRewardedInterstitialAd(r2, r3, g.this.f18261m);
        }
    }

    /* renamed from: com.applovin.impl.mediation.g$16 */
    /* loaded from: classes.dex */
    public class AnonymousClass16 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MaxAdapterResponseParameters f18286a;

        /* renamed from: b */
        final /* synthetic */ Activity f18287b;

        public AnonymousClass16(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
            r2 = maxAdapterResponseParameters;
            r3 = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((MediationAdapterBase) g.this.f18255g).loadNativeAd(r2, r3, g.this.f18261m);
        }
    }

    /* renamed from: com.applovin.impl.mediation.g$17 */
    /* loaded from: classes.dex */
    public class AnonymousClass17 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MaxAdapterResponseParameters f18289a;

        /* renamed from: b */
        final /* synthetic */ MaxAdFormat f18290b;

        /* renamed from: c */
        final /* synthetic */ Activity f18291c;

        public AnonymousClass17(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity) {
            r2 = maxAdapterResponseParameters;
            r3 = maxAdFormat;
            r4 = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((MaxAdViewAdapter) g.this.f18255g).loadAdViewAd(r2, r3, r4, g.this.f18261m);
        }
    }

    /* renamed from: com.applovin.impl.mediation.g$18 */
    /* loaded from: classes.dex */
    public class AnonymousClass18 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Runnable f18293a;

        /* renamed from: b */
        final /* synthetic */ com.applovin.impl.mediation.a.a f18294b;

        public AnonymousClass18(Runnable runnable, com.applovin.impl.mediation.a.a aVar) {
            r2 = runnable;
            r3 = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                r2.run();
            } catch (Throwable th) {
                String str = "Failed to start loading ad for " + g.this.f18253d + " due to: " + th;
                y.i("MediationAdapterWrapper", str);
                g.this.f18261m.a("load_ad", new MaxErrorImpl(-1, str));
                g.this.a("load_ad");
                g.this.f18251b.an().a(g.this.f18254e.W(), "load_ad", g.this.f18257i);
            }
            if (!g.this.f18263p.get()) {
                long ai = g.this.f18254e.ai();
                if (ai > 0) {
                    y unused = g.this.f18252c;
                    if (y.a()) {
                        y yVar = g.this.f18252c;
                        StringBuilder k10 = com.ironsource.adapters.facebook.a.k("Setting timeout ", ai, "ms. for ");
                        k10.append(r3);
                        yVar.b("MediationAdapterWrapper", k10.toString());
                    }
                    g.this.f18251b.M().a(new d(), o.a.MEDIATION_TIMEOUT, ai);
                    return;
                }
                y unused2 = g.this.f18252c;
                if (y.a()) {
                    g.this.f18252c.b("MediationAdapterWrapper", "Negative timeout set for " + r3 + ", not scheduling a timeout");
                }
            }
        }
    }

    /* renamed from: com.applovin.impl.mediation.g$19 */
    /* loaded from: classes.dex */
    public class AnonymousClass19 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ com.applovin.impl.mediation.a.a f18296a;

        /* renamed from: b */
        final /* synthetic */ Activity f18297b;

        public AnonymousClass19(com.applovin.impl.mediation.a.a aVar, Activity activity) {
            r2 = aVar;
            r3 = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.f18251b.aq().a((com.applovin.impl.mediation.a.c) r2, r3, g.this.f18261m);
        }
    }

    /* renamed from: com.applovin.impl.mediation.g$2 */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f18299a;

        public AnonymousClass2(Activity activity) {
            r2 = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((MaxInterstitialAdapter) g.this.f18255g).showInterstitialAd(g.this.f18262n, r2, g.this.f18261m);
        }
    }

    /* renamed from: com.applovin.impl.mediation.g$3 */
    /* loaded from: classes.dex */
    public class AnonymousClass3 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f18301a;

        public AnonymousClass3(Activity activity) {
            r2 = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((MaxAppOpenAdapter) g.this.f18255g).showAppOpenAd(g.this.f18262n, r2, g.this.f18261m);
        }
    }

    /* renamed from: com.applovin.impl.mediation.g$4 */
    /* loaded from: classes.dex */
    public class AnonymousClass4 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f18303a;

        public AnonymousClass4(Activity activity) {
            r2 = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((MaxRewardedAdapter) g.this.f18255g).showRewardedAd(g.this.f18262n, r2, g.this.f18261m);
        }
    }

    /* renamed from: com.applovin.impl.mediation.g$5 */
    /* loaded from: classes.dex */
    public class AnonymousClass5 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f18305a;

        public AnonymousClass5(Activity activity) {
            r2 = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((MaxRewardedInterstitialAdapter) g.this.f18255g).showRewardedInterstitialAd(g.this.f18262n, r2, g.this.f18261m);
        }
    }

    /* renamed from: com.applovin.impl.mediation.g$6 */
    /* loaded from: classes.dex */
    public class AnonymousClass6 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f18307a;

        /* renamed from: b */
        final /* synthetic */ androidx.lifecycle.i f18308b;

        /* renamed from: c */
        final /* synthetic */ Activity f18309c;

        public AnonymousClass6(ViewGroup viewGroup, androidx.lifecycle.i iVar, Activity activity) {
            r2 = viewGroup;
            r3 = iVar;
            r4 = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((MaxInterstitialAdViewAdapter) g.this.f18255g).showInterstitialAd(g.this.f18262n, r2, r3, r4, g.this.f18261m);
        }
    }

    /* renamed from: com.applovin.impl.mediation.g$7 */
    /* loaded from: classes.dex */
    public class AnonymousClass7 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f18311a;

        /* renamed from: b */
        final /* synthetic */ androidx.lifecycle.i f18312b;

        /* renamed from: c */
        final /* synthetic */ Activity f18313c;

        public AnonymousClass7(ViewGroup viewGroup, androidx.lifecycle.i iVar, Activity activity) {
            r2 = viewGroup;
            r3 = iVar;
            r4 = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((MaxRewardedAdViewAdapter) g.this.f18255g).showRewardedAd(g.this.f18262n, r2, r3, r4, g.this.f18261m);
        }
    }

    /* renamed from: com.applovin.impl.mediation.g$8 */
    /* loaded from: classes.dex */
    public class AnonymousClass8 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Runnable f18315a;

        public AnonymousClass8(Runnable runnable) {
            r2 = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                r2.run();
            } catch (Throwable th) {
                String str = "Failed to start displaying ad for " + g.this.f18253d + " due to: " + th;
                y.i("MediationAdapterWrapper", str);
                g.this.f18261m.a("show_ad", new MaxErrorImpl(-1, str), (Bundle) null);
                g.this.a("show_ad");
                g.this.f18251b.an().a(g.this.f18254e.W(), "show_ad", g.this.f18257i);
            }
        }
    }

    /* renamed from: com.applovin.impl.mediation.g$9 */
    /* loaded from: classes.dex */
    public class AnonymousClass9 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MaxSignalProvider f18317a;

        /* renamed from: b */
        final /* synthetic */ MaxAdapterSignalCollectionParameters f18318b;

        /* renamed from: c */
        final /* synthetic */ Activity f18319c;

        /* renamed from: d */
        final /* synthetic */ c f18320d;

        /* renamed from: e */
        final /* synthetic */ com.applovin.impl.mediation.a.h f18321e;

        /* renamed from: com.applovin.impl.mediation.g$9$1 */
        /* loaded from: classes.dex */
        public class AnonymousClass1 implements MaxSignalCollectionListener {
            public AnonymousClass1() {
            }

            @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
            public void onSignalCollected(String str) {
                AnonymousClass9 anonymousClass9 = AnonymousClass9.this;
                g.this.a(str, r5);
            }

            @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
            public void onSignalCollectionFailed(String str) {
                AnonymousClass9 anonymousClass9 = AnonymousClass9.this;
                g.this.b(str, r5);
            }
        }

        public AnonymousClass9(MaxSignalProvider maxSignalProvider, MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, c cVar, com.applovin.impl.mediation.a.h hVar) {
            r2 = maxSignalProvider;
            r3 = maxAdapterSignalCollectionParameters;
            r4 = activity;
            r5 = cVar;
            r6 = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                r2.collectSignal(r3, r4, new MaxSignalCollectionListener() { // from class: com.applovin.impl.mediation.g.9.1
                    public AnonymousClass1() {
                    }

                    @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
                    public void onSignalCollected(String str) {
                        AnonymousClass9 anonymousClass9 = AnonymousClass9.this;
                        g.this.a(str, r5);
                    }

                    @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
                    public void onSignalCollectionFailed(String str) {
                        AnonymousClass9 anonymousClass9 = AnonymousClass9.this;
                        g.this.b(str, r5);
                    }
                });
            } catch (Throwable th) {
                String str = "Failed signal collection for " + g.this.f18253d + " due to: " + th;
                y.i("MediationAdapterWrapper", str);
                g.this.b(str, r5);
                g.this.a("collect_signal");
                g.this.f18251b.an().a(g.this.f18254e.W(), "collect_signal", g.this.f18257i);
            }
            if (!r5.f18372c.get()) {
                if (r6.ai() == 0) {
                    y unused = g.this.f18252c;
                    if (y.a()) {
                        g.this.f18252c.b("MediationAdapterWrapper", "Failing signal collection " + r6 + " since it has 0 timeout");
                    }
                    g.this.b("The adapter (" + g.this.f + ") has 0 timeout", r5);
                    return;
                }
                if (r6.ai() > 0) {
                    y unused2 = g.this.f18252c;
                    if (y.a()) {
                        g.this.f18252c.b("MediationAdapterWrapper", "Setting timeout " + r6.ai() + "ms. for " + r6);
                    }
                    g.this.f18251b.M().a(new e(r5), o.a.MEDIATION_TIMEOUT, r6.ai());
                    return;
                }
                y unused3 = g.this.f18252c;
                if (y.a()) {
                    g.this.f18252c.b("MediationAdapterWrapper", "Negative timeout set for " + r6 + ", not scheduling a timeout");
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class a implements MaxAdViewAdapterListener, MaxAppOpenAdapterListener, MaxInterstitialAdapterListener, MaxNativeAdAdapterListener, MaxRewardedAdapterListener, MaxRewardedInterstitialAdapterListener {

        /* renamed from: b */
        private MediationServiceImpl.a f18324b;

        /* renamed from: com.applovin.impl.mediation.g$a$1 */
        /* loaded from: classes.dex */
        public class AnonymousClass1 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Bundle f18325a;

            public AnonymousClass1(Bundle bundle) {
                r2 = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (g.this.f18263p.compareAndSet(false, true)) {
                    a.this.f18324b.a(g.this.f18257i, r2);
                }
            }
        }

        /* renamed from: com.applovin.impl.mediation.g$a$10 */
        /* loaded from: classes.dex */
        public class AnonymousClass10 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Bundle f18327a;

            public AnonymousClass10(Bundle bundle) {
                r2 = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f18324b.d(g.this.f18257i, r2);
            }
        }

        /* renamed from: com.applovin.impl.mediation.g$a$11 */
        /* loaded from: classes.dex */
        public class AnonymousClass11 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Runnable f18329a;

            /* renamed from: b */
            final /* synthetic */ MaxAdListener f18330b;

            /* renamed from: c */
            final /* synthetic */ String f18331c;

            public AnonymousClass11(Runnable runnable, MaxAdListener maxAdListener, String str) {
                r2 = runnable;
                r3 = maxAdListener;
                r4 = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str;
                try {
                    r2.run();
                } catch (Exception e10) {
                    MaxAdListener maxAdListener = r3;
                    if (maxAdListener != null) {
                        str = maxAdListener.getClass().getName();
                    } else {
                        str = null;
                    }
                    y.c("MediationAdapterWrapper", k.m(new StringBuilder("Failed to forward call ("), r4, ") to ", str), e10);
                }
            }
        }

        /* renamed from: com.applovin.impl.mediation.g$a$12 */
        /* loaded from: classes.dex */
        public class AnonymousClass12 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ MaxError f18333a;

            public AnonymousClass12(MaxError maxError) {
                r2 = maxError;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (g.this.f18263p.compareAndSet(false, true)) {
                    a.this.f18324b.onAdLoadFailed(g.this.f18256h, r2);
                }
            }
        }

        /* renamed from: com.applovin.impl.mediation.g$a$13 */
        /* loaded from: classes.dex */
        public class AnonymousClass13 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Bundle f18335a;

            public AnonymousClass13(Bundle bundle) {
                r2 = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f18324b.b(g.this.f18257i, r2);
            }
        }

        /* renamed from: com.applovin.impl.mediation.g$a$14 */
        /* loaded from: classes.dex */
        public class AnonymousClass14 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ MaxError f18337a;

            /* renamed from: b */
            final /* synthetic */ Bundle f18338b;

            public AnonymousClass14(MaxError maxError, Bundle bundle) {
                r2 = maxError;
                r3 = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f18324b.a(g.this.f18257i, r2, r3);
            }
        }

        /* renamed from: com.applovin.impl.mediation.g$a$15 */
        /* loaded from: classes.dex */
        public class AnonymousClass15 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Bundle f18340a;

            public AnonymousClass15(Bundle bundle) {
                r2 = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f18324b.c(g.this.f18257i, r2);
            }
        }

        /* renamed from: com.applovin.impl.mediation.g$a$16 */
        /* loaded from: classes.dex */
        public class AnonymousClass16 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Bundle f18342a;

            public AnonymousClass16(Bundle bundle) {
                r2 = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f18324b.d(g.this.f18257i, r2);
            }
        }

        /* renamed from: com.applovin.impl.mediation.g$a$17 */
        /* loaded from: classes.dex */
        public class AnonymousClass17 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Bundle f18344a;

            public AnonymousClass17(Bundle bundle) {
                r2 = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f18324b.d(g.this.f18257i, r2);
            }
        }

        /* renamed from: com.applovin.impl.mediation.g$a$18 */
        /* loaded from: classes.dex */
        public class AnonymousClass18 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ com.applovin.impl.mediation.a.c f18346a;

            /* renamed from: b */
            final /* synthetic */ MaxReward f18347b;

            /* renamed from: c */
            final /* synthetic */ Bundle f18348c;

            public AnonymousClass18(com.applovin.impl.mediation.a.c cVar, MaxReward maxReward, Bundle bundle) {
                r2 = cVar;
                r3 = maxReward;
                r4 = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f18324b.a(r2, r3, r4);
            }
        }

        /* renamed from: com.applovin.impl.mediation.g$a$19 */
        /* loaded from: classes.dex */
        public class AnonymousClass19 implements Runnable {
            public AnonymousClass19() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f18324b.onRewardedVideoStarted(g.this.f18257i);
            }
        }

        /* renamed from: com.applovin.impl.mediation.g$a$2 */
        /* loaded from: classes.dex */
        public class AnonymousClass2 implements Runnable {
            public AnonymousClass2() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f18324b.onRewardedVideoCompleted(g.this.f18257i);
            }
        }

        /* renamed from: com.applovin.impl.mediation.g$a$3 */
        /* loaded from: classes.dex */
        public class AnonymousClass3 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Bundle f18352a;

            public AnonymousClass3(Bundle bundle) {
                r2 = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f18324b.d(g.this.f18257i, r2);
            }
        }

        /* renamed from: com.applovin.impl.mediation.g$a$4 */
        /* loaded from: classes.dex */
        public class AnonymousClass4 implements Runnable {
            public AnonymousClass4() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f18324b.onRewardedVideoStarted(g.this.f18257i);
            }
        }

        /* renamed from: com.applovin.impl.mediation.g$a$5 */
        /* loaded from: classes.dex */
        public class AnonymousClass5 implements Runnable {
            public AnonymousClass5() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f18324b.onRewardedVideoCompleted(g.this.f18257i);
            }
        }

        /* renamed from: com.applovin.impl.mediation.g$a$6 */
        /* loaded from: classes.dex */
        public class AnonymousClass6 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Bundle f18356a;

            public AnonymousClass6(Bundle bundle) {
                r2 = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f18324b.d(g.this.f18257i, r2);
            }
        }

        /* renamed from: com.applovin.impl.mediation.g$a$7 */
        /* loaded from: classes.dex */
        public class AnonymousClass7 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Bundle f18358a;

            public AnonymousClass7(Bundle bundle) {
                r2 = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f18324b.d(g.this.f18257i, r2);
            }
        }

        /* renamed from: com.applovin.impl.mediation.g$a$8 */
        /* loaded from: classes.dex */
        public class AnonymousClass8 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Bundle f18360a;

            public AnonymousClass8(Bundle bundle) {
                r2 = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f18324b.e(g.this.f18257i, r2);
            }
        }

        /* renamed from: com.applovin.impl.mediation.g$a$9 */
        /* loaded from: classes.dex */
        public class AnonymousClass9 implements Runnable {
            public AnonymousClass9() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f18324b.onAdCollapsed(g.this.f18257i);
            }
        }

        private a() {
        }

        private void b(String str, Bundle bundle) {
            if (g.this.f18257i.z().get()) {
                y unused = g.this.f18252c;
                if (y.a()) {
                    g.this.f18252c.e("MediationAdapterWrapper", g.this.f + ": blocking ad displayed callback for " + g.this.f18257i + " since onAdHidden() has been called");
                }
                g.this.f18251b.ab().b(g.this.f18257i, str);
                return;
            }
            if (g.this.f18257i.y().compareAndSet(false, true)) {
                a(str, this.f18324b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.13

                    /* renamed from: a */
                    final /* synthetic */ Bundle f18335a;

                    public AnonymousClass13(Bundle bundle2) {
                        r2 = bundle2;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.f18324b.b(g.this.f18257i, r2);
                    }
                });
            }
        }

        private void c(String str, Bundle bundle) {
            if (g.this.f18257i.z().compareAndSet(false, true)) {
                a(str, this.f18324b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.15

                    /* renamed from: a */
                    final /* synthetic */ Bundle f18340a;

                    public AnonymousClass15(Bundle bundle2) {
                        r2 = bundle2;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.f18324b.c(g.this.f18257i, r2);
                    }
                });
            }
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdClicked() {
            onAdViewAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdCollapsed() {
            onAdViewAdCollapsed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onAdViewAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayed() {
            onAdViewAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdExpanded() {
            onAdViewAdExpanded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdHidden() {
            onAdViewAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoadFailed(MaxAdapterError maxAdapterError) {
            y unused = g.this.f18252c;
            if (y.a()) {
                g.this.f18252c.d("MediationAdapterWrapper", g.this.f + ": adview ad ad failed to load with error: " + maxAdapterError);
            }
            a("onAdViewAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoaded(View view) {
            onAdViewAdLoaded(view, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdClicked() {
            onAppOpenAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onAppOpenAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayed() {
            onAppOpenAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdHidden() {
            onAppOpenAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoadFailed(MaxAdapterError maxAdapterError) {
            y unused = g.this.f18252c;
            if (y.a()) {
                g.this.f18252c.d("MediationAdapterWrapper", g.this.f + ": app open ad failed to load with error: " + maxAdapterError);
            }
            a("onAppOpenAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoaded() {
            onAppOpenAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdClicked() {
            onInterstitialAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onInterstitialAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayed() {
            onInterstitialAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdHidden() {
            onInterstitialAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoadFailed(MaxAdapterError maxAdapterError) {
            y unused = g.this.f18252c;
            if (y.a()) {
                g.this.f18252c.d("MediationAdapterWrapper", g.this.f + ": interstitial ad failed to load with error " + maxAdapterError);
            }
            a("onInterstitialAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoaded() {
            onInterstitialAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdClicked() {
            onNativeAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdDisplayed(Bundle bundle) {
            y unused = g.this.f18252c;
            if (y.a()) {
                y yVar = g.this.f18252c;
                l.w(g.this, new StringBuilder(), ": native ad displayed with extra info: ", bundle, yVar, "MediationAdapterWrapper");
            }
            b("onNativeAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdLoadFailed(MaxAdapterError maxAdapterError) {
            y unused = g.this.f18252c;
            if (y.a()) {
                g.this.f18252c.d("MediationAdapterWrapper", g.this.f + ": native ad ad failed to load with error: " + maxAdapterError);
            }
            a("onNativeAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdLoaded(MaxNativeAd maxNativeAd, Bundle bundle) {
            y unused = g.this.f18252c;
            if (y.a()) {
                y yVar = g.this.f18252c;
                l.w(g.this, new StringBuilder(), ": native ad loaded with extra info: ", bundle, yVar, "MediationAdapterWrapper");
            }
            g.this.f18259k = maxNativeAd;
            a("onNativeAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdClicked() {
            onRewardedAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onRewardedAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayed() {
            onRewardedAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdHidden() {
            onRewardedAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoadFailed(MaxAdapterError maxAdapterError) {
            y unused = g.this.f18252c;
            if (y.a()) {
                g.this.f18252c.d("MediationAdapterWrapper", g.this.f + ": rewarded ad failed to load with error: " + maxAdapterError);
            }
            a("onRewardedAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoaded() {
            onRewardedAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdVideoCompleted() {
            y unused = g.this.f18252c;
            if (y.a()) {
                g.this.f18252c.c("MediationAdapterWrapper", g.this.f + ": rewarded video completed");
            }
            a("onRewardedAdVideoCompleted", this.f18324b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.2
                public AnonymousClass2() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.f18324b.onRewardedVideoCompleted(g.this.f18257i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdVideoStarted() {
            y unused = g.this.f18252c;
            if (y.a()) {
                g.this.f18252c.c("MediationAdapterWrapper", g.this.f + ": rewarded video started");
            }
            a("onRewardedAdVideoStarted", this.f18324b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.19
                public AnonymousClass19() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.f18324b.onRewardedVideoStarted(g.this.f18257i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdClicked() {
            onRewardedInterstitialAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onRewardedInterstitialAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdDisplayed() {
            onRewardedInterstitialAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdHidden() {
            onRewardedInterstitialAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdLoadFailed(MaxAdapterError maxAdapterError) {
            y unused = g.this.f18252c;
            if (y.a()) {
                g.this.f18252c.d("MediationAdapterWrapper", g.this.f + ": rewarded ad failed to load with error: " + maxAdapterError);
            }
            a("onRewardedInterstitialAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdLoaded() {
            onRewardedInterstitialAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdVideoCompleted() {
            y unused = g.this.f18252c;
            if (y.a()) {
                g.this.f18252c.c("MediationAdapterWrapper", g.this.f + ": rewarded interstitial completed");
            }
            a("onRewardedInterstitialAdVideoCompleted", this.f18324b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.5
                public AnonymousClass5() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.f18324b.onRewardedVideoCompleted(g.this.f18257i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdVideoStarted() {
            y unused = g.this.f18252c;
            if (y.a()) {
                g.this.f18252c.c("MediationAdapterWrapper", g.this.f + ": rewarded interstitial started");
            }
            a("onRewardedInterstitialAdVideoStarted", this.f18324b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.4
                public AnonymousClass4() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.f18324b.onRewardedVideoStarted(g.this.f18257i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener, com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onUserRewarded(MaxReward maxReward) {
            onUserRewarded(maxReward, null);
        }

        public /* synthetic */ a(g gVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdClicked(Bundle bundle) {
            y unused = g.this.f18252c;
            if (y.a()) {
                y yVar = g.this.f18252c;
                l.w(g.this, new StringBuilder(), ": adview ad clicked with extra info: ", bundle, yVar, "MediationAdapterWrapper");
            }
            a("onAdViewAdClicked", this.f18324b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.7

                /* renamed from: a */
                final /* synthetic */ Bundle f18358a;

                public AnonymousClass7(Bundle bundle2) {
                    r2 = bundle2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.f18324b.d(g.this.f18257i, r2);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdCollapsed(Bundle bundle) {
            y unused = g.this.f18252c;
            if (y.a()) {
                g.this.f18252c.c("MediationAdapterWrapper", g.this.f + ": adview ad collapsed");
            }
            a("onAdViewAdCollapsed", this.f18324b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.9
                public AnonymousClass9() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.f18324b.onAdCollapsed(g.this.f18257i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            y unused = g.this.f18252c;
            if (y.a()) {
                g.this.f18252c.d("MediationAdapterWrapper", g.this.f + ": adview ad failed to display with error: " + maxAdapterError);
            }
            a("onAdViewAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayed(Bundle bundle) {
            y unused = g.this.f18252c;
            if (y.a()) {
                y yVar = g.this.f18252c;
                l.w(g.this, new StringBuilder(), ": adview ad displayed with extra info: ", bundle, yVar, "MediationAdapterWrapper");
            }
            b("onAdViewAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdExpanded(Bundle bundle) {
            y unused = g.this.f18252c;
            if (y.a()) {
                g.this.f18252c.c("MediationAdapterWrapper", g.this.f + ": adview ad expanded");
            }
            a("onAdViewAdExpanded", this.f18324b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.8

                /* renamed from: a */
                final /* synthetic */ Bundle f18360a;

                public AnonymousClass8(Bundle bundle2) {
                    r2 = bundle2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.f18324b.e(g.this.f18257i, r2);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdHidden(Bundle bundle) {
            y unused = g.this.f18252c;
            if (y.a()) {
                y yVar = g.this.f18252c;
                l.w(g.this, new StringBuilder(), ": adview ad hidden with extra info: ", bundle, yVar, "MediationAdapterWrapper");
            }
            c("onAdViewAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoaded(View view, Bundle bundle) {
            y unused = g.this.f18252c;
            if (y.a()) {
                y yVar = g.this.f18252c;
                l.w(g.this, new StringBuilder(), ": adview ad loaded with extra info: ", bundle, yVar, "MediationAdapterWrapper");
            }
            g.this.f18258j = view;
            a("onAdViewAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdClicked(Bundle bundle) {
            y unused = g.this.f18252c;
            if (y.a()) {
                y yVar = g.this.f18252c;
                l.w(g.this, new StringBuilder(), ": app open ad clicked with extra info: ", bundle, yVar, "MediationAdapterWrapper");
            }
            a("onAppOpenAdClicked", this.f18324b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.6

                /* renamed from: a */
                final /* synthetic */ Bundle f18356a;

                public AnonymousClass6(Bundle bundle2) {
                    r2 = bundle2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.f18324b.d(g.this.f18257i, r2);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            y unused = g.this.f18252c;
            if (y.a()) {
                g.this.f18252c.d("MediationAdapterWrapper", g.this.f + ": app open ad display failed with error: " + maxAdapterError);
            }
            a("onAppOpenAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayed(Bundle bundle) {
            y unused = g.this.f18252c;
            if (y.a()) {
                y yVar = g.this.f18252c;
                l.w(g.this, new StringBuilder(), ": app open ad displayed with extra info: ", bundle, yVar, "MediationAdapterWrapper");
            }
            b("onAppOpenAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdHidden(Bundle bundle) {
            y unused = g.this.f18252c;
            if (y.a()) {
                y yVar = g.this.f18252c;
                l.w(g.this, new StringBuilder(), ": app open ad hidden with extra info: ", bundle, yVar, "MediationAdapterWrapper");
            }
            c("onAppOpenAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoaded(Bundle bundle) {
            y unused = g.this.f18252c;
            if (y.a()) {
                y yVar = g.this.f18252c;
                l.w(g.this, new StringBuilder(), ": app open ad loaded with extra info: ", bundle, yVar, "MediationAdapterWrapper");
            }
            a("onAppOpenAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdClicked(Bundle bundle) {
            y unused = g.this.f18252c;
            if (y.a()) {
                y yVar = g.this.f18252c;
                l.w(g.this, new StringBuilder(), ": interstitial ad clicked with extra info: ", bundle, yVar, "MediationAdapterWrapper");
            }
            a("onInterstitialAdClicked", this.f18324b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.16

                /* renamed from: a */
                final /* synthetic */ Bundle f18342a;

                public AnonymousClass16(Bundle bundle2) {
                    r2 = bundle2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.f18324b.d(g.this.f18257i, r2);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            y unused = g.this.f18252c;
            if (y.a()) {
                g.this.f18252c.d("MediationAdapterWrapper", g.this.f + ": interstitial ad failed to display with error " + maxAdapterError);
            }
            a("onInterstitialAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayed(Bundle bundle) {
            y unused = g.this.f18252c;
            if (y.a()) {
                y yVar = g.this.f18252c;
                l.w(g.this, new StringBuilder(), ": interstitial ad displayed with extra info: ", bundle, yVar, "MediationAdapterWrapper");
            }
            b("onInterstitialAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdHidden(Bundle bundle) {
            y unused = g.this.f18252c;
            if (y.a()) {
                y yVar = g.this.f18252c;
                l.w(g.this, new StringBuilder(), ": interstitial ad hidden with extra info ", bundle, yVar, "MediationAdapterWrapper");
            }
            c("onInterstitialAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoaded(Bundle bundle) {
            y unused = g.this.f18252c;
            if (y.a()) {
                y yVar = g.this.f18252c;
                l.w(g.this, new StringBuilder(), ": interstitial ad loaded with extra info: ", bundle, yVar, "MediationAdapterWrapper");
            }
            a("onInterstitialAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdClicked(Bundle bundle) {
            y unused = g.this.f18252c;
            if (y.a()) {
                g.this.f18252c.c("MediationAdapterWrapper", g.this.f + ": native ad clicked");
            }
            a("onNativeAdClicked", this.f18324b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.10

                /* renamed from: a */
                final /* synthetic */ Bundle f18327a;

                public AnonymousClass10(Bundle bundle2) {
                    r2 = bundle2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.f18324b.d(g.this.f18257i, r2);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdClicked(Bundle bundle) {
            y unused = g.this.f18252c;
            if (y.a()) {
                y yVar = g.this.f18252c;
                l.w(g.this, new StringBuilder(), ": rewarded ad clicked with extra info: ", bundle, yVar, "MediationAdapterWrapper");
            }
            a("onRewardedAdClicked", this.f18324b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.17

                /* renamed from: a */
                final /* synthetic */ Bundle f18344a;

                public AnonymousClass17(Bundle bundle2) {
                    r2 = bundle2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.f18324b.d(g.this.f18257i, r2);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            y unused = g.this.f18252c;
            if (y.a()) {
                g.this.f18252c.d("MediationAdapterWrapper", g.this.f + ": rewarded ad display failed with error: " + maxAdapterError);
            }
            a("onRewardedAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayed(Bundle bundle) {
            y unused = g.this.f18252c;
            if (y.a()) {
                y yVar = g.this.f18252c;
                l.w(g.this, new StringBuilder(), ": rewarded ad displayed with extra info: ", bundle, yVar, "MediationAdapterWrapper");
            }
            b("onRewardedAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdHidden(Bundle bundle) {
            y unused = g.this.f18252c;
            if (y.a()) {
                y yVar = g.this.f18252c;
                l.w(g.this, new StringBuilder(), ": rewarded ad hidden with extra info: ", bundle, yVar, "MediationAdapterWrapper");
            }
            c("onRewardedAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoaded(Bundle bundle) {
            y unused = g.this.f18252c;
            if (y.a()) {
                y yVar = g.this.f18252c;
                l.w(g.this, new StringBuilder(), ": rewarded ad loaded with extra info: ", bundle, yVar, "MediationAdapterWrapper");
            }
            a("onRewardedAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdClicked(Bundle bundle) {
            y unused = g.this.f18252c;
            if (y.a()) {
                y yVar = g.this.f18252c;
                l.w(g.this, new StringBuilder(), ": rewarded interstitial ad clicked with extra info: ", bundle, yVar, "MediationAdapterWrapper");
            }
            a("onRewardedInterstitialAdClicked", this.f18324b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.3

                /* renamed from: a */
                final /* synthetic */ Bundle f18352a;

                public AnonymousClass3(Bundle bundle2) {
                    r2 = bundle2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.f18324b.d(g.this.f18257i, r2);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            y unused = g.this.f18252c;
            if (y.a()) {
                g.this.f18252c.d("MediationAdapterWrapper", g.this.f + ": rewarded interstitial ad display failed with error: " + maxAdapterError);
            }
            a("onRewardedInterstitialAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdDisplayed(Bundle bundle) {
            y unused = g.this.f18252c;
            if (y.a()) {
                y yVar = g.this.f18252c;
                l.w(g.this, new StringBuilder(), ": rewarded interstitial ad displayed with extra info: ", bundle, yVar, "MediationAdapterWrapper");
            }
            b("onRewardedInterstitialAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdHidden(Bundle bundle) {
            y unused = g.this.f18252c;
            if (y.a()) {
                y yVar = g.this.f18252c;
                l.w(g.this, new StringBuilder(), ": rewarded interstitial ad hidden with extra info: ", bundle, yVar, "MediationAdapterWrapper");
            }
            c("onRewardedInterstitialAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdLoaded(Bundle bundle) {
            y unused = g.this.f18252c;
            if (y.a()) {
                y yVar = g.this.f18252c;
                l.w(g.this, new StringBuilder(), ": rewarded interstitial ad loaded with extra info: ", bundle, yVar, "MediationAdapterWrapper");
            }
            a("onRewardedInterstitialAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener, com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onUserRewarded(MaxReward maxReward, Bundle bundle) {
            if (g.this.f18257i instanceof com.applovin.impl.mediation.a.c) {
                com.applovin.impl.mediation.a.c cVar = (com.applovin.impl.mediation.a.c) g.this.f18257i;
                if (cVar.O().compareAndSet(false, true)) {
                    y unused = g.this.f18252c;
                    if (y.a()) {
                        g.this.f18252c.c("MediationAdapterWrapper", g.this.f + ": user was rewarded: " + maxReward);
                    }
                    a("onUserRewarded", this.f18324b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.18

                        /* renamed from: a */
                        final /* synthetic */ com.applovin.impl.mediation.a.c f18346a;

                        /* renamed from: b */
                        final /* synthetic */ MaxReward f18347b;

                        /* renamed from: c */
                        final /* synthetic */ Bundle f18348c;

                        public AnonymousClass18(com.applovin.impl.mediation.a.c cVar2, MaxReward maxReward2, Bundle bundle2) {
                            r2 = cVar2;
                            r3 = maxReward2;
                            r4 = bundle2;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            a.this.f18324b.a(r2, r3, r4);
                        }
                    });
                }
            }
        }

        public void a(MediationServiceImpl.a aVar) {
            if (aVar != null) {
                this.f18324b = aVar;
                return;
            }
            throw new IllegalArgumentException("No listener specified");
        }

        private void a(String str, Bundle bundle) {
            if (!g.this.f18257i.z().get()) {
                g.this.f18264q.set(true);
                a(str, this.f18324b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.1

                    /* renamed from: a */
                    final /* synthetic */ Bundle f18325a;

                    public AnonymousClass1(Bundle bundle2) {
                        r2 = bundle2;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        if (g.this.f18263p.compareAndSet(false, true)) {
                            a.this.f18324b.a(g.this.f18257i, r2);
                        }
                    }
                });
                return;
            }
            y unused = g.this.f18252c;
            if (y.a()) {
                g.this.f18252c.e("MediationAdapterWrapper", g.this.f + ": blocking ad loaded callback for " + g.this.f18257i + " since onAdHidden() has been called");
            }
            g.this.f18251b.ab().b(g.this.f18257i, str);
        }

        public void a(String str, MaxError maxError) {
            if (g.this.f18257i.z().get()) {
                y unused = g.this.f18252c;
                if (y.a()) {
                    g.this.f18252c.e("MediationAdapterWrapper", g.this.f + ": blocking ad load failed callback for " + g.this.f18257i + " since onAdHidden() has been called");
                }
                g.this.f18251b.ab().b(g.this.f18257i, str);
                return;
            }
            a(str, this.f18324b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.12

                /* renamed from: a */
                final /* synthetic */ MaxError f18333a;

                public AnonymousClass12(MaxError maxError2) {
                    r2 = maxError2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (g.this.f18263p.compareAndSet(false, true)) {
                        a.this.f18324b.onAdLoadFailed(g.this.f18256h, r2);
                    }
                }
            });
        }

        public void a(String str, MaxError maxError, Bundle bundle) {
            if (g.this.f18257i.z().get()) {
                y unused = g.this.f18252c;
                if (y.a()) {
                    g.this.f18252c.e("MediationAdapterWrapper", g.this.f + ": blocking ad display failed callback for " + g.this.f18257i + " since onAdHidden() has been called");
                }
                g.this.f18251b.ab().b(g.this.f18257i, str);
                return;
            }
            a(str, this.f18324b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.14

                /* renamed from: a */
                final /* synthetic */ MaxError f18337a;

                /* renamed from: b */
                final /* synthetic */ Bundle f18338b;

                public AnonymousClass14(MaxError maxError2, Bundle bundle2) {
                    r2 = maxError2;
                    r3 = bundle2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.f18324b.a(g.this.f18257i, r2, r3);
                }
            });
        }

        private void a(String str, MaxAdListener maxAdListener, Runnable runnable) {
            g.this.f18250a.post(new Runnable() { // from class: com.applovin.impl.mediation.g.a.11

                /* renamed from: a */
                final /* synthetic */ Runnable f18329a;

                /* renamed from: b */
                final /* synthetic */ MaxAdListener f18330b;

                /* renamed from: c */
                final /* synthetic */ String f18331c;

                public AnonymousClass11(Runnable runnable2, MaxAdListener maxAdListener2, String str2) {
                    r2 = runnable2;
                    r3 = maxAdListener2;
                    r4 = str2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    String str2;
                    try {
                        r2.run();
                    } catch (Exception e10) {
                        MaxAdListener maxAdListener2 = r3;
                        if (maxAdListener2 != null) {
                            str2 = maxAdListener2.getClass().getName();
                        } else {
                            str2 = null;
                        }
                        y.c("MediationAdapterWrapper", k.m(new StringBuilder("Failed to forward call ("), r4, ") to ", str2), e10);
                    }
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public static class b implements MaxAdapter.OnCompletionListener {

        /* renamed from: a */
        private final p f18363a;

        /* renamed from: b */
        private final com.applovin.impl.mediation.a.f f18364b;

        /* renamed from: c */
        private final long f18365c;

        /* renamed from: d */
        private final Runnable f18366d;

        /* renamed from: com.applovin.impl.mediation.g$b$1 */
        /* loaded from: classes.dex */
        public class AnonymousClass1 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ MaxAdapter.InitializationStatus f18367a;

            /* renamed from: b */
            final /* synthetic */ String f18368b;

            public AnonymousClass1(MaxAdapter.InitializationStatus initializationStatus, String str) {
                r2 = initializationStatus;
                r3 = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f18363a.ao().a(b.this.f18364b, SystemClock.elapsedRealtime() - b.this.f18365c, r2, r3);
                if (b.this.f18366d != null) {
                    b.this.f18366d.run();
                }
            }
        }

        public b(p pVar, com.applovin.impl.mediation.a.f fVar, long j10, Runnable runnable) {
            this.f18363a = pVar;
            this.f18364b = fVar;
            this.f18365c = j10;
            this.f18366d = runnable;
        }

        @Override // com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener
        public void onCompletion(MaxAdapter.InitializationStatus initializationStatus, String str) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.g.b.1

                /* renamed from: a */
                final /* synthetic */ MaxAdapter.InitializationStatus f18367a;

                /* renamed from: b */
                final /* synthetic */ String f18368b;

                public AnonymousClass1(MaxAdapter.InitializationStatus initializationStatus2, String str2) {
                    r2 = initializationStatus2;
                    r3 = str2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    b.this.f18363a.ao().a(b.this.f18364b, SystemClock.elapsedRealtime() - b.this.f18365c, r2, r3);
                    if (b.this.f18366d != null) {
                        b.this.f18366d.run();
                    }
                }
            }, this.f18364b.aj());
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        private final com.applovin.impl.mediation.a.h f18370a;

        /* renamed from: b */
        private final MaxSignalCollectionListener f18371b;

        /* renamed from: c */
        private final AtomicBoolean f18372c = new AtomicBoolean();

        public c(com.applovin.impl.mediation.a.h hVar, MaxSignalCollectionListener maxSignalCollectionListener) {
            this.f18370a = hVar;
            this.f18371b = maxSignalCollectionListener;
        }
    }

    /* loaded from: classes.dex */
    public class d extends com.applovin.impl.sdk.e.a {
        public /* synthetic */ d(g gVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        private void a(com.applovin.impl.mediation.a.a aVar) {
            if (aVar != null) {
                this.f.ar().a(aVar);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!g.this.f18263p.get()) {
                if (g.this.f18257i.n()) {
                    if (y.a()) {
                        this.f18839h.b(this.f18838g, g.this.f + " is timing out, considering JS Tag ad loaded: " + g.this.f18257i);
                    }
                    a(g.this.f18257i);
                    return;
                }
                if (y.a()) {
                    this.f18839h.e(this.f18838g, g.this.f + " is timing out " + g.this.f18257i + "...");
                }
                a(g.this.f18257i);
                g.this.f18261m.a(this.f18838g, new MaxErrorImpl(-5101, "Adapter timed out"));
            }
        }

        private d() {
            super("TaskTimeoutMediatedAd", g.this.f18251b);
        }
    }

    /* loaded from: classes.dex */
    public class e extends com.applovin.impl.sdk.e.a {

        /* renamed from: b */
        private final c f18375b;

        public /* synthetic */ e(g gVar, c cVar, AnonymousClass1 anonymousClass1) {
            this(cVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f18375b.f18372c.get()) {
                if (y.a()) {
                    this.f18839h.e(this.f18838g, g.this.f + " is timing out " + this.f18375b.f18370a + "...");
                }
                g.this.b("The adapter (" + g.this.f + ") timed out", this.f18375b);
            }
        }

        private e(c cVar) {
            super("TaskTimeoutSignalCollection", g.this.f18251b);
            this.f18375b = cVar;
        }
    }

    public g(com.applovin.impl.mediation.a.f fVar, MaxAdapter maxAdapter, boolean z10, p pVar) {
        if (fVar != null) {
            if (maxAdapter != null) {
                if (pVar != null) {
                    this.f18253d = fVar.X();
                    this.f18255g = maxAdapter;
                    this.f18251b = pVar;
                    this.f18252c = pVar.L();
                    this.f18254e = fVar;
                    this.f = maxAdapter.getClass().getSimpleName();
                    this.f18265r = z10;
                    return;
                }
                throw new IllegalArgumentException("No sdk specified");
            }
            throw new IllegalArgumentException("No adapter specified");
        }
        throw new IllegalArgumentException("No adapter name specified");
    }

    public String toString() {
        return l.p(new StringBuilder("MediationAdapterWrapper{adapterTag='"), this.f, "'}");
    }

    public MaxNativeAdView c() {
        return this.f18260l;
    }

    public String d() {
        return this.f18253d;
    }

    public MediationServiceImpl.a e() {
        return this.f18261m.f18324b;
    }

    public boolean f() {
        return this.o.get();
    }

    public boolean g() {
        return this.f18263p.get() && this.f18264q.get();
    }

    public String h() {
        MaxAdapter maxAdapter = this.f18255g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getSdkVersion();
        } catch (Throwable th) {
            y.c("MediationAdapterWrapper", "Failed to get adapter's SDK version for " + this.f18253d, th);
            a("sdk_version");
            this.f18251b.an().a(this.f18254e.W(), "sdk_version", this.f18257i);
            return null;
        }
    }

    public String i() {
        MaxAdapter maxAdapter = this.f18255g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getAdapterVersion();
        } catch (Throwable th) {
            y.c("MediationAdapterWrapper", "Failed to get adapter version for " + this.f18253d, th);
            a("adapter_version");
            this.f18251b.an().a(this.f18254e.W(), "adapter_version", this.f18257i);
            return null;
        }
    }

    public void j() {
        if (this.f18265r) {
            return;
        }
        a("destroy", new Runnable() { // from class: com.applovin.impl.mediation.g.10
            public AnonymousClass10() {
            }

            @Override // java.lang.Runnable
            public void run() {
                g.this.a("destroy");
                g.this.f18255g.onDestroy();
                g.this.f18255g = null;
                g.this.f18258j = null;
                g.this.f18259k = null;
                g.this.f18260l = null;
            }
        });
    }

    public MaxNativeAd b() {
        return this.f18259k;
    }

    private boolean b(com.applovin.impl.mediation.a.a aVar, Activity activity) {
        if (aVar != null) {
            if (aVar.h() == null) {
                y.i("MediationAdapterWrapper", "Adapter has been garbage collected");
                this.f18261m.a("ad_show", new MaxErrorImpl(-1, "Adapter has been garbage collected"), (Bundle) null);
                return false;
            }
            if (aVar.h() == this) {
                if (activity == null && MaxAdFormat.APP_OPEN != aVar.getFormat()) {
                    throw new IllegalArgumentException("No activity specified");
                }
                if (!this.o.get()) {
                    String str = "Mediation adapter '" + this.f + "' is disabled. Showing ads with this adapter is disabled.";
                    y.i("MediationAdapterWrapper", str);
                    this.f18261m.a("ad_show", new MaxErrorImpl(-1, str), (Bundle) null);
                    return false;
                }
                if (g()) {
                    return true;
                }
                throw new IllegalStateException(l.p(new StringBuilder("Mediation adapter '"), this.f, "' does not have an ad loaded. Please load an ad first"));
            }
            throw new IllegalArgumentException("Mediated ad belongs to a different adapter");
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    public void a(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, Runnable runnable) {
        a("initialize", new Runnable() { // from class: com.applovin.impl.mediation.g.1

            /* renamed from: a */
            final /* synthetic */ Runnable f18266a;

            /* renamed from: b */
            final /* synthetic */ MaxAdapterInitializationParameters f18267b;

            /* renamed from: c */
            final /* synthetic */ Activity f18268c;

            public AnonymousClass1(Runnable runnable2, MaxAdapterInitializationParameters maxAdapterInitializationParameters2, Activity activity2) {
                r2 = runnable2;
                r3 = maxAdapterInitializationParameters2;
                r4 = activity2;
            }

            @Override // java.lang.Runnable
            public void run() {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                y unused = g.this.f18252c;
                if (y.a()) {
                    g.this.f18252c.b("MediationAdapterWrapper", "Initializing " + g.this.f + " on thread: " + Thread.currentThread() + " with 'run_on_ui_thread' value: " + g.this.f18254e.ae());
                }
                g.this.f18255g.initialize(r3, r4, new b(g.this.f18251b, g.this.f18254e, elapsedRealtime, r2));
            }
        });
    }

    public void a(String str, com.applovin.impl.mediation.a.a aVar) {
        this.f18256h = str;
        this.f18257i = aVar;
    }

    public View a() {
        return this.f18258j;
    }

    public void a(MaxNativeAdView maxNativeAdView) {
        this.f18260l = maxNativeAdView;
    }

    public void a(String str, MaxAdapterResponseParameters maxAdapterResponseParameters, com.applovin.impl.mediation.a.a aVar, Activity activity, MediationServiceImpl.a aVar2) {
        Runnable anonymousClass17;
        if (aVar != null) {
            if (!this.o.get()) {
                String str2 = "Mediation adapter '" + this.f + "' was disabled due to earlier failures. Loading ads with this adapter is disabled.";
                y.i("MediationAdapterWrapper", str2);
                aVar2.onAdLoadFailed(str, new MaxErrorImpl(-1, str2));
                return;
            }
            this.f18262n = maxAdapterResponseParameters;
            this.f18261m.a(aVar2);
            MaxAdFormat o = aVar.o() != null ? aVar.o() : aVar.getFormat();
            if (o == MaxAdFormat.INTERSTITIAL) {
                anonymousClass17 = new Runnable() { // from class: com.applovin.impl.mediation.g.12

                    /* renamed from: a */
                    final /* synthetic */ MaxAdapterResponseParameters f18274a;

                    /* renamed from: b */
                    final /* synthetic */ Activity f18275b;

                    public AnonymousClass12(MaxAdapterResponseParameters maxAdapterResponseParameters2, Activity activity2) {
                        r2 = maxAdapterResponseParameters2;
                        r3 = activity2;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        ((MaxInterstitialAdapter) g.this.f18255g).loadInterstitialAd(r2, r3, g.this.f18261m);
                    }
                };
            } else if (o == MaxAdFormat.APP_OPEN) {
                anonymousClass17 = new Runnable() { // from class: com.applovin.impl.mediation.g.13

                    /* renamed from: a */
                    final /* synthetic */ MaxAdapterResponseParameters f18277a;

                    /* renamed from: b */
                    final /* synthetic */ Activity f18278b;

                    public AnonymousClass13(MaxAdapterResponseParameters maxAdapterResponseParameters2, Activity activity2) {
                        r2 = maxAdapterResponseParameters2;
                        r3 = activity2;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        ((MaxAppOpenAdapter) g.this.f18255g).loadAppOpenAd(r2, r3, g.this.f18261m);
                    }
                };
            } else if (o == MaxAdFormat.REWARDED) {
                anonymousClass17 = new Runnable() { // from class: com.applovin.impl.mediation.g.14

                    /* renamed from: a */
                    final /* synthetic */ MaxAdapterResponseParameters f18280a;

                    /* renamed from: b */
                    final /* synthetic */ Activity f18281b;

                    public AnonymousClass14(MaxAdapterResponseParameters maxAdapterResponseParameters2, Activity activity2) {
                        r2 = maxAdapterResponseParameters2;
                        r3 = activity2;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        ((MaxRewardedAdapter) g.this.f18255g).loadRewardedAd(r2, r3, g.this.f18261m);
                    }
                };
            } else if (o == MaxAdFormat.REWARDED_INTERSTITIAL) {
                anonymousClass17 = new Runnable() { // from class: com.applovin.impl.mediation.g.15

                    /* renamed from: a */
                    final /* synthetic */ MaxAdapterResponseParameters f18283a;

                    /* renamed from: b */
                    final /* synthetic */ Activity f18284b;

                    public AnonymousClass15(MaxAdapterResponseParameters maxAdapterResponseParameters2, Activity activity2) {
                        r2 = maxAdapterResponseParameters2;
                        r3 = activity2;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        ((MaxRewardedInterstitialAdapter) g.this.f18255g).loadRewardedInterstitialAd(r2, r3, g.this.f18261m);
                    }
                };
            } else if (o == MaxAdFormat.NATIVE) {
                anonymousClass17 = new Runnable() { // from class: com.applovin.impl.mediation.g.16

                    /* renamed from: a */
                    final /* synthetic */ MaxAdapterResponseParameters f18286a;

                    /* renamed from: b */
                    final /* synthetic */ Activity f18287b;

                    public AnonymousClass16(MaxAdapterResponseParameters maxAdapterResponseParameters2, Activity activity2) {
                        r2 = maxAdapterResponseParameters2;
                        r3 = activity2;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        ((MediationAdapterBase) g.this.f18255g).loadNativeAd(r2, r3, g.this.f18261m);
                    }
                };
            } else if (o.isAdViewAd()) {
                anonymousClass17 = new Runnable() { // from class: com.applovin.impl.mediation.g.17

                    /* renamed from: a */
                    final /* synthetic */ MaxAdapterResponseParameters f18289a;

                    /* renamed from: b */
                    final /* synthetic */ MaxAdFormat f18290b;

                    /* renamed from: c */
                    final /* synthetic */ Activity f18291c;

                    public AnonymousClass17(MaxAdapterResponseParameters maxAdapterResponseParameters2, MaxAdFormat o6, Activity activity2) {
                        r2 = maxAdapterResponseParameters2;
                        r3 = o6;
                        r4 = activity2;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        ((MaxAdViewAdapter) g.this.f18255g).loadAdViewAd(r2, r3, r4, g.this.f18261m);
                    }
                };
            } else {
                throw new IllegalStateException("Failed to load " + aVar + ": " + aVar.getFormat() + " (" + aVar.o() + ") is not a supported ad format");
            }
            a("load_ad", new Runnable() { // from class: com.applovin.impl.mediation.g.18

                /* renamed from: a */
                final /* synthetic */ Runnable f18293a;

                /* renamed from: b */
                final /* synthetic */ com.applovin.impl.mediation.a.a f18294b;

                public AnonymousClass18(Runnable anonymousClass172, com.applovin.impl.mediation.a.a aVar3) {
                    r2 = anonymousClass172;
                    r3 = aVar3;
                }

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        r2.run();
                    } catch (Throwable th) {
                        String str3 = "Failed to start loading ad for " + g.this.f18253d + " due to: " + th;
                        y.i("MediationAdapterWrapper", str3);
                        g.this.f18261m.a("load_ad", new MaxErrorImpl(-1, str3));
                        g.this.a("load_ad");
                        g.this.f18251b.an().a(g.this.f18254e.W(), "load_ad", g.this.f18257i);
                    }
                    if (!g.this.f18263p.get()) {
                        long ai = g.this.f18254e.ai();
                        if (ai > 0) {
                            y unused = g.this.f18252c;
                            if (y.a()) {
                                y yVar = g.this.f18252c;
                                StringBuilder k10 = com.ironsource.adapters.facebook.a.k("Setting timeout ", ai, "ms. for ");
                                k10.append(r3);
                                yVar.b("MediationAdapterWrapper", k10.toString());
                            }
                            g.this.f18251b.M().a(new d(), o.a.MEDIATION_TIMEOUT, ai);
                            return;
                        }
                        y unused2 = g.this.f18252c;
                        if (y.a()) {
                            g.this.f18252c.b("MediationAdapterWrapper", "Negative timeout set for " + r3 + ", not scheduling a timeout");
                        }
                    }
                }
            });
            return;
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    public void b(String str, c cVar) {
        if (!cVar.f18372c.compareAndSet(false, true) || cVar.f18371b == null) {
            return;
        }
        cVar.f18371b.onSignalCollectionFailed(str);
    }

    public void a(com.applovin.impl.mediation.a.a aVar, Activity activity) {
        Runnable anonymousClass5;
        if (b(aVar, activity)) {
            if (aVar.o() != null) {
                anonymousClass5 = new Runnable() { // from class: com.applovin.impl.mediation.g.19

                    /* renamed from: a */
                    final /* synthetic */ com.applovin.impl.mediation.a.a f18296a;

                    /* renamed from: b */
                    final /* synthetic */ Activity f18297b;

                    public AnonymousClass19(com.applovin.impl.mediation.a.a aVar2, Activity activity2) {
                        r2 = aVar2;
                        r3 = activity2;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        g.this.f18251b.aq().a((com.applovin.impl.mediation.a.c) r2, r3, g.this.f18261m);
                    }
                };
            } else if (aVar2.getFormat() == MaxAdFormat.INTERSTITIAL) {
                anonymousClass5 = new Runnable() { // from class: com.applovin.impl.mediation.g.2

                    /* renamed from: a */
                    final /* synthetic */ Activity f18299a;

                    public AnonymousClass2(Activity activity2) {
                        r2 = activity2;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        ((MaxInterstitialAdapter) g.this.f18255g).showInterstitialAd(g.this.f18262n, r2, g.this.f18261m);
                    }
                };
            } else if (aVar2.getFormat() == MaxAdFormat.APP_OPEN) {
                anonymousClass5 = new Runnable() { // from class: com.applovin.impl.mediation.g.3

                    /* renamed from: a */
                    final /* synthetic */ Activity f18301a;

                    public AnonymousClass3(Activity activity2) {
                        r2 = activity2;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        ((MaxAppOpenAdapter) g.this.f18255g).showAppOpenAd(g.this.f18262n, r2, g.this.f18261m);
                    }
                };
            } else if (aVar2.getFormat() == MaxAdFormat.REWARDED) {
                anonymousClass5 = new Runnable() { // from class: com.applovin.impl.mediation.g.4

                    /* renamed from: a */
                    final /* synthetic */ Activity f18303a;

                    public AnonymousClass4(Activity activity2) {
                        r2 = activity2;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        ((MaxRewardedAdapter) g.this.f18255g).showRewardedAd(g.this.f18262n, r2, g.this.f18261m);
                    }
                };
            } else if (aVar2.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) {
                anonymousClass5 = new Runnable() { // from class: com.applovin.impl.mediation.g.5

                    /* renamed from: a */
                    final /* synthetic */ Activity f18305a;

                    public AnonymousClass5(Activity activity2) {
                        r2 = activity2;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        ((MaxRewardedInterstitialAdapter) g.this.f18255g).showRewardedInterstitialAd(g.this.f18262n, r2, g.this.f18261m);
                    }
                };
            } else {
                throw new IllegalStateException("Failed to show " + aVar2 + ": " + aVar2.getFormat() + " is not a supported ad format");
            }
            a(anonymousClass5, aVar2);
        }
    }

    public void a(com.applovin.impl.mediation.a.a aVar, ViewGroup viewGroup, androidx.lifecycle.i iVar, Activity activity) {
        Runnable anonymousClass7;
        if (b(aVar, activity)) {
            if (aVar.getFormat() == MaxAdFormat.INTERSTITIAL) {
                anonymousClass7 = new Runnable() { // from class: com.applovin.impl.mediation.g.6

                    /* renamed from: a */
                    final /* synthetic */ ViewGroup f18307a;

                    /* renamed from: b */
                    final /* synthetic */ androidx.lifecycle.i f18308b;

                    /* renamed from: c */
                    final /* synthetic */ Activity f18309c;

                    public AnonymousClass6(ViewGroup viewGroup2, androidx.lifecycle.i iVar2, Activity activity2) {
                        r2 = viewGroup2;
                        r3 = iVar2;
                        r4 = activity2;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        ((MaxInterstitialAdViewAdapter) g.this.f18255g).showInterstitialAd(g.this.f18262n, r2, r3, r4, g.this.f18261m);
                    }
                };
            } else if (aVar.getFormat() == MaxAdFormat.REWARDED) {
                anonymousClass7 = new Runnable() { // from class: com.applovin.impl.mediation.g.7

                    /* renamed from: a */
                    final /* synthetic */ ViewGroup f18311a;

                    /* renamed from: b */
                    final /* synthetic */ androidx.lifecycle.i f18312b;

                    /* renamed from: c */
                    final /* synthetic */ Activity f18313c;

                    public AnonymousClass7(ViewGroup viewGroup2, androidx.lifecycle.i iVar2, Activity activity2) {
                        r2 = viewGroup2;
                        r3 = iVar2;
                        r4 = activity2;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        ((MaxRewardedAdViewAdapter) g.this.f18255g).showRewardedAd(g.this.f18262n, r2, r3, r4, g.this.f18261m);
                    }
                };
            } else {
                throw new IllegalStateException("Failed to show " + aVar + ": " + aVar.getFormat() + " is not a supported ad format");
            }
            a(anonymousClass7, aVar);
        }
    }

    private void a(Runnable runnable, com.applovin.impl.mediation.a.a aVar) {
        a("show_ad", new Runnable() { // from class: com.applovin.impl.mediation.g.8

            /* renamed from: a */
            final /* synthetic */ Runnable f18315a;

            public AnonymousClass8(Runnable runnable2) {
                r2 = runnable2;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    r2.run();
                } catch (Throwable th) {
                    String str = "Failed to start displaying ad for " + g.this.f18253d + " due to: " + th;
                    y.i("MediationAdapterWrapper", str);
                    g.this.f18261m.a("show_ad", new MaxErrorImpl(-1, str), (Bundle) null);
                    g.this.a("show_ad");
                    g.this.f18251b.an().a(g.this.f18254e.W(), "show_ad", g.this.f18257i);
                }
            }
        });
    }

    public void a(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, com.applovin.impl.mediation.a.h hVar, Activity activity, MaxSignalCollectionListener maxSignalCollectionListener) {
        if (maxSignalCollectionListener != null) {
            if (!this.o.get()) {
                y.i("MediationAdapterWrapper", "Mediation adapter '" + this.f + "' is disabled. Signal collection ads with this adapter is disabled.");
                maxSignalCollectionListener.onSignalCollectionFailed("The adapter (" + this.f + ") is disabled");
                return;
            }
            c cVar = new c(hVar, maxSignalCollectionListener);
            MaxAdapter maxAdapter = this.f18255g;
            if (maxAdapter instanceof MaxSignalProvider) {
                a("collect_signal", new Runnable() { // from class: com.applovin.impl.mediation.g.9

                    /* renamed from: a */
                    final /* synthetic */ MaxSignalProvider f18317a;

                    /* renamed from: b */
                    final /* synthetic */ MaxAdapterSignalCollectionParameters f18318b;

                    /* renamed from: c */
                    final /* synthetic */ Activity f18319c;

                    /* renamed from: d */
                    final /* synthetic */ c f18320d;

                    /* renamed from: e */
                    final /* synthetic */ com.applovin.impl.mediation.a.h f18321e;

                    /* renamed from: com.applovin.impl.mediation.g$9$1 */
                    /* loaded from: classes.dex */
                    public class AnonymousClass1 implements MaxSignalCollectionListener {
                        public AnonymousClass1() {
                        }

                        @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
                        public void onSignalCollected(String str) {
                            AnonymousClass9 anonymousClass9 = AnonymousClass9.this;
                            g.this.a(str, r5);
                        }

                        @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
                        public void onSignalCollectionFailed(String str) {
                            AnonymousClass9 anonymousClass9 = AnonymousClass9.this;
                            g.this.b(str, r5);
                        }
                    }

                    public AnonymousClass9(MaxSignalProvider maxSignalProvider, MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters2, Activity activity2, c cVar2, com.applovin.impl.mediation.a.h hVar2) {
                        r2 = maxSignalProvider;
                        r3 = maxAdapterSignalCollectionParameters2;
                        r4 = activity2;
                        r5 = cVar2;
                        r6 = hVar2;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            r2.collectSignal(r3, r4, new MaxSignalCollectionListener() { // from class: com.applovin.impl.mediation.g.9.1
                                public AnonymousClass1() {
                                }

                                @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
                                public void onSignalCollected(String str) {
                                    AnonymousClass9 anonymousClass9 = AnonymousClass9.this;
                                    g.this.a(str, r5);
                                }

                                @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
                                public void onSignalCollectionFailed(String str) {
                                    AnonymousClass9 anonymousClass9 = AnonymousClass9.this;
                                    g.this.b(str, r5);
                                }
                            });
                        } catch (Throwable th) {
                            String str = "Failed signal collection for " + g.this.f18253d + " due to: " + th;
                            y.i("MediationAdapterWrapper", str);
                            g.this.b(str, r5);
                            g.this.a("collect_signal");
                            g.this.f18251b.an().a(g.this.f18254e.W(), "collect_signal", g.this.f18257i);
                        }
                        if (!r5.f18372c.get()) {
                            if (r6.ai() == 0) {
                                y unused = g.this.f18252c;
                                if (y.a()) {
                                    g.this.f18252c.b("MediationAdapterWrapper", "Failing signal collection " + r6 + " since it has 0 timeout");
                                }
                                g.this.b("The adapter (" + g.this.f + ") has 0 timeout", r5);
                                return;
                            }
                            if (r6.ai() > 0) {
                                y unused2 = g.this.f18252c;
                                if (y.a()) {
                                    g.this.f18252c.b("MediationAdapterWrapper", "Setting timeout " + r6.ai() + "ms. for " + r6);
                                }
                                g.this.f18251b.M().a(new e(r5), o.a.MEDIATION_TIMEOUT, r6.ai());
                                return;
                            }
                            y unused3 = g.this.f18252c;
                            if (y.a()) {
                                g.this.f18252c.b("MediationAdapterWrapper", "Negative timeout set for " + r6 + ", not scheduling a timeout");
                            }
                        }
                    }
                });
                return;
            } else {
                b(l.p(new StringBuilder("The adapter ("), this.f, ") does not support signal collection"), cVar2);
                return;
            }
        }
        throw new IllegalArgumentException("No callback specified");
    }

    public void a(String str, c cVar) {
        if (!cVar.f18372c.compareAndSet(false, true) || cVar.f18371b == null) {
            return;
        }
        cVar.f18371b.onSignalCollected(str);
    }

    public void a(String str) {
        if (y.a()) {
            this.f18252c.c("MediationAdapterWrapper", k.m(new StringBuilder("Marking "), this.f, " as disabled due to: ", str));
        }
        this.o.set(false);
    }

    private void a(String str, Runnable runnable) {
        AnonymousClass11 anonymousClass11 = new Runnable() { // from class: com.applovin.impl.mediation.g.11

            /* renamed from: a */
            final /* synthetic */ String f18271a;

            /* renamed from: b */
            final /* synthetic */ Runnable f18272b;

            public AnonymousClass11(String str2, Runnable runnable2) {
                r2 = str2;
                r3 = runnable2;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    y unused = g.this.f18252c;
                    if (y.a()) {
                        g.this.f18252c.b("MediationAdapterWrapper", g.this.f + ": running " + r2 + "...");
                    }
                    r3.run();
                    y unused2 = g.this.f18252c;
                    if (y.a()) {
                        g.this.f18252c.b("MediationAdapterWrapper", g.this.f + ": finished " + r2 + "");
                    }
                } catch (Throwable th) {
                    y.c("MediationAdapterWrapper", "Failed operation " + r2 + " for " + g.this.f18253d, th);
                    g gVar = g.this;
                    StringBuilder sb2 = new StringBuilder("fail_");
                    sb2.append(r2);
                    gVar.a(sb2.toString());
                    if (!r2.equals("destroy")) {
                        g.this.f18251b.an().a(g.this.f18254e.W(), r2, g.this.f18257i);
                    }
                }
            }
        };
        if (this.f18254e.ae()) {
            this.f18250a.post(anonymousClass11);
        } else {
            anonymousClass11.run();
        }
    }
}
