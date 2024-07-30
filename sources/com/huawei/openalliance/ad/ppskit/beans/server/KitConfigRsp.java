package com.huawei.openalliance.ad.ppskit.beans.server;

import com.huawei.openalliance.ad.constant.w;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.beans.base.RspBean;
import com.huawei.openalliance.ad.ppskit.beans.inner.KitPreloadCfg;
import com.huawei.openalliance.ad.ppskit.beans.inner.MgtApkInfo;
import java.util.List;
import ma.a;

@DataKeep
/* loaded from: classes2.dex */
public class KitConfigRsp extends RspBean {
    private List<Integer> adOpenShowScene;
    private List<Integer> adShowPlayMode;
    private Integer allowAdSkipTime;
    private Integer analysisEnable;
    private String appAccessWhiteList;
    private Integer appInstallReport;
    private Integer appUsageCollect;
    private Integer appUsageReport;
    private Integer appUsageValidTime;
    private Integer cacheAdReqTiggerOneDayTimes;
    private Integer cacheAdreqTriggerInterval;
    private String configMap;
    private Integer configRefreshInterval;
    private Integer consentSyncIntvl;
    private Integer displayAdMinTimeClose;
    private Integer displayAdMinTimeSleep;

    @a
    private String dpch;
    private String dr1;
    private String dr2;
    private String dr3;
    private String dr4;
    private Integer exsplashEnable;
    private Integer installReferrerCacheDays;
    private String installReferrerWhiteList;
    private String installReportBlockList;
    private List<MgtApkInfo> lsdMgtApk;
    private String maxSdkVersionInstallViaAidl;
    private String maxThiradSdkVersionInstallViaAidl;
    private Integer oaidMode;
    private Long oaidReportTimeInterval;
    private KitPreloadCfg plCfg;
    private String reportControl;
    private String sha256;
    private String sleepLightAllowPkgList;
    private Integer supSdkServerGzip;
    private String wisScreenPkgName;
    private String wisScreenSlotId;
    private int retcode = -1;
    private String adShowBrandList = w.bn;

    public final Integer A() {
        return this.consentSyncIntvl;
    }

    public final String C() {
        return this.sha256;
    }

    public final String D() {
        return this.sleepLightAllowPkgList;
    }

    public final Integer E() {
        return this.supSdkServerGzip;
    }

    public final KitPreloadCfg F() {
        return this.plCfg;
    }

    public final int G() {
        return this.retcode;
    }

    public final Integer H() {
        return this.appUsageCollect;
    }

    public final Integer K() {
        return this.appUsageReport;
    }

    public final String M() {
        return this.dpch;
    }

    public final Integer O() {
        return this.appInstallReport;
    }

    public final Integer U() {
        return this.configRefreshInterval;
    }

    public final Integer W() {
        return this.appUsageValidTime;
    }

    public final Long X() {
        return this.oaidReportTimeInterval;
    }

    public final Integer Y() {
        return this.oaidMode;
    }

    public final Integer a0() {
        return this.installReferrerCacheDays;
    }

    public final String b0() {
        return this.installReferrerWhiteList;
    }

    public final String c0() {
        return this.appAccessWhiteList;
    }

    public final void d0(String str) {
        this.sleepLightAllowPkgList = str;
    }

    public final String e0() {
        return this.reportControl;
    }

    public final String f0() {
        return this.dr1;
    }

    public final String g0() {
        return this.dr2;
    }

    public final String h() {
        return this.maxSdkVersionInstallViaAidl;
    }

    public final String h0() {
        return this.dr3;
    }

    public final String i() {
        return this.maxThiradSdkVersionInstallViaAidl;
    }

    public final String i0() {
        return this.dr4;
    }

    public final Integer j0() {
        return this.exsplashEnable;
    }

    public final List<Integer> k() {
        return this.adShowPlayMode;
    }

    public final Integer k0() {
        return this.analysisEnable;
    }

    public final String l0() {
        return this.configMap;
    }

    public final Integer m0() {
        Integer num = this.allowAdSkipTime;
        if (num != null && num.intValue() < 0) {
            return null;
        }
        return this.allowAdSkipTime;
    }

    public final String n() {
        return this.installReportBlockList;
    }

    public final Integer n0() {
        Integer num = this.cacheAdReqTiggerOneDayTimes;
        if (num != null && num.intValue() < 0) {
            return null;
        }
        return this.cacheAdReqTiggerOneDayTimes;
    }

    public final Integer o0() {
        Integer num = this.cacheAdreqTriggerInterval;
        if (num != null && num.intValue() < 0) {
            return null;
        }
        return this.cacheAdreqTriggerInterval;
    }

    public final String p() {
        return this.wisScreenPkgName;
    }

    public final List<Integer> p0() {
        return this.adOpenShowScene;
    }

    public final String q() {
        return this.wisScreenSlotId;
    }

    public final String r() {
        return this.adShowBrandList;
    }

    public final Integer u() {
        return this.displayAdMinTimeSleep;
    }

    public final Integer v() {
        return this.displayAdMinTimeClose;
    }

    public final List<MgtApkInfo> x() {
        return this.lsdMgtApk;
    }
}
