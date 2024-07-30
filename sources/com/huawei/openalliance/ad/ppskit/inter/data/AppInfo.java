package com.huawei.openalliance.ad.ppskit.inter.data;

import android.text.TextUtils;
import android.util.ArrayMap;
import androidx.transition.n;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.annotations.OuterVisible;
import com.huawei.openalliance.ad.ppskit.beans.metadata.ApkInfo;
import com.huawei.openalliance.ad.ppskit.beans.metadata.InstallConfig;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Permission;
import com.huawei.openalliance.ad.ppskit.download.app.AppStatus;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import ka.n7;

@OuterVisible
@DataKeep
/* loaded from: classes2.dex */
public class AppInfo implements Serializable {
    private static final String TAG = "AppInfo";
    private static final long serialVersionUID = 30414300;
    private String actName;
    private String afDlBtnText;
    private long allAreaPopDelay;
    private String appCountry;
    private String appDesc;
    private String appDetailsUrl;
    private String appLanguage;
    private String appName;
    private int appType;
    private int autoOpenAfterInstall;
    private List<Integer> btnClickActionList;
    private String callerPkgName;
    private String callerSdkVersion;
    private String channelInfo;
    private int channelInfoSaveLimit;
    private boolean checkSha256;
    private String contentInstallBtnAction;
    private String contiBtn;
    private String curInstallWay;
    private String developerName;
    private String dlBtnText;
    private String downloadUrl;
    private long fileSize;
    private int fullScrnNotify;
    private String fullScrnNotifyText;
    private Integer hasPermissions;
    private String iconUrl;
    private String insActvNotifyBtnText;
    private int insActvNotifyCfg;
    private InstallConfig installConfig;
    private String installPermiText;
    private String installPureModeText;
    private String intent;
    private String intentPackage;
    private String intentUri;
    private String nextInstallWays;
    private int noAlertTime;
    private String packageName;
    private boolean permPromptForCard;
    private boolean permPromptForLanding;
    private String permissionUrl;
    private List<PermissionEntity> permissions;
    private int popNotify;
    private int popUpAfterInstallNew;
    private String popUpAfterInstallText;
    private int popUpStyle;
    private String priorInstallWay;
    private String privacyUrl;
    private String pureModeText;
    private String reservedPkgName;
    private String safeDownloadUrl;
    private String sha256;
    private int trafficReminder;
    private String uniqueId;
    private String versionCode;
    private String versionName;

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22638a;

        static {
            int[] iArr = new int[AppStatus.values().length];
            f22638a = iArr;
            try {
                iArr[AppStatus.INSTALLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22638a[AppStatus.DOWNLOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @OuterVisible
    public AppInfo() {
        this.permPromptForCard = true;
        this.permPromptForLanding = false;
        this.popUpAfterInstallNew = 0;
        this.channelInfoSaveLimit = -2;
        this.insActvNotifyCfg = 1;
        this.appType = 1;
    }

    public final String A() {
        return this.appDetailsUrl;
    }

    public final void B(String str) {
        this.packageName = str;
    }

    public final void C(List<Permission> list) {
        String simpleName;
        String str = "parsePermission Exception:";
        if (list != null && list.size() > 0) {
            try {
                ArrayMap arrayMap = new ArrayMap();
                for (Permission permission : list) {
                    List list2 = (List) arrayMap.get(permission.b());
                    if (list2 == null) {
                        list2 = new ArrayList();
                        arrayMap.put(permission.b(), list2);
                    }
                    list2.add(new PermissionEntity(y1.p(permission.a()), 1));
                }
                this.permissions = new ArrayList();
                for (Map.Entry entry : arrayMap.entrySet()) {
                    this.permissions.add(new PermissionEntity(y1.p((String) entry.getKey()), 0));
                    this.permissions.addAll((Collection) entry.getValue());
                }
            } catch (RuntimeException e10) {
                simpleName = e10.getClass().getSimpleName();
                str = "parsePermission RuntimeException:";
                n7.i(TAG, str.concat(simpleName));
            } catch (Exception e11) {
                e = e11;
                simpleName = e.getClass().getSimpleName();
                n7.i(TAG, str.concat(simpleName));
            } catch (Throwable th) {
                e = th;
                simpleName = e.getClass().getSimpleName();
                n7.i(TAG, str.concat(simpleName));
            }
        }
    }

    public final boolean D(Integer num) {
        if (TextUtils.isEmpty(this.packageName)) {
            return false;
        }
        if (num == null) {
            num = 5;
        }
        String H = H(num.intValue());
        if (TextUtils.isEmpty(H)) {
            return false;
        }
        if (!H.equals("8") && !H.equals("6") && !H.equals("5")) {
            return false;
        }
        return true;
    }

    public final void E(List<PermissionEntity> list) {
        this.permissions = list;
    }

    public final void F(String str) {
        this.iconUrl = str;
    }

    public final InstallConfig G() {
        return this.installConfig;
    }

    public final String H(int i10) {
        if (1 != i10 && 14 != i10) {
            String str = this.curInstallWay;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            return c();
        }
        return d();
    }

    public final void I(String str) {
        this.privacyUrl = str;
    }

    public final void J(String str) {
        this.intentUri = str;
    }

    public final String K() {
        return this.intent;
    }

    public final String L() {
        return this.reservedPkgName;
    }

    public final String M() {
        return this.privacyUrl;
    }

    public final String N() {
        return this.permissionUrl;
    }

    public final String O() {
        return this.intentPackage;
    }

    public final void P(String str) {
        this.appDesc = str;
    }

    public final String U() {
        return this.afDlBtnText;
    }

    public final void W(String str) {
        this.priorInstallWay = str;
    }

    public final void X(String str) {
        this.contentInstallBtnAction = str;
    }

    public final int Y() {
        return this.fullScrnNotify;
    }

    public final String a0() {
        return this.fullScrnNotifyText;
    }

    public final String b0() {
        return this.insActvNotifyBtnText;
    }

    public final String c() {
        if (TextUtils.isEmpty(this.priorInstallWay)) {
            return "4";
        }
        return this.priorInstallWay;
    }

    public final void c0(String str) {
        this.uniqueId = str;
    }

    public final String d() {
        if (TextUtils.isEmpty(this.contentInstallBtnAction)) {
            return c();
        }
        return this.contentInstallBtnAction;
    }

    public final boolean d0() {
        Integer num = this.hasPermissions;
        if (num != null) {
            if (num.intValue() == 1) {
                return true;
            }
            return false;
        }
        return !n.M(this.permissions);
    }

    public final String e0() {
        return this.callerPkgName;
    }

    public final String f0() {
        return this.callerSdkVersion;
    }

    public final String g0() {
        return this.appLanguage;
    }

    @OuterVisible
    public String getAppDesc() {
        String str = this.appDesc;
        if (str == null) {
            return "";
        }
        return str;
    }

    @OuterVisible
    public String getAppName() {
        String str = this.appName;
        if (str == null) {
            return "";
        }
        return str;
    }

    @OuterVisible
    public String getCta(AppStatus appStatus) {
        int i10 = a.f22638a[appStatus.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return null;
            }
            return this.dlBtnText;
        }
        return this.afDlBtnText;
    }

    @OuterVisible
    public String getDeveloperName() {
        String str = this.developerName;
        if (str == null) {
            return "";
        }
        return str;
    }

    @OuterVisible
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    @OuterVisible
    public long getFileSize() {
        return this.fileSize;
    }

    @OuterVisible
    public String getIconUrl() {
        return this.iconUrl;
    }

    @OuterVisible
    public String getIntentUri() {
        return this.intentUri;
    }

    @OuterVisible
    public String getPackageName() {
        return this.packageName;
    }

    @OuterVisible
    public List<PermissionEntity> getPermissions() {
        return this.permissions;
    }

    @OuterVisible
    public String getSafeDownloadUrl() {
        return this.safeDownloadUrl;
    }

    @OuterVisible
    public String getSha256() {
        return this.sha256;
    }

    @OuterVisible
    public String getUniqueId() {
        return this.uniqueId;
    }

    @OuterVisible
    public String getVersionCode() {
        return this.versionCode;
    }

    @OuterVisible
    public String getVersionName() {
        String str = this.versionName;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String h0() {
        return this.appCountry;
    }

    public final void i0(String str) {
        this.callerPkgName = str;
    }

    @OuterVisible
    public boolean isCheckSha256() {
        return this.checkSha256;
    }

    @OuterVisible
    public boolean isPermPromptForCard() {
        return this.permPromptForCard;
    }

    @OuterVisible
    public boolean isPermPromptForLanding() {
        return this.permPromptForLanding;
    }

    public final String k() {
        return this.nextInstallWays;
    }

    public final void l(String str) {
        this.callerSdkVersion = str;
    }

    public final String n() {
        return this.dlBtnText;
    }

    public final String p() {
        return this.actName;
    }

    public final void q(String str) {
        this.appLanguage = str;
    }

    public final List<Integer> r() {
        return this.btnClickActionList;
    }

    public final void s(String str) {
        this.appCountry = str;
    }

    public final int t() {
        return this.insActvNotifyCfg;
    }

    public final int u() {
        return this.appType;
    }

    public final void v(String str) {
        this.curInstallWay = str;
    }

    public final long x() {
        return this.allAreaPopDelay;
    }

    public AppInfo(ApkInfo apkInfo) {
        this.permPromptForCard = true;
        this.permPromptForLanding = false;
        this.popUpAfterInstallNew = 0;
        this.channelInfoSaveLimit = -2;
        this.insActvNotifyCfg = 1;
        this.appType = 1;
        this.appName = y1.p(apkInfo.a0());
        this.iconUrl = apkInfo.s0();
        this.packageName = apkInfo.x();
        this.versionCode = apkInfo.D();
        this.versionName = apkInfo.H();
        this.downloadUrl = apkInfo.K();
        this.permissionUrl = apkInfo.N();
        this.appDetailsUrl = apkInfo.Q();
        this.fileSize = apkInfo.T();
        this.sha256 = apkInfo.W();
        this.checkSha256 = apkInfo.k() == 0;
        this.safeDownloadUrl = apkInfo.Y();
        this.channelInfo = apkInfo.q0();
        this.channelInfoSaveLimit = apkInfo.u0();
        String e02 = apkInfo.e0();
        if (!TextUtils.isEmpty(e02)) {
            this.priorInstallWay = e02;
        }
        String w10 = apkInfo.w();
        if (!TextUtils.isEmpty(w10)) {
            this.contentInstallBtnAction = w10;
        }
        this.installConfig = apkInfo.g0();
        this.curInstallWay = this.priorInstallWay;
        this.permPromptForCard = "1".equals(apkInfo.i0());
        this.permPromptForLanding = "1".equals(apkInfo.k0());
        this.popUpAfterInstallNew = apkInfo.m0();
        this.popUpAfterInstallText = apkInfo.o0();
        this.dlBtnText = y1.p(apkInfo.F0());
        this.afDlBtnText = y1.p(apkInfo.a());
        this.popNotify = apkInfo.b();
        this.fullScrnNotify = apkInfo.c();
        this.fullScrnNotifyText = y1.p(apkInfo.d());
        this.insActvNotifyBtnText = y1.p(apkInfo.e());
        this.insActvNotifyCfg = apkInfo.f();
        C(apkInfo.c0());
        this.iconUrl = apkInfo.s0();
        this.appDesc = y1.p(apkInfo.w0());
        this.developerName = y1.p(apkInfo.h());
        this.noAlertTime = apkInfo.y0() > 0 ? apkInfo.y0() : 7;
        this.trafficReminder = apkInfo.A0();
        this.intent = apkInfo.C0();
        this.intentPackage = apkInfo.D0();
        this.hasPermissions = apkInfo.g();
        this.nextInstallWays = apkInfo.j();
        this.actName = apkInfo.l();
        this.btnClickActionList = apkInfo.m();
        this.appType = apkInfo.n();
        this.autoOpenAfterInstall = apkInfo.o();
        this.allAreaPopDelay = apkInfo.p();
        this.popUpStyle = apkInfo.q();
        this.installPermiText = y1.p(apkInfo.r());
        this.pureModeText = y1.p(apkInfo.s());
        this.installPureModeText = y1.p(apkInfo.t());
        this.contiBtn = y1.p(apkInfo.u());
        this.reservedPkgName = apkInfo.v();
    }
}
