package com.anythink.core.api;

import android.text.TextUtils;

/* loaded from: classes.dex */
public abstract class ATAdAppInfo {
    public abstract String getAppDownloadCount();

    public abstract String getAppName();

    public abstract String getAppPackageName();

    public abstract String getAppPermissonUrl();

    public abstract String getAppPrivacyUrl();

    public abstract long getAppSize();

    public abstract String getAppVersion();

    public abstract String getPublisher();

    public String toString() {
        String publisher;
        String appVersion;
        String appPrivacyUrl;
        String appPermissonUrl;
        String appName;
        StringBuilder sb2 = new StringBuilder("Publisher: ");
        String str = "";
        if (TextUtils.isEmpty(getPublisher())) {
            publisher = "";
        } else {
            publisher = getPublisher();
        }
        sb2.append(publisher);
        sb2.append(" | AppVersion: ");
        if (TextUtils.isEmpty(getAppVersion())) {
            appVersion = "";
        } else {
            appVersion = getAppVersion();
        }
        sb2.append(appVersion);
        sb2.append(" | AppPrivacyUrl: ");
        if (TextUtils.isEmpty(getAppPrivacyUrl())) {
            appPrivacyUrl = "";
        } else {
            appPrivacyUrl = getAppPrivacyUrl();
        }
        sb2.append(appPrivacyUrl);
        sb2.append(" | AppPermissonUrl: ");
        if (TextUtils.isEmpty(getAppPermissonUrl())) {
            appPermissonUrl = "";
        } else {
            appPermissonUrl = getAppPermissonUrl();
        }
        sb2.append(appPermissonUrl);
        sb2.append(" | AppName: ");
        if (TextUtils.isEmpty(getAppName())) {
            appName = "";
        } else {
            appName = getAppName();
        }
        sb2.append(appName);
        sb2.append(" | AppPackageName: ");
        if (!TextUtils.isEmpty(getAppPackageName())) {
            str = getAppPackageName();
        }
        sb2.append(str);
        sb2.append(" | AppSize: ");
        sb2.append(getAppSize());
        sb2.append(" | AppDownloadCount: ");
        sb2.append(getAppDownloadCount());
        return sb2.toString();
    }
}
