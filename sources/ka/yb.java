package ka;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
public final class yb {
    public static void a(Context context) {
        n7.e("AlarmTools", "enter cancelAlarm(Action=com.huawei.android.ppskit.CHCHE_AD_ACTION");
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        Intent intent = new Intent("com.huawei.android.ppskit.CHCHE_AD_ACTION");
        intent.setPackage(context.getPackageName());
        alarmManager.cancel(PendingIntent.getBroadcast(context, 0, intent, 67108864));
    }
}
