package n2;

import g2.a0;
import i2.s;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ShapeStroke.java */
/* loaded from: classes.dex */
public final class p implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f33284a;

    /* renamed from: b, reason: collision with root package name */
    public final m2.b f33285b;

    /* renamed from: c, reason: collision with root package name */
    public final List<m2.b> f33286c;

    /* renamed from: d, reason: collision with root package name */
    public final m2.a f33287d;

    /* renamed from: e, reason: collision with root package name */
    public final m2.d f33288e;
    public final m2.b f;

    /* renamed from: g, reason: collision with root package name */
    public final int f33289g;

    /* renamed from: h, reason: collision with root package name */
    public final int f33290h;

    /* renamed from: i, reason: collision with root package name */
    public final float f33291i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f33292j;

    public p(String str, m2.b bVar, ArrayList arrayList, m2.a aVar, m2.d dVar, m2.b bVar2, int i10, int i11, float f, boolean z10) {
        this.f33284a = str;
        this.f33285b = bVar;
        this.f33286c = arrayList;
        this.f33287d = aVar;
        this.f33288e = dVar;
        this.f = bVar2;
        this.f33289g = i10;
        this.f33290h = i11;
        this.f33291i = f;
        this.f33292j = z10;
    }

    @Override // n2.b
    public final i2.b a(a0 a0Var, g2.h hVar, o2.b bVar) {
        return new s(a0Var, bVar, this);
    }
}
