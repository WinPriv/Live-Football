package com.huawei.hms.ads;

import android.content.Context;
import com.huawei.hms.ads.consent.constant.ConsentStatus;
import com.huawei.hms.ads.consent.inter.Consent;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ar extends ag {
    public ar() {
        super(aj.f21555v);
    }

    @Override // com.huawei.hms.ads.ag, com.huawei.hms.ads.ad
    public void execute(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) {
        Consent.getInstance(context).setConsentStatus(ConsentStatus.forValue(new JSONObject(str).optInt(com.huawei.openalliance.ad.constant.av.P, ConsentStatus.UNKNOWN.getValue())));
        V(remoteCallResultCallback, true);
    }
}
