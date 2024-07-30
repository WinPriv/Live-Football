package j7;

import j7.d;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* compiled from: AbstractListMultimap.java */
/* loaded from: classes2.dex */
public abstract class c<K, V> extends d<K, V> {
    public c(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // j7.d
    public final Collection F() {
        return Collections.emptyList();
    }

    @Override // j7.d
    public final <E> Collection<E> H(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // j7.d
    public final Collection<V> L(K k10, Collection<V> collection) {
        List list = (List) collection;
        if (list instanceof RandomAccess) {
            return new d.h(this, k10, list, null);
        }
        return new d.l(k10, list, null);
    }

    @Override // j7.f
    public final boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j7.n1
    public final Collection get(Object obj) {
        Collection<V> collection = this.f29904w.get(obj);
        if (collection == null) {
            collection = y(obj);
        }
        return (List) L(obj, collection);
    }

    @Override // j7.d, j7.n1
    public final Collection l(@CheckForNull Object obj) {
        return (List) super.l(obj);
    }

    @Override // j7.f, j7.n1
    public final Map<K, Collection<V>> p() {
        return super.p();
    }

    @Override // j7.d, j7.n1
    public final boolean put(K k10, V v3) {
        return super.put(k10, v3);
    }
}
