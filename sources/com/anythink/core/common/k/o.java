package com.anythink.core.common.k;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/* loaded from: classes.dex */
final class o {

    /* renamed from: a, reason: collision with root package name */
    private final PackageManager f6220a;

    /* loaded from: classes.dex */
    public enum a {
        ENABLED,
        DISABLED,
        NOT_INSTALLED
    }

    public o(Context context) {
        this.f6220a = context.getPackageManager();
    }

    private static boolean a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (context != null) {
            try {
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                    return false;
                }
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.processName.equals(context.getPackageName()) && runningAppProcessInfo.importance >= 200) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private int c(String str) {
        try {
            PackageInfo packageInfo = this.f6220a.getPackageInfo(str, 16);
            if (packageInfo != null) {
                return packageInfo.versionCode;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return 0;
    }

    private String d(String str) {
        try {
            PackageInfo packageInfo = this.f6220a.getPackageInfo(str, 16);
            if (packageInfo != null) {
                String str2 = packageInfo.versionName;
                if (str2 != null) {
                    return str2;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return "";
    }

    private byte[] e(String str) {
        Signature[] signatureArr;
        try {
            PackageInfo packageInfo = this.f6220a.getPackageInfo(str, 64);
            if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length > 0) {
                return signatureArr[0].toByteArray();
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return new byte[0];
    }

    public final String b(String str) {
        byte[] e10 = e(str);
        if (e10 != null && e10.length != 0) {
            return k.a(a(e10));
        }
        return null;
    }

    public final a a(String str) {
        if (TextUtils.isEmpty(str)) {
            return a.NOT_INSTALLED;
        }
        try {
            return this.f6220a.getApplicationInfo(str, 0).enabled ? a.ENABLED : a.DISABLED;
        } catch (PackageManager.NameNotFoundException unused) {
            return a.NOT_INSTALLED;
        }
    }

    private static byte[] a(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA-256").digest(bArr);
        } catch (NoSuchAlgorithmException unused) {
            return new byte[0];
        }
    }
}
