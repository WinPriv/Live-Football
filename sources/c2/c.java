package c2;

import c2.a;

/* compiled from: SettableFuture.java */
/* loaded from: classes.dex */
public final class c<V> extends a<V> {
    public final boolean i(V v3) {
        if (v3 == null) {
            v3 = (V) a.y;
        }
        if (a.f3202x.b(this, null, v3)) {
            a.c(this);
            return true;
        }
        return false;
    }

    public final boolean j(Throwable th) {
        th.getClass();
        if (a.f3202x.b(this, null, new a.c(th))) {
            a.c(this);
            return true;
        }
        return false;
    }

    public final boolean k(m7.a<? extends V> aVar) {
        a.c cVar;
        aVar.getClass();
        Object obj = this.f3203s;
        if (obj == null) {
            if (aVar.isDone()) {
                if (!a.f3202x.b(this, null, a.f(aVar))) {
                    return false;
                }
                a.c(this);
            } else {
                a.f fVar = new a.f(this, aVar);
                if (a.f3202x.b(this, null, fVar)) {
                    try {
                        aVar.a(fVar, b.f3226s);
                    } catch (Throwable th) {
                        try {
                            cVar = new a.c(th);
                        } catch (Throwable unused) {
                            cVar = a.c.f3210b;
                        }
                        a.f3202x.b(this, fVar, cVar);
                    }
                } else {
                    obj = this.f3203s;
                }
            }
            return true;
        }
        if (!(obj instanceof a.b)) {
            return false;
        }
        aVar.cancel(((a.b) obj).f3208a);
        return false;
    }
}
