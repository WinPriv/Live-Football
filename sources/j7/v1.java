package j7;

import java.util.Objects;

/* compiled from: RegularImmutableList.java */
/* loaded from: classes2.dex */
public final class v1<E> extends j0<E> {

    /* renamed from: w, reason: collision with root package name */
    public static final v1 f30113w = new v1(new Object[0], 0);

    /* renamed from: u, reason: collision with root package name */
    public final transient Object[] f30114u;

    /* renamed from: v, reason: collision with root package name */
    public final transient int f30115v;

    public v1(Object[] objArr, int i10) {
        this.f30114u = objArr;
        this.f30115v = i10;
    }

    @Override // java.util.List
    public final E get(int i10) {
        i7.f.b(i10, this.f30115v);
        E e10 = (E) this.f30114u[i10];
        Objects.requireNonNull(e10);
        return e10;
    }

    @Override // j7.j0, j7.g0
    public final int q(int i10, Object[] objArr) {
        Object[] objArr2 = this.f30114u;
        int i11 = this.f30115v;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // j7.g0
    public final Object[] r() {
        return this.f30114u;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30115v;
    }

    @Override // j7.g0
    public final int u() {
        return this.f30115v;
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
