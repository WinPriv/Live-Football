package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
abstract class a<E> extends ay<E> {

    /* renamed from: a, reason: collision with root package name */
    private final int f13675a;

    /* renamed from: b, reason: collision with root package name */
    private int f13676b;

    public a(int i10, int i11) {
        Preconditions.checkPositionIndex(i11, i10);
        this.f13675a = i10;
        this.f13676b = i11;
    }

    public abstract E a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f13676b < this.f13675a) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f13676b > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (hasNext()) {
            int i10 = this.f13676b;
            this.f13676b = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f13676b;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i10 = this.f13676b - 1;
            this.f13676b = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f13676b - 1;
    }
}
