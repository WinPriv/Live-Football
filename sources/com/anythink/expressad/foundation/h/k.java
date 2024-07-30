package com.anythink.expressad.foundation.h;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.util.Arrays;
import java.util.HashMap;
import java.util.UUID;
import org.json.JSONObject;

@SuppressLint({"NewApi"})
/* loaded from: classes.dex */
public final class k extends d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10136a = "SameDiTool";

    /* renamed from: b, reason: collision with root package name */
    private static String f10137b = null;

    /* renamed from: c, reason: collision with root package name */
    private static String f10138c = null;

    /* renamed from: d, reason: collision with root package name */
    private static int f10139d = -1;

    /* renamed from: e, reason: collision with root package name */
    private static int f10140e = -1;
    private static int f = -1;

    /* renamed from: g, reason: collision with root package name */
    private static String f10141g = "";

    /* renamed from: h, reason: collision with root package name */
    private static String f10142h = "";

    /* renamed from: i, reason: collision with root package name */
    private static String f10143i = "";

    /* renamed from: j, reason: collision with root package name */
    private static String f10144j = "";

    /* renamed from: k, reason: collision with root package name */
    private static int f10145k = 0;

    /* renamed from: l, reason: collision with root package name */
    private static String f10146l = "";

    /* renamed from: m, reason: collision with root package name */
    private static String f10147m = "";

    /* renamed from: n, reason: collision with root package name */
    private static int f10148n = -1;
    private static String o = "";

    /* renamed from: p, reason: collision with root package name */
    private static int f10149p = 0;

    /* renamed from: q, reason: collision with root package name */
    private static String f10150q = "";

    /* renamed from: com.anythink.expressad.foundation.h.k$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f10152a;

        public AnonymousClass2(Context context) {
            this.f10152a = context;
        }

        @Override // java.lang.Runnable
        @SuppressLint({"MissingPermission"})
        public final void run() {
            Context context;
            ConnectivityManager connectivityManager;
            try {
                if (com.anythink.core.common.b.n.a().c("network_type")) {
                    return;
                }
                try {
                    if (!com.anythink.core.common.b.p.a(com.anythink.core.common.b.n.a().g()).b() || (context = this.f10152a) == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
                        return;
                    }
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo == null) {
                        int unused = k.f = 0;
                        return;
                    }
                    if (activeNetworkInfo.getType() == 1) {
                        int unused2 = k.f = 9;
                        return;
                    }
                    TelephonyManager telephonyManager = (TelephonyManager) this.f10152a.getSystemService("phone");
                    if (telephonyManager == null) {
                        int unused3 = k.f = 0;
                    } else {
                        int unused4 = k.f = k.a(telephonyManager.getNetworkType());
                    }
                } catch (Exception unused5) {
                }
            } catch (Throwable th) {
                o.b(k.f10136a, th.getMessage(), th);
                int unused6 = k.f = 0;
            }
        }
    }

    private k() {
    }

    public static int a(int i10) {
        if (i10 == 20) {
            return 5;
        }
        switch (i10) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return 2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return 3;
            case 13:
                return 4;
            default:
                return 0;
        }
    }

    public static int c(Context context) {
        if (context == null) {
            return f10145k;
        }
        int i10 = f10145k;
        if (i10 != 0) {
            return i10;
        }
        try {
            int i11 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            f10145k = i11;
            return i11;
        } catch (Exception e10) {
            e10.printStackTrace();
            return -1;
        }
    }

    public static String d(Context context) {
        if (context == null) {
            return f10144j;
        }
        try {
            if (TextUtils.isEmpty(f10144j)) {
                String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                f10144j = str;
                return str;
            }
            return f10144j;
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static int e(Context context) {
        if (com.anythink.core.common.b.n.a().c("screen")) {
            return 0;
        }
        try {
            if (!com.anythink.core.common.b.p.a(com.anythink.core.common.b.n.a().g()).b() || context == null) {
                return 0;
            }
            try {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                HashMap g6 = g(context);
                return g6.get(ContentRecord.WIDTH) == null ? displayMetrics.widthPixels : ((Integer) g6.get(ContentRecord.WIDTH)).intValue();
            } catch (Exception e10) {
                e10.printStackTrace();
                return 0;
            }
        } catch (Exception unused) {
        }
    }

    public static int f(Context context) {
        if (com.anythink.core.common.b.n.a().c("screen")) {
            return 0;
        }
        try {
            if (!com.anythink.core.common.b.p.a(com.anythink.core.common.b.n.a().g()).b() || context == null) {
                return 0;
            }
            try {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                HashMap g6 = g(context);
                return g6.get(ContentRecord.HEIGHT) == null ? displayMetrics.heightPixels : ((Integer) g6.get(ContentRecord.HEIGHT)).intValue();
            } catch (Exception e10) {
                e10.printStackTrace();
                return 0;
            }
        } catch (Exception unused) {
        }
    }

    public static HashMap g(Context context) {
        HashMap hashMap = new HashMap();
        if (context == null) {
            return hashMap;
        }
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            hashMap.put(ContentRecord.HEIGHT, Integer.valueOf(displayMetrics.heightPixels));
            hashMap.put(ContentRecord.WIDTH, Integer.valueOf(displayMetrics.widthPixels));
        } catch (Exception e10) {
            o.b(f10136a, e10.getMessage(), e10);
        }
        return hashMap;
    }

    public static String h(Context context) {
        if (context == null) {
            return f10143i;
        }
        try {
            if (TextUtils.isEmpty(f10143i)) {
                String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
                f10143i = str;
                return str;
            }
            return f10143i;
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static int i() {
        return 0;
    }

    private static void j(Context context) {
        try {
            h(context);
            d(context);
            c(context);
            b(context);
            com.anythink.expressad.foundation.g.a.bX = t.a("android.permission.WRITE_EXTERNAL_STORAGE", context);
            com.anythink.expressad.foundation.g.a.bW = t.a("android.permission.ACCESS_NETWORK_STATE", context);
            k(context);
        } catch (Throwable unused) {
        }
    }

    private static int k(Context context) {
        if (context == null) {
            return f10149p;
        }
        if (f10149p == 0) {
            try {
                f10149p = context.getApplicationInfo().targetSdkVersion;
            } catch (Exception e10) {
                o.d(f10136a, e10.getMessage());
            }
        }
        return f10149p;
    }

    private static void l(Context context) {
        try {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(context);
            if (com.anythink.expressad.foundation.g.h.a.b().getActiveCount() <= 0) {
                com.anythink.expressad.foundation.g.h.a.b().execute(anonymousClass2);
            }
        } catch (Throwable th) {
            o.d(f10136a, th.getMessage());
        }
    }

    private static boolean m(Context context) {
        DisplayMetrics displayMetrics;
        if (context == null) {
            return false;
        }
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
        } catch (Exception e10) {
            o.b(f10136a, e10.getMessage(), e10);
        }
        return Math.sqrt(Math.pow((double) (((float) displayMetrics.widthPixels) / displayMetrics.xdpi), 2.0d) + Math.pow((double) (((float) displayMetrics.heightPixels) / displayMetrics.ydpi), 2.0d)) >= 6.0d;
    }

    private static String n() {
        if (!com.anythink.core.common.b.p.a(com.anythink.core.common.b.n.a().g()).b()) {
            return "";
        }
        return Arrays.asList(Build.SUPPORTED_ABIS).toString();
    }

    private static String o() {
        if (!com.anythink.core.common.b.p.a(com.anythink.core.common.b.n.a().g()).b()) {
            return "";
        }
        return Build.CPU_ABI;
    }

    private static String p() {
        if (!com.anythink.core.common.b.p.a(com.anythink.core.common.b.n.a().g()).b()) {
            return "";
        }
        return Build.CPU_ABI2;
    }

    @SuppressLint({"MissingPermission"})
    public static int a() {
        Context g6;
        try {
            g6 = com.anythink.core.common.b.n.a().g();
        } catch (Throwable th) {
            o.b(f10136a, th.getMessage(), th);
            f = 0;
            return 0;
        }
        if (com.anythink.core.common.b.n.a().c("network_type")) {
            return f;
        }
        try {
            if (!com.anythink.core.common.b.p.a(com.anythink.core.common.b.n.a().g()).b()) {
                return f;
            }
            if (g6 == null) {
                return f;
            }
            if (f != -1) {
                try {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(g6);
                    if (com.anythink.expressad.foundation.g.h.a.b().getActiveCount() <= 0) {
                        com.anythink.expressad.foundation.g.h.a.b().execute(anonymousClass2);
                    }
                } catch (Throwable th2) {
                    o.d(f10136a, th2.getMessage());
                }
                return f;
            }
            f = 0;
            return 0;
        } catch (Exception unused) {
            return f;
        }
        o.b(f10136a, th.getMessage(), th);
        f = 0;
        return 0;
    }

    public static int b(Context context) {
        Configuration configuration;
        return (context == null || context.getResources() == null || (configuration = context.getResources().getConfiguration()) == null || configuration.orientation != 2) ? 1 : 2;
    }

    public static void i(final Context context) {
        if (context == null) {
            return;
        }
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                d.a(context);
            } else {
                com.anythink.core.common.b.n.a().a(new Runnable() { // from class: com.anythink.expressad.foundation.h.k.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.a(context);
                    }
                });
            }
        } catch (Throwable th) {
            o.b(f10136a, "", th);
        }
    }

    public static String b() {
        if (com.anythink.core.common.b.n.a().c("model")) {
            return "";
        }
        try {
            if (!com.anythink.core.common.b.p.a(com.anythink.core.common.b.n.a().g()).b()) {
                return "";
            }
            return Build.MANUFACTURER + " " + Build.MODEL;
        } catch (Exception unused) {
            return "";
        }
    }

    private static long l() {
        Context g6 = com.anythink.core.common.b.n.a().g();
        if (g6 == null) {
            return 0L;
        }
        ActivityManager activityManager = (ActivityManager) g6.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    private static int k() {
        return f10148n;
    }

    public static String c() {
        if (com.anythink.core.common.b.n.a().c("os_vc")) {
            return "";
        }
        try {
            if (!com.anythink.core.common.b.p.a(com.anythink.core.common.b.n.a().g()).b()) {
                return "";
            }
            if (TextUtils.isEmpty(f10142h)) {
                f10142h = String.valueOf(d());
            }
            return f10142h;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String e() {
        Context g6;
        long currentTimeMillis;
        long l10;
        String str;
        String str2;
        String str3 = "";
        try {
            g6 = com.anythink.core.common.b.n.a().g();
            currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
            l10 = l();
            str = "app_tki_" + currentTimeMillis + "_" + l10;
            str2 = (String) v.b(g6, str, "");
            try {
            } catch (Exception e10) {
                e = e10;
                str3 = str2;
                e.printStackTrace();
                return str3;
            }
        } catch (Exception e11) {
            e = e11;
        }
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("1", "");
            jSONObject.put("2", String.valueOf(l10));
            jSONObject.put("3", String.valueOf(currentTimeMillis));
            jSONObject.put("4", "");
            jSONObject.put("5", "");
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        str3 = a.a(jSONObject.toString());
        v.a(g6, str, str3);
        return str3;
    }

    public static int f() {
        if (!com.anythink.core.common.b.p.a(com.anythink.core.common.b.n.a().g()).b()) {
            return 0;
        }
        if (f10139d <= 0) {
            try {
                Context g6 = com.anythink.core.common.b.n.a().g();
                long longValue = ((Long) v.b(g6, "TotalRamSize", 0L)).longValue();
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - longValue > 1800000 || f10139d == -1) {
                    f10139d = Long.valueOf((l() / 1000) / 1000).intValue();
                    v.a(g6, "TotalRamSize", Long.valueOf(currentTimeMillis));
                }
            } catch (Throwable th) {
                o.b(f10136a, th.getMessage(), th);
            }
        }
        return f10139d;
    }

    public static int d() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public static String h() {
        if (TextUtils.isEmpty(f10150q)) {
            f10150q = !com.anythink.core.common.b.p.a(com.anythink.core.common.b.n.a().g()).b() ? "" : Arrays.asList(Build.SUPPORTED_ABIS).toString();
        }
        return f10150q;
    }

    private static UUID j() {
        try {
            return UUID.randomUUID();
        } catch (Throwable th) {
            o.b(f10136a, th.getMessage(), th);
            return null;
        }
    }

    public static int g() {
        try {
        } catch (Throwable th) {
            o.b(f10136a, th.getMessage(), th);
        }
        if (!com.anythink.core.common.b.p.a(com.anythink.core.common.b.n.a().g()).b()) {
            return 0;
        }
        Context g6 = com.anythink.core.common.b.n.a().g();
        long j10 = 0;
        long longValue = ((Long) v.b(g6, "FreeRamSize", 0L)).longValue();
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - longValue > 1800000 || f10140e == -1) {
            Context g10 = com.anythink.core.common.b.n.a().g();
            if (g10 != null) {
                ActivityManager activityManager = (ActivityManager) g10.getSystemService("activity");
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                j10 = memoryInfo.availMem;
            }
            f10140e = Long.valueOf((j10 / 1000) / 1000).intValue();
            v.a(g6, "FreeRamSize", Long.valueOf(currentTimeMillis));
        }
        return f10140e;
    }

    private static long m() {
        Context g6 = com.anythink.core.common.b.n.a().g();
        if (g6 == null) {
            return 0L;
        }
        ActivityManager activityManager = (ActivityManager) g6.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public static String a(Context context, int i10) {
        TelephonyManager telephonyManager;
        if (i10 == 0 || i10 == 9) {
            return "";
        }
        try {
            return (!com.anythink.expressad.foundation.g.a.bW || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) ? "" : String.valueOf(telephonyManager.getNetworkType());
        } catch (Throwable th) {
            o.b(f10136a, th.getMessage(), th);
            return "";
        }
    }

    private static void a(String str) {
        f10138c = j.a(str);
        f10137b = str;
    }

    private static String a(String str, Context context) {
        try {
        } catch (Exception e10) {
            o.b(f10136a, e10.getMessage(), e10);
        }
        if (!TextUtils.isEmpty(o)) {
            return o;
        }
        if (!TextUtils.isEmpty(str) && context != null) {
            o = context.getPackageManager().getInstallerPackageName(str);
            o.a(f10136a, "PKGSource:" + o);
        }
        return o;
    }
}
