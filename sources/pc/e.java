package pc;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static String f34500a = "";

    /* renamed from: b, reason: collision with root package name */
    public static String f34501b = "";

    /* renamed from: c, reason: collision with root package name */
    public static String f34502c = "";

    /* renamed from: d, reason: collision with root package name */
    public static String f34503d = "";

    /* renamed from: e, reason: collision with root package name */
    public static int f34504e;
    public static String f;

    public static String a() {
        if (jc.b.a().d("os_vc")) {
            return "";
        }
        if (TextUtils.isEmpty(f34501b)) {
            f34501b = String.valueOf(Build.VERSION.SDK_INT);
        }
        return f34501b;
    }

    public static String b(Context context) {
        if (jc.b.a().d("app_vc")) {
            return "";
        }
        if (f34504e == 0) {
            try {
                f34504e = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(f34504e);
                return sb2.toString();
            } catch (Exception e10) {
                e10.printStackTrace();
                return "";
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(f34504e);
        return sb3.toString();
    }

    public static String c() {
        if (jc.b.a().d("os_vn")) {
            return "";
        }
        if (TextUtils.isEmpty(f34500a)) {
            f34500a = Build.VERSION.RELEASE;
        }
        return f34500a;
    }

    public static String d(Context context) {
        if (jc.b.a().d("app_vn")) {
            return "";
        }
        try {
            if (TextUtils.isEmpty(f34503d)) {
                String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                f34503d = str;
                return str;
            }
            return f34503d;
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static String e(Context context) {
        if (jc.b.a().d("package_name")) {
            return "";
        }
        try {
            if (TextUtils.isEmpty(f34502c)) {
                String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
                f34502c = str;
                return str;
            }
            return f34502c;
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }
}
