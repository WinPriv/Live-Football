package y1;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import r1.h;

/* compiled from: NetworkStateTracker.java */
/* loaded from: classes.dex */
public final class e extends d<w1.b> {

    /* renamed from: i, reason: collision with root package name */
    public static final String f36537i = h.e("NetworkStateTracker");

    /* renamed from: g, reason: collision with root package name */
    public final ConnectivityManager f36538g;

    /* renamed from: h, reason: collision with root package name */
    public final a f36539h;

    /* compiled from: NetworkStateTracker.java */
    /* loaded from: classes.dex */
    public class a extends ConnectivityManager.NetworkCallback {
        public a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            h.c().a(e.f36537i, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
            e eVar = e.this;
            eVar.b(eVar.e());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            h.c().a(e.f36537i, "Network connection lost", new Throwable[0]);
            e eVar = e.this;
            eVar.b(eVar.e());
        }
    }

    public e(Context context, d2.a aVar) {
        super(context, aVar);
        this.f36538g = (ConnectivityManager) this.f36531b.getSystemService("connectivity");
        this.f36539h = new a();
    }

    @Override // y1.d
    public final w1.b a() {
        return e();
    }

    @Override // y1.d
    public final void c() {
        String str = f36537i;
        try {
            h.c().a(str, "Registering network callback", new Throwable[0]);
            this.f36538g.registerDefaultNetworkCallback(this.f36539h);
        } catch (IllegalArgumentException | SecurityException e10) {
            h.c().b(str, "Received exception while registering network callback", e10);
        }
    }

    @Override // y1.d
    public final void d() {
        String str = f36537i;
        try {
            h.c().a(str, "Unregistering network callback", new Throwable[0]);
            this.f36538g.unregisterNetworkCallback(this.f36539h);
        } catch (IllegalArgumentException | SecurityException e10) {
            h.c().b(str, "Received exception while unregistering network callback", e10);
        }
    }

    public final w1.b e() {
        boolean z10;
        boolean z11;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = this.f36538g;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z12 = true;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            z10 = true;
        } else {
            z10 = false;
        }
        try {
            networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        } catch (SecurityException e10) {
            h.c().b(f36537i, "Unable to validate active network", e10);
        }
        if (networkCapabilities != null) {
            if (networkCapabilities.hasCapability(16)) {
                z11 = true;
                boolean a10 = i0.a.a(connectivityManager);
                if (activeNetworkInfo != null || activeNetworkInfo.isRoaming()) {
                    z12 = false;
                }
                return new w1.b(z10, z11, a10, z12);
            }
        }
        z11 = false;
        boolean a102 = i0.a.a(connectivityManager);
        if (activeNetworkInfo != null) {
        }
        z12 = false;
        return new w1.b(z10, z11, a102, z12);
    }
}
