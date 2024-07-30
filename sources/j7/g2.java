package j7;

import javax.annotation.CheckForNull;

/* compiled from: SingletonImmutableSet.java */
/* loaded from: classes2.dex */
public final class g2<E> extends t0<E> {

    /* renamed from: v, reason: collision with root package name */
    public final transient E f29987v;

    public g2(E e10) {
        e10.getClass();
        this.f29987v = e10;
    }

    @Override // j7.t0, j7.g0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: A */
    public final t2<E> iterator() {
        return new a1(this.f29987v);
    }

    @Override // j7.g0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return this.f29987v.equals(obj);
    }

    @Override // j7.t0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f29987v.hashCode();
    }

    @Override // j7.t0, j7.g0
    public final j0<E> p() {
        return j0.G(this.f29987v);
    }

    @Override // j7.g0
    public final int q(int i10, Object[] objArr) {
        objArr[i10] = this.f29987v;
        return i10 + 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.f29987v.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 2);
        sb2.append('[');
        sb2.append(obj);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // j7.g0
    public final boolean x() {
        return false;
    }
}
