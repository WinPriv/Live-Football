package com.google.android.gms.internal.measurement;

import a3.l;
import android.util.Log;
import javax.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzhw extends zzib {
    public zzhw(zzhy zzhyVar, String str, Double d10, boolean z10) {
        super(zzhyVar, "measurement.test.double_flag", d10, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    @Nullable
    public final /* synthetic */ Object zza(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder s10 = l.s("Invalid double value for ", this.zzb, ": ");
            s10.append((String) obj);
            Log.e("PhenotypeFlag", s10.toString());
            return null;
        }
    }
}
