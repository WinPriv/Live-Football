package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.3.0 */
/* loaded from: classes2.dex */
final class zzdw extends zzch {
    private final com.google.android.gms.measurement.internal.zzhg zza;

    public zzdw(com.google.android.gms.measurement.internal.zzhg zzhgVar) {
        this.zza = zzhgVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final int zzd() {
        return System.identityHashCode(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final void zze(String str, String str2, Bundle bundle, long j10) {
        this.zza.onEvent(str, str2, bundle, j10);
    }
}
