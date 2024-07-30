package n2;

import android.graphics.Path;
import g2.a0;

/* compiled from: GradientFill.java */
/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    public final int f33223a;

    /* renamed from: b, reason: collision with root package name */
    public final Path.FillType f33224b;

    /* renamed from: c, reason: collision with root package name */
    public final m2.c f33225c;

    /* renamed from: d, reason: collision with root package name */
    public final m2.d f33226d;

    /* renamed from: e, reason: collision with root package name */
    public final m2.a f33227e;
    public final m2.a f;

    /* renamed from: g, reason: collision with root package name */
    public final String f33228g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f33229h;

    public d(String str, int i10, Path.FillType fillType, m2.c cVar, m2.d dVar, m2.a aVar, m2.a aVar2, boolean z10) {
        this.f33223a = i10;
        this.f33224b = fillType;
        this.f33225c = cVar;
        this.f33226d = dVar;
        this.f33227e = aVar;
        this.f = aVar2;
        this.f33228g = str;
        this.f33229h = z10;
    }

    @Override // n2.b
    public final i2.b a(a0 a0Var, g2.h hVar, o2.b bVar) {
        return new i2.g(a0Var, hVar, bVar, this);
    }
}
