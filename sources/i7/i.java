package i7;

import java.io.Serializable;
import java.util.List;
import javax.annotation.CheckForNull;

/* compiled from: Predicates.java */
/* loaded from: classes2.dex */
public final class i<T> implements h<T>, Serializable {

    /* renamed from: s, reason: collision with root package name */
    public final List<? extends h<? super T>> f29206s;

    public i() {
        throw null;
    }

    public i(List list) {
        this.f29206s = list;
    }

    @Override // i7.h
    public final boolean apply(T t10) {
        int i10 = 0;
        while (true) {
            List<? extends h<? super T>> list = this.f29206s;
            if (i10 < list.size()) {
                if (!list.get(i10).apply(t10)) {
                    return false;
                }
                i10++;
            } else {
                return true;
            }
        }
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof i) {
            return this.f29206s.equals(((i) obj).f29206s);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29206s.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Predicates.and(");
        boolean z10 = true;
        for (T t10 : this.f29206s) {
            if (!z10) {
                sb2.append(',');
            }
            sb2.append(t10);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
