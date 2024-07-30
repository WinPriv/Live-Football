package com.huawei.hms.ads;

import android.content.Context;
import com.huawei.openalliance.ad.inter.data.AdContentData;

/* loaded from: classes2.dex */
public class gf extends ge {
    private static final String Z = "AppNotificationDelete";

    @Override // com.huawei.hms.ads.ge
    public void Code(Context context, com.huawei.openalliance.ad.inter.data.AppInfo appInfo, AdContentData adContentData, int i10) {
        if (adContentData == null) {
            ex.V(Z, "contentRecord is empty");
        } else {
            gg.Code(context, adContentData);
        }
    }
}
