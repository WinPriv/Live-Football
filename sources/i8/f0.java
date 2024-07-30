package i8;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.stats.WakeLock;
import java.util.concurrent.TimeUnit;

/* compiled from: WakeLockHolder.java */
/* loaded from: classes2.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f29270a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b, reason: collision with root package name */
    public static final Object f29271b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static WakeLock f29272c;

    public static void a(Intent intent) {
        synchronized (f29271b) {
            if (f29272c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                f29272c.release();
            }
        }
    }

    public static ComponentName b(Context context, Intent intent) {
        synchronized (f29271b) {
            if (f29272c == null) {
                WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                f29272c = wakeLock;
                wakeLock.setReferenceCounted(true);
            }
            boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
            intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            if (!booleanExtra) {
                f29272c.acquire(f29270a);
            }
            return startService;
        }
    }
}
