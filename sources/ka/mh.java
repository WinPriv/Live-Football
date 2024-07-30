package ka;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.activity.SafeIntent;

/* loaded from: classes2.dex */
public final class mh extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            SafeIntent safeIntent = new SafeIntent(intent);
            String action = safeIntent.getAction();
            n7.f("HwAccountReceiver", "onReceive action: %s", action);
            if (!TextUtils.isEmpty(safeIntent.getPackage())) {
                n7.f("HwAccountReceiver", "duplicate broadcast to: %s", safeIntent.getPackage());
            } else if ("com.huawei.hwid.loginSuccess.anonymous".equalsIgnoreCase(action) || "com.huawei.hwid.ACTION_REMOVE_ACCOUNT".equalsIgnoreCase(action)) {
                com.huawei.openalliance.ad.ppskit.utils.f1.a(new li(context.getApplicationContext()), 1000L);
            }
        } catch (Throwable th) {
            n7.h("HwAccountReceiver", "onReceive Exception: %s", th.getClass().getSimpleName());
        }
    }
}
