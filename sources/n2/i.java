package n2;

import android.graphics.PointF;
import g2.a0;

/* compiled from: RectangleShape.java */
/* loaded from: classes.dex */
public final class i implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f33258a;

    /* renamed from: b, reason: collision with root package name */
    public final m2.i<PointF, PointF> f33259b;

    /* renamed from: c, reason: collision with root package name */
    public final m2.i<PointF, PointF> f33260c;

    /* renamed from: d, reason: collision with root package name */
    public final m2.b f33261d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f33262e;

    public i(String str, m2.i iVar, m2.a aVar, m2.b bVar, boolean z10) {
        this.f33258a = str;
        this.f33259b = iVar;
        this.f33260c = aVar;
        this.f33261d = bVar;
        this.f33262e = z10;
    }

    @Override // n2.b
    public final i2.b a(a0 a0Var, g2.h hVar, o2.b bVar) {
        return new i2.n(a0Var, bVar, this);
    }

    public final String toString() {
        return "RectangleShape{position=" + this.f33259b + ", size=" + this.f33260c + '}';
    }
}
