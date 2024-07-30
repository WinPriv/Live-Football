package j7;

import com.google.j2objc.annotations.Weak;
import j7.b1;
import j7.f2;
import j7.g0;
import j7.k2;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: Maps.java */
/* loaded from: classes2.dex */
public final class m1 {

    /* compiled from: Maps.java */
    /* loaded from: classes2.dex */
    public static abstract class a<K, V> extends f2.c<Map.Entry<K, V>> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            d().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object c10 = m1.c(d(), key);
            if (!i7.g.a(c10, entry.getValue())) {
                return false;
            }
            if (c10 == null && !d().containsKey(key)) {
                return false;
            }
            return true;
        }

        public abstract Map<K, V> d();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return d().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            if (contains(obj) && (obj instanceof Map.Entry)) {
                return d().keySet().remove(((Map.Entry) obj).getKey());
            }
            return false;
        }

        @Override // j7.f2.c, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection<?> collection) {
            try {
                collection.getClass();
                return f2.e(this, collection);
            } catch (UnsupportedOperationException unused) {
                Iterator<?> it = collection.iterator();
                boolean z10 = false;
                while (it.hasNext()) {
                    z10 |= remove(it.next());
                }
                return z10;
            }
        }

        @Override // j7.f2.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection<?> collection) {
            int i10;
            try {
                collection.getClass();
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                int size = collection.size();
                if (size < 3) {
                    r.y(size, "expectedSize");
                    i10 = size + 1;
                } else if (size < 1073741824) {
                    i10 = (int) ((size / 0.75f) + 1.0f);
                } else {
                    i10 = Integer.MAX_VALUE;
                }
                HashSet hashSet = new HashSet(i10);
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        hashSet.add(((Map.Entry) obj).getKey());
                    }
                }
                return d().keySet().retainAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return d().size();
        }
    }

    /* compiled from: Maps.java */
    /* loaded from: classes2.dex */
    public static abstract class b<K, V> extends AbstractMap<K, V> {

        /* compiled from: Maps.java */
        /* loaded from: classes2.dex */
        public class a extends a<K, V> {
            public a() {
            }

            @Override // j7.m1.a
            public final Map<K, V> d() {
                return b.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<Map.Entry<K, V>> iterator() {
                k2.b bVar = (k2.b) b.this;
                bVar.c();
                Map<C, V> map = bVar.f30023t;
                if (map == 0) {
                    return b1.b.f29882s;
                }
                return new l2(bVar, map.entrySet().iterator());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Set<Map.Entry<K, V>> entrySet() {
            return new a();
        }
    }

    /* compiled from: Maps.java */
    /* loaded from: classes2.dex */
    public static class c<K, V> extends f2.c<K> {

        /* renamed from: s, reason: collision with root package name */
        @Weak
        public final Map<K, V> f30043s;

        public c(Map<K, V> map) {
            map.getClass();
            this.f30043s = map;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.f30043s.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@CheckForNull Object obj) {
            return this.f30043s.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return this.f30043s.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new j1(this.f30043s.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            if (contains(obj)) {
                this.f30043s.remove(obj);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f30043s.size();
        }
    }

    /* compiled from: Maps.java */
    /* loaded from: classes2.dex */
    public static class d<K, V> extends AbstractCollection<V> {

        /* renamed from: s, reason: collision with root package name */
        @Weak
        public final Map<K, V> f30044s;

        public d(Map<K, V> map) {
            map.getClass();
            this.f30044s = map;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            this.f30044s.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@CheckForNull Object obj) {
            return this.f30044s.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return this.f30044s.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new k1(this.f30044s.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(@CheckForNull Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                Map<K, V> map = this.f30044s;
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    if (i7.g.a(obj, entry.getValue())) {
                        map.remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            try {
                collection.getClass();
                return super.removeAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                Map<K, V> map = this.f30044s;
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return map.keySet().removeAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            try {
                collection.getClass();
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                Map<K, V> map = this.f30044s;
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return map.keySet().retainAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.f30044s.size();
        }
    }

    /* compiled from: Maps.java */
    /* loaded from: classes2.dex */
    public static abstract class e<K, V> extends AbstractMap<K, V> {

        /* renamed from: s, reason: collision with root package name */
        @CheckForNull
        public transient Set<Map.Entry<K, V>> f30045s;

        /* renamed from: t, reason: collision with root package name */
        @CheckForNull
        public transient Set<K> f30046t;

        /* renamed from: u, reason: collision with root package name */
        @CheckForNull
        public transient d f30047u;

        public abstract Set<Map.Entry<K, V>> b();

        public Set<K> c() {
            return new c(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f30045s;
            if (set == null) {
                Set<Map.Entry<K, V>> b10 = b();
                this.f30045s = b10;
                return b10;
            }
            return set;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            Set<K> set = this.f30046t;
            if (set == null) {
                Set<K> c10 = c();
                this.f30046t = c10;
                return c10;
            }
            return set;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Collection<V> values() {
            d dVar = this.f30047u;
            if (dVar == null) {
                d dVar2 = new d(this);
                this.f30047u = dVar2;
                return dVar2;
            }
            return dVar;
        }
    }

    public static boolean a(Map<?, ?> map, @CheckForNull Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static w1 b(Collection collection) {
        Object[] objArr = new Object[collection.size() * 2];
        int i10 = 0;
        int i11 = 0;
        for (Object obj : collection) {
            int i12 = i11 + 1;
            Integer valueOf = Integer.valueOf(i11);
            int i13 = i10 + 1;
            int i14 = i13 * 2;
            if (i14 > objArr.length) {
                objArr = Arrays.copyOf(objArr, g0.b.a(objArr.length, i14));
            }
            r.x(obj, valueOf);
            int i15 = i10 * 2;
            objArr[i15] = obj;
            objArr[i15 + 1] = valueOf;
            i11 = i12;
            i10 = i13;
        }
        return w1.y(i10, objArr);
    }

    @CheckForNull
    public static <V> V c(Map<?, V> map, @CheckForNull Object obj) {
        map.getClass();
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }
}
