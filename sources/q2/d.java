package q2;

import java.io.IOException;

/* compiled from: AnimatableValueParser.java */
/* loaded from: classes.dex */
public final class d implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final d f34570a = new d();

    public static m2.a b(r2.d dVar, g2.h hVar) throws IOException {
        return new m2.a(u.a(dVar, hVar, 1.0f, g.f34578a, false), 0);
    }

    public static m2.b c(r2.c cVar, g2.h hVar, boolean z10) throws IOException {
        float f;
        if (z10) {
            f = s2.g.c();
        } else {
            f = 1.0f;
        }
        return new m2.b(u.a(cVar, hVar, f, l.f34598a, false));
    }

    public static m2.d d(r2.d dVar, g2.h hVar) throws IOException {
        return new m2.d(u.a(dVar, hVar, 1.0f, r.f34608a, false), 0);
    }

    public static m2.a e(r2.d dVar, g2.h hVar) throws IOException {
        return new m2.a(u.a(dVar, hVar, s2.g.c(), y.f34622a, true), 1);
    }

    @Override // q2.k0
    public Object a(r2.c cVar, float f) throws IOException {
        return s.b(cVar, f);
    }
}
