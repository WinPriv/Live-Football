package com.huawei.openalliance.ad.beans.inner;

import com.huawei.openalliance.ad.annotations.DataKeep;
import com.huawei.openalliance.ad.beans.metadata.DelayInfo;

@DataKeep
/* loaded from: classes2.dex */
public class ApiStatisticsReq {
    private String additionId;
    private String apiName;
    private String contentId;
    private long costTime;
    private DelayInfo delayInfo;
    private String isLimitTracking;
    private String oaid;
    private String params;
    private String requestId;
    private int result;
    private int resultCode;
    private String service;
    private long callTime = System.currentTimeMillis();
    private int adType = -1;

    public final void a(DelayInfo delayInfo) {
        this.delayInfo = delayInfo;
    }

    public final void b(int i10) {
        this.adType = i10;
    }

    public final void c(String str) {
        this.requestId = str;
    }

    public final void d(int i10) {
        this.resultCode = i10;
    }

    public final void e(long j10) {
        this.costTime = j10;
    }

    public final void f(String str) {
        this.apiName = str;
    }
}
