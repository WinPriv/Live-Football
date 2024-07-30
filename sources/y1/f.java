package y1;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import r1.h;

/* compiled from: StorageNotLowTracker.java */
/* loaded from: classes.dex */
public final class f extends c<Boolean> {

    /* renamed from: i, reason: collision with root package name */
    public static final String f36541i = h.e("StorageNotLowTracker");

    public f(Context context, d2.a aVar) {
        super(context, aVar);
    }

    @Override // y1.d
    public final Object a() {
        Intent registerReceiver = this.f36531b.registerReceiver(null, e());
        if (registerReceiver != null && registerReceiver.getAction() != null) {
            String action = registerReceiver.getAction();
            action.getClass();
            if (!action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                    return null;
                }
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    @Override // y1.c
    public final IntentFilter e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // y1.c
    public final void f(Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        h.c().a(f36541i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (!action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                b(Boolean.TRUE);
                return;
            }
            return;
        }
        b(Boolean.FALSE);
    }
}
