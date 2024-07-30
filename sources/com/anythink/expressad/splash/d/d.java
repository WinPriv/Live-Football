package com.anythink.expressad.splash.d;

import com.anythink.expressad.out.e;

/* loaded from: classes.dex */
public class d implements com.anythink.expressad.splash.b.d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11052a = "SplashShowListenerImpl";

    /* renamed from: b, reason: collision with root package name */
    private e f11053b;

    /* renamed from: c, reason: collision with root package name */
    private com.anythink.expressad.foundation.d.c f11054c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f11055d;

    /* renamed from: e, reason: collision with root package name */
    private c f11056e;

    public d(c cVar, e eVar, double d10, com.anythink.expressad.foundation.d.c cVar2) {
        this.f11056e = cVar;
        this.f11053b = eVar;
        this.f11054c = cVar2;
        this.f11055d = a(d10, cVar2);
    }

    private void f() {
        if (this.f11053b != null) {
            this.f11053b = null;
        }
    }

    @Override // com.anythink.expressad.splash.b.d
    public final void a() {
        c cVar = this.f11056e;
        if (cVar != null) {
            cVar.f11022a = true;
        }
        cVar.c();
        this.f11056e.d();
        this.f11056e.e();
        e eVar = this.f11053b;
        if (eVar == null || this.f11055d) {
            return;
        }
        eVar.a();
    }

    @Override // com.anythink.expressad.splash.b.d
    public final void b() {
        e eVar = this.f11053b;
        if (eVar != null) {
            eVar.b();
        }
        c cVar = this.f11056e;
        if (cVar != null) {
            cVar.f11022a = false;
        }
    }

    @Override // com.anythink.expressad.splash.b.d
    public final void a(String str) {
        c cVar = this.f11056e;
        if (cVar != null) {
            cVar.f11022a = false;
        }
        e eVar = this.f11053b;
        if (eVar != null) {
            eVar.a(str);
        }
    }

    @Override // com.anythink.expressad.splash.b.d
    public final void a(com.anythink.expressad.foundation.d.c cVar) {
        e eVar = this.f11053b;
        if (eVar == null || this.f11055d) {
            return;
        }
        eVar.a(cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e A[Catch: Exception -> 0x0097, TryCatch #0 {Exception -> 0x0097, blocks: (B:3:0x0003, B:5:0x0011, B:7:0x001a, B:8:0x002a, B:10:0x004e, B:12:0x0054, B:15:0x0058, B:17:0x005d, B:22:0x006a, B:25:0x0089), top: B:2:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean a(double r9, com.anythink.expressad.foundation.d.c r11) {
        /*
            java.lang.String r0 = "SplashShowListenerImpl"
            r1 = 0
            com.anythink.expressad.foundation.b.a r2 = com.anythink.expressad.foundation.b.a.b()     // Catch: java.lang.Exception -> L97
            java.lang.String r2 = r2.e()     // Catch: java.lang.Exception -> L97
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L97
            if (r2 != 0) goto L27
            com.anythink.expressad.d.b.a()     // Catch: java.lang.Exception -> L97
            com.anythink.expressad.d.a r2 = com.anythink.expressad.d.b.b()     // Catch: java.lang.Exception -> L97
            if (r2 == 0) goto L27
            long r3 = r2.l()     // Catch: java.lang.Exception -> L97
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
            long r7 = r2.x()     // Catch: java.lang.Exception -> L97
            long r7 = r7 * r5
            goto L2a
        L27:
            r3 = 0
            r7 = r3
        L2a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L97
            java.lang.String r5 = "cbp : "
            r2.<init>(r5)     // Catch: java.lang.Exception -> L97
            r2.append(r9)     // Catch: java.lang.Exception -> L97
            java.lang.String r5 = " plct : "
            r2.append(r5)     // Catch: java.lang.Exception -> L97
            r2.append(r7)     // Catch: java.lang.Exception -> L97
            java.lang.String r5 = " plctb : "
            r2.append(r5)     // Catch: java.lang.Exception -> L97
            r2.append(r3)     // Catch: java.lang.Exception -> L97
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L97
            com.anythink.expressad.foundation.h.o.d(r0, r2)     // Catch: java.lang.Exception -> L97
            r2 = 1
            if (r11 == 0) goto L5b
            boolean r3 = r11.a(r7, r3)     // Catch: java.lang.Exception -> L97
            if (r3 == 0) goto L58
            r11.e(r2)     // Catch: java.lang.Exception -> L97
            return r2
        L58:
            r11.e(r1)     // Catch: java.lang.Exception -> L97
        L5b:
            if (r11 == 0) goto L96
            boolean r11 = r11.A()     // Catch: java.lang.Exception -> L97
            if (r11 != 0) goto L96
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r11 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r11 != 0) goto L6a
            return r1
        L6a:
            java.util.Random r11 = new java.util.Random     // Catch: java.lang.Exception -> L97
            r11.<init>()     // Catch: java.lang.Exception -> L97
            double r3 = r11.nextDouble()     // Catch: java.lang.Exception -> L97
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L97
            java.lang.String r5 = "hit : "
            r11.<init>(r5)     // Catch: java.lang.Exception -> L97
            r11.append(r3)     // Catch: java.lang.Exception -> L97
            java.lang.String r5 = " "
            r11.append(r5)     // Catch: java.lang.Exception -> L97
            int r9 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r9 <= 0) goto L88
            r10 = r2
            goto L89
        L88:
            r10 = r1
        L89:
            r11.append(r10)     // Catch: java.lang.Exception -> L97
            java.lang.String r10 = r11.toString()     // Catch: java.lang.Exception -> L97
            com.anythink.expressad.foundation.h.o.d(r0, r10)     // Catch: java.lang.Exception -> L97
            if (r9 <= 0) goto L96
            return r2
        L96:
            return r1
        L97:
            r9 = move-exception
            java.lang.String r10 = "CBPERROR"
            com.anythink.expressad.foundation.h.o.b(r0, r10, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.splash.d.d.a(double, com.anythink.expressad.foundation.d.c):boolean");
    }

    private static void d() {
    }

    private static void e() {
    }

    @Override // com.anythink.expressad.splash.b.d
    public final void c() {
    }
}
