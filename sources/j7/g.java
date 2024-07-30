package j7;

import j7.d;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: AbstractSetMultimap.java */
/* loaded from: classes2.dex */
public abstract class g<K, V> extends d<K, V> implements c2<K, V> {
    public g(AbstractMap abstractMap) {
        super(abstractMap);
    }

    @Override // j7.d
    public <E> Collection<E> H(Collection<E> collection) {
        return Collections.unmodifiableSet((Set) collection);
    }

    @Override // j7.d
    public Collection<V> L(K k10, Collection<V> collection) {
        return new d.n(k10, (Set) collection);
    }

    @Override // j7.d
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public Set<V> F() {
        return Collections.emptySet();
    }

    @Override // j7.d, j7.f, j7.n1
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public Set<Map.Entry<K, V>> k() {
        return (Set) super.k();
    }

    @Override // j7.n1
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public Set<V> get(K k10) {
        Collection<V> collection = this.f29904w.get(k10);
        if (collection == null) {
            collection = y(k10);
        }
        return (Set) L(k10, collection);
    }

    @Override // j7.d, j7.n1
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public Set<V> l(@CheckForNull Object obj) {
        return (Set) super.l(obj);
    }

    @Override // j7.f
    public final boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }

    @Override // j7.f, j7.n1
    public Map<K, Collection<V>> p() {
        return super.p();
    }

    @Override // j7.d, j7.n1
    public final boolean put(K k10, V v3) {
        return super.put(k10, v3);
    }
}
