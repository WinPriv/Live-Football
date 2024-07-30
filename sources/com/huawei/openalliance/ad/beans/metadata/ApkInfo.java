package com.huawei.openalliance.ad.beans.metadata;

import com.huawei.openalliance.ad.annotations.DataKeep;
import java.io.Serializable;
import java.util.List;

@DataKeep
/* loaded from: classes2.dex */
public class ApkInfo implements Serializable {
    private static final long serialVersionUID = 5884421861234973073L;
    private String actName;
    private String afDlBtnText;
    private long allAreaPopDelay;
    private String appDesc;
    private String appName;
    private List<Integer> btnClickActionList;
    private String channelInfo;
    private int checkSha256Flag;
    private String contentBtnAction;
    private String contiBtn;
    private String detailUrl;
    private String developerName;
    private String dlBtnText;
    private long fileSize;

    @y9.a(Code = "hasper")
    private Integer hasPermission;

    @y9.a(Code = "appIcon")
    private String iconUrl;
    private InstallConfig installConfig;
    private String installPermiText;
    private String installPureModeText;
    private String intent;
    private String intentPackage;
    private String nextInstallWays;
    private int noAlertTime;
    private String packageName;
    private String permissionUrl;
    private List<Permission> permissions;
    private int popUpAfterInstallNew;
    private String popUpAfterInstallText;
    private int popUpStyle;
    private String priorInstallWay;
    private String pureModeText;
    private String realPkgName;
    private String reservedPkgName;
    private String secondUrl;
    private String sha256;
    private int trafficReminder;
    private String url;
    private String versionCode;
    private String versionName;
    private String permPromptForCard = "1";
    private String permPromptForLanding = "0";
    private int channelInfoSaveLimit = -2;
    private int popNotify = 1;
    private int appType = 1;

    public final String A() {
        return this.detailUrl;
    }

    public final String C() {
        return this.reservedPkgName;
    }

    public final String D() {
        return this.appName;
    }

    public final String E() {
        return this.realPkgName;
    }

    public final List<Permission> F() {
        return this.permissions;
    }

    public final String G() {
        return this.sha256;
    }

    public final String H() {
        return this.permissionUrl;
    }

    public final String K() {
        return this.versionCode;
    }

    public final String M() {
        return this.developerName;
    }

    public final String N() {
        return this.versionName;
    }

    public final String O() {
        return this.contentBtnAction;
    }

    public final InstallConfig U() {
        return this.installConfig;
    }

    public final String W() {
        String str = this.permPromptForLanding;
        if (str == null) {
            return "0";
        }
        return str;
    }

    public final String X() {
        return this.popUpAfterInstallText;
    }

    public final String Y() {
        return this.appDesc;
    }

    public final String a() {
        return this.priorInstallWay;
    }

    public final int a0() {
        return this.trafficReminder;
    }

    public final String b0() {
        return this.intentPackage;
    }

    public final String c0() {
        return this.dlBtnText;
    }

    public final String d() {
        String str = this.permPromptForCard;
        if (str == null) {
            return "1";
        }
        return str;
    }

    public final String d0() {
        return this.afDlBtnText;
    }

    public final int e0() {
        return this.popNotify;
    }

    public final Integer f0() {
        return this.hasPermission;
    }

    public final String g0() {
        return this.nextInstallWays;
    }

    public final int h0() {
        return this.checkSha256Flag;
    }

    public final String i() {
        return this.iconUrl;
    }

    public final String i0() {
        return this.actName;
    }

    public final List<Integer> j0() {
        return this.btnClickActionList;
    }

    public final String k() {
        return this.installPermiText;
    }

    public final int k0() {
        return this.appType;
    }

    public final long l0() {
        return this.allAreaPopDelay;
    }

    public final String n() {
        return this.intent;
    }

    public final String p() {
        return this.url;
    }

    public final long q() {
        return this.fileSize;
    }

    public final String r() {
        return this.packageName;
    }

    public final String u() {
        return this.pureModeText;
    }

    public final String v() {
        return this.secondUrl;
    }

    public final String x() {
        return this.contiBtn;
    }

    public final int z() {
        return this.popUpStyle;
    }
}
