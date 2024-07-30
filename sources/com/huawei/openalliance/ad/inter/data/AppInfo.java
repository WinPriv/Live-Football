package com.huawei.openalliance.ad.inter.data;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.annotations.DataKeep;
import com.huawei.openalliance.ad.beans.metadata.InstallConfig;
import gb.r0;
import gb.w;
import java.io.Serializable;
import java.util.List;

@DataKeep
/* loaded from: classes2.dex */
public class AppInfo implements Serializable {
    private static final String TAG = "AppInfo";
    private static final long serialVersionUID = 30414300;
    private String actName;
    private String afDlBtnText;
    private long allAreaPopDelay;
    private String appDesc;
    private String appDetailsUrl;
    private String appName;
    private int appType;
    private List<Integer> btnClickActionList;
    private boolean checkSha256;
    private String contentInstallBtnAction;
    private String contiBtn;
    private String curInstallWay;
    private String developerName;
    private String dlBtnText;
    private String downloadUrl;
    private long fileSize;
    private Integer hasPermissions;
    private String iconUrl;
    private InstallConfig installConfig;
    private String installPermiText;
    private String installPureModeText;
    private String intent;
    private String intentPackage;
    private String intentUri;
    private String nextInstallWays;
    private String packageName;
    private boolean permPromptForCard;
    private boolean permPromptForLanding;
    private String permissionUrl;
    private List<PermissionEntity> permissions;
    private int popNotify;
    private String popUpAfterInstallText;
    private int popUpStyle;
    private String priorInstallWay;
    private String privacyUrl;
    private String pureModeText;
    private String realPkgName;
    private String reservedPkgName;
    private String safeDownloadUrl;
    private String sha256;
    private int trafficReminder;
    private String uniqueId;
    private String versionCode;
    private String versionName;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f22244s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ AppInfo f22245t;

        public a(Context context, AppInfo appInfo) {
            this.f22245t = appInfo;
            this.f22244s = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            r0.d(this.f22244s, this.f22245t.privacyUrl);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f22246s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ AppInfo f22247t;

        public b(Context context, AppInfo appInfo) {
            this.f22247t = appInfo;
            this.f22246s = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            r0.d(this.f22246s, this.f22247t.permissionUrl);
        }
    }

    public AppInfo() {
        this.permPromptForCard = true;
        this.permPromptForLanding = false;
        this.appType = 1;
    }

    public final String A() {
        return this.reservedPkgName;
    }

    public final void B(String str) {
        this.afDlBtnText = str;
    }

    public final boolean C() {
        return this.checkSha256;
    }

    public final void Code(Context context) {
        if (TextUtils.isEmpty(this.privacyUrl)) {
            ex.V(TAG, "load privacy link is empty.");
        } else {
            w.b(new a(context, this));
        }
    }

    public final String D() {
        return this.intentUri;
    }

    public final void F(Context context) {
        if (TextUtils.isEmpty(this.permissionUrl)) {
            ex.V(TAG, "load privacy link is empty.");
        } else {
            w.b(new b(context, this));
        }
    }

    public final String G() {
        return this.downloadUrl;
    }

    public final List<PermissionEntity> H() {
        return this.permissions;
    }

    public final void I(String str) {
        this.curInstallWay = str;
    }

    public final boolean K() {
        return this.permPromptForCard;
    }

    public final String L() {
        String str = this.appName;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final boolean O() {
        return this.permPromptForLanding;
    }

    public final String P() {
        return this.realPkgName;
    }

    public final String Q() {
        return this.contentInstallBtnAction;
    }

    public final String U() {
        return this.uniqueId;
    }

    public final void V(String str) {
        this.uniqueId = str;
    }

    public final String W() {
        String str = this.developerName;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String X() {
        String str = this.versionName;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final void Y(String str) {
        this.contentInstallBtnAction = str;
    }

    public final String a() {
        String str = this.appDesc;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String a0() {
        return this.intentPackage;
    }

    public final String b0() {
        return this.dlBtnText;
    }

    public final String c0() {
        return this.afDlBtnText;
    }

    public final int d0() {
        return this.popNotify;
    }

    public final String e0() {
        return this.popUpAfterInstallText;
    }

    public final String f0() {
        return this.privacyUrl;
    }

    public final String g0() {
        return this.permissionUrl;
    }

    public final String h0() {
        return this.appDetailsUrl;
    }

    public final String i() {
        if (TextUtils.isEmpty(this.priorInstallWay)) {
            return "4";
        }
        return this.priorInstallWay;
    }

    public final boolean i0() {
        Integer num = this.hasPermissions;
        if (num != null) {
            if (num.intValue() == 1) {
                return true;
            }
            return false;
        }
        return !androidx.transition.n.h(this.permissions);
    }

    public final String j() {
        return this.intent;
    }

    public final boolean j0() {
        if (TextUtils.isEmpty(this.packageName)) {
            return false;
        }
        String l02 = l0();
        if (TextUtils.isEmpty(l02)) {
            return false;
        }
        if (!l02.equals("8") && !l02.equals("6") && !l02.equals("5")) {
            return false;
        }
        return true;
    }

    public final long k() {
        return this.fileSize;
    }

    public final String k0() {
        return this.nextInstallWays;
    }

    public final String l0() {
        String str = this.curInstallWay;
        if (TextUtils.isEmpty(str)) {
            return i();
        }
        return str;
    }

    public final String m0() {
        return this.actName;
    }

    public final List<Integer> n0() {
        return this.btnClickActionList;
    }

    public final String p() {
        return this.sha256;
    }

    public final String q() {
        return this.packageName;
    }

    public final void s(String str) {
        this.privacyUrl = str;
    }

    public final String u() {
        return this.safeDownloadUrl;
    }

    public final String v() {
        return this.iconUrl;
    }

    public final void w(String str) {
        this.priorInstallWay = str;
    }

    public final void x(String str) {
        this.packageName = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AppInfo(com.huawei.openalliance.ad.beans.metadata.ApkInfo r8) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.inter.data.AppInfo.<init>(com.huawei.openalliance.ad.beans.metadata.ApkInfo):void");
    }

    public final void Code(String str) {
        this.intentUri = str;
    }
}
