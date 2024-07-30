package com.onesignal;

import android.location.Location;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.location.LocationServices;
import v9.Task;

/* compiled from: HMSLocationController.java */
/* loaded from: classes2.dex */
public final class r extends a0 {

    /* renamed from: j, reason: collision with root package name */
    public static FusedLocationProviderClient f26995j;

    /* renamed from: k, reason: collision with root package name */
    public static c f26996k;

    /* compiled from: HMSLocationController.java */
    /* loaded from: classes2.dex */
    public class a implements v9.b {
        @Override // v9.b
        public final void onFailure(Exception exc) {
            e3.b(3, "Huawei LocationServices getLastLocation failed!", exc);
            synchronized (a0.f26644d) {
                r.f26995j = null;
            }
        }
    }

    /* compiled from: HMSLocationController.java */
    /* loaded from: classes2.dex */
    public class b implements v9.c<Location> {
        @Override // v9.c
        public final void onSuccess(Location location) {
            Location location2 = location;
            e3.b(4, "Huawei LocationServices getLastLocation returned location: " + location2, null);
            if (location2 == null) {
                synchronized (a0.f26644d) {
                    r.f26995j = null;
                }
            } else {
                a0.f26647h = location2;
                a0.b(location2);
                r.f26996k = new c(r.f26995j);
            }
        }
    }

    /* compiled from: HMSLocationController.java */
    /* loaded from: classes2.dex */
    public static class c extends LocationCallback {

        /* renamed from: a, reason: collision with root package name */
        public final FusedLocationProviderClient f26997a;

        public c(FusedLocationProviderClient fusedLocationProviderClient) {
            this.f26997a = fusedLocationProviderClient;
            a();
        }

        public final void a() {
            long j10;
            if (e3.A()) {
                j10 = 270000;
            } else {
                j10 = 570000;
            }
            LocationRequest priority = LocationRequest.create().setFastestInterval(j10).setInterval(j10).setMaxWaitTime((long) (j10 * 1.5d)).setPriority(102);
            e3.a(6, "HMSLocationController Huawei LocationServices requestLocationUpdates!");
            this.f26997a.requestLocationUpdates(priority, this, a0.e().getLooper());
        }
    }

    public static void j() {
        synchronized (a0.f26644d) {
            if (f26995j == null) {
                try {
                    f26995j = LocationServices.getFusedLocationProviderClient(a0.f26646g);
                } catch (Exception e10) {
                    e3.a(3, "Huawei LocationServices getFusedLocationProviderClient failed! " + e10);
                    synchronized (a0.f26644d) {
                        f26995j = null;
                        return;
                    }
                }
            }
            Location location = a0.f26647h;
            if (location != null) {
                a0.b(location);
            } else {
                Task lastLocation = f26995j.getLastLocation();
                lastLocation.b(new b());
                lastLocation.a(new a());
            }
        }
    }

    public static void k() {
        synchronized (a0.f26644d) {
            e3.a(6, "HMSLocationController onFocusChange!");
            if (a0.f() && f26995j == null) {
                return;
            }
            FusedLocationProviderClient fusedLocationProviderClient = f26995j;
            if (fusedLocationProviderClient != null) {
                c cVar = f26996k;
                if (cVar != null) {
                    fusedLocationProviderClient.removeLocationUpdates(cVar);
                }
                f26996k = new c(f26995j);
            }
        }
    }
}
