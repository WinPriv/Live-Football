package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzhs implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzik zzb;

    public zzhs(zzik zzikVar, long j10) {
        this.zzb = zzikVar;
        this.zza = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzL(this.zza, true);
        this.zzb.zzt.zzt().zzu(new AtomicReference());
    }
}
