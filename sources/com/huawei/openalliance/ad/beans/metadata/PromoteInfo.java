package com.huawei.openalliance.ad.beans.metadata;

import com.huawei.openalliance.ad.annotations.DataKeep;
import gb.p;

@DataKeep
/* loaded from: classes2.dex */
public class PromoteInfo {
    private String name;
    private int type;

    public final int a() {
        return this.type;
    }

    public final String b() {
        return p.j(this.name);
    }
}
