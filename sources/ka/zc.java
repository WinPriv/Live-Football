package ka;

import android.content.Context;
import java.io.File;

/* loaded from: classes2.dex */
public final class zc implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ad f32247s;

    public zc(ad adVar) {
        this.f32247s = adVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j10;
        Context context = this.f32247s.f30934a;
        com.huawei.openalliance.ad.ppskit.handlers.f a10 = com.huawei.openalliance.ad.ppskit.handlers.f.a(context);
        try {
            synchronized (a10.f22533a) {
                j10 = a10.b().getLong("last_rpt_time_143", 0L);
            }
            n7.c("DbSizeMonitor", "lastRptTime:%s", Long.valueOf(j10));
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - j10 < 86400000) {
                n7.b("DbSizeMonitor", "rpt once time a day");
                return;
            }
            synchronized (a10.f22533a) {
                a10.b().edit().putLong("last_rpt_time_143", currentTimeMillis).commit();
            }
            File databasePath = context.createDeviceProtectedStorageContext().getDatabasePath("hiad_recd.db");
            if (databasePath.exists()) {
                new p(context).j(databasePath.length());
            }
        } catch (Throwable th) {
            n7.h("DbSizeMonitor", "check db size ex:%s", th.getClass().getSimpleName());
        }
    }
}
