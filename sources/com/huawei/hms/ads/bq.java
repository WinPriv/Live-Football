package com.huawei.hms.ads;

import android.content.Context;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;

/* loaded from: classes2.dex */
public class bq extends bi {
    private static final String Z = "JsbReportShowStartEvent";

    public bq() {
        super(aj.f21547m);
    }

    @Override // com.huawei.hms.ads.ag, com.huawei.hms.ads.ad
    public void execute(final Context context, String str, final RemoteCallResultCallback<String> remoteCallResultCallback) {
        ex.Code(Z, "start");
        Code(context, str, new ac() { // from class: com.huawei.hms.ads.bq.1
            @Override // com.huawei.hms.ads.ac
            public void Code(AdContentData adContentData) {
                jh.Code(context, adContentData);
                bq.this.V(remoteCallResultCallback, true);
            }
        });
    }
}
