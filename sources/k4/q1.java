package k4;

import android.net.Uri;
import android.util.Pair;
import k4.n0;
import k5.a;

/* compiled from: Timeline.java */
/* loaded from: classes2.dex */
public abstract class q1 implements f {

    /* renamed from: s, reason: collision with root package name */
    public static final a f30752s = new a();

    /* compiled from: Timeline.java */
    /* loaded from: classes2.dex */
    public class a extends q1 {
        @Override // k4.q1
        public final int b(Object obj) {
            return -1;
        }

        @Override // k4.q1
        public final b f(int i10, b bVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // k4.q1
        public final int h() {
            return 0;
        }

        @Override // k4.q1
        public final Object l(int i10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // k4.q1
        public final c n(int i10, c cVar, long j10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // k4.q1
        public final int o() {
            return 0;
        }
    }

    /* compiled from: Timeline.java */
    /* loaded from: classes2.dex */
    public static final class b implements f {

        /* renamed from: s, reason: collision with root package name */
        public Object f30754s;

        /* renamed from: t, reason: collision with root package name */
        public Object f30755t;

        /* renamed from: u, reason: collision with root package name */
        public int f30756u;

        /* renamed from: v, reason: collision with root package name */
        public long f30757v;

        /* renamed from: w, reason: collision with root package name */
        public long f30758w;

        /* renamed from: x, reason: collision with root package name */
        public boolean f30759x;
        public k5.a y = k5.a.y;

        /* renamed from: z, reason: collision with root package name */
        public static final String f30753z = d6.g0.F(0);
        public static final String A = d6.g0.F(1);
        public static final String B = d6.g0.F(2);
        public static final String C = d6.g0.F(3);
        public static final String D = d6.g0.F(4);

        static {
            new com.applovin.exoplayer2.d.w(10);
        }

        public final long a(int i10, int i11) {
            a.C0418a a10 = this.y.a(i10);
            if (a10.f30867t != -1) {
                return a10.f30871x[i11];
            }
            return com.anythink.expressad.exoplayer.b.f7291b;
        }

        public final int b(long j10) {
            int i10;
            boolean z10;
            k5.a aVar = this.y;
            long j11 = this.f30757v;
            aVar.getClass();
            if (j10 == Long.MIN_VALUE) {
                return -1;
            }
            if (j11 != com.anythink.expressad.exoplayer.b.f7291b && j10 >= j11) {
                return -1;
            }
            int i11 = aVar.f30864w;
            while (true) {
                i10 = aVar.f30861t;
                if (i11 >= i10) {
                    break;
                }
                if (aVar.a(i11).f30866s == Long.MIN_VALUE || aVar.a(i11).f30866s > j10) {
                    a.C0418a a10 = aVar.a(i11);
                    int i12 = a10.f30867t;
                    if (i12 != -1 && a10.a(-1) >= i12) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        break;
                    }
                }
                i11++;
            }
            if (i11 >= i10) {
                return -1;
            }
            return i11;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0033 A[LOOP:0: B:2:0x0008->B:14:0x0033, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[EDGE_INSN: B:15:0x0036->B:16:0x0036 BREAK  A[LOOP:0: B:2:0x0008->B:14:0x0033], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int c(long r11) {
            /*
                r10 = this;
                k5.a r0 = r10.y
                long r1 = r10.f30757v
                int r3 = r0.f30861t
                r4 = 1
                int r3 = r3 - r4
            L8:
                r5 = 0
                if (r3 < 0) goto L36
                r6 = -9223372036854775808
                int r8 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
                if (r8 != 0) goto L12
                goto L30
            L12:
                k5.a$a r8 = r0.a(r3)
                long r8 = r8.f30866s
                int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r6 != 0) goto L2a
                r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
                if (r6 == 0) goto L2e
                int r6 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
                if (r6 >= 0) goto L30
                goto L2e
            L2a:
                int r6 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
                if (r6 >= 0) goto L30
            L2e:
                r6 = r4
                goto L31
            L30:
                r6 = r5
            L31:
                if (r6 == 0) goto L36
                int r3 = r3 + (-1)
                goto L8
            L36:
                r11 = -1
                if (r3 < 0) goto L55
                k5.a$a r12 = r0.a(r3)
                int r0 = r12.f30867t
                if (r0 != r11) goto L42
                goto L52
            L42:
                r1 = r5
            L43:
                if (r1 >= r0) goto L51
                int[] r2 = r12.f30870w
                r2 = r2[r1]
                if (r2 == 0) goto L52
                if (r2 != r4) goto L4e
                goto L52
            L4e:
                int r1 = r1 + 1
                goto L43
            L51:
                r4 = r5
            L52:
                if (r4 == 0) goto L55
                goto L56
            L55:
                r3 = r11
            L56:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: k4.q1.b.c(long):int");
        }

        public final long d(int i10) {
            return this.y.a(i10).f30866s;
        }

        public final int e(int i10, int i11) {
            a.C0418a a10 = this.y.a(i10);
            if (a10.f30867t != -1) {
                return a10.f30870w[i11];
            }
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            if (d6.g0.a(this.f30754s, bVar.f30754s) && d6.g0.a(this.f30755t, bVar.f30755t) && this.f30756u == bVar.f30756u && this.f30757v == bVar.f30757v && this.f30758w == bVar.f30758w && this.f30759x == bVar.f30759x && d6.g0.a(this.y, bVar.y)) {
                return true;
            }
            return false;
        }

        public final int f(int i10) {
            return this.y.a(i10).a(-1);
        }

        public final boolean g(int i10) {
            return this.y.a(i10).f30872z;
        }

        public final void h(Object obj, Object obj2, int i10, long j10, long j11, k5.a aVar, boolean z10) {
            this.f30754s = obj;
            this.f30755t = obj2;
            this.f30756u = i10;
            this.f30757v = j10;
            this.f30758w = j11;
            this.y = aVar;
            this.f30759x = z10;
        }

        public final int hashCode() {
            int hashCode;
            Object obj = this.f30754s;
            int i10 = 0;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            int i11 = (217 + hashCode) * 31;
            Object obj2 = this.f30755t;
            if (obj2 != null) {
                i10 = obj2.hashCode();
            }
            int i12 = (((i11 + i10) * 31) + this.f30756u) * 31;
            long j10 = this.f30757v;
            int i13 = (i12 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f30758w;
            return this.y.hashCode() + ((((i13 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f30759x ? 1 : 0)) * 31);
        }
    }

    /* compiled from: Timeline.java */
    /* loaded from: classes2.dex */
    public static final class c implements f {
        public static final Object J = new Object();
        public static final Object K = new Object();
        public static final n0 L;
        public static final String M;
        public static final String N;
        public static final String O;
        public static final String P;
        public static final String Q;
        public static final String R;
        public static final String S;
        public static final String T;
        public static final String U;
        public static final String V;
        public static final String W;
        public static final String X;
        public static final String Y;
        public boolean A;

        @Deprecated
        public boolean B;
        public n0.e C;
        public boolean D;
        public long E;
        public long F;
        public int G;
        public int H;
        public long I;

        /* renamed from: t, reason: collision with root package name */
        @Deprecated
        public Object f30761t;

        /* renamed from: v, reason: collision with root package name */
        public Object f30763v;

        /* renamed from: w, reason: collision with root package name */
        public long f30764w;

        /* renamed from: x, reason: collision with root package name */
        public long f30765x;
        public long y;

        /* renamed from: z, reason: collision with root package name */
        public boolean f30766z;

        /* renamed from: s, reason: collision with root package name */
        public Object f30760s = J;

        /* renamed from: u, reason: collision with root package name */
        public n0 f30762u = L;

        static {
            n0.a aVar = new n0.a();
            aVar.f30580a = "com.google.android.exoplayer2.Timeline";
            aVar.f30581b = Uri.EMPTY;
            L = aVar.a();
            M = d6.g0.F(1);
            N = d6.g0.F(2);
            O = d6.g0.F(3);
            P = d6.g0.F(4);
            Q = d6.g0.F(5);
            R = d6.g0.F(6);
            S = d6.g0.F(7);
            T = d6.g0.F(8);
            U = d6.g0.F(9);
            V = d6.g0.F(10);
            W = d6.g0.F(11);
            X = d6.g0.F(12);
            Y = d6.g0.F(13);
            new com.applovin.exoplayer2.a.l(18);
        }

        public final boolean a() {
            boolean z10;
            boolean z11;
            boolean z12 = this.B;
            if (this.C != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z12 == z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            d6.a.d(z11);
            if (this.C != null) {
                return true;
            }
            return false;
        }

        public final void b(Object obj, n0 n0Var, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, n0.e eVar, long j13, long j14, int i10, int i11, long j15) {
            n0 n0Var2;
            Object obj3;
            boolean z12;
            n0.g gVar;
            this.f30760s = obj;
            if (n0Var != null) {
                n0Var2 = n0Var;
            } else {
                n0Var2 = L;
            }
            this.f30762u = n0Var2;
            if (n0Var != null && (gVar = n0Var.f30575t) != null) {
                obj3 = gVar.f30634g;
            } else {
                obj3 = null;
            }
            this.f30761t = obj3;
            this.f30763v = obj2;
            this.f30764w = j10;
            this.f30765x = j11;
            this.y = j12;
            this.f30766z = z10;
            this.A = z11;
            if (eVar != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.B = z12;
            this.C = eVar;
            this.E = j13;
            this.F = j14;
            this.G = i10;
            this.H = i11;
            this.I = j15;
            this.D = false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !c.class.equals(obj.getClass())) {
                return false;
            }
            c cVar = (c) obj;
            if (d6.g0.a(this.f30760s, cVar.f30760s) && d6.g0.a(this.f30762u, cVar.f30762u) && d6.g0.a(this.f30763v, cVar.f30763v) && d6.g0.a(this.C, cVar.C) && this.f30764w == cVar.f30764w && this.f30765x == cVar.f30765x && this.y == cVar.y && this.f30766z == cVar.f30766z && this.A == cVar.A && this.D == cVar.D && this.E == cVar.E && this.F == cVar.F && this.G == cVar.G && this.H == cVar.H && this.I == cVar.I) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2 = (this.f30762u.hashCode() + ((this.f30760s.hashCode() + 217) * 31)) * 31;
            Object obj = this.f30763v;
            int i10 = 0;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            int i11 = (hashCode2 + hashCode) * 31;
            n0.e eVar = this.C;
            if (eVar != null) {
                i10 = eVar.hashCode();
            }
            int i12 = (i11 + i10) * 31;
            long j10 = this.f30764w;
            int i13 = (i12 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f30765x;
            int i14 = (i13 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.y;
            int i15 = (((((((i14 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f30766z ? 1 : 0)) * 31) + (this.A ? 1 : 0)) * 31) + (this.D ? 1 : 0)) * 31;
            long j13 = this.E;
            int i16 = (i15 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
            long j14 = this.F;
            int i17 = (((((i16 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.G) * 31) + this.H) * 31;
            long j15 = this.I;
            return i17 + ((int) (j15 ^ (j15 >>> 32)));
        }
    }

    static {
        d6.g0.F(0);
        d6.g0.F(1);
        d6.g0.F(2);
    }

    public int a(boolean z10) {
        if (p()) {
            return -1;
        }
        return 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z10) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i10, b bVar, c cVar, int i11, boolean z10) {
        int i12 = f(i10, bVar, false).f30756u;
        if (m(i12, cVar).H == i10) {
            int e10 = e(i12, i11, z10);
            if (e10 == -1) {
                return -1;
            }
            return m(e10, cVar).G;
        }
        return i10 + 1;
    }

    public int e(int i10, int i11, boolean z10) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    if (i10 == c(z10)) {
                        return a(z10);
                    }
                    return i10 + 1;
                }
                throw new IllegalStateException();
            }
            return i10;
        }
        if (i10 == c(z10)) {
            return -1;
        }
        return i10 + 1;
    }

    public final boolean equals(Object obj) {
        int c10;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        if (q1Var.o() != o() || q1Var.h() != h()) {
            return false;
        }
        c cVar = new c();
        b bVar = new b();
        c cVar2 = new c();
        b bVar2 = new b();
        for (int i10 = 0; i10 < o(); i10++) {
            if (!m(i10, cVar).equals(q1Var.m(i10, cVar2))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < h(); i11++) {
            if (!f(i11, bVar, true).equals(q1Var.f(i11, bVar2, true))) {
                return false;
            }
        }
        int a10 = a(true);
        if (a10 != q1Var.a(true) || (c10 = c(true)) != q1Var.c(true)) {
            return false;
        }
        while (a10 != c10) {
            int e10 = e(a10, 0, true);
            if (e10 != q1Var.e(a10, 0, true)) {
                return false;
            }
            a10 = e10;
        }
        return true;
    }

    public abstract b f(int i10, b bVar, boolean z10);

    public b g(Object obj, b bVar) {
        return f(b(obj), bVar, true);
    }

    public abstract int h();

    public final int hashCode() {
        c cVar = new c();
        b bVar = new b();
        int o = o() + 217;
        for (int i10 = 0; i10 < o(); i10++) {
            o = (o * 31) + m(i10, cVar).hashCode();
        }
        int h10 = h() + (o * 31);
        for (int i11 = 0; i11 < h(); i11++) {
            h10 = (h10 * 31) + f(i11, bVar, true).hashCode();
        }
        int a10 = a(true);
        while (a10 != -1) {
            h10 = (h10 * 31) + a10;
            a10 = e(a10, 0, true);
        }
        return h10;
    }

    public final Pair<Object, Long> i(c cVar, b bVar, int i10, long j10) {
        Pair<Object, Long> j11 = j(cVar, bVar, i10, j10, 0L);
        j11.getClass();
        return j11;
    }

    public final Pair<Object, Long> j(c cVar, b bVar, int i10, long j10, long j11) {
        d6.a.c(i10, o());
        n(i10, cVar, j11);
        if (j10 == com.anythink.expressad.exoplayer.b.f7291b) {
            j10 = cVar.E;
            if (j10 == com.anythink.expressad.exoplayer.b.f7291b) {
                return null;
            }
        }
        int i11 = cVar.G;
        f(i11, bVar, false);
        while (i11 < cVar.H && bVar.f30758w != j10) {
            int i12 = i11 + 1;
            if (f(i12, bVar, false).f30758w > j10) {
                break;
            }
            i11 = i12;
        }
        f(i11, bVar, true);
        long j12 = j10 - bVar.f30758w;
        long j13 = bVar.f30757v;
        if (j13 != com.anythink.expressad.exoplayer.b.f7291b) {
            j12 = Math.min(j12, j13 - 1);
        }
        long max = Math.max(0L, j12);
        Object obj = bVar.f30755t;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public int k(int i10, int i11, boolean z10) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    if (i10 == a(z10)) {
                        return c(z10);
                    }
                    return i10 - 1;
                }
                throw new IllegalStateException();
            }
            return i10;
        }
        if (i10 == a(z10)) {
            return -1;
        }
        return i10 - 1;
    }

    public abstract Object l(int i10);

    public final c m(int i10, c cVar) {
        return n(i10, cVar, 0L);
    }

    public abstract c n(int i10, c cVar, long j10);

    public abstract int o();

    public final boolean p() {
        if (o() == 0) {
            return true;
        }
        return false;
    }
}
