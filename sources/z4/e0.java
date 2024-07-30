package z4;

import java.util.List;
import k4.i0;
import z4.d0;

/* compiled from: UserDataReader.java */
/* loaded from: classes2.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final List<i0> f37063a;

    /* renamed from: b, reason: collision with root package name */
    public final p4.w[] f37064b;

    public e0(List<i0> list) {
        this.f37063a = list;
        this.f37064b = new p4.w[list.size()];
    }

    public final void a(long j10, d6.w wVar) {
        if (wVar.f27386c - wVar.f27385b < 9) {
            return;
        }
        int d10 = wVar.d();
        int d11 = wVar.d();
        int t10 = wVar.t();
        if (d10 == 434 && d11 == 1195456820 && t10 == 3) {
            p4.b.b(j10, wVar, this.f37064b);
        }
    }

    public final void b(p4.j jVar, d0.d dVar) {
        boolean z10;
        int i10 = 0;
        while (true) {
            p4.w[] wVarArr = this.f37064b;
            if (i10 < wVarArr.length) {
                dVar.a();
                dVar.b();
                p4.w s10 = jVar.s(dVar.f37050d, 3);
                i0 i0Var = this.f37063a.get(i10);
                String str = i0Var.D;
                if (!com.anythink.expressad.exoplayer.k.o.W.equals(str) && !com.anythink.expressad.exoplayer.k.o.X.equals(str)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                d6.a.b(z10, "Invalid closed caption mime type provided: " + str);
                i0.a aVar = new i0.a();
                dVar.b();
                aVar.f30525a = dVar.f37051e;
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
