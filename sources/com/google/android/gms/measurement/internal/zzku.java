package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzku extends zzkt {
    private boolean zza;

    public zzku(zzlh zzlhVar) {
        super(zzlhVar);
        this.zzf.zzM();
    }

    public final void zzW() {
        if (zzY()) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzX() {
        if (!this.zza) {
            zzb();
            this.zzf.zzH();
            this.zza = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final boolean zzY() {
        if (this.zza) {
            return true;
        }
        return false;
    }

    public abstract boolean zzb();
}
