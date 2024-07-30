package com.huawei.openalliance.ad.ppskit.inter.data;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.annotations.OuterVisible;
import java.io.Serializable;

@DataKeep
/* loaded from: classes2.dex */
public class PermissionEntity implements Serializable {
    private static final long serialVersionUID = -1825501272693801533L;
    private String name;
    private int type;

    public PermissionEntity() {
    }

    public PermissionEntity(String str, int i10) {
        this.name = str;
        this.type = i10;
    }

    @OuterVisible
    public String getName() {
        return this.name;
    }

    @OuterVisible
    public int getType() {
        return this.type;
    }
}
