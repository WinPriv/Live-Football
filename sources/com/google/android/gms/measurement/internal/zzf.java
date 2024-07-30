package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzf extends zze {
    private boolean zza;

    public zzf(zzgd zzgdVar) {
        super(zzgdVar);
        this.zzt.zzD();
    }

    public final void zza() {
        if (zze()) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzb() {
        if (!this.zza) {
            if (!zzf()) {
                this.zzt.zzB();
                this.zza = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final void zzc() {
        if (!this.zza) {
            zzd();
            this.zzt.zzB();
            this.zza = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final boolean zze() {
        if (this.zza) {
            return true;
        }
        return false;
    }

    public abstract boolean zzf();

    public void zzd() {
    }
}
