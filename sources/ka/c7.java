package ka;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.huawei.android.hms.ppskit.b;
import ka.x6;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class c7 extends x6<com.huawei.android.hms.ppskit.b> {

    /* renamed from: i, reason: collision with root package name */
    public static c7 f31024i;

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f31025j = new byte[0];

    /* renamed from: h, reason: collision with root package name */
    public long f31026h;

    /* loaded from: classes2.dex */
    public static class a<T> extends x6.b<com.huawei.android.hms.ppskit.b> {

        /* renamed from: b, reason: collision with root package name */
        public final String f31027b;

        /* renamed from: c, reason: collision with root package name */
        public final String f31028c;

        /* renamed from: d, reason: collision with root package name */
        public final d7<T> f31029d;

        /* renamed from: e, reason: collision with root package name */
        public final Class<T> f31030e;

        public a(String str, String str2, d7<T> d7Var, Class<T> cls) {
            this.f31027b = str;
            this.f31028c = str2;
            this.f31029d = d7Var;
            this.f31030e = cls;
        }

        public static void c(d7 d7Var, String str, y6 y6Var) {
            if (d7Var != null) {
                d7Var.a(y6Var);
            }
        }

        @Override // ka.x6.b
        public final void a(com.huawei.android.hms.ppskit.b bVar) {
            String concat;
            String str = this.f31027b;
            com.huawei.android.hms.ppskit.b bVar2 = bVar;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("sdk_version", "3.4.65.300");
                jSONObject.put("content", this.f31028c);
                bVar2.g(str, jSONObject.toString(), new b7(this));
            } catch (RemoteException unused) {
                concat = "remote call RemoteException";
                n7.g("AdsCore.PPSApiServiceManager", concat);
                y6 y6Var = new y6(0);
                y6Var.f32210b = -1;
                y6Var.f32209a = concat;
                c(this.f31029d, str, y6Var);
            } catch (Throwable th) {
                concat = "remote call ".concat(th.getClass().getSimpleName());
                n7.g("AdsCore.PPSApiServiceManager", concat);
                y6 y6Var2 = new y6(0);
                y6Var2.f32210b = -1;
                y6Var2.f32209a = concat;
                c(this.f31029d, str, y6Var2);
            }
        }

        @Override // ka.x6.b
        public final void b() {
            n7.g("AdsCore.PPSApiServiceManager", "onServiceCallFailed");
            y6 y6Var = new y6(0);
            y6Var.f32210b = -1;
            y6Var.f32209a = "onServiceCallFailed";
            c(this.f31029d, this.f31027b, y6Var);
        }
    }

    public c7(Context context) {
        super(context);
    }

    public static c7 l(Context context) {
        c7 c7Var;
        synchronized (f31025j) {
            if (f31024i == null) {
                f31024i = new c7(context);
            }
            c7Var = f31024i;
        }
        return c7Var;
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
    public String b() {
        return "AdsCore.PPSApiServiceManager";
    }

    @Override // ka.x6
    public String f() {
        return this.f32164d.getPackageName();
    }

    @Override // ka.x6
    public final void g() {
        this.f31026h = System.currentTimeMillis();
    }

    @Override // ka.x6
    public final void h() {
        k("AidlConnectMonitorMethod", String.valueOf(System.currentTimeMillis() - this.f31026h), null, null);
    }

    public final <T> void k(String str, String str2, d7<T> d7Var, Class<T> cls) {
        n7.e(b(), "call remote method: ".concat(str));
        d(new a(str, str2, d7Var, cls));
    }

    @Override // ka.x6
    public final void e() {
    }

    @Override // ka.x6
    public final void i() {
    }

    @Override // ka.x6
    public final void j() {
    }
}
