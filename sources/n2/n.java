package n2;

import g2.a0;
import java.util.Arrays;
import java.util.List;

/* compiled from: ShapeGroup.java */
/* loaded from: classes.dex */
public final class n implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f33277a;

    /* renamed from: b, reason: collision with root package name */
    public final List<b> f33278b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f33279c;

    public n(String str, List<b> list, boolean z10) {
        this.f33277a = str;
        this.f33278b = list;
        this.f33279c = z10;
    }

    @Override // n2.b
    public final i2.b a(a0 a0Var, g2.h hVar, o2.b bVar) {
        return new i2.c(a0Var, bVar, this, hVar);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f33277a + "' Shapes: " + Arrays.toString(this.f33278b.toArray()) + '}';
    }
}
