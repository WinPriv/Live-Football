package com.anythink.basead.a;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.anythink.core.api.IExHandler;
import com.anythink.core.common.b.n;
import com.anythink.core.common.e.aa;
import com.anythink.core.common.e.s;

/* loaded from: classes.dex */
public final class b {
    public static final int A = 27;
    public static final int B = 28;
    public static final int C = 29;
    public static final int D = 30;
    public static final int E = 31;
    public static final int F = 32;
    public static final int G = 33;
    public static final int H = 34;
    public static final int I = 35;

    /* renamed from: a, reason: collision with root package name */
    public static final int f3536a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f3537b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f3538c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static final int f3539d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f3540e = 5;
    public static final int f = 6;

    /* renamed from: g, reason: collision with root package name */
    public static final int f3541g = 7;

    /* renamed from: h, reason: collision with root package name */
    public static final int f3542h = 8;

    /* renamed from: i, reason: collision with root package name */
    public static final int f3543i = 9;

    /* renamed from: j, reason: collision with root package name */
    public static final int f3544j = 10;

    /* renamed from: k, reason: collision with root package name */
    public static final int f3545k = 11;

    /* renamed from: l, reason: collision with root package name */
    public static final int f3546l = 12;

    /* renamed from: m, reason: collision with root package name */
    public static final int f3547m = 13;

    /* renamed from: n, reason: collision with root package name */
    public static final int f3548n = 14;
    public static final int o = 15;

    /* renamed from: p, reason: collision with root package name */
    public static final int f3549p = 16;

    /* renamed from: q, reason: collision with root package name */
    public static final int f3550q = 17;

    /* renamed from: r, reason: collision with root package name */
    public static final int f3551r = 18;

    /* renamed from: s, reason: collision with root package name */
    public static final int f3552s = 19;

    /* renamed from: t, reason: collision with root package name */
    public static final int f3553t = 20;

    /* renamed from: u, reason: collision with root package name */
    public static final int f3554u = 21;

    /* renamed from: v, reason: collision with root package name */
    public static final int f3555v = 22;

    /* renamed from: w, reason: collision with root package name */
    public static final int f3556w = 23;

    /* renamed from: x, reason: collision with root package name */
    public static final int f3557x = 24;
    public static final int y = 25;

    /* renamed from: z, reason: collision with root package name */
    public static final int f3558z = 26;

    public static boolean a(Context context, com.anythink.core.common.e.j jVar, final com.anythink.core.common.e.i iVar, com.anythink.basead.c.d dVar, String str, com.anythink.core.common.f.b bVar) {
        try {
            IExHandler b10 = n.a().b();
            String str2 = (dVar == null || TextUtils.isEmpty(dVar.f3742c)) ? "" : dVar.f3742c;
            if (b10 != null) {
                final Context applicationContext = context.getApplicationContext();
                b10.handleOfferClick(applicationContext, jVar, iVar, str, str2, new Runnable() { // from class: com.anythink.basead.a.b.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (com.anythink.core.common.e.i.this instanceof aa) {
                            h.a(applicationContext).a();
                            h.a(applicationContext).a(com.anythink.core.common.e.i.this.p(), com.anythink.core.common.e.i.this);
                        }
                    }
                }, bVar);
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static void a(final int i10, final com.anythink.core.common.e.i iVar, final com.anythink.basead.c.i iVar2) {
        if (iVar.L()) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.anythink.basead.a.b.2
            @Override // java.lang.Runnable
            public final void run() {
                boolean z10;
                com.anythink.core.common.e.i iVar3 = com.anythink.core.common.e.i.this;
                if (iVar3 instanceof s) {
                    s sVar = (s) iVar3;
                    if (iVar3.k() != null) {
                        z10 = b.a(i10, com.anythink.core.common.e.i.this.k());
                    } else {
                        z10 = false;
                    }
                    if (i10 == 8) {
                        new com.anythink.basead.g.c(sVar.P(), iVar2.f3783a, z10).a(0, (com.anythink.core.common.g.i) null);
                    }
                    com.anythink.basead.g.b bVar = new com.anythink.basead.g.b(i10, sVar, iVar2.f3783a);
                    bVar.b(iVar2.f3784b);
                    bVar.a(0, (com.anythink.core.common.g.i) null);
                } else {
                    j.a(i10, (aa) iVar3, iVar2);
                }
                if (i10 == 21) {
                    com.anythink.core.common.e.i iVar4 = com.anythink.core.common.e.i.this;
                    if (iVar4 instanceof com.anythink.core.common.e.g) {
                        com.anythink.core.common.e.g gVar = (com.anythink.core.common.e.g) iVar4;
                        if (gVar.c() == 1) {
                            if (com.anythink.core.common.k.h.a(n.a().g().getApplicationContext(), gVar.B())) {
                                gVar.U();
                                gVar.B();
                                com.anythink.core.common.a.b.a().c(gVar);
                            } else {
                                gVar.U();
                                gVar.B();
                            }
                        }
                    }
                }
            }
        };
        if (Looper.getMainLooper() != Looper.myLooper()) {
            runnable.run();
        } else {
            com.anythink.core.common.k.b.a.a().a(runnable);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0021, code lost:
    
        if (r4.d() == 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0028, code lost:
    
        if (r4.c() == 1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(int r3, com.anythink.core.common.e.k r4) {
        /*
            r0 = 1
            r1 = 0
            if (r3 == r0) goto L24
            r2 = 2
            if (r3 == r2) goto L24
            r2 = 3
            if (r3 == r2) goto L24
            r2 = 4
            if (r3 == r2) goto L24
            r2 = 5
            if (r3 == r2) goto L24
            r2 = 8
            if (r3 == r2) goto L24
            r2 = 9
            if (r3 == r2) goto L1d
            r2 = 35
            if (r3 == r2) goto L24
            goto L2d
        L1d:
            int r3 = r4.d()
            if (r3 != r0) goto L2b
            goto L2c
        L24:
            int r3 = r4.c()
            if (r3 != r0) goto L2b
            goto L2c
        L2b:
            r0 = r1
        L2c:
            r1 = r0
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.a.b.a(int, com.anythink.core.common.e.k):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001d, code lost:
    
        if (((com.anythink.core.common.e.s) r3).O() == 1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        if (((com.anythink.core.common.e.ab) r4).Y() == 1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean a(com.anythink.core.common.e.i r3, com.anythink.core.common.e.k r4) {
        /*
            boolean r0 = r3 instanceof com.anythink.core.common.e.g
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L13
            boolean r3 = r4 instanceof com.anythink.core.common.e.ab
            if (r3 == 0) goto L22
            com.anythink.core.common.e.ab r4 = (com.anythink.core.common.e.ab) r4
            int r3 = r4.Y()
            if (r3 != r1) goto L20
            goto L21
        L13:
            boolean r4 = r3 instanceof com.anythink.core.common.e.s
            if (r4 == 0) goto L22
            com.anythink.core.common.e.s r3 = (com.anythink.core.common.e.s) r3
            int r3 = r3.O()
            if (r3 != r1) goto L20
            goto L21
        L20:
            r1 = r2
        L21:
            r2 = r1
        L22:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.a.b.a(com.anythink.core.common.e.i, com.anythink.core.common.e.k):boolean");
    }

    public static boolean a(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                context.getPackageManager().getApplicationInfo(str, 8192);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static boolean a(Context context, com.anythink.core.common.e.i iVar) {
        if (!TextUtils.isEmpty(iVar.z()) && com.anythink.core.basead.a.a.a(context, iVar.z(), false)) {
            return true;
        }
        if (TextUtils.isEmpty(iVar.B())) {
            return false;
        }
        return c.a(context, iVar.B());
    }

    private static void a(com.anythink.core.common.e.i iVar) {
        if (iVar instanceof com.anythink.core.common.e.g) {
            com.anythink.core.common.e.g gVar = (com.anythink.core.common.e.g) iVar;
            if (gVar.c() == 1) {
                if (com.anythink.core.common.k.h.a(n.a().g().getApplicationContext(), gVar.B())) {
                    gVar.U();
                    gVar.B();
                    com.anythink.core.common.a.b.a().c(gVar);
                } else {
                    gVar.U();
                    gVar.B();
                }
            }
        }
    }
}
