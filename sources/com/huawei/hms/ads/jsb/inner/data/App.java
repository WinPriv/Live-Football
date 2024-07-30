package com.huawei.hms.ads.jsb.inner.data;

import com.huawei.openalliance.ad.annotations.DataKeep;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import gb.p;

@DataKeep
/* loaded from: classes2.dex */
public class App {
    private String afDlBtnText;
    private String appDesc;
    private String appName;
    private String dlBtnText;
    private String iconUrl;
    private String packageName;
    private String reservedPkgName;

    public App(AppInfo appInfo) {
        if (appInfo != null) {
            this.appName = p.i(appInfo.L());
            this.iconUrl = appInfo.v();
            this.appDesc = p.i(appInfo.a());
            this.packageName = appInfo.q();
            this.dlBtnText = p.i(appInfo.b0());
            this.afDlBtnText = p.i(appInfo.c0());
            this.reservedPkgName = appInfo.A();
        }
    }

    public String B() {
        return this.dlBtnText;
    }

    public String C() {
        return this.afDlBtnText;
    }

    public String Code() {
        return this.appName;
    }

    public String I() {
        return this.appDesc;
    }

    public String S() {
        return this.reservedPkgName;
    }

    public String V() {
        return this.iconUrl;
    }

    public String Z() {
        return this.packageName;
    }
}
