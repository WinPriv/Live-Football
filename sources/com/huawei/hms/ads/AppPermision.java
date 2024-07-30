package com.huawei.hms.ads;

import com.huawei.hms.ads.annotation.GlobalApi;
import com.huawei.openalliance.ad.annotations.DataKeep;
import com.huawei.openalliance.ad.inter.data.PermissionEntity;

@GlobalApi
@DataKeep
/* loaded from: classes2.dex */
public class AppPermision {
    private String name;
    private int type;

    public AppPermision(PermissionEntity permissionEntity) {
        if (permissionEntity != null) {
            this.name = permissionEntity.k();
            this.type = permissionEntity.p();
        }
    }

    @GlobalApi
    public String getName() {
        return this.name;
    }

    @GlobalApi
    public int getType() {
        return this.type;
    }
}
