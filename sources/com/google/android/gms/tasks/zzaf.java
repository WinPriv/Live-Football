package com.google.android.gms.tasks;

import java.util.concurrent.ExecutionException;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* loaded from: classes2.dex */
public final class zzaf<T> implements zzae<T> {
    private final Object zza = new Object();
    private final int zzb;
    private final zzw zzc;

    @GuardedBy("mLock")
    private int zzd;

    @GuardedBy("mLock")
    private int zze;

    @GuardedBy("mLock")
    private int zzf;

    @GuardedBy("mLock")
    private Exception zzg;

    @GuardedBy("mLock")
    private boolean zzh;

    public zzaf(int i10, zzw zzwVar) {
        this.zzb = i10;
        this.zzc = zzwVar;
    }

    @GuardedBy("mLock")
    private final void zza() {
        if (this.zzd + this.zze + this.zzf == this.zzb) {
            if (this.zzg != null) {
                this.zzc.zza(new ExecutionException(this.zze + " out of " + this.zzb + " underlying tasks failed", this.zzg));
                return;
            }
            if (this.zzh) {
                this.zzc.zzc();
            } else {
                this.zzc.zzb(null);
            }
        }
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        synchronized (this.zza) {
            this.zzf++;
            this.zzh = true;
            zza();
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        synchronized (this.zza) {
            this.zze++;
            this.zzg = exc;
            zza();
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(T t10) {
        synchronized (this.zza) {
            this.zzd++;
            zza();
        }
    }
}
