package com.google.android.gms.measurement.internal;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfs implements com.google.android.gms.internal.measurement.zzr {
    final /* synthetic */ zzfu zza;

    public zzfs(zzfu zzfuVar) {
        this.zza = zzfuVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public final void zza(int i10, String str, List list, boolean z10, boolean z11) {
        zzer zzc;
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        zzc = this.zza.zzt.zzaA().zzi();
                    } else if (z10) {
                        zzc = this.zza.zzt.zzaA().zzm();
                    } else if (!z11) {
                        zzc = this.zza.zzt.zzaA().zzl();
                    } else {
                        zzc = this.zza.zzt.zzaA().zzk();
                    }
                } else {
                    zzc = this.zza.zzt.zzaA().zzj();
                }
            } else if (z10) {
                zzc = this.zza.zzt.zzaA().zzh();
            } else if (!z11) {
                zzc = this.zza.zzt.zzaA().zze();
            } else {
                zzc = this.zza.zzt.zzaA().zzd();
            }
        } else {
            zzc = this.zza.zzt.zzaA().zzc();
        }
        int size = list.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    zzc.zza(str);
                    return;
                } else {
                    zzc.zzd(str, list.get(0), list.get(1), list.get(2));
                    return;
                }
            }
            zzc.zzc(str, list.get(0), list.get(1));
            return;
        }
        zzc.zzb(str, list.get(0));
    }
}
