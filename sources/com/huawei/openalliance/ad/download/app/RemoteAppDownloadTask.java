package com.huawei.openalliance.ad.download.app;

import com.huawei.openalliance.ad.annotations.DataKeep;
import com.huawei.openalliance.ad.inter.data.AppInfo;

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

    public final AppDownloadTask a(AppInfo appInfo) {
        AppDownloadTask appDownloadTask = new AppDownloadTask();
        appDownloadTask.w(appInfo);
        appDownloadTask.t(this.contentId);
        appDownloadTask.j(this.progress);
        appDownloadTask.c(this.status);
        appDownloadTask.m(this.downloadedSize);
        appDownloadTask.d(this.fileTotalSize);
        appDownloadTask.e(this.url);
        appDownloadTask.n(this.sha256);
        appDownloadTask.G(this.slotId);
        appDownloadTask.p(this.pauseReason);
        appDownloadTask.H(this.templateId);
        appDownloadTask.s(this.apiVer);
        return appDownloadTask;
    }
}
