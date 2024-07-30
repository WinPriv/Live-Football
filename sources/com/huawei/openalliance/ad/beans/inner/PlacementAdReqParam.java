package com.huawei.openalliance.ad.beans.inner;

import com.huawei.openalliance.ad.annotations.DataKeep;

@DataKeep
/* loaded from: classes2.dex */
public class PlacementAdReqParam extends BaseAdReqParam {
    private boolean autoCache;
    private String extraInfo;

    public final void b(String str) {
        this.extraInfo = str;
    }

    public final void c(boolean z10) {
        this.autoCache = z10;
    }
}
