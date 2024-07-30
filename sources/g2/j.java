package g2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.huawei.openalliance.ad.constant.ag;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28425a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28426b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28427c;

    public /* synthetic */ j(int i10, Object obj, Object obj2) {
        this.f28425a = i10;
        this.f28426b = obj;
        this.f28427c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        ServiceInfo serviceInfo;
        String str2;
        int i10;
        ComponentName startService;
        switch (this.f28425a) {
            case 0:
                return p.c((InputStream) this.f28426b, (String) this.f28427c);
            default:
                Context context = (Context) this.f28426b;
                Intent intent = (Intent) this.f28427c;
                Object obj = i8.k.f29280c;
                i8.x a10 = i8.x.a();
                a10.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                a10.f29309d.offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (a10) {
                    str = a10.f29306a;
                    if (str == null) {
                        ResolveInfo resolveService = context.getPackageManager().resolveService(intent2, 0);
                        if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                            if (context.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                                if (str2.startsWith(".")) {
                                    a10.f29306a = context.getPackageName() + serviceInfo.name;
                                } else {
                                    a10.f29306a = serviceInfo.name;
                                }
                                str = a10.f29306a;
                            }
                            Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                            str = null;
                        }
                        Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                        str = null;
                    }
                }
                if (str != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str));
                    }
                    intent2.setClassName(context.getPackageName(), str);
                }
                try {
                    if (a10.c(context)) {
                        startService = i8.f0.b(context, intent2);
                    } else {
                        startService = context.startService(intent2);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (startService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i10 = com.anythink.expressad.video.dynview.a.a.f11399v;
                    } else {
                        i10 = -1;
                    }
                } catch (IllegalStateException e10) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e10);
                    i10 = ag.f22000k;
                } catch (SecurityException e11) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e11);
                    i10 = ag.f21999j;
                }
                return Integer.valueOf(i10);
        }
    }
}
