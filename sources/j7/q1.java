package j7;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Multimaps.java */
/* loaded from: classes2.dex */
public final class q1<K, V> extends c<K, V> {
    public final transient i7.m<? extends List<V>> y;

    public q1(Map map, o1 o1Var) {
        super(map);
        this.y = o1Var;
    }

    @Override // j7.d, j7.f
    public final Map<K, Collection<V>> q() {
        return C();
    }

    @Override // j7.d, j7.f
    public final Set<K> r() {
        return E();
    }

    @Override // j7.d
    public final Collection x() {
        return this.y.get();
    }
}
