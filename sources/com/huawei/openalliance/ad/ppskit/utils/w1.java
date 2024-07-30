package com.huawei.openalliance.ad.ppskit.utils;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import ka.n7;

/* loaded from: classes2.dex */
public abstract class w1 {
    public static String a(Context context) {
        String d10;
        if (b() && Build.VERSION.SDK_INT <= 27 && (d10 = d(context)) != null) {
            return d10;
        }
        return c(context);
    }

    public static boolean b() {
        boolean z10;
        if (TextUtils.equals("mounted", Environment.getExternalStorageState())) {
            return true;
        }
        try {
            z10 = Environment.isExternalStorageRemovable();
        } catch (Throwable th) {
            e0.i.p(th, "isExternalStorageRemovable, ", "StorageUtils");
            z10 = true;
        }
        if (!z10) {
            return true;
        }
        return false;
    }

    public static String c(Context context) {
        File cacheDir;
        if (context == null || (cacheDir = context.getCacheDir()) == null) {
            return "";
        }
        return x.w(cacheDir);
    }

    public static String d(Context context) {
        if (context == null) {
            return "";
        }
        try {
            File externalCacheDir = context.getExternalCacheDir();
            if (externalCacheDir != null) {
                return x.w(externalCacheDir);
            }
            return null;
        } catch (Exception unused) {
            n7.g("StorageUtils", "getExternalFilesDir exception, use memory card folder.");
            return null;
        }
    }

    public static String e(Context context) {
        String str;
        if (b()) {
            if (context == null) {
                str = "";
            } else {
                str = null;
                try {
                    File externalFilesDir = context.getExternalFilesDir(null);
                    if (externalFilesDir != null) {
                        str = x.w(externalFilesDir);
                    }
                } catch (Exception unused) {
                    n7.g("StorageUtils", "getExternalFilesDir exception, use memory card folder.");
                }
            }
            if (str != null) {
                return str;
            }
        }
        return f(context);
    }

    public static String f(Context context) {
        File filesDir;
        if (context == null || (filesDir = context.getFilesDir()) == null) {
            return "";
        }
        return x.w(filesDir);
    }
}
