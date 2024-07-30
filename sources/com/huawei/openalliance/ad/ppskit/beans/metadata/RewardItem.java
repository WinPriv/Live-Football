package com.huawei.openalliance.ad.ppskit.beans.metadata;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.beans.base.RspBean;
import java.io.Serializable;

@DataKeep
/* loaded from: classes2.dex */
public class RewardItem extends RspBean implements Serializable {
    private static final long serialVersionUID = 30413300;
    private int amount;
    private String type;

    public final String a() {
        return this.type;
    }

    public final int b() {
        return this.amount;
    }
}
