package com.huawei.hms.ads.uiengine;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.hms.ads.dynamic.IObjectWrapper;
import com.huawei.hms.ads.uiengine.IPPSUiEngineCallback;

/* loaded from: classes2.dex */
public interface IRemoteViewDelegate extends IInterface {

    /* loaded from: classes2.dex */
    public static abstract class b extends Binder implements IRemoteViewDelegate {
        static final int B = 5;
        static final int C = 6;
        static final int Code = 1;
        static final int D = 9;
        static final int F = 8;
        static final int I = 3;
        static final int L = 10;
        static final int S = 7;
        static final int V = 2;
        static final int Z = 4;

        /* renamed from: a, reason: collision with root package name */
        private static final String f21778a = "com.huawei.hms.ads.uiengine.IRemoteViewDelegate";

        /* loaded from: classes2.dex */
        public static class a implements IRemoteViewDelegate {
            public static IRemoteViewDelegate Code;
            private IBinder V;

            public a(IBinder iBinder) {
                this.V = iBinder;
            }

            public String Code() {
                return b.f21778a;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.V;
            }

            @Override // com.huawei.hms.ads.uiengine.IRemoteViewDelegate
            public IObjectWrapper getView() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f21778a);
                    if (!this.V.transact(1, obtain, obtain2, 0) && b.Code() != null) {
                        return b.Code().getView();
                    }
                    obtain2.readException();
                    return IObjectWrapper.Stub.asInterface(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.IRemoteViewDelegate
            public void onCreate(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f21778a);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.V.transact(2, obtain, obtain2, 0) && b.Code() != null) {
                        b.Code().onCreate(bundle);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.IRemoteViewDelegate
            public void onDestroy() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f21778a);
                    if (!this.V.transact(3, obtain, obtain2, 0) && b.Code() != null) {
                        b.Code().onDestroy();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.IRemoteViewDelegate
            public void onPause() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f21778a);
                    if (!this.V.transact(4, obtain, obtain2, 0) && b.Code() != null) {
                        b.Code().onPause();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.IRemoteViewDelegate
            public void onRestart() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f21778a);
                    if (!this.V.transact(8, obtain, obtain2, 0) && b.Code() != null) {
                        b.Code().onRestart();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.IRemoteViewDelegate
            public void onResume() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f21778a);
                    if (!this.V.transact(5, obtain, obtain2, 0) && b.Code() != null) {
                        b.Code().onResume();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.IRemoteViewDelegate
            public void onStart() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f21778a);
                    if (!this.V.transact(6, obtain, obtain2, 0) && b.Code() != null) {
                        b.Code().onStart();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.IRemoteViewDelegate
            public void onStop() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f21778a);
                    if (!this.V.transact(7, obtain, obtain2, 0) && b.Code() != null) {
                        b.Code().onStop();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.IRemoteViewDelegate
            public Bundle sendCommand(String str, Bundle bundle) {
                Bundle bundle2;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f21778a);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.V.transact(10, obtain, obtain2, 0) && b.Code() != null) {
                        return b.Code().sendCommand(str, bundle);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(obtain2);
                    } else {
                        bundle2 = null;
                    }
                    return bundle2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.IRemoteViewDelegate
            public void setCallback(IPPSUiEngineCallback iPPSUiEngineCallback) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f21778a);
                    if (iPPSUiEngineCallback != null) {
                        iBinder = iPPSUiEngineCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.V.transact(9, obtain, obtain2, 0) && b.Code() != null) {
                        b.Code().setCallback(iPPSUiEngineCallback);
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
            attachInterface(this, f21778a);
        }

        public static IRemoteViewDelegate Code() {
            return a.Code;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 != 1598968902) {
                IBinder iBinder = null;
                Bundle bundle = null;
                Bundle bundle2 = null;
                switch (i10) {
                    case 1:
                        parcel.enforceInterface(f21778a);
                        IObjectWrapper view = getView();
                        parcel2.writeNoException();
                        if (view != null) {
                            iBinder = view.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 2:
                        parcel.enforceInterface(f21778a);
                        if (parcel.readInt() != 0) {
                            bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        onCreate(bundle2);
                        break;
                    case 3:
                        parcel.enforceInterface(f21778a);
                        onDestroy();
                        break;
                    case 4:
                        parcel.enforceInterface(f21778a);
                        onPause();
                        break;
                    case 5:
                        parcel.enforceInterface(f21778a);
                        onResume();
                        break;
                    case 6:
                        parcel.enforceInterface(f21778a);
                        onStart();
                        break;
                    case 7:
                        parcel.enforceInterface(f21778a);
                        onStop();
                        break;
                    case 8:
                        parcel.enforceInterface(f21778a);
                        onRestart();
                        break;
                    case 9:
                        parcel.enforceInterface(f21778a);
                        setCallback(IPPSUiEngineCallback.b.Code(parcel.readStrongBinder()));
                        break;
                    case 10:
                        parcel.enforceInterface(f21778a);
                        String readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        Bundle sendCommand = sendCommand(readString, bundle);
                        parcel2.writeNoException();
                        if (sendCommand != null) {
                            parcel2.writeInt(1);
                            sendCommand.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    default:
                        return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeNoException();
                return true;
            }
            parcel2.writeString(f21778a);
            return true;
        }

        public static IRemoteViewDelegate Code(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f21778a);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IRemoteViewDelegate)) ? new a(iBinder) : (IRemoteViewDelegate) queryLocalInterface;
        }

        public static boolean Code(IRemoteViewDelegate iRemoteViewDelegate) {
            if (a.Code != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iRemoteViewDelegate == null) {
                return false;
            }
            a.Code = iRemoteViewDelegate;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    IObjectWrapper getView();

    void onCreate(Bundle bundle);

    void onDestroy();

    void onPause();

    void onRestart();

    void onResume();

    void onStart();

    void onStop();

    Bundle sendCommand(String str, Bundle bundle);

    void setCallback(IPPSUiEngineCallback iPPSUiEngineCallback);

    /* loaded from: classes2.dex */
    public static class a implements IRemoteViewDelegate {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.huawei.hms.ads.uiengine.IRemoteViewDelegate
        public IObjectWrapper getView() {
            return null;
        }

        @Override // com.huawei.hms.ads.uiengine.IRemoteViewDelegate
        public Bundle sendCommand(String str, Bundle bundle) {
            return null;
        }

        @Override // com.huawei.hms.ads.uiengine.IRemoteViewDelegate
        public void onDestroy() {
        }

        @Override // com.huawei.hms.ads.uiengine.IRemoteViewDelegate
        public void onPause() {
        }

        @Override // com.huawei.hms.ads.uiengine.IRemoteViewDelegate
        public void onRestart() {
        }

        @Override // com.huawei.hms.ads.uiengine.IRemoteViewDelegate
        public void onResume() {
        }

        @Override // com.huawei.hms.ads.uiengine.IRemoteViewDelegate
        public void onStart() {
        }

        @Override // com.huawei.hms.ads.uiengine.IRemoteViewDelegate
        public void onStop() {
        }

        @Override // com.huawei.hms.ads.uiengine.IRemoteViewDelegate
        public void onCreate(Bundle bundle) {
        }

        @Override // com.huawei.hms.ads.uiengine.IRemoteViewDelegate
        public void setCallback(IPPSUiEngineCallback iPPSUiEngineCallback) {
        }
    }
}
