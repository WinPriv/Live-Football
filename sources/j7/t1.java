package j7;

import java.io.Serializable;

/* compiled from: NaturalOrdering.java */
/* loaded from: classes2.dex */
public final class t1 extends u1<Comparable<?>> implements Serializable {

    /* renamed from: s, reason: collision with root package name */
    public static final t1 f30103s = new t1();

    @Override // j7.u1, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    @Override // j7.u1
    public final <S extends Comparable<?>> u1<S> k() {
        return a2.f29876s;
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
