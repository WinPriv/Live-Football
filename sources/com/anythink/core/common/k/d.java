package com.anythink.core.common.k;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.webkit.WebSettings;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.IExHandler;
import com.anythink.core.common.b.g;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static String f6145a = null;

    /* renamed from: b, reason: collision with root package name */
    public static String f6146b = null;

    /* renamed from: c, reason: collision with root package name */
    public static String f6147c = null;

    /* renamed from: d, reason: collision with root package name */
    public static String f6148d = "";

    /* renamed from: e, reason: collision with root package name */
    static String f6149e = null;
    private static String f = null;

    /* renamed from: g, reason: collision with root package name */
    private static String f6150g = null;

    /* renamed from: h, reason: collision with root package name */
    private static String f6151h = null;

    /* renamed from: i, reason: collision with root package name */
    private static String f6152i = "";

    /* renamed from: j, reason: collision with root package name */
    private static String f6153j = "";

    /* renamed from: k, reason: collision with root package name */
    private static String f6154k = "";

    /* renamed from: l, reason: collision with root package name */
    private static String f6155l = "";

    /* renamed from: m, reason: collision with root package name */
    private static String f6156m = "";

    /* renamed from: n, reason: collision with root package name */
    private static int f6157n = 0;
    private static String o = "";

    /* renamed from: p, reason: collision with root package name */
    private static String f6158p = "";

    /* renamed from: q, reason: collision with root package name */
    private static String f6159q = null;

    /* renamed from: r, reason: collision with root package name */
    private static String f6160r = "";

    /* renamed from: s, reason: collision with root package name */
    private static String f6161s = "";

    /* renamed from: t, reason: collision with root package name */
    private static int f6162t = -1;

    /* renamed from: u, reason: collision with root package name */
    private static int f6163u = -1;

    /* renamed from: v, reason: collision with root package name */
    private static int f6164v = -1;

    /* renamed from: w, reason: collision with root package name */
    private static int f6165w = -1;

    private d() {
    }

    private static int a(int i10) {
        if (i10 == 20) {
            return 16;
        }
        switch (i10) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return 1;
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
                return 13;
            default:
                return -1;
        }
    }

    public static String b(Context context) {
        if (com.anythink.core.common.b.n.a().c("mcc")) {
            return "";
        }
        if (context == null) {
            com.anythink.core.common.b.n.a().g();
        }
        try {
            return !com.anythink.core.common.b.p.a(com.anythink.core.common.b.n.a().g()).b() ? "" : f6160r;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String c(Context context) {
        if (com.anythink.core.common.b.n.a().c("mnc")) {
            return "";
        }
        if (context == null) {
            com.anythink.core.common.b.n.a().g();
        }
        try {
            return !com.anythink.core.common.b.p.a(com.anythink.core.common.b.n.a().g()).b() ? "" : f6161s;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String d(Context context) {
        if (com.anythink.core.common.b.n.a().c("android_id")) {
            return "";
        }
        if (context == null) {
            context = com.anythink.core.common.b.n.a().g();
        }
        try {
            if (!com.anythink.core.common.b.p.a(com.anythink.core.common.b.n.a().g()).b()) {
                return "";
            }
            try {
                if (f6151h == null) {
                    String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                    f6151h = string;
                    if (string == null) {
                        f6151h = "";
                    }
                }
            } catch (Exception unused) {
                f6151h = "";
            }
            return f6151h;
        } catch (Exception unused2) {
            return "";
        }
    }

    public static String e(Context context) {
        if (context == null) {
            return "";
        }
        f6149e = null;
        try {
            if (TextUtils.isEmpty(null)) {
                String d10 = d(context);
                f6149e = d10;
                f6149e = f.b(d10);
            }
        } catch (Throwable unused) {
        }
        return f6149e;
    }

    public static String f(Context context) {
        if (com.anythink.core.common.b.n.a().c("language")) {
            return "";
        }
        if (context == null) {
            context = com.anythink.core.common.b.n.a().g();
        }
        try {
            if (!com.anythink.core.common.b.p.a(com.anythink.core.common.b.n.a().g()).b()) {
                return "";
            }
            if (TextUtils.isEmpty(o)) {
                String language = context.getResources().getConfiguration().locale.getLanguage();
                o = language;
                return language;
            }
            return o;
        } catch (Exception unused) {
            return "";
        }
    }

    public static int g(Context context) {
        if (com.anythink.core.common.b.n.a().c("orient")) {
            return 0;
        }
        if (context == null) {
            context = com.anythink.core.common.b.n.a().g();
        }
        return context.getResources().getConfiguration().orientation == 2 ? 2 : 1;
    }

    public static String h(Context context) {
        if (com.anythink.core.common.b.n.a().c("app_vc")) {
            return "";
        }
        if (context == null) {
            context = com.anythink.core.common.b.n.a().g();
        }
        if (f6157n == 0) {
            try {
                f6157n = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(f6157n);
                return sb2.toString();
            } catch (Exception e10) {
                e10.printStackTrace();
                return "";
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(f6157n);
        return sb3.toString();
    }

    public static String i(Context context) {
        if (com.anythink.core.common.b.n.a().c("app_vn")) {
            return "";
        }
        if (context == null) {
            context = com.anythink.core.common.b.n.a().g();
        }
        try {
            if (TextUtils.isEmpty(f6156m)) {
                String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                f6156m = str;
                return str;
            }
            return f6156m;
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static String j(Context context) {
        if (com.anythink.core.common.b.n.a().c("screen")) {
            return "";
        }
        if (context == null) {
            context = com.anythink.core.common.b.n.a().g();
        }
        try {
            if (!com.anythink.core.common.b.p.a(com.anythink.core.common.b.n.a().g()).b()) {
                return "";
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append((context == null ? com.anythink.core.common.b.n.a().g() : context).getResources().getDisplayMetrics().widthPixels);
            sb2.append("*");
            if (context == null) {
                context = com.anythink.core.common.b.n.a().g();
            }
            sb2.append(context.getResources().getDisplayMetrics().heightPixels);
            return sb2.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String k(Context context) {
        if (com.anythink.core.common.b.n.a().c("package_name")) {
            return "";
        }
        if (context == null) {
            context = com.anythink.core.common.b.n.a().g();
        }
        try {
            if (TextUtils.isEmpty(f6155l)) {
                String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
                f6155l = str;
                return str;
            }
            return f6155l;
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static String l(Context context) {
        if (com.anythink.core.common.b.n.a().c("it_src")) {
            return "";
        }
        if (context == null) {
            context = com.anythink.core.common.b.n.a().g();
        }
        try {
            if (TextUtils.isEmpty(f6146b)) {
                String installerPackageName = context.getPackageManager().getInstallerPackageName(k(context));
                f6146b = installerPackageName;
                return installerPackageName;
            }
            return f6146b;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String m(Context context) {
        NetworkInfo activeNetworkInfo;
        if (com.anythink.core.common.b.n.a().c("network_type")) {
            return "";
        }
        try {
            if (!com.anythink.core.common.b.p.a(com.anythink.core.common.b.n.a().g()).b()) {
                return "";
            }
            if (context == null) {
                return "-1";
            }
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager == null || !h.a("android.permission.ACCESS_NETWORK_STATE", context) || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                    return "-1";
                }
                int i10 = 1;
                if (activeNetworkInfo.getType() == 1) {
                    return "-2";
                }
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager == null) {
                    return "-1";
                }
                int networkType = telephonyManager.getNetworkType();
                StringBuilder sb2 = new StringBuilder();
                if (networkType != 20) {
                    switch (networkType) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                            break;
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                            i10 = 3;
                            break;
                        case 13:
                            i10 = 13;
                            break;
                        default:
                            i10 = -1;
                            break;
                    }
                } else {
                    i10 = 16;
                }
                sb2.append(i10);
                return sb2.toString();
            } catch (Exception e10) {
                e10.printStackTrace();
                return "-1";
            }
        } catch (Exception unused) {
            return "";
        }
    }

    private static int n() {
        return Build.VERSION.SDK_INT;
    }

    public static String o(Context context) {
        if (com.anythink.core.common.b.n.a().b() == null) {
            return "";
        }
        if (TextUtils.isEmpty(f6147c)) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            f6147c = String.valueOf(displayMetrics.density);
        }
        return f6147c;
    }

    public static void p(Context context) {
        if (com.anythink.core.common.b.n.a().c("ua")) {
            return;
        }
        try {
            if (!com.anythink.core.common.b.p.a(com.anythink.core.common.b.n.a().g()).b()) {
                return;
            }
            f6152i = p.b(context, com.anythink.core.common.b.g.o, com.anythink.core.common.b.g.f4999e, "");
            String b10 = p.b(context, com.anythink.core.common.b.g.o, com.anythink.core.common.b.g.f, "");
            if (!TextUtils.isEmpty(f6152i) && Build.VERSION.RELEASE.equals(b10)) {
                return;
            }
            if (Looper.myLooper() != Looper.getMainLooper()) {
                TextUtils.isEmpty(f6152i);
                return;
            }
            try {
                String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
                f6152i = defaultUserAgent;
                p.a(context, com.anythink.core.common.b.g.o, com.anythink.core.common.b.g.f4999e, defaultUserAgent);
                p.a(context, com.anythink.core.common.b.g.o, com.anythink.core.common.b.g.f, Build.VERSION.RELEASE);
            } catch (Throwable unused) {
            }
            TextUtils.isEmpty(f6152i);
        } catch (Exception unused2) {
        }
    }

    public static synchronized void q(Context context) {
        synchronized (d.class) {
            if (!TextUtils.isEmpty(com.anythink.core.common.b.n.a().x())) {
                return;
            }
            String str = "";
            IExHandler b10 = com.anythink.core.common.b.n.a().b();
            if (b10 != null) {
                str = b10.getUniqueId(context);
            }
            if (TextUtils.isEmpty(str)) {
                str = r(context);
            }
            if (TextUtils.isEmpty(str) || Pattern.matches("^[0-]+$", str)) {
                str = d(context);
            }
            if (TextUtils.isEmpty(str)) {
                str = UUID.randomUUID().toString();
            }
            com.anythink.core.common.b.n.a().k(f.a(str));
            com.anythink.core.common.j.c.a("", "3", "", String.valueOf(System.currentTimeMillis()));
        }
    }

    public static synchronized String r(final Context context) {
        synchronized (d.class) {
            if (com.anythink.core.common.b.n.a().c("gaid")) {
                return "";
            }
            final ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
            final String[] strArr = new String[1];
            newFixedThreadPool.submit(new Runnable() { // from class: com.anythink.core.common.k.d.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        try {
                            strArr[0] = (String) AdvertisingIdClient.Info.class.getMethod("getId", new Class[0]).invoke(AdvertisingIdClient.class.getMethod("getAdvertisingIdInfo", Context.class).invoke(null, context), new Object[0]);
                        } catch (Throwable unused) {
                            strArr[0] = new com.anythink.core.common.b.c().a(context).a();
                        }
                    } catch (Exception unused2) {
                    }
                    if (!TextUtils.isEmpty(strArr[0]) && !d.d(strArr[0])) {
                        d.a(strArr[0]);
                    }
                    try {
                        synchronized (newFixedThreadPool) {
                            newFixedThreadPool.notifyAll();
                        }
                    } catch (Throwable unused3) {
                    }
                }
            });
            try {
                synchronized (newFixedThreadPool) {
                    newFixedThreadPool.wait(2000L);
                }
                newFixedThreadPool.shutdown();
                String str = strArr[0];
                if (str != null) {
                    return str;
                }
                return "";
            } catch (Exception unused) {
                return "";
            }
        }
    }

    public static int s(Context context) {
        if (f6162t == -1) {
            f6162t = h.a(context, com.anythink.expressad.foundation.g.a.bC) ? 1 : 0;
        }
        return f6162t;
    }

    private static int t(Context context) {
        if (context == null) {
            context = com.anythink.core.common.b.n.a().g();
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    private static int u(Context context) {
        if (context == null) {
            context = com.anythink.core.common.b.n.a().g();
        }
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    private static int v(Context context) {
        NetworkInfo activeNetworkInfo;
        if (context == null) {
            return -1;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || !h.a("android.permission.ACCESS_NETWORK_STATE", context) || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return -1;
            }
            if (activeNetworkInfo.getType() == 1) {
                return -2;
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return -1;
            }
            return telephonyManager.getNetworkType();
        } catch (Exception e10) {
            e10.printStackTrace();
            return -1;
        }
    }

    private static void w(Context context) {
        f6145a = p.b(context, com.anythink.core.common.b.g.o, g.o.f5138e, "");
    }

    public static void a(Context context) {
        try {
            d();
            k(context);
            i(context);
            h(context);
            g(context);
            a();
            b();
            d(context);
            f();
            f(context);
            c();
            n(context);
            f6145a = p.b(context, com.anythink.core.common.b.g.o, g.o.f5138e, "");
            if (h.a("android.permission.READ_PHONE_STATE", context)) {
                String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
                if (!h.b(simOperator) || simOperator.length() <= 3) {
                    return;
                }
                f6160r = simOperator.substring(0, 3);
                f6161s = simOperator.substring(3, simOperator.length());
            }
        } catch (Exception unused) {
        }
    }

    public static String n(Context context) {
        String str = f6159q;
        if (str == null) {
            try {
                String str2 = context.getPackageManager().getPackageInfo("com.android.vending", 0).versionName;
                f6159q = str2;
                if (str2 == null) {
                    f6159q = "";
                }
                return f6159q;
            } catch (Exception unused) {
                f6159q = "";
                return "";
            }
        }
        if (str == null) {
            f6159q = "";
        }
        return f6159q;
    }

    public static String b() {
        if (com.anythink.core.common.b.n.a().c("brand")) {
            return "";
        }
        try {
            return !com.anythink.core.common.b.p.a(com.anythink.core.common.b.n.a().g()).b() ? "" : Build.BRAND;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String c() {
        if (com.anythink.core.common.b.n.a().c("timezone")) {
            return "";
        }
        try {
            if (!com.anythink.core.common.b.p.a(com.anythink.core.common.b.n.a().g()).b()) {
                return "";
            }
            try {
                if (TextUtils.isEmpty(f6158p)) {
                    String displayName = TimeZone.getDefault().getDisplayName(false, 0, Locale.ENGLISH);
                    f6158p = displayName;
                    return displayName;
                }
            } catch (Throwable unused) {
            }
            return f6158p;
        } catch (Exception unused2) {
            return "";
        }
    }

    public static String g() {
        if (com.anythink.core.common.b.n.a().b() == null) {
            return "";
        }
        try {
            return new BigDecimal((System.currentTimeMillis() - SystemClock.elapsedRealtime()) / 1000.0d).setScale(6, 4).toString();
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public static String e() {
        if (com.anythink.core.common.b.n.a().c("os_vn")) {
            return "";
        }
        if (TextUtils.isEmpty(f6153j)) {
            f6153j = Build.VERSION.RELEASE;
        }
        return f6153j;
    }

    public static String l() {
        Object obj;
        String d10 = com.anythink.core.common.b.n.a().d();
        if (!TextUtils.isEmpty(d10)) {
            return d10;
        }
        try {
            Map<String, Object> m10 = com.anythink.core.common.b.n.a().m();
            if (m10 == null || (obj = m10.get(ATAdConst.KEY.WECHAT_APPID)) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static int b(String str) {
        int i10 = f6165w;
        if (i10 != -1) {
            return i10;
        }
        f6165w = 0;
        try {
            f6165w = ((Integer) Class.forName("com.tencent.mm.opensdk.openapi.IWXAPI").getMethod("getWXAppSupportAPI", new Class[0]).invoke(c(str), new Object[0])).intValue();
        } catch (Throwable unused) {
        }
        return f6165w;
    }

    public static String f() {
        try {
            if (!com.anythink.core.common.b.p.a(com.anythink.core.common.b.n.a().g()).b()) {
                return "";
            }
            if (TextUtils.isEmpty(f6150g)) {
                f6150g = p.b(com.anythink.core.common.b.n.a().g(), com.anythink.core.common.b.g.o, com.anythink.core.common.b.g.f5010r, "");
            }
            return f6150g;
        } catch (Exception unused) {
            return "";
        }
    }

    public static JSONObject h() {
        if (!TextUtils.isEmpty(f6145a)) {
            try {
                return new JSONObject(f6145a);
            } catch (Exception unused) {
            }
        }
        return new JSONObject();
    }

    public static synchronized String i() {
        synchronized (d.class) {
            if (com.anythink.core.common.b.n.a().c("ua")) {
                return "";
            }
            try {
                if (!com.anythink.core.common.b.p.a(com.anythink.core.common.b.n.a().g()).b()) {
                    return "";
                }
                if (!TextUtils.isEmpty(f6152i)) {
                    return f6152i;
                }
                String str = Build.VERSION.RELEASE;
                String a10 = a();
                String str2 = Build.ID;
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(a10) || TextUtils.isEmpty(str2)) {
                    return "";
                }
                return "Mozilla/5.0 (Linux; Android " + str + "; " + a10 + " Build/" + str2 + ") AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19";
            } catch (Exception unused) {
                return "";
            }
        }
    }

    public static int k() {
        if (f6163u == -1) {
            if (TextUtils.isEmpty(l())) {
                f6163u = 0;
            } else {
                try {
                    Class.forName("com.tencent.mm.opensdk.openapi.WXAPIFactory");
                    Class.forName("com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram");
                    f6163u = 1;
                } catch (Throwable unused) {
                    f6163u = 0;
                }
            }
        }
        return f6163u;
    }

    public static String d() {
        if (com.anythink.core.common.b.n.a().c("os_vc")) {
            return "";
        }
        try {
            if (!com.anythink.core.common.b.p.a(com.anythink.core.common.b.n.a().g()).b()) {
                return "";
            }
            if (TextUtils.isEmpty(f6154k)) {
                f6154k = String.valueOf(Build.VERSION.SDK_INT);
            }
            return f6154k;
        } catch (Exception unused) {
            return "";
        }
    }

    private static boolean e(String str) {
        return Pattern.matches("^[0-]+$", str);
    }

    public static int m() {
        int i10 = f6164v;
        if (i10 != -1) {
            return i10;
        }
        f6164v = 0;
        try {
            f6164v = ((Integer) Class.forName("com.tencent.mm.opensdk.constants.Build").getField("SDK_INT").get(null)).intValue();
        } catch (Throwable unused) {
        }
        return f6164v;
    }

    public static Object c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Class.forName("com.tencent.mm.opensdk.openapi.WXAPIFactory").getMethod("createWXAPI", Context.class, String.class).invoke(null, com.anythink.core.common.b.n.a().g(), str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String j() {
        if (!TextUtils.isEmpty(f6148d)) {
            return f6148d;
        }
        String G = com.anythink.core.common.b.n.a().G();
        if (!TextUtils.isEmpty(G)) {
            f6148d = G;
            return G;
        }
        String G2 = com.anythink.core.common.b.n.a().G();
        if (TextUtils.isEmpty(G2)) {
            try {
                Class.forName("com.unity3d.player.UnityPlayer");
                G2 = "2";
            } catch (Throwable unused) {
                G2 = "1";
            }
            try {
                Class.forName("org.cocos2dx.lib.Cocos2dxActivity");
                Class.forName("org.cocos2dx.lib.Cocos2dxJavascriptJavaBridge");
                G2 = "4";
            } catch (Throwable unused2) {
            }
        }
        f6148d = G2;
        return G2;
    }

    public static /* synthetic */ boolean d(String str) {
        return Pattern.matches("^[0-]+$", str);
    }

    public static String a() {
        if (com.anythink.core.common.b.n.a().c("model")) {
            return "";
        }
        try {
            return !com.anythink.core.common.b.p.a(com.anythink.core.common.b.n.a().g()).b() ? "" : Build.MODEL;
        } catch (Exception unused) {
            return "";
        }
    }

    public static void a(String str) {
        f6150g = str;
        p.a(com.anythink.core.common.b.n.a().g(), com.anythink.core.common.b.g.o, com.anythink.core.common.b.g.f5010r, f6150g);
    }

    public static synchronized void a(int i10, String str) {
        synchronized (d.class) {
            if (!TextUtils.isEmpty(f6145a)) {
                try {
                    JSONObject jSONObject = new JSONObject(f6145a);
                    if (jSONObject.has(String.valueOf(i10))) {
                        return;
                    }
                    jSONObject.put(String.valueOf(i10), str);
                    f6145a = jSONObject.toString();
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(String.valueOf(i10), str);
                f6145a = jSONObject2.toString();
            } catch (Exception unused2) {
            }
        }
    }
}
