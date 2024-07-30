package com.huawei.openalliance.ad.ppskit.beans.metadata;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import java.util.List;

@DataKeep
/* loaded from: classes2.dex */
public class DelayInfo {
    private static final int AD_LOAD_TIMEOUT_AFTER_RESPONSE = 20;
    private static final int AD_LOAD_TIMEOUT_BEFORE_RESPONSE = 10;
    private Integer adAmount;
    private Long adContentRspParseDuration;
    private Long adFilterDuration;
    private List<String> adIds;
    private long adLoadEndTimestamp;
    private Long adRequestBeforeCost;
    private Long adRequestDuration;
    private long adResponseTime;
    private String contentDownMethod;
    private List<String> contentIds;
    private String costFromServer;
    private Integer creativeType;
    private Integer detailedRetCode;
    private Long e2eDuration;
    private int exSplashFlag;
    private long recEngineCostTime;
    private Long resDownloadDuration;
    private int resultCode;
    private int serverRetCode;
    private Long splashContentLoadedCost;
    private Long splashLoadDuration;
    private Long splashLoadMaterialCost;
    private String splashShowMode;
    private Long threadSwitchCost;
    private long uiThreadSwithCostTime;
    private boolean isSpare = false;
    private AdTimeStatistics timeStatistics = new AdTimeStatistics();

    public static Long o(long j10, long j11) {
        if (j10 != 0 && j10 < j11) {
            return Long.valueOf(j11 - j10);
        }
        return null;
    }

    public final long A() {
        Long l10 = this.splashContentLoadedCost;
        if (l10 == null) {
            return 0L;
        }
        return l10.longValue();
    }

    public final int B() {
        return this.exSplashFlag;
    }

    public final boolean C() {
        return this.isSpare;
    }

    public final int D() {
        return this.serverRetCode;
    }

    public final AdTimeStatistics E() {
        return this.timeStatistics;
    }

    public final Integer F() {
        return this.creativeType;
    }

    public final Integer G() {
        return this.detailedRetCode;
    }

    public final String H() {
        return this.costFromServer;
    }

    public final long I() {
        return this.uiThreadSwithCostTime;
    }

    public final long a() {
        return this.recEngineCostTime;
    }

    public final long b() {
        Long l10 = this.e2eDuration;
        if (l10 == null) {
            AdTimeStatistics adTimeStatistics = this.timeStatistics;
            Long o = o(adTimeStatistics.adLoadStartTS, adTimeStatistics.adLoadEndTS);
            if (o == null) {
                return 0L;
            }
            return o.longValue();
        }
        return l10.longValue();
    }

    public final void c(long j10, long j11) {
        this.adRequestBeforeCost = o(j10, j11);
    }

    public final long d() {
        Long l10 = this.adRequestDuration;
        if (l10 == null) {
            return 0L;
        }
        return l10.longValue();
    }

    public final void e(long j10) {
        this.adRequestDuration = Long.valueOf(j10);
    }

    public final void f(Integer num) {
        this.detailedRetCode = num;
    }

    public final long g() {
        Long l10 = this.adFilterDuration;
        if (l10 == null) {
            return 0L;
        }
        return l10.longValue();
    }

    public final void h(long j10) {
        this.adFilterDuration = Long.valueOf(j10);
    }

    public final void i(long j10, long j11) {
        this.resDownloadDuration = o(j10, j11);
    }

    public final void j(String str) {
        this.costFromServer = str;
    }

    public final long k() {
        Long l10 = this.adRequestBeforeCost;
        if (l10 == null) {
            return 0L;
        }
        return l10.longValue();
    }

    public final void l(int i10) {
        this.serverRetCode = i10;
    }

    public final long m() {
        Long l10 = this.threadSwitchCost;
        if (l10 == null) {
            return 0L;
        }
        return l10.longValue();
    }

    public final long n() {
        Long l10 = this.adContentRspParseDuration;
        if (l10 == null) {
            return 0L;
        }
        return l10.longValue();
    }

    public final void p() {
        AdTimeStatistics adTimeStatistics = this.timeStatistics;
        this.adContentRspParseDuration = o(adTimeStatistics.adRspParseStartTS, adTimeStatistics.adRspParseEndTS);
    }

    public final void q(long j10) {
        this.adResponseTime = j10;
    }

    public final List<String> r() {
        return this.adIds;
    }

    public final List<String> s() {
        return this.contentIds;
    }

    public final void t(long j10) {
        this.recEngineCostTime = j10;
    }

    public final int u() {
        Integer num = this.adAmount;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final long v() {
        Long l10 = this.splashLoadDuration;
        if (l10 == null) {
            return 0L;
        }
        return l10.longValue();
    }

    public final String w() {
        return this.splashShowMode;
    }

    public final String x() {
        return this.contentDownMethod;
    }

    public final long y() {
        Long l10 = this.resDownloadDuration;
        if (l10 == null) {
            return 0L;
        }
        return l10.longValue();
    }

    public final long z() {
        Long l10 = this.splashLoadMaterialCost;
        if (l10 == null) {
            return 0L;
        }
        return l10.longValue();
    }
}
