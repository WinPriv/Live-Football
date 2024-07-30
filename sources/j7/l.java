package j7;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* compiled from: Collections2.java */
/* loaded from: classes2.dex */
public class l<E> extends AbstractCollection<E> {

    /* renamed from: s, reason: collision with root package name */
    public final Collection<E> f30029s;

    /* renamed from: t, reason: collision with root package name */
    public final i7.h<? super E> f30030t;

    public l(Collection<E> collection, i7.h<? super E> hVar) {
        this.f30029s = collection;
        this.f30030t = hVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(E e10) {
        if (this.f30030t.apply(e10)) {
            return this.f30029s.add(e10);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f30030t.apply(it.next())) {
                throw new IllegalArgumentException();
            }
        }
        return this.f30029s.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        Collection<E> collection = this.f30029s;
        boolean z10 = collection instanceof RandomAccess;
        i7.h<? super E> hVar = this.f30030t;
        if (z10 && (collection instanceof List)) {
            List list = (List) collection;
            hVar.getClass();
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                a0.a aVar = (Object) list.get(i11);
                if (!hVar.apply(aVar)) {
                    if (i11 > i10) {
                        try {
                            list.set(i10, aVar);
                        } catch (IllegalArgumentException unused) {
                            r.H(list, hVar, i10, i11);
                            return;
                        } catch (UnsupportedOperationException unused2) {
                            r.H(list, hVar, i10, i11);
                            return;
                        }
                    }
                    i10++;
                }
            }
            list.subList(i10, list.size()).clear();
            return;
        }
        Iterator<T> it = collection.iterator();
        hVar.getClass();
        while (it.hasNext()) {
            if (hVar.apply((Object) it.next())) {
                it.remove();
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        boolean z10;
        Collection<E> collection = this.f30029s;
        collection.getClass();
        try {
            z10 = collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return this.f30030t.apply(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        Iterator<T> it = this.f30029s.iterator();
        i7.h<? super E> hVar = this.f30030t;
        i7.f.c(hVar, "predicate");
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (it.hasNext()) {
                if (hVar.apply((Object) it.next())) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 != -1) {
            z10 = true;
        }
        return true ^ z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        Iterator<E> it = this.f30029s.iterator();
        it.getClass();
        i7.h<? super E> hVar = this.f30030t;
        hVar.getClass();
        return new z0(it, hVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(@CheckForNull Object obj) {
        if (contains(obj) && this.f30029s.remove(obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        Iterator<E> it = this.f30029s.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            E next = it.next();
            if (this.f30030t.apply(next) && collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        Iterator<E> it = this.f30029s.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            E next = it.next();
            if (this.f30030t.apply(next) && !collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        Iterator<E> it = this.f30029s.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (this.f30030t.apply(it.next())) {
                i10++;
            }
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return i1.a(iterator()).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) i1.a(iterator()).toArray(tArr);
    }
}
