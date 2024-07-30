package com.anythink.core.common.a;

import com.anythink.core.common.b.n;
import java.util.List;

/* loaded from: classes.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private static volatile b f4902b;

    /* renamed from: a, reason: collision with root package name */
    final String f4903a = b.class.getName();

    /* renamed from: c, reason: collision with root package name */
    private com.anythink.core.common.c.f f4904c;

    /* renamed from: d, reason: collision with root package name */
    private com.anythink.core.common.c.e f4905d;

    private b() {
        if (n.a().g() != null) {
            this.f4904c = com.anythink.core.common.c.f.a(com.anythink.core.common.c.c.a(n.a().g()));
            this.f4905d = com.anythink.core.common.c.e.a(com.anythink.core.common.c.c.a(n.a().g()));
        }
    }

    public final void c(final com.anythink.core.common.e.g gVar) {
        if (gVar.W() == 1) {
            if (gVar.D() != 1 && gVar.D() != 4) {
                gVar.D();
                return;
            } else {
                n.a();
                n.b(new Runnable() { // from class: com.anythink.core.common.a.b.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        gVar.U();
                        e eVar = new e();
                        eVar.f4913a = gVar.T();
                        eVar.f4914b = gVar.U();
                        eVar.f4915c = gVar.B();
                        b.this.f4905d.a(eVar);
                    }
                });
                return;
            }
        }
        gVar.W();
    }

    public static b a() {
        if (f4902b == null) {
            synchronized (b.class) {
                if (f4902b == null) {
                    f4902b = new b();
                }
            }
        }
        return f4902b;
    }

    public final void b(final com.anythink.core.common.e.g gVar) {
        gVar.U();
        n.a();
        n.b(new Runnable() { // from class: com.anythink.core.common.a.b.2
            @Override // java.lang.Runnable
            public final void run() {
                f fVar = new f();
                fVar.f4913a = gVar.T();
                fVar.f4914b = gVar.U();
                fVar.f4916c = gVar.V();
                fVar.f4917d = 1;
                b.this.f4904c.b(fVar);
            }
        });
    }

    public final void b() {
        n.a();
        n.b(new Runnable() { // from class: com.anythink.core.common.a.b.3
            @Override // java.lang.Runnable
            public final void run() {
                b.this.f4904c.c();
            }
        });
    }

    public final List<d> b(int i10) {
        return this.f4905d.a(i10);
    }

    public final void a(final com.anythink.core.common.e.g gVar) {
        gVar.U();
        n.a();
        n.b(new Runnable() { // from class: com.anythink.core.common.a.b.1
            @Override // java.lang.Runnable
            public final void run() {
                f fVar = new f();
                fVar.f4913a = gVar.T();
                fVar.f4914b = gVar.U();
                fVar.f4916c = gVar.V();
                fVar.f4917d = 0;
                b.this.f4904c.a(fVar);
            }
        });
    }

    public final List<d> a(int i10) {
        return this.f4904c.a(i10);
    }
}
