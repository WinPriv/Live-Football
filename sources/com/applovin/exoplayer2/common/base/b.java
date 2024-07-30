package com.applovin.exoplayer2.common.base;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
abstract class b<T> implements Iterator<T> {

    /* renamed from: a, reason: collision with root package name */
    private a f13929a = a.NOT_READY;

    /* renamed from: b, reason: collision with root package name */
    @NullableDecl
    private T f13930b;

    /* renamed from: com.applovin.exoplayer2.common.base.b$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f13931a;

        static {
            int[] iArr = new int[a.values().length];
            f13931a = iArr;
            try {
                iArr[a.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13931a[a.DONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum a {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    private boolean c() {
        this.f13929a = a.FAILED;
        this.f13930b = a();
        if (this.f13929a != a.DONE) {
            this.f13929a = a.READY;
            return true;
        }
        return false;
    }

    public abstract T a();

    @NullableDecl
    public final T b() {
        this.f13929a = a.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z10;
        if (this.f13929a != a.FAILED) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkState(z10);
        int i10 = AnonymousClass1.f13931a[this.f13929a.ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        return c();
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.f13929a = a.NOT_READY;
            T t10 = this.f13930b;
            this.f13930b = null;
            return t10;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
