package com.huawei.openalliance.ad.ppskit.beans.server;

import android.content.Context;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.beans.base.ReqBean;
import ma.a;

@DataKeep
/* loaded from: classes2.dex */
public class OaidPortraitReq extends ReqBean {
    private static final String TAG = "OaidPortraitReq";

    @a
    private String accessToken;
    private String language;
    private Integer networkType;

    @a
    private String oaid;
    private String sdkversion = "3.4.65.300";

    @Override // com.huawei.openalliance.ad.ppskit.beans.base.ReqBean
    public final String a() {
        return "queryUserProfileInfo";
    }

    @Override // com.huawei.openalliance.ad.ppskit.beans.base.ReqBean
    public final String b(Context context) {
        return context.getString(R.string.hiad_content_server_sig);
    }

    @Override // com.huawei.openalliance.ad.ppskit.beans.base.ReqBean
    public final String c() {
        return "/contserver/queryUserProfileInfo";
    }

    @Override // com.huawei.openalliance.ad.ppskit.beans.base.ReqBean
    public final String d() {
        return "100003";
    }

    public final void e(Integer num) {
        this.networkType = num;
    }

    public final void f(String str) {
        this.oaid = str;
    }

    public final void g(String str) {
        this.language = str;
    }
}
