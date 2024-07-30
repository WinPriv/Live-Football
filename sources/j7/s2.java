package j7;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: TreeMultimap.java */
/* loaded from: classes2.dex */
public final class s2<K, V> extends h<Object, Object> {
    public final transient Comparator<? super K> y;

    /* renamed from: z, reason: collision with root package name */
    public final transient Comparator<? super V> f30098z;

    public s2(t1 t1Var, t1 t1Var2) {
        super(new TreeMap(t1Var));
        this.y = t1Var;
        this.f30098z = t1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j7.g
    /* renamed from: V */
    public final Set get(Object obj) {
        return (NavigableSet) X(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j7.g, j7.n1
    public final Collection get(Object obj) {
        return (NavigableSet) X(obj);
    }

    @Override // j7.f, j7.n1
    public final Set keySet() {
        return (NavigableSet) ((SortedSet) super.keySet());
    }

    @Override // j7.h, j7.g, j7.f, j7.n1
    public final Map p() {
        return (NavigableMap) ((SortedMap) super.p());
    }

    @Override // j7.d, j7.f
    public final Map<K, Collection<V>> q() {
        return C();
    }

    @Override // j7.d, j7.f
    public final Set<Object> r() {
        return E();
    }

    @Override // j7.d
    public final Collection x() {
        return new TreeSet(this.f30098z);
    }

    @Override // j7.d
    public final Collection<V> y(K k10) {
        if (k10 == null) {
            this.y.compare(k10, k10);
        }
        return x();
    }
}
