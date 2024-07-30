package com.google.android.gms.measurement.internal;

import a3.k;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.ironsource.adapters.facebook.a;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzeo {
    protected static final AtomicReference zza = new AtomicReference();
    protected static final AtomicReference zzb = new AtomicReference();
    protected static final AtomicReference zzc = new AtomicReference();
    private final zzen zzd;

    public zzeo(zzen zzenVar) {
        this.zzd = zzenVar;
    }

    private static final String zzg(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        boolean z10;
        String str2;
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        Preconditions.checkNotNull(atomicReference);
        if (strArr.length == strArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkArgument(z10);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            Object obj = strArr[i10];
            if (str == obj || str.equals(obj)) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i10];
                    if (str2 == null) {
                        str2 = strArr2[i10] + "(" + strArr[i10] + ")";
                        strArr3[i10] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String zza(Object[] objArr) {
        String valueOf;
        if (objArr == null) {
            return ContentRecord.XRINFOLIST_NULL;
        }
        StringBuilder j10 = a.j("[");
        for (Object obj : objArr) {
            if (obj instanceof Bundle) {
                valueOf = zzb((Bundle) obj);
            } else {
                valueOf = String.valueOf(obj);
            }
            if (valueOf != null) {
                if (j10.length() != 1) {
                    j10.append(", ");
                }
                j10.append(valueOf);
            }
        }
        j10.append("]");
        return j10.toString();
    }

    public final String zzb(Bundle bundle) {
        String valueOf;
        if (bundle == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return bundle.toString();
        }
        StringBuilder j10 = a.j("Bundle[{");
        for (String str : bundle.keySet()) {
            if (j10.length() != 8) {
                j10.append(", ");
            }
            j10.append(zze(str));
            j10.append(ContainerUtils.KEY_VALUE_DELIMITER);
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                valueOf = zza(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                valueOf = zza((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                valueOf = zza(((ArrayList) obj).toArray());
            } else {
                valueOf = String.valueOf(obj);
            }
            j10.append(valueOf);
        }
        j10.append("}]");
        return j10.toString();
    }

    public final String zzc(zzau zzauVar) {
        String zzb2;
        if (!this.zzd.zza()) {
            return zzauVar.toString();
        }
        StringBuilder sb2 = new StringBuilder("origin=");
        sb2.append(zzauVar.zzc);
        sb2.append(",name=");
        sb2.append(zzd(zzauVar.zza));
        sb2.append(",params=");
        zzas zzasVar = zzauVar.zzb;
        if (zzasVar == null) {
            zzb2 = null;
        } else if (!this.zzd.zza()) {
            zzb2 = zzasVar.toString();
        } else {
            zzb2 = zzb(zzasVar.zzc());
        }
        sb2.append(zzb2);
        return sb2.toString();
    }

    public final String zzd(String str) {
        if (str == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return str;
        }
        return zzg(str, zzhc.zzc, zzhc.zza, zza);
    }

    public final String zze(String str) {
        if (str == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return str;
        }
        return zzg(str, zzhd.zzb, zzhd.zza, zzb);
    }

    public final String zzf(String str) {
        if (str == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return str;
        }
        if (str.startsWith("_exp_")) {
            return k.l("experiment_id(", str, ")");
        }
        return zzg(str, zzhe.zzb, zzhe.zza, zzc);
    }
}
