package com.huawei.openalliance.ad.inter.data;

import com.huawei.openalliance.ad.annotations.DataKeep;
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

    public final String k() {
        return this.name;
    }

    public final int p() {
        return this.type;
    }
}
