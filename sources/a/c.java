package a;

import a.a;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: IPostMessageService.java */
/* loaded from: classes.dex */
public abstract class c extends Binder implements IInterface {
    public c() {
        attachInterface(this, "android.support.customtabs.IPostMessageService");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface("android.support.customtabs.IPostMessageService");
        }
        if (i10 != 1598968902) {
            Object obj = null;
            if (i10 != 2) {
                if (i10 != 3) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                a m10 = a.AbstractBinderC0000a.m(parcel.readStrongBinder());
                String readString = parcel.readString();
                Parcelable.Creator creator = Bundle.CREATOR;
                if (parcel.readInt() != 0) {
                    obj = creator.createFromParcel(parcel);
                }
                m10.a((Bundle) obj, readString);
                parcel2.writeNoException();
            } else {
                a m11 = a.AbstractBinderC0000a.m(parcel.readStrongBinder());
                Parcelable.Creator creator2 = Bundle.CREATOR;
                if (parcel.readInt() != 0) {
                    obj = creator2.createFromParcel(parcel);
                }
                m11.j((Bundle) obj);
                parcel2.writeNoException();
            }
            return true;
        }
        parcel2.writeString("android.support.customtabs.IPostMessageService");
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
