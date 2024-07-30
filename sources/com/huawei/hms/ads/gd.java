package com.huawei.hms.ads;

import android.content.Context;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import gb.b0;
import gb.c0;

/* loaded from: classes2.dex */
public class gd extends ge {
    private static final String Z = "AppNotificationActivate";

    @Override // com.huawei.hms.ads.ge
    public void Code(Context context, com.huawei.openalliance.ad.inter.data.AppInfo appInfo, AdContentData adContentData, int i10) {
        String str;
        int i11;
        if (adContentData != null && appInfo != null) {
            if (context != null) {
                String q10 = appInfo.q();
                if (!b0.c(context, q10, appInfo.D())) {
                    ex.V("AppLauncher", "handClick, openAppIntent fail");
                    if (b0.b(context, q10)) {
                        i11 = 2;
                    } else {
                        i11 = 1;
                    }
                    jh.Code(context, adContentData, com.huawei.openalliance.ad.constant.ah.D, (Integer) 1, Integer.valueOf(i11));
                    if (b0.h(context, q10)) {
                        jh.Code(context, adContentData, (Integer) 1);
                        c0.c(new da.i(appInfo));
                        c0.c(new da.j(appInfo));
                    } else {
                        str = "handClick, openAppMainPage fail";
                    }
                } else {
                    c0.c(new da.i(appInfo));
                    c0.c(new da.j(appInfo));
                    jh.Code(context, adContentData, "intentSuccess", (Integer) 1, (Integer) null);
                }
                gg.V(context, adContentData);
                return;
            }
            str = "parameters occur error";
            ex.V("AppLauncher", str);
            gg.V(context, adContentData);
            return;
        }
        ex.V(Z, "contentRecord is empty");
    }
}
