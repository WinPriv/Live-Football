package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
final class zzki implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzkp zzb;

    public zzki(zzkp zzkpVar, long j10) {
        this.zzb = zzkpVar;
        this.zza = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkp.zzj(this.zzb, this.zza);
    }
}
