package com.applovin.exoplayer2.common.base;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public abstract class Optional<T> implements Serializable {
    private static final long serialVersionUID = 0;

    public static <T> Optional<T> absent() {
        return a.a();
    }

    public static <T> Optional<T> fromNullable(@NullableDecl T t10) {
        if (t10 == null) {
            return absent();
        }
        return new d(t10);
    }

    public static <T> Optional<T> of(T t10) {
        return new d(Preconditions.checkNotNull(t10));
    }

    public static <T> Iterable<T> presentInstances(final Iterable<? extends Optional<? extends T>> iterable) {
        Preconditions.checkNotNull(iterable);
        return new Iterable<T>() { // from class: com.applovin.exoplayer2.common.base.Optional.1
            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                return new b<T>() { // from class: com.applovin.exoplayer2.common.base.Optional.1.1

                    /* renamed from: b, reason: collision with root package name */
                    private final Iterator<? extends Optional<? extends T>> f13902b;

                    {
                        this.f13902b = (Iterator) Preconditions.checkNotNull(iterable.iterator());
                    }

                    @Override // com.applovin.exoplayer2.common.base.b
                    public T a() {
                        while (this.f13902b.hasNext()) {
                            Optional<? extends T> next = this.f13902b.next();
                            if (next.isPresent()) {
                                return next.get();
                            }
                        }
                        return b();
                    }
                };
            }
        };
    }

    public abstract Set<T> asSet();

    public abstract boolean equals(@NullableDecl Object obj);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    public abstract Optional<T> or(Optional<? extends T> optional);

    public abstract T or(Supplier<? extends T> supplier);

    public abstract T or(T t10);

    @NullableDecl
    public abstract T orNull();

    public abstract String toString();

    public abstract <V> Optional<V> transform(Function<? super T, V> function);
}
