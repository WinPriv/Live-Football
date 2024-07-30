package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.Q;
import com.ironsource.mediationsdk.T;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.c.a;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.logger.LogListener;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.InitializationListener;
import com.ironsource.mediationsdk.sdk.InterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import com.ironsource.mediationsdk.sdk.OfferwallListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoManualListener;
import com.ironsource.mediationsdk.sdk.SegmentListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class IronSource {
    public static final String DataSource_MOPUB = "MoPub";

    /* loaded from: classes2.dex */
    public enum AD_UNIT {
        REWARDED_VIDEO("rewardedVideo"),
        INTERSTITIAL("interstitial"),
        OFFERWALL("offerwall"),
        BANNER(com.anythink.expressad.foundation.g.a.f.f9817e);


        /* renamed from: s, reason: collision with root package name */
        public final String f24815s;

        AD_UNIT(String str) {
            this.f24815s = str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.f24815s;
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.ironsource.mediationsdk.D, com.ironsource.mediationsdk.s] */
    public static void addImpressionDataListener(ImpressionDataListener impressionDataListener) {
        L a10 = L.a();
        if (a.a((Object) impressionDataListener, "addImpressionDataListener - listener is null")) {
            com.ironsource.d.b.a().a(impressionDataListener);
            ?? r12 = a10.O;
            if (r12 != 0) {
                r12.a(impressionDataListener);
            }
            i0 i0Var = a10.P;
            if (i0Var != null) {
                i0Var.a(impressionDataListener);
            }
            com.ironsource.mediationsdk.adunit.c.g gVar = a10.R;
            if (gVar != null) {
                gVar.a(impressionDataListener);
            }
            com.ironsource.mediationsdk.adunit.c.h hVar = a10.S;
            if (hVar != null) {
                hVar.a(impressionDataListener);
            }
            T t10 = a10.Q;
            if (t10 != null) {
                t10.a(impressionDataListener);
            }
            IronLog.API.info("add impression data listener to ".concat(impressionDataListener.getClass().getSimpleName()));
        }
    }

    public static void clearRewardedVideoServerParameters() {
        L.a().f24862n = null;
    }

    public static IronSourceBannerLayout createBanner(Activity activity, ISBannerSize iSBannerSize) {
        L a10 = L.a();
        IronSourceLoggerManager ironSourceLoggerManager = a10.f24849g;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "createBanner()", 1);
        if (activity == null) {
            a10.f24849g.log(ironSourceTag, "createBanner() : Activity cannot be null", 3);
            return null;
        }
        ContextProvider.getInstance().updateActivity(activity);
        return new IronSourceBannerLayout(activity, iSBannerSize);
    }

    public static ISDemandOnlyBannerLayout createBannerForDemandOnly(Activity activity, ISBannerSize iSBannerSize) {
        L a10 = L.a();
        IronSourceLoggerManager ironSourceLoggerManager = a10.f24849g;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "createBannerForDemandOnly()", 1);
        if (activity == null) {
            a10.f24849g.log(ironSourceTag, "createBannerForDemandOnly() : Activity cannot be null", 3);
            return null;
        }
        ContextProvider.getInstance().updateActivity(activity);
        return new ISDemandOnlyBannerLayout(activity, iSBannerSize);
    }

    public static void destroyBanner(IronSourceBannerLayout ironSourceBannerLayout) {
        T t10;
        String str;
        L a10 = L.a();
        a10.f24849g.log(IronSourceLogger.IronSourceTag.API, "destroyBanner()", 1);
        try {
            if (a10.f24843c0 && (t10 = a10.Q) != null) {
                IronLog.INTERNAL.verbose("");
                T.b bVar = new T.b(ironSourceBannerLayout);
                if (ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed()) {
                    bVar.a();
                    return;
                }
                Object[] objArr = new Object[1];
                if (ironSourceBannerLayout == null) {
                    str = "banner is null";
                } else {
                    str = "banner is destroyed";
                }
                objArr[0] = str;
                bVar.a(String.format("can't destroy banner - %s", objArr));
                return;
            }
            C1426p c1426p = a10.f;
            if (c1426p != null) {
                c1426p.a(ironSourceBannerLayout);
            }
        } catch (Throwable th) {
            a10.f24849g.logException(IronSourceLogger.IronSourceTag.API, "destroyBanner()", th);
        }
    }

    public static void destroyISDemandOnlyBanner(String str) {
        L a10 = L.a();
        a10.f24849g.log(IronSourceLogger.IronSourceTag.API, "destroyBanner()", 1);
        try {
            com.ironsource.d.a aVar = a10.f24856j0;
            if (aVar != null) {
                aVar.a(str);
            }
        } catch (Throwable th) {
            a10.f24849g.logException(IronSourceLogger.IronSourceTag.API, "destroyISDemandOnlyBanner()", th);
        }
    }

    public static String getAdvertiserId(Context context) {
        L.a();
        return L.a(context);
    }

    public static synchronized String getISDemandOnlyBiddingData() {
        String m10;
        synchronized (IronSource.class) {
            m10 = L.a().m();
        }
        return m10;
    }

    public static InterstitialPlacement getInterstitialPlacementInfo(String str) {
        return L.a().k(str);
    }

    public static void getOfferwallCredits() {
        L a10 = L.a();
        a10.f24849g.log(IronSourceLogger.IronSourceTag.API, "getOfferwallCredits()", 1);
        try {
            com.ironsource.mediationsdk.sdk.j jVar = a10.f24846e.f25437b;
            if (jVar != null) {
                jVar.getOfferwallCredits();
            }
        } catch (Throwable th) {
            a10.f24849g.logException(IronSourceLogger.IronSourceTag.API, "getOfferwallCredits()", th);
        }
    }

    public static Placement getRewardedVideoPlacementInfo(String str) {
        return L.a().l(str);
    }

    public static void init(Activity activity, String str) {
        init(activity, str, (AD_UNIT[]) null);
    }

    @Deprecated
    public static void initISDemandOnly(Activity activity, String str, AD_UNIT... ad_unitArr) {
        L.a().a(activity, str, (InitializationListener) null, ad_unitArr);
    }

    public static boolean isBannerPlacementCapped(String str) {
        boolean z10;
        com.ironsource.mediationsdk.model.j jVar;
        L a10 = L.a();
        com.ironsource.mediationsdk.utils.l lVar = a10.f24865r;
        if (lVar != null && (jVar = lVar.f25936c) != null && jVar.f25677d != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        com.ironsource.mediationsdk.model.i iVar = null;
        try {
            iVar = lVar.f25936c.f25677d.a(str);
            if (iVar == null && (iVar = a10.f24865r.f25936c.f25677d.a()) == null) {
                a10.f24849g.log(IronSourceLogger.IronSourceTag.API, "Banner default placement was not found", 3);
                return false;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (iVar == null) {
            return false;
        }
        return com.ironsource.mediationsdk.utils.k.b(ContextProvider.getInstance().getApplicationContext(), iVar.getPlacementName());
    }

    public static boolean isISDemandOnlyInterstitialReady(String str) {
        return L.a().i(str);
    }

    public static boolean isISDemandOnlyRewardedVideoAvailable(String str) {
        return L.a().g(str);
    }

    public static boolean isInterstitialPlacementCapped(String str) {
        L a10 = L.a();
        boolean z10 = false;
        if (!a10.E) {
            if (a10.O(str) != k.a.f25931d) {
                z10 = true;
            }
            if (z10) {
                JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(a10.E, a10.Z, 1);
                try {
                    mediationAdditionalData.put("placement", str);
                    if (a10.Z) {
                        mediationAdditionalData.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
                    }
                } catch (Exception unused) {
                }
                com.ironsource.mediationsdk.a.d.d().b(new com.ironsource.mediationsdk.a.c(IronSourceConstants.IS_CHECK_CAPPED_TRUE, mediationAdditionalData));
            }
        }
        return z10;
    }

    public static boolean isInterstitialReady() {
        return L.a().h();
    }

    public static boolean isOfferwallAvailable() {
        return L.a().l();
    }

    public static boolean isRewardedVideoAvailable() {
        return L.a().c();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean isRewardedVideoPlacementCapped(java.lang.String r7) {
        /*
            com.ironsource.mediationsdk.L r0 = com.ironsource.mediationsdk.L.a()
            com.ironsource.mediationsdk.utils.l r1 = r0.f24865r
            r2 = 3
            if (r1 == 0) goto L3f
            com.ironsource.mediationsdk.model.j r1 = r1.f25936c
            if (r1 == 0) goto L3f
            com.ironsource.mediationsdk.model.r r1 = r1.f25674a
            if (r1 != 0) goto L12
            goto L3f
        L12:
            com.ironsource.mediationsdk.model.Placement r1 = r0.G(r7)     // Catch: java.lang.Exception -> L2a
            if (r1 != 0) goto L2f
            com.ironsource.mediationsdk.model.Placement r1 = r0.u()     // Catch: java.lang.Exception -> L28
            if (r1 != 0) goto L2f
            java.lang.String r3 = "Default placement was not found"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r4 = r0.f24849g     // Catch: java.lang.Exception -> L28
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r5 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch: java.lang.Exception -> L28
            r4.log(r5, r3, r2)     // Catch: java.lang.Exception -> L28
            goto L2f
        L28:
            r3 = move-exception
            goto L2c
        L2a:
            r3 = move-exception
            r1 = 0
        L2c:
            r3.printStackTrace()
        L2f:
            if (r1 != 0) goto L32
            goto L3f
        L32:
            com.ironsource.environment.ContextProvider r3 = com.ironsource.environment.ContextProvider.getInstance()
            android.content.Context r3 = r3.getApplicationContext()
            int r1 = com.ironsource.mediationsdk.utils.k.b(r3, r1)
            goto L41
        L3f:
            int r1 = com.ironsource.mediationsdk.utils.k.a.f25931d
        L41:
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L54
            int[] r6 = com.ironsource.mediationsdk.L.b.f24874b
            int r1 = r1 - r4
            r1 = r6[r1]
            if (r1 == r4) goto L52
            if (r1 == r3) goto L52
            if (r1 == r2) goto L52
            goto L54
        L52:
            r1 = r4
            goto L55
        L54:
            r1 = r5
        L55:
            if (r1 == 0) goto L77
            boolean r2 = r0.D
            boolean r6 = r0.V
            int r0 = r0.f24845d0
            org.json.JSONObject r0 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r2, r6, r0)
            if (r7 == 0) goto L72
            java.lang.Object[][] r2 = new java.lang.Object[r4]
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r6 = "placement"
            r3[r5] = r6
            r3[r4] = r7
            r2[r5] = r3
            com.ironsource.mediationsdk.L.n(r0, r2)
        L72:
            r7 = 1110(0x456, float:1.555E-42)
            com.ironsource.mediationsdk.L.i(r7, r0)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.IronSource.isRewardedVideoPlacementCapped(java.lang.String):boolean");
    }

    public static void loadBanner(IronSourceBannerLayout ironSourceBannerLayout) {
        L.a().a(ironSourceBannerLayout, "");
    }

    public static void loadISDemandOnlyBanner(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        L.a().a(activity, iSDemandOnlyBannerLayout, str);
    }

    public static void loadISDemandOnlyBannerWithAdm(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str, String str2) {
        L.a().a(activity, iSDemandOnlyBannerLayout, str, str2);
    }

    public static void loadISDemandOnlyInterstitial(Activity activity, String str) {
        L.a().d(activity, str, null);
    }

    public static void loadISDemandOnlyInterstitialWithAdm(Activity activity, String str, String str2) {
        L.a().c(activity, str, str2);
    }

    public static void loadISDemandOnlyRewardedVideo(Activity activity, String str) {
        L.a().b(activity, str, null);
    }

    public static void loadISDemandOnlyRewardedVideoWithAdm(Activity activity, String str, String str2) {
        L.a().a(activity, str, str2);
    }

    public static void loadInterstitial() {
        L a10 = L.a();
        IronSourceLoggerManager ironSourceLoggerManager = a10.f24849g;
        IronSourceLoggerManager ironSourceLoggerManager2 = a10.f24849g;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "loadInterstitial()", 1);
        try {
            if (a10.E) {
                ironSourceLoggerManager2.log(ironSourceTag, "Interstitial was initialized in demand only mode. Use loadISDemandOnlyInterstitial instead", 3);
                C1430u.a().a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("Interstitial was initialized in demand only mode. Use loadISDemandOnlyInterstitial instead", "Interstitial"));
                return;
            }
            if (!a10.H) {
                ironSourceLoggerManager2.log(ironSourceTag, "init() must be called before loadInterstitial()", 3);
                C1430u.a().a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() must be called before loadInterstitial()", "Interstitial"));
                return;
            }
            Q.f b10 = Q.a().b();
            if (b10 == Q.f.INIT_FAILED) {
                ironSourceLoggerManager2.log(ironSourceTag, "init() had failed", 3);
                C1430u.a().a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                return;
            }
            if (b10 == Q.f.INIT_IN_PROGRESS) {
                if (Q.a().c()) {
                    ironSourceLoggerManager2.log(ironSourceTag, "init() had failed", 3);
                    C1430u.a().a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                    return;
                } else {
                    a10.f24841b0 = true;
                    return;
                }
            }
            if (!a10.D()) {
                ironSourceLoggerManager2.log(ironSourceTag, "No interstitial configurations found", 3);
                C1430u.a().a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", "Interstitial"));
                return;
            }
            if (!a10.Z) {
                a10.f24844d.c();
                return;
            }
            if (a10.f24839a0) {
                com.ironsource.mediationsdk.adunit.c.g gVar = a10.R;
                if (gVar != null) {
                    gVar.d();
                    return;
                }
            } else {
                i0 i0Var = a10.P;
                if (i0Var != null) {
                    i0Var.e();
                    return;
                }
            }
            a10.f24841b0 = true;
        } catch (Throwable th) {
            ironSourceLoggerManager2.logException(IronSourceLogger.IronSourceTag.API, "loadInterstitial()", th);
            C1430u.a().a(AD_UNIT.INTERSTITIAL, new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, th.getMessage()));
        }
    }

    public static void loadRewardedVideo() {
        L a10 = L.a();
        IronSourceLoggerManager ironSourceLoggerManager = a10.f24849g;
        IronSourceLoggerManager ironSourceLoggerManager2 = a10.f24849g;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "loadRewardedVideo()", 1);
        try {
            if (a10.D) {
                ironSourceLoggerManager2.log(ironSourceTag, "Rewarded Video was initialized in demand only mode. Use loadISDemandOnlyRewardedVideo instead", 3);
                C1430u.a().a(AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("Rewarded Video was initialized in demand only mode. Use loadISDemandOnlyRewardedVideo instead", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            if (!a10.W) {
                ironSourceLoggerManager2.log(ironSourceTag, "Rewarded Video is not initiated with manual load", 3);
                return;
            }
            if (!a10.G) {
                ironSourceLoggerManager2.log(ironSourceTag, "init() must be called before loadRewardedVideo()", 3);
                C1430u.a().a(AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() must be called before loadRewardedVideo()", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            Q.f b10 = Q.a().b();
            if (b10 == Q.f.INIT_FAILED) {
                ironSourceLoggerManager2.log(ironSourceTag, "init() had failed", 3);
                C1430u.a().a(AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            if (b10 == Q.f.INIT_IN_PROGRESS) {
                if (Q.a().c()) {
                    ironSourceLoggerManager2.log(ironSourceTag, "init() had failed", 3);
                    C1430u.a().a(AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                    return;
                } else {
                    a10.X = true;
                    return;
                }
            }
            if (!a10.A()) {
                ironSourceLoggerManager2.log(ironSourceTag, "No rewarded video configurations found", 3);
                C1430u.a().a(AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("the server response does not contain rewarded video data", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            com.ironsource.mediationsdk.adunit.c.h hVar = a10.S;
            if (hVar == null) {
                a10.X = true;
            } else {
                hVar.d();
            }
        } catch (Throwable th) {
            ironSourceLoggerManager2.logException(IronSourceLogger.IronSourceTag.API, "loadRewardedVideo()", th);
            C1430u.a().a(AD_UNIT.REWARDED_VIDEO, new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, th.getMessage()));
        }
    }

    public static void onPause(Activity activity) {
        L a10 = L.a();
        try {
            a10.f24849g.log(IronSourceLogger.IronSourceTag.API, "onPause()", 1);
            ContextProvider.getInstance().onPause(activity);
        } catch (Throwable th) {
            a10.f24849g.logException(IronSourceLogger.IronSourceTag.API, "onPause()", th);
        }
    }

    public static void onResume(Activity activity) {
        L a10 = L.a();
        try {
            a10.f24849g.log(IronSourceLogger.IronSourceTag.API, "onResume()", 1);
            ContextProvider.getInstance().onResume(activity);
        } catch (Throwable th) {
            a10.f24849g.logException(IronSourceLogger.IronSourceTag.API, "onResume()", th);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.ironsource.mediationsdk.D, com.ironsource.mediationsdk.s] */
    public static void removeImpressionDataListener(ImpressionDataListener impressionDataListener) {
        L a10 = L.a();
        if (a.a((Object) impressionDataListener, "removeImpressionDataListener - listener is null")) {
            com.ironsource.d.b.a().b(impressionDataListener);
            ?? r12 = a10.O;
            if (r12 != 0) {
                r12.b(impressionDataListener);
            }
            i0 i0Var = a10.P;
            if (i0Var != null) {
                i0Var.b(impressionDataListener);
            }
            com.ironsource.mediationsdk.adunit.c.g gVar = a10.R;
            if (gVar != null) {
                gVar.b(impressionDataListener);
            }
            com.ironsource.mediationsdk.adunit.c.h hVar = a10.S;
            if (hVar != null) {
                hVar.b(impressionDataListener);
            }
            T t10 = a10.Q;
            if (t10 != null) {
                t10.b(impressionDataListener);
            }
            IronLog.API.info("remove impression data listener from ".concat(impressionDataListener.getClass().getSimpleName()));
        }
    }

    public static void removeInterstitialListener() {
        L a10 = L.a();
        a10.f24849g.log(IronSourceLogger.IronSourceTag.API, "removeInterstitialListener()", 1);
        a10.f24851h.f25815b = null;
        F.a().a((InterstitialListener) null);
        F.a().a((LevelPlayInterstitialListener) null);
    }

    public static void removeOfferwallListener() {
        L a10 = L.a();
        a10.f24849g.log(IronSourceLogger.IronSourceTag.API, "removeOfferwallListener()", 1);
        a10.f24851h.f25816c = null;
    }

    public static void removeRewardedVideoListener() {
        L a10 = L.a();
        a10.f24849g.log(IronSourceLogger.IronSourceTag.API, "removeRewardedVideoListener()", 1);
        a10.f24851h.f25814a = null;
        ae.a().f25271a = null;
        ae.a().f25272b = null;
    }

    public static void setAdRevenueData(String str, JSONObject jSONObject) {
        L a10 = L.a();
        if (a.a((Object) jSONObject, "setAdRevenueData - impressionData is null") && a.a((Object) str, "setAdRevenueData - dataSource is null")) {
            a10.f24858k0.a(str, jSONObject);
        }
    }

    public static void setAdaptersDebug(boolean z10) {
        L.a();
        L.a(z10);
    }

    public static void setConsent(boolean z10) {
        L.a().b(z10);
    }

    public static boolean setDynamicUserId(String str) {
        return L.a().c(str);
    }

    public static void setISDemandOnlyInterstitialListener(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        L.a();
        L.a(iSDemandOnlyInterstitialListener);
    }

    public static void setISDemandOnlyRewardedVideoListener(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        L.a();
        ad.a().f25105a = iSDemandOnlyRewardedVideoListener;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.ironsource.mediationsdk.D, com.ironsource.mediationsdk.s] */
    @Deprecated
    public static void setImpressionDataListener(ImpressionDataListener impressionDataListener) {
        L a10 = L.a();
        IronLog.API.info("removing all impression data listeners");
        com.ironsource.d.b.a().c();
        ?? r12 = a10.O;
        if (r12 != 0) {
            r12.b();
        }
        i0 i0Var = a10.P;
        if (i0Var != null) {
            i0Var.b();
        }
        com.ironsource.mediationsdk.adunit.c.g gVar = a10.R;
        if (gVar != null) {
            gVar.g();
        }
        com.ironsource.mediationsdk.adunit.c.h hVar = a10.S;
        if (hVar != null) {
            hVar.g();
        }
        T t10 = a10.Q;
        if (t10 != null) {
            t10.b();
        }
        addImpressionDataListener(impressionDataListener);
    }

    public static void setInterstitialListener(InterstitialListener interstitialListener) {
        String str;
        L a10 = L.a();
        IronSourceLoggerManager ironSourceLoggerManager = a10.f24849g;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        if (interstitialListener == null) {
            str = "setInterstitialListener(ISListener:null)";
        } else {
            str = "setInterstitialListener(ISListener)";
        }
        ironSourceLoggerManager.log(ironSourceTag, str, 1);
        a10.f24851h.f25815b = interstitialListener;
        F.a().a(interstitialListener);
    }

    public static void setLevelPlayInterstitialListener(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        L.a();
        L.a(levelPlayInterstitialListener);
    }

    public static void setLevelPlayRewardedVideoListener(LevelPlayRewardedVideoListener levelPlayRewardedVideoListener) {
        L.a();
        L.a(levelPlayRewardedVideoListener);
    }

    public static void setLevelPlayRewardedVideoManualListener(LevelPlayRewardedVideoManualListener levelPlayRewardedVideoManualListener) {
        L.a().a(levelPlayRewardedVideoManualListener);
    }

    public static void setLogListener(LogListener logListener) {
        L a10 = L.a();
        if (logListener == null) {
            a10.f24849g.log(IronSourceLogger.IronSourceTag.API, "setLogListener(LogListener:null)", 1);
            return;
        }
        a10.f24853i.f25586c = logListener;
        a10.f24849g.log(IronSourceLogger.IronSourceTag.API, "setLogListener(LogListener:" + logListener.getClass().getSimpleName() + ")", 1);
    }

    public static void setManualLoadRewardedVideo(RewardedVideoManualListener rewardedVideoManualListener) {
        L.a().a(rewardedVideoManualListener);
    }

    public static void setMediationSegment(String str) {
        L a10 = L.a();
        try {
            a10.f24849g.log(IronSourceLogger.IronSourceTag.API, a10.f24838a + ":setMediationSegment(segment:" + str + ")", 1);
            com.ironsource.sdk.f.a aVar = new com.ironsource.sdk.f.a();
            if (str != null) {
                try {
                    if (str.length() > 64) {
                        aVar.a(ErrorBuilder.buildInvalidKeyValueError("segment", IronSourceConstants.SUPERSONIC_CONFIG_NAME, "segment value should not exceed 64 characters."));
                    }
                } catch (Exception unused) {
                    aVar.a(ErrorBuilder.buildInvalidKeyValueError("segment", IronSourceConstants.SUPERSONIC_CONFIG_NAME, "segment value should not exceed 64 characters."));
                }
            }
            if (aVar.a()) {
                a10.f24866s = str;
            } else {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, aVar.b().toString(), 2);
            }
        } catch (Exception e10) {
            a10.f24849g.logException(IronSourceLogger.IronSourceTag.API, a3.l.q(new StringBuilder(), a10.f24838a, ":setMediationSegment(segment:", str, ")"), e10);
        }
    }

    public static void setMediationType(String str) {
        L.a().d(str);
    }

    public static void setMetaData(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        L.a().a(str, arrayList);
    }

    public static void setNetworkData(String str, JSONObject jSONObject) {
        L.a();
        L.a(str, jSONObject);
    }

    public static void setOfferwallListener(OfferwallListener offerwallListener) {
        String str;
        L a10 = L.a();
        IronSourceLoggerManager ironSourceLoggerManager = a10.f24849g;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        if (offerwallListener == null) {
            str = "setOfferwallListener(OWListener:null)";
        } else {
            str = "setOfferwallListener(OWListener)";
        }
        ironSourceLoggerManager.log(ironSourceTag, str, 1);
        a10.f24851h.f25816c = offerwallListener;
    }

    public static void setRewardedVideoListener(RewardedVideoListener rewardedVideoListener) {
        String str;
        L a10 = L.a();
        IronSourceLoggerManager ironSourceLoggerManager = a10.f24849g;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        if (rewardedVideoListener == null) {
            str = "setRewardedVideoListener(RVListener:null)";
        } else {
            str = "setRewardedVideoListener(RVListener)";
        }
        ironSourceLoggerManager.log(ironSourceTag, str, 1);
        a10.f24851h.f25814a = rewardedVideoListener;
        ae.a().f25271a = rewardedVideoListener;
    }

    public static void setRewardedVideoServerParameters(Map<String, String> map) {
        L a10 = L.a();
        if (map != null) {
            try {
                if (map.size() != 0) {
                    a10.f24849g.log(IronSourceLogger.IronSourceTag.API, a10.f24838a + ":setRewardedVideoServerParameters(params:" + map.toString() + ")", 1);
                    a10.f24862n = new HashMap(map);
                }
            } catch (Exception e10) {
                a10.f24849g.logException(IronSourceLogger.IronSourceTag.API, a10.f24838a + ":setRewardedVideoServerParameters(params:" + map.toString() + ")", e10);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.ironsource.mediationsdk.D, com.ironsource.mediationsdk.s] */
    public static void setSegment(IronSourceSegment ironSourceSegment) {
        L a10 = L.a();
        a10.B = ironSourceSegment;
        com.ironsource.mediationsdk.adunit.c.h hVar = a10.S;
        if (hVar != null) {
            hVar.a(ironSourceSegment);
        }
        ?? r12 = a10.O;
        if (r12 != 0) {
            r12.a(ironSourceSegment);
        }
        com.ironsource.mediationsdk.adunit.c.g gVar = a10.R;
        if (gVar != null) {
            gVar.a(ironSourceSegment);
        }
        i0 i0Var = a10.P;
        if (i0Var != null) {
            i0Var.a(ironSourceSegment);
        }
        T t10 = a10.Q;
        if (t10 != null) {
            t10.a(ironSourceSegment);
        }
        com.ironsource.mediationsdk.a.d.d().f25046v = a10.B;
        com.ironsource.mediationsdk.a.h d10 = com.ironsource.mediationsdk.a.h.d();
        IronSourceSegment ironSourceSegment2 = a10.B;
        d10.f25046v = ironSourceSegment2;
        com.ironsource.mediationsdk.a.g.f25067w.f25046v = ironSourceSegment2;
    }

    public static void setSegmentListener(SegmentListener segmentListener) {
        L a10 = L.a();
        com.ironsource.mediationsdk.sdk.i iVar = a10.f24851h;
        if (iVar != null) {
            iVar.f25817d = segmentListener;
            Q.a().f24925t = a10.f24851h;
        }
    }

    public static void setUserId(String str) {
        L.a().l(str, true);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ironsource.mediationsdk.D, com.ironsource.mediationsdk.s] */
    public static void shouldTrackNetworkState(Context context, boolean z10) {
        L a10 = L.a();
        a10.f24870w = context;
        a10.f24871x = Boolean.valueOf(z10);
        if (a10.Z) {
            if (a10.f24839a0) {
                com.ironsource.mediationsdk.adunit.c.g gVar = a10.R;
                if (gVar != null) {
                    gVar.b(z10);
                }
            } else {
                i0 i0Var = a10.P;
                if (i0Var != null) {
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "Should Track Network State: " + z10, 0);
                    i0Var.A = z10;
                }
            }
        } else {
            w wVar = a10.f24844d;
            if (wVar != null) {
                wVar.f(context, z10);
            }
        }
        if (a10.V) {
            ?? r02 = a10.O;
            if (r02 != 0) {
                r02.a(context, z10);
                return;
            }
            return;
        }
        l0 l0Var = a10.f24842c;
        if (l0Var != null) {
            l0Var.e(context, z10);
        }
    }

    public static void showISDemandOnlyInterstitial(String str) {
        L a10 = L.a();
        IronSourceLoggerManager ironSourceLoggerManager = a10.f24849g;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "showISDemandOnlyInterstitial() instanceId=" + str, 1);
        try {
            if (!a10.E) {
                ironSourceLoggerManager.log(ironSourceTag, "Interstitial was initialized in mediation mode. Use showInterstitial instead", 3);
                return;
            }
            q0 q0Var = a10.f24852h0;
            if (q0Var == null) {
                ironSourceLoggerManager.log(ironSourceTag, "Interstitial video was not initiated", 3);
                E.a().b(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Interstitial video was not initiated"));
                return;
            }
            ConcurrentHashMap<String, C1432x> concurrentHashMap = q0Var.f25805a;
            if (!concurrentHashMap.containsKey(str)) {
                q0.c(str);
                E.a().b(str, ErrorBuilder.buildNonExistentInstanceError("Interstitial"));
            } else {
                C1432x c1432x = concurrentHashMap.get(str);
                q0.a(IronSourceConstants.IS_INSTANCE_SHOW, c1432x, (Object[][]) null);
                c1432x.a();
            }
        } catch (Exception e10) {
            ironSourceLoggerManager.logException(IronSourceLogger.IronSourceTag.API, "showISDemandOnlyInterstitial", e10);
            E.a().b(str, ErrorBuilder.buildInitFailedError("showISDemandOnlyInterstitial can't be called before the Interstitial ad unit initialization completed successfully", "Interstitial"));
        }
    }

    public static void showISDemandOnlyRewardedVideo(String str) {
        L.a().f(str);
    }

    public static void showInterstitial() {
        L a10 = L.a();
        IronSourceLoggerManager ironSourceLoggerManager = a10.f24849g;
        IronSourceLoggerManager ironSourceLoggerManager2 = a10.f24849g;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "showInterstitial()", 1);
        try {
            if (a10.E) {
                ironSourceLoggerManager2.log(ironSourceTag, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead", 3);
                F.a().a(new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead"), null);
            } else {
                if (!a10.C()) {
                    F.a().a(ErrorBuilder.buildInitFailedError("showInterstitial can't be called before the Interstitial ad unit initialization completed successfully", "Interstitial"), null);
                    return;
                }
                InterstitialPlacement B = a10.B();
                if (B != null) {
                    a10.h(B.getPlacementName());
                } else {
                    F.a().a(new IronSourceError(1020, "showInterstitial error: empty default placement in response"), null);
                }
            }
        } catch (Exception e10) {
            ironSourceLoggerManager2.logException(IronSourceLogger.IronSourceTag.API, "showInterstitial()", e10);
            F.a().a(new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, e10.getMessage()), null);
        }
    }

    public static void showOfferwall() {
        L a10 = L.a();
        try {
            a10.f24849g.log(IronSourceLogger.IronSourceTag.API, "showOfferwall()", 1);
            if (!a10.E()) {
                a10.f24851h.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
                return;
            }
            com.ironsource.mediationsdk.model.m a11 = a10.f24865r.f25936c.f25676c.a();
            if (a11 != null) {
                a10.j(a11.f25695b);
            }
        } catch (Exception e10) {
            a10.f24849g.logException(IronSourceLogger.IronSourceTag.API, "showOfferwall()", e10);
            a10.f24851h.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
        }
    }

    public static void showRewardedVideo() {
        L a10 = L.a();
        boolean z10 = a10.z();
        IronSourceLoggerManager ironSourceLoggerManager = a10.f24849g;
        if (!z10) {
            ae.a().a(ErrorBuilder.buildInitFailedError("showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            ironSourceLoggerManager.log(IronSourceLogger.IronSourceTag.INTERNAL, "showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", 3);
            return;
        }
        Placement u2 = a10.u();
        if (u2 != null) {
            a10.e(u2.getPlacementName());
            return;
        }
        ironSourceLoggerManager.log(IronSourceLogger.IronSourceTag.INTERNAL, "showRewardedVideo error: empty default placement in response", 3);
        ae.a().a(new IronSourceError(1021, "showRewardedVideo error: empty default placement in response"), (AdInfo) null);
    }

    public static synchronized String getISDemandOnlyBiddingData(Context context) {
        String b10;
        synchronized (IronSource.class) {
            b10 = L.a().b(context);
        }
        return b10;
    }

    public static void init(Activity activity, String str, InitializationListener initializationListener) {
        init(activity, str, initializationListener, null);
    }

    public static void initISDemandOnly(Context context, String str, AD_UNIT... ad_unitArr) {
        L.a().a(context, str, (InitializationListener) null, ad_unitArr);
    }

    public static void loadBanner(IronSourceBannerLayout ironSourceBannerLayout, String str) {
        L.a().a(ironSourceBannerLayout, str);
    }

    @Deprecated
    public static void loadISDemandOnlyInterstitial(String str) {
        L.a().d(null, str, null);
    }

    @Deprecated
    public static void loadISDemandOnlyInterstitialWithAdm(String str, String str2) {
        L.a().c(null, str, str2);
    }

    @Deprecated
    public static void loadISDemandOnlyRewardedVideo(String str) {
        L.a().b(null, str, null);
    }

    @Deprecated
    public static void loadISDemandOnlyRewardedVideoWithAdm(String str, String str2) {
        L.a().a((Activity) null, str, str2);
    }

    public static void setMetaData(String str, List<String> list) {
        L.a().a(str, list);
    }

    public static void showInterstitial(String str) {
        L.a().h(str);
    }

    public static void showOfferwall(String str) {
        L.a().j(str);
    }

    public static void showRewardedVideo(String str) {
        L.a().e(str);
    }

    public static void init(Activity activity, String str, InitializationListener initializationListener, AD_UNIT... ad_unitArr) {
        L.a().a(activity, str, false, initializationListener, ad_unitArr);
    }

    public static void init(Activity activity, String str, AD_UNIT... ad_unitArr) {
        L.a().a(activity, str, false, null, ad_unitArr);
    }
}
