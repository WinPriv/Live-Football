package q2;

import android.graphics.PointF;
import java.io.IOException;

/* compiled from: PointFParser.java */
/* loaded from: classes.dex */
public final class y implements k0<PointF> {

    /* renamed from: a, reason: collision with root package name */
    public static final y f34622a = new y();

    @Override // q2.k0
    public final PointF a(r2.c cVar, float f) throws IOException {
        int l10 = cVar.l();
        if (l10 == 1) {
            return s.b(cVar, f);
        }
        if (l10 == 3) {
            return s.b(cVar, f);
        }
        if (l10 == 7) {
            PointF pointF = new PointF(((float) cVar.i()) * f, ((float) cVar.i()) * f);
            while (cVar.g()) {
                cVar.S();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(com.ironsource.adapters.facebook.a.y(l10)));
    }
}
