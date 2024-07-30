package gb;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import com.huawei.android.hms.ppskit.PpsCoreService;
import com.huawei.hms.ads.ec;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.gl;

/* loaded from: classes2.dex */
public abstract class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static String f28622a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f28623b = new byte[0];

    public static boolean a(Context context) {
        return TextUtils.equals(b0.g(context), n(context));
    }

    public static int b(Context context, float f) {
        if (context != null && f > gl.Code) {
            return (int) ((f / context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(android.content.Context r5) {
        /*
            java.lang.String r0 = "com.huawei.hms.client.service.name:ads-base"
            java.lang.String r0 = gb.u.i(r5, r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L15
            java.lang.String r0 = "com.huawei.hms.client.service.name:ads-base-inner"
            java.lang.String r0 = gb.u.i(r5, r0)
            java.lang.String r5 = "ads-base-inner"
            goto L17
        L15:
            java.lang.String r5 = "ads-base"
        L17:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L29
            java.lang.String r1 = ":"
            java.lang.String r5 = r5.concat(r1)
            java.lang.String r1 = ""
            java.lang.String r0 = r0.replaceAll(r5, r1)
        L29:
            java.lang.String r5 = "13.4.65.300"
            boolean r5 = android.text.TextUtils.equals(r0, r5)
            r1 = 1
            r2 = 0
            if (r5 == 0) goto L35
        L33:
            r5 = r1
            goto L5e
        L35:
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r3 = "HiAdTools"
            if (r5 != 0) goto L58
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r4 = "current sdk module version 13.4.65.300 is not compatible with base sdk version("
            r5.<init>(r4)
            r5.append(r0)
            java.lang.String r4 = "), please update to base version "
            r5.append(r4)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            android.util.Log.e(r3, r5)
            r5 = r2
            goto L5e
        L58:
            java.lang.String r5 = "unknown base sdk version"
            android.util.Log.w(r3, r5)
            goto L33
        L5e:
            if (r5 == 0) goto L61
            goto L62
        L61:
            r1 = r2
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.r0.c(android.content.Context):boolean");
    }

    public static boolean d(Context context, String str) {
        String concat;
        if (p.f(str)) {
            concat = "openLinkInBrowser url is null, return";
        } else {
            try {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                intent.setFlags(268468224);
                intent.setClipData(com.huawei.openalliance.ad.constant.w.cH);
                context.startActivity(intent);
                return true;
            } catch (Throwable th) {
                concat = "openLinkInBrowser ".concat(th.getClass().getSimpleName());
            }
        }
        ex.I("HiAdTools", concat);
        return false;
    }

    public static int e(Context context, float f) {
        if (context != null && f > gl.Code) {
            return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
        }
        return 0;
    }

    public static boolean f() {
        try {
            int i10 = PpsCoreService.f21504t;
            return true;
        } catch (Throwable unused) {
            ex.I("HiAdTools", "inner pps core service not available");
            return false;
        }
    }

    public static boolean g(Context context) {
        if (f()) {
            return true;
        }
        int k10 = b0.k(context, b0.g(context));
        ex.V("HiAdTools", "isSupportSetAppInfo hms ver: " + k10);
        if (k10 >= 40004300) {
            return true;
        }
        ex.V("HiAdTools", "hms is not installed or hms version is too low, version is: " + k10);
        return false;
    }

    public static boolean h(Context context, String str) {
        String concat;
        String packageName;
        if (p.f(str)) {
            concat = "openLinkByDeepLink deepLinkUrl is null, return";
        } else {
            try {
                Intent intent = new Intent();
                intent.addFlags(268435456);
                if (a(context)) {
                    packageName = b0.g(context);
                } else {
                    packageName = context.getPackageName();
                }
                intent.setPackage(packageName);
                intent.setData(Uri.parse(str));
                intent.setClipData(com.huawei.openalliance.ad.constant.w.cH);
                context.startActivity(intent);
                return true;
            } catch (Throwable th) {
                concat = "openLinkByDeepLink ".concat(th.getClass().getSimpleName());
            }
        }
        ex.I("HiAdTools", concat);
        return false;
    }

    public static int i(Context context, float f) {
        if (context == null || f <= gl.Code) {
            return 0;
        }
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static long j() {
        long maxMemory = Runtime.getRuntime().maxMemory() - (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());
        if (ex.Code()) {
            ex.Code("HiAdTools", "unUsedMemory is: %s", String.valueOf(maxMemory));
        }
        return maxMemory;
    }

    public static boolean k(Context context) {
        int k10 = b0.k(context, b0.g(context));
        ex.V("HiAdTools", "isSupportHmsAdsService hms ver: " + k10);
        if (k10 < 40000300) {
            ex.V("HiAdTools", "hms is not installed or hms version is too low, version is: " + k10);
            return false;
        }
        return true;
    }

    public static boolean l(Context context, String str) {
        if (context == null) {
            ex.I("HiAdTools", "processWhyEvent context is null, return");
            return false;
        }
        String str2 = com.huawei.openalliance.ad.constant.w.al;
        if (com.huawei.openalliance.ad.constant.w.al.equalsIgnoreCase(str) && !a(context)) {
            str = com.huawei.openalliance.ad.constant.w.am + context.getPackageName();
        }
        if (p.f(str)) {
            if (!a(context)) {
                str2 = com.huawei.openalliance.ad.constant.w.am + context.getPackageName();
            }
            ex.Code("HiAdTools", "processWhyEvent cloud download url is empty, use default!");
            return h(context, str2);
        }
        ex.Code("HiAdTools", "processWhyEvent url = %s", androidx.transition.n.e(str));
        if (p.a(str)) {
            return d(context, str);
        }
        return h(context, str);
    }

    public static int m(Context context, float f) {
        if (context == null || f <= gl.Code) {
            return 0;
        }
        return (int) ((f * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public static String n(Context context) {
        String str;
        synchronized (f28623b) {
            str = f28622a;
        }
        ex.V("HiAdTools", "current connected service pkg: " + str);
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        int t10 = ec.Code(context).t();
        if ((t10 == 0 || t10 == 2) && k(context)) {
            return b0.g(context);
        }
        if (f()) {
            return context.getPackageName();
        }
        return b0.g(context);
    }

    public static Integer o(Context context) {
        Integer i10 = a0.a.i(context, b0.g(context.getApplicationContext()), "ppskit_ver_code");
        if (ex.Code()) {
            ex.Code("HiAdTools", "ppsKitVerCode:%s", i10);
        }
        return i10;
    }

    public static boolean p(Context context) {
        float f;
        Configuration configuration;
        float f10 = -1.0f;
        if (context != null) {
            try {
                f = Settings.System.getFloat(context.getContentResolver(), "font_scale", -1.0f);
            } catch (Throwable th) {
                ex.I("HiAdTools", "get font err: %s", th.getClass().getSimpleName());
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

    public static int q(Context context) {
        try {
            int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier <= 0) {
                return 0;
            }
            return context.getResources().getDimensionPixelSize(identifier);
        } catch (Throwable th) {
            ex.I("HiAdTools", "getStatusBarHeight err: %s", th.getClass().getSimpleName());
            return 0;
        }
    }
}
