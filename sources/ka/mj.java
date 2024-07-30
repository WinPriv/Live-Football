package ka;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public interface mj extends IInterface {

    /* loaded from: classes2.dex */
    public static abstract class a extends Binder implements mj {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f31471a = 0;

        /* renamed from: ka.mj$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0427a implements mj {

            /* renamed from: a, reason: collision with root package name */
            public final IBinder f31472a;

            public C0427a(IBinder iBinder) {
                this.f31472a = iBinder;
            }

            @Override // ka.mj
            public final String a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                    if (!this.f31472a.transact(1, obtain, obtain2, 0)) {
                        int i10 = a.f31471a;
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
                return this.f31472a;
            }

            @Override // ka.mj
            public final boolean b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                    boolean z10 = false;
                    if (!this.f31472a.transact(2, obtain, obtain2, 0)) {
                        int i10 = a.f31471a;
                    }
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
    }

    String a();

    boolean b();
}
