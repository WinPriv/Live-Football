package com.huawei.hms.ads;

import android.content.Context;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;

/* loaded from: classes2.dex */
public class ba extends as {
    public ba() {
        super(aj.f21536a);
    }

    @Override // com.huawei.hms.ads.ag, com.huawei.hms.ads.ad
    public void execute(final Context context, final String str, final RemoteCallResultCallback<String> remoteCallResultCallback) {
        Code(context, str, new ac() { // from class: com.huawei.hms.ads.ba.1
            @Override // com.huawei.hms.ads.ac
            public void Code(AdContentData adContentData) {
                if (adContentData != null) {
                    ba.this.V(context, str).f(context, new com.huawei.openalliance.ad.inter.data.o(adContentData));
                    ba.this.V((RemoteCallResultCallback<String>) remoteCallResultCallback, true);
                    return;
                }
                ag.Code(remoteCallResultCallback, ba.this.Code, 3002, null, true);
            }
        });
    }
}
