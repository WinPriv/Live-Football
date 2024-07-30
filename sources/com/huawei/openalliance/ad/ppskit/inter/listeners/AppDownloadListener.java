package com.huawei.openalliance.ad.ppskit.inter.listeners;

import com.huawei.openalliance.ad.ppskit.annotations.OuterVisible;
import com.huawei.openalliance.ad.ppskit.download.app.AppStatus;
import com.huawei.openalliance.ad.ppskit.inter.data.AppInfo;

@OuterVisible
/* loaded from: classes2.dex */
public interface AppDownloadListener {
    void onAppOpen(AppInfo appInfo);

    void onDownloadProgress(AppInfo appInfo, int i10);

    void onStatusChanged(AppStatus appStatus, AppInfo appInfo);
}
