package com.onesignal;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.onesignal.s2;

/* loaded from: classes2.dex */
public class SyncService extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        s2 c10 = s2.c();
        s2.a aVar = new s2.a(this);
        c10.getClass();
        e3.b(6, "OSBackground sync, calling initWithContext", null);
        e3.y(this);
        Thread thread = new Thread(aVar, "OS_SYNCSRV_BG_SYNC");
        c10.f26886b = thread;
        thread.start();
        return 1;
    }
}
