package j7;

import java.io.Serializable;
import javax.annotation.CheckForNull;

/* compiled from: ReverseOrdering.java */
/* loaded from: classes2.dex */
public final class b2<T> extends u1<T> implements Serializable {

    /* renamed from: s, reason: collision with root package name */
    public final u1<? super T> f29884s;

    public b2(u1<? super T> u1Var) {
        u1Var.getClass();
        this.f29884s = u1Var;
    }

    @Override // j7.u1, java.util.Comparator
    public final int compare(T t10, T t11) {
        return this.f29884s.compare(t11, t10);
    }

    @Override // java.util.Comparator
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            return this.f29884s.equals(((b2) obj).f29884s);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f29884s.hashCode();
    }

    @Override // j7.u1
    public final <S extends T> u1<S> k() {
        return this.f29884s;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f29884s);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 10);
        sb2.append(valueOf);
        sb2.append(".reverse()");
        return sb2.toString();
    }
}
