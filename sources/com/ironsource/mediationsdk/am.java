package com.ironsource.mediationsdk;

import android.content.Context;
import com.huawei.openalliance.ad.constant.bj;
import com.ironsource.mediationsdk.model.NetworkSettings;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class am {
    public static JSONObject a(Context context, com.ironsource.mediationsdk.utils.p pVar) {
        AbstractAdapter a10;
        zc.d.d(context, bj.f.o);
        zc.d.d(pVar, "tokenSettings");
        if (pVar.f25957d) {
            JSONObject a11 = C1428r.a(context, new com.ironsource.environment.f.b().f24675a);
            zc.d.c(a11, "mGlobalDataReader.getDat…s(context, mTokenKeyList)");
            return com.ironsource.environment.f.b.a(a11);
        }
        NetworkSettings networkSettings = pVar.f25955b;
        if (networkSettings == null || (a10 = C1416d.a().a(networkSettings, networkSettings.getApplicationSettings(), true, false)) == null) {
            return null;
        }
        return C1418f.a().a(a10.getPlayerBiddingData(), pVar.f25956c, pVar.f25954a);
    }
}
