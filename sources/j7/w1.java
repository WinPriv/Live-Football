package j7;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: RegularImmutableMap.java */
/* loaded from: classes2.dex */
public final class w1<K, V> extends m0<K, V> {
    public static final w1 y = new w1(null, 0, new Object[0]);

    /* renamed from: v, reason: collision with root package name */
    @CheckForNull
    public final transient Object f30128v;

    /* renamed from: w, reason: collision with root package name */
    public final transient Object[] f30129w;

    /* renamed from: x, reason: collision with root package name */
    public final transient int f30130x;

    /* compiled from: RegularImmutableMap.java */
    /* loaded from: classes2.dex */
    public static class a<K, V> extends t0<Map.Entry<K, V>> {

        /* renamed from: v, reason: collision with root package name */
        public final transient m0<K, V> f30131v;

        /* renamed from: w, reason: collision with root package name */
        public final transient Object[] f30132w;

        /* renamed from: x, reason: collision with root package name */
        public final transient int f30133x = 0;
        public final transient int y;

        /* compiled from: RegularImmutableMap.java */
        /* renamed from: j7.w1$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0410a extends j0<Map.Entry<K, V>> {
            public C0410a() {
            }

            @Override // java.util.List
            public final Object get(int i10) {
                a aVar = a.this;
                i7.f.b(i10, aVar.y);
                int i11 = i10 * 2;
                int i12 = aVar.f30133x;
                Object[] objArr = aVar.f30132w;
                Object obj = objArr[i12 + i11];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i11 + (i12 ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return a.this.y;
            }

            @Override // j7.g0
            public final boolean x() {
                return true;
            }
        }

        public a(m0 m0Var, Object[] objArr, int i10) {
            this.f30131v = m0Var;
            this.f30132w = objArr;
            this.y = i10;
        }

        @Override // j7.t0, j7.g0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: A */
        public final t2<Map.Entry<K, V>> iterator() {
            return p().listIterator(0);
        }

        @Override // j7.t0
        public final j0<Map.Entry<K, V>> E() {
            return new C0410a();
        }

        @Override // j7.g0, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.f30131v.get(key))) {
                return false;
            }
            return true;
        }

        @Override // j7.g0
        public final int q(int i10, Object[] objArr) {
            return p().q(i10, objArr);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.y;
        }

        @Override // j7.g0
        public final boolean x() {
            return true;
        }
    }

    /* compiled from: RegularImmutableMap.java */
    /* loaded from: classes2.dex */
    public static final class b<K> extends t0<K> {

        /* renamed from: v, reason: collision with root package name */
        public final transient m0<K, ?> f30135v;

        /* renamed from: w, reason: collision with root package name */
        public final transient j0<K> f30136w;

        public b(m0 m0Var, c cVar) {
            this.f30135v = m0Var;
            this.f30136w = cVar;
        }

        @Override // j7.t0, j7.g0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: A */
        public final t2<K> iterator() {
            return this.f30136w.listIterator(0);
        }

        @Override // j7.g0, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@CheckForNull Object obj) {
            if (this.f30135v.get(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // j7.t0, j7.g0
        public final j0<K> p() {
            return this.f30136w;
        }

        @Override // j7.g0
        public final int q(int i10, Object[] objArr) {
            return this.f30136w.q(i10, objArr);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f30135v.size();
        }

        @Override // j7.g0
        public final boolean x() {
            return true;
        }
    }

    /* compiled from: RegularImmutableMap.java */
    /* loaded from: classes2.dex */
    public static final class c extends j0<Object> {

        /* renamed from: u, reason: collision with root package name */
        public final transient Object[] f30137u;

        /* renamed from: v, reason: collision with root package name */
        public final transient int f30138v;

        /* renamed from: w, reason: collision with root package name */
        public final transient int f30139w;

        public c(Object[] objArr, int i10, int i11) {
            this.f30137u = objArr;
            this.f30138v = i10;
            this.f30139w = i11;
        }

        @Override // java.util.List
        public final Object get(int i10) {
            i7.f.b(i10, this.f30139w);
            Object obj = this.f30137u[(i10 * 2) + this.f30138v];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f30139w;
        }

        @Override // j7.g0
        public final boolean x() {
            return true;
        }
    }

    public w1(@CheckForNull Object obj, int i10, Object[] objArr) {
        this.f30128v = obj;
        this.f30129w = objArr;
        this.f30130x = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        r1[r7] = (byte) r4;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a2, code lost:
    
        r1[r7] = (short) r4;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00dc, code lost:
    
        r1[r8] = r5;
        r3 = r3 + 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <K, V> j7.w1<K, V> y(int r11, java.lang.Object[] r12) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j7.w1.y(int, java.lang.Object[]):j7.w1");
    }

    public static IllegalArgumentException z(Object obj, Object obj2, Object[] objArr, int i10) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(objArr[i10]);
        String valueOf4 = String.valueOf(objArr[i10 ^ 1]);
        StringBuilder sb2 = new StringBuilder(valueOf4.length() + valueOf3.length() + valueOf2.length() + valueOf.length() + 39);
        sb2.append("Multiple entries with same key: ");
        sb2.append(valueOf);
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append(valueOf2);
        return new IllegalArgumentException(a3.l.q(sb2, " and ", valueOf3, ContainerUtils.KEY_VALUE_DELIMITER, valueOf4));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x009e A[RETURN] */
    @Override // j7.m0, java.util.Map
    @javax.annotation.CheckForNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V get(@javax.annotation.CheckForNull java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L4
            goto L1e
        L4:
            r1 = 1
            java.lang.Object[] r2 = r9.f30129w
            int r3 = r9.f30130x
            if (r3 != r1) goto L21
            r3 = 0
            r3 = r2[r3]
            java.util.Objects.requireNonNull(r3)
            boolean r10 = r3.equals(r10)
            if (r10 == 0) goto L1e
            r10 = r2[r1]
            java.util.Objects.requireNonNull(r10)
            goto L9c
        L1e:
            r10 = r0
            goto L9c
        L21:
            java.lang.Object r3 = r9.f30128v
            if (r3 != 0) goto L26
            goto L1e
        L26:
            boolean r4 = r3 instanceof byte[]
            r5 = -1
            if (r4 == 0) goto L52
            r4 = r3
            byte[] r4 = (byte[]) r4
            int r3 = r4.length
            int r6 = r3 + (-1)
            int r3 = r10.hashCode()
            int r3 = j7.f0.b(r3)
        L39:
            r3 = r3 & r6
            r5 = r4[r3]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L42
            goto L1e
        L42:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L4f
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9c
        L4f:
            int r3 = r3 + 1
            goto L39
        L52:
            boolean r4 = r3 instanceof short[]
            if (r4 == 0) goto L7e
            r4 = r3
            short[] r4 = (short[]) r4
            int r3 = r4.length
            int r6 = r3 + (-1)
            int r3 = r10.hashCode()
            int r3 = j7.f0.b(r3)
        L64:
            r3 = r3 & r6
            short r5 = r4[r3]
            r7 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r7
            if (r5 != r7) goto L6e
            goto L1e
        L6e:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7b
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9c
        L7b:
            int r3 = r3 + 1
            goto L64
        L7e:
            int[] r3 = (int[]) r3
            int r4 = r3.length
            int r4 = r4 - r1
            int r6 = r10.hashCode()
            int r6 = j7.f0.b(r6)
        L8a:
            r6 = r6 & r4
            r7 = r3[r6]
            if (r7 != r5) goto L90
            goto L1e
        L90:
            r8 = r2[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La0
            r10 = r7 ^ 1
            r10 = r2[r10]
        L9c:
            if (r10 != 0) goto L9f
            return r0
        L9f:
            return r10
        La0:
            int r6 = r6 + 1
            goto L8a
        */
        throw new UnsupportedOperationException("Method not decompiled: j7.w1.get(java.lang.Object):java.lang.Object");
    }

    @Override // j7.m0
    public final t0<Map.Entry<K, V>> k() {
        return new a(this, this.f30129w, this.f30130x);
    }

    @Override // j7.m0
    public final t0<K> p() {
        return new b(this, new c(this.f30129w, 0, this.f30130x));
    }

    @Override // j7.m0
    public final g0<V> q() {
        return new c(this.f30129w, 1, this.f30130x);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f30130x;
    }

    @Override // j7.m0
    public final boolean u() {
        return false;
    }
}
