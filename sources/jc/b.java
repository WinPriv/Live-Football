package jc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.activity.n;
import n0.v0;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: i, reason: collision with root package name */
    public static b f30201i;

    /* renamed from: a, reason: collision with root package name */
    public Context f30202a;

    /* renamed from: c, reason: collision with root package name */
    public BroadcastReceiver f30204c;

    /* renamed from: d, reason: collision with root package name */
    public ic.d f30205d;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public String[] f30207g;

    /* renamed from: e, reason: collision with root package name */
    public int f30206e = -1;

    /* renamed from: h, reason: collision with root package name */
    public boolean f30208h = false;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f30203b = new Handler(Looper.getMainLooper());

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f30209s;

        public a(Context context) {
            this.f30209s = context;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x00e2, code lost:
        
            if (r5 != null) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00eb, code lost:
        
            r5.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00e9, code lost:
        
            if (r5 == null) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x016e, code lost:
        
            if (r4 != null) goto L85;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x0177, code lost:
        
            r4.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x0175, code lost:
        
            if (r4 == null) goto L90;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 432
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: jc.b.a.run():void");
        }
    }

    /* renamed from: jc.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class RunnableC0412b implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ sc.a f30211s;

        public RunnableC0412b(sc.a aVar) {
            this.f30211s = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (n.I0 == null) {
                n.I0 = new n();
            }
            n nVar = n.I0;
            nVar.getClass();
            rc.b.a().b(new pc.c(nVar, this.f30211s));
        }
    }

    public static b a() {
        if (f30201i == null) {
            synchronized (b.class) {
                f30201i = new b();
            }
        }
        return f30201i;
    }

    public final void b(Context context) {
        if (context == null) {
            return;
        }
        try {
            this.f30202a = context.getApplicationContext();
            if (pc.f.a()) {
                return;
            }
            try {
                if (this.f30205d != null) {
                    jc.a b10 = jc.a.b(this.f30202a);
                    ic.d dVar = this.f30205d;
                    Context context2 = b10.f30200a;
                    try {
                        d1.a.a(context2).d(dVar);
                    } catch (Throwable unused) {
                    }
                    try {
                        d1.a.a(context2).d(dVar);
                    } catch (Throwable unused2) {
                    }
                    this.f30205d = null;
                }
            } catch (Throwable unused3) {
            }
            try {
                this.f30205d = new ic.d();
                IntentFilter intentFilter = new IntentFilter();
                String packageName = this.f30202a.getPackageName();
                intentFilter.addAction(v0.b(packageName + packageName));
                jc.a b11 = jc.a.b(this.f30202a);
                ic.d dVar2 = this.f30205d;
                Context context3 = b11.f30200a;
                try {
                    d1.a.a(context3).b(dVar2, intentFilter);
                } catch (Throwable unused4) {
                }
                d1.a.a(context3).b(dVar2, intentFilter);
            } catch (Throwable unused5) {
            }
            rc.b a10 = rc.b.a();
            a aVar = new a(context);
            a10.getClass();
            rc.a aVar2 = new rc.a(1000L, aVar);
            Long.valueOf(System.currentTimeMillis() / 1000).intValue();
            a10.f34993a.execute(aVar2);
        } catch (Throwable unused6) {
        }
    }

    public final synchronized void c(sc.a aVar) {
        if (this.f30208h) {
            return;
        }
        if (aVar != null) {
            this.f30208h = true;
            if (n.I0 == null) {
                n.I0 = new n();
            }
            n nVar = n.I0;
            nVar.getClass();
            rc.b.a().b(new pc.c(nVar, aVar));
            b a10 = a();
            a10.f30203b.postDelayed(new RunnableC0412b(aVar), 120000L);
        }
    }

    public final boolean d(String str) {
        String[] strArr = this.f30207g;
        if (strArr == null) {
            return false;
        }
        for (String str2 : strArr) {
            if (TextUtils.equals(str2, str)) {
                return true;
            }
        }
        return false;
    }

    public final Context e() {
        return this.f30202a;
    }
}
