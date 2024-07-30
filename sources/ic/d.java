package ic;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class d extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            String stringExtra = intent.getStringExtra(intent.getAction());
            String stringExtra2 = intent.getStringExtra("data");
            String[] stringArrayExtra = intent.getStringArrayExtra("denied");
            if (!TextUtils.isEmpty(stringExtra) && !TextUtils.isEmpty(stringExtra2)) {
                jc.b.a().f30207g = stringArrayExtra;
                jc.b a10 = jc.b.a();
                a10.getClass();
                rc.b.a().b(new jc.e(a10, stringExtra));
                jc.b.a().getClass();
                rc.b.a().b(new jc.f(stringExtra2));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
