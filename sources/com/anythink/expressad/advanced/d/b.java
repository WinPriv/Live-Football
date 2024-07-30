package com.anythink.expressad.advanced.d;

import com.anythink.expressad.out.o;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b implements com.anythink.expressad.advanced.b.a {

    /* renamed from: a, reason: collision with root package name */
    private o f6855a;

    /* renamed from: b, reason: collision with root package name */
    private c f6856b;

    public b(c cVar) {
        this.f6856b = cVar;
    }

    private static void a() {
    }

    private void b() {
        if (this.f6855a != null) {
            this.f6855a = null;
        }
        if (this.f6856b != null) {
            this.f6856b = null;
        }
    }

    public final void a(o oVar) {
        this.f6855a = oVar;
    }

    @Override // com.anythink.expressad.advanced.b.a
    public final void a(com.anythink.expressad.foundation.d.c cVar, int i10) {
        c cVar2;
        com.anythink.expressad.foundation.h.o.d("NativeAdvancedLoadManager", "onLoadSuccessed: ".concat(String.valueOf(i10)));
        c cVar3 = this.f6856b;
        if (cVar3 == null || !cVar3.a() || cVar == null) {
            return;
        }
        o oVar = this.f6855a;
        if (oVar != null && this.f6856b != null) {
            oVar.a();
        }
        this.f6856b.b();
        new ArrayList().add(cVar);
        if (i10 != 2 || (cVar2 = this.f6856b) == null) {
            return;
        }
        cVar2.a(cVar, true);
    }

    @Override // com.anythink.expressad.advanced.b.a
    public final void a(String str, int i10) {
        com.anythink.expressad.foundation.h.o.d("NativeAdvancedLoadManager", "onLoadFailed: " + i10 + str);
        c cVar = this.f6856b;
        if (cVar == null || !cVar.a()) {
            return;
        }
        o oVar = this.f6855a;
        if (oVar != null) {
            oVar.a(str);
        }
        this.f6856b.b();
    }
}
