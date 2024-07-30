package ra;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.download.app.AppDownloadTask;
import com.huawei.openalliance.ad.ppskit.inter.data.AppInfo;
import com.huawei.openalliance.ad.ppskit.utils.k1;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import com.huawei.openalliance.ad.ppskit.utils.w1;
import com.huawei.openalliance.ad.ppskit.utils.z1;
import java.io.File;
import java.util.concurrent.Callable;
import ka.n7;

/* loaded from: classes2.dex */
public final class g extends qa.b<AppDownloadTask> {

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f34952h = new byte[0];

    /* renamed from: i, reason: collision with root package name */
    public static g f34953i;

    /* renamed from: g, reason: collision with root package name */
    public final f f34954g;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f34955s;

        public a(Context context) {
            this.f34955s = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            g.this.f34721c = g.k(this.f34955s);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Callable<String> {
        public b() {
        }

        @Override // java.util.concurrent.Callable
        public final String call() {
            return g.k(g.this.f34719a);
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Callable<String> {
        public c() {
        }

        @Override // java.util.concurrent.Callable
        public final String call() {
            return g.k(g.this.f34719a);
        }
    }

    /* loaded from: classes2.dex */
    public class d extends BroadcastReceiver {

        /* loaded from: classes2.dex */
        public class a implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ Context f34960s;

            public a(Context context) {
                this.f34960s = context;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Context context = this.f34960s;
                boolean g6 = k1.g(context);
                d dVar = d.this;
                if (g6 && k1.e(context)) {
                    g.this.getClass();
                } else if (!k1.g(context) || !k1.e(context)) {
                    g.this.getClass();
                }
            }
        }

        public d() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (n7.d()) {
                n7.c("AppDownloadManager", "netReceiver.onReceive, action:%s", intent.getAction());
            }
            Context applicationContext = context.getApplicationContext();
            if (!com.huawei.openalliance.ad.ppskit.handlers.l.d(applicationContext).k()) {
                n7.e("AppDownloadManager", "user info is not enabled");
            } else {
                p2.a(new a(applicationContext), 3);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class e {

        /* renamed from: a, reason: collision with root package name */
        public final Context f34962a;

        /* renamed from: b, reason: collision with root package name */
        public final a f34963b = new a();

        /* loaded from: classes2.dex */
        public class a extends ConnectivityManager.NetworkCallback {

            /* renamed from: ra.g$e$a$a, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public class RunnableC0473a implements Runnable {

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ Context f34966s;

                public RunnableC0473a(Context context) {
                    this.f34966s = context;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Context context = this.f34966s;
                    boolean g6 = k1.g(context);
                    a aVar = a.this;
                    if (g6 && k1.e(context)) {
                        g.this.getClass();
                    } else if (!k1.g(context) || !k1.e(context)) {
                        g.this.getClass();
                    }
                }
            }

            /* loaded from: classes2.dex */
            public class b implements Runnable {

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ Context f34968s;

                public b(Context context) {
                    this.f34968s = context;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Context context = this.f34968s;
                    boolean g6 = k1.g(context);
                    a aVar = a.this;
                    if (g6 && k1.e(context)) {
                        g.this.getClass();
                    } else if (!k1.g(context) || !k1.e(context)) {
                        g.this.getClass();
                    }
                }
            }

            public a() {
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onAvailable(Network network) {
                super.onAvailable(network);
                Context applicationContext = e.this.f34962a.getApplicationContext();
                if (n7.d()) {
                    n7.c("AppDownloadManager", "net onAvailable, active netType: %s, [0:UNKNOWN, 1:ETHERNET, 2:WIFI, 4/5/6/7:2G/3G/4G/5G]", Integer.valueOf(k1.f(applicationContext)));
                }
                if (!com.huawei.openalliance.ad.ppskit.handlers.l.d(applicationContext).k()) {
                    n7.e("AppDownloadManager", "user info is not enabled");
                } else {
                    p2.a(new RunnableC0473a(applicationContext), 3);
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(Network network) {
                super.onLost(network);
                Context applicationContext = e.this.f34962a.getApplicationContext();
                if (n7.d()) {
                    n7.c("AppDownloadManager", "net onLost, active netType: %s, [0:UNKNOWN, 1:ETHERNET, 2:WIFI, 4/5/6/7:2G/3G/4G/5G]", Integer.valueOf(k1.f(applicationContext)));
                }
                if (!com.huawei.openalliance.ad.ppskit.handlers.l.d(applicationContext).k()) {
                    n7.e("AppDownloadManager", "user info is not enabled");
                } else {
                    p2.a(new b(applicationContext), 3);
                }
            }
        }

        public e(Context context) {
            this.f34962a = context;
        }

        public final void a() {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f34962a.getSystemService("connectivity");
                NetworkRequest.Builder builder = new NetworkRequest.Builder();
                builder.addTransportType(0).addTransportType(3).addTransportType(1);
                connectivityManager.registerNetworkCallback(builder.build(), this.f34963b);
            } catch (Throwable unused) {
                n7.g("AppDownloadManager", "register all network callback exception.");
            }
        }
    }

    public g(Context context) {
        super(context);
        String str;
        new d();
        try {
            d();
            f fVar = new f(context);
            this.f34954g = fVar;
            this.f34722d = fVar;
            p2.a(new a(context), 2);
            n7.c("AppDownloadManager", " init AppDownloadManager process:%s", z1.M(context));
            new e(this.f34719a).a();
        } catch (IllegalStateException unused) {
            str = "init IllegalStateException";
            n7.g("AppDownloadManager", str);
        } catch (Exception unused2) {
            str = "init exception";
            n7.g("AppDownloadManager", str);
        }
    }

    public static g j(Context context) {
        g gVar;
        synchronized (f34952h) {
            if (f34953i == null) {
                f34953i = new g(context);
            }
            gVar = f34953i;
        }
        return gVar;
    }

    public static String k(Context context) {
        Context createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(w1.a(createDeviceProtectedStorageContext));
        String str = File.separator;
        return a3.l.q(sb2, str, "pps", str, "apk");
    }

    public final String l(AppInfo appInfo) {
        if (TextUtils.isEmpty(this.f34721c)) {
            this.f34721c = (String) c5.e.e(new b());
        }
        return this.f34721c + File.separator + appInfo.getPackageName() + ".apk";
    }

    public final String m(AppInfo appInfo) {
        if (TextUtils.isEmpty(this.f34721c)) {
            this.f34721c = (String) c5.e.e(new c());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f34721c);
        String str = File.separator;
        sb2.append(str);
        sb2.append("tmp");
        sb2.append(str);
        sb2.append(appInfo.getPackageName());
        sb2.append(".apk");
        return sb2.toString();
    }
}
