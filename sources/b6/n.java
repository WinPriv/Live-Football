package b6;

import b6.h;
import d6.g0;
import k4.k1;
import k4.r1;

/* compiled from: TrackSelectorResult.java */
/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f3124a;

    /* renamed from: b, reason: collision with root package name */
    public final k1[] f3125b;

    /* renamed from: c, reason: collision with root package name */
    public final f[] f3126c;

    /* renamed from: d, reason: collision with root package name */
    public final r1 f3127d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3128e;

    public n(k1[] k1VarArr, f[] fVarArr, r1 r1Var, h.a aVar) {
        this.f3125b = k1VarArr;
        this.f3126c = (f[]) fVarArr.clone();
        this.f3127d = r1Var;
        this.f3128e = aVar;
        this.f3124a = k1VarArr.length;
    }

    public final boolean a(n nVar, int i10) {
        if (nVar == null || !g0.a(this.f3125b[i10], nVar.f3125b[i10]) || !g0.a(this.f3126c[i10], nVar.f3126c[i10])) {
            return false;
        }
        return true;
    }

    public final boolean b(int i10) {
        if (this.f3125b[i10] != null) {
            return true;
        }
        return false;
    }
}
