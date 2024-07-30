package com.anythink.core.c;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.AdError;
import com.anythink.core.common.b.g;
import com.anythink.core.common.b.n;
import com.anythink.core.common.e.af;
import com.anythink.core.common.g.i;
import com.anythink.core.common.k.p;
import com.anythink.core.common.r;
import com.anythink.core.common.res.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4784a = "b";

    /* renamed from: c, reason: collision with root package name */
    private static volatile b f4785c;

    /* renamed from: d, reason: collision with root package name */
    private static com.anythink.core.c.a f4786d;

    /* renamed from: e, reason: collision with root package name */
    private Context f4788e;

    /* renamed from: g, reason: collision with root package name */
    private Object f4789g = new Object();
    private boolean f = false;

    /* renamed from: b, reason: collision with root package name */
    List<a> f4787b = Collections.synchronizedList(new ArrayList(3));

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void b();
    }

    private b(Context context) {
        this.f4788e = context;
    }

    private Context c() {
        return this.f4788e;
    }

    private void d() {
        synchronized (this.f4789g) {
            Iterator<a> it = this.f4787b.iterator();
            while (it.hasNext()) {
                it.next();
            }
            this.f4787b.clear();
        }
    }

    private static com.anythink.core.c.a e() {
        com.anythink.core.c.a aVar = new com.anythink.core.c.a();
        aVar.f4735b = true;
        aVar.Q();
        aVar.b("0");
        aVar.a(0L);
        aVar.W();
        aVar.Z();
        aVar.ab();
        aVar.c("");
        aVar.ae();
        aVar.ag();
        aVar.d("");
        aVar.O();
        aVar.K();
        aVar.C();
        aVar.E();
        aVar.a("[\"com.anythink\"]");
        aVar.y();
        aVar.e();
        aVar.i();
        aVar.g();
        aVar.k();
        return aVar;
    }

    private boolean f() {
        return this.f;
    }

    public static /* synthetic */ boolean a(b bVar) {
        bVar.f = false;
        return false;
    }

    public static /* synthetic */ void c(b bVar) {
        synchronized (bVar.f4789g) {
            Iterator<a> it = bVar.f4787b.iterator();
            while (it.hasNext()) {
                it.next();
            }
            bVar.f4787b.clear();
        }
    }

    public static b a(Context context) {
        if (f4785c == null) {
            synchronized (b.class) {
                if (f4785c == null) {
                    f4785c = new b(context);
                }
            }
        }
        return f4785c;
    }

    private void b(Context context) {
        this.f4788e = context;
    }

    private void b(a aVar) {
        synchronized (this.f4789g) {
            if (aVar != null) {
                this.f4787b.remove(aVar);
            }
        }
    }

    public final synchronized com.anythink.core.c.a b(String str) {
        af afVar;
        if (f4786d == null) {
            try {
                if (this.f4788e == null) {
                    this.f4788e = n.a().g();
                }
                List<af> a10 = com.anythink.core.common.c.d.a(com.anythink.core.common.c.c.a(this.f4788e)).a(str, g.o.f5134a);
                com.anythink.core.c.a aVar = null;
                if (a10 != null && a10.size() > 0 && (afVar = a10.get(0)) != null && (aVar = com.anythink.core.c.a.f(afVar.d())) != null) {
                    aVar.a(Long.parseLong(afVar.a()));
                }
                f4786d = aVar;
                if (aVar == null) {
                    com.anythink.core.c.a aVar2 = new com.anythink.core.c.a();
                    aVar2.f4735b = true;
                    aVar2.Q();
                    aVar2.b("0");
                    aVar2.a(0L);
                    aVar2.W();
                    aVar2.Z();
                    aVar2.ab();
                    aVar2.c("");
                    aVar2.ae();
                    aVar2.ag();
                    aVar2.d("");
                    aVar2.O();
                    aVar2.K();
                    aVar2.C();
                    aVar2.E();
                    aVar2.a("[\"com.anythink\"]");
                    aVar2.y();
                    aVar2.e();
                    aVar2.i();
                    aVar2.g();
                    aVar2.k();
                    f4786d = aVar2;
                }
            } catch (Exception unused) {
            }
        }
        return f4786d;
    }

    private void a(a aVar) {
        synchronized (this.f4789g) {
            if (this.f4789g != null) {
                this.f4787b.add(aVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.lang.String r11) {
        /*
            r10 = this;
            com.anythink.core.c.a r11 = r10.b(r11)
            r0 = 1
            if (r11 == 0) goto L50
            com.anythink.core.c.c r1 = r11.a()
            long r2 = r11.P()
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r11.L()
            long r6 = r6 + r2
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r3 = 0
            if (r2 > 0) goto L1f
            r2 = r0
            goto L20
        L1f:
            r2 = r3
        L20:
            if (r1 == 0) goto L31
            long r6 = r11.L()
            long r8 = r1.a()
            long r8 = r8 + r6
            int r1 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r1 > 0) goto L31
            r1 = r0
            goto L32
        L31:
            r1 = r3
        L32:
            java.util.Map<java.lang.String, java.lang.Object> r11 = r11.f4736c
            com.anythink.core.common.b.n r4 = com.anythink.core.common.b.n.a()
            java.util.Map r4 = r4.m()
            if (r11 == 0) goto L44
            boolean r11 = r11.equals(r4)
            r11 = r11 ^ r0
            goto L49
        L44:
            if (r4 == 0) goto L48
            r11 = r0
            goto L49
        L48:
            r11 = r3
        L49:
            if (r2 != 0) goto L50
            if (r1 != 0) goto L50
            if (r11 != 0) goto L50
            return r3
        L50:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.c.b.a(java.lang.String):boolean");
    }

    public static long a() {
        com.anythink.core.c.a aVar = f4786d;
        if (aVar == null || aVar.J() == 0) {
            return 51200L;
        }
        return f4786d.J();
    }

    private static com.anythink.core.c.a a(Context context, String str) {
        af afVar;
        List<af> a10 = com.anythink.core.common.c.d.a(com.anythink.core.common.c.c.a(context)).a(str, g.o.f5134a);
        com.anythink.core.c.a aVar = null;
        if (a10 != null && a10.size() > 0 && (afVar = a10.get(0)) != null && (aVar = com.anythink.core.c.a.f(afVar.d())) != null) {
            aVar.a(Long.parseLong(afVar.a()));
        }
        return aVar;
    }

    private static void g() {
    }

    public static com.anythink.core.c.a a(Context context, String str, String str2) {
        com.anythink.core.common.c.d.a(com.anythink.core.common.c.c.a(context)).a(str, str2, g.o.f5134a);
        com.anythink.core.c.a f = com.anythink.core.c.a.f(str2);
        f.a(System.currentTimeMillis());
        p.a(context, g.o, g.o.f5142j, f.U());
        return f;
    }

    public final synchronized void a(final String str, String str2) {
        if (this.f) {
            return;
        }
        this.f = true;
        new com.anythink.core.common.g.d(this.f4788e, str, str2).a(0, new i() { // from class: com.anythink.core.c.b.1
            @Override // com.anythink.core.common.g.i
            public final void onLoadCanceled(int i10) {
                b.a(b.this);
                b.c(b.this);
            }

            @Override // com.anythink.core.common.g.i
            public final void onLoadError(int i10, String str3, AdError adError) {
                b.a(b.this);
                b.c(b.this);
            }

            @Override // com.anythink.core.common.g.i
            public final void onLoadFinish(int i10, Object obj) {
                b.a(b.this);
                if (obj != null) {
                    com.anythink.core.c.a unused = b.f4786d = b.a(b.this.f4788e, str, obj.toString());
                    if (b.f4786d != null) {
                        String s10 = b.f4786d.s();
                        if (!TextUtils.isEmpty(s10) && TextUtils.isEmpty(n.a().y())) {
                            n.a().i(s10);
                        }
                        r.a(b.this.f4788e).a(b.f4786d);
                        Context unused2 = b.this.f4788e;
                        com.anythink.core.c.a unused3 = b.f4786d;
                        b.a(b.this.f4788e, b.f4786d);
                        com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.c.b.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.anythink.core.common.n.a().a(b.f4786d.c());
                            }
                        });
                        com.anythink.core.common.c.a().a(b.f4786d.b());
                    }
                    b.c(b.this);
                }
            }

            @Override // com.anythink.core.common.g.i
            public final void onLoadStart(int i10) {
            }
        });
    }

    public static /* synthetic */ void a(Context context, com.anythink.core.c.a aVar) {
        if (aVar != null) {
            String n10 = aVar.n();
            if (TextUtils.isEmpty(n10)) {
                return;
            }
            com.anythink.core.common.res.b.a(context).a(new com.anythink.core.common.res.e(3, n10), (b.a) null);
        }
    }

    private static void b(Context context, com.anythink.core.c.a aVar) {
        if (aVar == null) {
            return;
        }
        String n10 = aVar.n();
        if (TextUtils.isEmpty(n10)) {
            return;
        }
        com.anythink.core.common.res.b.a(context).a(new com.anythink.core.common.res.e(3, n10), (b.a) null);
    }
}
