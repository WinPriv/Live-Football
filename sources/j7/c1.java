package j7;

import j7.f2;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: LinkedHashMultimap.java */
/* loaded from: classes2.dex */
public final class c1<K, V> extends d1<K, V> {
    public final transient int y;

    /* renamed from: z, reason: collision with root package name */
    public final transient b<K, V> f29885z;

    /* compiled from: LinkedHashMultimap.java */
    /* loaded from: classes2.dex */
    public class a implements Iterator<Map.Entry<K, V>> {

        /* renamed from: s, reason: collision with root package name */
        public b<K, V> f29886s;

        /* renamed from: t, reason: collision with root package name */
        @CheckForNull
        public b<K, V> f29887t;

        public a() {
            b<K, V> bVar = c1.this.f29885z.f29893z;
            Objects.requireNonNull(bVar);
            this.f29886s = bVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f29886s != c1.this.f29885z) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (hasNext()) {
                b<K, V> bVar = this.f29886s;
                this.f29887t = bVar;
                b<K, V> bVar2 = bVar.f29893z;
                Objects.requireNonNull(bVar2);
                this.f29886s = bVar2;
                return bVar;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            boolean z10;
            if (this.f29887t != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            i7.f.f(z10, "no calls to next() since the last call to remove()");
            b<K, V> bVar = this.f29887t;
            c1.this.remove(bVar.f29988s, bVar.f29989t);
            this.f29887t = null;
        }
    }

    /* compiled from: LinkedHashMultimap.java */
    /* loaded from: classes2.dex */
    public static final class b<K, V> extends h0<K, V> implements d<K, V> {

        /* renamed from: u, reason: collision with root package name */
        public final int f29889u;

        /* renamed from: v, reason: collision with root package name */
        @CheckForNull
        public b<K, V> f29890v;

        /* renamed from: w, reason: collision with root package name */
        @CheckForNull
        public d<K, V> f29891w;

        /* renamed from: x, reason: collision with root package name */
        @CheckForNull
        public d<K, V> f29892x;

        @CheckForNull
        public b<K, V> y;

        /* renamed from: z, reason: collision with root package name */
        @CheckForNull
        public b<K, V> f29893z;

        public b(K k10, V v3, int i10, @CheckForNull b<K, V> bVar) {
            super(k10, v3);
            this.f29889u = i10;
            this.f29890v = bVar;
        }

        @Override // j7.c1.d
        public final void a(d<K, V> dVar) {
            this.f29891w = dVar;
        }

        @Override // j7.c1.d
        public final void b(d<K, V> dVar) {
            this.f29892x = dVar;
        }

        public final d<K, V> k() {
            d<K, V> dVar = this.f29891w;
            Objects.requireNonNull(dVar);
            return dVar;
        }

        @Override // j7.c1.d
        public final d<K, V> p() {
            d<K, V> dVar = this.f29892x;
            Objects.requireNonNull(dVar);
            return dVar;
        }
    }

    /* compiled from: LinkedHashMultimap.java */
    /* loaded from: classes2.dex */
    public final class c extends f2.c<V> implements d<K, V> {

        /* renamed from: s, reason: collision with root package name */
        public final K f29894s;

        /* renamed from: t, reason: collision with root package name */
        public b<K, V>[] f29895t;

        /* renamed from: u, reason: collision with root package name */
        public int f29896u = 0;

        /* renamed from: v, reason: collision with root package name */
        public int f29897v = 0;

        /* renamed from: w, reason: collision with root package name */
        public d<K, V> f29898w = this;

        /* renamed from: x, reason: collision with root package name */
        public d<K, V> f29899x = this;

        /* compiled from: LinkedHashMultimap.java */
        /* loaded from: classes2.dex */
        public class a implements Iterator<V> {

            /* renamed from: s, reason: collision with root package name */
            public d<K, V> f29900s;

            /* renamed from: t, reason: collision with root package name */
            @CheckForNull
            public b<K, V> f29901t;

            /* renamed from: u, reason: collision with root package name */
            public int f29902u;

            public a() {
                this.f29900s = c.this.f29898w;
                this.f29902u = c.this.f29897v;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                c cVar = c.this;
                if (cVar.f29897v == this.f29902u) {
                    if (this.f29900s != cVar) {
                        return true;
                    }
                    return false;
                }
                throw new ConcurrentModificationException();
            }

            @Override // java.util.Iterator
            public final V next() {
                if (hasNext()) {
                    b<K, V> bVar = (b) this.f29900s;
                    V v3 = bVar.f29989t;
                    this.f29901t = bVar;
                    this.f29900s = bVar.p();
                    return v3;
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public final void remove() {
                boolean z10;
                c cVar = c.this;
                if (cVar.f29897v == this.f29902u) {
                    if (this.f29901t != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    i7.f.f(z10, "no calls to next() since the last call to remove()");
                    cVar.remove(this.f29901t.f29989t);
                    this.f29902u = cVar.f29897v;
                    this.f29901t = null;
                    return;
                }
                throw new ConcurrentModificationException();
            }
        }

        public c(K k10, int i10) {
            this.f29894s = k10;
            int max = Math.max(i10, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > ((int) (highestOneBit * 1.0d))) {
                int i11 = highestOneBit << 1;
                highestOneBit = i11 <= 0 ? 1073741824 : i11;
            }
            this.f29895t = new b[highestOneBit];
        }

        @Override // j7.c1.d
        public final void a(d<K, V> dVar) {
            this.f29899x = dVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(V v3) {
            int c10 = f0.c(v3);
            int length = (r1.length - 1) & c10;
            b<K, V> bVar = this.f29895t[length];
            b<K, V> bVar2 = bVar;
            while (true) {
                boolean z10 = true;
                boolean z11 = false;
                if (bVar2 != null) {
                    if (bVar2.f29889u != c10 || !i7.g.a(bVar2.f29989t, v3)) {
                        z10 = false;
                    }
                    if (z10) {
                        return false;
                    }
                    bVar2 = bVar2.f29890v;
                } else {
                    b<K, V> bVar3 = new b<>(this.f29894s, v3, c10, bVar);
                    d<K, V> dVar = this.f29899x;
                    dVar.b(bVar3);
                    bVar3.f29891w = dVar;
                    bVar3.f29892x = this;
                    this.f29899x = bVar3;
                    c1 c1Var = c1.this;
                    b<K, V> bVar4 = c1Var.f29885z.y;
                    Objects.requireNonNull(bVar4);
                    bVar4.f29893z = bVar3;
                    bVar3.y = bVar4;
                    b<K, V> bVar5 = c1Var.f29885z;
                    bVar3.f29893z = bVar5;
                    bVar5.y = bVar3;
                    b<K, V>[] bVarArr = this.f29895t;
                    bVarArr[length] = bVar3;
                    int i10 = this.f29896u + 1;
                    this.f29896u = i10;
                    this.f29897v++;
                    int length2 = bVarArr.length;
                    if (i10 > length2 * 1.0d && length2 < 1073741824) {
                        z11 = true;
                    }
                    if (z11) {
                        int length3 = bVarArr.length * 2;
                        b<K, V>[] bVarArr2 = new b[length3];
                        this.f29895t = bVarArr2;
                        int i11 = length3 - 1;
                        for (d<K, V> dVar2 = this.f29898w; dVar2 != this; dVar2 = dVar2.p()) {
                            b<K, V> bVar6 = (b) dVar2;
                            int i12 = bVar6.f29889u & i11;
                            bVar6.f29890v = bVarArr2[i12];
                            bVarArr2[i12] = bVar6;
                        }
                    }
                    return true;
                }
            }
        }

        @Override // j7.c1.d
        public final void b(d<K, V> dVar) {
            this.f29898w = dVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            Arrays.fill(this.f29895t, (Object) null);
            this.f29896u = 0;
            for (d<K, V> dVar = this.f29898w; dVar != this; dVar = dVar.p()) {
                b bVar = (b) dVar;
                b<K, V> bVar2 = bVar.y;
                Objects.requireNonNull(bVar2);
                b<K, V> bVar3 = bVar.f29893z;
                Objects.requireNonNull(bVar3);
                bVar2.f29893z = bVar3;
                bVar3.y = bVar2;
            }
            this.f29898w = this;
            this.f29899x = this;
            this.f29897v++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@CheckForNull Object obj) {
            int c10 = f0.c(obj);
            b<K, V> bVar = this.f29895t[(r1.length - 1) & c10];
            while (true) {
                boolean z10 = false;
                if (bVar == null) {
                    return false;
                }
                if (bVar.f29889u == c10 && i7.g.a(bVar.f29989t, obj)) {
                    z10 = true;
                }
                if (z10) {
                    return true;
                }
                bVar = bVar.f29890v;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<V> iterator() {
            return new a();
        }

        @Override // j7.c1.d
        public final d<K, V> p() {
            return this.f29898w;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(@CheckForNull Object obj) {
            int c10 = f0.c(obj);
            int length = (r1.length - 1) & c10;
            b<K, V> bVar = this.f29895t[length];
            b<K, V> bVar2 = null;
            while (true) {
                boolean z10 = false;
                if (bVar == null) {
                    return false;
                }
                if (bVar.f29889u == c10 && i7.g.a(bVar.f29989t, obj)) {
                    z10 = true;
                }
                if (z10) {
                    if (bVar2 == null) {
                        this.f29895t[length] = bVar.f29890v;
                    } else {
                        bVar2.f29890v = bVar.f29890v;
                    }
                    d<K, V> k10 = bVar.k();
                    d<K, V> p10 = bVar.p();
                    k10.b(p10);
                    p10.a(k10);
                    b<K, V> bVar3 = bVar.y;
                    Objects.requireNonNull(bVar3);
                    b<K, V> bVar4 = bVar.f29893z;
                    Objects.requireNonNull(bVar4);
                    bVar3.f29893z = bVar4;
                    bVar4.y = bVar3;
                    this.f29896u--;
                    this.f29897v++;
                    return true;
                }
                bVar2 = bVar;
                bVar = bVar.f29890v;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f29896u;
        }
    }

    /* compiled from: LinkedHashMultimap.java */
    /* loaded from: classes2.dex */
    public interface d<K, V> {
        void a(d<K, V> dVar);

        void b(d<K, V> dVar);

        d<K, V> p();
    }

    public c1() {
        super(new s());
        this.y = 2;
        r.y(2, "expectedValuesPerKey");
        this.y = 2;
        b<K, V> bVar = new b<>(null, null, 0, null);
        this.f29885z = bVar;
        bVar.f29893z = bVar;
        bVar.y = bVar;
    }

    @Override // j7.d
    public final Collection<V> K() {
        return super.K();
    }

    @Override // j7.g
    /* renamed from: U */
    public final Set<Map.Entry<K, V>> k() {
        return super.k();
    }

    @Override // j7.d, j7.n1
    public final void clear() {
        super.clear();
        b<K, V> bVar = this.f29885z;
        bVar.f29893z = bVar;
        bVar.y = bVar;
    }

    @Override // j7.g, j7.d, j7.f, j7.n1
    public final Collection k() {
        return super.k();
    }

    @Override // j7.f, j7.n1
    public final Set<K> keySet() {
        return super.keySet();
    }

    @Override // j7.d, j7.f
    public final Iterator<Map.Entry<K, V>> u() {
        return new a();
    }

    @Override // j7.d, j7.f
    public final Iterator<V> v() {
        return new k1(new a());
    }

    @Override // j7.d
    public final Collection x() {
        return new t(this.y);
    }

    @Override // j7.d
    public final Collection<V> y(K k10) {
        return new c(k10, this.y);
    }
}
