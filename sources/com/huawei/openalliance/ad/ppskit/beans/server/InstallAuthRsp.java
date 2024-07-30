package com.huawei.openalliance.ad.ppskit.beans.server;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.beans.base.RspBean;

@DataKeep
/* loaded from: classes2.dex */
public class InstallAuthRsp extends RspBean {
    private int channelInfoSaveLimit;
    private int popupBeforeInstall = 0;
    private String reason;
    private int retcode;
}
