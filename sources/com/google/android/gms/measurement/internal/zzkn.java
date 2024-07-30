package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzph;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzkn {
    protected long zza;
    protected long zzb;
    final /* synthetic */ zzkp zzc;
    private final zzan zzd;

    public zzkn(zzkp zzkpVar) {
        this.zzc = zzkpVar;
        this.zzd = new zzkm(this, zzkpVar.zzt);
        long elapsedRealtime = zzkpVar.zzt.zzax().elapsedRealtime();
        this.zza = elapsedRealtime;
        this.zzb = elapsedRealtime;
    }

    public final void zza() {
        this.zzd.zzb();
        this.zza = 0L;
        this.zzb = 0L;
    }

    public final void zzb(long j10) {
        this.zzd.zzb();
    }

    public final void zzc(long j10) {
        this.zzc.zzg();
        this.zzd.zzb();
        this.zza = j10;
        this.zzb = j10;
    }

    public final boolean zzd(boolean z10, boolean z11, long j10) {
        this.zzc.zzg();
        this.zzc.zza();
        zzph.zzc();
        if (this.zzc.zzt.zzf().zzs(null, zzeg.zzaf)) {
            if (this.zzc.zzt.zzJ()) {
                this.zzc.zzt.zzm().zzj.zzb(this.zzc.zzt.zzax().currentTimeMillis());
            }
        } else {
            this.zzc.zzt.zzm().zzj.zzb(this.zzc.zzt.zzax().currentTimeMillis());
        }
        long j11 = j10 - this.zza;
        if (!z10 && j11 < 1000) {
            this.zzc.zzt.zzaA().zzj().zzb("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j11));
            return false;
        }
        if (!z11) {
            j11 = j10 - this.zzb;
            this.zzb = j10;
        }
        this.zzc.zzt.zzaA().zzj().zzb("Recording user engagement, ms", Long.valueOf(j11));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j11);
        zzlp.zzK(this.zzc.zzt.zzs().zzj(!this.zzc.zzt.zzf().zzu()), bundle, true);
        if (!z11) {
            this.zzc.zzt.zzq().zzG("auto", "_e", bundle);
        }
        this.zza = j10;
        this.zzd.zzb();
        this.zzd.zzd(3600000L);
        return true;
    }
}
