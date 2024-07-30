package com.huawei.openalliance.ad.ppskit.beans.server;

import android.content.Context;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.beans.base.ReqBean;
import com.huawei.openalliance.ad.ppskit.utils.i2;
import com.huawei.openalliance.ad.ppskit.utils.m;
import com.huawei.openalliance.ad.ppskit.utils.z1;
import ma.d;

@DataKeep
/* loaded from: classes2.dex */
public class PermissionReq extends ReqBean {
    private int appType;
    private String appcountry;
    private String applang;
    private String devcountry;
    private int deviceType;
    private String devlang;
    private String model;

    @d(a = "app")
    private String packageName;
    private String sdkver;
    private String ver;

    public PermissionReq() {
        this.ver = "3.4";
        this.sdkver = "3.4.65.300";
    }

    @Override // com.huawei.openalliance.ad.ppskit.beans.base.ReqBean
    public final String a() {
        return "queryPermission";
    }

    @Override // com.huawei.openalliance.ad.ppskit.beans.base.ReqBean
    public final String b(Context context) {
        return context.getString(R.string.hiad_acd_server_sig);
    }

    @Override // com.huawei.openalliance.ad.ppskit.beans.base.ReqBean
    public final String c() {
        return "/queryPermission";
    }

    @Override // com.huawei.openalliance.ad.ppskit.beans.base.ReqBean
    public final String d() {
        return "100003";
    }

    public PermissionReq(int i10, int i11, String str, String str2, String str3) {
        this.ver = "3.4";
        this.sdkver = "3.4.65.300";
        this.packageName = str;
        this.applang = str2;
        this.appcountry = str3;
        this.devlang = i2.c();
        this.devcountry = z1.x();
        this.appType = i10;
        this.deviceType = i11;
        this.model = m.C();
    }
}
