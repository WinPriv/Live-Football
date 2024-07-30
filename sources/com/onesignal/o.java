package com.onesignal;

import android.location.Location;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;

/* compiled from: GMSLocationController.java */
/* loaded from: classes2.dex */
public final class o extends a0 {

    /* renamed from: j, reason: collision with root package name */
    public static m4 f26952j;

    /* renamed from: k, reason: collision with root package name */
    public static c f26953k;

    /* compiled from: GMSLocationController.java */
    /* loaded from: classes2.dex */
    public static class a {
        public static Location a(GoogleApiClient googleApiClient) {
            synchronized (a0.f26644d) {
                if (googleApiClient.isConnected()) {
                    return LocationServices.FusedLocationApi.getLastLocation(googleApiClient);
                }
                return null;
            }
        }

        public static void b(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener) {
            try {
                synchronized (a0.f26644d) {
                    if (Looper.myLooper() == null) {
                        Looper.prepare();
                    }
                    if (googleApiClient.isConnected()) {
                        LocationServices.FusedLocationApi.requestLocationUpdates(googleApiClient, locationRequest, locationListener);
                    }
                }
            } catch (Throwable th) {
                e3.b(4, "FusedLocationApi.requestLocationUpdates failed!", th);
            }
        }
    }

    /* compiled from: GMSLocationController.java */
    /* loaded from: classes2.dex */
    public static class b implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
        @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
        public final void onConnected(Bundle bundle) {
            synchronized (a0.f26644d) {
                m4 m4Var = o.f26952j;
                if (m4Var != null && ((GoogleApiClient) m4Var.f26931b) != null) {
                    e3.b(6, "GMSLocationController GoogleApiClientListener onConnected lastLocation: " + a0.f26647h, null);
                    if (a0.f26647h == null) {
                        a0.f26647h = a.a((GoogleApiClient) o.f26952j.f26931b);
                        e3.b(6, "GMSLocationController GoogleApiClientListener lastLocation: " + a0.f26647h, null);
                        Location location = a0.f26647h;
                        if (location != null) {
                            a0.b(location);
                        }
                    }
                    o.f26953k = new c((GoogleApiClient) o.f26952j.f26931b);
                    return;
                }
                e3.b(6, "GMSLocationController GoogleApiClientListener onConnected googleApiClient not available, returning", null);
            }
        }

        @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
        public final void onConnectionFailed(ConnectionResult connectionResult) {
            e3.b(6, "GMSLocationController GoogleApiClientListener onConnectionSuspended connectionResult: " + connectionResult, null);
            o.c();
        }

        @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
        public final void onConnectionSuspended(int i10) {
            e3.b(6, "GMSLocationController GoogleApiClientListener onConnectionSuspended i: " + i10, null);
            o.c();
        }
    }

    /* compiled from: GMSLocationController.java */
    /* loaded from: classes2.dex */
    public static class c implements LocationListener {

        /* renamed from: a, reason: collision with root package name */
        public final GoogleApiClient f26954a;

        public c(GoogleApiClient googleApiClient) {
            this.f26954a = googleApiClient;
            a();
        }

        public final void a() {
            long j10;
            if (e3.A()) {
                j10 = 270000;
            } else {
                j10 = 570000;
            }
            if (this.f26954a != null) {
                LocationRequest priority = LocationRequest.create().setFastestInterval(j10).setInterval(j10).setMaxWaitTime((long) (j10 * 1.5d)).setPriority(102);
                e3.a(6, "GMSLocationController GoogleApiClient requestLocationUpdates!");
                a.b(this.f26954a, priority, this);
            }
        }
    }

    public static void c() {
        synchronized (a0.f26644d) {
            m4 m4Var = f26952j;
            if (m4Var != null) {
                try {
                    ((Class) m4Var.f26932c).getMethod("disconnect", new Class[0]).invoke((GoogleApiClient) m4Var.f26931b, new Object[0]);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            f26952j = null;
        }
    }

    public static void j() {
        Location location;
        if (a0.f != null) {
            return;
        }
        synchronized (a0.f26644d) {
            Thread thread = new Thread(new n(), "OS_GMS_LOCATION_FALLBACK");
            a0.f = thread;
            thread.start();
            if (f26952j != null && (location = a0.f26647h) != null) {
                a0.b(location);
            }
            b bVar = new b();
            m4 m4Var = new m4(new GoogleApiClient.Builder(a0.f26646g).addApi(LocationServices.API).addConnectionCallbacks(bVar).addOnConnectionFailedListener(bVar).setHandler(a0.e().f26649s).build());
            f26952j = m4Var;
            m4Var.a();
        }
    }

    public static void k() {
        synchronized (a0.f26644d) {
            e3.a(6, "GMSLocationController onFocusChange!");
            m4 m4Var = f26952j;
            if (m4Var != null && m4Var.e().isConnected()) {
                m4 m4Var2 = f26952j;
                if (m4Var2 != null) {
                    GoogleApiClient e10 = m4Var2.e();
                    if (f26953k != null) {
                        LocationServices.FusedLocationApi.removeLocationUpdates(e10, f26953k);
                    }
                    f26953k = new c(e10);
                }
            }
        }
    }
}
