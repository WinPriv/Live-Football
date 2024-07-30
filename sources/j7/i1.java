package j7;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* compiled from: Lists.java */
/* loaded from: classes2.dex */
public final class i1 {

    /* compiled from: Lists.java */
    /* loaded from: classes2.dex */
    public static class a<T> extends b<T> implements RandomAccess {
        public a(List<T> list) {
            super(list);
        }
    }

    /* compiled from: Lists.java */
    /* loaded from: classes2.dex */
    public static class b<T> extends AbstractList<T> {

        /* renamed from: s, reason: collision with root package name */
        public final List<T> f30001s;

        /* compiled from: Lists.java */
        /* loaded from: classes2.dex */
        public class a implements ListIterator<T> {

            /* renamed from: s, reason: collision with root package name */
            public boolean f30002s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ ListIterator f30003t;

            public a(ListIterator listIterator) {
                this.f30003t = listIterator;
            }

            @Override // java.util.ListIterator
            public final void add(T t10) {
                ListIterator listIterator = this.f30003t;
                listIterator.add(t10);
                listIterator.previous();
                this.f30002s = false;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final boolean hasNext() {
                return this.f30003t.hasPrevious();
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return this.f30003t.hasNext();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final T next() {
                if (hasNext()) {
                    this.f30002s = true;
                    return (T) this.f30003t.previous();
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return b.a(b.this, this.f30003t.nextIndex());
            }

            @Override // java.util.ListIterator
            public final T previous() {
                if (hasPrevious()) {
                    this.f30002s = true;
                    return (T) this.f30003t.next();
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return nextIndex() - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final void remove() {
                i7.f.f(this.f30002s, "no calls to next() since the last call to remove()");
                this.f30003t.remove();
                this.f30002s = false;
            }

            @Override // java.util.ListIterator
            public final void set(T t10) {
                if (this.f30002s) {
                    this.f30003t.set(t10);
                    return;
                }
                throw new IllegalStateException();
            }
        }

        public b(List<T> list) {
            list.getClass();
            this.f30001s = list;
        }

        public static int a(b bVar, int i10) {
            int size = bVar.size();
            i7.f.d(i10, size);
            return size - i10;
        }

        @Override // java.util.AbstractList, java.util.List
        public final void add(int i10, T t10) {
            int size = size();
            i7.f.d(i10, size);
            this.f30001s.add(size - i10, t10);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final void clear() {
            this.f30001s.clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public final T get(int i10) {
            int size = size();
            i7.f.b(i10, size);
            return this.f30001s.get((size - 1) - i10);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public final Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator<T> listIterator(int i10) {
            int size = size();
            i7.f.d(i10, size);
            return new a(this.f30001s.listIterator(size - i10));
        }

        @Override // java.util.AbstractList, java.util.List
        public final T remove(int i10) {
            int size = size();
            i7.f.b(i10, size);
            return this.f30001s.remove((size - 1) - i10);
        }

        @Override // java.util.AbstractList
        public final void removeRange(int i10, int i11) {
            subList(i10, i11).clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public final T set(int i10, T t10) {
            int size = size();
            i7.f.b(i10, size);
            return this.f30001s.set((size - 1) - i10, t10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f30001s.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public final List<T> subList(int i10, int i11) {
            i7.f.e(i10, i11, size());
            int size = size();
            i7.f.d(i11, size);
            int i12 = size - i11;
            int size2 = size();
            i7.f.d(i10, size2);
            return i1.c(this.f30001s.subList(i12, size2 - i10));
        }
    }

    /* compiled from: Lists.java */
    /* loaded from: classes2.dex */
    public static final class c extends j0<Character> {

        /* renamed from: u, reason: collision with root package name */
        public final String f30005u;

        public c(String str) {
            this.f30005u = str;
        }

        @Override // j7.j0, java.util.List
        /* renamed from: I */
        public final j0<Character> subList(int i10, int i11) {
            i7.f.e(i10, i11, size());
            String substring = this.f30005u.substring(i10, i11);
            substring.getClass();
            return new c(substring);
        }

        @Override // java.util.List
        public final Object get(int i10) {
            i7.f.b(i10, size());
            return Character.valueOf(this.f30005u.charAt(i10));
        }

        @Override // j7.j0, java.util.List
        public final int indexOf(@CheckForNull Object obj) {
            if (obj instanceof Character) {
                return this.f30005u.indexOf(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // j7.j0, java.util.List
        public final int lastIndexOf(@CheckForNull Object obj) {
            if (obj instanceof Character) {
                return this.f30005u.lastIndexOf(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f30005u.length();
        }

        @Override // j7.g0
        public final boolean x() {
            return false;
        }
    }

    public static <E> ArrayList<E> a(Iterator<? extends E> it) {
        ArrayList<E> arrayList = new ArrayList<>();
        it.getClass();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    @SafeVarargs
    public static <E> ArrayList<E> b(E... eArr) {
        int length = eArr.length;
        r.y(length, "arraySize");
        ArrayList<E> arrayList = new ArrayList<>(l7.a.i0(length + 5 + (length / 10)));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    public static <T> List<T> c(List<T> list) {
        if (list instanceof j0) {
            return ((j0) list).H();
        }
        if (list instanceof b) {
            return ((b) list).f30001s;
        }
        if (list instanceof RandomAccess) {
            return new a(list);
        }
        return new b(list);
    }
}
