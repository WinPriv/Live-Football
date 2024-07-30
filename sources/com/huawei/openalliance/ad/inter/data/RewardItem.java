package com.huawei.openalliance.ad.inter.data;

import com.huawei.openalliance.ad.annotations.DataKeep;
import java.io.Serializable;

@DataKeep
/* loaded from: classes2.dex */
public class RewardItem implements Serializable {
    private static final long serialVersionUID = 30424300;
    int amount;
    String type;

    public RewardItem(String str, int i10) {
        this.type = gb.p.j(str);
        this.amount = i10;
    }

    public final String k() {
        return this.type;
    }

    public final int p() {
        return this.amount;
    }
}
