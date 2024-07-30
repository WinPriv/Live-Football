package com.ironsource.environment;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f24642a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24643b;

    /* renamed from: c, reason: collision with root package name */
    public final String f24644c;

    public c(int i10, String str, String str2, String str3) {
        this.f24643b = str2;
        this.f24642a = str;
        this.f24644c = str3;
    }

    public static long a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return -1L;
        }
    }

    public static long b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return -1L;
        }
    }

    public static String d(Context context) {
        String str;
        try {
            str = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        } catch (Throwable unused) {
            str = null;
        }
        return TextUtils.isEmpty(str) ? "" : str;
    }

    public String c() {
        return this.f24644c;
    }

    public c(String str, String str2, String str3) {
        this.f24643b = str2;
        this.f24642a = str;
        this.f24644c = str3;
    }

    public static String c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public void d() {
        f.a(this);
    }

    public String a() {
        return this.f24642a;
    }

    public String b() {
        return this.f24643b;
    }

    public static JSONObject a(Context context, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            int i10 = 0;
            if (jSONArray.length() == 0) {
                while (true) {
                    String[] strArr = packageInfo.requestedPermissions;
                    if (i10 >= strArr.length) {
                        break;
                    }
                    jSONObject.put(strArr[i10], (packageInfo.requestedPermissionsFlags[i10] & 2) != 0 ? "Granted" : "Rejected");
                    i10++;
                }
            } else {
                List asList = Arrays.asList(packageInfo.requestedPermissions);
                while (i10 < jSONArray.length()) {
                    String string = jSONArray.getString(i10);
                    int indexOf = asList.indexOf(string);
                    if (indexOf != -1) {
                        jSONObject.put(string, (packageInfo.requestedPermissionsFlags[indexOf] & 2) != 0 ? "Granted" : "Rejected");
                    } else {
                        jSONObject.put(string, "notFoundInManifest");
                    }
                    i10++;
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return jSONObject;
    }

    public static boolean b(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static String c(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean a(Context context, String str) {
        boolean z10 = false;
        int i10 = 0;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            if (packageInfo.requestedPermissions == null) {
                return false;
            }
            boolean z11 = false;
            while (true) {
                try {
                    String[] strArr = packageInfo.requestedPermissions;
                    if (i10 >= strArr.length || z11) {
                        break;
                    }
                    z11 = str.equals(strArr[i10]);
                    i10++;
                } catch (Exception e10) {
                    e = e10;
                    z10 = z11;
                    e.printStackTrace();
                    return z10;
                }
            }
            return z11;
        } catch (Exception e11) {
            e = e11;
        }
    }
}
