package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.a.ae;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
abstract class f<K, V> implements ac<K, V> {

    /* renamed from: a, reason: collision with root package name */
    @MonotonicNonNullDecl
    private transient Collection<Map.Entry<K, V>> f13769a;

    /* renamed from: b, reason: collision with root package name */
    @MonotonicNonNullDecl
    private transient Set<K> f13770b;

    /* renamed from: c, reason: collision with root package name */
    @MonotonicNonNullDecl
    private transient Collection<V> f13771c;

    /* renamed from: d, reason: collision with root package name */
    @MonotonicNonNullDecl
    private transient Map<K, Collection<V>> f13772d;

    /* loaded from: classes.dex */
    public class a extends ae.b<K, V> {
        public a() {
        }

        @Override // com.applovin.exoplayer2.common.a.ae.b
        public ac<K, V> a() {
            return f.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return f.this.m();
        }
    }

    /* loaded from: classes.dex */
    public class b extends f<K, V>.a implements Set<Map.Entry<K, V>> {
        public b() {
            super();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@NullableDecl Object obj) {
            return aq.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return aq.a(this);
        }
    }

    /* loaded from: classes.dex */
    public class c extends AbstractCollection<V> {
        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            f.this.e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@NullableDecl Object obj) {
            return f.this.d(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return f.this.j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return f.this.d();
        }
    }

    @Override // com.applovin.exoplayer2.common.a.ac
    public boolean a(@NullableDecl K k10, @NullableDecl V v3) {
        return b(k10).add(v3);
    }

    @Override // com.applovin.exoplayer2.common.a.ac
    public boolean b(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Collection<V> collection = b().get(obj);
        return collection != null && collection.contains(obj2);
    }

    @Override // com.applovin.exoplayer2.common.a.ac
    public boolean c(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Collection<V> collection = b().get(obj);
        if (collection != null && collection.remove(obj2)) {
            return true;
        }
        return false;
    }

    public boolean d(@NullableDecl Object obj) {
        Iterator<Collection<V>> it = b().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(@NullableDecl Object obj) {
        return ae.a(this, obj);
    }

    public abstract Set<K> f();

    @Override // com.applovin.exoplayer2.common.a.ac
    public Collection<V> h() {
        Collection<V> collection = this.f13771c;
        if (collection == null) {
            Collection<V> i10 = i();
            this.f13771c = i10;
            return i10;
        }
        return collection;
    }

    public int hashCode() {
        return b().hashCode();
    }

    public abstract Collection<V> i();

    public Iterator<V> j() {
        return ab.b(k().iterator());
    }

    public Collection<Map.Entry<K, V>> k() {
        Collection<Map.Entry<K, V>> collection = this.f13769a;
        if (collection == null) {
            Collection<Map.Entry<K, V>> l10 = l();
            this.f13769a = l10;
            return l10;
        }
        return collection;
    }

    public abstract Collection<Map.Entry<K, V>> l();

    public abstract Iterator<Map.Entry<K, V>> m();

    public abstract Map<K, Collection<V>> n();

    public Set<K> p() {
        Set<K> set = this.f13770b;
        if (set == null) {
            Set<K> f = f();
            this.f13770b = f;
            return f;
        }
        return set;
    }

    public String toString() {
        return b().toString();
    }

    @Override // com.applovin.exoplayer2.common.a.ac
    public Map<K, Collection<V>> b() {
        Map<K, Collection<V>> map = this.f13772d;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> n10 = n();
        this.f13772d = n10;
        return n10;
    }
}
