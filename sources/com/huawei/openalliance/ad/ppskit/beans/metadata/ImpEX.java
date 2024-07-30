package com.huawei.openalliance.ad.ppskit.beans.metadata;

import com.huawei.openalliance.ad.constant.w;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import java.io.Serializable;

@DataKeep
/* loaded from: classes2.dex */
public class ImpEX implements Serializable {
    private static final long serialVersionUID = 30445301;
    private String key;
    private String value;

    public ImpEX() {
    }

    public ImpEX(int i10) {
        this.key = w.ch;
        this.value = "-";
    }
}
