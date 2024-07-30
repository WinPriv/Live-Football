package com.applovin.exoplayer2.common.base;

import java.util.Collections;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
final class d<T> extends Optional<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f13937a;

    public d(T t10) {
        this.f13937a = t10;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public Set<T> asSet() {
        return Collections.singleton(this.f13937a);
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public boolean equals(@NullableDecl Object obj) {
        if (obj instanceof d) {
            return this.f13937a.equals(((d) obj).f13937a);
        }
        return false;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public T get() {
        return this.f13937a;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public int hashCode() {
        return this.f13937a.hashCode() + 1502476572;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public boolean isPresent() {
        return true;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public T or(T t10) {
        Preconditions.checkNotNull(t10, "use Optional.orNull() instead of Optional.or(null)");
        return this.f13937a;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public T orNull() {
        return this.f13937a;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public String toString() {
        return "Optional.of(" + this.f13937a + ")";
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public <V> Optional<V> transform(Function<? super T, V> function) {
        return new d(Preconditions.checkNotNull(function.apply(this.f13937a), "the Function passed to Optional.transform() must not return null."));
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public Optional<T> or(Optional<? extends T> optional) {
        Preconditions.checkNotNull(optional);
        return this;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public T or(Supplier<? extends T> supplier) {
        Preconditions.checkNotNull(supplier);
        return this.f13937a;
    }
}
