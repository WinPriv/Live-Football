package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzja implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzq zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zze;
    final /* synthetic */ zzjz zzf;

    public zzja(zzjz zzjzVar, String str, String str2, zzq zzqVar, boolean z10, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzf = zzjzVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzqVar;
        this.zzd = z10;
        this.zze = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        RemoteException e10;
        zzej zzejVar;
        Bundle bundle2 = new Bundle();
        try {
            zzjz zzjzVar = this.zzf;
            zzejVar = zzjzVar.zzb;
            if (zzejVar == null) {
                zzjzVar.zzt.zzaA().zzd().zzc("Failed to get user properties; not connected to service", this.zza, this.zzb);
                this.zzf.zzt.zzv().zzS(this.zze, bundle2);
                return;
            }
            Preconditions.checkNotNull(this.zzc);
            List<zzlk> zzh = zzejVar.zzh(this.zza, this.zzb, this.zzd, this.zzc);
            bundle = new Bundle();
            if (zzh != null) {
                for (zzlk zzlkVar : zzh) {
                    String str = zzlkVar.zze;
                    if (str != null) {
                        bundle.putString(zzlkVar.zzb, str);
                    } else {
                        Long l10 = zzlkVar.zzd;
                        if (l10 != null) {
                            bundle.putLong(zzlkVar.zzb, l10.longValue());
                        } else {
                            Double d10 = zzlkVar.zzg;
                            if (d10 != null) {
                                bundle.putDouble(zzlkVar.zzb, d10.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                try {
                    this.zzf.zzQ();
                    this.zzf.zzt.zzv().zzS(this.zze, bundle);
                } catch (RemoteException e11) {
                    e10 = e11;
                    this.zzf.zzt.zzaA().zzd().zzc("Failed to get user properties; remote exception", this.zza, e10);
                    this.zzf.zzt.zzv().zzS(this.zze, bundle);
                }
            } catch (Throwable th) {
                th = th;
                bundle2 = bundle;
                this.zzf.zzt.zzv().zzS(this.zze, bundle2);
                throw th;
            }
        } catch (RemoteException e12) {
            bundle = bundle2;
            e10 = e12;
        } catch (Throwable th2) {
            th = th2;
            this.zzf.zzt.zzv().zzS(this.zze, bundle2);
            throw th;
        }
    }
}
