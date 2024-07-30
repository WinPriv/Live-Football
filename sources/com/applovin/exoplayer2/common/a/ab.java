package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.a.aq;
import com.applovin.exoplayer2.common.base.Function;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.common.base.Preconditions;
import com.google.j2objc.annotations.Weak;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public final class ab {

    /* loaded from: classes.dex */
    public enum a implements Function<Map.Entry<?, ?>, Object> {
        KEY { // from class: com.applovin.exoplayer2.common.a.ab.a.1
            @Override // com.applovin.exoplayer2.common.base.Function
            @NullableDecl
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        },
        VALUE { // from class: com.applovin.exoplayer2.common.a.ab.a.2
            @Override // com.applovin.exoplayer2.common.base.Function
            @NullableDecl
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b<K, V> extends aq.a<Map.Entry<K, V>> {
        public abstract Map<K, V> a();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object a10 = ab.a((Map<?, Object>) a(), key);
            if (!Objects.equal(a10, entry.getValue())) {
                return false;
            }
            if (a10 == null && !a().containsKey(key)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (contains(obj)) {
                return a().keySet().remove(((Map.Entry) obj).getKey());
            }
            return false;
        }

        @Override // com.applovin.exoplayer2.common.a.aq.a, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                return aq.a((Set<?>) this, collection.iterator());
            }
        }

        @Override // com.applovin.exoplayer2.common.a.aq.a, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet a10 = aq.a(collection.size());
                for (Object obj : collection) {
                    if (contains(obj)) {
                        a10.add(((Map.Entry) obj).getKey());
                    }
                }
                return a().keySet().retainAll(a10);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a().size();
        }
    }

    /* loaded from: classes.dex */
    public static class c<K, V> extends aq.a<K> {

        /* renamed from: d, reason: collision with root package name */
        @Weak
        final Map<K, V> f13680d;

        public c(Map<K, V> map) {
            this.f13680d = (Map) Preconditions.checkNotNull(map);
        }

        public Map<K, V> c() {
            return this.f13680d;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            c().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return c().containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return c().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return ab.a(c().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (contains(obj)) {
                c().remove(obj);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return c().size();
        }
    }

    /* loaded from: classes.dex */
    public static class d<K, V> extends AbstractCollection<V> {

        /* renamed from: a, reason: collision with root package name */
        @Weak
        final Map<K, V> f13681a;

        public d(Map<K, V> map) {
            this.f13681a = (Map) Preconditions.checkNotNull(map);
        }

        public final Map<K, V> a() {
            return this.f13681a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@NullableDecl Object obj) {
            return a().containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return ab.b(a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : a().entrySet()) {
                    if (Objects.equal(obj, entry.getValue())) {
                        a().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet a10 = aq.a();
                for (Map.Entry<K, V> entry : a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        a10.add(entry.getKey());
                    }
                }
                return a().keySet().removeAll(a10);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet a10 = aq.a();
                for (Map.Entry<K, V> entry : a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        a10.add(entry.getKey());
                    }
                }
                return a().keySet().retainAll(a10);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return a().size();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e<K, V> extends AbstractMap<K, V> {

        /* renamed from: a, reason: collision with root package name */
        @MonotonicNonNullDecl
        private transient Set<Map.Entry<K, V>> f13682a;

        /* renamed from: b, reason: collision with root package name */
        @MonotonicNonNullDecl
        private transient Set<K> f13683b;

        /* renamed from: c, reason: collision with root package name */
        @MonotonicNonNullDecl
        private transient Collection<V> f13684c;

        abstract Set<Map.Entry<K, V>> a();

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f13682a;
            if (set == null) {
                Set<Map.Entry<K, V>> a10 = a();
                this.f13682a = a10;
                return a10;
            }
            return set;
        }

        public Set<K> h() {
            return new c(this);
        }

        public Collection<V> i() {
            return new d(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            Set<K> set = this.f13683b;
            if (set == null) {
                Set<K> h10 = h();
                this.f13683b = h10;
                return h10;
            }
            return set;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> values() {
            Collection<V> collection = this.f13684c;
            if (collection == null) {
                Collection<V> i10 = i();
                this.f13684c = i10;
                return i10;
            }
            return collection;
        }
    }

    public static <K> Function<Map.Entry<K, ?>, K> a() {
        return a.KEY;
    }

    public static <V> Function<Map.Entry<?, V>, V> b() {
        return a.VALUE;
    }

    public static <K, V> IdentityHashMap<K, V> c() {
        return new IdentityHashMap<>();
    }

    public static boolean d(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static <K, V> Iterator<K> a(Iterator<Map.Entry<K, V>> it) {
        return new aw<Map.Entry<K, V>, K>(it) { // from class: com.applovin.exoplayer2.common.a.ab.1
            @Override // com.applovin.exoplayer2.common.a.aw
            public K a(Map.Entry<K, V> entry) {
                return entry.getKey();
            }
        };
    }

    public static <K, V> Iterator<V> b(Iterator<Map.Entry<K, V>> it) {
        return new aw<Map.Entry<K, V>, V>(it) { // from class: com.applovin.exoplayer2.common.a.ab.2
            @Override // com.applovin.exoplayer2.common.a.aw
            public V a(Map.Entry<K, V> entry) {
                return entry.getValue();
            }
        };
    }

    public static <V> V c(Map<?, V> map, Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static int a(int i10) {
        if (i10 < 3) {
            j.a(i10, "expectedSize");
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static boolean b(Map<?, ?> map, Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static <K, V> Map.Entry<K, V> a(@NullableDecl K k10, @NullableDecl V v3) {
        return new r(k10, v3);
    }

    public static <V> V a(Map<?, V> map, @NullableDecl Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static String a(Map<?, ?> map) {
        StringBuilder a10 = k.a(map.size());
        a10.append('{');
        boolean z10 = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z10) {
                a10.append(", ");
            }
            a10.append(entry.getKey());
            a10.append('=');
            a10.append(entry.getValue());
            z10 = false;
        }
        a10.append('}');
        return a10.toString();
    }
}
