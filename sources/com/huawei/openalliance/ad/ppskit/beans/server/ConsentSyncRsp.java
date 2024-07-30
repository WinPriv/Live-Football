package com.huawei.openalliance.ad.ppskit.beans.server;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.beans.base.RspBean;
import java.util.List;

@DataKeep
/* loaded from: classes2.dex */
public class ConsentSyncRsp extends RspBean {
    private List<String> adProviderIds;
    private int consentStatus;
    private int retcode;
    private Long timestamp;
}
