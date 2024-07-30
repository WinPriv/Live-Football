package n2;

import android.graphics.Path;
import g2.a0;

/* compiled from: ShapeFill.java */
/* loaded from: classes.dex */
public final class m implements b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f33272a;

    /* renamed from: b, reason: collision with root package name */
    public final Path.FillType f33273b;

    /* renamed from: c, reason: collision with root package name */
    public final String f33274c;

    /* renamed from: d, reason: collision with root package name */
    public final m2.a f33275d;

    /* renamed from: e, reason: collision with root package name */
    public final m2.d f33276e;
    public final boolean f;

    public m(String str, boolean z10, Path.FillType fillType, m2.a aVar, m2.d dVar, boolean z11) {
        this.f33274c = str;
        this.f33272a = z10;
        this.f33273b = fillType;
        this.f33275d = aVar;
        this.f33276e = dVar;
        this.f = z11;
    }

    @Override // n2.b
    public final i2.b a(a0 a0Var, g2.h hVar, o2.b bVar) {
        return new i2.f(a0Var, bVar, this);
    }

    public final String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f33272a + '}';
    }
}
