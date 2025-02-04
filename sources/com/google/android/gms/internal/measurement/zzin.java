package com.google.android.gms.internal.measurement;

import a3.k;
import java.io.Serializable;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes2.dex */
final class zzin implements Serializable, zzim {
    final zzim zza;
    volatile transient boolean zzb;

    @CheckForNull
    transient Object zzc;

    public zzin(zzim zzimVar) {
        zzimVar.getClass();
        this.zza = zzimVar;
    }

    public final String toString() {
        Object obj;
        if (this.zzb) {
            obj = k.l("<supplier that returned ", String.valueOf(this.zzc), ">");
        } else {
            obj = this.zza;
        }
        return k.l("Suppliers.memoize(", obj.toString(), ")");
    }

    @Override // com.google.android.gms.internal.measurement.zzim
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this) {
                if (!this.zzb) {
                    Object zza = this.zza.zza();
                    this.zzc = zza;
                    this.zzb = true;
                    return zza;
                }
            }
        }
        return this.zzc;
    }
}
