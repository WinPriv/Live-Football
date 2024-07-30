package ib;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.handlers.ConfigSpHandler;
import com.huawei.openalliance.ad.ppskit.handlers.l0;
import com.huawei.openalliance.ad.ppskit.utils.m2;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import com.huawei.openalliance.ad.ppskit.utils.u1;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import com.huawei.openalliance.ad.ppskit.utils.z1;
import com.huawei.opendevice.open.IOaidManager;
import ka.n7;

/* loaded from: classes2.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static String f29517a = "";

    /* loaded from: classes2.dex */
    public static class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f29518s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ y f29519t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Boolean f29520u;

        public a(Context context, y yVar, Boolean bool) {
            this.f29518s = context;
            this.f29519t = yVar;
            this.f29520u = bool;
        }

        @Override // java.lang.Runnable
        public final void run() {
            y yVar = this.f29519t;
            Context context = this.f29518s;
            if (context == null) {
                return;
            }
            try {
                ContentResolver contentResolver = context.getContentResolver();
                if (contentResolver == null) {
                    return;
                }
                String c10 = yVar.c();
                String valueOf = String.valueOf(yVar.a());
                if (!TextUtils.isEmpty(c10) && !TextUtils.isEmpty(valueOf)) {
                    String string = Settings.Global.getString(contentResolver, "pps_oaid");
                    String string2 = Settings.Global.getString(contentResolver, "pps_track_limit");
                    v.f(contentResolver, "pps_oaid_digest");
                    v.f(contentResolver, "pps_oaid_digest_pss");
                    if (!TextUtils.equals(c10, string) || !TextUtils.equals(valueOf, string2)) {
                        if (n7.d()) {
                            n7.c("OaidSettingsUtil", "rewrite oaid: %s limit: %s", y1.j(c10), valueOf);
                        }
                        Settings.Global.putString(contentResolver, "pps_oaid", c10);
                        Settings.Global.putString(contentResolver, "pps_track_limit", valueOf);
                    }
                    Boolean bool = this.f29520u;
                    if (bool != null && bool.booleanValue()) {
                        v.h(context);
                        return;
                    }
                    return;
                }
                n7.e("OaidSettingsUtil", "oaid or limitTracking is empty");
            } catch (Throwable th) {
                e0.i.p(th, "exception happen ", "OaidSettingsUtil");
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f29521s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f29522t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ boolean f29523u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ boolean f29524v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Boolean f29525w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ y f29526x;

        public b(Context context, String str, boolean z10, boolean z11, Boolean bool, y yVar) {
            this.f29521s = context;
            this.f29522t = str;
            this.f29523u = z10;
            this.f29524v = z11;
            this.f29525w = bool;
            this.f29526x = yVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str = this.f29522t;
            Context context = this.f29521s;
            try {
                ContentResolver contentResolver = context.getContentResolver();
                if (contentResolver == null) {
                    return;
                }
                try {
                    v.f(contentResolver, "pps_oaid_digest");
                    v.f(contentResolver, "pps_oaid_digest_pss");
                } catch (Throwable th) {
                    n7.h("OaidSettingsUtil", "clearDigestSettings ex: %s", th.getClass().getSimpleName());
                }
                boolean d10 = v.d(context, str, Settings.Global.getString(contentResolver, "pps_oaid_c"));
                boolean z10 = this.f29523u;
                boolean z11 = this.f29524v;
                if (z10 || z11 || d10 || v.i(context)) {
                    n7.c("OaidSettingsUtil", "oaid reset: %s, switch change: %s, oaid settings change: %s", Boolean.valueOf(z10), Boolean.valueOf(z11), Boolean.valueOf(d10));
                    n7.b("OaidSettingsUtil", "refresh oaid");
                    com.huawei.openalliance.ad.ppskit.handlers.l.d(context).G(context.getPackageName()).edit().putLong("last_op_rf_time", System.currentTimeMillis()).commit();
                    Settings.Global.putString(contentResolver, "pps_oaid_c", m2.a(str, v.e(context, z11)));
                    v.f29517a = str;
                }
                Boolean bool = this.f29525w;
                if ((bool != null && bool.booleanValue()) || d10) {
                    v.h(context);
                }
                v.a(contentResolver, this.f29526x, z11);
            } catch (Throwable th2) {
                e0.i.p(th2, "exception happen ", "OaidSettingsUtil");
            }
        }
    }

    public static void a(ContentResolver contentResolver, y yVar, boolean z10) {
        try {
            boolean z11 = false;
            boolean z12 = yVar.d().getBoolean("user_oper_atc_switch", false);
            if (!z10 && !z12) {
                String string = Settings.Global.getString(contentResolver, "pps_oaid");
                String string2 = Settings.Global.getString(contentResolver, "pps_track_limit");
                if (TextUtils.equals(string, "00000000-0000-0000-0000-000000000000") && TextUtils.equals(Boolean.TRUE.toString(), string2)) {
                    z11 = true;
                }
                if (!z11) {
                    g(contentResolver, yVar.c(), String.valueOf(yVar.a()));
                    return;
                }
                return;
            }
            if (!z12) {
                yVar.d().edit().putBoolean("user_oper_atc_switch", true).apply();
            }
            g(contentResolver, "00000000-0000-0000-0000-000000000000", Boolean.TRUE.toString());
        } catch (Throwable th) {
            e0.i.p(th, "exception happen ", "OaidSettingsUtil");
        }
    }

    public static void b(Context context, y yVar, Boolean bool, boolean z10) {
        if (!z10 && !z1.g(context)) {
            n7.e("OaidSettingsUtil", "Current Used UserId is different from Current Process UserId.");
        } else {
            p2.a(new a(context, yVar, bool), 19);
        }
    }

    public static void c(Context context, y yVar, String str, Boolean bool, boolean z10, boolean z11, boolean z12) {
        if (context == null) {
            return;
        }
        if (!z10 && !z1.g(context)) {
            n7.e("OaidSettingsUtil", "Current Used UserId is different from Current Process UserId.");
        } else {
            p2.a(new b(context, str, z11, z12, bool, yVar), 19);
        }
    }

    public static boolean d(Context context, String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(f29517a)) {
            str3 = m2.c(str2, u1.i(context, false));
        } else {
            str3 = f29517a;
        }
        n7.c("OaidSettingsUtil", "o: %s, so: %s", y1.j(str), y1.j(str3));
        return true ^ TextUtils.equals(str, str3);
    }

    public static byte[] e(Context context, boolean z10) {
        long j10;
        long j11;
        boolean z11;
        String packageName = context.getPackageName();
        com.huawei.openalliance.ad.ppskit.handlers.l d10 = com.huawei.openalliance.ad.ppskit.handlers.l.d(context);
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (d10.f22585a) {
            j10 = d10.G(packageName).getLong("last_op_wk_rf_time", 0L);
        }
        ConfigSpHandler b10 = ConfigSpHandler.b(context);
        synchronized (b10.f22478a) {
            Long s10 = y1.s(b10.D("oaidWkIntvl"));
            if (s10 != null && s10.longValue() > 0) {
                j11 = s10.longValue() * 3600000;
            }
            j11 = 86400000;
        }
        if (currentTimeMillis - j10 < j11 && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            n7.b("OaidSettingsUtil", "refresh oaid work key");
            d10.G(packageName).edit().putLong("last_op_wk_rf_time", currentTimeMillis).commit();
        }
        return u1.i(context, z11);
    }

    public static void f(ContentResolver contentResolver, String str) {
        if (!TextUtils.isEmpty(Settings.Global.getString(contentResolver, str))) {
            Settings.Global.putString(contentResolver, str, null);
        }
    }

    public static void g(ContentResolver contentResolver, String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String string = Settings.Global.getString(contentResolver, "pps_oaid");
            String string2 = Settings.Global.getString(contentResolver, "pps_track_limit");
            if (!TextUtils.equals(str, string) || !TextUtils.equals(str2, string2)) {
                n7.c("OaidSettingsUtil", "rewrite oaid: %s limit: %s", y1.j(str), str2);
                Settings.Global.putString(contentResolver, "pps_oaid", str);
                Settings.Global.putString(contentResolver, "pps_track_limit", str2);
                return;
            }
            return;
        }
        n7.e("OaidSettingsUtil", "oaid or limitTracking is empty");
    }

    public static void h(Context context) {
        long j10;
        if (com.huawei.openalliance.ad.ppskit.utils.d0.m(context)) {
            IOaidManager B = androidx.activity.n.B(context);
            boolean z10 = true;
            B.setResetOaid(true);
            l0 a10 = l0.a(context);
            synchronized (a10.f22608a) {
                j10 = a10.f22609b.getSharedPreferences("ppskit_data", 4).getLong("oaid_key_last_send_time", 0L);
            }
            n7.f("OaidSettingsUtil", "LastSendTime is %s", Long.valueOf(j10));
            if (System.currentTimeMillis() - j10 < 60000) {
                n7.e("OaidSettingsUtil", "oaidchanged Broadcast send too frequently!");
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                synchronized (a10.f22608a) {
                    a10.f22609b.getSharedPreferences("ppskit_data", 4).edit().putLong("oaid_key_last_send_time", currentTimeMillis).apply();
                }
                z10 = false;
            }
            if (!z10) {
                B.setResetOaid(false);
                Intent intent = new Intent("com.huawei.opendevice.open.action.OAID_RESET");
                intent.setPackage(context.getPackageName());
                context.sendBroadcast(intent, "com.huawei.hms.permission.signatureOrSystem");
                n7.e("OaidSettingsUtil", "oaidchanged sendBroadcast successfully!");
            }
        }
    }

    public static boolean i(Context context) {
        long j10;
        long j11;
        String packageName = context.getPackageName();
        com.huawei.openalliance.ad.ppskit.handlers.l d10 = com.huawei.openalliance.ad.ppskit.handlers.l.d(context);
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (d10.f22585a) {
            j10 = d10.G(packageName).getLong("last_op_rf_time", 0L);
        }
        ConfigSpHandler b10 = ConfigSpHandler.b(context);
        synchronized (b10.f22478a) {
            Long s10 = y1.s(b10.D("oaidRfhIntrvl"));
            if (s10 != null && s10.longValue() > 0) {
                j11 = s10.longValue() * 60000;
            }
            j11 = 1800000;
        }
        if (currentTimeMillis - j10 >= j11) {
            return true;
        }
        return false;
    }
}
