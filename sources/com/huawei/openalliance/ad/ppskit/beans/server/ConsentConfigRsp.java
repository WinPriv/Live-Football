package com.huawei.openalliance.ad.ppskit.beans.server;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.beans.base.RspBean;
import com.huawei.openalliance.ad.ppskit.beans.metadata.AdProvider;
import java.util.List;

@DataKeep
/* loaded from: classes2.dex */
public class ConsentConfigRsp extends RspBean {
    private List<AdProvider> companies;
    private int retcode = -1;
    private int isNeedConsent = 1;
}
