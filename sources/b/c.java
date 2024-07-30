package b;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ITrustedWebActivityService.java */
/* loaded from: classes.dex */
public final class c {
    public static Object a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void b(Parcel parcel, Bundle bundle) {
        if (bundle != null) {
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 1);
        } else {
            parcel.writeInt(0);
        }
    }
}
