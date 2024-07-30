package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzad implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        String str2 = null;
        zzlk zzlkVar = null;
        String str3 = null;
        zzau zzauVar = null;
        zzau zzauVar2 = null;
        zzau zzauVar3 = null;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        boolean z10 = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 3:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 4:
                    zzlkVar = (zzlk) SafeParcelReader.createParcelable(parcel, readHeader, zzlk.CREATOR);
                    break;
                case 5:
                    j10 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 6:
                    z10 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 7:
                    str3 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 8:
                    zzauVar = (zzau) SafeParcelReader.createParcelable(parcel, readHeader, zzau.CREATOR);
                    break;
                case 9:
                    j11 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 10:
                    zzauVar2 = (zzau) SafeParcelReader.createParcelable(parcel, readHeader, zzau.CREATOR);
                    break;
                case 11:
                    j12 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 12:
                    zzauVar3 = (zzau) SafeParcelReader.createParcelable(parcel, readHeader, zzau.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzac(str, str2, zzlkVar, j10, z10, str3, zzauVar, j11, zzauVar2, j12, zzauVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzac[i10];
    }
}
