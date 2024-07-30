package i8;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: TopicsSyncTask.java */
/* loaded from: classes2.dex */
public final class e0 implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public static final Object f29260x = new Object();
    public static Boolean y;

    /* renamed from: z, reason: collision with root package name */
    public static Boolean f29261z;

    /* renamed from: s, reason: collision with root package name */
    public final Context f29262s;

    /* renamed from: t, reason: collision with root package name */
    public final r f29263t;

    /* renamed from: u, reason: collision with root package name */
    public final PowerManager.WakeLock f29264u;

    /* renamed from: v, reason: collision with root package name */
    public final d0 f29265v;

    /* renamed from: w, reason: collision with root package name */
    public final long f29266w;

    /* compiled from: TopicsSyncTask.java */
    /* loaded from: classes2.dex */
    public class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public e0 f29267a;

        public a(e0 e0Var) {
            this.f29267a = e0Var;
        }

        public final void a() {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            e0.this.f29262s.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public final synchronized void onReceive(Context context, Intent intent) {
            e0 e0Var = this.f29267a;
            if (e0Var == null) {
                return;
            }
            if (!e0Var.d()) {
                return;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
            }
            e0 e0Var2 = this.f29267a;
            e0Var2.f29265v.f.schedule(e0Var2, 0L, TimeUnit.SECONDS);
            context.unregisterReceiver(this);
            this.f29267a = null;
        }
    }

    public e0(d0 d0Var, Context context, r rVar, long j10) {
        this.f29265v = d0Var;
        this.f29262s = context;
        this.f29266w = j10;
        this.f29263t = rVar;
        this.f29264u = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f29260x) {
            Boolean bool = f29261z;
            if (bool == null) {
                booleanValue = b(context, "android.permission.ACCESS_NETWORK_STATE", bool);
            } else {
                booleanValue = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(booleanValue);
            f29261z = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    public static boolean b(Context context, String str, Boolean bool) {
        boolean z10;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context.checkCallingOrSelfPermission(str) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z10;
    }

    public static boolean c(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f29260x) {
            Boolean bool = y;
            if (bool == null) {
                booleanValue = b(context, "android.permission.WAKE_LOCK", bool);
            } else {
                booleanValue = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(booleanValue);
            y = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    public final synchronized boolean d() {
        NetworkInfo networkInfo;
        boolean z10;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f29262s.getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo != null) {
            if (networkInfo.isConnected()) {
                z10 = true;
            }
        }
        z10 = false;
        return z10;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public final void run() {
        d0 d0Var = this.f29265v;
        Context context = this.f29262s;
        boolean c10 = c(context);
        PowerManager.WakeLock wakeLock = this.f29264u;
        if (c10) {
            wakeLock.acquire(f.f29269a);
        }
        try {
            try {
                synchronized (d0Var) {
                    d0Var.f29255g = true;
                }
            } catch (Throwable th) {
                if (c(context)) {
                    try {
                        wakeLock.release();
                    } catch (RuntimeException unused) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
                throw th;
            }
        } catch (IOException e10) {
            Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e10.getMessage());
            synchronized (d0Var) {
                d0Var.f29255g = false;
                if (!c(context)) {
                    return;
                }
            }
        }
        if (!this.f29263t.c()) {
            synchronized (d0Var) {
                d0Var.f29255g = false;
            }
            if (c(context)) {
                try {
                    wakeLock.release();
                    return;
                } catch (RuntimeException unused2) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    return;
                }
            }
            return;
        }
        if (a(context) && !d()) {
            new a(this).a();
            if (c(context)) {
                try {
                    wakeLock.release();
                    return;
                } catch (RuntimeException unused3) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    return;
                }
            }
            return;
        }
        if (d0Var.e()) {
            synchronized (d0Var) {
                d0Var.f29255g = false;
            }
        } else {
            d0Var.f(this.f29266w);
        }
        if (!c(context)) {
            return;
        }
        try {
            wakeLock.release();
        } catch (RuntimeException unused4) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
