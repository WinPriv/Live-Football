package com.huawei.hms.ads.uiengine;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public interface IPPSUiEngineCallback extends IInterface {

    /* loaded from: classes2.dex */
    public static abstract class b extends Binder implements IPPSUiEngineCallback {
        static final int Code = 1;
        private static final String V = "com.huawei.hms.ads.uiengine.IPPSUiEngineCallback";

        /* loaded from: classes2.dex */
        public static class a implements IPPSUiEngineCallback {
            public static IPPSUiEngineCallback Code;
            private IBinder V;

            public a(IBinder iBinder) {
                this.V = iBinder;
            }

            public String Code() {
                return b.V;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.V;
            }

            @Override // com.huawei.hms.ads.uiengine.IPPSUiEngineCallback
            public void onCallResult(String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.V);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.V.transact(1, obtain, obtain2, 0) && b.Code() != null) {
                        b.Code().onCallResult(str, bundle);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, V);
        }

        public static IPPSUiEngineCallback Code() {
            return a.Code;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            Bundle bundle;
            if (i10 != 1) {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeString(V);
                return true;
            }
            parcel.enforceInterface(V);
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
            } else {
                bundle = null;
            }
            onCallResult(readString, bundle);
            parcel2.writeNoException();
            return true;
        }

        public static IPPSUiEngineCallback Code(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(V);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IPPSUiEngineCallback)) ? new a(iBinder) : (IPPSUiEngineCallback) queryLocalInterface;
        }

        public static boolean Code(IPPSUiEngineCallback iPPSUiEngineCallback) {
            if (a.Code != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iPPSUiEngineCallback == null) {
                return false;
            }
            a.Code = iPPSUiEngineCallback;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    void onCallResult(String str, Bundle bundle);

    /* loaded from: classes2.dex */
    public static class a implements IPPSUiEngineCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.huawei.hms.ads.uiengine.IPPSUiEngineCallback
        public void onCallResult(String str, Bundle bundle) {
        }
    }
}
