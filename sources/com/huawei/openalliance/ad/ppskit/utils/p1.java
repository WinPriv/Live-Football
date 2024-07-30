package com.huawei.openalliance.ad.ppskit.utils;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import ka.n7;

/* loaded from: classes2.dex */
public abstract class p1 {

    /* renamed from: a, reason: collision with root package name */
    public static final List<String> f22956a = Collections.unmodifiableList(Arrays.asList("android.permission.INTERNAL_SYSTEM_WINDOW", "android.permission.STATUS_BAR_SERVICE"));

    public static boolean a(Context context, String str) {
        String permissionToOp;
        if (context != null && !TextUtils.isEmpty(str)) {
            String packageName = context.getPackageName();
            int myPid = Process.myPid();
            int myUid = Process.myUid();
            char c10 = 65535;
            try {
                if (-1 != context.checkPermission(str, myPid, myUid)) {
                    ApplicationInfo applicationInfo = context.getApplicationInfo();
                    if ((applicationInfo == null || applicationInfo.targetSdkVersion <= 23) && (permissionToOp = AppOpsManager.permissionToOp(str)) != null) {
                        if (TextUtils.isEmpty(packageName)) {
                            String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                            if (!androidx.transition.n.N(packagesForUid)) {
                                packageName = packagesForUid[0];
                            }
                        }
                        if (((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName) != 0) {
                            c10 = 65534;
                        }
                    }
                    c10 = 0;
                }
            } catch (Throwable th) {
                e0.i.p(th, "validatePermission ", "PermissionUtil");
            }
            if (c10 != 0) {
                return false;
            }
            return true;
        }
        n7.e("PermissionUtil", "hasPermission Invalid Input Param");
        return false;
    }

    public static boolean b(Context context, String[] strArr) {
        boolean z10 = true;
        for (String str : strArr) {
            if (!a(context, str)) {
                z10 = false;
            }
        }
        return z10;
    }
}
