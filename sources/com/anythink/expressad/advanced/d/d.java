package com.anythink.expressad.advanced.d;

import com.anythink.expressad.out.o;
import java.util.Random;

/* loaded from: classes.dex */
public final class d implements com.anythink.expressad.advanced.b.b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f6884a = "NativeAdvancedShowListenerImpl";

    /* renamed from: b, reason: collision with root package name */
    private o f6885b;

    /* renamed from: c, reason: collision with root package name */
    private com.anythink.expressad.foundation.d.c f6886c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f6887d;

    /* renamed from: e, reason: collision with root package name */
    private c f6888e;

    public d(c cVar, o oVar, double d10, com.anythink.expressad.foundation.d.c cVar2) {
        this.f6888e = cVar;
        this.f6885b = oVar;
        this.f6886c = cVar2;
        this.f6887d = a(d10, cVar2);
    }

    private void g() {
        if (this.f6885b != null) {
            this.f6885b = null;
        }
    }

    @Override // com.anythink.expressad.advanced.b.b
    public final void a() {
        c cVar = this.f6888e;
        if (cVar != null) {
            cVar.f6861d = true;
        }
        cVar.d();
        o oVar = this.f6885b;
        if (oVar == null || this.f6887d) {
            return;
        }
        oVar.b();
    }

    @Override // com.anythink.expressad.advanced.b.b
    public final void c() {
        o oVar = this.f6885b;
        if (oVar != null) {
            oVar.f();
            c cVar = this.f6888e;
            if (cVar != null) {
                cVar.f6861d = false;
            }
        }
    }

    @Override // com.anythink.expressad.advanced.b.b
    public final void a(com.anythink.expressad.foundation.d.c cVar) {
        o oVar = this.f6885b;
        if (oVar == null || this.f6887d) {
            return;
        }
        oVar.a(cVar);
    }

    private static boolean a(double d10, com.anythink.expressad.foundation.d.c cVar) {
        try {
            com.anythink.expressad.d.b.a();
            com.anythink.expressad.d.a c10 = com.anythink.expressad.d.b.c();
            long l10 = c10.l() * 1000;
            long x10 = c10.x() * 1000;
            com.anythink.expressad.foundation.h.o.d(f6884a, "cbp : " + d10 + " plct : " + x10 + " plctb : " + l10);
            if (cVar != null) {
                if (cVar.a(x10, l10)) {
                    cVar.e(1);
                    return true;
                }
                cVar.e(0);
            }
            if (cVar == null || cVar.A() || d10 == 1.0d) {
                return false;
            }
            double nextDouble = new Random().nextDouble();
            StringBuilder sb2 = new StringBuilder("hit : ");
            sb2.append(nextDouble);
            sb2.append(" ");
            sb2.append(nextDouble > d10);
            com.anythink.expressad.foundation.h.o.d(f6884a, sb2.toString());
            return nextDouble > d10;
        } catch (Exception e10) {
            com.anythink.expressad.foundation.h.o.b(f6884a, "CBPERROR", e10);
            return false;
        }
    }

    @Override // com.anythink.expressad.advanced.b.b
    public final void b() {
    }

    @Override // com.anythink.expressad.advanced.b.b
    public final void d() {
    }

    @Override // com.anythink.expressad.advanced.b.b
    public final void e() {
    }

    @Override // com.anythink.expressad.advanced.b.b
    public final void f() {
    }
}
