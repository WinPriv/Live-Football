package com.huawei.hms.ads.jsb.inner.data;

import com.huawei.openalliance.ad.annotations.DataKeep;

@DataKeep
/* loaded from: classes2.dex */
public class DeviceInfo {
    private String i18n;
    private boolean isChina;
    private String language;

    public void Code(String str) {
        this.language = str;
    }

    public String I() {
        return this.i18n;
    }

    public String V() {
        return this.language;
    }

    public void Code(boolean z10) {
        this.isChina = z10;
    }

    public void V(String str) {
        this.i18n = str;
    }

    public boolean Code() {
        return this.isChina;
    }
}
