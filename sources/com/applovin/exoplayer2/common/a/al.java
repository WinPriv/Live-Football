package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.AbstractMap;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class al<K, V> extends u<K, V> {

    /* renamed from: b, reason: collision with root package name */
    static final u<Object, Object> f13695b = new al(null, new Object[0], 0);

    /* renamed from: c, reason: collision with root package name */
    final transient Object[] f13696c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int[] f13697d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f13698e;

    /* loaded from: classes.dex */
    public static class a<K, V> extends w<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        private final transient u<K, V> f13699a;

        /* renamed from: b, reason: collision with root package name */
        private final transient Object[] f13700b;

        /* renamed from: c, reason: collision with root package name */
        private final transient int f13701c;

        /* renamed from: d, reason: collision with root package name */
        private final transient int f13702d;

        public a(u<K, V> uVar, Object[] objArr, int i10, int i11) {
            this.f13699a = uVar;
            this.f13700b = objArr;
            this.f13701c = i10;
            this.f13702d = i11;
        }

        @Override // com.applovin.exoplayer2.common.a.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.f13699a.get(key))) {
                return false;
            }
            return true;
        }

        @Override // com.applovin.exoplayer2.common.a.q
        public boolean f() {
            return true;
        }

        @Override // com.applovin.exoplayer2.common.a.w
        public s<Map.Entry<K, V>> i() {
            return new s<Map.Entry<K, V>>() { // from class: com.applovin.exoplayer2.common.a.al.a.1
                @Override // java.util.List
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public Map.Entry<K, V> get(int i10) {
                    Preconditions.checkElementIndex(i10, a.this.f13702d);
                    int i11 = i10 * 2;
                    return new AbstractMap.SimpleImmutableEntry(a.this.f13700b[a.this.f13701c + i11], a.this.f13700b[i11 + (a.this.f13701c ^ 1)]);
                }

                @Override // com.applovin.exoplayer2.common.a.q
                public boolean f() {
                    return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                    return a.this.f13702d;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f13702d;
        }

        @Override // com.applovin.exoplayer2.common.a.w, com.applovin.exoplayer2.common.a.q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: a */
        public ax<Map.Entry<K, V>> iterator() {
            return e().iterator();
        }

        @Override // com.applovin.exoplayer2.common.a.q
        public int a(Object[] objArr, int i10) {
            return e().a(objArr, i10);
        }
    }

    /* loaded from: classes.dex */
    public static final class b<K> extends w<K> {

        /* renamed from: a, reason: collision with root package name */
        private final transient u<K, ?> f13704a;

        /* renamed from: b, reason: collision with root package name */
        private final transient s<K> f13705b;

        public b(u<K, ?> uVar, s<K> sVar) {
            this.f13704a = uVar;
            this.f13705b = sVar;
        }

        @Override // com.applovin.exoplayer2.common.a.w, com.applovin.exoplayer2.common.a.q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: a */
        public ax<K> iterator() {
            return e().iterator();
        }

        @Override // com.applovin.exoplayer2.common.a.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            if (this.f13704a.get(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // com.applovin.exoplayer2.common.a.w, com.applovin.exoplayer2.common.a.q
        public s<K> e() {
            return this.f13705b;
        }

        @Override // com.applovin.exoplayer2.common.a.q
        public boolean f() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f13704a.size();
        }

        @Override // com.applovin.exoplayer2.common.a.q
        public int a(Object[] objArr, int i10) {
            return e().a(objArr, i10);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends s<Object> {

        /* renamed from: a, reason: collision with root package name */
        private final transient Object[] f13706a;

        /* renamed from: b, reason: collision with root package name */
        private final transient int f13707b;

        /* renamed from: c, reason: collision with root package name */
        private final transient int f13708c;

        public c(Object[] objArr, int i10, int i11) {
            this.f13706a = objArr;
            this.f13707b = i10;
            this.f13708c = i11;
        }

        @Override // com.applovin.exoplayer2.common.a.q
        public boolean f() {
            return true;
        }

        @Override // java.util.List
        public Object get(int i10) {
            Preconditions.checkElementIndex(i10, this.f13708c);
            return this.f13706a[(i10 * 2) + this.f13707b];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f13708c;
        }
    }

    private al(int[] iArr, Object[] objArr, int i10) {
        this.f13697d = iArr;
        this.f13696c = objArr;
        this.f13698e = i10;
    }

    public static <K, V> al<K, V> a(int i10, Object[] objArr) {
        if (i10 == 0) {
            return (al) f13695b;
        }
        if (i10 == 1) {
            j.a(objArr[0], objArr[1]);
            return new al<>(null, objArr, 1);
        }
        Preconditions.checkPositionIndex(i10, objArr.length >> 1);
        return new al<>(a(objArr, i10, w.a(i10), 0), objArr, i10);
    }

    @Override // com.applovin.exoplayer2.common.a.u
    public w<Map.Entry<K, V>> d() {
        return new a(this, this.f13696c, 0, this.f13698e);
    }

    @Override // com.applovin.exoplayer2.common.a.u
    public w<K> f() {
        return new b(this, new c(this.f13696c, 0, this.f13698e));
    }

    @Override // com.applovin.exoplayer2.common.a.u, java.util.Map
    @NullableDecl
    public V get(@NullableDecl Object obj) {
        return (V) a(this.f13697d, this.f13696c, this.f13698e, 0, obj);
    }

    @Override // com.applovin.exoplayer2.common.a.u
    public q<V> h() {
        return new c(this.f13696c, 1, this.f13698e);
    }

    @Override // com.applovin.exoplayer2.common.a.u
    public boolean i() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.f13698e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        r12[r7] = r5;
        r3 = r3 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] a(java.lang.Object[] r10, int r11, int r12, int r13) {
        /*
            r0 = 1
            if (r11 != r0) goto Le
            r11 = r10[r13]
            r12 = r13 ^ 1
            r10 = r10[r12]
            com.applovin.exoplayer2.common.a.j.a(r11, r10)
            r10 = 0
            return r10
        Le:
            int r1 = r12 + (-1)
            int[] r12 = new int[r12]
            r2 = -1
            java.util.Arrays.fill(r12, r2)
            r3 = 0
        L17:
            if (r3 >= r11) goto L74
            int r4 = r3 * 2
            int r5 = r4 + r13
            r6 = r10[r5]
            r7 = r13 ^ 1
            int r4 = r4 + r7
            r4 = r10[r4]
            com.applovin.exoplayer2.common.a.j.a(r6, r4)
            int r7 = r6.hashCode()
            int r7 = com.applovin.exoplayer2.common.a.p.a(r7)
        L2f:
            r7 = r7 & r1
            r8 = r12[r7]
            if (r8 != r2) goto L39
            r12[r7] = r5
            int r3 = r3 + 1
            goto L17
        L39:
            r9 = r10[r8]
            boolean r9 = r9.equals(r6)
            if (r9 != 0) goto L44
            int r7 = r7 + 1
            goto L2f
        L44:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Multiple entries with same key: "
            r12.<init>(r13)
            r12.append(r6)
            java.lang.String r13 = "="
            r12.append(r13)
            r12.append(r4)
            java.lang.String r1 = " and "
            r12.append(r1)
            r1 = r10[r8]
            r12.append(r1)
            r12.append(r13)
            r13 = r8 ^ 1
            r10 = r10[r13]
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r11.<init>(r10)
            throw r11
        L74:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.common.a.al.a(java.lang.Object[], int, int, int):int[]");
    }

    public static Object a(@NullableDecl int[] iArr, @NullableDecl Object[] objArr, int i10, int i11, @NullableDecl Object obj) {
        if (obj == null) {
            return null;
        }
        if (i10 == 1) {
            if (objArr[i11].equals(obj)) {
                return objArr[i11 ^ 1];
            }
            return null;
        }
        if (iArr == null) {
            return null;
        }
        int length = iArr.length - 1;
        int a10 = p.a(obj.hashCode());
        while (true) {
            int i12 = a10 & length;
            int i13 = iArr[i12];
            if (i13 == -1) {
                return null;
            }
            if (objArr[i13].equals(obj)) {
                return objArr[i13 ^ 1];
            }
            a10 = i12 + 1;
        }
    }
}
