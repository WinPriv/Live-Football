package j7;

import java.io.Serializable;

/* compiled from: ReverseNaturalOrdering.java */
/* loaded from: classes2.dex */
public final class a2 extends u1<Comparable<?>> implements Serializable {

    /* renamed from: s, reason: collision with root package name */
    public static final a2 f29876s = new a2();

    @Override // j7.u1, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    @Override // j7.u1
    public final <S extends Comparable<?>> u1<S> k() {
        return t1.f30103s;
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
