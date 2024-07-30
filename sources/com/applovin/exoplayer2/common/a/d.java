package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.a.ab;
import com.applovin.exoplayer2.common.a.f;
import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class d<K, V> extends com.applovin.exoplayer2.common.a.f<K, V> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private transient Map<K, Collection<V>> f13736a;

    /* renamed from: b, reason: collision with root package name */
    private transient int f13737b;

    /* loaded from: classes.dex */
    public class a extends ab.e<K, Collection<V>> {

        /* renamed from: a, reason: collision with root package name */
        final transient Map<K, Collection<V>> f13740a;

        /* renamed from: com.applovin.exoplayer2.common.a.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0155a extends ab.b<K, Collection<V>> {
            public C0155a() {
            }

            @Override // com.applovin.exoplayer2.common.a.ab.b
            public Map<K, Collection<V>> a() {
                return a.this;
            }

            @Override // com.applovin.exoplayer2.common.a.ab.b, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return k.a(a.this.f13740a.entrySet(), obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new b();
            }

            @Override // com.applovin.exoplayer2.common.a.ab.b, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (contains(obj)) {
                    d.this.e(((Map.Entry) obj).getKey());
                    return true;
                }
                return false;
            }
        }

        /* loaded from: classes.dex */
        public class b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: a, reason: collision with root package name */
            final Iterator<Map.Entry<K, Collection<V>>> f13743a;

            /* renamed from: b, reason: collision with root package name */
            @NullableDecl
            Collection<V> f13744b;

            public b() {
                this.f13743a = a.this.f13740a.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry<K, Collection<V>> next = this.f13743a.next();
                this.f13744b = next.getValue();
                return a.this.a((Map.Entry) next);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f13743a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                boolean z10;
                if (this.f13744b != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                com.applovin.exoplayer2.common.a.j.a(z10);
                this.f13743a.remove();
                d.b(d.this, this.f13744b.size());
                this.f13744b.clear();
                this.f13744b = null;
            }
        }

        public a(Map<K, Collection<V>> map) {
            this.f13740a = map;
        }

        @Override // com.applovin.exoplayer2.common.a.ab.e
        public Set<Map.Entry<K, Collection<V>>> a() {
            return new C0155a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Collection<V> remove(Object obj) {
            Collection<V> remove = this.f13740a.remove(obj);
            if (remove == null) {
                return null;
            }
            Collection<V> c10 = d.this.c();
            c10.addAll(remove);
            d.b(d.this, remove.size());
            remove.clear();
            return c10;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f13740a == d.this.f13736a) {
                d.this.e();
            } else {
                y.d(new b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return ab.b(this.f13740a, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(@NullableDecl Object obj) {
            if (this != obj && !this.f13740a.equals(obj)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f13740a.hashCode();
        }

        @Override // com.applovin.exoplayer2.common.a.ab.e, java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return d.this.p();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f13740a.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f13740a.toString();
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Collection<V> get(Object obj) {
            Collection<V> collection = (Collection) ab.a((Map) this.f13740a, obj);
            if (collection == null) {
                return null;
            }
            return d.this.a((d) obj, (Collection) collection);
        }

        public Map.Entry<K, Collection<V>> a(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return ab.a(key, d.this.a((d) key, (Collection) entry.getValue()));
        }
    }

    /* loaded from: classes.dex */
    public abstract class b<T> implements Iterator<T> {

        /* renamed from: b, reason: collision with root package name */
        final Iterator<Map.Entry<K, Collection<V>>> f13746b;

        /* renamed from: c, reason: collision with root package name */
        @NullableDecl
        K f13747c = null;

        /* renamed from: d, reason: collision with root package name */
        @MonotonicNonNullDecl
        Collection<V> f13748d = null;

        /* renamed from: e, reason: collision with root package name */
        Iterator<V> f13749e = y.c();

        public b() {
            this.f13746b = d.this.f13736a.entrySet().iterator();
        }

        public abstract T a(K k10, V v3);

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (!this.f13746b.hasNext() && !this.f13749e.hasNext()) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f13749e.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f13746b.next();
                this.f13747c = next.getKey();
                Collection<V> value = next.getValue();
                this.f13748d = value;
                this.f13749e = value.iterator();
            }
            return a(this.f13747c, this.f13749e.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f13749e.remove();
            if (this.f13748d.isEmpty()) {
                this.f13746b.remove();
            }
            d.b(d.this);
        }
    }

    /* loaded from: classes.dex */
    public class c extends ab.c<K, Collection<V>> {
        public c(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // com.applovin.exoplayer2.common.a.ab.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            y.d(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return c().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(@NullableDecl Object obj) {
            if (this != obj && !c().keySet().equals(obj)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return c().keySet().hashCode();
        }

        @Override // com.applovin.exoplayer2.common.a.ab.c, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            final Iterator<Map.Entry<K, Collection<V>>> it = c().entrySet().iterator();
            return new Iterator<K>() { // from class: com.applovin.exoplayer2.common.a.d.c.1

                /* renamed from: a, reason: collision with root package name */
                @NullableDecl
                Map.Entry<K, Collection<V>> f13751a;

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return it.hasNext();
                }

                @Override // java.util.Iterator
                public K next() {
                    Map.Entry<K, Collection<V>> entry = (Map.Entry) it.next();
                    this.f13751a = entry;
                    return entry.getKey();
                }

                @Override // java.util.Iterator
                public void remove() {
                    boolean z10;
                    if (this.f13751a != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    com.applovin.exoplayer2.common.a.j.a(z10);
                    Collection<V> value = this.f13751a.getValue();
                    it.remove();
                    d.b(d.this, value.size());
                    value.clear();
                    this.f13751a = null;
                }
            };
        }

        @Override // com.applovin.exoplayer2.common.a.ab.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int i10;
            Collection<V> remove = c().remove(obj);
            if (remove != null) {
                i10 = remove.size();
                remove.clear();
                d.b(d.this, i10);
            } else {
                i10 = 0;
            }
            if (i10 <= 0) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.a.d$d, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0156d extends d<K, V>.g implements NavigableMap<K, Collection<V>> {
        public C0156d(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        public Map.Entry<K, Collection<V>> a(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it.next();
            Collection<V> c10 = d.this.c();
            c10.addAll(next.getValue());
            it.remove();
            return ab.a(next.getKey(), d.this.a(c10));
        }

        @Override // com.applovin.exoplayer2.common.a.d.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> g() {
            return (NavigableMap) super.g();
        }

        @Override // com.applovin.exoplayer2.common.a.d.g, com.applovin.exoplayer2.common.a.d.a, com.applovin.exoplayer2.common.a.ab.e, java.util.AbstractMap, java.util.Map
        /* renamed from: c, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet<K> keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> ceilingEntry(K k10) {
            Map.Entry<K, Collection<V>> ceilingEntry = g().ceilingEntry(k10);
            if (ceilingEntry == null) {
                return null;
            }
            return a((Map.Entry) ceilingEntry);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k10) {
            return g().ceilingKey(k10);
        }

        @Override // com.applovin.exoplayer2.common.a.d.g, com.applovin.exoplayer2.common.a.ab.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet<K> h() {
            return new e(g());
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> descendingMap() {
            return new C0156d(g().descendingMap());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> firstEntry = g().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return a((Map.Entry) firstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> floorEntry(K k10) {
            Map.Entry<K, Collection<V>> floorEntry = g().floorEntry(k10);
            if (floorEntry == null) {
                return null;
            }
            return a((Map.Entry) floorEntry);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k10) {
            return g().floorKey(k10);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> higherEntry(K k10) {
            Map.Entry<K, Collection<V>> higherEntry = g().higherEntry(k10);
            if (higherEntry == null) {
                return null;
            }
            return a((Map.Entry) higherEntry);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k10) {
            return g().higherKey(k10);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> lastEntry = g().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return a((Map.Entry) lastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lowerEntry(K k10) {
            Map.Entry<K, Collection<V>> lowerEntry = g().lowerEntry(k10);
            if (lowerEntry == null) {
                return null;
            }
            return a((Map.Entry) lowerEntry);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k10) {
            return g().lowerKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return f();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return a((Iterator) entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return a((Iterator) descendingMap().entrySet().iterator());
        }

        @Override // com.applovin.exoplayer2.common.a.d.g, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> headMap(K k10) {
            return headMap(k10, false);
        }

        @Override // com.applovin.exoplayer2.common.a.d.g, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> tailMap(K k10) {
            return tailMap(k10, true);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(K k10, boolean z10) {
            return new C0156d(g().headMap(k10, z10));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(K k10, boolean z10, K k11, boolean z11) {
            return new C0156d(g().subMap(k10, z10, k11, z11));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(K k10, boolean z10) {
            return new C0156d(g().tailMap(k10, z10));
        }

        @Override // com.applovin.exoplayer2.common.a.d.g, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> subMap(K k10, K k11) {
            return subMap(k10, true, k11, false);
        }
    }

    /* loaded from: classes.dex */
    public class e extends d<K, V>.h implements NavigableSet<K> {
        public e(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // com.applovin.exoplayer2.common.a.d.h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> b() {
            return (NavigableMap) super.b();
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k10) {
            return b().ceilingKey(k10);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return new e(b().descendingMap());
        }

        @Override // java.util.NavigableSet
        public K floor(K k10) {
            return b().floorKey(k10);
        }

        @Override // java.util.NavigableSet
        public K higher(K k10) {
            return b().higherKey(k10);
        }

        @Override // java.util.NavigableSet
        public K lower(K k10) {
            return b().lowerKey(k10);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) y.c(iterator());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) y.c(descendingIterator());
        }

        @Override // com.applovin.exoplayer2.common.a.d.h, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> headSet(K k10) {
            return headSet(k10, false);
        }

        @Override // com.applovin.exoplayer2.common.a.d.h, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> tailSet(K k10) {
            return tailSet(k10, true);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k10, boolean z10) {
            return new e(b().headMap(k10, z10));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k10, boolean z10, K k11, boolean z11) {
            return new e(b().subMap(k10, z10, k11, z11));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k10, boolean z10) {
            return new e(b().tailMap(k10, z10));
        }

        @Override // com.applovin.exoplayer2.common.a.d.h, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> subSet(K k10, K k11) {
            return subSet(k10, true, k11, false);
        }
    }

    /* loaded from: classes.dex */
    public class f extends d<K, V>.j implements RandomAccess {
        public f(@NullableDecl K k10, List<V> list, @NullableDecl d<K, V>.i iVar) {
            super(k10, list, iVar);
        }
    }

    /* loaded from: classes.dex */
    public class g extends d<K, V>.a implements SortedMap<K, Collection<V>> {

        /* renamed from: d, reason: collision with root package name */
        @MonotonicNonNullDecl
        SortedSet<K> f13757d;

        public g(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return g().comparator();
        }

        @Override // com.applovin.exoplayer2.common.a.ab.e
        /* renamed from: e */
        public SortedSet<K> h() {
            return new h(g());
        }

        @Override // com.applovin.exoplayer2.common.a.d.a, com.applovin.exoplayer2.common.a.ab.e, java.util.AbstractMap, java.util.Map
        /* renamed from: f */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f13757d;
            if (sortedSet == null) {
                SortedSet<K> h10 = h();
                this.f13757d = h10;
                return h10;
            }
            return sortedSet;
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return g().firstKey();
        }

        public SortedMap<K, Collection<V>> g() {
            return (SortedMap) ((a) this).f13740a;
        }

        public SortedMap<K, Collection<V>> headMap(K k10) {
            return new g(g().headMap(k10));
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return g().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k10, K k11) {
            return new g(g().subMap(k10, k11));
        }

        public SortedMap<K, Collection<V>> tailMap(K k10) {
            return new g(g().tailMap(k10));
        }
    }

    /* loaded from: classes.dex */
    public class h extends d<K, V>.c implements SortedSet<K> {
        public h(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public SortedMap<K, Collection<V>> b() {
            return (SortedMap) super.c();
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return b().comparator();
        }

        @Override // java.util.SortedSet
        public K first() {
            return b().firstKey();
        }

        public SortedSet<K> headSet(K k10) {
            return new h(b().headMap(k10));
        }

        @Override // java.util.SortedSet
        public K last() {
            return b().lastKey();
        }

        public SortedSet<K> subSet(K k10, K k11) {
            return new h(b().subMap(k10, k11));
        }

        public SortedSet<K> tailSet(K k10) {
            return new h(b().tailMap(k10));
        }
    }

    public d(Map<K, Collection<V>> map) {
        Preconditions.checkArgument(map.isEmpty());
        this.f13736a = map;
    }

    public static /* synthetic */ int a(d dVar, int i10) {
        int i11 = dVar.f13737b + i10;
        dVar.f13737b = i11;
        return i11;
    }

    public static /* synthetic */ int b(d dVar) {
        int i10 = dVar.f13737b;
        dVar.f13737b = i10 - 1;
        return i10;
    }

    public static /* synthetic */ int c(d dVar) {
        int i10 = dVar.f13737b;
        dVar.f13737b = i10 + 1;
        return i10;
    }

    abstract Collection<V> c();

    @Override // com.applovin.exoplayer2.common.a.ac
    public int d() {
        return this.f13737b;
    }

    @Override // com.applovin.exoplayer2.common.a.ac
    public void e() {
        Iterator<Collection<V>> it = this.f13736a.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.f13736a.clear();
        this.f13737b = 0;
    }

    @Override // com.applovin.exoplayer2.common.a.f
    public Set<K> f() {
        return new c(this.f13736a);
    }

    public final Set<K> g() {
        Map<K, Collection<V>> map = this.f13736a;
        if (map instanceof NavigableMap) {
            return new e((NavigableMap) this.f13736a);
        }
        if (map instanceof SortedMap) {
            return new h((SortedMap) this.f13736a);
        }
        return new c(this.f13736a);
    }

    @Override // com.applovin.exoplayer2.common.a.f, com.applovin.exoplayer2.common.a.ac
    public Collection<V> h() {
        return super.h();
    }

    @Override // com.applovin.exoplayer2.common.a.f
    public Collection<V> i() {
        return new f.c();
    }

    @Override // com.applovin.exoplayer2.common.a.f
    public Iterator<V> j() {
        return new d<K, V>.b<V>() { // from class: com.applovin.exoplayer2.common.a.d.1
            @Override // com.applovin.exoplayer2.common.a.d.b
            public V a(K k10, V v3) {
                return v3;
            }
        };
    }

    @Override // com.applovin.exoplayer2.common.a.f
    public Collection<Map.Entry<K, V>> k() {
        return super.k();
    }

    @Override // com.applovin.exoplayer2.common.a.f
    public Collection<Map.Entry<K, V>> l() {
        if (this instanceof ap) {
            return new f.b();
        }
        return new f.a();
    }

    @Override // com.applovin.exoplayer2.common.a.f
    public Iterator<Map.Entry<K, V>> m() {
        return new d<K, V>.b<Map.Entry<K, V>>() { // from class: com.applovin.exoplayer2.common.a.d.2
            @Override // com.applovin.exoplayer2.common.a.d.b
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> a(K k10, V v3) {
                return ab.a(k10, v3);
            }
        };
    }

    @Override // com.applovin.exoplayer2.common.a.f
    public Map<K, Collection<V>> n() {
        return new a(this.f13736a);
    }

    public final Map<K, Collection<V>> o() {
        Map<K, Collection<V>> map = this.f13736a;
        if (map instanceof NavigableMap) {
            return new C0156d((NavigableMap) this.f13736a);
        }
        if (map instanceof SortedMap) {
            return new g((SortedMap) this.f13736a);
        }
        return new a(this.f13736a);
    }

    /* loaded from: classes.dex */
    public class i extends AbstractCollection<V> {

        /* renamed from: b, reason: collision with root package name */
        @NullableDecl
        final K f13760b;

        /* renamed from: c, reason: collision with root package name */
        Collection<V> f13761c;

        /* renamed from: d, reason: collision with root package name */
        @NullableDecl
        final d<K, V>.i f13762d;

        /* renamed from: e, reason: collision with root package name */
        @NullableDecl
        final Collection<V> f13763e;

        public i(@NullableDecl K k10, Collection<V> collection, @NullableDecl d<K, V>.i iVar) {
            Collection<V> e10;
            this.f13760b = k10;
            this.f13761c = collection;
            this.f13762d = iVar;
            if (iVar == null) {
                e10 = null;
            } else {
                e10 = iVar.e();
            }
            this.f13763e = e10;
        }

        void a() {
            Collection<V> collection;
            d<K, V>.i iVar = this.f13762d;
            if (iVar != null) {
                iVar.a();
                if (this.f13762d.e() != this.f13763e) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.f13761c.isEmpty() && (collection = (Collection) d.this.f13736a.get(this.f13760b)) != null) {
                this.f13761c = collection;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(V v3) {
            a();
            boolean isEmpty = this.f13761c.isEmpty();
            boolean add = this.f13761c.add(v3);
            if (add) {
                d.c(d.this);
                if (isEmpty) {
                    d();
                }
            }
            return add;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f13761c.addAll(collection);
            if (addAll) {
                d.a(d.this, this.f13761c.size() - size);
                if (size == 0) {
                    d();
                }
            }
            return addAll;
        }

        void b() {
            d<K, V>.i iVar = this.f13762d;
            if (iVar != null) {
                iVar.b();
            } else if (this.f13761c.isEmpty()) {
                d.this.f13736a.remove(this.f13760b);
            }
        }

        public K c() {
            return this.f13760b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f13761c.clear();
            d.b(d.this, size);
            b();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            a();
            return this.f13761c.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            a();
            return this.f13761c.containsAll(collection);
        }

        void d() {
            d<K, V>.i iVar = this.f13762d;
            if (iVar != null) {
                iVar.d();
            } else {
                d.this.f13736a.put(this.f13760b, this.f13761c);
            }
        }

        public Collection<V> e() {
            return this.f13761c;
        }

        @Override // java.util.Collection
        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            a();
            return this.f13761c.equals(obj);
        }

        public d<K, V>.i f() {
            return this.f13762d;
        }

        @Override // java.util.Collection
        public int hashCode() {
            a();
            return this.f13761c.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            a();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            a();
            boolean remove = this.f13761c.remove(obj);
            if (remove) {
                d.b(d.this);
                b();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f13761c.removeAll(collection);
            if (removeAll) {
                d.a(d.this, this.f13761c.size() - size);
                b();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Preconditions.checkNotNull(collection);
            int size = size();
            boolean retainAll = this.f13761c.retainAll(collection);
            if (retainAll) {
                d.a(d.this, this.f13761c.size() - size);
                b();
            }
            return retainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            a();
            return this.f13761c.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            a();
            return this.f13761c.toString();
        }

        /* loaded from: classes.dex */
        public class a implements Iterator<V> {

            /* renamed from: a, reason: collision with root package name */
            final Iterator<V> f13764a;

            /* renamed from: b, reason: collision with root package name */
            final Collection<V> f13765b;

            public a() {
                Collection<V> collection = i.this.f13761c;
                this.f13765b = collection;
                this.f13764a = d.c((Collection) collection);
            }

            void a() {
                i.this.a();
                if (i.this.f13761c == this.f13765b) {
                } else {
                    throw new ConcurrentModificationException();
                }
            }

            public Iterator<V> b() {
                a();
                return this.f13764a;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                a();
                return this.f13764a.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                a();
                return this.f13764a.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f13764a.remove();
                d.b(d.this);
                i.this.b();
            }

            public a(Iterator<V> it) {
                this.f13765b = i.this.f13761c;
                this.f13764a = it;
            }
        }
    }

    /* loaded from: classes.dex */
    public class j extends d<K, V>.i implements List<V> {

        /* loaded from: classes.dex */
        public class a extends d<K, V>.i.a implements ListIterator<V> {
            public a() {
                super();
            }

            private ListIterator<V> c() {
                return (ListIterator) b();
            }

            @Override // java.util.ListIterator
            public void add(V v3) {
                boolean isEmpty = j.this.isEmpty();
                c().add(v3);
                d.c(d.this);
                if (isEmpty) {
                    j.this.d();
                }
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return c().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return c().nextIndex();
            }

            @Override // java.util.ListIterator
            public V previous() {
                return c().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return c().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(V v3) {
                c().set(v3);
            }

            public a(int i10) {
                super(j.this.g().listIterator(i10));
            }
        }

        public j(@NullableDecl K k10, List<V> list, @NullableDecl d<K, V>.i iVar) {
            super(k10, list, iVar);
        }

        @Override // java.util.List
        public void add(int i10, V v3) {
            a();
            boolean isEmpty = e().isEmpty();
            g().add(i10, v3);
            d.c(d.this);
            if (isEmpty) {
                d();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = g().addAll(i10, collection);
            if (addAll) {
                d.a(d.this, e().size() - size);
                if (size == 0) {
                    d();
                }
            }
            return addAll;
        }

        List<V> g() {
            return (List) e();
        }

        @Override // java.util.List
        public V get(int i10) {
            a();
            return g().get(i10);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            a();
            return g().indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            a();
            return g().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            a();
            return new a();
        }

        @Override // java.util.List
        public V remove(int i10) {
            a();
            V remove = g().remove(i10);
            d.b(d.this);
            b();
            return remove;
        }

        @Override // java.util.List
        public V set(int i10, V v3) {
            a();
            return g().set(i10, v3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public List<V> subList(int i10, int i11) {
            d<K, V>.i f;
            a();
            d dVar = d.this;
            Object c10 = c();
            List<V> subList = g().subList(i10, i11);
            if (f() == null) {
                f = this;
            } else {
                f = f();
            }
            return dVar.a(c10, subList, f);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i10) {
            a();
            return new a(i10);
        }
    }

    public static /* synthetic */ int b(d dVar, int i10) {
        int i11 = dVar.f13737b - i10;
        dVar.f13737b = i11;
        return i11;
    }

    public Collection<V> c(@NullableDecl K k10) {
        return c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Iterator<E> c(Collection<E> collection) {
        if (collection instanceof List) {
            return ((List) collection).listIterator();
        }
        return collection.iterator();
    }

    @Override // com.applovin.exoplayer2.common.a.f, com.applovin.exoplayer2.common.a.ac
    public boolean a(@NullableDecl K k10, @NullableDecl V v3) {
        Collection<V> collection = this.f13736a.get(k10);
        if (collection == null) {
            Collection<V> c10 = c((d<K, V>) k10);
            if (c10.add(v3)) {
                this.f13737b++;
                this.f13736a.put(k10, c10);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        }
        if (!collection.add(v3)) {
            return false;
        }
        this.f13737b++;
        return true;
    }

    @Override // com.applovin.exoplayer2.common.a.ac
    public Collection<V> b(@NullableDecl K k10) {
        Collection<V> collection = this.f13736a.get(k10);
        if (collection == null) {
            collection = c((d<K, V>) k10);
        }
        return a((d<K, V>) k10, (Collection) collection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Object obj) {
        Collection collection = (Collection) ab.c(this.f13736a, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f13737b -= size;
        }
    }

    public <E> Collection<E> a(Collection<E> collection) {
        return Collections.unmodifiableCollection(collection);
    }

    public Collection<V> a(@NullableDecl K k10, Collection<V> collection) {
        return new i(k10, collection, null);
    }

    public final List<V> a(@NullableDecl K k10, List<V> list, @NullableDecl d<K, V>.i iVar) {
        if (list instanceof RandomAccess) {
            return new f(k10, list, iVar);
        }
        return new j(k10, list, iVar);
    }
}
