package com.huawei.hms.ads.uiengine;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.hms.ads.uiengine.IPPSUiEngineCallback;
import com.huawei.hms.ads.uiengine.b;

/* loaded from: classes2.dex */
public interface IGlobalUtil extends IInterface {

    /* loaded from: classes2.dex */
    public static abstract class b extends Binder implements IGlobalUtil {
        static final int B = 5;
        static final int C = 6;
        static final int Code = 1;
        static final int I = 3;
        private static final String S = "com.huawei.hms.ads.uiengine.IGlobalUtil";
        static final int V = 2;
        static final int Z = 4;

        /* loaded from: classes2.dex */
        public static class a implements IGlobalUtil {
            public static IGlobalUtil Code;
            private IBinder V;

            public a(IBinder iBinder) {
                this.V = iBinder;
            }

            public String Code() {
                return b.S;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.V;
            }

            @Override // com.huawei.hms.ads.uiengine.IGlobalUtil
            public void getFilePath(String str, IPPSUiEngineCallback iPPSUiEngineCallback) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.S);
                    obtain.writeString(str);
                    if (iPPSUiEngineCallback != null) {
                        iBinder = iPPSUiEngineCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.V.transact(1, obtain, obtain2, 0) && b.Code() != null) {
                        b.Code().getFilePath(str, iPPSUiEngineCallback);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.IGlobalUtil
            public String getFilePathDirect(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.S);
                    obtain.writeString(str);
                    if (!this.V.transact(4, obtain, obtain2, 0) && b.Code() != null) {
                        return b.Code().getFilePathDirect(str);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.IGlobalUtil
            public String getFilePathDirectByCacheType(String str, int i10) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.S);
                    obtain.writeString(str);
                    obtain.writeInt(i10);
                    if (!this.V.transact(5, obtain, obtain2, 0) && b.Code() != null) {
                        return b.Code().getFilePathDirectByCacheType(str, i10);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.IGlobalUtil
            public com.huawei.hms.ads.uiengine.b getMultiMediaPlayingManager() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.S);
                    if (!this.V.transact(6, obtain, obtain2, 0) && b.Code() != null) {
                        return b.Code().getMultiMediaPlayingManager();
                    }
                    obtain2.readException();
                    return b.AbstractBinderC0282b.Code(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.IGlobalUtil
            public void registerActivityStartCallBack(IPPSUiEngineCallback iPPSUiEngineCallback) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.S);
                    if (iPPSUiEngineCallback != null) {
                        iBinder = iPPSUiEngineCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.V.transact(2, obtain, obtain2, 0) && b.Code() != null) {
                        b.Code().registerActivityStartCallBack(iPPSUiEngineCallback);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.IGlobalUtil
            public void unregisterActivityStartCallBack(IPPSUiEngineCallback iPPSUiEngineCallback) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.S);
                    if (iPPSUiEngineCallback != null) {
                        iBinder = iPPSUiEngineCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.V.transact(3, obtain, obtain2, 0) && b.Code() != null) {
                        b.Code().unregisterActivityStartCallBack(iPPSUiEngineCallback);
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
            attachInterface(this, S);
        }

        public static IGlobalUtil Code() {
            return a.Code;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            IBinder iBinder;
            if (i10 != 1598968902) {
                switch (i10) {
                    case 1:
                        parcel.enforceInterface(S);
                        getFilePath(parcel.readString(), IPPSUiEngineCallback.b.Code(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface(S);
                        registerActivityStartCallBack(IPPSUiEngineCallback.b.Code(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface(S);
                        unregisterActivityStartCallBack(IPPSUiEngineCallback.b.Code(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface(S);
                        String filePathDirect = getFilePathDirect(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(filePathDirect);
                        return true;
                    case 5:
                        parcel.enforceInterface(S);
                        String filePathDirectByCacheType = getFilePathDirectByCacheType(parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeString(filePathDirectByCacheType);
                        return true;
                    case 6:
                        parcel.enforceInterface(S);
                        com.huawei.hms.ads.uiengine.b multiMediaPlayingManager = getMultiMediaPlayingManager();
                        parcel2.writeNoException();
                        if (multiMediaPlayingManager != null) {
                            iBinder = multiMediaPlayingManager.asBinder();
                        } else {
                            iBinder = null;
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    default:
                        return super.onTransact(i10, parcel, parcel2, i11);
                }
            }
            parcel2.writeString(S);
            return true;
        }

        public static IGlobalUtil Code(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(S);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IGlobalUtil)) ? new a(iBinder) : (IGlobalUtil) queryLocalInterface;
        }

        public static boolean Code(IGlobalUtil iGlobalUtil) {
            if (a.Code != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iGlobalUtil == null) {
                return false;
            }
            a.Code = iGlobalUtil;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    void getFilePath(String str, IPPSUiEngineCallback iPPSUiEngineCallback);

    String getFilePathDirect(String str);

    String getFilePathDirectByCacheType(String str, int i10);

    com.huawei.hms.ads.uiengine.b getMultiMediaPlayingManager();

    void registerActivityStartCallBack(IPPSUiEngineCallback iPPSUiEngineCallback);

    void unregisterActivityStartCallBack(IPPSUiEngineCallback iPPSUiEngineCallback);

    /* loaded from: classes2.dex */
    public static class a implements IGlobalUtil {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.huawei.hms.ads.uiengine.IGlobalUtil
        public String getFilePathDirect(String str) {
            return null;
        }

        @Override // com.huawei.hms.ads.uiengine.IGlobalUtil
        public String getFilePathDirectByCacheType(String str, int i10) {
            return null;
        }

        @Override // com.huawei.hms.ads.uiengine.IGlobalUtil
        public com.huawei.hms.ads.uiengine.b getMultiMediaPlayingManager() {
            return null;
        }

        @Override // com.huawei.hms.ads.uiengine.IGlobalUtil
        public void registerActivityStartCallBack(IPPSUiEngineCallback iPPSUiEngineCallback) {
        }

        @Override // com.huawei.hms.ads.uiengine.IGlobalUtil
        public void unregisterActivityStartCallBack(IPPSUiEngineCallback iPPSUiEngineCallback) {
        }

        @Override // com.huawei.hms.ads.uiengine.IGlobalUtil
        public void getFilePath(String str, IPPSUiEngineCallback iPPSUiEngineCallback) {
        }
    }
}
