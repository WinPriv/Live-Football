package com.anythink.basead.d;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.basead.a.c;
import com.anythink.basead.d.a.a;
import com.anythink.basead.d.b.a;
import com.anythink.core.common.b.n;
import com.anythink.core.common.e.aa;
import com.anythink.core.common.e.ab;
import com.anythink.core.common.e.j;
import com.anythink.core.common.e.k;
import com.anythink.core.common.e.z;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private a f3859a;

    /* renamed from: b, reason: collision with root package name */
    protected Context f3860b;

    /* renamed from: c, reason: collision with root package name */
    protected j f3861c;

    /* renamed from: d, reason: collision with root package name */
    protected c f3862d;

    /* renamed from: e, reason: collision with root package name */
    protected aa f3863e;
    protected com.anythink.core.common.a.g f;

    /* renamed from: g, reason: collision with root package name */
    protected com.anythink.basead.a.c f3864g;

    /* renamed from: h, reason: collision with root package name */
    protected com.anythink.basead.e.a f3865h;

    /* renamed from: i, reason: collision with root package name */
    protected ConcurrentHashMap<String, com.anythink.basead.a.c> f3866i;

    /* renamed from: j, reason: collision with root package name */
    protected String f3867j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f3868k = false;

    /* renamed from: com.anythink.basead.d.b$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3875a;

        static {
            int[] iArr = new int[a.values().length];
            f3875a = iArr;
            try {
                iArr[a.ADX_OFFER_REQUEST_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3875a[a.ONLINE_API_OFFER_REQUEST_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum a {
        ADX_OFFER_REQUEST_TYPE,
        ONLINE_API_OFFER_REQUEST_TYPE
    }

    public b(Context context, a aVar, j jVar) {
        this.f3860b = context.getApplicationContext();
        this.f3859a = aVar;
        this.f3861c = jVar;
    }

    public static /* synthetic */ boolean a(b bVar) {
        bVar.f3868k = true;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        r4.onAdLoadFailed(com.anythink.basead.c.f.a(com.anythink.basead.c.f.f3752i, com.anythink.basead.c.f.f3764v));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(com.anythink.basead.e.c r4) {
        /*
            r3 = this;
            com.anythink.core.common.e.j r0 = r3.f3861c     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L28
            java.lang.String r0 = r0.f5654b     // Catch: java.lang.Throwable -> L36
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto L28
            com.anythink.core.common.e.j r0 = r3.f3861c     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = r0.f5653a     // Catch: java.lang.Throwable -> L36
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L17
            goto L28
        L17:
            android.content.Context r0 = r3.f3860b     // Catch: java.lang.Throwable -> L36
            com.anythink.basead.d.a.a r0 = com.anythink.basead.d.a.a.a(r0)     // Catch: java.lang.Throwable -> L36
            com.anythink.core.common.e.j r1 = r3.f3861c     // Catch: java.lang.Throwable -> L36
            com.anythink.basead.d.b$1 r2 = new com.anythink.basead.d.b$1     // Catch: java.lang.Throwable -> L36
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L36
            r0.a(r1, r2)     // Catch: java.lang.Throwable -> L36
            return
        L28:
            if (r4 == 0) goto L35
            java.lang.String r0 = "30001"
            java.lang.String r1 = "bidid、placementid can not be null!"
            com.anythink.basead.c.e r0 = com.anythink.basead.c.f.a(r0, r1)     // Catch: java.lang.Throwable -> L36
            r4.onAdLoadFailed(r0)     // Catch: java.lang.Throwable -> L36
        L35:
            return
        L36:
            r0 = move-exception
            r0.printStackTrace()
            if (r4 == 0) goto L49
            java.lang.String r1 = "-9999"
            java.lang.String r0 = r0.getMessage()
            com.anythink.basead.c.e r0 = com.anythink.basead.c.f.a(r1, r0)
            r4.onAdLoadFailed(r0)
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.d.b.b(com.anythink.basead.e.c):void");
    }

    public final boolean c() {
        int i10 = AnonymousClass4.f3875a[this.f3859a.ordinal()];
        if (i10 == 1) {
            if (this.f3863e == null) {
                this.f3863e = com.anythink.basead.d.a.a.a(this.f3860b).a(this.f3861c);
            }
            com.anythink.core.common.a.g gVar = this.f;
            if (gVar != null) {
                return gVar.isReady();
            }
            if (this.f3868k) {
                return true;
            }
            aa aaVar = this.f3863e;
            if (aaVar == null || !com.anythink.basead.a.b.c.a(aaVar, this.f3861c)) {
                return false;
            }
            this.f3868k = true;
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        if (this.f3863e == null) {
            this.f3863e = com.anythink.basead.d.b.a.a(this.f3860b).a(this.f3861c);
        }
        if (this.f3868k) {
            return true;
        }
        aa aaVar2 = this.f3863e;
        if (aaVar2 == null || !(aaVar2 instanceof z) || ((z) aaVar2).N() || !com.anythink.basead.a.b.c.a(this.f3863e, this.f3861c)) {
            return false;
        }
        this.f3868k = true;
        return true;
    }

    public final com.anythink.core.common.e.i d() {
        return this.f3863e;
    }

    /* renamed from: com.anythink.basead.d.b$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements a.InterfaceC0057a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.basead.e.c f3872a;

        public AnonymousClass2(com.anythink.basead.e.c cVar) {
            this.f3872a = cVar;
        }

        @Override // com.anythink.basead.d.b.a.InterfaceC0057a
        public final void a() {
            com.anythink.basead.e.c cVar = this.f3872a;
            if (cVar != null) {
                cVar.onAdDataLoaded();
            }
        }

        @Override // com.anythink.basead.d.b.a.InterfaceC0057a
        public final void a(z zVar) {
            b bVar = b.this;
            bVar.f3863e = zVar;
            com.anythink.basead.a.b.a(33, b.this.f3863e, new com.anythink.basead.c.i(bVar.f3861c.f5656d, ""));
            b.a(b.this);
            com.anythink.basead.e.c cVar = this.f3872a;
            if (cVar != null) {
                cVar.onAdCacheLoaded();
            }
        }

        @Override // com.anythink.basead.d.b.a.InterfaceC0057a
        public final void a(z zVar, com.anythink.basead.c.e eVar) {
            b.a(b.this, zVar, eVar, this.f3872a, false);
        }
    }

    public final void a(String str) {
        this.f3867j = str;
    }

    /* renamed from: com.anythink.basead.d.b$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements a.InterfaceC0054a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.basead.e.c f3869a;

        public AnonymousClass1(com.anythink.basead.e.c cVar) {
            this.f3869a = cVar;
        }

        @Override // com.anythink.basead.d.a.a.InterfaceC0054a
        public final void a(com.anythink.core.common.e.g gVar) {
            b.this.a(gVar);
            com.anythink.basead.e.c cVar = this.f3869a;
            if (cVar != null) {
                cVar.onAdDataLoaded();
            }
        }

        @Override // com.anythink.basead.d.a.a.InterfaceC0054a
        public final void a(com.anythink.core.common.e.g gVar, com.anythink.core.common.a.g gVar2) {
            b bVar = b.this;
            bVar.f3863e = gVar;
            bVar.f = gVar2;
            bVar.f3864g = new com.anythink.basead.a.c(bVar.f3860b, bVar.f3861c, gVar);
            b.this.f3864g.a(new c.b() { // from class: com.anythink.basead.d.b.1.1
                @Override // com.anythink.basead.a.c.b
                public final void a() {
                    com.anythink.basead.e.a aVar = b.this.f3865h;
                    if (aVar != null) {
                        aVar.onAdClick(1);
                    }
                }

                @Override // com.anythink.basead.a.c.b
                public final void a(boolean z10) {
                    com.anythink.basead.e.a aVar = b.this.f3865h;
                    if (aVar != null) {
                        aVar.onDeeplinkCallback(z10);
                    }
                }

                @Override // com.anythink.basead.a.c.b
                public final void b() {
                }
            });
            com.anythink.basead.a.b.a(33, gVar, new com.anythink.basead.c.i(b.this.f3861c.f5656d, ""));
            b.a(b.this);
            com.anythink.basead.e.c cVar = this.f3869a;
            if (cVar != null) {
                cVar.onAdCacheLoaded();
            }
        }

        @Override // com.anythink.basead.d.a.a.InterfaceC0054a
        public final void a(com.anythink.core.common.e.g gVar, com.anythink.basead.c.e eVar) {
            b.a(b.this, gVar, eVar, this.f3869a, true);
        }
    }

    public final void a(c cVar) {
        ab abVar;
        this.f3862d = cVar;
        k kVar = this.f3861c.f5664m;
        if (!(kVar instanceof ab) || (abVar = (ab) kVar) == null || cVar == null) {
            return;
        }
        abVar.v(cVar.a());
        abVar.w(cVar.b());
        abVar.a(cVar.d());
        abVar.p(cVar.c());
        abVar.o(cVar.e());
        abVar.b(cVar.f());
        abVar.n(cVar.g());
        abVar.a(cVar.h());
        abVar.b(cVar.i());
        abVar.b(cVar.j());
    }

    public void b() {
        this.f3863e = null;
    }

    public final void a(com.anythink.basead.e.a aVar) {
        this.f3865h = aVar;
    }

    private void c(com.anythink.basead.e.c cVar) {
        try {
            com.anythink.basead.d.b.a.a(this.f3860b).a(this.f3861c, this.f3867j, new AnonymousClass2(cVar));
        } catch (Throwable th) {
            th.printStackTrace();
            if (cVar != null) {
                cVar.onAdLoadFailed(com.anythink.basead.c.f.a("-9999", th.getMessage()));
            }
        }
    }

    public final void a(com.anythink.basead.e.c cVar) {
        int i10 = AnonymousClass4.f3875a[this.f3859a.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            try {
                com.anythink.basead.d.b.a.a(this.f3860b).a(this.f3861c, this.f3867j, new AnonymousClass2(cVar));
                return;
            } catch (Throwable th) {
                th.printStackTrace();
                cVar.onAdLoadFailed(com.anythink.basead.c.f.a("-9999", th.getMessage()));
                return;
            }
        }
        try {
            j jVar = this.f3861c;
            if (jVar != null && !TextUtils.isEmpty(jVar.f5654b) && !TextUtils.isEmpty(this.f3861c.f5653a)) {
                com.anythink.basead.d.a.a.a(this.f3860b).a(this.f3861c, new AnonymousClass1(cVar));
                return;
            }
            cVar.onAdLoadFailed(com.anythink.basead.c.f.a(com.anythink.basead.c.f.f3752i, com.anythink.basead.c.f.f3764v));
        } catch (Throwable th2) {
            th2.printStackTrace();
            cVar.onAdLoadFailed(com.anythink.basead.c.f.a("-9999", th2.getMessage()));
        }
    }

    public final String a(aa aaVar) {
        return this.f3861c.f5654b + this.f3861c.f5655c + this.f3861c.f + aaVar.p() + System.currentTimeMillis();
    }

    private void a(com.anythink.core.common.e.i iVar, com.anythink.basead.c.e eVar, com.anythink.basead.e.c cVar, boolean z10) {
        if (iVar != null) {
            com.anythink.basead.a.b.a(34, iVar, new com.anythink.basead.c.i(this.f3861c.f5656d, ""));
        }
        if (iVar instanceof z) {
            com.anythink.core.basead.b.a();
            Context g6 = n.a().g();
            com.anythink.core.basead.b.a();
            com.anythink.core.basead.b.b(g6, com.anythink.core.basead.b.a(this.f3861c));
        }
        if (z10) {
            try {
                com.anythink.core.b.f.a().a(this.f3861c.f5655c);
                com.anythink.core.b.f.a();
                com.anythink.core.b.f.b(this.f3861c.f5655c);
                com.anythink.core.common.a.a.a().b(n.a().g(), this.f3861c.f5653a);
            } catch (Throwable unused) {
            }
        }
        if (cVar != null) {
            cVar.onAdLoadFailed(eVar);
        }
    }

    public final synchronized void a(com.anythink.expressad.foundation.d.c cVar, String str) {
        try {
            if (this.f3864g == null) {
                return;
            }
            if (this.f3866i == null) {
                this.f3866i = new ConcurrentHashMap<>(2);
            }
            com.anythink.basead.a.c cVar2 = this.f3866i.get(cVar.aZ());
            if (cVar2 == null) {
                cVar2 = com.anythink.basead.d.a.b.a(this.f3864g, cVar);
                this.f3866i.put(cVar.aZ(), cVar2);
            }
            if (cVar2 != null) {
                com.anythink.basead.c.i iVar = new com.anythink.basead.c.i(this.f3861c.f5656d, str);
                iVar.f3788g = new com.anythink.basead.c.a();
                cVar2.a(new c.b() { // from class: com.anythink.basead.d.b.3
                    @Override // com.anythink.basead.a.c.b
                    public final void a() {
                        com.anythink.basead.e.a aVar = b.this.f3865h;
                        if (aVar != null) {
                            aVar.onAdClick(1);
                        }
                    }

                    @Override // com.anythink.basead.a.c.b
                    public final void a(boolean z10) {
                        com.anythink.basead.e.a aVar = b.this.f3865h;
                        if (aVar != null) {
                            aVar.onDeeplinkCallback(z10);
                        }
                    }

                    @Override // com.anythink.basead.a.c.b
                    public final void b() {
                    }
                });
                cVar2.a(iVar);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void a(com.anythink.core.common.e.g gVar) {
        if (gVar.c() == 1) {
            com.anythink.core.common.a.b.a().b();
            if (com.anythink.core.common.k.h.a(this.f3860b, gVar.B())) {
                gVar.U();
                gVar.B();
                com.anythink.core.common.a.b.a().c(gVar);
            } else {
                gVar.U();
                gVar.B();
                com.anythink.core.common.a.b.a().a(gVar);
            }
        }
    }

    public static /* synthetic */ void a(b bVar, com.anythink.core.common.e.i iVar, com.anythink.basead.c.e eVar, com.anythink.basead.e.c cVar, boolean z10) {
        if (iVar != null) {
            com.anythink.basead.a.b.a(34, iVar, new com.anythink.basead.c.i(bVar.f3861c.f5656d, ""));
        }
        if (iVar instanceof z) {
            com.anythink.core.basead.b.a();
            Context g6 = n.a().g();
            com.anythink.core.basead.b.a();
            com.anythink.core.basead.b.b(g6, com.anythink.core.basead.b.a(bVar.f3861c));
        }
        if (z10) {
            try {
                com.anythink.core.b.f.a().a(bVar.f3861c.f5655c);
                com.anythink.core.b.f.a();
                com.anythink.core.b.f.b(bVar.f3861c.f5655c);
                com.anythink.core.common.a.a.a().b(n.a().g(), bVar.f3861c.f5653a);
            } catch (Throwable unused) {
            }
        }
        if (cVar != null) {
            cVar.onAdLoadFailed(eVar);
        }
    }
}
