package com.huawei.hms.ads.uiengine;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public interface ISplashApi extends IInterface {

    /* loaded from: classes2.dex */
    public static abstract class b extends Binder implements ISplashApi {
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
        static final int f21779a = 11;

        /* renamed from: b, reason: collision with root package name */
        static final int f21780b = 12;

        /* renamed from: c, reason: collision with root package name */
        static final int f21781c = 13;

        /* renamed from: d, reason: collision with root package name */
        static final int f21782d = 14;

        /* renamed from: e, reason: collision with root package name */
        static final int f21783e = 15;
        static final int f = 16;

        /* renamed from: g, reason: collision with root package name */
        static final int f21784g = 17;

        /* renamed from: h, reason: collision with root package name */
        static final int f21785h = 18;

        /* renamed from: i, reason: collision with root package name */
        static final int f21786i = 19;

        /* renamed from: j, reason: collision with root package name */
        static final int f21787j = 20;

        /* renamed from: k, reason: collision with root package name */
        private static final String f21788k = "com.huawei.hms.ads.uiengine.ISplashApi";

        /* loaded from: classes2.dex */
        public static class a implements ISplashApi {
            public static ISplashApi Code;
            private IBinder V;

            public a(IBinder iBinder) {
                this.V = iBinder;
            }

            public String Code() {
                return b.f21788k;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.V;
            }

            @Override // com.huawei.hms.ads.uiengine.ISplashApi
            public boolean isDestroyed() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f21788k);
                    boolean z10 = false;
                    if (!this.V.transact(19, obtain, obtain2, 0) && b.Code() != null) {
                        return b.Code().isDestroyed();
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

            @Override // com.huawei.hms.ads.uiengine.ISplashApi
            public boolean isFinishing() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f21788k);
                    boolean z10 = false;
                    if (!this.V.transact(18, obtain, obtain2, 0) && b.Code() != null) {
                        return b.Code().isFinishing();
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

            @Override // com.huawei.hms.ads.uiengine.ISplashApi
            public void notifyAdDismissed() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f21788k);
                    if (!this.V.transact(7, obtain, obtain2, 0) && b.Code() != null) {
                        b.Code().notifyAdDismissed();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.ISplashApi
            public void notifyAdFailedToLoad(int i10) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f21788k);
                    obtain.writeInt(i10);
                    if (!this.V.transact(9, obtain, obtain2, 0) && b.Code() != null) {
                        b.Code().notifyAdFailedToLoad(i10);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.ISplashApi
            public String notifyAdLoaded() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f21788k);
                    if (!this.V.transact(2, obtain, obtain2, 0) && b.Code() != null) {
                        return b.Code().notifyAdLoaded();
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.ISplashApi
            public void onAdFailToDisplay() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f21788k);
                    if (!this.V.transact(6, obtain, obtain2, 0) && b.Code() != null) {
                        b.Code().onAdFailToDisplay();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.ISplashApi
            public void onAdShowEnd(long j10, int i10) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f21788k);
                    obtain.writeLong(j10);
                    obtain.writeInt(i10);
                    if (!this.V.transact(15, obtain, obtain2, 0) && b.Code() != null) {
                        b.Code().onAdShowEnd(j10, i10);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.ISplashApi
            public void onDisplayTimeUp() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f21788k);
                    if (!this.V.transact(12, obtain, obtain2, 0) && b.Code() != null) {
                        b.Code().onDisplayTimeUp();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.ISplashApi
            public void onEasterEggPrepare() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f21788k);
                    if (!this.V.transact(20, obtain, obtain2, 0) && b.Code() != null) {
                        b.Code().onEasterEggPrepare();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.ISplashApi
            public void onFeedback(int i10) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f21788k);
                    obtain.writeInt(i10);
                    if (!this.V.transact(14, obtain, obtain2, 0) && b.Code() != null) {
                        b.Code().onFeedback(i10);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.ISplashApi
            public void onMaterialLoadFailed() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f21788k);
                    if (!this.V.transact(11, obtain, obtain2, 0) && b.Code() != null) {
                        b.Code().onMaterialLoadFailed();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.ISplashApi
            public void onMaterialLoaded() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f21788k);
                    if (!this.V.transact(5, obtain, obtain2, 0) && b.Code() != null) {
                        b.Code().onMaterialLoaded();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.ISplashApi
            public void onSkipAd(int i10, int i11) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f21788k);
                    obtain.writeInt(i10);
                    obtain.writeInt(i11);
                    if (!this.V.transact(13, obtain, obtain2, 0) && b.Code() != null) {
                        b.Code().onSkipAd(i10, i11);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.ISplashApi
            public void onStartEasterEggFailed(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f21788k);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.V.transact(17, obtain, obtain2, 0) && b.Code() != null) {
                        b.Code().onStartEasterEggFailed(bundle);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.ISplashApi
            public boolean onTouch(int i10, int i11, long j10, String str, int i12) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f21788k);
                    obtain.writeInt(i10);
                    obtain.writeInt(i11);
                    obtain.writeLong(j10);
                    obtain.writeString(str);
                    obtain.writeInt(i12);
                    try {
                        boolean z10 = false;
                        if (!this.V.transact(1, obtain, obtain2, 0) && b.Code() != null) {
                            boolean onTouch = b.Code().onTouch(i10, i11, j10, str, i12);
                            obtain2.recycle();
                            obtain.recycle();
                            return onTouch;
                        }
                        obtain2.readException();
                        if (obtain2.readInt() != 0) {
                            z10 = true;
                        }
                        obtain2.recycle();
                        obtain.recycle();
                        return z10;
                    } catch (Throwable th) {
                        th = th;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }

            @Override // com.huawei.hms.ads.uiengine.ISplashApi
            public void removeExSplashBlock() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f21788k);
                    if (!this.V.transact(10, obtain, obtain2, 0) && b.Code() != null) {
                        b.Code().removeExSplashBlock();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.ISplashApi
            public void reportEvents(String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f21788k);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.V.transact(16, obtain, obtain2, 0) && b.Code() != null) {
                        b.Code().reportEvents(str, bundle);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.ISplashApi
            public void reportShowStartEvent() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f21788k);
                    if (!this.V.transact(3, obtain, obtain2, 0) && b.Code() != null) {
                        b.Code().reportShowStartEvent();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.ISplashApi
            public void toShowSpare(int i10) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f21788k);
                    obtain.writeInt(i10);
                    if (!this.V.transact(8, obtain, obtain2, 0) && b.Code() != null) {
                        b.Code().toShowSpare(i10);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.ISplashApi
            public void updatePhyShowStart(long j10) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f21788k);
                    obtain.writeLong(j10);
                    if (!this.V.transact(4, obtain, obtain2, 0) && b.Code() != null) {
                        b.Code().updatePhyShowStart(j10);
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
            attachInterface(this, f21788k);
        }

        public static ISplashApi Code() {
            return a.Code;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 != 1598968902) {
                Bundle bundle = null;
                switch (i10) {
                    case 1:
                        parcel.enforceInterface(f21788k);
                        boolean onTouch = onTouch(parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(onTouch ? 1 : 0);
                        return true;
                    case 2:
                        parcel.enforceInterface(f21788k);
                        String notifyAdLoaded = notifyAdLoaded();
                        parcel2.writeNoException();
                        parcel2.writeString(notifyAdLoaded);
                        return true;
                    case 3:
                        parcel.enforceInterface(f21788k);
                        reportShowStartEvent();
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface(f21788k);
                        updatePhyShowStart(parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface(f21788k);
                        onMaterialLoaded();
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel.enforceInterface(f21788k);
                        onAdFailToDisplay();
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface(f21788k);
                        notifyAdDismissed();
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        parcel.enforceInterface(f21788k);
                        toShowSpare(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        parcel.enforceInterface(f21788k);
                        notifyAdFailedToLoad(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 10:
                        parcel.enforceInterface(f21788k);
                        removeExSplashBlock();
                        parcel2.writeNoException();
                        return true;
                    case 11:
                        parcel.enforceInterface(f21788k);
                        onMaterialLoadFailed();
                        parcel2.writeNoException();
                        return true;
                    case 12:
                        parcel.enforceInterface(f21788k);
                        onDisplayTimeUp();
                        parcel2.writeNoException();
                        return true;
                    case 13:
                        parcel.enforceInterface(f21788k);
                        onSkipAd(parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 14:
                        parcel.enforceInterface(f21788k);
                        onFeedback(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 15:
                        parcel.enforceInterface(f21788k);
                        onAdShowEnd(parcel.readLong(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 16:
                        parcel.enforceInterface(f21788k);
                        String readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        reportEvents(readString, bundle);
                        parcel2.writeNoException();
                        return true;
                    case 17:
                        parcel.enforceInterface(f21788k);
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        onStartEasterEggFailed(bundle);
                        parcel2.writeNoException();
                        return true;
                    case 18:
                        parcel.enforceInterface(f21788k);
                        boolean isFinishing = isFinishing();
                        parcel2.writeNoException();
                        parcel2.writeInt(isFinishing ? 1 : 0);
                        return true;
                    case 19:
                        parcel.enforceInterface(f21788k);
                        boolean isDestroyed = isDestroyed();
                        parcel2.writeNoException();
                        parcel2.writeInt(isDestroyed ? 1 : 0);
                        return true;
                    case 20:
                        parcel.enforceInterface(f21788k);
                        onEasterEggPrepare();
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i10, parcel, parcel2, i11);
                }
            }
            parcel2.writeString(f21788k);
            return true;
        }

        public static ISplashApi Code(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f21788k);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ISplashApi)) ? new a(iBinder) : (ISplashApi) queryLocalInterface;
        }

        public static boolean Code(ISplashApi iSplashApi) {
            if (a.Code != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iSplashApi == null) {
                return false;
            }
            a.Code = iSplashApi;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    boolean isDestroyed();

    boolean isFinishing();

    void notifyAdDismissed();

    void notifyAdFailedToLoad(int i10);

    String notifyAdLoaded();

    void onAdFailToDisplay();

    void onAdShowEnd(long j10, int i10);

    void onDisplayTimeUp();

    void onEasterEggPrepare();

    void onFeedback(int i10);

    void onMaterialLoadFailed();

    void onMaterialLoaded();

    void onSkipAd(int i10, int i11);

    void onStartEasterEggFailed(Bundle bundle);

    boolean onTouch(int i10, int i11, long j10, String str, int i12);

    void removeExSplashBlock();

    void reportEvents(String str, Bundle bundle);

    void reportShowStartEvent();

    void toShowSpare(int i10);

    void updatePhyShowStart(long j10);

    /* loaded from: classes2.dex */
    public static class a implements ISplashApi {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.huawei.hms.ads.uiengine.ISplashApi
        public boolean isDestroyed() {
            return false;
        }

        @Override // com.huawei.hms.ads.uiengine.ISplashApi
        public boolean isFinishing() {
            return false;
        }

        @Override // com.huawei.hms.ads.uiengine.ISplashApi
        public String notifyAdLoaded() {
            return null;
        }

        @Override // com.huawei.hms.ads.uiengine.ISplashApi
        public boolean onTouch(int i10, int i11, long j10, String str, int i12) {
            return false;
        }

        @Override // com.huawei.hms.ads.uiengine.ISplashApi
        public void notifyAdDismissed() {
        }

        @Override // com.huawei.hms.ads.uiengine.ISplashApi
        public void onAdFailToDisplay() {
        }

        @Override // com.huawei.hms.ads.uiengine.ISplashApi
        public void onDisplayTimeUp() {
        }

        @Override // com.huawei.hms.ads.uiengine.ISplashApi
        public void onEasterEggPrepare() {
        }

        @Override // com.huawei.hms.ads.uiengine.ISplashApi
        public void onMaterialLoadFailed() {
        }

        @Override // com.huawei.hms.ads.uiengine.ISplashApi
        public void onMaterialLoaded() {
        }

        @Override // com.huawei.hms.ads.uiengine.ISplashApi
        public void removeExSplashBlock() {
        }

        @Override // com.huawei.hms.ads.uiengine.ISplashApi
        public void reportShowStartEvent() {
        }

        @Override // com.huawei.hms.ads.uiengine.ISplashApi
        public void notifyAdFailedToLoad(int i10) {
        }

        @Override // com.huawei.hms.ads.uiengine.ISplashApi
        public void onFeedback(int i10) {
        }

        @Override // com.huawei.hms.ads.uiengine.ISplashApi
        public void onStartEasterEggFailed(Bundle bundle) {
        }

        @Override // com.huawei.hms.ads.uiengine.ISplashApi
        public void toShowSpare(int i10) {
        }

        @Override // com.huawei.hms.ads.uiengine.ISplashApi
        public void updatePhyShowStart(long j10) {
        }

        @Override // com.huawei.hms.ads.uiengine.ISplashApi
        public void onAdShowEnd(long j10, int i10) {
        }

        @Override // com.huawei.hms.ads.uiengine.ISplashApi
        public void onSkipAd(int i10, int i11) {
        }

        @Override // com.huawei.hms.ads.uiengine.ISplashApi
        public void reportEvents(String str, Bundle bundle) {
        }
    }
}
