package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.text.TextUtils;
import android.util.Log;
import b2.k;
import j0.a;
import java.util.concurrent.TimeUnit;
import r1.h;
import s1.i;
import s1.j;

/* loaded from: classes.dex */
public final class ForceStopRunnable implements Runnable {

    /* renamed from: v, reason: collision with root package name */
    public static final String f2688v = h.e("ForceStopRunnable");

    /* renamed from: w, reason: collision with root package name */
    public static final long f2689w = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: s, reason: collision with root package name */
    public final Context f2690s;

    /* renamed from: t, reason: collision with root package name */
    public final j f2691t;

    /* renamed from: u, reason: collision with root package name */
    public int f2692u = 0;

    /* loaded from: classes.dex */
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public static final String f2693a = h.e("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                if (((h.a) h.c()).f34818b <= 2) {
                    Log.v(f2693a, "Rescheduling alarm that keeps track of force-stops.");
                }
                ForceStopRunnable.c(context);
            }
        }
    }

    public ForceStopRunnable(Context context, j jVar) {
        this.f2690s = context.getApplicationContext();
        this.f2691t = jVar;
    }

    @SuppressLint({"ClassVerificationFailure"})
    public static void c(Context context) {
        int i10;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (a.b()) {
            i10 = 167772160;
        } else {
            i10 = 134217728;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i10);
        long currentTimeMillis = System.currentTimeMillis() + f2689w;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.ForceStopRunnable.a():void");
    }

    public final boolean b() {
        androidx.work.a aVar = this.f2691t.f35073b;
        aVar.getClass();
        boolean isEmpty = TextUtils.isEmpty(null);
        String str = f2688v;
        if (isEmpty) {
            h.c().a(str, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean a10 = k.a(this.f2690s, aVar);
        h.c().a(str, String.format("Is default app process = %s", Boolean.valueOf(a10)), new Throwable[0]);
        return a10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = f2688v;
        j jVar = this.f2691t;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                i.a(this.f2690s);
                h.c().a(str, "Performing cleanup operations.", new Throwable[0]);
                try {
                    a();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e10) {
                    int i10 = this.f2692u + 1;
                    this.f2692u = i10;
                    if (i10 < 3) {
                        h.c().a(str, String.format("Retrying after %s", Long.valueOf(i10 * 300)), e10);
                        try {
                            Thread.sleep(this.f2692u * 300);
                        } catch (InterruptedException unused) {
                        }
                    } else {
                        h.c().b(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                        jVar.f35073b.getClass();
                        throw illegalStateException;
                    }
                }
            }
        } finally {
            jVar.d();
        }
    }
}
