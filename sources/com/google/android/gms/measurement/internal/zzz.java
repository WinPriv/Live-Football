package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzoy;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzz extends zzy {
    final /* synthetic */ zzaa zza;
    private final com.google.android.gms.internal.measurement.zzet zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzz(zzaa zzaaVar, String str, int i10, com.google.android.gms.internal.measurement.zzet zzetVar) {
        super(str, i10);
        this.zza = zzaaVar;
        this.zzh = zzetVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzy
    public final int zza() {
        return this.zzh.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzy
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzy
    public final boolean zzc() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean zzd(Long l10, Long l11, com.google.android.gms.internal.measurement.zzgm zzgmVar, boolean z10) {
        Object[] objArr;
        Object obj;
        zzoy.zzc();
        boolean zzs = this.zza.zzt.zzf().zzs(this.zzb, zzeg.zzW);
        boolean zzg = this.zzh.zzg();
        boolean zzh = this.zzh.zzh();
        boolean zzi = this.zzh.zzi();
        if (!zzg && !zzh && !zzi) {
            objArr = false;
        } else {
            objArr = true;
        }
        Boolean bool = null;
        Integer num = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        if (z10 && objArr == false) {
            zzer zzj = this.zza.zzt.zzaA().zzj();
            Integer valueOf = Integer.valueOf(this.zzc);
            if (this.zzh.zzj()) {
                num = Integer.valueOf(this.zzh.zza());
            }
            zzj.zzc("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", valueOf, num);
            return true;
        }
        com.google.android.gms.internal.measurement.zzem zzb = this.zzh.zzb();
        boolean zzg2 = zzb.zzg();
        if (zzgmVar.zzr()) {
            if (!zzb.zzi()) {
                this.zza.zzt.zzaA().zzk().zzb("No number filter for long property. property", this.zza.zzt.zzj().zzf(zzgmVar.zzf()));
            } else {
                bool = zzy.zzj(zzy.zzh(zzgmVar.zzb(), zzb.zzc()), zzg2);
            }
        } else if (zzgmVar.zzq()) {
            if (!zzb.zzi()) {
                this.zza.zzt.zzaA().zzk().zzb("No number filter for double property. property", this.zza.zzt.zzj().zzf(zzgmVar.zzf()));
            } else {
                bool = zzy.zzj(zzy.zzg(zzgmVar.zza(), zzb.zzc()), zzg2);
            }
        } else if (zzgmVar.zzt()) {
            if (!zzb.zzk()) {
                if (!zzb.zzi()) {
                    this.zza.zzt.zzaA().zzk().zzb("No string or number filter defined. property", this.zza.zzt.zzj().zzf(zzgmVar.zzf()));
                } else if (zzlj.zzy(zzgmVar.zzg())) {
                    bool = zzy.zzj(zzy.zzi(zzgmVar.zzg(), zzb.zzc()), zzg2);
                } else {
                    this.zza.zzt.zzaA().zzk().zzc("Invalid user property value for Numeric number filter. property, value", this.zza.zzt.zzj().zzf(zzgmVar.zzf()), zzgmVar.zzg());
                }
            } else {
                bool = zzy.zzj(zzy.zzf(zzgmVar.zzg(), zzb.zzd(), this.zza.zzt.zzaA()), zzg2);
            }
        } else {
            this.zza.zzt.zzaA().zzk().zzb("User property has no value, property", this.zza.zzt.zzj().zzf(zzgmVar.zzf()));
        }
        zzer zzj2 = this.zza.zzt.zzaA().zzj();
        if (bool == null) {
            obj = "null";
        } else {
            obj = bool;
        }
        zzj2.zzb("Property filter result", obj);
        if (bool == null) {
            return false;
        }
        this.zzd = Boolean.TRUE;
        if (zzi && !bool.booleanValue()) {
            return true;
        }
        if (!z10 || this.zzh.zzg()) {
            this.zze = bool;
        }
        if (bool.booleanValue() && objArr != false && zzgmVar.zzs()) {
            long zzc = zzgmVar.zzc();
            if (l10 != null) {
                zzc = l10.longValue();
            }
            if (zzs && this.zzh.zzg() && !this.zzh.zzh() && l11 != null) {
                zzc = l11.longValue();
            }
            if (this.zzh.zzh()) {
                this.zzg = Long.valueOf(zzc);
            } else {
                this.zzf = Long.valueOf(zzc);
            }
        }
        return true;
    }
}
