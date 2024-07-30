package com.huawei.hms.ads;

import com.huawei.hms.ads.reward.Reward;
import com.huawei.openalliance.ad.inter.data.RewardItem;

/* loaded from: classes2.dex */
public class cb implements Reward {
    private String Code;
    private int V;

    public cb() {
    }

    public cb(RewardItem rewardItem) {
        if (rewardItem != null) {
            this.Code = rewardItem.k();
            this.V = rewardItem.p();
        }
    }

    @Override // com.huawei.hms.ads.reward.Reward
    public int getAmount() {
        return this.V;
    }

    @Override // com.huawei.hms.ads.reward.Reward
    public String getName() {
        return this.Code;
    }
}
