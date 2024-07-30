package j7;

import com.google.j2objc.annotations.Weak;
import j7.g0;
import j7.p;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: ImmutableMultimap.java */
/* loaded from: classes2.dex */
public abstract class s0<K, V> extends k<K, V> implements Serializable {

    /* renamed from: w, reason: collision with root package name */
    public final transient m0<K, ? extends g0<V>> f30094w;

    /* renamed from: x, reason: collision with root package name */
    public final transient int f30095x;

    /* compiled from: ImmutableMultimap.java */
    /* loaded from: classes2.dex */
    public static class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final p f30096a = new p();

        public s0<K, V> a() {
            Collection entrySet = this.f30096a.entrySet();
            if (((AbstractCollection) entrySet).isEmpty()) {
                return y.y;
            }
            p.a aVar = (p.a) entrySet;
            Object[] objArr = new Object[aVar.size() * 2];
            Iterator<Map.Entry<K, V>> it = aVar.iterator();
            int i10 = 0;
            int i11 = 0;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                K key = next.getKey();
                j0 C = j0.C((Collection) next.getValue());
                if (!C.isEmpty()) {
                    int i12 = i10 + 1;
                    int i13 = i12 * 2;
                    if (i13 > objArr.length) {
                        objArr = Arrays.copyOf(objArr, g0.b.a(objArr.length, i13));
                    }
                    r.x(key, C);
                    int i14 = i10 * 2;
                    objArr[i14] = key;
                    objArr[i14 + 1] = C;
                    i11 += C.size();
                    i10 = i12;
                }
            }
            return new k0(w1.y(i10, objArr), i11);
        }

        public a b(Iterable iterable, Object obj) {
            String str;
            if (obj == null) {
                Iterator it = iterable.iterator();
                StringBuilder sb2 = new StringBuilder("[");
                boolean z10 = true;
                while (it.hasNext()) {
                    if (!z10) {
                        sb2.append(", ");
                    }
                    sb2.append(it.next());
                    z10 = false;
                }
                sb2.append(']');
                String valueOf = String.valueOf(sb2.toString());
                if (valueOf.length() != 0) {
                    str = "null key in entry: null=".concat(valueOf);
                } else {
                    str = new String("null key in entry: null=");
                }
                throw new NullPointerException(str);
            }
            p pVar = this.f30096a;
            Collection collection = (Collection) pVar.get(obj);
            if (collection != null) {
                for (Object obj2 : iterable) {
                    r.x(obj, obj2);
                    collection.add(obj2);
                }
                return this;
            }
            Iterator it2 = iterable.iterator();
            if (!it2.hasNext()) {
                return this;
            }
            ArrayList arrayList = new ArrayList();
            while (it2.hasNext()) {
                Object next = it2.next();
                r.x(obj, next);
                arrayList.add(next);
            }
            pVar.put(obj, arrayList);
            return this;
        }
    }

    /* compiled from: ImmutableMultimap.java */
    /* loaded from: classes2.dex */
    public static class b<K, V> extends g0<Map.Entry<K, V>> {

        /* renamed from: t, reason: collision with root package name */
        @Weak
        public final s0<K, V> f30097t;

        public b(s0<K, V> s0Var) {
            this.f30097t = s0Var;
        }

        @Override // j7.g0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: A */
        public final t2<Map.Entry<K, V>> iterator() {
            s0<K, V> s0Var = this.f30097t;
            s0Var.getClass();
            return new q0(s0Var);
        }

        @Override // j7.g0, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            Collection collection = (Collection) this.f30097t.p().get(key);
            if (collection == null || !collection.contains(value)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.f30097t.f30095x;
        }
    }

    public s0(w1 w1Var, int i10) {
        this.f30094w = w1Var;
        this.f30095x = i10;
    }

    @Deprecated
    public g0 A() {
        throw new UnsupportedOperationException();
    }

    @Override // j7.f
    public final boolean a(@CheckForNull Object obj) {
        if (obj != null && super.a(obj)) {
            return true;
        }
        return false;
    }

    @Override // j7.n1
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // j7.n1
    public final boolean containsKey(@CheckForNull Object obj) {
        return this.f30094w.containsKey(obj);
    }

    @Override // j7.f, j7.n1
    public final Collection k() {
        Collection<Map.Entry<K, V>> collection = this.f29943s;
        if (collection == null) {
            collection = x();
            this.f29943s = collection;
        }
        return (g0) collection;
    }

    @Override // j7.f, j7.n1
    public final Set keySet() {
        return this.f30094w.keySet();
    }

    @Override // j7.n1
    @Deprecated
    public /* bridge */ /* synthetic */ Collection l(@CheckForNull Object obj) {
        return A();
    }

    @Override // j7.f, j7.n1
    public final Map p() {
        return this.f30094w;
    }

    @Override // j7.n1
    @Deprecated
    public final boolean put(K k10, V v3) {
        throw new UnsupportedOperationException();
    }

    @Override // j7.f
    public final Map<K, Collection<V>> q() {
        throw new AssertionError("should never be called");
    }

    @Override // j7.f
    public final Set<K> r() {
        throw new AssertionError("unreachable");
    }

    @Override // j7.f, j7.n1
    @Deprecated
    public final boolean remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // j7.n1
    public final int size() {
        return this.f30095x;
    }

    @Override // j7.f
    public final Iterator u() {
        return new q0(this);
    }

    @Override // j7.f
    public final Iterator v() {
        return new r0(this);
    }

    public final Collection x() {
        return new b(this);
    }

    @Override // j7.n1
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public abstract j0 get(Object obj);
}
