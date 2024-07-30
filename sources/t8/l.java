package t8;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;

/* compiled from: Config.java */
/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static i9.b f35590a;

    /* renamed from: b, reason: collision with root package name */
    public static i9.a f35591b;

    /* renamed from: c, reason: collision with root package name */
    public static i9.c f35592c;

    public static boolean a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities == null) {
                return false;
            }
            return networkCapabilities.hasCapability(12);
        }
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network);
            if (networkInfo != null && networkInfo.isConnected()) {
                return true;
            }
        }
        return false;
    }
}
