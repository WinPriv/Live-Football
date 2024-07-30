package ha;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.text.TextUtils;
import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.constant.w;
import gb.c0;
import gb.r0;
import ha.b;
import ha.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public abstract class d<SERVICE extends IInterface> implements b.a {

    /* renamed from: b, reason: collision with root package name */
    public SERVICE f28802b;

    /* renamed from: d, reason: collision with root package name */
    public final Context f28804d;

    /* renamed from: e, reason: collision with root package name */
    public final ha.b f28805e;
    public final a f;

    /* renamed from: a, reason: collision with root package name */
    public final String f28801a = "install_service_timeout_task" + hashCode();

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArraySet f28803c = new CopyOnWriteArraySet();

    /* loaded from: classes2.dex */
    public class a implements ServiceConnection {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ d f28806s;

        public a(i iVar) {
            this.f28806s = iVar;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            SERVICE c0392a;
            SERVICE service;
            try {
                ex.Code(this.f28806s.c(), "onServiceConnected comp name: %s pkgName: %s", componentName.getClassName(), componentName.getPackageName());
                this.f28806s.getClass();
                SERVICE service2 = null;
                if (w.aC.equalsIgnoreCase(componentName.getClassName())) {
                    gb.w.d(this.f28806s.f28801a);
                    ex.V(this.f28806s.c(), "PPS remote service connected: %d", Long.valueOf(System.currentTimeMillis()));
                    ((i) this.f28806s).getClass();
                    int i10 = g.a.f28811a;
                    if (iBinder != null) {
                        try {
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.huawei.android.hms.ppskit.IPPSServiceApi");
                            if (queryLocalInterface != null && (queryLocalInterface instanceof g)) {
                                c0392a = (g) queryLocalInterface;
                            } else {
                                c0392a = new g.a.C0392a(iBinder);
                            }
                            service2 = c0392a;
                        } catch (Throwable th) {
                            ex.I("IPPSServiceApi", "IPPSServiceApi err: ".concat(th.getClass().getSimpleName()));
                        }
                    }
                    d dVar = this.f28806s;
                    synchronized (dVar) {
                        dVar.f28802b = service2;
                    }
                    this.f28806s.a(componentName);
                    this.f28806s.getClass();
                    d dVar2 = this.f28806s;
                    synchronized (dVar2) {
                        service = dVar2.f28802b;
                    }
                    if (service != null) {
                        ArrayList arrayList = new ArrayList(this.f28806s.f28803c);
                        this.f28806s.f28803c.clear();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((b) it.next()).a(service);
                        }
                        return;
                    }
                    return;
                }
                this.f28806s.b("pps remote service name not match, disconnect service.");
                d dVar3 = this.f28806s;
                synchronized (dVar3) {
                    dVar3.f28802b = null;
                }
                return;
            } catch (Throwable th2) {
                ex.I(this.f28806s.c(), "BaseASM Service, service error: %s", th2.getClass().getSimpleName());
            }
            ex.I(this.f28806s.c(), "BaseASM Service, service error: %s", th2.getClass().getSimpleName());
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            d dVar = this.f28806s;
            ex.V(dVar.c(), "PPS remote service disconnected");
            synchronized (dVar) {
                dVar.f28802b = null;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class b<SERVICE extends IInterface> {

        /* renamed from: a, reason: collision with root package name */
        public ha.b f28807a;

        /* loaded from: classes2.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ha.b bVar = b.this.f28807a;
                if (bVar != null && !r0.a(bVar.f28795e)) {
                    ha.b bVar2 = b.this.f28807a;
                    synchronized (bVar2) {
                        int i10 = bVar2.f28793c - 1;
                        bVar2.f28793c = i10;
                        int i11 = 0;
                        if (i10 < 0) {
                            bVar2.f28793c = 0;
                        }
                        ex.Code(bVar2.a(), "dec count: %d", Integer.valueOf(bVar2.f28793c));
                        if (bVar2.f28793c <= 0) {
                            ha.a aVar = new ha.a(bVar2);
                            String str = bVar2.f28792b;
                            if (!TextUtils.equals(w.cp, bVar2.f28795e.getPackageName())) {
                                i11 = w.f22171t;
                            }
                            gb.w.c(aVar, str, i11);
                        }
                    }
                }
            }
        }

        public abstract void a(SERVICE service);

        public abstract void b();

        public final void finalize() {
            super.finalize();
            c0.c(new a());
        }
    }

    public d(Context context) {
        i iVar = (i) this;
        this.f = new a(iVar);
        this.f28804d = context.getApplicationContext();
        this.f28805e = new ha.b(context, c(), iVar);
    }

    public abstract void a(ComponentName componentName);

    public final void b(String str) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.f28803c;
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

    public abstract String c();
}
