package j7;

import j7.j0;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import javax.annotation.CheckForNull;

/* compiled from: ImmutableCollection.java */
/* loaded from: classes2.dex */
public abstract class g0<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: s, reason: collision with root package name */
    public static final Object[] f29953s = new Object[0];

    /* compiled from: ImmutableCollection.java */
    /* loaded from: classes2.dex */
    public static abstract class a<E> extends b<E> {

        /* renamed from: a, reason: collision with root package name */
        public Object[] f29954a;

        /* renamed from: b, reason: collision with root package name */
        public int f29955b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f29956c;

        public a() {
            r.y(4, "initialCapacity");
            this.f29954a = new Object[4];
            this.f29955b = 0;
        }

        public final void b(Object obj) {
            obj.getClass();
            c(this.f29955b + 1);
            Object[] objArr = this.f29954a;
            int i10 = this.f29955b;
            this.f29955b = i10 + 1;
            objArr[i10] = obj;
        }

        public final void c(int i10) {
            Object[] objArr = this.f29954a;
            if (objArr.length < i10) {
                this.f29954a = Arrays.copyOf(objArr, b.a(objArr.length, i10));
                this.f29956c = false;
            } else if (this.f29956c) {
                this.f29954a = (Object[]) objArr.clone();
                this.f29956c = false;
            }
        }
    }

    /* compiled from: ImmutableCollection.java */
    /* loaded from: classes2.dex */
    public static abstract class b<E> {
        public static int a(int i10, int i11) {
            if (i11 >= 0) {
                int i12 = i10 + (i10 >> 1) + 1;
                if (i12 < i11) {
                    i12 = Integer.highestOneBit(i11 - 1) << 1;
                }
                if (i12 < 0) {
                    return Integer.MAX_VALUE;
                }
                return i12;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public abstract t2<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(@CheckForNull Object obj);

    public j0<E> p() {
        if (isEmpty()) {
            j0.b bVar = j0.f30006t;
            return v1.f30113w;
        }
        Object[] array = toArray();
        j0.b bVar2 = j0.f30006t;
        return j0.B(array.length, array);
    }

    public int q(int i10, Object[] objArr) {
        t2<E> it = iterator();
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return i10;
    }

    @CheckForNull
    public Object[] r() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f29953s);
    }

    public int u() {
        throw new UnsupportedOperationException();
    }

    public int v() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean x();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int size = size();
        if (tArr.length < size) {
            Object[] r10 = r();
            if (r10 != null) {
                return (T[]) Arrays.copyOfRange(r10, v(), u(), tArr.getClass());
            }
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        q(0, tArr);
        return tArr;
    }
}
