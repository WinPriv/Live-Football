package com.huawei.openalliance.ad.ppskit.handlers;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.huawei.ads.adsrec.AdRecommendEngine;
import com.huawei.ads.adsrec.bean.AdAffair;
import com.huawei.ads.adsrec.recall.AdRecallParam;
import com.huawei.ads.fund.util.AsyncExec;
import com.huawei.hag.abilitykit.api.KitSdkManager;
import com.huawei.hms.account.sdk.AccountKitInnerApi;
import com.huawei.hms.account.sdk.entity.GetUserInnerInfoReq;
import com.huawei.hms.account.sdk.internal.AccountKitInnerApiHelper;
import com.huawei.hms.core.common.CoreApiClient;
import com.huawei.ohos.localability.AbilityUtils;
import com.huawei.openalliance.ad.ppskit.beans.metadata.AdSlot30;
import com.huawei.openalliance.ad.ppskit.beans.metadata.App;
import com.huawei.openalliance.ad.ppskit.beans.metadata.PostBackEvent;
import com.huawei.openalliance.ad.ppskit.beans.server.AdContentReq;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import com.huawei.openalliance.ad.ppskit.utils.r1;
import com.huawei.openalliance.ad.ppskit.utils.z1;
import java.util.ArrayList;
import java.util.List;
import ka.n7;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f22637a = false;

    public static AdRecallParam a(Context context, AdContentReq adContentReq, String str) {
        AdRecallParam b10 = b(adContentReq);
        if (b10 != null) {
            b10.setLocalRecallMaxCount(Integer.valueOf(l.d(context).F(str)));
        }
        return b10;
    }

    public static AdRecallParam b(AdContentReq adContentReq) {
        String str;
        App A = adContentReq.A();
        if (A == null) {
            str = "compose param - app is null";
        } else {
            String e10 = A.e();
            List<AdSlot30> E = adContentReq.E();
            if (androidx.transition.n.M(E)) {
                str = "slots is empty";
            } else {
                ArrayList arrayList = new ArrayList(E.size());
                Integer num = null;
                int i10 = 3;
                for (AdSlot30 adSlot30 : E) {
                    arrayList.add(adSlot30.a());
                    if (num == null) {
                        num = adSlot30.n();
                    }
                    i10 = adSlot30.i();
                }
                return new AdRecallParam(e10, adContentReq.G(), arrayList, num, i10);
            }
        }
        n7.g("AdRecommendEngineCaller", str);
        return null;
    }

    public static List c(String str) {
        return AbilityUtils.getLaunchIntents(str);
    }

    public static JSONObject d(Context context, AdRecallParam adRecallParam) {
        return new AdRecommendEngine(context).recallAds(adRecallParam, new w());
    }

    public static void e() {
        AsyncExec.setExecutorFactory(new AsyncExec.ExecutorFactory());
    }

    public static void f(Context context, Intent intent) {
        AbilityUtils.startAbility(context, intent);
    }

    public static void g(Context context, PostBackEvent postBackEvent) {
        String p10 = postBackEvent.p();
        if (!oa.g.f33795a.contains(p10)) {
            n7.b("AdRecommendEngineCaller", "no need report to rec engine");
            return;
        }
        n7.c("AdRecommendEngineCaller", "post ad affair to rec engine: %s", p10);
        AdRecommendEngine adRecommendEngine = new AdRecommendEngine(context);
        AdAffair.Builder builder = new AdAffair.Builder();
        builder.setPkgName(postBackEvent.a()).setSlotId(postBackEvent.e()).setContentId(postBackEvent.i()).setShowId(postBackEvent.k()).setShowDuration(Long.valueOf(postBackEvent.m())).setMaxShowRatio(Integer.valueOf(postBackEvent.o())).setEventType(p10).setEventTime(Long.valueOf(postBackEvent.q()));
        adRecommendEngine.postAdAffair(builder.build());
    }

    public static void h(Context context, String str, String str2) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(str, str2));
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        intent.putExtra("ohos.extra.param.key.INSTALL_ON_DEMAND", true);
        AbilityUtils.startAbility(context, intent);
    }

    public static boolean i() {
        return androidx.transition.n.W("com.huawei.hag.abilitykit.api.KitSdkManager");
    }

    public static boolean j(Context context) {
        try {
            l(context);
            return true;
        } catch (Throwable th) {
            n7.j("AdRecommendEngineCaller", "check ad rec engine error:%s", th.getClass().getSimpleName());
            return false;
        }
    }

    public static void k(int i10, Context context) {
        if (z1.R(context)) {
            n7.e("CoreAccountUtil", "oobe, skip");
        } else if (com.huawei.openalliance.ad.ppskit.utils.d0.m(context)) {
            AccountKitInnerApi api = AccountKitInnerApiHelper.getApi(CoreApiClient.getInstance().getContext(), "PPS");
            GetUserInnerInfoReq getUserInnerInfoReq = new GetUserInnerInfoReq();
            getUserInnerInfoReq.setFromNoCached(false);
            api.getUserInfo(getUserInnerInfoReq, new com.huawei.openalliance.ad.ppskit.utils.d());
        }
    }

    public static synchronized void l(Context context) {
        synchronized (x.class) {
            if (!f22637a) {
                p2.a(new com.huawei.openalliance.ad.ppskit.utils.b(context), 2);
                e();
                f22637a = true;
                n7.e("AdRecommendEngineCaller", "common lib inited");
                r1.a();
            }
        }
    }

    public static boolean m() {
        if (i()) {
            try {
                boolean canIUseApi = KitSdkManager.getInstance().canIUseApi("startAbilityByAbilityInfo");
                n7.f("HagUtil", "can use api is %s", Boolean.valueOf(canIUseApi));
                return canIUseApi;
            } catch (Throwable th) {
                n7.f("HagUtil", "isSupportFaApi exception %s", th.getClass().getSimpleName());
            }
        }
        return false;
    }
}
