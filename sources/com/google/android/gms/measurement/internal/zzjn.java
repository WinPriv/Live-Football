package com.google.android.gms.measurement.internal;

import a3.l;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzjn implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ zzjz zzb;

    public zzjn(zzjz zzjzVar, zzq zzqVar) {
        this.zzb = zzjzVar;
        this.zza = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzej zzejVar;
        zzjz zzjzVar = this.zzb;
        zzejVar = zzjzVar.zzb;
        if (zzejVar == null) {
            l.x(zzjzVar.zzt, "Failed to send consent settings to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzejVar.zzp(this.zza);
            this.zzb.zzQ();
        } catch (RemoteException e10) {
            this.zzb.zzt.zzaA().zzd().zzb("Failed to send consent settings to the service", e10);
        }
    }
}
