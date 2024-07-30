package n2;

import android.graphics.PointF;
import g2.a0;

/* compiled from: CircleShape.java */
/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f33216a;

    /* renamed from: b, reason: collision with root package name */
    public final m2.i<PointF, PointF> f33217b;

    /* renamed from: c, reason: collision with root package name */
    public final m2.a f33218c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f33219d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f33220e;

    public a(String str, m2.i<PointF, PointF> iVar, m2.a aVar, boolean z10, boolean z11) {
        this.f33216a = str;
        this.f33217b = iVar;
        this.f33218c = aVar;
        this.f33219d = z10;
        this.f33220e = z11;
    }

    @Override // n2.b
    public final i2.b a(a0 a0Var, g2.h hVar, o2.b bVar) {
        return new i2.e(a0Var, bVar, this);
    }
}
