package com.anythink.core.common.k;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final String f6179a = "CommonUtils";

    /* renamed from: b, reason: collision with root package name */
    public static char[] f6180b = {'a', 'n', 'd', 'r', 'o', 'i', 'd', 'c', 'o', 'n', 't', 'e', 'n', 't', 'p', 'm', 'g', 'e', 't', 'C', 'o', 'n', 't', 'e', 'x', 't'};

    /* renamed from: d, reason: collision with root package name */
    private static char[] f6182d = {'A', 'p', 'p', 'l', 'i', 'c', 'a', 't', 'i', 'o', 'n', 'I', 'n', 'f', 'o'};

    /* renamed from: e, reason: collision with root package name */
    private static char[] f6183e = {'.', 'X'};
    private static int f = 0;

    /* renamed from: g, reason: collision with root package name */
    private static int f6184g = 1;

    /* renamed from: h, reason: collision with root package name */
    private static int f6185h = 2;

    /* renamed from: i, reason: collision with root package name */
    private static int f6186i = 3;

    /* renamed from: j, reason: collision with root package name */
    private static int f6187j = 0;

    /* renamed from: k, reason: collision with root package name */
    private static int f6188k = 7;

    /* renamed from: l, reason: collision with root package name */
    private static int f6189l = 14;

    /* renamed from: m, reason: collision with root package name */
    private static int f6190m = 19;

    /* renamed from: n, reason: collision with root package name */
    private static int f6191n = 16;
    private static int o = 26;

    /* renamed from: c, reason: collision with root package name */
    public static char[] f6181c = {'P', 'a', 'c', 'k', 'a', 'g', 'e', 'M', 'a', 'n', 'a', 'g', 'e', 'r'};

    /* renamed from: com.anythink.core.common.k.h$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements View.OnSystemUiVisibilityChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f6192a;

        public AnonymousClass1(View view) {
            this.f6192a = view;
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public final void onSystemUiVisibilityChange(int i10) {
            if ((i10 & 2) == 0) {
                h.a(this.f6192a);
            }
        }
    }

    public static <T extends String> boolean a(T t10) {
        return t10 == null || t10.length() == 0;
    }

    public static <T extends String> boolean b(T t10) {
        return t10 != null && t10.length() > 0;
    }

    public static Map<String, Object> c(String str) {
        HashMap hashMap = new HashMap();
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.opt(next));
                }
            }
        } catch (Exception unused) {
        }
        return hashMap;
    }

    public static boolean a(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isAvailable()) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private static int[] b(Context context, String str) {
        try {
            for (Field field : Class.forName(context.getPackageName() + ".R$styleable").getFields()) {
                if (field.getName().equals(str)) {
                    return (int[]) field.get(null);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return null;
    }

    public static int a(Context context, float f10) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static boolean a(String str, Context context) {
        try {
            return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
        } catch (Exception unused) {
            return false;
        }
    }

    private static int b(Context context, String str, String str2) {
        String str3 = context.getPackageName() + ".R";
        String f10 = e0.i.f(str, "_", str2);
        try {
            for (Class<?> cls : Class.forName(str3).getClasses()) {
                if (cls.getSimpleName().equals("styleable")) {
                    for (Field field : cls.getFields()) {
                        if (field.getName().equals(f10)) {
                            return ((Integer) field.get(null)).intValue();
                        }
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return 0;
    }

    public static int a(Context context, String str, String str2) {
        if (context == null) {
            return -1;
        }
        return context.getResources().getIdentifier("anythink_".concat(String.valueOf(str)), str2, context.getPackageName());
    }

    public static String[] a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        try {
            String[] strArr = new String[jSONArray.length()];
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                strArr[i10] = jSONArray.optString(i10);
            }
            return strArr;
        } catch (Exception unused) {
            return null;
        }
    }

    private static void a(Activity activity) {
        Window window = activity.getWindow();
        if (window != null) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(4870);
            decorView.setOnSystemUiVisibilityChangeListener(new AnonymousClass1(decorView));
        }
    }

    public static void a(View view) {
        view.setSystemUiVisibility(4870);
    }

    public static boolean a() {
        try {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted("http://www.toponad.com");
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String a(Object[] objArr) {
        int length;
        if (objArr == null || objArr.length - 1 == -1) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            sb2.append(String.valueOf(objArr[i10]));
            if (i10 == length) {
                return sb2.toString();
            }
            sb2.append(",");
            i10++;
        }
    }

    private static View.OnSystemUiVisibilityChangeListener b(View view) {
        return new AnonymousClass1(view);
    }

    public static int b(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static synchronized boolean a(Context context, String str) {
        boolean z10;
        synchronized (h.class) {
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

    private static Object b(String str, Context context) {
        try {
            return Class.forName(String.valueOf(a(f))).getMethod(String.valueOf(a(f6185h)), String.class, Integer.TYPE).invoke(Class.forName(String.valueOf(a(f6184g))).getMethod(String.valueOf(a(f6186i)), new Class[0]).invoke(context, new Object[0]), str, 8192);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static final char[] a(int i10) {
        StringBuilder sb2;
        if (i10 == 0) {
            sb2 = new StringBuilder();
            sb2.append(String.valueOf(Arrays.copyOf(f6180b, f6188k)));
            sb2.append(f6183e[f6187j]);
            sb2.append(String.valueOf(Arrays.copyOfRange(f6180b, f6188k, f6189l)));
            sb2.append(f6183e[f6187j]);
            sb2.append(String.valueOf(Arrays.copyOfRange(f6180b, f6189l, f6191n)));
            sb2.append(f6183e[f6187j]);
            sb2.append(String.valueOf(f6181c));
        } else if (i10 == 1) {
            sb2 = new StringBuilder();
            sb2.append(String.valueOf(Arrays.copyOf(f6180b, f6188k)));
            sb2.append(f6183e[f6187j]);
            sb2.append(String.valueOf(Arrays.copyOfRange(f6180b, f6188k, f6189l)));
            sb2.append(f6183e[f6187j]);
            sb2.append(String.valueOf(Arrays.copyOfRange(f6180b, f6190m, o)));
        } else if (i10 == 2) {
            sb2 = new StringBuilder();
            sb2.append(String.valueOf(Arrays.copyOfRange(f6180b, f6191n, f6190m)));
            sb2.append(String.valueOf(f6182d));
        } else if (i10 != 3) {
            sb2 = null;
        } else {
            sb2 = new StringBuilder();
            sb2.append(String.valueOf(Arrays.copyOfRange(f6180b, f6191n, f6190m)));
            sb2.append(String.valueOf(f6181c));
        }
        return sb2.toString().toCharArray();
    }
}
