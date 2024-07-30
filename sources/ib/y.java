package ib;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.handlers.ConfigSpHandler;
import java.util.UUID;
import ka.n7;

/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final Context f29529a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f29530b;

    public y(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f29530b = applicationContext;
        Context createDeviceProtectedStorageContext = applicationContext.createDeviceProtectedStorageContext();
        this.f29529a = createDeviceProtectedStorageContext;
        SharedPreferences sharedPreferences = createDeviceProtectedStorageContext.getSharedPreferences("pps_opendevice", 4);
        try {
            if (TextUtils.isEmpty(sharedPreferences.getString("oaid", ""))) {
                n7.b("PpsOpenDevicePreference", "read from DE region");
                SharedPreferences sharedPreferences2 = createDeviceProtectedStorageContext.getSharedPreferences("opendevice", 4);
                String string = sharedPreferences2.getString("oaid", "");
                boolean z10 = sharedPreferences2.getBoolean("oaid_track_limit", false);
                boolean z11 = sharedPreferences2.getBoolean("oaid_disable_collection", false);
                if (TextUtils.isEmpty(string)) {
                    n7.b("PpsOpenDevicePreference", "read from CE region");
                    try {
                        sharedPreferences2 = context.getSharedPreferences("opendevice", 4);
                        string = sharedPreferences2.getString("oaid", "");
                        z10 = sharedPreferences2.getBoolean("oaid_track_limit", false);
                        z11 = sharedPreferences2.getBoolean("oaid_disable_collection", false);
                    } catch (Throwable th) {
                        n7.g("PpsOpenDevicePreference", "fail to access sp in CE region ".concat(th.getClass().getSimpleName()));
                        sharedPreferences2 = null;
                    }
                }
                if (!TextUtils.isEmpty(string)) {
                    n7.b("PpsOpenDevicePreference", "previous oaid exists, write to current sp");
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putString("oaid", string);
                    edit.putBoolean("oaid_track_limit", z10);
                    edit.putBoolean("oaid_disable_collection", z11);
                    edit.apply();
                    if (sharedPreferences2 != null) {
                        SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                        edit2.remove("oaid");
                        edit2.remove("oaid_track_limit");
                        edit2.remove("oaid_disable_collection");
                        edit2.apply();
                    }
                }
            }
        } catch (Throwable th2) {
            e0.i.p(th2, "migrateOldSp ", "PpsOpenDevicePreference");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        if (android.text.TextUtils.equals(r3.toString(), r0) == false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a() {
        /*
            r6 = this;
            android.content.Context r0 = r6.f29530b
            boolean r0 = ka.Cif.c(r0)
            r1 = 1
            if (r0 == 0) goto L7b
            android.content.Context r0 = r6.f29530b
            boolean r0 = com.huawei.openalliance.ad.ppskit.utils.e0.a(r0)
            if (r0 == 0) goto L12
            goto L7b
        L12:
            android.content.Context r0 = r6.f29530b
            ka.l r0 = ka.Cif.a(r0)
            boolean r0 = r0.d()
            if (r0 != 0) goto L6f
            android.content.Context r0 = r6.f29530b
            byte[] r2 = ib.o.f29508c
            monitor-enter(r2)
            ib.o r3 = ib.o.f29507b     // Catch: java.lang.Throwable -> L6c
            if (r3 != 0) goto L2e
            ib.o r3 = new ib.o     // Catch: java.lang.Throwable -> L6c
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L6c
            ib.o.f29507b = r3     // Catch: java.lang.Throwable -> L6c
        L2e:
            ib.o r0 = ib.o.f29507b     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6c
            r0.getClass()
            byte[] r3 = ib.o.f29509d
            monitor-enter(r3)
            android.content.SharedPreferences r2 = r0.h()     // Catch: java.lang.Throwable -> L69
            java.lang.String r4 = "legal_interest_click_next"
            r5 = 0
            java.lang.String r2 = r2.getString(r4, r5)     // Catch: java.lang.Throwable -> L69
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L69
            monitor-enter(r3)
            android.content.SharedPreferences r0 = r0.h()     // Catch: java.lang.Throwable -> L66
            java.lang.String r4 = "legal_interest_open_oaid"
            java.lang.String r0 = r0.getString(r4, r5)     // Catch: java.lang.Throwable -> L66
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L66
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            java.lang.String r4 = r3.toString()
            boolean r2 = android.text.TextUtils.equals(r4, r2)
            if (r2 != 0) goto L6f
            java.lang.String r2 = r3.toString()
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            if (r0 != 0) goto L6f
            goto L70
        L66:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L66
            throw r0
        L69:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L69
            throw r0
        L6c:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6c
            throw r0
        L6f:
            r1 = 0
        L70:
            android.content.SharedPreferences r0 = r6.d()
            java.lang.String r2 = "oaid_track_limit"
            boolean r0 = r0.getBoolean(r2, r1)
            return r0
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ib.y.a():boolean");
    }

    public final String b() {
        String uuid = UUID.randomUUID().toString();
        if (!TextUtils.isEmpty(uuid)) {
            d().edit().putString("oaid", uuid).apply();
        }
        return uuid;
    }

    public final String c() {
        if (a() && 1 != f()) {
            return "00000000-0000-0000-0000-000000000000";
        }
        return e();
    }

    public final SharedPreferences d() {
        return this.f29529a.getSharedPreferences("pps_opendevice", 4);
    }

    public final String e() {
        String string = d().getString("oaid", "");
        if (TextUtils.isEmpty(string)) {
            String uuid = UUID.randomUUID().toString();
            d().edit().putString("oaid", uuid).apply();
            return uuid;
        }
        return string;
    }

    public final int f() {
        int i10;
        ConfigSpHandler b10 = ConfigSpHandler.b(this.f29530b);
        synchronized (b10.f22478a) {
            i10 = b10.s().getInt("kit_oaid_mode", 0);
        }
        n7.e("PpsOpenDevicePreference", "getOaidMode: " + i10);
        return i10;
    }
}
