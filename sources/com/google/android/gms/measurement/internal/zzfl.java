package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfl {
    final zzgd zza;

    public zzfl(zzlh zzlhVar) {
        this.zza = zzlhVar.zzp();
    }

    public final boolean zza() {
        try {
            PackageManagerWrapper packageManager = Wrappers.packageManager(this.zza.zzaw());
            if (packageManager == null) {
                this.zza.zzaA().zzj().zza("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            }
            if (packageManager.getPackageInfo("com.android.vending", 128).versionCode < 80837300) {
                return false;
            }
            return true;
        } catch (Exception e10) {
            this.zza.zzaA().zzj().zzb("Failed to retrieve Play Store version for Install Referrer", e10);
            return false;
        }
    }
}
