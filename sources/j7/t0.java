package j7;

import com.google.j2objc.annotations.RetainedWith;
import j7.g0;
import j7.j0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* compiled from: ImmutableSet.java */
/* loaded from: classes2.dex */
public abstract class t0<E> extends g0<E> implements Set<E> {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f30101u = 0;

    /* renamed from: t, reason: collision with root package name */
    @RetainedWith
    @CheckForNull
    public transient j0<E> f30102t;

    /* compiled from: ImmutableSet.java */
    /* loaded from: classes2.dex */
    public static class a<E> extends g0.a<E> {
        public a<E> d(E e10) {
            e10.getClass();
            b(e10);
            return this;
        }
    }

    public static int B(int i10) {
        int max = Math.max(i10, 2);
        boolean z10 = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z10 = false;
        }
        if (z10) {
            return 1073741824;
        }
        throw new IllegalArgumentException("collection too large");
    }

    public static <E> t0<E> C(int i10, Object... objArr) {
        if (i10 != 0) {
            boolean z10 = false;
            if (i10 != 1) {
                int B = B(i10);
                Object[] objArr2 = new Object[B];
                int i11 = B - 1;
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < i10; i14++) {
                    Object obj = objArr[i14];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int b10 = f0.b(hashCode);
                        while (true) {
                            int i15 = b10 & i11;
                            Object obj2 = objArr2[i15];
                            if (obj2 == null) {
                                objArr[i13] = obj;
                                objArr2[i15] = obj;
                                i12 += hashCode;
                                i13++;
                                break;
                            }
                            if (obj2.equals(obj)) {
                                break;
                            }
                            b10++;
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder(20);
                        sb2.append("at index ");
                        sb2.append(i14);
                        throw new NullPointerException(sb2.toString());
                    }
                }
                Arrays.fill(objArr, i13, i10, (Object) null);
                if (i13 == 1) {
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    return new g2(obj3);
                }
                if (B(i13) < B / 2) {
                    return C(i13, objArr);
                }
                int length = objArr.length;
                if (i13 < (length >> 1) + (length >> 2)) {
                    z10 = true;
                }
                if (z10) {
                    objArr = Arrays.copyOf(objArr, i13);
                }
                return new x1(objArr, i12, objArr2, i11, i13);
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new g2(obj4);
        }
        return x1.B;
    }

    public static <E> t0<E> D(Collection<? extends E> collection) {
        if ((collection instanceof t0) && !(collection instanceof SortedSet)) {
            t0<E> t0Var = (t0) collection;
            if (!t0Var.x()) {
                return t0Var;
            }
        }
        Object[] array = collection.toArray();
        return C(array.length, array);
    }

    public static <E> t0<E> G(E e10, E e11, E e12) {
        return C(3, e10, e11, e12);
    }

    public j0<E> E() {
        Object[] array = toArray();
        j0.b bVar = j0.f30006t;
        return j0.B(array.length, array);
    }

    public boolean F() {
        return this instanceof i0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof t0) && F() && ((t0) obj).F() && hashCode() != obj.hashCode()) {
            return false;
        }
        return f2.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return f2.c(this);
    }

    @Override // j7.g0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // j7.g0
    public j0<E> p() {
        j0<E> j0Var = this.f30102t;
        if (j0Var == null) {
            j0<E> E = E();
            this.f30102t = E;
            return E;
        }
        return j0Var;
    }
}
