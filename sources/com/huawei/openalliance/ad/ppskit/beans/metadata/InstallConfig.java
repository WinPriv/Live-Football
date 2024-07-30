package com.huawei.openalliance.ad.ppskit.beans.metadata;

import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import java.io.Serializable;

@DataKeep
/* loaded from: classes2.dex */
public class InstallConfig implements Serializable {
    private static final long serialVersionUID = 8902961741104200296L;
    private String appBtnInstallWay;
    private String contentBtnInstallWay;
    private String creativeInstallWay;

    public final String a() {
        return this.creativeInstallWay;
    }

    public final String b(Integer num) {
        if (num != null && (num.intValue() == 1 || num.intValue() == 14)) {
            if (TextUtils.isEmpty(this.contentBtnInstallWay)) {
                return this.appBtnInstallWay;
            }
            return this.contentBtnInstallWay;
        }
        return this.appBtnInstallWay;
    }

    public final void c(String str) {
        this.creativeInstallWay = str;
    }

    public final void d(String str) {
        this.appBtnInstallWay = str;
    }
}
