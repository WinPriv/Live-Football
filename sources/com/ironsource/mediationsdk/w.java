package com.ironsource.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.ads.ep;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractC1414b;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.Q;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.k;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class w extends k0 implements com.ironsource.mediationsdk.sdk.h, com.ironsource.mediationsdk.utils.d, com.ironsource.mediationsdk.utils.i {

    /* renamed from: m, reason: collision with root package name */
    public final String f25965m = w.class.getName();

    /* renamed from: n, reason: collision with root package name */
    public com.ironsource.mediationsdk.sdk.i f25966n;
    public boolean o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f25967p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f25968q;

    /* renamed from: r, reason: collision with root package name */
    public InterstitialPlacement f25969r;

    /* renamed from: s, reason: collision with root package name */
    public final C1430u f25970s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f25971t;

    /* renamed from: u, reason: collision with root package name */
    public long f25972u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f25973v;

    public w() {
        new CopyOnWriteArraySet();
        new ConcurrentHashMap();
        this.f25970s = C1430u.a();
        this.f25971t = false;
        this.f25967p = false;
        this.o = false;
        this.f25551a = new com.ironsource.mediationsdk.utils.e("interstitial", this);
        this.f25973v = false;
    }

    @Override // com.ironsource.mediationsdk.sdk.h
    public final synchronized void a(J j10) {
        this.f25557h.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, j10.f25324e + " :onInterstitialInitSuccess()", 1);
        d(IronSourceConstants.IS_INSTANCE_INIT_SUCCESS, j10, null, false);
        this.f25968q = true;
        if (this.o) {
            AbstractC1414b.a aVar = AbstractC1414b.a.LOAD_PENDING;
            if (c(AbstractC1414b.a.AVAILABLE, aVar) < this.f25552b) {
                j10.a(aVar);
                i(j10);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.h
    public final void b(J j10) {
        this.f25557h.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, a3.l.p(new StringBuilder(), j10.f25324e, ":onInterstitialAdOpened()"), 1);
        d(IronSourceConstants.IS_INSTANCE_OPENED, j10, null, true);
        this.f25966n.onInterstitialAdOpened();
    }

    public final int c(AbstractC1414b.a... aVarArr) {
        Iterator<AbstractC1414b> it = this.f25553c.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            AbstractC1414b next = it.next();
            for (AbstractC1414b.a aVar : aVarArr) {
                if (next.f25320a == aVar) {
                    i10++;
                }
            }
        }
        return i10;
    }

    public final void d(int i10, AbstractC1414b abstractC1414b, Object[][] objArr, boolean z10) {
        JSONObject providerAdditionalData = IronSourceUtils.getProviderAdditionalData(abstractC1414b);
        if (z10) {
            try {
                InterstitialPlacement interstitialPlacement = this.f25969r;
                if (interstitialPlacement != null && !TextUtils.isEmpty(interstitialPlacement.getPlacementName())) {
                    providerAdditionalData.put("placement", this.f25969r.getPlacementName());
                }
            } catch (Exception e10) {
                this.f25557h.log(IronSourceLogger.IronSourceTag.INTERNAL, "InterstitialManager logProviderEvent " + Log.getStackTraceString(e10), 3);
            }
        }
        if (objArr != null) {
            for (Object[] objArr2 : objArr) {
                providerAdditionalData.put(objArr2[0].toString(), objArr2[1]);
            }
        }
        com.ironsource.mediationsdk.a.d.d().b(new com.ironsource.mediationsdk.a.c(i10, providerAdditionalData));
    }

    public final void e(int i10, Object[][] objArr, boolean z10) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        if (z10) {
            try {
                InterstitialPlacement interstitialPlacement = this.f25969r;
                if (interstitialPlacement != null && !TextUtils.isEmpty(interstitialPlacement.getPlacementName())) {
                    mediationAdditionalData.put("placement", this.f25969r.getPlacementName());
                }
            } catch (Exception e10) {
                this.f25557h.log(IronSourceLogger.IronSourceTag.INTERNAL, "InterstitialManager logMediationEvent " + Log.getStackTraceString(e10), 3);
            }
        }
        if (objArr != null) {
            for (Object[] objArr2 : objArr) {
                mediationAdditionalData.put(objArr2[0].toString(), objArr2[1]);
            }
        }
        com.ironsource.mediationsdk.a.d.d().b(new com.ironsource.mediationsdk.a.c(i10, mediationAdditionalData));
    }

    public final void f(Context context, boolean z10) {
        this.f25557h.log(IronSourceLogger.IronSourceTag.INTERNAL, this.f25965m + " Should Track Network State: " + z10, 0);
        this.f25558i = z10;
    }

    @Override // com.ironsource.mediationsdk.utils.d
    public final void g() {
        AbstractC1414b.a aVar;
        Iterator<AbstractC1414b> it = this.f25553c.iterator();
        while (it.hasNext()) {
            AbstractC1414b next = it.next();
            if (next.f25320a == AbstractC1414b.a.CAPPED_PER_DAY) {
                boolean z10 = true;
                d(IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, next, new Object[][]{new Object[]{"status", ep.V}}, false);
                if (next.c()) {
                    aVar = AbstractC1414b.a.CAPPED_PER_SESSION;
                } else {
                    if (next.f25328j < next.o) {
                        z10 = false;
                    }
                    if (z10) {
                        aVar = AbstractC1414b.a.EXHAUSTED;
                    } else {
                        aVar = AbstractC1414b.a.INITIATED;
                    }
                }
                next.a(aVar);
            }
        }
    }

    public final void h() {
        boolean z10;
        CopyOnWriteArrayList<AbstractC1414b> copyOnWriteArrayList = this.f25553c;
        Iterator<AbstractC1414b> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            AbstractC1414b.a aVar = it.next().f25320a;
            if (aVar == AbstractC1414b.a.NOT_INITIATED || aVar == AbstractC1414b.a.INIT_PENDING || aVar == AbstractC1414b.a.INITIATED || aVar == AbstractC1414b.a.LOAD_PENDING || aVar == AbstractC1414b.a.AVAILABLE) {
                z10 = false;
                break;
            }
        }
        z10 = true;
        if (z10) {
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            IronSourceLoggerManager ironSourceLoggerManager = this.f25557h;
            ironSourceLoggerManager.log(ironSourceTag, "Reset Iteration", 0);
            Iterator<AbstractC1414b> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                AbstractC1414b next = it2.next();
                if (next.f25320a == AbstractC1414b.a.EXHAUSTED) {
                    next.h();
                }
            }
            ironSourceLoggerManager.log(IronSourceLogger.IronSourceTag.INTERNAL, "End of Reset Iteration", 0);
        }
    }

    public final synchronized void i(J j10) {
        d(2002, j10, null, false);
        j10.getClass();
        try {
            j10.g();
            Timer timer = new Timer();
            j10.f25330l = timer;
            timer.schedule(new d0(j10), j10.f24834x * 1000);
        } catch (Exception e10) {
            j10.b("startLoadTimer", e10.getLocalizedMessage());
        }
        if (j10.f25321b != null) {
            j10.f25336s.log(IronSourceLogger.IronSourceTag.ADAPTER_API, j10.f25324e + ":loadInterstitial()", 1);
            j10.f24833v = new Date().getTime();
            j10.f25321b.loadInterstitial(j10.f24831t, null, j10);
        }
    }

    public final AbstractAdapter j() {
        AbstractAdapter abstractAdapter = null;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f25553c.size() && abstractAdapter == null; i11++) {
            if (this.f25553c.get(i11).f25320a != AbstractC1414b.a.AVAILABLE && this.f25553c.get(i11).f25320a != AbstractC1414b.a.INITIATED) {
                AbstractC1414b.a aVar = this.f25553c.get(i11).f25320a;
                AbstractC1414b.a aVar2 = AbstractC1414b.a.INIT_PENDING;
                if (aVar != aVar2 && this.f25553c.get(i11).f25320a != AbstractC1414b.a.LOAD_PENDING) {
                    if (this.f25553c.get(i11).f25320a == AbstractC1414b.a.NOT_INITIATED) {
                        J j10 = (J) this.f25553c.get(i11);
                        synchronized (this) {
                            this.f25557h.log(IronSourceLogger.IronSourceTag.NATIVE, this.f25965m + ":startAdapter(" + j10.j() + ")", 1);
                            C1416d a10 = C1416d.a();
                            NetworkSettings networkSettings = j10.f25322c;
                            AbstractAdapter a11 = a10.a(networkSettings, networkSettings.getInterstitialSettings(), false, false);
                            if (a11 == null) {
                                this.f25557h.log(IronSourceLogger.IronSourceTag.API, j10.f25324e + " is configured in IronSource's platform, but the adapter is not integrated", 2);
                            } else {
                                j10.f25321b = a11;
                                j10.a(aVar2);
                                b((AbstractC1414b) j10);
                                try {
                                    String str = this.f25556g;
                                    String str2 = this.f;
                                    try {
                                        j10.f();
                                        Timer timer = new Timer();
                                        j10.f25329k = timer;
                                        timer.schedule(new c0(j10), j10.f24834x * 1000);
                                    } catch (Exception e10) {
                                        j10.b("startInitTimer", e10.getLocalizedMessage());
                                    }
                                    AbstractAdapter abstractAdapter2 = j10.f25321b;
                                    if (abstractAdapter2 != null) {
                                        abstractAdapter2.addInterstitialListener(j10);
                                        j10.f25336s.log(IronSourceLogger.IronSourceTag.ADAPTER_API, j10.f25324e + ":initInterstitial()", 1);
                                        j10.f25321b.initInterstitial(str, str2, j10.f24831t, j10);
                                    }
                                    abstractAdapter = a11;
                                } catch (Throwable th) {
                                    this.f25557h.logException(IronSourceLogger.IronSourceTag.API, this.f25965m + "failed to init adapter: " + j10.j() + "v", th);
                                    j10.a(AbstractC1414b.a.INIT_FAILED);
                                }
                            }
                            abstractAdapter = null;
                        }
                        if (abstractAdapter == null) {
                            this.f25553c.get(i11).a(AbstractC1414b.a.INIT_FAILED);
                        }
                    } else {
                        continue;
                    }
                }
            }
            i10++;
            if (i10 >= this.f25552b) {
                break;
            }
        }
        return abstractAdapter;
    }

    public final synchronized void k() {
        Iterator<AbstractC1414b> it = this.f25553c.iterator();
        while (it.hasNext()) {
            AbstractC1414b next = it.next();
            AbstractC1414b.a aVar = next.f25320a;
            if (aVar == AbstractC1414b.a.AVAILABLE || aVar == AbstractC1414b.a.LOAD_PENDING || aVar == AbstractC1414b.a.NOT_AVAILABLE) {
                next.a(AbstractC1414b.a.INITIATED);
            }
        }
    }

    public final void l() {
        CopyOnWriteArrayList<AbstractC1414b> copyOnWriteArrayList;
        int i10 = 0;
        while (true) {
            copyOnWriteArrayList = this.f25553c;
            if (i10 < copyOnWriteArrayList.size()) {
                String providerTypeForReflection = copyOnWriteArrayList.get(i10).f25322c.getProviderTypeForReflection();
                if (providerTypeForReflection.equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME) || providerTypeForReflection.equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME)) {
                    break;
                } else {
                    i10++;
                }
            } else {
                return;
            }
        }
        C1416d.a().a(copyOnWriteArrayList.get(i10).f25322c, copyOnWriteArrayList.get(i10).f25322c.getInterstitialSettings(), false, false);
    }

    public final synchronized void c() {
        try {
            if (this.f25973v) {
                this.f25557h.log(IronSourceLogger.IronSourceTag.API, "loadInterstitial cannot be invoked while showing an ad", 3);
                F.a().a(new IronSourceError(IronSourceError.ERROR_IS_LOAD_DURING_SHOW, "loadInterstitial cannot be invoked while showing an ad"));
                return;
            }
            this.f25969r = null;
            this.f25966n.f25818e = null;
            if (!this.f25967p) {
                C1430u c1430u = this.f25970s;
                IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
                if (!c1430u.a(ad_unit)) {
                    Q.f b10 = Q.a().b();
                    if (b10 == Q.f.NOT_INIT) {
                        this.f25557h.log(IronSourceLogger.IronSourceTag.API, "init() must be called before loadInterstitial()", 3);
                        return;
                    }
                    if (b10 == Q.f.INIT_IN_PROGRESS) {
                        if (Q.a().c()) {
                            this.f25557h.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                            this.f25970s.a(ad_unit, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                            return;
                        } else {
                            this.f25972u = new Date().getTime();
                            e(2001, null, false);
                            this.o = true;
                            this.f25971t = true;
                            return;
                        }
                    }
                    if (b10 == Q.f.INIT_FAILED) {
                        this.f25557h.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                        this.f25970s.a(ad_unit, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                        return;
                    }
                    if (this.f25553c.size() == 0) {
                        this.f25557h.log(IronSourceLogger.IronSourceTag.API, "the server response does not contain interstitial data", 3);
                        this.f25970s.a(ad_unit, ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", "Interstitial"));
                        return;
                    }
                    this.f25972u = new Date().getTime();
                    e(2001, null, false);
                    this.f25971t = true;
                    k();
                    if (c(AbstractC1414b.a.INITIATED) == 0) {
                        if (!this.f25968q) {
                            this.o = true;
                            return;
                        }
                        IronSourceError buildGenericError = ErrorBuilder.buildGenericError("no ads to load");
                        this.f25557h.log(IronSourceLogger.IronSourceTag.API, buildGenericError.getErrorMessage(), 1);
                        this.f25970s.a(ad_unit, buildGenericError);
                        e(IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(buildGenericError.getErrorCode())}}, false);
                        this.f25971t = false;
                        return;
                    }
                    this.o = true;
                    this.f25967p = true;
                    Iterator<AbstractC1414b> it = this.f25553c.iterator();
                    int i10 = 0;
                    while (it.hasNext()) {
                        AbstractC1414b next = it.next();
                        if (next.f25320a == AbstractC1414b.a.INITIATED) {
                            next.a(AbstractC1414b.a.LOAD_PENDING);
                            i((J) next);
                            i10++;
                            if (i10 >= this.f25552b) {
                                return;
                            }
                        }
                    }
                    return;
                }
            }
            this.f25557h.log(IronSourceLogger.IronSourceTag.API, "Load Interstitial is already in progress", 3);
        } catch (Exception e10) {
            e10.printStackTrace();
            IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitial exception " + e10.getMessage());
            this.f25557h.log(IronSourceLogger.IronSourceTag.API, buildLoadFailedError.getErrorMessage(), 3);
            this.f25970s.a(IronSource.AD_UNIT.INTERSTITIAL, buildLoadFailedError);
            if (this.f25971t) {
                this.f25971t = false;
                e(IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(buildLoadFailedError.getErrorCode())}, new Object[]{"reason", e10.getMessage()}}, false);
            }
        }
    }

    public final void d() {
        com.ironsource.mediationsdk.sdk.i iVar;
        IronSourceError buildShowFailedError;
        boolean z10 = this.f25973v;
        IronSourceLoggerManager ironSourceLoggerManager = this.f25557h;
        if (z10) {
            ironSourceLoggerManager.log(IronSourceLogger.IronSourceTag.API, "showInterstitial error: can't show ad while an ad is already showing", 3);
            iVar = this.f25966n;
            buildShowFailedError = new IronSourceError(IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW, "showInterstitial error: can't show ad while an ad is already showing");
        } else if (!this.o) {
            ironSourceLoggerManager.log(IronSourceLogger.IronSourceTag.API, "showInterstitial failed - You need to load interstitial before showing it", 3);
            iVar = this.f25966n;
            buildShowFailedError = ErrorBuilder.buildShowFailedError("Interstitial", "showInterstitial failed - You need to load interstitial before showing it");
        } else if (!this.f25558i || IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getCurrentActiveActivity())) {
            int i10 = 0;
            while (true) {
                CopyOnWriteArrayList<AbstractC1414b> copyOnWriteArrayList = this.f25553c;
                if (i10 >= copyOnWriteArrayList.size()) {
                    iVar = this.f25966n;
                    buildShowFailedError = ErrorBuilder.buildShowFailedError("Interstitial", "showInterstitial failed - No adapters ready to show");
                    break;
                }
                AbstractC1414b abstractC1414b = copyOnWriteArrayList.get(i10);
                if (abstractC1414b.f25320a == AbstractC1414b.a.AVAILABLE) {
                    com.ironsource.mediationsdk.utils.k.c(ContextProvider.getInstance().getCurrentActiveActivity(), this.f25969r);
                    if (com.ironsource.mediationsdk.utils.k.b(ContextProvider.getInstance().getCurrentActiveActivity(), this.f25969r) != k.a.f25931d) {
                        e(IronSourceConstants.IS_CAP_PLACEMENT, null, true);
                    }
                    d(IronSourceConstants.IS_INSTANCE_SHOW, abstractC1414b, null, true);
                    this.f25973v = true;
                    J j10 = (J) abstractC1414b;
                    if (j10.f25321b != null) {
                        j10.f25336s.log(IronSourceLogger.IronSourceTag.ADAPTER_API, a3.l.p(new StringBuilder(), j10.f25324e, ":showInterstitial()"), 1);
                        j10.e();
                        j10.f25321b.showInterstitial(j10.f24831t, j10);
                    }
                    if (abstractC1414b.c()) {
                        d(IronSourceConstants.IS_CAP_SESSION, abstractC1414b, null, false);
                    }
                    this.f25551a.a(abstractC1414b);
                    if (this.f25551a.c(abstractC1414b)) {
                        abstractC1414b.a(AbstractC1414b.a.CAPPED_PER_DAY);
                        d(IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, abstractC1414b, new Object[][]{new Object[]{"status", ep.Code}}, false);
                    }
                    this.o = false;
                    if (abstractC1414b.d()) {
                        return;
                    }
                    j();
                    return;
                }
                i10++;
            }
        } else {
            ironSourceLoggerManager.log(IronSourceLogger.IronSourceTag.API, "showInterstitial error: can't show ad when there's no internet connection", 3);
            iVar = this.f25966n;
            buildShowFailedError = ErrorBuilder.buildNoInternetConnectionShowFailError("Interstitial");
        }
        iVar.onInterstitialAdShowFailed(buildShowFailedError);
    }

    @Override // com.ironsource.mediationsdk.sdk.h
    public final void e(J j10) {
        this.f25557h.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, a3.l.p(new StringBuilder(), j10.f25324e, ":onInterstitialAdClicked()"), 1);
        d(2006, j10, null, true);
        this.f25966n.onInterstitialAdClicked();
    }

    @Override // com.ironsource.mediationsdk.utils.i
    public final void f() {
        if (this.o) {
            IronSourceError buildInitFailedError = ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial");
            this.f25970s.a(IronSource.AD_UNIT.INTERSTITIAL, buildInitFailedError);
            this.o = false;
            this.f25967p = false;
            if (this.f25971t) {
                e(IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(buildInitFailedError.getErrorCode())}}, false);
                this.f25971t = false;
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.h
    public final synchronized void a(J j10, long j11) {
        this.f25557h.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, j10.f25324e + ":onInterstitialAdReady()", 1);
        d(2003, j10, new Object[][]{new Object[]{"duration", Long.valueOf(j11)}}, false);
        long time = new Date().getTime() - this.f25972u;
        j10.a(AbstractC1414b.a.AVAILABLE);
        this.f25967p = false;
        if (this.f25971t) {
            this.f25971t = false;
            this.f25966n.onInterstitialAdReady();
            e(2004, new Object[][]{new Object[]{"duration", Long.valueOf(time)}}, false);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.h
    public final void f(J j10) {
        this.f25557h.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, a3.l.p(new StringBuilder(), j10.f25324e, ":onInterstitialAdVisible()"), 1);
    }

    @Override // com.ironsource.mediationsdk.sdk.h
    public final synchronized void a(IronSourceError ironSourceError, J j10) {
        AbstractC1414b.a aVar;
        try {
            this.f25557h.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, j10.f25324e + ":onInterstitialInitFailed(" + ironSourceError + ")", 1);
            d(IronSourceConstants.IS_INSTANCE_INIT_FAILED, j10, new Object[][]{new Object[]{"reason", ironSourceError.getErrorMessage()}}, false);
            aVar = AbstractC1414b.a.INIT_FAILED;
        } catch (Exception e10) {
            this.f25557h.logException(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "onInterstitialInitFailed(error:" + ironSourceError + ", provider:" + j10.j() + ")", e10);
        }
        if (c(aVar) < this.f25553c.size()) {
            if (j() == null && this.o && c(aVar, AbstractC1414b.a.NOT_AVAILABLE, AbstractC1414b.a.CAPPED_PER_SESSION, AbstractC1414b.a.CAPPED_PER_DAY, AbstractC1414b.a.EXHAUSTED) >= this.f25553c.size()) {
                this.f25970s.a(IronSource.AD_UNIT.INTERSTITIAL, new IronSourceError(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "No ads to show"));
                e(IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW)}}, false);
                this.f25971t = false;
            }
            h();
            return;
        }
        this.f25557h.log(IronSourceLogger.IronSourceTag.NATIVE, "Smart Loading - initialization failed - no adapters are initiated and no more left to init, error: " + ironSourceError.getErrorMessage(), 2);
        if (this.o) {
            this.f25970s.a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildGenericError("no ads to show"));
            e(IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_CODE_GENERIC)}}, false);
            this.f25971t = false;
        }
        this.f25968q = true;
    }

    @Override // com.ironsource.mediationsdk.sdk.h
    public final void b(IronSourceError ironSourceError, J j10) {
        this.f25557h.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, j10.f25324e + ":onInterstitialAdShowFailed(" + ironSourceError + ")", 1);
        d(IronSourceConstants.IS_INSTANCE_SHOW_FAILED, j10, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}}, true);
        this.f25973v = false;
        if (j10.d()) {
            j10.a(AbstractC1414b.a.INITIATED);
        } else {
            j();
            h();
        }
        Iterator<AbstractC1414b> it = this.f25553c.iterator();
        while (it.hasNext()) {
            if (it.next().f25320a == AbstractC1414b.a.AVAILABLE) {
                this.o = true;
                InterstitialPlacement interstitialPlacement = this.f25969r;
                if (interstitialPlacement != null) {
                    interstitialPlacement.getPlacementName();
                }
                d();
                return;
            }
        }
        this.f25966n.onInterstitialAdShowFailed(ironSourceError);
    }

    public final synchronized boolean e() {
        boolean z10;
        if (this.f25558i && !IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getCurrentActiveActivity())) {
            return false;
        }
        Iterator<AbstractC1414b> it = this.f25553c.iterator();
        while (it.hasNext()) {
            AbstractC1414b next = it.next();
            if (next.f25320a == AbstractC1414b.a.AVAILABLE) {
                J j10 = (J) next;
                if (j10.f25321b != null) {
                    j10.f25336s.log(IronSourceLogger.IronSourceTag.ADAPTER_API, j10.f25324e + ":isInterstitialReady()", 1);
                    z10 = j10.f25321b.isInterstitialReady(j10.f24831t);
                } else {
                    z10 = false;
                }
                if (z10) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.ironsource.mediationsdk.sdk.h
    public final void c(J j10) {
        this.f25557h.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, a3.l.p(new StringBuilder(), j10.f25324e, ":onInterstitialAdClosed()"), 1);
        this.f25973v = false;
        d(IronSourceConstants.IS_INSTANCE_CLOSED, j10, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(com.ironsource.mediationsdk.utils.o.a().b(2))}}, true);
        com.ironsource.mediationsdk.utils.o.a().a(2);
        this.f25966n.onInterstitialAdClosed();
    }

    @Override // com.ironsource.mediationsdk.sdk.h
    public final synchronized void a(IronSourceError ironSourceError, J j10, long j11) {
        this.f25557h.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, j10.f25324e + ":onInterstitialAdLoadFailed(" + ironSourceError + ")", 1);
        IronSourceUtils.sendAutomationLog(j10.f25324e + ":onInterstitialAdLoadFailed(" + ironSourceError + ")");
        if (ironSourceError.getErrorCode() == 1158) {
            d(IronSourceConstants.IS_INSTANCE_LOAD_NO_FILL, j10, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"duration", Long.valueOf(j11)}}, false);
        } else {
            d(IronSourceConstants.IS_INSTANCE_LOAD_FAILED, j10, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(j11)}}, false);
        }
        j10.a(AbstractC1414b.a.NOT_AVAILABLE);
        int c10 = c(AbstractC1414b.a.AVAILABLE, AbstractC1414b.a.LOAD_PENDING);
        if (c10 >= this.f25552b) {
            return;
        }
        Iterator<AbstractC1414b> it = this.f25553c.iterator();
        while (it.hasNext()) {
            AbstractC1414b next = it.next();
            if (next.f25320a == AbstractC1414b.a.INITIATED) {
                next.a(AbstractC1414b.a.LOAD_PENDING);
                i((J) next);
                return;
            }
        }
        if (j() != null) {
            return;
        }
        if (this.o && c10 + c(AbstractC1414b.a.INIT_PENDING) == 0) {
            h();
            this.f25967p = false;
            this.f25970s.a(IronSource.AD_UNIT.INTERSTITIAL, new IronSourceError(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "No ads to show"));
            e(IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW)}}, false);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.h
    public final void d(J j10) {
        AbstractC1414b.a aVar;
        this.f25557h.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, a3.l.p(new StringBuilder(), j10.f25324e, ":onInterstitialAdShowSucceeded()"), 1);
        d(IronSourceConstants.IS_INSTANCE_SHOW_SUCCESS, j10, null, true);
        Iterator<AbstractC1414b> it = this.f25553c.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            AbstractC1414b next = it.next();
            if (next.f25320a == AbstractC1414b.a.AVAILABLE) {
                if (next.d()) {
                    next.a(AbstractC1414b.a.INITIATED);
                } else {
                    j();
                    h();
                }
                z10 = true;
            }
        }
        if (!z10 && ((aVar = j10.f25320a) == AbstractC1414b.a.CAPPED_PER_SESSION || aVar == AbstractC1414b.a.EXHAUSTED || aVar == AbstractC1414b.a.CAPPED_PER_DAY)) {
            h();
        }
        k();
        this.f25966n.onInterstitialAdShowSucceeded();
    }

    @Override // com.ironsource.mediationsdk.utils.i
    public final void a(String str) {
        if (this.o) {
            this.f25970s.a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
            this.o = false;
            this.f25967p = false;
        }
    }

    public final synchronized void a(String str, String str2) {
        this.f25557h.log(IronSourceLogger.IronSourceTag.NATIVE, this.f25965m + ":initInterstitial(appKey: " + str + ", userId: " + str2 + ")", 1);
        long time = new Date().getTime();
        e(IronSourceConstants.IS_MANAGER_INIT_STARTED, null, false);
        this.f25556g = str;
        this.f = str2;
        Iterator<AbstractC1414b> it = this.f25553c.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            AbstractC1414b next = it.next();
            if (this.f25551a.b(next)) {
                d(IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, next, new Object[][]{new Object[]{"status", ep.V}}, false);
            }
            if (this.f25551a.c(next)) {
                next.a(AbstractC1414b.a.CAPPED_PER_DAY);
                i10++;
            }
        }
        if (i10 == this.f25553c.size()) {
            this.f25968q = true;
        }
        l();
        for (int i11 = 0; i11 < this.f25552b && j() != null; i11++) {
        }
        e(IronSourceConstants.IS_MANAGER_INIT_ENDED, new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - time)}}, false);
    }

    @Override // com.ironsource.mediationsdk.utils.i
    public final void a(List<IronSource.AD_UNIT> list, boolean z10, com.ironsource.mediationsdk.model.j jVar) {
    }
}
