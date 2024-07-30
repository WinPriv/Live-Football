package n2;

import g2.a0;

/* compiled from: MergePaths.java */
/* loaded from: classes.dex */
public final class g implements b {

    /* renamed from: a, reason: collision with root package name */
    public final int f33246a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f33247b;

    public g(String str, int i10, boolean z10) {
        this.f33246a = i10;
        this.f33247b = z10;
    }

    @Override // n2.b
    public final i2.b a(a0 a0Var, g2.h hVar, o2.b bVar) {
        if (!a0Var.E) {
            s2.c.b("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new i2.k(this);
    }

    public final String toString() {
        return "MergePaths{mode=" + com.ironsource.adapters.facebook.a.v(this.f33246a) + '}';
    }
}
