package com.huawei.openalliance.ad.ppskit.beans.metadata;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import ma.f;

@DataKeep
/* loaded from: classes2.dex */
public class AppCollectInfo {
    private String channelInfo;
    private String contentId;
    private String dstPkg;
    private Long firstTimeStamp;
    private Long firstTimeUsed;
    private String installMode;
    private Long lastTimeStamp;
    private Long lastTimeUsed;
    private Integer launchCount;

    @f
    private int launchCountType;
    private Long mobileDataSize;
    private String packageName;
    private String reportSource;
    private String srcPkg;
    private long totalTime;
    private Long triggerTime;
    private String versionName;
    private Long wifiDataSize;

    public final void a(String str) {
        this.packageName = str;
    }

    public final void b(String str) {
        this.versionName = str;
    }

    public final void c(String str) {
        this.installMode = str;
    }

    public final void d() {
        this.reportSource = "fullSdk";
    }
}
