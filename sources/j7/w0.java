package j7;

import j7.n2;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: ImmutableTable.java */
/* loaded from: classes2.dex */
public abstract class w0<R, C, V> extends i<R, C, V> implements Serializable {
    public static p2 w(Object obj, Object obj2, Object obj3) {
        if (obj != null) {
            if (obj2 != null) {
                if (obj3 != null) {
                    return new p2(obj, obj2, obj3);
                }
                throw new NullPointerException("value");
            }
            throw new NullPointerException("columnKey");
        }
        throw new NullPointerException("rowKey");
    }

    @Override // 
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public abstract g0<V> C();

    @Override // j7.n2
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public abstract m0<R, Map<C, V>> p();

    public final g0<V> F() {
        Collection<V> collection = this.f29996t;
        if (collection == null) {
            collection = C();
            this.f29996t = collection;
        }
        return (g0) collection;
    }

    @Override // j7.i, j7.n2
    public final Set k() {
        Set<n2.a<R, C, V>> set = this.f29995s;
        if (set == null) {
            set = u();
            this.f29995s = set;
        }
        return (t0) set;
    }

    @Override // j7.i
    public final Iterator q() {
        throw new AssertionError("should never be called");
    }

    @Override // j7.i
    @Deprecated
    public final void r() {
        throw new UnsupportedOperationException();
    }

    @Override // j7.i
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public abstract t0<n2.a<R, C, V>> u();
}
