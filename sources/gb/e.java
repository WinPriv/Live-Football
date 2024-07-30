package gb;

import android.content.Context;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import com.huawei.hms.ads.RequestOptions;
import com.huawei.hms.ads.ec;
import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.beans.metadata.Location;
import com.huawei.openalliance.ad.constant.av;
import com.huawei.openalliance.ad.inter.HiAd;
import java.util.List;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static LocationManager f28572a = null;

    /* renamed from: b, reason: collision with root package name */
    public static String f28573b = null;

    /* renamed from: c, reason: collision with root package name */
    public static Location f28574c = null;

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f28575d = new byte[0];

    /* renamed from: e, reason: collision with root package name */
    public static long f28576e = -1;
    public static long f = 1800000;

    /* renamed from: g, reason: collision with root package name */
    public static volatile boolean f28577g = false;

    /* loaded from: classes2.dex */
    public static class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f28578s;

        public a(Context context) {
            this.f28578s = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Context context = this.f28578s;
            if (e.e(context).f394d) {
                e.g(1, context);
            } else {
                ex.V("LocationUtils", "loc_tag sendAsyncLocationByNative failed because switch is off");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.openalliance.ad.beans.metadata.Location a(android.content.Context r5, com.huawei.hms.ads.RequestOptions r6, com.huawei.openalliance.ad.beans.metadata.Location r7) {
        /*
            boolean r6 = i(r5, r6)
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "loc_tag media allow: %s"
            java.lang.String r4 = "LocationUtils"
            com.huawei.hms.ads.ex.V(r4, r2, r1)
            aa.a r1 = e(r5)
            if (r6 == 0) goto L20
            boolean r6 = r1.f394d
            if (r6 == 0) goto L20
            goto L21
        L20:
            r0 = r3
        L21:
            if (r0 == 0) goto L61
            if (r7 != 0) goto L4e
            java.lang.String r6 = "loc_tag sendAsyncLocation go!"
            com.huawei.hms.ads.ex.V(r4, r6)
            boolean r6 = f(r5)
            if (r6 != 0) goto L31
            goto L44
        L31:
            long r6 = java.lang.System.currentTimeMillis()
            gb.e.f28576e = r6
            java.lang.String r6 = "update lastRefreshTime"
            com.huawei.hms.ads.ex.V(r4, r6)
            gb.f r6 = new gb.f
            r6.<init>(r5)
            gb.c0.c(r6)
        L44:
            com.huawei.openalliance.ad.beans.metadata.Location r5 = gb.e.f28574c
            if (r5 != 0) goto L49
            goto L66
        L49:
            com.huawei.openalliance.ad.beans.metadata.Location r5 = r5.a()
            goto L67
        L4e:
            com.huawei.openalliance.ad.beans.metadata.Location r5 = r7.a()
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r5.e(r6)
            r5.b()
            goto L67
        L61:
            java.lang.String r5 = "loc_tag isLocationAvailable = false, return null"
            com.huawei.hms.ads.ex.V(r4, r5)
        L66:
            r5 = 0
        L67:
            if (r5 != 0) goto L6e
            com.huawei.openalliance.ad.beans.metadata.Location r5 = new com.huawei.openalliance.ad.beans.metadata.Location
            r5.<init>()
        L6e:
            r5.c(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.e.a(android.content.Context, com.huawei.hms.ads.RequestOptions, com.huawei.openalliance.ad.beans.metadata.Location):com.huawei.openalliance.ad.beans.metadata.Location");
    }

    public static void b(Context context, RequestOptions requestOptions) {
        if (i(context, requestOptions) && f(context)) {
            if (ex.Code()) {
                ex.Code("LocationUtils", "loc_tag sendAsyncLocationByNative go!");
            }
            c0.c(new a(context));
        }
    }

    public static void c(android.location.Location location) {
        if (location == null) {
            return;
        }
        synchronized (f28575d) {
            if (f28574c == null) {
                f28574c = new Location();
            }
            f28574c.d(Double.valueOf(location.getLongitude()));
            f28574c.g(Double.valueOf(location.getLatitude()));
            f28574c.e(Long.valueOf(System.currentTimeMillis()));
        }
    }

    public static void d(LocationListener locationListener) {
        if (!f28577g && f28572a != null && locationListener != null) {
            ex.V("LocationUtils", "loc_tag remove native location updates");
            try {
                f28572a.removeUpdates(locationListener);
            } catch (Throwable th) {
                ex.V("LocationUtils", "loc_tag remove native location updates ex: %s", th.getClass().getSimpleName());
            }
            f28577g = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static aa.a e(android.content.Context r8) {
        /*
            com.huawei.hms.ads.cw r0 = com.huawei.hms.ads.cl.Code(r8)
            boolean r0 = r0.I()
            r1 = 1
            java.lang.String r2 = "LocationUtils"
            r3 = 0
            if (r8 != 0) goto L11
            java.lang.String r4 = "loc_tag isGpsSwitchOpen Context is null"
            goto L35
        L11:
            android.content.ContentResolver r4 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L31 android.provider.Settings.SettingNotFoundException -> L33
            java.lang.String r5 = "location_mode"
            int r4 = android.provider.Settings.Secure.getInt(r4, r5)     // Catch: java.lang.Throwable -> L31 android.provider.Settings.SettingNotFoundException -> L33
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            java.lang.String r6 = "loc_tag isGpsSwitchOpen locationMode is "
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L31
            r5.append(r4)     // Catch: java.lang.Throwable -> L31
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L31
            com.huawei.hms.ads.ex.V(r2, r5)     // Catch: java.lang.Throwable -> L31
            r5 = 3
            if (r4 != r5) goto L3e
            r4 = r1
            goto L3f
        L31:
            r4 = move-exception
            goto L39
        L33:
            java.lang.String r4 = "loc_tag isGpsSwitchOpen SettingNotFoundException"
        L35:
            com.huawei.hms.ads.ex.Z(r2, r4)     // Catch: java.lang.Throwable -> L31
            goto L3e
        L39:
            java.lang.String r5 = "get location service switch exception: "
            e0.i.q(r4, r5, r2)
        L3e:
            r4 = r3
        L3f:
            if (r8 != 0) goto L42
            goto L7c
        L42:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L6a
            r5.<init>()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r6 = "android.permission.ACCESS_FINE_LOCATION"
            r5.add(r6)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r6 = "android.permission.ACCESS_COARSE_LOCATION"
            r5.add(r6)     // Catch: java.lang.Throwable -> L6a
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L6a
        L55:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L6a
            if (r6 == 0) goto L68
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L6a
            boolean r6 = gb.l.a(r8, r6)     // Catch: java.lang.Throwable -> L6a
            if (r6 != 0) goto L55
            goto L7c
        L68:
            r5 = r1
            goto L7d
        L6a:
            r5 = move-exception
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getSimpleName()
            java.lang.String r6 = "loc_tag hasLocationPermission = "
            java.lang.String r5 = r6.concat(r5)
            com.huawei.hms.ads.ex.Z(r2, r5)
        L7c:
            r5 = r3
        L7d:
            boolean r6 = com.huawei.hms.ads.ex.Code()
            if (r6 == 0) goto Laa
            java.lang.Object[] r6 = new java.lang.Object[r1]
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            r6[r3] = r7
            java.lang.String r7 = "loc_tag isBaseLocationSwitch = %s"
            com.huawei.hms.ads.ex.Code(r2, r7, r6)
            java.lang.Object[] r6 = new java.lang.Object[r1]
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            r6[r3] = r7
            java.lang.String r7 = "loc_tag isGpsSwitchOpen = %s"
            com.huawei.hms.ads.ex.Code(r2, r7, r6)
            java.lang.Object[] r6 = new java.lang.Object[r1]
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            r6[r3] = r7
            java.lang.String r7 = "loc_tag hasLocationPermission = %s"
            com.huawei.hms.ads.ex.Code(r2, r7, r6)
        Laa:
            aa.a r6 = new aa.a
            r6.<init>()
            r6.f391a = r0
            r6.f392b = r4
            r6.f393c = r5
            if (r0 == 0) goto Lbd
            if (r4 == 0) goto Lbd
            if (r5 == 0) goto Lbd
            r0 = r1
            goto Lbe
        Lbd:
            r0 = r3
        Lbe:
            if (r0 == 0) goto Ld6
            com.huawei.hms.ads.ec r8 = com.huawei.hms.ads.ec.Code(r8)
            boolean r8 = r8.B()
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)
            r0[r3] = r1
            java.lang.String r1 = "loc_tag isSdkServerLocationSwitch = %s"
            com.huawei.hms.ads.ex.Code(r2, r1, r0)
            r3 = r8
        Ld6:
            r6.f394d = r3
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.e.e(android.content.Context):aa.a");
    }

    public static boolean f(Context context) {
        long abs = Math.abs(System.currentTimeMillis() - f28576e);
        f = ec.Code(context).S();
        ex.Code("LocationUtils", "loc_tag isRefreshOk intervalRefreshTime = " + f + ", intervalTime = " + abs);
        if (abs < f) {
            ex.Code("LocationUtils", "loc_tag isRefreshOk = false, too frequently (no ok)");
            return false;
        }
        return true;
    }

    public static void g(int i10, Context context) {
        ex.Code("LocationUtils", "loc_tag getLocationByNative");
        LocationManager locationManager = (LocationManager) context.getSystemService(av.at);
        f28572a = locationManager;
        if (locationManager == null) {
            ex.Z("LocationUtils", "loc_tag getLocationByNative, nativeLocationManager is null, return");
            return;
        }
        List<String> providers = locationManager.getProviders(true);
        String str = "network";
        if (!providers.contains("network")) {
            str = "gps";
            if (!providers.contains("gps")) {
                ex.I("LocationUtils", "loc_tag nativeLocationProvider wrong, return");
                return;
            }
        }
        f28573b = str;
        if (ex.Code()) {
            ex.Code("LocationUtils", "loc_tag native location provider is: %s", f28573b);
        }
        try {
            String str2 = f28573b;
            if (str2 != null) {
                if (1 == i10) {
                    android.location.Location lastKnownLocation = f28572a.getLastKnownLocation(str2);
                    if (lastKnownLocation != null) {
                        ex.Code("LocationUtils", "loc_tag getLocationByNative getLastKnownLocation lat = %s, lon = %s", androidx.transition.n.e(String.valueOf(lastKnownLocation.getLatitude())), androidx.transition.n.e(String.valueOf(lastKnownLocation.getLongitude())));
                        c(lastKnownLocation);
                        return;
                    } else {
                        ex.I("LocationUtils", "loc_tag getLocationByNative, but location is null");
                        return;
                    }
                }
                if (2 == i10) {
                    ex.V("LocationUtils", "loc_tag getLocationByNative requestLocationUpdates");
                    f28577g = false;
                    g gVar = new g();
                    f28572a.requestSingleUpdate(f28573b, gVar, Looper.getMainLooper());
                    w.a(30000L, new h(gVar));
                    return;
                }
                ex.Code("LocationUtils", "loc_tag requestLocationByNative not correct type");
            }
        } catch (Throwable th) {
            ex.Z("LocationUtils", "loc_tag getLocationByNative, exception = ".concat(th.getClass().getSimpleName()));
        }
    }

    public static void h(Context context) {
        boolean z10;
        boolean z11 = true;
        try {
            Class.forName("com.huawei.hms.location.LocationServices");
            Class.forName("com.huawei.hms.location.FusedLocationProviderClient");
            z10 = true;
        } catch (Throwable unused) {
            ex.Z("LocationUtils", "loc_tag check location sdk available error");
            z10 = false;
        }
        boolean b10 = b0.b(context, b0.g(context));
        if (!z10 || !b10) {
            z11 = false;
        }
        if (z11) {
            ex.V("LocationUtils", "loc_tag asyncLocation has location-sdk");
            try {
                ex.Code("LocationUtils", "loc_tag getLocationByKit");
                try {
                    new d(context, new i(context)).a();
                } catch (Throwable th) {
                    ex.Z("LocationUtils", "loc_tag getLocationByKit, exception = ".concat(th.getClass().getSimpleName()));
                }
                return;
            } catch (Throwable th2) {
                ex.I("LocationUtils", "loc_tag get location by kit error, ".concat(th2.getClass().getSimpleName()));
                ex.Code(5, th2);
            }
        } else {
            ex.V("LocationUtils", "loc_tag asyncLocation has not location-sdk");
        }
        g(2, context);
    }

    public static boolean i(Context context, RequestOptions requestOptions) {
        Boolean I;
        if (requestOptions != null && requestOptions.I() != null) {
            I = requestOptions.I();
        } else {
            RequestOptions requestConfiguration = HiAd.getInstance(context).getRequestConfiguration();
            if (requestConfiguration != null && requestConfiguration.I() != null) {
                I = requestConfiguration.I();
            } else {
                return true;
            }
        }
        return I.booleanValue();
    }
}
