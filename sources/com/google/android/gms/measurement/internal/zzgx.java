package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzgx extends zzgw {
    private boolean zza;

    public zzgx(zzgd zzgdVar) {
        super(zzgdVar);
        this.zzt.zzD();
    }

    public abstract boolean zzf();

    public final void zzv() {
        if (zzy()) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzw() {
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

    public final void zzx() {
        if (!this.zza) {
            zzaC();
            this.zzt.zzB();
            this.zza = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final boolean zzy() {
        if (this.zza) {
            return true;
        }
        return false;
    }

    public void zzaC() {
    }
}
