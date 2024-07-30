package q2;

import java.io.IOException;
import java.util.ArrayList;
import r2.c;

/* compiled from: KeyframesParser.java */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final c.a f34613a = c.a.a("k");

    public static ArrayList a(r2.c cVar, g2.h hVar, float f, k0 k0Var, boolean z10) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (cVar.l() == 6) {
            hVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        cVar.c();
        while (cVar.g()) {
            if (cVar.P(f34613a) != 0) {
                cVar.S();
            } else if (cVar.l() == 1) {
                cVar.b();
                if (cVar.l() == 7) {
                    arrayList.add(t.b(cVar, hVar, f, k0Var, false, z10));
                } else {
                    while (cVar.g()) {
                        arrayList.add(t.b(cVar, hVar, f, k0Var, true, z10));
                    }
                }
                cVar.d();
            } else {
                arrayList.add(t.b(cVar, hVar, f, k0Var, false, z10));
            }
        }
        cVar.e();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i10;
        T t10;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            i10 = size - 1;
            if (i11 >= i10) {
                break;
            }
            t2.a aVar = (t2.a) arrayList.get(i11);
            i11++;
            t2.a aVar2 = (t2.a) arrayList.get(i11);
            aVar.f35384h = Float.valueOf(aVar2.f35383g);
            if (aVar.f35380c == 0 && (t10 = aVar2.f35379b) != 0) {
                aVar.f35380c = t10;
                if (aVar instanceof j2.h) {
                    ((j2.h) aVar).d();
                }
            }
        }
        t2.a aVar3 = (t2.a) arrayList.get(i10);
        if ((aVar3.f35379b == 0 || aVar3.f35380c == 0) && arrayList.size() > 1) {
            arrayList.remove(aVar3);
        }
    }
}
