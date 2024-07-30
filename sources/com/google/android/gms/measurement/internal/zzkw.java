package com.google.android.gms.measurement.internal;

import a3.l;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzrd;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzkw extends zzkt {
    public zzkw(zzlh zzlhVar) {
        super(zzlhVar);
    }

    private final String zzd(String str) {
        String zzi = this.zzf.zzm().zzi(str);
        if (!TextUtils.isEmpty(zzi)) {
            Uri parse = Uri.parse((String) zzeg.zzq.zza(null));
            Uri.Builder buildUpon = parse.buildUpon();
            buildUpon.authority(zzi + "." + parse.getAuthority());
            return buildUpon.build().toString();
        }
        return (String) zzeg.zzq.zza(null);
    }

    public final zzkv zza(String str) {
        String str2;
        zzrd.zzc();
        zzkv zzkvVar = null;
        if (this.zzt.zzf().zzs(null, zzeg.zzaq)) {
            l.A(this.zzt, "sgtm feature flag enabled.");
            zzh zzj = this.zzf.zzh().zzj(str);
            if (zzj == null) {
                return new zzkv(zzd(str));
            }
            if (zzj.zzap()) {
                l.A(this.zzt, "sgtm upload enabled in manifest.");
                com.google.android.gms.internal.measurement.zzff zze = this.zzf.zzm().zze(zzj.zzv());
                if (zze != null) {
                    String zzj2 = zze.zzj();
                    if (!TextUtils.isEmpty(zzj2)) {
                        String zzi = zze.zzi();
                        zzer zzj3 = this.zzt.zzaA().zzj();
                        if (true != TextUtils.isEmpty(zzi)) {
                            str2 = "N";
                        } else {
                            str2 = "Y";
                        }
                        zzj3.zzc("sgtm configured with upload_url, server_info", zzj2, str2);
                        if (TextUtils.isEmpty(zzi)) {
                            this.zzt.zzay();
                            zzkvVar = new zzkv(zzj2);
                        } else {
                            zzkvVar = new zzkv(zzj2, l.t("x-google-sgtm-server-info", zzi));
                        }
                    }
                }
            }
            if (zzkvVar != null) {
                return zzkvVar;
            }
        }
        return new zzkv(zzd(str));
    }
}
