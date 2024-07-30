package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import com.google.android.gms.location.LocationListener;
import com.google.firebase.messaging.FirebaseMessaging;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.location.LocationCallback;
import com.huawei.openalliance.ad.constant.ag;
import java.util.Collections;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class OSUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f26621a = {ag.f21999j, ag.f22000k, ag.f22001l, com.anythink.expressad.video.dynview.a.a.f11399v, 410};

    public static boolean a() {
        try {
            return new b0.w(e3.f26748b).f2771b.areNotificationsEnabled();
        } catch (Throwable unused) {
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b() {
        /*
            r0 = 0
            r1 = 1
            java.lang.String r2 = "com.amazon.device.messaging.ADM"
            java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L9
            r2 = r1
            goto La
        L9:
            r2 = r0
        La:
            if (r2 == 0) goto Le
            r0 = 2
            return r0
        Le:
            boolean r2 = g()
            java.lang.String r3 = "com.google.android.gms"
            r4 = 128(0x80, float:1.8E-43)
            if (r2 != 0) goto L1a
        L18:
            r2 = r0
            goto L28
        L1a:
            android.content.Context r2 = com.onesignal.e3.f26748b     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L18
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L18
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L18
            android.content.pm.ApplicationInfo r2 = r2.applicationInfo     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L18
            boolean r2 = r2.enabled     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L18
        L28:
            if (r2 == 0) goto L2b
            return r1
        L2b:
            boolean r2 = j()
            if (r2 == 0) goto L3d
            boolean r2 = f()
            if (r2 != 0) goto L38
            goto L3d
        L38:
            boolean r2 = n()
            goto L3e
        L3d:
            r2 = r0
        L3e:
            r5 = 13
            if (r2 == 0) goto L43
            return r5
        L43:
            android.content.Context r2 = com.onesignal.e3.f26748b     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
            android.content.pm.ApplicationInfo r2 = r2.applicationInfo     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
            boolean r2 = r2.enabled     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
            goto L53
        L52:
            r2 = r0
        L53:
            if (r2 == 0) goto L56
            return r1
        L56:
            java.lang.String r2 = "com.huawei.hwid"
            android.content.Context r3 = com.onesignal.e3.f26748b     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            android.content.pm.PackageInfo r2 = r3.getPackageInfo(r2, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            android.content.pm.ApplicationInfo r2 = r2.applicationInfo     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            boolean r0 = r2.enabled     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
        L66:
            if (r0 == 0) goto L69
            return r5
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.OSUtils.b():int");
    }

    public static Integer c() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) e3.f26748b.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            int type = activeNetworkInfo.getType();
            if (type != 1 && type != 9) {
                return 1;
            }
            return 0;
        }
        return null;
    }

    public static String d(Context context, String str, String str2) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(str, com.anythink.expressad.foundation.h.i.f10128g, context.getPackageName());
        if (identifier != 0) {
            return resources.getString(identifier);
        }
        return str2;
    }

    public static Uri e(Context context, String str) {
        boolean z10;
        int identifier;
        Resources resources = context.getResources();
        String packageName = context.getPackageName();
        if (str != null && !str.matches("^[0-9]")) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (identifier = resources.getIdentifier(str, "raw", packageName)) != 0) {
            return Uri.parse("android.resource://" + packageName + "/" + identifier);
        }
        int identifier2 = resources.getIdentifier("onesignal_default_sound", "raw", packageName);
        if (identifier2 != 0) {
            return Uri.parse("android.resource://" + packageName + "/" + identifier2);
        }
        return null;
    }

    public static boolean f() {
        if (i() && l()) {
            return true;
        }
        return false;
    }

    public static boolean g() {
        try {
            return opaqueHasClass(FirebaseMessaging.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    public static boolean h() {
        try {
            return opaqueHasClass(LocationListener.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    public static boolean i() {
        try {
            return opaqueHasClass(AGConnectServicesConfig.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    public static boolean j() {
        try {
            return opaqueHasClass(HuaweiApiAvailability.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    public static boolean k() {
        try {
            return opaqueHasClass(LocationCallback.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    public static boolean l() {
        try {
            return opaqueHasClass(HmsInstanceId.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    public static int m(Context context, String str) {
        int b10 = b();
        try {
            UUID.fromString(str);
            Integer num = null;
            if ("b2f7f966-d8cc-11e4-bed1-df8f05be55ba".equals(str) || "5eb5a37e-b458-11e3-ac11-000c2940e62c".equals(str)) {
                e3.b(3, "OneSignal Example AppID detected, please update to your app's id found on OneSignal.com", null);
            }
            int i10 = 1;
            if (b10 == 1) {
                if (!g()) {
                    e3.b(2, "The Firebase FCM library is missing! Please make sure to include it in your project.", null);
                    num = -4;
                }
                if (num != null) {
                    i10 = num.intValue();
                }
            }
            if (Build.VERSION.SDK_INT >= 26) {
                try {
                    int i11 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion;
                } catch (PackageManager.NameNotFoundException e10) {
                    e10.printStackTrace();
                }
            }
            return i10;
        } catch (Throwable th) {
            e3.b(2, "OneSignal AppId format is invalid.\nExample: 'b2f7f966-d8cc-11e4-bed1-df8f05be55ba'\n", th);
            return com.anythink.expressad.video.bt.a.c.f11213a;
        }
    }

    public static boolean n() {
        if (HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(e3.f26748b) == 0) {
            return true;
        }
        return false;
    }

    public static boolean o() {
        return Thread.currentThread().equals(Looper.getMainLooper().getThread());
    }

    @Keep
    private static boolean opaqueHasClass(Class<?> cls) {
        return true;
    }

    public static <T> Set<T> p() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public static Intent q(Uri uri) {
        Intent makeMainSelectorActivity;
        int i10 = 3;
        int i11 = 0;
        if (uri.getScheme() != null) {
            String scheme = uri.getScheme();
            int[] d10 = s.f.d(3);
            int length = d10.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    break;
                }
                int i13 = d10[i12];
                if (a3.k.b(i13).equalsIgnoreCase(scheme)) {
                    i11 = i13;
                    break;
                }
                i12++;
            }
        }
        if (i11 == 0) {
            if (!uri.toString().contains("://")) {
                uri = Uri.parse("http://" + uri.toString());
            }
        } else {
            i10 = i11;
        }
        if (s.f.c(i10) != 0) {
            makeMainSelectorActivity = new Intent("android.intent.action.VIEW", uri);
        } else {
            makeMainSelectorActivity = Intent.makeMainSelectorActivity("android.intent.action.MAIN", "android.intent.category.APP_BROWSER");
            makeMainSelectorActivity.setData(uri);
        }
        makeMainSelectorActivity.addFlags(268435456);
        return makeMainSelectorActivity;
    }

    public static long[] r(JSONObject jSONObject) {
        JSONArray jSONArray;
        try {
            Object opt = jSONObject.opt("vib_pt");
            if (opt instanceof String) {
                jSONArray = new JSONArray((String) opt);
            } else {
                jSONArray = (JSONArray) opt;
            }
            long[] jArr = new long[jSONArray.length()];
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                jArr[i10] = jSONArray.optLong(i10);
            }
            return jArr;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static void s(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }
}
