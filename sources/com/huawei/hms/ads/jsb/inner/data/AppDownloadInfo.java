package com.huawei.hms.ads.jsb.inner.data;

import com.huawei.openalliance.ad.annotations.DataKeep;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import da.n;

@DataKeep
/* loaded from: classes2.dex */
public class AppDownloadInfo {
    private String appName;
    private String packageName;
    private int progress;
    private int reserveStatus;
    private String reservedPkgName;
    private String status;
    private long time;
    private String uniqueId;

    public AppDownloadInfo(AppInfo appInfo, int i10) {
        Code(appInfo);
        this.progress = i10;
    }

    private void Code(AppInfo appInfo) {
        if (appInfo != null) {
            this.packageName = appInfo.q();
            this.appName = appInfo.L();
            this.uniqueId = appInfo.U();
            this.time = System.currentTimeMillis();
        }
    }

    public AppDownloadInfo(AppInfo appInfo, n nVar) {
        Code(appInfo);
        if (nVar != null) {
            this.status = nVar.toString();
        }
    }

    public AppDownloadInfo(String str) {
        this.packageName = str;
    }

    public AppDownloadInfo(String str, int i10) {
        this.reservedPkgName = str;
        this.reserveStatus = i10;
    }
}
