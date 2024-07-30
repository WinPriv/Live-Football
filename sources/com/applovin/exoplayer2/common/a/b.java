package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public abstract class b<T> extends ax<T> {

    /* renamed from: a, reason: collision with root package name */
    private a f13728a = a.NOT_READY;

    /* renamed from: b, reason: collision with root package name */
    @NullableDecl
    private T f13729b;

    /* renamed from: com.applovin.exoplayer2.common.a.b$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f13730a;

        static {
            int[] iArr = new int[a.values().length];
            f13730a = iArr;
            try {
                iArr[a.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13730a[a.READY.ordinal()] = 2;
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
        this.f13728a = a.FAILED;
        this.f13729b = a();
        if (this.f13728a != a.DONE) {
            this.f13728a = a.READY;
            return true;
        }
        return false;
    }

    public abstract T a();

    public final T b() {
        this.f13728a = a.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z10;
        if (this.f13728a != a.FAILED) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkState(z10);
        int i10 = AnonymousClass1.f13730a[this.f13728a.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            return true;
        }
        return c();
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.f13728a = a.NOT_READY;
            T t10 = this.f13729b;
            this.f13729b = null;
            return t10;
        }
        throw new NoSuchElementException();
    }
}
