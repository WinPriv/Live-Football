package ka;

import android.text.TextUtils;
import com.huawei.hms.ads.cy;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class x {

    /* renamed from: c, reason: collision with root package name */
    public static x f32152c;

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f32153d = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f32154a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f32155b;

    public x() {
        HashMap hashMap = new HashMap();
        this.f32155b = hashMap;
        hashMap.put(com.huawei.openalliance.ad.constant.s.Code, q1.class);
        hashMap.put("reqPreSplashAd", o1.class);
        hashMap.put(com.huawei.openalliance.ad.constant.w.cg, r1.class);
        hashMap.put("reqPreNativeAd", n1.class);
        hashMap.put("reqNativeAd", i1.class);
        hashMap.put("queryCacheSplashAd", z0.class);
        hashMap.put("updateContentOnAdLoad", a2.class);
        hashMap.put("resetDisplayDateAndCount", u1.class);
        hashMap.put(com.huawei.openalliance.ad.constant.s.V, d4.class);
        hashMap.put(com.huawei.openalliance.ad.constant.s.I, e4.class);
        hashMap.put(com.huawei.openalliance.ad.constant.s.f22114i, f4.class);
        hashMap.put(com.huawei.openalliance.ad.constant.s.Z, h4.class);
        hashMap.put(com.huawei.openalliance.ad.constant.s.B, v3.class);
        hashMap.put(com.huawei.openalliance.ad.constant.s.C, y3.class);
        hashMap.put(com.huawei.openalliance.ad.constant.s.S, a4.class);
        hashMap.put(com.huawei.openalliance.ad.constant.s.D, u3.class);
        hashMap.put("startDownloadApp", m3.class);
        hashMap.put("pauseDownloadApp", i3.class);
        hashMap.put("resumeDownloadApp", k3.class);
        hashMap.put("cancelDownloadApp", b3.class);
        hashMap.put("reserveDownloadApp", g3.class);
        hashMap.put("getDownloadStatus", j3.class);
        hashMap.put("trafficReminderExceptionEvent", p3.class);
        hashMap.put("reqPlaceAd", j1.class);
        hashMap.put("reqRewardAd", p1.class);
        hashMap.put("rptPlacePlayErr", d2.class);
        hashMap.put("rptAdInvalidEvt", e2.class);
        hashMap.put(com.huawei.openalliance.ad.constant.s.L, d3.class);
        hashMap.put("startVideoCache", x1.class);
        hashMap.put("stopVideoCache", y1.class);
        hashMap.put(com.huawei.openalliance.ad.constant.s.f22107a, u0.class);
        hashMap.put("showReward", w1.class);
        hashMap.put("reportWebOpen", k4.class);
        hashMap.put("reportWebClose", i4.class);
        hashMap.put("reportWebLoadFinish", j4.class);
        hashMap.put("installDialogException", h3.class);
        hashMap.put("syncAgProtocolStatus", o3.class);
        hashMap.put(com.huawei.openalliance.ad.constant.s.f22109c, g2.class);
        hashMap.put(com.huawei.openalliance.ad.constant.s.f22108b, s3.class);
        hashMap.put("interstitial_ad_load", h1.class);
        hashMap.put("reqPreInterstitialAd", l1.class);
        hashMap.put("interstitial_ad_show", v1.class);
        hashMap.put(com.huawei.openalliance.ad.constant.s.f22110d, t3.class);
        hashMap.put("AppNotificationExceptionCmd", z2.class);
        hashMap.put("rptSplashFailedEvt", q2.class);
        hashMap.put("startFatDownloadApp", q3.class);
        hashMap.put(com.huawei.openalliance.ad.constant.s.f, o0.class);
        hashMap.put(com.huawei.openalliance.ad.constant.s.f22112g, p0.class);
        hashMap.put(cy.Code, n2.class);
        hashMap.put(cy.V, v2.class);
        hashMap.put("reportVideoPlayException", u2.class);
        hashMap.put(com.huawei.openalliance.ad.constant.s.f22113h, g0.class);
        hashMap.put("rptSplashDismissForExSplash", s2.class);
        hashMap.put("rptLandingEvent", b4.class);
        hashMap.put(cy.I, p2.class);
        hashMap.put(cy.Z, f2.class);
        hashMap.put("arContentVertify", b0.class);
        hashMap.put(com.huawei.openalliance.ad.constant.s.o, r0.class);
        hashMap.put("openArDetailPageNew", s0.class);
        hashMap.put("openArDetailPageNewParam", t0.class);
        hashMap.put(com.huawei.openalliance.ad.constant.s.f22124t, b1.class);
        hashMap.put("queryAppPermissions", g1.class);
        hashMap.put("getSpareSplashAd", l0.class);
        hashMap.put("rptStartSpareSplashAd", t2.class);
        hashMap.put(com.huawei.openalliance.ad.constant.s.f22121q, m2.class);
        hashMap.put("getNormalSplashAd", j0.class);
        hashMap.put(cy.B, l2.class);
        hashMap.put(cy.C, h2.class);
        hashMap.put(cy.F, r2.class);
        hashMap.put("apiReqConfig", a0.class);
        hashMap.put("consentlookup", n0.class);
        hashMap.put("reportconfirmresult", e1.class);
        hashMap.put("oaidSettingException", l4.class);
        hashMap.put(com.huawei.openalliance.ad.constant.s.f22123s, y0.class);
        hashMap.put(com.huawei.openalliance.ad.constant.s.f22122r, h0.class);
        hashMap.put("handleUriAction", m0.class);
        hashMap.put("reportFullScreenNotify", e3.class);
        hashMap.put("reqAdViaApi", f1.class);
        hashMap.put("buildApiRequestBody", z.class);
        hashMap.put("queryPkgInfo", c1.class);
        hashMap.put("reportEventFullScreenNotify", k2.class);
        hashMap.put("queryActivityExist", x0.class);
        hashMap.put("openAppMainPage", q0.class);
        hashMap.put("recommendationSettingException", c2.class);
        hashMap.put(com.huawei.openalliance.ad.constant.s.F, c4.class);
        hashMap.put("remoteSharedPrefSet", d1.class);
        hashMap.put(com.huawei.openalliance.ad.constant.s.f22125u, v0.class);
        hashMap.put("preloadWebView", w0.class);
        hashMap.put("continueInstall", c3.class);
        hashMap.put("reportInstallPermission", f3.class);
        hashMap.put("reportClickPlayEvent", w3.class);
        hashMap.put(com.huawei.openalliance.ad.constant.s.f22126v, j2.class);
        hashMap.put(com.huawei.openalliance.ad.constant.s.f22127w, z3.class);
        hashMap.put(com.huawei.openalliance.ad.constant.s.f22111e, g4.class);
        hashMap.put("setAutoOpen", l3.class);
        hashMap.put(com.huawei.openalliance.ad.constant.s.f22128x, a1.class);
        hashMap.put(com.huawei.openalliance.ad.constant.s.y, i0.class);
        hashMap.put(cy.D, i2.class);
        hashMap.put("reportNoCachePlayInCacheMode", o2.class);
        hashMap.put(com.huawei.openalliance.ad.constant.s.A, z1.class);
    }

    public static x a() {
        x xVar;
        synchronized (f32153d) {
            if (f32152c == null) {
                f32152c = new x();
            }
            xVar = f32152c;
        }
        return xVar;
    }

    public final b2 b(String str) {
        StringBuilder sb2;
        String sb3;
        if (TextUtils.isEmpty(str)) {
            sb3 = "get cmd, method is empty";
        } else {
            HashMap hashMap = this.f32154a;
            b2 b2Var = (b2) hashMap.get(str);
            if (b2Var == null) {
                n7.c("ApiCommandManager", "create command %s", str);
                Class cls = (Class) this.f32155b.get(str);
                if (cls == null) {
                    sb2 = new StringBuilder("no class found for cmd: ");
                } else {
                    try {
                        b2Var = (b2) cls.newInstance();
                    } catch (Throwable th) {
                        n7.h("ApiCommandManager", "get cmd %s: %s", str, th.getClass().getSimpleName());
                    }
                    if (b2Var == null) {
                        sb2 = new StringBuilder("no instance created for cmd: ");
                    } else {
                        hashMap.put(str, b2Var);
                    }
                }
                sb2.append(str);
                sb3 = sb2.toString();
            }
            return b2Var;
        }
        n7.g("ApiCommandManager", sb3);
        return null;
    }
}
