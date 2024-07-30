package com.huawei.openalliance.ad.ppskit.beans.metadata;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public class InnerPackageInfo {
    private String packageName;
    private String versionName;

    public final String a() {
        return this.packageName;
    }

    public final String b() {
        return this.versionName;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InnerPackageInfo)) {
            return false;
        }
        InnerPackageInfo innerPackageInfo = (InnerPackageInfo) obj;
        if (TextUtils.isEmpty(this.packageName) || !this.packageName.equals(innerPackageInfo.packageName)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.packageName;
        if (str != null) {
            return str.hashCode();
        }
        return -1;
    }
}
