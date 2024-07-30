package com.huawei.openalliance.ad.ppskit.beans.client;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.beans.metadata.DelayInfo;

@DataKeep
/* loaded from: classes2.dex */
public class ApiStatisticsReq {
    private String additionId;
    private String apiName;
    private String contentId;
    private long costTime;
    private DelayInfo delayInfo;
    private String extraStr1;
    private String isLimitTracking;
    private String oaid;
    private String params;
    private String requestId;
    private int result;
    private int resultCode;
    private String service;
    private long callTime = System.currentTimeMillis();
    private int adType = -1;

    public final String a() {
        return this.service;
    }

    public final void b() {
        this.service = "ppskit";
    }

    public final void c(long j10) {
        this.callTime = j10;
    }

    public final String d() {
        return this.apiName;
    }

    public final void e(String str) {
        this.apiName = str;
    }

    public final int f() {
        return this.result;
    }

    public final int g() {
        return this.resultCode;
    }

    public final void h(String str) {
        this.additionId = str;
    }

    public final long i() {
        return this.callTime;
    }

    public final void j(String str) {
        this.oaid = str;
    }

    public final long k() {
        return this.costTime;
    }

    public final void l(String str) {
        this.isLimitTracking = str;
    }

    public final String m() {
        return this.params;
    }

    public final String n() {
        return this.additionId;
    }

    public final String o() {
        return this.oaid;
    }

    public final String p() {
        return this.isLimitTracking;
    }

    public final String q() {
        return this.requestId;
    }

    public final int r() {
        return this.adType;
    }

    public final String s() {
        return this.extraStr1;
    }

    public final String t() {
        return this.contentId;
    }

    public final DelayInfo u() {
        return this.delayInfo;
    }
}
