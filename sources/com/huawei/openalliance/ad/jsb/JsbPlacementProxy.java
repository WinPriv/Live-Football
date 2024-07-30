package com.huawei.openalliance.ad.jsb;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.ads.ag;
import com.huawei.hms.ads.ai;
import com.huawei.hms.ads.annotation.AllApi;
import com.huawei.hms.ads.eh;
import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import gb.c0;

@AllApi
/* loaded from: classes2.dex */
public class JsbPlacementProxy extends ag {
    @AllApi
    public JsbPlacementProxy() {
    }

    @Override // com.huawei.hms.ads.ag, com.huawei.hms.ads.ad
    @AllApi
    public void execute(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) {
        String V = ai.V(str);
        if (context != null && !TextUtils.isEmpty(str)) {
            c0.a(new ai.a(context, eh.Code().Code(V), V, str, remoteCallResultCallback));
        } else {
            ex.Z("JsbPlacementProxy", "param is invalid, please check it!");
            ag.Code(remoteCallResultCallback, V, -1, null, true);
        }
    }
}
