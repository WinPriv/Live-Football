package j7;

import javax.annotation.CheckForNull;

/* compiled from: RegularImmutableSet.java */
/* loaded from: classes2.dex */
public final class x1<E> extends t0<E> {
    public static final Object[] A;
    public static final x1<Object> B;

    /* renamed from: v, reason: collision with root package name */
    public final transient Object[] f30144v;

    /* renamed from: w, reason: collision with root package name */
    public final transient int f30145w;

    /* renamed from: x, reason: collision with root package name */
    public final transient Object[] f30146x;
    public final transient int y;

    /* renamed from: z, reason: collision with root package name */
    public final transient int f30147z;

    static {
        Object[] objArr = new Object[0];
        A = objArr;
        B = new x1<>(objArr, 0, objArr, 0, 0);
    }

    public x1(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f30144v = objArr;
        this.f30145w = i10;
        this.f30146x = objArr2;
        this.y = i11;
        this.f30147z = i12;
    }

    @Override // j7.t0, j7.g0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: A */
    public final t2<E> iterator() {
        return p().listIterator(0);
    }

    @Override // j7.t0
    public final j0<E> E() {
        return j0.B(this.f30147z, this.f30144v);
    }

    @Override // j7.t0
    public final boolean F() {
        return true;
    }

    @Override // j7.g0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        if (obj != null) {
            Object[] objArr = this.f30146x;
            if (objArr.length != 0) {
                int c10 = f0.c(obj);
                while (true) {
                    int i10 = c10 & this.y;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    c10 = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override // j7.t0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f30145w;
    }

    @Override // j7.g0
    public final int q(int i10, Object[] objArr) {
        Object[] objArr2 = this.f30144v;
        int i11 = this.f30147z;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // j7.g0
    public final Object[] r() {
        return this.f30144v;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f30147z;
    }

    @Override // j7.g0
    public final int u() {
        return this.f30147z;
    }

    @Override // j7.g0
    public final int v() {
        return 0;
    }

    @Override // j7.g0
    public final boolean x() {
        return false;
    }
}
