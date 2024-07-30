package j7;

import java.util.Iterator;

/* compiled from: UnmodifiableIterator.java */
/* loaded from: classes2.dex */
public abstract class t2<E> implements Iterator<E> {
    @Override // java.util.Iterator
    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
