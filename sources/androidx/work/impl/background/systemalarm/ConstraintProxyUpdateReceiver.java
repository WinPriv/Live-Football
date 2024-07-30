package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import b2.i;
import r1.h;
import s1.j;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2637a = h.e("ConstrntProxyUpdtRecvr");

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Intent f2638s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Context f2639t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ BroadcastReceiver.PendingResult f2640u;

        public a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f2638s = intent;
            this.f2639t = context;
            this.f2640u = pendingResult;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BroadcastReceiver.PendingResult pendingResult = this.f2640u;
            Context context = this.f2639t;
            Intent intent = this.f2638s;
            try {
                boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                h.c().a(ConstraintProxyUpdateReceiver.f2637a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)), new Throwable[0]);
                i.a(context, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                i.a(context, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                i.a(context, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                i.a(context, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                pendingResult.finish();
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(str)) {
            h.c().a(f2637a, String.format("Ignoring unknown action %s", str), new Throwable[0]);
        } else {
            ((d2.b) j.b(context).f35075d).a(new a(intent, context, goAsync()));
        }
    }
}
