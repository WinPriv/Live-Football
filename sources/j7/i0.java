package j7;

import java.lang.Enum;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* compiled from: ImmutableEnumSet.java */
/* loaded from: classes2.dex */
public final class i0<E extends Enum<E>> extends t0<E> {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f29998x = 0;

    /* renamed from: v, reason: collision with root package name */
    public final transient EnumSet<E> f29999v;

    /* renamed from: w, reason: collision with root package name */
    public transient int f30000w;

    public i0(EnumSet<E> enumSet) {
        this.f29999v = enumSet;
    }

    @Override // j7.t0, j7.g0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: A */
    public final t2<E> iterator() {
        Iterator<E> it = this.f29999v.iterator();
        it.getClass();
        if (it instanceof t2) {
            return (t2) it;
        }
        return new y0(it);
    }

    @Override // j7.g0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return this.f29999v.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        if (collection instanceof i0) {
            collection = ((i0) collection).f29999v;
        }
        return this.f29999v.containsAll(collection);
    }

    @Override // j7.t0, java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i0) {
            obj = ((i0) obj).f29999v;
        }
        return this.f29999v.equals(obj);
    }

    @Override // j7.t0, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i10 = this.f30000w;
        if (i10 == 0) {
            int hashCode = this.f29999v.hashCode();
            this.f30000w = hashCode;
            return hashCode;
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f29999v.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f29999v.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return this.f29999v.toString();
    }

    @Override // j7.g0
    public final boolean x() {
        return false;
    }
}
