package j7;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: AbstractIndexedListIterator.java */
/* loaded from: classes2.dex */
public abstract class a<E> extends t2<Object> implements ListIterator<Object> {

    /* renamed from: s, reason: collision with root package name */
    public final int f29872s;

    /* renamed from: t, reason: collision with root package name */
    public int f29873t;

    public a(int i10, int i11) {
        i7.f.d(i11, i10);
        this.f29872s = i10;
        this.f29873t = i11;
    }

    @Deprecated
    public final void a(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        a(obj);
        throw null;
    }

    public abstract E b(int i10);

    @Deprecated
    public final void c(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f29873t < this.f29872s) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f29873t > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (hasNext()) {
            int i10 = this.f29873t;
            this.f29873t = i10 + 1;
            return b(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f29873t;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i10 = this.f29873t - 1;
            this.f29873t = i10;
            return b(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f29873t - 1;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        c(obj);
        throw null;
    }
}
