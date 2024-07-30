package com.huawei.openalliance.ad.ppskit.beans.metadata;

import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import java.util.List;
import ma.a;
import ma.d;

@DataKeep
/* loaded from: classes2.dex */
public class ApkInfo {
    private String actName;
    private String afDlBtnText;
    private long allAreaPopDelay;
    private String appDesc;
    private String appName;
    private int autoOpenAfterInstall;
    private List<Integer> btnClickActionList;
    private String channelInfo;
    private int checkSha256Flag;
    private String contentBtnAction;
    private String contiBtn;
    private String detailUrl;
    private String developerName;
    private String dlBtnText;
    private long fileSize;
    private String fullScrnNotifyText;

    @d(a = "hasper")
    private Integer hasPermission;

    @a
    @d(a = "appIcon")
    private String iconUrl;
    private String insActvNotifyBtnText;
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
    private String pkgNameEncoded;
    private int popUpAfterInstallNew;
    private String popUpAfterInstallText;
    private int popUpStyle;
    private String priorInstallWay;
    private String pureModeText;
    private String realPkgName;
    private String reservedPkgName;

    @a
    private String secondUrl;
    private String sha256;
    private int trafficReminder;

    @a
    private String url;
    private String versionCode;
    private String versionName;
    private String permPromptForCard = "1";
    private String permPromptForLanding = "0";
    private int channelInfoSaveLimit = -2;
    private int popNotify = 1;
    private int fullScrnNotify = 0;
    private int insActvNotifyCfg = 1;
    private int appType = 1;

    public final void A(InstallConfig installConfig) {
        this.installConfig = installConfig;
    }

    public final int A0() {
        return this.trafficReminder;
    }

    public final void B(Integer num) {
        this.hasPermission = num;
    }

    public final void B0(String str) {
        this.developerName = str;
    }

    public final void C(String str) {
        this.packageName = str;
    }

    public final String C0() {
        return this.intent;
    }

    public final String D() {
        return this.versionCode;
    }

    public final String D0() {
        return this.intentPackage;
    }

    public final void E() {
        this.btnClickActionList = null;
    }

    public final void E0(String str) {
        this.nextInstallWays = str;
    }

    public final void F(int i10) {
        this.channelInfoSaveLimit = i10;
    }

    public final String F0() {
        return this.dlBtnText;
    }

    public final void G(String str) {
        this.versionCode = str;
    }

    public final void G0(String str) {
        this.actName = str;
    }

    public final String H() {
        return this.versionName;
    }

    public final void I(int i10) {
        this.noAlertTime = i10;
    }

    public final void J(String str) {
        this.versionName = str;
    }

    public final String K() {
        return this.url;
    }

    public final void L(int i10) {
        this.trafficReminder = i10;
    }

    public final void M(String str) {
        this.url = str;
    }

    public final String N() {
        return this.permissionUrl;
    }

    public final void O(int i10) {
        this.popNotify = i10;
    }

    public final void P(String str) {
        this.permissionUrl = str;
    }

    public final String Q() {
        return this.detailUrl;
    }

    public final void R(int i10) {
        this.fullScrnNotify = i10;
    }

    public final void S(String str) {
        this.detailUrl = str;
    }

    public final long T() {
        return this.fileSize;
    }

    public final void U(int i10) {
        this.insActvNotifyCfg = i10;
    }

    public final void V(String str) {
        this.sha256 = str;
    }

    public final String W() {
        return this.sha256;
    }

    public final void X() {
        this.secondUrl = null;
    }

    public final String Y() {
        return this.secondUrl;
    }

    public final void Z(String str) {
        this.appName = str;
    }

    public final String a() {
        return this.afDlBtnText;
    }

    public final String a0() {
        return this.appName;
    }

    public final int b() {
        return this.popNotify;
    }

    public final void b0(String str) {
        this.priorInstallWay = str;
    }

    public final int c() {
        return this.fullScrnNotify;
    }

    public final List<Permission> c0() {
        return this.permissions;
    }

    public final String d() {
        return this.fullScrnNotifyText;
    }

    public final void d0(String str) {
        this.permPromptForCard = str;
    }

    public final String e() {
        return this.insActvNotifyBtnText;
    }

    public final String e0() {
        return this.priorInstallWay;
    }

    public final int f() {
        return this.insActvNotifyCfg;
    }

    public final void f0(String str) {
        this.permPromptForLanding = str;
    }

    public final Integer g() {
        return this.hasPermission;
    }

    public final InstallConfig g0() {
        return this.installConfig;
    }

    public final String h() {
        return this.developerName;
    }

    public final void h0(String str) {
        this.popUpAfterInstallText = str;
    }

    public final String i() {
        return this.pkgNameEncoded;
    }

    public final String i0() {
        String str = this.permPromptForCard;
        if (str == null) {
            return "1";
        }
        return str;
    }

    public final String j() {
        return this.nextInstallWays;
    }

    public final void j0(String str) {
        this.channelInfo = str;
    }

    public final int k() {
        return this.checkSha256Flag;
    }

    public final String k0() {
        String str = this.permPromptForLanding;
        if (str == null) {
            return "0";
        }
        return str;
    }

    public final String l() {
        return this.actName;
    }

    public final void l0(String str) {
        this.iconUrl = str;
    }

    public final List<Integer> m() {
        return this.btnClickActionList;
    }

    public final int m0() {
        return this.popUpAfterInstallNew;
    }

    public final int n() {
        return this.appType;
    }

    public final void n0(String str) {
        this.appDesc = str;
    }

    public final int o() {
        return this.autoOpenAfterInstall;
    }

    public final String o0() {
        return this.popUpAfterInstallText;
    }

    public final long p() {
        return this.allAreaPopDelay;
    }

    public final void p0(String str) {
        this.intent = str;
    }

    public final int q() {
        return this.popUpStyle;
    }

    public final String q0() {
        return this.channelInfo;
    }

    public final String r() {
        return this.installPermiText;
    }

    public final void r0(String str) {
        this.intentPackage = str;
    }

    public final String s() {
        return this.pureModeText;
    }

    public final String s0() {
        return this.iconUrl;
    }

    public final String t() {
        return this.installPureModeText;
    }

    public final void t0(String str) {
        this.dlBtnText = str;
    }

    public final String u() {
        return this.contiBtn;
    }

    public final int u0() {
        return this.channelInfoSaveLimit;
    }

    public final String v() {
        return this.reservedPkgName;
    }

    public final void v0(String str) {
        this.afDlBtnText = str;
    }

    public final String w() {
        if (TextUtils.isEmpty(this.contentBtnAction)) {
            return this.priorInstallWay;
        }
        return this.contentBtnAction;
    }

    public final String w0() {
        return this.appDesc;
    }

    public final String x() {
        return this.packageName;
    }

    public final void x0(String str) {
        this.fullScrnNotifyText = str;
    }

    public final void y(int i10) {
        this.popUpAfterInstallNew = i10;
    }

    public final int y0() {
        return this.noAlertTime;
    }

    public final void z(long j10) {
        this.fileSize = j10;
    }

    public final void z0(String str) {
        this.insActvNotifyBtnText = str;
    }
}
