package ka;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.hms.ads.dynamic.IObjectWrapper;
import ka.x3;

/* loaded from: classes2.dex */
public interface x2 extends IInterface {

    /* loaded from: classes2.dex */
    public static abstract class a extends Binder implements x2 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f32156a = 0;

        /* renamed from: ka.x2$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0432a implements x2 {

            /* renamed from: a, reason: collision with root package name */
            public final IBinder f32157a;

            public C0432a(IBinder iBinder) {
                this.f32157a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f32157a;
            }

            @Override // ka.x2
            public final x3 k(IObjectWrapper iObjectWrapper, Bundle bundle) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.ads.uiengine.IVmallWebViewClientCreator");
                    if (iObjectWrapper != null) {
                        iBinder = iObjectWrapper.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                    if (!this.f32157a.transact(1, obtain, obtain2, 0)) {
                        int i10 = a.f32156a;
                    }
                    obtain2.readException();
                    return x3.a.m(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }

    x3 k(IObjectWrapper iObjectWrapper, Bundle bundle);
}
