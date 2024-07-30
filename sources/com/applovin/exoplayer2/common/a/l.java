package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.common.base.Preconditions;
import com.huawei.hms.ads.gl;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class l<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    @MonotonicNonNullDecl
    transient long[] f13778a;

    /* renamed from: b, reason: collision with root package name */
    @MonotonicNonNullDecl
    transient Object[] f13779b;

    /* renamed from: c, reason: collision with root package name */
    @MonotonicNonNullDecl
    transient Object[] f13780c;

    /* renamed from: d, reason: collision with root package name */
    transient float f13781d;

    /* renamed from: e, reason: collision with root package name */
    transient int f13782e;

    @MonotonicNonNullDecl
    private transient int[] f;

    /* renamed from: g, reason: collision with root package name */
    private transient int f13783g;

    /* renamed from: h, reason: collision with root package name */
    private transient int f13784h;

    /* renamed from: i, reason: collision with root package name */
    @MonotonicNonNullDecl
    private transient Set<K> f13785i;

    /* renamed from: j, reason: collision with root package name */
    @MonotonicNonNullDecl
    private transient Set<Map.Entry<K, V>> f13786j;

    /* renamed from: k, reason: collision with root package name */
    @MonotonicNonNullDecl
    private transient Collection<V> f13787k;

    /* loaded from: classes.dex */
    public class a extends AbstractSet<Map.Entry<K, V>> {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            l.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int a10 = l.this.a(entry.getKey());
            if (a10 == -1 || !Objects.equal(l.this.f13780c[a10], entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return l.this.f();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@NullableDecl Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int a10 = l.this.a(entry.getKey());
                if (a10 != -1 && Objects.equal(l.this.f13780c[a10], entry.getValue())) {
                    l.this.j(a10);
                    return true;
                }
                return false;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return l.this.f13784h;
        }
    }

    /* loaded from: classes.dex */
    public abstract class b<T> implements Iterator<T> {

        /* renamed from: b, reason: collision with root package name */
        int f13792b;

        /* renamed from: c, reason: collision with root package name */
        int f13793c;

        /* renamed from: d, reason: collision with root package name */
        int f13794d;

        private b() {
            this.f13792b = l.this.f13782e;
            this.f13793c = l.this.b();
            this.f13794d = -1;
        }

        private void a() {
            if (l.this.f13782e == this.f13792b) {
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public abstract T a(int i10);

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f13793c >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            if (hasNext()) {
                int i10 = this.f13793c;
                this.f13794d = i10;
                T a10 = a(i10);
                this.f13793c = l.this.e(this.f13793c);
                return a10;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            boolean z10;
            a();
            if (this.f13794d >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            j.a(z10);
            this.f13792b++;
            l.this.j(this.f13794d);
            this.f13793c = l.this.a(this.f13793c, this.f13794d);
            this.f13794d = -1;
        }
    }

    /* loaded from: classes.dex */
    public class c extends AbstractSet<K> {
        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            l.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return l.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return l.this.d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@NullableDecl Object obj) {
            int a10 = l.this.a(obj);
            if (a10 != -1) {
                l.this.j(a10);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return l.this.f13784h;
        }
    }

    /* loaded from: classes.dex */
    public final class d extends com.applovin.exoplayer2.common.a.e<K, V> {

        /* renamed from: b, reason: collision with root package name */
        @NullableDecl
        private final K f13798b;

        /* renamed from: c, reason: collision with root package name */
        private int f13799c;

        public d(int i10) {
            this.f13798b = (K) l.this.f13779b[i10];
            this.f13799c = i10;
        }

        private void a() {
            int i10 = this.f13799c;
            if (i10 == -1 || i10 >= l.this.size() || !Objects.equal(this.f13798b, l.this.f13779b[this.f13799c])) {
                this.f13799c = l.this.a(this.f13798b);
            }
        }

        @Override // com.applovin.exoplayer2.common.a.e, java.util.Map.Entry
        public K getKey() {
            return this.f13798b;
        }

        @Override // com.applovin.exoplayer2.common.a.e, java.util.Map.Entry
        public V getValue() {
            a();
            int i10 = this.f13799c;
            if (i10 == -1) {
                return null;
            }
            return (V) l.this.f13780c[i10];
        }

        @Override // com.applovin.exoplayer2.common.a.e, java.util.Map.Entry
        public V setValue(V v3) {
            a();
            int i10 = this.f13799c;
            if (i10 == -1) {
                l.this.put(this.f13798b, v3);
                return null;
            }
            Object[] objArr = l.this.f13780c;
            V v10 = (V) objArr[i10];
            objArr[i10] = v3;
            return v10;
        }
    }

    /* loaded from: classes.dex */
    public class e extends AbstractCollection<V> {
        public e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            l.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return l.this.h();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return l.this.f13784h;
        }
    }

    public l() {
        a(3, 1.0f);
    }

    private static int b(long j10) {
        return (int) j10;
    }

    private static int[] f(int i10) {
        int[] iArr = new int[i10];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private static long[] g(int i10) {
        long[] jArr = new long[i10];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    private void h(int i10) {
        int length = this.f13778a.length;
        if (i10 > length) {
            int max = Math.max(1, length >>> 1) + length;
            if (max < 0) {
                max = Integer.MAX_VALUE;
            }
            if (max != length) {
                c(max);
            }
        }
    }

    private int i() {
        return this.f.length - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V j(int i10) {
        return a(this.f13779b[i10], a(this.f13778a[i10]));
    }

    public int a(int i10, int i11) {
        return i10 - 1;
    }

    public void c(int i10) {
        this.f13779b = Arrays.copyOf(this.f13779b, i10);
        this.f13780c = Arrays.copyOf(this.f13780c, i10);
        long[] jArr = this.f13778a;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i10);
        if (i10 > length) {
            Arrays.fill(copyOf, length, i10, -1L);
        }
        this.f13778a = copyOf;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f13782e++;
        Arrays.fill(this.f13779b, 0, this.f13784h, (Object) null);
        Arrays.fill(this.f13780c, 0, this.f13784h, (Object) null);
        Arrays.fill(this.f, -1);
        Arrays.fill(this.f13778a, -1L);
        this.f13784h = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
        if (a(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
        for (int i10 = 0; i10 < this.f13784h; i10++) {
            if (Objects.equal(obj, this.f13780c[i10])) {
                return true;
            }
        }
        return false;
    }

    public void d(int i10) {
        int size = size() - 1;
        if (i10 < size) {
            Object[] objArr = this.f13779b;
            objArr[i10] = objArr[size];
            Object[] objArr2 = this.f13780c;
            objArr2[i10] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            long[] jArr = this.f13778a;
            long j10 = jArr[size];
            jArr[i10] = j10;
            jArr[size] = -1;
            int a10 = a(j10) & i();
            int[] iArr = this.f;
            int i11 = iArr[a10];
            if (i11 == size) {
                iArr[a10] = i10;
                return;
            }
            while (true) {
                long j11 = this.f13778a[i11];
                int b10 = b(j11);
                if (b10 == size) {
                    this.f13778a[i11] = a(j11, i10);
                    return;
                }
                i11 = b10;
            }
        } else {
            this.f13779b[i10] = null;
            this.f13780c[i10] = null;
            this.f13778a[i10] = -1;
        }
    }

    public int e(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f13784h) {
            return i11;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f13786j;
        if (set == null) {
            Set<Map.Entry<K, V>> e10 = e();
            this.f13786j = e10;
            return e10;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(@NullableDecl Object obj) {
        int a10 = a(obj);
        b(a10);
        if (a10 == -1) {
            return null;
        }
        return (V) this.f13780c[a10];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        if (this.f13784h == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f13785i;
        if (set == null) {
            Set<K> c10 = c();
            this.f13785i = c10;
            return c10;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @NullableDecl
    public V put(@NullableDecl K k10, @NullableDecl V v3) {
        long[] jArr = this.f13778a;
        Object[] objArr = this.f13779b;
        Object[] objArr2 = this.f13780c;
        int a10 = p.a(k10);
        int i10 = i() & a10;
        int i11 = this.f13784h;
        int[] iArr = this.f;
        int i12 = iArr[i10];
        if (i12 == -1) {
            iArr[i10] = i11;
        } else {
            while (true) {
                long j10 = jArr[i12];
                if (a(j10) == a10 && Objects.equal(k10, objArr[i12])) {
                    V v10 = (V) objArr2[i12];
                    objArr2[i12] = v3;
                    b(i12);
                    return v10;
                }
                int b10 = b(j10);
                if (b10 == -1) {
                    jArr[i12] = a(j10, i11);
                    break;
                }
                i12 = b10;
            }
        }
        if (i11 != Integer.MAX_VALUE) {
            int i13 = i11 + 1;
            h(i13);
            a(i11, k10, v3, a10);
            this.f13784h = i13;
            if (i11 >= this.f13783g) {
                i(this.f.length * 2);
            }
            this.f13782e++;
            return null;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    @Override // java.util.AbstractMap, java.util.Map
    @NullableDecl
    public V remove(@NullableDecl Object obj) {
        return a(obj, p.a(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f13784h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f13787k;
        if (collection == null) {
            Collection<V> g6 = g();
            this.f13787k = g6;
            return g6;
        }
        return collection;
    }

    private static int a(long j10) {
        return (int) (j10 >>> 32);
    }

    private void i(int i10) {
        if (this.f.length >= 1073741824) {
            this.f13783g = Integer.MAX_VALUE;
            return;
        }
        int i11 = ((int) (i10 * this.f13781d)) + 1;
        int[] f = f(i10);
        long[] jArr = this.f13778a;
        int length = f.length - 1;
        for (int i12 = 0; i12 < this.f13784h; i12++) {
            int a10 = a(jArr[i12]);
            int i13 = a10 & length;
            int i14 = f[i13];
            f[i13] = i12;
            jArr[i12] = (a10 << 32) | (i14 & 4294967295L);
        }
        this.f13783g = i11;
        this.f = f;
    }

    public void b(int i10) {
    }

    public Set<Map.Entry<K, V>> e() {
        return new a();
    }

    public l(int i10) {
        this(i10, 1.0f);
    }

    private static long a(long j10, int i10) {
        return (j10 & (-4294967296L)) | (4294967295L & i10);
    }

    public int b() {
        return isEmpty() ? -1 : 0;
    }

    public Iterator<Map.Entry<K, V>> f() {
        return new l<K, V>.b<Map.Entry<K, V>>() { // from class: com.applovin.exoplayer2.common.a.l.2
            @Override // com.applovin.exoplayer2.common.a.l.b
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> a(int i10) {
                return new d(i10);
            }
        };
    }

    public Collection<V> g() {
        return new e();
    }

    public l(int i10, float f) {
        a(i10, f);
    }

    public Iterator<V> h() {
        return new l<K, V>.b<V>() { // from class: com.applovin.exoplayer2.common.a.l.3
            @Override // com.applovin.exoplayer2.common.a.l.b
            public V a(int i10) {
                return (V) l.this.f13780c[i10];
            }
        };
    }

    public static <K, V> l<K, V> a() {
        return new l<>();
    }

    public static <K, V> l<K, V> a(int i10) {
        return new l<>(i10);
    }

    public Set<K> c() {
        return new c();
    }

    public void a(int i10, float f) {
        Preconditions.checkArgument(i10 >= 0, "Initial capacity must be non-negative");
        Preconditions.checkArgument(f > gl.Code, "Illegal load factor");
        int a10 = p.a(i10, f);
        this.f = f(a10);
        this.f13781d = f;
        this.f13779b = new Object[i10];
        this.f13780c = new Object[i10];
        this.f13778a = g(i10);
        this.f13783g = Math.max(1, (int) (a10 * f));
    }

    public Iterator<K> d() {
        return new l<K, V>.b<K>() { // from class: com.applovin.exoplayer2.common.a.l.1
            @Override // com.applovin.exoplayer2.common.a.l.b
            public K a(int i10) {
                return (K) l.this.f13779b[i10];
            }
        };
    }

    public void a(int i10, @NullableDecl K k10, @NullableDecl V v3, int i11) {
        this.f13778a[i10] = (i11 << 32) | 4294967295L;
        this.f13779b[i10] = k10;
        this.f13780c[i10] = v3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(@NullableDecl Object obj) {
        int a10 = p.a(obj);
        int i10 = this.f[i() & a10];
        while (i10 != -1) {
            long j10 = this.f13778a[i10];
            if (a(j10) == a10 && Objects.equal(obj, this.f13779b[i10])) {
                return i10;
            }
            i10 = b(j10);
        }
        return -1;
    }

    @NullableDecl
    private V a(@NullableDecl Object obj, int i10) {
        int i11 = i() & i10;
        int i12 = this.f[i11];
        if (i12 == -1) {
            return null;
        }
        int i13 = -1;
        while (true) {
            if (a(this.f13778a[i12]) == i10 && Objects.equal(obj, this.f13779b[i12])) {
                V v3 = (V) this.f13780c[i12];
                if (i13 == -1) {
                    this.f[i11] = b(this.f13778a[i12]);
                } else {
                    long[] jArr = this.f13778a;
                    jArr[i13] = a(jArr[i13], b(jArr[i12]));
                }
                d(i12);
                this.f13784h--;
                this.f13782e++;
                return v3;
            }
            int b10 = b(this.f13778a[i12]);
            if (b10 == -1) {
                return null;
            }
            i13 = i12;
            i12 = b10;
        }
    }
}
