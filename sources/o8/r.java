package o8;

import com.huawei.hms.framework.common.ContainerUtils;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: LinkedTreeMap.java */
/* loaded from: classes2.dex */
public final class r<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final a A = new a();

    /* renamed from: s, reason: collision with root package name */
    public final Comparator<? super K> f33751s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f33752t;

    /* renamed from: u, reason: collision with root package name */
    public e<K, V> f33753u;

    /* renamed from: v, reason: collision with root package name */
    public int f33754v;

    /* renamed from: w, reason: collision with root package name */
    public int f33755w;

    /* renamed from: x, reason: collision with root package name */
    public final e<K, V> f33756x;
    public r<K, V>.b y;

    /* renamed from: z, reason: collision with root package name */
    public r<K, V>.c f33757z;

    /* compiled from: LinkedTreeMap.java */
    /* loaded from: classes2.dex */
    public class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        public final int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* compiled from: LinkedTreeMap.java */
    /* loaded from: classes2.dex */
    public class b extends AbstractSet<Map.Entry<K, V>> {

        /* compiled from: LinkedTreeMap.java */
        /* loaded from: classes2.dex */
        public class a extends r<K, V>.d<Map.Entry<K, V>> {
            public a(b bVar) {
                super();
            }

            @Override // java.util.Iterator
            public final Object next() {
                return a();
            }
        }

        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            r.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if ((obj instanceof Map.Entry) && r.this.b((Map.Entry) obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            r rVar;
            e<K, V> b10;
            if (!(obj instanceof Map.Entry) || (b10 = (rVar = r.this).b((Map.Entry) obj)) == null) {
                return false;
            }
            rVar.d(b10, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return r.this.f33754v;
        }
    }

    /* compiled from: LinkedTreeMap.java */
    /* loaded from: classes2.dex */
    public final class c extends AbstractSet<K> {

        /* compiled from: LinkedTreeMap.java */
        /* loaded from: classes2.dex */
        public class a extends r<K, V>.d<K> {
            public a(c cVar) {
                super();
            }

            @Override // java.util.Iterator
            public final K next() {
                return a().f33769x;
            }
        }

        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            r.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return r.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new a(this);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean remove(java.lang.Object r4) {
            /*
                r3 = this;
                o8.r r0 = o8.r.this
                r0.getClass()
                r1 = 0
                if (r4 == 0) goto Ld
                o8.r$e r4 = r0.a(r4, r1)     // Catch: java.lang.ClassCastException -> Ld
                goto Le
            Ld:
                r4 = 0
            Le:
                r2 = 1
                if (r4 == 0) goto L14
                r0.d(r4, r2)
            L14:
                if (r4 == 0) goto L17
                r1 = r2
            L17:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: o8.r.c.remove(java.lang.Object):boolean");
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return r.this.f33754v;
        }
    }

    /* compiled from: LinkedTreeMap.java */
    /* loaded from: classes2.dex */
    public abstract class d<T> implements Iterator<T> {

        /* renamed from: s, reason: collision with root package name */
        public e<K, V> f33760s;

        /* renamed from: t, reason: collision with root package name */
        public e<K, V> f33761t = null;

        /* renamed from: u, reason: collision with root package name */
        public int f33762u;

        public d() {
            this.f33760s = r.this.f33756x.f33767v;
            this.f33762u = r.this.f33755w;
        }

        public final e<K, V> a() {
            e<K, V> eVar = this.f33760s;
            r rVar = r.this;
            if (eVar != rVar.f33756x) {
                if (rVar.f33755w == this.f33762u) {
                    this.f33760s = eVar.f33767v;
                    this.f33761t = eVar;
                    return eVar;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f33760s != r.this.f33756x) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f33761t;
            if (eVar != null) {
                r rVar = r.this;
                rVar.d(eVar, true);
                this.f33761t = null;
                this.f33762u = rVar.f33755w;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public r(boolean z10) {
        a aVar = A;
        this.f33754v = 0;
        this.f33755w = 0;
        this.f33751s = aVar;
        this.f33752t = z10;
        this.f33756x = new e<>(z10);
    }

    public final e<K, V> a(K k10, boolean z10) {
        int i10;
        e<K, V> eVar;
        Comparable comparable;
        e<K, V> eVar2;
        e<K, V> eVar3 = this.f33753u;
        a aVar = A;
        Comparator<? super K> comparator = this.f33751s;
        if (eVar3 != null) {
            if (comparator == aVar) {
                comparable = (Comparable) k10;
            } else {
                comparable = null;
            }
            while (true) {
                K k11 = eVar3.f33769x;
                if (comparable != null) {
                    i10 = comparable.compareTo(k11);
                } else {
                    i10 = comparator.compare(k10, k11);
                }
                if (i10 == 0) {
                    return eVar3;
                }
                if (i10 < 0) {
                    eVar2 = eVar3.f33765t;
                } else {
                    eVar2 = eVar3.f33766u;
                }
                if (eVar2 == null) {
                    break;
                }
                eVar3 = eVar2;
            }
        } else {
            i10 = 0;
        }
        if (!z10) {
            return null;
        }
        e<K, V> eVar4 = this.f33756x;
        if (eVar3 == null) {
            if (comparator == aVar && !(k10 instanceof Comparable)) {
                throw new ClassCastException(k10.getClass().getName().concat(" is not Comparable"));
            }
            eVar = new e<>(this.f33752t, eVar3, k10, eVar4, eVar4.f33768w);
            this.f33753u = eVar;
        } else {
            eVar = new e<>(this.f33752t, eVar3, k10, eVar4, eVar4.f33768w);
            if (i10 < 0) {
                eVar3.f33765t = eVar;
            } else {
                eVar3.f33766u = eVar;
            }
            c(eVar3, true);
        }
        this.f33754v++;
        this.f33755w++;
        return eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o8.r.e<K, V> b(java.util.Map.Entry<?, ?> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto Ld
            o8.r$e r0 = r4.a(r0, r1)     // Catch: java.lang.ClassCastException -> Ld
            goto Le
        Ld:
            r0 = r2
        Le:
            if (r0 == 0) goto L1d
            V r3 = r0.f33770z
            java.lang.Object r5 = r5.getValue()
            boolean r5 = java.util.Objects.equals(r3, r5)
            if (r5 == 0) goto L1d
            r1 = 1
        L1d:
            if (r1 == 0) goto L20
            r2 = r0
        L20:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.r.b(java.util.Map$Entry):o8.r$e");
    }

    public final void c(e<K, V> eVar, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f33765t;
            e<K, V> eVar3 = eVar.f33766u;
            int i14 = 0;
            if (eVar2 != null) {
                i10 = eVar2.A;
            } else {
                i10 = 0;
            }
            if (eVar3 != null) {
                i11 = eVar3.A;
            } else {
                i11 = 0;
            }
            int i15 = i10 - i11;
            if (i15 == -2) {
                e<K, V> eVar4 = eVar3.f33765t;
                e<K, V> eVar5 = eVar3.f33766u;
                if (eVar5 != null) {
                    i13 = eVar5.A;
                } else {
                    i13 = 0;
                }
                if (eVar4 != null) {
                    i14 = eVar4.A;
                }
                int i16 = i14 - i13;
                if (i16 != -1 && (i16 != 0 || z10)) {
                    g(eVar3);
                    f(eVar);
                } else {
                    f(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i15 == 2) {
                e<K, V> eVar6 = eVar2.f33765t;
                e<K, V> eVar7 = eVar2.f33766u;
                if (eVar7 != null) {
                    i12 = eVar7.A;
                } else {
                    i12 = 0;
                }
                if (eVar6 != null) {
                    i14 = eVar6.A;
                }
                int i17 = i14 - i12;
                if (i17 != 1 && (i17 != 0 || z10)) {
                    f(eVar2);
                    g(eVar);
                } else {
                    g(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i15 == 0) {
                eVar.A = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                eVar.A = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            eVar = eVar.f33764s;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f33753u = null;
        this.f33754v = 0;
        this.f33755w++;
        e<K, V> eVar = this.f33756x;
        eVar.f33768w = eVar;
        eVar.f33767v = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:5:0x000b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean containsKey(java.lang.Object r2) {
        /*
            r1 = this;
            r0 = 0
            if (r2 == 0) goto L8
            o8.r$e r2 = r1.a(r2, r0)     // Catch: java.lang.ClassCastException -> L8
            goto L9
        L8:
            r2 = 0
        L9:
            if (r2 == 0) goto Lc
            r0 = 1
        Lc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.r.containsKey(java.lang.Object):boolean");
    }

    public final void d(e<K, V> eVar, boolean z10) {
        e<K, V> eVar2;
        e<K, V> eVar3;
        int i10;
        if (z10) {
            e<K, V> eVar4 = eVar.f33768w;
            eVar4.f33767v = eVar.f33767v;
            eVar.f33767v.f33768w = eVar4;
        }
        e<K, V> eVar5 = eVar.f33765t;
        e<K, V> eVar6 = eVar.f33766u;
        e<K, V> eVar7 = eVar.f33764s;
        int i11 = 0;
        if (eVar5 != null && eVar6 != null) {
            if (eVar5.A > eVar6.A) {
                e<K, V> eVar8 = eVar5.f33766u;
                while (true) {
                    e<K, V> eVar9 = eVar8;
                    eVar3 = eVar5;
                    eVar5 = eVar9;
                    if (eVar5 == null) {
                        break;
                    } else {
                        eVar8 = eVar5.f33766u;
                    }
                }
            } else {
                e<K, V> eVar10 = eVar6.f33765t;
                while (true) {
                    eVar2 = eVar6;
                    eVar6 = eVar10;
                    if (eVar6 == null) {
                        break;
                    } else {
                        eVar10 = eVar6.f33765t;
                    }
                }
                eVar3 = eVar2;
            }
            d(eVar3, false);
            e<K, V> eVar11 = eVar.f33765t;
            if (eVar11 != null) {
                i10 = eVar11.A;
                eVar3.f33765t = eVar11;
                eVar11.f33764s = eVar3;
                eVar.f33765t = null;
            } else {
                i10 = 0;
            }
            e<K, V> eVar12 = eVar.f33766u;
            if (eVar12 != null) {
                i11 = eVar12.A;
                eVar3.f33766u = eVar12;
                eVar12.f33764s = eVar3;
                eVar.f33766u = null;
            }
            eVar3.A = Math.max(i10, i11) + 1;
            e(eVar, eVar3);
            return;
        }
        if (eVar5 != null) {
            e(eVar, eVar5);
            eVar.f33765t = null;
        } else if (eVar6 != null) {
            e(eVar, eVar6);
            eVar.f33766u = null;
        } else {
            e(eVar, null);
        }
        c(eVar7, false);
        this.f33754v--;
        this.f33755w++;
    }

    public final void e(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f33764s;
        eVar.f33764s = null;
        if (eVar2 != null) {
            eVar2.f33764s = eVar3;
        }
        if (eVar3 != null) {
            if (eVar3.f33765t == eVar) {
                eVar3.f33765t = eVar2;
                return;
            } else {
                eVar3.f33766u = eVar2;
                return;
            }
        }
        this.f33753u = eVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        r<K, V>.b bVar = this.y;
        if (bVar == null) {
            r<K, V>.b bVar2 = new b();
            this.y = bVar2;
            return bVar2;
        }
        return bVar;
    }

    public final void f(e<K, V> eVar) {
        int i10;
        int i11;
        e<K, V> eVar2 = eVar.f33765t;
        e<K, V> eVar3 = eVar.f33766u;
        e<K, V> eVar4 = eVar3.f33765t;
        e<K, V> eVar5 = eVar3.f33766u;
        eVar.f33766u = eVar4;
        if (eVar4 != null) {
            eVar4.f33764s = eVar;
        }
        e(eVar, eVar3);
        eVar3.f33765t = eVar;
        eVar.f33764s = eVar3;
        int i12 = 0;
        if (eVar2 != null) {
            i10 = eVar2.A;
        } else {
            i10 = 0;
        }
        if (eVar4 != null) {
            i11 = eVar4.A;
        } else {
            i11 = 0;
        }
        int max = Math.max(i10, i11) + 1;
        eVar.A = max;
        if (eVar5 != null) {
            i12 = eVar5.A;
        }
        eVar3.A = Math.max(max, i12) + 1;
    }

    public final void g(e<K, V> eVar) {
        int i10;
        int i11;
        e<K, V> eVar2 = eVar.f33765t;
        e<K, V> eVar3 = eVar.f33766u;
        e<K, V> eVar4 = eVar2.f33765t;
        e<K, V> eVar5 = eVar2.f33766u;
        eVar.f33765t = eVar5;
        if (eVar5 != null) {
            eVar5.f33764s = eVar;
        }
        e(eVar, eVar2);
        eVar2.f33766u = eVar;
        eVar.f33764s = eVar2;
        int i12 = 0;
        if (eVar3 != null) {
            i10 = eVar3.A;
        } else {
            i10 = 0;
        }
        if (eVar5 != null) {
            i11 = eVar5.A;
        } else {
            i11 = 0;
        }
        int max = Math.max(i10, i11) + 1;
        eVar.A = max;
        if (eVar4 != null) {
            i12 = eVar4.A;
        }
        eVar2.A = Math.max(max, i12) + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V get(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            o8.r$e r3 = r2.a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto Le
            V r0 = r3.f33770z
        Le:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.r.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        r<K, V>.c cVar = this.f33757z;
        if (cVar == null) {
            r<K, V>.c cVar2 = new c();
            this.f33757z = cVar2;
            return cVar2;
        }
        return cVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k10, V v3) {
        if (k10 != null) {
            if (v3 == null && !this.f33752t) {
                throw new NullPointerException("value == null");
            }
            e<K, V> a10 = a(k10, true);
            V v10 = a10.f33770z;
            a10.f33770z = v3;
            return v10;
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V remove(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            o8.r$e r3 = r2.a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto L10
            r1 = 1
            r2.d(r3, r1)
        L10:
            if (r3 == 0) goto L14
            V r0 = r3.f33770z
        L14:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.r.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f33754v;
    }

    /* compiled from: LinkedTreeMap.java */
    /* loaded from: classes2.dex */
    public static final class e<K, V> implements Map.Entry<K, V> {
        public int A;

        /* renamed from: s, reason: collision with root package name */
        public e<K, V> f33764s;

        /* renamed from: t, reason: collision with root package name */
        public e<K, V> f33765t;

        /* renamed from: u, reason: collision with root package name */
        public e<K, V> f33766u;

        /* renamed from: v, reason: collision with root package name */
        public e<K, V> f33767v;

        /* renamed from: w, reason: collision with root package name */
        public e<K, V> f33768w;

        /* renamed from: x, reason: collision with root package name */
        public final K f33769x;
        public final boolean y;

        /* renamed from: z, reason: collision with root package name */
        public V f33770z;

        public e(boolean z10) {
            this.f33769x = null;
            this.y = z10;
            this.f33768w = this;
            this.f33767v = this;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k10 = this.f33769x;
            if (k10 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k10.equals(entry.getKey())) {
                return false;
            }
            V v3 = this.f33770z;
            if (v3 == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!v3.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f33769x;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f33770z;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            int hashCode;
            int i10 = 0;
            K k10 = this.f33769x;
            if (k10 == null) {
                hashCode = 0;
            } else {
                hashCode = k10.hashCode();
            }
            V v3 = this.f33770z;
            if (v3 != null) {
                i10 = v3.hashCode();
            }
            return i10 ^ hashCode;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v3) {
            if (v3 == null && !this.y) {
                throw new NullPointerException("value == null");
            }
            V v10 = this.f33770z;
            this.f33770z = v3;
            return v10;
        }

        public final String toString() {
            return this.f33769x + ContainerUtils.KEY_VALUE_DELIMITER + this.f33770z;
        }

        public e(boolean z10, e<K, V> eVar, K k10, e<K, V> eVar2, e<K, V> eVar3) {
            this.f33764s = eVar;
            this.f33769x = k10;
            this.y = z10;
            this.A = 1;
            this.f33767v = eVar2;
            this.f33768w = eVar3;
            eVar3.f33767v = this;
            eVar2.f33768w = this;
        }
    }

    public r() {
        this(true);
    }
}
