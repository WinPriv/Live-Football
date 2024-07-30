package j7;

import com.google.j2objc.annotations.Weak;
import j7.m1;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: Multimaps.java */
/* loaded from: classes2.dex */
public final class p1<K, V> extends m1.e<K, Collection<V>> {

    /* renamed from: v, reason: collision with root package name */
    @Weak
    public final n1<K, V> f30073v;

    /* compiled from: Multimaps.java */
    /* loaded from: classes2.dex */
    public class a extends m1.a<K, Collection<V>> {

        /* compiled from: Multimaps.java */
        /* renamed from: j7.p1$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0409a implements i7.d<K, Collection<V>> {
            public C0409a() {
            }

            @Override // i7.d
            public final Object apply(Object obj) {
                return p1.this.f30073v.get(obj);
            }
        }

        public a() {
        }

        @Override // j7.m1.a
        public final Map<K, Collection<V>> d() {
            return p1.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
            Set<K> keySet = p1.this.f30073v.keySet();
            return new l1(keySet.iterator(), new C0409a());
        }

        @Override // j7.m1.a, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(@CheckForNull Object obj) {
            if (!contains(obj)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Objects.requireNonNull(entry);
            p1.this.f30073v.keySet().remove(entry.getKey());
            return true;
        }
    }

    public p1(n1<K, V> n1Var) {
        n1Var.getClass();
        this.f30073v = n1Var;
    }

    @Override // j7.m1.e
    public final Set<Map.Entry<K, Collection<V>>> b() {
        return new a();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f30073v.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        return this.f30073v.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final Object get(@CheckForNull Object obj) {
        if (containsKey(obj)) {
            return this.f30073v.get(obj);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return this.f30073v.isEmpty();
    }

    @Override // j7.m1.e, java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        return this.f30073v.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final Object remove(@CheckForNull Object obj) {
        if (containsKey(obj)) {
            return this.f30073v.l(obj);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f30073v.keySet().size();
    }
}
