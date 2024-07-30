package j7;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: AbstractMultimap.java */
/* loaded from: classes2.dex */
public abstract class f<K, V> implements n1<K, V> {

    /* renamed from: s, reason: collision with root package name */
    @CheckForNull
    public transient Collection<Map.Entry<K, V>> f29943s;

    /* renamed from: t, reason: collision with root package name */
    @CheckForNull
    public transient Set<K> f29944t;

    /* renamed from: u, reason: collision with root package name */
    @CheckForNull
    public transient Collection<V> f29945u;

    /* renamed from: v, reason: collision with root package name */
    @CheckForNull
    public transient Map<K, Collection<V>> f29946v;

    /* compiled from: AbstractMultimap.java */
    /* loaded from: classes2.dex */
    public class a extends r1<K, V> {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<Map.Entry<K, V>> iterator() {
            return f.this.u();
        }
    }

    /* compiled from: AbstractMultimap.java */
    /* loaded from: classes2.dex */
    public class b extends f<K, V>.a implements Set<Map.Entry<K, V>> {
        public b(f fVar) {
            super();
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean equals(@CheckForNull Object obj) {
            return f2.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            return f2.c(this);
        }
    }

    /* compiled from: AbstractMultimap.java */
    /* loaded from: classes2.dex */
    public class c extends AbstractCollection<V> {
        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            f.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@CheckForNull Object obj) {
            return f.this.a(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return f.this.v();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return f.this.size();
        }
    }

    public boolean a(@CheckForNull Object obj) {
        Iterator<Collection<V>> it = p().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n1) {
            return p().equals(((n1) obj).p());
        }
        return false;
    }

    public final int hashCode() {
        return p().hashCode();
    }

    @Override // j7.n1
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // j7.n1
    public abstract Collection<Map.Entry<K, V>> k();

    @Override // j7.n1
    public Set<K> keySet() {
        Set<K> set = this.f29944t;
        if (set == null) {
            Set<K> r10 = r();
            this.f29944t = r10;
            return r10;
        }
        return set;
    }

    @Override // j7.n1
    public Map<K, Collection<V>> p() {
        Map<K, Collection<V>> map = this.f29946v;
        if (map == null) {
            Map<K, Collection<V>> q10 = q();
            this.f29946v = q10;
            return q10;
        }
        return map;
    }

    public abstract Map<K, Collection<V>> q();

    public abstract Set<K> r();

    @Override // j7.n1
    public boolean remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Collection<V> collection = p().get(obj);
        if (collection != null && collection.remove(obj2)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return p().toString();
    }

    public abstract Iterator<Map.Entry<K, V>> u();

    public Iterator<V> v() {
        return new k1(k().iterator());
    }
}
