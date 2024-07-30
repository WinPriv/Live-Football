package com.huawei.openalliance.ad.ppskit.utils;

import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.huawei.hms.ads.gl;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ka.Cif;
import ka.n7;
import okhttp3.Request;

/* loaded from: classes2.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f22830a;

    static {
        HashMap hashMap = new HashMap();
        f22830a = hashMap;
        hashMap.put(2, 9);
        hashMap.put(3, 10);
        hashMap.put(4, 11);
    }

    public static int a(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static int b(Context context, float f) {
        if (context == null || f <= gl.Code) {
            return 0;
        }
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(java.lang.String r2, boolean r3) {
        /*
            boolean r0 = com.huawei.openalliance.ad.ppskit.utils.y1.h(r2)
            if (r0 != 0) goto L1f
            java.lang.String r0 = "_"
            java.lang.String[] r2 = r2.split(r0)
            int r0 = r2.length
            r1 = 2
            if (r0 != r1) goto L1f
            r0 = 1
            r2 = r2[r0]     // Catch: java.lang.NumberFormatException -> L18
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L18
            goto L20
        L18:
            java.lang.String r2 = "HiAdTools"
            java.lang.String r0 = "get emui version error!"
            ka.n7.g(r2, r0)
        L1f:
            r2 = 0
        L20:
            if (r3 == 0) goto L28
            r0 = 4
            if (r2 <= r0) goto L28
            r2 = 11
            return r2
        L28:
            if (r3 == 0) goto L3a
            java.util.HashMap r3 = com.huawei.openalliance.ad.ppskit.utils.d0.f22830a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r3.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
        L3a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.utils.d0.c(java.lang.String, boolean):int");
    }

    public static String d(String str, String str2) {
        Matcher matcher;
        try {
            matcher = Pattern.compile(str).matcher(str2);
        } catch (RuntimeException e10) {
            n7.j("HiAdTools", "getVersionByPattern RuntimeException: %s", e10.getClass().getSimpleName());
        } catch (Exception e11) {
            n7.j("HiAdTools", "getVersionByPattern Exception: %s", e11.getClass().getSimpleName());
        }
        if (!matcher.find()) {
            n7.h("HiAdTools", "can not find versionName: %s by pattern: %s", str2, str);
            return "";
        }
        return matcher.group(0);
    }

    public static SimpleDateFormat e(String str) {
        try {
            return new SimpleDateFormat(str, Locale.ENGLISH);
        } catch (Throwable unused) {
            return new SimpleDateFormat(str);
        }
    }

    public static Date f(Date date, int i10) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(5, calendar.get(5) - i10);
        calendar.set(11, 24);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTime();
    }

    public static boolean g(Context context, Uri uri) {
        boolean z10;
        if (context == null || uri == null) {
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(uri.getAuthority(), 0);
        if (resolveContentProvider != null) {
            ApplicationInfo applicationInfo = resolveContentProvider.applicationInfo;
            if (applicationInfo == null) {
                return false;
            }
            String str = applicationInfo.packageName;
            n7.e("HiAdTools", "Target provider service's package name is : " + str);
            if (str == null) {
                return false;
            }
            if (packageManager.checkSignatures(context.getPackageName(), str) != 0 && (applicationInfo.flags & 1) != 1) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10 && !Cif.c(context)) {
                String j10 = o2.j(context, str);
                boolean isEmpty = TextUtils.isEmpty(j10);
                n7.f("HiAdTools", "is sign empty: %s", Boolean.valueOf(isEmpty));
                if (!isEmpty) {
                    return oa.j.a(context, str, j10);
                }
            }
            return z10;
        }
        n7.i("HiAdTools", "Invalid param");
        return false;
    }

    public static boolean h(Context context, String str) {
        String concat;
        if (!y1.t(str)) {
            concat = "url is error, return";
        } else {
            try {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                intent.setFlags(268468224);
                z1.r(context, intent);
                return true;
            } catch (Throwable th) {
                concat = "openLinkInBrowser ".concat(th.getClass().getSimpleName());
            }
        }
        n7.g("HiAdTools", concat);
        return false;
    }

    public static long i() {
        long maxMemory = Runtime.getRuntime().maxMemory() - (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());
        if (n7.d()) {
            n7.c("HiAdTools", "unUsedMemory is: %s", String.valueOf(maxMemory));
        }
        return maxMemory;
    }

    public static String j(String str) {
        return e(str).format(new Date());
    }

    public static void k(Context context, String str) {
        if (y1.h(str)) {
            n7.g("HiAdTools", "openHmsSetting, deepLink is empty.");
        }
        try {
            Intent intent = new Intent();
            intent.addFlags(268435456);
            intent.setPackage(o2.h(context));
            intent.setData(Uri.parse(str));
            intent.setClipData(oa.a.f33785b);
            context.startActivity(intent);
        } catch (Throwable th) {
            n7.h("HiAdTools", "openHmsSetting error: %s", th.getClass().getSimpleName());
        }
    }

    public static int l() {
        String simpleName;
        String str;
        int c10;
        try {
            String o = z1.o("ro.build.version.emui");
            if (TextUtils.isEmpty(o)) {
                return 0;
            }
            String d10 = d("^EmotionUI_[0-9]+", o);
            if (!TextUtils.isEmpty(d10)) {
                c10 = c(d10, false);
            } else {
                c10 = c(d("^MagicUI_[0-9]+", o), true);
            }
            return c10;
        } catch (RuntimeException e10) {
            simpleName = e10.getClass().getSimpleName();
            str = "getEmuiVersion RuntimeException:";
            n7.i("HiAdTools", str.concat(simpleName));
            return 0;
        } catch (Exception e11) {
            simpleName = e11.getClass().getSimpleName();
            str = "getEmuiVersion Exception:";
            n7.i("HiAdTools", str.concat(simpleName));
            return 0;
        }
    }

    public static boolean m(Context context) {
        try {
            Object p02 = a0.a.p0(context, context.getPackageName(), "hiad_ppskit_flag");
            if (p02 != null) {
                String obj = p02.toString();
                if (n7.d()) {
                    n7.c("HiAdTools", "ppskitFlag:%s", obj);
                }
                return !TextUtils.isEmpty(obj);
            }
        } catch (Exception unused) {
            n7.e("HiAdTools", "get meta data error");
        }
        return TextUtils.equals(context.getPackageName(), o2.h(context));
    }

    public static boolean n(Context context, String str) {
        if (context == null) {
            n7.g("HiAdTools", "processWhyEvent context is null, return");
            return false;
        }
        String str2 = com.huawei.openalliance.ad.constant.w.al;
        if (com.huawei.openalliance.ad.constant.w.al.equalsIgnoreCase(str) && !m(context)) {
            str = com.huawei.openalliance.ad.constant.w.am + context.getPackageName();
        }
        if (y1.h(str)) {
            if (!m(context)) {
                str2 = com.huawei.openalliance.ad.constant.w.am + context.getPackageName();
            }
            n7.b("HiAdTools", "processWhyEvent cloud download url is empty, use default skip and return");
            return s(context, str2);
        }
        n7.c("HiAdTools", "processWhyEvent url = %s", str);
        if (y1.t(str)) {
            return h(context, str);
        }
        return s(context, str);
    }

    public static int o(Context context, float f) {
        if (context == null || f <= gl.Code) {
            return 0;
        }
        return (int) ((f * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public static boolean p(Context context) {
        String p10 = i2.p(context);
        Integer q10 = y1.q(p10);
        if (q10 != null && q10.intValue() >= 40000300) {
            return true;
        }
        n7.f("HiAdTools", "hms not installed or low version, current version: %s", p10);
        return false;
    }

    public static boolean q(Context context, String str) {
        if (!TextUtils.isEmpty(com.huawei.openalliance.ad.ppskit.handlers.l.d(context).l(str))) {
            n7.b("HiAdTools", "callPkg is in test mode");
            return true;
        }
        return false;
    }

    public static boolean r(Context context) {
        if (context == null || Build.VERSION.SDK_INT < 29) {
            return false;
        }
        Object systemService = context.getSystemService("uimode");
        if (!(systemService instanceof UiModeManager) || ((UiModeManager) systemService).getNightMode() != 2) {
            return false;
        }
        return true;
    }

    public static boolean s(Context context, String str) {
        String concat;
        String packageName;
        if (y1.h(str)) {
            concat = "openLinkByDeepLink deepLinkUrl is null, return";
        } else {
            try {
                Intent intent = new Intent();
                intent.addFlags(268435456);
                if (m(context)) {
                    packageName = o2.h(context);
                } else {
                    packageName = context.getPackageName();
                }
                intent.setPackage(packageName);
                intent.setData(Uri.parse(str));
                intent.setClipData(oa.a.f33785b);
                context.startActivity(intent);
                return true;
            } catch (Throwable th) {
                concat = "openLinkByDeepLink ex = ".concat(th.getClass().getSimpleName());
            }
        }
        n7.g("HiAdTools", concat);
        return false;
    }

    public static boolean t() {
        try {
            new Request.Builder();
            return true;
        } catch (Throwable th) {
            try {
                n7.j("HttpUtils", "check okhttp error:%s", th.getClass().getSimpleName());
                return false;
            } catch (Throwable th2) {
                n7.j("HiAdTools", "check okhttp error:%s", th2.getClass().getSimpleName());
                return false;
            }
        }
    }

    public static boolean u() {
        boolean W = androidx.transition.n.W(com.huawei.openalliance.ad.constant.w.bB);
        boolean L = androidx.transition.n.L(com.huawei.openalliance.ad.constant.w.bB, com.huawei.openalliance.ad.constant.w.bC, null);
        if (W && L) {
            return true;
        }
        return false;
    }

    public static boolean v(Context context) {
        float f;
        Configuration configuration;
        float f10 = -1.0f;
        if (context != null) {
            try {
                f = Settings.System.getFloat(context.getContentResolver(), "font_scale", -1.0f);
            } catch (Throwable th) {
                n7.h("HiAdTools", "get font err: %s", th.getClass().getSimpleName());
                f = -1.0f;
            }
            if (f > gl.Code) {
                f10 = f;
            } else {
                Resources resources = context.getResources();
                if (resources != null && (configuration = resources.getConfiguration()) != null) {
                    f10 = configuration.fontScale;
                }
            }
        }
        if (f10 < 1.75f) {
            return false;
        }
        return true;
    }
}
