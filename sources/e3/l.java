package e3;

import e3.m;
import java.util.ArrayDeque;

/* compiled from: ModelCache.java */
/* loaded from: classes.dex */
public final class l extends t3.i<m.a<Object>, Object> {
    public l() {
        super(500L);
    }

    @Override // t3.i
    public final void c(m.a<Object> aVar, Object obj) {
        m.a<Object> aVar2 = aVar;
        aVar2.getClass();
        ArrayDeque arrayDeque = m.a.f27699d;
        synchronized (arrayDeque) {
            arrayDeque.offer(aVar2);
        }
    }
}
