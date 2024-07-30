package com.huawei.hms.ads;

import android.content.Context;
import com.huawei.openalliance.ad.beans.inner.AdEventReport;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import java.util.List;

/* loaded from: classes2.dex */
public class bk extends bi {
    private static final String Z = "JsbReportCloseEvent";

    public bk() {
        super(aj.o);
    }

    @Override // com.huawei.hms.ads.ag, com.huawei.hms.ads.ad
    public void execute(final Context context, String str, final RemoteCallResultCallback<String> remoteCallResultCallback) {
        ex.Code(Z, Z);
        final AdEventReport adEventReport = (AdEventReport) gb.b.b(AdEventReport.class, str, new Class[0]);
        Code(context, str, new ac() { // from class: com.huawei.hms.ads.bk.1
            @Override // com.huawei.hms.ads.ac
            public void Code(AdContentData adContentData) {
                List<String> list;
                if (adContentData != null) {
                    AdEventReport adEventReport2 = adEventReport;
                    if (adEventReport2 != null) {
                        list = adEventReport2.e0();
                    } else {
                        list = null;
                    }
                    jh.Code(context, adContentData, 0, 0, list);
                    bk.this.V(remoteCallResultCallback, true);
                }
            }
        });
    }
}
