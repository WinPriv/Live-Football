package j7;

import j7.m0;
import j7.w;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: ImmutableMapEntrySet.java */
/* loaded from: classes2.dex */
public abstract class n0<K, V> extends t0<Map.Entry<K, V>> {
    @Override // j7.t0
    public final boolean F() {
        m0.b.this.getClass();
        return false;
    }

    @Override // j7.g0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        V v3 = m0.b.this.get(entry.getKey());
        if (v3 == null || !v3.equals(entry.getValue())) {
            return false;
        }
        return true;
    }

    @Override // j7.t0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return m0.b.this.hashCode();
    }

    @Override // j7.t0, j7.g0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((w.c) m0.b.this).f30124v;
    }

    @Override // j7.g0
    public final boolean x() {
        return m0.b.this.u();
    }
}
