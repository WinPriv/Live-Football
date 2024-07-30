package z4;

import java.util.List;
import k4.i0;
import z4.d0;

/* compiled from: SeiReader.java */
/* loaded from: classes2.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final List<i0> f37297a;

    /* renamed from: b, reason: collision with root package name */
    public final p4.w[] f37298b;

    public z(List<i0> list) {
        this.f37297a = list;
        this.f37298b = new p4.w[list.size()];
    }

    public final void a(p4.j jVar, d0.d dVar) {
        boolean z10;
        int i10 = 0;
        while (true) {
            p4.w[] wVarArr = this.f37298b;
            if (i10 < wVarArr.length) {
                dVar.a();
                dVar.b();
                p4.w s10 = jVar.s(dVar.f37050d, 3);
                i0 i0Var = this.f37297a.get(i10);
                String str = i0Var.D;
                if (!com.anythink.expressad.exoplayer.k.o.W.equals(str) && !com.anythink.expressad.exoplayer.k.o.X.equals(str)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                d6.a.b(z10, "Invalid closed caption mime type provided: " + str);
                String str2 = i0Var.f30518s;
                if (str2 == null) {
                    dVar.b();
                    str2 = dVar.f37051e;
                }
                i0.a aVar = new i0.a();
                aVar.f30525a = str2;
                aVar.f30534k = str;
                aVar.f30528d = i0Var.f30521v;
                aVar.f30527c = i0Var.f30520u;
                aVar.C = i0Var.V;
                aVar.f30536m = i0Var.F;
                s10.b(new i0(aVar));
                wVarArr[i10] = s10;
                i10++;
            } else {
                return;
            }
        }
    }
}
