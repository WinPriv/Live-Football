package j7;

import c6.r;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: ForwardingMap.java */
/* loaded from: classes2.dex */
public abstract class z<K, V> extends z6.f implements Map<K, V> {
    public z() {
        super(1);
    }

    @Override // java.util.Map
    public final void clear() {
        ((r.b) this).f3443t.clear();
    }

    public boolean containsKey(@CheckForNull Object obj) {
        return ((r.b) this).f3443t.containsKey(obj);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return (Set<Map.Entry<K, V>>) ((r.b) this).f3443t.entrySet();
    }

    @CheckForNull
    public V get(@CheckForNull Object obj) {
        return (V) ((r.b) this).f3443t.get(obj);
    }

    public boolean isEmpty() {
        return ((r.b) this).f3443t.isEmpty();
    }

    public Set<K> keySet() {
        return (Set<K>) ((r.b) this).f3443t.keySet();
    }

    @Override // java.util.Map
    @CheckForNull
    public final V put(K k10, V v3) {
        return (V) ((r.b) this).f3443t.put(k10, v3);
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        ((r.b) this).f3443t.putAll(map);
    }

    @Override // java.util.Map
    @CheckForNull
    public final V remove(@CheckForNull Object obj) {
        return (V) ((r.b) this).f3443t.remove(obj);
    }

    public int size() {
        return ((r.b) this).f3443t.size();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return (Collection<V>) ((r.b) this).f3443t.values();
    }
}
