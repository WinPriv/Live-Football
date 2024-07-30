package vc;

import java.util.Iterator;

/* compiled from: PrimitiveIterators.kt */
/* loaded from: classes2.dex */
public abstract class g implements Iterator<Integer> {
    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Integer next() {
        return Integer.valueOf(nextInt());
    }

    public abstract int nextInt();

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
