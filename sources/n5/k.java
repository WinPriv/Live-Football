package n5;

import d6.g0;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import k4.i0;

/* compiled from: SegmentBase.java */
/* loaded from: classes2.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public final i f33407a;

    /* renamed from: b, reason: collision with root package name */
    public final long f33408b;

    /* renamed from: c, reason: collision with root package name */
    public final long f33409c;

    /* compiled from: SegmentBase.java */
    /* loaded from: classes2.dex */
    public static abstract class a extends k {

        /* renamed from: d, reason: collision with root package name */
        public final long f33410d;

        /* renamed from: e, reason: collision with root package name */
        public final long f33411e;
        public final List<d> f;

        /* renamed from: g, reason: collision with root package name */
        public final long f33412g;

        /* renamed from: h, reason: collision with root package name */
        public final long f33413h;

        /* renamed from: i, reason: collision with root package name */
        public final long f33414i;

        public a(i iVar, long j10, long j11, long j12, long j13, List<d> list, long j14, long j15, long j16) {
            super(iVar, j10, j11);
            this.f33410d = j12;
            this.f33411e = j13;
            this.f = list;
            this.f33414i = j14;
            this.f33412g = j15;
            this.f33413h = j16;
        }

        public final long b(long j10, long j11) {
            long d10 = d(j10);
            if (d10 != -1) {
                return d10;
            }
            return (int) (f((j11 - this.f33413h) + this.f33414i, j10) - c(j10, j11));
        }

        public final long c(long j10, long j11) {
            long d10 = d(j10);
            long j12 = this.f33410d;
            if (d10 == -1) {
                long j13 = this.f33412g;
                if (j13 != com.anythink.expressad.exoplayer.b.f7291b) {
                    return Math.max(j12, f((j11 - this.f33413h) - j13, j10));
                }
            }
            return j12;
        }

        public abstract long d(long j10);

        public final long e(long j10, long j11) {
            long j12 = this.f33408b;
            long j13 = this.f33410d;
            List<d> list = this.f;
            if (list != null) {
                return (list.get((int) (j10 - j13)).f33420b * 1000000) / j12;
            }
            long d10 = d(j11);
            if (d10 != -1 && j10 == (j13 + d10) - 1) {
                return j11 - g(j10);
            }
            return (this.f33411e * 1000000) / j12;
        }

        public final long f(long j10, long j11) {
            long d10 = d(j11);
            long j12 = this.f33410d;
            if (d10 == 0) {
                return j12;
            }
            if (this.f == null) {
                long j13 = (j10 / ((this.f33411e * 1000000) / this.f33408b)) + j12;
                if (j13 >= j12) {
                    if (d10 == -1) {
                        return j13;
                    }
                    return Math.min(j13, (j12 + d10) - 1);
                }
                return j12;
            }
            long j14 = (d10 + j12) - 1;
            long j15 = j12;
            while (j15 <= j14) {
                long j16 = ((j14 - j15) / 2) + j15;
                long g6 = g(j16);
                if (g6 < j10) {
                    j15 = j16 + 1;
                } else if (g6 > j10) {
                    j14 = j16 - 1;
                } else {
                    return j16;
                }
            }
            if (j15 == j12) {
                return j15;
            }
            return j14;
        }

        public final long g(long j10) {
            long j11;
            long j12 = this.f33410d;
            List<d> list = this.f;
            if (list != null) {
                j11 = list.get((int) (j10 - j12)).f33419a - this.f33409c;
            } else {
                j11 = (j10 - j12) * this.f33411e;
            }
            return g0.P(j11, 1000000L, this.f33408b);
        }

        public abstract i h(long j10, j jVar);

        public boolean i() {
            if (this.f != null) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: SegmentBase.java */
    /* loaded from: classes2.dex */
    public static final class b extends a {

        /* renamed from: j, reason: collision with root package name */
        public final List<i> f33415j;

        public b(i iVar, long j10, long j11, long j12, long j13, List<d> list, long j14, List<i> list2, long j15, long j16) {
            super(iVar, j10, j11, j12, j13, list, j14, j15, j16);
            this.f33415j = list2;
        }

        @Override // n5.k.a
        public final long d(long j10) {
            return this.f33415j.size();
        }

        @Override // n5.k.a
        public final i h(long j10, j jVar) {
            return this.f33415j.get((int) (j10 - this.f33410d));
        }

        @Override // n5.k.a
        public final boolean i() {
            return true;
        }
    }

    /* compiled from: SegmentBase.java */
    /* loaded from: classes2.dex */
    public static final class c extends a {

        /* renamed from: j, reason: collision with root package name */
        public final m f33416j;

        /* renamed from: k, reason: collision with root package name */
        public final m f33417k;

        /* renamed from: l, reason: collision with root package name */
        public final long f33418l;

        public c(i iVar, long j10, long j11, long j12, long j13, long j14, List<d> list, long j15, m mVar, m mVar2, long j16, long j17) {
            super(iVar, j10, j11, j12, j14, list, j15, j16, j17);
            this.f33416j = mVar;
            this.f33417k = mVar2;
            this.f33418l = j13;
        }

        @Override // n5.k
        public final i a(j jVar) {
            m mVar = this.f33416j;
            if (mVar != null) {
                i0 i0Var = jVar.f33399s;
                return new i(mVar.a(i0Var.f30524z, 0L, 0L, i0Var.f30518s), 0L, -1L);
            }
            return this.f33407a;
        }

        @Override // n5.k.a
        public final long d(long j10) {
            if (this.f != null) {
                return r0.size();
            }
            long j11 = this.f33418l;
            if (j11 != -1) {
                return (j11 - this.f33410d) + 1;
            }
            if (j10 == com.anythink.expressad.exoplayer.b.f7291b) {
                return -1L;
            }
            BigInteger multiply = BigInteger.valueOf(j10).multiply(BigInteger.valueOf(this.f33408b));
            BigInteger multiply2 = BigInteger.valueOf(this.f33411e).multiply(BigInteger.valueOf(1000000L));
            RoundingMode roundingMode = RoundingMode.CEILING;
            int i10 = k7.a.f30888a;
            return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
        }

        @Override // n5.k.a
        public final i h(long j10, j jVar) {
            long j11;
            long j12 = this.f33410d;
            List<d> list = this.f;
            if (list != null) {
                j11 = list.get((int) (j10 - j12)).f33419a;
            } else {
                j11 = (j10 - j12) * this.f33411e;
            }
            long j13 = j11;
            m mVar = this.f33417k;
            i0 i0Var = jVar.f33399s;
            return new i(mVar.a(i0Var.f30524z, j10, j13, i0Var.f30518s), 0L, -1L);
        }
    }

    /* compiled from: SegmentBase.java */
    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final long f33419a;

        /* renamed from: b, reason: collision with root package name */
        public final long f33420b;

        public d(long j10, long j11) {
            this.f33419a = j10;
            this.f33420b = j11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f33419a == dVar.f33419a && this.f33420b == dVar.f33420b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (((int) this.f33419a) * 31) + ((int) this.f33420b);
        }
    }

    public k(i iVar, long j10, long j11) {
        this.f33407a = iVar;
        this.f33408b = j10;
        this.f33409c = j11;
    }

    public i a(j jVar) {
        return this.f33407a;
    }

    /* compiled from: SegmentBase.java */
    /* loaded from: classes2.dex */
    public static class e extends k {

        /* renamed from: d, reason: collision with root package name */
        public final long f33421d;

        /* renamed from: e, reason: collision with root package name */
        public final long f33422e;

        public e(i iVar, long j10, long j11, long j12, long j13) {
            super(iVar, j10, j11);
            this.f33421d = j12;
            this.f33422e = j13;
        }

        public e() {
            this(null, 1L, 0L, 0L, 0L);
        }
    }
}
