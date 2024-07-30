package com.huawei.openalliance.ad.ppskit.beans.metadata;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.beans.base.RspBean;
import java.util.List;

@DataKeep
/* loaded from: classes2.dex */
public class ReduceDisturbRule extends RspBean {
    private static final String TAG = "ReduceDisturbRule";
    private List<Rule> ruleList;
    private long timeStamp;

    public final List<Rule> k() {
        return this.ruleList;
    }
}
