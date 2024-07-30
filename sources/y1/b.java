package y1;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.sdk.AppLovinEventTypes;
import r1.h;

/* compiled from: BatteryNotLowTracker.java */
/* loaded from: classes.dex */
public final class b extends c<Boolean> {

    /* renamed from: i, reason: collision with root package name */
    public static final String f36526i = h.e("BatteryNotLowTracker");

    public b(Context context, d2.a aVar) {
        super(context, aVar);
    }

    @Override // y1.d
    public final Object a() {
        Intent registerReceiver = this.f36531b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z10 = false;
        if (registerReceiver == null) {
            h.c().b(f36526i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        float intExtra = registerReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) / registerReceiver.getIntExtra("scale", -1);
        if (registerReceiver.getIntExtra("status", -1) == 1 || intExtra > 0.15f) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    @Override // y1.c
    public final IntentFilter e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // y1.c
    public final void f(Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        h.c().a(f36526i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (!action.equals("android.intent.action.BATTERY_OKAY")) {
            if (action.equals("android.intent.action.BATTERY_LOW")) {
                b(Boolean.FALSE);
                return;
            }
            return;
        }
        b(Boolean.TRUE);
    }
}
