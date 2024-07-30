package com.huawei.hms.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public class dd extends dc {
    private ec Code;

    public dd(Context context) {
        this.Code = ec.Code(context);
    }

    @Override // com.huawei.hms.ads.dc
    public boolean Code() {
        if (this.Code.h() >= System.currentTimeMillis()) {
            return true;
        }
        return V();
    }
}
