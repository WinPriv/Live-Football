package com.huawei.android.hms.ppskit;

import a3.k;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.transition.n;
import com.huawei.android.hms.ppskit.b;
import com.huawei.openalliance.ad.constant.w;
import com.huawei.openalliance.ad.ppskit.utils.ServerConfig;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import com.huawei.openalliance.ad.ppskit.utils.z1;
import e0.i;
import java.util.HashMap;
import java.util.Iterator;
import ka.Cif;
import ka.ad;
import ka.b2;
import ka.d0;
import ka.d5;
import ka.g5;
import ka.l1;
import ka.m6;
import ka.n1;
import ka.n7;
import ka.o1;
import ka.x;
import ka.y;
import ka.y4;
import org.json.JSONObject;
import ra.g;

/* loaded from: classes2.dex */
public class PpsCoreService extends Service {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f21504t = 0;

    /* renamed from: s, reason: collision with root package name */
    public a f21505s;

    /* loaded from: classes2.dex */
    public static class a extends b.a {

        /* renamed from: b, reason: collision with root package name */
        public final Context f21506b;

        /* renamed from: com.huawei.android.hms.ppskit.PpsCoreService$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0243a implements Runnable {
            public RunnableC0243a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                new ad(a.this.f21506b).i("");
            }
        }

        /* loaded from: classes2.dex */
        public static class b implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final Context f21508s;

            /* renamed from: t, reason: collision with root package name */
            public final String f21509t;

            /* renamed from: u, reason: collision with root package name */
            public final String f21510u;

            /* renamed from: v, reason: collision with root package name */
            public final com.huawei.android.hms.ppskit.a f21511v;

            /* renamed from: w, reason: collision with root package name */
            public final String f21512w;

            /* renamed from: x, reason: collision with root package name */
            public final b2 f21513x;

            public b(Context context, b2 b2Var, String str, String str2, com.huawei.android.hms.ppskit.a aVar, String str3) {
                this.f21508s = context;
                this.f21509t = str;
                this.f21510u = str2;
                this.f21511v = aVar;
                this.f21512w = str3;
                this.f21513x = b2Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Context context = this.f21508s;
                com.huawei.android.hms.ppskit.a aVar = this.f21511v;
                String str = this.f21512w;
                int i10 = PpsCoreService.f21504t;
                b2 b2Var = this.f21513x;
                String str2 = this.f21509t;
                if (b2Var != null) {
                    boolean d10 = Cif.a(context).d();
                    b2Var.a();
                    n7.f("PpsCoreService", "isCmdAllowAccess rom: %s permitRegion: %d", Boolean.valueOf(d10), 1);
                    n7.e("PpsCoreService", "call method: " + str2);
                    n7.e("PpsCoreService", "callerPkg: " + str);
                    boolean d11 = n7.d();
                    String str3 = this.f21510u;
                    if (d11) {
                        n7.c("PpsCoreService", "param: %s", y1.j(str3));
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(str3);
                        b2Var.b(context, str, jSONObject.optString("sdk_version"), jSONObject.optString("content"), aVar);
                        return;
                    } catch (Throwable th) {
                        n7.h("PpsCoreService", "call method %s, ex: %s", str2, th.getClass().getSimpleName());
                        y.d(aVar, str2, -1, th.getClass().getSimpleName() + w.bE + th.getMessage());
                        n7.a();
                        return;
                    }
                }
                String l10 = k.l("api for ", str2, " is not found");
                n7.e("PpsCoreService", "call " + l10);
                y.d(aVar, str2, -1, l10);
            }
        }

        public a(Context context) {
            this.f21506b = context.getApplicationContext();
        }

        @Override // com.huawei.android.hms.ppskit.b
        public final void a() {
            p2.d(new RunnableC0243a());
        }

        @Override // com.huawei.android.hms.ppskit.b
        public final void g(String str, String str2, com.huawei.android.hms.ppskit.a aVar) {
            int i10;
            String J = z1.J(this.f21506b);
            b2 b10 = x.a().b(str);
            if (b10 != null) {
                i10 = b10.b();
            } else {
                i10 = 11;
            }
            p2.a(new b(this.f21506b, b10, str, str2, aVar, J), i10);
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            HashMap hashMap = y4.f32206a;
            synchronized (y4.class) {
                Iterator it = y4.f32206a.keySet().iterator();
                while (it.hasNext()) {
                    d5 d5Var = (d5) y4.f32206a.get((String) it.next());
                    if (d5Var != null) {
                        synchronized (d5Var.f31089c) {
                            if (d5Var.f31087a != null) {
                                d5Var.f31087a = null;
                            }
                            g5 g5Var = d5Var.f31088b;
                            if (g5Var != null) {
                                g5Var.stopWatching();
                                d5Var.f31088b = null;
                            }
                        }
                    }
                }
                y4.f32206a.clear();
            }
        }
    }

    public static void a() {
        n7.e("PpsCoreService", "freeUnnecessaryMemory");
        p2.a(new b(), 2);
        x.a().f32154a.clear();
        d0.l();
        o1.f31582c.evictAll();
        o1.f31583d.evictAll();
        n1.f31473c.evictAll();
        l1.f31401c.evictAll();
        d0.l();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        try {
            if (this.f21505s == null) {
                this.f21505s = new a(this);
            }
            return this.f21505s;
        } catch (Throwable th) {
            i.p(th, "onBind: ", "PpsCoreService");
            return null;
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            m6.a(this);
            n.A(this);
            n7.e("PpsCoreService", "service onCreate");
            g.j(this);
            ServerConfig.init(this);
            p2.a(new n9.a(this), 2);
        } catch (Throwable th) {
            i.p(th, "onCreate: ", "PpsCoreService");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        try {
            n7.e("PpsCoreService", "service onDestroy");
            a();
        } catch (Throwable th) {
            i.p(th, "onDestroy: ", "PpsCoreService");
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        if (com.huawei.openalliance.ad.ppskit.utils.d0.m(this)) {
            return super.onStartCommand(intent, i10, i11);
        }
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        try {
            n7.e("PpsCoreService", "service onUnbind");
        } catch (Throwable th) {
            i.p(th, "onUnbind: ", "PpsCoreService");
        }
        return super.onUnbind(intent);
    }
}
