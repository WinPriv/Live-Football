package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
final class zzho implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzik zzb;

    public zzho(zzik zzikVar, long j10) {
        this.zzb = zzikVar;
        this.zza = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzt.zzm().zzf.zzb(this.zza);
        this.zzb.zzt.zzaA().zzc().zzb("Session timeout duration set", Long.valueOf(this.zza));
    }
}
