package com.huawei.hms.ads.uiengine;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.hms.ads.uiengine.a;

/* loaded from: classes2.dex */
public interface b extends IInterface {

    /* loaded from: classes2.dex */
    public static class a implements b {
        @Override // com.huawei.hms.ads.uiengine.b
        public void Code(com.huawei.hms.ads.uiengine.a aVar) {
        }

        @Override // com.huawei.hms.ads.uiengine.b
        public void V(com.huawei.hms.ads.uiengine.a aVar) {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.huawei.hms.ads.uiengine.b
        public void Code(String str, com.huawei.hms.ads.uiengine.a aVar) {
        }

        @Override // com.huawei.hms.ads.uiengine.b
        public void V(String str, com.huawei.hms.ads.uiengine.a aVar) {
        }

        @Override // com.huawei.hms.ads.uiengine.b
        public void I(String str, com.huawei.hms.ads.uiengine.a aVar) {
        }

        @Override // com.huawei.hms.ads.uiengine.b
        public void Z(String str, com.huawei.hms.ads.uiengine.a aVar) {
        }
    }

    /* renamed from: com.huawei.hms.ads.uiengine.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC0282b extends Binder implements b {
        static final int B = 5;
        static final int C = 6;
        static final int Code = 1;
        static final int I = 3;
        private static final String S = "com.huawei.hms.ads.uiengine.IMultiMPlayingManager";
        static final int V = 2;
        static final int Z = 4;

        /* renamed from: com.huawei.hms.ads.uiengine.b$b$a */
        /* loaded from: classes2.dex */
        public static class a implements b {
            public static b Code;
            private IBinder V;

            public a(IBinder iBinder) {
                this.V = iBinder;
            }

            public String Code() {
                return AbstractBinderC0282b.S;
            }

            @Override // com.huawei.hms.ads.uiengine.b
            public void I(String str, com.huawei.hms.ads.uiengine.a aVar) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0282b.S);
                    obtain.writeString(str);
                    if (aVar != null) {
                        iBinder = aVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.V.transact(3, obtain, obtain2, 0) && AbstractBinderC0282b.Code() != null) {
                        AbstractBinderC0282b.Code().I(str, aVar);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.b
            public void V(com.huawei.hms.ads.uiengine.a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0282b.S);
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    if (this.V.transact(6, obtain, obtain2, 0) || AbstractBinderC0282b.Code() == null) {
                        obtain2.readException();
                    } else {
                        AbstractBinderC0282b.Code().V(aVar);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.b
            public void Z(String str, com.huawei.hms.ads.uiengine.a aVar) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0282b.S);
                    obtain.writeString(str);
                    if (aVar != null) {
                        iBinder = aVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.V.transact(4, obtain, obtain2, 0) && AbstractBinderC0282b.Code() != null) {
                        AbstractBinderC0282b.Code().Z(str, aVar);
                    } else {
                        obtain2.readException();
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

            @Override // com.huawei.hms.ads.uiengine.b
            public void Code(com.huawei.hms.ads.uiengine.a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0282b.S);
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    if (this.V.transact(5, obtain, obtain2, 0) || AbstractBinderC0282b.Code() == null) {
                        obtain2.readException();
                    } else {
                        AbstractBinderC0282b.Code().Code(aVar);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.b
            public void V(String str, com.huawei.hms.ads.uiengine.a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0282b.S);
                    obtain.writeString(str);
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    if (this.V.transact(2, obtain, obtain2, 0) || AbstractBinderC0282b.Code() == null) {
                        obtain2.readException();
                    } else {
                        AbstractBinderC0282b.Code().V(str, aVar);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.b
            public void Code(String str, com.huawei.hms.ads.uiengine.a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0282b.S);
                    obtain.writeString(str);
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    if (this.V.transact(1, obtain, obtain2, 0) || AbstractBinderC0282b.Code() == null) {
                        obtain2.readException();
                    } else {
                        AbstractBinderC0282b.Code().Code(str, aVar);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0282b() {
            attachInterface(this, S);
        }

        public static b Code() {
            return a.Code;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 != 1598968902) {
                switch (i10) {
                    case 1:
                        parcel.enforceInterface(S);
                        Code(parcel.readString(), a.b.Code(parcel.readStrongBinder()));
                        break;
                    case 2:
                        parcel.enforceInterface(S);
                        V(parcel.readString(), a.b.Code(parcel.readStrongBinder()));
                        break;
                    case 3:
                        parcel.enforceInterface(S);
                        I(parcel.readString(), a.b.Code(parcel.readStrongBinder()));
                        break;
                    case 4:
                        parcel.enforceInterface(S);
                        Z(parcel.readString(), a.b.Code(parcel.readStrongBinder()));
                        break;
                    case 5:
                        parcel.enforceInterface(S);
                        Code(a.b.Code(parcel.readStrongBinder()));
                        break;
                    case 6:
                        parcel.enforceInterface(S);
                        V(a.b.Code(parcel.readStrongBinder()));
                        break;
                    default:
                        return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeNoException();
                return true;
            }
            parcel2.writeString(S);
            return true;
        }

        public static b Code(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(S);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof b)) ? new a(iBinder) : (b) queryLocalInterface;
        }

        public static boolean Code(b bVar) {
            if (a.Code != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (bVar == null) {
                return false;
            }
            a.Code = bVar;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    void Code(com.huawei.hms.ads.uiengine.a aVar);

    void Code(String str, com.huawei.hms.ads.uiengine.a aVar);

    void I(String str, com.huawei.hms.ads.uiengine.a aVar);

    void V(com.huawei.hms.ads.uiengine.a aVar);

    void V(String str, com.huawei.hms.ads.uiengine.a aVar);

    void Z(String str, com.huawei.hms.ads.uiengine.a aVar);
}
