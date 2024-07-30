package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import r1.h;
import s1.j;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2641a = h.e("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        h.c().a(f2641a, String.format("Received intent %s", intent), new Throwable[0]);
        try {
            j b10 = j.b(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            b10.getClass();
            synchronized (j.f35071l) {
                b10.f35079i = goAsync;
                if (b10.f35078h) {
                    goAsync.finish();
                    b10.f35079i = null;
                }
            }
        } catch (IllegalStateException e10) {
            h.c().b(f2641a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
        }
    }
}
