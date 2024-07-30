package com.ironsource.mediationsdk;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.ironsource.mediationsdk.C1418f;
import com.ironsource.mediationsdk.E;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class q0 implements com.ironsource.mediationsdk.sdk.c {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap<String, C1432x> f25805a = new ConcurrentHashMap<>();

    public q0(ArrayList arrayList, com.ironsource.mediationsdk.model.k kVar, String str, String str2) {
        com.ironsource.mediationsdk.utils.c cVar = kVar.f25686i;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            NetworkSettings networkSettings = (NetworkSettings) it.next();
            if (!networkSettings.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME) && !networkSettings.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME)) {
                d("cannot load " + networkSettings.getProviderTypeForReflection());
            } else {
                AbstractAdapter a10 = C1416d.a().a(networkSettings, networkSettings.getRewardedVideoSettings(), true, false);
                if (a10 != null) {
                    this.f25805a.put(networkSettings.getSubProviderId(), new C1432x(str, str2, networkSettings, this, kVar.f25683e * 1000, a10));
                }
            }
        }
    }

    public static void a(int i10, C1432x c1432x, Object[][] objArr) {
        Map<String, Object> d10 = c1432x.d();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    d10.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e10) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "IS sendProviderEvent " + Log.getStackTraceString(e10), 3);
            }
        }
        com.ironsource.mediationsdk.a.d.d().b(new com.ironsource.mediationsdk.a.c(i10, new JSONObject(d10)));
    }

    public static void b(C1432x c1432x, String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "DemandOnlyIsManager " + c1432x.e() + " : " + str, 0);
    }

    public static void c(String str) {
        HashMap t10 = a3.l.t(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        t10.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
        if (str == null) {
            str = "";
        }
        t10.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, str);
        com.ironsource.mediationsdk.a.d.d().b(new com.ironsource.mediationsdk.a.c(2500, new JSONObject(t10)));
    }

    public static void d(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "DemandOnlyIsManager " + str, 0);
    }

    @Override // com.ironsource.mediationsdk.sdk.c
    public final void a(IronSourceError ironSourceError, C1432x c1432x) {
        b(c1432x, "onInterstitialAdShowFailed error=" + ironSourceError.toString());
        a(IronSourceConstants.IS_INSTANCE_SHOW_FAILED, c1432x, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        E.a().b(c1432x.g(), ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.c
    public final void b(C1432x c1432x) {
        b(c1432x, "onInterstitialAdClosed");
        a(IronSourceConstants.IS_INSTANCE_CLOSED, c1432x, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(com.ironsource.mediationsdk.utils.o.a().b(2))}});
        com.ironsource.mediationsdk.utils.o.a().a(2);
        E a10 = E.a();
        String g6 = c1432x.g();
        if (a10.f24757a != null) {
            new Handler(Looper.getMainLooper()).post(new E.d(g6));
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.c
    public final void d(C1432x c1432x) {
        a(IronSourceConstants.IS_INSTANCE_VISIBLE, c1432x, (Object[][]) null);
        b(c1432x, "onInterstitialAdVisible");
    }

    @Override // com.ironsource.mediationsdk.sdk.c
    public final void a(IronSourceError ironSourceError, C1432x c1432x, long j10) {
        b(c1432x, "onInterstitialAdLoadFailed error=" + ironSourceError.toString());
        if (ironSourceError.getErrorCode() == 1158) {
            a(IronSourceConstants.IS_INSTANCE_LOAD_NO_FILL, c1432x, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"duration", Long.valueOf(j10)}});
        } else {
            a(IronSourceConstants.IS_INSTANCE_LOAD_FAILED, c1432x, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(j10)}});
        }
        E.a().a(c1432x.g(), ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.c
    public final void a(C1432x c1432x) {
        b(c1432x, "onInterstitialAdOpened");
        a(IronSourceConstants.IS_INSTANCE_OPENED, c1432x, (Object[][]) null);
        E a10 = E.a();
        String g6 = c1432x.g();
        if (a10.f24757a != null) {
            new Handler(Looper.getMainLooper()).post(new E.c(g6));
        }
        if (c1432x.k()) {
            for (String str : c1432x.f24742j) {
                C1418f.a();
                String a11 = C1418f.a(str, c1432x.e(), c1432x.f(), c1432x.f24743k, "", "", "", "");
                C1418f.a();
                C1418f.h("onInterstitialAdOpened", c1432x.e(), a11);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.c
    public final void a(C1432x c1432x, long j10) {
        b(c1432x, "onInterstitialAdReady");
        a(2003, c1432x, new Object[][]{new Object[]{"duration", Long.valueOf(j10)}});
        E a10 = E.a();
        String g6 = c1432x.g();
        if (a10.f24757a != null) {
            new Handler(Looper.getMainLooper()).post(new E.a(g6));
        }
    }

    public final void a(String str, String str2, boolean z10) {
        IronSourceError buildLoadFailedError;
        String errorMessage;
        ConcurrentHashMap<String, C1432x> concurrentHashMap = this.f25805a;
        try {
            if (!concurrentHashMap.containsKey(str)) {
                c(str);
                E.a().a(str, ErrorBuilder.buildNonExistentInstanceError("Interstitial"));
                return;
            }
            C1432x c1432x = concurrentHashMap.get(str);
            if (!z10) {
                if (!c1432x.k()) {
                    a(2002, c1432x, (Object[][]) null);
                    c1432x.a("", "", null, null);
                    return;
                } else {
                    IronSourceError buildLoadFailedError2 = ErrorBuilder.buildLoadFailedError("loadInterstitialWithAdm in non IAB flow must be called by non bidder instances");
                    d(buildLoadFailedError2.getErrorMessage());
                    a(IronSourceConstants.IS_INSTANCE_LOAD_FAILED, c1432x, (Object[][]) null);
                    E.a().a(str, buildLoadFailedError2);
                    return;
                }
            }
            if (c1432x.k()) {
                C1418f.a();
                JSONObject e10 = C1418f.e(str2);
                C1418f.a();
                C1418f.a b10 = C1418f.b(e10);
                C1418f.a();
                com.ironsource.mediationsdk.c.b a10 = C1418f.a(c1432x.e(), b10.f25426b);
                if (a10 != null) {
                    c1432x.a(a10.b());
                    c1432x.b(b10.f25425a);
                    c1432x.a(b10.f25428d);
                    a(2002, c1432x, (Object[][]) null);
                    c1432x.a(a10.b(), b10.f25425a, b10.f25428d, a10.e());
                    return;
                }
                buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitialWithAdm invalid enriched adm");
                errorMessage = buildLoadFailedError.getErrorMessage();
            } else {
                buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitialWithAdm in IAB flow must be called by bidder instances");
                errorMessage = buildLoadFailedError.getErrorMessage();
            }
            d(errorMessage);
            a(IronSourceConstants.IS_INSTANCE_LOAD_FAILED, c1432x, (Object[][]) null);
            E.a().a(str, buildLoadFailedError);
        } catch (Exception unused) {
            IronSourceError buildLoadFailedError3 = ErrorBuilder.buildLoadFailedError("loadInterstitialWithAdm exception");
            d(buildLoadFailedError3.getErrorMessage());
            E.a().a(str, buildLoadFailedError3);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.c
    public final void c(C1432x c1432x) {
        b(c1432x, "onInterstitialAdClicked");
        a(2006, c1432x, (Object[][]) null);
        E a10 = E.a();
        String g6 = c1432x.g();
        if (a10.f24757a != null) {
            new Handler(Looper.getMainLooper()).post(new E.f(g6));
        }
    }
}
