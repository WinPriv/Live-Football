package com.google.android.gms.measurement.internal;

import android.content.pm.PackageManager;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzkb extends zzku {
    public final zzfe zza;
    public final zzfe zzb;
    public final zzfe zzc;
    public final zzfe zzd;
    public final zzfe zze;
    private final Map zzg;

    public zzkb(zzlh zzlhVar) {
        super(zzlhVar);
        this.zzg = new HashMap();
        zzfi zzm = this.zzt.zzm();
        zzm.getClass();
        this.zza = new zzfe(zzm, "last_delete_stale", 0L);
        zzfi zzm2 = this.zzt.zzm();
        zzm2.getClass();
        this.zzb = new zzfe(zzm2, "backoff", 0L);
        zzfi zzm3 = this.zzt.zzm();
        zzm3.getClass();
        this.zzc = new zzfe(zzm3, "last_upload", 0L);
        zzfi zzm4 = this.zzt.zzm();
        zzm4.getClass();
        this.zzd = new zzfe(zzm4, "last_upload_attempt", 0L);
        zzfi zzm5 = this.zzt.zzm();
        zzm5.getClass();
        this.zze = new zzfe(zzm5, "midnight_offset", 0L);
    }

    @Deprecated
    public final Pair zza(String str) {
        zzka zzkaVar;
        AdvertisingIdClient.Info info;
        zzg();
        long elapsedRealtime = this.zzt.zzax().elapsedRealtime();
        zzka zzkaVar2 = (zzka) this.zzg.get(str);
        if (zzkaVar2 != null && elapsedRealtime < zzkaVar2.zzc) {
            return new Pair(zzkaVar2.zza, Boolean.valueOf(zzkaVar2.zzb));
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        long zzi = this.zzt.zzf().zzi(str, zzeg.zza) + elapsedRealtime;
        try {
            long zzi2 = this.zzt.zzf().zzi(str, zzeg.zzb);
            if (zzi2 > 0) {
                try {
                    info = AdvertisingIdClient.getAdvertisingIdInfo(this.zzt.zzaw());
                } catch (PackageManager.NameNotFoundException unused) {
                    if (zzkaVar2 != null && elapsedRealtime < zzkaVar2.zzc + zzi2) {
                        return new Pair(zzkaVar2.zza, Boolean.valueOf(zzkaVar2.zzb));
                    }
                    info = null;
                }
            } else {
                info = AdvertisingIdClient.getAdvertisingIdInfo(this.zzt.zzaw());
            }
        } catch (Exception e10) {
            this.zzt.zzaA().zzc().zzb("Unable to get advertising id", e10);
            zzkaVar = new zzka("", false, zzi);
        }
        if (info == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String id2 = info.getId();
        if (id2 != null) {
            zzkaVar = new zzka(id2, info.isLimitAdTrackingEnabled(), zzi);
        } else {
            zzkaVar = new zzka("", info.isLimitAdTrackingEnabled(), zzi);
        }
        this.zzg.put(str, zzkaVar);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(zzkaVar.zza, Boolean.valueOf(zzkaVar.zzb));
    }

    @Override // com.google.android.gms.measurement.internal.zzku
    public final boolean zzb() {
        return false;
    }

    public final Pair zzd(String str, zzhb zzhbVar) {
        if (zzhbVar.zzj(zzha.AD_STORAGE)) {
            return zza(str);
        }
        return new Pair("", Boolean.FALSE);
    }

    @Deprecated
    public final String zzf(String str, boolean z10) {
        String str2;
        zzg();
        if (z10) {
            str2 = (String) zza(str).first;
        } else {
            str2 = "00000000-0000-0000-0000-000000000000";
        }
        MessageDigest zzF = zzlp.zzF();
        if (zzF == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, zzF.digest(str2.getBytes())));
    }
}
