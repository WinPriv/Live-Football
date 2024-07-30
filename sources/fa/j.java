package fa;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.huawei.hms.ads.cl;
import com.huawei.hms.ads.ec;
import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.constant.w;
import fa.g;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static j f28249b;

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f28250c = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final Context f28251a;

    public j(Context context) {
        String str;
        Context applicationContext = context.getApplicationContext();
        this.f28251a = applicationContext;
        ec.Code(context);
        if (cl.V(applicationContext)) {
            IntentFilter intentFilter = new IntentFilter(w.bl);
            Intent registerReceiver = applicationContext.registerReceiver(null, intentFilter, "com.huawei.permission.app.DOWNLOAD", null);
            if (registerReceiver != null && registerReceiver.getAction() != null && registerReceiver.getAction().equals(w.bl)) {
                Log.d("HiAdSplash", "HiAd: getIntent");
                new f(applicationContext).onReceive(applicationContext, registerReceiver);
            }
            applicationContext.registerReceiver(new f(applicationContext), intentFilter, "com.huawei.permission.app.DOWNLOAD", null);
            g a10 = g.a(applicationContext);
            Context context2 = a10.f28231a;
            try {
                a10.b();
                if (!cl.B(context2)) {
                    ex.I("ExSplashStartReceiver", "not inner device, no need to register");
                    return;
                }
                IntentFilter intentFilter2 = new IntentFilter(w.bm);
                Intent registerReceiver2 = context2.registerReceiver(null, intentFilter2, "com.huawei.permission.app.DOWNLOAD", null);
                if (registerReceiver2 != null && registerReceiver2.getAction() != null && registerReceiver2.getAction().equals(w.bm)) {
                    ex.V("ExSplashStartReceiver", "isExSplashStart");
                    context2.removeStickyBroadcast(registerReceiver2);
                }
                if (a10.f28233c == null) {
                    a10.f28233c = new g.a();
                }
                ex.V("ExSplashStartReceiver", "register receiver");
                context2.registerReceiver(a10.f28233c, intentFilter2, "com.huawei.permission.app.DOWNLOAD", null);
            } catch (IllegalStateException unused) {
                str = "registerReceiver IllegalStateException";
                ex.I("ExSplashStartReceiver", str);
            } catch (Throwable unused2) {
                str = "registerReceiver Exception";
                ex.I("ExSplashStartReceiver", str);
            }
        }
    }

    public static j a(Context context) {
        j jVar;
        synchronized (f28250c) {
            if (f28249b == null) {
                f28249b = new j(context);
            }
            jVar = f28249b;
        }
        return jVar;
    }
}
