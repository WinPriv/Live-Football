package com.huawei.openalliance.ad.ppskit.beans.server;

import com.anythink.expressad.exoplayer.f;
import com.huawei.openalliance.ad.constant.w;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.beans.base.RspBean;
import com.huawei.openalliance.ad.ppskit.beans.metadata.ReduceDisturbRule;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Rule;
import com.huawei.openalliance.ad.ppskit.beans.metadata.SlotTemplateRsp;
import com.huawei.openalliance.ad.ppskit.utils.y0;
import java.util.List;
import ma.a;
import ma.d;

@DataKeep
/* loaded from: classes2.dex */
public class AppConfigRsp extends RspBean {
    private Integer adsCoreSel;
    private Integer allowAdSkipTime;
    private String appList;

    @a
    private String appSwitchAllowList;
    private Integer bdinterval;
    private Integer biReportForOaid;
    private Integer cacheAdReqTiggerOneDayTimes;
    private Integer cacheAdReqTriggerInterval;
    private Integer cacheAdTirggerMode;

    @a
    private String cacheAdTriggerBlockList;
    private String configMap;
    private Integer configRefreshInterval;
    private List<String> defBrowerPkgList;
    private Long diskCacheValidTime;
    private Integer exSplashCachePkgNumPerReq;
    private Integer exSplashDelay;

    @a
    private String exsplashUndissmisList;
    private Integer fcSwitch;
    private String globalSwitch;
    private Integer imeiEncodeMode;

    @a
    private String installListRestrictedList;
    private Integer iteAdCA;
    private Integer iteAdCloseTm;
    private Integer iteAdExp;
    private Integer iteAdFs;
    private List<SlotTemplateRsp> jsSlotTemplateRsp;
    private Integer kitCacheDelStrategy;
    private Integer landingMenu;
    private Integer landpageAppPrompt;

    @a
    private String landpageAppWhiteList;

    @a
    private String landpageWebBlackList;
    private double limitOfContainerAspectRatio;
    private Long maxBannerInterval;
    private Long minBannerInterval;
    private Integer notifyKitWhenRequest;
    private Integer oaidReportOnNpa;
    private String reason;
    private ReduceDisturbRule reduceDisturbRule;
    private Integer rwdCloseShowTm;
    private Integer rwdGnTm;
    private List<String> schemeInfo;
    private Integer sdkCacheTotalMaxNum;
    private Integer sdkCacheTotalMaxSize;

    @a
    private String serverStore;
    private String sha256;
    private List<String> singleInstanceLSModelList;
    private Integer sloganShowTime;
    private List<SlotTemplateRsp> slotTemplateRsp;
    private String splashFeedbackBtnText;
    private Integer splashInteractCloseEffectiveTime;
    private Integer splashmode;
    private Integer supSdkServerGzip;
    private Integer supportGzip;
    private String testCountryCode;
    private String trustAppList;
    private Integer validityOfClickSkip;
    private Integer validityOfLockEvent;
    private Integer validityOfNativeEvent;
    private Integer validityOfSplashEvent;
    private int retcode = -1;

    @d(a = "splashcachenum")
    private int splashCacheNum = 10;
    private int splashshow = w.Z;
    private int splashSkipArea = 0;

    @d(a = "gif_show_time_upper_limit")
    private int gifShowTimeUpperLimit = 8000;

    @d(a = "gif_show_time_lower_limit_each_frame")
    private int gifShowTimeLowerLimitEachFrame = 100;

    @d(a = "gif_size_upper_limit")
    private int gifSizeUpperLimit = 104857600;

    @d(a = "img_size_upper_limit")
    private int imgSizeUpperLimit = 52428800;
    private Long locationExpireTime = 1800000L;
    private Long locationRefreshInterval = 1800000L;
    private int locationSwitch = 0;
    private long splashShowTimeInterval = 0;
    private long sloganShowMinTimeRealMode = 300;
    private int splashUserAppDayImpFc = 0;
    private String supportHmsSdkVerCode = "20700000";
    private long preloadSplashReqTimeInterval = 600000;

    public final Integer A() {
        return this.sdkCacheTotalMaxNum;
    }

    public final List<String> A0() {
        return this.defBrowerPkgList;
    }

    public final long B0() {
        return this.preloadSplashReqTimeInterval;
    }

    public final Integer C() {
        return this.sdkCacheTotalMaxSize;
    }

    public final String C0() {
        return this.landpageWebBlackList;
    }

    public final String E() {
        return this.configMap;
    }

    public final String F() {
        return this.testCountryCode;
    }

    public final String G() {
        return this.appList;
    }

    public final Integer H() {
        return this.supportGzip;
    }

    public final Integer K() {
        return this.supSdkServerGzip;
    }

    public final String N() {
        return this.appSwitchAllowList;
    }

    public final Integer O() {
        return this.rwdGnTm;
    }

    public final String P() {
        return this.cacheAdTriggerBlockList;
    }

    public final Integer U() {
        return this.iteAdCloseTm;
    }

    public final Integer W() {
        return this.iteAdFs;
    }

    public final Integer X() {
        return this.iteAdExp;
    }

    public final Integer Y() {
        return this.iteAdCA;
    }

    public final String a() {
        return this.trustAppList;
    }

    public final Integer a0() {
        return this.rwdCloseShowTm;
    }

    public final int b() {
        int i10 = this.splashUserAppDayImpFc;
        if (i10 <= 0) {
            return 0;
        }
        return i10;
    }

    public final Integer b0() {
        return this.oaidReportOnNpa;
    }

    public final String c0() {
        return this.sha256;
    }

    public final String d0() {
        return this.splashFeedbackBtnText;
    }

    public final Integer e0() {
        return this.splashInteractCloseEffectiveTime;
    }

    public final List<SlotTemplateRsp> f0() {
        return this.slotTemplateRsp;
    }

    public final Integer g0() {
        return this.fcSwitch;
    }

    public final List<SlotTemplateRsp> h0() {
        return this.jsSlotTemplateRsp;
    }

    public final String i0(String str) {
        ReduceDisturbRule reduceDisturbRule = this.reduceDisturbRule;
        if (reduceDisturbRule == null) {
            return null;
        }
        List<Rule> k10 = reduceDisturbRule.k();
        if (k10 != null && k10.size() <= 30) {
            str = y0.q(null, this.reduceDisturbRule);
        }
        return str;
    }

    public final int j0(int i10) {
        int i11 = this.gifSizeUpperLimit;
        if (i11 > 0) {
            return i11;
        }
        return i10;
    }

    public final List<String> k() {
        return this.schemeInfo;
    }

    public final long k0() {
        long j10 = this.splashShowTimeInterval;
        if (j10 <= 0) {
            return 0L;
        }
        return j10;
    }

    public final int l0(int i10) {
        int i11 = this.imgSizeUpperLimit;
        if (i11 > 0) {
            return i11;
        }
        return i10;
    }

    public final long m0() {
        long j10 = this.sloganShowMinTimeRealMode;
        if (j10 < 0 || j10 > f.f7962a) {
            return 300L;
        }
        return j10;
    }

    public final String n() {
        return this.landpageAppWhiteList;
    }

    public final Integer n0() {
        if (this.sloganShowTime == null) {
            return null;
        }
        Integer p02 = p0();
        int i10 = 0;
        int i11 = 2000;
        if (p02 != null && 1 != p02.intValue() && 5 != p02.intValue() && 4 != p02.intValue()) {
            if (2 != p02.intValue() && 3 != p02.intValue()) {
                return 0;
            }
            Integer num = this.sloganShowTime;
            if (num != null && num.intValue() >= 500 && this.sloganShowTime.intValue() <= 5000) {
                i11 = this.sloganShowTime.intValue();
            }
            return Integer.valueOf(i11);
        }
        Integer num2 = this.sloganShowTime;
        if (num2 != null) {
            if (num2.intValue() >= 0 && this.sloganShowTime.intValue() <= 5000) {
                i10 = this.sloganShowTime.intValue();
            }
            i11 = i10;
        }
        return Integer.valueOf(i11);
    }

    public final int o0() {
        int i10 = this.splashshow;
        if (i10 < 2000) {
            return w.Z;
        }
        return i10;
    }

    public final Long p() {
        long j10;
        if (this.locationExpireTime.longValue() > 0) {
            j10 = this.locationExpireTime.longValue();
        } else {
            j10 = 1800000;
        }
        return Long.valueOf(j10);
    }

    public final Integer p0() {
        Integer num = this.splashmode;
        if (num == null) {
            return null;
        }
        int i10 = 1;
        if (1 == num.intValue() || 2 == this.splashmode.intValue() || 3 == this.splashmode.intValue() || 4 == this.splashmode.intValue() || 5 == this.splashmode.intValue()) {
            i10 = this.splashmode.intValue();
        }
        return Integer.valueOf(i10);
    }

    public final int q() {
        return this.locationSwitch;
    }

    public final int q0() {
        int i10 = this.splashSkipArea;
        if (i10 < 0 || i10 > 200) {
            return 0;
        }
        return i10;
    }

    public final Long r() {
        long j10;
        if (this.locationRefreshInterval.longValue() > 0) {
            j10 = this.locationRefreshInterval.longValue();
        } else {
            j10 = 1800000;
        }
        return Long.valueOf(j10);
    }

    public final int r0() {
        return this.retcode;
    }

    public final String s0() {
        return this.serverStore;
    }

    public final Integer t0() {
        return this.landingMenu;
    }

    public final Integer u() {
        return this.notifyKitWhenRequest;
    }

    public final Integer u0() {
        return this.landpageAppPrompt;
    }

    public final Long v() {
        return this.diskCacheValidTime;
    }

    public final Integer v0() {
        return this.configRefreshInterval;
    }

    public final Integer w0() {
        return this.validityOfSplashEvent;
    }

    public final Integer x() {
        return this.exSplashDelay;
    }

    public final Integer x0() {
        return this.validityOfClickSkip;
    }

    public final Integer y0() {
        return this.validityOfNativeEvent;
    }

    public final String z0() {
        return this.globalSwitch;
    }
}
