package com.huawei.openalliance.ad.ppskit.beans.metadata;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;

@DataKeep
/* loaded from: classes2.dex */
public class RiskToken {
    private int innerCode;
    private String riskToken;

    public final int a() {
        return this.innerCode;
    }

    public final String b() {
        return this.riskToken;
    }

    public final String toString() {
        return "WiseGuard risk token: " + this.riskToken + " innerCode: " + this.innerCode;
    }
}
