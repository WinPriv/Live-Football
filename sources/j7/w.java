package j7;

import j7.m0;
import j7.n2;
import java.lang.reflect.Array;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: DenseImmutableTable.java */
/* loaded from: classes2.dex */
public final class w<R, C, V> extends z1<R, C, V> {
    public final V[][] A;
    public final int[] B;
    public final int[] C;

    /* renamed from: u, reason: collision with root package name */
    public final w1 f30116u;

    /* renamed from: v, reason: collision with root package name */
    public final w1 f30117v;

    /* renamed from: w, reason: collision with root package name */
    public final e f30118w;

    /* renamed from: x, reason: collision with root package name */
    public final b f30119x;
    public final int[] y;

    /* renamed from: z, reason: collision with root package name */
    public final int[] f30120z;

    /* compiled from: DenseImmutableTable.java */
    /* loaded from: classes2.dex */
    public final class a extends c<R, V> {

        /* renamed from: w, reason: collision with root package name */
        public final int f30121w;

        public a(int i10) {
            super(w.this.f30120z[i10]);
            this.f30121w = i10;
        }

        @Override // j7.w.c
        public final m0<R, Integer> A() {
            return w.this.f30116u;
        }

        @Override // j7.m0
        public final boolean u() {
            return true;
        }

        @Override // j7.w.c
        @CheckForNull
        public final V y(int i10) {
            return w.this.A[i10][this.f30121w];
        }
    }

    /* compiled from: DenseImmutableTable.java */
    /* loaded from: classes2.dex */
    public final class b extends c<C, m0<R, V>> {
        public b() {
            super(w.this.f30120z.length);
        }

        @Override // j7.w.c
        public final m0<C, Integer> A() {
            return w.this.f30117v;
        }

        @Override // j7.m0
        public final boolean u() {
            return false;
        }

        @Override // j7.w.c
        public final Object y(int i10) {
            return new a(i10);
        }
    }

    /* compiled from: DenseImmutableTable.java */
    /* loaded from: classes2.dex */
    public static abstract class c<K, V> extends m0.b<K, V> {

        /* renamed from: v, reason: collision with root package name */
        public final int f30124v;

        public c(int i10) {
            this.f30124v = i10;
        }

        public abstract m0<K, Integer> A();

        @Override // j7.m0, java.util.Map
        @CheckForNull
        public final V get(@CheckForNull Object obj) {
            Integer num = A().get(obj);
            if (num == null) {
                return null;
            }
            return y(num.intValue());
        }

        @Override // j7.m0
        public final t0<K> p() {
            boolean z10;
            if (this.f30124v == A().size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return A().keySet();
            }
            return new o0(this);
        }

        @Override // java.util.Map
        public final int size() {
            return this.f30124v;
        }

        @CheckForNull
        public abstract V y(int i10);
    }

    /* compiled from: DenseImmutableTable.java */
    /* loaded from: classes2.dex */
    public final class d extends c<C, V> {

        /* renamed from: w, reason: collision with root package name */
        public final int f30125w;

        public d(int i10) {
            super(w.this.y[i10]);
            this.f30125w = i10;
        }

        @Override // j7.w.c
        public final m0<C, Integer> A() {
            return w.this.f30117v;
        }

        @Override // j7.m0
        public final boolean u() {
            return true;
        }

        @Override // j7.w.c
        @CheckForNull
        public final V y(int i10) {
            return w.this.A[this.f30125w][i10];
        }
    }

    /* compiled from: DenseImmutableTable.java */
    /* loaded from: classes2.dex */
    public final class e extends c<R, m0<C, V>> {
        public e() {
            super(w.this.y.length);
        }

        @Override // j7.w.c
        public final m0<R, Integer> A() {
            return w.this.f30116u;
        }

        @Override // j7.m0
        public final boolean u() {
            return false;
        }

        @Override // j7.w.c
        public final Object y(int i10) {
            return new d(i10);
        }
    }

    public w(j0<n2.a<R, C, V>> j0Var, t0<R> t0Var, t0<C> t0Var2) {
        this.A = (V[][]) ((Object[][]) Array.newInstance((Class<?>) Object.class, t0Var.size(), t0Var2.size()));
        w1 b10 = m1.b(t0Var);
        this.f30116u = b10;
        w1 b11 = m1.b(t0Var2);
        this.f30117v = b11;
        this.y = new int[b10.f30130x];
        this.f30120z = new int[b11.f30130x];
        int[] iArr = new int[j0Var.size()];
        int[] iArr2 = new int[j0Var.size()];
        for (int i10 = 0; i10 < j0Var.size(); i10++) {
            n2.a<R, C, V> aVar = j0Var.get(i10);
            R p10 = aVar.p();
            C k10 = aVar.k();
            Integer num = (Integer) this.f30116u.get(p10);
            Objects.requireNonNull(num);
            int intValue = num.intValue();
            Integer num2 = (Integer) this.f30117v.get(k10);
            Objects.requireNonNull(num2);
            int intValue2 = num2.intValue();
            z1.G(p10, k10, this.A[intValue][intValue2], aVar.getValue());
            this.A[intValue][intValue2] = aVar.getValue();
            int[] iArr3 = this.y;
            iArr3[intValue] = iArr3[intValue] + 1;
            int[] iArr4 = this.f30120z;
            iArr4[intValue2] = iArr4[intValue2] + 1;
            iArr[i10] = intValue;
            iArr2[i10] = intValue2;
        }
        this.B = iArr;
        this.C = iArr2;
        this.f30118w = new e();
        this.f30119x = new b();
    }

    @Override // j7.w0
    /* renamed from: E */
    public final m0<R, Map<C, V>> p() {
        return m0.a(this.f30118w);
    }

    @Override // j7.z1
    public final p2 H(int i10) {
        int i11 = this.B[i10];
        int i12 = this.C[i10];
        R r10 = p().keySet().p().get(i11);
        C c10 = K().keySet().p().get(i12);
        V v3 = this.A[i11][i12];
        Objects.requireNonNull(v3);
        return w0.w(r10, c10, v3);
    }

    @Override // j7.z1
    public final V I(int i10) {
        V v3 = this.A[this.B[i10]][this.C[i10]];
        Objects.requireNonNull(v3);
        return v3;
    }

    public final m0<C, Map<R, V>> K() {
        return m0.a(this.f30119x);
    }

    @Override // j7.n2
    public final int size() {
        return this.B.length;
    }

    @Override // j7.i
    @CheckForNull
    public final V v(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Integer num = (Integer) this.f30116u.get(obj);
        Integer num2 = (Integer) this.f30117v.get(obj2);
        if (num != null && num2 != null) {
            return this.A[num.intValue()][num2.intValue()];
        }
        return null;
    }
}
