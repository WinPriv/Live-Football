package com.huawei.openalliance.ad.ppskit.constant;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;

@DataKeep
/* loaded from: classes2.dex */
public class AppDownloadStatus {
    private static final String DOWNLOAD = "download";
    private static final String DOWNLOADING = "downloading";
    private static final String INSTALL = "install";
    private static final String INSTALLED = "installed";
    private static final String INSTALLING = "installing";
    private static final String PAUSE = "pause";
    private static final String UNKNOWN = "unknown";
    private String status = "unknown";
    private int percentage = 0;
}
