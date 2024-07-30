package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zaq;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@SuppressLint({"HandlerLeak"})
/* loaded from: classes2.dex */
public final class zac extends zaq {
    final /* synthetic */ GoogleApiAvailability zaa;
    private final Context zab;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zac(com.google.android.gms.common.GoogleApiAvailability r1, android.content.Context r2) {
        /*
            r0 = this;
            r0.zaa = r1
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r1 != 0) goto Ld
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            goto L11
        Ld:
            android.os.Looper r1 = android.os.Looper.myLooper()
        L11:
            r0.<init>(r1)
            android.content.Context r1 = r2.getApplicationContext()
            r0.zab = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.zac.<init>(com.google.android.gms.common.GoogleApiAvailability, android.content.Context):void");
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append("Don't know how to handle this message: ");
            sb2.append(i10);
            Log.w("GoogleApiAvailability", sb2.toString());
            return;
        }
        int isGooglePlayServicesAvailable = this.zaa.isGooglePlayServicesAvailable(this.zab);
        if (this.zaa.isUserResolvableError(isGooglePlayServicesAvailable)) {
            this.zaa.showErrorNotification(this.zab, isGooglePlayServicesAvailable);
        }
    }
}
