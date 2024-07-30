package com.huawei.openalliance.ad.ppskit.beans.server;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.beans.base.RspBean;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Permission;
import java.util.List;

@DataKeep
/* loaded from: classes2.dex */
public class PermissionRsp extends RspBean {
    private List<Permission> permissions;
    private int retcode = -1;

    public final int k() {
        return this.retcode;
    }

    public final List<Permission> p() {
        return this.permissions;
    }
}
