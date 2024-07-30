package n2;

import android.graphics.PointF;
import g2.a0;

/* compiled from: PolystarShape.java */
/* loaded from: classes.dex */
public final class h implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f33248a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33249b;

    /* renamed from: c, reason: collision with root package name */
    public final m2.b f33250c;

    /* renamed from: d, reason: collision with root package name */
    public final m2.i<PointF, PointF> f33251d;

    /* renamed from: e, reason: collision with root package name */
    public final m2.b f33252e;
    public final m2.b f;

    /* renamed from: g, reason: collision with root package name */
    public final m2.b f33253g;

    /* renamed from: h, reason: collision with root package name */
    public final m2.b f33254h;

    /* renamed from: i, reason: collision with root package name */
    public final m2.b f33255i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f33256j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f33257k;

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Ljava/lang/Object;Lm2/b;Lm2/i<Landroid/graphics/PointF;Landroid/graphics/PointF;>;Lm2/b;Lm2/b;Lm2/b;Lm2/b;Lm2/b;ZZ)V */
    public h(String str, int i10, m2.b bVar, m2.i iVar, m2.b bVar2, m2.b bVar3, m2.b bVar4, m2.b bVar5, m2.b bVar6, boolean z10, boolean z11) {
        this.f33248a = str;
        this.f33249b = i10;
        this.f33250c = bVar;
        this.f33251d = iVar;
        this.f33252e = bVar2;
        this.f = bVar3;
        this.f33253g = bVar4;
        this.f33254h = bVar5;
        this.f33255i = bVar6;
        this.f33256j = z10;
        this.f33257k = z11;
    }

    @Override // n2.b
    public final i2.b a(a0 a0Var, g2.h hVar, o2.b bVar) {
        return new i2.m(a0Var, bVar, this);
    }
}
