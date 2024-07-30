package zc;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: ArrayIterator.kt */
/* loaded from: classes2.dex */
public final class a<T> implements Iterator<T> {

    /* renamed from: s, reason: collision with root package name */
    public final T[] f37361s;

    /* renamed from: t, reason: collision with root package name */
    public int f37362t;

    public a(T[] tArr) {
        this.f37361s = tArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f37362t < this.f37361s.length) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        try {
            T[] tArr = this.f37361s;
            int i10 = this.f37362t;
            this.f37362t = i10 + 1;
            return tArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f37362t--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
