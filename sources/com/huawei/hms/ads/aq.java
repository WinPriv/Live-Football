package com.huawei.hms.ads;

import android.content.Context;
import com.huawei.hms.ads.consent.inter.Consent;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class aq extends ag {
    private static final int B = 1;
    private static final int Z = 0;

    public aq() {
        super(aj.f21556w);
    }

    @Override // com.huawei.hms.ads.ag, com.huawei.hms.ads.ad
    public void execute(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) {
        boolean z10 = false;
        if (new JSONObject(str).optInt(com.huawei.openalliance.ad.constant.av.Q, 0) == 1) {
            z10 = true;
        }
        Consent.getInstance(context).setUnderAgeOfPromise(z10);
        V(remoteCallResultCallback, true);
    }
}
