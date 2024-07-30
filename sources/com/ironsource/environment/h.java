package com.ironsource.environment;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.webkit.WebSettings;
import com.anythink.expressad.exoplayer.k.o;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.tasks.OnSuccessListener;
import com.huawei.openalliance.ad.constant.w;
import com.ironsource.environment.l;
import java.io.File;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f24687a = false;

    /* renamed from: b, reason: collision with root package name */
    public static String f24688b = null;

    /* renamed from: c, reason: collision with root package name */
    public static String f24689c = null;

    /* renamed from: d, reason: collision with root package name */
    public static String f24690d = "";

    /* renamed from: e, reason: collision with root package name */
    public static String f24691e = "";
    public static volatile String f;

    /* renamed from: g, reason: collision with root package name */
    public static volatile String f24692g;

    /* loaded from: classes2.dex */
    public static class a implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            if (objArr != null) {
                try {
                    if (objArr.length > 0 && (obj2 = objArr[0]) != null) {
                        String obj3 = obj2.getClass().getMethod("getId", new Class[0]).invoke(objArr[0], new Object[0]).toString();
                        if (!TextUtils.isEmpty(obj3)) {
                            h.f24691e = obj3;
                            return null;
                        }
                        return null;
                    }
                    return null;
                } catch (Exception unused) {
                    return null;
                }
            }
            return null;
        }
    }

    public static String A(Context context) {
        if (c(context)) {
            return "Tablet";
        }
        return "Phone";
    }

    public static String B(Context context) {
        if (!g.a()) {
            return "";
        }
        try {
            Object invoke = AppSet.class.getMethod("getClient", Context.class).invoke(AppSet.class, context);
            Object invoke2 = invoke.getClass().getMethod("getAppSetIdInfo", new Class[0]).invoke(invoke, new Object[0]);
            invoke2.getClass().getMethod("addOnSuccessListener", OnSuccessListener.class).invoke(invoke2, Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{OnSuccessListener.class}, new a()));
            if (TextUtils.isEmpty(f24691e)) {
                return "";
            }
            return f24691e;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String C(Context context) {
        String obj;
        if (g.b()) {
            try {
                if (g.c()) {
                    if (f24692g == null) {
                        Object invoke = AdvertisingIdClient.class.getMethod("getAdvertisingIdInfo", Context.class).invoke(AdvertisingIdClient.class, context);
                        obj = invoke.getClass().getMethod("getId", new Class[0]).invoke(invoke, new Object[0]).toString();
                        try {
                            if (!TextUtils.isEmpty(obj)) {
                                f24692g = obj;
                            }
                        } catch (Exception unused) {
                            return obj;
                        }
                    } else {
                        obj = f24692g;
                    }
                } else {
                    Object invoke2 = AdvertisingIdClient.class.getMethod("getAdvertisingIdInfo", Context.class).invoke(AdvertisingIdClient.class, context);
                    obj = invoke2.getClass().getMethod("getId", new Class[0]).invoke(invoke2, new Object[0]).toString();
                }
                return obj;
            } catch (Exception unused2) {
            }
        }
        return null;
    }

    public static String D(Context context) {
        String H;
        try {
            if (g.c()) {
                if (f == null) {
                    H = H(context);
                    try {
                        if (!TextUtils.isEmpty(H)) {
                            f = H;
                        }
                    } catch (Exception unused) {
                        return H;
                    }
                } else {
                    H = f;
                }
            } else {
                H = H(context);
            }
            return H;
        } catch (Exception unused2) {
            return null;
        }
    }

    public static int E(Context context) {
        try {
            return IronSourceSharedPreferencesUtilities.getIntFromDefaultSharedPrefs(context, "IABTCF_gdprApplies", -1);
        } catch (Exception unused) {
            return -1;
        }
    }

    public static String F(Context context) {
        try {
            return IronSourceSharedPreferencesUtilities.getStringFromDefaultSharedPrefs(context, w.f22150cd, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean G(Context context) {
        try {
            for (String str : context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions) {
                if (str.equalsIgnoreCase("com.google.android.gms.permission.AD_ID")) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String H(Context context) {
        Object invoke = AdvertisingIdClient.class.getMethod("getAdvertisingIdInfo", Context.class).invoke(AdvertisingIdClient.class, context);
        return String.valueOf(((Boolean) invoke.getClass().getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(invoke, new Object[0])).booleanValue());
    }

    public static long a() {
        return Calendar.getInstance(TimeZone.getDefault()).getTime().getTime();
    }

    public static int b() {
        return -(TimeZone.getDefault().getOffset(a()) / w.f22171t);
    }

    public static String c() {
        String id2 = TimeZone.getDefault().getID();
        return id2 != null ? id2 : "";
    }

    public static long d(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (activityManager == null) {
            return -1L;
        }
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    public static String e() {
        return Build.VERSION.RELEASE;
    }

    public static int f() {
        return Build.VERSION.SDK_INT;
    }

    public static String g() {
        return Build.MODEL;
    }

    public static String h() {
        return Build.MANUFACTURER;
    }

    public static String i() {
        return "android";
    }

    public static String j(Context context) {
        TelephonyManager telephonyManager;
        return (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) ? "" : telephonyManager.getNetworkCountryIso();
    }

    public static int k() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public static float l(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(o.f9069b);
        try {
            return audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3);
        } catch (Exception e10) {
            e10.printStackTrace();
            return -1.0f;
        }
    }

    public static int m() {
        return k();
    }

    public static int n() {
        return l();
    }

    public static float o() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static long p() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return (statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong()) / w.f22146c;
    }

    public static String q() {
        String str = "";
        try {
            if (f24690d.isEmpty()) {
                try {
                    str = IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(ContextProvider.getInstance().getApplicationContext(), "Mediation_Shared_Preferences", "browser_user_agent", "");
                    return str;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return "";
                }
            }
            return f24690d;
        } catch (Exception unused) {
            return str;
        }
    }

    public static File r(Context context) {
        return context.getExternalCacheDir();
    }

    public static File s(Context context) {
        return context.getExternalFilesDir(null);
    }

    public static File t(Context context) {
        return context.getCacheDir();
    }

    public static File u(Context context) {
        return context.getFilesDir();
    }

    public static int v(Context context) {
        int i10;
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int i11 = 0;
            if (registerReceiver != null) {
                i10 = registerReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
            } else {
                i10 = 0;
            }
            if (registerReceiver != null) {
                i11 = registerReceiver.getIntExtra("scale", -1);
            }
            if (i10 == -1 || i11 == -1) {
                return -1;
            }
            return (int) ((i10 / i11) * 100.0f);
        } catch (Exception e10) {
            e10.printStackTrace();
            return -1;
        }
    }

    public static boolean w(Context context) {
        try {
            return ((PowerManager) context.getSystemService("power")).isPowerSaveMode();
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static synchronized String x(Context context) {
        synchronized (h.class) {
            if (!TextUtils.isEmpty(f24688b)) {
                return f24688b;
            }
            boolean z10 = true;
            if (context != null) {
                z10 = context.getSharedPreferences("Mediation_Shared_Preferences", 0).getBoolean("uuidEnabled", true);
            }
            if (z10) {
                String stringFromSharedPrefs = IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, "Mediation_Shared_Preferences", "cachedUUID", "");
                if (TextUtils.isEmpty(stringFromSharedPrefs)) {
                    String uuid = UUID.randomUUID().toString();
                    f24688b = uuid;
                    IronSourceSharedPreferencesUtilities.saveStringToSharedPrefs(context, "Mediation_Shared_Preferences", "cachedUUID", uuid);
                } else {
                    f24688b = stringFromSharedPrefs;
                }
            }
            return f24688b;
        }
    }

    public static synchronized String y(Context context) {
        synchronized (h.class) {
            if (!TextUtils.isEmpty(f24689c)) {
                return f24689c;
            }
            if (context == null) {
                return "";
            }
            String stringFromSharedPrefs = IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, "supersonic_shared_preferen", "auid", "");
            f24689c = stringFromSharedPrefs;
            if (TextUtils.isEmpty(stringFromSharedPrefs)) {
                String uuid = UUID.randomUUID().toString();
                f24689c = uuid;
                IronSourceSharedPreferencesUtilities.saveStringToSharedPrefs(context, "supersonic_shared_preferen", "auid", uuid);
            }
            return f24689c;
        }
    }

    public static int z(Context context) {
        if (context == null) {
            return -1;
        }
        return Settings.System.getInt(context.getContentResolver(), "screen_brightness", -1);
    }

    public static long a(String str) {
        StatFs statFs = new StatFs(new File(str).getPath());
        return (statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong()) / w.f22146c;
    }

    public static String b(Context context) {
        return context.getResources().getConfiguration().locale.getCountry();
    }

    public static boolean c(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            if (displayMetrics.widthPixels / displayMetrics.density >= 600.0f) {
                return true;
            }
        }
        return false;
    }

    public static boolean d() {
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                return Environment.isExternalStorageRemovable();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean e(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = registerReceiver != null ? registerReceiver.getIntExtra("status", -1) : -1;
        return intExtra == 2 || intExtra == 5;
    }

    public static int f(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return registerReceiver.getIntExtra("plugged", -1);
        }
        return -1;
    }

    public static boolean g(Context context) {
        try {
            return Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static boolean h(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "stay_on_while_plugged_in", 0) != 0;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static String i(Context context) {
        TelephonyManager telephonyManager;
        return (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) ? "" : telephonyManager.getNetworkOperatorName();
    }

    public static boolean j() {
        try {
            String[] strArr = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
            for (int i10 = 0; i10 < 8; i10++) {
                if (new File(strArr[i10] + "su").exists()) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static int k(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
    }

    public static int l() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    public static int m(Context context) {
        if (context instanceof Activity) {
            return ((Activity) context).getRequestedOrientation();
        }
        return -1;
    }

    public static String n(Context context) {
        if (context == null) {
            return "";
        }
        int m10 = m(context);
        if (m10 != 0) {
            if (m10 != 1) {
                if (m10 != 11) {
                    if (m10 != 12) {
                        switch (m10) {
                            case 6:
                            case 8:
                                break;
                            case 7:
                            case 9:
                                break;
                            default:
                                return "none";
                        }
                    }
                }
            }
            return "portrait";
        }
        return "landscape";
    }

    public static int o(Context context) {
        return context.getResources().getConfiguration().orientation;
    }

    public static List<ApplicationInfo> p(Context context) {
        return context.getPackageManager().getInstalledApplications(0);
    }

    public static String a(Context context) {
        return context.getResources().getConfiguration().locale.getLanguage();
    }

    public static boolean q(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0) != 1;
    }

    public static void a(Context context, long j10) {
        long j11;
        if (context != null) {
            n nVar = new n(new l.a());
            try {
                j11 = Long.parseLong(IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, "Mediation_Shared_Preferences", "browser_user_agent_time", "-1"));
            } catch (Exception e10) {
                e10.printStackTrace();
                j11 = -1;
            }
            if (!nVar.a(j11, j10)) {
                String str = "";
                try {
                    str = IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, "Mediation_Shared_Preferences", "browser_user_agent", "");
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                f24690d = str;
                f24687a = !str.isEmpty();
            }
            if (f24690d.isEmpty()) {
                try {
                    String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
                    f24690d = defaultUserAgent;
                    try {
                        IronSourceSharedPreferencesUtilities.saveStringToSharedPrefs(context, "Mediation_Shared_Preferences", "browser_user_agent", defaultUserAgent);
                    } catch (Exception e12) {
                        e12.printStackTrace();
                    }
                    if (j10 > 0) {
                        try {
                            IronSourceSharedPreferencesUtilities.saveStringToSharedPrefs(context, "Mediation_Shared_Preferences", "browser_user_agent_time", String.valueOf(System.currentTimeMillis()));
                        } catch (Exception e13) {
                            e13.printStackTrace();
                        }
                    }
                } catch (Exception e14) {
                    e14.printStackTrace();
                }
            }
        }
    }

    @TargetApi(19)
    public static boolean a(Activity activity) {
        int systemUiVisibility = activity.getWindow().getDecorView().getSystemUiVisibility();
        return (systemUiVisibility | 4096) == systemUiVisibility || (systemUiVisibility | 2048) == systemUiVisibility;
    }
}
