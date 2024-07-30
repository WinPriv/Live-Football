package ka;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.hms.ads.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public interface x3 extends IInterface {

    /* loaded from: classes2.dex */
    public static abstract class a extends Binder implements x3 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f32158a = 0;

        /* renamed from: ka.x3$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0433a implements x3 {

            /* renamed from: a, reason: collision with root package name */
            public final IBinder f32159a;

            public C0433a(IBinder iBinder) {
                this.f32159a = iBinder;
            }

            @Override // ka.x3
            public final IObjectWrapper a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.ads.uiengine.IVmallWebViewClientDelegate");
                    if (!this.f32159a.transact(1, obtain, obtain2, 0)) {
                        int i10 = a.f32158a;
                    }
                    obtain2.readException();
                    return IObjectWrapper.Stub.asInterface(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f32159a;
            }

            @Override // ka.x3
            public final boolean b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.ads.uiengine.IVmallWebViewClientDelegate");
                    boolean z10 = false;
                    if (!this.f32159a.transact(2, obtain, obtain2, 0)) {
                        int i10 = a.f32158a;
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

            @Override // ka.x3
            public final void c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.ads.uiengine.IVmallWebViewClientDelegate");
                    if (!this.f32159a.transact(3, obtain, obtain2, 0)) {
                        int i10 = a.f32158a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // ka.x3
            public final void d() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.ads.uiengine.IVmallWebViewClientDelegate");
                    if (!this.f32159a.transact(4, obtain, obtain2, 0)) {
                        int i10 = a.f32158a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // ka.x3
            public final void e() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.ads.uiengine.IVmallWebViewClientDelegate");
                    if (!this.f32159a.transact(5, obtain, obtain2, 0)) {
                        int i10 = a.f32158a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static x3 m(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.ads.uiengine.IVmallWebViewClientDelegate");
            if (queryLocalInterface != null && (queryLocalInterface instanceof x3)) {
                return (x3) queryLocalInterface;
            }
            return new C0433a(iBinder);
        }
    }

    IObjectWrapper a();

    boolean b();

    void c();

    void d();

    void e();
}
