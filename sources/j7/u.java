package j7;

import java.io.Serializable;
import java.util.Comparator;
import javax.annotation.CheckForNull;

/* compiled from: ComparatorOrdering.java */
/* loaded from: classes2.dex */
public final class u<T> extends u1<T> implements Serializable {

    /* renamed from: s, reason: collision with root package name */
    public final Comparator<T> f30104s;

    public u(Comparator<T> comparator) {
        this.f30104s = comparator;
    }

    @Override // j7.u1, java.util.Comparator
    public final int compare(T t10, T t11) {
        return this.f30104s.compare(t10, t11);
    }

    @Override // java.util.Comparator
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            return this.f30104s.equals(((u) obj).f30104s);
        }
        return false;
    }

    public final int hashCode() {
        return this.f30104s.hashCode();
    }

    public final String toString() {
        return this.f30104s.toString();
    }
}
