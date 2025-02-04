package com.google.android.gms.measurement.internal;

import a3.l;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzjd implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ zzjz zzb;

    public zzjd(zzjz zzjzVar, zzq zzqVar) {
        this.zzb = zzjzVar;
        this.zza = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzej zzejVar;
        zzjz zzjzVar = this.zzb;
        zzejVar = zzjzVar.zzb;
        if (zzejVar == null) {
            l.x(zzjzVar.zzt, "Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzejVar.zzm(this.zza);
        } catch (RemoteException e10) {
            this.zzb.zzt.zzaA().zzd().zzb("Failed to reset data on the service: remote exception", e10);
        }
        this.zzb.zzQ();
    }
}
