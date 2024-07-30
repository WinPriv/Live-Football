package j7;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: Multimap.java */
/* loaded from: classes2.dex */
public interface n1<K, V> {
    void clear();

    boolean containsKey(@CheckForNull Object obj);

    Collection<V> get(K k10);

    boolean isEmpty();

    Collection<Map.Entry<K, V>> k();

    Set<K> keySet();

    Collection<V> l(@CheckForNull Object obj);

    Map<K, Collection<V>> p();

    boolean put(K k10, V v3);

    boolean remove(@CheckForNull Object obj, @CheckForNull Object obj2);

    int size();
}
