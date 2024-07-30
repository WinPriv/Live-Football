package com.huawei.openalliance.ad.uriaction;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hag.abilitykit.api.KitSdkManager;
import com.huawei.hag.abilitykit.dispatch.callback.StartAbilityCallBack;
import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.fadata.PPSAbilityDataContent;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.ppskit.utils.g;
import com.huawei.openalliance.ad.uriaction.RequestMsgBuilder;
import fb.m;
import gb.b;

/* loaded from: classes2.dex */
public final class a extends m {

    /* renamed from: com.huawei.openalliance.ad.uriaction.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0304a implements StartAbilityCallBack {
    }

    public a(Context context, AdContentData adContentData) {
        super(context, adContentData);
    }

    @Override // fb.m
    public final boolean a() {
        Context context = this.f28346a;
        try {
            ex.V("FeatureAbilityAction", "handle Feature ability action");
            if (!g.a()) {
                ex.V("FeatureAbilityAction", "UnSupport HAG!");
                return d();
            }
            AdContentData adContentData = this.f28347b;
            if (adContentData != null && !TextUtils.isEmpty(adContentData.g0())) {
                ex.Code("FeatureAbilityAction", "AbilityDetailInfo is %s", adContentData.g0());
                ex.Code("FeatureAbilityAction", "HwChannelID is %s", adContentData.h0());
                PPSAbilityDataContent pPSAbilityDataContent = (PPSAbilityDataContent) b.o(PPSAbilityDataContent.class, adContentData.g0(), new Class[0]);
                if (pPSAbilityDataContent == null) {
                    ex.V("FeatureAbilityAction", "abilityDataContent is not json!");
                    return d();
                }
                pPSAbilityDataContent.a(new FaParams(context.getPackageName(), adContentData.h0()).a());
                RequestMsgBuilder.a aVar = new RequestMsgBuilder.a();
                aVar.d(context.getPackageName());
                aVar.g();
                aVar.c(pPSAbilityDataContent);
                KitSdkManager.getInstance().startAbilityByAbilityInfo(context, b.p(aVar.a()), new C0304a());
                b();
                return true;
            }
            ex.V("FeatureAbilityAction", "parameters is empty!");
            return d();
        } catch (Throwable th) {
            ex.I("FeatureAbilityAction", "handle uri exception: %s", th.getClass().getSimpleName());
            return d();
        }
    }
}
