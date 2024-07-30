package ka;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class qi {

    /* renamed from: k, reason: collision with root package name */
    public static qi f31699k;

    /* renamed from: l, reason: collision with root package name */
    public static final byte[] f31700l = new byte[0];

    /* renamed from: m, reason: collision with root package name */
    public static final byte[] f31701m = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public mj f31702a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f31703b;

    /* renamed from: h, reason: collision with root package name */
    public final p f31708h;

    /* renamed from: i, reason: collision with root package name */
    public int f31709i;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f31704c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    public boolean f31705d = false;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f31706e = new byte[0];
    public final String f = "oaid_timeout_task" + hashCode();

    /* renamed from: g, reason: collision with root package name */
    public long f31707g = -1;

    /* renamed from: j, reason: collision with root package name */
    public final c f31710j = new c();

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ e f31711s;

        public a(e eVar) {
            this.f31711s = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f31711s.a();
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ long f31712s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f31713t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f31714u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f31715v;

        public b(long j10, String str, String str2, int i10) {
            this.f31712s = j10;
            this.f31713t = str;
            this.f31714u = str2;
            this.f31715v = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            qi qiVar = qi.this;
            p pVar = qiVar.f31708h;
            String packageName = qiVar.f31703b.getPackageName();
            pVar.g(this.f31715v, this.f31712s, packageName, "43", this.f31713t, this.f31714u);
        }
    }

    /* loaded from: classes2.dex */
    public class c implements ServiceConnection {

        /* loaded from: classes2.dex */
        public class a implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ mj f31718s;

            public a(mj mjVar) {
                this.f31718s = mjVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                qi qiVar;
                if (this.f31718s != null) {
                    synchronized (qi.f31701m) {
                        try {
                            String a10 = this.f31718s.a();
                            boolean b10 = this.f31718s.b();
                            Iterator it = qi.this.f31704c.iterator();
                            while (it.hasNext()) {
                                ((e) it.next()).b(a10, b10);
                            }
                            qiVar = qi.this;
                        } catch (Throwable th) {
                            try {
                                n7.g("OAIDServiceManager", "get oaid Exception: " + th.getClass().getSimpleName());
                                qi.this.c();
                                qiVar = qi.this;
                            } catch (Throwable th2) {
                                qi.this.f31704c.clear();
                                throw th2;
                            }
                        }
                        qiVar.f31704c.clear();
                    }
                    return;
                }
                qi.this.c();
            }
        }

        public c() {
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // android.content.ServiceConnection
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onServiceConnected(android.content.ComponentName r8, android.os.IBinder r9) {
            /*
                r7 = this;
                java.lang.String r8 = "OAIDServiceManager"
                ka.qi r0 = ka.qi.this
                java.lang.String r1 = "get OpenDeviceIdentifierService error:"
                java.lang.String r2 = "OAID service connected "
                r3 = 0
                r0.a(r3, r3)     // Catch: java.lang.Throwable -> L83
                java.lang.String r4 = r0.f     // Catch: java.lang.Throwable -> L83
                com.huawei.openalliance.ad.ppskit.utils.d2.d(r4)     // Catch: java.lang.Throwable -> L83
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L83
                r4.<init>(r2)     // Catch: java.lang.Throwable -> L83
                long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L83
                r4.append(r5)     // Catch: java.lang.Throwable -> L83
                java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L83
                ka.n7.e(r8, r2)     // Catch: java.lang.Throwable -> L83
                int r2 = ka.mj.a.f31471a     // Catch: java.lang.Throwable -> L3f java.lang.RuntimeException -> L4d
                if (r9 != 0) goto L29
                goto L5a
            L29:
                java.lang.String r2 = "com.uodis.opendevice.aidl.OpenDeviceIdentifierService"
                android.os.IInterface r2 = r9.queryLocalInterface(r2)     // Catch: java.lang.Throwable -> L3f java.lang.RuntimeException -> L4d
                if (r2 == 0) goto L38
                boolean r4 = r2 instanceof ka.mj     // Catch: java.lang.Throwable -> L3f java.lang.RuntimeException -> L4d
                if (r4 == 0) goto L38
                ka.mj r2 = (ka.mj) r2     // Catch: java.lang.Throwable -> L3f java.lang.RuntimeException -> L4d
                goto L3d
            L38:
                ka.mj$a$a r2 = new ka.mj$a$a     // Catch: java.lang.Throwable -> L3f java.lang.RuntimeException -> L4d
                r2.<init>(r9)     // Catch: java.lang.Throwable -> L3f java.lang.RuntimeException -> L4d
            L3d:
                r3 = r2
                goto L5a
            L3f:
                r9 = move-exception
                java.lang.Class r9 = r9.getClass()     // Catch: java.lang.Throwable -> L83
                java.lang.String r9 = r9.getSimpleName()     // Catch: java.lang.Throwable -> L83
            L48:
                java.lang.String r9 = r1.concat(r9)     // Catch: java.lang.Throwable -> L83
                goto L57
            L4d:
                r9 = move-exception
                java.lang.Class r9 = r9.getClass()     // Catch: java.lang.Throwable -> L83
                java.lang.String r9 = r9.getSimpleName()     // Catch: java.lang.Throwable -> L83
                goto L48
            L57:
                ka.n7.e(r8, r9)     // Catch: java.lang.Throwable -> L83
            L5a:
                monitor-enter(r0)     // Catch: java.lang.Throwable -> L83
                r0.f31702a = r3     // Catch: java.lang.Throwable -> L80
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L83
                byte[] r9 = r0.f31706e     // Catch: java.lang.Throwable -> L83
                monitor-enter(r9)     // Catch: java.lang.Throwable -> L83
                boolean r1 = r0.f31705d     // Catch: java.lang.Throwable -> L7d
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L7d
                if (r1 == 0) goto L6c
                java.lang.String r9 = "oaid require is already timeout"
                ka.n7.g(r8, r9)     // Catch: java.lang.Throwable -> L83
                return
            L6c:
                monitor-enter(r0)     // Catch: java.lang.Throwable -> L83
                ka.mj r9 = r0.f31702a     // Catch: java.lang.Throwable -> L7a
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L83
                ka.qi$c$a r0 = new ka.qi$c$a     // Catch: java.lang.Throwable -> L83
                r0.<init>(r9)     // Catch: java.lang.Throwable -> L83
                r9 = 2
                com.huawei.openalliance.ad.ppskit.utils.p2.a(r0, r9)     // Catch: java.lang.Throwable -> L83
                goto L97
            L7a:
                r9 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L83
                throw r9     // Catch: java.lang.Throwable -> L83
            L7d:
                r0 = move-exception
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L7d
                throw r0     // Catch: java.lang.Throwable -> L83
            L80:
                r9 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L83
                throw r9     // Catch: java.lang.Throwable -> L83
            L83:
                r9 = move-exception
                r0 = 1
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.Class r9 = r9.getClass()
                java.lang.String r9 = r9.getSimpleName()
                r1 = 0
                r0[r1] = r9
                java.lang.String r9 = "Oaid Service, service error: %s"
                ka.n7.h(r8, r9, r0)
            L97:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ka.qi.c.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            n7.e("OAIDServiceManager", "OAID service disconnected");
            qi qiVar = qi.this;
            synchronized (qiVar) {
                qiVar.f31702a = null;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class d implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final e f31720s;

        /* renamed from: t, reason: collision with root package name */
        public final mj f31721t;

        public d(e eVar, mj mjVar) {
            this.f31720s = eVar;
            this.f31721t = mjVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str;
            mj mjVar = this.f31721t;
            e eVar = this.f31720s;
            try {
                eVar.b(mjVar.a(), mjVar.b());
            } catch (RemoteException unused) {
                str = "requireOaid RemoteException";
                n7.g("OAIDServiceManager", str);
                eVar.a();
            } catch (Exception unused2) {
                str = "requireOaid exception";
                n7.g("OAIDServiceManager", str);
                eVar.a();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class e {
        public abstract void a();

        public abstract void b(String str, boolean z10);
    }

    public qi(Context context) {
        this.f31703b = context.getApplicationContext();
        this.f31708h = new p(context);
    }

    public final void a(String str, String str2) {
        HashMap hashMap = com.huawei.openalliance.ad.ppskit.utils.d0.f22830a;
        long currentTimeMillis = System.currentTimeMillis() - this.f31707g;
        if (currentTimeMillis > 100000) {
            return;
        }
        int i10 = this.f31709i;
        n7.c("OAIDServiceManager", "aidl bind duration: %s msg: %s", Long.valueOf(currentTimeMillis), str2);
        com.huawei.openalliance.ad.ppskit.utils.p2.f(new b(currentTimeMillis, str, str2, i10));
        this.f31707g = -1L;
        this.f31709i = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(ka.qi.e r12) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.qi.b(ka.qi$e):void");
    }

    public final void c() {
        synchronized (f31701m) {
            try {
                try {
                    try {
                        Iterator it = this.f31704c.iterator();
                        while (it.hasNext()) {
                            com.huawei.openalliance.ad.ppskit.utils.d2.a(new a((e) it.next()));
                        }
                    } catch (RuntimeException e10) {
                        n7.g("OAIDServiceManager", "notifyOaidAcquireFail RuntimeException " + e10.getClass().getSimpleName());
                    }
                } catch (Exception e11) {
                    n7.g("OAIDServiceManager", "notifyOaidAcquireFail " + e11.getClass().getSimpleName());
                }
                this.f31704c.clear();
            } catch (Throwable th) {
                this.f31704c.clear();
                throw th;
            }
        }
    }
}
