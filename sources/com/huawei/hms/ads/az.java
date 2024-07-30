package com.huawei.hms.ads;

import android.content.Context;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;

/* loaded from: classes2.dex */
public class az extends ax {
    public az() {
        super(aj.f21540e);
    }

    @Override // com.huawei.hms.ads.ag, com.huawei.hms.ads.ad
    public void execute(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) {
        V().Code(remoteCallResultCallback, this.Code, this.I);
    }
}
