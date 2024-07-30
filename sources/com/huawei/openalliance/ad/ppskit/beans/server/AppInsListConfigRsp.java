package com.huawei.openalliance.ad.ppskit.beans.server;

import com.huawei.openalliance.ad.ppskit.beans.base.RspBean;
import java.util.List;
import ma.a;

/* loaded from: classes2.dex */
public class AppInsListConfigRsp extends RspBean {

    @a
    private List<String> insAppsEncoded;
    private List<String> insAppsTypesEncoded;
    private List<String> mntApps;
    private String sha256;
    private Integer supSdkServerGzip;
    private List<String> tgtActs;
    private int retcode = -1;
    private Integer encodingMode = 1;

    public final String a() {
        return this.sha256;
    }

    public final int b() {
        return this.retcode;
    }

    public final List<String> k() {
        return this.insAppsEncoded;
    }

    public final Integer p() {
        return this.encodingMode;
    }

    public final Integer q() {
        return this.supSdkServerGzip;
    }

    public final List<String> r() {
        return this.insAppsTypesEncoded;
    }
}
