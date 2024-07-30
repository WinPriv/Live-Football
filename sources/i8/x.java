package i8;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayDeque;

/* compiled from: ServiceStarter.java */
@KeepForSdk
/* loaded from: classes2.dex */
public final class x {

    /* renamed from: e, reason: collision with root package name */
    public static x f29305e;

    /* renamed from: a, reason: collision with root package name */
    public String f29306a = null;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f29307b = null;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f29308c = null;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f29309d = new ArrayDeque();

    public static synchronized x a() {
        x xVar;
        synchronized (x.class) {
            if (f29305e == null) {
                f29305e = new x();
            }
            xVar = f29305e;
        }
        return xVar;
    }

    public final boolean b(Context context) {
        boolean z10;
        if (this.f29308c == null) {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f29308c = Boolean.valueOf(z10);
        }
        if (!this.f29307b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f29308c.booleanValue();
    }

    public final boolean c(Context context) {
        boolean z10;
        if (this.f29307b == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f29307b = Boolean.valueOf(z10);
        }
        if (!this.f29307b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f29307b.booleanValue();
    }
}
