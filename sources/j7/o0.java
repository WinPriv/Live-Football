package j7;

import javax.annotation.CheckForNull;

/* compiled from: ImmutableMapKeySet.java */
/* loaded from: classes2.dex */
public final class o0<K, V> extends x0<K> {

    /* renamed from: v, reason: collision with root package name */
    public final m0<K, V> f30051v;

    public o0(m0<K, V> m0Var) {
        this.f30051v = m0Var;
    }

    @Override // j7.x0, j7.t0, j7.g0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: A */
    public final t2<K> iterator() {
        return new l0(this.f30051v.entrySet().iterator());
    }

    @Override // j7.g0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return this.f30051v.containsKey(obj);
    }

    @Override // j7.x0
    public final K get(int i10) {
        return this.f30051v.entrySet().p().get(i10).getKey();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f30051v.size();
    }

    @Override // j7.g0
    public final boolean x() {
        return true;
    }
}
