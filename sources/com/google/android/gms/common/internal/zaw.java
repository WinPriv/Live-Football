package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public final class zaw implements Parcelable.Creator<zav> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zav createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        IBinder iBinder = null;
        ConnectionResult connectionResult = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 3) {
                        if (fieldId != 4) {
                            if (fieldId != 5) {
                                SafeParcelReader.skipUnknownField(parcel, readHeader);
                            } else {
                                z11 = SafeParcelReader.readBoolean(parcel, readHeader);
                            }
                        } else {
                            z10 = SafeParcelReader.readBoolean(parcel, readHeader);
                        }
                    } else {
                        connectionResult = (ConnectionResult) SafeParcelReader.createParcelable(parcel, readHeader, ConnectionResult.CREATOR);
                    }
                } else {
                    iBinder = SafeParcelReader.readIBinder(parcel, readHeader);
                }
            } else {
                i10 = SafeParcelReader.readInt(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zav(i10, iBinder, connectionResult, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zav[] newArray(int i10) {
        return new zav[i10];
    }
}
