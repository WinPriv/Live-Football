package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.EnumMap;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzhb {
    public static final zzhb zza = new zzhb(null, null, 100);
    private final EnumMap zzb;
    private final int zzc;

    public zzhb(Boolean bool, Boolean bool2, int i10) {
        EnumMap enumMap = new EnumMap(zzha.class);
        this.zzb = enumMap;
        enumMap.put((EnumMap) zzha.AD_STORAGE, (zzha) bool);
        enumMap.put((EnumMap) zzha.ANALYTICS_STORAGE, (zzha) bool2);
        this.zzc = i10;
    }

    public static zzhb zzb(Bundle bundle, int i10) {
        if (bundle == null) {
            return new zzhb(null, null, i10);
        }
        EnumMap enumMap = new EnumMap(zzha.class);
        for (zzha zzhaVar : zzha.values()) {
            enumMap.put((EnumMap) zzhaVar, (zzha) zzp(bundle.getString(zzhaVar.zzd)));
        }
        return new zzhb(enumMap, i10);
    }

    public static zzhb zzc(String str, int i10) {
        EnumMap enumMap = new EnumMap(zzha.class);
        if (str != null) {
            int i11 = 0;
            while (true) {
                zzha[] zzhaVarArr = zzha.zzc;
                int length = zzhaVarArr.length;
                if (i11 >= 2) {
                    break;
                }
                zzha zzhaVar = zzhaVarArr[i11];
                int i12 = i11 + 2;
                if (i12 < str.length()) {
                    char charAt = str.charAt(i12);
                    Boolean bool = null;
                    if (charAt != '-') {
                        if (charAt != '0') {
                            if (charAt == '1') {
                                bool = Boolean.TRUE;
                            }
                        } else {
                            bool = Boolean.FALSE;
                        }
                    }
                    enumMap.put((EnumMap) zzhaVar, (zzha) bool);
                }
                i11++;
            }
        }
        return new zzhb(enumMap, i10);
    }

    public static String zzh(Bundle bundle) {
        String string;
        for (zzha zzhaVar : zzha.values()) {
            if (bundle.containsKey(zzhaVar.zzd) && (string = bundle.getString(zzhaVar.zzd)) != null && zzp(string) == null) {
                return string;
            }
        }
        return null;
    }

    public static boolean zzk(int i10, int i11) {
        if (i10 <= i11) {
            return true;
        }
        return false;
    }

    public static final int zzo(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        if (bool.booleanValue()) {
            return 1;
        }
        return 2;
    }

    private static Boolean zzp(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (!str.equals("denied")) {
            return null;
        }
        return Boolean.FALSE;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhb)) {
            return false;
        }
        zzhb zzhbVar = (zzhb) obj;
        for (zzha zzhaVar : zzha.values()) {
            if (zzo((Boolean) this.zzb.get(zzhaVar)) != zzo((Boolean) zzhbVar.zzb.get(zzhaVar))) {
                return false;
            }
        }
        if (this.zzc != zzhbVar.zzc) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10 = this.zzc * 17;
        Iterator it = this.zzb.values().iterator();
        while (it.hasNext()) {
            i10 = (i10 * 31) + zzo((Boolean) it.next());
        }
        return i10;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("settings: source=");
        sb2.append(this.zzc);
        for (zzha zzhaVar : zzha.values()) {
            sb2.append(", ");
            sb2.append(zzhaVar.name());
            sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
            Boolean bool = (Boolean) this.zzb.get(zzhaVar);
            if (bool == null) {
                sb2.append("uninitialized");
            } else {
                if (true != bool.booleanValue()) {
                    str = "denied";
                } else {
                    str = "granted";
                }
                sb2.append(str);
            }
        }
        return sb2.toString();
    }

    public final int zza() {
        return this.zzc;
    }

    public final zzhb zzd(zzhb zzhbVar) {
        boolean z10;
        EnumMap enumMap = new EnumMap(zzha.class);
        for (zzha zzhaVar : zzha.values()) {
            Boolean bool = (Boolean) this.zzb.get(zzhaVar);
            Boolean bool2 = (Boolean) zzhbVar.zzb.get(zzhaVar);
            if (bool == null) {
                bool = bool2;
            } else if (bool2 != null) {
                if (bool.booleanValue() && bool2.booleanValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bool = Boolean.valueOf(z10);
            }
            enumMap.put((EnumMap) zzhaVar, (zzha) bool);
        }
        return new zzhb(enumMap, 100);
    }

    public final zzhb zze(zzhb zzhbVar) {
        EnumMap enumMap = new EnumMap(zzha.class);
        for (zzha zzhaVar : zzha.values()) {
            Boolean bool = (Boolean) this.zzb.get(zzhaVar);
            if (bool == null) {
                bool = (Boolean) zzhbVar.zzb.get(zzhaVar);
            }
            enumMap.put((EnumMap) zzhaVar, (zzha) bool);
        }
        return new zzhb(enumMap, this.zzc);
    }

    public final Boolean zzf() {
        return (Boolean) this.zzb.get(zzha.AD_STORAGE);
    }

    public final Boolean zzg() {
        return (Boolean) this.zzb.get(zzha.ANALYTICS_STORAGE);
    }

    public final String zzi() {
        char c10;
        StringBuilder sb2 = new StringBuilder("G1");
        zzha[] zzhaVarArr = zzha.zzc;
        int length = zzhaVarArr.length;
        for (int i10 = 0; i10 < 2; i10++) {
            Boolean bool = (Boolean) this.zzb.get(zzhaVarArr[i10]);
            if (bool == null) {
                c10 = '-';
            } else if (bool.booleanValue()) {
                c10 = '1';
            } else {
                c10 = '0';
            }
            sb2.append(c10);
        }
        return sb2.toString();
    }

    public final boolean zzj(zzha zzhaVar) {
        Boolean bool = (Boolean) this.zzb.get(zzhaVar);
        if (bool != null && !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean zzl() {
        Iterator it = this.zzb.values().iterator();
        while (it.hasNext()) {
            if (((Boolean) it.next()) != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzm(zzhb zzhbVar) {
        return zzn(zzhbVar, (zzha[]) this.zzb.keySet().toArray(new zzha[0]));
    }

    public final boolean zzn(zzhb zzhbVar, zzha... zzhaVarArr) {
        for (zzha zzhaVar : zzhaVarArr) {
            Boolean bool = (Boolean) this.zzb.get(zzhaVar);
            Boolean bool2 = (Boolean) zzhbVar.zzb.get(zzhaVar);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public zzhb(EnumMap enumMap, int i10) {
        EnumMap enumMap2 = new EnumMap(zzha.class);
        this.zzb = enumMap2;
        enumMap2.putAll(enumMap);
        this.zzc = i10;
    }
}
