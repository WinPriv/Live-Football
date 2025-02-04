package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzla implements Callable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ zzlh zzb;

    public zzla(zzlh zzlhVar, zzq zzqVar) {
        this.zzb = zzlhVar;
        this.zza = zzqVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzhb zzq = this.zzb.zzq((String) Preconditions.checkNotNull(this.zza.zza));
        zzha zzhaVar = zzha.ANALYTICS_STORAGE;
        if (zzq.zzj(zzhaVar) && zzhb.zzc(this.zza.zzv, 100).zzj(zzhaVar)) {
            return this.zzb.zzd(this.zza).zzw();
        }
        this.zzb.zzaA().zzj().zza("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
