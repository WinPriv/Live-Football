package j7;

import j7.f2;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: ForwardingSet.java */
/* loaded from: classes2.dex */
public abstract class b0<E> extends z6.f implements Set<E>, Collection<Object> {
    public b0() {
        super(1);
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final Iterator<Object> iterator() {
        return ((f2.e) this).f29951u.iterator();
    }

    @Override // java.util.Set, java.util.Collection
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final boolean remove(@CheckForNull Object obj) {
        return ((f2.e) this).f29951u.remove(obj);
    }

    @Override // java.util.Set, java.util.Collection
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final boolean removeAll(Collection<?> collection) {
        return ((f2.e) this).f29951u.removeAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final boolean retainAll(Collection<?> collection) {
        return ((f2.e) this).f29951u.retainAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final int size() {
        return ((f2.e) this).f29951u.size();
    }

    @Override // java.util.Set, java.util.Collection
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final Object[] toArray() {
        return ((f2.e) this).f29951u.toArray();
    }

    public final <T> T[] G(T[] tArr) {
        return (T[]) ((f2.e) this).f29951u.toArray(tArr);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(@CheckForNull Object obj) {
        if (obj != this && !((f2.e) this).f29951u.equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return ((f2.e) this).f29951u.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final boolean add(Object obj) {
        return ((f2.e) this).f29951u.add(obj);
    }

    @Override // java.util.Set, java.util.Collection
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final boolean addAll(Collection<Object> collection) {
        return ((f2.e) this).f29951u.addAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void clear() {
        ((f2.e) this).f29951u.clear();
    }

    @Override // java.util.Set, java.util.Collection
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final boolean contains(@CheckForNull Object obj) {
        return ((f2.e) this).f29951u.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final boolean containsAll(Collection<?> collection) {
        return ((f2.e) this).f29951u.containsAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final boolean isEmpty() {
        return ((f2.e) this).f29951u.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ /* synthetic */ <T> T[] toArray(T[] tArr) {
        return (T[]) G(tArr);
    }
}
