package com.anythink.basead.d.c;

import android.text.TextUtils;
import com.anythink.core.common.e.aa;
import com.anythink.core.common.e.ab;
import com.anythink.core.common.e.g;
import com.anythink.core.common.e.j;
import com.anythink.core.common.e.k;

/* loaded from: classes.dex */
public final class a {
    private static void a(ab abVar, com.anythink.basead.d.c cVar) {
        if (abVar == null || cVar == null) {
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

    public static void a(j jVar, aa aaVar) {
        k kVar;
        if (jVar == null || aaVar == null || (kVar = jVar.f5664m) == null || !(kVar instanceof ab)) {
            return;
        }
        k k10 = aaVar.k();
        if (k10 != null) {
            k10.v(kVar.y());
            k10.w(kVar.z());
            k10.p(kVar.s());
            k10.a(kVar.r());
            k10.q(kVar.t());
            k10.o(kVar.q());
            k10.b(kVar.n());
            k10.n(kVar.p());
            k10.b(kVar.b());
            k10.a(kVar.a());
            k10.b(kVar.E());
            jVar.f5664m = k10;
        } else {
            aaVar.a(jVar.f5664m);
        }
        if ((!(aaVar instanceof g) || TextUtils.isEmpty(((g) aaVar).a())) && TextUtils.isEmpty(aaVar.A())) {
            jVar.f5664m.r(0);
            jVar.f5664m.t(0);
            jVar.f5664m.H(2);
            jVar.f5664m.h(2);
            jVar.f5664m.A(1);
            jVar.f5664m.s(-2);
        }
    }
}
