package i8;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.stats.WakeLock;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* compiled from: FcmBroadcastProcessor.java */
@KeepForSdk
/* loaded from: classes2.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f29280c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static com.google.firebase.messaging.c f29281d;

    /* renamed from: a, reason: collision with root package name */
    public final Context f29282a;

    /* renamed from: b, reason: collision with root package name */
    public final i f29283b = new i();

    public k(Context context) {
        this.f29282a = context;
    }

    public static Task<Integer> a(Context context, Intent intent, boolean z10) {
        com.google.firebase.messaging.c cVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f29280c) {
            if (f29281d == null) {
                f29281d = new com.google.firebase.messaging.c(context);
            }
            cVar = f29281d;
        }
        if (z10) {
            if (x.a().c(context)) {
                synchronized (f0.f29271b) {
                    if (f0.f29272c == null) {
                        WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                        f0.f29272c = wakeLock;
                        wakeLock.setReferenceCounted(true);
                    }
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        f0.f29272c.acquire(f0.f29270a);
                    }
                    cVar.b(intent).addOnCompleteListener(new q0.d(intent, 11));
                }
            } else {
                cVar.b(intent);
            }
            return Tasks.forResult(-1);
        }
        return cVar.b(intent).continueWith(new h(1), new com.applovin.exoplayer2.a.l(26));
    }

    @KeepForSdk
    public final Task<Integer> b(final Intent intent) {
        boolean z10;
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        final boolean z11 = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        boolean isAtLeastO = PlatformVersion.isAtLeastO();
        final Context context = this.f29282a;
        int i10 = 1;
        if (isAtLeastO && context.getApplicationInfo().targetSdkVersion >= 26) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((intent.getFlags() & 268435456) != 0) {
            z11 = true;
        }
        if (z10 && !z11) {
            return a(context, intent, z11);
        }
        g2.j jVar = new g2.j(i10, context, intent);
        i iVar = this.f29283b;
        return Tasks.call(iVar, jVar).continueWithTask(iVar, new Continuation() { // from class: i8.j
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                if (PlatformVersion.isAtLeastO() && ((Integer) task.getResult()).intValue() == 402) {
                    return k.a(context, intent, z11).continueWith(new i(), new com.applovin.exoplayer2.b0(24));
                }
                return task;
            }
        });
    }
}
