package com.huawei.hms.ads;

import android.content.Context;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;

/* loaded from: classes2.dex */
public class ay extends ax {
    public ay() {
        super(aj.f21543i);
    }

    @Override // com.huawei.hms.ads.ag, com.huawei.hms.ads.ad
    public void execute(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) {
        V().V(remoteCallResultCallback, this.Code, this.I);
    }
}
