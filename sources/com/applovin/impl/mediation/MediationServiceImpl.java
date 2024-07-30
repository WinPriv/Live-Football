package com.applovin.impl.mediation;

import a3.l;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import com.applovin.impl.mediation.a.g;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.d;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.k;
import com.applovin.impl.sdk.w;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MediationServiceImpl implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a, reason: collision with root package name */
    private final p f17509a;

    /* renamed from: b, reason: collision with root package name */
    private final y f17510b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicReference<JSONObject> f17511c = new AtomicReference<>();

    /* loaded from: classes.dex */
    public class a implements a.InterfaceC0201a, MaxAdListener, MaxAdRevenueListener, MaxAdViewAdListener, MaxRewardedAdListener {

        /* renamed from: b, reason: collision with root package name */
        private final com.applovin.impl.mediation.a.a f17532b;

        /* renamed from: c, reason: collision with root package name */
        private a.InterfaceC0201a f17533c;

        public a(com.applovin.impl.mediation.a.a aVar, a.InterfaceC0201a interfaceC0201a) {
            this.f17532b = aVar;
            this.f17533c = interfaceC0201a;
        }

        public void b(MaxAd maxAd, Bundle bundle) {
            String str;
            this.f17532b.a(bundle);
            y unused = MediationServiceImpl.this.f17510b;
            if (y.a()) {
                MediationServiceImpl.this.f17510b.b("MediationService", "Scheduling impression for ad via callback...");
            }
            MediationServiceImpl.this.processCallbackAdImpressionPostback(this.f17532b, this.f17533c);
            MediationServiceImpl.this.f17509a.P().a(com.applovin.impl.sdk.d.f.f18809c);
            MediationServiceImpl.this.f17509a.P().a(com.applovin.impl.sdk.d.f.f);
            if (maxAd.getFormat().isFullscreenAd()) {
                com.applovin.impl.mediation.a.c cVar = (com.applovin.impl.mediation.a.c) maxAd;
                if (!cVar.S()) {
                    y unused2 = MediationServiceImpl.this.f17510b;
                    if (y.a()) {
                        y yVar = MediationServiceImpl.this.f17510b;
                        if (cVar.o() != null) {
                            str = " for hybrid ad";
                        } else {
                            str = "";
                        }
                        yVar.d("MediationService", "Received ad display callback before attempting show".concat(str));
                        return;
                    }
                    return;
                }
                MediationServiceImpl.this.f17509a.ab().a(this.f17532b, "DID_DISPLAY");
                MediationServiceImpl.this.f17509a.Z().a(this.f17532b);
                k.b(this.f17533c, maxAd);
                return;
            }
            MediationServiceImpl.this.f17509a.ab().a(this.f17532b, "DID_DISPLAY");
            k.b(this.f17533c, maxAd);
        }

        public void c(final MaxAd maxAd, Bundle bundle) {
            long j10;
            this.f17532b.a(bundle);
            MediationServiceImpl.this.f17509a.ab().a((com.applovin.impl.mediation.a.a) maxAd, "DID_HIDE");
            if (maxAd instanceof com.applovin.impl.mediation.a.c) {
                j10 = ((com.applovin.impl.mediation.a.c) maxAd).H();
            } else {
                j10 = 0;
            }
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl.a.1
                @Override // java.lang.Runnable
                public void run() {
                    if (maxAd.getFormat().isFullscreenAd()) {
                        MediationServiceImpl.this.f17509a.Z().b(maxAd);
                    }
                    k.c(a.this.f17533c, maxAd);
                }
            }, j10);
        }

        public void d(MaxAd maxAd, Bundle bundle) {
            this.f17532b.a(bundle);
            MediationServiceImpl.this.a(this.f17532b, this.f17533c);
            k.d(this.f17533c, maxAd);
        }

        public void e(MaxAd maxAd, Bundle bundle) {
            this.f17532b.a(bundle);
            k.g(this.f17533c, maxAd);
        }

        public void f(MaxAd maxAd, Bundle bundle) {
            this.f17532b.a(bundle);
            k.h(this.f17533c, maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            d(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdCollapsed(MaxAd maxAd) {
            f(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            a(maxAd, maxError, (Bundle) null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            b(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdExpanded(MaxAd maxAd) {
            e(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            c(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            this.f17532b.x();
            MediationServiceImpl.this.a(this.f17532b, maxError, this.f17533c);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            a(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onRewardedVideoCompleted(MaxAd maxAd) {
            k.f(this.f17533c, maxAd);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onRewardedVideoStarted(MaxAd maxAd) {
            k.e(this.f17533c, maxAd);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            a(maxAd, maxReward, (Bundle) null);
        }

        public void a(a.InterfaceC0201a interfaceC0201a) {
            this.f17533c = interfaceC0201a;
        }

        public void a(MaxAd maxAd, Bundle bundle) {
            this.f17532b.a(bundle);
            this.f17532b.x();
            MediationServiceImpl.this.a(this.f17532b);
            k.a((MaxAdListener) this.f17533c, maxAd);
        }

        public void a(MaxAd maxAd, MaxError maxError, Bundle bundle) {
            this.f17532b.a(bundle);
            MediationServiceImpl.this.b(this.f17532b, maxError, this.f17533c);
            if ((maxAd.getFormat() == MaxAdFormat.REWARDED || maxAd.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) && (maxAd instanceof com.applovin.impl.mediation.a.c)) {
                ((com.applovin.impl.mediation.a.c) maxAd).M();
            }
        }

        public void a(MaxAd maxAd, MaxReward maxReward, Bundle bundle) {
            this.f17532b.a(bundle);
            k.a(this.f17533c, maxAd, maxReward);
            MediationServiceImpl.this.f17509a.M().a(new com.applovin.impl.mediation.c.g((com.applovin.impl.mediation.a.c) maxAd, MediationServiceImpl.this.f17509a), o.a.MEDIATION_REWARD);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }
    }

    public MediationServiceImpl(p pVar) {
        this.f17509a = pVar;
        this.f17510b = pVar.L();
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
    }

    public void collectSignal(String str, MaxAdFormat maxAdFormat, final com.applovin.impl.mediation.a.h hVar, Context context, final g.a aVar) {
        Activity x10;
        if (hVar != null) {
            if (context != null) {
                if (aVar != null) {
                    final g a10 = this.f17509a.an().a(hVar, hVar.b());
                    if (a10 != null) {
                        if (context instanceof Activity) {
                            x10 = (Activity) context;
                        } else {
                            x10 = this.f17509a.x();
                        }
                        MaxAdapterParametersImpl a11 = MaxAdapterParametersImpl.a(hVar, str, maxAdFormat);
                        if (((Boolean) this.f17509a.a(com.applovin.impl.sdk.c.a.Q)).booleanValue()) {
                            this.f17509a.ao().a(hVar, x10);
                        }
                        MaxSignalCollectionListener maxSignalCollectionListener = new MaxSignalCollectionListener() { // from class: com.applovin.impl.mediation.MediationServiceImpl.3
                            @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
                            public void onSignalCollected(String str2) {
                                aVar.a(com.applovin.impl.mediation.a.g.a(hVar, a10, str2));
                                a10.j();
                            }

                            @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
                            public void onSignalCollectionFailed(String str2) {
                                MediationServiceImpl.this.a(str2, hVar, a10);
                                aVar.a(com.applovin.impl.mediation.a.g.b(hVar, a10, str2));
                                a10.j();
                            }
                        };
                        if (hVar.a()) {
                            if (this.f17509a.ao().a(hVar)) {
                                if (y.a()) {
                                    this.f17510b.b("MediationService", "Collecting signal for now-initialized adapter: " + a10.d());
                                }
                                a10.a(a11, hVar, x10, maxSignalCollectionListener);
                                return;
                            }
                            if (y.a()) {
                                this.f17510b.e("MediationService", "Skip collecting signal for not-initialized adapter: " + a10.d());
                            }
                            aVar.a(com.applovin.impl.mediation.a.g.a(hVar, "Adapter not initialized yet"));
                            return;
                        }
                        if (y.a()) {
                            this.f17510b.b("MediationService", "Collecting signal for adapter: " + a10.d());
                        }
                        a10.a(a11, hVar, x10, maxSignalCollectionListener);
                        return;
                    }
                    aVar.a(com.applovin.impl.mediation.a.g.a(hVar, "Could not load adapter"));
                    return;
                }
                throw new IllegalArgumentException("No callback specified");
            }
            throw new IllegalArgumentException("No context specified");
        }
        throw new IllegalArgumentException("No spec specified");
    }

    public void destroyAd(MaxAd maxAd) {
        if (!(maxAd instanceof com.applovin.impl.mediation.a.a)) {
            return;
        }
        if (y.a()) {
            this.f17510b.c("MediationService", "Destroying " + maxAd);
        }
        com.applovin.impl.mediation.a.a aVar = (com.applovin.impl.mediation.a.a) maxAd;
        g h10 = aVar.h();
        if (h10 != null) {
            h10.j();
            aVar.A();
        }
        this.f17509a.am().b(aVar.g());
    }

    public JSONObject getAndResetCustomPostBodyData() {
        return this.f17511c.getAndSet(null);
    }

    public void loadAd(String str, String str2, MaxAdFormat maxAdFormat, d.a aVar, Map<String, Object> map, Map<String, Object> map2, Context context, a.InterfaceC0201a interfaceC0201a) {
        if (!TextUtils.isEmpty(str)) {
            if (context != null) {
                if (interfaceC0201a != null) {
                    if (TextUtils.isEmpty(this.f17509a.s())) {
                        y.i("AppLovinSdk", "Mediation provider is null. Please set AppLovin SDK mediation provider via AppLovinSdk.getInstance(context).setMediationProvider()");
                    }
                    if (!this.f17509a.d()) {
                        y.h("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
                    }
                    this.f17509a.a();
                    if (str.length() != 16 && !str.startsWith("test_mode") && !this.f17509a.B().startsWith("05TMD")) {
                        StringBuilder s10 = l.s("Please double-check the ad unit ", str, " for ");
                        s10.append(maxAdFormat.getLabel());
                        s10.append(" : ");
                        s10.append(Log.getStackTraceString(new Throwable("")));
                        y.i("MediationService", s10.toString());
                    }
                    if (this.f17509a.a(maxAdFormat)) {
                        y.i("MediationService", "Ad load failed due to disabled ad format " + maxAdFormat.getLabel());
                        k.a(interfaceC0201a, str, new MaxErrorImpl(-1, "Disabled ad format " + maxAdFormat.getLabel()));
                        return;
                    }
                    k.a((MaxAdRequestListener) interfaceC0201a, str, true);
                    this.f17509a.au().a(str, str2, maxAdFormat, aVar, map, map2, context, interfaceC0201a);
                    return;
                }
                throw new IllegalArgumentException("No listener specified");
            }
            throw new IllegalArgumentException("No context specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    public void loadThirdPartyMediatedAd(String str, com.applovin.impl.mediation.a.a aVar, Activity activity, a.InterfaceC0201a interfaceC0201a) {
        if (aVar != null) {
            if (y.a()) {
                this.f17510b.b("MediationService", "Loading " + aVar + "...");
            }
            this.f17509a.ab().a(aVar, "WILL_LOAD");
            g a10 = this.f17509a.an().a(aVar);
            if (a10 != null) {
                MaxAdapterParametersImpl a11 = MaxAdapterParametersImpl.a(aVar);
                if (((Boolean) this.f17509a.a(com.applovin.impl.sdk.c.a.R)).booleanValue()) {
                    this.f17509a.ao().a(aVar, activity);
                }
                com.applovin.impl.mediation.a.a a12 = aVar.a(a10);
                a10.a(str, a12);
                a12.v();
                a10.a(str, a11, a12, activity, new a(a12, interfaceC0201a));
                return;
            }
            String str2 = "Failed to load " + aVar + ": adapter not loaded";
            y.i("MediationService", str2);
            a(aVar, new MaxErrorImpl(-5001, str2), interfaceC0201a);
            return;
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map<String, Object> map) {
        if ("com.applovin.render_process_gone".equals(intent.getAction())) {
            Object c10 = this.f17509a.Z().c();
            if (c10 instanceof com.applovin.impl.mediation.a.a) {
                processAdDisplayErrorPostback(MaxAdapterError.WEBVIEW_ERROR, (com.applovin.impl.mediation.a.a) c10);
            }
        }
    }

    public void processAdDisplayErrorPostback(MaxError maxError, com.applovin.impl.mediation.a.a aVar) {
        a("mierr", Collections.EMPTY_MAP, maxError, aVar);
    }

    public void processAdLossPostback(com.applovin.impl.mediation.a.a aVar, Float f) {
        String str;
        if (f != null) {
            str = f.toString();
        } else {
            str = "";
        }
        Map<String, String> map = CollectionUtils.map(1);
        map.put("{MBR}", str);
        a("mloss", map, aVar);
    }

    public void processAdapterInitializationPostback(com.applovin.impl.mediation.a.f fVar, long j10, MaxAdapter.InitializationStatus initializationStatus, String str) {
        Map<String, String> map = CollectionUtils.map(2);
        map.put("{INIT_STATUS}", String.valueOf(initializationStatus.getCode()));
        map.put("{INIT_TIME_MS}", String.valueOf(j10));
        a("minit", map, new MaxErrorImpl(str), fVar);
    }

    public void processCallbackAdImpressionPostback(com.applovin.impl.mediation.a.a aVar, a.InterfaceC0201a interfaceC0201a) {
        if (aVar.e().endsWith("cimp")) {
            this.f17509a.ab().a(aVar);
            k.a((MaxAdRevenueListener) interfaceC0201a, (MaxAd) aVar);
        }
        Map<String, String> map = CollectionUtils.map(1);
        String emptyIfNull = StringUtils.emptyIfNull(this.f17509a.o());
        if (!((Boolean) this.f17509a.a(com.applovin.impl.sdk.c.b.dQ)).booleanValue()) {
            emptyIfNull = "";
        }
        map.put("{CUID}", emptyIfNull);
        a("mcimp", map, aVar);
    }

    public void processRawAdImpressionPostback(com.applovin.impl.mediation.a.a aVar, a.InterfaceC0201a interfaceC0201a) {
        this.f17509a.ab().a(aVar, "WILL_DISPLAY");
        if (aVar.e().endsWith("mimp")) {
            this.f17509a.ab().a(aVar);
            k.a((MaxAdRevenueListener) interfaceC0201a, (MaxAd) aVar);
        }
        Map<String, String> map = CollectionUtils.map(2);
        if (aVar instanceof com.applovin.impl.mediation.a.c) {
            map.put("{TIME_TO_SHOW_MS}", String.valueOf(((com.applovin.impl.mediation.a.c) aVar).F()));
        }
        String emptyIfNull = StringUtils.emptyIfNull(this.f17509a.o());
        if (!((Boolean) this.f17509a.a(com.applovin.impl.sdk.c.b.dQ)).booleanValue()) {
            emptyIfNull = "";
        }
        map.put("{CUID}", emptyIfNull);
        a("mimp", map, aVar);
    }

    public void processViewabilityAdImpressionPostback(com.applovin.impl.mediation.a.e eVar, long j10, a.InterfaceC0201a interfaceC0201a) {
        if (eVar.e().endsWith("vimp")) {
            this.f17509a.ab().a(eVar);
            k.a((MaxAdRevenueListener) interfaceC0201a, (MaxAd) eVar);
        }
        Map<String, String> map = CollectionUtils.map(3);
        map.put("{VIEWABILITY_FLAGS}", String.valueOf(j10));
        map.put("{USED_VIEWABILITY_TIMER}", String.valueOf(eVar.S()));
        String emptyIfNull = StringUtils.emptyIfNull(this.f17509a.o());
        if (!((Boolean) this.f17509a.a(com.applovin.impl.sdk.c.b.dQ)).booleanValue()) {
            emptyIfNull = "";
        }
        map.put("{CUID}", emptyIfNull);
        a("mvimp", map, eVar);
    }

    public void setCustomPostBodyData(JSONObject jSONObject) {
        this.f17511c.set(jSONObject);
    }

    public void showFullscreenAd(final com.applovin.impl.mediation.a.c cVar, final Activity activity, final a.InterfaceC0201a interfaceC0201a) {
        if (cVar != null) {
            if (activity == null && MaxAdFormat.APP_OPEN != cVar.getFormat()) {
                throw new IllegalArgumentException("No activity specified");
            }
            this.f17509a.Z().a(true);
            final g a10 = a(cVar);
            long G = cVar.G();
            if (y.a()) {
                this.f17510b.c("MediationService", "Showing ad " + cVar.getAdUnitId() + " with delay of " + G + "ms...");
            }
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl.1
                @Override // java.lang.Runnable
                public void run() {
                    cVar.a(true);
                    MediationServiceImpl.this.b(cVar);
                    a10.a(cVar, activity);
                    MediationServiceImpl.this.a(cVar, interfaceC0201a);
                }
            }, G);
            return;
        }
        throw new IllegalArgumentException("No ad specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.applovin.impl.mediation.a.c cVar) {
        if (cVar.getFormat() == MaxAdFormat.REWARDED || cVar.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) {
            this.f17509a.M().a(new com.applovin.impl.mediation.c.h(cVar, this.f17509a), o.a.MEDIATION_REWARD);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.applovin.impl.mediation.a.a aVar, MaxError maxError, MaxAdListener maxAdListener) {
        if (aVar.o() != null) {
            if (y.a()) {
                this.f17510b.e("MediationService", "Ignoring ad display failure for hybrid ad...");
            }
        } else {
            this.f17509a.ab().a(aVar, "DID_FAIL_DISPLAY");
            processAdDisplayErrorPostback(maxError, aVar);
            if (aVar.y().compareAndSet(false, true)) {
                k.a(maxAdListener, aVar, maxError);
            }
        }
    }

    private g a(com.applovin.impl.mediation.a.c cVar) {
        g h10 = cVar.h();
        if (h10 != null) {
            return h10;
        }
        this.f17509a.Z().a(false);
        if (y.a()) {
            this.f17510b.d("MediationService", "Failed to show " + cVar + ": adapter not found");
        }
        y.i("MediationService", "There may be an integration problem with the adapter for ad unit id '" + cVar.getAdUnitId() + "'. Please check if you have a supported version of that SDK integrated into your project.");
        throw new IllegalStateException("Could not find adapter for provided ad");
    }

    public void showFullscreenAd(final com.applovin.impl.mediation.a.c cVar, final ViewGroup viewGroup, final androidx.lifecycle.i iVar, final Activity activity, final a.InterfaceC0201a interfaceC0201a) {
        if (cVar == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (activity != null) {
            this.f17509a.Z().a(true);
            final g a10 = a(cVar);
            long G = cVar.G();
            if (y.a()) {
                this.f17510b.c("MediationService", "Showing ad " + cVar.getAdUnitId() + " with delay of " + G + "ms...");
            }
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl.2
                @Override // java.lang.Runnable
                public void run() {
                    cVar.a(true);
                    MediationServiceImpl.this.b(cVar);
                    a10.a(cVar, viewGroup, iVar, activity);
                    MediationServiceImpl.this.a(cVar, interfaceC0201a);
                }
            }, G);
            return;
        }
        throw new IllegalArgumentException("No activity specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.c cVar, a.InterfaceC0201a interfaceC0201a) {
        this.f17509a.Z().a(false);
        a(cVar, (MaxAdListener) interfaceC0201a);
        if (y.a()) {
            this.f17510b.b("MediationService", "Scheduling impression for ad manually...");
        }
        processRawAdImpressionPostback(cVar, interfaceC0201a);
        if (cVar.o() == null || !cVar.y().get()) {
            return;
        }
        if (y.a()) {
            this.f17510b.b("MediationService", "Running ad displayed logic");
        }
        this.f17509a.ab().a(cVar, "DID_DISPLAY");
        this.f17509a.Z().a(cVar);
        k.b((MaxAdListener) interfaceC0201a, (MaxAd) cVar, true);
    }

    private void a(final com.applovin.impl.mediation.a.c cVar, final MaxAdListener maxAdListener) {
        final long longValue = ((Long) this.f17509a.a(com.applovin.impl.sdk.c.a.F)).longValue();
        if (longValue <= 0) {
            return;
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl.4
            @Override // java.lang.Runnable
            public void run() {
                if (cVar.y().get()) {
                    return;
                }
                String str = "Ad (" + cVar.Y() + ") has not been displayed after " + longValue + "ms. Failing ad display...";
                y.i("MediationService", str);
                MediationServiceImpl.this.b(cVar, new MaxErrorImpl(-1, str), maxAdListener);
                MediationServiceImpl.this.f17509a.Z().b(cVar);
            }
        }, longValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.a aVar, MaxError maxError, MaxAdListener maxAdListener) {
        a(maxError, aVar);
        destroyAd(aVar);
        k.a(maxAdListener, aVar.getAdUnitId(), maxError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.a aVar) {
        this.f17509a.ab().a(aVar, "DID_LOAD");
        if (aVar.e().endsWith("load")) {
            this.f17509a.ab().a(aVar);
        }
        Map<String, String> map = CollectionUtils.map(3);
        map.put("{LOAD_TIME_MS}", String.valueOf(aVar.u()));
        if (aVar.getFormat().isFullscreenAd()) {
            w.a b10 = this.f17509a.Z().b(aVar.getAdUnitId());
            map.put("{SHOW_ATTEMPT_COUNT}", String.valueOf(b10.b()));
            map.put("{SHOW_ATTEMPT_TIMESTAMP_MS}", String.valueOf(b10.a()));
        }
        a("load", map, aVar);
    }

    private void a(MaxError maxError, com.applovin.impl.mediation.a.a aVar) {
        Map<String, String> map = CollectionUtils.map(3);
        map.put("{LOAD_TIME_MS}", String.valueOf(aVar.u()));
        if (aVar.getFormat().isFullscreenAd()) {
            w.a b10 = this.f17509a.Z().b(aVar.getAdUnitId());
            map.put("{SHOW_ATTEMPT_COUNT}", String.valueOf(b10.b()));
            map.put("{SHOW_ATTEMPT_TIMESTAMP_MS}", String.valueOf(b10.a()));
        }
        a("mlerr", map, maxError, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.a aVar, a.InterfaceC0201a interfaceC0201a) {
        this.f17509a.ab().a(aVar, "DID_CLICKED");
        this.f17509a.ab().a(aVar, "DID_CLICK");
        if (aVar.e().endsWith("click")) {
            this.f17509a.ab().a(aVar);
            k.a((MaxAdRevenueListener) interfaceC0201a, (MaxAd) aVar);
        }
        Map<String, String> map = CollectionUtils.map(1);
        String emptyIfNull = StringUtils.emptyIfNull(this.f17509a.o());
        if (!((Boolean) this.f17509a.a(com.applovin.impl.sdk.c.b.dQ)).booleanValue()) {
            emptyIfNull = "";
        }
        map.put("{CUID}", emptyIfNull);
        a("mclick", map, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, com.applovin.impl.mediation.a.h hVar, g gVar) {
        Map<String, String> map = CollectionUtils.map(2);
        CollectionUtils.putStringIfValid("{ADAPTER_VERSION}", gVar.i(), map);
        CollectionUtils.putStringIfValid("{SDK_VERSION}", gVar.h(), map);
        a("serr", map, new MaxErrorImpl(str), hVar);
    }

    private void a(String str, Map<String, String> map, com.applovin.impl.mediation.a.f fVar) {
        a(str, map, (MaxError) null, fVar);
    }

    private void a(String str, Map<String, String> map, MaxError maxError, com.applovin.impl.mediation.a.f fVar) {
        Map map2 = CollectionUtils.map(map);
        map2.put("{PLACEMENT}", StringUtils.emptyIfNull(fVar.getPlacement()));
        map2.put("{CUSTOM_DATA}", StringUtils.emptyIfNull(fVar.al()));
        if (fVar instanceof com.applovin.impl.mediation.a.a) {
            map2.put("{CREATIVE_ID}", StringUtils.emptyIfNull(((com.applovin.impl.mediation.a.a) fVar).getCreativeId()));
        }
        this.f17509a.M().a(new com.applovin.impl.mediation.c.d(str, map2, maxError, fVar, this.f17509a), o.a.MEDIATION_POSTBACKS);
    }
}
