package n2;

import g2.a0;
import i2.t;

/* compiled from: ShapeTrimPath.java */
/* loaded from: classes.dex */
public final class q implements b {

    /* renamed from: a, reason: collision with root package name */
    public final int f33293a;

    /* renamed from: b, reason: collision with root package name */
    public final m2.b f33294b;

    /* renamed from: c, reason: collision with root package name */
    public final m2.b f33295c;

    /* renamed from: d, reason: collision with root package name */
    public final m2.b f33296d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f33297e;

    public q(String str, int i10, m2.b bVar, m2.b bVar2, m2.b bVar3, boolean z10) {
        this.f33293a = i10;
        this.f33294b = bVar;
        this.f33295c = bVar2;
        this.f33296d = bVar3;
        this.f33297e = z10;
    }

    @Override // n2.b
    public final i2.b a(a0 a0Var, g2.h hVar, o2.b bVar) {
        return new t(bVar, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.f33294b + ", end: " + this.f33295c + ", offset: " + this.f33296d + "}";
    }
}
