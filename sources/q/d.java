package q;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import q.h;

/* compiled from: ArraySet.java */
/* loaded from: classes.dex */
public final class d<E> implements Collection<E>, Set<E> {
    public static Object[] A;
    public static int B;

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f34508w = new int[0];

    /* renamed from: x, reason: collision with root package name */
    public static final Object[] f34509x = new Object[0];
    public static Object[] y;

    /* renamed from: z, reason: collision with root package name */
    public static int f34510z;

    /* renamed from: s, reason: collision with root package name */
    public int[] f34511s;

    /* renamed from: t, reason: collision with root package name */
    public Object[] f34512t;

    /* renamed from: u, reason: collision with root package name */
    public int f34513u;

    /* renamed from: v, reason: collision with root package name */
    public c f34514v;

    public d() {
        this(0);
    }

    public static void b(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (d.class) {
                if (B < 10) {
                    objArr[0] = A;
                    objArr[1] = iArr;
                    for (int i11 = i10 - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    A = objArr;
                    B++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (d.class) {
                if (f34510z < 10) {
                    objArr[0] = y;
                    objArr[1] = iArr;
                    for (int i12 = i10 - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    y = objArr;
                    f34510z++;
                }
            }
        }
    }

    public final void a(int i10) {
        if (i10 == 8) {
            synchronized (d.class) {
                Object[] objArr = A;
                if (objArr != null) {
                    this.f34512t = objArr;
                    A = (Object[]) objArr[0];
                    this.f34511s = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    B--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (d.class) {
                Object[] objArr2 = y;
                if (objArr2 != null) {
                    this.f34512t = objArr2;
                    y = (Object[]) objArr2[0];
                    this.f34511s = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f34510z--;
                    return;
                }
            }
        }
        this.f34511s = new int[i10];
        this.f34512t = new Object[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(E e10) {
        int i10;
        int c10;
        if (e10 == null) {
            c10 = d();
            i10 = 0;
        } else {
            int hashCode = e10.hashCode();
            i10 = hashCode;
            c10 = c(hashCode, e10);
        }
        if (c10 >= 0) {
            return false;
        }
        int i11 = ~c10;
        int i12 = this.f34513u;
        int[] iArr = this.f34511s;
        if (i12 >= iArr.length) {
            int i13 = 8;
            if (i12 >= 8) {
                i13 = (i12 >> 1) + i12;
            } else if (i12 < 4) {
                i13 = 4;
            }
            Object[] objArr = this.f34512t;
            a(i13);
            int[] iArr2 = this.f34511s;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f34512t, 0, objArr.length);
            }
            b(iArr, objArr, this.f34513u);
        }
        int i14 = this.f34513u;
        if (i11 < i14) {
            int[] iArr3 = this.f34511s;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr2 = this.f34512t;
            System.arraycopy(objArr2, i11, objArr2, i15, this.f34513u - i11);
        }
        this.f34511s[i11] = i10;
        this.f34512t[i11] = e10;
        this.f34513u++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        int size = collection.size() + this.f34513u;
        int[] iArr = this.f34511s;
        boolean z10 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f34512t;
            a(size);
            int i10 = this.f34513u;
            if (i10 > 0) {
                System.arraycopy(iArr, 0, this.f34511s, 0, i10);
                System.arraycopy(objArr, 0, this.f34512t, 0, this.f34513u);
            }
            b(iArr, objArr, this.f34513u);
        }
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            z10 |= add(it.next());
        }
        return z10;
    }

    public final int c(int i10, Object obj) {
        int i11 = this.f34513u;
        if (i11 == 0) {
            return -1;
        }
        int c10 = e.c(i11, i10, this.f34511s);
        if (c10 < 0) {
            return c10;
        }
        if (obj.equals(this.f34512t[c10])) {
            return c10;
        }
        int i12 = c10 + 1;
        while (i12 < i11 && this.f34511s[i12] == i10) {
            if (obj.equals(this.f34512t[i12])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = c10 - 1; i13 >= 0 && this.f34511s[i13] == i10; i13--) {
            if (obj.equals(this.f34512t[i13])) {
                return i13;
            }
        }
        return ~i12;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i10 = this.f34513u;
        if (i10 != 0) {
            b(this.f34511s, this.f34512t, i10);
            this.f34511s = f34508w;
            this.f34512t = f34509x;
            this.f34513u = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int d() {
        int i10 = this.f34513u;
        if (i10 == 0) {
            return -1;
        }
        int c10 = e.c(i10, 0, this.f34511s);
        if (c10 < 0) {
            return c10;
        }
        if (this.f34512t[c10] == null) {
            return c10;
        }
        int i11 = c10 + 1;
        while (i11 < i10 && this.f34511s[i11] == 0) {
            if (this.f34512t[i11] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = c10 - 1; i12 >= 0 && this.f34511s[i12] == 0; i12--) {
            if (this.f34512t[i12] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public final void e(int i10) {
        Object[] objArr = this.f34512t;
        Object obj = objArr[i10];
        int i11 = this.f34513u;
        if (i11 <= 1) {
            b(this.f34511s, objArr, i11);
            this.f34511s = f34508w;
            this.f34512t = f34509x;
            this.f34513u = 0;
            return;
        }
        int[] iArr = this.f34511s;
        int i12 = 8;
        if (iArr.length > 8 && i11 < iArr.length / 3) {
            if (i11 > 8) {
                i12 = i11 + (i11 >> 1);
            }
            a(i12);
            this.f34513u--;
            if (i10 > 0) {
                System.arraycopy(iArr, 0, this.f34511s, 0, i10);
                System.arraycopy(objArr, 0, this.f34512t, 0, i10);
            }
            int i13 = this.f34513u;
            if (i10 < i13) {
                int i14 = i10 + 1;
                System.arraycopy(iArr, i14, this.f34511s, i10, i13 - i10);
                System.arraycopy(objArr, i14, this.f34512t, i10, this.f34513u - i10);
                return;
            }
            return;
        }
        int i15 = i11 - 1;
        this.f34513u = i15;
        if (i10 < i15) {
            int i16 = i10 + 1;
            System.arraycopy(iArr, i16, iArr, i10, i15 - i10);
            Object[] objArr2 = this.f34512t;
            System.arraycopy(objArr2, i16, objArr2, i10, this.f34513u - i10);
        }
        this.f34512t[this.f34513u] = null;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f34513u != set.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f34513u; i10++) {
                try {
                    if (!set.contains(this.f34512t[i10])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f34511s;
        int i10 = this.f34513u;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    public final int indexOf(Object obj) {
        if (obj == null) {
            return d();
        }
        return c(obj.hashCode(), obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        if (this.f34513u <= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        if (this.f34514v == null) {
            this.f34514v = new c(this);
        }
        c cVar = this.f34514v;
        if (cVar.f34528b == null) {
            cVar.f34528b = new h.c();
        }
        return (Iterator<E>) cVar.f34528b.iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            e(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= remove(it.next());
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        boolean z10 = false;
        for (int i10 = this.f34513u - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.f34512t[i10])) {
                e(i10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f34513u;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i10 = this.f34513u;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.f34512t, 0, objArr, 0, i10);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb2 = new StringBuilder(this.f34513u * 14);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f34513u; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object obj = this.f34512t[i10];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public d(int i10) {
        if (i10 == 0) {
            this.f34511s = f34508w;
            this.f34512t = f34509x;
        } else {
            a(i10);
        }
        this.f34513u = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f34513u) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f34513u));
        }
        System.arraycopy(this.f34512t, 0, tArr, 0, this.f34513u);
        int length = tArr.length;
        int i10 = this.f34513u;
        if (length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }
}
