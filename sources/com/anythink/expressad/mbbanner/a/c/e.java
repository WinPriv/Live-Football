package com.anythink.expressad.mbbanner.a.c;

import com.anythink.expressad.foundation.h.o;
import java.util.List;
import java.util.Random;

/* loaded from: classes.dex */
public class e implements c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10330a = "e";

    /* renamed from: b, reason: collision with root package name */
    private c f10331b;

    /* renamed from: c, reason: collision with root package name */
    private com.anythink.expressad.d.c f10332c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f10333d = false;

    public e(c cVar, com.anythink.expressad.d.c cVar2) {
        this.f10332c = cVar2;
        this.f10331b = cVar;
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void a(List<com.anythink.expressad.foundation.d.c> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    com.anythink.expressad.d.c cVar = this.f10332c;
                    boolean z10 = false;
                    if (!list.get(0).A() && cVar != null && cVar.a() != 1.0d) {
                        if (new Random().nextDouble() > cVar.a()) {
                            z10 = true;
                        }
                    }
                    this.f10333d = z10;
                    String str = f10330a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f10333d);
                    o.d(str, sb2.toString());
                }
            } catch (Exception e10) {
                o.b(f10330a, "Exception", e10);
            }
        }
        c cVar2 = this.f10331b;
        if (cVar2 != null) {
            cVar2.a(list);
        }
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void b() {
        c cVar = this.f10331b;
        if (cVar != null) {
            cVar.b();
        }
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void c() {
        c cVar = this.f10331b;
        if (cVar != null) {
            cVar.c();
        }
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void d() {
        c cVar = this.f10331b;
        if (cVar != null) {
            cVar.d();
        }
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void a(String str) {
        c cVar = this.f10331b;
        if (cVar != null) {
            cVar.a(str);
        }
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void a(com.anythink.expressad.foundation.d.c cVar) {
        c cVar2 = this.f10331b;
        if (cVar2 == null || this.f10333d) {
            return;
        }
        cVar2.a(cVar);
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void a() {
        c cVar = this.f10331b;
        if (cVar != null) {
            cVar.a();
        }
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void a(com.anythink.expressad.foundation.d.c cVar, boolean z10) {
        c cVar2 = this.f10331b;
        if (cVar2 != null) {
            cVar2.a(cVar, this.f10333d);
        }
    }

    private static boolean a(com.anythink.expressad.d.c cVar, boolean z10) {
        if (z10 || cVar == null || cVar.a() == 1.0d) {
            return false;
        }
        return new Random().nextDouble() > cVar.a();
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void a(boolean z10) {
        c cVar = this.f10331b;
        if (cVar != null) {
            cVar.a(z10);
        }
    }
}
