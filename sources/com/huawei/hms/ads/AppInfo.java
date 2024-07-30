package com.huawei.hms.ads;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.ads.annotation.GlobalApi;
import com.huawei.openalliance.ad.annotations.DataKeep;
import com.huawei.openalliance.ad.inter.data.PermissionEntity;
import gb.r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@GlobalApi
@DataKeep
/* loaded from: classes2.dex */
public class AppInfo implements b {
    private static final String TAG = "AppInfo";
    private String appDesc;
    private String appDetailsUrl;
    private String appIconUrl;
    private String appName;
    private boolean checkSha256;
    private String developerName;
    private String downloadText;
    private String downloadUrl;
    private long fileSize;
    private String intentUri;
    private String openText;
    private boolean permPromptForCard;
    private boolean permPromptForLanding;
    private List<AppPermision> permisions;
    private String permissionUrl;
    private String pkgName;
    private String privacyUrl;
    private String realPkgName;
    private String safeDownloadUrl;
    private String sha256;
    private String uniqueId;
    private String versionName;

    public AppInfo(com.huawei.openalliance.ad.inter.data.AppInfo appInfo) {
        this.permPromptForCard = true;
        this.permPromptForLanding = false;
        if (appInfo != null) {
            this.pkgName = appInfo.q();
            this.realPkgName = appInfo.P();
            this.appName = appInfo.L();
            this.appIconUrl = appInfo.v();
            this.downloadUrl = appInfo.G();
            this.appDetailsUrl = appInfo.h0();
            this.permissionUrl = appInfo.g0();
            this.privacyUrl = appInfo.f0();
            this.developerName = gb.p.j(appInfo.W());
            this.versionName = appInfo.X();
            this.safeDownloadUrl = appInfo.u();
            this.fileSize = appInfo.k();
            this.sha256 = appInfo.p();
            this.checkSha256 = appInfo.C();
            this.intentUri = appInfo.D();
            this.permPromptForCard = appInfo.K();
            this.permPromptForLanding = appInfo.O();
            this.uniqueId = appInfo.U();
            this.appDesc = appInfo.a();
            this.downloadText = appInfo.b0();
            this.openText = appInfo.c0();
            if (!androidx.transition.n.h(appInfo.H())) {
                ArrayList arrayList = new ArrayList();
                Iterator<PermissionEntity> it = appInfo.H().iterator();
                while (it.hasNext()) {
                    arrayList.add(new AppPermision(it.next()));
                }
                this.permisions = arrayList;
            }
        }
    }

    public String Code() {
        return this.privacyUrl;
    }

    @GlobalApi
    public String getAppDesc() {
        return this.appDesc;
    }

    @Override // com.huawei.hms.ads.b
    @GlobalApi
    public String getAppDetailUrl() {
        return this.appDetailsUrl;
    }

    @GlobalApi
    public String getAppIconUrl() {
        return this.appIconUrl;
    }

    @GlobalApi
    public String getAppName() {
        return this.appName;
    }

    @GlobalApi
    public List<AppPermision> getAppPermissions() {
        return this.permisions;
    }

    @GlobalApi
    public String getCta(boolean z10) {
        if (z10) {
            return this.openText;
        }
        return this.downloadText;
    }

    @GlobalApi
    public String getDeveloperName() {
        String str = this.developerName;
        if (str == null) {
            return "";
        }
        return str;
    }

    @GlobalApi
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    @GlobalApi
    public long getFileSize() {
        return this.fileSize;
    }

    @GlobalApi
    public String getIntentUri() {
        return this.intentUri;
    }

    @Override // com.huawei.hms.ads.b
    @GlobalApi
    public String getPermissionUrl() {
        return this.permissionUrl;
    }

    @GlobalApi
    public String getPkgName() {
        return this.pkgName;
    }

    @Override // com.huawei.hms.ads.b
    @GlobalApi
    public String getPrivacyLink() {
        return this.privacyUrl;
    }

    @GlobalApi
    public String getRealPkgName() {
        return this.realPkgName;
    }

    @GlobalApi
    public String getSafeDownloadUrl() {
        return this.safeDownloadUrl;
    }

    @GlobalApi
    public String getSha256() {
        return this.sha256;
    }

    @GlobalApi
    public String getUniqueId() {
        return this.uniqueId;
    }

    @GlobalApi
    public String getVersionName() {
        String str = this.versionName;
        if (str == null) {
            return "";
        }
        return str;
    }

    @GlobalApi
    public boolean isCheckSha256() {
        return this.checkSha256;
    }

    @GlobalApi
    public boolean isPermPromptForCard() {
        return this.permPromptForCard;
    }

    @GlobalApi
    public boolean isPermPromptForLanding() {
        return this.permPromptForLanding;
    }

    @Override // com.huawei.hms.ads.b
    @GlobalApi
    public void showPermissionPage(final Context context) {
        if (TextUtils.isEmpty(this.permissionUrl)) {
            ex.V(TAG, "load privacy link is empty.");
        } else {
            gb.w.b(new Runnable() { // from class: com.huawei.hms.ads.AppInfo.2
                @Override // java.lang.Runnable
                public void run() {
                    r0.d(context, AppInfo.this.permissionUrl);
                }
            });
        }
    }

    @Override // com.huawei.hms.ads.b
    @GlobalApi
    public void showPrivacyPolicy(final Context context) {
        if (TextUtils.isEmpty(this.privacyUrl)) {
            ex.V(TAG, "load privacy link is empty.");
        } else {
            gb.w.b(new Runnable() { // from class: com.huawei.hms.ads.AppInfo.1
                @Override // java.lang.Runnable
                public void run() {
                    r0.d(context, AppInfo.this.privacyUrl);
                }
            });
        }
    }

    public void Code(String str) {
        this.privacyUrl = str;
    }
}
