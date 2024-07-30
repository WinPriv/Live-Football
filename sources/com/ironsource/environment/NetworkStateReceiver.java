package com.ironsource.environment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;

/* loaded from: classes2.dex */
public class NetworkStateReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final ConnectivityManager f24624a;

    /* renamed from: b, reason: collision with root package name */
    public final j f24625b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24626c = false;

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            NetworkStateReceiver networkStateReceiver = NetworkStateReceiver.this;
            j jVar = networkStateReceiver.f24625b;
            if (jVar != null) {
                jVar.a(networkStateReceiver.f24626c);
            }
        }
    }

    public NetworkStateReceiver(Context context, j jVar) {
        this.f24625b = jVar;
        if (context != null) {
            this.f24624a = (ConnectivityManager) context.getSystemService("connectivity");
        }
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0020 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a() {
        /*
            r4 = this;
            boolean r0 = r4.f24626c
            r1 = 1
            r2 = 0
            android.net.ConnectivityManager r3 = r4.f24624a
            if (r3 == 0) goto L1a
            android.net.NetworkInfo r3 = r3.getActiveNetworkInfo()     // Catch: java.lang.Exception -> L1a
            if (r3 == 0) goto L16
            boolean r3 = r3.isConnectedOrConnecting()     // Catch: java.lang.Exception -> L1a
            if (r3 == 0) goto L16
            r3 = r1
            goto L17
        L16:
            r3 = r2
        L17:
            r4.f24626c = r3     // Catch: java.lang.Exception -> L1a
            goto L1c
        L1a:
            r4.f24626c = r2
        L1c:
            boolean r3 = r4.f24626c
            if (r0 == r3) goto L21
            return r1
        L21:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.environment.NetworkStateReceiver.a():boolean");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent != null && intent.getExtras() != null && a()) {
            com.ironsource.environment.e.c.f24668a.c(new a());
        }
    }
}
