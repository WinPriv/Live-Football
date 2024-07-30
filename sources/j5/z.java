package j5;

import j5.u;
import j5.y;
import j7.o1;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import k4.n0;
import k4.q1;

/* compiled from: MergingMediaSource.java */
/* loaded from: classes2.dex */
public final class z extends g<Integer> {
    public static final k4.n0 J;
    public final u[] C;
    public final q1[] D;
    public final ArrayList<u> E;
    public final l3.d F;
    public int G;
    public long[][] H;
    public a I;

    /* compiled from: MergingMediaSource.java */
    /* loaded from: classes2.dex */
    public static final class a extends IOException {
    }

    static {
        n0.a aVar = new n0.a();
        aVar.f30580a = "MergingMediaSource";
        J = aVar.a();
    }

    public z(u... uVarArr) {
        l3.d dVar = new l3.d(0);
        this.C = uVarArr;
        this.F = dVar;
        this.E = new ArrayList<>(Arrays.asList(uVarArr));
        this.G = -1;
        this.D = new q1[uVarArr.length];
        this.H = new long[0];
        new HashMap();
        j7.r.y(8, "expectedKeys");
        j7.r.y(2, "expectedValuesPerKey");
        new j7.q1(new j7.p(8), new o1(2));
    }

    @Override // j5.g
    public final void A(Integer num, u uVar, q1 q1Var) {
        Integer num2 = num;
        if (this.I == null) {
            if (this.G == -1) {
                this.G = q1Var.h();
            } else if (q1Var.h() != this.G) {
                this.I = new a();
                return;
            }
            int length = this.H.length;
            q1[] q1VarArr = this.D;
            if (length == 0) {
                this.H = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.G, q1VarArr.length);
            }
            ArrayList<u> arrayList = this.E;
            arrayList.remove(uVar);
            q1VarArr[num2.intValue()] = q1Var;
            if (arrayList.isEmpty()) {
                v(q1VarArr[0]);
            }
        }
    }

    @Override // j5.u
    public final void c(s sVar) {
        y yVar = (y) sVar;
        int i10 = 0;
        while (true) {
            u[] uVarArr = this.C;
            if (i10 < uVarArr.length) {
                u uVar = uVarArr[i10];
                s sVar2 = yVar.f29857s[i10];
                if (sVar2 instanceof y.b) {
                    sVar2 = ((y.b) sVar2).f29866s;
                }
                uVar.c(sVar2);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // j5.u
    public final k4.n0 d() {
        u[] uVarArr = this.C;
        if (uVarArr.length > 0) {
            return uVarArr[0].d();
        }
        return J;
    }

    @Override // j5.g, j5.u
    public final void j() throws IOException {
        a aVar = this.I;
        if (aVar == null) {
            super.j();
            return;
        }
        throw aVar;
    }

    @Override // j5.u
    public final s p(u.b bVar, c6.b bVar2, long j10) {
        u[] uVarArr = this.C;
        int length = uVarArr.length;
        s[] sVarArr = new s[length];
        q1[] q1VarArr = this.D;
        int b10 = q1VarArr[0].b(bVar.f29835a);
        for (int i10 = 0; i10 < length; i10++) {
            sVarArr[i10] = uVarArr[i10].p(bVar.b(q1VarArr[i10].l(b10)), bVar2, j10 - this.H[b10][i10]);
        }
        return new y(this.F, this.H[b10], sVarArr);
    }

    @Override // j5.a
    public final void u(c6.h0 h0Var) {
        this.B = h0Var;
        this.A = d6.g0.k(null);
        int i10 = 0;
        while (true) {
            u[] uVarArr = this.C;
            if (i10 < uVarArr.length) {
                B(Integer.valueOf(i10), uVarArr[i10]);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // j5.g, j5.a
    public final void w() {
        super.w();
        Arrays.fill(this.D, (Object) null);
        this.G = -1;
        this.I = null;
        ArrayList<u> arrayList = this.E;
        arrayList.clear();
        Collections.addAll(arrayList, this.C);
    }

    @Override // j5.g
    public final u.b x(Integer num, u.b bVar) {
        if (num.intValue() != 0) {
            return null;
        }
        return bVar;
    }
}
