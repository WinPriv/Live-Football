package com.google.android.gms.measurement;

import a1.a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.zzfm;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
public final class AppMeasurementReceiver extends a implements zzfm.zza {
    private zzfm zza;

    public BroadcastReceiver.PendingResult doGoAsync() {
        return goAsync();
    }

    @Override // com.google.android.gms.measurement.internal.zzfm.zza
    public void doStartService(Context context, Intent intent) {
        a.startWakefulService(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.zza == null) {
            this.zza = new zzfm(this);
        }
        this.zza.zza(context, intent);
    }
}
