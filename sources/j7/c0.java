package j7;

import j7.f2;
import java.util.Comparator;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* compiled from: ForwardingSortedSet.java */
/* loaded from: classes2.dex */
public abstract class c0<E> extends b0<E> implements SortedSet<E> {
    @Override // java.util.SortedSet
    @CheckForNull
    public final Comparator<? super E> comparator() {
        return ((f2.e) this).f29951u.comparator();
    }

    @Override // java.util.SortedSet
    public final E first() {
        return ((f2.e) this).f29951u.first();
    }

    @Override // java.util.SortedSet
    public final SortedSet<E> headSet(E e10) {
        return ((f2.e) this).f29951u.headSet(e10);
    }

    @Override // java.util.SortedSet
    public final E last() {
        return ((f2.e) this).f29951u.last();
    }

    @Override // java.util.SortedSet
    public final SortedSet<E> subSet(E e10, E e11) {
        return ((f2.e) this).f29951u.subSet(e10, e11);
    }

    @Override // java.util.SortedSet
    public final SortedSet<E> tailSet(E e10) {
        return ((f2.e) this).f29951u.tailSet(e10);
    }
}
