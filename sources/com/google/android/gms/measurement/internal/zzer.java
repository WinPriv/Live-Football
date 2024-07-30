package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzer {
    final /* synthetic */ zzet zza;
    private final int zzb;
    private final boolean zzc;
    private final boolean zzd;

    public zzer(zzet zzetVar, int i10, boolean z10, boolean z11) {
        this.zza = zzetVar;
        this.zzb = i10;
        this.zzc = z10;
        this.zzd = z11;
    }

    public final void zza(String str) {
        this.zza.zzu(this.zzb, this.zzc, this.zzd, str, null, null, null);
    }

    public final void zzb(String str, Object obj) {
        this.zza.zzu(this.zzb, this.zzc, this.zzd, str, obj, null, null);
    }

    public final void zzc(String str, Object obj, Object obj2) {
        this.zza.zzu(this.zzb, this.zzc, this.zzd, str, obj, obj2, null);
    }

    public final void zzd(String str, Object obj, Object obj2, Object obj3) {
        this.zza.zzu(this.zzb, this.zzc, this.zzd, str, obj, obj2, obj3);
    }
}
