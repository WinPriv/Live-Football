package com.huawei.hms.ads;

import com.huawei.hms.ads.nativead.DislikeAdReason;

/* loaded from: classes2.dex */
public class bu implements DislikeAdReason {
    private String Code;

    public bu(String str) {
        this.Code = str;
    }

    @Override // com.huawei.hms.ads.nativead.DislikeAdReason
    public String getDescription() {
        return this.Code;
    }
}
