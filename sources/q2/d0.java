package q2;

import java.io.IOException;

/* compiled from: ScaleXYParser.java */
/* loaded from: classes.dex */
public final class d0 implements k0<t2.d> {

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f34571a = new d0();

    @Override // q2.k0
    public final t2.d a(r2.c cVar, float f) throws IOException {
        boolean z10 = true;
        if (cVar.l() != 1) {
            z10 = false;
        }
        if (z10) {
            cVar.b();
        }
        float i10 = (float) cVar.i();
        float i11 = (float) cVar.i();
        while (cVar.g()) {
            cVar.S();
        }
        if (z10) {
            cVar.d();
        }
        return new t2.d((i10 / 100.0f) * f, (i11 / 100.0f) * f);
    }
}
