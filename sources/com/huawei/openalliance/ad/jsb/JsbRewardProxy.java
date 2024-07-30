package com.huawei.openalliance.ad.jsb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.ads.ad;
import com.huawei.hms.ads.ag;
import com.huawei.hms.ads.ai;
import com.huawei.hms.ads.annotation.AllApi;
import com.huawei.hms.ads.em;
import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import gb.c0;

@AllApi
/* loaded from: classes2.dex */
public class JsbRewardProxy extends ag {
    @AllApi
    public JsbRewardProxy() {
    }

    @Override // com.huawei.hms.ads.ag, com.huawei.hms.ads.ad
    @AllApi
    public void execute(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) {
        String V = ai.V(str);
        if (context != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(V)) {
            ad Code = em.Code().Code(V);
            if (Code != null) {
                if (ai.Code().Code(V, Code(context))) {
                    Code.Code((Activity) Code(context));
                }
                Code.Code(this.V);
            }
            c0.a(new ai.a(context, Code, V, str, remoteCallResultCallback));
            return;
        }
        ex.Z("JsbRewardProxy", "param is invalid, please check it!");
        ag.Code(remoteCallResultCallback, V, -1, null, true);
    }
}
