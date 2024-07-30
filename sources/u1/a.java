package u1;

import a2.d;
import a2.f;
import a2.g;
import a2.i;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import r1.h;
import s1.j;

/* compiled from: Alarms.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f35751a = h.e("Alarms");

    public static void a(Context context, int i10, String str) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, androidx.work.impl.background.systemalarm.a.a(context, str), 603979776);
        if (service != null && alarmManager != null) {
            h.c().a(f35751a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i10)), new Throwable[0]);
            alarmManager.cancel(service);
        }
    }

    public static void b(Context context, j jVar, String str, long j10) {
        int i10;
        int i11;
        WorkDatabase workDatabase = jVar.f35074c;
        i iVar = (i) workDatabase.k();
        g a10 = iVar.a(str);
        if (a10 != null) {
            a(context, a10.f45b, str);
            int i12 = a10.f45b;
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            PendingIntent service = PendingIntent.getService(context, i12, androidx.work.impl.background.systemalarm.a.a(context, str), 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j10, service);
                return;
            }
            return;
        }
        synchronized (b2.h.class) {
            workDatabase.c();
            try {
                Long a11 = ((f) workDatabase.j()).a("next_alarm_manager_id");
                if (a11 != null) {
                    i10 = a11.intValue();
                } else {
                    i10 = 0;
                }
                if (i10 == Integer.MAX_VALUE) {
                    i11 = 0;
                } else {
                    i11 = i10 + 1;
                }
                ((f) workDatabase.j()).b(new d("next_alarm_manager_id", i11));
                workDatabase.h();
            } finally {
                workDatabase.f();
            }
        }
        g gVar = new g(str, i10);
        f1.h hVar = iVar.f46a;
        hVar.b();
        hVar.c();
        try {
            iVar.f47b.e(gVar);
            hVar.h();
            hVar.f();
            AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
            PendingIntent service2 = PendingIntent.getService(context, i10, androidx.work.impl.background.systemalarm.a.a(context, str), 201326592);
            if (alarmManager2 != null) {
                alarmManager2.setExact(0, j10, service2);
            }
        } catch (Throwable th) {
            hVar.f();
            throw th;
        }
    }
}
