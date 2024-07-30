package ha;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.transition.n;
import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.ipc.CallResult;
import ha.i;

/* loaded from: classes2.dex */
public abstract class f extends Binder implements IInterface {
    public f() {
        attachInterface(this, "com.huawei.android.hms.ppskit.IPPSResultCallback");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        String concat;
        if (i10 != 1) {
            if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            parcel2.writeString("com.huawei.android.hms.ppskit.IPPSResultCallback");
            return true;
        }
        parcel.enforceInterface("com.huawei.android.hms.ppskit.IPPSResultCallback");
        String readString = parcel.readString();
        int readInt = parcel.readInt();
        String readString2 = parcel.readString();
        h hVar = (h) this;
        if (ex.Code()) {
            ex.Code("Decouple.PPSApiServiceManager", "call: %s code: %s result: %s", readString, Integer.valueOf(readInt), n.e(readString2));
        }
        CallResult callResult = new CallResult();
        callResult.setCode(readInt);
        i.a aVar = hVar.f28813a;
        try {
            if (readInt == 200) {
                callResult.setData(n.c(aVar.f28820e, readString2));
            } else {
                callResult.setMsg(readString2);
            }
        } catch (IllegalArgumentException e10) {
            e = e10;
            concat = "onCallResult IllegalArgumentException";
            ex.I("Decouple.PPSApiServiceManager", concat);
            callResult.setCode(-1);
            callResult.setMsg(e.getMessage());
            aVar.c(aVar.f28819d, readString, callResult);
            parcel2.writeNoException();
            return true;
        } catch (Throwable th) {
            e = th;
            concat = "onCallResult ".concat(e.getClass().getSimpleName());
            ex.I("Decouple.PPSApiServiceManager", concat);
            callResult.setCode(-1);
            callResult.setMsg(e.getMessage());
            aVar.c(aVar.f28819d, readString, callResult);
            parcel2.writeNoException();
            return true;
        }
        aVar.c(aVar.f28819d, readString, callResult);
        parcel2.writeNoException();
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
