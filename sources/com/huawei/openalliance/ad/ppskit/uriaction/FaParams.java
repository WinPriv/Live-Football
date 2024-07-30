package com.huawei.openalliance.ad.ppskit.uriaction;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.utils.y0;

@DataKeep
/* loaded from: classes2.dex */
public class FaParams {
    private String hwChannelId;
    private String prdPkgName;

    public FaParams(String str, String str2) {
        this.prdPkgName = str;
        this.hwChannelId = str2;
    }

    public final String a() {
        return y0.q(null, this);
    }
}
