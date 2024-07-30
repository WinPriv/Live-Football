package com.onesignal;

import android.content.ComponentName;

/* compiled from: OneSignalChromeTab.java */
/* loaded from: classes2.dex */
public final class n3 extends m.k {

    /* renamed from: t, reason: collision with root package name */
    public final String f26940t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f26941u = true;

    public n3(String str) {
        this.f26940t = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    @Override // m.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(m.k.a r6) {
        /*
            r5 = this;
            a.b r0 = r6.f32619a
            r1 = 0
            r0.d(r1)     // Catch: android.os.RemoteException -> L7
        L7:
            m.d r1 = new m.d
            r1.<init>()
            r2 = 0
            boolean r3 = r0.c(r1)     // Catch: android.os.RemoteException -> L1c
            if (r3 != 0) goto L14
            goto L1c
        L14:
            m.l r3 = new m.l
            android.content.ComponentName r6 = r6.f32620b
            r3.<init>(r0, r1, r6)
            goto L1d
        L1c:
            r3 = r2
        L1d:
            if (r3 != 0) goto L20
            return
        L20:
            java.lang.String r6 = r5.f26940t
            android.net.Uri r6 = android.net.Uri.parse(r6)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            android.app.PendingIntent r1 = r3.f32632d
            if (r1 == 0) goto L34
            java.lang.String r4 = "android.support.customtabs.extra.SESSION_ID"
            r0.putParcelable(r4, r1)
        L34:
            a.b r1 = r3.f32629a     // Catch: android.os.RemoteException -> L3b
            a.a r4 = r3.f32630b     // Catch: android.os.RemoteException -> L3b
            r1.f(r4, r6, r0, r2)     // Catch: android.os.RemoteException -> L3b
        L3b:
            boolean r0 = r5.f26941u
            if (r0 == 0) goto L57
            m.i$b r0 = new m.i$b
            r0.<init>(r3)
            m.i r0 = r0.a()
            android.content.Intent r0 = r0.f32621a
            r0.setData(r6)
            r6 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r6)
            android.content.Context r6 = com.onesignal.e3.f26748b
            r6.startActivity(r0, r2)
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.n3.a(m.k$a):void");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
