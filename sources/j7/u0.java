package j7;

import j7.j0;
import j7.t0;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* compiled from: ImmutableSortedSet.java */
/* loaded from: classes2.dex */
public abstract class u0<E> extends v0<E> implements NavigableSet<E>, i2<E> {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f30105x = 0;

    /* renamed from: v, reason: collision with root package name */
    public final transient Comparator<? super E> f30106v;

    /* renamed from: w, reason: collision with root package name */
    @CheckForNull
    public transient u0<E> f30107w;

    /* compiled from: ImmutableSortedSet.java */
    /* loaded from: classes2.dex */
    public static final class a<E> extends t0.a<E> {

        /* renamed from: d, reason: collision with root package name */
        public final Comparator<? super E> f30108d;

        public a(Comparator<? super E> comparator) {
            comparator.getClass();
            this.f30108d = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // j7.t0.a
        public final t0.a d(Object obj) {
            super.d(obj);
            return this;
        }

        public final void e(Object obj) {
            obj.getClass();
            b(obj);
        }

        public final y1 f() {
            y1 y1Var;
            Object[] objArr = this.f29954a;
            int i10 = this.f29955b;
            Comparator<? super E> comparator = this.f30108d;
            if (i10 == 0) {
                y1Var = u0.L(comparator);
            } else {
                f0.a(i10, objArr);
                Arrays.sort(objArr, 0, i10, comparator);
                int i11 = 1;
                for (int i12 = 1; i12 < i10; i12++) {
                    Object obj = objArr[i12];
                    if (comparator.compare(obj, objArr[i11 - 1]) != 0) {
                        objArr[i11] = obj;
                        i11++;
                    }
                }
                Arrays.fill(objArr, i11, i10, (Object) null);
                if (i11 < objArr.length / 2) {
                    objArr = Arrays.copyOf(objArr, i11);
                }
                y1Var = new y1(j0.B(i11, objArr), comparator);
            }
            this.f29955b = y1Var.size();
            this.f29956c = true;
            return y1Var;
        }
    }

    public u0(Comparator<? super E> comparator) {
        this.f30106v = comparator;
    }

    public static <E> y1<E> L(Comparator<? super E> comparator) {
        if (t1.f30103s.equals(comparator)) {
            return (y1<E>) y1.f30149z;
        }
        return new y1<>(v1.f30113w, comparator);
    }

    public abstract y1 H();

    @Override // java.util.NavigableSet
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public abstract j0.b descendingIterator();

    public abstract y1 M(Object obj, boolean z10);

    public abstract y1 N(Object obj, boolean z10, Object obj2, boolean z11);

    public abstract y1 O(Object obj, boolean z10);

    @Override // java.util.NavigableSet
    @CheckForNull
    public E ceiling(E e10) {
        e10.getClass();
        return (E) b1.c(O(e10, true).iterator(), null);
    }

    @Override // java.util.SortedSet, j7.i2
    public final Comparator<? super E> comparator() {
        return this.f30106v;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        u0<E> u0Var = this.f30107w;
        if (u0Var == null) {
            y1 H = H();
            this.f30107w = H;
            H.f30107w = this;
            return H;
        }
        return u0Var;
    }

    @Override // java.util.SortedSet
    public E first() {
        return iterator().next();
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public E floor(E e10) {
        e10.getClass();
        return (E) b1.c(M(e10, true).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z10) {
        obj.getClass();
        return M(obj, z10);
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public E higher(E e10) {
        e10.getClass();
        return (E) b1.c(O(e10, false).iterator(), null);
    }

    @Override // java.util.SortedSet
    public E last() {
        return descendingIterator().next();
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public E lower(E e10) {
        e10.getClass();
        return (E) b1.c(M(e10, false).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    @Deprecated
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    @Deprecated
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        obj.getClass();
        obj2.getClass();
        if (this.f30106v.compare(obj, obj2) <= 0) {
            return N(obj, z10, obj2, z11);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z10) {
        obj.getClass();
        return O(obj, z10);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        return M(obj, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        return O(obj, true);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        if (this.f30106v.compare(obj, obj2) <= 0) {
            return N(obj, true, obj2, false);
        }
        throw new IllegalArgumentException();
    }
}
