package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class zzq implements Handler.Callback {
    final /* synthetic */ zzr zza;

    public /* synthetic */ zzq(zzr zzrVar, zzp zzpVar) {
        this.zza = zzrVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        HashMap hashMap5;
        int i10 = message.what;
        if (i10 == 0) {
            hashMap = this.zza.zzb;
            synchronized (hashMap) {
                zzn zznVar = (zzn) message.obj;
                hashMap2 = this.zza.zzb;
                zzo zzoVar = (zzo) hashMap2.get(zznVar);
                if (zzoVar != null && zzoVar.zzi()) {
                    if (zzoVar.zzj()) {
                        zzoVar.zzg("GmsClientSupervisor");
                    }
                    hashMap3 = this.zza.zzb;
                    hashMap3.remove(zznVar);
                }
            }
            return true;
        }
        if (i10 == 1) {
            hashMap4 = this.zza.zzb;
            synchronized (hashMap4) {
                zzn zznVar2 = (zzn) message.obj;
                hashMap5 = this.zza.zzb;
                zzo zzoVar2 = (zzo) hashMap5.get(zznVar2);
                if (zzoVar2 != null && zzoVar2.zza() == 3) {
                    String valueOf = String.valueOf(zznVar2);
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(valueOf), new Exception());
                    ComponentName zzb = zzoVar2.zzb();
                    if (zzb == null) {
                        zzb = zznVar2.zzb();
                    }
                    if (zzb == null) {
                        String zzd = zznVar2.zzd();
                        Preconditions.checkNotNull(zzd);
                        zzb = new ComponentName(zzd, "unknown");
                    }
                    zzoVar2.onServiceDisconnected(zzb);
                }
            }
            return true;
        }
        return false;
    }
}
