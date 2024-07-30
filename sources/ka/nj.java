package ka;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public interface nj extends IInterface {
    String a(String str, String str2, String str3);

    /* loaded from: classes2.dex */
    public static abstract class a extends Binder implements nj {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f31523a = 0;

        /* renamed from: ka.nj$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0428a implements nj {

            /* renamed from: a, reason: collision with root package name */
            public final IBinder f31524a;

            public C0428a(IBinder iBinder) {
                this.f31524a = iBinder;
            }

            @Override // ka.nj
            public final String a(String str, String str2, String str3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.heytap.openid.IOpenID");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (!this.f31524a.transact(1, obtain, obtain2, 0)) {
                        int i10 = a.f31523a;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f31524a;
            }
        }

        public a() {
            attachInterface(this, "com.heytap.openid.IOpenID");
        }

        public static nj m(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.heytap.openid.IOpenID");
                if (queryLocalInterface != null && (queryLocalInterface instanceof nj)) {
                    return (nj) queryLocalInterface;
                }
                return new C0428a(iBinder);
            } catch (Throwable th) {
                e0.i.p(th, "IOpenID err: ", "IOpenID");
                return null;
            }
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 != 1) {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeString("com.heytap.openid.IOpenID");
                return true;
            }
            parcel.enforceInterface("com.heytap.openid.IOpenID");
            String a10 = a(parcel.readString(), parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            parcel2.writeString(a10);
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}
