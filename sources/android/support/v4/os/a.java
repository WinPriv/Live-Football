package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.os.ResultReceiver;

/* compiled from: IResultReceiver.java */
/* loaded from: classes.dex */
public interface a extends IInterface {
    void l(int i10, Bundle bundle) throws RemoteException;

    /* compiled from: IResultReceiver.java */
    /* renamed from: android.support.v4.os.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0008a extends Binder implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f449a = 0;

        /* compiled from: IResultReceiver.java */
        /* renamed from: android.support.v4.os.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0009a implements a {

            /* renamed from: a, reason: collision with root package name */
            public final IBinder f450a;

            public C0009a(IBinder iBinder) {
                this.f450a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f450a;
            }

            @Override // android.support.v4.os.a
            public final void l(int i10, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.os.IResultReceiver");
                    obtain.writeInt(i10);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f450a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0008a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            Object obj;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
            }
            if (i10 != 1598968902) {
                if (i10 != 1) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                int readInt = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                if (parcel.readInt() != 0) {
                    obj = creator.createFromParcel(parcel);
                } else {
                    obj = null;
                }
                ((ResultReceiver.b) this).l(readInt, (Bundle) obj);
                return true;
            }
            parcel2.writeString("android.support.v4.os.IResultReceiver");
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}
