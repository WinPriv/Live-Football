package j7;

import j7.d;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import javax.annotation.CheckForNull;

/* compiled from: AbstractSortedSetMultimap.java */
/* loaded from: classes2.dex */
public abstract class h<K, V> extends g<K, V> {
    public h(TreeMap treeMap) {
        super(treeMap);
    }

    @Override // j7.g, j7.d
    public final Collection F() {
        return f2.f(new TreeSet(((s2) this).f30098z));
    }

    @Override // j7.g, j7.d
    public final Collection H(Collection collection) {
        if (collection instanceof NavigableSet) {
            return f2.f((NavigableSet) collection);
        }
        return Collections.unmodifiableSortedSet((SortedSet) collection);
    }

    @Override // j7.d
    public final Collection<V> K() {
        return super.K();
    }

    @Override // j7.g, j7.d
    public final Collection<V> L(K k10, Collection<V> collection) {
        if (collection instanceof NavigableSet) {
            return new d.m(k10, (NavigableSet) collection, null);
        }
        return new d.o(k10, (SortedSet) collection, null);
    }

    @Override // j7.g
    /* renamed from: O */
    public final Set F() {
        return f2.f(new TreeSet(((s2) this).f30098z));
    }

    @Override // j7.g
    /* renamed from: W */
    public final Set l(@CheckForNull Object obj) {
        return (SortedSet) super.l(obj);
    }

    public final SortedSet<V> X(K k10) {
        return (SortedSet) super.get(k10);
    }

    @Override // j7.g, j7.d, j7.n1
    public final Collection l(@CheckForNull Object obj) {
        return (SortedSet) super.l(obj);
    }

    @Override // j7.g, j7.f, j7.n1
    public Map<K, Collection<V>> p() {
        return super.p();
    }
}
