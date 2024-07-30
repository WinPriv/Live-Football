package com.huawei.openalliance.ad.beans.server;

import com.anythink.expressad.exoplayer.f;
import com.huawei.openalliance.ad.annotations.DataKeep;
import com.huawei.openalliance.ad.constant.w;
import java.util.List;

@DataKeep
/* loaded from: classes2.dex */
public class AppConfigRsp {
    private Integer adsCoreSel;
    private Integer allowAdSkipTime;
    private Integer bdinterval;
    private String configMap;
    private Integer configRefreshInterval;
    private List<String> defBrowerPkgList;
    private String globalSwitch;
    private double limitOfContainerAspectRatio;
    private Long maxBannerInterval;
    private Long minBannerInterval;
    private Integer oaidReportOnNpa;
    private String sha256;
    private List<String> singleInstanceLSModelList;
    private Integer sloganShowTime;
    private Integer splashInteractCloseEffectiveTime;
    private Integer splashmode;
    private String testCountryCode;
    private String trustAppList;
    private int splashshow = w.Z;
    private int splashSkipArea = 0;
    private long sloganShowMinTimeRealMode = 300;
    private int splashUserAppDayImpFc = 0;
    private Long locationExpireTime = 1800000L;
    private Long locationRefreshInterval = 1800000L;
    private int locationSwitch = 0;
    private long preloadSplashReqTimeInterval = 600000;
    private int retcode = -1;

    public final String A() {
        return this.sha256;
    }

    public final Integer a() {
        if (this.sloganShowTime == null) {
            return null;
        }
        Integer num = this.splashmode;
        int i10 = 0;
        int i11 = 2000;
        if (num != null && 1 != num.intValue()) {
            if (2 != this.splashmode.intValue() && 3 != this.splashmode.intValue()) {
                return 0;
            }
            Integer num2 = this.sloganShowTime;
            if (num2 != null && num2.intValue() >= 500 && this.sloganShowTime.intValue() <= 5000) {
                i11 = this.sloganShowTime.intValue();
            }
            return Integer.valueOf(i11);
        }
        Integer num3 = this.sloganShowTime;
        if (num3 != null) {
            if (num3.intValue() >= 0 && this.sloganShowTime.intValue() <= 5000) {
                i10 = this.sloganShowTime.intValue();
            }
            i11 = i10;
        }
        return Integer.valueOf(i11);
    }

    public final int b() {
        int i10 = this.splashshow;
        if (i10 < 2000) {
            return w.Z;
        }
        return i10;
    }

    public final int c() {
        return this.retcode;
    }

    public final Integer d() {
        return this.configRefreshInterval;
    }

    public final int e() {
        int i10 = this.splashSkipArea;
        if (i10 < 0 || i10 > 200) {
            return 0;
        }
        return i10;
    }

    public final int f() {
        int i10 = this.splashUserAppDayImpFc;
        if (i10 <= 0) {
            return 0;
        }
        return i10;
    }

    public final String g() {
        return this.globalSwitch;
    }

    public final Integer h() {
        Integer num = this.splashmode;
        if (num == null) {
            return null;
        }
        int i10 = 1;
        if (1 == num.intValue() || 2 == this.splashmode.intValue() || 3 == this.splashmode.intValue()) {
            i10 = this.splashmode.intValue();
        }
        return Integer.valueOf(i10);
    }

    public final String i() {
        return this.trustAppList;
    }

    public final long j() {
        long j10 = this.sloganShowMinTimeRealMode;
        if (j10 < 0 || j10 > f.f7962a) {
            return 300L;
        }
        return j10;
    }

    public final List<String> k() {
        return this.defBrowerPkgList;
    }

    public final long l() {
        return this.preloadSplashReqTimeInterval;
    }

    public final Long m() {
        return this.minBannerInterval;
    }

    public final Long n() {
        return this.maxBannerInterval;
    }

    public final Long o() {
        long j10;
        if (this.locationExpireTime.longValue() > 0) {
            j10 = this.locationExpireTime.longValue();
        } else {
            j10 = 1800000;
        }
        return Long.valueOf(j10);
    }

    public final int p() {
        return this.locationSwitch;
    }

    public final Long q() {
        long j10;
        if (this.locationRefreshInterval.longValue() > 0) {
            j10 = this.locationRefreshInterval.longValue();
        } else {
            j10 = 1800000;
        }
        return Long.valueOf(j10);
    }

    public final double r() {
        double d10 = this.limitOfContainerAspectRatio;
        if (d10 <= 0.0d) {
            return 0.05000000074505806d;
        }
        return d10;
    }

    public final Integer s() {
        return this.adsCoreSel;
    }

    public final String t() {
        return this.testCountryCode;
    }

    public final String u() {
        return this.configMap;
    }

    public final Integer v() {
        return this.bdinterval;
    }

    public final Integer w() {
        return this.oaidReportOnNpa;
    }

    public final Integer x() {
        return this.allowAdSkipTime;
    }

    public final Integer y() {
        return this.splashInteractCloseEffectiveTime;
    }

    public final List<String> z() {
        return this.singleInstanceLSModelList;
    }
}
