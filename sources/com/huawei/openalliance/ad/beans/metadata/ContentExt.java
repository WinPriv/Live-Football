package com.huawei.openalliance.ad.beans.metadata;

import com.huawei.openalliance.ad.annotations.DataKeep;
import java.io.Serializable;

@DataKeep
/* loaded from: classes2.dex */
public class ContentExt implements Serializable {
    private static final long serialVersionUID = 5565833272963480072L;
    private String key;
    private String value;

    public final String k() {
        return this.key;
    }

    public final String p() {
        return this.value;
    }
}
