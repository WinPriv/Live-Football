package q2;

import android.graphics.Color;
import java.io.IOException;

/* compiled from: ColorParser.java */
/* loaded from: classes.dex */
public final class g implements k0<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public static final g f34578a = new g();

    @Override // q2.k0
    public final Integer a(r2.c cVar, float f) throws IOException {
        double d10;
        boolean z10 = true;
        if (cVar.l() != 1) {
            z10 = false;
        }
        if (z10) {
            cVar.b();
        }
        double i10 = cVar.i();
        double i11 = cVar.i();
        double i12 = cVar.i();
        if (cVar.l() == 7) {
            d10 = cVar.i();
        } else {
            d10 = 1.0d;
        }
        if (z10) {
            cVar.d();
        }
        if (i10 <= 1.0d && i11 <= 1.0d && i12 <= 1.0d) {
            i10 *= 255.0d;
            i11 *= 255.0d;
            i12 *= 255.0d;
            if (d10 <= 1.0d) {
                d10 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) d10, (int) i10, (int) i11, (int) i12));
    }
}
