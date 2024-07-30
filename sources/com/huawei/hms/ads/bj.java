package com.huawei.hms.ads;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.inner.AdEventReport;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class bj extends bi {
    private static final String Z = "JsbReportClickEvent";

    public bj() {
        super(aj.f21548n);
    }

    @Override // com.huawei.hms.ads.ag, com.huawei.hms.ads.ad
    public void execute(final Context context, final String str, final RemoteCallResultCallback<String> remoteCallResultCallback) {
        ex.Code(Z, "start");
        final AdEventReport adEventReport = (AdEventReport) gb.b.b(AdEventReport.class, str, new Class[0]);
        final JSONObject jSONObject = new JSONObject(str);
        Code(context, str, true, new ac() { // from class: com.huawei.hms.ads.bj.1
            @Override // com.huawei.hms.ads.ac
            public void Code(AdContentData adContentData) {
                int i10;
                String str2;
                int i11;
                int i12;
                String str3;
                int i13;
                if (adContentData != null) {
                    if (bj.this.Code(adContentData)) {
                        adContentData.q(bj.this.S(jSONObject.optString(com.huawei.openalliance.ad.constant.av.aP)));
                        AdEventReport adEventReport2 = adEventReport;
                        String str4 = com.huawei.openalliance.ad.constant.v.f22135a;
                        int i14 = 13;
                        if (adEventReport2 != null) {
                            int b02 = adEventReport2.b0();
                            int c02 = adEventReport.c0();
                            if (!TextUtils.isEmpty(adEventReport.d0())) {
                                str4 = adEventReport.d0();
                            }
                            if (adEventReport.o() != null) {
                                i14 = adEventReport.o().intValue();
                            }
                            i11 = b02;
                            str3 = str4;
                            i13 = i14;
                            i12 = c02;
                            str2 = adEventReport.f0();
                        } else {
                            str2 = null;
                            i11 = 0;
                            i12 = 0;
                            str3 = com.huawei.openalliance.ad.constant.v.f22135a;
                            i13 = 13;
                        }
                        Context context2 = context;
                        jh.Code(context2, adContentData, str2, i11, i12, str3, i13, a0.a.k(context2), bj.this.C(str));
                        i10 = 1000;
                    } else {
                        ex.V(bj.Z, "ad is not in whitelist");
                        i10 = br.f;
                    }
                } else {
                    ex.V(bj.Z, "ad not exist");
                    i10 = 3002;
                }
                ag.Code(remoteCallResultCallback, bj.this.Code, i10, null, true);
            }
        });
    }
}
