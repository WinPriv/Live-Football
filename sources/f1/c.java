package f1;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: IMultiInstanceInvalidationCallback.java */
/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f27931a;

    public c(IBinder iBinder) {
        this.f27931a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f27931a;
    }

    @Override // f1.d
    public final void b(String[] strArr) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
            obtain.writeStringArray(strArr);
            this.f27931a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
