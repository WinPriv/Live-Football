package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzek extends zzf {
    private String zza;
    private String zzb;
    private int zzc;
    private String zzd;
    private String zze;
    private long zzf;
    private final long zzg;
    private List zzh;
    private String zzi;
    private int zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private long zzn;
    private String zzo;

    public zzek(zzgd zzgdVar, long j10) {
        super(zzgdVar);
        this.zzn = 0L;
        this.zzo = null;
        this.zzg = j10;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:1|(1:3)(6:66|67|(1:69)(2:84|(1:86))|70|71|(20:73|(1:75)(1:82)|77|78|5|(1:65)(1:9)|10|11|13|(1:15)|16|17|(1:19)(1:54)|20|(3:22|(1:24)(1:26)|25)|(3:28|(1:30)(1:33)|31)|34|(3:36|(1:38)(3:45|(3:48|(1:50)(1:51)|46)|52)|(2:40|41)(2:43|44))|53|(0)(0)))|4|5|(1:7)|65|10|11|13|(0)|16|17|(0)(0)|20|(0)|(0)|34|(0)|53|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01c2, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01c3, code lost:
    
        r11.zzt.zzaA().zzd().zzc("Fetching Google App Id failed with exception. appId", com.google.android.gms.measurement.internal.zzet.zzn(r0), r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x017b A[Catch: IllegalStateException -> 0x01c2, TryCatch #0 {IllegalStateException -> 0x01c2, blocks: (B:17:0x0159, B:20:0x0173, B:22:0x017b, B:25:0x0199, B:26:0x0195, B:28:0x01a3, B:30:0x01b9, B:31:0x01be, B:33:0x01bc), top: B:16:0x0159 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01a3 A[Catch: IllegalStateException -> 0x01c2, TryCatch #0 {IllegalStateException -> 0x01c2, blocks: (B:17:0x0159, B:20:0x0173, B:22:0x017b, B:25:0x0199, B:26:0x0195, B:28:0x01a3, B:30:0x01b9, B:31:0x01be, B:33:0x01bc), top: B:16:0x0159 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00b5  */
    @Override // com.google.android.gms.measurement.internal.zzf
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"appId", "appStore", "appName", "gmpAppId", "gaAppId"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd() {
        /*
            Method dump skipped, instructions count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzek.zzd():void");
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return true;
    }

    public final int zzh() {
        zza();
        return this.zzj;
    }

    public final int zzi() {
        zza();
        return this.zzc;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzq zzj(java.lang.String r40) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzek.zzj(java.lang.String):com.google.android.gms.measurement.internal.zzq");
    }

    public final String zzk() {
        zza();
        return this.zzl;
    }

    public final String zzl() {
        zza();
        Preconditions.checkNotNull(this.zza);
        return this.zza;
    }

    public final String zzm() {
        zzg();
        zza();
        Preconditions.checkNotNull(this.zzk);
        return this.zzk;
    }

    public final List zzn() {
        return this.zzh;
    }

    public final void zzo() {
        String format;
        String str;
        zzg();
        if (!this.zzt.zzm().zzc().zzj(zzha.ANALYTICS_STORAGE)) {
            this.zzt.zzaA().zzc().zza("Analytics Storage consent is not granted");
            format = null;
        } else {
            byte[] bArr = new byte[16];
            this.zzt.zzv().zzG().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        }
        zzer zzc = this.zzt.zzaA().zzc();
        Object[] objArr = new Object[1];
        if (format == null) {
            str = "null";
        } else {
            str = "not null";
        }
        objArr[0] = str;
        zzc.zza(String.format("Resetting session stitching token to %s", objArr));
        this.zzm = format;
        this.zzn = this.zzt.zzax().currentTimeMillis();
    }

    public final boolean zzp(String str) {
        String str2 = this.zzo;
        boolean z10 = false;
        if (str2 != null && !str2.equals(str)) {
            z10 = true;
        }
        this.zzo = str;
        return z10;
    }
}
