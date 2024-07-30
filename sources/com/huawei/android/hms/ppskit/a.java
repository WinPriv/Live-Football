package com.huawei.android.hms.ppskit;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import ka.b7;

/* loaded from: classes2.dex */
public interface a extends IInterface {
    void e(String str, int i10, String str2);

    /* renamed from: com.huawei.android.hms.ppskit.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC0244a extends Binder implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f21514a = 0;

        /* renamed from: com.huawei.android.hms.ppskit.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0245a implements a {

            /* renamed from: a, reason: collision with root package name */
            public final IBinder f21515a;

            public C0245a(IBinder iBinder) {
                this.f21515a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f21515a;
            }

            @Override // com.huawei.android.hms.ppskit.a
            public final void e(String str, int i10, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.android.hms.ppskit.IPPSResultCallback");
                    obtain.writeString(str);
                    obtain.writeInt(i10);
                    obtain.writeString(str2);
                    if (!this.f21515a.transact(1, obtain, obtain2, 0)) {
                        int i11 = AbstractBinderC0244a.f21514a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0244a() {
            attachInterface(this, "com.huawei.android.hms.ppskit.IPPSResultCallback");
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 != 1) {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeString("com.huawei.android.hms.ppskit.IPPSResultCallback");
                return true;
            }
            parcel.enforceInterface("com.huawei.android.hms.ppskit.IPPSResultCallback");
            ((b7) this).e(parcel.readString(), parcel.readInt(), parcel.readString());
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}
