package t3;

/* compiled from: CachedHashCodeArrayMap.java */
/* loaded from: classes.dex */
public final class b<K, V> extends q.b<K, V> {
    public int A;

    @Override // q.i, java.util.Map
    public final void clear() {
        this.A = 0;
        super.clear();
    }

    @Override // q.i, java.util.Map
    public final int hashCode() {
        if (this.A == 0) {
            this.A = super.hashCode();
        }
        return this.A;
    }

    @Override // q.i
    public final void i(q.b bVar) {
        this.A = 0;
        super.i(bVar);
    }

    @Override // q.i
    public final V j(int i10) {
        this.A = 0;
        return (V) super.j(i10);
    }

    @Override // q.i
    public final V k(int i10, V v3) {
        this.A = 0;
        return (V) super.k(i10, v3);
    }

    @Override // q.i, java.util.Map
    public final V put(K k10, V v3) {
        this.A = 0;
        return (V) super.put(k10, v3);
    }
}
