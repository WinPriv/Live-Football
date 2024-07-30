package com.huawei.openalliance.ad.ppskit.beans.server;

import android.content.Context;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.beans.base.ReqBean;

@DataKeep
/* loaded from: classes2.dex */
public class ConsentConfigReq extends ReqBean {
    private String consentVersion;
    private String countryCode;
    private Integer debugFlag;
    private String langCode;
    private String pkgName;

    @Override // com.huawei.openalliance.ad.ppskit.beans.base.ReqBean
    public final String a() {
        return "consentlookup";
    }

    @Override // com.huawei.openalliance.ad.ppskit.beans.base.ReqBean
    public final String b(Context context) {
        return context.getString(R.string.hiad_ppskit_config_server_sig);
    }

    @Override // com.huawei.openalliance.ad.ppskit.beans.base.ReqBean
    public final String c() {
        return "/sdkserver/consentlookup";
    }

    public final void e(String str) {
        this.consentVersion = "3.4.65.300";
    }

    public final void f(String str) {
        this.pkgName = str;
    }

    public final void g(String str) {
        this.countryCode = str;
    }

    public final String h() {
        return this.consentVersion;
    }

    public final void i(String str) {
        this.langCode = str;
    }

    public final String j() {
        return this.pkgName;
    }

    public final String k() {
        return this.countryCode;
    }
}
