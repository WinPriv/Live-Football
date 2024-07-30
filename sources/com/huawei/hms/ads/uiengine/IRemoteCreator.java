package com.huawei.hms.ads.uiengine;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.hms.ads.dynamic.IObjectWrapper;
import com.huawei.hms.ads.uiengine.IGlobalUtil;
import com.huawei.hms.ads.uiengine.IRemoteViewDelegate;
import com.huawei.hms.ads.uiengine.ISplashApi;
import com.huawei.hms.ads.uiengine.c;
import com.huawei.hms.ads.uiengine.d;

/* loaded from: classes2.dex */
public interface IRemoteCreator extends IInterface {

    /* loaded from: classes2.dex */
    public static abstract class b extends Binder implements IRemoteCreator {
        static final int B = 5;
        static final int C = 6;
        static final int Code = 1;
        static final int D = 9;
        static final int F = 8;
        static final int I = 3;
        private static final String L = "com.huawei.hms.ads.uiengine.IRemoteCreator";
        static final int S = 7;
        static final int V = 2;
        static final int Z = 4;

        /* loaded from: classes2.dex */
        public static class a implements IRemoteCreator {
            public static IRemoteCreator Code;
            private IBinder V;

            public a(IBinder iBinder) {
                this.V = iBinder;
            }

            public String Code() {
                return b.L;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.V;
            }

            @Override // com.huawei.hms.ads.uiengine.IRemoteCreator
            public void bindData(IObjectWrapper iObjectWrapper, String str) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.L);
                    if (iObjectWrapper != null) {
                        iBinder = iObjectWrapper.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    if (!this.V.transact(6, obtain, obtain2, 0) && b.Code() != null) {
                        b.Code().bindData(iObjectWrapper, str);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.IRemoteCreator
            public void destroyView(IObjectWrapper iObjectWrapper) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.L);
                    if (iObjectWrapper != null) {
                        iBinder = iObjectWrapper.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.V.transact(8, obtain, obtain2, 0) && b.Code() != null) {
                        b.Code().destroyView(iObjectWrapper);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.IRemoteCreator
            public d getUiEngineUtil() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.L);
                    if (!this.V.transact(9, obtain, obtain2, 0) && b.Code() != null) {
                        return b.Code().getUiEngineUtil();
                    }
                    obtain2.readException();
                    return d.b.Code(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.IRemoteCreator
            public String getVersion() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.L);
                    if (!this.V.transact(1, obtain, obtain2, 0) && b.Code() != null) {
                        return b.Code().getVersion();
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.IRemoteCreator
            public IObjectWrapper newBannerTemplateView(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.L);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.V.transact(5, obtain, obtain2, 0) && b.Code() != null) {
                        return b.Code().newBannerTemplateView(bundle);
                    }
                    obtain2.readException();
                    return IObjectWrapper.Stub.asInterface(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.IRemoteCreator
            public IObjectWrapper newNativeTemplateView(Bundle bundle, c cVar) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.L);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (cVar != null) {
                        iBinder = cVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.V.transact(4, obtain, obtain2, 0) && b.Code() != null) {
                        return b.Code().newNativeTemplateView(bundle, cVar);
                    }
                    obtain2.readException();
                    return IObjectWrapper.Stub.asInterface(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.IRemoteCreator
            public IRemoteViewDelegate newRemoteViewDelegate(IObjectWrapper iObjectWrapper, String str, Bundle bundle) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.L);
                    if (iObjectWrapper != null) {
                        iBinder = iObjectWrapper.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.V.transact(7, obtain, obtain2, 0) && b.Code() != null) {
                        return b.Code().newRemoteViewDelegate(iObjectWrapper, str, bundle);
                    }
                    obtain2.readException();
                    return IRemoteViewDelegate.b.Code(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.IRemoteCreator
            public IObjectWrapper newSplashTemplateView(Bundle bundle, ISplashApi iSplashApi) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.L);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (iSplashApi != null) {
                        iBinder = iSplashApi.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.V.transact(3, obtain, obtain2, 0) && b.Code() != null) {
                        return b.Code().newSplashTemplateView(bundle, iSplashApi);
                    }
                    obtain2.readException();
                    return IObjectWrapper.Stub.asInterface(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.IRemoteCreator
            public void setGlobalUtil(IGlobalUtil iGlobalUtil) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.L);
                    if (iGlobalUtil != null) {
                        iBinder = iGlobalUtil.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.V.transact(2, obtain, obtain2, 0) && b.Code() != null) {
                        b.Code().setGlobalUtil(iGlobalUtil);
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
            attachInterface(this, L);
        }

        public static IRemoteCreator Code() {
            return a.Code;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            Bundle bundle;
            Bundle bundle2;
            Bundle bundle3;
            Bundle bundle4;
            if (i10 != 1598968902) {
                IBinder iBinder = null;
                switch (i10) {
                    case 1:
                        parcel.enforceInterface(L);
                        String version = getVersion();
                        parcel2.writeNoException();
                        parcel2.writeString(version);
                        return true;
                    case 2:
                        parcel.enforceInterface(L);
                        setGlobalUtil(IGlobalUtil.b.Code(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface(L);
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        } else {
                            bundle = null;
                        }
                        IObjectWrapper newSplashTemplateView = newSplashTemplateView(bundle, ISplashApi.b.Code(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        if (newSplashTemplateView != null) {
                            iBinder = newSplashTemplateView.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 4:
                        parcel.enforceInterface(L);
                        if (parcel.readInt() != 0) {
                            bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        } else {
                            bundle2 = null;
                        }
                        IObjectWrapper newNativeTemplateView = newNativeTemplateView(bundle2, c.b.Code(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        if (newNativeTemplateView != null) {
                            iBinder = newNativeTemplateView.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 5:
                        parcel.enforceInterface(L);
                        if (parcel.readInt() != 0) {
                            bundle3 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        } else {
                            bundle3 = null;
                        }
                        IObjectWrapper newBannerTemplateView = newBannerTemplateView(bundle3);
                        parcel2.writeNoException();
                        if (newBannerTemplateView != null) {
                            iBinder = newBannerTemplateView.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 6:
                        parcel.enforceInterface(L);
                        bindData(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface(L);
                        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        String readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle4 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        } else {
                            bundle4 = null;
                        }
                        IRemoteViewDelegate newRemoteViewDelegate = newRemoteViewDelegate(asInterface, readString, bundle4);
                        parcel2.writeNoException();
                        if (newRemoteViewDelegate != null) {
                            iBinder = newRemoteViewDelegate.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 8:
                        parcel.enforceInterface(L);
                        destroyView(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        parcel.enforceInterface(L);
                        d uiEngineUtil = getUiEngineUtil();
                        parcel2.writeNoException();
                        if (uiEngineUtil != null) {
                            iBinder = uiEngineUtil.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    default:
                        return super.onTransact(i10, parcel, parcel2, i11);
                }
            }
            parcel2.writeString(L);
            return true;
        }

        public static IRemoteCreator Code(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(L);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IRemoteCreator)) ? new a(iBinder) : (IRemoteCreator) queryLocalInterface;
        }

        public static boolean Code(IRemoteCreator iRemoteCreator) {
            if (a.Code != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iRemoteCreator == null) {
                return false;
            }
            a.Code = iRemoteCreator;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    void bindData(IObjectWrapper iObjectWrapper, String str);

    void destroyView(IObjectWrapper iObjectWrapper);

    d getUiEngineUtil();

    String getVersion();

    IObjectWrapper newBannerTemplateView(Bundle bundle);

    IObjectWrapper newNativeTemplateView(Bundle bundle, c cVar);

    IRemoteViewDelegate newRemoteViewDelegate(IObjectWrapper iObjectWrapper, String str, Bundle bundle);

    IObjectWrapper newSplashTemplateView(Bundle bundle, ISplashApi iSplashApi);

    void setGlobalUtil(IGlobalUtil iGlobalUtil);

    /* loaded from: classes2.dex */
    public static class a implements IRemoteCreator {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.huawei.hms.ads.uiengine.IRemoteCreator
        public d getUiEngineUtil() {
            return null;
        }

        @Override // com.huawei.hms.ads.uiengine.IRemoteCreator
        public String getVersion() {
            return null;
        }

        @Override // com.huawei.hms.ads.uiengine.IRemoteCreator
        public IObjectWrapper newBannerTemplateView(Bundle bundle) {
            return null;
        }

        @Override // com.huawei.hms.ads.uiengine.IRemoteCreator
        public IObjectWrapper newNativeTemplateView(Bundle bundle, c cVar) {
            return null;
        }

        @Override // com.huawei.hms.ads.uiengine.IRemoteCreator
        public IRemoteViewDelegate newRemoteViewDelegate(IObjectWrapper iObjectWrapper, String str, Bundle bundle) {
            return null;
        }

        @Override // com.huawei.hms.ads.uiengine.IRemoteCreator
        public IObjectWrapper newSplashTemplateView(Bundle bundle, ISplashApi iSplashApi) {
            return null;
        }

        @Override // com.huawei.hms.ads.uiengine.IRemoteCreator
        public void destroyView(IObjectWrapper iObjectWrapper) {
        }

        @Override // com.huawei.hms.ads.uiengine.IRemoteCreator
        public void setGlobalUtil(IGlobalUtil iGlobalUtil) {
        }

        @Override // com.huawei.hms.ads.uiengine.IRemoteCreator
        public void bindData(IObjectWrapper iObjectWrapper, String str) {
        }
    }
}
