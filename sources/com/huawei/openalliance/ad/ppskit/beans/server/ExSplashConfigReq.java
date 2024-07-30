package com.huawei.openalliance.ad.ppskit.beans.server;

import android.content.Context;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import ma.g;

@DataKeep
/* loaded from: classes2.dex */
public class ExSplashConfigReq extends ConfigReq {
    private String appPkgName;
    private String appVersionCode;
    private String hmVer;

    @g
    private String sha256;
    private int type;

    @Override // com.huawei.openalliance.ad.ppskit.beans.base.ReqBean
    public final String a() {
        return "exSplashConfig";
    }

    @Override // com.huawei.openalliance.ad.ppskit.beans.base.ReqBean
    public final String b(Context context) {
        return context.getString(R.string.hiad_ppskit_config_server_sig);
    }

    @Override // com.huawei.openalliance.ad.ppskit.beans.base.ReqBean
    public final String c() {
        return "/sdkserver/exSplashConfig";
    }
}
