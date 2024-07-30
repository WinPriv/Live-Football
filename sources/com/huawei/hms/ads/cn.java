package com.huawei.hms.ads;

import android.content.Context;
import android.view.View;

/* loaded from: classes2.dex */
public class cn implements cw {
    private static final String I = "BaseDeviceImpl";
    protected Context Code;
    protected gb.m V;

    public cn(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.Code = applicationContext;
        this.V = gb.m.b(applicationContext);
    }

    @Override // com.huawei.hms.ads.cw
    public boolean B() {
        return false;
    }

    @Override // com.huawei.hms.ads.cw
    public String C() {
        return null;
    }

    @Override // com.huawei.hms.ads.cw
    public int Code(View view) {
        return 0;
    }

    @Override // com.huawei.hms.ads.cw
    public boolean I() {
        return true;
    }

    @Override // com.huawei.hms.ads.cw
    public boolean S() {
        return false;
    }

    @Override // com.huawei.hms.ads.cw
    public boolean V() {
        return true;
    }

    @Override // com.huawei.hms.ads.cw
    public String Z() {
        return null;
    }

    @Override // com.huawei.hms.ads.cw
    public boolean Code() {
        return true;
    }

    @Override // com.huawei.hms.ads.cw
    public boolean Code(Context context) {
        return false;
    }

    @Override // com.huawei.hms.ads.cw
    public boolean Code(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            ex.I(I, "check widget available error");
            return false;
        }
    }
}
