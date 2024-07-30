package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.Iterator;

/* loaded from: classes.dex */
abstract class aw<F, T> implements Iterator<T> {

    /* renamed from: a, reason: collision with root package name */
    final Iterator<? extends F> f13727a;

    public aw(Iterator<? extends F> it) {
        this.f13727a = (Iterator) Preconditions.checkNotNull(it);
    }

    public abstract T a(F f);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13727a.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return a(this.f13727a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f13727a.remove();
    }
}
