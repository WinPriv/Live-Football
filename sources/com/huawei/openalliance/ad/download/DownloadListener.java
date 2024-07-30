package com.huawei.openalliance.ad.download;

import com.huawei.hms.ads.annotation.AllApi;
import com.huawei.openalliance.ad.download.DownloadTask;

@AllApi
/* loaded from: classes2.dex */
public interface DownloadListener<T extends DownloadTask> {
    void onAppInstalled(T t10);

    void onAppUnInstalled(T t10);

    void onDownloadDeleted(T t10);

    void onDownloadFail(T t10);

    void onDownloadPaused(T t10);

    void onDownloadProgress(T t10);

    void onDownloadResumed(T t10);

    void onDownloadStart(T t10);

    void onDownloadSuccess(T t10);

    void onDownloadWaiting(T t10);

    void onSilentInstallFailed(T t10);

    void onSilentInstallStart(T t10);

    void onSilentInstallSuccess(T t10);

    void onSystemInstallStart(T t10);
}
