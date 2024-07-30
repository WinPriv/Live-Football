package com.ironsource.mediationsdk;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.mediationsdk.C1418f;
import com.ironsource.mediationsdk.ad;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class r0 implements com.ironsource.mediationsdk.sdk.d {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap<String, z> f25806a = new ConcurrentHashMap<>();

    public r0(ArrayList arrayList, com.ironsource.mediationsdk.model.r rVar, String str, String str2) {
        com.ironsource.mediationsdk.utils.c cVar = rVar.f25731n;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            NetworkSettings networkSettings = (NetworkSettings) it.next();
            if (!networkSettings.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME) && !networkSettings.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME)) {
                d("cannot load " + networkSettings.getProviderTypeForReflection());
            } else {
                AbstractAdapter a10 = C1416d.a().a(networkSettings, networkSettings.getRewardedVideoSettings(), true, false);
                if (a10 != null) {
                    this.f25806a.put(networkSettings.getSubProviderId(), new z(str, str2, networkSettings, this, rVar.f25723e * 1000, a10));
                }
            }
        }
    }

    public static void a(int i10, z zVar, Object[][] objArr) {
        Map<String, Object> d10 = zVar.d();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    d10.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e10) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "RV sendProviderEvent " + Log.getStackTraceString(e10), 3);
            }
        }
        com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(i10, new JSONObject(d10)));
    }

    public static void b(z zVar, String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "DemandOnlyRvManager " + zVar.e() + " : " + str, 0);
    }

    public static void c(String str) {
        HashMap t10 = a3.l.t(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        t10.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
        if (str == null) {
            str = "";
        }
        t10.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, str);
        com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(1500, new JSONObject(t10)));
    }

    public static void d(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "DemandOnlyRvManager " + str, 0);
    }

    @Override // com.ironsource.mediationsdk.sdk.d
    public final void e(z zVar) {
        b(zVar, "onRewardedVideoAdRewarded");
        Map<String, Object> d10 = zVar.d();
        if (!TextUtils.isEmpty(L.a().f24861m)) {
            d10.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, L.a().f24861m);
        }
        if (L.a().f24862n != null) {
            for (String str : L.a().f24862n.keySet()) {
                d10.put(s.f.b("custom_", str), L.a().f24862n.get(str));
            }
        }
        Placement a10 = L.a().f24865r.f25936c.f25674a.a();
        if (a10 != null) {
            d10.put("placement", a10.getPlacementName());
            d10.put(IronSourceConstants.EVENTS_REWARD_NAME, a10.getRewardName());
            d10.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(a10.getRewardAmount()));
        } else {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "defaultPlacement is null", 3);
        }
        com.ironsource.mediationsdk.a.c cVar = new com.ironsource.mediationsdk.a.c(1010, new JSONObject(d10));
        cVar.a(IronSourceConstants.EVENTS_TRANS_ID, IronSourceUtils.getTransId(cVar.b(), zVar.e()));
        com.ironsource.mediationsdk.a.h.d().b(cVar);
        ad a11 = ad.a();
        String g6 = zVar.g();
        if (a11.f25105a != null) {
            new Handler(Looper.getMainLooper()).post(new ad.g(g6));
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.d
    public final void a(IronSourceError ironSourceError, z zVar) {
        b(zVar, "onRewardedVideoAdShowFailed error=" + ironSourceError);
        a(1202, zVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}});
        ad.a().b(zVar.g(), ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.d
    public final void b(z zVar) {
        b(zVar, "onRewardedVideoAdClosed");
        a(IronSourceConstants.RV_INSTANCE_CLOSED, zVar, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(com.ironsource.mediationsdk.utils.o.a().b(1))}});
        com.ironsource.mediationsdk.utils.o.a().a(1);
        ad a10 = ad.a();
        String g6 = zVar.g();
        if (a10.f25105a != null) {
            new Handler(Looper.getMainLooper()).post(new ad.d(g6));
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.d
    public final void d(z zVar) {
        b(zVar, "onRewardedVideoAdVisible");
        a(IronSourceConstants.RV_INSTANCE_VISIBLE, zVar, (Object[][]) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.d
    public final void a(IronSourceError ironSourceError, z zVar, long j10) {
        b(zVar, "onRewardedVideoAdLoadFailed error=" + ironSourceError);
        a(1200, zVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(j10)}});
        if (ironSourceError.getErrorCode() == 1058) {
            a(IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL, zVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"duration", Long.valueOf(j10)}});
        } else {
            a(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, zVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(j10)}});
        }
        ad.a().a(zVar.g(), ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.d
    public final void a(z zVar) {
        b(zVar, "onRewardedVideoAdOpened");
        a(1005, zVar, (Object[][]) null);
        ad a10 = ad.a();
        String g6 = zVar.g();
        if (a10.f25105a != null) {
            new Handler(Looper.getMainLooper()).post(new ad.c(g6));
        }
        if (zVar.k()) {
            for (String str : zVar.f24742j) {
                C1418f.a();
                String a11 = C1418f.a(str, zVar.e(), zVar.f(), zVar.f24743k, "", "", "", "");
                C1418f.a();
                C1418f.h("onRewardedVideoAdOpened", zVar.e(), a11);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.d
    public final void a(z zVar, long j10) {
        b(zVar, "onRewardedVideoLoadSuccess");
        a(1002, zVar, new Object[][]{new Object[]{"duration", Long.valueOf(j10)}});
        ad a10 = ad.a();
        String g6 = zVar.g();
        if (a10.f25105a != null) {
            new Handler(Looper.getMainLooper()).post(new ad.a(g6));
        }
    }

    public final void a(String str, String str2, boolean z10) {
        IronSourceError buildLoadFailedError;
        ConcurrentHashMap<String, z> concurrentHashMap = this.f25806a;
        try {
            if (!concurrentHashMap.containsKey(str)) {
                c(str);
                ad.a().a(str, ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            z zVar = concurrentHashMap.get(str);
            if (!z10) {
                if (!zVar.k()) {
                    a(1001, zVar, (Object[][]) null);
                    zVar.a("", "", null, null);
                    return;
                } else {
                    IronSourceError buildLoadFailedError2 = ErrorBuilder.buildLoadFailedError("loadRewardedVideoWithAdm in non IAB flow must be called by non bidder instances");
                    d(buildLoadFailedError2.getErrorMessage());
                    a(1200, zVar, (Object[][]) null);
                    ad.a().a(str, buildLoadFailedError2);
                    return;
                }
            }
            if (zVar.k()) {
                C1418f.a();
                JSONObject e10 = C1418f.e(str2);
                C1418f.a();
                C1418f.a b10 = C1418f.b(e10);
                C1418f.a();
                com.ironsource.mediationsdk.c.b a10 = C1418f.a(zVar.e(), b10.f25426b);
                if (a10 != null) {
                    zVar.a(a10.b());
                    zVar.b(b10.f25425a);
                    zVar.a(b10.f25428d);
                    a(1001, zVar, (Object[][]) null);
                    zVar.a(a10.b(), b10.f25425a, b10.f25428d, a10.e());
                    return;
                }
                buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadRewardedVideoWithAdm invalid enriched adm");
                d(buildLoadFailedError.getErrorMessage());
                a(1200, zVar, (Object[][]) null);
            } else {
                buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadRewardedVideoWithAdm in IAB flow must be called by bidder instances");
                d(buildLoadFailedError.getErrorMessage());
                a(1200, zVar, (Object[][]) null);
            }
            ad.a().a(str, buildLoadFailedError);
        } catch (Exception e11) {
            d("loadRewardedVideoWithAdm exception " + e11.getMessage());
            ad.a().a(str, ErrorBuilder.buildLoadFailedError("loadRewardedVideoWithAdm exception"));
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.d
    public final void c(z zVar) {
        b(zVar, "onRewardedVideoAdClicked");
        a(1006, zVar, (Object[][]) null);
        ad a10 = ad.a();
        String g6 = zVar.g();
        if (a10.f25105a != null) {
            new Handler(Looper.getMainLooper()).post(new ad.f(g6));
        }
    }
}
