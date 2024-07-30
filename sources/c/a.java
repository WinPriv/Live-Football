package c;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: INotificationSideChannel.java */
/* loaded from: classes.dex */
public interface a extends IInterface {

    /* compiled from: INotificationSideChannel.java */
    /* renamed from: c.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0032a extends Binder implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f3193a = 0;

        /* compiled from: INotificationSideChannel.java */
        /* renamed from: c.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0033a implements a {

            /* renamed from: a, reason: collision with root package name */
            public final IBinder f3194a;

            public C0033a(IBinder iBinder) {
                this.f3194a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f3194a;
            }

            @Override // c.a
            public final void i(int i10, Notification notification, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i10);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f3194a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }
    }

    void i(int i10, Notification notification, String str, String str2) throws RemoteException;
}
