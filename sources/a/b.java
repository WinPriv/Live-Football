package a;

import a.a;
import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.browser.customtabs.CustomTabsService;
import java.util.ArrayList;
import m.d;

/* compiled from: ICustomTabsService.java */
/* loaded from: classes.dex */
public interface b extends IInterface {

    /* compiled from: ICustomTabsService.java */
    /* renamed from: a.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0003b {
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

    boolean c(d dVar) throws RemoteException;

    boolean d(long j10) throws RemoteException;

    boolean f(a.a aVar, Uri uri, Bundle bundle, ArrayList arrayList) throws RemoteException;

    /* compiled from: ICustomTabsService.java */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f4a = 0;

        /* compiled from: ICustomTabsService.java */
        /* renamed from: a.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0002a implements b {

            /* renamed from: a, reason: collision with root package name */
            public final IBinder f5a;

            public C0002a(IBinder iBinder) {
                this.f5a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f5a;
            }

            @Override // a.b
            public final boolean c(d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongInterface(dVar);
                    boolean z10 = false;
                    this.f5a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z10 = true;
                    }
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // a.b
            public final boolean d(long j10) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeLong(j10);
                    boolean z10 = false;
                    this.f5a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z10 = true;
                    }
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // a.b
            public final boolean f(a.a aVar, Uri uri, Bundle bundle, ArrayList arrayList) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongInterface(aVar);
                    boolean z10 = false;
                    C0003b.b(obtain, uri, 0);
                    C0003b.b(obtain, bundle, 0);
                    obtain.writeTypedList(arrayList);
                    this.f5a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z10 = true;
                    }
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "android.support.customtabs.ICustomTabsService");
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
            }
            if (i10 != 1598968902) {
                switch (i10) {
                    case 2:
                        boolean d10 = ((CustomTabsService.a) this).d(parcel.readLong());
                        parcel2.writeNoException();
                        parcel2.writeInt(d10 ? 1 : 0);
                        return true;
                    case 3:
                        boolean n10 = ((CustomTabsService.a) this).n(a.AbstractBinderC0000a.m(parcel.readStrongBinder()), null);
                        parcel2.writeNoException();
                        parcel2.writeInt(n10 ? 1 : 0);
                        return true;
                    case 4:
                        a.a m10 = a.AbstractBinderC0000a.m(parcel.readStrongBinder());
                        Uri uri = (Uri) C0003b.a(parcel, Uri.CREATOR);
                        Parcelable.Creator creator = Bundle.CREATOR;
                        boolean f = ((CustomTabsService.a) this).f(m10, uri, (Bundle) C0003b.a(parcel, creator), parcel.createTypedArrayList(creator));
                        parcel2.writeNoException();
                        parcel2.writeInt(f ? 1 : 0);
                        return true;
                    case 5:
                        parcel.readString();
                        Bundle a10 = CustomTabsService.this.a();
                        parcel2.writeNoException();
                        C0003b.b(parcel2, a10, 1);
                        return true;
                    case 6:
                        a.a m11 = a.AbstractBinderC0000a.m(parcel.readStrongBinder());
                        CustomTabsService.a aVar = (CustomTabsService.a) this;
                        PendingIntent m12 = CustomTabsService.a.m((Bundle) C0003b.a(parcel, Bundle.CREATOR));
                        if (m11 == null && m12 == null) {
                            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
                        }
                        boolean g6 = CustomTabsService.this.g();
                        parcel2.writeNoException();
                        parcel2.writeInt(g6 ? 1 : 0);
                        return true;
                    case 7:
                        a.a m13 = a.AbstractBinderC0000a.m(parcel.readStrongBinder());
                        CustomTabsService.a aVar2 = (CustomTabsService.a) this;
                        if (m13 != null) {
                            boolean f10 = CustomTabsService.this.f();
                            parcel2.writeNoException();
                            parcel2.writeInt(f10 ? 1 : 0);
                            return true;
                        }
                        throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
                    case 8:
                        a.a m14 = a.AbstractBinderC0000a.m(parcel.readStrongBinder());
                        parcel.readString();
                        CustomTabsService.a aVar3 = (CustomTabsService.a) this;
                        PendingIntent m15 = CustomTabsService.a.m((Bundle) C0003b.a(parcel, Bundle.CREATOR));
                        if (m14 == null && m15 == null) {
                            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
                        }
                        int d11 = CustomTabsService.this.d();
                        parcel2.writeNoException();
                        parcel2.writeInt(d11);
                        return true;
                    case 9:
                        a.a m16 = a.AbstractBinderC0000a.m(parcel.readStrongBinder());
                        parcel.readInt();
                        CustomTabsService.a aVar4 = (CustomTabsService.a) this;
                        PendingIntent m17 = CustomTabsService.a.m((Bundle) C0003b.a(parcel, Bundle.CREATOR));
                        if (m16 == null && m17 == null) {
                            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
                        }
                        boolean h10 = CustomTabsService.this.h();
                        parcel2.writeNoException();
                        parcel2.writeInt(h10 ? 1 : 0);
                        return true;
                    case 10:
                        boolean n11 = ((CustomTabsService.a) this).n(a.AbstractBinderC0000a.m(parcel.readStrongBinder()), CustomTabsService.a.m((Bundle) C0003b.a(parcel, Bundle.CREATOR)));
                        parcel2.writeNoException();
                        parcel2.writeInt(n11 ? 1 : 0);
                        return true;
                    case 11:
                        a.a m18 = a.AbstractBinderC0000a.m(parcel.readStrongBinder());
                        CustomTabsService.a aVar5 = (CustomTabsService.a) this;
                        PendingIntent m19 = CustomTabsService.a.m((Bundle) C0003b.a(parcel, Bundle.CREATOR));
                        if (m18 == null && m19 == null) {
                            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
                        }
                        boolean f11 = CustomTabsService.this.f();
                        parcel2.writeNoException();
                        parcel2.writeInt(f11 ? 1 : 0);
                        return true;
                    case 12:
                        a.a m20 = a.AbstractBinderC0000a.m(parcel.readStrongBinder());
                        parcel.readInt();
                        CustomTabsService.a aVar6 = (CustomTabsService.a) this;
                        PendingIntent m21 = CustomTabsService.a.m((Bundle) C0003b.a(parcel, Bundle.CREATOR));
                        if (m20 == null && m21 == null) {
                            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
                        }
                        boolean e10 = CustomTabsService.this.e();
                        parcel2.writeNoException();
                        parcel2.writeInt(e10 ? 1 : 0);
                        return true;
                    default:
                        return super.onTransact(i10, parcel, parcel2, i11);
                }
            }
            parcel2.writeString("android.support.customtabs.ICustomTabsService");
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}
