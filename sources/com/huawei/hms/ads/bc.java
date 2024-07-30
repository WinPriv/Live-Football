package com.huawei.hms.ads;

import android.content.Context;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;

/* loaded from: classes2.dex */
public class bc extends as {
    public bc() {
        super(aj.f21539d);
    }

    @Override // com.huawei.hms.ads.ag, com.huawei.hms.ads.ad
    public void execute(final Context context, String str, final RemoteCallResultCallback<String> remoteCallResultCallback) {
        Code(context, str, new ac() { // from class: com.huawei.hms.ads.bc.1
            @Override // com.huawei.hms.ads.ac
            public void Code(AdContentData adContentData) {
                da.n nVar = da.n.DOWNLOAD;
                if (adContentData != null) {
                    nVar = com.huawei.hms.ads.jsb.a.Code(context).Code().g(context, new com.huawei.openalliance.ad.inter.data.o(adContentData));
                }
                ag.Code(remoteCallResultCallback, bc.this.Code, 1000, bc.this.Code(nVar), true);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String Code(da.n nVar) {
        return nVar == null ? "DOWNLOAD" : nVar.toString();
    }
}
