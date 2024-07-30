package j7;

import j7.n2;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: AbstractTable.java */
/* loaded from: classes2.dex */
public abstract class i<R, C, V> implements n2<R, C, V> {

    /* renamed from: s, reason: collision with root package name */
    @CheckForNull
    public transient Set<n2.a<R, C, V>> f29995s;

    /* renamed from: t, reason: collision with root package name */
    @CheckForNull
    public transient Collection<V> f29996t;

    /* compiled from: AbstractTable.java */
    /* loaded from: classes2.dex */
    public class a extends AbstractSet<n2.a<R, C, V>> {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            i.this.r();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@CheckForNull Object obj) {
            boolean z10;
            if (!(obj instanceof n2.a)) {
                return false;
            }
            n2.a aVar = (n2.a) obj;
            Map map = (Map) m1.c(i.this.p(), aVar.p());
            if (map == null) {
                return false;
            }
            Set entrySet = map.entrySet();
            h0 h0Var = new h0(aVar.k(), aVar.getValue());
            entrySet.getClass();
            try {
                z10 = entrySet.contains(h0Var);
            } catch (ClassCastException | NullPointerException unused) {
                z10 = false;
            }
            if (!z10) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<n2.a<R, C, V>> iterator() {
            return i.this.q();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(@CheckForNull Object obj) {
            boolean z10;
            if (!(obj instanceof n2.a)) {
                return false;
            }
            n2.a aVar = (n2.a) obj;
            Map map = (Map) m1.c(i.this.p(), aVar.p());
            if (map == null) {
                return false;
            }
            Set entrySet = map.entrySet();
            h0 h0Var = new h0(aVar.k(), aVar.getValue());
            entrySet.getClass();
            try {
                z10 = entrySet.remove(h0Var);
            } catch (ClassCastException | NullPointerException unused) {
                z10 = false;
            }
            if (!z10) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return i.this.size();
        }
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n2) {
            return k().equals(((n2) obj).k());
        }
        return false;
    }

    public final int hashCode() {
        return k().hashCode();
    }

    @Override // j7.n2
    public abstract Set<n2.a<R, C, V>> k();

    public abstract Iterator<n2.a<R, C, V>> q();

    public abstract void r();

    public final String toString() {
        return p().toString();
    }

    public Set<n2.a<R, C, V>> u() {
        return new a();
    }

    @CheckForNull
    public V v(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Map map = (Map) m1.c(p(), obj);
        if (map != null) {
            try {
                return (V) map.get(obj2);
            } catch (ClassCastException | NullPointerException unused) {
                return null;
            }
        }
        return null;
    }
}
