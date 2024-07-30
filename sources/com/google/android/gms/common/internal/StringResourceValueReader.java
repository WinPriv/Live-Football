package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.anythink.expressad.foundation.h.i;
import com.google.android.gms.common.R;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class StringResourceValueReader {
    private final Resources zza;
    private final String zzb;

    public StringResourceValueReader(Context context) {
        Preconditions.checkNotNull(context);
        Resources resources = context.getResources();
        this.zza = resources;
        this.zzb = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    @KeepForSdk
    public String getString(String str) {
        int identifier = this.zza.getIdentifier(str, i.f10128g, this.zzb);
        if (identifier == 0) {
            return null;
        }
        return this.zza.getString(identifier);
    }
}
