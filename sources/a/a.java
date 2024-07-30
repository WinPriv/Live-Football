package a;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import m.d;
import m.f;
import m.g;

/* compiled from: ICustomTabsCallback.java */
/* loaded from: classes.dex */
public interface a extends IInterface {

    /* compiled from: ICustomTabsCallback.java */
    /* loaded from: classes.dex */
    public static class b {
        public static Object a(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static void b(Parcel parcel, Parcelable parcelable, int i10) {
            if (parcelable != null) {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i10);
            } else {
                parcel.writeInt(0);
            }
        }
    }

    void a(Bundle bundle, String str) throws RemoteException;

    void j(Bundle bundle) throws RemoteException;

    /* compiled from: ICustomTabsCallback.java */
    /* renamed from: a.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0000a extends Binder implements a {

        /* compiled from: ICustomTabsCallback.java */
        /* renamed from: a.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0001a implements a {

            /* renamed from: a, reason: collision with root package name */
            public final IBinder f3a;

            public C0001a(IBinder iBinder) {
                this.f3a = iBinder;
            }

            @Override // a.a
            public final void a(Bundle bundle, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    obtain.writeString(str);
                    b.b(obtain, bundle, 0);
                    this.f3a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f3a;
            }

            @Override // a.a
            public final void j(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    b.b(obtain, bundle, 0);
                    this.f3a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0000a() {
            attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        }

        public static a m(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsCallback");
            if (queryLocalInterface != null && (queryLocalInterface instanceof a)) {
                return (a) queryLocalInterface;
            }
            return new C0001a(iBinder);
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            boolean z10;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
            }
            if (i10 != 1598968902) {
                switch (i10) {
                    case 2:
                        int readInt = parcel.readInt();
                        Bundle bundle = (Bundle) b.a(parcel, Bundle.CREATOR);
                        d dVar = (d) this;
                        if (dVar.f32612b != null) {
                            dVar.f32611a.post(new m.b(dVar, readInt, bundle));
                        }
                        return true;
                    case 3:
                        String readString = parcel.readString();
                        Bundle bundle2 = (Bundle) b.a(parcel, Bundle.CREATOR);
                        d dVar2 = (d) this;
                        if (dVar2.f32612b != null) {
                            dVar2.f32611a.post(new m.c(dVar2, readString, bundle2));
                        }
                        return true;
                    case 4:
                        ((d) this).j((Bundle) b.a(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        ((d) this).a((Bundle) b.a(parcel, Bundle.CREATOR), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        int readInt2 = parcel.readInt();
                        Uri uri = (Uri) b.a(parcel, Uri.CREATOR);
                        if (parcel.readInt() != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        Bundle bundle3 = (Bundle) b.a(parcel, Bundle.CREATOR);
                        d dVar3 = (d) this;
                        if (dVar3.f32612b != null) {
                            dVar3.f32611a.post(new f(dVar3, readInt2, uri, z10, bundle3));
                        }
                        return true;
                    case 7:
                        String readString2 = parcel.readString();
                        Bundle bundle4 = (Bundle) b.a(parcel, Bundle.CREATOR);
                        l3.d dVar4 = ((d) this).f32612b;
                        if (dVar4 == null) {
                            parcel2.writeNoException();
                            b.b(parcel2, null, 1);
                            return true;
                        }
                        dVar4.i(bundle4, readString2);
                        throw null;
                    case 8:
                        int readInt3 = parcel.readInt();
                        int readInt4 = parcel.readInt();
                        Bundle bundle5 = (Bundle) b.a(parcel, Bundle.CREATOR);
                        d dVar5 = (d) this;
                        if (dVar5.f32612b != null) {
                            dVar5.f32611a.post(new g(dVar5, readInt3, readInt4, bundle5));
                        }
                        return true;
                    default:
                        return super.onTransact(i10, parcel, parcel2, i11);
                }
            }
            parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}
