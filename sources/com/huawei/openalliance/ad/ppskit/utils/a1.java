package com.huawei.openalliance.ad.ppskit.utils;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import ka.n7;

/* loaded from: classes2.dex */
public final class a1 implements LocationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f22805a;

    public a1(Context context) {
        this.f22805a = context;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        try {
            if (location != null) {
                n7.c("LocationUtils", "loc_tag getLocationByNative Listener lat =  %s, lon = %s", y1.j(String.valueOf(location.getLatitude())), y1.j(String.valueOf(location.getLongitude())));
                c1.f(this.f22805a, location);
            } else {
                n7.g("LocationUtils", "loc_tag getLocationByNative Listener, but location is null");
            }
        } catch (Throwable th) {
            n7.h("LocationUtils", "onLocationChanged ex: %s", th.getClass().getSimpleName());
        }
        c1.c(this);
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
        n7.b("LocationUtils", "loc_tag getLocationByNative onProviderDisabled");
        c1.c(this);
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
        n7.b("LocationUtils", "loc_tag getLocationByNative onProviderEnabled");
        c1.c(this);
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i10, Bundle bundle) {
        n7.b("LocationUtils", "loc_tag getLocationByNative onStatusChanged");
        c1.c(this);
    }
}
