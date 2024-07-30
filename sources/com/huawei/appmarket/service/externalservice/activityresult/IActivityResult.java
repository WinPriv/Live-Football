package com.huawei.appmarket.service.externalservice.activityresult;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.openalliance.ad.activity.AgProtocolActivity;

/* loaded from: classes2.dex */
public interface IActivityResult extends IInterface {
    void onActivityCancel(int i10);

    /* loaded from: classes2.dex */
    public static abstract class a extends Binder implements IActivityResult {
        public a() {
            attachInterface(this, "com.huawei.appmarket.service.externalservice.activityresult.IActivityResult");
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 != 1) {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeString("com.huawei.appmarket.service.externalservice.activityresult.IActivityResult");
                return true;
            }
            parcel.enforceInterface("com.huawei.appmarket.service.externalservice.activityresult.IActivityResult");
            ((AgProtocolActivity.b) this).onActivityCancel(parcel.readInt());
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}
