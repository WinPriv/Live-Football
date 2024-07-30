package com.huawei.hms.ads.splash;

import android.content.Context;
import com.huawei.hms.ads.AdParam;
import com.huawei.hms.ads.annotation.GlobalApi;
import com.huawei.hms.ads.cj;
import com.huawei.hms.ads.ec;
import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.beans.parameter.AdSlotParam;
import com.huawei.openalliance.ad.constant.s;
import fa.j;
import gb.c0;
import gb.e;
import gb.h0;
import gb.z;
import ha.i;
import java.util.ArrayList;

@GlobalApi
/* loaded from: classes2.dex */
public class SplashAd {
    private static int Z;

    private static int Code(Context context, int i10) {
        if (i10 != 0) {
            return (i10 == 1 || context == null || context.getResources().getConfiguration().orientation != 2) ? 1 : 0;
        }
        return 0;
    }

    @GlobalApi
    public static void dismissExSplashSlogan(final Context context) {
        c0.c(new Runnable() { // from class: com.huawei.hms.ads.splash.SplashAd.1
            @Override // java.lang.Runnable
            public void run() {
                i.e(context).d(s.f22115j, null, null, null);
            }
        });
    }

    @GlobalApi
    public static boolean isExSplashEnable(Context context) {
        return z.g(context);
    }

    @GlobalApi
    public static void preloadAd(Context context, String str, int i10, AdParam adParam) {
        if (context != null && str != null) {
            Z = h0.c(context);
            j a10 = j.a(context);
            if (a10 instanceof j) {
                AdSlotParam.a aVar = new AdSlotParam.a();
                Code(context, str, i10, adParam, aVar);
                AdSlotParam adSlotParam = new AdSlotParam(aVar);
                a10.getClass();
                AdSlotParam F = adSlotParam.F();
                a10.getClass();
                ex.V("HiAdSplash", "preloadAd request");
                ex.V("HiAdSplash", "request preload splash ad");
                c0.d(new fa.i(a10, F));
                e.b(a10.f28251a, F.a());
            }
        }
    }

    @GlobalApi
    public static void setDefaultSplashMode(Context context, int i10) {
        j a10 = j.a(context);
        a10.getClass();
        if (1 == i10 || 2 == i10) {
            ec.Code(a10.f28251a).S(i10);
        }
    }

    @GlobalApi
    public static void setSloganShowTimeWhenNoAd(final Context context, final int i10) {
        c0.c(new Runnable() { // from class: com.huawei.hms.ads.splash.SplashAd.2
            @Override // java.lang.Runnable
            public void run() {
                i.e(context).d(s.f22116k, String.valueOf(i10), null, null);
            }
        });
    }

    @GlobalApi
    public void dismissExSplash(final Context context) {
        c0.c(new Runnable() { // from class: com.huawei.hms.ads.splash.SplashAd.3
            @Override // java.lang.Runnable
            public void run() {
                i.e(context).d(s.f22117l, null, null, null);
            }
        });
    }

    @GlobalApi
    public void setExSplashShowTime(final Context context, final int i10) {
        c0.c(new Runnable() { // from class: com.huawei.hms.ads.splash.SplashAd.4
            @Override // java.lang.Runnable
            public void run() {
                i.e(context).d(s.f22118m, String.valueOf(i10), null, null);
            }
        });
    }

    public static void Code(Context context, String str, int i10, AdParam adParam, AdSlotParam.a aVar) {
        if (adParam == null || aVar == null) {
            return;
        }
        aVar.f21967d = Z;
        aVar.f21968e = z.k(context);
        aVar.f = z.a(context);
        aVar.f21974l = cj.Code(adParam.V());
        aVar.f21975m = adParam.getGender();
        aVar.f21976n = adParam.getTargetingContentUrl();
        aVar.f21977p = adParam.getKeywords();
        aVar.o = adParam.I();
        aVar.a(adParam.C());
        if (adParam.Code() != null) {
            aVar.f21973k = adParam.Code();
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(str);
        int Code = Code(context, i10);
        aVar.f21964a = arrayList;
        aVar.f21965b = Code;
    }
}
