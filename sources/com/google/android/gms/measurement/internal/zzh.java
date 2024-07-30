package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzh {
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private String zzE;
    private boolean zzF;
    private long zzG;
    private long zzH;
    private final zzgd zza;
    private final String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private String zzj;
    private long zzk;
    private String zzl;
    private long zzm;
    private long zzn;
    private boolean zzo;
    private boolean zzp;
    private String zzq;
    private Boolean zzr;
    private long zzs;
    private List zzt;
    private String zzu;
    private boolean zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    public zzh(zzgd zzgdVar, String str) {
        Preconditions.checkNotNull(zzgdVar);
        Preconditions.checkNotEmpty(str);
        this.zza = zzgdVar;
        this.zzb = str;
        zzgdVar.zzaB().zzg();
    }

    public final String zzA() {
        this.zza.zzaB().zzg();
        return this.zzd;
    }

    public final String zzB() {
        this.zza.zzaB().zzg();
        return this.zzE;
    }

    public final String zzC() {
        this.zza.zzaB().zzg();
        return this.zze;
    }

    public final String zzD() {
        this.zza.zzaB().zzg();
        return this.zzu;
    }

    public final List zzE() {
        this.zza.zzaB().zzg();
        return this.zzt;
    }

    public final void zzF() {
        this.zza.zzaB().zzg();
        this.zzF = false;
    }

    public final void zzG() {
        this.zza.zzaB().zzg();
        long j10 = this.zzg + 1;
        if (j10 > 2147483647L) {
            this.zza.zzaA().zzk().zzb("Bundle index overflow. appId", zzet.zzn(this.zzb));
            j10 = 0;
        }
        this.zzF = true;
        this.zzg = j10;
    }

    public final void zzH(String str) {
        this.zza.zzaB().zzg();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.zzF |= true ^ zzg.zza(this.zzq, str);
        this.zzq = str;
    }

    public final void zzI(boolean z10) {
        boolean z11;
        this.zza.zzaB().zzg();
        boolean z12 = this.zzF;
        if (this.zzp != z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.zzF = z12 | z11;
        this.zzp = z10;
    }

    public final void zzJ(String str) {
        this.zza.zzaB().zzg();
        this.zzF |= !zzg.zza(this.zzc, str);
        this.zzc = str;
    }

    public final void zzK(String str) {
        this.zza.zzaB().zzg();
        this.zzF |= !zzg.zza(this.zzl, str);
        this.zzl = str;
    }

    public final void zzL(String str) {
        this.zza.zzaB().zzg();
        this.zzF |= !zzg.zza(this.zzj, str);
        this.zzj = str;
    }

    public final void zzM(long j10) {
        boolean z10;
        this.zza.zzaB().zzg();
        boolean z11 = this.zzF;
        if (this.zzk != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.zzF = z11 | z10;
        this.zzk = j10;
    }

    public final void zzN(long j10) {
        boolean z10;
        this.zza.zzaB().zzg();
        boolean z11 = this.zzF;
        if (this.zzG != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.zzF = z11 | z10;
        this.zzG = j10;
    }

    public final void zzO(long j10) {
        boolean z10;
        this.zza.zzaB().zzg();
        boolean z11 = this.zzF;
        if (this.zzB != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.zzF = z11 | z10;
        this.zzB = j10;
    }

    public final void zzP(long j10) {
        boolean z10;
        this.zza.zzaB().zzg();
        boolean z11 = this.zzF;
        if (this.zzC != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.zzF = z11 | z10;
        this.zzC = j10;
    }

    public final void zzQ(long j10) {
        boolean z10;
        this.zza.zzaB().zzg();
        boolean z11 = this.zzF;
        if (this.zzA != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.zzF = z11 | z10;
        this.zzA = j10;
    }

    public final void zzR(long j10) {
        boolean z10;
        this.zza.zzaB().zzg();
        boolean z11 = this.zzF;
        if (this.zzz != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.zzF = z11 | z10;
        this.zzz = j10;
    }

    public final void zzS(long j10) {
        boolean z10;
        this.zza.zzaB().zzg();
        boolean z11 = this.zzF;
        if (this.zzD != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.zzF = z11 | z10;
        this.zzD = j10;
    }

    public final void zzT(long j10) {
        boolean z10;
        this.zza.zzaB().zzg();
        boolean z11 = this.zzF;
        if (this.zzy != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.zzF = z11 | z10;
        this.zzy = j10;
    }

    public final void zzU(long j10) {
        boolean z10;
        this.zza.zzaB().zzg();
        boolean z11 = this.zzF;
        if (this.zzn != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.zzF = z11 | z10;
        this.zzn = j10;
    }

    public final void zzV(long j10) {
        boolean z10;
        this.zza.zzaB().zzg();
        boolean z11 = this.zzF;
        if (this.zzs != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.zzF = z11 | z10;
        this.zzs = j10;
    }

    public final void zzW(long j10) {
        boolean z10;
        this.zza.zzaB().zzg();
        boolean z11 = this.zzF;
        if (this.zzH != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.zzF = z11 | z10;
        this.zzH = j10;
    }

    public final void zzX(String str) {
        this.zza.zzaB().zzg();
        this.zzF |= !zzg.zza(this.zzf, str);
        this.zzf = str;
    }

    public final void zzY(String str) {
        this.zza.zzaB().zzg();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.zzF |= true ^ zzg.zza(this.zzd, str);
        this.zzd = str;
    }

    public final void zzZ(long j10) {
        boolean z10;
        this.zza.zzaB().zzg();
        boolean z11 = this.zzF;
        if (this.zzm != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.zzF = z11 | z10;
        this.zzm = j10;
    }

    public final long zza() {
        this.zza.zzaB().zzg();
        return 0L;
    }

    public final void zzaa(String str) {
        this.zza.zzaB().zzg();
        this.zzF |= !zzg.zza(this.zzE, str);
        this.zzE = str;
    }

    public final void zzab(long j10) {
        boolean z10;
        this.zza.zzaB().zzg();
        boolean z11 = this.zzF;
        if (this.zzi != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.zzF = z11 | z10;
        this.zzi = j10;
    }

    public final void zzac(long j10) {
        boolean z10;
        boolean z11 = true;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkArgument(z10);
        this.zza.zzaB().zzg();
        boolean z12 = this.zzF;
        if (this.zzg == j10) {
            z11 = false;
        }
        this.zzF = z12 | z11;
        this.zzg = j10;
    }

    public final void zzad(long j10) {
        boolean z10;
        this.zza.zzaB().zzg();
        boolean z11 = this.zzF;
        if (this.zzh != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.zzF = z11 | z10;
        this.zzh = j10;
    }

    public final void zzae(boolean z10) {
        boolean z11;
        this.zza.zzaB().zzg();
        boolean z12 = this.zzF;
        if (this.zzo != z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.zzF = z12 | z11;
        this.zzo = z10;
    }

    public final void zzaf(Boolean bool) {
        this.zza.zzaB().zzg();
        this.zzF |= !zzg.zza(this.zzr, bool);
        this.zzr = bool;
    }

    public final void zzag(String str) {
        this.zza.zzaB().zzg();
        this.zzF |= !zzg.zza(this.zze, str);
        this.zze = str;
    }

    public final void zzah(List list) {
        ArrayList arrayList;
        this.zza.zzaB().zzg();
        if (!zzg.zza(this.zzt, list)) {
            this.zzF = true;
            if (list != null) {
                arrayList = new ArrayList(list);
            } else {
                arrayList = null;
            }
            this.zzt = arrayList;
        }
    }

    public final void zzai(String str) {
        this.zza.zzaB().zzg();
        this.zzF |= !zzg.zza(this.zzu, str);
        this.zzu = str;
    }

    public final void zzaj(long j10) {
        boolean z10;
        this.zza.zzaB().zzg();
        boolean z11 = this.zzF;
        if (this.zzx != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.zzF = z11 | z10;
        this.zzx = j10;
    }

    public final void zzak(boolean z10) {
        boolean z11;
        this.zza.zzaB().zzg();
        boolean z12 = this.zzF;
        if (this.zzv != z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.zzF = z12 | z11;
        this.zzv = z10;
    }

    public final void zzal(long j10) {
        boolean z10;
        this.zza.zzaB().zzg();
        boolean z11 = this.zzF;
        if (this.zzw != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.zzF = z11 | z10;
        this.zzw = j10;
    }

    public final boolean zzam() {
        this.zza.zzaB().zzg();
        return this.zzp;
    }

    public final boolean zzan() {
        this.zza.zzaB().zzg();
        return this.zzo;
    }

    public final boolean zzao() {
        this.zza.zzaB().zzg();
        return this.zzF;
    }

    public final boolean zzap() {
        this.zza.zzaB().zzg();
        return this.zzv;
    }

    public final long zzb() {
        this.zza.zzaB().zzg();
        return this.zzk;
    }

    public final long zzc() {
        this.zza.zzaB().zzg();
        return this.zzG;
    }

    public final long zzd() {
        this.zza.zzaB().zzg();
        return this.zzB;
    }

    public final long zze() {
        this.zza.zzaB().zzg();
        return this.zzC;
    }

    public final long zzf() {
        this.zza.zzaB().zzg();
        return this.zzA;
    }

    public final long zzg() {
        this.zza.zzaB().zzg();
        return this.zzz;
    }

    public final long zzh() {
        this.zza.zzaB().zzg();
        return this.zzD;
    }

    public final long zzi() {
        this.zza.zzaB().zzg();
        return this.zzy;
    }

    public final long zzj() {
        this.zza.zzaB().zzg();
        return this.zzn;
    }

    public final long zzk() {
        this.zza.zzaB().zzg();
        return this.zzs;
    }

    public final long zzl() {
        this.zza.zzaB().zzg();
        return this.zzH;
    }

    public final long zzm() {
        this.zza.zzaB().zzg();
        return this.zzm;
    }

    public final long zzn() {
        this.zza.zzaB().zzg();
        return this.zzi;
    }

    public final long zzo() {
        this.zza.zzaB().zzg();
        return this.zzg;
    }

    public final long zzp() {
        this.zza.zzaB().zzg();
        return this.zzh;
    }

    public final long zzq() {
        this.zza.zzaB().zzg();
        return this.zzx;
    }

    public final long zzr() {
        this.zza.zzaB().zzg();
        return this.zzw;
    }

    public final Boolean zzs() {
        this.zza.zzaB().zzg();
        return this.zzr;
    }

    public final String zzt() {
        this.zza.zzaB().zzg();
        return this.zzq;
    }

    public final String zzu() {
        this.zza.zzaB().zzg();
        String str = this.zzE;
        zzaa(null);
        return str;
    }

    public final String zzv() {
        this.zza.zzaB().zzg();
        return this.zzb;
    }

    public final String zzw() {
        this.zza.zzaB().zzg();
        return this.zzc;
    }

    public final String zzx() {
        this.zza.zzaB().zzg();
        return this.zzl;
    }

    public final String zzy() {
        this.zza.zzaB().zzg();
        return this.zzj;
    }

    public final String zzz() {
        this.zza.zzaB().zzg();
        return this.zzf;
    }
}
