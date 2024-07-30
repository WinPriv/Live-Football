package com.anythink.expressad.a;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.anythink.core.common.b.k;
import com.anythink.expressad.a.c;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.foundation.h.w;
import com.anythink.expressad.out.LoadingActivity;
import com.anythink.expressad.out.j;
import com.anythink.expressad.out.p;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f6579a = "Anythink SDK M";

    /* renamed from: b, reason: collision with root package name */
    public static boolean f6580b = false;

    /* renamed from: c, reason: collision with root package name */
    public static Map<String, Long> f6581c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static Set<String> f6582d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    public static final String f6583e = "2";
    private static final int f = 1;

    /* renamed from: g, reason: collision with root package name */
    private String f6584g;

    /* renamed from: h, reason: collision with root package name */
    private long f6585h;

    /* renamed from: i, reason: collision with root package name */
    private com.anythink.expressad.foundation.c.c f6586i;

    /* renamed from: j, reason: collision with root package name */
    private Context f6587j;

    /* renamed from: k, reason: collision with root package name */
    private c f6588k;

    /* renamed from: l, reason: collision with root package name */
    private com.anythink.expressad.out.f f6589l;

    /* renamed from: n, reason: collision with root package name */
    private com.anythink.expressad.d.a f6591n;
    private boolean o;

    /* renamed from: r, reason: collision with root package name */
    private boolean f6594r;

    /* renamed from: m, reason: collision with root package name */
    private p.c f6590m = null;

    /* renamed from: p, reason: collision with root package name */
    private boolean f6592p = false;

    /* renamed from: q, reason: collision with root package name */
    private boolean f6593q = true;

    public a(Context context, String str) {
        this.f6586i = null;
        this.f6587j = null;
        com.anythink.expressad.d.b.a();
        com.anythink.expressad.d.a b10 = com.anythink.expressad.d.b.b();
        this.f6591n = b10;
        if (b10 == null) {
            com.anythink.expressad.d.b.a();
            this.f6591n = com.anythink.expressad.d.b.c();
        }
        this.o = this.f6591n.t();
        Context applicationContext = context.getApplicationContext();
        this.f6587j = applicationContext;
        this.f6584g = str;
        if (this.f6586i == null) {
            this.f6586i = com.anythink.expressad.foundation.c.c.a(applicationContext);
        }
    }

    private void a(String str) {
        this.f6584g = str;
    }

    private boolean c() {
        return this.f6593q;
    }

    private com.anythink.expressad.out.f d() {
        return this.f6589l;
    }

    private com.anythink.expressad.foundation.c.c e() {
        return this.f6586i;
    }

    private void g() {
        c cVar = this.f6588k;
        if (cVar != null && cVar.a()) {
            this.f6588k.b();
        }
    }

    private int i() {
        try {
            com.anythink.expressad.d.a aVar = this.f6591n;
            if (aVar == null) {
                return 1;
            }
            return aVar.k();
        } catch (Exception e10) {
            e10.printStackTrace();
            return 1;
        }
    }

    private void j() {
        try {
            Intent intent = new Intent();
            intent.setAction("ExitApp");
            k.a(this.f6587j).a(intent);
        } catch (Exception e10) {
            o.b(f6579a, "Exception", e10);
        }
    }

    public final void a(p.c cVar) {
        this.f6590m = cVar;
    }

    public final void b() {
        try {
            this.f6590m = null;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void a() {
        this.f6593q = false;
    }

    private void a(com.anythink.expressad.out.f fVar) {
        this.f6589l = fVar;
    }

    private void b(com.anythink.expressad.foundation.d.c cVar) {
        try {
            Intent intent = new Intent(this.f6587j, (Class<?>) LoadingActivity.class);
            intent.setFlags(268435456);
            intent.putExtra("icon_url", cVar.bd());
            this.f6587j.startActivity(intent);
        } catch (Exception e10) {
            o.b(f6579a, "Exception", e10);
        }
    }

    private static boolean a(com.anythink.expressad.foundation.d.c cVar) {
        Long l10;
        if (cVar == null) {
            return true;
        }
        try {
            if (2 != cVar.Q() && 3 != cVar.Q()) {
                return true;
            }
            String aZ = cVar.aZ();
            Map<String, Long> map = f6581c;
            if (map == null) {
                return true;
            }
            if (map.containsKey(aZ) && (l10 = f6581c.get(aZ)) != null) {
                if (l10.longValue() > System.currentTimeMillis() || f6582d.contains(cVar.aZ())) {
                    return false;
                }
            }
            f6581c.put(cVar.aZ(), Long.valueOf(System.currentTimeMillis() + (cVar.Y() * 1000)));
            return true;
        } catch (Exception e10) {
            if (!com.anythink.expressad.a.f6552a) {
                return true;
            }
            e10.printStackTrace();
            return true;
        }
    }

    private void b(c.b bVar, com.anythink.expressad.foundation.d.c cVar, boolean z10) {
        if (cVar == null || bVar == null) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() - this.f6585h;
            com.anythink.expressad.foundation.d.f fVar = new com.anythink.expressad.foundation.d.f();
            fVar.i(cVar.aa());
            fVar.a();
            fVar.h(String.valueOf(currentTimeMillis));
            fVar.g(cVar.aZ());
            fVar.d(bVar.c());
            if (!TextUtils.isEmpty(bVar.j())) {
                fVar.f(URLEncoder.encode(bVar.j(), com.anythink.expressad.foundation.g.a.bN));
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f6585h / 1000);
            fVar.b(sb2.toString());
            fVar.a(Integer.parseInt(cVar.ac()));
            fVar.b(cVar.Q());
            fVar.a(this.f6584g);
            fVar.d(bVar.c());
            if (!TextUtils.isEmpty(bVar.j())) {
                fVar.f(URLEncoder.encode(bVar.j(), com.anythink.expressad.foundation.g.a.bN));
            }
            if (this.o) {
                fVar.c(bVar.a());
                if (!TextUtils.isEmpty(bVar.d())) {
                    fVar.d(URLEncoder.encode(bVar.d(), com.anythink.expressad.foundation.g.a.bN));
                }
                if (!TextUtils.isEmpty(bVar.f())) {
                    fVar.e(URLEncoder.encode(bVar.f(), "UTF-8"));
                }
                if (!TextUtils.isEmpty(bVar.e())) {
                    fVar.c(URLEncoder.encode(bVar.e(), com.anythink.expressad.foundation.g.a.bN));
                }
            }
            if (z10) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(fVar);
            w.b(com.anythink.expressad.foundation.d.f.a(arrayList));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void a(com.anythink.expressad.foundation.d.c cVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a(this.f6587j, cVar, this.f6584g, str, true, false, com.anythink.expressad.a.a.a.f6607k);
    }

    public static void a(Context context, com.anythink.expressad.foundation.d.c cVar, String str, String str2, boolean z10) {
        if (context == null) {
            return;
        }
        new c(context.getApplicationContext()).a("2", str, cVar, null, str2, false, z10, com.anythink.expressad.a.a.a.f6604h);
    }

    public static void a(Context context, com.anythink.expressad.foundation.d.c cVar, String str, String str2, boolean z10, boolean z11, int i10) {
        if (context == null) {
            return;
        }
        new c(context.getApplicationContext()).a("2", str, cVar, null, str2, z10, z11, i10);
    }

    public static void a(Context context, com.anythink.expressad.foundation.d.c cVar, String str, String[] strArr, boolean z10) {
        if (context == null || cVar == null || TextUtils.isEmpty(str) || strArr == null) {
            return;
        }
        c cVar2 = new c(context.getApplicationContext());
        for (String str2 : strArr) {
            cVar2.a("2", str, cVar, null, str2, false, z10, com.anythink.expressad.a.a.a.f6604h);
        }
    }

    private static void f() {
    }

    private static void h() {
    }

    private void a(final boolean z10, final j jVar) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.anythink.expressad.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                if (z10 && !a.f6580b && com.anythink.expressad.a.o) {
                    a.a(a.this);
                }
                if (a.this.f6590m != null && !a.f6580b && com.anythink.expressad.a.o) {
                    a.this.f6590m.b(jVar);
                }
            }
        });
    }

    private void a(c.b bVar, com.anythink.expressad.foundation.d.c cVar, boolean z10) {
        if (cVar == null || bVar == null) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() - this.f6585h;
            com.anythink.expressad.foundation.d.f fVar = new com.anythink.expressad.foundation.d.f();
            fVar.i(cVar.aa());
            fVar.a();
            fVar.h(String.valueOf(currentTimeMillis));
            fVar.g(cVar.aZ());
            fVar.d(bVar.c());
            if (!TextUtils.isEmpty(bVar.j())) {
                fVar.f(URLEncoder.encode(bVar.j(), com.anythink.expressad.foundation.g.a.bN));
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f6585h / 1000);
            fVar.b(sb2.toString());
            fVar.a(Integer.parseInt(cVar.ac()));
            fVar.b(cVar.Q());
            fVar.a(this.f6584g);
            fVar.d(bVar.c());
            if (!TextUtils.isEmpty(bVar.j())) {
                fVar.f(URLEncoder.encode(bVar.j(), com.anythink.expressad.foundation.g.a.bN));
            }
            if (this.o) {
                fVar.c(bVar.a());
                if (!TextUtils.isEmpty(bVar.d())) {
                    fVar.d(URLEncoder.encode(bVar.d(), com.anythink.expressad.foundation.g.a.bN));
                }
                if (!TextUtils.isEmpty(bVar.f())) {
                    fVar.e(URLEncoder.encode(bVar.f(), "UTF-8"));
                }
                if (!TextUtils.isEmpty(bVar.e())) {
                    fVar.c(URLEncoder.encode(bVar.e(), com.anythink.expressad.foundation.g.a.bN));
                }
            }
            if (z10) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(fVar);
            w.b(com.anythink.expressad.foundation.d.f.a(arrayList));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void a(j jVar, String str) {
        try {
            if (!TextUtils.isEmpty(str) && jVar != null) {
                com.anythink.expressad.foundation.d.c cVar = jVar instanceof com.anythink.expressad.foundation.d.c ? (com.anythink.expressad.foundation.d.c) jVar : null;
                if ((!str.startsWith("market://") && !str.startsWith("https://play.google.com/")) || s.a.a(this.f6587j, str, this.f6590m) || cVar == null) {
                    return;
                }
                if (!TextUtils.isEmpty(cVar.ba())) {
                    s.a.a(this.f6587j, "market://details?id=" + cVar.ba(), this.f6590m);
                    return;
                }
                if (i() == 2) {
                    s.a(this.f6587j, cVar.ad(), cVar, this.f6590m);
                } else {
                    s.a(this.f6587j, cVar.ad(), this.f6590m);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void a(int i10, String str, com.anythink.expressad.foundation.d.c cVar, p.c cVar2) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (i10 == 2) {
                s.a(this.f6587j, str, cVar, cVar2);
            } else {
                s.a(this.f6587j, str, cVar2);
            }
        } catch (Throwable th) {
            o.b(f6579a, th.getMessage(), th);
        }
    }

    private boolean a(com.anythink.expressad.foundation.d.c cVar, c.b bVar, boolean z10, int i10) {
        boolean z11 = false;
        if (z10) {
            try {
                int parseInt = Integer.parseInt(cVar.ac());
                if (parseInt == 1) {
                    s.a(this.f6587j, bVar.j(), this.f6590m);
                } else if (parseInt == 2) {
                    s.a(this.f6587j, bVar.j(), cVar, this.f6590m);
                } else if (cVar.ba() != null) {
                    if (!s.a.a(this.f6587j, "market://details?id=" + cVar.ba(), this.f6590m)) {
                        a(i10, bVar.j(), cVar, this.f6590m);
                    }
                } else {
                    a(i10, bVar.j(), cVar, this.f6590m);
                }
                z11 = true;
            } catch (Throwable th) {
                o.b(f6579a, th.getMessage(), th);
            }
        }
        if (z11) {
            b(bVar, cVar, true);
            p.c cVar2 = this.f6590m;
            if (cVar2 != null) {
                cVar2.a((j) cVar, bVar.j());
            }
        } else {
            b(bVar, cVar, true);
            p.c cVar3 = this.f6590m;
            if (cVar3 != null && z10) {
                cVar3.b(cVar, bVar.j());
            }
        }
        return z11;
    }

    private boolean a(com.anythink.expressad.foundation.d.c cVar, c.b bVar, boolean z10) {
        boolean z11 = false;
        if (z10) {
            try {
                s.a(this.f6587j, cVar.ad(), this.f6590m);
                z11 = true;
            } catch (Throwable th) {
                o.b(f6579a, th.getMessage(), th);
            }
        }
        b(bVar, cVar, true);
        if (z11) {
            p.c cVar2 = this.f6590m;
            if (cVar2 != null) {
                cVar2.a((j) cVar, bVar.j());
            }
        } else {
            p.c cVar3 = this.f6590m;
            if (cVar3 != null) {
                cVar3.b(cVar, bVar.j());
            }
        }
        return z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ab, code lost:
    
        if (com.anythink.expressad.foundation.h.s.a.a(r6.f6587j, "market://details?id=" + r7.ba(), r6.f6590m) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0139, code lost:
    
        b(r8, r7, true);
        r7 = r6.f6590m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x013e, code lost:
    
        if (r7 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0140, code lost:
    
        r7.b(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0144, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.anythink.expressad.foundation.d.c r7, com.anythink.expressad.a.c.b r8, boolean r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.a.a.a(com.anythink.expressad.foundation.d.c, com.anythink.expressad.a.c$b, boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0010, code lost:
    
        if (android.text.TextUtils.isEmpty(r4) == false) goto L14;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0017 -> B:7:0x0018). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean a(int r3, java.lang.String r4) {
        /*
            r0 = 2
            r1 = 1
            r2 = 0
            if (r3 != r0) goto Lc
            boolean r3 = com.anythink.expressad.foundation.h.s.a.a(r4)     // Catch: java.lang.Exception -> L13
            if (r3 == 0) goto L17
            goto L18
        Lc:
            boolean r3 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L13
            if (r3 != 0) goto L17
            goto L18
        L13:
            r3 = move-exception
            r3.printStackTrace()
        L17:
            r1 = r2
        L18:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.a.a.a(int, java.lang.String):boolean");
    }

    public static /* synthetic */ void a(a aVar) {
        try {
            Intent intent = new Intent();
            intent.setAction("ExitApp");
            k.a(aVar.f6587j).a(intent);
        } catch (Exception e10) {
            o.b(f6579a, "Exception", e10);
        }
    }
}
