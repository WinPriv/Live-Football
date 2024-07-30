package com.huawei.openalliance.ad.ppskit.beans.metadata;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import java.util.List;

@DataKeep
/* loaded from: classes2.dex */
public class AdTypeEvent {
    private int adType;
    private List<String> eventTypeList;

    public final int a() {
        return this.adType;
    }

    public final List<String> b() {
        return this.eventTypeList;
    }
}
