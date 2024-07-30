package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.a.q;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public abstract class u<K, V> implements Serializable, Map<K, V> {

    /* renamed from: a, reason: collision with root package name */
    static final Map.Entry<?, ?>[] f13818a = new Map.Entry[0];

    /* renamed from: b, reason: collision with root package name */
    private transient w<Map.Entry<K, V>> f13819b;

    /* renamed from: c, reason: collision with root package name */
    @RetainedWith
    private transient w<K> f13820c;

    /* renamed from: d, reason: collision with root package name */
    @RetainedWith
    private transient q<V> f13821d;

    /* loaded from: classes.dex */
    public static class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        @MonotonicNonNullDecl
        Comparator<? super V> f13822a;

        /* renamed from: b, reason: collision with root package name */
        Object[] f13823b;

        /* renamed from: c, reason: collision with root package name */
        int f13824c;

        /* renamed from: d, reason: collision with root package name */
        boolean f13825d;

        public a() {
            this(4);
        }

        private void a(int i10) {
            int i11 = i10 * 2;
            Object[] objArr = this.f13823b;
            if (i11 > objArr.length) {
                this.f13823b = Arrays.copyOf(objArr, q.b.a(objArr.length, i11));
                this.f13825d = false;
            }
        }

        public void b() {
            int i10;
            if (this.f13822a != null) {
                if (this.f13825d) {
                    this.f13823b = Arrays.copyOf(this.f13823b, this.f13824c * 2);
                }
                Map.Entry[] entryArr = new Map.Entry[this.f13824c];
                int i11 = 0;
                while (true) {
                    i10 = this.f13824c;
                    if (i11 >= i10) {
                        break;
                    }
                    Object[] objArr = this.f13823b;
                    int i12 = i11 * 2;
                    entryArr[i11] = new AbstractMap.SimpleImmutableEntry(objArr[i12], objArr[i12 + 1]);
                    i11++;
                }
                Arrays.sort(entryArr, 0, i10, ai.a(this.f13822a).a(ab.b()));
                for (int i13 = 0; i13 < this.f13824c; i13++) {
                    int i14 = i13 * 2;
                    this.f13823b[i14] = entryArr[i13].getKey();
                    this.f13823b[i14 + 1] = entryArr[i13].getValue();
                }
            }
        }

        public a(int i10) {
            this.f13823b = new Object[i10 * 2];
            this.f13824c = 0;
            this.f13825d = false;
        }

        public a<K, V> a(K k10, V v3) {
            a(this.f13824c + 1);
            j.a(k10, v3);
            Object[] objArr = this.f13823b;
            int i10 = this.f13824c;
            objArr[i10 * 2] = k10;
            objArr[(i10 * 2) + 1] = v3;
            this.f13824c = i10 + 1;
            return this;
        }

        public a<K, V> a(Map.Entry<? extends K, ? extends V> entry) {
            return a(entry.getKey(), entry.getValue());
        }

        public a<K, V> a(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                a(((Collection) iterable).size() + this.f13824c);
            }
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }

        public u<K, V> a() {
            b();
            this.f13825d = true;
            return al.a(this.f13824c, this.f13823b);
        }
    }

    public static <K, V> u<K, V> a() {
        return (u<K, V>) al.f13695b;
    }

    public static <K, V> a<K, V> b() {
        return new a<>();
    }

    @Override // java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public w<Map.Entry<K, V>> entrySet() {
        w<Map.Entry<K, V>> wVar = this.f13819b;
        if (wVar == null) {
            w<Map.Entry<K, V>> d10 = d();
            this.f13819b = d10;
            return d10;
        }
        return wVar;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
        return values().contains(obj);
    }

    public abstract w<Map.Entry<K, V>> d();

    @Override // java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public w<K> keySet() {
        w<K> wVar = this.f13820c;
        if (wVar == null) {
            w<K> f = f();
            this.f13820c = f;
            return f;
        }
        return wVar;
    }

    @Override // java.util.Map
    public boolean equals(@NullableDecl Object obj) {
        return ab.d(this, obj);
    }

    public abstract w<K> f();

    @Override // java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public q<V> values() {
        q<V> qVar = this.f13821d;
        if (qVar == null) {
            q<V> h10 = h();
            this.f13821d = h10;
            return h10;
        }
        return qVar;
    }

    public abstract V get(@NullableDecl Object obj);

    @Override // java.util.Map
    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v3) {
        V v10 = get(obj);
        if (v10 != null) {
            return v10;
        }
        return v3;
    }

    public abstract q<V> h();

    @Override // java.util.Map
    public int hashCode() {
        return aq.a(entrySet());
    }

    public abstract boolean i();

    @Override // java.util.Map
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k10, V v3) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return ab.a(this);
    }

    public static <K, V> u<K, V> a(Map<? extends K, ? extends V> map) {
        if ((map instanceof u) && !(map instanceof SortedMap)) {
            u<K, V> uVar = (u) map;
            if (!uVar.i()) {
                return uVar;
            }
        }
        return a(map.entrySet());
    }

    public static <K, V> u<K, V> a(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.a(iterable);
        return aVar.a();
    }
}
