package j7;

import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: ImmutableMapValues.java */
/* loaded from: classes2.dex */
public final class p0<K, V> extends g0<V> {

    /* renamed from: t, reason: collision with root package name */
    public final m0<K, V> f30070t;

    /* compiled from: ImmutableMapValues.java */
    /* loaded from: classes2.dex */
    public class a extends t2<V> {

        /* renamed from: s, reason: collision with root package name */
        public final t2<Map.Entry<K, V>> f30071s;

        public a(p0 p0Var) {
            this.f30071s = p0Var.f30070t.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f30071s.hasNext();
        }

        @Override // java.util.Iterator
        public final V next() {
            return this.f30071s.next().getValue();
        }
    }

    /* compiled from: ImmutableMapValues.java */
    /* loaded from: classes2.dex */
    public class b extends j0<V> {

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ j0 f30072u;

        public b(j0 j0Var) {
            this.f30072u = j0Var;
        }

        @Override // java.util.List
        public final V get(int i10) {
            return (V) ((Map.Entry) this.f30072u.get(i10)).getValue();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f30072u.size();
        }

        @Override // j7.g0
        public final boolean x() {
            return true;
        }
    }

    public p0(m0<K, V> m0Var) {
        this.f30070t = m0Var;
    }

    @Override // j7.g0
    /* renamed from: A */
    public final t2<V> iterator() {
        return new a(this);
    }

    @Override // j7.g0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        if (obj != null && b1.b(new a(this), obj)) {
            return true;
        }
        return false;
    }

    @Override // j7.g0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new a(this);
    }

    @Override // j7.g0
    public final j0<V> p() {
        return new b(this.f30070t.entrySet().p());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f30070t.size();
    }
}
