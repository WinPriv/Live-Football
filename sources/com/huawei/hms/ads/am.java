package com.huawei.hms.ads;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import gb.r0;

/* loaded from: classes2.dex */
class am extends ag {
    private static final int B = -1;
    private static final int Z = 0;

    public am() {
        super(aj.f21554u);
    }

    @Override // com.huawei.hms.ads.ag, com.huawei.hms.ads.ad
    public void execute(final Context context, String str, final RemoteCallResultCallback<String> remoteCallResultCallback) {
        if (cl.Code(context).V()) {
            ag.Code(remoteCallResultCallback, this.Code, 3005, null, true);
        } else {
            Code(context, str, new ac() { // from class: com.huawei.hms.ads.am.1
                @Override // com.huawei.hms.ads.ac
                public void Code(AdContentData adContentData) {
                    int i10;
                    if (adContentData == null) {
                        ag.Code(remoteCallResultCallback, am.this.Code, 3002, null, true);
                        return;
                    }
                    String l02 = adContentData.l0();
                    if (TextUtils.isEmpty(l02)) {
                        l02 = adContentData.k0();
                    } else if (TextUtils.isEmpty(l02)) {
                        l02 = com.huawei.openalliance.ad.constant.w.al;
                    }
                    RemoteCallResultCallback remoteCallResultCallback2 = remoteCallResultCallback;
                    String str2 = am.this.Code;
                    if (r0.l(context, l02)) {
                        i10 = 0;
                    } else {
                        i10 = -1;
                    }
                    ag.Code(remoteCallResultCallback2, str2, 1000, Integer.valueOf(i10), true);
                }
            });
        }
    }
}
