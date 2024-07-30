package j7;

import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* compiled from: AbstractIterator.java */
/* loaded from: classes2.dex */
public abstract class b<T> extends t2<T> {

    /* renamed from: s, reason: collision with root package name */
    public int f29877s = 2;

    /* renamed from: t, reason: collision with root package name */
    @CheckForNull
    public T f29878t;

    @CheckForNull
    public abstract T a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z10;
        int i10 = this.f29877s;
        if (i10 != 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int c10 = s.f.c(i10);
            if (c10 == 0) {
                return true;
            }
            if (c10 == 2) {
                return false;
            }
            this.f29877s = 4;
            this.f29878t = a();
            if (this.f29877s == 3) {
                return false;
            }
            this.f29877s = 1;
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.f29877s = 2;
            T t10 = this.f29878t;
            this.f29878t = null;
            return t10;
        }
        throw new NoSuchElementException();
    }
}
