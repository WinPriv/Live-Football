package j7;

import j7.j0;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: RegularImmutableSortedSet.java */
/* loaded from: classes2.dex */
public final class y1<E> extends u0<E> {

    /* renamed from: z, reason: collision with root package name */
    public static final y1<Comparable> f30149z;
    public final transient j0<E> y;

    static {
        j0.b bVar = j0.f30006t;
        f30149z = new y1<>(v1.f30113w, t1.f30103s);
    }

    public y1(j0<E> j0Var, Comparator<? super E> comparator) {
        super(comparator);
        this.y = j0Var;
    }

    @Override // j7.v0, j7.t0, j7.g0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: A */
    public final t2<E> iterator() {
        return this.y.listIterator(0);
    }

    @Override // j7.u0
    public final y1 H() {
        Comparator reverseOrder = Collections.reverseOrder(this.f30106v);
        if (isEmpty()) {
            return u0.L(reverseOrder);
        }
        return new y1(this.y.H(), reverseOrder);
    }

    @Override // j7.u0, java.util.NavigableSet
    /* renamed from: K */
    public final j0.b descendingIterator() {
        return this.y.H().listIterator(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j7.u0
    public final y1 M(Object obj, boolean z10) {
        return P(0, Q(obj, z10));
    }

    @Override // j7.u0
    public final y1 N(Object obj, boolean z10, Object obj2, boolean z11) {
        y1 O = O(obj, z10);
        return O.P(0, O.Q(obj2, z11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j7.u0
    public final y1 O(Object obj, boolean z10) {
        return P(R(obj, z10), size());
    }

    public final y1<E> P(int i10, int i11) {
        if (i10 == 0 && i11 == size()) {
            return this;
        }
        Comparator<? super E> comparator = this.f30106v;
        if (i10 < i11) {
            return new y1<>(this.y.subList(i10, i11), comparator);
        }
        return u0.L(comparator);
    }

    public final int Q(E e10, boolean z10) {
        e10.getClass();
        int binarySearch = Collections.binarySearch(this.y, e10, this.f30106v);
        if (binarySearch >= 0) {
            if (z10) {
                return binarySearch + 1;
            }
            return binarySearch;
        }
        return ~binarySearch;
    }

    public final int R(E e10, boolean z10) {
        e10.getClass();
        int binarySearch = Collections.binarySearch(this.y, e10, this.f30106v);
        if (binarySearch >= 0) {
            if (!z10) {
                return binarySearch + 1;
            }
            return binarySearch;
        }
        return ~binarySearch;
    }

    @Override // j7.u0, java.util.NavigableSet
    @CheckForNull
    public final E ceiling(E e10) {
        int R = R(e10, true);
        if (R == size()) {
            return null;
        }
        return this.y.get(R);
    }

    @Override // j7.g0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            if (Collections.binarySearch(this.y, obj, this.f30106v) < 0) {
                return false;
            }
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        if (collection instanceof s1) {
            collection = ((s1) collection).k();
        }
        Comparator<? super E> comparator = this.f30106v;
        if (r.E(comparator, collection) && collection.size() > 1) {
            t2<E> it = iterator();
            Iterator<?> it2 = collection.iterator();
            a aVar = (a) it;
            if (!aVar.hasNext()) {
                return false;
            }
            a0.a aVar2 = (Object) it2.next();
            a0.a aVar3 = (Object) aVar.next();
            while (true) {
                try {
                    int compare = comparator.compare(aVar3, aVar2);
                    if (compare < 0) {
                        if (!aVar.hasNext()) {
                            return false;
                        }
                        aVar3 = (Object) aVar.next();
                    } else if (compare == 0) {
                        if (!it2.hasNext()) {
                            return true;
                        }
                        aVar2 = (Object) it2.next();
                    } else if (compare > 0) {
                        break;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        } else {
            return super.containsAll(collection);
        }
        return false;
    }

    @Override // j7.t0, java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        a0.a aVar;
        E next;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        Comparator<? super E> comparator = this.f30106v;
        if (r.E(comparator, set)) {
            Iterator<E> it = set.iterator();
            try {
                t2<E> it2 = iterator();
                do {
                    a aVar2 = (a) it2;
                    if (!aVar2.hasNext()) {
                        return true;
                    }
                    aVar = (Object) aVar2.next();
                    next = it.next();
                    if (next == null) {
                        break;
                    }
                } while (comparator.compare(aVar, next) == 0);
                return false;
            } catch (ClassCastException | NoSuchElementException unused) {
                return false;
            }
        }
        return containsAll(set);
    }

    @Override // j7.u0, java.util.SortedSet
    public final E first() {
        if (!isEmpty()) {
            return this.y.get(0);
        }
        throw new NoSuchElementException();
    }

    @Override // j7.u0, java.util.NavigableSet
    @CheckForNull
    public final E floor(E e10) {
        int Q = Q(e10, true) - 1;
        if (Q == -1) {
            return null;
        }
        return this.y.get(Q);
    }

    @Override // j7.u0, java.util.NavigableSet
    @CheckForNull
    public final E higher(E e10) {
        int R = R(e10, false);
        if (R == size()) {
            return null;
        }
        return this.y.get(R);
    }

    @Override // j7.u0, java.util.SortedSet
    public final E last() {
        if (!isEmpty()) {
            return this.y.get(size() - 1);
        }
        throw new NoSuchElementException();
    }

    @Override // j7.u0, java.util.NavigableSet
    @CheckForNull
    public final E lower(E e10) {
        int Q = Q(e10, false) - 1;
        if (Q == -1) {
            return null;
        }
        return this.y.get(Q);
    }

    @Override // j7.t0, j7.g0
    public final j0<E> p() {
        return this.y;
    }

    @Override // j7.g0
    public final int q(int i10, Object[] objArr) {
        return this.y.q(i10, objArr);
    }

    @Override // j7.g0
    @CheckForNull
    public final Object[] r() {
        return this.y.r();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.y.size();
    }

    @Override // j7.g0
    public final int u() {
        return this.y.u();
    }

    @Override // j7.g0
    public final int v() {
        return this.y.v();
    }

    @Override // j7.g0
    public final boolean x() {
        return this.y.x();
    }
}
