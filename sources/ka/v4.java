package ka;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public final class v4 extends u4 {

    /* renamed from: u, reason: collision with root package name */
    public static v4 f31986u;

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f31987v = new byte[0];

    public v4(Context context) {
        super(context, "hiadkit.db", 74);
    }

    public static v4 Q(Context context) {
        v4 v4Var;
        synchronized (f31987v) {
            if (f31986u == null) {
                Context applicationContext = context.getApplicationContext();
                try {
                    Context createDeviceProtectedStorageContext = applicationContext.createDeviceProtectedStorageContext();
                    SharedPreferences sharedPreferences = createDeviceProtectedStorageContext.getSharedPreferences("pps_de_migration", 4);
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    if (!sharedPreferences.getBoolean("hiadkit.db", false)) {
                        if (!createDeviceProtectedStorageContext.moveDatabaseFrom(applicationContext, "hiadkit.db")) {
                            n7.g("DEMigrationHandler", "Failed to migrate hiadkit.db");
                        }
                        edit.putBoolean("hiadkit.db", true);
                        edit.apply();
                    }
                } catch (Throwable th) {
                    n7.g("DEMigrationHandler", "migrateFile ex: ".concat(th.getClass().getSimpleName()));
                }
                f31986u = new v4(context.getApplicationContext().createDeviceProtectedStorageContext());
            }
            u4.f31924t.incrementAndGet();
            v4Var = f31986u;
        }
        return v4Var;
    }

    @Override // ka.u4
    public final String d() {
        return "AdsCore.DbHelper";
    }

    @Override // ka.u4
    public final y6.m k() {
        return new x4(this);
    }
}
