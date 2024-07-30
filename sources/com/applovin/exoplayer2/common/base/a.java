package com.applovin.exoplayer2.common.base;

import java.util.Collections;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a<T> extends Optional<T> {

    /* renamed from: a, reason: collision with root package name */
    static final a<Object> f13928a = new a<>();

    private a() {
    }

    public static <T> Optional<T> a() {
        return f13928a;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public Set<T> asSet() {
        return Collections.emptySet();
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public T get() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public int hashCode() {
        return 2040732332;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public boolean isPresent() {
        return false;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public T or(T t10) {
        return (T) Preconditions.checkNotNull(t10, "use Optional.orNull() instead of Optional.or(null)");
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    @NullableDecl
    public T orNull() {
        return null;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public String toString() {
        return "Optional.absent()";
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public <V> Optional<V> transform(Function<? super T, V> function) {
        Preconditions.checkNotNull(function);
        return Optional.absent();
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public Optional<T> or(Optional<? extends T> optional) {
        return (Optional) Preconditions.checkNotNull(optional);
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public T or(Supplier<? extends T> supplier) {
        return (T) Preconditions.checkNotNull(supplier.get(), "use Optional.orNull() instead of a Supplier that returns null");
    }
}
