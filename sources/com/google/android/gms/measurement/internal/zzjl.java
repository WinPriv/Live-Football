package com.google.android.gms.measurement.internal;

import a3.k;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzjl extends zzan {
    final /* synthetic */ zzjz zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjl(zzjz zzjzVar, zzgy zzgyVar) {
        super(zzgyVar);
        this.zza = zzjzVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzan
    public final void zzc() {
        k.q(this.zza.zzt, "Tasks have been queued for a long time");
    }
}
