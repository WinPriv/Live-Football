package com.huawei.hms.ads;

import android.content.Context;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;

/* loaded from: classes2.dex */
public class bo extends bi {
    private static final String Z = "JsbReportPlayStartEvent";

    public bo() {
        super(aj.f21546l);
    }

    @Override // com.huawei.hms.ads.ag, com.huawei.hms.ads.ad
    public void execute(final Context context, String str, final RemoteCallResultCallback<String> remoteCallResultCallback) {
        ex.Code(Z, "start");
        Code(context, str, new ac() { // from class: com.huawei.hms.ads.bo.1
            @Override // com.huawei.hms.ads.ac
            public void Code(AdContentData adContentData) {
                jh.Code(context, adContentData, com.huawei.openalliance.ad.constant.ah.B, (Long) null, (Long) null, (Integer) null, (Integer) null);
                bo.this.V(remoteCallResultCallback, true);
            }
        });
    }
}
