package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import java.util.Collections;
import java.util.List;
import r1.h;
import r1.j;
import s1.f;
import s1.j;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2675a = h.e("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        String str = f2675a;
        h.c().a(str, "Requesting diagnostics", new Throwable[0]);
        try {
            j b10 = j.b(context);
            r1.j a10 = new j.a(DiagnosticsWorker.class).a();
            b10.getClass();
            List singletonList = Collections.singletonList(a10);
            if (!singletonList.isEmpty()) {
                new f(b10, null, singletonList).i();
                return;
            }
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        } catch (IllegalStateException e10) {
            h.c().b(str, "WorkManager is not initialized", e10);
        }
    }
}
