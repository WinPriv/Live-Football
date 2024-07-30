package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public final class zao implements Parcelable.Creator<zan> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zan createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i10 = 0;
        ArrayList arrayList = null;
        String str = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 3) {
                        SafeParcelReader.skipUnknownField(parcel, readHeader);
                    } else {
                        str = SafeParcelReader.createString(parcel, readHeader);
                    }
                } else {
                    arrayList = SafeParcelReader.createTypedList(parcel, readHeader, zal.CREATOR);
                }
            } else {
                i10 = SafeParcelReader.readInt(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zan(i10, arrayList, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zan[] newArray(int i10) {
        return new zan[i10];
    }
}
