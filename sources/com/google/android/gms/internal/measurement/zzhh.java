package com.google.android.gms.internal.measurement;

import android.net.Uri;
import javax.annotation.Nullable;
import q.i;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzhh {
    private final i zza;

    public zzhh(i iVar) {
        this.zza = iVar;
    }

    @Nullable
    public final String zza(@Nullable Uri uri, @Nullable String str, @Nullable String str2, String str3) {
        i iVar;
        if (uri != null) {
            iVar = (i) this.zza.getOrDefault(uri.toString(), null);
        } else {
            iVar = null;
        }
        if (iVar == null) {
            return null;
        }
        return (String) iVar.getOrDefault("".concat(str3), null);
    }
}
