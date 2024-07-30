package j7;

import java.util.Map;

/* compiled from: ForwardingMapEntry.java */
/* loaded from: classes2.dex */
public abstract class a0<K, V> extends z6.f implements Map.Entry<K, V> {
    public a0() {
        super(1);
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return (K) ((m2) this).f30048t.getKey();
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return (V) ((m2) this).f30048t.getValue();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return ((m2) this).f30048t.hashCode();
    }

    @Override // java.util.Map.Entry
    public V setValue(V v3) {
        return (V) ((m2) this).f30048t.setValue(v3);
    }
}
