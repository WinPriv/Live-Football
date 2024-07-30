package com.huawei.openalliance.ad.ppskit.beans.server;

import android.content.Context;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.beans.base.ReqBean;
import java.util.List;
import ma.a;
import ma.g;

@DataKeep
/* loaded from: classes2.dex */
public class ConsentSyncReq extends ReqBean {

    @a
    private String accessToken;
    private List<String> adProviderIds;
    private int consentStatus;

    @g
    private String deviceId;
    private String pkgName;
    private Long timestamp;
    private int deviceIdType = 1;
    private String sdkversion = "3.4.65.300";

    @Override // com.huawei.openalliance.ad.ppskit.beans.base.ReqBean
    public final String a() {
        return "syncConsent";
    }

    @Override // com.huawei.openalliance.ad.ppskit.beans.base.ReqBean
    public final String b(Context context) {
        return context.getString(R.string.hiad_content_server_sig);
    }

    @Override // com.huawei.openalliance.ad.ppskit.beans.base.ReqBean
    public final String c() {
        return "/contserver/syncConsent";
    }

    @Override // com.huawei.openalliance.ad.ppskit.beans.base.ReqBean
    public final String d() {
        return "100003";
    }
}
