package j7;

import j7.j0;
import j7.n2;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: RegularImmutableTable.java */
/* loaded from: classes2.dex */
public abstract class z1<R, C, V> extends w0<R, C, V> {

    /* compiled from: RegularImmutableTable.java */
    /* loaded from: classes2.dex */
    public final class a extends x0<n2.a<R, C, V>> {
        public a() {
        }

        @Override // j7.g0, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof n2.a)) {
                return false;
            }
            n2.a aVar = (n2.a) obj;
            V v3 = z1.this.v(aVar.p(), aVar.k());
            if (v3 == null || !v3.equals(aVar.getValue())) {
                return false;
            }
            return true;
        }

        @Override // j7.x0
        public final Object get(int i10) {
            return z1.this.H(i10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return z1.this.size();
        }

        @Override // j7.g0
        public final boolean x() {
            return false;
        }
    }

    /* compiled from: RegularImmutableTable.java */
    /* loaded from: classes2.dex */
    public final class b extends j0<V> {
        public b() {
        }

        @Override // java.util.List
        public final V get(int i10) {
            return (V) z1.this.I(i10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return z1.this.size();
        }

        @Override // j7.g0
        public final boolean x() {
            return true;
        }
    }

    public static void G(Object obj, Object obj2, @CheckForNull Object obj3, Object obj4) {
        boolean z10;
        if (obj3 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
        } else {
            throw new IllegalArgumentException(i7.f.g("Duplicate key: (row=%s, column=%s), values: [%s, %s].", obj, obj2, obj4, obj3));
        }
    }

    @Override // j7.w0
    /* renamed from: A */
    public final g0<V> C() {
        boolean z10;
        if (size() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            j0.b bVar = j0.f30006t;
            return v1.f30113w;
        }
        return new b();
    }

    public abstract p2 H(int i10);

    public abstract V I(int i10);

    @Override // j7.w0, j7.n2
    public /* bridge */ /* synthetic */ Map p() {
        return p();
    }

    @Override // j7.w0, j7.i
    /* renamed from: x */
    public final t0<n2.a<R, C, V>> u() {
        boolean z10;
        if (size() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i10 = t0.f30101u;
            return x1.B;
        }
        return new a();
    }
}
