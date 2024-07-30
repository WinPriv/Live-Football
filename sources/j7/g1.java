package j7;

import j7.f2;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: LinkedListMultimap.java */
/* loaded from: classes2.dex */
public final class g1<K, V> extends j7.f<K, V> implements Serializable {
    public transient int A;

    /* renamed from: w, reason: collision with root package name */
    @CheckForNull
    public transient d<K, V> f29957w;

    /* renamed from: x, reason: collision with root package name */
    @CheckForNull
    public transient d<K, V> f29958x;
    public final transient p y = new p(12);

    /* renamed from: z, reason: collision with root package name */
    public transient int f29959z;

    /* compiled from: LinkedListMultimap.java */
    /* loaded from: classes2.dex */
    public class a extends f2.c<K> {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@CheckForNull Object obj) {
            return g1.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new b();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(@CheckForNull Object obj) {
            g1 g1Var = g1.this;
            g1Var.getClass();
            List unmodifiableList = Collections.unmodifiableList(i1.a(new f(obj)));
            b1.a(new f(obj));
            return !unmodifiableList.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return g1.this.y.size();
        }
    }

    /* compiled from: LinkedListMultimap.java */
    /* loaded from: classes2.dex */
    public class b implements Iterator<K> {

        /* renamed from: s, reason: collision with root package name */
        public final HashSet f29961s;

        /* renamed from: t, reason: collision with root package name */
        @CheckForNull
        public d<K, V> f29962t;

        /* renamed from: u, reason: collision with root package name */
        @CheckForNull
        public d<K, V> f29963u;

        /* renamed from: v, reason: collision with root package name */
        public int f29964v;

        public b() {
            int i10;
            int size = g1.this.keySet().size();
            if (size < 3) {
                r.y(size, "expectedSize");
                i10 = size + 1;
            } else if (size < 1073741824) {
                i10 = (int) ((size / 0.75f) + 1.0f);
            } else {
                i10 = Integer.MAX_VALUE;
            }
            this.f29961s = new HashSet(i10);
            this.f29962t = g1.this.f29957w;
            this.f29964v = g1.this.A;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (g1.this.A == this.f29964v) {
                if (this.f29962t != null) {
                    return true;
                }
                return false;
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.Iterator
        public final K next() {
            d<K, V> dVar;
            if (g1.this.A == this.f29964v) {
                d<K, V> dVar2 = this.f29962t;
                if (dVar2 != null) {
                    this.f29963u = dVar2;
                    HashSet hashSet = this.f29961s;
                    hashSet.add(dVar2.f29969s);
                    do {
                        dVar = this.f29962t.f29971u;
                        this.f29962t = dVar;
                        if (dVar == null) {
                            break;
                        }
                    } while (!hashSet.add(dVar.f29969s));
                    return this.f29963u.f29969s;
                }
                throw new NoSuchElementException();
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            boolean z10;
            g1 g1Var = g1.this;
            if (g1Var.A == this.f29964v) {
                if (this.f29963u != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i7.f.f(z10, "no calls to next() since the last call to remove()");
                K k10 = this.f29963u.f29969s;
                g1Var.getClass();
                b1.a(new f(k10));
                this.f29963u = null;
                this.f29964v = g1Var.A;
                return;
            }
            throw new ConcurrentModificationException();
        }
    }

    /* compiled from: LinkedListMultimap.java */
    /* loaded from: classes2.dex */
    public static class c<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public d<K, V> f29966a;

        /* renamed from: b, reason: collision with root package name */
        public d<K, V> f29967b;

        /* renamed from: c, reason: collision with root package name */
        public int f29968c;

        public c(d<K, V> dVar) {
            this.f29966a = dVar;
            this.f29967b = dVar;
            dVar.f29974x = null;
            dVar.f29973w = null;
            this.f29968c = 1;
        }
    }

    /* compiled from: LinkedListMultimap.java */
    /* loaded from: classes2.dex */
    public static final class d<K, V> extends j7.e<K, V> {

        /* renamed from: s, reason: collision with root package name */
        public final K f29969s;

        /* renamed from: t, reason: collision with root package name */
        public V f29970t;

        /* renamed from: u, reason: collision with root package name */
        @CheckForNull
        public d<K, V> f29971u;

        /* renamed from: v, reason: collision with root package name */
        @CheckForNull
        public d<K, V> f29972v;

        /* renamed from: w, reason: collision with root package name */
        @CheckForNull
        public d<K, V> f29973w;

        /* renamed from: x, reason: collision with root package name */
        @CheckForNull
        public d<K, V> f29974x;

        public d(K k10, V v3) {
            this.f29969s = k10;
            this.f29970t = v3;
        }

        @Override // j7.e, java.util.Map.Entry
        public final K getKey() {
            return this.f29969s;
        }

        @Override // j7.e, java.util.Map.Entry
        public final V getValue() {
            return this.f29970t;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v3) {
            V v10 = this.f29970t;
            this.f29970t = v3;
            return v10;
        }
    }

    /* compiled from: LinkedListMultimap.java */
    /* loaded from: classes2.dex */
    public class e implements ListIterator<Map.Entry<K, V>> {

        /* renamed from: s, reason: collision with root package name */
        public int f29975s;

        /* renamed from: t, reason: collision with root package name */
        @CheckForNull
        public d<K, V> f29976t;

        /* renamed from: u, reason: collision with root package name */
        @CheckForNull
        public d<K, V> f29977u;

        /* renamed from: v, reason: collision with root package name */
        @CheckForNull
        public d<K, V> f29978v;

        /* renamed from: w, reason: collision with root package name */
        public int f29979w;

        public e(int i10) {
            this.f29979w = g1.this.A;
            int i11 = g1.this.f29959z;
            i7.f.d(i10, i11);
            if (i10 >= i11 / 2) {
                this.f29978v = g1.this.f29958x;
                this.f29975s = i11;
                while (true) {
                    int i12 = i10 + 1;
                    if (i10 >= i11) {
                        break;
                    }
                    a();
                    d<K, V> dVar = this.f29978v;
                    if (dVar != null) {
                        this.f29977u = dVar;
                        this.f29976t = dVar;
                        this.f29978v = dVar.f29972v;
                        this.f29975s--;
                        i10 = i12;
                    } else {
                        throw new NoSuchElementException();
                    }
                }
            } else {
                this.f29976t = g1.this.f29957w;
                while (true) {
                    int i13 = i10 - 1;
                    if (i10 <= 0) {
                        break;
                    }
                    a();
                    d<K, V> dVar2 = this.f29976t;
                    if (dVar2 != null) {
                        this.f29977u = dVar2;
                        this.f29978v = dVar2;
                        this.f29976t = dVar2.f29971u;
                        this.f29975s++;
                        i10 = i13;
                    } else {
                        throw new NoSuchElementException();
                    }
                }
            }
            this.f29977u = null;
        }

        public final void a() {
            if (g1.this.A == this.f29979w) {
            } else {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public final void add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            a();
            if (this.f29976t != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            a();
            if (this.f29978v != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            a();
            d<K, V> dVar = this.f29976t;
            if (dVar != null) {
                this.f29977u = dVar;
                this.f29978v = dVar;
                this.f29976t = dVar.f29971u;
                this.f29975s++;
                return dVar;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f29975s;
        }

        @Override // java.util.ListIterator
        public final Object previous() {
            a();
            d<K, V> dVar = this.f29978v;
            if (dVar != null) {
                this.f29977u = dVar;
                this.f29976t = dVar;
                this.f29978v = dVar.f29972v;
                this.f29975s--;
                return dVar;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f29975s - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            boolean z10;
            a();
            if (this.f29977u != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            i7.f.f(z10, "no calls to next() since the last call to remove()");
            d<K, V> dVar = this.f29977u;
            if (dVar != this.f29976t) {
                this.f29978v = dVar.f29972v;
                this.f29975s--;
            } else {
                this.f29976t = dVar.f29971u;
            }
            g1 g1Var = g1.this;
            g1.w(g1Var, dVar);
            this.f29977u = null;
            this.f29979w = g1Var.A;
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            throw new UnsupportedOperationException();
        }
    }

    public static void w(g1 g1Var, d dVar) {
        g1Var.getClass();
        d<K, V> dVar2 = dVar.f29972v;
        if (dVar2 != null) {
            dVar2.f29971u = dVar.f29971u;
        } else {
            g1Var.f29957w = dVar.f29971u;
        }
        d<K, V> dVar3 = dVar.f29971u;
        if (dVar3 != null) {
            dVar3.f29972v = dVar2;
        } else {
            g1Var.f29958x = dVar2;
        }
        d<K, V> dVar4 = dVar.f29974x;
        p pVar = g1Var.y;
        K k10 = dVar.f29969s;
        if (dVar4 == null && dVar.f29973w == null) {
            c cVar = (c) pVar.remove(k10);
            Objects.requireNonNull(cVar);
            cVar.f29968c = 0;
            g1Var.A++;
        } else {
            c cVar2 = (c) pVar.get(k10);
            Objects.requireNonNull(cVar2);
            cVar2.f29968c--;
            d<K, V> dVar5 = dVar.f29974x;
            if (dVar5 == null) {
                d<K, V> dVar6 = dVar.f29973w;
                Objects.requireNonNull(dVar6);
                cVar2.f29966a = dVar6;
            } else {
                dVar5.f29973w = dVar.f29973w;
            }
            d<K, V> dVar7 = dVar.f29973w;
            if (dVar7 == null) {
                d<K, V> dVar8 = dVar.f29974x;
                Objects.requireNonNull(dVar8);
                cVar2.f29967b = dVar8;
            } else {
                dVar7.f29974x = dVar.f29974x;
            }
        }
        g1Var.f29959z--;
    }

    public final Collection A() {
        return new f1(this);
    }

    public final Collection C() {
        return new h1(this);
    }

    @Override // j7.f
    public final boolean a(@CheckForNull Object obj) {
        Collection<V> collection = this.f29945u;
        if (collection == null) {
            collection = C();
            this.f29945u = collection;
        }
        return ((List) collection).contains(obj);
    }

    @Override // j7.n1
    public final void clear() {
        this.f29957w = null;
        this.f29958x = null;
        this.y.clear();
        this.f29959z = 0;
        this.A++;
    }

    @Override // j7.n1
    public final boolean containsKey(@CheckForNull Object obj) {
        return this.y.containsKey(obj);
    }

    @Override // j7.n1
    public final Collection get(Object obj) {
        return new e1(this, obj);
    }

    @Override // j7.f, j7.n1
    public final boolean isEmpty() {
        if (this.f29957w == null) {
            return true;
        }
        return false;
    }

    @Override // j7.f, j7.n1
    public final Collection k() {
        Collection<Map.Entry<K, V>> collection = this.f29943s;
        if (collection == null) {
            collection = A();
            this.f29943s = collection;
        }
        return (List) collection;
    }

    @Override // j7.n1
    public final Collection l(Object obj) {
        List unmodifiableList = Collections.unmodifiableList(i1.a(new f(obj)));
        b1.a(new f(obj));
        return unmodifiableList;
    }

    @Override // j7.n1
    public final boolean put(K k10, V v3) {
        x(k10, v3, null);
        return true;
    }

    @Override // j7.f
    public final Map<K, Collection<V>> q() {
        return new p1(this);
    }

    @Override // j7.f
    public final Set<K> r() {
        return new a();
    }

    @Override // j7.n1
    public final int size() {
        return this.f29959z;
    }

    @Override // j7.f
    public final Iterator<Map.Entry<K, V>> u() {
        throw new AssertionError("should never be called");
    }

    public final d<K, V> x(K k10, V v3, @CheckForNull d<K, V> dVar) {
        d<K, V> dVar2 = new d<>(k10, v3);
        d<K, V> dVar3 = this.f29957w;
        p pVar = this.y;
        if (dVar3 == null) {
            this.f29958x = dVar2;
            this.f29957w = dVar2;
            pVar.put(k10, new c(dVar2));
            this.A++;
        } else if (dVar == null) {
            d<K, V> dVar4 = this.f29958x;
            Objects.requireNonNull(dVar4);
            dVar4.f29971u = dVar2;
            dVar2.f29972v = this.f29958x;
            this.f29958x = dVar2;
            c cVar = (c) pVar.get(k10);
            if (cVar == null) {
                pVar.put(k10, new c(dVar2));
                this.A++;
            } else {
                cVar.f29968c++;
                d<K, V> dVar5 = cVar.f29967b;
                dVar5.f29973w = dVar2;
                dVar2.f29974x = dVar5;
                cVar.f29967b = dVar2;
            }
        } else {
            c cVar2 = (c) pVar.get(k10);
            Objects.requireNonNull(cVar2);
            cVar2.f29968c++;
            dVar2.f29972v = dVar.f29972v;
            dVar2.f29974x = dVar.f29974x;
            dVar2.f29971u = dVar;
            dVar2.f29973w = dVar;
            d<K, V> dVar6 = dVar.f29974x;
            if (dVar6 == null) {
                cVar2.f29966a = dVar2;
            } else {
                dVar6.f29973w = dVar2;
            }
            d<K, V> dVar7 = dVar.f29972v;
            if (dVar7 == null) {
                this.f29957w = dVar2;
            } else {
                dVar7.f29971u = dVar2;
            }
            dVar.f29972v = dVar2;
            dVar.f29974x = dVar2;
        }
        this.f29959z++;
        return dVar2;
    }

    /* compiled from: LinkedListMultimap.java */
    /* loaded from: classes2.dex */
    public class f implements ListIterator<V> {

        /* renamed from: s, reason: collision with root package name */
        public final K f29981s;

        /* renamed from: t, reason: collision with root package name */
        public int f29982t;

        /* renamed from: u, reason: collision with root package name */
        @CheckForNull
        public d<K, V> f29983u;

        /* renamed from: v, reason: collision with root package name */
        @CheckForNull
        public d<K, V> f29984v;

        /* renamed from: w, reason: collision with root package name */
        @CheckForNull
        public d<K, V> f29985w;

        public f(K k10) {
            this.f29981s = k10;
            c cVar = (c) g1.this.y.get(k10);
            this.f29983u = cVar == null ? null : cVar.f29966a;
        }

        @Override // java.util.ListIterator
        public final void add(V v3) {
            this.f29985w = g1.this.x(this.f29981s, v3, this.f29983u);
            this.f29982t++;
            this.f29984v = null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            if (this.f29983u != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            if (this.f29985w != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final V next() {
            d<K, V> dVar = this.f29983u;
            if (dVar != null) {
                this.f29984v = dVar;
                this.f29985w = dVar;
                this.f29983u = dVar.f29973w;
                this.f29982t++;
                return dVar.f29970t;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f29982t;
        }

        @Override // java.util.ListIterator
        public final V previous() {
            d<K, V> dVar = this.f29985w;
            if (dVar != null) {
                this.f29984v = dVar;
                this.f29983u = dVar;
                this.f29985w = dVar.f29974x;
                this.f29982t--;
                return dVar.f29970t;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f29982t - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            boolean z10;
            if (this.f29984v != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            i7.f.f(z10, "no calls to next() since the last call to remove()");
            d<K, V> dVar = this.f29984v;
            if (dVar != this.f29983u) {
                this.f29985w = dVar.f29974x;
                this.f29982t--;
            } else {
                this.f29983u = dVar.f29973w;
            }
            g1.w(g1.this, dVar);
            this.f29984v = null;
        }

        @Override // java.util.ListIterator
        public final void set(V v3) {
            boolean z10;
            d<K, V> dVar = this.f29984v;
            if (dVar != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                dVar.f29970t = v3;
                return;
            }
            throw new IllegalStateException();
        }

        public f(K k10, int i10) {
            c cVar = (c) g1.this.y.get(k10);
            int i11 = cVar == null ? 0 : cVar.f29968c;
            i7.f.d(i10, i11);
            if (i10 >= i11 / 2) {
                this.f29985w = cVar == null ? null : cVar.f29967b;
                this.f29982t = i11;
                while (true) {
                    int i12 = i10 + 1;
                    if (i10 >= i11) {
                        break;
                    }
                    previous();
                    i10 = i12;
                }
            } else {
                this.f29983u = cVar == null ? null : cVar.f29966a;
                while (true) {
                    int i13 = i10 - 1;
                    if (i10 <= 0) {
                        break;
                    }
                    next();
                    i10 = i13;
                }
            }
            this.f29981s = k10;
            this.f29984v = null;
        }
    }
}
