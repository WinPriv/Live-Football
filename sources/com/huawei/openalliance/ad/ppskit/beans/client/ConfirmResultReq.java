package com.huawei.openalliance.ad.ppskit.beans.client;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import java.util.ArrayList;
import java.util.List;

@DataKeep
/* loaded from: classes2.dex */
public class ConfirmResultReq {
    private List<ApiStatisticsReq> caches = new ArrayList();

    public final List<ApiStatisticsReq> a() {
        return this.caches;
    }
}
