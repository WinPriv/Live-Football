package com.anythink.basead.d.b;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.basead.a.b.b;
import com.anythink.basead.c.e;
import com.anythink.basead.c.f;
import com.anythink.basead.d.c.c;
import com.anythink.basead.g.d;
import com.anythink.core.api.AdError;
import com.anythink.core.common.e.j;
import com.anythink.core.common.e.z;
import com.anythink.core.common.g.i;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static volatile a f3876c;

    /* renamed from: a, reason: collision with root package name */
    ConcurrentHashMap<String, Boolean> f3877a = new ConcurrentHashMap<>(3);

    /* renamed from: b, reason: collision with root package name */
    private Context f3878b;

    /* renamed from: com.anythink.basead.d.b.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0057a {
        void a();

        void a(z zVar);

        void a(z zVar, e eVar);
    }

    private a(Context context) {
        this.f3878b = context.getApplicationContext();
    }

    private void b(j jVar, String str, InterfaceC0057a interfaceC0057a) {
        z zVar;
        int i10;
        int i11;
        int i12;
        String[] split;
        try {
            zVar = a(jVar);
        } catch (Throwable unused) {
            zVar = null;
        }
        if (zVar != null && !zVar.N()) {
            if (interfaceC0057a != null) {
                interfaceC0057a.a();
            }
            a(zVar, jVar, interfaceC0057a);
            return;
        }
        if (!TextUtils.isEmpty(jVar.f5664m.r())) {
            try {
                split = jVar.f5664m.r().split("x");
                i10 = Integer.parseInt(split[0]);
            } catch (Throwable unused2) {
                i10 = 0;
            }
            try {
                i11 = Integer.parseInt(split[1]);
            } catch (Throwable unused3) {
                i11 = 0;
                i12 = i10;
                new d(jVar, i12, i11, c.a().a(this.f3878b, c.a(jVar.f5654b, jVar.f5655c)), str).a(0, (i) new AnonymousClass1(jVar, interfaceC0057a));
            }
            i12 = i10;
        } else {
            i12 = 0;
            i11 = 0;
        }
        new d(jVar, i12, i11, c.a().a(this.f3878b, c.a(jVar.f5654b, jVar.f5655c)), str).a(0, (i) new AnonymousClass1(jVar, interfaceC0057a));
    }

    public static a a(Context context) {
        if (f3876c == null) {
            synchronized (a.class) {
                if (f3876c == null) {
                    f3876c = new a(context);
                }
            }
        }
        return f3876c;
    }

    public final void a(j jVar, String str, InterfaceC0057a interfaceC0057a) {
        int i10;
        int i11;
        int i12;
        String[] split;
        com.anythink.core.basead.b.a();
        String a10 = com.anythink.core.basead.b.a(jVar);
        z zVar = null;
        if (this.f3877a.contains(a10) && this.f3877a.get(a10).booleanValue()) {
            interfaceC0057a.a(null, f.a(f.f3750g, f.f3759q));
            return;
        }
        this.f3877a.put(a10, Boolean.TRUE);
        try {
            zVar = a(jVar);
        } catch (Throwable unused) {
        }
        if (zVar != null && !zVar.N()) {
            interfaceC0057a.a();
            a(zVar, jVar, interfaceC0057a);
            return;
        }
        if (TextUtils.isEmpty(jVar.f5664m.r())) {
            i12 = 0;
            i11 = 0;
        } else {
            try {
                split = jVar.f5664m.r().split("x");
                i10 = Integer.parseInt(split[0]);
            } catch (Throwable unused2) {
                i10 = 0;
            }
            try {
                i11 = Integer.parseInt(split[1]);
            } catch (Throwable unused3) {
                i11 = 0;
                i12 = i10;
                new d(jVar, i12, i11, c.a().a(this.f3878b, c.a(jVar.f5654b, jVar.f5655c)), str).a(0, (i) new AnonymousClass1(jVar, interfaceC0057a));
            }
            i12 = i10;
        }
        new d(jVar, i12, i11, c.a().a(this.f3878b, c.a(jVar.f5654b, jVar.f5655c)), str).a(0, (i) new AnonymousClass1(jVar, interfaceC0057a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final z zVar, final j jVar, final InterfaceC0057a interfaceC0057a) {
        com.anythink.basead.a.f.a();
        com.anythink.basead.a.f.a(jVar.f5654b, zVar, jVar, new b.InterfaceC0049b() { // from class: com.anythink.basead.d.b.a.2
            @Override // com.anythink.basead.a.b.b.InterfaceC0049b
            public final void a() {
                ConcurrentHashMap<String, Boolean> concurrentHashMap = a.this.f3877a;
                com.anythink.core.basead.b.a();
                concurrentHashMap.put(com.anythink.core.basead.b.a(jVar), Boolean.FALSE);
                InterfaceC0057a interfaceC0057a2 = interfaceC0057a;
                if (interfaceC0057a2 != null) {
                    interfaceC0057a2.a(zVar);
                }
            }

            @Override // com.anythink.basead.a.b.b.InterfaceC0049b
            public final void a(e eVar) {
                ConcurrentHashMap<String, Boolean> concurrentHashMap = a.this.f3877a;
                com.anythink.core.basead.b.a();
                concurrentHashMap.put(com.anythink.core.basead.b.a(jVar), Boolean.FALSE);
                InterfaceC0057a interfaceC0057a2 = interfaceC0057a;
                if (interfaceC0057a2 != null) {
                    interfaceC0057a2.a(zVar, eVar);
                }
            }
        });
    }

    public final z a(j jVar) {
        com.anythink.core.basead.b.a();
        String a10 = com.anythink.core.basead.b.a(jVar);
        com.anythink.core.basead.b.a();
        String a11 = com.anythink.core.basead.b.a(this.f3878b, a10);
        z zVar = null;
        if (TextUtils.isEmpty(a11)) {
            return null;
        }
        try {
            zVar = b.a(jVar, new JSONObject(a11));
        } catch (Throwable unused) {
        }
        if (zVar != null) {
            com.anythink.basead.d.c.b.a(zVar);
            com.anythink.basead.d.c.a.a(jVar, zVar);
        }
        return zVar;
    }

    /* renamed from: com.anythink.basead.d.b.a$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f3882a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC0057a f3883b;

        public AnonymousClass1(j jVar, InterfaceC0057a interfaceC0057a) {
            this.f3882a = jVar;
            this.f3883b = interfaceC0057a;
        }

        @Override // com.anythink.core.common.g.i
        public final void onLoadCanceled(int i10) {
            InterfaceC0057a interfaceC0057a = this.f3883b;
            if (interfaceC0057a != null) {
                interfaceC0057a.a(null, f.a(f.f3752i, "Cancel Request."));
            }
        }

        @Override // com.anythink.core.common.g.i
        public final void onLoadError(int i10, String str, AdError adError) {
            InterfaceC0057a interfaceC0057a = this.f3883b;
            if (interfaceC0057a != null) {
                interfaceC0057a.a(null, f.a(f.f3752i, str));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x00ea  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        @Override // com.anythink.core.common.g.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onLoadFinish(int r6, java.lang.Object r7) {
            /*
                r5 = this;
                r6 = 0
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L1a
                java.lang.String r1 = r7.toString()     // Catch: java.lang.Exception -> L1a
                r0.<init>(r1)     // Catch: java.lang.Exception -> L1a
                java.lang.String r1 = "sdk_updatetime"
                long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L1b
                r0.put(r1, r2)     // Catch: java.lang.Exception -> L1b
                com.anythink.core.common.e.j r1 = r5.f3882a     // Catch: java.lang.Exception -> L1b
                com.anythink.core.common.e.z r1 = com.anythink.basead.d.b.b.a(r1, r0)     // Catch: java.lang.Exception -> L1b
                goto L1c
            L1a:
                r0 = r6
            L1b:
                r1 = r6
            L1c:
                java.lang.String r2 = "30001"
                if (r1 == 0) goto Lea
                com.anythink.basead.d.c.b.a(r1)
                int r7 = r1.b()
                r3 = 1
                if (r7 != r3) goto L67
                com.anythink.basead.d.b.a r7 = com.anythink.basead.d.b.a.this
                android.content.Context r7 = com.anythink.basead.d.b.a.a(r7)
                android.content.Context r7 = r7.getApplicationContext()
                java.lang.String r3 = r1.B()
                boolean r7 = com.anythink.basead.a.b.a(r7, r3)
                if (r7 == 0) goto L67
                com.anythink.basead.d.c.c r7 = com.anythink.basead.d.c.c.a()
                com.anythink.basead.d.b.a r0 = com.anythink.basead.d.b.a.this
                android.content.Context r0 = com.anythink.basead.d.b.a.a(r0)
                com.anythink.core.common.e.j r3 = r5.f3882a
                java.lang.String r4 = r3.f5654b
                java.lang.String r3 = r3.f5655c
                java.lang.String r3 = com.anythink.basead.d.c.c.a(r4, r3)
                com.anythink.core.common.e.j r4 = r5.f3882a
                com.anythink.core.common.e.k r4 = r4.f5664m
                r7.a(r0, r3, r1, r4)
                com.anythink.basead.d.b.a$a r7 = r5.f3883b
                if (r7 == 0) goto L66
                java.lang.String r0 = "Application installed."
                com.anythink.basead.c.e r0 = com.anythink.basead.c.f.a(r2, r0)
                r7.a(r6, r0)
            L66:
                return
            L67:
                int r7 = r1.b()
                r3 = 2
                if (r7 != r3) goto Lab
                com.anythink.basead.d.b.a r7 = com.anythink.basead.d.b.a.this
                android.content.Context r7 = com.anythink.basead.d.b.a.a(r7)
                android.content.Context r7 = r7.getApplicationContext()
                java.lang.String r3 = r1.B()
                boolean r7 = com.anythink.basead.a.b.a(r7, r3)
                if (r7 != 0) goto Lab
                com.anythink.basead.d.c.c r7 = com.anythink.basead.d.c.c.a()
                com.anythink.basead.d.b.a r0 = com.anythink.basead.d.b.a.this
                android.content.Context r0 = com.anythink.basead.d.b.a.a(r0)
                com.anythink.core.common.e.j r3 = r5.f3882a
                java.lang.String r4 = r3.f5654b
                java.lang.String r3 = r3.f5655c
                java.lang.String r3 = com.anythink.basead.d.c.c.a(r4, r3)
                com.anythink.core.common.e.j r4 = r5.f3882a
                com.anythink.core.common.e.k r4 = r4.f5664m
                r7.a(r0, r3, r1, r4)
                com.anythink.basead.d.b.a$a r7 = r5.f3883b
                if (r7 == 0) goto Laa
                java.lang.String r0 = "Application not installed yet."
                com.anythink.basead.c.e r0 = com.anythink.basead.c.f.a(r2, r0)
                r7.a(r6, r0)
            Laa:
                return
            Lab:
                com.anythink.core.common.e.j r6 = r5.f3882a
                com.anythink.basead.d.c.a.a(r6, r1)
                com.anythink.basead.c.i r6 = new com.anythink.basead.c.i
                com.anythink.core.common.e.j r7 = r5.f3882a
                java.lang.String r7 = r7.f5656d
                java.lang.String r2 = ""
                r6.<init>(r7, r2)
                r7 = 10
                com.anythink.basead.a.b.a(r7, r1, r6)
                com.anythink.core.basead.b.a()
                com.anythink.basead.d.b.a r6 = com.anythink.basead.d.b.a.this
                android.content.Context r6 = com.anythink.basead.d.b.a.a(r6)
                com.anythink.core.basead.b.a()
                com.anythink.core.common.e.j r7 = r5.f3882a
                java.lang.String r7 = com.anythink.core.basead.b.a(r7)
                java.lang.String r0 = r0.toString()
                com.anythink.core.basead.b.a(r6, r7, r0)
                com.anythink.basead.d.b.a$a r6 = r5.f3883b
                if (r6 == 0) goto Le0
                r6.a()
            Le0:
                com.anythink.basead.d.b.a r6 = com.anythink.basead.d.b.a.this
                com.anythink.core.common.e.j r7 = r5.f3882a
                com.anythink.basead.d.b.a$a r0 = r5.f3883b
                com.anythink.basead.d.b.a.a(r6, r1, r7, r0)
                return
            Lea:
                com.anythink.basead.d.b.a$a r0 = r5.f3883b
                if (r0 == 0) goto Lfe
                if (r7 == 0) goto Lf5
                java.lang.String r7 = r7.toString()
                goto Lf7
            Lf5:
                java.lang.String r7 = "No Ad Return."
            Lf7:
                com.anythink.basead.c.e r7 = com.anythink.basead.c.f.a(r2, r7)
                r0.a(r6, r7)
            Lfe:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.d.b.a.AnonymousClass1.onLoadFinish(int, java.lang.Object):void");
        }

        @Override // com.anythink.core.common.g.i
        public final void onLoadStart(int i10) {
        }
    }
}
