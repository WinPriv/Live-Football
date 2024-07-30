package j7;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: CompactHashSet.java */
/* loaded from: classes2.dex */
public class q<E> extends AbstractSet<E> implements Serializable {

    /* renamed from: s, reason: collision with root package name */
    @CheckForNull
    public transient Object f30079s;

    /* renamed from: t, reason: collision with root package name */
    @CheckForNull
    public transient int[] f30080t;

    /* renamed from: u, reason: collision with root package name */
    @CheckForNull
    public transient Object[] f30081u;

    /* renamed from: v, reason: collision with root package name */
    public transient int f30082v;

    /* renamed from: w, reason: collision with root package name */
    public transient int f30083w;

    /* compiled from: CompactHashSet.java */
    /* loaded from: classes2.dex */
    public class a implements Iterator<E> {

        /* renamed from: s, reason: collision with root package name */
        public int f30084s;

        /* renamed from: t, reason: collision with root package name */
        public int f30085t;

        /* renamed from: u, reason: collision with root package name */
        public int f30086u = -1;

        public a() {
            this.f30084s = q.this.f30082v;
            this.f30085t = q.this.u();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f30085t >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final E next() {
            q qVar = q.this;
            if (qVar.f30082v == this.f30084s) {
                if (hasNext()) {
                    int i10 = this.f30085t;
                    this.f30086u = i10;
                    E e10 = (E) qVar.C()[i10];
                    this.f30085t = qVar.v(this.f30085t);
                    return e10;
                }
                throw new NoSuchElementException();
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            boolean z10;
            q qVar = q.this;
            if (qVar.f30082v == this.f30084s) {
                if (this.f30086u >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i7.f.f(z10, "no calls to next() since the last call to remove()");
                this.f30084s += 32;
                qVar.remove(qVar.C()[this.f30086u]);
                this.f30085t = qVar.a(this.f30085t, this.f30086u);
                this.f30086u = -1;
                return;
            }
            throw new ConcurrentModificationException();
        }
    }

    public q(int i10) {
        w(i10);
    }

    public final boolean A() {
        if (this.f30079s == null) {
            return true;
        }
        return false;
    }

    public final Object[] C() {
        Object[] objArr = this.f30081u;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int[] E() {
        int[] iArr = this.f30080t;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public void F(int i10) {
        this.f30080t = Arrays.copyOf(E(), i10);
        this.f30081u = Arrays.copyOf(C(), i10);
    }

    public final int G(int i10, int i11, int i12, int i13) {
        Object z10 = r.z(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            r.J(i12 & i14, i13 + 1, z10);
        }
        Object obj = this.f30079s;
        Objects.requireNonNull(obj);
        int[] E = E();
        for (int i15 = 0; i15 <= i10; i15++) {
            int I = r.I(i15, obj);
            while (I != 0) {
                int i16 = I - 1;
                int i17 = E[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int I2 = r.I(i19, z10);
                r.J(i19, I, z10);
                E[i16] = ((~i14) & i18) | (I2 & i14);
                I = i17 & i10;
            }
        }
        this.f30079s = z10;
        this.f30082v = ((32 - Integer.numberOfLeadingZeros(i14)) & 31) | (this.f30082v & (-32));
        return i14;
    }

    public int a(int i10, int i11) {
        return i10 - 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e10) {
        int i10;
        int min;
        int i11;
        if (A()) {
            p();
        }
        Set<E> r10 = r();
        if (r10 != null) {
            return r10.add(e10);
        }
        int[] E = E();
        Object[] C = C();
        int i12 = this.f30083w;
        int i13 = i12 + 1;
        int c10 = f0.c(e10);
        int i14 = (1 << (this.f30082v & 31)) - 1;
        int i15 = c10 & i14;
        Object obj = this.f30079s;
        Objects.requireNonNull(obj);
        int I = r.I(i15, obj);
        if (I == 0) {
            if (i13 > i14) {
                if (i14 < 32) {
                    i11 = 4;
                } else {
                    i11 = 2;
                }
                i14 = G(i14, (i14 + 1) * i11, c10, i12);
            } else {
                Object obj2 = this.f30079s;
                Objects.requireNonNull(obj2);
                r.J(i15, i13, obj2);
            }
        } else {
            int i16 = ~i14;
            int i17 = c10 & i16;
            boolean z10 = false;
            int i18 = 0;
            while (true) {
                int i19 = I - 1;
                int i20 = E[i19];
                int i21 = i20 & i16;
                if (i21 == i17 && i7.g.a(e10, C[i19])) {
                    return z10;
                }
                int i22 = i20 & i14;
                int i23 = i18 + 1;
                if (i22 == 0) {
                    if (i23 >= 9) {
                        return q().add(e10);
                    }
                    if (i13 > i14) {
                        if (i14 < 32) {
                            i10 = 4;
                        } else {
                            i10 = 2;
                        }
                        i14 = G(i14, (i14 + 1) * i10, c10, i12);
                    } else {
                        E[i19] = (i13 & i14) | i21;
                    }
                } else {
                    I = i22;
                    i18 = i23;
                    z10 = false;
                }
            }
        }
        int length = E().length;
        if (i13 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            F(min);
        }
        x(i12, c10, i14, e10);
        this.f30083w = i13;
        this.f30082v += 32;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (A()) {
            return;
        }
        this.f30082v += 32;
        Set<E> r10 = r();
        if (r10 != null) {
            this.f30082v = l7.a.h0(size(), 3);
            r10.clear();
            this.f30079s = null;
            this.f30083w = 0;
            return;
        }
        Arrays.fill(C(), 0, this.f30083w, (Object) null);
        Object obj = this.f30079s;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(E(), 0, this.f30083w, 0);
        this.f30083w = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        if (A()) {
            return false;
        }
        Set<E> r10 = r();
        if (r10 != null) {
            return r10.contains(obj);
        }
        int c10 = f0.c(obj);
        int i10 = (1 << (this.f30082v & 31)) - 1;
        Object obj2 = this.f30079s;
        Objects.requireNonNull(obj2);
        int I = r.I(c10 & i10, obj2);
        if (I == 0) {
            return false;
        }
        int i11 = ~i10;
        int i12 = c10 & i11;
        do {
            int i13 = I - 1;
            int i14 = E()[i13];
            if ((i14 & i11) == i12 && i7.g.a(obj, C()[i13])) {
                return true;
            }
            I = i14 & i10;
        } while (I != 0);
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        Set<E> r10 = r();
        if (r10 != null) {
            return r10.iterator();
        }
        return new a();
    }

    public int p() {
        i7.f.f(A(), "Arrays already allocated");
        int i10 = this.f30082v;
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
        this.f30079s = r.z(max2);
        this.f30082v = ((32 - Integer.numberOfLeadingZeros(max2 - 1)) & 31) | (this.f30082v & (-32));
        this.f30080t = new int[i10];
        this.f30081u = new Object[i10];
        return i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LinkedHashSet q() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(((1 << (this.f30082v & 31)) - 1) + 1, 1.0f);
        int u2 = u();
        while (u2 >= 0) {
            linkedHashSet.add(C()[u2]);
            u2 = v(u2);
        }
        this.f30079s = linkedHashSet;
        this.f30080t = null;
        this.f30081u = null;
        this.f30082v += 32;
        return linkedHashSet;
    }

    @CheckForNull
    public final Set<E> r() {
        Object obj = this.f30079s;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        if (A()) {
            return false;
        }
        Set<E> r10 = r();
        if (r10 != null) {
            return r10.remove(obj);
        }
        int i10 = (1 << (this.f30082v & 31)) - 1;
        Object obj2 = this.f30079s;
        Objects.requireNonNull(obj2);
        int G = r.G(obj, null, i10, obj2, E(), C(), null);
        if (G == -1) {
            return false;
        }
        y(G, i10);
        this.f30083w--;
        this.f30082v += 32;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Set<E> r10 = r();
        if (r10 != null) {
            return r10.size();
        }
        return this.f30083w;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        if (A()) {
            return new Object[0];
        }
        Set<E> r10 = r();
        return r10 != null ? r10.toArray() : Arrays.copyOf(C(), this.f30083w);
    }

    public int u() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    public int v(int i10) {
        int i11 = i10 + 1;
        if (i11 >= this.f30083w) {
            return -1;
        }
        return i11;
    }

    public void w(int i10) {
        boolean z10;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f30082v = l7.a.h0(i10, 1);
            return;
        }
        throw new IllegalArgumentException("Expected size must be >= 0");
    }

    public void x(int i10, int i11, int i12, Object obj) {
        E()[i10] = (i11 & (~i12)) | (i12 & 0);
        C()[i10] = obj;
    }

    public void y(int i10, int i11) {
        Object obj = this.f30079s;
        Objects.requireNonNull(obj);
        int[] E = E();
        Object[] C = C();
        int size = size() - 1;
        if (i10 < size) {
            Object obj2 = C[size];
            C[i10] = obj2;
            C[size] = null;
            E[i10] = E[size];
            E[size] = 0;
            int c10 = f0.c(obj2) & i11;
            int I = r.I(c10, obj);
            int i12 = size + 1;
            if (I == i12) {
                r.J(c10, i10 + 1, obj);
                return;
            }
            while (true) {
                int i13 = I - 1;
                int i14 = E[i13];
                int i15 = i14 & i11;
                if (i15 == i12) {
                    E[i13] = ((i10 + 1) & i11) | (i14 & (~i11));
                    return;
                }
                I = i15;
            }
        } else {
            C[i10] = null;
            E[i10] = 0;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (A()) {
            if (tArr.length > 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        Set<E> r10 = r();
        if (r10 != null) {
            return (T[]) r10.toArray(tArr);
        }
        Object[] C = C();
        int i10 = this.f30083w;
        i7.f.e(0, i10 + 0, C.length);
        if (tArr.length < i10) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i10));
        } else if (tArr.length > i10) {
            tArr[i10] = null;
        }
        System.arraycopy(C, 0, tArr, 0, i10);
        return tArr;
    }
}
