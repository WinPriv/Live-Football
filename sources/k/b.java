package k;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: SafeIterableMap.java */
/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: s, reason: collision with root package name */
    public c<K, V> f30230s;

    /* renamed from: t, reason: collision with root package name */
    public c<K, V> f30231t;

    /* renamed from: u, reason: collision with root package name */
    public final WeakHashMap<f<K, V>, Boolean> f30232u = new WeakHashMap<>();

    /* renamed from: v, reason: collision with root package name */
    public int f30233v = 0;

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // k.b.e
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.f30237v;
        }

        @Override // k.b.e
        public final c<K, V> c(c<K, V> cVar) {
            return cVar.f30236u;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* renamed from: k.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0413b<K, V> extends e<K, V> {
        public C0413b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // k.b.e
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.f30236u;
        }

        @Override // k.b.e
        public final c<K, V> c(c<K, V> cVar) {
            return cVar.f30237v;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: s, reason: collision with root package name */
        public final K f30234s;

        /* renamed from: t, reason: collision with root package name */
        public final V f30235t;

        /* renamed from: u, reason: collision with root package name */
        public c<K, V> f30236u;

        /* renamed from: v, reason: collision with root package name */
        public c<K, V> f30237v;

        public c(K k10, V v3) {
            this.f30234s = k10;
            this.f30235t = v3;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f30234s.equals(cVar.f30234s) && this.f30235t.equals(cVar.f30235t)) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f30234s;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f30235t;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return this.f30234s.hashCode() ^ this.f30235t.hashCode();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v3) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            return this.f30234s + ContainerUtils.KEY_VALUE_DELIMITER + this.f30235t;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: s, reason: collision with root package name */
        public c<K, V> f30238s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f30239t = true;

        public d() {
        }

        @Override // k.b.f
        public final void a(c<K, V> cVar) {
            boolean z10;
            c<K, V> cVar2 = this.f30238s;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f30237v;
                this.f30238s = cVar3;
                if (cVar3 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f30239t = z10;
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f30239t) {
                if (b.this.f30230s != null) {
                    return true;
                }
                return false;
            }
            c<K, V> cVar = this.f30238s;
            if (cVar != null && cVar.f30236u != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            c<K, V> cVar;
            if (this.f30239t) {
                this.f30239t = false;
                this.f30238s = b.this.f30230s;
            } else {
                c<K, V> cVar2 = this.f30238s;
                if (cVar2 != null) {
                    cVar = cVar2.f30236u;
                } else {
                    cVar = null;
                }
                this.f30238s = cVar;
            }
            return this.f30238s;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: s, reason: collision with root package name */
        public c<K, V> f30241s;

        /* renamed from: t, reason: collision with root package name */
        public c<K, V> f30242t;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f30241s = cVar2;
            this.f30242t = cVar;
        }

        @Override // k.b.f
        public final void a(c<K, V> cVar) {
            c<K, V> cVar2 = null;
            if (this.f30241s == cVar && cVar == this.f30242t) {
                this.f30242t = null;
                this.f30241s = null;
            }
            c<K, V> cVar3 = this.f30241s;
            if (cVar3 == cVar) {
                this.f30241s = b(cVar3);
            }
            c<K, V> cVar4 = this.f30242t;
            if (cVar4 == cVar) {
                c<K, V> cVar5 = this.f30241s;
                if (cVar4 != cVar5 && cVar5 != null) {
                    cVar2 = c(cVar4);
                }
                this.f30242t = cVar2;
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f30242t != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            c<K, V> cVar;
            c<K, V> cVar2 = this.f30242t;
            c<K, V> cVar3 = this.f30241s;
            if (cVar2 != cVar3 && cVar3 != null) {
                cVar = c(cVar2);
            } else {
                cVar = null;
            }
            this.f30242t = cVar;
            return cVar2;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public c<K, V> a(K k10) {
        c<K, V> cVar = this.f30230s;
        while (cVar != null && !cVar.f30234s.equals(k10)) {
            cVar = cVar.f30236u;
        }
        return cVar;
    }

    public V b(K k10, V v3) {
        c<K, V> a10 = a(k10);
        if (a10 != null) {
            return a10.f30235t;
        }
        c<K, V> cVar = new c<>(k10, v3);
        this.f30233v++;
        c<K, V> cVar2 = this.f30231t;
        if (cVar2 == null) {
            this.f30230s = cVar;
            this.f30231t = cVar;
            return null;
        }
        cVar2.f30236u = cVar;
        cVar.f30237v = cVar2;
        this.f30231t = cVar;
        return null;
    }

    public V c(K k10) {
        c<K, V> a10 = a(k10);
        if (a10 == null) {
            return null;
        }
        this.f30233v--;
        WeakHashMap<f<K, V>, Boolean> weakHashMap = this.f30232u;
        if (!weakHashMap.isEmpty()) {
            Iterator<f<K, V>> it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(a10);
            }
        }
        c<K, V> cVar = a10.f30237v;
        if (cVar != null) {
            cVar.f30236u = a10.f30236u;
        } else {
            this.f30230s = a10.f30236u;
        }
        c<K, V> cVar2 = a10.f30236u;
        if (cVar2 != null) {
            cVar2.f30237v = cVar;
        } else {
            this.f30231t = cVar;
        }
        a10.f30236u = null;
        a10.f30237v = null;
        return a10.f30235t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((k.b.e) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0054, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof k.b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            k.b r7 = (k.b) r7
            int r1 = r6.f30233v
            int r3 = r7.f30233v
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            k.b$e r3 = (k.b.e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            k.b$e r4 = (k.b.e) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            k.b$e r7 = (k.b.e) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = r2
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k.b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i10 = 0;
        while (true) {
            e eVar = (e) it;
            if (eVar.hasNext()) {
                i10 += ((Map.Entry) eVar.next()).hashCode();
            } else {
                return i10;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f30230s, this.f30231t);
        this.f30232u.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (true) {
            e eVar = (e) it;
            if (eVar.hasNext()) {
                sb2.append(((Map.Entry) eVar.next()).toString());
                if (eVar.hasNext()) {
                    sb2.append(", ");
                }
            } else {
                sb2.append("]");
                return sb2.toString();
            }
        }
    }
}
