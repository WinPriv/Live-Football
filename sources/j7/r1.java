package j7;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: Multimaps.java */
/* loaded from: classes2.dex */
public abstract class r1<K, V> extends AbstractCollection<Map.Entry<K, V>> {
    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        f.this.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        Collection<V> collection = f.this.p().get(key);
        if (collection == null || !collection.contains(value)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(@CheckForNull Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return f.this.remove(entry.getKey(), entry.getValue());
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return f.this.size();
    }
}
