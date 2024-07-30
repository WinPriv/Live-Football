package ka;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.huawei.hms.ads.dynamic.DynamicModule;
import ka.x2;

/* loaded from: classes2.dex */
public final class nh {

    /* renamed from: a, reason: collision with root package name */
    public static volatile Context f31515a;

    /* renamed from: b, reason: collision with root package name */
    public static x2 f31516b;

    public static synchronized x2 a(Context context) {
        Context b10;
        boolean z10;
        synchronized (nh.class) {
            n7.e("RemoteInitializer", "newCreator");
            x2 x2Var = null;
            if (context == null) {
                n7.g("RemoteInitializer", "context is null return");
                return null;
            }
            if (f31516b != null) {
                n7.e("RemoteInitializer", "webViewClientCreator not null return");
                return f31516b;
            }
            try {
                b10 = b(context);
            } catch (Throwable th) {
                n7.i("RemoteInitializer", "failed " + th.getLocalizedMessage());
            }
            if (b10 == null) {
                n7.e("RemoteInitializer", "remoteContext is null return");
                return null;
            }
            IBinder iBinder = (IBinder) b10.getClassLoader().loadClass("com.huawei.hms.ads.uiengine.vmall.VmallWebViewClientCreator").newInstance();
            int i10 = x2.a.f32156a;
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.ads.uiengine.IVmallWebViewClientCreator");
                if (queryLocalInterface != null && (queryLocalInterface instanceof x2)) {
                    x2Var = (x2) queryLocalInterface;
                } else {
                    x2Var = new x2.a.C0432a(iBinder);
                }
            }
            f31516b = x2Var;
            StringBuilder sb2 = new StringBuilder("webViewClientCreator is null ? ");
            if (f31516b == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            sb2.append(z10);
            n7.e("RemoteInitializer", sb2.toString());
            return f31516b;
        }
    }

    public static Context b(Context context) {
        n7.e("RemoteInitializer", "newRemoteContext");
        if (f31515a != null) {
            return f31515a;
        }
        try {
            f31515a = DynamicModule.load(context, 1, "adsuiengine").getModuleContext();
        } catch (Throwable th) {
            n7.i("RemoteInitializer", "newRemoteContext failed " + th.getLocalizedMessage());
        }
        return f31515a;
    }
}
