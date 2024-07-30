package j7;

import java.util.Comparator;

/* compiled from: Ordering.java */
/* loaded from: classes2.dex */
public abstract class u1<T> implements Comparator<T> {
    @Override // java.util.Comparator
    public abstract int compare(T t10, T t11);

    public <S extends T> u1<S> k() {
        return new b2(this);
    }
}
