package com.huawei.openalliance.ad.ppskit.beans.metadata;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.beans.base.RspBean;

@DataKeep
/* loaded from: classes2.dex */
public class AdEventResult extends RspBean {
    private int retcode;
    private String seq;

    public final String a() {
        return this.seq;
    }

    public final int b() {
        return this.retcode;
    }
}
