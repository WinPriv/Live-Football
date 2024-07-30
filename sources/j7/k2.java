package j7;

import j7.b1;
import j7.f2;
import j7.m1;
import j7.n2;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: StandardTable.java */
/* loaded from: classes2.dex */
public class k2<R, C, V> extends i<R, C, V> implements Serializable {

    /* renamed from: u, reason: collision with root package name */
    public final Map<R, Map<C, V>> f30016u;

    /* renamed from: v, reason: collision with root package name */
    public final i7.m<? extends Map<C, V>> f30017v;

    /* renamed from: w, reason: collision with root package name */
    @CheckForNull
    public transient c f30018w;

    /* compiled from: StandardTable.java */
    /* loaded from: classes2.dex */
    public class a implements Iterator<n2.a<R, C, V>> {

        /* renamed from: s, reason: collision with root package name */
        public final Iterator<Map.Entry<R, Map<C, V>>> f30019s;

        /* renamed from: t, reason: collision with root package name */
        @CheckForNull
        public Map.Entry<R, Map<C, V>> f30020t;

        /* renamed from: u, reason: collision with root package name */
        public Iterator<Map.Entry<C, V>> f30021u = b1.b.f29882s;

        public a(k2 k2Var) {
            this.f30019s = k2Var.f30016u.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (!this.f30019s.hasNext() && !this.f30021u.hasNext()) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!this.f30021u.hasNext()) {
                Map.Entry<R, Map<C, V>> next = this.f30019s.next();
                this.f30020t = next;
                this.f30021u = next.getValue().entrySet().iterator();
            }
            Objects.requireNonNull(this.f30020t);
            Map.Entry<C, V> next2 = this.f30021u.next();
            return new p2(this.f30020t.getKey(), next2.getKey(), next2.getValue());
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f30021u.remove();
            Map.Entry<R, Map<C, V>> entry = this.f30020t;
            Objects.requireNonNull(entry);
            if (entry.getValue().isEmpty()) {
                this.f30019s.remove();
                this.f30020t = null;
            }
        }
    }

    /* compiled from: StandardTable.java */
    /* loaded from: classes2.dex */
    public class b extends m1.b<C, V> {

        /* renamed from: s, reason: collision with root package name */
        public final R f30022s;

        /* renamed from: t, reason: collision with root package name */
        @CheckForNull
        public Map<C, V> f30023t;

        public b(R r10) {
            r10.getClass();
            this.f30022s = r10;
        }

        public final void b() {
            c();
            Map<C, V> map = this.f30023t;
            if (map != null && map.isEmpty()) {
                k2.this.f30016u.remove(this.f30022s);
                this.f30023t = null;
            }
        }

        public final void c() {
            Map<C, V> map = this.f30023t;
            R r10 = this.f30022s;
            k2 k2Var = k2.this;
            if (map == null || (map.isEmpty() && k2Var.f30016u.containsKey(r10))) {
                this.f30023t = k2Var.f30016u.get(r10);
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            c();
            Map<C, V> map = this.f30023t;
            if (map != null) {
                map.clear();
            }
            b();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(@CheckForNull Object obj) {
            Map<C, V> map;
            boolean z10;
            c();
            if (obj == null || (map = this.f30023t) == null) {
                return false;
            }
            try {
                z10 = map.containsKey(obj);
            } catch (ClassCastException | NullPointerException unused) {
                z10 = false;
            }
            if (!z10) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public final V get(@CheckForNull Object obj) {
            Map<C, V> map;
            c();
            if (obj != null && (map = this.f30023t) != null) {
                return (V) m1.c(map, obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public final V put(C c10, V v3) {
            c10.getClass();
            v3.getClass();
            Map<C, V> map = this.f30023t;
            if (map != null && !map.isEmpty()) {
                return this.f30023t.put(c10, v3);
            }
            return (V) k2.this.w(this.f30022s, c10, v3);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public final V remove(@CheckForNull Object obj) {
            c();
            Map<C, V> map = this.f30023t;
            V v3 = null;
            if (map == null) {
                return null;
            }
            try {
                v3 = map.remove(obj);
            } catch (ClassCastException | NullPointerException unused) {
            }
            b();
            return v3;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            c();
            Map<C, V> map = this.f30023t;
            if (map == null) {
                return 0;
            }
            return map.size();
        }
    }

    /* compiled from: StandardTable.java */
    /* loaded from: classes2.dex */
    public class c extends m1.e<R, Map<C, V>> {

        /* compiled from: StandardTable.java */
        /* loaded from: classes2.dex */
        public class a extends k2<R, C, V>.d<Map.Entry<R, Map<C, V>>> {

            /* compiled from: StandardTable.java */
            /* renamed from: j7.k2$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public class C0408a implements i7.d<R, Map<C, V>> {
                public C0408a() {
                }

                @Override // i7.d
                public final Object apply(Object obj) {
                    k2 k2Var = k2.this;
                    k2Var.getClass();
                    return new b(obj);
                }
            }

            public a() {
                super();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(@CheckForNull Object obj) {
                boolean z10;
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getKey() == null || !(entry.getValue() instanceof Map)) {
                    return false;
                }
                Set<Map.Entry<R, Map<C, V>>> entrySet = k2.this.f30016u.entrySet();
                entrySet.getClass();
                try {
                    z10 = entrySet.contains(entry);
                } catch (ClassCastException | NullPointerException unused) {
                    z10 = false;
                }
                if (!z10) {
                    return false;
                }
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<Map.Entry<R, Map<C, V>>> iterator() {
                Set<R> keySet = k2.this.f30016u.keySet();
                return new l1(keySet.iterator(), new C0408a());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(@CheckForNull Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getKey() == null || !(entry.getValue() instanceof Map) || !k2.this.f30016u.entrySet().remove(entry)) {
                    return false;
                }
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                return k2.this.f30016u.size();
            }
        }

        public c() {
        }

        @Override // j7.m1.e
        public final Set<Map.Entry<R, Map<C, V>>> b() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(@CheckForNull Object obj) {
            boolean z10;
            k2 k2Var = k2.this;
            if (obj != null) {
                Map<R, Map<C, V>> map = k2Var.f30016u;
                map.getClass();
                try {
                    z10 = map.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    z10 = false;
                }
                if (!z10) {
                    return false;
                }
                return true;
            }
            k2Var.getClass();
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public final Object get(@CheckForNull Object obj) {
            boolean z10;
            k2 k2Var = k2.this;
            boolean z11 = false;
            if (obj != null) {
                Map<R, Map<C, V>> map = k2Var.f30016u;
                map.getClass();
                try {
                    z10 = map.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    z10 = false;
                }
                if (z10) {
                    z11 = true;
                }
            } else {
                k2Var.getClass();
            }
            if (z11) {
                Objects.requireNonNull(obj);
                return new b(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public final Object remove(@CheckForNull Object obj) {
            if (obj == null) {
                return null;
            }
            return k2.this.f30016u.remove(obj);
        }
    }

    /* compiled from: StandardTable.java */
    /* loaded from: classes2.dex */
    public abstract class d<T> extends f2.c<T> {
        public d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            k2.this.f30016u.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return k2.this.f30016u.isEmpty();
        }
    }

    public k2(LinkedHashMap linkedHashMap, i7.m mVar) {
        this.f30016u = linkedHashMap;
        this.f30017v = mVar;
    }

    @Override // j7.i, j7.n2
    public final Set<n2.a<R, C, V>> k() {
        Set<n2.a<R, C, V>> set = this.f29995s;
        if (set == null) {
            Set<n2.a<R, C, V>> u2 = u();
            this.f29995s = u2;
            return u2;
        }
        return set;
    }

    @Override // j7.n2
    public final Map<R, Map<C, V>> p() {
        c cVar = this.f30018w;
        if (cVar == null) {
            c cVar2 = new c();
            this.f30018w = cVar2;
            return cVar2;
        }
        return cVar;
    }

    @Override // j7.i
    public final Iterator<n2.a<R, C, V>> q() {
        return new a(this);
    }

    @Override // j7.i
    public final void r() {
        this.f30016u.clear();
    }

    @Override // j7.n2
    public final int size() {
        Iterator<Map<C, V>> it = this.f30016u.values().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += it.next().size();
        }
        return i10;
    }

    @CheckForNull
    public final V w(R r10, C c10, V v3) {
        r10.getClass();
        c10.getClass();
        v3.getClass();
        Map<R, Map<C, V>> map = this.f30016u;
        Map<C, V> map2 = map.get(r10);
        if (map2 == null) {
            map2 = this.f30017v.get();
            map.put(r10, map2);
        }
        return map2.put(c10, v3);
    }
}
