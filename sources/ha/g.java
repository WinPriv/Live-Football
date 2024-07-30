package ha;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public interface g extends IInterface {

    /* loaded from: classes2.dex */
    public static abstract class a extends Binder implements g {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f28811a = 0;

        /* renamed from: ha.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0392a implements g {

            /* renamed from: a, reason: collision with root package name */
            public final IBinder f28812a;

            public C0392a(IBinder iBinder) {
                this.f28812a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f28812a;
            }

            @Override // ha.g
            public final void h(String str, String str2, h hVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.android.hms.ppskit.IPPSServiceApi");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStrongBinder(hVar);
                    if (!this.f28812a.transact(2, obtain, obtain2, 0)) {
                        int i10 = a.f28811a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }

    void h(String str, String str2, h hVar);
}
