package vc;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import n0.v0;

/* compiled from: Collections.kt */
/* loaded from: classes2.dex */
public final class a<T> implements Collection<T> {

    /* renamed from: s, reason: collision with root package name */
    public final T[] f36003s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f36004t = false;

    /* JADX WARN: Multi-variable type inference failed */
    public a(Object[] objArr) {
        this.f36003s = objArr;
    }

    @Override // java.util.Collection
    public final boolean add(T t10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        int i10;
        T[] tArr = this.f36003s;
        zc.d.d(tArr, "<this>");
        if (obj == null) {
            int length = tArr.length;
            i10 = 0;
            while (i10 < length) {
                if (tArr[i10] == null) {
                    break;
                }
                i10++;
            }
            i10 = -1;
        } else {
            int length2 = tArr.length;
            for (int i11 = 0; i11 < length2; i11++) {
                if (zc.d.a(obj, tArr[i11])) {
                    i10 = i11;
                    break;
                }
            }
            i10 = -1;
        }
        if (i10 < 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        zc.d.d(collection, "elements");
        Collection<? extends Object> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        if (this.f36003s.length == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        T[] tArr = this.f36003s;
        zc.d.d(tArr, "array");
        return new zc.a(tArr);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f36003s.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        T[] tArr = this.f36003s;
        zc.d.d(tArr, "<this>");
        if (this.f36004t && zc.d.a(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        zc.d.c(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        zc.d.d(tArr, "array");
        return (T[]) v0.g(this, tArr);
    }
}
