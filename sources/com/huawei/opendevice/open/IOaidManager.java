package com.huawei.opendevice.open;

import com.huawei.openalliance.ad.ppskit.annotations.OuterVisible;

@OuterVisible
/* loaded from: classes2.dex */
public interface IOaidManager {
    void disableOaidCollection(boolean z10);

    String getOpenAnonymousID(String str);

    boolean isDisableOaidCollection();

    boolean isLimitTracking(String str);

    String resetAnonymousId(Boolean bool);

    void setResetOaid(boolean z10);
}
