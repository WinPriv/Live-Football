package j7;

import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* compiled from: Sets.java */
/* loaded from: classes2.dex */
public final class f2 {

    /* compiled from: Sets.java */
    /* loaded from: classes2.dex */
    public static class a<E> extends l<E> implements Set<E> {
        public a(Set<E> set, i7.h<? super E> hVar) {
            super(set, hVar);
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean equals(@CheckForNull Object obj) {
            return f2.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            return f2.c(this);
        }
    }

    /* compiled from: Sets.java */
    /* loaded from: classes2.dex */
    public static class b<E> extends a<E> implements SortedSet<E> {
        public b(SortedSet<E> sortedSet, i7.h<? super E> hVar) {
            super(sortedSet, hVar);
        }

        @Override // java.util.SortedSet
        @CheckForNull
        public final Comparator<? super E> comparator() {
            return ((SortedSet) this.f30029s).comparator();
        }

        @Override // java.util.SortedSet
        public final E first() {
            Iterator<E> it = this.f30029s.iterator();
            it.getClass();
            i7.h<? super E> hVar = this.f30030t;
            hVar.getClass();
            while (it.hasNext()) {
                E next = it.next();
                if (hVar.apply(next)) {
                    return next;
                }
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> headSet(E e10) {
            return new b(((SortedSet) this.f30029s).headSet(e10), this.f30030t);
        }

        @Override // java.util.SortedSet
        public final E last() {
            SortedSet sortedSet = (SortedSet) this.f30029s;
            while (true) {
                E e10 = (Object) sortedSet.last();
                if (this.f30030t.apply(e10)) {
                    return e10;
                }
                sortedSet = sortedSet.headSet(e10);
            }
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> subSet(E e10, E e11) {
            return new b(((SortedSet) this.f30029s).subSet(e10, e11), this.f30030t);
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> tailSet(E e10) {
            return new b(((SortedSet) this.f30029s).tailSet(e10), this.f30030t);
        }
    }

    /* compiled from: Sets.java */
    /* loaded from: classes2.dex */
    public static abstract class c<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return f2.e(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            collection.getClass();
            return super.retainAll(collection);
        }
    }

    /* compiled from: Sets.java */
    /* loaded from: classes2.dex */
    public static abstract class d<E> extends AbstractSet<E> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean add(E e10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean remove(@CheckForNull Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: Sets.java */
    /* loaded from: classes2.dex */
    public static final class e<E> extends c0<E> implements NavigableSet<E>, Serializable {

        /* renamed from: t, reason: collision with root package name */
        public final NavigableSet<E> f29950t;

        /* renamed from: u, reason: collision with root package name */
        public final SortedSet<E> f29951u;

        /* renamed from: v, reason: collision with root package name */
        @CheckForNull
        public transient e<E> f29952v;

        public e(NavigableSet<E> navigableSet) {
            navigableSet.getClass();
            this.f29950t = navigableSet;
            this.f29951u = Collections.unmodifiableSortedSet(navigableSet);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final E ceiling(E e10) {
            return this.f29950t.ceiling(e10);
        }

        @Override // java.util.NavigableSet
        public final Iterator<E> descendingIterator() {
            Iterator<E> descendingIterator = this.f29950t.descendingIterator();
            descendingIterator.getClass();
            if (descendingIterator instanceof t2) {
                return (t2) descendingIterator;
            }
            return new y0(descendingIterator);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<E> descendingSet() {
            e<E> eVar = this.f29952v;
            if (eVar == null) {
                e<E> eVar2 = new e<>(this.f29950t.descendingSet());
                this.f29952v = eVar2;
                eVar2.f29952v = this;
                return eVar2;
            }
            return eVar;
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final E floor(E e10) {
            return this.f29950t.floor(e10);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<E> headSet(E e10, boolean z10) {
            return f2.f(this.f29950t.headSet(e10, z10));
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final E higher(E e10) {
            return this.f29950t.higher(e10);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final E lower(E e10) {
            return this.f29950t.lower(e10);
        }

        @Override // z6.f
        public final Object p() {
            return this.f29951u;
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final E pollFirst() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final E pollLast() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<E> subSet(E e10, boolean z10, E e11, boolean z11) {
            return f2.f(this.f29950t.subSet(e10, z10, e11, z11));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<E> tailSet(E e10, boolean z10) {
            return f2.f(this.f29950t.tailSet(e10, z10));
        }
    }

    public static boolean a(Set<?> set, @CheckForNull Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a b(Set set, i7.h hVar) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof a) {
                a aVar = (a) sortedSet;
                i7.h hVar2 = aVar.f30030t;
                hVar2.getClass();
                return new b((SortedSet) aVar.f30029s, new i7.i(Arrays.asList(hVar2, hVar)));
            }
            sortedSet.getClass();
            return new b(sortedSet, hVar);
        }
        if (set instanceof a) {
            a aVar2 = (a) set;
            i7.h hVar3 = aVar2.f30030t;
            hVar3.getClass();
            return new a((Set) aVar2.f30029s, new i7.i(Arrays.asList(hVar3, hVar)));
        }
        set.getClass();
        return new a(set, hVar);
    }

    public static int c(Set<?> set) {
        int i10;
        int i11 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i10 = obj.hashCode();
            } else {
                i10 = 0;
            }
            i11 = ~(~(i11 + i10));
        }
        return i11;
    }

    public static e2 d(t0 t0Var, t0 t0Var2) {
        if (t0Var != null) {
            if (t0Var2 != null) {
                return new e2(t0Var, t0Var2);
            }
            throw new NullPointerException("set2");
        }
        throw new NullPointerException("set1");
    }

    public static boolean e(Set<?> set, Collection<?> collection) {
        collection.getClass();
        if (collection instanceof s1) {
            collection = ((s1) collection).k();
        }
        boolean z10 = false;
        if ((collection instanceof Set) && collection.size() > set.size()) {
            Iterator<?> it = set.iterator();
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }
        Iterator<?> it2 = collection.iterator();
        while (it2.hasNext()) {
            z10 |= set.remove(it2.next());
        }
        return z10;
    }

    public static <E> NavigableSet<E> f(NavigableSet<E> navigableSet) {
        if (!(navigableSet instanceof g0) && !(navigableSet instanceof e)) {
            return new e(navigableSet);
        }
        return navigableSet;
    }
}
