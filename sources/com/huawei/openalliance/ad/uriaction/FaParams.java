package com.huawei.openalliance.ad.uriaction;

import com.huawei.openalliance.ad.annotations.DataKeep;
import gb.b;

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
        return b.p(this);
    }
}
