package com.applovin.exoplayer2.common.a;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public final class x {
    public static String a(Iterable<?> iterable) {
        return y.a(iterable.iterator());
    }

    public static Object[] b(Iterable<?> iterable) {
        return d(iterable).toArray();
    }

    public static <T> T c(Iterable<T> iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return (T) a(list);
            }
            throw new NoSuchElementException();
        }
        return (T) y.b(iterable.iterator());
    }

    private static <E> Collection<E> d(Iterable<E> iterable) {
        if (iterable instanceof Collection) {
            return (Collection) iterable;
        }
        return aa.a(iterable.iterator());
    }

    @NullableDecl
    public static <T> T a(Iterable<? extends T> iterable, @NullableDecl T t10) {
        return (T) y.a(iterable.iterator(), t10);
    }

    private static <T> T a(List<T> list) {
        return list.get(list.size() - 1);
    }
}
