package com.huawei.openalliance.ad.ppskit.utils;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.Process;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.hamkho.livefoot.R;
import com.hihonor.android.telephony.HwTelephonyManager;
import com.hihonor.android.telephony.MSimTelephonyManager;
import com.huawei.android.app.ActivityManagerEx;
import com.huawei.featurelayer.sharedfeature.xrkit.sdk.remoteloader.XrKitFeatureFactory;
import com.huawei.openalliance.ad.ppskit.beans.inner.CountryCodeBean;
import com.huawei.openalliance.ad.ppskit.utils.q1;
import java.io.File;
import java.util.List;
import java.util.Locale;
import ka.Cif;
import ka.n7;

/* loaded from: classes2.dex */
public abstract class z1 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile String f23073a;

    /* loaded from: classes2.dex */
    public static class a implements View.OnApplyWindowInsetsListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ka.n f23074a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f23075b;

        public a(ka.n nVar, View view) {
            this.f23074a = nVar;
            this.f23075b = view;
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            String concat;
            View view2;
            try {
                Rect c10 = this.f23074a.c(windowInsets);
                if (c10 != null && (view2 = this.f23075b) != null) {
                    view2.setPadding(c10.left, view2.getPaddingTop(), c10.right, view2.getPaddingBottom());
                }
            } catch (NoSuchMethodError unused) {
                concat = "initOnApplyWindowInsets NoSuchMethodError getDisplaySideRegion";
                n7.g("SystemUtil", concat);
                return windowInsets;
            } catch (Throwable th) {
                concat = "initOnApplyWindowInsets error:".concat(th.getClass().getSimpleName());
                n7.g("SystemUtil", concat);
                return windowInsets;
            }
            return windowInsets;
        }
    }

    public static int A(String str) {
        try {
            if (!y1.h(str)) {
                String[] split = str.split("\\.");
                if (split.length < 4) {
                    n7.i("SystemUtil", "sdkVersion is wrong, please check it!");
                    return 0;
                }
                return Integer.parseInt(split[2]);
            }
        } catch (Throwable th) {
            n7.j("SystemUtil", "get sdkVersion filed, %s", th.getClass().getSimpleName());
        }
        return 0;
    }

    public static String B(int i10, Context context) {
        String line1Number;
        try {
            if (i2.o()) {
                line1Number = MSimTelephonyManager.from(context).getLine1Number(i10);
            } else {
                line1Number = android.telephony.MSimTelephonyManager.from(context).getLine1Number(i10);
            }
            if (y1.h(line1Number)) {
                n7.e("SystemUtil", "get mpn err,id = " + i10);
            }
            return line1Number;
        } catch (Throwable th) {
            e0.i.p(th, "get mpn err", "SystemUtil");
            return "";
        }
    }

    public static String C(Context context) {
        if (context == null) {
            return "";
        }
        try {
            if (TextUtils.isEmpty(H(context))) {
                return j(context) + "-" + i(context).toUpperCase(Locale.getDefault());
            }
            return j(context) + "-" + H(context) + "-" + i(context).toUpperCase(Locale.getDefault());
        } catch (Throwable unused) {
            n7.g("SystemUtil", " getLanguageCode error");
            return "";
        }
    }

    public static boolean D() {
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            return true;
        }
        return false;
    }

    public static String E(int i10, Context context) {
        String[] strArr;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null && runningAppProcesses.size() > 0) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == i10 && (strArr = runningAppProcessInfo.pkgList) != null && strArr.length > 0) {
                    return strArr[0];
                }
            }
            return null;
        }
        return null;
    }

    public static String F(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (str.length() == 1) {
                return "0".concat(str);
            }
            return str;
        }
        return "";
    }

    public static boolean G(Activity activity) {
        if (activity == null) {
            return false;
        }
        try {
            if (ActivityManagerEx.getActivityWindowMode(activity) != 102) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            n7.g("SystemUtil", "isFreedomWindowMode error");
            return false;
        }
    }

    public static String H(Context context) {
        return context.getResources().getConfiguration().locale.getScript();
    }

    public static Uri I(Context context, String str) {
        StringBuilder sb2;
        if (!m.Z(context) && d0.m(context)) {
            if (R(context)) {
                sb2 = new StringBuilder("content://com.huawei.hms.contentprovider/com.huawei.hwid.oobe.pps.oaid");
            } else {
                sb2 = new StringBuilder("content://com.huawei.hms.contentprovider/com.huawei.hwid.pps.oaid");
            }
        } else if (R(context)) {
            sb2 = new StringBuilder("content://com.huawei.hwid.oobe.pps.oaid");
        } else {
            sb2 = new StringBuilder("content://com.huawei.hwid.pps.oaid");
        }
        sb2.append(str);
        return Uri.parse(sb2.toString());
    }

    public static String J(Context context) {
        String str = "";
        if (context.getPackageManager() == null) {
            n7.g("SystemUtil", "pm is null");
            return "";
        }
        int callingUid = Binder.getCallingUid();
        int callingPid = Binder.getCallingPid();
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return "";
        }
        try {
            str = packageManager.getNameForUid(callingUid);
            if (!TextUtils.isEmpty(str) && str.contains(com.huawei.openalliance.ad.constant.w.bE)) {
                n7.e("SystemUtil", "pkg=".concat(str));
                str = E(callingPid, context);
            }
            if (TextUtils.isEmpty(str)) {
                String[] packagesForUid = packageManager.getPackagesForUid(callingUid);
                if (!androidx.transition.n.N(packagesForUid)) {
                    return packagesForUid[0];
                }
                return str;
            }
            return str;
        } catch (Throwable unused) {
            n7.g("SystemUtil", "get name for uid error");
            return str;
        }
    }

    public static long K(Context context) {
        File databasePath = context.getDatabasePath("hiadkit_bfe_ad.db");
        if (databasePath != null) {
            long length = databasePath.length();
            n7.c("SystemUtil", "db path:%s size:%s", y1.j(x.w(databasePath)), Long.valueOf(length));
            return length;
        }
        return 0L;
    }

    public static int L() {
        try {
            Class<?> cls = Class.forName("android.os.UserHandle");
            return ((Integer) cls.getDeclaredMethod("myUserId", new Class[0]).invoke(cls, new Object[0])).intValue();
        } catch (Throwable th) {
            n7.h("SystemUtil", "getCurProcessUserId %s", th.getClass().getSimpleName());
            return com.anythink.expressad.video.bt.a.c.f11213a;
        }
    }

    public static String M(Context context) {
        int myPid;
        ActivityManager activityManager;
        try {
            myPid = Process.myPid();
            activityManager = (ActivityManager) context.getSystemService("activity");
        } catch (Throwable th) {
            e0.i.p(th, "get app name ", "SystemUtil");
        }
        if (activityManager == null) {
            return "";
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (androidx.transition.n.M(runningAppProcesses)) {
            return "";
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo != null && runningAppProcessInfo.pid == myPid) {
                return runningAppProcessInfo.processName;
            }
        }
        return "";
    }

    public static boolean N() {
        if (D() && !com.huawei.openalliance.ad.constant.w.cG.equalsIgnoreCase(Locale.getDefault().getLanguage())) {
            return true;
        }
        return false;
    }

    public static String O(Context context) {
        String str;
        if (context == null) {
            str = "getLocalCountry context is null";
        } else {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                str = "getLocalCountry tm is null";
            } else {
                String simCountryIso = telephonyManager.getSimCountryIso();
                if (TextUtils.isEmpty(simCountryIso)) {
                    return "";
                }
                return simCountryIso.toUpperCase(Locale.ENGLISH);
            }
        }
        n7.e("SystemUtil", str);
        return "";
    }

    public static boolean P(Context context) {
        String M = M(context);
        n7.e("SystemUtil", "process: " + M);
        if (!TextUtils.equals(M, "com.huawei.hwid.persistent") && !TextUtils.equals(M, "com.huawei.hms.persistent") && !TextUtils.equals(M, "com.huawei.hwid.tv.persistent")) {
            return false;
        }
        return true;
    }

    @TargetApi(28)
    public static void Q(Context context) {
        String str;
        if (Build.VERSION.SDK_INT >= 28) {
            String M = M(context);
            n7.e("SystemUtil", "setWebDataDir processName: " + M);
            try {
                if (!TextUtils.isEmpty(M) && !o2.h(context).equals(M)) {
                    WebView.setDataDirectorySuffix(M);
                }
            } catch (IllegalStateException unused) {
                str = "setDataDirectorySuffix already initialized";
                n7.i("SystemUtil", str);
            } catch (Exception unused2) {
                str = "setDataDirectorySuffix Exception";
                n7.i("SystemUtil", str);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean R(android.content.Context r4) {
        /*
            ka.l r0 = ka.Cif.a(r4)
            boolean r0 = r0.d()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L1a
            boolean r0 = k(r4)
            if (r0 == 0) goto L18
            boolean r4 = l(r4)
            if (r4 == 0) goto L19
        L18:
            r1 = r2
        L19:
            return r1
        L1a:
            boolean r0 = k(r4)
            if (r0 == 0) goto L6b
            boolean r0 = l(r4)
            if (r0 != 0) goto L6b
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L54
            java.lang.String r3 = "android.intent.action.MAIN"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L54
            java.lang.String r3 = "android.intent.category.HOME"
            android.content.Intent r0 = r0.addCategory(r3)     // Catch: java.lang.Throwable -> L54
            java.lang.String r3 = "android.intent.category.DEFAULT"
            android.content.Intent r0 = r0.addCategory(r3)     // Catch: java.lang.Throwable -> L54
            java.lang.String r3 = "com.google.android.setupwizard"
            android.content.Intent r0 = r0.setPackage(r3)     // Catch: java.lang.Throwable -> L54
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L54
            if (r4 != 0) goto L46
            goto L68
        L46:
            java.util.List r4 = r4.queryIntentActivities(r0, r1)     // Catch: java.lang.Throwable -> L54
            if (r4 == 0) goto L68
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L54
            if (r4 <= 0) goto L68
            r4 = r2
            goto L69
        L54:
            r4 = move-exception
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getSimpleName()
            java.lang.String r0 = "isSetupWizardEnabled "
            java.lang.String r4 = r0.concat(r4)
            java.lang.String r0 = "SystemUtil"
            ka.n7.i(r0, r4)
        L68:
            r4 = r1
        L69:
            if (r4 == 0) goto L6c
        L6b:
            r1 = r2
        L6c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.utils.z1.R(android.content.Context):boolean");
    }

    public static boolean S(Context context) {
        try {
            n7.c("SystemUtil", "checkPermissions context=%s permission=%s", context, "android.permission.INTERACT_ACROSS_USERS");
            if (!p1.a(context, "android.permission.INTERACT_ACROSS_USERS")) {
                n7.b("SystemUtil", "no get user id permission");
                return false;
            }
            int f = f(context);
            int L = L();
            n7.f("SystemUtil", "userIdEx: %s, processUserId: %s", Integer.valueOf(f), Integer.valueOf(L));
            if (-999 == f) {
                f = L;
            }
            if (-999 == f || f == 0) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            n7.g("SystemUtil", "get is sub user exception.");
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean T(android.content.Context r3) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            r2 = 1
            if (r0 <= r1) goto L20
            if (r3 != 0) goto Lb
        L9:
            r0 = r2
            goto L1c
        Lb:
            java.lang.String r0 = "uimode"
            java.lang.Object r0 = r3.getSystemService(r0)
            boolean r1 = r0 instanceof android.app.UiModeManager
            if (r1 != 0) goto L16
            goto L9
        L16:
            android.app.UiModeManager r0 = (android.app.UiModeManager) r0
            int r0 = r0.getNightMode()
        L1c:
            r1 = 2
            if (r0 != r1) goto L20
            return r2
        L20:
            boolean r3 = U(r3)
            if (r3 == 0) goto L27
            return r2
        L27:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.utils.z1.T(android.content.Context):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0089 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean U(android.content.Context r7) {
        /*
            r0 = 0
            if (r7 == 0) goto L8a
            java.lang.String r1 = "SystemUtil"
            java.lang.String r2 = "#"
            r3 = 1
            if (r7 == 0) goto L80
            android.content.res.Resources r7 = r7.getResources()     // Catch: java.lang.Exception -> L6e
            r4 = 2131099906(0x7f060102, float:1.7812178E38)
            int r7 = r7.getColor(r4)     // Catch: java.lang.Exception -> L6e
            java.lang.StringBuffer r4 = new java.lang.StringBuffer     // Catch: java.lang.Exception -> L6e
            r4.<init>(r2)     // Catch: java.lang.Exception -> L6e
            int r2 = android.graphics.Color.alpha(r7)     // Catch: java.lang.Exception -> L6e
            java.lang.String r2 = java.lang.Integer.toHexString(r2)     // Catch: java.lang.Exception -> L6e
            int r5 = android.graphics.Color.red(r7)     // Catch: java.lang.Exception -> L6e
            java.lang.String r5 = java.lang.Integer.toHexString(r5)     // Catch: java.lang.Exception -> L6e
            int r6 = android.graphics.Color.green(r7)     // Catch: java.lang.Exception -> L6e
            java.lang.String r6 = java.lang.Integer.toHexString(r6)     // Catch: java.lang.Exception -> L6e
            int r7 = android.graphics.Color.blue(r7)     // Catch: java.lang.Exception -> L6e
            java.lang.String r7 = java.lang.Integer.toHexString(r7)     // Catch: java.lang.Exception -> L6e
            java.lang.String r2 = F(r2)     // Catch: java.lang.Exception -> L6e
            java.lang.String r5 = F(r5)     // Catch: java.lang.Exception -> L6e
            java.lang.String r6 = F(r6)     // Catch: java.lang.Exception -> L6e
            java.lang.String r7 = F(r7)     // Catch: java.lang.Exception -> L6e
            r4.append(r2)     // Catch: java.lang.Exception -> L6e
            r4.append(r5)     // Catch: java.lang.Exception -> L6e
            r4.append(r6)     // Catch: java.lang.Exception -> L6e
            r4.append(r7)     // Catch: java.lang.Exception -> L6e
            java.lang.String r7 = " color=%s"
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L6e
            java.lang.String r5 = r4.toString()     // Catch: java.lang.Exception -> L6e
            r2[r0] = r5     // Catch: java.lang.Exception -> L6e
            ka.n7.c(r1, r7, r2)     // Catch: java.lang.Exception -> L6e
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Exception -> L6e
            java.util.Locale r2 = java.util.Locale.ENGLISH     // Catch: java.lang.Exception -> L6e
            java.lang.String r7 = r7.toUpperCase(r2)     // Catch: java.lang.Exception -> L6e
            goto L81
        L6e:
            r7 = move-exception
            java.lang.Class r7 = r7.getClass()
            java.lang.String r7 = r7.getName()
            java.lang.String r2 = "catch theme color exception:"
            java.lang.String r7 = r2.concat(r7)
            ka.n7.e(r1, r7)
        L80:
            r7 = 0
        L81:
            java.lang.String r1 = "#FF3F97E9"
            boolean r7 = r1.equalsIgnoreCase(r7)
            if (r7 == 0) goto L8a
            return r3
        L8a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.utils.z1.U(android.content.Context):boolean");
    }

    public static int V(Context context) {
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
        n7.i("SystemUtil", "Failed to get display orientation info.");
        if (context.getResources().getConfiguration().orientation != 2) {
            return 1;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if (r1.equalsIgnoreCase("CN") != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r4) {
        /*
            java.lang.String r0 = "UNKNOWN"
            if (r4 != 0) goto L5
            return r0
        L5:
            com.huawei.openalliance.ad.ppskit.beans.inner.CountryCodeBean r1 = new com.huawei.openalliance.ad.ppskit.beans.inner.CountryCodeBean
            r1.<init>(r4)
            java.lang.String r1 = r1.a()
            com.huawei.openalliance.ad.ppskit.utils.h r2 = com.huawei.openalliance.ad.ppskit.utils.h.a(r4)
            boolean r2 = r2.c()
            if (r2 == 0) goto L2d
            ka.l r2 = ka.Cif.a(r4)
            boolean r2 = r2.d()
            java.lang.String r3 = "CN"
            if (r2 == 0) goto L26
            r0 = r3
            goto L2e
        L26:
            boolean r2 = r1.equalsIgnoreCase(r3)
            if (r2 == 0) goto L2d
            goto L2e
        L2d:
            r0 = r1
        L2e:
            com.huawei.openalliance.ad.ppskit.utils.q1 r4 = com.huawei.openalliance.ad.ppskit.utils.q1.m(r4)
            r4.R(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.utils.z1.a(android.content.Context):java.lang.String");
    }

    public static String b(Context context) {
        if (context == null) {
            return "UNKNOWN";
        }
        String a10 = a(context);
        String[] w10 = w(context, context.getContentResolver());
        if (e.a(a10, w10, 0, e.f22834a)) {
            return "CN";
        }
        if (e.a(a10, w10, 1, e.f22835b)) {
            return com.anythink.expressad.video.dynview.a.a.ae;
        }
        if (e.a(a10, w10, 2, e.f22836c)) {
            return "EU";
        }
        if (e.a(a10, w10, 3, e.f22837d)) {
            return "RU";
        }
        n7.h("SystemUtil", "getSiteCode error, countryCode %s not belong to any site.", a10);
        return "UNKNOWN";
    }

    public static String c(Context context) {
        String str;
        q1 m10 = q1.m(context);
        m10.getClass();
        byte[] bArr = q1.f22963j;
        synchronized (bArr) {
            m10.D();
            q1.d dVar = m10.f22967c;
            if (dVar == null) {
                str = null;
            } else {
                str = dVar.maker;
            }
        }
        if (TextUtils.isEmpty(str)) {
            String o = o("ro.product.manufacturer");
            if (TextUtils.isEmpty(o)) {
                o = Build.MANUFACTURER;
            }
            str = o.toUpperCase(Locale.ENGLISH);
            synchronized (bArr) {
                m10.D();
                q1.d dVar2 = m10.f22967c;
                if (dVar2 != null) {
                    dVar2.maker = str;
                    m10.p(dVar2);
                }
            }
        }
        return str;
    }

    public static String d(Context context) {
        String str;
        q1 m10 = q1.m(context);
        m10.getClass();
        byte[] bArr = q1.f22963j;
        synchronized (bArr) {
            m10.D();
            q1.d dVar = m10.f22967c;
            if (dVar == null) {
                str = null;
            } else {
                str = dVar.brand;
            }
        }
        if (TextUtils.isEmpty(str)) {
            String o = o("ro.product.brand");
            if (TextUtils.isEmpty(o)) {
                o = Build.BOARD;
            }
            str = o.toUpperCase(Locale.ENGLISH);
            synchronized (bArr) {
                m10.D();
                q1.d dVar2 = m10.f22967c;
                if (dVar2 != null) {
                    dVar2.brand = str;
                    m10.p(dVar2);
                }
            }
        }
        return str;
    }

    public static String e(Context context) {
        String str;
        q1 m10 = q1.m(context);
        m10.getClass();
        byte[] bArr = q1.f22963j;
        synchronized (bArr) {
            m10.D();
            q1.d dVar = m10.f22967c;
            if (dVar == null) {
                str = null;
            } else {
                str = dVar.model;
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = o("ro.product.model");
            if (TextUtils.isEmpty(str)) {
                str = Build.MODEL;
            }
            if (str != null) {
                str = str.toUpperCase(Locale.ENGLISH);
            }
            synchronized (bArr) {
                m10.D();
                q1.d dVar2 = m10.f22967c;
                if (dVar2 != null) {
                    dVar2.model = str;
                    m10.p(dVar2);
                }
            }
        }
        return str;
    }

    public static int f(Context context) {
        try {
            return a0.a.L(context).i();
        } catch (Throwable th) {
            n7.h("SystemUtil", "getCurUsedUserId %s", th.getClass().getSimpleName());
            return com.anythink.expressad.video.bt.a.c.f11213a;
        }
    }

    public static boolean g(Context context) {
        int i10;
        n7.c("SystemUtil", "checkPermissions context=%s permission=%s", context, "android.permission.INTERACT_ACROSS_USERS");
        if (p1.a(context, "android.permission.INTERACT_ACROSS_USERS")) {
            i10 = f(context);
        } else {
            n7.b("SystemUtil", "no get user id permission");
            i10 = 0;
        }
        int L = L();
        if (i10 != -999 && L != -999 && i10 != L) {
            return false;
        }
        return true;
    }

    public static boolean h(Context context) {
        if (androidx.transition.n.U("com.huawei.featurelayer.sharedfeature.xrkit.sdk.remoteloader.XrKitFeatureFactory") && XrKitFeatureFactory.isXrKitExist(context)) {
            return true;
        }
        return false;
    }

    public static String i(Context context) {
        String lowerCase = context.getResources().getConfiguration().locale.getCountry().toLowerCase(Locale.getDefault());
        n7.e("SystemUtil", " countryStr:" + lowerCase);
        return lowerCase;
    }

    public static String j(Context context) {
        String lowerCase = context.getResources().getConfiguration().locale.getLanguage().toLowerCase(Locale.getDefault());
        n7.e("SystemUtil", " languageStr:" + lowerCase);
        return lowerCase;
    }

    public static boolean k(Context context) {
        String str;
        boolean z10 = true;
        try {
            if (Settings.Global.getInt(context.getContentResolver(), "device_provisioned", 0) != 1) {
                z10 = false;
            }
            n7.e("SystemUtil", "isDeviceProvisioned: " + z10);
        } catch (RuntimeException unused) {
            str = "isDeviceProvisioned RuntimeException";
            n7.i("SystemUtil", str);
            return z10;
        } catch (Exception unused2) {
            str = "isDeviceProvisioned Exception";
            n7.i("SystemUtil", str);
            return z10;
        }
        return z10;
    }

    public static boolean l(Context context) {
        List<ResolveInfo> queryIntentActivities;
        try {
            Intent intent = new Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME").addCategory("android.intent.category.DEFAULT").setPackage("com.huawei.hwstartupguide");
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (queryIntentActivities = packageManager.queryIntentActivities(intent, 0)) == null) {
                return false;
            }
            if (queryIntentActivities.size() <= 0) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            n7.i("SystemUtil", "isOOBEActivityEnabled ".concat(th.getClass().getSimpleName()));
            return false;
        }
    }

    public static int m(int i10, boolean z10) {
        int n10;
        int n11;
        if (i10 > 2) {
            n10 = R.drawable.hiad_template_sound_off;
        } else {
            n10 = n(false, z10);
        }
        if (i10 > 2) {
            n11 = R.drawable.hiad_template_sound;
        } else {
            n11 = n(false, z10);
        }
        if (!z10) {
            return n11;
        }
        return n10;
    }

    public static int n(boolean z10, boolean z11) {
        int i10;
        int i11;
        if (z10) {
            i10 = R.drawable.hiad_linked_voice_off;
        } else {
            i10 = R.drawable.hiad_video_mute;
        }
        if (z10) {
            i11 = R.drawable.hiad_linked_voice_on;
        } else {
            i11 = R.drawable.hiad_video_unmute;
        }
        if (!z11) {
            return i11;
        }
        return i10;
    }

    public static String o(String str) {
        String simpleName;
        String str2;
        String str3;
        Class<?> cls;
        try {
            if (Build.VERSION.SDK_INT >= 27) {
                try {
                    if (i2.o()) {
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
            n7.g("SystemUtil", str2.concat(simpleName));
            return null;
        } catch (Throwable th) {
            simpleName = th.getClass().getSimpleName();
            str2 = "getSystemProperties Exception:";
            n7.g("SystemUtil", str2.concat(simpleName));
            return null;
        }
    }

    public static void p(Activity activity) {
        if (activity == null) {
            return;
        }
        if (!m.y() && !Cif.g(activity.getApplicationContext())) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, d0.a(activity));
            layoutParams.addRule(10, -1);
            RelativeLayout relativeLayout = new RelativeLayout(activity);
            relativeLayout.setBackgroundColor(activity.getResources().getColor(R.color.hiad_emui_color_subbg));
            ((ViewGroup) activity.getWindow().getDecorView()).addView(relativeLayout, layoutParams);
            return;
        }
        activity.getWindow().addFlags(67108864);
    }

    public static void q(Activity activity, int i10) {
        if (activity == null) {
            return;
        }
        try {
            activity.setRequestedOrientation(i10);
        } catch (Throwable th) {
            e0.i.p(th, "set Requested Orientation Exception: ", "SystemUtil");
        }
    }

    public static void r(Context context, Intent intent) {
        if (context != null && intent != null) {
            try {
                intent.setClipData(oa.a.f33785b);
                context.startActivity(intent);
            } catch (Throwable unused) {
                n7.g("SystemUtil", "start activity error");
            }
        }
    }

    public static void s(View view, Activity activity) {
        String concat;
        String str;
        if (activity == null) {
            str = "has no activity";
        } else if (!Cif.c(activity)) {
            str = "not huawei phone";
        } else if (view == null) {
            str = "has no rootview";
        } else {
            Window window = activity.getWindow();
            if (window == null) {
                str = "has no window";
            } else {
                try {
                    ka.n L = a0.a.L(activity);
                    L.b(window.getAttributes());
                    window.getDecorView().setOnApplyWindowInsetsListener(new a(L, view));
                    return;
                } catch (NoSuchMethodError unused) {
                    concat = "adaptRingScreen NoSuchMethodError setDisplaySideMode";
                    n7.g("SystemUtil", concat);
                    return;
                } catch (Throwable th) {
                    concat = "adaptRingScreen error:".concat(th.getClass().getSimpleName());
                    n7.g("SystemUtil", concat);
                    return;
                }
            }
        }
        n7.g("SystemUtil", str);
    }

    public static void t(ImageView imageView) {
        float f;
        if (imageView == null) {
            return;
        }
        if (D()) {
            f = -1.0f;
        } else {
            f = 1.0f;
        }
        imageView.setScaleX(f);
    }

    public static boolean u() {
        String o = o(CountryCodeBean.LOCALE_REGION_COUNTRYSYSTEMPROP);
        if (!TextUtils.isEmpty(o)) {
            return "cn".equalsIgnoreCase(o);
        }
        String o6 = o(CountryCodeBean.LOCALE_COUNTRYSYSTEMPROP);
        if (!TextUtils.isEmpty(o6)) {
            return o6.toLowerCase(Locale.ENGLISH).contains("cn");
        }
        String x10 = x();
        if (!TextUtils.isEmpty(x10)) {
            return "cn".equalsIgnoreCase(x10);
        }
        return false;
    }

    public static int[] v(View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005f, code lost:
    
        if (r10 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0081, code lost:
    
        if (r10 == null) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String[] w(android.content.Context r10, android.content.ContentResolver r11) {
        /*
            java.lang.String r0 = "SystemUtil"
            java.lang.String r1 = "getSiteCountryRel "
            r2 = 0
            if (r10 == 0) goto L8d
            if (r11 != 0) goto Lb
            goto L8d
        Lb:
            java.lang.String r3 = "/site_country_relation"
            android.net.Uri r5 = I(r10, r3)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67 java.lang.IllegalArgumentException -> L7b
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r4 = r11
            android.database.Cursor r10 = r4.query(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67 java.lang.IllegalArgumentException -> L7b
            if (r10 == 0) goto L5f
            boolean r11 = r10.moveToFirst()     // Catch: java.lang.Exception -> L5d java.lang.IllegalArgumentException -> L7c java.lang.Throwable -> L85
            if (r11 == 0) goto L5f
            java.lang.String r11 = "dr1"
            int r11 = r10.getColumnIndexOrThrow(r11)     // Catch: java.lang.Exception -> L5d java.lang.IllegalArgumentException -> L7c java.lang.Throwable -> L85
            java.lang.String r3 = "dr2"
            int r3 = r10.getColumnIndexOrThrow(r3)     // Catch: java.lang.Exception -> L5d java.lang.IllegalArgumentException -> L7c java.lang.Throwable -> L85
            java.lang.String r4 = "dr3"
            int r4 = r10.getColumnIndexOrThrow(r4)     // Catch: java.lang.Exception -> L5d java.lang.IllegalArgumentException -> L7c java.lang.Throwable -> L85
            java.lang.String r5 = "dr4"
            int r5 = r10.getColumnIndexOrThrow(r5)     // Catch: java.lang.Exception -> L5d java.lang.IllegalArgumentException -> L7c java.lang.Throwable -> L85
            r6 = 4
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch: java.lang.Exception -> L5d java.lang.IllegalArgumentException -> L7c java.lang.Throwable -> L85
            java.lang.String r11 = r10.getString(r11)     // Catch: java.lang.Exception -> L5d java.lang.IllegalArgumentException -> L7c java.lang.Throwable -> L85
            r7 = 0
            r6[r7] = r11     // Catch: java.lang.Exception -> L5d java.lang.IllegalArgumentException -> L7c java.lang.Throwable -> L85
            java.lang.String r11 = r10.getString(r3)     // Catch: java.lang.Exception -> L5d java.lang.IllegalArgumentException -> L7c java.lang.Throwable -> L85
            r3 = 1
            r6[r3] = r11     // Catch: java.lang.Exception -> L5d java.lang.IllegalArgumentException -> L7c java.lang.Throwable -> L85
            java.lang.String r11 = r10.getString(r4)     // Catch: java.lang.Exception -> L5d java.lang.IllegalArgumentException -> L7c java.lang.Throwable -> L85
            r3 = 2
            r6[r3] = r11     // Catch: java.lang.Exception -> L5d java.lang.IllegalArgumentException -> L7c java.lang.Throwable -> L85
            java.lang.String r11 = r10.getString(r5)     // Catch: java.lang.Exception -> L5d java.lang.IllegalArgumentException -> L7c java.lang.Throwable -> L85
            r3 = 3
            r6[r3] = r11     // Catch: java.lang.Exception -> L5d java.lang.IllegalArgumentException -> L7c java.lang.Throwable -> L85
            r10.close()
            return r6
        L5d:
            r11 = move-exception
            goto L69
        L5f:
            if (r10 == 0) goto L84
        L61:
            r10.close()
            goto L84
        L65:
            r11 = move-exception
            goto L87
        L67:
            r11 = move-exception
            r10 = r2
        L69:
            java.lang.Class r11 = r11.getClass()     // Catch: java.lang.Throwable -> L85
            java.lang.String r11 = r11.getSimpleName()     // Catch: java.lang.Throwable -> L85
            java.lang.String r11 = r1.concat(r11)     // Catch: java.lang.Throwable -> L85
            ka.n7.g(r0, r11)     // Catch: java.lang.Throwable -> L85
            if (r10 == 0) goto L84
            goto L61
        L7b:
            r10 = r2
        L7c:
            java.lang.String r11 = "getSiteCountryRel IllegalArgumentException"
            ka.n7.g(r0, r11)     // Catch: java.lang.Throwable -> L85
            if (r10 == 0) goto L84
            goto L61
        L84:
            return r2
        L85:
            r11 = move-exception
            r2 = r10
        L87:
            if (r2 == 0) goto L8c
            r2.close()
        L8c:
            throw r11
        L8d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.utils.z1.w(android.content.Context, android.content.ContentResolver):java.lang.String[]");
    }

    public static String x() {
        Locale locale = Locale.getDefault();
        if (locale != null) {
            return locale.getCountry();
        }
        return "";
    }

    public static String y(int i10) {
        String line1NumberFromImpu;
        try {
            if (i2.o()) {
                line1NumberFromImpu = HwTelephonyManager.getDefault().getLine1NumberFromImpu(i10);
            } else {
                line1NumberFromImpu = android.telephony.HwTelephonyManager.getDefault().getLine1NumberFromImpu(i10);
            }
            if (y1.h(line1NumberFromImpu)) {
                n7.e("SystemUtil", "get hpn err,id = " + i10);
            }
            return line1NumberFromImpu;
        } catch (Throwable th) {
            e0.i.p(th, "get hpn err: ", "SystemUtil");
            return "";
        }
    }

    public static String z(Activity activity) {
        Object s10;
        n7.e("SystemUtil", "begin getCallerAppPackageName:");
        try {
            Class[] clsArr = {IBinder.class};
            Object[] objArr = {androidx.transition.n.s(activity, "getActivityToken", null, null, true)};
            if (Build.VERSION.SDK_INT >= 28) {
                Class<?> cls = Class.forName("android.app.ActivityManager");
                s10 = androidx.transition.n.s(cls.getMethod("getService", new Class[0]).invoke(cls, new Object[0]), "getLaunchedFromUid", clsArr, objArr, true);
            } else {
                Class<?> cls2 = Class.forName("android.app.ActivityManagerNative");
                s10 = androidx.transition.n.s(cls2.getMethod("getDefault", new Class[0]).invoke(cls2, new Object[0]), "getLaunchedFromUid", clsArr, objArr, true);
            }
            int intValue = ((Integer) s10).intValue();
            n7.c("SystemUtil", "callingUid is : %s", Integer.valueOf(intValue));
            String[] packagesForUid = activity.getPackageManager().getPackagesForUid(intValue);
            if (packagesForUid != null && packagesForUid.length > 0) {
                String str = packagesForUid[0];
                n7.c("SystemUtil", "packageName is : %s", str);
                return str;
            }
            n7.g("SystemUtil", "cannot getPackageName");
            return null;
        } catch (Throwable th) {
            e0.i.p(th, "getPackageName error : ", "SystemUtil");
            return null;
        }
    }
}
