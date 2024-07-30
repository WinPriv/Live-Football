package j7;

import j7.g0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* compiled from: ImmutableList.java */
/* loaded from: classes2.dex */
public abstract class j0<E> extends g0<E> implements List<E>, RandomAccess {

    /* renamed from: t, reason: collision with root package name */
    public static final b f30006t = new b(0, v1.f30113w);

    /* compiled from: ImmutableList.java */
    /* loaded from: classes2.dex */
    public static final class a<E> extends g0.a<E> {
        public final void d(List list) {
            if (list instanceof Collection) {
                List list2 = list;
                c(list2.size() + this.f29955b);
                if (list2 instanceof g0) {
                    this.f29955b = ((g0) list2).q(this.f29955b, this.f29954a);
                    return;
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                b(it.next());
            }
        }

        public final v1 e() {
            this.f29956c = true;
            return j0.B(this.f29955b, this.f29954a);
        }
    }

    /* compiled from: ImmutableList.java */
    /* loaded from: classes2.dex */
    public static class b<E> extends j7.a<E> {

        /* renamed from: u, reason: collision with root package name */
        public final j0<E> f30007u;

        public b(int i10, j0 j0Var) {
            super(j0Var.size(), i10);
            this.f30007u = j0Var;
        }

        @Override // j7.a
        public final E b(int i10) {
            return this.f30007u.get(i10);
        }
    }

    /* compiled from: ImmutableList.java */
    /* loaded from: classes2.dex */
    public static class c<E> extends j0<E> {

        /* renamed from: u, reason: collision with root package name */
        public final transient j0<E> f30008u;

        public c(j0<E> j0Var) {
            this.f30008u = j0Var;
        }

        @Override // j7.j0
        public final j0<E> H() {
            return this.f30008u;
        }

        @Override // j7.j0, java.util.List
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public final j0<E> subList(int i10, int i11) {
            i7.f.e(i10, i11, size());
            return this.f30008u.subList(size() - i11, size() - i10).H();
        }

        @Override // j7.j0, j7.g0, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@CheckForNull Object obj) {
            return this.f30008u.contains(obj);
        }

        @Override // java.util.List
        public final E get(int i10) {
            i7.f.b(i10, size());
            return this.f30008u.get((size() - 1) - i10);
        }

        @Override // j7.j0, java.util.List
        public final int indexOf(@CheckForNull Object obj) {
            int lastIndexOf = this.f30008u.lastIndexOf(obj);
            if (lastIndexOf < 0) {
                return -1;
            }
            return (size() - 1) - lastIndexOf;
        }

        @Override // j7.j0, j7.g0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return listIterator(0);
        }

        @Override // j7.j0, java.util.List
        public final int lastIndexOf(@CheckForNull Object obj) {
            int indexOf = this.f30008u.indexOf(obj);
            if (indexOf < 0) {
                return -1;
            }
            return (size() - 1) - indexOf;
        }

        @Override // j7.j0, java.util.List
        public final ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f30008u.size();
        }

        @Override // j7.g0
        public final boolean x() {
            return this.f30008u.x();
        }

        @Override // j7.j0, java.util.List
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return listIterator(i10);
        }
    }

    /* compiled from: ImmutableList.java */
    /* loaded from: classes2.dex */
    public class d extends j0<E> {

        /* renamed from: u, reason: collision with root package name */
        public final transient int f30009u;

        /* renamed from: v, reason: collision with root package name */
        public final transient int f30010v;

        public d(int i10, int i11) {
            this.f30009u = i10;
            this.f30010v = i11;
        }

        @Override // j7.j0, java.util.List
        /* renamed from: I */
        public final j0<E> subList(int i10, int i11) {
            i7.f.e(i10, i11, this.f30010v);
            int i12 = this.f30009u;
            return j0.this.subList(i10 + i12, i11 + i12);
        }

        @Override // java.util.List
        public final E get(int i10) {
            i7.f.b(i10, this.f30010v);
            return j0.this.get(i10 + this.f30009u);
        }

        @Override // j7.j0, j7.g0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return listIterator(0);
        }

        @Override // j7.j0, java.util.List
        public final ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // j7.g0
        @CheckForNull
        public final Object[] r() {
            return j0.this.r();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f30010v;
        }

        @Override // j7.g0
        public final int u() {
            return j0.this.v() + this.f30009u + this.f30010v;
        }

        @Override // j7.g0
        public final int v() {
            return j0.this.v() + this.f30009u;
        }

        @Override // j7.g0
        public final boolean x() {
            return true;
        }

        @Override // j7.j0, java.util.List
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return listIterator(i10);
        }
    }

    public static v1 B(int i10, Object[] objArr) {
        if (i10 == 0) {
            return v1.f30113w;
        }
        return new v1(objArr, i10);
    }

    public static <E> j0<E> C(Collection<? extends E> collection) {
        if (collection instanceof g0) {
            j0<E> p10 = ((g0) collection).p();
            if (p10.x()) {
                Object[] array = p10.toArray();
                return B(array.length, array);
            }
            return p10;
        }
        Object[] array2 = collection.toArray();
        f0.a(array2.length, array2);
        return B(array2.length, array2);
    }

    public static v1 D(Object[] objArr) {
        if (objArr.length == 0) {
            return v1.f30113w;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        f0.a(objArr2.length, objArr2);
        return B(objArr2.length, objArr2);
    }

    public static v1 F(Long l10, Long l11, Long l12, Long l13, Long l14) {
        Object[] objArr = {l10, l11, l12, l13, l14};
        f0.a(5, objArr);
        return B(5, objArr);
    }

    public static v1 G(Object obj) {
        Object[] objArr = {obj};
        f0.a(1, objArr);
        return B(1, objArr);
    }

    @Override // j7.g0
    /* renamed from: A */
    public final t2<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final b listIterator(int i10) {
        i7.f.d(i10, size());
        if (isEmpty()) {
            return f30006t;
        }
        return new b(i10, this);
    }

    public j0<E> H() {
        if (size() <= 1) {
            return this;
        }
        return new c(this);
    }

    @Override // java.util.List
    /* renamed from: I */
    public j0<E> subList(int i10, int i11) {
        i7.f.e(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        if (i12 == 0) {
            return v1.f30113w;
        }
        return new d(i10, i12);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // j7.g0, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@CheckForNull Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i10 = 0; i10 < size; i10++) {
                        if (i7.g.a(get(i10), list.get(i10))) {
                        }
                    }
                    return true;
                }
                Iterator<E> it = iterator();
                Iterator<E> it2 = list.iterator();
                while (it.hasNext()) {
                    if (it2.hasNext() && i7.g.a(it.next(), it2.next())) {
                    }
                }
                return !it2.hasNext();
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~(get(i11).hashCode() + (i10 * 31)));
        }
        return i10;
    }

    public int indexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override // j7.g0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // j7.g0
    public int q(int i10, Object[] objArr) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // j7.g0
    @Deprecated
    public final j0<E> p() {
        return this;
    }
}
