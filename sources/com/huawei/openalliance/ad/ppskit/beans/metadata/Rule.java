package com.huawei.openalliance.ad.ppskit.beans.metadata;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.beans.base.RspBean;

@DataKeep
/* loaded from: classes2.dex */
public class Rule extends RspBean {
    private static final String TAG = "Rule";
    private long noShowTime;
    private int skippedAdMaxTimes;
    private int skippedAdMinTimes;
    private int timeScope;

    public final int b() {
        return this.skippedAdMinTimes;
    }

    public final int k() {
        return this.timeScope;
    }

    public final int p() {
        return this.skippedAdMaxTimes;
    }

    public final long q() {
        return this.noShowTime;
    }
}
