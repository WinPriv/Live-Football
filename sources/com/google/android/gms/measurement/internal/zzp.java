package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.3.0 */
/* loaded from: classes2.dex */
final class zzp implements zzhg {
    public final com.google.android.gms.internal.measurement.zzci zza;
    final /* synthetic */ AppMeasurementDynamiteService zzb;

    public zzp(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzci zzciVar) {
        this.zzb = appMeasurementDynamiteService;
        this.zza = zzciVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzhg
    public final void onEvent(String str, String str2, Bundle bundle, long j10) {
        try {
            this.zza.zze(str, str2, bundle, j10);
        } catch (RemoteException e10) {
            zzgd zzgdVar = this.zzb.zza;
            if (zzgdVar != null) {
                zzgdVar.zzaA().zzk().zzb("Event listener threw exception", e10);
            }
        }
    }
}
