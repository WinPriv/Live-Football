package com.huawei.openalliance.ad.beans.metadata;

import com.huawei.openalliance.ad.annotations.DataKeep;
import java.io.Serializable;

@DataKeep
/* loaded from: classes2.dex */
public class Permission implements Serializable {
    private static final long serialVersionUID = 5884421861234976573L;
    private String groupDesc;
    private String permissionLabel;

    public final String k() {
        return this.permissionLabel;
    }

    public final String p() {
        return this.groupDesc;
    }
}
