package ic;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.activity.n;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class c extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ArrayList arrayList;
        intent.getAction();
        sc.a b10 = sc.c.a(context).b();
        if (b10 == null) {
            return;
        }
        if (n.I0 == null) {
            n.I0 = new n();
        }
        n nVar = n.I0;
        nVar.getClass();
        rc.b.a().b(new pc.c(nVar, b10));
        if ((pc.f.a() && b10.f35316m == 0) || (arrayList = b10.f35307c) == null || arrayList.size() <= 0 || !arrayList.contains(intent.getAction())) {
            return;
        }
        try {
            String stringExtra = intent.getStringExtra(b10.f35309e);
            String stringExtra2 = intent.getStringExtra(b10.f);
            intent.getStringExtra(b10.f35310g);
            String stringExtra3 = intent.getStringExtra(b10.f35311h);
            String stringExtra4 = intent.getStringExtra(b10.f35312i);
            rc.b.a().b(new pc.a(new b(intent.getIntExtra(b10.f35315l, 0), stringExtra2, b10, stringExtra3, stringExtra), b10, stringExtra3, intent.getStringExtra(b10.f35314k), stringExtra4));
        } catch (Throwable unused) {
        }
    }
}
