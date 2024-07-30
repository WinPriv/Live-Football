package com.huawei.hms.ads;

import android.content.Context;
import com.huawei.hms.ads.consent.bean.AdProvider;
import com.huawei.hms.ads.consent.constant.ConsentStatus;
import com.huawei.hms.ads.consent.inter.Consent;
import com.huawei.hms.ads.consent.inter.ConsentUpdateListener;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ap extends ag {
    public ap() {
        super(aj.f21554u);
    }

    @Override // com.huawei.hms.ads.ag, com.huawei.hms.ads.ad
    public void execute(Context context, String str, final RemoteCallResultCallback<String> remoteCallResultCallback) {
        Consent.getInstance(context).requestConsentUpdate(new ConsentUpdateListener() { // from class: com.huawei.hms.ads.ap.1
            public void onFail(String str2) {
                ag.Code(remoteCallResultCallback, ap.this.Code, br.f21565h, str2, true);
            }

            public void onSuccess(ConsentStatus consentStatus, boolean z10, List<AdProvider> list) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(com.huawei.openalliance.ad.constant.av.P, consentStatus.getValue());
                    jSONObject.put(com.huawei.openalliance.ad.constant.av.R, z10);
                    JSONArray jSONArray = new JSONArray();
                    if (!androidx.transition.n.h(list)) {
                        for (AdProvider adProvider : list) {
                            JSONObject jSONObject2 = new JSONObject();
                            if (adProvider != null) {
                                jSONObject2.put("id", adProvider.getId());
                                jSONObject2.put("name", adProvider.getName());
                                jSONObject2.put(com.huawei.openalliance.ad.constant.av.f22024ab, adProvider.getServiceArea());
                                jSONObject2.put(com.huawei.openalliance.ad.constant.av.f22025ac, adProvider.getPrivacyPolicyUrl());
                            }
                            jSONArray.put(jSONObject2);
                        }
                    }
                    jSONObject.put(com.huawei.openalliance.ad.constant.av.T, jSONArray);
                    ag.Code(remoteCallResultCallback, ap.this.Code, 1000, jSONObject.toString(), true);
                } catch (Throwable unused) {
                    ag.Code(remoteCallResultCallback, ap.this.Code, br.f21565h, "consent info is null", true);
                }
            }
        });
    }
}
