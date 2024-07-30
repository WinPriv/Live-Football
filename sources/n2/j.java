package n2;

import g2.a0;

/* compiled from: Repeater.java */
/* loaded from: classes.dex */
public final class j implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f33263a;

    /* renamed from: b, reason: collision with root package name */
    public final m2.b f33264b;

    /* renamed from: c, reason: collision with root package name */
    public final m2.b f33265c;

    /* renamed from: d, reason: collision with root package name */
    public final m2.h f33266d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f33267e;

    public j(String str, m2.b bVar, m2.b bVar2, m2.h hVar, boolean z10) {
        this.f33263a = str;
        this.f33264b = bVar;
        this.f33265c = bVar2;
        this.f33266d = hVar;
        this.f33267e = z10;
    }

    @Override // n2.b
    public final i2.b a(a0 a0Var, g2.h hVar, o2.b bVar) {
        return new i2.o(a0Var, bVar, this);
    }
}
