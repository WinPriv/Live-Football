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
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: SyncTask.java */
/* loaded from: classes2.dex */
public final class z implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final long f29315s;

    /* renamed from: t, reason: collision with root package name */
    public final PowerManager.WakeLock f29316t;

    /* renamed from: u, reason: collision with root package name */
    public final FirebaseMessaging f29317u;

    /* compiled from: SyncTask.java */
    /* loaded from: classes2.dex */
    public static class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public z f29318a;

        public a(z zVar) {
            this.f29318a = zVar;
        }

        public final void a() {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f29318a.f29317u.f21284d.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            z zVar = this.f29318a;
            if (zVar == null || !zVar.a()) {
                return;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
            }
            z zVar2 = this.f29318a;
            zVar2.f29317u.getClass();
            FirebaseMessaging.b(0L, zVar2);
            this.f29318a.f29317u.f21284d.unregisterReceiver(this);
            this.f29318a = null;
        }
    }

    @SuppressLint({"InvalidWakeLockTag"})
    public z(FirebaseMessaging firebaseMessaging, long j10) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));
        this.f29317u = firebaseMessaging;
        this.f29315s = j10;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.f21284d.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f29316t = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f29317u.f21284d.getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    public final boolean b() throws IOException {
        boolean z10 = true;
        try {
            if (this.f29317u.a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
            }
            return true;
        } catch (IOException e10) {
            String message = e10.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                z10 = false;
            }
            if (z10) {
                Log.w("FirebaseMessaging", "Token retrieval failed: " + e10.getMessage() + ". Will retry token retrieval");
                return false;
            }
            if (e10.getMessage() == null) {
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            throw e10;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"WakelockTimeout"})
    public final void run() {
        x a10 = x.a();
        FirebaseMessaging firebaseMessaging = this.f29317u;
        boolean c10 = a10.c(firebaseMessaging.f21284d);
        PowerManager.WakeLock wakeLock = this.f29316t;
        if (c10) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f21291l = true;
                }
            } catch (IOException e10) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e10.getMessage() + ". Won't retry the operation.");
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f21291l = false;
                    if (!x.a().c(firebaseMessaging.f21284d)) {
                        return;
                    }
                }
            }
            if (!firebaseMessaging.f21290k.c()) {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f21291l = false;
                }
                if (x.a().c(firebaseMessaging.f21284d)) {
                    wakeLock.release();
                    return;
                }
                return;
            }
            if (x.a().b(firebaseMessaging.f21284d) && !a()) {
                new a(this).a();
                if (x.a().c(firebaseMessaging.f21284d)) {
                    wakeLock.release();
                    return;
                }
                return;
            }
            if (b()) {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f21291l = false;
                }
            } else {
                firebaseMessaging.e(this.f29315s);
            }
        } finally {
            if (x.a().c(firebaseMessaging.f21284d)) {
                wakeLock.release();
            }
        }
    }
}
