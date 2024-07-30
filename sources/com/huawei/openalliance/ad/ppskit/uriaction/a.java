package com.huawei.openalliance.ad.ppskit.uriaction;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hag.abilitykit.api.KitSdkManager;
import com.huawei.hag.abilitykit.dispatch.callback.StartAbilityCallBack;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.fadata.PPSAbilityDataContent;
import com.huawei.openalliance.ad.ppskit.handlers.x;
import com.huawei.openalliance.ad.ppskit.uriaction.RequestMsgBuilder;
import com.huawei.openalliance.ad.ppskit.utils.y0;
import ka.ii;
import ka.n7;

/* loaded from: classes2.dex */
public final class a extends ii {

    /* renamed from: com.huawei.openalliance.ad.ppskit.uriaction.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0293a implements StartAbilityCallBack {
    }

    public a(Context context, ContentRecord contentRecord) {
        super(context, contentRecord);
    }

    @Override // ka.ii
    public final boolean a() {
        Context context = this.f31307a;
        try {
            n7.e("FeatureAbilityAction", "handle Feature ability action");
            if (!x.m()) {
                n7.e("FeatureAbilityAction", "UnSupport HAG!");
                return c();
            }
            ContentRecord contentRecord = this.f31308b;
            if (contentRecord != null && !TextUtils.isEmpty(contentRecord.e1())) {
                n7.c("FeatureAbilityAction", "AbilityDetailInfo is %s", contentRecord.e1());
                n7.c("FeatureAbilityAction", "HwChannelID is %s", contentRecord.I1());
                PPSAbilityDataContent pPSAbilityDataContent = (PPSAbilityDataContent) y0.p(PPSAbilityDataContent.class, contentRecord.e1(), new Class[0]);
                if (pPSAbilityDataContent == null) {
                    n7.e("FeatureAbilityAction", "abilityDataContent is not json!");
                    return c();
                }
                pPSAbilityDataContent.a(new FaParams(contentRecord.h1(), contentRecord.I1()).a());
                RequestMsgBuilder.a aVar = new RequestMsgBuilder.a();
                aVar.d(context.getPackageName());
                aVar.f();
                aVar.c(pPSAbilityDataContent);
                KitSdkManager.getInstance().startAbilityByAbilityInfo(context, y0.r(aVar.a()), new C0293a());
                b();
                return true;
            }
            n7.e("FeatureAbilityAction", "parameters is empty!");
            return c();
        } catch (Throwable th) {
            n7.h("FeatureAbilityAction", "handle uri exception: %s", th.getClass().getSimpleName());
            return c();
        }
    }
}
