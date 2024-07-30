package com.huawei.openalliance.ad.ppskit.beans.metadata;

/* loaded from: classes2.dex */
public class GlobalShareData {
    private boolean autoDownload;
    private String callPkgName;
    private String contentId;
    private String sdkVersion;

    public GlobalShareData() {
    }

    public GlobalShareData(String str, String str2, String str3) {
        this.contentId = str;
        this.sdkVersion = str2;
        this.callPkgName = str3;
    }

    public final String a() {
        return this.callPkgName;
    }

    public GlobalShareData(String str, String str2, String str3, boolean z10) {
        this.contentId = str;
        this.sdkVersion = str2;
        this.callPkgName = str3;
        this.autoDownload = z10;
    }
}
