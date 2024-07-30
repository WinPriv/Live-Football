package com.onesignal;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.stats.CodePackage;
import com.onesignal.e3;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: LocationController.java */
/* loaded from: classes2.dex */
public class a0 {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f26643c;

    /* renamed from: e, reason: collision with root package name */
    public static c f26645e;
    public static Thread f;

    /* renamed from: g, reason: collision with root package name */
    public static Context f26646g;

    /* renamed from: h, reason: collision with root package name */
    public static Location f26647h;

    /* renamed from: i, reason: collision with root package name */
    public static String f26648i;

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList f26641a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap<f, b> f26642b = new ConcurrentHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    public static final a f26644d = new a();

    /* compiled from: LocationController.java */
    /* loaded from: classes2.dex */
    public class a {
    }

    /* compiled from: LocationController.java */
    /* loaded from: classes2.dex */
    public interface b {
        void a(d dVar);

        f getType();
    }

    /* compiled from: LocationController.java */
    /* loaded from: classes2.dex */
    public static class c extends HandlerThread {

        /* renamed from: s, reason: collision with root package name */
        public final Handler f26649s;

        public c() {
            super("OSH_LocationHandlerThread");
            start();
            this.f26649s = new Handler(getLooper());
        }
    }

    /* compiled from: LocationController.java */
    /* loaded from: classes2.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public Double f26650a;

        /* renamed from: b, reason: collision with root package name */
        public Double f26651b;

        /* renamed from: c, reason: collision with root package name */
        public Float f26652c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f26653d;

        /* renamed from: e, reason: collision with root package name */
        public Boolean f26654e;
        public Long f;

        public final String toString() {
            return "LocationPoint{lat=" + this.f26650a + ", log=" + this.f26651b + ", accuracy=" + this.f26652c + ", type=" + this.f26653d + ", bg=" + this.f26654e + ", timeStamp=" + this.f + '}';
        }
    }

    /* compiled from: LocationController.java */
    /* loaded from: classes2.dex */
    public enum f {
        STARTUP,
        PROMPT_LOCATION,
        SYNC_SERVICE
    }

    public static void a(d dVar) {
        Thread thread;
        HashMap hashMap = new HashMap();
        synchronized (a0.class) {
            ConcurrentHashMap<f, b> concurrentHashMap = f26642b;
            hashMap.putAll(concurrentHashMap);
            concurrentHashMap.clear();
            thread = f;
        }
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            ((b) hashMap.get((f) it.next())).a(dVar);
        }
        if (thread != null && !Thread.currentThread().equals(thread)) {
            thread.interrupt();
        }
        if (thread == f) {
            synchronized (a0.class) {
                if (thread == f) {
                    f = null;
                }
            }
        }
        e3.f26775w.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        r3.h(Long.valueOf(currentTimeMillis), r3.f27010a, "OS_LAST_LOCATION_TIME");
    }

    public static void b(Location location) {
        e3.b(6, "LocationController fireCompleteForLocation with location: " + location, null);
        d dVar = new d();
        dVar.f26652c = Float.valueOf(location.getAccuracy());
        dVar.f26654e = Boolean.valueOf(!e3.o);
        dVar.f26653d = Integer.valueOf(!f26643c ? 1 : 0);
        dVar.f = Long.valueOf(location.getTime());
        if (f26643c) {
            dVar.f26650a = Double.valueOf(new BigDecimal(location.getLatitude()).setScale(7, RoundingMode.HALF_UP).doubleValue());
            dVar.f26651b = Double.valueOf(new BigDecimal(location.getLongitude()).setScale(7, RoundingMode.HALF_UP).doubleValue());
        } else {
            dVar.f26650a = Double.valueOf(location.getLatitude());
            dVar.f26651b = Double.valueOf(location.getLongitude());
        }
        a(dVar);
        g(f26646g);
    }

    public static void c() {
        boolean z10;
        a aVar = f26644d;
        synchronized (aVar) {
            try {
                new OSUtils();
                boolean z11 = false;
                if (OSUtils.b() == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && OSUtils.h()) {
                    z11 = true;
                }
                if (z11) {
                    o.c();
                } else if (f()) {
                    synchronized (aVar) {
                        r.f26995j = null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        a(null);
    }

    public static void d(Context context, boolean z10, boolean z11, b bVar) {
        int i10;
        if (bVar instanceof e) {
            ArrayList arrayList = f26641a;
            synchronized (arrayList) {
                arrayList.add((e) bVar);
            }
        }
        f26646g = context;
        f26642b.put(bVar.getType(), bVar);
        e3.f26776x.getClass();
        if (!r3.b(r3.f27010a, "PREFS_OS_LOCATION_SHARED", true)) {
            h(z10, e3.u.ERROR);
            c();
            return;
        }
        int a10 = com.onesignal.e.a(context, "android.permission.ACCESS_FINE_LOCATION");
        int i11 = -1;
        if (a10 == -1) {
            i10 = com.onesignal.e.a(context, "android.permission.ACCESS_COARSE_LOCATION");
            f26643c = true;
        } else {
            i10 = -1;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 29) {
            i11 = com.onesignal.e.a(context, "android.permission.ACCESS_BACKGROUND_LOCATION");
        }
        if (a10 != 0) {
            try {
                List asList = Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions);
                e3.u uVar = e3.u.PERMISSION_DENIED;
                if (asList.contains("android.permission.ACCESS_FINE_LOCATION")) {
                    f26648i = "android.permission.ACCESS_FINE_LOCATION";
                } else if (asList.contains("android.permission.ACCESS_COARSE_LOCATION")) {
                    if (i10 != 0) {
                        f26648i = "android.permission.ACCESS_COARSE_LOCATION";
                    } else if (i12 >= 29 && asList.contains("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                        f26648i = "android.permission.ACCESS_BACKGROUND_LOCATION";
                    }
                } else {
                    e3.b(5, "Location permissions not added on AndroidManifest file", null);
                    uVar = e3.u.LOCATION_PERMISSIONS_MISSING_MANIFEST;
                }
                if (f26648i != null && z10) {
                    int i13 = c0.f26701a;
                    String str = f26648i;
                    zc.d.d(str, "androidPermissionString");
                    if (!PermissionsActivity.f26624u) {
                        PermissionsActivity.f26625v = z11;
                        c4 c4Var = new c4(CodePackage.LOCATION, str, c0.class);
                        boolean z12 = PermissionsActivity.f26624u;
                        com.onesignal.a aVar = com.onesignal.c.f26699t;
                        if (aVar != null) {
                            com.onesignal.a.f26632d.put("com.onesignal.PermissionsActivity", c4Var);
                            Activity activity = aVar.f26635b;
                            if (activity != null) {
                                c4Var.a(activity);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i10 == 0) {
                    h(z10, e3.u.PERMISSION_GRANTED);
                    i();
                    return;
                } else {
                    h(z10, uVar);
                    c();
                    return;
                }
            } catch (PackageManager.NameNotFoundException e10) {
                h(z10, e3.u.ERROR);
                e10.printStackTrace();
                return;
            }
        }
        if (i12 >= 29 && i11 != 0) {
            try {
                if (Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions).contains("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                    f26648i = "android.permission.ACCESS_BACKGROUND_LOCATION";
                }
                if (f26648i != null && z10) {
                    int i14 = c0.f26701a;
                    String str2 = f26648i;
                    zc.d.d(str2, "androidPermissionString");
                    if (!PermissionsActivity.f26624u) {
                        PermissionsActivity.f26625v = z11;
                        c4 c4Var2 = new c4(CodePackage.LOCATION, str2, c0.class);
                        boolean z13 = PermissionsActivity.f26624u;
                        com.onesignal.a aVar2 = com.onesignal.c.f26699t;
                        if (aVar2 != null) {
                            com.onesignal.a.f26632d.put("com.onesignal.PermissionsActivity", c4Var2);
                            Activity activity2 = aVar2.f26635b;
                            if (activity2 != null) {
                                c4Var2.a(activity2);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                h(z10, e3.u.PERMISSION_GRANTED);
                i();
                return;
            } catch (PackageManager.NameNotFoundException e11) {
                h(z10, e3.u.ERROR);
                e11.printStackTrace();
                return;
            }
        }
        h(z10, e3.u.PERMISSION_GRANTED);
        i();
    }

    public static c e() {
        if (f26645e == null) {
            synchronized (f26644d) {
                if (f26645e == null) {
                    f26645e = new c();
                }
            }
        }
        return f26645e;
    }

    public static boolean f() {
        boolean z10;
        new OSUtils();
        if (OSUtils.b() == 13) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && OSUtils.k()) {
            return true;
        }
        return false;
    }

    public static boolean g(Context context) {
        boolean z10;
        long j10;
        if (com.onesignal.e.a(context, "android.permission.ACCESS_FINE_LOCATION") != 0 && com.onesignal.e.a(context, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            e3.b(6, "LocationController scheduleUpdate not possible, location permission not enabled", null);
            return false;
        }
        e3.f26776x.getClass();
        if (!r3.b(r3.f27010a, "PREFS_OS_LOCATION_SHARED", true)) {
            e3.b(6, "LocationController scheduleUpdate not possible, location shared not enabled", null);
            return false;
        }
        e3.f26775w.getClass();
        long currentTimeMillis = System.currentTimeMillis() - r3.d("OS_LAST_LOCATION_TIME", -600000L);
        if (e3.o) {
            j10 = 300;
        } else {
            j10 = 600;
        }
        long j11 = j10 * 1000;
        StringBuilder k10 = com.ironsource.adapters.facebook.a.k("LocationController scheduleUpdate lastTime: ", currentTimeMillis, " minTime: ");
        k10.append(j11);
        e3.b(6, k10.toString(), null);
        long j12 = j11 - currentTimeMillis;
        s2 c10 = s2.c();
        c10.getClass();
        e3.b(7, "OSSyncService scheduleLocationUpdateTask:delayMs: " + j12, null);
        c10.d(context, j12);
        return true;
    }

    public static void h(boolean z10, e3.u uVar) {
        if (!z10) {
            e3.b(6, "LocationController sendAndClearPromptHandlers from non prompt flow", null);
            return;
        }
        ArrayList arrayList = f26641a;
        synchronized (arrayList) {
            e3.b(6, "LocationController calling prompt handlers", null);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((e) it.next()).b(uVar);
            }
            f26641a.clear();
        }
    }

    public static void i() {
        boolean z10;
        e3.b(6, "LocationController startGetLocation with lastLocation: " + f26647h, null);
        try {
            new OSUtils();
            boolean z11 = false;
            if (OSUtils.b() == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && OSUtils.h()) {
                z11 = true;
            }
            if (z11) {
                o.j();
            } else if (f()) {
                r.j();
            } else {
                e3.b(4, "LocationController startGetLocation not possible, no location dependency found", null);
                c();
            }
        } catch (Throwable th) {
            e3.b(4, "Location permission exists but there was an error initializing: ", th);
            c();
        }
    }

    /* compiled from: LocationController.java */
    /* loaded from: classes2.dex */
    public static abstract class e implements b {
        public void b(e3.u uVar) {
        }
    }
}
