package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public abstract class q<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static final Object[] f13807a = new Object[0];

    /* loaded from: classes.dex */
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

    public int a(Object[] objArr, int i10) {
        ax<E> it = iterator();
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: a */
    public abstract ax<E> iterator();

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

    public Object[] b() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(@NullableDecl Object obj);

    int d() {
        throw new UnsupportedOperationException();
    }

    public s<E> e() {
        if (isEmpty()) {
            return s.g();
        }
        return s.b(toArray());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean f();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
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
        return toArray(f13807a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        Preconditions.checkNotNull(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] b10 = b();
            if (b10 != null) {
                return (T[]) aj.a(b10, c(), d(), tArr);
            }
            tArr = (T[]) ah.a((Object[]) tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        a(tArr, 0);
        return tArr;
    }

    /* loaded from: classes.dex */
    public static abstract class a<E> extends b<E> {

        /* renamed from: a, reason: collision with root package name */
        Object[] f13808a;

        /* renamed from: b, reason: collision with root package name */
        int f13809b;

        /* renamed from: c, reason: collision with root package name */
        boolean f13810c;

        public a(int i10) {
            j.a(i10, "initialCapacity");
            this.f13808a = new Object[i10];
            this.f13809b = 0;
        }

        private void a(int i10) {
            Object[] objArr = this.f13808a;
            if (objArr.length < i10) {
                this.f13808a = Arrays.copyOf(objArr, b.a(objArr.length, i10));
                this.f13810c = false;
            } else if (this.f13810c) {
                this.f13808a = (Object[]) objArr.clone();
                this.f13810c = false;
            }
        }

        public a<E> a(E e10) {
            Preconditions.checkNotNull(e10);
            a(this.f13809b + 1);
            Object[] objArr = this.f13808a;
            int i10 = this.f13809b;
            this.f13809b = i10 + 1;
            objArr[i10] = e10;
            return this;
        }
    }
}
