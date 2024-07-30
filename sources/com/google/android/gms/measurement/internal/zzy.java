package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzy {
    final String zzb;
    final int zzc;
    Boolean zzd;
    Boolean zze;
    Long zzf;
    Long zzg;

    public zzy(String str, int i10) {
        this.zzb = str;
        this.zzc = i10;
    }

    private static Boolean zzd(String str, int i10, boolean z10, String str2, List list, String str3, zzet zzetVar) {
        int i11;
        if (i10 == 7) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z10 && i10 != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i10 - 1) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                if (true != z10) {
                    i11 = 66;
                } else {
                    i11 = 0;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, i11).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (zzetVar != null) {
                        zzetVar.zzk().zzb("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                if (list == null) {
                    return null;
                }
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    public static Boolean zze(BigDecimal bigDecimal, com.google.android.gms.internal.measurement.zzer zzerVar, double d10) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        Preconditions.checkNotNull(zzerVar);
        if (zzerVar.zzg()) {
            boolean z10 = true;
            if (zzerVar.zzm() != 1) {
                if (zzerVar.zzm() == 5) {
                    if (!zzerVar.zzk() || !zzerVar.zzj()) {
                        return null;
                    }
                } else if (!zzerVar.zzh()) {
                    return null;
                }
                int zzm = zzerVar.zzm();
                if (zzerVar.zzm() == 5) {
                    if (zzlj.zzy(zzerVar.zze()) && zzlj.zzy(zzerVar.zzd())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(zzerVar.zze());
                            bigDecimal4 = new BigDecimal(zzerVar.zzd());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                }
                if (!zzlj.zzy(zzerVar.zzc())) {
                    return null;
                }
                try {
                    bigDecimal2 = new BigDecimal(zzerVar.zzc());
                    bigDecimal3 = null;
                    bigDecimal4 = null;
                } catch (NumberFormatException unused2) {
                }
                if (zzm == 5) {
                    if (bigDecimal3 == null) {
                        return null;
                    }
                } else if (bigDecimal2 == null) {
                    return null;
                }
                int i10 = zzm - 1;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4 || bigDecimal3 == null) {
                                return null;
                            }
                            if (bigDecimal.compareTo(bigDecimal3) < 0 || bigDecimal.compareTo(bigDecimal4) > 0) {
                                z10 = false;
                            }
                            return Boolean.valueOf(z10);
                        }
                        if (bigDecimal2 == null) {
                            return null;
                        }
                        if (d10 != 0.0d) {
                            if (bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d10).multiply(new BigDecimal(2)))) <= 0 || bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d10).multiply(new BigDecimal(2)))) >= 0) {
                                z10 = false;
                            }
                            return Boolean.valueOf(z10);
                        }
                        if (bigDecimal.compareTo(bigDecimal2) != 0) {
                            z10 = false;
                        }
                        return Boolean.valueOf(z10);
                    }
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    if (bigDecimal.compareTo(bigDecimal2) <= 0) {
                        z10 = false;
                    }
                    return Boolean.valueOf(z10);
                }
                if (bigDecimal2 == null) {
                    return null;
                }
                if (bigDecimal.compareTo(bigDecimal2) >= 0) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }
        }
        return null;
    }

    public static Boolean zzf(String str, com.google.android.gms.internal.measurement.zzey zzeyVar, zzet zzetVar) {
        String zzd;
        List list;
        String str2;
        Preconditions.checkNotNull(zzeyVar);
        if (str == null || !zzeyVar.zzi() || zzeyVar.zzj() == 1) {
            return null;
        }
        if (zzeyVar.zzj() == 7) {
            if (zzeyVar.zza() == 0) {
                return null;
            }
        } else if (!zzeyVar.zzh()) {
            return null;
        }
        int zzj = zzeyVar.zzj();
        boolean zzf = zzeyVar.zzf();
        if (!zzf && zzj != 2 && zzj != 7) {
            zzd = zzeyVar.zzd().toUpperCase(Locale.ENGLISH);
        } else {
            zzd = zzeyVar.zzd();
        }
        String str3 = zzd;
        if (zzeyVar.zza() == 0) {
            list = null;
        } else {
            List zze = zzeyVar.zze();
            if (!zzf) {
                ArrayList arrayList = new ArrayList(zze.size());
                Iterator it = zze.iterator();
                while (it.hasNext()) {
                    arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                }
                zze = Collections.unmodifiableList(arrayList);
            }
            list = zze;
        }
        if (zzj == 2) {
            str2 = str3;
        } else {
            str2 = null;
        }
        return zzd(str, zzj, zzf, str3, list, str2, zzetVar);
    }

    public static Boolean zzg(double d10, com.google.android.gms.internal.measurement.zzer zzerVar) {
        try {
            return zze(new BigDecimal(d10), zzerVar, Math.ulp(d10));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean zzh(long j10, com.google.android.gms.internal.measurement.zzer zzerVar) {
        try {
            return zze(new BigDecimal(j10), zzerVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean zzi(String str, com.google.android.gms.internal.measurement.zzer zzerVar) {
        if (!zzlj.zzy(str)) {
            return null;
        }
        try {
            return zze(new BigDecimal(str), zzerVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean zzj(Boolean bool, boolean z10) {
        boolean z11;
        if (bool == null) {
            return null;
        }
        if (bool.booleanValue() != z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }

    public abstract int zza();

    public abstract boolean zzb();

    public abstract boolean zzc();
}
