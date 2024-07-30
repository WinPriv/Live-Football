package com.huawei.hms.ads;

import android.content.Context;
import android.content.Intent;
import com.huawei.openalliance.ad.inter.data.AdContentData;

/* loaded from: classes2.dex */
public class ge implements gi {
    public static final String Code = "appInfo";
    public static final String I = "downloadSource";
    public static final String V = "contentRecord";
    private static final String Z = "AppNotificationBaseAction";

    @Override // com.huawei.hms.ads.gi
    public void Code(Context context, Intent intent) {
        String simpleName;
        String str;
        try {
            com.huawei.openalliance.ad.inter.data.AppInfo appInfo = (com.huawei.openalliance.ad.inter.data.AppInfo) intent.getSerializableExtra(Code);
            AdContentData adContentData = (AdContentData) intent.getSerializableExtra("contentRecord");
            int intExtra = intent.getIntExtra(I, 1);
            if (appInfo != null && adContentData != null) {
                if (gj.Code(context).I(appInfo.q())) {
                    Code(context, appInfo, adContentData, intExtra);
                    gj.Code(context).V(appInfo.q());
                } else {
                    ex.V(Z, "packageName may be illegal:" + appInfo.q());
                }
            }
        } catch (IllegalStateException e10) {
            simpleName = e10.getClass().getSimpleName();
            str = "AppNotificationBaseAction.onReceive IllegalStateException:";
            ex.I(Z, str.concat(simpleName));
        } catch (Throwable th) {
            simpleName = th.getClass().getSimpleName();
            str = "AppNotificationBaseAction.onReceive Exception:";
            ex.I(Z, str.concat(simpleName));
        }
    }

    public void Code(Context context, com.huawei.openalliance.ad.inter.data.AppInfo appInfo, AdContentData adContentData, int i10) {
        ex.V(Z, "do nothing at base action!");
    }
}
