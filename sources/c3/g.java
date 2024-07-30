package c3;

import a3.o;
import a3.x;
import c3.h;

/* compiled from: LruResourceCache.java */
/* loaded from: classes.dex */
public final class g extends t3.i<y2.e, x<?>> implements h {

    /* renamed from: d, reason: collision with root package name */
    public h.a f3242d;

    public g(long j10) {
        super(j10);
    }

    @Override // t3.i
    public final int b(x<?> xVar) {
        x<?> xVar2 = xVar;
        if (xVar2 == null) {
            return 1;
        }
        return xVar2.getSize();
    }

    @Override // t3.i
    public final void c(y2.e eVar, x<?> xVar) {
        x<?> xVar2 = xVar;
        h.a aVar = this.f3242d;
        if (aVar != null && xVar2 != null) {
            ((o) aVar).f162e.a(xVar2, true);
        }
    }
}
