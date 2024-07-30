package com.huawei.openalliance.ad.beans.metadata;

import com.huawei.openalliance.ad.annotations.DataKeep;
import java.io.Serializable;

@DataKeep
/* loaded from: classes2.dex */
public class ImpEX implements Serializable {
    private static final long serialVersionUID = 30445301;
    private String key;
    private String value;

    public ImpEX() {
    }

    public ImpEX(String str, String str2) {
        this.key = str;
        this.value = str2;
    }

    public final String k() {
        return this.key;
    }

    public final String p() {
        return this.value;
    }
}
