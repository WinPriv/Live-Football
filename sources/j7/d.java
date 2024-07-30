package j7;

import j7.b1;
import j7.f;
import j7.m1;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* compiled from: AbstractMapBasedMultimap.java */
/* loaded from: classes2.dex */
public abstract class d<K, V> extends j7.f<K, V> implements Serializable {

    /* renamed from: w, reason: collision with root package name */
    public final transient Map<K, Collection<V>> f29904w;

    /* renamed from: x, reason: collision with root package name */
    public transient int f29905x;

    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: classes2.dex */
    public class b extends d<K, V>.AbstractC0407d<Map.Entry<K, V>> {
        public b(d dVar) {
            super();
        }

        @Override // j7.d.AbstractC0407d
        public final Object a(Object obj, Object obj2) {
            return new h0(obj, obj2);
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: classes2.dex */
    public class c extends m1.e<K, Collection<V>> {

        /* renamed from: v, reason: collision with root package name */
        public final transient Map<K, Collection<V>> f29906v;

        /* compiled from: AbstractMapBasedMultimap.java */
        /* loaded from: classes2.dex */
        public class a extends m1.a<K, Collection<V>> {
            public a() {
            }

            @Override // j7.m1.a, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(@CheckForNull Object obj) {
                Set<Map.Entry<K, Collection<V>>> entrySet = c.this.f29906v.entrySet();
                entrySet.getClass();
                try {
                    return entrySet.contains(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }

            @Override // j7.m1.a
            public final Map<K, Collection<V>> d() {
                return c.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new b();
            }

            @Override // j7.m1.a, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(@CheckForNull Object obj) {
                Collection<V> collection;
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                d dVar = d.this;
                Object key = entry.getKey();
                Map<K, Collection<V>> map = dVar.f29904w;
                map.getClass();
                try {
                    collection = map.remove(key);
                } catch (ClassCastException | NullPointerException unused) {
                    collection = null;
                }
                Collection<V> collection2 = collection;
                if (collection2 != null) {
                    int size = collection2.size();
                    collection2.clear();
                    dVar.f29905x -= size;
                    return true;
                }
                return true;
            }
        }

        /* compiled from: AbstractMapBasedMultimap.java */
        /* loaded from: classes2.dex */
        public class b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: s, reason: collision with root package name */
            public final Iterator<Map.Entry<K, Collection<V>>> f29909s;

            /* renamed from: t, reason: collision with root package name */
            @CheckForNull
            public Collection<V> f29910t;

            public b() {
                this.f29909s = c.this.f29906v.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f29909s.hasNext();
            }

            @Override // java.util.Iterator
            public final Object next() {
                Map.Entry<K, Collection<V>> next = this.f29909s.next();
                this.f29910t = next.getValue();
                return c.this.d(next);
            }

            @Override // java.util.Iterator
            public final void remove() {
                boolean z10;
                if (this.f29910t != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i7.f.f(z10, "no calls to next() since the last call to remove()");
                this.f29909s.remove();
                d.this.f29905x -= this.f29910t.size();
                this.f29910t.clear();
                this.f29910t = null;
            }
        }

        public c(Map<K, Collection<V>> map) {
            this.f29906v = map;
        }

        @Override // j7.m1.e
        public final Set<Map.Entry<K, Collection<V>>> b() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            d dVar = d.this;
            if (this.f29906v == dVar.f29904w) {
                dVar.clear();
            } else {
                b1.a(new b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(@CheckForNull Object obj) {
            Map<K, Collection<V>> map = this.f29906v;
            map.getClass();
            try {
                return map.containsKey(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final h0 d(Map.Entry entry) {
            Object key = entry.getKey();
            return new h0(key, d.this.L(key, (Collection) entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean equals(@CheckForNull Object obj) {
            if (this != obj && !this.f29906v.equals(obj)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public final Object get(@CheckForNull Object obj) {
            Collection<V> collection = (Collection) m1.c(this.f29906v, obj);
            if (collection == null) {
                return null;
            }
            return d.this.L(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int hashCode() {
            return this.f29906v.hashCode();
        }

        @Override // j7.m1.e, java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return d.this.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public final Object remove(@CheckForNull Object obj) {
            Collection<V> remove = this.f29906v.remove(obj);
            if (remove == null) {
                return null;
            }
            d dVar = d.this;
            Collection<V> x10 = dVar.x();
            x10.addAll(remove);
            dVar.f29905x -= remove.size();
            remove.clear();
            return x10;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return this.f29906v.size();
        }

        @Override // java.util.AbstractMap
        public final String toString() {
            return this.f29906v.toString();
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* renamed from: j7.d$d, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public abstract class AbstractC0407d<T> implements Iterator<T> {

        /* renamed from: s, reason: collision with root package name */
        public final Iterator<Map.Entry<K, Collection<V>>> f29912s;

        /* renamed from: t, reason: collision with root package name */
        @CheckForNull
        public K f29913t = null;

        /* renamed from: u, reason: collision with root package name */
        @CheckForNull
        public Collection<V> f29914u = null;

        /* renamed from: v, reason: collision with root package name */
        public Iterator<V> f29915v = b1.b.f29882s;

        public AbstractC0407d() {
            this.f29912s = d.this.f29904w.entrySet().iterator();
        }

        public abstract T a(K k10, V v3);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (!this.f29912s.hasNext() && !this.f29915v.hasNext()) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!this.f29915v.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f29912s.next();
                this.f29913t = next.getKey();
                Collection<V> value = next.getValue();
                this.f29914u = value;
                this.f29915v = value.iterator();
            }
            return a(this.f29913t, this.f29915v.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f29915v.remove();
            Collection<V> collection = this.f29914u;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f29912s.remove();
            }
            d dVar = d.this;
            dVar.f29905x--;
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: classes2.dex */
    public class e extends m1.c<K, Collection<V>> {

        /* compiled from: AbstractMapBasedMultimap.java */
        /* loaded from: classes2.dex */
        public class a implements Iterator<K> {

            /* renamed from: s, reason: collision with root package name */
            @CheckForNull
            public Map.Entry<K, Collection<V>> f29918s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ Iterator f29919t;

            public a(Iterator it) {
                this.f29919t = it;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f29919t.hasNext();
            }

            @Override // java.util.Iterator
            public final K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f29919t.next();
                this.f29918s = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public final void remove() {
                boolean z10;
                if (this.f29918s != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i7.f.f(z10, "no calls to next() since the last call to remove()");
                Collection<V> value = this.f29918s.getValue();
                this.f29919t.remove();
                d.this.f29905x -= value.size();
                value.clear();
                this.f29918s = null;
            }
        }

        public e(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // j7.m1.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            b1.a(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean containsAll(Collection<?> collection) {
            return this.f30043s.keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final boolean equals(@CheckForNull Object obj) {
            if (this != obj && !this.f30043s.keySet().equals(obj)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final int hashCode() {
            return this.f30043s.keySet().hashCode();
        }

        @Override // j7.m1.c, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new a(this.f30043s.entrySet().iterator());
        }

        @Override // j7.m1.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(@CheckForNull Object obj) {
            int i10;
            Collection collection = (Collection) this.f30043s.remove(obj);
            if (collection != null) {
                i10 = collection.size();
                collection.clear();
                d.this.f29905x -= i10;
            } else {
                i10 = 0;
            }
            if (i10 <= 0) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: classes2.dex */
    public class f extends d<K, V>.i implements NavigableMap<K, Collection<V>> {
        public f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // j7.d.i, j7.m1.e
        public final Set c() {
            return new g(g());
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final Map.Entry<K, Collection<V>> ceilingEntry(K k10) {
            Map.Entry<K, Collection<V>> ceilingEntry = g().ceilingEntry(k10);
            if (ceilingEntry == null) {
                return null;
            }
            return d(ceilingEntry);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final K ceilingKey(K k10) {
            return g().ceilingKey(k10);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> descendingKeySet() {
            return ((f) descendingMap()).navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> descendingMap() {
            return new f(g().descendingMap());
        }

        @Override // j7.d.i
        /* renamed from: e */
        public final SortedSet c() {
            return new g(g());
        }

        @Override // j7.d.i
        /* renamed from: f */
        public final SortedSet keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> firstEntry = g().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return d(firstEntry);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final Map.Entry<K, Collection<V>> floorEntry(K k10) {
            Map.Entry<K, Collection<V>> floorEntry = g().floorEntry(k10);
            if (floorEntry == null) {
                return null;
            }
            return d(floorEntry);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final K floorKey(K k10) {
            return g().floorKey(k10);
        }

        @CheckForNull
        public final h0 h(Iterator it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) it.next();
            d dVar = d.this;
            Collection<V> x10 = dVar.x();
            x10.addAll((Collection) entry.getValue());
            it.remove();
            return new h0(entry.getKey(), dVar.H(x10));
        }

        @Override // j7.d.i, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final Map.Entry<K, Collection<V>> higherEntry(K k10) {
            Map.Entry<K, Collection<V>> higherEntry = g().higherEntry(k10);
            if (higherEntry == null) {
                return null;
            }
            return d(higherEntry);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final K higherKey(K k10) {
            return g().higherKey(k10);
        }

        @Override // j7.d.i
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final NavigableMap<K, Collection<V>> g() {
            return (NavigableMap) ((SortedMap) this.f29906v);
        }

        @Override // j7.d.i, j7.d.c, j7.m1.e, java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> lastEntry = g().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return d(lastEntry);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final Map.Entry<K, Collection<V>> lowerEntry(K k10) {
            Map.Entry<K, Collection<V>> lowerEntry = g().lowerEntry(k10);
            if (lowerEntry == null) {
                return null;
            }
            return d(lowerEntry);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final K lowerKey(K k10) {
            return g().lowerKey(k10);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> navigableKeySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final Map.Entry<K, Collection<V>> pollFirstEntry() {
            return h(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final Map.Entry<K, Collection<V>> pollLastEntry() {
            return h(((m1.e) descendingMap()).entrySet().iterator());
        }

        @Override // j7.d.i, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // j7.d.i, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> headMap(K k10, boolean z10) {
            return new f(g().headMap(k10, z10));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> subMap(K k10, boolean z10, K k11, boolean z11) {
            return new f(g().subMap(k10, z10, k11, z11));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> tailMap(K k10, boolean z10) {
            return new f(g().tailMap(k10, z10));
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: classes2.dex */
    public class g extends d<K, V>.j implements NavigableSet<K> {
        public g(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final K ceiling(K k10) {
            return d().ceilingKey(k10);
        }

        @Override // java.util.NavigableSet
        public final Iterator<K> descendingIterator() {
            return ((e) descendingSet()).iterator();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> descendingSet() {
            return new g(d().descendingMap());
        }

        @Override // j7.d.j
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final NavigableMap<K, Collection<V>> d() {
            return (NavigableMap) ((SortedMap) this.f30043s);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final K floor(K k10) {
            return d().floorKey(k10);
        }

        @Override // j7.d.j, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final K higher(K k10) {
            return d().higherKey(k10);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final K lower(K k10) {
            return d().lowerKey(k10);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final K pollFirst() {
            return (K) b1.d(iterator());
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final K pollLast() {
            return (K) b1.d(descendingIterator());
        }

        @Override // j7.d.j, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // j7.d.j, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> headSet(K k10, boolean z10) {
            return new g(d().headMap(k10, z10));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> subSet(K k10, boolean z10, K k11, boolean z11) {
            return new g(d().subMap(k10, z10, k11, z11));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> tailSet(K k10, boolean z10) {
            return new g(d().tailMap(k10, z10));
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: classes2.dex */
    public class h extends d<K, V>.l implements RandomAccess {
        public h(d dVar, K k10, @CheckForNull List<V> list, d<K, V>.k kVar) {
            super(k10, list, kVar);
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: classes2.dex */
    public class i extends d<K, V>.c implements SortedMap<K, Collection<V>> {

        /* renamed from: x, reason: collision with root package name */
        @CheckForNull
        public SortedSet<K> f29923x;

        public i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        @CheckForNull
        public final Comparator<? super K> comparator() {
            return g().comparator();
        }

        @Override // j7.m1.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public SortedSet<K> c() {
            return new j(g());
        }

        @Override // j7.d.c, j7.m1.e, java.util.AbstractMap, java.util.Map
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f29923x;
            if (sortedSet == null) {
                SortedSet<K> c10 = c();
                this.f29923x = c10;
                return c10;
            }
            return sortedSet;
        }

        @Override // java.util.SortedMap
        public final K firstKey() {
            return g().firstKey();
        }

        public SortedMap<K, Collection<V>> g() {
            return (SortedMap) this.f29906v;
        }

        public SortedMap<K, Collection<V>> headMap(K k10) {
            return new i(g().headMap(k10));
        }

        @Override // java.util.SortedMap
        public final K lastKey() {
            return g().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k10, K k11) {
            return new i(g().subMap(k10, k11));
        }

        public SortedMap<K, Collection<V>> tailMap(K k10) {
            return new i(g().tailMap(k10));
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: classes2.dex */
    public class j extends d<K, V>.e implements SortedSet<K> {
        public j(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedSet
        @CheckForNull
        public final Comparator<? super K> comparator() {
            return d().comparator();
        }

        public SortedMap<K, Collection<V>> d() {
            return (SortedMap) this.f30043s;
        }

        @Override // java.util.SortedSet
        public final K first() {
            return d().firstKey();
        }

        public SortedSet<K> headSet(K k10) {
            return new j(d().headMap(k10));
        }

        @Override // java.util.SortedSet
        public final K last() {
            return d().lastKey();
        }

        public SortedSet<K> subSet(K k10, K k11) {
            return new j(d().subMap(k10, k11));
        }

        public SortedSet<K> tailSet(K k10) {
            return new j(d().tailMap(k10));
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: classes2.dex */
    public class m extends d<K, V>.o implements NavigableSet<V> {
        public m(K k10, NavigableSet<V> navigableSet, @CheckForNull d<K, V>.k kVar) {
            super(k10, navigableSet, kVar);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final V ceiling(V v3) {
            return g().ceiling(v3);
        }

        @Override // java.util.NavigableSet
        public final Iterator<V> descendingIterator() {
            return new k.a(g().descendingIterator());
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<V> descendingSet() {
            return i(g().descendingSet());
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final V floor(V v3) {
            return g().floor(v3);
        }

        @Override // j7.d.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final NavigableSet<V> g() {
            return (NavigableSet) ((SortedSet) this.f29926t);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<V> headSet(V v3, boolean z10) {
            return i(g().headSet(v3, z10));
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final V higher(V v3) {
            return g().higher(v3);
        }

        public final m i(NavigableSet navigableSet) {
            d<K, V>.k kVar = this.f29927u;
            if (kVar == null) {
                kVar = this;
            }
            return new m(this.f29925s, navigableSet, kVar);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final V lower(V v3) {
            return g().lower(v3);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final V pollFirst() {
            return (V) b1.d(iterator());
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final V pollLast() {
            return (V) b1.d(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<V> subSet(V v3, boolean z10, V v10, boolean z11) {
            return i(g().subSet(v3, z10, v10, z11));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<V> tailSet(V v3, boolean z10) {
            return i(g().tailSet(v3, z10));
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: classes2.dex */
    public class n extends d<K, V>.k implements Set<V> {
        public n(K k10, Set<V> set) {
            super(k10, set, null);
        }

        @Override // j7.d.k, java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean e10 = f2.e((Set) this.f29926t, collection);
            if (e10) {
                d.this.f29905x += this.f29926t.size() - size;
                f();
            }
            return e10;
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: classes2.dex */
    public class o extends d<K, V>.k implements SortedSet<V> {
        public o(K k10, SortedSet<V> sortedSet, @CheckForNull d<K, V>.k kVar) {
            super(k10, sortedSet, kVar);
        }

        @Override // java.util.SortedSet
        @CheckForNull
        public final Comparator<? super V> comparator() {
            return g().comparator();
        }

        @Override // java.util.SortedSet
        public final V first() {
            e();
            return g().first();
        }

        public SortedSet<V> g() {
            return (SortedSet) this.f29926t;
        }

        @Override // java.util.SortedSet
        public final SortedSet<V> headSet(V v3) {
            e();
            SortedSet<V> headSet = g().headSet(v3);
            d<K, V>.k kVar = this.f29927u;
            if (kVar == null) {
                kVar = this;
            }
            return new o(this.f29925s, headSet, kVar);
        }

        @Override // java.util.SortedSet
        public final V last() {
            e();
            return g().last();
        }

        @Override // java.util.SortedSet
        public final SortedSet<V> subSet(V v3, V v10) {
            e();
            SortedSet<V> subSet = g().subSet(v3, v10);
            d<K, V>.k kVar = this.f29927u;
            if (kVar == null) {
                kVar = this;
            }
            return new o(this.f29925s, subSet, kVar);
        }

        @Override // java.util.SortedSet
        public final SortedSet<V> tailSet(V v3) {
            e();
            SortedSet<V> tailSet = g().tailSet(v3);
            d<K, V>.k kVar = this.f29927u;
            if (kVar == null) {
                kVar = this;
            }
            return new o(this.f29925s, tailSet, kVar);
        }
    }

    public d(Map<K, Collection<V>> map) {
        if (map.isEmpty()) {
            this.f29904w = map;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final Collection<Map.Entry<K, V>> A() {
        if (this instanceof c2) {
            return new f.b(this);
        }
        return new f.a();
    }

    public final c C() {
        Map<K, Collection<V>> map = this.f29904w;
        if (map instanceof NavigableMap) {
            return new f((NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new i((SortedMap) map);
        }
        return new c(map);
    }

    public final e E() {
        Map<K, Collection<V>> map = this.f29904w;
        if (map instanceof NavigableMap) {
            return new g((NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new j((SortedMap) map);
        }
        return new e(map);
    }

    public abstract Collection<V> F();

    public final Collection<V> G() {
        return new f.c();
    }

    public abstract <E> Collection<E> H(Collection<E> collection);

    public Collection<V> K() {
        Collection<V> collection = this.f29945u;
        if (collection == null) {
            Collection<V> G = G();
            this.f29945u = G;
            return G;
        }
        return collection;
    }

    public abstract Collection<V> L(K k10, Collection<V> collection);

    @Override // j7.n1
    public void clear() {
        Map<K, Collection<V>> map = this.f29904w;
        Iterator<Collection<V>> it = map.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        map.clear();
        this.f29905x = 0;
    }

    @Override // j7.n1
    public final boolean containsKey(@CheckForNull Object obj) {
        return this.f29904w.containsKey(obj);
    }

    @Override // j7.f, j7.n1
    public Collection<Map.Entry<K, V>> k() {
        Collection<Map.Entry<K, V>> collection = this.f29943s;
        if (collection == null) {
            Collection<Map.Entry<K, V>> A = A();
            this.f29943s = A;
            return A;
        }
        return collection;
    }

    @Override // j7.n1
    public Collection<V> l(@CheckForNull Object obj) {
        Collection<V> remove = this.f29904w.remove(obj);
        if (remove == null) {
            return F();
        }
        Collection x10 = x();
        x10.addAll(remove);
        this.f29905x -= remove.size();
        remove.clear();
        return (Collection<V>) H(x10);
    }

    @Override // j7.n1
    public boolean put(K k10, V v3) {
        Map<K, Collection<V>> map = this.f29904w;
        Collection<V> collection = map.get(k10);
        if (collection == null) {
            Collection<V> y = y(k10);
            if (y.add(v3)) {
                this.f29905x++;
                map.put(k10, y);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        }
        if (collection.add(v3)) {
            this.f29905x++;
            return true;
        }
        return false;
    }

    @Override // j7.f
    public Map<K, Collection<V>> q() {
        return new c(this.f29904w);
    }

    @Override // j7.f
    public Set<K> r() {
        return new e(this.f29904w);
    }

    @Override // j7.n1
    public final int size() {
        return this.f29905x;
    }

    @Override // j7.f
    public Iterator<Map.Entry<K, V>> u() {
        return new b(this);
    }

    @Override // j7.f
    public Iterator<V> v() {
        return new a(this);
    }

    public abstract Collection<V> x();

    public Collection<V> y(K k10) {
        return x();
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: classes2.dex */
    public class l extends d<K, V>.k implements List<V> {

        /* compiled from: AbstractMapBasedMultimap.java */
        /* loaded from: classes2.dex */
        public class a extends d<K, V>.k.a implements ListIterator<V> {
            public a() {
                super();
            }

            @Override // java.util.ListIterator
            public final void add(V v3) {
                l lVar = l.this;
                boolean isEmpty = lVar.isEmpty();
                b().add(v3);
                d.this.f29905x++;
                if (isEmpty) {
                    lVar.d();
                }
            }

            public final ListIterator<V> b() {
                a();
                return (ListIterator) this.f29930s;
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return b().hasPrevious();
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return b().nextIndex();
            }

            @Override // java.util.ListIterator
            public final V previous() {
                return b().previous();
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return b().previousIndex();
            }

            @Override // java.util.ListIterator
            public final void set(V v3) {
                b().set(v3);
            }

            public a(int i10) {
                super(((List) l.this.f29926t).listIterator(i10));
            }
        }

        public l(K k10, List<V> list, @CheckForNull d<K, V>.k kVar) {
            super(k10, list, kVar);
        }

        @Override // java.util.List
        public final void add(int i10, V v3) {
            e();
            boolean isEmpty = this.f29926t.isEmpty();
            ((List) this.f29926t).add(i10, v3);
            d.this.f29905x++;
            if (isEmpty) {
                d();
            }
        }

        @Override // java.util.List
        public final boolean addAll(int i10, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = ((List) this.f29926t).addAll(i10, collection);
            if (addAll) {
                d.this.f29905x += this.f29926t.size() - size;
                if (size == 0) {
                    d();
                }
            }
            return addAll;
        }

        @Override // java.util.List
        public final V get(int i10) {
            e();
            return (V) ((List) this.f29926t).get(i10);
        }

        @Override // java.util.List
        public final int indexOf(@CheckForNull Object obj) {
            e();
            return ((List) this.f29926t).indexOf(obj);
        }

        @Override // java.util.List
        public final int lastIndexOf(@CheckForNull Object obj) {
            e();
            return ((List) this.f29926t).lastIndexOf(obj);
        }

        @Override // java.util.List
        public final ListIterator<V> listIterator() {
            e();
            return new a();
        }

        @Override // java.util.List
        public final V remove(int i10) {
            e();
            V v3 = (V) ((List) this.f29926t).remove(i10);
            d dVar = d.this;
            dVar.f29905x--;
            f();
            return v3;
        }

        @Override // java.util.List
        public final V set(int i10, V v3) {
            e();
            return (V) ((List) this.f29926t).set(i10, v3);
        }

        @Override // java.util.List
        public final List<V> subList(int i10, int i11) {
            e();
            List subList = ((List) this.f29926t).subList(i10, i11);
            d<K, V>.k kVar = this.f29927u;
            if (kVar == null) {
                kVar = this;
            }
            d dVar = d.this;
            dVar.getClass();
            boolean z10 = subList instanceof RandomAccess;
            K k10 = this.f29925s;
            if (z10) {
                return new h(dVar, k10, subList, kVar);
            }
            return new l(k10, subList, kVar);
        }

        @Override // java.util.List
        public final ListIterator<V> listIterator(int i10) {
            e();
            return new a(i10);
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: classes2.dex */
    public class k extends AbstractCollection<V> {

        /* renamed from: s, reason: collision with root package name */
        public final K f29925s;

        /* renamed from: t, reason: collision with root package name */
        public Collection<V> f29926t;

        /* renamed from: u, reason: collision with root package name */
        @CheckForNull
        public final d<K, V>.k f29927u;

        /* renamed from: v, reason: collision with root package name */
        @CheckForNull
        public final Collection<V> f29928v;

        public k(K k10, Collection<V> collection, @CheckForNull d<K, V>.k kVar) {
            Collection<V> collection2;
            this.f29925s = k10;
            this.f29926t = collection;
            this.f29927u = kVar;
            if (kVar == null) {
                collection2 = null;
            } else {
                collection2 = kVar.f29926t;
            }
            this.f29928v = collection2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean add(V v3) {
            e();
            boolean isEmpty = this.f29926t.isEmpty();
            boolean add = this.f29926t.add(v3);
            if (add) {
                d.this.f29905x++;
                if (isEmpty) {
                    d();
                }
            }
            return add;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f29926t.addAll(collection);
            if (addAll) {
                d.this.f29905x += this.f29926t.size() - size;
                if (size == 0) {
                    d();
                }
            }
            return addAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f29926t.clear();
            d.this.f29905x -= size;
            f();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@CheckForNull Object obj) {
            e();
            return this.f29926t.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            e();
            return this.f29926t.containsAll(collection);
        }

        public final void d() {
            d<K, V>.k kVar = this.f29927u;
            if (kVar != null) {
                kVar.d();
            } else {
                d.this.f29904w.put(this.f29925s, this.f29926t);
            }
        }

        public final void e() {
            Collection<V> collection;
            d<K, V>.k kVar = this.f29927u;
            if (kVar != null) {
                kVar.e();
                if (kVar.f29926t != this.f29928v) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.f29926t.isEmpty() && (collection = d.this.f29904w.get(this.f29925s)) != null) {
                this.f29926t = collection;
            }
        }

        @Override // java.util.Collection
        public final boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            e();
            return this.f29926t.equals(obj);
        }

        public final void f() {
            d<K, V>.k kVar = this.f29927u;
            if (kVar != null) {
                kVar.f();
            } else if (this.f29926t.isEmpty()) {
                d.this.f29904w.remove(this.f29925s);
            }
        }

        @Override // java.util.Collection
        public final int hashCode() {
            e();
            return this.f29926t.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            e();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(@CheckForNull Object obj) {
            e();
            boolean remove = this.f29926t.remove(obj);
            if (remove) {
                d dVar = d.this;
                dVar.f29905x--;
                f();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f29926t.removeAll(collection);
            if (removeAll) {
                d.this.f29905x += this.f29926t.size() - size;
                f();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            collection.getClass();
            int size = size();
            boolean retainAll = this.f29926t.retainAll(collection);
            if (retainAll) {
                d.this.f29905x += this.f29926t.size() - size;
                f();
            }
            return retainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            e();
            return this.f29926t.size();
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            e();
            return this.f29926t.toString();
        }

        /* compiled from: AbstractMapBasedMultimap.java */
        /* loaded from: classes2.dex */
        public class a implements Iterator<V> {

            /* renamed from: s, reason: collision with root package name */
            public final Iterator<V> f29930s;

            /* renamed from: t, reason: collision with root package name */
            public final Collection<V> f29931t;

            public a() {
                Iterator<V> it;
                Collection<V> collection = k.this.f29926t;
                this.f29931t = collection;
                if (collection instanceof List) {
                    it = ((List) collection).listIterator();
                } else {
                    it = collection.iterator();
                }
                this.f29930s = it;
            }

            public final void a() {
                k kVar = k.this;
                kVar.e();
                if (kVar.f29926t == this.f29931t) {
                } else {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                a();
                return this.f29930s.hasNext();
            }

            @Override // java.util.Iterator
            public final V next() {
                a();
                return this.f29930s.next();
            }

            @Override // java.util.Iterator
            public final void remove() {
                this.f29930s.remove();
                k kVar = k.this;
                d dVar = d.this;
                dVar.f29905x--;
                kVar.f();
            }

            public a(Iterator<V> it) {
                this.f29931t = k.this.f29926t;
                this.f29930s = it;
            }
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: classes2.dex */
    public class a extends d<K, V>.AbstractC0407d<V> {
        public a(d dVar) {
            super();
        }

        @Override // j7.d.AbstractC0407d
        public final V a(K k10, V v3) {
            return v3;
        }
    }
}
