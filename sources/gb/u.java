package gb;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import com.huawei.android.app.ActivityManagerEx;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.gb;
import com.huawei.openalliance.ad.ppskit.beans.inner.CountryCodeBean;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f28631a = 0;

    public static boolean a() {
        String str;
        String d10 = d(CountryCodeBean.LOCALE_REGION_COUNTRYSYSTEMPROP);
        if (!TextUtils.isEmpty(d10)) {
            return "cn".equalsIgnoreCase(d10);
        }
        String d11 = d(CountryCodeBean.LOCALE_COUNTRYSYSTEMPROP);
        if (!TextUtils.isEmpty(d11)) {
            return d11.toLowerCase(Locale.ENGLISH).contains("cn");
        }
        Locale locale = Locale.getDefault();
        if (locale != null) {
            str = locale.getCountry();
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            return "cn".equalsIgnoreCase(str);
        }
        return false;
    }

    public static boolean b() {
        if (k() && !com.huawei.openalliance.ad.constant.w.cG.equalsIgnoreCase(Locale.getDefault().getLanguage())) {
            return true;
        }
        return false;
    }

    public static String c(gb gbVar) {
        int[] q10 = q(gbVar);
        return String.format("%s,%s", Integer.valueOf(q10[0]), Integer.valueOf(q10[1]));
    }

    public static String d(String str) {
        String simpleName;
        String str2;
        String str3;
        Class<?> cls;
        try {
            if (Build.VERSION.SDK_INT >= 27) {
                try {
                    if (z.f()) {
                        str3 = "com.hihonor.android.os.SystemPropertiesEx";
                    } else {
                        str3 = "com.huawei.android.os.SystemPropertiesEx";
                    }
                    cls = Class.forName(str3);
                } catch (ClassNotFoundException unused) {
                }
                return (String) cls.getMethod("get", String.class).invoke(cls, str);
            }
            cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (RuntimeException e10) {
            simpleName = e10.getClass().getSimpleName();
            str2 = "getSystemProperties RuntimeException:";
            ex.I("u", str2.concat(simpleName));
            return null;
        } catch (Throwable th) {
            simpleName = th.getClass().getSimpleName();
            str2 = "getSystemProperties Exception:";
            ex.I("u", str2.concat(simpleName));
            return null;
        }
    }

    public static void e(Activity activity, Context context) {
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (context != null && activity != null && (context instanceof Activity)) {
            Window window = ((Activity) context).getWindow();
            Window window2 = activity.getWindow();
            if (window != null && window2 != null) {
                WindowManager.LayoutParams attributes = window2.getAttributes();
                WindowManager.LayoutParams attributes2 = window.getAttributes();
                attributes.flags = attributes2.flags | 67108864;
                if (i11 >= 28) {
                    i10 = attributes2.layoutInDisplayCutoutMode;
                    attributes.layoutInDisplayCutoutMode = i10;
                }
                window2.setAttributes(attributes);
                window2.setNavigationBarColor(window.getNavigationBarColor());
                View decorView = window.getDecorView();
                View decorView2 = window2.getDecorView();
                if (decorView != null && decorView2 != null) {
                    decorView2.setSystemUiVisibility(decorView.getSystemUiVisibility());
                    return;
                } else {
                    ex.I("u", "decorView is null");
                    return;
                }
            }
            ex.I("u", "window is null");
            return;
        }
        ex.I("u", "activity is null");
    }

    public static void f(Context context, Intent intent) {
        if (context != null) {
            try {
                intent.setClipData(com.huawei.openalliance.ad.constant.w.cH);
                context.startActivity(intent);
            } catch (Throwable unused) {
                ex.I("u", "start activity error");
            }
        }
    }

    public static void g(ImageView imageView) {
        float f;
        if (imageView == null) {
            return;
        }
        if (k()) {
            f = -1.0f;
        } else {
            f = 1.0f;
        }
        imageView.setScaleX(f);
    }

    public static boolean h(Activity activity) {
        if (activity == null) {
            return false;
        }
        try {
            if (ActivityManagerEx.getActivityWindowMode(activity) != 102) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            ex.I("u", "isFreedomWindowMode error");
            return false;
        }
    }

    public static String i(Context context, String str) {
        PackageManager packageManager;
        if (context == null || (packageManager = context.getPackageManager()) == null) {
            return "";
        }
        try {
            Bundle bundle = packageManager.getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle != null) {
                return bundle.getString(str);
            }
        } catch (PackageManager.NameNotFoundException e10) {
            e0.i.q(e10, "getMetaDataInfo ", "u");
        }
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        if (r3 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008b, code lost:
    
        if ((r4 - r8) <= 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005b, code lost:
    
        if ("0".equals(r4) != false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int j(android.content.Context r8) {
        /*
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            android.content.res.Resources r1 = r8.getResources()
            java.lang.String r2 = "navigation_bar_height"
            java.lang.String r3 = "dimen"
            java.lang.String r4 = "android"
            int r2 = r1.getIdentifier(r2, r3, r4)
            if (r2 <= 0) goto L95
            int r3 = android.os.Build.VERSION.SDK_INT
            r5 = 28
            r6 = 1
            if (r3 < r5) goto L31
            int r3 = gb.z.m(r8)
            java.lang.Object[] r4 = new java.lang.Object[r6]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r4[r0] = r5
            java.lang.String r5 = "u"
            java.lang.String r7 = "isGesture: %s"
            com.huawei.hms.ads.ex.Code(r5, r7, r4)
            if (r3 != 0) goto L53
            goto L5d
        L31:
            android.content.res.Resources r3 = r8.getResources()
            java.lang.String r5 = "bool"
            java.lang.String r7 = "config_showNavigationBar"
            int r4 = r3.getIdentifier(r7, r5, r4)
            if (r4 <= 0) goto L44
            boolean r3 = r3.getBoolean(r4)
            goto L45
        L44:
            r3 = r0
        L45:
            java.lang.String r4 = "qemu.hw.mainkeys"
            java.lang.String r4 = d(r4)
            java.lang.String r5 = "1"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L55
        L53:
            r3 = r0
            goto L5e
        L55:
            java.lang.String r5 = "0"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L5e
        L5d:
            r3 = r6
        L5e:
            if (r3 == 0) goto L95
            java.lang.String r3 = "window"
            java.lang.Object r8 = r8.getSystemService(r3)
            android.view.WindowManager r8 = (android.view.WindowManager) r8
            if (r8 != 0) goto L6b
            goto L8e
        L6b:
            android.view.Display r8 = r8.getDefaultDisplay()
            android.util.DisplayMetrics r3 = new android.util.DisplayMetrics
            r3.<init>()
            r8.getRealMetrics(r3)
            int r4 = r3.heightPixels
            int r3 = r3.widthPixels
            android.util.DisplayMetrics r5 = new android.util.DisplayMetrics
            r5.<init>()
            r8.getMetrics(r5)
            int r8 = r5.heightPixels
            int r5 = r5.widthPixels
            int r3 = r3 - r5
            if (r3 > 0) goto L8f
            int r4 = r4 - r8
            if (r4 <= 0) goto L8e
            goto L8f
        L8e:
            r6 = r0
        L8f:
            if (r6 == 0) goto L95
            int r0 = r1.getDimensionPixelSize(r2)
        L95:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.u.j(android.content.Context):int");
    }

    public static boolean k() {
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            return true;
        }
        return false;
    }

    public static int l(Context context) {
        Resources resources;
        Configuration configuration;
        if (context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null) {
            return 1;
        }
        return configuration.orientation;
    }

    public static int m(Context context) {
        Resources resources;
        int identifier;
        if (context == null || (identifier = (resources = context.getResources()).getIdentifier("navigation_bar_height", "dimen", "android")) <= 0) {
            return 0;
        }
        return resources.getDimensionPixelSize(identifier);
    }

    public static String n(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (str.length() == 1) {
                return "0".concat(str);
            }
            return str;
        }
        return "";
    }

    public static boolean o(Context context) {
        KeyguardManager keyguardManager;
        if (context == null || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null) {
            return false;
        }
        return keyguardManager.inKeyguardRestrictedInputMode();
    }

    public static int[] p(View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int[] q(gb gbVar) {
        View view;
        if (gbVar instanceof View) {
            view = (View) gbVar;
        } else {
            view = null;
        }
        return p(view);
    }

    public static int r(Context context) {
        Display defaultDisplay;
        if (context == null) {
            return 1;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            int rotation = defaultDisplay.getRotation();
            if (rotation == 1) {
                return 0;
            }
            if (rotation == 2) {
                return 9;
            }
            if (rotation != 3) {
                return 1;
            }
            return 8;
        }
        ex.Z("u", "Failed to get display orientation info.");
        if (context.getResources().getConfiguration().orientation != 2) {
            return 1;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean s(android.content.Context r8) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            r2 = 0
            if (r0 != r1) goto L9a
            r0 = 1
            if (r8 == 0) goto L96
            java.lang.String r1 = "u"
            java.lang.String r3 = " color="
            java.lang.String r4 = "#"
            android.content.res.Resources r8 = r8.getResources()     // Catch: java.lang.Exception -> L79
            int r5 = com.huawei.hms.ads.base.R.color.hiad_dark_mode_tag_color     // Catch: java.lang.Exception -> L79
            int r8 = r8.getColor(r5)     // Catch: java.lang.Exception -> L79
            java.lang.StringBuffer r5 = new java.lang.StringBuffer     // Catch: java.lang.Exception -> L79
            r5.<init>(r4)     // Catch: java.lang.Exception -> L79
            int r4 = android.graphics.Color.alpha(r8)     // Catch: java.lang.Exception -> L79
            java.lang.String r4 = java.lang.Integer.toHexString(r4)     // Catch: java.lang.Exception -> L79
            int r6 = android.graphics.Color.red(r8)     // Catch: java.lang.Exception -> L79
            java.lang.String r6 = java.lang.Integer.toHexString(r6)     // Catch: java.lang.Exception -> L79
            int r7 = android.graphics.Color.green(r8)     // Catch: java.lang.Exception -> L79
            java.lang.String r7 = java.lang.Integer.toHexString(r7)     // Catch: java.lang.Exception -> L79
            int r8 = android.graphics.Color.blue(r8)     // Catch: java.lang.Exception -> L79
            java.lang.String r8 = java.lang.Integer.toHexString(r8)     // Catch: java.lang.Exception -> L79
            java.lang.String r4 = n(r4)     // Catch: java.lang.Exception -> L79
            java.lang.String r6 = n(r6)     // Catch: java.lang.Exception -> L79
            java.lang.String r7 = n(r7)     // Catch: java.lang.Exception -> L79
            java.lang.String r8 = n(r8)     // Catch: java.lang.Exception -> L79
            r5.append(r4)     // Catch: java.lang.Exception -> L79
            r5.append(r6)     // Catch: java.lang.Exception -> L79
            r5.append(r7)     // Catch: java.lang.Exception -> L79
            r5.append(r8)     // Catch: java.lang.Exception -> L79
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L79
            r8.<init>(r3)     // Catch: java.lang.Exception -> L79
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Exception -> L79
            r8.append(r3)     // Catch: java.lang.Exception -> L79
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> L79
            com.huawei.hms.ads.ex.Code(r1, r8)     // Catch: java.lang.Exception -> L79
            java.lang.String r8 = r5.toString()     // Catch: java.lang.Exception -> L79
            java.util.Locale r3 = java.util.Locale.ENGLISH     // Catch: java.lang.Exception -> L79
            java.lang.String r8 = r8.toUpperCase(r3)     // Catch: java.lang.Exception -> L79
            goto L8c
        L79:
            r8 = move-exception
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = r8.getName()
            java.lang.String r3 = "catch theme color exception:"
            java.lang.String r8 = r3.concat(r8)
            com.huawei.hms.ads.ex.V(r1, r8)
            r8 = 0
        L8c:
            java.lang.String r1 = "#FF3F97E9"
            boolean r8 = r1.equalsIgnoreCase(r8)
            if (r8 == 0) goto L96
            r8 = r0
            goto L97
        L96:
            r8 = r2
        L97:
            if (r8 == 0) goto L9a
            r2 = r0
        L9a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.u.s(android.content.Context):boolean");
    }
}
