package j7;

import j7.g1;
import java.util.ListIterator;

/* compiled from: TransformedListIterator.java */
/* loaded from: classes2.dex */
public abstract class r2<F, T> extends q2<F, T> implements ListIterator<T> {
    public r2(g1.e eVar) {
        super(eVar);
    }

    @Override // java.util.ListIterator
    public final void add(T t10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f30091s).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f30091s).nextIndex();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ListIterator
    public final T previous() {
        return (T) a(((ListIterator) this.f30091s).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f30091s).previousIndex();
    }
}
