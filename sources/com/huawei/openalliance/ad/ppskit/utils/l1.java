package com.huawei.openalliance.ad.ppskit.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import ka.n7;

/* loaded from: classes2.dex */
public final class l1 implements ServiceConnection {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f22890s;

    public l1(Context context) {
        this.f22890s = context;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Context context = this.f22890s;
        n7.e("OIdentifierManager", "HeyTap IdentifyService connected");
        try {
            String a10 = m1.a(context, iBinder);
            try {
                if (a10 != null && a10.length() != 0) {
                    m1.f22925b = a10;
                    context.unbindService(this);
                    return;
                }
                context.unbindService(this);
                return;
            } catch (Throwable th) {
                n7.h("OIdentifierManager", "HeyTap IdentifyService, unbind service error: %s", th.getClass().getSimpleName());
                return;
            }
            n7.g("OIdentifierManager", "HeyTap OUID get failed");
        } catch (Throwable th2) {
            try {
                n7.h("OIdentifierManager", "HeyTap IdentifyService, bind service error: %s", th2.getClass().getSimpleName());
                try {
                    context.unbindService(this);
                } catch (Throwable th3) {
                    n7.h("OIdentifierManager", "HeyTap IdentifyService, unbind service error: %s", th3.getClass().getSimpleName());
                }
            } catch (Throwable th4) {
                try {
                    context.unbindService(this);
                } catch (Throwable th5) {
                    n7.h("OIdentifierManager", "HeyTap IdentifyService, unbind service error: %s", th5.getClass().getSimpleName());
                }
                throw th4;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        n7.e("OIdentifierManager", "HeyTap IdentifyService disconnected");
    }
}
