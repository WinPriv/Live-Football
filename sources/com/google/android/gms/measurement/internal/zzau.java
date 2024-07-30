package com.google.android.gms.measurement.internal;

import a3.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
@SafeParcelable.Class(creator = "EventParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class zzau extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzau> CREATOR = new zzav();

    @SafeParcelable.Field(id = 2)
    public final String zza;

    @SafeParcelable.Field(id = 3)
    public final zzas zzb;

    @SafeParcelable.Field(id = 4)
    public final String zzc;

    @SafeParcelable.Field(id = 5)
    public final long zzd;

    public zzau(zzau zzauVar, long j10) {
        Preconditions.checkNotNull(zzauVar);
        this.zza = zzauVar.zza;
        this.zzb = zzauVar.zzb;
        this.zzc = zzauVar.zzc;
        this.zzd = j10;
    }

    public final String toString() {
        String str = this.zzc;
        String str2 = this.zza;
        String valueOf = String.valueOf(this.zzb);
        StringBuilder o = k.o("origin=", str, ",name=", str2, ",params=");
        o.append(valueOf);
        return o.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        zzav.zza(this, parcel, i10);
    }

    @SafeParcelable.Constructor
    public zzau(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) zzas zzasVar, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) long j10) {
        this.zza = str;
        this.zzb = zzasVar;
        this.zzc = str2;
        this.zzd = j10;
    }
}
