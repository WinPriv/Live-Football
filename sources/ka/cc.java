package ka;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.handlers.ConfigSpHandler;
import java.util.Calendar;
import java.util.Random;

/* loaded from: classes2.dex */
public final class cc {

    /* renamed from: a, reason: collision with root package name */
    public static volatile a f31039a;

    /* loaded from: classes2.dex */
    public static class a extends BroadcastReceiver {

        /* renamed from: ka.cc$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0422a implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ Context f31040s;

            public RunnableC0422a(Context context) {
                this.f31040s = context;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bc bcVar;
                String concat;
                n7.e("CacheAdTriggerReceiver", "CacheAdTriggerReceiver trigger");
                Context context = this.f31040s;
                synchronized (bc.f30983b) {
                    if (bc.f30984c == null) {
                        bc.f30984c = new bc(context);
                    }
                    bcVar = bc.f30984c;
                }
                bcVar.getClass();
                n7.e("TvSplashManager", "startCache");
                try {
                    bcVar.f30985a.getContentResolver().query(oa.h.f33798c, null, null, null, null);
                } catch (IllegalArgumentException unused) {
                    concat = "startCache IllegalArgumentException";
                    n7.g("TvSplashManager", concat);
                    new jc.a(this.f31040s).c();
                } catch (Exception e10) {
                    concat = "startCache ".concat(e10.getClass().getSimpleName());
                    n7.g("TvSplashManager", concat);
                    new jc.a(this.f31040s).c();
                }
                new jc.a(this.f31040s).c();
            }
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            String simpleName;
            String str;
            boolean z10;
            try {
                if (TextUtils.equals("com.huawei.android.ppskit.CHCHE_AD_ACTION", intent.getAction())) {
                    cc.a(context);
                }
                if (Calendar.getInstance().get(11) < 8) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    n7.e("CacheAdTriggerReceiver", "currently is rest, not request");
                    return;
                }
                long nextInt = new Random().nextInt(120) * 1000;
                n7.c("CacheAdTriggerReceiver", "CacheAdTriggerReceiver delay: %s", Long.valueOf(nextInt));
                com.huawei.openalliance.ad.ppskit.utils.f1.a(new RunnableC0422a(context), nextInt);
            } catch (RuntimeException e10) {
                simpleName = e10.getClass().getSimpleName();
                str = "onReceive ";
                n7.g("CacheAdTriggerReceiver", str.concat(simpleName));
            } catch (Throwable th) {
                simpleName = th.getClass().getSimpleName();
                str = "onReceive ex: ";
                n7.g("CacheAdTriggerReceiver", str.concat(simpleName));
            }
        }
    }

    public static void a(Context context) {
        int i10;
        yb.a(context);
        Intent intent = new Intent("com.huawei.android.ppskit.CHCHE_AD_ACTION", Uri.parse("package:"));
        intent.setPackage(context.getPackageName());
        ConfigSpHandler b10 = ConfigSpHandler.b(context);
        synchronized (b10.f22478a) {
            i10 = b10.s().getInt("tv_cache_ad_interval", 60);
        }
        long j10 = i10 * com.huawei.openalliance.ad.constant.w.f22171t;
        n7.e("AlarmTools", "set window alarm interval:" + j10 + "ms,window:600000");
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (alarmManager == null) {
            n7.i("AlarmTools", "fail to get alarm manager");
            return;
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 201326592);
        long currentTimeMillis = j10 + System.currentTimeMillis();
        n7.c("AlarmTools", "next alarm time is %s", Long.valueOf(currentTimeMillis));
        alarmManager.setWindow(0, currentTimeMillis, 600000L, broadcast);
    }

    public static void b(Context context) {
        String str;
        if (!com.huawei.openalliance.ad.ppskit.utils.z1.P(context)) {
            return;
        }
        try {
            n7.e("TvSplashReqRegisterEntr", "unregister receiver");
            if (f31039a != null) {
                context.unregisterReceiver(f31039a);
                f31039a = null;
            }
        } catch (IllegalStateException unused) {
            str = "unregisterReceiver IllegalStateException";
            n7.g("TvSplashReqRegisterEntr", str);
        } catch (Throwable unused2) {
            str = "unregisterReceiver exception";
            n7.g("TvSplashReqRegisterEntr", str);
        }
    }
}
