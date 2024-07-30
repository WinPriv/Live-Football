package com.google.android.gms.common;

import android.util.Log;
import javax.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public class zzx {
    private static final zzx zze = new zzx(true, 3, 1, null, null);
    final boolean zza;

    @Nullable
    final String zzb;

    @Nullable
    final Throwable zzc;
    final int zzd;

    private zzx(boolean z10, int i10, int i11, @Nullable String str, @Nullable Throwable th) {
        this.zza = z10;
        this.zzd = i10;
        this.zzb = str;
        this.zzc = th;
    }

    @Deprecated
    public static zzx zzb() {
        return zze;
    }

    public static zzx zzc(String str) {
        return new zzx(false, 1, 5, str, null);
    }

    public static zzx zzd(String str, Throwable th) {
        return new zzx(false, 1, 5, str, th);
    }

    public static zzx zzf(int i10) {
        return new zzx(true, i10, 1, null, null);
    }

    public static zzx zzg(int i10, int i11, String str, @Nullable Throwable th) {
        return new zzx(false, i10, i11, str, th);
    }

    @Nullable
    public String zza() {
        return this.zzb;
    }

    public final void zze() {
        if (!this.zza && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (this.zzc != null) {
                Log.d("GoogleCertificatesRslt", zza(), this.zzc);
            } else {
                Log.d("GoogleCertificatesRslt", zza());
            }
        }
    }
}
