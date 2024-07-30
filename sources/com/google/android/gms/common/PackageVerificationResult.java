package com.google.android.gms.common;

import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public class PackageVerificationResult {
    private final String zza;
    private final boolean zzb;

    @Nullable
    private final String zzc;

    @Nullable
    private final Throwable zzd;

    private PackageVerificationResult(String str, int i10, boolean z10, @Nullable String str2, @Nullable Throwable th) {
        this.zza = str;
        this.zzb = z10;
        this.zzc = str2;
        this.zzd = th;
    }

    public static PackageVerificationResult zza(String str, String str2, @Nullable Throwable th) {
        return new PackageVerificationResult(str, 1, false, str2, th);
    }

    public static PackageVerificationResult zzd(String str, int i10) {
        return new PackageVerificationResult(str, i10, true, null, null);
    }

    public final void zzb() {
        if (!this.zzb) {
            String concat = "PackageVerificationRslt: ".concat(String.valueOf(this.zzc));
            Throwable th = this.zzd;
            if (th != null) {
                throw new SecurityException(concat, th);
            }
            throw new SecurityException(concat);
        }
    }

    public final boolean zzc() {
        return this.zzb;
    }
}
