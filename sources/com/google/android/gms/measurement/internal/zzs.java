package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.openalliance.ad.constant.av;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzs {
    private final zzgd zza;

    public zzs(zzgd zzgdVar) {
        this.zza = zzgdVar;
    }

    public final void zza(String str, Bundle bundle) {
        String uri;
        this.zza.zzaB().zzg();
        if (!this.zza.zzJ()) {
            if (bundle.isEmpty()) {
                uri = null;
            } else {
                if (true == str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str2 : bundle.keySet()) {
                    builder.appendQueryParameter(str2, bundle.getString(str2));
                }
                uri = builder.build().toString();
            }
            if (!TextUtils.isEmpty(uri)) {
                this.zza.zzm().zzq.zzb(uri);
                this.zza.zzm().zzr.zzb(this.zza.zzax().currentTimeMillis());
            }
        }
    }

    public final void zzb() {
        String str;
        this.zza.zzaB().zzg();
        if (!zzd()) {
            return;
        }
        if (zze()) {
            this.zza.zzm().zzq.zzb(null);
            Bundle bundle = new Bundle();
            bundle.putString(av.aq, "(not set)");
            bundle.putString("medium", "(not set)");
            bundle.putString("_cis", "intent");
            bundle.putLong("_cc", 1L);
            this.zza.zzq().zzG("auto", "_cmpx", bundle);
        } else {
            String zza = this.zza.zzm().zzq.zza();
            if (TextUtils.isEmpty(zza)) {
                this.zza.zzaA().zzh().zza("Cache still valid but referrer not found");
            } else {
                long zza2 = this.zza.zzm().zzr.zza() / 3600000;
                Uri parse = Uri.parse(zza);
                Bundle bundle2 = new Bundle();
                Pair pair = new Pair(parse.getPath(), bundle2);
                for (String str2 : parse.getQueryParameterNames()) {
                    bundle2.putString(str2, parse.getQueryParameter(str2));
                }
                ((Bundle) pair.second).putLong("_cc", (zza2 - 1) * 3600000);
                Object obj = pair.first;
                if (obj == null) {
                    str = "app";
                } else {
                    str = (String) obj;
                }
                this.zza.zzq().zzG(str, "_cmp", (Bundle) pair.second);
            }
            this.zza.zzm().zzq.zzb(null);
        }
        this.zza.zzm().zzr.zzb(0L);
    }

    public final void zzc() {
        if (zzd() && zze()) {
            this.zza.zzm().zzq.zzb(null);
        }
    }

    public final boolean zzd() {
        if (this.zza.zzm().zzr.zza() > 0) {
            return true;
        }
        return false;
    }

    public final boolean zze() {
        if (!zzd() || this.zza.zzax().currentTimeMillis() - this.zza.zzm().zzr.zza() <= this.zza.zzf().zzi(null, zzeg.zzS)) {
            return false;
        }
        return true;
    }
}
