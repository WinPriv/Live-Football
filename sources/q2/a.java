package q2;

import java.io.IOException;
import java.util.ArrayList;
import r2.c;

/* compiled from: AnimatablePathValueParser.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final c.a f34562a = c.a.a("k", "x", "y");

    public static androidx.transition.r a(r2.d dVar, g2.h hVar) throws IOException {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        if (dVar.l() == 1) {
            dVar.b();
            while (dVar.g()) {
                if (dVar.l() == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(new j2.h(hVar, t.b(dVar, hVar, s2.g.c(), d.f34570a, z10, false)));
            }
            dVar.d();
            u.b(arrayList);
        } else {
            arrayList.add(new t2.a(s.b(dVar, s2.g.c())));
        }
        return new androidx.transition.r(arrayList, 1);
    }

    public static m2.i b(r2.d dVar, g2.h hVar) throws IOException {
        dVar.c();
        androidx.transition.r rVar = null;
        m2.b bVar = null;
        boolean z10 = false;
        m2.b bVar2 = null;
        while (dVar.l() != 4) {
            int P = dVar.P(f34562a);
            if (P != 0) {
                if (P != 1) {
                    if (P != 2) {
                        dVar.Q();
                        dVar.S();
                    } else if (dVar.l() == 6) {
                        dVar.S();
                        z10 = true;
                    } else {
                        bVar = d.c(dVar, hVar, true);
                    }
                } else if (dVar.l() == 6) {
                    dVar.S();
                    z10 = true;
                } else {
                    bVar2 = d.c(dVar, hVar, true);
                }
            } else {
                rVar = a(dVar, hVar);
            }
        }
        dVar.e();
        if (z10) {
            hVar.a("Lottie doesn't support expressions.");
        }
        if (rVar != null) {
            return rVar;
        }
        return new m2.e(bVar2, bVar);
    }
}
