package com.huawei.android.hms.ppskit;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.android.hms.ppskit.PpsCoreService;
import com.huawei.android.hms.ppskit.a;

/* loaded from: classes2.dex */
public interface b extends IInterface {
    void a();

    void g(String str, String str2, com.huawei.android.hms.ppskit.a aVar);

    /* loaded from: classes2.dex */
    public static abstract class a extends Binder implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f21516a = 0;

        /* renamed from: com.huawei.android.hms.ppskit.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0246a implements b {

            /* renamed from: a, reason: collision with root package name */
            public final IBinder f21517a;

            public C0246a(IBinder iBinder) {
                this.f21517a = iBinder;
            }

            @Override // com.huawei.android.hms.ppskit.b
            public final void a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.android.hms.ppskit.IPPSServiceApi");
                    if (!this.f21517a.transact(1, obtain, obtain2, 0)) {
                        int i10 = a.f21516a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f21517a;
            }

            @Override // com.huawei.android.hms.ppskit.b
            public final void g(String str, String str2, com.huawei.android.hms.ppskit.a aVar) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.android.hms.ppskit.IPPSServiceApi");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (aVar != null) {
                        iBinder = aVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.f21517a.transact(2, obtain, obtain2, 0)) {
                        int i10 = a.f21516a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.huawei.android.hms.ppskit.IPPSServiceApi");
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            com.huawei.android.hms.ppskit.a c0245a;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 1598968902) {
                        return super.onTransact(i10, parcel, parcel2, i11);
                    }
                    parcel2.writeString("com.huawei.android.hms.ppskit.IPPSServiceApi");
                    return true;
                }
                parcel.enforceInterface("com.huawei.android.hms.ppskit.IPPSServiceApi");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    c0245a = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.huawei.android.hms.ppskit.IPPSResultCallback");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof com.huawei.android.hms.ppskit.a)) {
                        c0245a = (com.huawei.android.hms.ppskit.a) queryLocalInterface;
                    } else {
                        c0245a = new a.AbstractBinderC0244a.C0245a(readStrongBinder);
                    }
                }
                ((PpsCoreService.a) this).g(readString, readString2, c0245a);
            } else {
                parcel.enforceInterface("com.huawei.android.hms.ppskit.IPPSServiceApi");
                ((PpsCoreService.a) this).a();
            }
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}
