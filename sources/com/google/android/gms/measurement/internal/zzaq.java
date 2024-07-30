package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
final class zzaq {
    final String zza;
    final String zzb;
    final long zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final Long zzh;
    final Long zzi;
    final Long zzj;
    final Boolean zzk;

    public zzaq(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l10, Long l11, Long l12, Boolean bool) {
        boolean z10;
        boolean z11;
        boolean z12;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkArgument(z10);
        if (j11 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkArgument(z11);
        if (j12 >= 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        Preconditions.checkArgument(z12);
        Preconditions.checkArgument(j14 >= 0);
        this.zza = str;
        this.zzb = str2;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = j12;
        this.zzf = j13;
        this.zzg = j14;
        this.zzh = l10;
        this.zzi = l11;
        this.zzj = l12;
        this.zzk = bool;
    }

    public final zzaq zza(Long l10, Long l11, Boolean bool) {
        if (bool != null) {
            bool.booleanValue();
        }
        return new zzaq(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, l10, l11, bool);
    }

    public final zzaq zzb(long j10, long j11) {
        return new zzaq(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, j10, Long.valueOf(j11), this.zzi, this.zzj, this.zzk);
    }

    public final zzaq zzc(long j10) {
        return new zzaq(this.zza, this.zzb, this.zzc, this.zzd, this.zze, j10, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk);
    }
}
