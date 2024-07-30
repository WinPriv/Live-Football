package com.huawei.openalliance.ad.ppskit.beans.server;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.beans.base.RspBean;

@DataKeep
/* loaded from: classes2.dex */
public class ThirdReportRsp extends RspBean {
    private int httpCode;

    public final void a(int i10) {
        this.httpCode = i10;
    }

    public final int k() {
        return this.httpCode;
    }
}
