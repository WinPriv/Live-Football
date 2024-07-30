package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzjb implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ zzjz zzd;

    public zzjb(zzjz zzjzVar, AtomicReference atomicReference, zzq zzqVar, boolean z10) {
        this.zzd = zzjzVar;
        this.zza = atomicReference;
        this.zzb = zzqVar;
        this.zzc = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zzjz zzjzVar;
        zzej zzejVar;
        synchronized (this.zza) {
            try {
                try {
                    zzjzVar = this.zzd;
                    zzejVar = zzjzVar.zzb;
                } catch (RemoteException e10) {
                    this.zzd.zzt.zzaA().zzd().zzb("Failed to get all user properties; remote exception", e10);
                    atomicReference = this.zza;
                }
                if (zzejVar == null) {
                    zzjzVar.zzt.zzaA().zzd().zza("Failed to get all user properties; not connected to service");
                    return;
                }
                Preconditions.checkNotNull(this.zzb);
                this.zza.set(zzejVar.zze(this.zzb, this.zzc));
                this.zzd.zzQ();
                atomicReference = this.zza;
                atomicReference.notify();
            } finally {
                this.zza.notify();
            }
        }
    }
}
