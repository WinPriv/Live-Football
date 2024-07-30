package n2;

import g2.a0;

/* compiled from: ShapePath.java */
/* loaded from: classes.dex */
public final class o implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f33280a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33281b;

    /* renamed from: c, reason: collision with root package name */
    public final m2.d f33282c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f33283d;

    public o(String str, int i10, m2.d dVar, boolean z10) {
        this.f33280a = str;
        this.f33281b = i10;
        this.f33282c = dVar;
        this.f33283d = z10;
    }

    @Override // n2.b
    public final i2.b a(a0 a0Var, g2.h hVar, o2.b bVar) {
        return new i2.q(a0Var, bVar, this);
    }

    public final String toString() {
        return "ShapePath{name=" + this.f33280a + ", index=" + this.f33281b + '}';
    }
}
