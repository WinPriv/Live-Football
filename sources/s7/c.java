package s7;

import java.util.Set;

/* compiled from: ComponentContainer.java */
/* loaded from: classes2.dex */
public interface c {
    default <T> T a(Class<T> cls) {
        return (T) d(u.a(cls));
    }

    default <T> c8.a<T> b(Class<T> cls) {
        return c(u.a(cls));
    }

    <T> c8.a<T> c(u<T> uVar);

    default <T> T d(u<T> uVar) {
        c8.a<T> c10 = c(uVar);
        if (c10 == null) {
            return null;
        }
        return c10.get();
    }

    default <T> Set<T> e(u<T> uVar) {
        return f(uVar).get();
    }

    <T> c8.a<Set<T>> f(u<T> uVar);
}
