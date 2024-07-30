package com.huawei.openalliance.ad.ppskit.db.bean;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import pa.a;

@DataKeep
/* loaded from: classes2.dex */
public class UserCloseRecord extends a {
    public static final String APP_PKG_NAME = "appPkgName";
    public static final String TIME_STAMP = "timeStamp";
    private String appPkgName;
    private String time;
    private long timeStamp;

    public final void A(String str) {
        this.time = str;
    }

    public final void B(String str) {
        this.appPkgName = str;
    }

    public final void z(long j10) {
        this.timeStamp = j10;
    }
}
