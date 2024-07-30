package com.onesignal;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: OSOutcomeEventsController.java */
/* loaded from: classes2.dex */
public final class l2 {

    /* renamed from: a, reason: collision with root package name */
    public Set<String> f26900a;

    /* renamed from: b, reason: collision with root package name */
    public final y1.g f26901b;

    /* renamed from: c, reason: collision with root package name */
    public final r2 f26902c;

    public l2(r2 r2Var, y1.g gVar) {
        this.f26902c = r2Var;
        this.f26901b = gVar;
        this.f26900a = OSUtils.p();
        Set<String> f = gVar.d().f();
        if (f != null) {
            this.f26900a = f;
        }
    }

    public final void a(String str, float f, List list) {
        e3.f26775w.getClass();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        new OSUtils();
        int b10 = OSUtils.b();
        String str2 = e3.f26752d;
        Iterator it = list.iterator();
        ec.e eVar = null;
        ec.e eVar2 = null;
        boolean z10 = false;
        while (it.hasNext()) {
            bc.a aVar = (bc.a) it.next();
            int ordinal = aVar.f3185a.ordinal();
            int i10 = aVar.f3186b;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            e3.b(7, "Outcomes disabled for channel: ".concat(a3.l.G(i10)), null);
                            return;
                        }
                    } else {
                        z10 = true;
                    }
                } else {
                    if (eVar2 == null) {
                        eVar2 = new ec.e(0);
                    }
                    int c10 = s.f.c(i10);
                    if (c10 != 0) {
                        if (c10 == 1) {
                            eVar2.f27895a = aVar.f3187c;
                        }
                    } else {
                        eVar2.f27896b = aVar.f3187c;
                    }
                }
            } else {
                if (eVar == null) {
                    eVar = new ec.e(0);
                }
                int c11 = s.f.c(i10);
                if (c11 != 0) {
                    if (c11 == 1) {
                        eVar.f27895a = aVar.f3187c;
                    }
                } else {
                    eVar.f27896b = aVar.f3187c;
                }
            }
        }
        if (eVar == null && eVar2 == null && !z10) {
            e3.b(7, "Outcomes disabled for all channels", null);
            return;
        }
        ec.b bVar = new ec.b(str, new ec.d(eVar, eVar2), f, 0L);
        this.f26901b.d().c(str2, b10, bVar, new j2(this, bVar, currentTimeMillis, str));
    }
}
