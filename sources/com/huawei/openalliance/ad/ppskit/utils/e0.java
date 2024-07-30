package com.huawei.openalliance.ad.ppskit.utils;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.handlers.ConfigSpHandler;
import ka.n7;

/* loaded from: classes2.dex */
public abstract class e0 {

    /* loaded from: classes2.dex */
    public static class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f22839s;

        public a(Context context) {
            this.f22839s = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Context context = this.f22839s;
            try {
                f1.f22845a.c(new c(context), "retry_msg", 10000L);
                com.huawei.openalliance.ad.ppskit.handlers.x.k(0, context);
            } catch (Throwable th) {
                n7.h("CoreAccountUtil", "readIsChildAccount exception. %s", th.getClass().getSimpleName());
            }
        }
    }

    public static boolean a(Context context) {
        boolean z10;
        boolean z11;
        long j10;
        if (1 == i2.j(context, true)) {
            z10 = true;
        } else {
            z10 = false;
        }
        ConfigSpHandler b10 = ConfigSpHandler.b(context);
        synchronized (b10.f22478a) {
            z11 = b10.s().getBoolean("is_child_account", false);
        }
        com.huawei.openalliance.ad.ppskit.handlers.l0 a10 = com.huawei.openalliance.ad.ppskit.handlers.l0.a(context);
        synchronized (a10.f22608a) {
            j10 = a10.f22609b.getSharedPreferences("ppskit_data", 4).getLong("account_info_last_query_time", 0L);
        }
        n7.b("AccountInfoUtil", "lastReadTime is " + j10);
        if (System.currentTimeMillis() - j10 >= 86400000) {
            b(context);
            n7.f("AccountInfoUtil", "parent control child: %s, child account: %s", Boolean.valueOf(z10), Boolean.valueOf(z11));
        } else {
            n7.b("AccountInfoUtil", "query account info frequently");
        }
        if (z10 || z11) {
            return true;
        }
        return false;
    }

    public static void b(Context context) {
        if (d0.m(context)) {
            com.huawei.openalliance.ad.ppskit.handlers.l0 a10 = com.huawei.openalliance.ad.ppskit.handlers.l0.a(context);
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (a10.f22608a) {
                a10.f22609b.getSharedPreferences("ppskit_data", 4).edit().putLong("account_info_last_query_time", currentTimeMillis).apply();
            }
            p2.a(new a(context), 3);
        }
    }
}
