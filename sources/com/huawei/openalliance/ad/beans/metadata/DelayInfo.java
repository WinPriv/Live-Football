package com.huawei.openalliance.ad.beans.metadata;

import com.huawei.openalliance.ad.annotations.DataKeep;
import java.io.Serializable;
import java.util.List;

@DataKeep
/* loaded from: classes2.dex */
public class DelayInfo implements Serializable {
    private static final int AD_LOAD_TIMEOUT_AFTER_RESPONSE = 20;
    private static final int AD_LOAD_TIMEOUT_BEFORE_RESPONSE = 10;
    private static final long serialVersionUID = 5993297861234973073L;
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
    private Long splashContentLoadedCost;
    private Long splashLoadDuration;
    private Long splashLoadMaterialCost;
    private String splashShowMode;
    private Long threadSwitchCost;
    private long uiThreadSwithCostTime;
    private boolean isSpare = false;
    private AdTimeStatistics timeStatistics = new AdTimeStatistics();

    public static Long a(long j10, long j11) {
        if (j10 != 0 && j10 < j11) {
            return Long.valueOf(j11 - j10);
        }
        return null;
    }

    public final long A() {
        Long l10 = this.adFilterDuration;
        if (l10 == null) {
            return 0L;
        }
        return l10.longValue();
    }

    public final void B(int i10) {
        this.resultCode = i10;
    }

    public final void C(long j10) {
        this.adRequestBeforeCost = Long.valueOf(j10);
    }

    public final void Code(String str) {
        this.splashShowMode = str;
    }

    public final void D(long j10, long j11) {
        this.splashLoadMaterialCost = a(j10, j11);
        this.timeStatistics.splashAdMaterialLoadedTS = j11;
    }

    public final void E(String str) {
        this.costFromServer = str;
    }

    public final void F(long j10) {
        this.adLoadEndTimestamp = j10;
    }

    public final long G() {
        Long l10 = this.adRequestDuration;
        if (l10 == null) {
            return 0L;
        }
        return l10.longValue();
    }

    public final void H(long j10) {
        this.adFilterDuration = Long.valueOf(j10);
    }

    public final void I(long j10, long j11) {
        this.adLoadEndTimestamp = j11;
        this.e2eDuration = a(j10, j11);
        AdTimeStatistics adTimeStatistics = this.timeStatistics;
        adTimeStatistics.adLoadStartTS = j10;
        adTimeStatistics.adLoadEndTS = j11;
    }

    public final void J(Integer num) {
        this.detailedRetCode = num;
    }

    public final void K(List<String> list) {
        this.contentIds = list;
    }

    public final long O() {
        Long l10 = this.adRequestBeforeCost;
        if (l10 == null) {
            return 0L;
        }
        return l10.longValue();
    }

    public final void P(long j10) {
        this.threadSwitchCost = Long.valueOf(j10);
    }

    public final void Q(long j10, long j11) {
        if (j10 > 0 && j10 < j11) {
            this.splashContentLoadedCost = Long.valueOf(j11 - j10);
        }
    }

    public final void R(long j10) {
        this.recEngineCostTime = j10;
    }

    public final String U() {
        return this.contentDownMethod;
    }

    public final void V(String str) {
        this.contentDownMethod = str;
    }

    public final long W() {
        Long l10 = this.resDownloadDuration;
        if (l10 == null) {
            return 0L;
        }
        return l10.longValue();
    }

    public final int X() {
        return this.resultCode;
    }

    public final Long Y() {
        return Long.valueOf(this.adResponseTime);
    }

    public final int a0() {
        long j10 = this.adLoadEndTimestamp;
        if (j10 != 0) {
            long j11 = this.adResponseTime;
            if (j11 != 0) {
                if (j10 <= j11) {
                    return 10;
                }
                return 20;
            }
            return 0;
        }
        return 0;
    }

    public final void b(long j10) {
        this.adContentRspParseDuration = Long.valueOf(j10);
    }

    public final AdTimeStatistics b0() {
        return this.timeStatistics;
    }

    public final Integer c0() {
        return this.detailedRetCode;
    }

    public final String d0() {
        return this.costFromServer;
    }

    public final long e0() {
        return this.recEngineCostTime;
    }

    public final long k() {
        Long l10 = this.adContentRspParseDuration;
        if (l10 == null) {
            return 0L;
        }
        return l10.longValue();
    }

    public final void l(long j10) {
        this.resDownloadDuration = Long.valueOf(j10);
    }

    public final Long p() {
        AdTimeStatistics adTimeStatistics = this.timeStatistics;
        return a(adTimeStatistics.adLoadStartTS, adTimeStatistics.adLoadEndTS);
    }

    public final void q(long j10) {
        this.adRequestDuration = Long.valueOf(j10);
    }

    public final void r(long j10, long j11) {
        this.splashLoadDuration = a(j10, j11);
        AdTimeStatistics adTimeStatistics = this.timeStatistics;
        adTimeStatistics.splashAdDownloadTS = j11;
        adTimeStatistics.kitSdkIPCEndTS = j11;
    }

    public final void s(AdTimeStatistics adTimeStatistics) {
        this.timeStatistics = adTimeStatistics;
    }

    public final void t(Integer num) {
        this.creativeType = num;
    }

    public final void u(List<String> list) {
        this.adIds = list;
    }

    public final void v(boolean z10) {
        this.isSpare = z10;
    }

    public final void w(long j10) {
        this.uiThreadSwithCostTime = j10;
    }

    public final void x(long j10) {
        this.adResponseTime = j10;
    }
}
