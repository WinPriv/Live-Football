package j7;

import java.util.Iterator;

/* compiled from: TransformedIterator.java */
/* loaded from: classes2.dex */
public abstract class q2<F, T> implements Iterator<T> {

    /* renamed from: s, reason: collision with root package name */
    public final Iterator<? extends F> f30091s;

    public q2(Iterator<? extends F> it) {
        it.getClass();
        this.f30091s = it;
    }

    public abstract T a(F f);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f30091s.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return a(this.f30091s.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f30091s.remove();
    }
}
