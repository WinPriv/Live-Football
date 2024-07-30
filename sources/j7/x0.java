package j7;

/* compiled from: IndexedImmutableSet.java */
/* loaded from: classes2.dex */
public abstract class x0<E> extends t0<E> {

    /* compiled from: IndexedImmutableSet.java */
    /* loaded from: classes2.dex */
    public class a extends j0<E> {
        public a() {
        }

        @Override // java.util.List
        public final E get(int i10) {
            return (E) x0.this.get(i10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return x0.this.size();
        }

        @Override // j7.g0
        public final boolean x() {
            return x0.this.x();
        }
    }

    @Override // j7.t0, j7.g0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: A */
    public t2<E> iterator() {
        return p().listIterator(0);
    }

    @Override // j7.t0
    public final j0<E> E() {
        return new a();
    }

    public abstract E get(int i10);

    @Override // j7.g0
    public final int q(int i10, Object[] objArr) {
        return p().q(i10, objArr);
    }
}
