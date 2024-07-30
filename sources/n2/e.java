package n2;

import g2.a0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: GradientStroke.java */
/* loaded from: classes.dex */
public final class e implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f33230a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33231b;

    /* renamed from: c, reason: collision with root package name */
    public final m2.c f33232c;

    /* renamed from: d, reason: collision with root package name */
    public final m2.d f33233d;

    /* renamed from: e, reason: collision with root package name */
    public final m2.a f33234e;
    public final m2.a f;

    /* renamed from: g, reason: collision with root package name */
    public final m2.b f33235g;

    /* renamed from: h, reason: collision with root package name */
    public final int f33236h;

    /* renamed from: i, reason: collision with root package name */
    public final int f33237i;

    /* renamed from: j, reason: collision with root package name */
    public final float f33238j;

    /* renamed from: k, reason: collision with root package name */
    public final List<m2.b> f33239k;

    /* renamed from: l, reason: collision with root package name */
    public final m2.b f33240l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f33241m;

    public e(String str, int i10, m2.c cVar, m2.d dVar, m2.a aVar, m2.a aVar2, m2.b bVar, int i11, int i12, float f, ArrayList arrayList, m2.b bVar2, boolean z10) {
        this.f33230a = str;
        this.f33231b = i10;
        this.f33232c = cVar;
        this.f33233d = dVar;
        this.f33234e = aVar;
        this.f = aVar2;
        this.f33235g = bVar;
        this.f33236h = i11;
        this.f33237i = i12;
        this.f33238j = f;
        this.f33239k = arrayList;
        this.f33240l = bVar2;
        this.f33241m = z10;
    }

    @Override // n2.b
    public final i2.b a(a0 a0Var, g2.h hVar, o2.b bVar) {
        return new i2.h(a0Var, bVar, this);
    }
}
