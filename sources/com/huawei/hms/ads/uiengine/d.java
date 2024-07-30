package com.huawei.hms.ads.uiengine;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.hms.ads.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes2.dex */
public interface d extends IInterface {

    /* loaded from: classes2.dex */
    public static class a implements d {
        @Override // com.huawei.hms.ads.uiengine.d
        public IObjectWrapper Code(IObjectWrapper iObjectWrapper) {
            return null;
        }

        @Override // com.huawei.hms.ads.uiengine.d
        public void V(int i10, Bundle bundle) {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.huawei.hms.ads.uiengine.d
        public List<String> Code(Bundle bundle) {
            return null;
        }

        @Override // com.huawei.hms.ads.uiengine.d
        public void V(IObjectWrapper iObjectWrapper, Bundle bundle) {
        }

        @Override // com.huawei.hms.ads.uiengine.d
        public void Code(int i10, Bundle bundle) {
        }

        @Override // com.huawei.hms.ads.uiengine.d
        public void Code(IObjectWrapper iObjectWrapper, Bundle bundle) {
        }

        @Override // com.huawei.hms.ads.uiengine.d
        public void Code(String str, Bundle bundle) {
        }

        @Override // com.huawei.hms.ads.uiengine.d
        public boolean Code(String str, int i10, Bundle bundle) {
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class b extends Binder implements d {
        static final int B = 5;
        static final int C = 6;
        static final int Code = 1;
        private static final String D = "com.huawei.hms.ads.uiengine.IUiEngineUtil";
        static final int F = 8;
        static final int I = 3;
        static final int S = 7;
        static final int V = 2;
        static final int Z = 4;

        /* loaded from: classes2.dex */
        public static class a implements d {
            public static d Code;
            private IBinder V;

            public a(IBinder iBinder) {
                this.V = iBinder;
            }

            @Override // com.huawei.hms.ads.uiengine.d
            public IObjectWrapper Code(IObjectWrapper iObjectWrapper) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.D);
                    obtain.writeStrongBinder(iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
                    if (!this.V.transact(4, obtain, obtain2, 0) && b.Code() != null) {
                        return b.Code().Code(iObjectWrapper);
                    }
                    obtain2.readException();
                    return IObjectWrapper.Stub.asInterface(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.d
            public void V(int i10, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.D);
                    obtain.writeInt(i10);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.V.transact(8, obtain, obtain2, 0) || b.Code() == null) {
                        obtain2.readException();
                    } else {
                        b.Code().V(i10, bundle);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.V;
            }

            public String Code() {
                return b.D;
            }

            @Override // com.huawei.hms.ads.uiengine.d
            public void V(IObjectWrapper iObjectWrapper, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.D);
                    obtain.writeStrongBinder(iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.V.transact(6, obtain, obtain2, 0) || b.Code() == null) {
                        obtain2.readException();
                    } else {
                        b.Code().V(iObjectWrapper, bundle);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.d
            public List<String> Code(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.D);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.V.transact(1, obtain, obtain2, 0) && b.Code() != null) {
                        return b.Code().Code(bundle);
                    }
                    obtain2.readException();
                    return obtain2.createStringArrayList();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.d
            public void Code(int i10, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.D);
                    obtain.writeInt(i10);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.V.transact(7, obtain, obtain2, 0) || b.Code() == null) {
                        obtain2.readException();
                    } else {
                        b.Code().Code(i10, bundle);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.d
            public void Code(IObjectWrapper iObjectWrapper, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.D);
                    obtain.writeStrongBinder(iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.V.transact(5, obtain, obtain2, 0) || b.Code() == null) {
                        obtain2.readException();
                    } else {
                        b.Code().Code(iObjectWrapper, bundle);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.d
            public void Code(String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.D);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.V.transact(2, obtain, obtain2, 0) || b.Code() == null) {
                        obtain2.readException();
                    } else {
                        b.Code().Code(str, bundle);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.d
            public boolean Code(String str, int i10, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.D);
                    obtain.writeString(str);
                    obtain.writeInt(i10);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.V.transact(3, obtain, obtain2, 0) && b.Code() != null) {
                        return b.Code().Code(str, i10, bundle);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, D);
        }

        public static d Code() {
            return a.Code;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 != 1598968902) {
                Bundle bundle = null;
                Bundle bundle2 = null;
                Bundle bundle3 = null;
                Bundle bundle4 = null;
                Bundle bundle5 = null;
                IBinder iBinder = null;
                Bundle bundle6 = null;
                Bundle bundle7 = null;
                switch (i10) {
                    case 1:
                        parcel.enforceInterface(D);
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        List<String> Code2 = Code(bundle);
                        parcel2.writeNoException();
                        parcel2.writeStringList(Code2);
                        return true;
                    case 2:
                        parcel.enforceInterface(D);
                        String readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle7 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        Code(readString, bundle7);
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface(D);
                        String readString2 = parcel.readString();
                        int readInt = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            bundle6 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        boolean Code3 = Code(readString2, readInt, bundle6);
                        parcel2.writeNoException();
                        parcel2.writeInt(Code3 ? 1 : 0);
                        return true;
                    case 4:
                        parcel.enforceInterface(D);
                        IObjectWrapper Code4 = Code(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        if (Code4 != null) {
                            iBinder = Code4.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 5:
                        parcel.enforceInterface(D);
                        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        if (parcel.readInt() != 0) {
                            bundle5 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        Code(asInterface, bundle5);
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel.enforceInterface(D);
                        IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        if (parcel.readInt() != 0) {
                            bundle4 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        V(asInterface2, bundle4);
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface(D);
                        int readInt2 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            bundle3 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        Code(readInt2, bundle3);
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        parcel.enforceInterface(D);
                        int readInt3 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        V(readInt3, bundle2);
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i10, parcel, parcel2, i11);
                }
            }
            parcel2.writeString(D);
            return true;
        }

        public static d Code(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(D);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof d)) ? new a(iBinder) : (d) queryLocalInterface;
        }

        public static boolean Code(d dVar) {
            if (a.Code != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (dVar == null) {
                return false;
            }
            a.Code = dVar;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    IObjectWrapper Code(IObjectWrapper iObjectWrapper);

    List<String> Code(Bundle bundle);

    void Code(int i10, Bundle bundle);

    void Code(IObjectWrapper iObjectWrapper, Bundle bundle);

    void Code(String str, Bundle bundle);

    boolean Code(String str, int i10, Bundle bundle);

    void V(int i10, Bundle bundle);

    void V(IObjectWrapper iObjectWrapper, Bundle bundle);
}
