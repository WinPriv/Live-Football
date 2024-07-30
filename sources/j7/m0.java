package j7;

import com.anythink.core.api.ATAdConst;
import com.google.j2objc.annotations.RetainedWith;
import j7.g0;
import j7.w;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import javax.annotation.CheckForNull;

/* compiled from: ImmutableMap.java */
/* loaded from: classes2.dex */
public abstract class m0<K, V> implements Map<K, V>, Serializable {

    /* renamed from: s, reason: collision with root package name */
    @RetainedWith
    @CheckForNull
    public transient t0<Map.Entry<K, V>> f30036s;

    /* renamed from: t, reason: collision with root package name */
    @RetainedWith
    @CheckForNull
    public transient t0<K> f30037t;

    /* renamed from: u, reason: collision with root package name */
    @RetainedWith
    @CheckForNull
    public transient g0<V> f30038u;

    /* compiled from: ImmutableMap.java */
    /* loaded from: classes2.dex */
    public static class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public Object[] f30039a = new Object[8];

        /* renamed from: b, reason: collision with root package name */
        public int f30040b = 0;

        public a(int i10) {
        }

        public final void a(Object obj, Object obj2) {
            int i10 = (this.f30040b + 1) * 2;
            Object[] objArr = this.f30039a;
            if (i10 > objArr.length) {
                this.f30039a = Arrays.copyOf(objArr, g0.b.a(objArr.length, i10));
            }
            r.x(obj, obj2);
            Object[] objArr2 = this.f30039a;
            int i11 = this.f30040b;
            int i12 = i11 * 2;
            objArr2[i12] = obj;
            objArr2[i12 + 1] = obj2;
            this.f30040b = i11 + 1;
        }
    }

    /* compiled from: ImmutableMap.java */
    /* loaded from: classes2.dex */
    public static abstract class b<K, V> extends m0<K, V> {

        /* compiled from: ImmutableMap.java */
        /* loaded from: classes2.dex */
        public class a extends n0<K, V> {
            public a() {
            }

            @Override // j7.g0
            /* renamed from: A */
            public final t2<Map.Entry<K, V>> iterator() {
                w.c cVar = (w.c) b.this;
                cVar.getClass();
                return new x(cVar);
            }
        }

        @Override // j7.m0, java.util.Map
        public final /* bridge */ /* synthetic */ Set entrySet() {
            return entrySet();
        }

        @Override // j7.m0
        public final t0<Map.Entry<K, V>> k() {
            return new a();
        }

        @Override // j7.m0, java.util.Map
        public final /* bridge */ /* synthetic */ Set keySet() {
            return keySet();
        }

        @Override // j7.m0
        public final g0<V> q() {
            return new p0(this);
        }

        @Override // j7.m0, java.util.Map
        public final /* bridge */ /* synthetic */ Collection values() {
            return values();
        }
    }

    public static <K, V> m0<K, V> a(Map<? extends K, ? extends V> map) {
        int i10;
        int size;
        if ((map instanceof m0) && !(map instanceof SortedMap)) {
            m0<K, V> m0Var = (m0) map;
            if (!m0Var.u()) {
                return m0Var;
            }
        }
        Set<Map.Entry<? extends K, ? extends V>> entrySet = map.entrySet();
        boolean z10 = entrySet instanceof Collection;
        if (z10) {
            i10 = entrySet.size();
        } else {
            i10 = 4;
        }
        int i11 = i10 * 2;
        Object[] objArr = new Object[i11];
        int i12 = 0;
        if (z10 && (size = (entrySet.size() + 0) * 2) > i11) {
            objArr = Arrays.copyOf(objArr, g0.b.a(i11, size));
        }
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i13 = i12 + 1;
            int i14 = i13 * 2;
            if (i14 > objArr.length) {
                objArr = Arrays.copyOf(objArr, g0.b.a(objArr.length, i14));
            }
            r.x(key, value);
            int i15 = i12 * 2;
            objArr[i15] = key;
            objArr[i15 + 1] = value;
            i12 = i13;
        }
        return w1.y(i12, objArr);
    }

    public static w1 w(Object obj, Object obj2) {
        r.x(obj, obj2);
        return w1.y(1, new Object[]{obj, obj2});
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(@CheckForNull Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(@CheckForNull Object obj) {
        return m1.a(this, obj);
    }

    @Override // java.util.Map
    @CheckForNull
    public abstract V get(@CheckForNull Object obj);

    @Override // java.util.Map
    @CheckForNull
    public final V getOrDefault(@CheckForNull Object obj, @CheckForNull V v3) {
        V v10 = get(obj);
        if (v10 != null) {
            return v10;
        }
        return v3;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return f2.c(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public abstract t0<Map.Entry<K, V>> k();

    public abstract t0<K> p();

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final V put(K k10, V v3) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    public abstract g0<V> q();

    @Override // java.util.Map
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final t0<Map.Entry<K, V>> entrySet() {
        t0<Map.Entry<K, V>> t0Var = this.f30036s;
        if (t0Var == null) {
            t0<Map.Entry<K, V>> k10 = k();
            this.f30036s = k10;
            return k10;
        }
        return t0Var;
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final V remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        r.y(size, ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE);
        StringBuilder sb2 = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb2.append('{');
        boolean z10 = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z10 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }

    public abstract boolean u();

    @Override // java.util.Map
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final t0<K> keySet() {
        t0<K> t0Var = this.f30037t;
        if (t0Var == null) {
            t0<K> p10 = p();
            this.f30037t = p10;
            return p10;
        }
        return t0Var;
    }

    @Override // java.util.Map
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final g0<V> values() {
        g0<V> g0Var = this.f30038u;
        if (g0Var == null) {
            g0<V> q10 = q();
            this.f30038u = q10;
            return q10;
        }
        return g0Var;
    }
}
