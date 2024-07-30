package com.google.android.gms.measurement.internal;

import a3.l;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzjc implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzlk zzc;
    final /* synthetic */ zzjz zzd;

    public zzjc(zzjz zzjzVar, zzq zzqVar, boolean z10, zzlk zzlkVar) {
        this.zzd = zzjzVar;
        this.zza = zzqVar;
        this.zzb = z10;
        this.zzc = zzlkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzej zzejVar;
        zzlk zzlkVar;
        zzjz zzjzVar = this.zzd;
        zzejVar = zzjzVar.zzb;
        if (zzejVar == null) {
            l.x(zzjzVar.zzt, "Discarding data. Failed to set user property");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        zzjz zzjzVar2 = this.zzd;
        if (this.zzb) {
            zzlkVar = null;
        } else {
            zzlkVar = this.zzc;
        }
        zzjzVar2.zzD(zzejVar, zzlkVar, this.zza);
        this.zzd.zzQ();
    }
}
