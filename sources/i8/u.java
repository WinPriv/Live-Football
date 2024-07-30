package i8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.messaging.RemoteMessage;

/* compiled from: RemoteMessageCreator.java */
/* loaded from: classes2.dex */
public final class u implements Parcelable.Creator<RemoteMessage> {
    @Override // android.os.Parcelable.Creator
    public final RemoteMessage createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            if (SafeParcelReader.getFieldId(readHeader) != 2) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                bundle = SafeParcelReader.createBundle(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new RemoteMessage(bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final RemoteMessage[] newArray(int i10) {
        return new RemoteMessage[i10];
    }
}
