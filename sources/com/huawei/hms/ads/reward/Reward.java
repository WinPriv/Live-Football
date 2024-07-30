package com.huawei.hms.ads.reward;

import com.huawei.hms.ads.annotation.GlobalApi;
import com.huawei.hms.ads.cb;

@GlobalApi
/* loaded from: classes2.dex */
public interface Reward {
    public static final Reward DEFAULT = new cb();

    int getAmount();

    String getName();
}
