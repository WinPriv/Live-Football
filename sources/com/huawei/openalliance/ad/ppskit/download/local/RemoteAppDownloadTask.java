package com.huawei.openalliance.ad.ppskit.download.local;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.inter.data.AppInfo;

@DataKeep
/* loaded from: classes2.dex */
public class RemoteAppDownloadTask {
    private int apiVer;
    private String contentId;
    private long downloadedSize;
    private long fileTotalSize;
    private int pauseReason;
    private int progress;
    private String sha256;
    private String slotId;
    private int status;
    private String templateId;
    private String url;

    public final AppLocalDownloadTask a(AppInfo appInfo) {
        AppLocalDownloadTask appLocalDownloadTask = new AppLocalDownloadTask();
        appLocalDownloadTask.r(appInfo);
        appLocalDownloadTask.E(this.contentId);
        appLocalDownloadTask.e(this.progress);
        appLocalDownloadTask.c(this.status);
        appLocalDownloadTask.b(this.downloadedSize);
        appLocalDownloadTask.a(this.fileTotalSize);
        appLocalDownloadTask.h(this.url);
        appLocalDownloadTask.i(this.sha256);
        appLocalDownloadTask.z(this.slotId);
        appLocalDownloadTask.f(this.pauseReason);
        appLocalDownloadTask.H(this.templateId);
        appLocalDownloadTask.v(this.apiVer);
        return appLocalDownloadTask;
    }
}
