package ka;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.huawei.android.hms.ppskit.b;
import ka.x6;

/* loaded from: classes2.dex */
public final class a7 extends x6<com.huawei.android.hms.ppskit.b> {

    /* renamed from: h, reason: collision with root package name */
    public static a7 f30926h;

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f30927i = new byte[0];

    /* loaded from: classes2.dex */
    public static class a extends x6.b<com.huawei.android.hms.ppskit.b> {
        @Override // ka.x6.b
        public final void a(com.huawei.android.hms.ppskit.b bVar) {
            try {
                bVar.a();
            } catch (RemoteException unused) {
                n7.g("PPSApiServiceManager", "OnRequestingAdTask RemoteException");
            }
        }
    }

    public a7(Context context) {
        super(context);
    }

    @Override // ka.x6
    public final com.huawei.android.hms.ppskit.b a(IBinder iBinder) {
        int i10 = b.a.f21516a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.huawei.android.hms.ppskit.IPPSServiceApi");
        if (queryLocalInterface != null && (queryLocalInterface instanceof com.huawei.android.hms.ppskit.b)) {
            return (com.huawei.android.hms.ppskit.b) queryLocalInterface;
        }
        return new b.a.C0246a(iBinder);
    }

    @Override // ka.x6
    public final String b() {
        return "PPSApiServiceManager";
    }

    @Override // ka.x6
    public final String f() {
        return com.huawei.openalliance.ad.ppskit.utils.o2.h(this.f32164d);
    }

    @Override // ka.x6
    public final void e() {
    }

    @Override // ka.x6
    public final void g() {
    }

    @Override // ka.x6
    public final void h() {
    }

    @Override // ka.x6
    public final void i() {
    }

    @Override // ka.x6
    public final void j() {
    }
}
