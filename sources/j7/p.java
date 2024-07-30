package j7;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: CompactHashMap.java */
/* loaded from: classes2.dex */
public class p<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Object B = new Object();

    @CheckForNull
    public transient e A;

    /* renamed from: s, reason: collision with root package name */
    @CheckForNull
    public transient Object f30053s;

    /* renamed from: t, reason: collision with root package name */
    @CheckForNull
    public transient int[] f30054t;

    /* renamed from: u, reason: collision with root package name */
    @CheckForNull
    public transient Object[] f30055u;

    /* renamed from: v, reason: collision with root package name */
    @CheckForNull
    public transient Object[] f30056v;

    /* renamed from: w, reason: collision with root package name */
    public transient int f30057w;

    /* renamed from: x, reason: collision with root package name */
    public transient int f30058x;

    @CheckForNull
    public transient c y;

    /* renamed from: z, reason: collision with root package name */
    @CheckForNull
    public transient a f30059z;

    /* compiled from: CompactHashMap.java */
    /* loaded from: classes2.dex */
    public class a extends AbstractSet<Map.Entry<K, V>> {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            p.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@CheckForNull Object obj) {
            p pVar = p.this;
            Map<K, V> r10 = pVar.r();
            if (r10 != null) {
                return r10.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int y = pVar.y(entry.getKey());
            if (y == -1 || !i7.g.a(pVar.N(y), entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            p pVar = p.this;
            Map<K, V> r10 = pVar.r();
            if (r10 != null) {
                return r10.entrySet().iterator();
            }
            return new n(pVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(@CheckForNull Object obj) {
            p pVar = p.this;
            Map<K, V> r10 = pVar.r();
            if (r10 != null) {
                return r10.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (pVar.E()) {
                return false;
            }
            int i10 = (1 << (pVar.f30057w & 31)) - 1;
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object obj2 = pVar.f30053s;
            Objects.requireNonNull(obj2);
            int G = r.G(key, value, i10, obj2, pVar.G(), pVar.H(), pVar.K());
            if (G == -1) {
                return false;
            }
            pVar.C(G, i10);
            pVar.f30058x--;
            pVar.x();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return p.this.size();
        }
    }

    /* compiled from: CompactHashMap.java */
    /* loaded from: classes2.dex */
    public abstract class b<T> implements Iterator<T> {

        /* renamed from: s, reason: collision with root package name */
        public int f30061s;

        /* renamed from: t, reason: collision with root package name */
        public int f30062t;

        /* renamed from: u, reason: collision with root package name */
        public int f30063u = -1;

        public b() {
            this.f30061s = p.this.f30057w;
            this.f30062t = p.this.u();
        }

        public abstract T a(int i10);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f30062t >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final T next() {
            p pVar = p.this;
            if (pVar.f30057w == this.f30061s) {
                if (hasNext()) {
                    int i10 = this.f30062t;
                    this.f30063u = i10;
                    T a10 = a(i10);
                    this.f30062t = pVar.v(this.f30062t);
                    return a10;
                }
                throw new NoSuchElementException();
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            boolean z10;
            p pVar = p.this;
            if (pVar.f30057w == this.f30061s) {
                if (this.f30063u >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i7.f.f(z10, "no calls to next() since the last call to remove()");
                this.f30061s += 32;
                pVar.remove(pVar.B(this.f30063u));
                this.f30062t = pVar.c(this.f30062t, this.f30063u);
                this.f30063u = -1;
                return;
            }
            throw new ConcurrentModificationException();
        }
    }

    /* compiled from: CompactHashMap.java */
    /* loaded from: classes2.dex */
    public class c extends AbstractSet<K> {
        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            p.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@CheckForNull Object obj) {
            return p.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            p pVar = p.this;
            Map<K, V> r10 = pVar.r();
            if (r10 != null) {
                return r10.keySet().iterator();
            }
            return new m(pVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(@CheckForNull Object obj) {
            p pVar = p.this;
            Map<K, V> r10 = pVar.r();
            if (r10 != null) {
                return r10.keySet().remove(obj);
            }
            if (pVar.F(obj) != p.B) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return p.this.size();
        }
    }

    /* compiled from: CompactHashMap.java */
    /* loaded from: classes2.dex */
    public final class d extends j7.e<K, V> {

        /* renamed from: s, reason: collision with root package name */
        public final K f30066s;

        /* renamed from: t, reason: collision with root package name */
        public int f30067t;

        public d(int i10) {
            Object obj = p.B;
            this.f30066s = (K) p.this.B(i10);
            this.f30067t = i10;
        }

        @Override // j7.e, java.util.Map.Entry
        public final K getKey() {
            return this.f30066s;
        }

        @Override // j7.e, java.util.Map.Entry
        public final V getValue() {
            p pVar = p.this;
            Map<K, V> r10 = pVar.r();
            if (r10 != null) {
                return r10.get(this.f30066s);
            }
            k();
            int i10 = this.f30067t;
            if (i10 == -1) {
                return null;
            }
            return (V) pVar.N(i10);
        }

        public final void k() {
            int i10 = this.f30067t;
            K k10 = this.f30066s;
            p pVar = p.this;
            if (i10 == -1 || i10 >= pVar.size() || !i7.g.a(k10, pVar.B(this.f30067t))) {
                Object obj = p.B;
                this.f30067t = pVar.y(k10);
            }
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v3) {
            p pVar = p.this;
            Map<K, V> r10 = pVar.r();
            K k10 = this.f30066s;
            if (r10 != null) {
                return r10.put(k10, v3);
            }
            k();
            int i10 = this.f30067t;
            if (i10 == -1) {
                pVar.put(k10, v3);
                return null;
            }
            V v10 = (V) pVar.N(i10);
            pVar.K()[this.f30067t] = v3;
            return v10;
        }
    }

    /* compiled from: CompactHashMap.java */
    /* loaded from: classes2.dex */
    public class e extends AbstractCollection<V> {
        public e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            p.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            p pVar = p.this;
            Map<K, V> r10 = pVar.r();
            if (r10 != null) {
                return r10.values().iterator();
            }
            return new o(pVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return p.this.size();
        }
    }

    public p() {
        z(3);
    }

    public void A(int i10, K k10, V v3, int i11, int i12) {
        G()[i10] = (i11 & (~i12)) | (i12 & 0);
        H()[i10] = k10;
        K()[i10] = v3;
    }

    public final K B(int i10) {
        return (K) H()[i10];
    }

    public void C(int i10, int i11) {
        Object obj = this.f30053s;
        Objects.requireNonNull(obj);
        int[] G = G();
        Object[] H = H();
        Object[] K = K();
        int size = size() - 1;
        if (i10 < size) {
            Object obj2 = H[size];
            H[i10] = obj2;
            K[i10] = K[size];
            H[size] = null;
            K[size] = null;
            G[i10] = G[size];
            G[size] = 0;
            int c10 = f0.c(obj2) & i11;
            int I = r.I(c10, obj);
            int i12 = size + 1;
            if (I == i12) {
                r.J(c10, i10 + 1, obj);
                return;
            }
            while (true) {
                int i13 = I - 1;
                int i14 = G[i13];
                int i15 = i14 & i11;
                if (i15 == i12) {
                    G[i13] = ((i10 + 1) & i11) | (i14 & (~i11));
                    return;
                }
                I = i15;
            }
        } else {
            H[i10] = null;
            K[i10] = null;
            G[i10] = 0;
        }
    }

    public final boolean E() {
        if (this.f30053s == null) {
            return true;
        }
        return false;
    }

    public final Object F(@CheckForNull Object obj) {
        boolean E = E();
        Object obj2 = B;
        if (E) {
            return obj2;
        }
        int i10 = (1 << (this.f30057w & 31)) - 1;
        Object obj3 = this.f30053s;
        Objects.requireNonNull(obj3);
        int G = r.G(obj, null, i10, obj3, G(), H(), null);
        if (G == -1) {
            return obj2;
        }
        V N = N(G);
        C(G, i10);
        this.f30058x--;
        x();
        return N;
    }

    public final int[] G() {
        int[] iArr = this.f30054t;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] H() {
        Object[] objArr = this.f30055u;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] K() {
        Object[] objArr = this.f30056v;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public void L(int i10) {
        this.f30054t = Arrays.copyOf(G(), i10);
        this.f30055u = Arrays.copyOf(H(), i10);
        this.f30056v = Arrays.copyOf(K(), i10);
    }

    public final int M(int i10, int i11, int i12, int i13) {
        Object z10 = r.z(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            r.J(i12 & i14, i13 + 1, z10);
        }
        Object obj = this.f30053s;
        Objects.requireNonNull(obj);
        int[] G = G();
        for (int i15 = 0; i15 <= i10; i15++) {
            int I = r.I(i15, obj);
            while (I != 0) {
                int i16 = I - 1;
                int i17 = G[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int I2 = r.I(i19, z10);
                r.J(i19, I, z10);
                G[i16] = ((~i14) & i18) | (I2 & i14);
                I = i17 & i10;
            }
        }
        this.f30053s = z10;
        this.f30057w = ((32 - Integer.numberOfLeadingZeros(i14)) & 31) | (this.f30057w & (-32));
        return i14;
    }

    public final V N(int i10) {
        return (V) K()[i10];
    }

    public int c(int i10, int i11) {
        return i10 - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (E()) {
            return;
        }
        x();
        Map<K, V> r10 = r();
        if (r10 != null) {
            this.f30057w = l7.a.h0(size(), 3);
            r10.clear();
            this.f30053s = null;
            this.f30058x = 0;
            return;
        }
        Arrays.fill(H(), 0, this.f30058x, (Object) null);
        Arrays.fill(K(), 0, this.f30058x, (Object) null);
        Object obj = this.f30053s;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(G(), 0, this.f30058x, 0);
        this.f30058x = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        Map<K, V> r10 = r();
        if (r10 != null) {
            return r10.containsKey(obj);
        }
        if (y(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(@CheckForNull Object obj) {
        Map<K, V> r10 = r();
        if (r10 != null) {
            return r10.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f30058x; i10++) {
            if (i7.g.a(obj, N(i10))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        a aVar = this.f30059z;
        if (aVar == null) {
            a aVar2 = new a();
            this.f30059z = aVar2;
            return aVar2;
        }
        return aVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final V get(@CheckForNull Object obj) {
        Map<K, V> r10 = r();
        if (r10 != null) {
            return r10.get(obj);
        }
        int y = y(obj);
        if (y == -1) {
            return null;
        }
        b(y);
        return N(y);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public int k() {
        i7.f.f(E(), "Arrays already allocated");
        int i10 = this.f30057w;
        int max = Math.max(i10 + 1, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max > ((int) (highestOneBit * 1.0d))) {
            int i11 = highestOneBit << 1;
            if (i11 <= 0) {
                i11 = 1073741824;
            }
            highestOneBit = i11;
        }
        int max2 = Math.max(4, highestOneBit);
        this.f30053s = r.z(max2);
        this.f30057w = ((32 - Integer.numberOfLeadingZeros(max2 - 1)) & 31) | (this.f30057w & (-32));
        this.f30054t = new int[i10];
        this.f30055u = new Object[i10];
        this.f30056v = new Object[i10];
        return i10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        c cVar = this.y;
        if (cVar == null) {
            c cVar2 = new c();
            this.y = cVar2;
            return cVar2;
        }
        return cVar;
    }

    public Map<K, V> p() {
        LinkedHashMap q10 = q(((1 << (this.f30057w & 31)) - 1) + 1);
        int u2 = u();
        while (u2 >= 0) {
            q10.put(B(u2), N(u2));
            u2 = v(u2);
        }
        this.f30053s = q10;
        this.f30054t = null;
        this.f30055u = null;
        this.f30056v = null;
        x();
        return q10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final V put(K k10, V v3) {
        int i10;
        int M;
        int length;
        int min;
        int i11;
        if (E()) {
            k();
        }
        Map<K, V> r10 = r();
        if (r10 != null) {
            return r10.put(k10, v3);
        }
        int[] G = G();
        Object[] H = H();
        Object[] K = K();
        int i12 = this.f30058x;
        int i13 = i12 + 1;
        int c10 = f0.c(k10);
        int i14 = (1 << (this.f30057w & 31)) - 1;
        int i15 = c10 & i14;
        Object obj = this.f30053s;
        Objects.requireNonNull(obj);
        int I = r.I(i15, obj);
        if (I == 0) {
            if (i13 > i14) {
                if (i14 < 32) {
                    i11 = 4;
                } else {
                    i11 = 2;
                }
                M = M(i14, (i14 + 1) * i11, c10, i12);
                i14 = M;
                length = G().length;
                if (i13 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
                    L(min);
                }
                A(i12, k10, v3, c10, i14);
                this.f30058x = i13;
                x();
                return null;
            }
            Object obj2 = this.f30053s;
            Objects.requireNonNull(obj2);
            r.J(i15, i13, obj2);
            length = G().length;
            if (i13 > length) {
                L(min);
            }
            A(i12, k10, v3, c10, i14);
            this.f30058x = i13;
            x();
            return null;
        }
        int i16 = ~i14;
        int i17 = c10 & i16;
        int i18 = 0;
        while (true) {
            int i19 = I - 1;
            int i20 = G[i19];
            int i21 = i20 & i16;
            if (i21 == i17 && i7.g.a(k10, H[i19])) {
                V v10 = (V) K[i19];
                K[i19] = v3;
                b(i19);
                return v10;
            }
            int i22 = i20 & i14;
            Object[] objArr = H;
            int i23 = i18 + 1;
            if (i22 == 0) {
                if (i23 >= 9) {
                    return p().put(k10, v3);
                }
                if (i13 > i14) {
                    if (i14 < 32) {
                        i10 = 4;
                    } else {
                        i10 = 2;
                    }
                    M = M(i14, (i14 + 1) * i10, c10, i12);
                } else {
                    G[i19] = (i13 & i14) | i21;
                }
            } else {
                i18 = i23;
                I = i22;
                H = objArr;
            }
        }
    }

    public LinkedHashMap q(int i10) {
        return new LinkedHashMap(i10, 1.0f);
    }

    @CheckForNull
    public final Map<K, V> r() {
        Object obj = this.f30053s;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final V remove(@CheckForNull Object obj) {
        Map<K, V> r10 = r();
        if (r10 != null) {
            return r10.remove(obj);
        }
        V v3 = (V) F(obj);
        if (v3 == B) {
            return null;
        }
        return v3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map<K, V> r10 = r();
        if (r10 != null) {
            return r10.size();
        }
        return this.f30058x;
    }

    public int u() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    public int v(int i10) {
        int i11 = i10 + 1;
        if (i11 >= this.f30058x) {
            return -1;
        }
        return i11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        e eVar = this.A;
        if (eVar == null) {
            e eVar2 = new e();
            this.A = eVar2;
            return eVar2;
        }
        return eVar;
    }

    public final void x() {
        this.f30057w += 32;
    }

    public final int y(@CheckForNull Object obj) {
        if (E()) {
            return -1;
        }
        int c10 = f0.c(obj);
        int i10 = (1 << (this.f30057w & 31)) - 1;
        Object obj2 = this.f30053s;
        Objects.requireNonNull(obj2);
        int I = r.I(c10 & i10, obj2);
        if (I == 0) {
            return -1;
        }
        int i11 = ~i10;
        int i12 = c10 & i11;
        do {
            int i13 = I - 1;
            int i14 = G()[i13];
            if ((i14 & i11) == i12 && i7.g.a(obj, B(i13))) {
                return i13;
            }
            I = i14 & i10;
        } while (I != 0);
        return -1;
    }

    public void z(int i10) {
        boolean z10;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f30057w = l7.a.h0(i10, 1);
            return;
        }
        throw new IllegalArgumentException("Expected size must be >= 0");
    }

    public p(int i10) {
        z(i10);
    }

    public void b(int i10) {
    }
}
