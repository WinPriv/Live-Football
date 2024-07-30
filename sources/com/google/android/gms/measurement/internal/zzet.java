package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzpe;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzet extends zzgx {
    private char zza;
    private long zzb;
    private String zzc;
    private final zzer zzd;
    private final zzer zze;
    private final zzer zzf;
    private final zzer zzg;
    private final zzer zzh;
    private final zzer zzi;
    private final zzer zzj;
    private final zzer zzk;
    private final zzer zzl;

    public zzet(zzgd zzgdVar) {
        super(zzgdVar);
        this.zza = (char) 0;
        this.zzb = -1L;
        this.zzd = new zzer(this, 6, false, false);
        this.zze = new zzer(this, 6, true, false);
        this.zzf = new zzer(this, 6, false, true);
        this.zzg = new zzer(this, 5, false, false);
        this.zzh = new zzer(this, 5, true, false);
        this.zzi = new zzer(this, 5, false, true);
        this.zzj = new zzer(this, 4, false, false);
        this.zzk = new zzer(this, 3, false, false);
        this.zzl = new zzer(this, 2, false, false);
    }

    public static Object zzn(String str) {
        if (str == null) {
            return null;
        }
        return new zzes(str);
    }

    public static String zzo(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String zzp = zzp(z10, obj);
        String zzp2 = zzp(z10, obj2);
        String zzp3 = zzp(z10, obj3);
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(zzp)) {
            sb2.append(str2);
            sb2.append(zzp);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(zzp2)) {
            sb2.append(str2);
            sb2.append(zzp2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(zzp3)) {
            sb2.append(str3);
            sb2.append(zzp3);
        }
        return sb2.toString();
    }

    public static String zzp(boolean z10, Object obj) {
        String str;
        String th;
        String className;
        String str2 = "";
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i10 = 0;
        if (obj instanceof Long) {
            if (!z10) {
                return obj.toString();
            }
            Long l10 = (Long) obj;
            if (Math.abs(l10.longValue()) < 100) {
                return obj.toString();
            }
            char charAt = obj.toString().charAt(0);
            String valueOf = String.valueOf(Math.abs(l10.longValue()));
            long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
            long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            StringBuilder sb2 = new StringBuilder();
            if (charAt == '-') {
                str2 = "-";
            }
            sb2.append(str2);
            sb2.append(round);
            sb2.append("...");
            sb2.append(str2);
            sb2.append(round2);
            return sb2.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (obj instanceof Throwable) {
            Throwable th2 = (Throwable) obj;
            if (z10) {
                th = th2.getClass().getName();
            } else {
                th = th2.toString();
            }
            StringBuilder sb3 = new StringBuilder(th);
            String zzq = zzq(zzgd.class.getCanonicalName());
            StackTraceElement[] stackTrace = th2.getStackTrace();
            int length = stackTrace.length;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i10];
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && zzq(className).equals(zzq)) {
                    sb3.append(": ");
                    sb3.append(stackTraceElement);
                    break;
                }
                i10++;
            }
            return sb3.toString();
        }
        if (obj instanceof zzes) {
            str = ((zzes) obj).zza;
            return str;
        }
        if (z10) {
            return "-";
        }
        return obj.toString();
    }

    public static String zzq(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            zzpe.zzc();
            if (((Boolean) zzeg.zzay.zza(null)).booleanValue()) {
                return "";
            }
            return str;
        }
        return str.substring(0, lastIndexOf);
    }

    public final zzer zzc() {
        return this.zzk;
    }

    public final zzer zzd() {
        return this.zzd;
    }

    public final zzer zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.measurement.internal.zzgx
    public final boolean zzf() {
        return false;
    }

    public final zzer zzh() {
        return this.zze;
    }

    public final zzer zzi() {
        return this.zzj;
    }

    public final zzer zzj() {
        return this.zzl;
    }

    public final zzer zzk() {
        return this.zzg;
    }

    public final zzer zzl() {
        return this.zzi;
    }

    public final zzer zzm() {
        return this.zzh;
    }

    @EnsuresNonNull({"logTagDoNotUseDirectly"})
    public final String zzr() {
        String str;
        synchronized (this) {
            if (this.zzc == null) {
                if (this.zzt.zzy() != null) {
                    this.zzc = this.zzt.zzy();
                } else {
                    this.zzc = this.zzt.zzf().zzn();
                }
            }
            Preconditions.checkNotNull(this.zzc);
            str = this.zzc;
        }
        return str;
    }

    public final void zzu(int i10, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) {
        if (!z10 && Log.isLoggable(zzr(), i10)) {
            Log.println(i10, zzr(), zzo(false, str, obj, obj2, obj3));
        }
        if (!z11 && i10 >= 5) {
            Preconditions.checkNotNull(str);
            zzga zzo = this.zzt.zzo();
            if (zzo == null) {
                Log.println(6, zzr(), "Scheduler not set. Not logging error/warn");
            } else {
                if (!zzo.zzy()) {
                    Log.println(6, zzr(), "Scheduler not initialized. Not logging error/warn");
                    return;
                }
                if (i10 >= 9) {
                    i10 = 8;
                }
                zzo.zzp(new zzeq(this, i10, str, obj, obj2, obj3));
            }
        }
    }
}
