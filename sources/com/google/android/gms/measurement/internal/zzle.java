package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzle {
    com.google.android.gms.internal.measurement.zzgd zza;
    List zzb;
    List zzc;
    long zzd;
    final /* synthetic */ zzlh zze;

    public /* synthetic */ zzle(zzlh zzlhVar, zzld zzldVar) {
        this.zze = zzlhVar;
    }

    private static final long zzb(com.google.android.gms.internal.measurement.zzft zzftVar) {
        return ((zzftVar.zzd() / 1000) / 60) / 60;
    }

    public final boolean zza(long j10, com.google.android.gms.internal.measurement.zzft zzftVar) {
        Preconditions.checkNotNull(zzftVar);
        if (this.zzc == null) {
            this.zzc = new ArrayList();
        }
        if (this.zzb == null) {
            this.zzb = new ArrayList();
        }
        if (!this.zzc.isEmpty() && zzb((com.google.android.gms.internal.measurement.zzft) this.zzc.get(0)) != zzb(zzftVar)) {
            return false;
        }
        long zzbz = this.zzd + zzftVar.zzbz();
        this.zze.zzg();
        if (zzbz >= Math.max(0, ((Integer) zzeg.zzi.zza(null)).intValue())) {
            return false;
        }
        this.zzd = zzbz;
        this.zzc.add(zzftVar);
        this.zzb.add(Long.valueOf(j10));
        int size = this.zzc.size();
        this.zze.zzg();
        if (size >= Math.max(1, ((Integer) zzeg.zzj.zza(null)).intValue())) {
            return false;
        }
        return true;
    }
}
