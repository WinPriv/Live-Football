package com.huawei.hms.ads;

import android.content.Context;
import com.huawei.openalliance.ad.beans.inner.AdEventReport;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class bp extends bi {
    private static final String Z = "JsbReportShowEvent";

    public bp() {
        super(aj.f21546l);
    }

    @Override // com.huawei.hms.ads.ag, com.huawei.hms.ads.ad
    public void execute(final Context context, String str, final RemoteCallResultCallback<String> remoteCallResultCallback) {
        ex.Code(Z, "start");
        final AdEventReport adEventReport = (AdEventReport) gb.b.b(AdEventReport.class, str, new Class[0]);
        final JSONObject jSONObject = new JSONObject(str);
        Code(context, str, true, new ac() { // from class: com.huawei.hms.ads.bp.1
            @Override // com.huawei.hms.ads.ac
            public void Code(AdContentData adContentData) {
                int i10;
                AdEventReport adEventReport2 = adEventReport;
                if (adEventReport2 != null) {
                    if (adEventReport2.f()) {
                        jh.Code(context, adContentData, adEventReport.B().longValue(), adEventReport.r().intValue());
                    } else if (adContentData != null) {
                        adContentData.q(bp.this.S(jSONObject.optString(com.huawei.openalliance.ad.constant.av.aP)));
                        if (bp.this.Code(adContentData)) {
                            jh.Code(context, adContentData, adEventReport.B(), adEventReport.r(), adEventReport.o(), adEventReport.g0());
                        } else {
                            ex.V(bp.Z, "ad is not in whitelist");
                            i10 = br.f;
                        }
                    } else {
                        i10 = 3002;
                    }
                    i10 = 1000;
                } else {
                    i10 = 3001;
                }
                ag.Code(remoteCallResultCallback, bp.this.Code, i10, null, true);
            }
        });
    }
}
