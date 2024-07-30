package com.huawei.openalliance.ad.ppskit.download.app;

import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.beans.metadata.InstallConfig;
import com.huawei.openalliance.ad.ppskit.download.DownloadTask;
import com.huawei.openalliance.ad.ppskit.inter.data.AppInfo;
import ka.lg;

@DataKeep
/* loaded from: classes2.dex */
public class AppDownloadTask extends DownloadTask {
    private String agInstallType;
    private Integer agdDownloadSource;
    private int apiVer;
    private AppInfo appInfo;
    private String apptaskInfo;
    private String callerPackageName;
    private String contentId;
    private String curInstallWay;
    private String customData;
    private Integer downloadSource;
    private Integer downloadSourceMutable;
    private lg eventProcessor;
    private int installSource;
    private String paramFromServer;
    private RemoteAppDownloadTask remoteTask;
    private String requestId;
    private String sdkVersion;
    private String showId;
    private String slotId;
    private long startTime;
    private String templateId;
    private String userId;
    private String venusExt;
    private boolean isInHmsTaskStack = false;
    private int installResult = -1;

    @DataKeep
    /* loaded from: classes2.dex */
    public static class AgDownloadParams {
        private String channelInfo;
        private String contentId;
        private String slotId;
    }

    public final String A0() {
        return this.userId;
    }

    public final String B0() {
        return this.requestId;
    }

    public final long C0() {
        return this.startTime;
    }

    public final String D0() {
        return this.templateId;
    }

    public final int E0() {
        return this.apiVer;
    }

    public final String F0() {
        String a10;
        String i02 = i0();
        if (this.appInfo != null && "8".equals(i02) && this.appInfo.G() != null) {
            InstallConfig G = this.appInfo.G();
            Integer num = this.agdDownloadSource;
            if (num != null && num.intValue() == 2) {
                a10 = G.b(this.downloadSourceMutable);
            } else {
                a10 = G.a();
            }
            this.agInstallType = a10;
            return this.agInstallType;
        }
        return null;
    }

    public final void G0(Integer num) {
        this.downloadSourceMutable = num;
    }

    public final void H0(Integer num) {
        this.agdDownloadSource = num;
    }

    public final void I0(long j10) {
        this.startTime = j10;
    }

    public final void J0(boolean z10) {
        this.isInHmsTaskStack = z10;
    }

    public final void K0(String str) {
        if (TextUtils.isEmpty(this.curInstallWay)) {
            this.curInstallWay = str;
        }
    }

    public final void L0(String str) {
        if (TextUtils.isEmpty(this.venusExt)) {
            this.venusExt = str;
        }
    }

    public final void M0(String str) {
        this.slotId = str;
    }

    public final void N0(String str) {
        this.apptaskInfo = str;
    }

    public final void O0(String str) {
        this.paramFromServer = str;
    }

    public final void P0(String str) {
        this.callerPackageName = str;
    }

    public final void Q0(String str) {
        this.sdkVersion = str;
    }

    public final void R0(String str) {
        this.contentId = str;
    }

    public final void S0(String str) {
        this.customData = str;
    }

    public final void T0(String str) {
        this.userId = str;
    }

    public final void U0(String str) {
        this.requestId = str;
    }

    @Override // com.huawei.openalliance.ad.ppskit.download.DownloadTask
    public final String W() {
        AppInfo appInfo = this.appInfo;
        if (appInfo != null) {
            return appInfo.getPackageName();
        }
        return null;
    }

    @Override // com.huawei.openalliance.ad.ppskit.download.DownloadTask
    public final String d0() {
        return this.callerPackageName;
    }

    public final String e0() {
        return this.contentId;
    }

    @Override // com.huawei.openalliance.ad.ppskit.download.DownloadTask
    public final int f() {
        String i02 = i0();
        if ("5".equals(i02)) {
            return 2;
        }
        if ("6".equals(i02)) {
            return 3;
        }
        if ("8".equals(i02)) {
            return 4;
        }
        return 1;
    }

    public final AppInfo f0() {
        return this.appInfo;
    }

    public final lg g0() {
        return this.eventProcessor;
    }

    public final int h0() {
        return this.installSource;
    }

    public final String i0() {
        String str = this.curInstallWay;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        AppInfo appInfo = this.appInfo;
        if (appInfo != null) {
            return appInfo.c();
        }
        return "4";
    }

    public final String j0() {
        return this.curInstallWay;
    }

    public final Integer k0() {
        return this.downloadSource;
    }

    public final Integer l0() {
        return this.downloadSourceMutable;
    }

    public final Integer m0() {
        Integer num = this.agdDownloadSource;
        if (num != null) {
            return num;
        }
        return 1;
    }

    public final String n0() {
        return this.venusExt;
    }

    public final int o0() {
        return this.installResult;
    }

    public final void p0(AppInfo appInfo) {
        this.appInfo = appInfo;
    }

    public final void q0(Integer num) {
        if (this.downloadSource == null) {
            this.downloadSource = num;
        }
    }

    public final void r0(lg lgVar) {
        this.eventProcessor = lgVar;
    }

    public final String s0() {
        return this.slotId;
    }

    public final String t0() {
        return this.apptaskInfo;
    }

    public final String u0() {
        return this.paramFromServer;
    }

    public final String v0() {
        return this.sdkVersion;
    }

    public final String w0() {
        return this.showId;
    }

    public final boolean x0() {
        int intValue;
        Integer num = this.downloadSourceMutable;
        if (num == null) {
            intValue = 5;
        } else {
            intValue = num.intValue();
        }
        AppInfo appInfo = this.appInfo;
        if (appInfo != null && appInfo.D(Integer.valueOf(intValue))) {
            return true;
        }
        return false;
    }

    public final boolean y0() {
        return this.isInHmsTaskStack;
    }

    public final String z0() {
        return this.customData;
    }
}
