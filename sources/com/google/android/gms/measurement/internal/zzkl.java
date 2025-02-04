package com.google.android.gms.measurement.internal;

import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzkl {
    final /* synthetic */ zzkp zza;
    private zzkk zzb;

    public zzkl(zzkp zzkpVar) {
        this.zza = zzkpVar;
    }

    public final void zza(long j10) {
        Handler handler;
        this.zzb = new zzkk(this, this.zza.zzt.zzax().currentTimeMillis(), j10);
        handler = this.zza.zzd;
        handler.postDelayed(this.zzb, 2000L);
    }

    public final void zzb() {
        Handler handler;
        this.zza.zzg();
        zzkk zzkkVar = this.zzb;
        if (zzkkVar != null) {
            handler = this.zza.zzd;
            handler.removeCallbacks(zzkkVar);
        }
        this.zza.zzt.zzm().zzm.zza(false);
        this.zza.zzm(false);
    }
}
