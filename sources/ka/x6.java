package ka;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ka.v6;

/* loaded from: classes2.dex */
public abstract class x6<SERVICE extends IInterface> implements v6.a {

    /* renamed from: b, reason: collision with root package name */
    public SERVICE f32162b;

    /* renamed from: d, reason: collision with root package name */
    public final Context f32164d;

    /* renamed from: e, reason: collision with root package name */
    public final v6 f32165e;

    /* renamed from: a, reason: collision with root package name */
    public final String f32161a = "install_service_timeout_task" + hashCode();

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArraySet f32163c = new CopyOnWriteArraySet();
    public long f = -1;

    /* renamed from: g, reason: collision with root package name */
    public final a f32166g = new a();

    /* loaded from: classes2.dex */
    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            SERVICE service;
            try {
                x6.this.i();
                if (com.huawei.openalliance.ad.constant.w.aC.equalsIgnoreCase(componentName.getClassName())) {
                    x6.this.j();
                    com.huawei.openalliance.ad.ppskit.utils.d2.d(x6.this.f32161a);
                    n7.e(x6.this.b(), "PPS remote service connected " + System.currentTimeMillis());
                    com.huawei.android.hms.ppskit.b a10 = x6.this.a(iBinder);
                    x6 x6Var = x6.this;
                    synchronized (x6Var) {
                        x6Var.f32162b = a10;
                    }
                    x6.this.h();
                    x6.this.getClass();
                    x6 x6Var2 = x6.this;
                    synchronized (x6Var2) {
                        service = x6Var2.f32162b;
                    }
                    if (service != null) {
                        ArrayList arrayList = new ArrayList(x6.this.f32163c);
                        x6.this.f32163c.clear();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((b) it.next()).a(service);
                        }
                        return;
                    }
                    return;
                }
                x6.this.c("pps remote service name not match, disconnect service.");
                x6 x6Var3 = x6.this;
                synchronized (x6Var3) {
                    x6Var3.f32162b = null;
                }
                return;
            } catch (Throwable th) {
                n7.h(x6.this.b(), "BaseASM Service, service error: %s", th.getClass().getSimpleName());
            }
            n7.h(x6.this.b(), "BaseASM Service, service error: %s", th.getClass().getSimpleName());
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            x6 x6Var = x6.this;
            n7.e(x6Var.b(), "PPS remote service disconnected");
            synchronized (x6Var) {
                x6Var.f32162b = null;
            }
        }
    }

    public x6(Context context) {
        this.f32164d = context.getApplicationContext();
        new p(context);
        this.f32165e = new v6(b(), this);
    }

    public abstract com.huawei.android.hms.ppskit.b a(IBinder iBinder);

    public abstract String b();

    public final void c(String str) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.f32163c;
        try {
            ArrayList arrayList = new ArrayList(copyOnWriteArraySet);
            copyOnWriteArraySet.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((b) it.next()).b();
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final void d(b bVar) {
        SERVICE service;
        n7.b(b(), "handleTask");
        v6 v6Var = this.f32165e;
        bVar.f32168a = v6Var;
        synchronized (v6Var) {
            v6Var.f31990c++;
            com.huawei.openalliance.ad.ppskit.utils.d2.d(v6Var.f31989b);
            n7.f(v6Var.a(), "inc count: %d", Integer.valueOf(v6Var.f31990c));
        }
        synchronized (this) {
            service = this.f32162b;
        }
        if (service == null) {
            if (this.f < 0) {
                HashMap hashMap = com.huawei.openalliance.ad.ppskit.utils.d0.f22830a;
                this.f = System.currentTimeMillis();
            }
            this.f32163c.add(bVar);
            Context context = this.f32164d;
            try {
                n7.e(b(), "bindService " + System.currentTimeMillis());
                g();
                e();
                Intent intent = new Intent("com.huawei.android.hms.ppskit.PPS_API_SERVICE");
                String f = f();
                intent.setPackage(f);
                if (!Cif.c(context) && com.huawei.openalliance.ad.ppskit.utils.o2.d(f)) {
                    String j10 = com.huawei.openalliance.ad.ppskit.utils.o2.j(context, f);
                    boolean isEmpty = TextUtils.isEmpty(j10);
                    n7.f(b(), "is sign empty: %s", Boolean.valueOf(isEmpty));
                    if (!isEmpty && !oa.j.a(context, f, j10)) {
                        return;
                    }
                }
                boolean bindService = context.bindService(intent, this.f32166g, 1);
                n7.f(b(), "bind service result: %s", Boolean.valueOf(bindService));
                if (!bindService) {
                    c("bind service failed");
                    j();
                    return;
                }
                return;
            } catch (SecurityException e10) {
                e = e10;
                n7.g(b(), "bindService SecurityException");
                c("bindService SecurityException");
                e.getMessage();
                j();
                return;
            } catch (Exception e11) {
                e = e11;
                n7.g(b(), "bindService ".concat(e.getClass().getSimpleName()));
                c("bindService ".concat(e.getClass().getSimpleName()));
                e.getMessage();
                j();
                return;
            }
        }
        bVar.a(service);
    }

    public abstract void e();

    public abstract String f();

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public abstract void j();

    /* loaded from: classes2.dex */
    public static abstract class b<SERVICE extends IInterface> {

        /* renamed from: a, reason: collision with root package name */
        public v6 f32168a;

        /* loaded from: classes2.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                v6 v6Var = b.this.f32168a;
                if (v6Var != null) {
                    synchronized (v6Var) {
                        int i10 = v6Var.f31990c - 1;
                        v6Var.f31990c = i10;
                        if (i10 < 0) {
                            v6Var.f31990c = 0;
                        }
                        n7.f(v6Var.a(), "dec count: %d", Integer.valueOf(v6Var.f31990c));
                        if (v6Var.f31990c <= 0) {
                            com.huawei.openalliance.ad.ppskit.utils.d2.c(new u6(v6Var), v6Var.f31989b, 60000L);
                        }
                    }
                }
            }
        }

        public abstract void a(SERVICE service);

        public final void finalize() {
            super.finalize();
            com.huawei.openalliance.ad.ppskit.utils.p2.d(new a());
        }

        public void b() {
        }
    }
}
