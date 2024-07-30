package com.huawei.openalliance.ad.ppskit.beans.metadata;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;

@DataKeep
/* loaded from: classes2.dex */
public class Permission {
    private String groupDesc;
    private String permissionLabel;

    public final String a() {
        return this.permissionLabel;
    }

    public final String b() {
        return this.groupDesc;
    }
}
