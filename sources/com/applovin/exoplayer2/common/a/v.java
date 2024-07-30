package com.applovin.exoplayer2.common.a;

import com.google.j2objc.annotations.Weak;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public abstract class v<K, V> extends g<K, V> implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    final transient u<K, ? extends q<V>> f13826b;

    /* renamed from: c, reason: collision with root package name */
    final transient int f13827c;

    /* loaded from: classes.dex */
    public static class b<K, V> extends q<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        @Weak
        final v<K, V> f13838a;

        public b(v<K, V> vVar) {
            this.f13838a = vVar;
        }

        @Override // com.applovin.exoplayer2.common.a.q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: a */
        public ax<Map.Entry<K, V>> iterator() {
            return this.f13838a.m();
        }

        @Override // com.applovin.exoplayer2.common.a.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return this.f13838a.b(entry.getKey(), entry.getValue());
            }
            return false;
        }

        @Override // com.applovin.exoplayer2.common.a.q
        public boolean f() {
            return this.f13838a.g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f13838a.d();
        }
    }

    /* loaded from: classes.dex */
    public static final class c<K, V> extends q<V> {

        /* renamed from: a, reason: collision with root package name */
        @Weak
        private final transient v<K, V> f13839a;

        public c(v<K, V> vVar) {
            this.f13839a = vVar;
        }

        @Override // com.applovin.exoplayer2.common.a.q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: a */
        public ax<V> iterator() {
            return this.f13839a.j();
        }

        @Override // com.applovin.exoplayer2.common.a.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            return this.f13839a.d(obj);
        }

        @Override // com.applovin.exoplayer2.common.a.q
        public boolean f() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f13839a.d();
        }

        @Override // com.applovin.exoplayer2.common.a.q
        public int a(Object[] objArr, int i10) {
            ax<? extends q<V>> it = this.f13839a.f13826b.values().iterator();
            while (it.hasNext()) {
                i10 = it.next().a(objArr, i10);
            }
            return i10;
        }
    }

    public v(u<K, ? extends q<V>> uVar, int i10) {
        this.f13826b = uVar;
        this.f13827c = i10;
    }

    @Override // com.applovin.exoplayer2.common.a.f, com.applovin.exoplayer2.common.a.ac
    @Deprecated
    public boolean a(K k10, V v3) {
        throw new UnsupportedOperationException();
    }

    @Override // com.applovin.exoplayer2.common.a.f, com.applovin.exoplayer2.common.a.ac
    @Deprecated
    public boolean c(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.applovin.exoplayer2.common.a.f
    public boolean d(@NullableDecl Object obj) {
        return obj != null && super.d(obj);
    }

    @Override // com.applovin.exoplayer2.common.a.ac
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public abstract q<V> b(K k10);

    @Override // com.applovin.exoplayer2.common.a.ac
    @Deprecated
    public void e() {
        throw new UnsupportedOperationException();
    }

    @Override // com.applovin.exoplayer2.common.a.f
    public /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    @Override // com.applovin.exoplayer2.common.a.f
    public Set<K> f() {
        throw new AssertionError("unreachable");
    }

    boolean g() {
        return this.f13826b.i();
    }

    @Override // com.applovin.exoplayer2.common.a.f
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.applovin.exoplayer2.common.a.f
    public Map<K, Collection<V>> n() {
        throw new AssertionError("should never be called");
    }

    @Override // com.applovin.exoplayer2.common.a.f
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public w<K> p() {
        return this.f13826b.keySet();
    }

    @Override // com.applovin.exoplayer2.common.a.f, com.applovin.exoplayer2.common.a.ac
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public u<K, Collection<V>> b() {
        return this.f13826b;
    }

    @Override // com.applovin.exoplayer2.common.a.f
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public q<Map.Entry<K, V>> k() {
        return (q) super.k();
    }

    @Override // com.applovin.exoplayer2.common.a.f
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public q<Map.Entry<K, V>> l() {
        return new b(this);
    }

    @Override // com.applovin.exoplayer2.common.a.f
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public ax<Map.Entry<K, V>> m() {
        return new ax<Map.Entry<K, V>>() { // from class: com.applovin.exoplayer2.common.a.v.1

            /* renamed from: a, reason: collision with root package name */
            final Iterator<? extends Map.Entry<K, ? extends q<V>>> f13828a;

            /* renamed from: b, reason: collision with root package name */
            K f13829b = null;

            /* renamed from: c, reason: collision with root package name */
            Iterator<V> f13830c = y.a();

            {
                this.f13828a = v.this.f13826b.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                if (!this.f13830c.hasNext()) {
                    Map.Entry<K, ? extends q<V>> next = this.f13828a.next();
                    this.f13829b = next.getKey();
                    this.f13830c = next.getValue().iterator();
                }
                return ab.a(this.f13829b, this.f13830c.next());
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (!this.f13830c.hasNext() && !this.f13828a.hasNext()) {
                    return false;
                }
                return true;
            }
        };
    }

    @Override // com.applovin.exoplayer2.common.a.f
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.applovin.exoplayer2.common.a.f, com.applovin.exoplayer2.common.a.ac
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public q<V> h() {
        return (q) super.h();
    }

    @Override // com.applovin.exoplayer2.common.a.f
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public q<V> i() {
        return new c(this);
    }

    @Override // com.applovin.exoplayer2.common.a.f
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public ax<V> j() {
        return new ax<V>() { // from class: com.applovin.exoplayer2.common.a.v.2

            /* renamed from: a, reason: collision with root package name */
            Iterator<? extends q<V>> f13832a;

            /* renamed from: b, reason: collision with root package name */
            Iterator<V> f13833b = y.a();

            {
                this.f13832a = v.this.f13826b.values().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (!this.f13833b.hasNext() && !this.f13832a.hasNext()) {
                    return false;
                }
                return true;
            }

            @Override // java.util.Iterator
            public V next() {
                if (!this.f13833b.hasNext()) {
                    this.f13833b = this.f13832a.next().iterator();
                }
                return this.f13833b.next();
            }
        };
    }

    @Override // com.applovin.exoplayer2.common.a.ac
    public int d() {
        return this.f13827c;
    }

    @Override // com.applovin.exoplayer2.common.a.f, com.applovin.exoplayer2.common.a.ac
    public /* bridge */ /* synthetic */ boolean b(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.b(obj, obj2);
    }

    /* loaded from: classes.dex */
    public static class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        Map<K, Collection<V>> f13835a = aj.a();

        /* renamed from: b, reason: collision with root package name */
        @MonotonicNonNullDecl
        Comparator<? super K> f13836b;

        /* renamed from: c, reason: collision with root package name */
        @MonotonicNonNullDecl
        Comparator<? super V> f13837c;

        public a<K, V> b(K k10, Iterable<? extends V> iterable) {
            if (k10 != null) {
                Collection<V> collection = this.f13835a.get(k10);
                if (collection != null) {
                    for (V v3 : iterable) {
                        j.a(k10, v3);
                        collection.add(v3);
                    }
                    return this;
                }
                Iterator<? extends V> it = iterable.iterator();
                if (!it.hasNext()) {
                    return this;
                }
                Collection<V> c10 = c();
                while (it.hasNext()) {
                    V next = it.next();
                    j.a(k10, next);
                    c10.add(next);
                }
                this.f13835a.put(k10, c10);
                return this;
            }
            throw new NullPointerException("null key in entry: null=" + x.a(iterable));
        }

        public Collection<V> c() {
            return new ArrayList();
        }

        public a<K, V> b(K k10, V... vArr) {
            return b((a<K, V>) k10, Arrays.asList(vArr));
        }

        public v<K, V> b() {
            Collection entrySet = this.f13835a.entrySet();
            Comparator<? super K> comparator = this.f13836b;
            if (comparator != null) {
                entrySet = ai.a(comparator).c().a(entrySet);
            }
            return t.a(entrySet, (Comparator) this.f13837c);
        }
    }
}
