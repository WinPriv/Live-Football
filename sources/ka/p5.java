package ka;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentResource;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import qa.b;

/* loaded from: classes2.dex */
public final class p5 extends qa.b<s5> {

    /* renamed from: g, reason: collision with root package name */
    public static p5 f31625g;

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f31626h = new byte[0];

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f31627s;

        public a(Context context) {
            this.f31627s = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            p5.this.f34721c = p5.n(this.f31627s);
        }
    }

    /* loaded from: classes2.dex */
    public class b extends BroadcastReceiver {

        /* loaded from: classes2.dex */
        public class a implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ Context f31630s;

            public a(Context context) {
                this.f31630s = context;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Context context = this.f31630s;
                boolean g6 = com.huawei.openalliance.ad.ppskit.utils.k1.g(context);
                b bVar = b.this;
                if (g6 && com.huawei.openalliance.ad.ppskit.utils.k1.e(context)) {
                    if (com.huawei.openalliance.ad.ppskit.utils.k1.e(context)) {
                        p5 p5Var = p5.this;
                        m3.b bVar2 = p5Var.f34723e;
                        bVar2.getClass();
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll((Queue) bVar2.f32660t);
                        if (n7.d()) {
                            n7.c("VideoDownloadManager", "resumeAllTask, task.size:%s", Integer.valueOf(arrayList.size()));
                        }
                        if (arrayList.size() > 0) {
                            Collections.sort(arrayList);
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                s5 s5Var = (s5) it.next();
                                if (s5Var.Y() == 2) {
                                    p5Var.c(s5Var);
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                p5.this.k(2);
            }
        }

        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (n7.d()) {
                n7.c("VideoDownloadManager", "networkReceiver.onReceive, action:%s", intent.getAction());
            }
            com.huawei.openalliance.ad.ppskit.utils.p2.e(new a(context.getApplicationContext()));
        }
    }

    /* loaded from: classes2.dex */
    public class c {

        /* renamed from: a, reason: collision with root package name */
        public final Context f31632a;

        /* renamed from: b, reason: collision with root package name */
        public final a f31633b = new a();

        /* loaded from: classes2.dex */
        public class a extends ConnectivityManager.NetworkCallback {

            /* renamed from: ka.p5$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public class RunnableC0429a implements Runnable {

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ Context f31636s;

                public RunnableC0429a(Context context) {
                    this.f31636s = context;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Context context = this.f31636s;
                    boolean g6 = com.huawei.openalliance.ad.ppskit.utils.k1.g(context);
                    n7.f("VideoDownloadManager", "network connected: %s", Boolean.valueOf(g6));
                    a aVar = a.this;
                    if (g6 && com.huawei.openalliance.ad.ppskit.utils.k1.e(context)) {
                        p5.this.p();
                    } else if (!g6 || !com.huawei.openalliance.ad.ppskit.utils.k1.e(context)) {
                        p5.this.k(2);
                    }
                }
            }

            /* loaded from: classes2.dex */
            public class b implements Runnable {

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ Context f31638s;

                public b(Context context) {
                    this.f31638s = context;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Context context = this.f31638s;
                    boolean g6 = com.huawei.openalliance.ad.ppskit.utils.k1.g(context);
                    a aVar = a.this;
                    if (g6 && com.huawei.openalliance.ad.ppskit.utils.k1.e(context)) {
                        p5.this.p();
                    } else if (!com.huawei.openalliance.ad.ppskit.utils.k1.g(context) || !com.huawei.openalliance.ad.ppskit.utils.k1.e(context)) {
                        p5.this.k(3);
                    }
                }
            }

            public a() {
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onAvailable(Network network) {
                super.onAvailable(network);
                Context applicationContext = c.this.f31632a.getApplicationContext();
                if (n7.d()) {
                    n7.c("VideoDownloadManager", "net onAvailable, active netType: %s, [0:UNKNOWN, 1:ETHERNET, 2:WIFI, 4/5/6/7:2G/3G/4G/5G]", Integer.valueOf(com.huawei.openalliance.ad.ppskit.utils.k1.f(applicationContext)));
                }
                com.huawei.openalliance.ad.ppskit.utils.p2.e(new RunnableC0429a(applicationContext));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(Network network) {
                super.onLost(network);
                Context applicationContext = c.this.f31632a.getApplicationContext();
                if (n7.d()) {
                    n7.c("VideoDownloadManager", "net onLost, active netType: %s, [0:UNKNOWN, 1:ETHERNET, 2:WIFI, 4/5/6/7:2G/3G/4G/5G]", Integer.valueOf(com.huawei.openalliance.ad.ppskit.utils.k1.f(applicationContext)));
                }
                com.huawei.openalliance.ad.ppskit.utils.p2.e(new b(applicationContext));
            }
        }

        public c(Context context) {
            this.f31632a = context;
        }

        public final void a() {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f31632a.getSystemService("connectivity");
                NetworkRequest.Builder builder = new NetworkRequest.Builder();
                builder.addTransportType(0).addTransportType(3).addTransportType(1);
                connectivityManager.registerNetworkCallback(builder.build(), this.f31633b);
            } catch (Throwable unused) {
                n7.g("VideoDownloadManager", "register all network callback exception.");
            }
        }
    }

    public p5(Context context) {
        super(context);
        new b();
        try {
            d();
            this.f34722d = new o5(context);
            com.huawei.openalliance.ad.ppskit.utils.p2.a(new a(context), 2);
            new c(this.f34719a).a();
        } catch (Throwable unused) {
            n7.g("VideoDownloadManager", "initialize exception");
        }
    }

    public static p5 j(Context context) {
        p5 p5Var;
        synchronized (f31626h) {
            if (f31625g == null) {
                f31625g = new p5(context);
            }
            p5Var = f31625g;
        }
        return p5Var;
    }

    public static String n(Context context) {
        File cacheDir;
        if (context == null || (cacheDir = context.createDeviceProtectedStorageContext().getCacheDir()) == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(com.huawei.openalliance.ad.ppskit.utils.x.w(cacheDir));
        String str = File.separator;
        return a3.l.q(sb2, str, com.huawei.openalliance.ad.constant.w.f22161i, str, "placement");
    }

    public static void o(n5 n5Var, s5 s5Var) {
        ContentResource contentResource;
        int i10;
        s5Var.r(n5Var.f);
        s5Var.f31793s = n5Var.f31490j;
        if (!TextUtils.isEmpty(s5Var.f31795u)) {
            contentResource = new ContentResource();
            contentResource.a(s5Var.f31793s);
            Integer num = n5Var.f31492l;
            if (num == null) {
                num = Integer.valueOf(androidx.activity.n.v(s5Var.f31793s));
            }
            contentResource.D(num.intValue());
            contentResource.G(s5Var.f31795u);
            contentResource.E(s5Var.f31796v);
            contentResource.A(s5Var.f31794t);
            boolean z10 = n5Var.f31491k;
            contentResource.F(!z10 ? 1 : 0);
            if (z10) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            contentResource.N(i10);
        } else {
            contentResource = null;
        }
        s5Var.o(contentResource);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0037 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(int r13) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.p5.k(int):void");
    }

    public final void l(String str, String[] strArr) {
        String str2;
        for (String str3 : strArr) {
            if (str3.endsWith(".tmp")) {
                File file = new File(com.ironsource.adapters.facebook.a.h(str, str3));
                if (!file.isDirectory() && System.currentTimeMillis() - file.lastModified() > 172800000) {
                    n7.e("VideoDownloadManager", "remove timeout file");
                    int indexOf = str3.indexOf(".tmp");
                    if (indexOf > 0) {
                        str2 = str3.substring(0, indexOf);
                    } else {
                        str2 = null;
                    }
                    s5 a10 = a(str2);
                    if (a10 != null && (a10 instanceof s5)) {
                        s5 s5Var = a10;
                        m3.b bVar = this.f34723e;
                        boolean remove = ((BlockingQueue) bVar.f32659s).remove(s5Var);
                        if (((Queue) bVar.f32660t).remove(s5Var)) {
                            remove = true;
                        }
                        if (((Queue) bVar.f32661u).contains(s5Var)) {
                            s5Var.c();
                            remove = true;
                        }
                        n7.e("DownloadManager", "removeTask, succ:" + remove + ", fromUser:false");
                        com.huawei.openalliance.ad.ppskit.utils.p2.a(new b.a(this.f34719a, s5Var), 2);
                        if (n7.d()) {
                            n7.c("DownloadManager", "onDownloadDeleted, taskId:%s", s5Var.f31794t);
                        }
                        qa.a<T> aVar = this.f34722d;
                        if (aVar != 0) {
                            aVar.h(s5Var);
                        }
                    } else {
                        com.huawei.openalliance.ad.ppskit.utils.x.n(file);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e5, code lost:
    
        if (r9.exists() == false) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0131 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0132  */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(ka.n5 r16) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.p5.m(ka.n5):void");
    }

    public final void p() {
        m3.b bVar = this.f34723e;
        bVar.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((Queue) bVar.f32660t);
        if (n7.d()) {
            n7.c("VideoDownloadManager", "resumeAllTask, task.size:%s", Integer.valueOf(arrayList.size()));
        }
        if (arrayList.size() <= 0) {
            return;
        }
        Collections.sort(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            s5 s5Var = (s5) it.next();
            int Y = s5Var.Y();
            if (Y == 2 || Y == 100 || Y == 3) {
                c(s5Var);
            }
        }
    }
}
