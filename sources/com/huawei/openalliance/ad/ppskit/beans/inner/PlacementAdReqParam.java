package com.huawei.openalliance.ad.ppskit.beans.inner;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;

@DataKeep
/* loaded from: classes2.dex */
public class PlacementAdReqParam extends BaseAdReqParam {
    private boolean autoCache;
    private String extraInfo;

    public final String b() {
        return this.extraInfo;
    }

    public final boolean c() {
        return this.autoCache;
    }
}
