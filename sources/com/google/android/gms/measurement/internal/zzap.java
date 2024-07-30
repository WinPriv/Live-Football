package com.google.android.gms.measurement.internal;

import a3.k;
import a3.l;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzap {
    final String zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final zzas zzf;

    public zzap(zzgd zzgdVar, String str, String str2, String str3, long j10, long j11, Bundle bundle) {
        zzas zzasVar;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = true == TextUtils.isEmpty(str) ? null : str;
        this.zzd = j10;
        this.zze = j11;
        if (j11 != 0 && j11 > j10) {
            zzgdVar.zzaA().zzk().zzb("Event created with reverse previous/current timestamps. appId", zzet.zzn(str2));
        }
        if (bundle != null && !bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    zzgdVar.zzaA().zzd().zza("Param name can't be null");
                    it.remove();
                } else {
                    Object zzA = zzgdVar.zzv().zzA(next, bundle2.get(next));
                    if (zzA == null) {
                        zzgdVar.zzaA().zzk().zzb("Param value can't be null", zzgdVar.zzj().zze(next));
                        it.remove();
                    } else {
                        zzgdVar.zzv().zzP(bundle2, next, zzA);
                    }
                }
            }
            zzasVar = new zzas(bundle2);
        } else {
            zzasVar = new zzas(new Bundle());
        }
        this.zzf = zzasVar;
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        return l.p(k.o("Event{appId='", str, "', name='", str2, "', params="), this.zzf.toString(), "}");
    }

    public final zzap zza(zzgd zzgdVar, long j10) {
        return new zzap(zzgdVar, this.zzc, this.zza, this.zzb, this.zzd, j10, this.zzf);
    }

    private zzap(zzgd zzgdVar, String str, String str2, String str3, long j10, long j11, zzas zzasVar) {
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(zzasVar);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = true == TextUtils.isEmpty(str) ? null : str;
        this.zzd = j10;
        this.zze = j11;
        if (j11 != 0 && j11 > j10) {
            zzgdVar.zzaA().zzk().zzc("Event created with reverse previous/current timestamps. appId, name", zzet.zzn(str2), zzet.zzn(str3));
        }
        this.zzf = zzasVar;
    }
}
