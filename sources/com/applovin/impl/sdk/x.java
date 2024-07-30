package com.applovin.impl.sdk;

import android.annotation.SuppressLint;
import android.location.Location;
import android.location.LocationManager;
import android.provider.Settings;
import com.huawei.openalliance.ad.constant.av;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    private final p f19572a;

    /* renamed from: b, reason: collision with root package name */
    private final LocationManager f19573b = (LocationManager) p.y().getSystemService(av.at);

    /* renamed from: c, reason: collision with root package name */
    private double f19574c;

    /* renamed from: d, reason: collision with root package name */
    private double f19575d;

    /* renamed from: e, reason: collision with root package name */
    private long f19576e;

    public x(p pVar) {
        this.f19572a = pVar;
    }

    private boolean f() {
        long millis = TimeUnit.MINUTES.toMillis(((Long) this.f19572a.a(com.applovin.impl.sdk.c.b.ey)).longValue());
        if (this.f19576e != 0 && System.currentTimeMillis() - this.f19576e < millis) {
            return false;
        }
        Location a10 = a("gps", "android.permission.ACCESS_FINE_LOCATION");
        if (a10 == null) {
            a10 = a("network", "android.permission.ACCESS_COARSE_LOCATION");
        }
        if (a10 == null) {
            return false;
        }
        this.f19574c = a10.getLatitude();
        this.f19575d = a10.getLongitude();
        this.f19576e = System.currentTimeMillis();
        return true;
    }

    public boolean a() {
        return com.applovin.impl.sdk.utils.h.a("android.permission.ACCESS_COARSE_LOCATION", p.y());
    }

    public boolean b() {
        boolean isLocationEnabled;
        if (com.applovin.impl.sdk.utils.h.h()) {
            isLocationEnabled = this.f19573b.isLocationEnabled();
            return isLocationEnabled;
        }
        if (!com.applovin.impl.sdk.utils.h.c() || Settings.Secure.getInt(p.y().getContentResolver(), "location_mode", 0) != 0) {
            return true;
        }
        return false;
    }

    public boolean c() {
        if (!this.f19572a.C().isLocationCollectionEnabled() || !((Boolean) this.f19572a.a(com.applovin.impl.sdk.c.b.ex)).booleanValue() || !a()) {
            return false;
        }
        if (!f() && this.f19576e == 0) {
            return false;
        }
        return true;
    }

    public double d() {
        return this.f19574c;
    }

    public double e() {
        return this.f19575d;
    }

    @SuppressLint({"MissingPermission"})
    private Location a(String str, String str2) {
        if (!com.applovin.impl.sdk.utils.h.a(str2, p.y())) {
            return null;
        }
        try {
            return this.f19573b.getLastKnownLocation(str);
        } catch (IllegalArgumentException e10) {
            this.f19572a.L();
            if (y.a()) {
                this.f19572a.L().b("LocationManager", a3.k.l("Failed to retrieve location from ", str, ": device does not support this location provider."), e10);
            }
            return null;
        } catch (NullPointerException e11) {
            this.f19572a.L();
            if (y.a()) {
                this.f19572a.L().b("LocationManager", a3.k.l("Failed to retrieve location from ", str, ": location provider is not available."), e11);
            }
            return null;
        } catch (SecurityException e12) {
            this.f19572a.L();
            if (y.a()) {
                this.f19572a.L().b("LocationManager", a3.k.l("Failed to retrieve location from ", str, ": access denied."), e12);
            }
            return null;
        } catch (Throwable th) {
            this.f19572a.L();
            if (y.a()) {
                this.f19572a.L().b("LocationManager", a3.k.l("Failed to retrieve location from ", str, "."), th);
            }
            return null;
        }
    }
}
