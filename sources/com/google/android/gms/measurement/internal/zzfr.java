package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import q.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfr extends g {
    final /* synthetic */ zzfu zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfr(zzfu zzfuVar, int i10) {
        super(20);
        this.zza = zzfuVar;
    }

    @Override // q.g
    public final /* bridge */ /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        Preconditions.checkNotEmpty(str);
        return zzfu.zzd(this.zza, str);
    }
}
