package com.huawei.hms.ads;

import android.content.Context;
import gb.e0;

/* loaded from: classes2.dex */
public class cq extends cn {
    private static cw I;
    private static final byte[] Z = new byte[0];
    private e0 B;

    private cq(Context context) {
        super(context);
        this.B = new e0(context);
    }

    private static cw I(Context context) {
        cw cwVar;
        synchronized (Z) {
            if (I == null) {
                I = new cq(context);
            }
            cwVar = I;
        }
        return cwVar;
    }

    public static cw V(Context context) {
        return I(context);
    }

    @Override // com.huawei.hms.ads.cn, com.huawei.hms.ads.cw
    public boolean Code() {
        e0 e0Var = this.B;
        e0Var.getClass();
        if (ex.Code()) {
            ex.Code("CountryCodeBean", "countryCode: %s", e0Var.f28579a);
        }
        return "CN".equalsIgnoreCase(e0Var.f28579a);
    }

    @Override // com.huawei.hms.ads.cn, com.huawei.hms.ads.cw
    public boolean I() {
        return false;
    }

    @Override // com.huawei.hms.ads.cn, com.huawei.hms.ads.cw
    public boolean V() {
        return Code();
    }
}
