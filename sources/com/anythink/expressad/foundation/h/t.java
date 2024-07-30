package com.anythink.expressad.foundation.h;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebView;
import com.huawei.hms.ads.gl;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class t extends g {

    /* renamed from: a, reason: collision with root package name */
    public static final String f10208a = "SameTools";

    /* renamed from: b, reason: collision with root package name */
    static List<String> f10209b;

    /* renamed from: c, reason: collision with root package name */
    private static char[] f10210c = {'A', 'p', 'p', 'l', 'i', 'c', 'a', 't', 'i', 'o', 'n', 'I', 'n', 'f', 'o'};

    /* renamed from: d, reason: collision with root package name */
    private static char[] f10211d = {'.', 'X'};

    /* renamed from: e, reason: collision with root package name */
    private static int f10212e = 0;
    private static int f = 1;

    /* renamed from: g, reason: collision with root package name */
    private static int f10213g = 2;

    /* renamed from: h, reason: collision with root package name */
    private static int f10214h = 3;

    /* renamed from: i, reason: collision with root package name */
    private static int f10215i = 0;

    /* renamed from: j, reason: collision with root package name */
    private static int f10216j = 7;

    /* renamed from: k, reason: collision with root package name */
    private static int f10217k = 14;

    /* renamed from: l, reason: collision with root package name */
    private static int f10218l = 19;

    /* renamed from: m, reason: collision with root package name */
    private static int f10219m = 16;

    /* renamed from: n, reason: collision with root package name */
    private static int f10220n = 26;
    private static int o = 1;

    public static int a(int i10) {
        if ((i10 > 100 && i10 < 199) || i10 == 2) {
            return 1;
        }
        if ((i10 <= 200 || i10 >= 299) && i10 != 4) {
            return (i10 <= 500 || i10 >= 599) ? -1 : 5;
        }
        return 2;
    }

    public static boolean b(Context context) {
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo() != null;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static float c(Context context) {
        if (context == null) {
            return 2.5f;
        }
        try {
            float f10 = context.getResources().getDisplayMetrics().density;
            if (f10 == gl.Code) {
                return 2.5f;
            }
            return f10;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 2.5f;
        }
    }

    public static int d(Context context) {
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            return context.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString()));
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public static int e(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return k(context).heightPixels;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public static int f(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return k(context).widthPixels;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public static int g(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getResources().getDisplayMetrics().widthPixels;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    private static <T extends String> boolean h(T t10) {
        return t10 != null && t10.length() > 0;
    }

    public static int i(Context context) {
        if (context != null) {
            return 0;
        }
        try {
            if (context.getResources().getIdentifier("config_showNavigationBar", "bool", "android") != 0) {
                return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("navigation_bar_height", "dimen", "android"));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return 0;
    }

    public static int j(Context context) {
        PackageInfo packageInfo;
        if (context == null) {
            return 0;
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                packageInfo = WebView.getCurrentWebViewPackage();
            } else {
                packageInfo = context.getPackageManager().getPackageInfo("com.google.android.webview", 1);
            }
            com.anythink.expressad.d.b.a();
            com.anythink.expressad.foundation.b.a.b().e();
            com.anythink.expressad.d.a b10 = com.anythink.expressad.d.b.b();
            if (b10 == null) {
                com.anythink.expressad.d.b.a();
                b10 = com.anythink.expressad.d.b.c();
            }
            if (packageInfo != null && !TextUtils.isEmpty(packageInfo.versionName) && packageInfo.versionName.equals("77.0.3865.92")) {
                return 5;
            }
            return b10.P();
        } catch (Exception unused) {
            return 0;
        }
    }

    private static DisplayMetrics k(Context context) {
        if (context == null) {
            return null;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
            return displayMetrics;
        } catch (Throwable th) {
            th.printStackTrace();
            return context.getResources().getDisplayMetrics();
        }
    }

    public static <T extends String> boolean a(T t10) {
        return t10 == null || t10.length() == 0;
    }

    public static int h(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getResources().getDisplayMetrics().heightPixels;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    private static boolean a(List list) {
        return list == null || list.isEmpty();
    }

    public static String c(String str) {
        try {
            return w.b(str) ? URLEncoder.encode(str, com.anythink.expressad.foundation.g.a.bN) : "";
        } catch (Throwable th) {
            o.b(f10208a, th.getMessage(), th);
            return "";
        }
    }

    private static <T> boolean a(T[] tArr) {
        return tArr == null || tArr.length == 0;
    }

    public static int b(Context context, float f10) {
        Resources resources;
        if (context == null || (resources = context.getResources()) == null) {
            return 0;
        }
        return (int) ((f10 * resources.getDisplayMetrics().density) + 0.5f);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean e(java.lang.String r4) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L54
            if (r4 == 0) goto L46
            java.lang.String r0 = "dyview"
            java.lang.String r0 = r4.getQueryParameter(r0)     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L54
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L54
            if (r2 == 0) goto L20
            java.lang.String r0 = "view"
            java.lang.String r0 = r4.getQueryParameter(r0)     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L54
        L20:
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L54
            r3 = 1
            if (r2 != 0) goto L33
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L54
            goto L2d
        L2c:
            r0 = -1
        L2d:
            int r0 = r0 % 2
            if (r0 != 0) goto L33
            r0 = r3
            goto L34
        L33:
            r0 = r1
        L34:
            java.lang.String r2 = "natmp"
            java.lang.String r4 = r4.getQueryParameter(r2)     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L53
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L53
            if (r4 != 0) goto L42
            r1 = r3
            goto L46
        L42:
            r1 = r0
            goto L46
        L44:
            r4 = move-exception
            goto L49
        L46:
            return r1
        L47:
            r4 = move-exception
            r0 = r1
        L49:
            java.lang.String r2 = "SameTools"
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L53
            com.anythink.expressad.foundation.h.o.d(r2, r4)     // Catch: java.lang.Throwable -> L53
            return r1
        L53:
            r1 = r0
        L54:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.foundation.h.t.e(java.lang.String):boolean");
    }

    public static boolean f(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                return false;
            }
            String queryParameter = parse.getQueryParameter(com.anythink.expressad.a.Z);
            if (TextUtils.isEmpty(queryParameter)) {
                return false;
            }
            return queryParameter.equals("0");
        } catch (Exception e10) {
            o.d(f10208a, e10.getMessage());
            return false;
        }
    }

    public static int g(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                return -1;
            }
            String queryParameter = parse.getQueryParameter(com.anythink.expressad.a.C);
            if (TextUtils.isEmpty(queryParameter)) {
                queryParameter = parse.getQueryParameter(com.anythink.expressad.a.B);
            }
            if (TextUtils.isEmpty(queryParameter)) {
                return -1;
            }
            try {
                return Integer.parseInt(queryParameter);
            } catch (Exception unused) {
                return -1;
            }
        } catch (Exception e10) {
            o.d(f10208a, e10.getMessage());
            return -1;
        }
    }

    public static int a(Context context, float f10) {
        float f11 = 2.5f;
        if (context != null) {
            try {
                float f12 = context.getResources().getDisplayMetrics().density;
                if (f12 != gl.Code) {
                    f11 = f12;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return (int) ((f10 / f11) + 0.5f);
    }

    private static boolean i(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            try {
                Uri parse = Uri.parse(str);
                if (parse != null) {
                    return !TextUtils.isEmpty(parse.getQueryParameter(com.anythink.expressad.a.C));
                }
                return false;
            } catch (Exception e10) {
                o.d(f10208a, e10.getMessage());
                return false;
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    public static double b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return 0.0d;
            }
            return Double.parseDouble(str);
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0.0d;
        }
    }

    public static int a() {
        int i10 = o;
        o = i10 + 1;
        return i10;
    }

    public static boolean d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                return false;
            }
            String queryParameter = parse.getQueryParameter(com.anythink.expressad.a.f6578z);
            if (TextUtils.isEmpty(queryParameter)) {
                return false;
            }
            return queryParameter.equals("1");
        } catch (Exception e10) {
            o.d(f10208a, e10.getMessage());
            return false;
        }
    }

    public static boolean a(String str, Context context) {
        try {
            return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static boolean a(com.anythink.expressad.foundation.d.c cVar) {
        if (cVar != null) {
            try {
                return cVar.N() == 1;
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return false;
    }

    private static Object b(String str, Context context) {
        try {
            return Class.forName(String.valueOf(b(f10212e))).getMethod(String.valueOf(b(f10213g)), String.class, Integer.TYPE).invoke(Class.forName(String.valueOf(b(f))).getMethod(String.valueOf(b(f10214h)), new Class[0]).invoke(context, new Object[0]), str, 8192);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int a(Object obj) {
        if (obj == null) {
            return 0;
        }
        try {
            if (obj instanceof String) {
                return Integer.parseInt((String) obj);
            }
            return 0;
        } catch (Throwable th) {
            o.b(f10208a, th.getMessage(), th);
            return 0;
        }
    }

    public static double a(Double d10) {
        try {
            String format = new DecimalFormat("0.00", DecimalFormatSymbols.getInstance(Locale.US)).format(d10);
            if (w.b(format)) {
                return Double.parseDouble(format);
            }
            return 0.0d;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0.0d;
        }
    }

    private static final char[] b(int i10) {
        StringBuilder sb2;
        if (i10 == 0) {
            sb2 = new StringBuilder();
            sb2.append(String.valueOf(Arrays.copyOf(s.f10199b, f10216j)));
            sb2.append(f10211d[f10215i]);
            sb2.append(String.valueOf(Arrays.copyOfRange(s.f10199b, f10216j, f10217k)));
            sb2.append(f10211d[f10215i]);
            sb2.append(String.valueOf(Arrays.copyOfRange(s.f10199b, f10217k, f10219m)));
            sb2.append(f10211d[f10215i]);
            sb2.append(String.valueOf(r.f10190c));
        } else if (i10 == 1) {
            sb2 = new StringBuilder();
            sb2.append(String.valueOf(Arrays.copyOf(s.f10199b, f10216j)));
            sb2.append(f10211d[f10215i]);
            sb2.append(String.valueOf(Arrays.copyOfRange(s.f10199b, f10216j, f10217k)));
            sb2.append(f10211d[f10215i]);
            sb2.append(String.valueOf(Arrays.copyOfRange(s.f10199b, f10218l, f10220n)));
        } else if (i10 == 2) {
            sb2 = new StringBuilder();
            sb2.append(String.valueOf(Arrays.copyOfRange(s.f10199b, f10219m, f10218l)));
            sb2.append(String.valueOf(f10210c));
        } else if (i10 != 3) {
            sb2 = null;
        } else {
            sb2 = new StringBuilder();
            sb2.append(String.valueOf(Arrays.copyOfRange(s.f10199b, f10219m, f10218l)));
            sb2.append(String.valueOf(r.f10190c));
        }
        return sb2.toString().toCharArray();
    }

    public static void a(View view) {
        if (view == null) {
            return;
        }
        try {
            view.setSystemUiVisibility(4102);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static List<String> a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        try {
            if (jSONArray.length() <= 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String optString = jSONArray.optString(i10);
                if (w.b(optString)) {
                    arrayList.add(optString);
                }
            }
            return arrayList;
        } catch (Throwable th) {
            o.b(f10208a, th.getMessage(), th);
            return null;
        }
    }

    private static boolean b(List list) {
        return !(list == null || list.isEmpty());
    }

    private static <T> boolean b(T[] tArr) {
        return !(tArr == null || tArr.length == 0);
    }

    public static synchronized boolean a(Context context, String str) {
        boolean z10;
        synchronized (t.class) {
            z10 = false;
            if (context != null) {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        if (b(str, context) != null) {
                            z10 = true;
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return z10;
    }

    private static synchronized String a(String str, Context context, String str2) {
        StringBuilder sb2;
        String sb3;
        synchronized (t.class) {
            try {
                Set<String> queryParameterNames = Uri.parse(str).getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() > 0) {
                    sb2 = new StringBuilder("&rtins_type=");
                } else {
                    sb2 = new StringBuilder("?rtins_type=");
                }
            } catch (Exception unused) {
                sb2 = new StringBuilder("&rtins_type=");
            }
            try {
                if (b(str2, context) != null) {
                    sb2.append(1);
                } else {
                    sb2.append(2);
                }
            } catch (Exception unused2) {
                sb2.append(0);
            }
            sb3 = sb2.toString();
        }
        return sb3;
    }

    public static synchronized String a(Context context, String str, String str2) {
        String sb2;
        synchronized (t.class) {
            StringBuilder sb3 = new StringBuilder(str2);
            try {
                sb3.append(a(str2, context, str));
            } catch (Exception unused) {
            }
            sb2 = sb3.toString();
        }
        return sb2;
    }
}
