package j7;

import j7.j0;
import j7.s0;
import java.util.Collection;
import javax.annotation.CheckForNull;

/* compiled from: ImmutableListMultimap.java */
/* loaded from: classes2.dex */
public class k0<K, V> extends s0<K, V> {

    /* compiled from: ImmutableListMultimap.java */
    /* loaded from: classes2.dex */
    public static final class a<K, V> extends s0.a<K, V> {
        @Override // j7.s0.a
        public final /* bridge */ /* synthetic */ s0 a() {
            throw null;
        }

        @Override // j7.s0.a
        public final s0.a b(Iterable iterable, Object obj) {
            throw null;
        }

        public final k0<K, V> c() {
            return (k0) super.a();
        }
    }

    public k0(w1 w1Var, int i10) {
        super(w1Var, i10);
    }

    @Override // j7.s0
    @Deprecated
    public final g0 A() {
        throw new UnsupportedOperationException();
    }

    @Override // j7.s0, j7.n1
    public final Collection get(Object obj) {
        j0 j0Var = (j0) this.f30094w.get(obj);
        if (j0Var == null) {
            j0.b bVar = j0.f30006t;
            return v1.f30113w;
        }
        return j0Var;
    }

    @Override // j7.s0, j7.n1
    @Deprecated
    public final Collection l(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // j7.s0
    /* renamed from: y */
    public final j0 get(Object obj) {
        j0 j0Var = (j0) this.f30094w.get(obj);
        if (j0Var == null) {
            j0.b bVar = j0.f30006t;
            return v1.f30113w;
        }
        return j0Var;
    }
}
