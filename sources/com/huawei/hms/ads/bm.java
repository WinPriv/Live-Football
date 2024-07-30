package com.huawei.hms.ads;

import android.content.Context;
import com.huawei.openalliance.ad.beans.inner.AdEventReport;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;

/* loaded from: classes2.dex */
public class bm extends bi {
    private static final String Z = "JsbReportPlayPauseEvent";

    public bm() {
        super(aj.f21546l);
    }

    @Override // com.huawei.hms.ads.ag, com.huawei.hms.ads.ad
    public void execute(final Context context, String str, final RemoteCallResultCallback<String> remoteCallResultCallback) {
        ex.Code(Z, "start");
        final AdEventReport adEventReport = (AdEventReport) gb.b.b(AdEventReport.class, str, new Class[0]);
        Code(context, str, new ac() { // from class: com.huawei.hms.ads.bm.1
            @Override // com.huawei.hms.ads.ac
            public void Code(AdContentData adContentData) {
                long longValue;
                int intValue;
                AdEventReport adEventReport2 = adEventReport;
                if (adEventReport2 != null) {
                    long j10 = 0;
                    if (adEventReport2.R() == null) {
                        longValue = 0;
                    } else {
                        longValue = adEventReport.R().longValue();
                    }
                    if (adEventReport.U() != null) {
                        j10 = adEventReport.U().longValue();
                    }
                    int i10 = 0;
                    if (adEventReport.X() == null) {
                        intValue = 0;
                    } else {
                        intValue = adEventReport.X().intValue();
                    }
                    if (adEventReport.a0() != null) {
                        i10 = adEventReport.a0().intValue();
                    }
                    jh.Code(context, adContentData, com.huawei.openalliance.ad.constant.ah.C, Long.valueOf(longValue), Long.valueOf(j10), Integer.valueOf(intValue), Integer.valueOf(i10));
                }
                bm.this.V(remoteCallResultCallback, true);
            }
        });
    }
}
