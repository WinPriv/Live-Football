package com.huawei.openalliance.ad.ppskit.beans.server;

import android.content.Context;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.constant.bj;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.beans.base.ReqBean;
import ma.d;

@DataKeep
/* loaded from: classes2.dex */
public class InstallAuthReq extends ReqBean {
    private String apkPkg;
    private String apkSha256;
    private long apkSize;
    private String appPkg;
    private String appSign;
    private String appVersionCode;
    private String channelInfo;

    @d(a = bj.f.Code)
    private String sdkVersion;

    @d(a = "slotid")
    private String slotId;
    private String taskinfo;
    private int appType = 1;
    private String version = "3.4";
    private String ppskitVersion = "3.4.65.300";

    @Override // com.huawei.openalliance.ad.ppskit.beans.base.ReqBean
    public final String a() {
        return "installAuth";
    }

    @Override // com.huawei.openalliance.ad.ppskit.beans.base.ReqBean
    public final String b(Context context) {
        return context.getString(R.string.hiad_acd_server_sig);
    }

    @Override // com.huawei.openalliance.ad.ppskit.beans.base.ReqBean
    public final String c() {
        return "/installAuth";
    }

    @Override // com.huawei.openalliance.ad.ppskit.beans.base.ReqBean
    public final String d() {
        return "100003";
    }
}
