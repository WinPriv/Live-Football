package com.huawei.openalliance.ad.ppskit.utils;

import android.annotation.TargetApi;
import android.content.Context;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import com.huawei.openalliance.ad.constant.av;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Location;
import com.huawei.openalliance.ad.ppskit.beans.parameter.RequestOptions;
import com.huawei.openalliance.ad.ppskit.handlers.ConfigSpHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ka.n7;

/* loaded from: classes2.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public static LocationManager f22823a = null;

    /* renamed from: b, reason: collision with root package name */
    public static String f22824b = null;

    /* renamed from: c, reason: collision with root package name */
    public static volatile Location f22825c = null;

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f22826d = new byte[0];

    /* renamed from: e, reason: collision with root package name */
    public static long f22827e = -1;
    public static long f = 1800000;

    /* renamed from: g, reason: collision with root package name */
    public static volatile boolean f22828g = false;

    public static Location a(Context context, String str, Location location) {
        LocationManager locationManager;
        android.location.Location lastKnownLocation;
        if (!d(null) || !e(context, str).f()) {
            return null;
        }
        if (location != null) {
            return location;
        }
        try {
            locationManager = (LocationManager) context.getSystemService(av.at);
            f22823a = locationManager;
        } catch (Throwable th) {
            n7.i("LocationUtils", "loc_tag getLocationByNative, exception = ".concat(th.getClass().getSimpleName()));
        }
        if (locationManager == null) {
            n7.i("LocationUtils", "loc_tag getLocationByNative, nativeLocationManager is null, return");
            return null;
        }
        List<String> providers = locationManager.getProviders(true);
        if (providers.contains("network")) {
            f22824b = "network";
        } else if (providers.contains("gps")) {
            f22824b = "gps";
        } else {
            n7.g("LocationUtils", "loc_tag nativeLocationProvider wrong, return");
            return null;
        }
        if (n7.d()) {
            n7.c("LocationUtils", "loc_tag native location provider is: %s", f22824b);
        }
        String str2 = f22824b;
        if (str2 != null && (lastKnownLocation = f22823a.getLastKnownLocation(str2)) != null) {
            Location location2 = new Location();
            location2.d(Double.valueOf(lastKnownLocation.getLongitude()));
            location2.g(Double.valueOf(lastKnownLocation.getLatitude()));
            location2.e(Long.valueOf(System.currentTimeMillis()));
            if (n7.d()) {
                n7.c("LocationUtils", "getLastKnownLocation lat: %s, lon: %s", y1.j(String.valueOf(location2.h())), y1.j(String.valueOf(location2.f())));
            }
            return location2;
        }
        return null;
    }

    public static void b(Context context) {
        String concat;
        n7.b("LocationUtils", "loc_tag getLocationByNative");
        LocationManager locationManager = (LocationManager) context.getSystemService(av.at);
        f22823a = locationManager;
        if (locationManager == null) {
            concat = "loc_tag getLocationByNative, nativeLocationManager is null, return";
        } else {
            List<String> providers = locationManager.getProviders(true);
            String str = "network";
            if (!providers.contains("network")) {
                str = "gps";
                if (!providers.contains("gps")) {
                    n7.g("LocationUtils", "loc_tag nativeLocationProvider wrong, return");
                    return;
                }
            }
            f22824b = str;
            if (n7.d()) {
                n7.c("LocationUtils", "loc_tag native location provider is: %s", f22824b);
            }
            try {
                if (f22824b != null) {
                    n7.e("LocationUtils", "loc_tag getLocationByNative requestLocationUpdates");
                    f22828g = false;
                    a1 a1Var = new a1(context);
                    f22823a.requestSingleUpdate(f22824b, a1Var, Looper.getMainLooper());
                    d2.b(new b1(a1Var), 30000L);
                    return;
                }
                return;
            } catch (Throwable th) {
                concat = "loc_tag getLocationByNative, exception = ".concat(th.getClass().getSimpleName());
            }
        }
        n7.i("LocationUtils", concat);
    }

    public static void c(LocationListener locationListener) {
        if (!f22828g && f22823a != null && locationListener != null) {
            n7.e("LocationUtils", "loc_tag remove native location updates");
            try {
                f22823a.removeUpdates(locationListener);
            } catch (Throwable th) {
                n7.f("LocationUtils", "loc_tag remove native location updates ex: %s", th.getClass().getSimpleName());
            }
            f22828g = true;
        }
    }

    public static boolean d(RequestOptions requestOptions) {
        if (requestOptions != null && requestOptions.m() != null) {
            return requestOptions.m().booleanValue();
        }
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(1:3)(12:33|34|35|(8:37|6|7|8|(1:10)|(3:14|90|21)|28|29)|5|6|7|8|(0)|(2:14|90)|28|29)|4|5|6|7|8|(0)|(0)|28|29) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003c, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x003d, code lost:
    
        ka.n7.i("LocationUtils", "loc_tag hasLocationPermission = ".concat(r4.getClass().getSimpleName()));
        r4 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0086 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.openalliance.ad.ppskit.beans.inner.LocationSwitches e(android.content.Context r9, java.lang.String r10) {
        /*
            ka.l r0 = ka.Cif.a(r9)
            boolean r0 = r0.j()
            java.lang.String r1 = "LocationUtils"
            r2 = 1
            r3 = 0
            if (r9 != 0) goto L11
            java.lang.String r4 = "loc_tag isGpsSwitchOpen Context is null"
            goto L33
        L11:
            android.content.ContentResolver r4 = r9.getContentResolver()     // Catch: android.provider.Settings.SettingNotFoundException -> L31
            java.lang.String r5 = "location_mode"
            int r4 = android.provider.Settings.Secure.getInt(r4, r5)     // Catch: android.provider.Settings.SettingNotFoundException -> L31
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "loc_tag isGpsSwitchOpen locationMode is "
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            ka.n7.e(r1, r5)
            r1 = 3
            if (r4 != r1) goto L36
            r1 = r2
            goto L37
        L31:
            java.lang.String r4 = "loc_tag isGpsSwitchOpen SettingNotFoundException"
        L33:
            ka.n7.i(r1, r4)
        L36:
            r1 = r3
        L37:
            boolean r4 = g(r9)     // Catch: java.lang.Throwable -> L3c
            goto L51
        L3c:
            r4 = move-exception
            java.lang.String r5 = "LocationUtils"
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getSimpleName()
            java.lang.String r6 = "loc_tag hasLocationPermission = "
            java.lang.String r4 = r6.concat(r4)
            ka.n7.i(r5, r4)
            r4 = r3
        L51:
            boolean r5 = ka.n7.d()
            if (r5 == 0) goto L84
            java.lang.String r5 = "LocationUtils"
            java.lang.String r6 = "loc_tag isBaseLocationSwitch = %s"
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
            r7[r3] = r8
            ka.n7.c(r5, r6, r7)
            java.lang.String r5 = "LocationUtils"
            java.lang.String r6 = "loc_tag isGpsSwitchOpen = %s"
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r1)
            r7[r3] = r8
            ka.n7.c(r5, r6, r7)
            java.lang.String r5 = "LocationUtils"
            java.lang.String r6 = "loc_tag hasLocationPermission = %s"
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)
            r7[r3] = r8
            ka.n7.c(r5, r6, r7)
        L84:
            if (r0 == 0) goto Lbe
            if (r1 == 0) goto Lbe
            if (r4 == 0) goto Lbe
            com.huawei.openalliance.ad.ppskit.handlers.l r9 = com.huawei.openalliance.ad.ppskit.handlers.l.d(r9)
            byte[] r4 = r9.f22585a
            monitor-enter(r4)
            android.content.SharedPreferences r9 = r9.G(r10)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r10 = "location_collected_switch"
            int r9 = r9.getInt(r10, r3)     // Catch: java.lang.Throwable -> Lbb
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> Lbb
            int r9 = r9.intValue()     // Catch: java.lang.Throwable -> Lbb
            if (r9 != r2) goto La8
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lbb
            r9 = r2
            goto Laa
        La8:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lbb
            r9 = r3
        Laa:
            java.lang.String r10 = "LocationUtils"
            java.lang.String r4 = "loc_tag isSdkServerLocationSwitch = %s"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r9)
            r2[r3] = r5
            ka.n7.c(r10, r4, r2)
            r3 = r9
            goto Lbe
        Lbb:
            r9 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lbb
            throw r9
        Lbe:
            com.huawei.openalliance.ad.ppskit.beans.inner.LocationSwitches r9 = new com.huawei.openalliance.ad.ppskit.beans.inner.LocationSwitches
            r9.<init>()
            r9.b(r0)
            r9.e(r1)
            r9.c(r3)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.utils.c1.e(android.content.Context, java.lang.String):com.huawei.openalliance.ad.ppskit.beans.inner.LocationSwitches");
    }

    public static void f(Context context, android.location.Location location) {
        if (location == null) {
            return;
        }
        synchronized (f22826d) {
            if (f22825c == null) {
                f22825c = new Location();
            }
            f22825c.d(Double.valueOf(location.getLongitude()));
            f22825c.g(Double.valueOf(location.getLatitude()));
            f22825c.e(Long.valueOf(System.currentTimeMillis()));
            ConfigSpHandler.b(context).h(f22825c);
        }
    }

    @TargetApi(23)
    public static boolean g(Context context) {
        if (context == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.ACCESS_FINE_LOCATION");
        arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!p1.a(context, (String) it.next())) {
                return false;
            }
        }
        return true;
    }
}
