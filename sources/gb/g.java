package gb;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import com.huawei.hms.ads.ex;

/* loaded from: classes2.dex */
public final class g implements LocationListener {
    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        try {
            if (location != null) {
                ex.Code("LocationUtils", "loc_tag getLocationByNative Listener lat = %s, lon = %s", androidx.transition.n.e(String.valueOf(location.getLatitude())), androidx.transition.n.e(String.valueOf(location.getLongitude())));
                e.c(location);
            } else {
                ex.I("LocationUtils", "loc_tag getLocationByNative Listener, but location is null");
            }
        } catch (Throwable th) {
            ex.V("LocationUtils", "onLocationChanged ex: %s", th.getClass().getSimpleName());
        }
        e.d(this);
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
        ex.Code("LocationUtils", "loc_tag getLocationByNative onProviderDisabled");
        e.d(this);
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
        ex.Code("LocationUtils", "loc_tag getLocationByNative onProviderEnabled");
        e.d(this);
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i10, Bundle bundle) {
        ex.Code("LocationUtils", "loc_tag getLocationByNative onStatusChanged");
        e.d(this);
    }
}
