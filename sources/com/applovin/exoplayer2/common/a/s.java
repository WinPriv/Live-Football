package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.a.q;
import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class s<E> extends q<E> implements List<E>, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    private static final ay<Object> f13813a = new b(ak.f13692a, 0);

    /* loaded from: classes.dex */
    public static final class a<E> extends q.a<E> {
        public a() {
            this(4);
        }

        @Override // com.applovin.exoplayer2.common.a.q.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a<E> a(E e10) {
            super.a((a<E>) e10);
            return this;
        }

        public a(int i10) {
            super(i10);
        }

        public s<E> a() {
            this.f13810c = true;
            return s.b(this.f13808a, this.f13809b);
        }
    }

    /* loaded from: classes.dex */
    public static class b<E> extends com.applovin.exoplayer2.common.a.a<E> {

        /* renamed from: a, reason: collision with root package name */
        private final s<E> f13814a;

        public b(s<E> sVar, int i10) {
            super(sVar.size(), i10);
            this.f13814a = sVar;
        }

        @Override // com.applovin.exoplayer2.common.a.a
        public E a(int i10) {
            return this.f13814a.get(i10);
        }
    }

    /* loaded from: classes.dex */
    public class c extends s<E> {

        /* renamed from: a, reason: collision with root package name */
        final transient int f13815a;

        /* renamed from: b, reason: collision with root package name */
        final transient int f13816b;

        public c(int i10, int i11) {
            this.f13815a = i10;
            this.f13816b = i11;
        }

        @Override // com.applovin.exoplayer2.common.a.s, java.util.List
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public s<E> subList(int i10, int i11) {
            Preconditions.checkPositionIndexes(i10, i11, this.f13816b);
            s sVar = s.this;
            int i12 = this.f13815a;
            return sVar.subList(i10 + i12, i11 + i12);
        }

        @Override // com.applovin.exoplayer2.common.a.q
        public Object[] b() {
            return s.this.b();
        }

        @Override // com.applovin.exoplayer2.common.a.q
        public int c() {
            return s.this.c() + this.f13815a;
        }

        @Override // com.applovin.exoplayer2.common.a.q
        public int d() {
            return s.this.c() + this.f13815a + this.f13816b;
        }

        @Override // com.applovin.exoplayer2.common.a.q
        public boolean f() {
            return true;
        }

        @Override // java.util.List
        public E get(int i10) {
            Preconditions.checkElementIndex(i10, this.f13816b);
            return s.this.get(i10 + this.f13815a);
        }

        @Override // com.applovin.exoplayer2.common.a.s, com.applovin.exoplayer2.common.a.q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.applovin.exoplayer2.common.a.s, java.util.List
        public /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f13816b;
        }

        @Override // com.applovin.exoplayer2.common.a.s, java.util.List
        public /* synthetic */ ListIterator listIterator(int i10) {
            return super.listIterator(i10);
        }
    }

    public static <E> s<E> a(E e10) {
        return c(e10);
    }

    public static <E> s<E> b(Object[] objArr) {
        return b(objArr, objArr.length);
    }

    private static <E> s<E> c(Object... objArr) {
        return b(ah.a(objArr));
    }

    public static <E> s<E> g() {
        return (s<E>) ak.f13692a;
    }

    public static <E> a<E> i() {
        return new a<>();
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

    @Override // com.applovin.exoplayer2.common.a.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return aa.a(this, obj);
    }

    @Override // java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public ay<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~(get(i11).hashCode() + (i10 * 31)));
        }
        return i10;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return aa.b(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return aa.c(this, obj);
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

    public static <E> s<E> a(E e10, E e11) {
        return c(e10, e11);
    }

    public static <E> s<E> b(Object[] objArr, int i10) {
        if (i10 == 0) {
            return g();
        }
        return new ak(objArr, i10);
    }

    public static <E> s<E> a(E e10, E e11, E e12, E e13, E e14) {
        return c(e10, e11, e12, e13, e14);
    }

    public static <E> s<E> a(E e10, E e11, E e12, E e13, E e14, E e15) {
        return c(e10, e11, e12, e13, e14, e15);
    }

    public s<E> b(int i10, int i11) {
        return new c(i10, i11 - i10);
    }

    public static <E> s<E> a(Collection<? extends E> collection) {
        if (collection instanceof q) {
            s<E> e10 = ((q) collection).e();
            return e10.f() ? b(e10.toArray()) : e10;
        }
        return c(collection.toArray());
    }

    public static <E> s<E> a(E[] eArr) {
        if (eArr.length == 0) {
            return g();
        }
        return c((Object[]) eArr.clone());
    }

    public static <E> s<E> a(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        Preconditions.checkNotNull(comparator);
        Object[] b10 = x.b(iterable);
        ah.a(b10);
        Arrays.sort(b10, comparator);
        return b(b10);
    }

    @Override // com.applovin.exoplayer2.common.a.q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: a */
    public ax<E> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ay<E> listIterator(int i10) {
        Preconditions.checkPositionIndex(i10, size());
        if (isEmpty()) {
            return (ay<E>) f13813a;
        }
        return new b(this, i10);
    }

    @Override // java.util.List
    /* renamed from: a */
    public s<E> subList(int i10, int i11) {
        Preconditions.checkPositionIndexes(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        if (i12 == 0) {
            return g();
        }
        return b(i10, i11);
    }

    @Override // com.applovin.exoplayer2.common.a.q
    public final s<E> e() {
        return this;
    }

    @Override // com.applovin.exoplayer2.common.a.q
    public int a(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }
}
