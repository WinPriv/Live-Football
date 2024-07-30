package com.huawei.hms.ads;

import android.content.Context;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class al extends ag {
    private static final String Z = "JsbFeedbackClose";

    public al() {
        super(aj.E);
    }

    @Override // com.huawei.hms.ads.ag, com.huawei.hms.ads.ad
    public void execute(final Context context, String str, final RemoteCallResultCallback<String> remoteCallResultCallback) {
        if (ex.Code()) {
            ex.Code(Z, "start");
        }
        final String optString = new JSONObject(str).optString(com.huawei.openalliance.ad.constant.av.aO, "3");
        Code(context, str, new ac() { // from class: com.huawei.hms.ads.al.1
            @Override // com.huawei.hms.ads.ac
            public void Code(AdContentData adContentData) {
                int i10;
                if (adContentData != null) {
                    cz.Code(context, adContentData, optString);
                    i10 = 1000;
                } else {
                    ex.Code(al.Z, "ad not exist");
                    i10 = 3002;
                }
                ag.Code(remoteCallResultCallback, al.this.Code, i10, null, true);
            }
        });
    }
}
