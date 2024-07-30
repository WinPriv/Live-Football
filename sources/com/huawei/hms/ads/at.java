package com.huawei.hms.ads;

import android.content.Context;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;

/* loaded from: classes2.dex */
public class at extends as {
    public at() {
        super(aj.f21537b);
    }

    @Override // com.huawei.hms.ads.ag, com.huawei.hms.ads.ad
    public void execute(final Context context, final String str, final RemoteCallResultCallback<String> remoteCallResultCallback) {
        Code(context, str, new ac() { // from class: com.huawei.hms.ads.at.1
            @Override // com.huawei.hms.ads.ac
            public void Code(AdContentData adContentData) {
                if (adContentData != null) {
                    at.this.V(context, str).e(context, new com.huawei.openalliance.ad.inter.data.o(adContentData));
                    at.this.V((RemoteCallResultCallback<String>) remoteCallResultCallback, true);
                    return;
                }
                ag.Code(remoteCallResultCallback, at.this.Code, 3002, null, true);
            }
        });
    }
}
