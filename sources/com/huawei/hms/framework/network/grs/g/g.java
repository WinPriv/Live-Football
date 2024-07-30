package com.huawei.hms.framework.network.grs.g;

import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    private static final ExecutorService f21892b = ExecutorsUtils.newCachedThreadPool("GRS_RequestController-Task");

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, com.huawei.hms.framework.network.grs.g.j.b> f21893c = new ConcurrentHashMap(16);

    /* renamed from: d, reason: collision with root package name */
    private static final Object f21894d = new Object();

    /* renamed from: a, reason: collision with root package name */
    private com.huawei.hms.framework.network.grs.e.a f21895a;

    /* loaded from: classes2.dex */
    public class a implements Callable<d> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.huawei.hms.framework.network.grs.g.j.c f21896a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21897b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.huawei.hms.framework.network.grs.e.c f21898c;

        public a(com.huawei.hms.framework.network.grs.g.j.c cVar, String str, com.huawei.hms.framework.network.grs.e.c cVar2) {
            this.f21896a = cVar;
            this.f21897b = str;
            this.f21898c = cVar2;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public d call() {
            return new c(this.f21896a, g.this.f21895a).a(g.f21892b, this.f21897b, this.f21898c);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.huawei.hms.framework.network.grs.g.j.c f21900a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21901b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.huawei.hms.framework.network.grs.e.c f21902c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.huawei.hms.framework.network.grs.b f21903d;

        public b(com.huawei.hms.framework.network.grs.g.j.c cVar, String str, com.huawei.hms.framework.network.grs.e.c cVar2, com.huawei.hms.framework.network.grs.b bVar) {
            this.f21900a = cVar;
            this.f21901b = str;
            this.f21902c = cVar2;
            this.f21903d = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = g.this;
            gVar.a(gVar.a(this.f21900a, this.f21901b, this.f21902c), this.f21903d);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0063, code lost:
    
        if (r2.a() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0067, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.huawei.hms.framework.network.grs.g.d a(com.huawei.hms.framework.network.grs.g.j.c r8, java.lang.String r9, com.huawei.hms.framework.network.grs.e.c r10) {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "request to server with service name is: "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RequestController"
            com.huawei.hms.framework.common.Logger.d(r1, r0)
            com.huawei.hms.framework.network.grs.GrsBaseInfo r0 = r8.b()
            android.content.Context r1 = r8.a()
            r2 = 1
            java.lang.String r0 = r0.getGrsParasKey(r2, r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "request spUrlKey: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "RequestController"
            com.huawei.hms.framework.common.Logger.v(r2, r1)
            java.lang.Object r1 = com.huawei.hms.framework.network.grs.g.g.f21894d
            monitor-enter(r1)
            android.content.Context r2 = r8.a()     // Catch: java.lang.Throwable -> Lbf
            boolean r2 = com.huawei.hms.framework.common.NetworkUtil.isNetworkAvailable(r2)     // Catch: java.lang.Throwable -> Lbf
            r3 = 0
            if (r2 != 0) goto L43
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lbf
            return r3
        L43:
            com.huawei.hms.framework.network.grs.h.d$a r2 = com.huawei.hms.framework.network.grs.h.d.a(r0)     // Catch: java.lang.Throwable -> Lbf
            java.util.Map<java.lang.String, com.huawei.hms.framework.network.grs.g.j.b> r4 = com.huawei.hms.framework.network.grs.g.g.f21893c     // Catch: java.lang.Throwable -> Lbf
            java.lang.Object r5 = r4.get(r0)     // Catch: java.lang.Throwable -> Lbf
            com.huawei.hms.framework.network.grs.g.j.b r5 = (com.huawei.hms.framework.network.grs.g.j.b) r5     // Catch: java.lang.Throwable -> Lbf
            if (r5 == 0) goto L5d
            boolean r6 = r5.b()     // Catch: java.lang.Throwable -> Lbf
            if (r6 != 0) goto L58
            goto L5d
        L58:
            java.util.concurrent.Future r9 = r5.a()     // Catch: java.lang.Throwable -> Lbf
            goto L82
        L5d:
            if (r2 == 0) goto L68
            boolean r2 = r2.a()     // Catch: java.lang.Throwable -> Lbf
            if (r2 != 0) goto L66
            goto L68
        L66:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lbf
            return r3
        L68:
            java.lang.String r2 = "RequestController"
            java.lang.String r5 = "hitGrsRequestBean == null or request block is released."
            com.huawei.hms.framework.common.Logger.d(r2, r5)     // Catch: java.lang.Throwable -> Lbf
            java.util.concurrent.ExecutorService r2 = com.huawei.hms.framework.network.grs.g.g.f21892b     // Catch: java.lang.Throwable -> Lbf
            com.huawei.hms.framework.network.grs.g.g$a r5 = new com.huawei.hms.framework.network.grs.g.g$a     // Catch: java.lang.Throwable -> Lbf
            r5.<init>(r8, r9, r10)     // Catch: java.lang.Throwable -> Lbf
            java.util.concurrent.Future r9 = r2.submit(r5)     // Catch: java.lang.Throwable -> Lbf
            com.huawei.hms.framework.network.grs.g.j.b r10 = new com.huawei.hms.framework.network.grs.g.j.b     // Catch: java.lang.Throwable -> Lbf
            r10.<init>(r9)     // Catch: java.lang.Throwable -> Lbf
            r4.put(r0, r10)     // Catch: java.lang.Throwable -> Lbf
        L82:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lbf
            android.content.Context r8 = r8.a()
            com.huawei.hms.framework.network.grs.g.j.d r8 = com.huawei.hms.framework.network.grs.g.i.a.a(r8)
            if (r8 == 0) goto L92
            int r8 = r8.c()
            goto L94
        L92:
            r8 = 10
        L94:
            long r0 = (long) r8
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Exception -> L9e java.util.concurrent.TimeoutException -> La4 java.lang.InterruptedException -> Laa java.util.concurrent.ExecutionException -> Lb0 java.util.concurrent.CancellationException -> Lb6
            java.lang.Object r8 = r9.get(r0, r8)     // Catch: java.lang.Exception -> L9e java.util.concurrent.TimeoutException -> La4 java.lang.InterruptedException -> Laa java.util.concurrent.ExecutionException -> Lb0 java.util.concurrent.CancellationException -> Lb6
            com.huawei.hms.framework.network.grs.g.d r8 = (com.huawei.hms.framework.network.grs.g.d) r8     // Catch: java.lang.Exception -> L9e java.util.concurrent.TimeoutException -> La4 java.lang.InterruptedException -> Laa java.util.concurrent.ExecutionException -> Lb0 java.util.concurrent.CancellationException -> Lb6
            return r8
        L9e:
            r8 = move-exception
            java.lang.String r9 = "RequestController"
            java.lang.String r10 = "when check result, find Other Exception, check others"
            goto Lbb
        La4:
            r8 = move-exception
            java.lang.String r9 = "RequestController"
            java.lang.String r10 = "when check result, find TimeoutException, check others"
            goto Lbb
        Laa:
            r8 = move-exception
            java.lang.String r9 = "RequestController"
            java.lang.String r10 = "when check result, find InterruptedException, check others"
            goto Lbb
        Lb0:
            r8 = move-exception
            java.lang.String r9 = "RequestController"
            java.lang.String r10 = "when check result, find ExecutionException, check others"
            goto Lbb
        Lb6:
            r8 = move-exception
            java.lang.String r9 = "RequestController"
            java.lang.String r10 = "when check result, find CancellationException, check others"
        Lbb:
            com.huawei.hms.framework.common.Logger.w(r9, r10, r8)
            return r3
        Lbf:
            r8 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lbf
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.g.g.a(com.huawei.hms.framework.network.grs.g.j.c, java.lang.String, com.huawei.hms.framework.network.grs.e.c):com.huawei.hms.framework.network.grs.g.d");
    }

    public void a(com.huawei.hms.framework.network.grs.e.a aVar) {
        this.f21895a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(d dVar, com.huawei.hms.framework.network.grs.b bVar) {
        if (bVar != null) {
            if (dVar == null) {
                Logger.v("RequestController", "GrsResponse is null");
                bVar.a();
            } else {
                Logger.v("RequestController", "GrsResponse is not null");
                bVar.a(dVar);
            }
        }
    }

    public void a(com.huawei.hms.framework.network.grs.g.j.c cVar, com.huawei.hms.framework.network.grs.b bVar, String str, com.huawei.hms.framework.network.grs.e.c cVar2) {
        f21892b.execute(new b(cVar, str, cVar2, bVar));
    }

    public void a(String str) {
        synchronized (f21894d) {
            f21893c.remove(str);
        }
    }
}
