package com.anythink.core.common;

import com.anythink.core.api.AdError;
import com.anythink.core.common.g.a.c;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class u {

    /* renamed from: c, reason: collision with root package name */
    private static volatile u f6520c;

    /* renamed from: b, reason: collision with root package name */
    private String f6522b = "u";

    /* renamed from: a, reason: collision with root package name */
    AtomicInteger f6521a = new AtomicInteger(0);

    private u() {
    }

    public final synchronized void b() {
        List<com.anythink.core.common.e.o> c10;
        int i10;
        if (this.f6521a.get() <= 0 && (c10 = com.anythink.core.common.c.g.a(com.anythink.core.common.c.c.a(com.anythink.core.common.b.n.a().g())).c()) != null && c10.size() > 0) {
            this.f6521a.set(c10.size());
            this.f6521a.get();
            for (final com.anythink.core.common.e.o oVar : c10) {
                if (System.currentTimeMillis() - oVar.f >= 604800000) {
                    this.f6521a.decrementAndGet();
                    com.anythink.core.common.c.g.a(com.anythink.core.common.c.c.a(com.anythink.core.common.b.n.a().g())).b(oVar);
                } else {
                    try {
                        i10 = new JSONObject(oVar.f5728g).optInt(com.anythink.core.common.e.o.f5720h);
                    } catch (Throwable unused) {
                        i10 = 1000;
                    }
                    if (oVar.f5724b == 3) {
                        new com.anythink.core.common.g.a.b(oVar.f5727e, i10).a(new c.a() { // from class: com.anythink.core.common.u.2
                            @Override // com.anythink.core.common.g.a.c.a
                            public final void a(Object obj) {
                                String unused2 = u.this.f6522b;
                                oVar.a();
                                com.anythink.core.common.c.g.a(com.anythink.core.common.c.c.a(com.anythink.core.common.b.n.a().g())).b(oVar);
                                u.this.f6521a.decrementAndGet();
                            }

                            @Override // com.anythink.core.common.g.a.c.a
                            public final void a(Throwable th) {
                                String unused2 = u.this.f6522b;
                                oVar.a();
                                th.getMessage();
                                u.this.f6521a.decrementAndGet();
                            }
                        });
                    } else {
                        final com.anythink.core.common.g.l lVar = new com.anythink.core.common.g.l(oVar);
                        if (i10 == 1001) {
                            lVar.p();
                        }
                        lVar.a(0, new com.anythink.core.common.g.i() { // from class: com.anythink.core.common.u.3
                            @Override // com.anythink.core.common.g.i
                            public final void onLoadCanceled(int i11) {
                                u.this.f6521a.decrementAndGet();
                            }

                            @Override // com.anythink.core.common.g.i
                            public final void onLoadError(int i11, String str, AdError adError) {
                                String unused2 = u.this.f6522b;
                                oVar.a();
                                u.this.f6521a.decrementAndGet();
                            }

                            @Override // com.anythink.core.common.g.i
                            public final void onLoadFinish(int i11, Object obj) {
                                String unused2 = u.this.f6522b;
                                oVar.a();
                                com.anythink.core.common.c.g.a(com.anythink.core.common.c.c.a(com.anythink.core.common.b.n.a().g())).b(lVar.q());
                                u.this.f6521a.decrementAndGet();
                            }

                            @Override // com.anythink.core.common.g.i
                            public final void onLoadStart(int i11) {
                            }
                        });
                    }
                }
            }
        }
    }

    public static u a() {
        if (f6520c == null) {
            synchronized (u.class) {
                if (f6520c == null) {
                    f6520c = new u();
                }
            }
        }
        return f6520c;
    }

    public final void a(final int i10, final String str, final String str2, final String str3, final String str4) {
        com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.u.1
            @Override // java.lang.Runnable
            public final void run() {
                String str5;
                com.anythink.core.common.e.o oVar = new com.anythink.core.common.e.o();
                oVar.f5724b = i10;
                oVar.f5726d = str;
                oVar.f5725c = str2;
                oVar.f5727e = str3;
                oVar.f = System.currentTimeMillis();
                if ((str + oVar.f + str3) != null) {
                    str5 = str3;
                } else {
                    str5 = "";
                }
                oVar.f5723a = com.anythink.core.common.k.f.a(str5);
                oVar.f5728g = str4;
                String unused = u.this.f6522b;
                oVar.a();
                com.anythink.core.common.c.g.a(com.anythink.core.common.c.c.a(com.anythink.core.common.b.n.a().g())).a(oVar);
            }
        });
    }
}
