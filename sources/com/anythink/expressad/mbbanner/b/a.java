package com.anythink.expressad.mbbanner.b;

import a3.l;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.y;
import com.anythink.expressad.mbbanner.a.c.b;
import com.anythink.expressad.mbbanner.a.d.c;
import com.anythink.expressad.out.TemplateBannerView;
import com.anythink.expressad.out.h;
import com.anythink.expressad.out.i;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    private static String f10416b = "BannerController";

    /* renamed from: a, reason: collision with root package name */
    i f10417a;

    /* renamed from: c, reason: collision with root package name */
    private String f10418c;

    /* renamed from: d, reason: collision with root package name */
    private String f10419d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f10420e;
    private int f;

    /* renamed from: g, reason: collision with root package name */
    private TemplateBannerView f10421g;

    /* renamed from: h, reason: collision with root package name */
    private int f10422h;

    /* renamed from: i, reason: collision with root package name */
    private int f10423i;

    /* renamed from: j, reason: collision with root package name */
    private int f10424j;

    /* renamed from: l, reason: collision with root package name */
    private h f10426l;

    /* renamed from: m, reason: collision with root package name */
    private d f10427m;

    /* renamed from: n, reason: collision with root package name */
    private c f10428n;
    private com.anythink.expressad.d.c o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f10429p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f10430q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f10431r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f10432s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f10433t;

    /* renamed from: k, reason: collision with root package name */
    private int f10425k = -1;

    /* renamed from: u, reason: collision with root package name */
    private com.anythink.expressad.mbbanner.a.c.c f10434u = new com.anythink.expressad.mbbanner.a.c.c() { // from class: com.anythink.expressad.mbbanner.b.a.1
        @Override // com.anythink.expressad.mbbanner.a.c.c
        public final void a(List<com.anythink.expressad.foundation.d.c> list) {
            if (a.this.f10426l != null) {
                a.this.f10426l.a();
            }
            o.d(a.f10416b, "onShowSuccessed:");
        }

        @Override // com.anythink.expressad.mbbanner.a.c.c
        public final void b() {
            if (a.this.f10426l != null) {
                h unused = a.this.f10426l;
                a.this.f10433t = true;
                com.anythink.expressad.mbbanner.a.d.a a10 = com.anythink.expressad.mbbanner.a.d.a.a();
                String unused2 = a.this.f10419d;
                a10.a(2, a.this.f10418c);
            }
        }

        @Override // com.anythink.expressad.mbbanner.a.c.c
        public final void c() {
            if (a.this.f10426l != null) {
                h unused = a.this.f10426l;
                a.this.f10433t = false;
                com.anythink.expressad.mbbanner.a.d.a a10 = com.anythink.expressad.mbbanner.a.d.a.a();
                String unused2 = a.this.f10419d;
                String str = a.this.f10418c;
                new com.anythink.expressad.mbbanner.a.b.d(a.this.f10423i + "x" + a.this.f10422h, a.this.f10424j * 1000);
                b unused3 = a.this.f10435v;
                a10.a(3, str);
            }
        }

        @Override // com.anythink.expressad.mbbanner.a.c.c
        public final void d() {
            if (a.this.f10426l != null) {
                a.this.f10426l.f();
            }
        }

        @Override // com.anythink.expressad.mbbanner.a.c.c
        public final void a(com.anythink.expressad.foundation.d.c cVar, boolean z10) {
            if (a.this.f10426l == null || z10) {
                return;
            }
            a.this.f10426l.b();
        }

        @Override // com.anythink.expressad.mbbanner.a.c.c
        public final void a(String str) {
            a.this.a(str);
        }

        @Override // com.anythink.expressad.mbbanner.a.c.c
        public final void a(com.anythink.expressad.foundation.d.c cVar) {
            if (a.this.f10426l != null) {
                a.this.f10426l.a(cVar);
            }
        }

        @Override // com.anythink.expressad.mbbanner.a.c.c
        public final void a() {
            if (a.this.f10426l != null) {
                h unused = a.this.f10426l;
            }
        }

        @Override // com.anythink.expressad.mbbanner.a.c.c
        public final void a(boolean z10) {
            if (!z10) {
                com.anythink.expressad.mbbanner.a.d.a a10 = com.anythink.expressad.mbbanner.a.d.a.a();
                String unused = a.this.f10419d;
                String str = a.this.f10418c;
                new com.anythink.expressad.mbbanner.a.b.d(a.this.f10423i + "x" + a.this.f10422h, a.this.f10424j * 1000);
                b unused2 = a.this.f10435v;
                a10.a(3, str);
                return;
            }
            com.anythink.expressad.mbbanner.a.d.a a11 = com.anythink.expressad.mbbanner.a.d.a.a();
            String unused3 = a.this.f10419d;
            a11.a(2, a.this.f10418c);
        }
    };

    /* renamed from: v, reason: collision with root package name */
    private b f10435v = new b() { // from class: com.anythink.expressad.mbbanner.b.a.2
        @Override // com.anythink.expressad.mbbanner.a.c.b
        public final void a(d dVar) {
            a.this.f10427m = dVar;
        }

        @Override // com.anythink.expressad.mbbanner.a.c.b
        public final void b() {
            if (a.this.f10426l != null) {
                a.this.f10426l.a(com.anythink.expressad.mbbanner.a.a.f10266c);
            }
            o.d(a.f10416b, "onResourceFail:");
        }

        @Override // com.anythink.expressad.mbbanner.a.c.b
        public final void a(String str) {
            if (a.this.f10426l != null) {
                a.this.f10426l.a(str);
            }
            l.B(str, "onCampaignFail:", a.f10416b);
        }

        @Override // com.anythink.expressad.mbbanner.a.c.b
        public final void a() {
            d unused = a.this.f10427m;
            if (a.this.f10421g != null) {
                a.j(a.this);
                a.this.h();
            }
        }
    };

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005b, code lost:
    
        if (r3 > 180) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(com.anythink.expressad.out.TemplateBannerView r3, com.anythink.expressad.out.i r4, java.lang.String r5, java.lang.String r6) {
        /*
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.f10425k = r0
            com.anythink.expressad.mbbanner.b.a$1 r1 = new com.anythink.expressad.mbbanner.b.a$1
            r1.<init>()
            r2.f10434u = r1
            com.anythink.expressad.mbbanner.b.a$2 r1 = new com.anythink.expressad.mbbanner.b.a$2
            r1.<init>()
            r2.f10435v = r1
            r2.f10421g = r3
            if (r4 == 0) goto L24
            int r3 = r4.a()
            r2.f10422h = r3
            int r3 = r4.b()
            r2.f10423i = r3
        L24:
            r2.f10417a = r4
            r2.f10418c = r6
            r2.f10419d = r5
            com.anythink.expressad.d.b.a()
            com.anythink.expressad.foundation.b.a r3 = com.anythink.expressad.foundation.b.a.b()
            java.lang.String r3 = r3.e()
            java.lang.String r4 = r2.f10418c
            com.anythink.expressad.d.c r3 = com.anythink.expressad.d.b.c(r3, r4)
            r2.o = r3
            if (r3 != 0) goto L47
            java.lang.String r3 = r2.f10418c
            com.anythink.expressad.d.c r3 = com.anythink.expressad.d.c.c(r3)
            r2.o = r3
        L47:
            int r3 = r2.f10425k
            if (r3 != r0) goto L60
            com.anythink.expressad.d.c r3 = r2.o
            int r3 = r3.b()
            if (r3 <= 0) goto L5e
            r4 = 10
            if (r3 >= r4) goto L59
        L57:
            r3 = r4
            goto L5e
        L59:
            r4 = 180(0xb4, float:2.52E-43)
            if (r3 <= r4) goto L5e
            goto L57
        L5e:
            r2.f10424j = r3
        L60:
            int r3 = r2.f
            if (r3 != 0) goto L78
            com.anythink.expressad.d.c r3 = r2.o
            int r3 = r3.d()
            r4 = 1
            if (r3 != r4) goto L6e
            goto L6f
        L6e:
            r4 = 0
        L6f:
            r2.f10420e = r4
            com.anythink.expressad.mbbanner.a.d.c r3 = r2.f10428n
            if (r3 == 0) goto L78
            r3.a(r4)
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.mbbanner.b.a.<init>(com.anythink.expressad.out.TemplateBannerView, com.anythink.expressad.out.i, java.lang.String, java.lang.String):void");
    }

    private static int a(int i10) {
        if (i10 <= 0) {
            return i10;
        }
        int i11 = 10;
        if (i10 >= 10) {
            i11 = 180;
            if (i10 <= 180) {
                return i10;
            }
        }
        return i11;
    }

    private static boolean i() {
        return true;
    }

    private static void j() {
    }

    private void l() {
        k();
        c cVar = this.f10428n;
        if (cVar != null) {
            cVar.b(this.f10429p);
            this.f10428n.c(this.f10430q);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r0 > 180) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void f() {
        /*
            r2 = this;
            com.anythink.expressad.d.b.a()
            com.anythink.expressad.foundation.b.a r0 = com.anythink.expressad.foundation.b.a.b()
            java.lang.String r0 = r0.e()
            java.lang.String r1 = r2.f10418c
            com.anythink.expressad.d.c r0 = com.anythink.expressad.d.b.c(r0, r1)
            r2.o = r0
            if (r0 != 0) goto L1d
            java.lang.String r0 = r2.f10418c
            com.anythink.expressad.d.c r0 = com.anythink.expressad.d.c.c(r0)
            r2.o = r0
        L1d:
            int r0 = r2.f10425k
            r1 = -1
            if (r0 != r1) goto L37
            com.anythink.expressad.d.c r0 = r2.o
            int r0 = r0.b()
            if (r0 <= 0) goto L35
            r1 = 10
            if (r0 >= r1) goto L30
        L2e:
            r0 = r1
            goto L35
        L30:
            r1 = 180(0xb4, float:2.52E-43)
            if (r0 <= r1) goto L35
            goto L2e
        L35:
            r2.f10424j = r0
        L37:
            int r0 = r2.f
            if (r0 != 0) goto L4f
            com.anythink.expressad.d.c r0 = r2.o
            int r0 = r0.d()
            r1 = 1
            if (r0 != r1) goto L45
            goto L46
        L45:
            r1 = 0
        L46:
            r2.f10420e = r1
            com.anythink.expressad.mbbanner.a.d.c r0 = r2.f10428n
            if (r0 == 0) goto L4f
            r0.a(r1)
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.mbbanner.b.a.f():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r0 > 180) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void g() {
        /*
            r2 = this;
            com.anythink.expressad.d.b.a()
            com.anythink.expressad.foundation.b.a r0 = com.anythink.expressad.foundation.b.a.b()
            java.lang.String r0 = r0.e()
            java.lang.String r1 = r2.f10418c
            com.anythink.expressad.d.c r0 = com.anythink.expressad.d.b.c(r0, r1)
            r2.o = r0
            if (r0 != 0) goto L1d
            java.lang.String r0 = r2.f10418c
            com.anythink.expressad.d.c r0 = com.anythink.expressad.d.c.c(r0)
            r2.o = r0
        L1d:
            int r0 = r2.f10425k
            r1 = -1
            if (r0 != r1) goto L37
            com.anythink.expressad.d.c r0 = r2.o
            int r0 = r0.b()
            if (r0 <= 0) goto L35
            r1 = 10
            if (r0 >= r1) goto L30
        L2e:
            r0 = r1
            goto L35
        L30:
            r1 = 180(0xb4, float:2.52E-43)
            if (r0 <= r1) goto L35
            goto L2e
        L35:
            r2.f10424j = r0
        L37:
            int r0 = r2.f
            if (r0 != 0) goto L4f
            com.anythink.expressad.d.c r0 = r2.o
            int r0 = r0.d()
            r1 = 1
            if (r0 != r1) goto L45
            goto L46
        L45:
            r1 = 0
        L46:
            r2.f10420e = r1
            com.anythink.expressad.mbbanner.a.d.c r0 = r2.f10428n
            if (r0 == 0) goto L4f
            r0.a(r1)
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.mbbanner.b.a.g():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.f10431r || !this.f10432s) {
            return;
        }
        if (this.f10427m != null) {
            if (this.f10428n == null) {
                this.f10428n = new c(this.f10421g, this.f10434u, this.f10419d, this.f10418c, this.f10420e, this.o);
            }
            this.f10428n.a(this.f10417a);
            this.f10428n.b(this.f10429p);
            this.f10428n.c(this.f10430q);
            this.f10428n.a(this.f10420e, this.f);
            this.f10428n.a(this.f10427m);
        } else {
            a(com.anythink.expressad.mbbanner.a.a.f10270h);
        }
        this.f10432s = false;
    }

    public static /* synthetic */ boolean j(a aVar) {
        aVar.f10432s = true;
        return true;
    }

    private void k() {
        TemplateBannerView templateBannerView = this.f10421g;
        if (templateBannerView != null) {
            if (this.f10429p && this.f10430q && !this.f10433t && !y.a(templateBannerView)) {
                com.anythink.expressad.mbbanner.a.d.a a10 = com.anythink.expressad.mbbanner.a.d.a.a();
                String str = this.f10418c;
                new com.anythink.expressad.mbbanner.a.b.d(this.f10423i + "x" + this.f10422h, this.f10424j * 1000);
                a10.a(3, str);
            } else {
                com.anythink.expressad.mbbanner.a.d.a.a().a(2, this.f10418c);
            }
            if (this.f10429p) {
                return;
            }
            com.anythink.expressad.mbbanner.a.d.a.a().a(4, this.f10418c);
            com.anythink.expressad.mbbanner.a.d.a.a().a(this.f10418c);
        }
    }

    public final void b() {
        this.f10431r = true;
        if (this.f10426l != null) {
            this.f10426l = null;
        }
        if (this.f10435v != null) {
            this.f10435v = null;
        }
        if (this.f10434u != null) {
            this.f10434u = null;
        }
        if (this.f10421g != null) {
            this.f10421g = null;
        }
        com.anythink.expressad.mbbanner.a.d.a.a().a(4, this.f10418c);
        com.anythink.expressad.mbbanner.a.d.a.a().a(this.f10418c);
        com.anythink.expressad.mbbanner.a.d.a.a().b();
        c cVar = this.f10428n;
        if (cVar != null) {
            cVar.a();
        }
    }

    public final void c(boolean z10) {
        this.f10430q = z10;
        l();
    }

    public final void d() {
        com.anythink.expressad.mbbanner.a.d.a a10 = com.anythink.expressad.mbbanner.a.d.a.a();
        String str = this.f10418c;
        new com.anythink.expressad.mbbanner.a.b.d(this.f10423i + "x" + this.f10422h, this.f10424j * 1000);
        a10.a(3, str);
    }

    public final void c() {
        com.anythink.expressad.mbbanner.a.d.a a10 = com.anythink.expressad.mbbanner.a.d.a.a();
        String str = this.f10418c;
        new com.anythink.expressad.mbbanner.a.b.d(this.f10423i + "x" + this.f10422h, this.f10424j * 1000);
        a10.a(4, str);
    }

    public final String a() {
        d dVar = this.f10427m;
        return (dVar == null || dVar.f() == null) ? "" : this.f10427m.f();
    }

    public final void a(i iVar) {
        if (iVar != null) {
            this.f10422h = iVar.a();
            this.f10423i = iVar.b();
        }
    }

    public final void a(boolean z10) {
        this.f10420e = z10;
        this.f = z10 ? 1 : 2;
    }

    public final void a(d dVar) {
        this.f10427m = dVar;
        com.anythink.expressad.mbbanner.a.d.a.a().a(this.f10418c, dVar, this.f10435v);
    }

    public final void a(h hVar) {
        this.f10426l = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        h hVar = this.f10426l;
        if (hVar != null) {
            hVar.a(str);
        }
        l.B(str, "showFailed:", f10416b);
    }

    public final void b(boolean z10) {
        this.f10429p = z10;
        l();
        h();
    }

    public final void a(int i10, int i11, int i12, int i13) {
        c cVar = this.f10428n;
        if (cVar != null) {
            cVar.a(i10, i11, i12, i13);
        }
    }
}
